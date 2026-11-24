package a;

import android.webkit.ValueCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class phn0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27006a;
    public final /* synthetic */ whn0 b;

    public /* synthetic */ phn0(whn0 whn0Var, byte b) {
        this.f27006a = b;
        this.b = whn0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f27006a;
        whn0 whn0Var = this.b;
        switch (b) {
            case 0:
                s2m0 s2m0Var = whn0.Y1;
                i1w0 i1w0VarF = a4n0.f(whn0Var);
                jvi jviVar = whn0Var.K1;
                if (jviVar != null) {
                    return new ry3(i1w0VarF, jviVar);
                }
                Intrinsics.h("sumSubViewModelFactory");
                throw null;
            case 1:
                s2m0 s2m0Var2 = whn0.Y1;
                ValueCallback valueCallback = whn0Var.Q1;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
                whn0Var.Q1 = null;
                return Unit.f46060a;
            case 2:
                s2m0 s2m0Var3 = whn0.Y1;
                khf0 khf0VarQ = m7x.Q(whn0Var, "android.permission.CAMERA", j120.V());
                if (khf0VarQ != null) {
                    return khf0VarQ.d();
                }
                return null;
            case 3:
                s2m0 s2m0Var4 = whn0.Y1;
                khf0 khf0VarQ2 = m7x.Q(whn0Var, "android.permission.CAMERA", j120.V());
                if (khf0VarQ2 != null) {
                    return khf0VarQ2.d();
                }
                return null;
            case 4:
                kvi kviVar = whn0Var.L1;
                if (kviVar == null) {
                    Intrinsics.h("photoResultFactory");
                    throw null;
                }
                yfd yfdVar = whn0Var.n0().i;
                yfdVar.getClass();
                return new qm90(yfdVar, (zri) ((qv2) kviVar.f18956a.c).l);
            default:
                s2m0 s2m0Var5 = whn0.Y1;
                ValueCallback valueCallback2 = whn0Var.Q1;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                }
                whn0Var.Q1 = null;
                return Unit.f46060a;
        }
    }
}
