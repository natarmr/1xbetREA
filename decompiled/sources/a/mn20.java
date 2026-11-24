package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.make_bet.impl.presentation.model.BetDetailsUiModel;
import org.xplatform.make_bet.impl.presentation.model.CoefUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class mn20 extends w46 {
    public final f6k A;
    public final do20 B;
    public final hsj C;
    public final dnv D;
    public final vyt E;
    public final mii0 F;
    public final x20 G;
    public final vqc H;
    public final h3c I;
    public final z7u J;
    public final yox K;
    public final p7m0 L;
    public final p7m0 M;
    public final p7m0 N;
    public final ol60 O;
    public final ol60 P;
    public final ol60 Q;
    public final p7m0 R;
    public final p7m0 S;
    public final ol60 T;
    public final ol60 U;
    public final p7m0 V;
    public final p7m0 W;
    public final ol60 X;
    public final ol60 Y;
    public final m0k0 b;
    public final vyt c;
    public final ctf0 d;
    public final i1w0 e;
    public final y3j0 f;
    public final gud g;
    public final ms2 h;
    public final mne i;
    public final e8u j;
    public final pj9 k;
    public final lbu l;
    public final pru m;
    public final f3c n;
    public final f3c o;
    public final sd60 p;
    public final m1e q;
    public final b8u r;
    public final chf0 s;
    public final xzp t;
    public final esg0 u;
    public final cr v;
    public final khf0 w;
    public final ot x;
    public final vzg0 y;
    public final loi0 z;

    public mn20(m0k0 m0k0Var, vyt vytVar, ctf0 ctf0Var, i1w0 i1w0Var, y3j0 y3j0Var, gud gudVar, ms2 ms2Var, mne mneVar, e8u e8uVar, pj9 pj9Var, lbu lbuVar, pru pruVar, a7q a7qVar, f3c f3cVar, f3c f3cVar2, sd60 sd60Var, jc60 jc60Var, m1e m1eVar, b8u b8uVar, chf0 chf0Var, xzp xzpVar, esg0 esg0Var, cr crVar, khf0 khf0Var, ot otVar, vzg0 vzg0Var, loi0 loi0Var, f6k f6kVar, do20 do20Var, uyn uynVar, hsj hsjVar, dnv dnvVar, vyt vytVar2, mii0 mii0Var, x20 x20Var, vqc vqcVar, h3c h3cVar, z7u z7uVar, yox yoxVar) {
        dvj dvjVar = mneVar.b;
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = m0k0Var;
        this.c = vytVar;
        this.d = ctf0Var;
        this.e = i1w0Var;
        this.f = y3j0Var;
        this.g = gudVar;
        this.h = ms2Var;
        this.i = mneVar;
        this.j = e8uVar;
        this.k = pj9Var;
        this.l = lbuVar;
        this.m = pruVar;
        this.n = f3cVar;
        this.o = f3cVar2;
        this.p = sd60Var;
        this.q = m1eVar;
        this.r = b8uVar;
        this.s = chf0Var;
        this.t = xzpVar;
        this.u = esg0Var;
        this.v = crVar;
        this.w = khf0Var;
        this.x = otVar;
        this.y = vzg0Var;
        this.z = loi0Var;
        this.A = f6kVar;
        this.B = do20Var;
        this.C = hsjVar;
        this.D = dnvVar;
        this.E = vytVar2;
        this.F = mii0Var;
        this.G = x20Var;
        this.H = vqcVar;
        this.I = h3cVar;
        this.J = z7uVar;
        this.K = yoxVar;
        CoefUiModel coefUiModel = (CoefUiModel) vzg0Var.a("COEF_UI_MODEL_SAVED_STATE_KEY");
        if (coefUiModel == null) {
            l0d l0dVar = l0d.f19195a;
            coefUiModel = new CoefUiModel("", 0.0d, null, l0dVar, null, null, null, l0dVar, false);
        }
        this.L = q7m0.a(coefUiModel);
        BetDetailsUiModel betDetailsUiModel = (BetDetailsUiModel) vzg0Var.a("BET_DETAILS_SAVED_STATE_KEY");
        this.M = q7m0.a(betDetailsUiModel == null ? new BetDetailsUiModel("", "", "", false, false) : betDetailsUiModel);
        this.N = q7m0.a("");
        this.O = new ol60(3);
        this.P = new ol60(3);
        this.Q = new ol60(3);
        this.R = q7m0.a(ii20.f14809a);
        this.S = q7m0.a(vi20.f37457a);
        this.T = new ol60(3);
        this.U = new ol60(3);
        this.V = q7m0.a(iun.f15405a);
        this.W = q7m0.a(eo4.f8123a);
        maz.b(new rx00(this, (byte) 18));
        this.X = new ol60(3);
        this.Y = new ol60(3);
        byte b = 24;
        yje yjeVar = null;
        sac.V(jiu0.a(this), new r520((byte) 24), null, mneVar.b, new wk20((diu0) this, yjeVar, (byte) 0), 10);
        int i = 2;
        sac.T(new fnq(new fnq(new i89(((nb7) ((h03) a7qVar.f384a).b).f23225a, (byte) 22), new z210(this, yjeVar, (byte) 9)), new fhq(this, yjeVar, (byte) 25), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new sax(i, yjeVar, (byte) 22));
        E();
        sac.T(new fnq(jc60Var.f16260a.f11847a.c, new xr10((Object) this, yjeVar, (byte) 10), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new sax(i, yjeVar, b));
        sac.T(new fnq(m1eVar.b(), new il20(this, yjeVar, (byte) 1), (byte) 4), jiu0.a(this), new sax(i, yjeVar, (byte) 20));
        sac.T(new fnq(uynVar.h(), new v620(this, yjeVar, b), (byte) 4), jiu0.a(this), new sax(i, yjeVar, (byte) 23));
    }

    public final l0d A(double d, double d2, boolean z) {
        m97 m97Var;
        nb7 nb7Var = (nb7) this.o.f8854a.b;
        if (nb7Var.b || ((m97Var = (m97) nb7Var.f23225a.getValue()) != null && m97Var.d)) {
            return l0d.e;
        }
        if (z) {
            return l0d.f19195a;
        }
        if (d == 0.0d || d2 == 0.0d) {
            return l0d.f19195a;
        }
        if (d > d2) {
            return l0d.c;
        }
        return d < d2 ? l0d.b : l0d.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(zje zjeVar) {
        dk20 dk20Var;
        if (zjeVar instanceof dk20) {
            dk20Var = (dk20) zjeVar;
            int i = dk20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dk20Var.k = i - Integer.MIN_VALUE;
            } else {
                dk20Var = new dk20(this, zjeVar);
            }
        } else {
            dk20Var = new dk20(this, zjeVar);
        }
        Object objX = dk20Var.i;
        Object obj = wne.f39444a;
        int i2 = dk20Var.k;
        if (i2 == 0) {
            z1x.P(objX);
            dk20Var.k = 1;
            objX = x(dk20Var);
            if (objX == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objX);
        }
        if (((Boolean) objX).booleanValue()) {
            ctf0 ctf0Var = this.d;
            String strA = ctf0Var.b.a(R.string.team_first, Arrays.copyOf(new Object[0], 0));
            String strA2 = ctf0Var.b.a(R.string.team_sec, Arrays.copyOf(new Object[0], 0));
            int i3 = cy7.f5159a;
            return cy7.e(strA + " \u200e-\u200e " + strA2);
        }
        m0k0 m0k0Var = this.b;
        boolean zW = StringsKt.W(m0k0Var.d);
        String str = m0k0Var.d;
        if (zW) {
            return str;
        }
        String str2 = m0k0Var.h;
        int i4 = cy7.f5159a;
        return cy7.e(str + " \u200e-\u200e " + str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(m97 m97Var, zje zjeVar) {
        cl20 cl20Var;
        if (zjeVar instanceof cl20) {
            cl20Var = (cl20) zjeVar;
            int i = cl20Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                cl20Var.l = i - Integer.MIN_VALUE;
            } else {
                cl20Var = new cl20(this, zjeVar);
            }
        } else {
            cl20Var = new cl20(this, zjeVar);
        }
        Object objX = cl20Var.j;
        Object obj = wne.f39444a;
        int i2 = cl20Var.l;
        if (i2 == 0) {
            z1x.P(objX);
            cl20Var.i = m97Var;
            cl20Var.l = 1;
            objX = x(cl20Var);
            if (objX != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objX);
                return objX;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m97Var = cl20Var.i;
        z1x.P(objX);
        if (((Boolean) objX).booleanValue()) {
            return Boolean.FALSE;
        }
        long j = m97Var.h;
        cl20Var.i = null;
        cl20Var.l = 2;
        Object objM = this.K.m(j, cl20Var);
        return objM == obj ? obj : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object D(long j, long j2, long j3, long j4, zje zjeVar) {
        gl20 gl20Var;
        long j5;
        Object obj;
        long j6;
        long j7;
        l1g l1gVar;
        long j8;
        j1g j1gVar;
        if (zjeVar instanceof gl20) {
            gl20Var = (gl20) zjeVar;
            int i = gl20Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                gl20Var.p = i - Integer.MIN_VALUE;
            } else {
                gl20Var = new gl20(this, zjeVar);
            }
        } else {
            gl20Var = new gl20(this, zjeVar);
        }
        Object obj2 = gl20Var.n;
        wne wneVar = wne.f39444a;
        int i2 = gl20Var.p;
        if (i2 == 0) {
            z1x.P(obj2);
            long j9 = j2 == 40 ? j3 : j2;
            l1g l1gVar2 = l1g.ADD_TO_COUPON;
            gl20Var.m = l1gVar2;
            gl20Var.i = j;
            gl20Var.j = j2;
            j5 = j4;
            gl20Var.k = j5;
            gl20Var.l = j9;
            gl20Var.p = 1;
            Object objB = this.I.b(j2, gl20Var);
            if (objB == wneVar) {
                return wneVar;
            }
            obj = objB;
            j6 = j9;
            j7 = j2;
            l1gVar = l1gVar2;
            j8 = j;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j10 = gl20Var.l;
            long j11 = gl20Var.k;
            j7 = gl20Var.j;
            long j12 = gl20Var.i;
            l1g l1gVar3 = gl20Var.m;
            z1x.P(obj2);
            j5 = j11;
            l1gVar = l1gVar3;
            j6 = j10;
            obj = obj2;
            j8 = j12;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (j7 == 40) {
            j1gVar = j1g.REAL;
        } else {
            j1gVar = zBooleanValue ? j1g.SYNTHETIC : j1g.CYBER;
        }
        ms2 ms2Var = this.h;
        if (ms2Var != null) {
            boolean z = ms2Var instanceof uq2;
            vqc vqcVar = this.H;
            if (z || (ms2Var instanceof lq2) || (ms2Var instanceof sq2) || (ms2Var instanceof jr2) || (ms2Var instanceof tq2) || (ms2Var instanceof jq2) || (ms2Var instanceof kq2) || (ms2Var instanceof mq2) || (ms2Var instanceof nq2) || (ms2Var instanceof rq2)) {
                vqcVar.k(pzb.C(new dh20(j8, this, j6, l1gVar, j1gVar, j5, (byte) 0)));
            } else if (((ms2Var instanceof kr2) || (ms2Var instanceof lr2)) && zBooleanValue) {
                vqcVar.k(pzb.C(new dh20(j8, this, j6, l1gVar, j1gVar, j5, (byte) 1)));
            }
        }
        return Unit.f46060a;
    }

    public final void E() {
        int i;
        int iOrdinal = this.c.a().ordinal();
        if (iOrdinal == 0) {
            i = R.string.to_confirm;
        } else if (iOrdinal == 1) {
            i = R.string.to_any_accept;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            i = R.string.to_up_accept;
        }
        String strA = this.d.b.a(i, Arrays.copyOf(new Object[0], 0));
        p7m0 p7m0Var = this.N;
        p7m0Var.getClass();
        p7m0Var.o(null, strA);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object F(m97 m97Var, zje zjeVar) {
        fn20 fn20Var;
        l0d l0dVarA;
        int i;
        int i2;
        m97 m97Var2;
        l0d l0dVar;
        Object value;
        double d;
        String str;
        String strI0;
        Double d2;
        String str2;
        String str3;
        if (zjeVar instanceof fn20) {
            fn20Var = (fn20) zjeVar;
            int i3 = fn20Var.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fn20Var.p = i3 - Integer.MIN_VALUE;
            } else {
                fn20Var = new fn20(this, zjeVar);
            }
        } else {
            fn20Var = new fn20(this, zjeVar);
        }
        fn20 fn20Var2 = fn20Var;
        Object objC = fn20Var2.n;
        Object obj = wne.f39444a;
        int i4 = fn20Var2.p;
        p7m0 p7m0Var = this.L;
        if (i4 == 0) {
            z1x.P(objC);
            boolean zT = this.C.t();
            l0d l0dVarA2 = A(((CoefUiModel) p7m0Var.getValue()).b, m97Var.l, zT);
            Double d3 = ((CoefUiModel) p7m0Var.getValue()).e;
            l0dVarA = A(d3 != null ? d3.doubleValue() : 0.0d, m97Var.y, zT);
            l0d l0dVar2 = l0d.e;
            int i5 = l0dVarA2 == l0dVar2 ? 1 : 0;
            int i6 = l0dVarA == l0dVar2 ? 1 : 0;
            fn20Var2.i = m97Var;
            fn20Var2.j = l0dVarA2;
            fn20Var2.k = l0dVarA;
            fn20Var2.l = i5;
            fn20Var2.m = i6;
            fn20Var2.p = 1;
            objC = C(m97Var, fn20Var2);
            if (objC == obj) {
                return obj;
            }
            i = i6;
            i2 = i5;
            m97Var2 = m97Var;
            l0dVar = l0dVarA2;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = fn20Var2.m;
            i2 = fn20Var2.l;
            l0dVarA = fn20Var2.k;
            l0d l0dVar3 = fn20Var2.j;
            m97Var2 = fn20Var2.i;
            z1x.P(objC);
            l0dVar = l0dVar3;
        }
        l0d l0dVar4 = l0dVarA;
        boolean zBooleanValue = ((Boolean) objC).booleanValue();
        do {
            value = p7m0Var.getValue();
            CoefUiModel coefUiModel = (CoefUiModel) value;
            d = m97Var2.l;
            str = m97Var2.n;
            String strI1 = "";
            strI0 = i2 == 0 ? sj3.i0(coefUiModel.f46772a) : "";
            d2 = zBooleanValue ? new Double(m97Var2.y) : null;
            str2 = zBooleanValue ? m97Var2.z : null;
            if (i != 0) {
                str3 = strI1;
            } else {
                String str4 = coefUiModel.f;
                if (str4 != null) {
                    strI1 = sj3.i0(str4);
                    str3 = strI1;
                } else {
                    str3 = null;
                }
            }
            coefUiModel.getClass();
            str.getClass();
            l0dVar.getClass();
            l0dVar4.getClass();
        } while (!p7m0Var.m(value, new CoefUiModel(str, d, strI0, l0dVar, d2, str2, str3, l0dVar4, zBooleanValue)));
        return Unit.f46060a;
    }

    @Override // a.diu0
    public final void v() {
        this.s.P();
        this.A.a(bm5.b);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(boolean z, m97 m97Var, zje zjeVar) {
        dj20 dj20Var;
        if (zjeVar instanceof dj20) {
            dj20Var = (dj20) zjeVar;
            int i = dj20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dj20Var.k = i - Integer.MIN_VALUE;
            } else {
                dj20Var = new dj20(this, zjeVar);
            }
        } else {
            dj20Var = new dj20(this, zjeVar);
        }
        Object objX = dj20Var.i;
        Object obj = wne.f39444a;
        int i2 = dj20Var.k;
        if (i2 == 0) {
            z1x.P(objX);
            if (this.m.a().f32117a.f12063a.i && !z && m97Var.u != 707) {
                dj20Var.k = 1;
                objX = x(dj20Var);
                if (objX == obj) {
                    return obj;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objX);
        boolean z2 = ((Boolean) objX).booleanValue() ? false : true;
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(zje zjeVar) {
        gj20 gj20Var;
        if (zjeVar instanceof gj20) {
            gj20Var = (gj20) zjeVar;
            int i = gj20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gj20Var.k = i - Integer.MIN_VALUE;
            } else {
                gj20Var = new gj20(this, zjeVar);
            }
        } else {
            gj20Var = new gj20(this, zjeVar);
        }
        Object objA = gj20Var.i;
        wne wneVar = wne.f39444a;
        int i2 = gj20Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            gj20Var.k = 1;
            objA = this.n.a(gj20Var);
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
        return Boolean.valueOf(((m97) objA).w instanceof xfa0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(m97 m97Var, zje zjeVar) {
        lj20 lj20Var;
        boolean z;
        if (zjeVar instanceof lj20) {
            lj20Var = (lj20) zjeVar;
            int i = lj20Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                lj20Var.l = i - Integer.MIN_VALUE;
            } else {
                lj20Var = new lj20(this, zjeVar);
            }
        } else {
            lj20Var = new lj20(this, zjeVar);
        }
        Object obj = lj20Var.j;
        Object obj2 = wne.f39444a;
        int i2 = lj20Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            boolean zJ = this.l.j();
            lj20Var.i = zJ;
            lj20Var.l = 1;
            Object objW = w(zJ, m97Var, lj20Var);
            if (objW == obj2) {
                return obj2;
            }
            obj = objW;
            z = zJ;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = lj20Var.i;
            z1x.P(obj);
        }
        List listZ = tx3.z(new fo7[]{co7.b, this.m.a().l.g && !z ? zn7.b : null, ((Boolean) obj).booleanValue() ? xn7.b : null});
        p7m0 p7m0Var = this.V;
        p7m0Var.getClass();
        p7m0Var.o(null, listZ);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(zje zjeVar) {
        sj20 sj20Var;
        if (zjeVar instanceof sj20) {
            sj20Var = (sj20) zjeVar;
            int i = sj20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sj20Var.k = i - Integer.MIN_VALUE;
            } else {
                sj20Var = new sj20(this, zjeVar);
            }
        } else {
            sj20Var = new sj20(this, zjeVar);
        }
        Object objA = sj20Var.i;
        wne wneVar = wne.f39444a;
        int i2 = sj20Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            sj20Var.k = 1;
            objA = this.n.a(sj20Var);
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
        m97 m97Var = (m97) objA;
        return kng0.l(this.d.b.a(R.string.bet_name, Arrays.copyOf(new Object[]{m97Var.p}, 1)), Separators.SP, m97Var.o);
    }
}
