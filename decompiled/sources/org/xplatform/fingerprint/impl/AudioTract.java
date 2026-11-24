package org.xplatform.fingerprint.impl;

import a.a04;
import a.e0g0;
import a.g0g0;
import a.j0g0;
import a.maz;
import a.n0o0;
import a.p44;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/xplatform/fingerprint/impl/AudioTract;", "", "", "getHardwareAudioProfile", "()[I", "a/p44", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AudioTract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f46684a = maz.b(new a04((byte) 2));

    private final native int[] getHardwareAudioProfile();

    public final p44 a() {
        Object g0g0Var;
        if (Build.VERSION.SDK_INT < 26 || !((Boolean) this.f46684a.getValue()).booleanValue()) {
            return null;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = getHardwareAudioProfile();
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        int[] iArr = (int[]) g0g0Var;
        if (iArr == null) {
            return null;
        }
        if (iArr.length != 4) {
            iArr = null;
        }
        if (iArr != null) {
            return new p44(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        return null;
    }
}
