package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iqo implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15219a;
    public final /* synthetic */ kqo b;

    public /* synthetic */ iqo(kqo kqoVar, byte b) {
        this.f15219a = b;
        this.b = kqoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15219a;
        kqo kqoVar = this.b;
        switch (b) {
            case 0:
                pek pekVar = kqo.P1;
                ComponentCallbacks2 application = kqoVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(dhj.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof dhj)) {
                        ze3Var = null;
                    }
                    dhj dhjVar = (dhj) ze3Var;
                    if (dhjVar != null) {
                        i1w0 i1w0VarF = a4n0.f(kqoVar);
                        boolean z = !kqoVar.L1.n(kqoVar, kqo.Q1[1]).booleanValue();
                        i1w0VarF.getClass();
                        yqc yqcVar = dhjVar.b;
                        cad cadVar = dhjVar.f6093a;
                        edo edoVar = dhjVar.c;
                        zfo zfoVar = dhjVar.e;
                        gii0 gii0Var = dhjVar.f;
                        ctf0 ctf0Var = dhjVar.g;
                        g2v g2vVar = dhjVar.d;
                        ouu ouuVar = dhjVar.h;
                        ii iiVar = dhjVar.i;
                        qu quVar = dhjVar.j;
                        m1e m1eVar = dhjVar.l;
                        qv2 qv2Var = dhjVar.m;
                        knf0 knf0Var = dhjVar.n;
                        sue sueVar = dhjVar.o;
                        duj dujVar = dhjVar.p;
                        bek bekVar = dhjVar.k;
                        nek nekVar = dhjVar.q;
                        x20 x20Var = dhjVar.r;
                        pmi pmiVar = dhjVar.s;
                        pru pruVar = dhjVar.t;
                        gst0 gst0Var = dhjVar.u;
                        b3c0 b3c0Var = dhjVar.v;
                        h3c h3cVar = dhjVar.w;
                        j1q0 j1q0Var = dhjVar.x;
                        sueVar.getClass();
                        iiVar.getClass();
                        edoVar.getClass();
                        zfoVar.getClass();
                        gii0Var.getClass();
                        ctf0Var.getClass();
                        m1eVar.getClass();
                        knf0Var.getClass();
                        gst0Var.getClass();
                        b3c0Var.getClass();
                        j1q0Var.getClass();
                        return new dfi(cadVar, sueVar, yqcVar, iiVar, i1w0VarF, ctf0Var, g2vVar, ouuVar, quVar, bekVar, Boolean.valueOf(z), m1eVar, qv2Var, dujVar, nekVar, x20Var, pmiVar, pruVar, b3c0Var, h3cVar, j1q0Var);
                    }
                }
                jf4.n(b1j.i(dhj.class, "Cannot create dependency "));
                return null;
            case 1:
                pek pekVar2 = kqo.P1;
                return new q0h0((cfi) kqoVar.G0().v.get());
            default:
                pek pekVar3 = kqo.P1;
                ((k3t0) kqoVar.N1.getValue()).x(xpo.f41279a);
                return Unit.f46060a;
        }
    }
}
