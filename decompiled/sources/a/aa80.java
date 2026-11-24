package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class aa80 extends diu0 {
    public final p7m0 A;
    public final n0o0 B;
    public final pru b;
    public final vqb c;
    public final x1u d;
    public final gnu e;
    public final ali f;
    public final mne g;
    public final z4w0 h;
    public final cyh i;
    public final nv20 j;
    public final es k;
    public final rpt l;
    public final cmt m;
    public final ivn n;
    public final p4u o;
    public final duj p;
    public final ctf0 q;
    public final tkt0 r;
    public final sa10 s;
    public final chf0 t;
    public final k0j0 u;
    public c4m0 v;
    public bby w;
    public bby x;
    public final c4m0 y;
    public final p7m0 z;

    public aa80(pru pruVar, vqb vqbVar, m1e m1eVar, x1u x1uVar, gnu gnuVar, ali aliVar, mne mneVar, z4w0 z4w0Var, cyh cyhVar, nv20 nv20Var, es esVar, rpt rptVar, cmt cmtVar, ivn ivnVar, p4u p4uVar, duj dujVar, ctf0 ctf0Var, tkt0 tkt0Var, sa10 sa10Var, chf0 chf0Var, czt cztVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = pruVar;
        this.c = vqbVar;
        this.d = x1uVar;
        this.e = gnuVar;
        this.f = aliVar;
        this.g = mneVar;
        this.h = z4w0Var;
        this.i = cyhVar;
        this.j = nv20Var;
        this.k = esVar;
        this.l = rptVar;
        this.m = cmtVar;
        this.n = ivnVar;
        this.o = p4uVar;
        this.p = dujVar;
        this.q = ctf0Var;
        this.r = tkt0Var;
        this.s = sa10Var;
        this.t = chf0Var;
        this.u = cztVar.f5239a.b();
        yje yjeVar = null;
        this.z = q7m0.a(new d980(false, "", new c980("", ""), null, new b980(iun.f15405a, null), false, false));
        this.A = q7m0.a(q880.f28288a);
        this.B = maz.b(new pl70(this, (byte) 6));
        c4m0 c4m0Var = this.y;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.y = sac.T(new fnq(m1eVar.a(), new l980(this, yjeVar, (byte) 2), (byte) 4), jiu0.a(this), y980.h);
        }
        x();
        w();
    }

    public final void A(Integer num, String str, String str2) {
        long jA = this.d.a();
        String strN = ohs0.n(str, str2);
        yje yjeVar = null;
        wmq wmqVar = new wmq((Object) this, (Object) str2, (Object) num, yjeVar, (byte) 14);
        k980 k980Var = new k980(this, (byte) 0);
        gk70 gk70Var = new gk70(1, this, aa80.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 0, (byte) 29);
        String strValueOf = String.valueOf(jA);
        strValueOf.getClass();
        this.v = sac.T(new dnq(new fnq(this.i.a(new p6a("AddUserCall", strN, strValueOf)), new zm70((Object) wmqVar, (Object) k980Var, yjeVar, (byte) 13), (byte) 4), new gbv(this, yjeVar, (byte) 15), (byte) 0), d5c.S(jiu0.a(this), this.g.c), new s980(gk70Var, yjeVar, (byte) 0));
    }

    public final void B(boolean z) {
        while (true) {
            p7m0 p7m0Var = this.z;
            Object value = p7m0Var.getValue();
            boolean z2 = z;
            if (p7m0Var.m(value, d980.a((d980) value, z2, null, null, null, null, false, false, 126))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(String str, String str2, zje zjeVar) {
        z980 z980Var;
        Object g0g0Var;
        if (zjeVar instanceof z980) {
            z980Var = (z980) zjeVar;
            int i = z980Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                z980Var.k = i - Integer.MIN_VALUE;
            } else {
                z980Var = new z980(this, zjeVar);
            }
        } else {
            z980Var = new z980(this, zjeVar);
        }
        Object objB0 = z980Var.i;
        wne wneVar = wne.f39444a;
        int i2 = z980Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objB0);
                e0g0 e0g0Var = j0g0.b;
                vqb vqbVar = this.c;
                z980Var.k = 1;
                objB0 = vqbVar.f37848a.b0(str + str2, z980Var);
                if (objB0 == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objB0);
            }
            g0g0Var = (o4c) objB0;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null && (thA instanceof orv0)) {
            this.t.U("number_error");
        }
        z1x.P(g0g0Var);
        return Unit.f46060a;
    }

    public final void w() {
        p7m0 p7m0Var;
        Object value;
        bby bbyVar = this.x;
        if (bbyVar == null || !bbyVar.isActive()) {
            do {
                p7m0Var = this.z;
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, d980.a((d980) value, false, null, null, null, null, false, true, 63)));
            this.x = sac.g0(jiu0.a(this), aa80.class.getName().concat(".getCallbackLanguages"), this.g.f22085a, new k980(this, (byte) 1), new l980(this, null, (byte) 0), 86);
        }
    }

    public final void x() {
        bby bbyVar = this.w;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.w = sac.i0(jiu0.a(this), aa80.class.getName().concat(".loadCountry"), 3, 0L, kotlin.collections.a.c(oqt0.class), null, new l980(this, null, b), null, this.g.b, t980.f33550a, null, 596);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object y(String str, ynb0 ynb0Var, Integer num, zje zjeVar) {
        w980 w980Var;
        Object g0g0Var;
        Integer num2;
        aa80 aa80Var;
        p7m0 p7m0Var = this.z;
        if (zjeVar instanceof w980) {
            w980Var = (w980) zjeVar;
            int i = w980Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                w980Var.m = i - Integer.MIN_VALUE;
            } else {
                w980Var = new w980(this, zjeVar);
            }
        } else {
            w980Var = new w980(this, zjeVar);
        }
        Object objD0 = w980Var.k;
        wne wneVar = wne.f39444a;
        int i2 = w980Var.m;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                e0g0 e0g0Var = j0g0.b;
                a980 a980Var = ((d980) p7m0Var.getValue()).d;
                if (a980Var == null) {
                    return Unit.f46060a;
                }
                int i3 = a980Var.f465a;
                nv20 nv20Var = this.j;
                String strReplace = new Regex("[^0-9]").replace(StringsKt.u0(str).toString(), "");
                bt9 bt9Var = ((d980) p7m0Var.getValue()).e.b;
                String str2 = bt9Var != null ? bt9Var.c : null;
                String str3 = ((d980) p7m0Var.getValue()).b;
                String str4 = ynb0Var.f42933a;
                String str5 = ynb0Var.b;
                w980Var.i = num;
                w980Var.j = this;
                w980Var.m = 1;
                ju9 ju9Var = (ju9) nv20Var.f24171a;
                objD0 = qjj.d0(ju9Var.c.b, new iu9(ju9Var, str4, str5, i3, strReplace, str3, num, str2, null), w980Var);
                if (objD0 == wneVar) {
                    return wneVar;
                }
                num2 = num;
                aa80Var = this;
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aa80Var = w980Var.j;
                num2 = w980Var.i;
                z1x.P(objD0);
            }
            aa80Var.t.T(num2);
            p7m0 p7m0Var2 = aa80Var.A;
            p880 p880Var = new p880(((nu9) objD0).f24138a);
            p7m0Var2.getClass();
            p7m0Var2.o(null, p880Var);
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            this.t.U("Other");
        }
        z1x.P(g0g0Var);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(String str, String str2, zje zjeVar) {
        x980 x980Var;
        Object g0g0Var;
        if (zjeVar instanceof x980) {
            x980Var = (x980) zjeVar;
            int i = x980Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                x980Var.m = i - Integer.MIN_VALUE;
            } else {
                x980Var = new x980(this, zjeVar);
            }
        } else {
            x980Var = new x980(this, zjeVar);
        }
        Object objD = x980Var.k;
        wne wneVar = wne.f39444a;
        int i2 = x980Var.m;
        try {
            if (i2 == 0) {
                z1x.P(objD);
                e0g0 e0g0Var = j0g0.b;
                cmt cmtVar = this.m;
                x980Var.i = str;
                x980Var.j = str2;
                x980Var.m = 1;
                objD = cmtVar.d(x980Var);
                if (objD == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = x980Var.j;
                str = x980Var.i;
                z1x.P(objD);
            }
            g0g0Var = (List) objD;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Object obj = iun.f15405a;
        if (g0g0Var instanceof g0g0) {
            g0g0Var = obj;
        }
        List list = (List) g0g0Var;
        if (list.size() == 1) {
            A(new Integer(((fp9) CollectionsKt.U(list)).f9917a), str, str2);
        } else if (list.size() > 1) {
            B(false);
            r880 r880Var = new r880(list);
            p7m0 p7m0Var = this.A;
            p7m0Var.getClass();
            p7m0Var.o(null, r880Var);
        } else {
            A(null, str, str2);
        }
        return Unit.f46060a;
    }
}
