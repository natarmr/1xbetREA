package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k060 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17449a;
    public final /* synthetic */ m060 b;

    public /* synthetic */ k060(m060 m060Var, byte b) {
        this.f17449a = b;
        this.b = m060Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17449a;
        m060 m060Var = this.b;
        switch (b) {
            case 0:
                xuz xuzVar = m060.O1;
                ((k3t0) m060Var.N1.getValue()).x(c060.f3508a);
                return Unit.f46060a;
            case 1:
                xuz xuzVar2 = m060.O1;
                ComponentCallbacks2 application = m060Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(n060.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof n060)) {
                        ze3Var = null;
                    }
                    n060 n060Var = (n060) ze3Var;
                    if (n060Var != null) {
                        i1w0 i1w0VarF = a4n0.f(m060Var);
                        i1w0VarF.getClass();
                        sue sueVar = n060Var.f22686a;
                        bwl bwlVar = n060Var.b;
                        a1d a1dVar = n060Var.c;
                        iip iipVar = n060Var.d;
                        fvt0 fvt0Var = n060Var.e;
                        iw20 iw20Var = n060Var.f;
                        btt0 btt0Var = n060Var.g;
                        g2v g2vVar = n060Var.h;
                        mne mneVar = n060Var.i;
                        duj dujVar = n060Var.j;
                        j1q0 j1q0Var = n060Var.m;
                        gii0 gii0Var = n060Var.k;
                        ort ortVar = n060Var.l;
                        m1e m1eVar = n060Var.n;
                        sjl0 sjl0Var = n060Var.p;
                        clc clcVar = n060Var.A;
                        ctf0 ctf0Var = n060Var.q;
                        ii iiVar = n060Var.r;
                        ali aliVar = n060Var.s;
                        gst0 gst0Var = n060Var.v;
                        ntu ntuVar = n060Var.w;
                        knf0 knf0Var = n060Var.z;
                        d1p d1pVar = n060Var.C;
                        xri xriVar = n060Var.D;
                        wdk0 wdk0Var = n060Var.E;
                        edo edoVar = n060Var.y;
                        r9u r9uVar = n060Var.o;
                        abp abpVar = n060Var.t;
                        t6p t6pVar = n060Var.u;
                        q7d0 q7d0Var = n060Var.B;
                        kt2 kt2Var = n060Var.x;
                        uzc uzcVar = n060Var.G;
                        xep xepVar = n060Var.F;
                        rmu0 rmu0Var = n060Var.H;
                        qho qhoVar = n060Var.I;
                        sueVar.getClass();
                        iipVar.getClass();
                        d1pVar.getClass();
                        xriVar.getClass();
                        t6pVar.getClass();
                        kt2Var.getClass();
                        btt0Var.getClass();
                        uzcVar.getClass();
                        xepVar.getClass();
                        gii0Var.getClass();
                        abpVar.getClass();
                        j1q0Var.getClass();
                        edoVar.getClass();
                        m1eVar.getClass();
                        sjl0Var.getClass();
                        ctf0Var.getClass();
                        iiVar.getClass();
                        gst0Var.getClass();
                        knf0Var.getClass();
                        wdk0Var.getClass();
                        r9uVar.getClass();
                        q7d0Var.getClass();
                        rmu0Var.getClass();
                        return new cmi(fvt0Var, bwlVar, a1dVar, iw20Var, clcVar, i1w0VarF, mneVar, xepVar, g2vVar, dujVar, ortVar, m1eVar, ctf0Var, iiVar, aliVar, ntuVar, qhoVar);
                    }
                }
                jf4.n(b1j.i(n060.class, "Cannot create dependency "));
                return null;
            default:
                xuz xuzVar3 = m060.O1;
                return new q0h0((bmi) ((cmi) m060Var.L1.getValue()).r.get());
        }
    }
}
