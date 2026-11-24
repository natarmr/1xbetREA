package org.xplatform.fingerprint.impl;

import a.aby;
import a.e0g0;
import a.g0g0;
import a.j0g0;
import a.maz;
import a.n0o0;
import a.qgx;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0007J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lorg/xplatform/fingerprint/impl/JniProfiler;", "", "", "a", "b", "pingWithParams", "(II)I", "a/aby", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class JniProfiler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f46685a = maz.b(new qgx((byte) 26));

    public static aby a(JniProfiler jniProfiler) {
        Object g0g0Var;
        if (!((Boolean) jniProfiler.f46685a.getValue()).booleanValue()) {
            return null;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            for (int i = 0; i < 20000; i++) {
                jniProfiler.pingWithParams(i, i);
            }
            long jNanoTime = System.nanoTime();
            for (int i2 = 0; i2 < 100000; i2++) {
                jniProfiler.pingWithParams(i2, i2);
            }
            double dNanoTime = (System.nanoTime() - jNanoTime) / 100000.0d;
            g0g0Var = new aby(dNanoTime, dNanoTime > 100.0d);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        e0g0 e0g0Var3 = j0g0.b;
        return (aby) (g0g0Var instanceof g0g0 ? null : g0g0Var);
    }

    private final native int pingWithParams(int a2, int b);
}
