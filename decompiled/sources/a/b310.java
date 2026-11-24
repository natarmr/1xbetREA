package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.cyber.game.lol.api.LolPostGameStatScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class b310 extends w46 {
    public bby A;
    public final n0o0 B;
    public final n0o0 C;
    public final p7m0 D;
    public final ol60 E;
    public n210 F;
    public final ArrayList G;
    public final p7m0 H;
    public final p7m0 I;
    public final n0o0 J;
    public final p7m0 K;
    public final n0o0 L;
    public List M;
    public final n0o0 N;
    public final LolPostGameStatScreenParams b;
    public final duj c;
    public final hzg d;
    public final m1e e;
    public final String f;
    public final mne g;
    public final a6u h;
    public final a7q i;
    public final nvu j;
    public final g2v k;
    public final ctf0 l;
    public final svu m;
    public final luu n;
    public final dwu o;
    public final oeg0 p;
    public final h3c q;
    public final qgh r;
    public final ih5 s;
    public final zr1 t;
    public final r9u u;
    public final hqc v;
    public final lbu w;
    public final hcp0 x;
    public final ivn y;
    public final c4m0 z;

    public b310(vzg0 vzg0Var, LolPostGameStatScreenParams lolPostGameStatScreenParams, duj dujVar, hzg hzgVar, m1e m1eVar, String str, mne mneVar, a6u a6uVar, a7q a7qVar, nvu nvuVar, g2v g2vVar, ctf0 ctf0Var, svu svuVar, luu luuVar, dwu dwuVar, oeg0 oeg0Var, h3c h3cVar, qgh qghVar, ih5 ih5Var, zr1 zr1Var, r9u r9uVar, hqc hqcVar, lbu lbuVar, hcp0 hcp0Var, ivn ivnVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        oeg0Var.getClass();
        this.b = lolPostGameStatScreenParams;
        this.c = dujVar;
        this.d = hzgVar;
        this.e = m1eVar;
        this.f = str;
        this.g = mneVar;
        this.h = a6uVar;
        this.i = a7qVar;
        this.j = nvuVar;
        this.k = g2vVar;
        this.l = ctf0Var;
        this.m = svuVar;
        this.n = luuVar;
        this.o = dwuVar;
        this.p = oeg0Var;
        this.q = h3cVar;
        this.r = qghVar;
        this.s = ih5Var;
        this.t = zr1Var;
        this.u = r9uVar;
        this.v = hqcVar;
        this.w = lbuVar;
        this.x = hcp0Var;
        this.y = ivnVar;
        final byte b = 0;
        this.B = maz.b(new Function0(this) { // from class: a.u210
            public final /* synthetic */ b310 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                b310 b310Var = this.b;
                switch (b2) {
                    case 0:
                        return Boolean.valueOf(b310Var.m.l());
                    case 1:
                        return Boolean.valueOf(b310Var.w.j());
                    case 2:
                        return new fnq(b310Var.o.a(b310Var.G, dam0.b), new kaw(b310Var, null, (byte) 28), (byte) 4);
                    case 3:
                        return b310Var.v.a();
                    default:
                        return vtb.h0(new ak9(b310Var.i.a(40L, 2L), (byte) 5), jiu0.a(b310Var), new o6m0(Long.MAX_VALUE), new cqr("", R.color.static_transparent, false));
                }
            }
        });
        final byte b2 = 1;
        this.C = maz.b(new Function0(this) { // from class: a.u210
            public final /* synthetic */ b310 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                b310 b310Var = this.b;
                switch (b3) {
                    case 0:
                        return Boolean.valueOf(b310Var.m.l());
                    case 1:
                        return Boolean.valueOf(b310Var.w.j());
                    case 2:
                        return new fnq(b310Var.o.a(b310Var.G, dam0.b), new kaw(b310Var, null, (byte) 28), (byte) 4);
                    case 3:
                        return b310Var.v.a();
                    default:
                        return vtb.h0(new ak9(b310Var.i.a(40L, 2L), (byte) 5), jiu0.a(b310Var), new o6m0(Long.MAX_VALUE), new cqr("", R.color.static_transparent, false));
                }
            }
        });
        this.D = q7m0.a(s210.f31481a);
        final byte b3 = 3;
        this.E = new ol60(3);
        c0o c0oVar = c310.f;
        List listJ = svuVar.l() ? q3d.j(c310.TEAM_STAT_RED, c310.TEAM_STAT_BLUE) : kotlin.collections.a.c(c310.TEAM_STAT_RED_BLUE_TABLET);
        ArrayList arrayList = new ArrayList();
        c0oVar.getClass();
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            if (!listJ.contains((c310) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((c310) it.next()).f3650a);
        }
        this.G = arrayList2;
        int i = this.b.d;
        x510 x510Var = x510.STATISTIC;
        o4i0 o4i0Var = new o4i0("", "");
        iun iunVar = iun.f15405a;
        this.H = q7m0.a(new n110(i, 1L, 10L, o4i0Var, 5L, iunVar, 7L, true, 12L, true, 0L));
        this.I = q7m0.a(da10.DEFAULT_ERROR);
        final byte b4 = 2;
        this.J = maz.b(new Function0(this) { // from class: a.u210
            public final /* synthetic */ b310 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                b310 b310Var = this.b;
                switch (b5) {
                    case 0:
                        return Boolean.valueOf(b310Var.m.l());
                    case 1:
                        return Boolean.valueOf(b310Var.w.j());
                    case 2:
                        return new fnq(b310Var.o.a(b310Var.G, dam0.b), new kaw(b310Var, null, (byte) 28), (byte) 4);
                    case 3:
                        return b310Var.v.a();
                    default:
                        return vtb.h0(new ak9(b310Var.i.a(40L, 2L), (byte) 5), jiu0.a(b310Var), new o6m0(Long.MAX_VALUE), new cqr("", R.color.static_transparent, false));
                }
            }
        });
        this.K = q7m0.a(Boolean.FALSE);
        this.L = maz.b(new Function0(this) { // from class: a.u210
            public final /* synthetic */ b310 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b3;
                b310 b310Var = this.b;
                switch (b5) {
                    case 0:
                        return Boolean.valueOf(b310Var.m.l());
                    case 1:
                        return Boolean.valueOf(b310Var.w.j());
                    case 2:
                        return new fnq(b310Var.o.a(b310Var.G, dam0.b), new kaw(b310Var, null, (byte) 28), (byte) 4);
                    case 3:
                        return b310Var.v.a();
                    default:
                        return vtb.h0(new ak9(b310Var.i.a(40L, 2L), (byte) 5), jiu0.a(b310Var), new o6m0(Long.MAX_VALUE), new cqr("", R.color.static_transparent, false));
                }
            }
        });
        this.M = iunVar;
        final byte b5 = 4;
        this.N = maz.b(new Function0(this) { // from class: a.u210
            public final /* synthetic */ b310 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                b310 b310Var = this.b;
                switch (b6) {
                    case 0:
                        return Boolean.valueOf(b310Var.m.l());
                    case 1:
                        return Boolean.valueOf(b310Var.w.j());
                    case 2:
                        return new fnq(b310Var.o.a(b310Var.G, dam0.b), new kaw(b310Var, null, (byte) 28), (byte) 4);
                    case 3:
                        return b310Var.v.a();
                    default:
                        return vtb.h0(new ak9(b310Var.i.a(40L, 2L), (byte) 5), jiu0.a(b310Var), new o6m0(Long.MAX_VALUE), new cqr("", R.color.static_transparent, false));
                }
            }
        });
        c4m0 c4m0Var = this.z;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.z = slb.U(new fnq(this.e.b(), new z210(this, null, b), (byte) 4), d5c.S(jiu0.a(this), this.g.f22085a));
        }
    }

    @Override // a.diu0
    public final void v() {
        LinkedHashMap linkedHashMap = m210.f21034a;
        String str = this.f;
        str.getClass();
        m210.f21034a.remove(str);
    }

    public final void w() {
        bby bbyVar = this.A;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.A = sac.V(jiu0.a(this), new v210(this, (byte) 0), null, this.g.b, new e3p(this, yjeVar, (byte) 14), 10);
    }
}
