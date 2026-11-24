package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d840 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5627a;
    public final /* synthetic */ f840 b;

    public /* synthetic */ d840(f840 f840Var, byte b) {
        this.f5627a = b;
        this.b = f840Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5627a;
        q740 q740Var = q740.f28232a;
        p740 p740Var = p740.f26489a;
        f840 f840Var = this.b;
        switch (b) {
            case 0:
                atz atzVar = f840.O1;
                ComponentCallbacks2 application = f840Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(g840.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof g840)) {
                        ze3Var = null;
                    }
                    g840 g840Var = (g840) ze3Var;
                    if (g840Var != null) {
                        i1w0 i1w0VarF = a4n0.f(f840Var);
                        i1w0VarF.getClass();
                        duj dujVar = g840Var.d;
                        tp9 tp9Var = g840Var.b;
                        grj grjVar = g840Var.e;
                        btt0 btt0Var = g840Var.f;
                        m1e m1eVar = g840Var.g;
                        sa10 sa10Var = g840Var.h;
                        ctf0 ctf0Var = g840Var.i;
                        gii0 gii0Var = g840Var.j;
                        oct octVar = g840Var.k;
                        qv2 qv2Var = g840Var.l;
                        peg0 peg0Var = g840Var.m;
                        vjp vjpVar = g840Var.n;
                        qgd qgdVar = g840Var.o;
                        xwb0 xwb0Var = g840Var.p;
                        pru pruVar = g840Var.q;
                        kt2 kt2Var = g840Var.t;
                        he1 he1Var = g840Var.c;
                        wsf0 wsf0Var = g840Var.s;
                        ii iiVar = g840Var.r;
                        vwb0 vwb0Var = g840Var.u;
                        knf0 knf0Var = g840Var.v;
                        h840 h840Var = g840Var.w;
                        cad cadVar = g840Var.f10848a;
                        zx10 zx10Var = g840Var.x;
                        d1p d1pVar = g840Var.y;
                        wdk0 wdk0Var = g840Var.z;
                        uzc0 uzc0Var = g840Var.A;
                        r990 r990Var = g840Var.B;
                        v6k v6kVar = g840Var.C;
                        pyg pygVar = g840Var.D;
                        r9u r9uVar = g840Var.E;
                        s9m0 s9m0Var = g840Var.F;
                        ouu ouuVar = g840Var.G;
                        h3c h3cVar = g840Var.H;
                        uf3 uf3Var = g840Var.I;
                        tp9Var.getClass();
                        d1pVar.getClass();
                        pygVar.getClass();
                        iiVar.getClass();
                        btt0Var.getClass();
                        m1eVar.getClass();
                        ctf0Var.getClass();
                        gii0Var.getClass();
                        xwb0Var.getClass();
                        kt2Var.getClass();
                        vwb0Var.getClass();
                        knf0Var.getClass();
                        h840Var.getClass();
                        wdk0Var.getClass();
                        r9uVar.getClass();
                        return new rli(he1Var, cadVar, zx10Var, d1pVar, wsf0Var, v6kVar, pygVar, i1w0VarF, iiVar, dujVar, grjVar, btt0Var, m1eVar, sa10Var, ctf0Var, gii0Var, octVar, qv2Var, peg0Var, vjpVar, qgdVar, pruVar, kt2Var, knf0Var, h840Var, wdk0Var, uzc0Var, r990Var, s9m0Var, ouuVar, h3cVar, uf3Var);
                    }
                }
                jf4.n(b1j.i(g840.class, "Cannot create dependency "));
                return null;
            case 1:
                atz atzVar2 = f840.O1;
                return new q0h0((qli) f840Var.G0().G.get());
            case 2:
                atz atzVar3 = f840.O1;
                f840Var.H0().x(q740Var);
                return Unit.f46060a;
            case 3:
                atz atzVar4 = f840.O1;
                f840Var.H0().x(p740Var);
                return Unit.f46060a;
            case 4:
                atz atzVar5 = f840.O1;
                f840Var.H0().x(q740Var);
                return Unit.f46060a;
            default:
                atz atzVar6 = f840.O1;
                f840Var.H0().x(p740Var);
                return Unit.f46060a;
        }
    }
}
