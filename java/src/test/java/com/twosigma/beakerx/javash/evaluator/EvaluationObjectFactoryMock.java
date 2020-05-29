/*
 *  Copyright 2018 TWO SIGMA OPEN SOURCE, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.twosigma.beakerx.javash.evaluator;

import com.twosigma.beakerx.KernelTest;
import com.twosigma.beakerx.SimpleEvaluationObjectMock;
import com.twosigma.beakerx.evaluator.EvaluationObjectFactory;
import com.twosigma.beakerx.jvm.object.EvaluationObject;
import com.twosigma.beakerx.jvm.object.SimpleEvaluationObject;
import com.twosigma.beakerx.kernel.KernelFunctionality;
import com.twosigma.beakerx.kernel.msg.MessageCreator;
import com.twosigma.beakerx.message.Message;

public class EvaluationObjectFactoryMock implements EvaluationObjectFactory {
  @Override
  public EvaluationObject createSeo(String s, KernelFunctionality kernelFunctionality, Message message, int i) {
    return new SimpleEvaluationObjectMock("ok", new KernelTest.SeoConfigurationFactoryMock(MessageCreator.get(), new MagicCommandConfigurationMock()));
  }

  public EvaluationObject createSeo(String s) {
    return new SimpleEvaluationObjectMock("ok", new KernelTest.SeoConfigurationFactoryMock(MessageCreator.get(), new MagicCommandConfigurationMock()));
  }

  public EvaluationObject createSeo(String code, Message message) {
    return new SimpleEvaluationObject(code, new KernelTest.SeoConfigurationFactoryMock(message, MessageCreator.get(), new MagicCommandConfigurationMock()));
  }
}
