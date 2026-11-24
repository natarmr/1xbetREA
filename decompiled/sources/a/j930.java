package a;

import android.security.keystore.KeyGenParameterSpec;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j930 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16118a;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        f16118a = new Object();
    }
}
