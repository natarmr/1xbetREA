package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bta0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3174a;
    public final /* synthetic */ eta0 b;

    public /* synthetic */ bta0(eta0 eta0Var, byte b) {
        this.f3174a = b;
        this.b = eta0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3174a;
        eta0 eta0Var = this.b;
        switch (b) {
            case 0:
                xi70 xi70Var = eta0.P1;
                eta0Var.G0().x(cqa0.f4784a);
                return Unit.f46060a;
            case 1:
                xi70 xi70Var2 = eta0.P1;
                ComponentCallbacks2 application = eta0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(lra0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof lra0)) {
                        ze3Var = null;
                    }
                    lra0 lra0Var = (lra0) ze3Var;
                    if (lra0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(eta0Var);
                        i1w0VarF.getClass();
                        sue sueVar = lra0Var.d;
                        itr itrVar = lra0Var.e;
                        lsn lsnVar = lra0Var.c;
                        bwl bwlVar = lra0Var.b;
                        a1d a1dVar = lra0Var.f;
                        mne mneVar = lra0Var.f20521a;
                        m1e m1eVar = lra0Var.j;
                        lbu lbuVar = lra0Var.h;
                        qv2 qv2Var = lra0Var.g;
                        g2v g2vVar = lra0Var.i;
                        duj dujVar = lra0Var.k;
                        iip iipVar = lra0Var.m;
                        pru pruVar = lra0Var.w;
                        pyg pygVar = lra0Var.x;
                        wdk0 wdk0Var = lra0Var.y;
                        d1p d1pVar = lra0Var.z;
                        viu viuVar = lra0Var.A;
                        j1q0 j1q0Var = lra0Var.u;
                        peg0 peg0Var = lra0Var.r;
                        zfo zfoVar = lra0Var.q;
                        gst0 gst0Var = lra0Var.B;
                        rtu rtuVar = lra0Var.C;
                        r9u r9uVar = lra0Var.D;
                        h3c h3cVar = lra0Var.E;
                        oeg0 oeg0Var = lra0Var.v;
                        ctf0 ctf0Var = lra0Var.l;
                        fsd fsdVar = lra0Var.n;
                        edo edoVar = lra0Var.o;
                        qj9 qj9Var = lra0Var.p;
                        nvu nvuVar = lra0Var.s;
                        ulk ulkVar = lra0Var.t;
                        vqc vqcVar = lra0Var.F;
                        itrVar.getClass();
                        sueVar.getClass();
                        iipVar.getClass();
                        m1eVar.getClass();
                        pygVar.getClass();
                        d1pVar.getClass();
                        ctf0Var.getClass();
                        j1q0Var.getClass();
                        wdk0Var.getClass();
                        r9uVar.getClass();
                        oeg0Var.getClass();
                        fsdVar.getClass();
                        zfoVar.getClass();
                        edoVar.getClass();
                        gst0Var.getClass();
                        return new moi(bwlVar, a1dVar, mneVar, m1eVar, sueVar, lsnVar, dujVar, iipVar, vqcVar, qv2Var, lbuVar, g2vVar, ctf0Var, i1w0VarF, peg0Var, j1q0Var, pruVar, wdk0Var, viuVar, rtuVar, r9uVar, zfoVar, qj9Var, edoVar, nvuVar, ulkVar, gst0Var, h3cVar);
                    }
                }
                jf4.n(b1j.i(lra0.class, "Cannot create dependency "));
                return null;
            default:
                xi70 xi70Var3 = eta0.P1;
                return new q0h0((loi) ((moi) eta0Var.M1.getValue()).C.get());
        }
    }
}
