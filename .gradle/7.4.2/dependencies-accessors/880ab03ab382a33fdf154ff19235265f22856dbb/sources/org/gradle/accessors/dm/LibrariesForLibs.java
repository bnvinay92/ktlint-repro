package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidLibraryAccessors laccForAndroidLibraryAccessors = new AndroidLibraryAccessors(owner);
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final DokkaLibraryAccessors laccForDokkaLibraryAccessors = new DokkaLibraryAccessors(owner);
    private final GoogleLibraryAccessors laccForGoogleLibraryAccessors = new GoogleLibraryAccessors(owner);
    private final JetbrainsLibraryAccessors laccForJetbrainsLibraryAccessors = new JetbrainsLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final KotlinxLibraryAccessors laccForKotlinxLibraryAccessors = new KotlinxLibraryAccessors(owner);
    private final KtlintLibraryAccessors laccForKtlintLibraryAccessors = new KtlintLibraryAccessors(owner);
    private final MockitoLibraryAccessors laccForMockitoLibraryAccessors = new MockitoLibraryAccessors(owner);
    private final Rxjava2LibraryAccessors laccForRxjava2LibraryAccessors = new Rxjava2LibraryAccessors(owner);
    private final SquareupLibraryAccessors laccForSquareupLibraryAccessors = new SquareupLibraryAccessors(owner);
    private final VanniktechLibraryAccessors laccForVanniktechLibraryAccessors = new VanniktechLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

        /**
         * Creates a dependency provider for hamcrest (org.hamcrest:hamcrest-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHamcrest() { return create("hamcrest"); }

        /**
         * Creates a dependency provider for junit (junit:junit)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit() { return create("junit"); }

        /**
         * Creates a dependency provider for lanterna (com.googlecode.lanterna:lanterna)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLanterna() { return create("lanterna"); }

        /**
         * Creates a dependency provider for mockk (io.mockk:mockk)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMockk() { return create("mockk"); }

        /**
         * Creates a dependency provider for robolectric (org.robolectric:robolectric)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRobolectric() { return create("robolectric"); }

        /**
         * Creates a dependency provider for timber (com.jakewharton.timber:timber)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTimber() { return create("timber"); }

        /**
         * Creates a dependency provider for truth (com.google.truth:truth)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTruth() { return create("truth"); }

    /**
     * Returns the group of libraries at android
     */
    public AndroidLibraryAccessors getAndroid() { return laccForAndroidLibraryAccessors; }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() { return laccForAndroidxLibraryAccessors; }

    /**
     * Returns the group of libraries at dokka
     */
    public DokkaLibraryAccessors getDokka() { return laccForDokkaLibraryAccessors; }

    /**
     * Returns the group of libraries at google
     */
    public GoogleLibraryAccessors getGoogle() { return laccForGoogleLibraryAccessors; }

    /**
     * Returns the group of libraries at jetbrains
     */
    public JetbrainsLibraryAccessors getJetbrains() { return laccForJetbrainsLibraryAccessors; }

    /**
     * Returns the group of libraries at kotlin
     */
    public KotlinLibraryAccessors getKotlin() { return laccForKotlinLibraryAccessors; }

    /**
     * Returns the group of libraries at kotlinx
     */
    public KotlinxLibraryAccessors getKotlinx() { return laccForKotlinxLibraryAccessors; }

    /**
     * Returns the group of libraries at ktlint
     */
    public KtlintLibraryAccessors getKtlint() { return laccForKtlintLibraryAccessors; }

    /**
     * Returns the group of libraries at mockito
     */
    public MockitoLibraryAccessors getMockito() { return laccForMockitoLibraryAccessors; }

    /**
     * Returns the group of libraries at rxjava2
     */
    public Rxjava2LibraryAccessors getRxjava2() { return laccForRxjava2LibraryAccessors; }

    /**
     * Returns the group of libraries at squareup
     */
    public SquareupLibraryAccessors getSquareup() { return laccForSquareupLibraryAccessors; }

    /**
     * Returns the group of libraries at vanniktech
     */
    public VanniktechLibraryAccessors getVanniktech() { return laccForVanniktechLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() { return paccForPluginAccessors; }

    public static class AndroidLibraryAccessors extends SubDependencyFactory {
        private final AndroidGradleLibraryAccessors laccForAndroidGradleLibraryAccessors = new AndroidGradleLibraryAccessors(owner);

        public AndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at android.gradle
         */
        public AndroidGradleLibraryAccessors getGradle() { return laccForAndroidGradleLibraryAccessors; }

    }

    public static class AndroidGradleLibraryAccessors extends SubDependencyFactory {

        public AndroidGradleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (com.android.tools.build:gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() { return create("android.gradle.plugin"); }

    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxActivityLibraryAccessors laccForAndroidxActivityLibraryAccessors = new AndroidxActivityLibraryAccessors(owner);
        private final AndroidxComposeLibraryAccessors laccForAndroidxComposeLibraryAccessors = new AndroidxComposeLibraryAccessors(owner);
        private final AndroidxFragmentLibraryAccessors laccForAndroidxFragmentLibraryAccessors = new AndroidxFragmentLibraryAccessors(owner);
        private final AndroidxLifecycleLibraryAccessors laccForAndroidxLifecycleLibraryAccessors = new AndroidxLifecycleLibraryAccessors(owner);
        private final AndroidxMacroLibraryAccessors laccForAndroidxMacroLibraryAccessors = new AndroidxMacroLibraryAccessors(owner);
        private final AndroidxTestLibraryAccessors laccForAndroidxTestLibraryAccessors = new AndroidxTestLibraryAccessors(owner);
        private final AndroidxTracingLibraryAccessors laccForAndroidxTracingLibraryAccessors = new AndroidxTracingLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() { return create("androidx.appcompat"); }

            /**
             * Creates a dependency provider for constraintlayout (androidx.constraintlayout:constraintlayout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConstraintlayout() { return create("androidx.constraintlayout"); }

            /**
             * Creates a dependency provider for core (androidx.core:core-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.core"); }

            /**
             * Creates a dependency provider for gridlayout (androidx.gridlayout:gridlayout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGridlayout() { return create("androidx.gridlayout"); }

            /**
             * Creates a dependency provider for profileinstaller (androidx.profileinstaller:profileinstaller)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getProfileinstaller() { return create("androidx.profileinstaller"); }

            /**
             * Creates a dependency provider for recyclerview (androidx.recyclerview:recyclerview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRecyclerview() { return create("androidx.recyclerview"); }

            /**
             * Creates a dependency provider for savedstate (androidx.savedstate:savedstate)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSavedstate() { return create("androidx.savedstate"); }

            /**
             * Creates a dependency provider for transition (androidx.transition:transition)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTransition() { return create("androidx.transition"); }

            /**
             * Creates a dependency provider for viewbinding (androidx.databinding:viewbinding)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewbinding() { return create("androidx.viewbinding"); }

        /**
         * Returns the group of libraries at androidx.activity
         */
        public AndroidxActivityLibraryAccessors getActivity() { return laccForAndroidxActivityLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.compose
         */
        public AndroidxComposeLibraryAccessors getCompose() { return laccForAndroidxComposeLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.fragment
         */
        public AndroidxFragmentLibraryAccessors getFragment() { return laccForAndroidxFragmentLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.lifecycle
         */
        public AndroidxLifecycleLibraryAccessors getLifecycle() { return laccForAndroidxLifecycleLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.macro
         */
        public AndroidxMacroLibraryAccessors getMacro() { return laccForAndroidxMacroLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.test
         */
        public AndroidxTestLibraryAccessors getTest() { return laccForAndroidxTestLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.tracing
         */
        public AndroidxTracingLibraryAccessors getTracing() { return laccForAndroidxTracingLibraryAccessors; }

    }

    public static class AndroidxActivityLibraryAccessors extends SubDependencyFactory {

        public AndroidxActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.activity:activity-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("androidx.activity.compose"); }

            /**
             * Creates a dependency provider for core (androidx.activity:activity)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.activity.core"); }

            /**
             * Creates a dependency provider for ktx (androidx.activity:activity-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.activity.ktx"); }

    }

    public static class AndroidxComposeLibraryAccessors extends SubDependencyFactory {
        private final AndroidxComposeUiLibraryAccessors laccForAndroidxComposeUiLibraryAccessors = new AndroidxComposeUiLibraryAccessors(owner);

        public AndroidxComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for foundation (androidx.compose.foundation:foundation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFoundation() { return create("androidx.compose.foundation"); }

            /**
             * Creates a dependency provider for material (androidx.compose.material:material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() { return create("androidx.compose.material"); }

        /**
         * Returns the group of libraries at androidx.compose.ui
         */
        public AndroidxComposeUiLibraryAccessors getUi() { return laccForAndroidxComposeUiLibraryAccessors; }

    }

    public static class AndroidxComposeUiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxComposeUiTestLibraryAccessors laccForAndroidxComposeUiTestLibraryAccessors = new AndroidxComposeUiTestLibraryAccessors(owner);

        public AndroidxComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.compose.ui"); }

            /**
             * Creates a dependency provider for tooling (androidx.compose.ui:ui-tooling)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTooling() { return create("androidx.compose.ui.tooling"); }

        /**
         * Returns the group of libraries at androidx.compose.ui.test
         */
        public AndroidxComposeUiTestLibraryAccessors getTest() { return laccForAndroidxComposeUiTestLibraryAccessors; }

    }

    public static class AndroidxComposeUiTestLibraryAccessors extends SubDependencyFactory {

        public AndroidxComposeUiTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit4 (androidx.compose.ui:ui-test-junit4)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit4() { return create("androidx.compose.ui.test.junit4"); }

    }

    public static class AndroidxFragmentLibraryAccessors extends SubDependencyFactory {

        public AndroidxFragmentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.fragment:fragment)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.fragment.core"); }

            /**
             * Creates a dependency provider for ktx (androidx.fragment:fragment-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.fragment.ktx"); }

    }

    public static class AndroidxLifecycleLibraryAccessors extends SubDependencyFactory {
        private final AndroidxLifecycleViewmodelLibraryAccessors laccForAndroidxLifecycleViewmodelLibraryAccessors = new AndroidxLifecycleViewmodelLibraryAccessors(owner);

        public AndroidxLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.lifecycle.ktx"); }

            /**
             * Creates a dependency provider for testing (androidx.lifecycle:lifecycle-runtime-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTesting() { return create("androidx.lifecycle.testing"); }

        /**
         * Returns the group of libraries at androidx.lifecycle.viewmodel
         */
        public AndroidxLifecycleViewmodelLibraryAccessors getViewmodel() { return laccForAndroidxLifecycleViewmodelLibraryAccessors; }

    }

    public static class AndroidxLifecycleViewmodelLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleViewmodelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.lifecycle:lifecycle-viewmodel)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.lifecycle.viewmodel.core"); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-viewmodel-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.lifecycle.viewmodel.ktx"); }

            /**
             * Creates a dependency provider for savedstate (androidx.lifecycle:lifecycle-viewmodel-savedstate)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSavedstate() { return create("androidx.lifecycle.viewmodel.savedstate"); }

    }

    public static class AndroidxMacroLibraryAccessors extends SubDependencyFactory {

        public AndroidxMacroLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for benchmark (androidx.benchmark:benchmark-macro-junit4)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBenchmark() { return create("androidx.macro.benchmark"); }

    }

    public static class AndroidxTestLibraryAccessors extends SubDependencyFactory {
        private final AndroidxTestEspressoLibraryAccessors laccForAndroidxTestEspressoLibraryAccessors = new AndroidxTestEspressoLibraryAccessors(owner);

        public AndroidxTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test:core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.test.core"); }

            /**
             * Creates a dependency provider for junit (androidx.test.ext:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() { return create("androidx.test.junit"); }

            /**
             * Creates a dependency provider for runner (androidx.test:runner)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRunner() { return create("androidx.test.runner"); }

            /**
             * Creates a dependency provider for truth (androidx.test.ext:truth)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTruth() { return create("androidx.test.truth"); }

            /**
             * Creates a dependency provider for uiautomator (androidx.test.uiautomator:uiautomator)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUiautomator() { return create("androidx.test.uiautomator"); }

        /**
         * Returns the group of libraries at androidx.test.espresso
         */
        public AndroidxTestEspressoLibraryAccessors getEspresso() { return laccForAndroidxTestEspressoLibraryAccessors; }

    }

    public static class AndroidxTestEspressoLibraryAccessors extends SubDependencyFactory {

        public AndroidxTestEspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.test.espresso.core"); }

            /**
             * Creates a dependency provider for idlingResource (androidx.test.espresso:espresso-idling-resource)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIdlingResource() { return create("androidx.test.espresso.idlingResource"); }

            /**
             * Creates a dependency provider for intents (androidx.test.espresso:espresso-intents)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIntents() { return create("androidx.test.espresso.intents"); }

    }

    public static class AndroidxTracingLibraryAccessors extends SubDependencyFactory {

        public AndroidxTracingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.tracing:tracing-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.tracing.ktx"); }

    }

    public static class DokkaLibraryAccessors extends SubDependencyFactory {
        private final DokkaGradleLibraryAccessors laccForDokkaGradleLibraryAccessors = new DokkaGradleLibraryAccessors(owner);

        public DokkaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at dokka.gradle
         */
        public DokkaGradleLibraryAccessors getGradle() { return laccForDokkaGradleLibraryAccessors; }

    }

    public static class DokkaGradleLibraryAccessors extends SubDependencyFactory {

        public DokkaGradleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (org.jetbrains.dokka:dokka-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() { return create("dokka.gradle.plugin"); }

    }

    public static class GoogleLibraryAccessors extends SubDependencyFactory {
        private final GoogleAndroidLibraryAccessors laccForGoogleAndroidLibraryAccessors = new GoogleAndroidLibraryAccessors(owner);

        public GoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ksp (com.google.devtools.ksp:symbol-processing-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKsp() { return create("google.ksp"); }

        /**
         * Returns the group of libraries at google.android
         */
        public GoogleAndroidLibraryAccessors getAndroid() { return laccForGoogleAndroidLibraryAccessors; }

    }

    public static class GoogleAndroidLibraryAccessors extends SubDependencyFactory {

        public GoogleAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for material (com.google.android.material:material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() { return create("google.android.material"); }

    }

    public static class JetbrainsLibraryAccessors extends SubDependencyFactory {

        public JetbrainsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotations (org.jetbrains:annotations)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotations() { return create("jetbrains.annotations"); }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {
        private final KotlinGradleLibraryAccessors laccForKotlinGradleLibraryAccessors = new KotlinGradleLibraryAccessors(owner);
        private final KotlinSerializationLibraryAccessors laccForKotlinSerializationLibraryAccessors = new KotlinSerializationLibraryAccessors(owner);
        private final KotlinTestLibraryAccessors laccForKotlinTestLibraryAccessors = new KotlinTestLibraryAccessors(owner);

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (org.jetbrains.kotlin:kotlin-stdlib-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() { return create("kotlin.common"); }

            /**
             * Creates a dependency provider for jdk6 (org.jetbrains.kotlin:kotlin-stdlib)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdk6() { return create("kotlin.jdk6"); }

            /**
             * Creates a dependency provider for jdk7 (org.jetbrains.kotlin:kotlin-stdlib-jdk7)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdk7() { return create("kotlin.jdk7"); }

            /**
             * Creates a dependency provider for jdk8 (org.jetbrains.kotlin:kotlin-stdlib-jdk8)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdk8() { return create("kotlin.jdk8"); }

            /**
             * Creates a dependency provider for reflect (org.jetbrains.kotlin:kotlin-reflect)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getReflect() { return create("kotlin.reflect"); }

        /**
         * Returns the group of libraries at kotlin.gradle
         */
        public KotlinGradleLibraryAccessors getGradle() { return laccForKotlinGradleLibraryAccessors; }

        /**
         * Returns the group of libraries at kotlin.serialization
         */
        public KotlinSerializationLibraryAccessors getSerialization() { return laccForKotlinSerializationLibraryAccessors; }

        /**
         * Returns the group of libraries at kotlin.test
         */
        public KotlinTestLibraryAccessors getTest() { return laccForKotlinTestLibraryAccessors; }

    }

    public static class KotlinGradleLibraryAccessors extends SubDependencyFactory {

        public KotlinGradleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (org.jetbrains.kotlin:kotlin-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() { return create("kotlin.gradle.plugin"); }

    }

    public static class KotlinSerializationLibraryAccessors extends SubDependencyFactory {
        private final KotlinSerializationGradleLibraryAccessors laccForKotlinSerializationGradleLibraryAccessors = new KotlinSerializationGradleLibraryAccessors(owner);

        public KotlinSerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at kotlin.serialization.gradle
         */
        public KotlinSerializationGradleLibraryAccessors getGradle() { return laccForKotlinSerializationGradleLibraryAccessors; }

    }

    public static class KotlinSerializationGradleLibraryAccessors extends SubDependencyFactory {

        public KotlinSerializationGradleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (org.jetbrains.kotlin:kotlin-serialization)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() { return create("kotlin.serialization.gradle.plugin"); }

    }

    public static class KotlinTestLibraryAccessors extends SubDependencyFactory {

        public KotlinTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotations (org.jetbrains.kotlin:kotlin-test-annotations-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotations() { return create("kotlin.test.annotations"); }

            /**
             * Creates a dependency provider for common (org.jetbrains.kotlin:kotlin-test-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() { return create("kotlin.test.common"); }

            /**
             * Creates a dependency provider for jdk (org.jetbrains.kotlin:kotlin-test-junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdk() { return create("kotlin.test.jdk"); }

    }

    public static class KotlinxLibraryAccessors extends SubDependencyFactory {
        private final KotlinxBenchmarkLibraryAccessors laccForKotlinxBenchmarkLibraryAccessors = new KotlinxBenchmarkLibraryAccessors(owner);
        private final KotlinxBinaryCompatibilityLibraryAccessors laccForKotlinxBinaryCompatibilityLibraryAccessors = new KotlinxBinaryCompatibilityLibraryAccessors(owner);
        private final KotlinxCoroutinesLibraryAccessors laccForKotlinxCoroutinesLibraryAccessors = new KotlinxCoroutinesLibraryAccessors(owner);
        private final KotlinxSerializationLibraryAccessors laccForKotlinxSerializationLibraryAccessors = new KotlinxSerializationLibraryAccessors(owner);

        public KotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for atomicfu (org.jetbrains.kotlinx:atomicfu)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAtomicfu() { return create("kotlinx.atomicfu"); }

        /**
         * Returns the group of libraries at kotlinx.benchmark
         */
        public KotlinxBenchmarkLibraryAccessors getBenchmark() { return laccForKotlinxBenchmarkLibraryAccessors; }

        /**
         * Returns the group of libraries at kotlinx.binaryCompatibility
         */
        public KotlinxBinaryCompatibilityLibraryAccessors getBinaryCompatibility() { return laccForKotlinxBinaryCompatibilityLibraryAccessors; }

        /**
         * Returns the group of libraries at kotlinx.coroutines
         */
        public KotlinxCoroutinesLibraryAccessors getCoroutines() { return laccForKotlinxCoroutinesLibraryAccessors; }

        /**
         * Returns the group of libraries at kotlinx.serialization
         */
        public KotlinxSerializationLibraryAccessors getSerialization() { return laccForKotlinxSerializationLibraryAccessors; }

    }

    public static class KotlinxBenchmarkLibraryAccessors extends SubDependencyFactory {
        private final KotlinxBenchmarkGradleLibraryAccessors laccForKotlinxBenchmarkGradleLibraryAccessors = new KotlinxBenchmarkGradleLibraryAccessors(owner);

        public KotlinxBenchmarkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (org.jetbrains.kotlinx:kotlinx-benchmark-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("kotlinx.benchmark.runtime"); }

        /**
         * Returns the group of libraries at kotlinx.benchmark.gradle
         */
        public KotlinxBenchmarkGradleLibraryAccessors getGradle() { return laccForKotlinxBenchmarkGradleLibraryAccessors; }

    }

    public static class KotlinxBenchmarkGradleLibraryAccessors extends SubDependencyFactory {

        public KotlinxBenchmarkGradleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (org.jetbrains.kotlinx:kotlinx-benchmark-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() { return create("kotlinx.benchmark.gradle.plugin"); }

    }

    public static class KotlinxBinaryCompatibilityLibraryAccessors extends SubDependencyFactory {
        private final KotlinxBinaryCompatibilityGradleLibraryAccessors laccForKotlinxBinaryCompatibilityGradleLibraryAccessors = new KotlinxBinaryCompatibilityGradleLibraryAccessors(owner);

        public KotlinxBinaryCompatibilityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at kotlinx.binaryCompatibility.gradle
         */
        public KotlinxBinaryCompatibilityGradleLibraryAccessors getGradle() { return laccForKotlinxBinaryCompatibilityGradleLibraryAccessors; }

    }

    public static class KotlinxBinaryCompatibilityGradleLibraryAccessors extends SubDependencyFactory {

        public KotlinxBinaryCompatibilityGradleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (org.jetbrains.kotlinx:binary-compatibility-validator)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() { return create("kotlinx.binaryCompatibility.gradle.plugin"); }

    }

    public static class KotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {
        private final KotlinxCoroutinesTestLibraryAccessors laccForKotlinxCoroutinesTestLibraryAccessors = new KotlinxCoroutinesTestLibraryAccessors(owner);

        public KotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.jetbrains.kotlinx:kotlinx-coroutines-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("kotlinx.coroutines.android"); }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-coroutines-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("kotlinx.coroutines.core"); }

            /**
             * Creates a dependency provider for rx2 (org.jetbrains.kotlinx:kotlinx-coroutines-rx2)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRx2() { return create("kotlinx.coroutines.rx2"); }

        /**
         * Returns the group of libraries at kotlinx.coroutines.test
         */
        public KotlinxCoroutinesTestLibraryAccessors getTest() { return laccForKotlinxCoroutinesTestLibraryAccessors; }

    }

    public static class KotlinxCoroutinesTestLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public KotlinxCoroutinesTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for test (org.jetbrains.kotlinx:kotlinx-coroutines-test)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("kotlinx.coroutines.test"); }

            /**
             * Creates a dependency provider for common (org.jetbrains.kotlinx:kotlinx-coroutines-test)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() { return create("kotlinx.coroutines.test.common"); }

    }

    public static class KotlinxSerializationLibraryAccessors extends SubDependencyFactory {

        public KotlinxSerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for json (org.jetbrains.kotlinx:kotlinx-serialization-json)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJson() { return create("kotlinx.serialization.json"); }

    }

    public static class KtlintLibraryAccessors extends SubDependencyFactory {

        public KtlintLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gradle (org.jlleitschuh.gradle:ktlint-gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradle() { return create("ktlint.gradle"); }

    }

    public static class MockitoLibraryAccessors extends SubDependencyFactory {

        public MockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.mockito:mockito-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("mockito.core"); }

            /**
             * Creates a dependency provider for kotlin (org.mockito.kotlin:mockito-kotlin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKotlin() { return create("mockito.kotlin"); }

    }

    public static class Rxjava2LibraryAccessors extends SubDependencyFactory {

        public Rxjava2LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for rxandroid (io.reactivex.rxjava2:rxandroid)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRxandroid() { return create("rxjava2.rxandroid"); }

            /**
             * Creates a dependency provider for rxjava (io.reactivex.rxjava2:rxjava)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRxjava() { return create("rxjava2.rxjava"); }

    }

    public static class SquareupLibraryAccessors extends SubDependencyFactory {
        private final SquareupLeakcanaryLibraryAccessors laccForSquareupLeakcanaryLibraryAccessors = new SquareupLeakcanaryLibraryAccessors(owner);
        private final SquareupMoshiLibraryAccessors laccForSquareupMoshiLibraryAccessors = new SquareupMoshiLibraryAccessors(owner);

        public SquareupLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for cycler (com.squareup.cycler:cycler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCycler() { return create("squareup.cycler"); }

            /**
             * Creates a dependency provider for okio (com.squareup.okio:okio)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOkio() { return create("squareup.okio"); }

            /**
             * Creates a dependency provider for radiography (com.squareup.radiography:radiography)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRadiography() { return create("squareup.radiography"); }

            /**
             * Creates a dependency provider for seismic (com.squareup:seismic)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSeismic() { return create("squareup.seismic"); }

        /**
         * Returns the group of libraries at squareup.leakcanary
         */
        public SquareupLeakcanaryLibraryAccessors getLeakcanary() { return laccForSquareupLeakcanaryLibraryAccessors; }

        /**
         * Returns the group of libraries at squareup.moshi
         */
        public SquareupMoshiLibraryAccessors getMoshi() { return laccForSquareupMoshiLibraryAccessors; }

    }

    public static class SquareupLeakcanaryLibraryAccessors extends SubDependencyFactory {

        public SquareupLeakcanaryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (com.squareup.leakcanary:leakcanary-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("squareup.leakcanary.android"); }

            /**
             * Creates a dependency provider for instrumentation (com.squareup.leakcanary:leakcanary-android-instrumentation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInstrumentation() { return create("squareup.leakcanary.instrumentation"); }

    }

    public static class SquareupMoshiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public SquareupMoshiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for moshi (com.squareup.moshi:moshi)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("squareup.moshi"); }

            /**
             * Creates a dependency provider for adapters (com.squareup.moshi:moshi-adapters)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAdapters() { return create("squareup.moshi.adapters"); }

            /**
             * Creates a dependency provider for codegen (com.squareup.moshi:moshi-kotlin-codegen)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCodegen() { return create("squareup.moshi.codegen"); }

    }

    public static class VanniktechLibraryAccessors extends SubDependencyFactory {

        public VanniktechLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for publish (com.vanniktech:gradle-maven-publish-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPublish() { return create("vanniktech.publish"); }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        private final GoogleVersionAccessors vaccForGoogleVersionAccessors = new GoogleVersionAccessors(providers, config);
        private final KotlinxVersionAccessors vaccForKotlinxVersionAccessors = new KotlinxVersionAccessors(providers, config);
        private final MockitoVersionAccessors vaccForMockitoVersionAccessors = new MockitoVersionAccessors(providers, config);
        private final Rxjava2VersionAccessors vaccForRxjava2VersionAccessors = new Rxjava2VersionAccessors(providers, config);
        private final SquareupVersionAccessors vaccForSquareupVersionAccessors = new SquareupVersionAccessors(providers, config);
        private final VanniktechVersionAccessors vaccForVanniktechVersionAccessors = new VanniktechVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidTools (7.1.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidTools() { return getVersion("androidTools"); }

            /**
             * Returns the version associated to this alias: compileSdk (31)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompileSdk() { return getVersion("compileSdk"); }

            /**
             * Returns the version associated to this alias: detekt (1.19.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDetekt() { return getVersion("detekt"); }

            /**
             * Returns the version associated to this alias: dokka (1.5.31)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDokka() { return getVersion("dokka"); }

            /**
             * Returns the version associated to this alias: groovy (3.0.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGroovy() { return getVersion("groovy"); }

            /**
             * Returns the version associated to this alias: jUnit (4.13.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJUnit() { return getVersion("jUnit"); }

            /**
             * Returns the version associated to this alias: javaParser (3.24.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJavaParser() { return getVersion("javaParser"); }

            /**
             * Returns the version associated to this alias: jmh (1.34)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJmh() { return getVersion("jmh"); }

            /**
             * Returns the version associated to this alias: kotest (5.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotest() { return getVersion("kotest"); }

            /**
             * Returns the version associated to this alias: kotlin (1.6.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: ktlint (10.2.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtlint() { return getVersion("ktlint"); }

            /**
             * Returns the version associated to this alias: material (1.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterial() { return getVersion("material"); }

            /**
             * Returns the version associated to this alias: mavenPublish (0.13.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMavenPublish() { return getVersion("mavenPublish"); }

            /**
             * Returns the version associated to this alias: minSdkVersion (21)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMinSdkVersion() { return getVersion("minSdkVersion"); }

            /**
             * Returns the version associated to this alias: mockk (1.11.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMockk() { return getVersion("mockk"); }

            /**
             * Returns the version associated to this alias: robolectric (4.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRobolectric() { return getVersion("robolectric"); }

            /**
             * Returns the version associated to this alias: targetSdk (30)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTargetSdk() { return getVersion("targetSdk"); }

            /**
             * Returns the version associated to this alias: timber (4.7.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTimber() { return getVersion("timber"); }

            /**
             * Returns the version associated to this alias: truth (1.1.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTruth() { return getVersion("truth"); }

        /**
         * Returns the group of versions at versions.androidx
         */
        public AndroidxVersionAccessors getAndroidx() { return vaccForAndroidxVersionAccessors; }

        /**
         * Returns the group of versions at versions.google
         */
        public GoogleVersionAccessors getGoogle() { return vaccForGoogleVersionAccessors; }

        /**
         * Returns the group of versions at versions.kotlinx
         */
        public KotlinxVersionAccessors getKotlinx() { return vaccForKotlinxVersionAccessors; }

        /**
         * Returns the group of versions at versions.mockito
         */
        public MockitoVersionAccessors getMockito() { return vaccForMockitoVersionAccessors; }

        /**
         * Returns the group of versions at versions.rxjava2
         */
        public Rxjava2VersionAccessors getRxjava2() { return vaccForRxjava2VersionAccessors; }

        /**
         * Returns the group of versions at versions.squareup
         */
        public SquareupVersionAccessors getSquareup() { return vaccForSquareupVersionAccessors; }

        /**
         * Returns the group of versions at versions.vanniktech
         */
        public VanniktechVersionAccessors getVanniktech() { return vaccForVanniktechVersionAccessors; }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        private final AndroidxComposeVersionAccessors vaccForAndroidxComposeVersionAccessors = new AndroidxComposeVersionAccessors(providers, config);
        private final AndroidxTestVersionAccessors vaccForAndroidxTestVersionAccessors = new AndroidxTestVersionAccessors(providers, config);
        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.activity (1.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getActivity() { return getVersion("androidx.activity"); }

            /**
             * Returns the version associated to this alias: androidx.appcompat (1.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcompat() { return getVersion("androidx.appcompat"); }

            /**
             * Returns the version associated to this alias: androidx.benchmark (1.1.0-beta04)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBenchmark() { return getVersion("androidx.benchmark"); }

            /**
             * Returns the version associated to this alias: androidx.constraintlayout (2.1.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getConstraintlayout() { return getVersion("androidx.constraintlayout"); }

            /**
             * Returns the version associated to this alias: androidx.core (1.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("androidx.core"); }

            /**
             * Returns the version associated to this alias: androidx.fragment (1.3.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFragment() { return getVersion("androidx.fragment"); }

            /**
             * Returns the version associated to this alias: androidx.gridlayout (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGridlayout() { return getVersion("androidx.gridlayout"); }

            /**
             * Returns the version associated to this alias: androidx.lifecycle (2.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLifecycle() { return getVersion("androidx.lifecycle"); }

            /**
             * Returns the version associated to this alias: androidx.navigation (2.4.0-alpha09)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNavigation() { return getVersion("androidx.navigation"); }

            /**
             * Returns the version associated to this alias: androidx.paging (3.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPaging() { return getVersion("androidx.paging"); }

            /**
             * Returns the version associated to this alias: androidx.profileinstaller (1.2.0-alpha02)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getProfileinstaller() { return getVersion("androidx.profileinstaller"); }

            /**
             * Returns the version associated to this alias: androidx.recyclerview (1.2.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRecyclerview() { return getVersion("androidx.recyclerview"); }

            /**
             * Returns the version associated to this alias: androidx.room (2.4.0-alpha04)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRoom() { return getVersion("androidx.room"); }

            /**
             * Returns the version associated to this alias: androidx.savedstate (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSavedstate() { return getVersion("androidx.savedstate"); }

            /**
             * Returns the version associated to this alias: androidx.startup (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getStartup() { return getVersion("androidx.startup"); }

            /**
             * Returns the version associated to this alias: androidx.tracing (1.1.0-beta01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTracing() { return getVersion("androidx.tracing"); }

            /**
             * Returns the version associated to this alias: androidx.transition (1.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTransition() { return getVersion("androidx.transition"); }

            /**
             * Returns the version associated to this alias: androidx.viewbinding (4.2.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getViewbinding() { return getVersion("androidx.viewbinding"); }

            /**
             * Returns the version associated to this alias: androidx.work (2.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getWork() { return getVersion("androidx.work"); }

        /**
         * Returns the group of versions at versions.androidx.compose
         */
        public AndroidxComposeVersionAccessors getCompose() { return vaccForAndroidxComposeVersionAccessors; }

        /**
         * Returns the group of versions at versions.androidx.test
         */
        public AndroidxTestVersionAccessors getTest() { return vaccForAndroidxTestVersionAccessors; }

    }

    public static class AndroidxComposeVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public AndroidxComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: androidx.compose (1.1.0-rc01)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("androidx.compose"); }

            /**
             * Returns the version associated to this alias: androidx.compose.compiler (1.1.0-rc02)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompiler() { return getVersion("androidx.compose.compiler"); }

    }

    public static class AndroidxTestVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        private final AndroidxTestJunitVersionAccessors vaccForAndroidxTestJunitVersionAccessors = new AndroidxTestJunitVersionAccessors(providers, config);
        private final AndroidxTestTruthVersionAccessors vaccForAndroidxTestTruthVersionAccessors = new AndroidxTestTruthVersionAccessors(providers, config);
        public AndroidxTestVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: androidx.test (1.3.0)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("androidx.test"); }

            /**
             * Returns the version associated to this alias: androidx.test.espresso (3.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getEspresso() { return getVersion("androidx.test.espresso"); }

        /**
         * Returns the group of versions at versions.androidx.test.junit
         */
        public AndroidxTestJunitVersionAccessors getJunit() { return vaccForAndroidxTestJunitVersionAccessors; }

        /**
         * Returns the group of versions at versions.androidx.test.truth
         */
        public AndroidxTestTruthVersionAccessors getTruth() { return vaccForAndroidxTestTruthVersionAccessors; }

    }

    public static class AndroidxTestJunitVersionAccessors extends VersionFactory  {

        public AndroidxTestJunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.test.junit.ext (1.1.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getExt() { return getVersion("androidx.test.junit.ext"); }

    }

    public static class AndroidxTestTruthVersionAccessors extends VersionFactory  {

        public AndroidxTestTruthVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.test.truth.ext (1.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getExt() { return getVersion("androidx.test.truth.ext"); }

    }

    public static class GoogleVersionAccessors extends VersionFactory  {

        public GoogleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: google.accompanist (0.18.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAccompanist() { return getVersion("google.accompanist"); }

            /**
             * Returns the version associated to this alias: google.dagger (2.40.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDagger() { return getVersion("google.dagger"); }

            /**
             * Returns the version associated to this alias: google.ksp (1.6.10-1.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKsp() { return getVersion("google.ksp"); }

            /**
             * Returns the version associated to this alias: google.material (1.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterial() { return getVersion("google.material"); }

    }

    public static class KotlinxVersionAccessors extends VersionFactory  {

        private final KotlinxBinaryVersionAccessors vaccForKotlinxBinaryVersionAccessors = new KotlinxBinaryVersionAccessors(providers, config);
        private final KotlinxCoroutinesVersionAccessors vaccForKotlinxCoroutinesVersionAccessors = new KotlinxCoroutinesVersionAccessors(providers, config);
        private final KotlinxSerializationVersionAccessors vaccForKotlinxSerializationVersionAccessors = new KotlinxSerializationVersionAccessors(providers, config);
        public KotlinxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.atomicfu (0.17.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAtomicfu() { return getVersion("kotlinx.atomicfu"); }

            /**
             * Returns the version associated to this alias: kotlinx.benchmark (0.4.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBenchmark() { return getVersion("kotlinx.benchmark"); }

        /**
         * Returns the group of versions at versions.kotlinx.binary
         */
        public KotlinxBinaryVersionAccessors getBinary() { return vaccForKotlinxBinaryVersionAccessors; }

        /**
         * Returns the group of versions at versions.kotlinx.coroutines
         */
        public KotlinxCoroutinesVersionAccessors getCoroutines() { return vaccForKotlinxCoroutinesVersionAccessors; }

        /**
         * Returns the group of versions at versions.kotlinx.serialization
         */
        public KotlinxSerializationVersionAccessors getSerialization() { return vaccForKotlinxSerializationVersionAccessors; }

    }

    public static class KotlinxBinaryVersionAccessors extends VersionFactory  {

        public KotlinxBinaryVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.binary.compatibility (0.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompatibility() { return getVersion("kotlinx.binary.compatibility"); }

    }

    public static class KotlinxCoroutinesVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        private final KotlinxCoroutinesTestVersionAccessors vaccForKotlinxCoroutinesTestVersionAccessors = new KotlinxCoroutinesTestVersionAccessors(providers, config);
        public KotlinxCoroutinesVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: kotlinx.coroutines (1.5.1)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("kotlinx.coroutines"); }

        /**
         * Returns the group of versions at versions.kotlinx.coroutines.test
         */
        public KotlinxCoroutinesTestVersionAccessors getTest() { return vaccForKotlinxCoroutinesTestVersionAccessors; }

    }

    public static class KotlinxCoroutinesTestVersionAccessors extends VersionFactory  {

        public KotlinxCoroutinesTestVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.coroutines.test.common (1.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCommon() { return getVersion("kotlinx.coroutines.test.common"); }

    }

    public static class KotlinxSerializationVersionAccessors extends VersionFactory  {

        public KotlinxSerializationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.serialization.json (1.3.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJson() { return getVersion("kotlinx.serialization.json"); }

    }

    public static class MockitoVersionAccessors extends VersionFactory  {

        public MockitoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: mockito.core (3.3.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("mockito.core"); }

            /**
             * Returns the version associated to this alias: mockito.kotlin (3.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("mockito.kotlin"); }

    }

    public static class Rxjava2VersionAccessors extends VersionFactory  {

        public Rxjava2VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: rxjava2.android (2.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroid() { return getVersion("rxjava2.android"); }

            /**
             * Returns the version associated to this alias: rxjava2.core (2.2.21)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("rxjava2.core"); }

    }

    public static class SquareupVersionAccessors extends VersionFactory  {

        public SquareupVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: squareup.cycler (0.1.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCycler() { return getVersion("squareup.cycler"); }

            /**
             * Returns the version associated to this alias: squareup.leakcanary (2.8.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLeakcanary() { return getVersion("squareup.leakcanary"); }

            /**
             * Returns the version associated to this alias: squareup.moshi (1.13.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMoshi() { return getVersion("squareup.moshi"); }

            /**
             * Returns the version associated to this alias: squareup.okhttp (4.9.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkhttp() { return getVersion("squareup.okhttp"); }

            /**
             * Returns the version associated to this alias: squareup.okio (3.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkio() { return getVersion("squareup.okio"); }

            /**
             * Returns the version associated to this alias: squareup.radiography (2.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRadiography() { return getVersion("squareup.radiography"); }

            /**
             * Returns the version associated to this alias: squareup.retrofit (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRetrofit() { return getVersion("squareup.retrofit"); }

            /**
             * Returns the version associated to this alias: squareup.seismic (1.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSeismic() { return getVersion("squareup.seismic"); }

            /**
             * Returns the version associated to this alias: squareup.workflow (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getWorkflow() { return getVersion("squareup.workflow"); }

    }

    public static class VanniktechVersionAccessors extends VersionFactory  {

        public VanniktechVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: vanniktech.publish (0.18.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPublish() { return getVersion("vanniktech.publish"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final GooglePluginAccessors baccForGooglePluginAccessors = new GooglePluginAccessors(providers, config);
        private final KotlinPluginAccessors baccForKotlinPluginAccessors = new KotlinPluginAccessors(providers, config);
        private final KotlinxPluginAccessors baccForKotlinxPluginAccessors = new KotlinxPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for dokka to the plugin id 'org.jetbrains.dokka'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getDokka() { return createPlugin("dokka"); }

            /**
             * Creates a plugin provider for ktlint to the plugin id 'org.jlleitschuh.gradle.ktlint'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKtlint() { return createPlugin("ktlint"); }

            /**
             * Creates a plugin provider for mavenPublish to the plugin id 'com.vanniktech.maven.publish'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getMavenPublish() { return createPlugin("mavenPublish"); }

        /**
         * Returns the group of bundles at plugins.google
         */
        public GooglePluginAccessors getGoogle() { return baccForGooglePluginAccessors; }

        /**
         * Returns the group of bundles at plugins.kotlin
         */
        public KotlinPluginAccessors getKotlin() { return baccForKotlinPluginAccessors; }

        /**
         * Returns the group of bundles at plugins.kotlinx
         */
        public KotlinxPluginAccessors getKotlinx() { return baccForKotlinxPluginAccessors; }

    }

    public static class GooglePluginAccessors extends PluginFactory {

        public GooglePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for google.ksp to the plugin id 'com.google.devtools.ksp'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKsp() { return createPlugin("google.ksp"); }

    }

    public static class KotlinPluginAccessors extends PluginFactory {

        public KotlinPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for kotlin.jvm to the plugin id 'org.jetbrains.kotlin.jvm'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getJvm() { return createPlugin("kotlin.jvm"); }

            /**
             * Creates a plugin provider for kotlin.serialization to the plugin id 'org.jetbrains.kotlin.plugin.serialization'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getSerialization() { return createPlugin("kotlin.serialization"); }

    }

    public static class KotlinxPluginAccessors extends PluginFactory {

        public KotlinxPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for kotlinx.apiBinaryCompatibility to the plugin id 'org.jetbrains.kotlinx.binary-compatibility-validator'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getApiBinaryCompatibility() { return createPlugin("kotlinx.apiBinaryCompatibility"); }

            /**
             * Creates a plugin provider for kotlinx.benchmark to the plugin id 'org.jetbrains.kotlinx.benchmark'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getBenchmark() { return createPlugin("kotlinx.benchmark"); }

    }

}
