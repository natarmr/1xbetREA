package a;

import android.hardware.biometrics.BiometricManager;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n58 {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
