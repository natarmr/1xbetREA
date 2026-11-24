package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.Serializable;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class cx10 extends w46 {
    public final wpt A;
    public final r9u B;
    public final qho C;
    public final yfu D;
    public final v8d E;
    public final sff0 F;
    public final ol60 G;
    public final p7m0 H;
    public final p7m0 I;
    public boolean J;
    public c4m0 K;
    public bby L;
    public c4m0 M;
    public c4m0 N;
    public c4m0 O;
    public final boolean P;
    public boolean Q;
    public final vzg0 b;
    public final do20 c;
    public final i1w0 d;
    public final pmi0 e;
    public final mne f;
    public final ot g;
    public final jyg0 h;
    public final q840 i;
    public final jh70 j;
    public final v88 k;
    public final ytt l;
    public final yfu m;
    public final lbu n;
    public final x1u o;
    public final rou p;
    public final ahu q;
    public final mnb r;
    public final zlt0 s;
    public final kc60 t;
    public final g5k u;
    public final duj v;
    public final ctf0 w;
    public final m1e x;
    public final dmt y;
    public final tzi z;

    public cx10(vzg0 vzg0Var, pru pruVar, do20 do20Var, i1w0 i1w0Var, pmi0 pmi0Var, mne mneVar, ot otVar, jyg0 jyg0Var, q840 q840Var, jh70 jh70Var, v88 v88Var, ytt yttVar, yfu yfuVar, lbu lbuVar, x1u x1uVar, rou rouVar, ahu ahuVar, b8u b8uVar, mnb mnbVar, zlt0 zlt0Var, kc60 kc60Var, g5k g5kVar, duj dujVar, ctf0 ctf0Var, m1e m1eVar, dmt dmtVar, tzi tziVar, wpt wptVar, r9u r9uVar, qho qhoVar, yfu yfuVar2, n4u n4uVar, bzt bztVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        this.b = vzg0Var;
        this.c = do20Var;
        this.d = i1w0Var;
        this.e = pmi0Var;
        this.f = mneVar;
        this.g = otVar;
        this.h = jyg0Var;
        this.i = q840Var;
        this.j = jh70Var;
        this.k = v88Var;
        this.l = yttVar;
        this.m = yfuVar;
        this.n = lbuVar;
        this.o = x1uVar;
        this.p = rouVar;
        this.q = ahuVar;
        this.r = mnbVar;
        this.s = zlt0Var;
        this.t = kc60Var;
        this.u = g5kVar;
        this.v = dujVar;
        this.w = ctf0Var;
        this.x = m1eVar;
        this.y = dmtVar;
        this.z = tziVar;
        this.A = wptVar;
        this.B = r9uVar;
        this.C = qhoVar;
        this.D = yfuVar2;
        this.E = bztVar.f3488a.a();
        sff0 sff0VarA = pruVar.a();
        this.F = sff0VarA;
        this.G = new ol60(3);
        this.H = q7m0.a("");
        n4uVar.e();
        this.I = q7m0.a(new rw10("", "", false, false, false, false, false, null, null, new ow10(R.drawable.ic_glyph_circle_profile), "", "", "", sff0VarA.T1));
        Object objA = vzg0Var.a("MENU_SHOW_CHANGE_ACCOUNT");
        Boolean bool = Boolean.TRUE;
        this.P = Intrinsics.d(objA, bool);
        this.Q = Intrinsics.d(vzg0Var.a("open_bot"), bool);
        Boolean bool2 = Boolean.FALSE;
        vzg0Var.e("MENU_SHOW_CHANGE_ACCOUNT", bool2);
        vzg0Var.e("open_bot", bool2);
        sac.T(new fnq(b8uVar.a(bm5.g), new fw10(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new dm10(2, this, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 18));
    }

    public final void A() {
        v3c.N(this.O);
        yje yjeVar = null;
        this.O = sac.T(new fnq(this.m.e(), new fw10(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), this.f.f22085a), new fw10(this, yjeVar, (byte) 3));
    }

    public final void B() {
        tzi tziVar = this.z;
        ((ag3) tziVar.h).f809a.c("main_menu_settings");
        ((s64) tziVar.e).f31684a.a(xun.f41520a, 3143L);
        FragmentScreen fragmentScreenB = pmi0.b(this.e, true);
        i1w0 i1w0Var = this.d;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        if (fragmentScreenB instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenB)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenB)));
        }
        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object C(zje zjeVar) {
        bx10 bx10Var;
        if (zjeVar instanceof bx10) {
            bx10Var = (bx10) zjeVar;
            int i = bx10Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bx10Var.k = i - Integer.MIN_VALUE;
            } else {
                bx10Var = new bx10(this, zjeVar);
            }
        } else {
            bx10Var = new bx10(this, zjeVar);
        }
        Object objB = bx10Var.i;
        Object obj = wne.f39444a;
        int i2 = bx10Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            bx10Var.k = 1;
            objB = this.q.b(bm5.f2822a, bx10Var);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        ql5 ql5Var = (ql5) objB;
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(ql5Var.b, p3u0.c);
        String str = ql5Var.f;
        while (true) {
            p7m0 p7m0Var = this.I;
            Object value = p7m0Var.getValue();
            String str2 = str;
            if (p7m0Var.m(value, rw10.a((rw10) value, null, null, false, false, false, false, false, null, null, null, null, strC, str2, 26623))) {
                return Unit.f46060a;
            }
            str = str2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable w(zje zjeVar) {
        vw10 vw10Var;
        Serializable g0g0Var;
        if (zjeVar instanceof vw10) {
            vw10Var = (vw10) zjeVar;
            int i = vw10Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vw10Var.k = i - Integer.MIN_VALUE;
            } else {
                vw10Var = new vw10(this, zjeVar);
            }
        } else {
            vw10Var = new vw10(this, zjeVar);
        }
        Object objA = vw10Var.i;
        wne wneVar = wne.f39444a;
        int i2 = vw10Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                e0g0 e0g0Var = j0g0.b;
                rou rouVar = this.p;
                vw10Var.k = 1;
                objA = rouVar.a(false, vw10Var);
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objA);
            }
            m2c0 m2c0Var = (m2c0) objA;
            g0g0Var = StringsKt.u0(m2c0Var.U + Separators.SP + m2c0Var.V).toString();
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? "" : g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(cx10 cx10Var, zje zjeVar) {
        ww10 ww10Var;
        cx10 cx10Var2;
        long j;
        if (zjeVar instanceof ww10) {
            ww10Var = (ww10) zjeVar;
            int i = ww10Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ww10Var.m = i - Integer.MIN_VALUE;
            } else {
                ww10Var = new ww10(this, zjeVar);
            }
        } else {
            ww10Var = new ww10(this, zjeVar);
        }
        Object objW = ww10Var.k;
        Object obj = wne.f39444a;
        int i2 = ww10Var.m;
        if (i2 == 0) {
            z1x.P(objW);
            long jA = cx10Var.o.a();
            ww10Var.i = cx10Var;
            ww10Var.j = jA;
            ww10Var.m = 1;
            objW = cx10Var.w(ww10Var);
            if (objW == obj) {
                return obj;
            }
            cx10Var2 = cx10Var;
            j = jA;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = ww10Var.j;
            cx10Var2 = ww10Var.i;
            z1x.P(objW);
        }
        String str = (String) objW;
        if (StringsKt.W(str)) {
            return j > 0 ? cx10Var2.w.f(R.string.menu_account_id, new Long(j)) : cx10Var2.w.f(R.string.user, new Object[0]);
        }
        return str;
    }

    public final void y(Throwable th) {
        this.v.b(th, new g2z((Object) this, (byte) 27));
    }

    public final void z() {
        v3c.N(this.L);
        this.L = sac.V(jiu0.a(this), new pf10(1, this, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, this.f.b, new mt00((diu0) this, (yje) null, (byte) 5), 10);
    }
}
