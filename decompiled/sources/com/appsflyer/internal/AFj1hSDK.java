package com.appsflyer.internal;

import a.t9f;
import com.appsflyer.sdk_base.util.OptionalFeaturesValidator;
import com.appsflyer.sdk_base.util.SupportedOptionalFeatures;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1hSDK implements OptionalFeaturesValidator {
    private final Map<SupportedOptionalFeatures, AFj1gSDK> registerClient = new LinkedHashMap();

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] AFLogger;

        static {
            int[] iArr = new int[AFj1gSDK.values().length];
            try {
                iArr[AFj1gSDK.UNDETERMINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1gSDK.PRESENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1gSDK.NOT_PRESENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFLogger = iArr;
        }
    }

    private static boolean AFLogger(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException | LinkageError unused) {
            return false;
        }
    }

    @Override // com.appsflyer.sdk_base.util.OptionalFeaturesValidator
    public final boolean isOptionalFeaturePresent(SupportedOptionalFeatures supportedOptionalFeatures) {
        supportedOptionalFeatures.getClass();
        AFj1gSDK aFj1gSDK = this.registerClient.get(supportedOptionalFeatures);
        if (aFj1gSDK == null) {
            aFj1gSDK = AFj1gSDK.UNDETERMINED;
        }
        int i = AFa1tSDK.AFLogger[aFj1gSDK.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i == 3) {
                return false;
            }
            t9f.b();
            return false;
        }
        if (!OptionalFeaturesValidator.INSTANCE.getRegisteredFeatures().contains(supportedOptionalFeatures)) {
            this.registerClient.put(supportedOptionalFeatures, AFj1gSDK.NOT_PRESENT);
            return false;
        }
        boolean zAFLogger = AFLogger(supportedOptionalFeatures.getClassName());
        this.registerClient.put(supportedOptionalFeatures, zAFLogger ? AFj1gSDK.PRESENT : AFj1gSDK.NOT_PRESENT);
        return zAFLogger;
    }
}
