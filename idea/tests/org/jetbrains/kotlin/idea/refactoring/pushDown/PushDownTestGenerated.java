/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.refactoring.pushDown;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class PushDownTestGenerated extends AbstractPushDownTest {
    @TestMetadata("idea/testData/refactoring/pushDown/k2k")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class K2K extends AbstractPushDownTest {
        @TestMetadata("accidentalOverrides.kt")
        public void testAccidentalOverrides() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/accidentalOverrides.kt");
            doKotlinTest(fileName);
        }

        public void testAllFilesPresentInK2K() throws Exception {
            KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/pushDown/k2k"), Pattern.compile("^(.+)\\.kt$"));
        }

        @TestMetadata("clashingMembers.kt")
        public void testClashingMembers() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/clashingMembers.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("classToInterface.kt")
        public void testClassToInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/classToInterface.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("conflictingSuperCall.kt")
        public void testConflictingSuperCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/conflictingSuperCall.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("dropVisibilityOnGeneratedOverride.kt")
        public void testDropVisibilityOnGeneratedOverride() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/dropVisibilityOnGeneratedOverride.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("finalClass.kt")
        public void testFinalClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/finalClass.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("implicitCompanionUsages.kt")
        public void testImplicitCompanionUsages() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/implicitCompanionUsages.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("liftPrivate.kt")
        public void testLiftPrivate() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/liftPrivate.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("noCaret.kt")
        public void testNoCaret() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/noCaret.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("objectDeclaration.kt")
        public void testObjectDeclaration() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/objectDeclaration.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("outsideOfClass.kt")
        public void testOutsideOfClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/outsideOfClass.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("pushClassMembers.kt")
        public void testPushClassMembers() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/pushClassMembers.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("pushClassMembersAndMakeAbstract.kt")
        public void testPushClassMembersAndMakeAbstract() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/pushClassMembersAndMakeAbstract.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("pushClassMembersWithGenerics.kt")
        public void testPushClassMembersWithGenerics() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/pushClassMembersWithGenerics.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("pushInterfaceMembers.kt")
        public void testPushInterfaceMembers() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/pushInterfaceMembers.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("pushInterfaceMembersAndMakeAbstract.kt")
        public void testPushInterfaceMembersAndMakeAbstract() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/pushInterfaceMembersAndMakeAbstract.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("pushMembersUsingPrivates.kt")
        public void testPushMembersUsingPrivates() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/pushMembersUsingPrivates.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("pushMembersWithExternalUsages.kt")
        public void testPushMembersWithExternalUsages() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/pushMembersWithExternalUsages.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("pushSuperInterfaces.kt")
        public void testPushSuperInterfaces() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/pushSuperInterfaces.kt");
            doKotlinTest(fileName);
        }

        @TestMetadata("pushSuperInterfacesWithGenerics.kt")
        public void testPushSuperInterfacesWithGenerics() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2k/pushSuperInterfacesWithGenerics.kt");
            doKotlinTest(fileName);
        }
    }

    @TestMetadata("idea/testData/refactoring/pushDown/k2j")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class K2J extends AbstractPushDownTest {
        public void testAllFilesPresentInK2J() throws Exception {
            KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/pushDown/k2j"), Pattern.compile("^(.+)\\.kt$"));
        }

        @TestMetadata("kotlinToJava.kt")
        public void testKotlinToJava() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/k2j/kotlinToJava.kt");
            doKotlinTest(fileName);
        }
    }

    @TestMetadata("idea/testData/refactoring/pushDown/j2k")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class J2K extends AbstractPushDownTest {
        public void testAllFilesPresentInJ2K() throws Exception {
            KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/pushDown/j2k"), Pattern.compile("^(.+)\\.java$"));
        }

        @TestMetadata("fromClass.java")
        public void testFromClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/j2k/fromClass.java");
            doJavaTest(fileName);
        }

        @TestMetadata("fromClassAndMakeAbstract.java")
        public void testFromClassAndMakeAbstract() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/j2k/fromClassAndMakeAbstract.java");
            doJavaTest(fileName);
        }

        @TestMetadata("fromClassUsageConflicts.java")
        public void testFromClassUsageConflicts() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/j2k/fromClassUsageConflicts.java");
            doJavaTest(fileName);
        }

        @TestMetadata("fromInterface.java")
        public void testFromInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/pushDown/j2k/fromInterface.java");
            doJavaTest(fileName);
        }
    }
}
