package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o6r0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24752a;
    public final /* synthetic */ r6r0 b;

    public /* synthetic */ o6r0(r6r0 r6r0Var, byte b) {
        this.f24752a = b;
        this.b = r6r0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24752a;
        r6r0 r6r0Var = this.b;
        switch (b) {
            case 0:
                s2m0 s2m0Var = r6r0.S1;
                ComponentCallbacks2 application = r6r0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(s6r0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof s6r0)) {
                        ze3Var = null;
                    }
                    s6r0 s6r0Var = (s6r0) ze3Var;
                    if (s6r0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(r6r0Var);
                        m7r0 m7r0Var = (m7r0) r6r0Var.N1.n(r6r0Var, r6r0.U1[0]);
                        i1w0VarF.getClass();
                        g2v g2vVar = s6r0Var.f31718a;
                        m1e m1eVar = s6r0Var.c;
                        cad cadVar = s6r0Var.d;
                        ctf0 ctf0Var = s6r0Var.b;
                        y78 y78Var = s6r0Var.i;
                        iw20 iw20Var = s6r0Var.e;
                        itr itrVar = s6r0Var.f;
                        ugf0 ugf0Var = s6r0Var.h;
                        iip iipVar = s6r0Var.g;
                        nr00 nr00Var = s6r0Var.j;
                        wdk0 wdk0Var = s6r0Var.k;
                        r9u r9uVar = s6r0Var.l;
                        kt2 kt2Var = s6r0Var.m;
                        zr1 zr1Var = s6r0Var.n;
                        s31 s31Var = s6r0Var.p;
                        cyu cyuVar = s6r0Var.o;
                        ctf0Var.getClass();
                        iipVar.getClass();
                        itrVar.getClass();
                        m1eVar.getClass();
                        wdk0Var.getClass();
                        r9uVar.getClass();
                        kt2Var.getClass();
                        return new qxi(itrVar, ugf0Var, cadVar, iw20Var, iipVar, nr00Var, ctf0Var, g2vVar, y78Var, m7r0Var, i1w0VarF, m1eVar, wdk0Var, r9uVar, kt2Var, zr1Var, cyuVar, s31Var);
                    }
                }
                jf4.n(b1j.i(s6r0.class, "Cannot create dependency "));
                return null;
            case 1:
                pxi pxiVar = r6r0Var.K1;
                if (pxiVar != null) {
                    return new q0h0(pxiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                s2m0 s2m0Var2 = r6r0.S1;
                r6r0Var.G0().x(d6r0.f5565a);
                return Unit.f46060a;
            case 3:
                s2m0 s2m0Var3 = r6r0.S1;
                r6r0Var.G0().x(b6r0.f2069a);
                return Unit.f46060a;
            default:
                s2m0 s2m0Var4 = r6r0.S1;
                r6r0Var.G0().x(c6r0.f3833a);
                return Unit.f46060a;
        }
    }
}
