package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class dt6 extends i3t0 {
    public static final /* synthetic */ int e0 = 0;
    public final rou A;
    public final khf0 B;
    public final nvu C;
    public final trm0 D;
    public final drt E;
    public final f7u F;
    public final pwi G;
    public final zlt0 H;
    public final v88 I;
    public final au0 J;
    public final buo0 K;
    public final bn6 L;
    public final pyu M;
    public final rqt N;
    public final ih5 O;
    public final ih5 P;
    public final gg5 Q;
    public final l7k R;
    public final m1e S;
    public final ctf0 T;
    public final duj U;
    public final mne V;
    public final i1w0 W;
    public final r9u X;
    public final cmt Y;
    public c4m0 Z;
    public final c4m0 a0;
    public bby b0;
    public final k050 c0;
    public bby d0;
    public final reu o;
    public final pru p;
    public final f6k q;
    public final u4a r;
    public final m0u s;
    public final lbu t;
    public final q4u u;
    public final usu v;
    public final yfu w;
    public final pyu x;
    public final hru y;
    public final x0u z;

    /* JADX WARN: Illegal instructions before constructor call */
    public dt6(reu reuVar, pru pruVar, b8u b8uVar, f6k f6kVar, u4a u4aVar, m0u m0uVar, lbu lbuVar, q4u q4uVar, iqt iqtVar, usu usuVar, yfu yfuVar, rxu rxuVar, pyu pyuVar, hru hruVar, x0u x0uVar, rou rouVar, wyu wyuVar, khf0 khf0Var, nvu nvuVar, trm0 trm0Var, drt drtVar, lk5 lk5Var, f7u f7uVar, pwi pwiVar, zlt0 zlt0Var, v88 v88Var, au0 au0Var, buo0 buo0Var, bn6 bn6Var, pyu pyuVar2, rqt rqtVar, zri zriVar, ih5 ih5Var, ih5 ih5Var2, gg5 gg5Var, l7k l7kVar, m1e m1eVar, ctf0 ctf0Var, duj dujVar, mne mneVar, i1w0 i1w0Var, r9u r9uVar, cmt cmtVar) {
        wyuVar.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        byte b = 1;
        yje yjeVar = null;
        super(new h92(zriVar, wyuVar, r9uVar, zlt0Var, reuVar, ctf0Var, iqtVar, lk5Var), cvm0.p(vs10Var, mneVar.f22085a), new og0(b, pruVar, ctf0Var), (yzn0) null);
        this.o = reuVar;
        this.p = pruVar;
        this.q = f6kVar;
        this.r = u4aVar;
        this.s = m0uVar;
        this.t = lbuVar;
        this.u = q4uVar;
        this.v = usuVar;
        this.w = yfuVar;
        this.x = pyuVar;
        this.y = hruVar;
        this.z = x0uVar;
        this.A = rouVar;
        this.B = khf0Var;
        this.C = nvuVar;
        this.D = trm0Var;
        this.E = drtVar;
        this.F = f7uVar;
        this.G = pwiVar;
        this.H = zlt0Var;
        this.I = v88Var;
        this.J = au0Var;
        this.K = buo0Var;
        this.L = bn6Var;
        this.M = pyuVar2;
        this.N = rqtVar;
        this.O = ih5Var;
        this.P = ih5Var2;
        this.Q = gg5Var;
        this.R = l7kVar;
        this.S = m1eVar;
        this.T = ctf0Var;
        this.U = dujVar;
        this.V = mneVar;
        this.W = i1w0Var;
        this.X = r9uVar;
        this.Y = cmtVar;
        this.c0 = new k050();
        i3t0.K(this, null, null, new zs6(this, yjeVar, b), 3);
        byte b2 = 0;
        i3t0.K(this, null, new ms6(this, (byte) 0), new zs6(this, yjeVar, b2), 1);
        c4m0 c4m0Var = this.a0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        fnq fnqVar = new fnq(b8uVar.a(bm5.k), new ex1((Object) this, yjeVar, (byte) 10));
        gh5 gh5Var = new gh5((byte) 26);
        eoh0 eoh0Var = i120.f;
        zys0.e(2, gh5Var);
        this.a0 = sac.T(new p6d(i120.X(fnqVar, eoh0Var, gh5Var), m1eVar.b(), new ws6(this, yjeVar, b2), (byte) 1), d5c.S(jiu0.a(this), dvjVar), new xs6(this, yjeVar, b2));
        sac.T(new fnq(rxuVar.a(), new ys6(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new xs6(this, yjeVar, b));
    }

    public static double X(double d, double d2, double d3) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(d2));
        BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(d3));
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal2);
        bigDecimalAdd.getClass();
        return bigDecimalAdd.compareTo(bigDecimal3) > 0 ? d3 : bigDecimalAdd.doubleValue();
    }

    public final boolean M() {
        nwo0 nwo0VarC = this.o.c();
        if (nwo0VarC.f24244a) {
            return true;
        }
        return ((c820) D()).i && nwo0VarC.b && ((ovo0) this.x.f27815a).f25934a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object N(double d, double d2, String str, un6 un6Var, zje zjeVar) throws Throwable {
        qs6 qs6Var;
        dt6 dt6Var;
        double d3;
        double d4;
        if (zjeVar instanceof qs6) {
            qs6Var = (qs6) zjeVar;
            int i = qs6Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                qs6Var.o = i - Integer.MIN_VALUE;
            } else {
                qs6Var = new qs6(this, zjeVar);
            }
        } else {
            qs6Var = new qs6(this, zjeVar);
        }
        qs6 qs6Var2 = qs6Var;
        Object objP = qs6Var2.m;
        wne wneVar = wne.f39444a;
        int i2 = qs6Var2.o;
        if (i2 == 0) {
            z1x.P(objP);
            qs6Var2.k = str;
            qs6Var2.l = un6Var;
            qs6Var2.i = d;
            qs6Var2.j = d2;
            qs6Var2.o = 1;
            dt6Var = this;
            objP = dt6Var.P(d, d2, qs6Var2);
            if (objP == wneVar) {
                return wneVar;
            }
            d3 = d;
            d4 = d2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d4 = qs6Var2.j;
            d3 = qs6Var2.i;
            un6Var = qs6Var2.l;
            str = qs6Var2.k;
            z1x.P(objP);
            dt6Var = this;
        }
        String str2 = str;
        hxu hxuVar = (hxu) objP;
        Object objQ = (hxuVar.d.b > 0.0d || hxuVar.f13829a.b > 0.0d) ? rsm0.q(hxuVar, str2) : iun.f15405a;
        String strW = d4 > 0.0d ? zdx.w(str2, d3, d4, hxuVar) : "";
        bby bbyVar = dt6Var.d0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        un6Var.F(objQ, strW, hxuVar);
        return Unit.f46060a;
    }

    public final String O() {
        nwo0 nwo0VarC = this.o.c();
        boolean z = nwo0VarC.f24244a || (((c820) D()).i && nwo0VarC.b && ((ovo0) this.x.f27815a).f25934a);
        ctf0 ctf0Var = this.T;
        ctf0Var.getClass();
        return ctf0Var.b.a(z ? R.string.summary_possible_win : R.string.history_possible_win, Arrays.copyOf(new Object[0], 0));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0100  */
    /* JADX WARN: Code duplicated, block: B:36:0x0126 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object P(double d, double d2, zje zjeVar) throws Throwable {
        rs6 rs6Var;
        double d3;
        hru hruVar;
        double d4;
        qvo0 qvo0Var;
        hru hruVar2;
        double d5;
        long j;
        double d6;
        int iIntValue;
        long j2;
        Object objA;
        qvo0 qvo0Var2;
        double d7;
        double d8;
        hru hruVar3;
        double d9;
        int i;
        double d10;
        long j3;
        Serializable serializableC;
        double d11 = d;
        double d12 = d2;
        if (zjeVar instanceof rs6) {
            rs6Var = (rs6) zjeVar;
            int i2 = rs6Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rs6Var.s = i2 - Integer.MIN_VALUE;
            } else {
                rs6Var = new rs6(this, zjeVar);
            }
        } else {
            rs6Var = new rs6(this, zjeVar);
        }
        Object objG = rs6Var.q;
        wne wneVar = wne.f39444a;
        int i3 = rs6Var.s;
        if (i3 == 0) {
            z1x.P(objG);
            bm5 bm5Var = bm5.k;
            hru hruVar4 = this.y;
            rs6Var.m = hruVar4;
            rs6Var.i = d11;
            rs6Var.j = d12;
            rs6Var.k = d11;
            rs6Var.l = d12;
            rs6Var.s = 1;
            objG = khf0.G(this.B, bm5Var, rs6Var);
            if (objG != wneVar) {
                d3 = d11;
                hruVar = hruVar4;
                d4 = d12;
            }
            return wneVar;
        }
        if (i3 == 1) {
            double d13 = rs6Var.l;
            double d14 = rs6Var.k;
            d4 = rs6Var.j;
            d3 = rs6Var.i;
            hruVar = rs6Var.m;
            z1x.P(objG);
            d12 = d13;
            d11 = d14;
        } else {
            if (i3 == 2) {
                j = rs6Var.o;
                d12 = rs6Var.l;
                d5 = rs6Var.k;
                d6 = rs6Var.j;
                double d15 = rs6Var.i;
                qvo0Var = rs6Var.n;
                hru hruVar5 = rs6Var.m;
                z1x.P(objG);
                hruVar2 = hruVar5;
                d3 = d15;
                iIntValue = ((Number) objG).intValue();
                rs6Var.m = hruVar2;
                rs6Var.n = qvo0Var;
                rs6Var.i = d3;
                rs6Var.j = d6;
                rs6Var.k = d5;
                rs6Var.l = d12;
                rs6Var.o = j;
                rs6Var.p = iIntValue;
                j2 = j;
                rs6Var.s = 3;
                objA = this.A.a(false, rs6Var);
                if (objA != wneVar) {
                    qvo0Var2 = qvo0Var;
                    objG = objA;
                    d7 = d3;
                    d8 = d12;
                    hruVar3 = hruVar2;
                    d9 = d5;
                    i = iIntValue;
                    d10 = d6;
                    j3 = j2;
                }
                return wneVar;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    z1x.P(objG);
                    return objG;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = rs6Var.p;
            long j4 = rs6Var.o;
            double d16 = rs6Var.l;
            double d17 = rs6Var.k;
            double d18 = rs6Var.j;
            double d19 = rs6Var.i;
            qvo0 qvo0Var3 = rs6Var.n;
            hru hruVar6 = rs6Var.m;
            z1x.P(objG);
            qvo0Var2 = qvo0Var3;
            d9 = d17;
            i = i4;
            hruVar3 = hruVar6;
            j3 = j4;
            d7 = d19;
            d10 = d18;
            d8 = d16;
        }
        int i5 = ((m2c0) objG).F;
        rs6Var.m = null;
        rs6Var.n = null;
        rs6Var.i = d7;
        rs6Var.j = d10;
        rs6Var.s = 4;
        serializableC = hruVar3.c(d9, d8, i, i5, j3, rs6Var, qvo0Var2);
        if (serializableC == wneVar) {
            return wneVar;
        }
        return serializableC;
        long j5 = ((ql5) objG).e;
        qvo0 qvo0Var4 = qvo0.b;
        rs6Var.m = hruVar;
        rs6Var.n = qvo0Var4;
        rs6Var.i = d3;
        rs6Var.j = d4;
        rs6Var.k = d11;
        rs6Var.l = d12;
        rs6Var.o = j5;
        rs6Var.s = 2;
        Object objC = this.z.c(rs6Var);
        if (objC != wneVar) {
            double d20 = d4;
            qvo0Var = qvo0Var4;
            objG = objC;
            hruVar2 = hruVar;
            d5 = d11;
            j = j5;
            d6 = d20;
            iIntValue = ((Number) objG).intValue();
            rs6Var.m = hruVar2;
            rs6Var.n = qvo0Var;
            rs6Var.i = d3;
            rs6Var.j = d6;
            rs6Var.k = d5;
            rs6Var.l = d12;
            rs6Var.o = j;
            rs6Var.p = iIntValue;
            j2 = j;
            rs6Var.s = 3;
            objA = this.A.a(false, rs6Var);
            if (objA != wneVar) {
                qvo0Var2 = qvo0Var;
                objG = objA;
                d7 = d3;
                d8 = d12;
                hruVar3 = hruVar2;
                d9 = d5;
                i = iIntValue;
                d10 = d6;
                j3 = j2;
                int i6 = ((m2c0) objG).F;
                rs6Var.m = null;
                rs6Var.n = null;
                rs6Var.i = d7;
                rs6Var.j = d10;
                rs6Var.s = 4;
                serializableC = hruVar3.c(d9, d8, i, i6, j3, rs6Var, qvo0Var2);
                if (serializableC == wneVar) {
                    return wneVar;
                }
                return serializableC;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object Q(zje zjeVar) {
        ss6 ss6Var;
        double d;
        Object value;
        c820 c820Var;
        svj0 svj0Var;
        if (zjeVar instanceof ss6) {
            ss6Var = (ss6) zjeVar;
            int i = ss6Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ss6Var.l = i - Integer.MIN_VALUE;
            } else {
                ss6Var = new ss6(this, zjeVar);
            }
        } else {
            ss6Var = new ss6(this, zjeVar);
        }
        Object objK = ss6Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ss6Var.l;
        if (i2 == 0) {
            z1x.P(objK);
            double d2 = ((c820) D()).d.f32870a.b.f39872a;
            ss6Var.i = d2;
            ss6Var.l = 1;
            objK = ntb.K(vtb.M(this.v.f36228a.b.d), ss6Var);
            if (objK == wneVar) {
                return wneVar;
            }
            d = d2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d3 = ss6Var.i;
            z1x.P(objK);
            d = d3;
        }
        double d4 = ((jg7) objK).f16467a;
        String strW = (!S() || d4 == 0.0d) ? "" : zdx.w(((c820) D()).d.f32870a.b.f, d, d4, hxu.h);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            c820Var = (c820) value;
            this.f.getClass();
            svj0Var = c820Var.d;
        } while (!p7m0Var.m(value, c820.a(c820Var, null, null, null, svj0.a(svj0Var, null, nnb0.a(svj0Var.b, true, null, strW, 2), null, 13), null, null, false, false, false, false, null, 8183)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object R(ql5 ql5Var, zje zjeVar) {
        vs6 vs6Var;
        boolean zK;
        Object objC;
        tg20 tg20VarE;
        double d;
        boolean z;
        ql5 ql5Var2;
        boolean z2;
        tg20 tg20Var;
        double d2;
        boolean z3;
        ww6 ww6VarA;
        p7m0 p7m0Var;
        Object value;
        c820 c820Var;
        svj0 svj0Var;
        ql5 ql5Var3 = ql5Var;
        if (zjeVar instanceof vs6) {
            vs6Var = (vs6) zjeVar;
            int i = vs6Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                vs6Var.n = i - Integer.MIN_VALUE;
            } else {
                vs6Var = new vs6(this, zjeVar);
            }
        } else {
            vs6Var = new vs6(this, zjeVar);
        }
        Object obj = vs6Var.l;
        wne wneVar = wne.f39444a;
        int i2 = vs6Var.n;
        pyu pyuVar = this.M;
        if (i2 == 0) {
            z1x.P(obj);
            zK = pyuVar.k();
            long j = ql5Var3.e;
            vs6Var.i = ql5Var3;
            vs6Var.k = zK;
            vs6Var.n = 1;
            objC = this.s.f20973a.c(j, vs6Var);
            if (objC != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            boolean z4 = vs6Var.k;
            ql5 ql5Var4 = vs6Var.i;
            z1x.P(obj);
            zK = z4;
            ql5Var3 = ql5Var4;
            objC = obj;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = vs6Var.k;
            tg20Var = vs6Var.j;
            ql5Var2 = vs6Var.i;
            z1x.P(obj);
        }
        d = ((c3j0) obj).b;
        z = z2;
        ql5Var3 = ql5Var2;
        tg20VarE = tg20Var;
        double d3 = d;
        ww6 ww6Var = ((c820) D()).d.f32870a.b;
        boolean z5 = tg20VarE.d;
        d2 = tg20VarE.b;
        String str = ql5Var3.f;
        if (d2 == 0.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        ww6VarA = ww6.a(ww6Var, d3, d3, d2, 0.0d, 0.0d, str, z5, null, !z3, false, 8536);
        p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            c820Var = (c820) value;
            this.f.getClass();
            svj0Var = c820Var.d;
        } while (!p7m0Var.m(value, c820.a(c820Var, null, null, null, svj0.a(svj0Var, ex6.a(svj0Var.f32870a, null, ww6VarA, 1), null, null, 14), null, null, z, false, false, false, null, 8055)));
        b0(d3);
        return Unit.f46060a;
        this.N.getClass();
        tg20VarE = rqt.e((xuf) objC);
        if (pyuVar.k()) {
            vs6Var.i = ql5Var3;
            vs6Var.j = tg20VarE;
            vs6Var.k = zK;
            vs6Var.n = 2;
            Object objA = this.u.f28119a.a(ql5Var3, vs6Var);
            if (objA != wneVar) {
                ql5Var2 = ql5Var3;
                z2 = zK;
                obj = objA;
                tg20Var = tg20VarE;
                d = ((c3j0) obj).b;
                z = z2;
                ql5Var3 = ql5Var2;
                tg20VarE = tg20Var;
            }
            return wneVar;
        }
        d = tg20VarE.f33889a;
        z = zK;
        double d4 = d;
        ww6 ww6Var2 = ((c820) D()).d.f32870a.b;
        boolean z6 = tg20VarE.d;
        d2 = tg20VarE.b;
        String str2 = ql5Var3.f;
        if (d2 == 0.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        ww6VarA = ww6.a(ww6Var2, d4, d4, d2, 0.0d, 0.0d, str2, z6, null, !z3, false, 8536);
        p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            c820Var = (c820) value;
            this.f.getClass();
            svj0Var = c820Var.d;
        } while (!p7m0Var.m(value, c820.a(c820Var, null, null, null, svj0.a(svj0Var, ex6.a(svj0Var.f32870a, null, ww6VarA, 1), null, null, 14), null, null, z, false, false, false, null, 8055)));
        b0(d4);
        return Unit.f46060a;
    }

    public final boolean S() {
        ww6 ww6Var = ((c820) D()).d.f32870a.b;
        double d = ww6Var.f39872a;
        if (d == -1.0d) {
            return false;
        }
        return d <= ww6Var.e && ww6Var.d <= d;
    }

    public final void T() {
        G(kb20.f17992a);
        sac.V(jiu0.a(this), new ur6(1, this, dt6.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, this.V.b, new ya(this, null, (byte) 7), 10);
    }

    public final void U(a8q0 a8q0Var) {
        long jE;
        Object value;
        c820 c820Var;
        svj0 svj0Var;
        String strP = twn.p("[^0-9.]", a8q0Var.f440a.b, "");
        a8q0 a8q0Var2 = strP.length() == 0 ? new a8q0("", 0L, 6) : a8q0.b(a8q0Var, strP, 0L, 6);
        j83 j83Var = a8q0Var2.f440a;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(((c820) D()).d.f32870a.b.h.b));
        BigDecimal bigDecimalH = kotlin.text.b.h(j83Var.b);
        byte b = 1;
        boolean z = bigDecimalH != null && !bigDecimal.equals(BigDecimal.ZERO) && bigDecimalH.compareTo(bigDecimal) > 0 && ((c820) D()).d.f32870a.b.h.f29563a;
        String plainString = z ? bigDecimal.toPlainString() : j83Var.b;
        plainString.getClass();
        boolean z2 = plainString.length() > 0 && plainString.charAt(0) == '.';
        if (z2) {
            plainString = "0".concat(plainString);
        } else {
            int iU = StringsKt.U('.', 0, 6, plainString);
            if (iU != -1) {
                int i = iU + 1;
                plainString = ttm0.L(i, plainString).concat(kotlin.text.c.r(plainString.substring(i), Separators.DOT, "", false));
            }
        }
        if (StringsKt.P(plainString, '.')) {
            String strQ0 = StringsKt.q0(plainString, '.');
            String strN0 = StringsKt.n0(plainString, '.');
            if (strQ0.length() > 13) {
                strQ0 = ttm0.L(13, strQ0);
            }
            if (strN0.length() > 2) {
                strN0 = ttm0.L(2, strN0);
            }
            plainString = kng0.l(strQ0, Separators.DOT, strN0);
        } else if (plainString.length() > 13) {
            plainString = ttm0.L(13, plainString);
        }
        if (plainString.length() > 1 && plainString.charAt(0) == '0' && plainString.charAt(1) != '.') {
            plainString = plainString.substring(1);
        }
        if (z && kotlin.text.c.n(plainString, ".0", false)) {
            plainString = ttm0.H(2, plainString);
        }
        if (z || z2) {
            int length = plainString.length();
            jE = s7n0.e(length, length);
        } else {
            jE = a8q0Var2.b;
        }
        a8q0 a8q0VarB = a8q0.b(a8q0Var2, plainString, jE, 4);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            c820Var = (c820) value;
            this.f.getClass();
            svj0Var = c820Var.d;
        } while (!p7m0Var.m(value, c820.a(c820Var, null, null, null, svj0.a(svj0Var, ex6.a(svj0Var.f32870a, a8q0VarB, null, 2), null, null, 14), null, null, false, false, false, false, null, 8183)));
        Double dI = kotlin.text.b.i(a8q0VarB.f440a.b);
        double dDoubleValue = dI != null ? dI.doubleValue() : -1.0d;
        if (dDoubleValue == ((c820) D()).d.f32870a.b.f39872a) {
            return;
        }
        H(new ks6(dDoubleValue, b));
        c0();
    }

    public final void V() {
        pek0 pek0Var = pek0.f26859a;
        ctf0 ctf0Var = this.T;
        G(new rc20(new xdk0(pek0Var, ctf0Var.b.a(R.string.no_connection_title_with_hyphen, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.no_connection_description, Arrays.copyOf(new Object[0], 0)), null, null, null, 120)));
    }

    public final void W(String str) {
        G(new rc20(new xdk0(rek0.b, str, null, null, null, null, 124)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y(ql5 ql5Var, zje zjeVar) {
        bt6 bt6Var;
        if (zjeVar instanceof bt6) {
            bt6Var = (bt6) zjeVar;
            int i = bt6Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                bt6Var.l = i - Integer.MIN_VALUE;
            } else {
                bt6Var = new bt6(this, zjeVar);
            }
        } else {
            bt6Var = new bt6(this, zjeVar);
        }
        Object objA = bt6Var.j;
        wne wneVar = wne.f39444a;
        int i2 = bt6Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            bt6Var.i = ql5Var;
            bt6Var.l = 1;
            objA = this.r.a(bt6Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql5Var = bt6Var.i;
            z1x.P(objA);
        }
        H(new ns6(ql5Var, ((Boolean) objA).booleanValue(), (byte) 0));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object Z(jg7 jg7Var, ql5 ql5Var, zje zjeVar) {
        ct6 ct6Var;
        jg7 jg7Var2;
        final xuf xufVar;
        ql5 ql5Var2 = ql5Var;
        if (zjeVar instanceof ct6) {
            ct6Var = (ct6) zjeVar;
            int i = ct6Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ct6Var.n = i - Integer.MIN_VALUE;
            } else {
                ct6Var = new ct6(this, zjeVar);
            }
        } else {
            ct6Var = new ct6(this, zjeVar);
        }
        Object obj = ct6Var.l;
        wne wneVar = wne.f39444a;
        int i2 = ct6Var.n;
        if (i2 != 0) {
            if (i2 == 1) {
                ql5Var2 = ct6Var.j;
                jg7Var2 = ct6Var.i;
                z1x.P(obj);
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xufVar = ct6Var.k;
                z1x.P(obj);
            }
            final double dDoubleValue = ((Number) obj).doubleValue();
            final boolean zJ = this.H.j();
            H(new Function2() { // from class: a.ps6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    c820 c820Var = (c820) obj3;
                    ((oyg0) obj2).getClass();
                    c820Var.getClass();
                    svj0 svj0Var = c820Var.d;
                    ex6 ex6Var = svj0Var.f32870a;
                    ww6 ww6Var = ex6Var.b;
                    double d = xufVar.i;
                    double d2 = dDoubleValue;
                    return c820.a(c820Var, null, null, null, svj0.a(svj0Var, ex6.a(ex6Var, null, ww6.a(ww6Var, 0.0d, 0.0d, 0.0d, d, d2, null, false, new qz4(d2, zJ), false, false, 16103), 1), null, null, 14), null, null, false, false, false, false, null, 8183);
                }
            });
            return Unit.f46060a;
        }
        z1x.P(obj);
        long j = ql5Var2.e;
        ct6Var.i = jg7Var;
        ct6Var.j = ql5Var2;
        ct6Var.n = 1;
        Object objC = this.s.f20973a.c(j, ct6Var);
        if (objC == wneVar) {
            return wneVar;
        }
        jg7Var2 = jg7Var;
        obj = objC;
        xuf xufVar2 = (xuf) obj;
        double d = ((c820) D()).d.f32870a.b.b;
        ct6Var.i = null;
        ct6Var.j = null;
        ct6Var.k = xufVar2;
        ct6Var.n = 2;
        f7u f7uVar = this.F;
        ieu ieuVar = (ieu) f7uVar.b;
        Object objG = ((dgu) ieuVar.b).g(jg7Var2, ((x1u) f7uVar.c).a(), ql5Var2.f28916a, 95L, d, "", ((vyt) f7uVar.d).a().f8665a, ((drt) f7uVar.e).a(), ((rpt) ieuVar.c).a(), ct6Var);
        if (objG == wneVar) {
            return wneVar;
        }
        xufVar = xufVar2;
        obj = objG;
        final double dDoubleValue2 = ((Number) obj).doubleValue();
        final boolean zJ2 = this.H.j();
        H(new Function2() { // from class: a.ps6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                c820 c820Var = (c820) obj3;
                ((oyg0) obj2).getClass();
                c820Var.getClass();
                svj0 svj0Var = c820Var.d;
                ex6 ex6Var = svj0Var.f32870a;
                ww6 ww6Var = ex6Var.b;
                double d2 = xufVar.i;
                double d3 = dDoubleValue2;
                return c820.a(c820Var, null, null, null, svj0.a(svj0Var, ex6.a(ex6Var, null, ww6.a(ww6Var, 0.0d, 0.0d, 0.0d, d2, d3, null, false, new qz4(d3, zJ2), false, false, 16103), 1), null, null, 14), null, null, false, false, false, false, null, 8183);
            }
        });
        return Unit.f46060a;
    }

    public final void a0(jg7 jg7Var) {
        dzc dzcVar;
        c0d c0dVar;
        dt6 dt6Var = this;
        jg7 jg7Var2 = jg7Var;
        jg7 jg7Var3 = ((c820) dt6Var.D()).m;
        ww20 ww20Var = new ww20(jg7Var2.g);
        String str = jg7Var2.f;
        String str2 = jg7Var3.f;
        double d = jg7Var3.f16467a;
        double d2 = jg7Var2.f16467a;
        if (jg7Var2.d) {
            dzcVar = dzc.d;
        } else if (d == 0.0d || d2 == 0.0d) {
            dzcVar = dzc.f6937a;
        } else if (d > d2) {
            dzcVar = dzc.c;
        } else {
            dzcVar = d < d2 ? dzc.b : dzc.f6937a;
        }
        int iOrdinal = dzcVar.ordinal();
        if (iOrdinal == 0) {
            c0dVar = c0d.f3518a;
        } else if (iOrdinal == 1) {
            c0dVar = c0d.b;
        } else if (iOrdinal == 2) {
            c0dVar = c0d.c;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return;
            }
            c0dVar = c0d.d;
        }
        kur kurVar = new kur(ww20Var, new j43(str, str2, c0dVar, false));
        ctf0 ctf0Var = dt6Var.T;
        String strA = ctf0Var.b.a(R.string.team_first, Arrays.copyOf(new Object[0], 0));
        String strA2 = ctf0Var.b.a(R.string.team_sec, Arrays.copyOf(new Object[0], 0));
        ygp ygpVar = ygp.t;
        r9u r9uVar = dt6Var.X;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        j580 j580Var = new j580(strA, strA2, j1q0Var.f15748a.d(ygpVar));
        p7m0 p7m0Var = dt6Var.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            p7m0 p7m0Var2 = p7m0Var;
            c820 c820Var = (c820) value;
            dt6Var.f.getClass();
            kur kurVar2 = kurVar;
            if (p7m0Var2.m(value, c820.a(c820Var, new my6(c820Var.f3892a.f22590a, j580Var, kurVar), null, null, null, null, null, false, false, false, false, jg7Var2, 4094))) {
                return;
            }
            jg7Var2 = jg7Var;
            p7m0Var = p7m0Var2;
            kurVar = kurVar2;
            dt6Var = this;
        }
    }

    public final void b0(double d) {
        Object value;
        c820 c820Var;
        svj0 svj0Var;
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(d, p3u0.g);
        int length = strC.length();
        a8q0 a8q0Var = new a8q0(strC, s7n0.e(length, length), 4);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            c820Var = (c820) value;
            this.f.getClass();
            svj0Var = c820Var.d;
        } while (!p7m0Var.m(value, c820.a(c820Var, null, null, null, svj0.a(svj0Var, ex6.a(svj0Var.f32870a, a8q0Var, null, 2), null, null, 14), null, null, false, false, false, false, null, 8183)));
    }

    public final void c0() {
        byte b = 1;
        yje yjeVar = null;
        if (!M()) {
            bby bbyVar = this.d0;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            H(new gh5((byte) 27));
            sac.V(jiu0.a(this), new ur6(1, this, dt6.class, "handlePossibleWinThrowable", "handlePossibleWinThrowable(Ljava/lang/Throwable;)V", 0, (byte) 9), null, this.V.b, new ys6(this, yjeVar, b), 10);
            return;
        }
        go7 go7Var = ((c820) D()).b;
        if (!go7Var.equals(do7.f6402a)) {
            if (go7Var.equals(ao7.f1188a)) {
                return;
            }
            t9f.b();
        } else {
            if (S()) {
                i3t0.K(this, null, null, new dm4(this, new ts6((diu0) this, yjeVar, (byte) 0), yjeVar, b), 3);
                return;
            }
            bby bbyVar2 = this.b0;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            bby bbyVar3 = this.d0;
            if (bbyVar3 != null) {
                bbyVar3.cancel(null);
            }
            H(new ls6(this, (byte) 1));
            H(new ls6(this, (byte) 3));
        }
    }

    @Override // a.diu0
    public final void v() {
        this.q.a(bm5.k);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        c820 c820Var;
        double dX;
        Object value3;
        c820 c820Var2;
        go7 go7Var;
        pz40 pz40Var;
        l520 l520Var = (l520) obj;
        l520Var.getClass();
        if (l520Var instanceof l420) {
            String str = ((l420) l520Var).f19384a;
            jfc0 jfc0Var = ((c820) D()).e;
            if (jfc0Var != null && (pz40Var = jfc0Var.f16419a.f1710a) != null) {
                pz40Var.setValue(str);
            }
            H(new g0(str, (byte) 11));
            return;
        }
        if (l520Var.equals(k320.f17598a)) {
            E();
            return;
        }
        if (l520Var.equals(i320.f14077a)) {
            this.O.c("bet_constructor");
            this.Q.i("bet_constructor");
            G(yb20.f42322a);
            return;
        }
        boolean zEquals = l520Var.equals(j520.f15913a);
        byte b = 4;
        yje yjeVar = null;
        cmt cmtVar = this.Y;
        l7k l7kVar = this.R;
        ih5 ih5Var = this.P;
        if (zEquals) {
            ih5Var.f(k7k.BetConstructor);
            y1p y1pVar = y1p.MAIN;
            l7kVar.b("bet_constructor", cmtVar.g());
            i3t0.K(this, null, new ms6(this, (byte) 1), new xg0(this, yjeVar, b), 1);
            return;
        }
        if (l520Var.equals(m320.f21093a)) {
            ih5Var.f(k7k.NoMoneyBetConstructor);
            y1p y1pVar2 = y1p.MAIN;
            l7kVar.b("no_money_bet_constructor", cmtVar.g());
            i3t0.K(this, null, new ms6(this, (byte) 1), new xg0(this, yjeVar, b), 1);
            return;
        }
        boolean z = l520Var instanceof g520;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            int i = ((g520) l520Var).f10697a;
            G(kb20.f17992a);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                c820Var2 = (c820) value3;
                oyg0Var.getClass();
                go7Var = do7.f6402a;
                if (i != 0 && i == 1) {
                    go7Var = ao7.f1188a;
                }
            } while (!p7m0Var.m(value3, c820.a(c820Var2, null, go7Var, null, null, null, null, false, false, false, false, null, 8189)));
            c0();
            return;
        }
        byte b2 = 2;
        byte b3 = 0;
        if (!(l520Var instanceof v420)) {
            if (l520Var.equals(m420.f21146a)) {
                H(new os6((byte) 3));
                T();
                return;
            }
            if (l520Var.equals(w420.f38525a)) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    c820Var = (c820) value2;
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, c820.a(c820Var, null, null, null, null, null, new xtb0(c820Var.d.f32870a.b.f39872a, null, false), false, false, false, false, null, 8159)));
                T();
                return;
            }
            if (l520Var.equals(q320.f28029a)) {
                H(new os6(b2));
                T();
                return;
            } else {
                if (l520Var.equals(e420.f7162a)) {
                    G(nb20.f23220a);
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value = p7m0Var3.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value, c820.a((c820) value, null, null, null, null, null, null, false, false, false, false, null, 8159)));
                    return;
                }
                return;
            }
        }
        v420 v420Var = (v420) l520Var;
        if (v420Var.equals(q420.f28077a)) {
            ww6 ww6Var = ((c820) D()).d.f32870a.b;
            double d = ww6Var.f39872a;
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
            BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(ww6Var.c));
            double dDoubleValue = ww6Var.d;
            BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(dDoubleValue));
            double d2 = ww6Var.e;
            BigDecimal bigDecimal4 = new BigDecimal(String.valueOf(d2));
            if (d == -1.0d) {
                dDoubleValue = ww6Var.b;
            } else {
                BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
                bigDecimalSubtract.getClass();
                if (bigDecimalSubtract.compareTo(bigDecimal3) >= 0) {
                    if (bigDecimal.compareTo(bigDecimal4) > 0) {
                        dDoubleValue = d2;
                    } else {
                        BigDecimal bigDecimalSubtract2 = bigDecimal.subtract(bigDecimal2);
                        bigDecimalSubtract2.getClass();
                        dDoubleValue = bigDecimalSubtract2.doubleValue();
                    }
                }
            }
            b0(dDoubleValue);
            H(new ks6(dDoubleValue, b3));
            c0();
            return;
        }
        if (v420Var.equals(s420.f31584a)) {
            ww6 ww6Var2 = ((c820) D()).d.f32870a.b;
            double d3 = ww6Var2.f39872a;
            if (d3 == -1.0d) {
                boolean z2 = ww6Var2.g;
                dX = ww6Var2.b;
                if (!z2) {
                    dX = X(dX, ww6Var2.c, ww6Var2.e);
                }
            } else {
                dX = X(d3, ww6Var2.c, ww6Var2.e);
            }
            b0(dX);
            H(new ks6(dX, b2));
            c0();
            return;
        }
        if (v420Var instanceof u420) {
            U(((u420) v420Var).f35024a);
            return;
        }
        if (v420Var.equals(r420.f29815a)) {
            H(new os6(b));
            return;
        }
        if (!(v420Var instanceof t420)) {
            t9f.b();
            return;
        }
        float f = ((t420) v420Var).f33298a;
        ww6 ww6Var3 = ((c820) D()).d.f32870a.b;
        double d4 = ww6Var3.e;
        double d5 = ww6Var3.d;
        if (d4 <= d5) {
            return;
        }
        double dB = l1e0.b(BigDecimal.valueOf(((((double) f) / 100.0d) * (d4 - d5)) + d5).setScale(2, RoundingMode.HALF_UP).doubleValue(), ww6Var3.d, ww6Var3.e);
        if (dB == ww6Var3.f39872a) {
            return;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dB);
        String plainString = (bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros()).toPlainString();
        plainString.getClass();
        int length = plainString.length();
        U(new a8q0(plainString, s7n0.e(length, length), 4));
    }
}
