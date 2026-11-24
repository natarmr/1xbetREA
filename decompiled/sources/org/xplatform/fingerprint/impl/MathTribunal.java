package org.xplatform.fingerprint.impl;

import a.e0g0;
import a.g0g0;
import a.j0g0;
import a.maz;
import a.n0o0;
import a.n230;
import a.ti30;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lorg/xplatform/fingerprint/impl/MathTribunal;", "", "", "seed", "", "iterations", "", "runFpuStress", "(DI)J", "a/ti30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MathTribunal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f46686a = maz.b(new n230((byte) 27));

    public static ti30 a(MathTribunal mathTribunal) {
        Object g0g0Var;
        if (!((Boolean) mathTribunal.f46686a.getValue()).booleanValue()) {
            return null;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            long jNanoTime = System.nanoTime();
            long jRunFpuStress = mathTribunal.runFpuStress(3.141592653589793d, 1000000);
            long jNanoTime2 = System.nanoTime() - jNanoTime;
            String hexString = Long.toHexString(jRunFpuStress);
            hexString.getClass();
            g0g0Var = new ti30(StringsKt.b0(16, hexString), jNanoTime2 / 1000000.0d);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return (ti30) (g0g0Var instanceof g0g0 ? null : g0g0Var);
    }

    private final native long runFpuStress(double seed, int iterations);
}
