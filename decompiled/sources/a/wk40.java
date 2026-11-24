package a;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.cyber.game.mlbb.api.MlbbPostGameStatScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class wk40 extends w46 {
    public final n0o0 A;
    public final n0o0 B;
    public final MlbbPostGameStatScreenParams b;
    public final duj c;
    public final hzg d;
    public final String e;
    public final mne f;
    public final lbu g;
    public final a7q h;
    public final g2v i;
    public final ctf0 j;
    public final luu k;
    public final oeg0 l;
    public final ih5 m;
    public final zr1 n;
    public final r9u o;
    public final hqc p;
    public final lbu q;
    public final hcp0 r;
    public final ivn s;
    public final c4m0 t;
    public bby u;
    public final n0o0 v;
    public final p7m0 w;
    public final ol60 x;
    public lk40 y;
    public final p7m0 z;

    public wk40(vzg0 vzg0Var, MlbbPostGameStatScreenParams mlbbPostGameStatScreenParams, duj dujVar, hzg hzgVar, m1e m1eVar, String str, mne mneVar, lbu lbuVar, a7q a7qVar, g2v g2vVar, ctf0 ctf0Var, luu luuVar, oeg0 oeg0Var, ih5 ih5Var, zr1 zr1Var, r9u r9uVar, hqc hqcVar, lbu lbuVar2, hcp0 hcp0Var, ivn ivnVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        oeg0Var.getClass();
        this.b = mlbbPostGameStatScreenParams;
        this.c = dujVar;
        this.d = hzgVar;
        this.e = str;
        this.f = mneVar;
        this.g = lbuVar;
        this.h = a7qVar;
        this.i = g2vVar;
        this.j = ctf0Var;
        this.k = luuVar;
        this.l = oeg0Var;
        this.m = ih5Var;
        this.n = zr1Var;
        this.o = r9uVar;
        this.p = hqcVar;
        this.q = lbuVar2;
        this.r = hcp0Var;
        this.s = ivnVar;
        final byte b = 0;
        this.v = maz.b(new Function0(this) { // from class: a.rk40
            public final /* synthetic */ wk40 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                wk40 wk40Var = this.b;
                switch (b2) {
                    case 0:
                        return Boolean.valueOf(wk40Var.q.j());
                    case 1:
                        return wk40Var.p.a();
                    default:
                        return vtb.h0(new ak9(wk40Var.h.a(40L, 36L), (byte) 7), jiu0.a(wk40Var), new o6m0(Long.MAX_VALUE), new cqr("", R.color.static_transparent, false));
                }
            }
        });
        this.w = q7m0.a(pk40.f27119a);
        this.x = new ol60(3);
        this.z = q7m0.a(da10.DEFAULT_ERROR);
        final byte b2 = 1;
        this.A = maz.b(new Function0(this) { // from class: a.rk40
            public final /* synthetic */ wk40 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                wk40 wk40Var = this.b;
                switch (b3) {
                    case 0:
                        return Boolean.valueOf(wk40Var.q.j());
                    case 1:
                        return wk40Var.p.a();
                    default:
                        return vtb.h0(new ak9(wk40Var.h.a(40L, 36L), (byte) 7), jiu0.a(wk40Var), new o6m0(Long.MAX_VALUE), new cqr("", R.color.static_transparent, false));
                }
            }
        });
        final byte b3 = 2;
        this.B = maz.b(new Function0(this) { // from class: a.rk40
            public final /* synthetic */ wk40 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                wk40 wk40Var = this.b;
                switch (b4) {
                    case 0:
                        return Boolean.valueOf(wk40Var.q.j());
                    case 1:
                        return wk40Var.p.a();
                    default:
                        return vtb.h0(new ak9(wk40Var.h.a(40L, 36L), (byte) 7), jiu0.a(wk40Var), new o6m0(Long.MAX_VALUE), new cqr("", R.color.static_transparent, false));
                }
            }
        });
        c4m0 c4m0Var = this.t;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.t = slb.U(new fnq(m1eVar.b(), new z210(this, null, (byte) 14), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a));
        }
    }

    @Override // a.diu0
    public final void v() {
        LinkedHashMap linkedHashMap = kk40.f18420a;
        String str = this.e;
        str.getClass();
        kk40.f18420a.remove(str);
    }

    public final ok40 w(da10 da10Var) {
        return new ok40(g2v.b(this.i, ozb.J(this.b.b, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, da10Var.f5727a, 0L, 602));
    }

    public final void x() {
        bby bbyVar = this.u;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.u = sac.V(jiu0.a(this), new sk40(this, (byte) 0), null, this.f.b, new e3p(this, yjeVar, (byte) 19), 10);
    }
}
