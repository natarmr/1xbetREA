package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;

/* JADX INFO: loaded from: classes4.dex */
public final class ln20 extends i3t0 {
    public static final /* synthetic */ int o0 = 0;
    public final khf0 A;
    public final b8u B;
    public final yk5 C;
    public final hru D;
    public final mne E;
    public final w5z F;
    public final dyt G;
    public final ctf0 H;
    public final pyu I;
    public final q4u J;
    public final trm0 K;
    public final vyt L;
    public final reu M;
    public final ahu N;
    public final zr1 O;
    public final rxu P;
    public final m1e Q;
    public final b8u R;
    public final FinBetInfoModel S;
    public final zlt0 T;
    public final nw20 U;
    public final duj V;
    public final ilt0 W;
    public final mne X;
    public final pru Y;
    public final nou Z;
    public final pyu a0;
    public final u4a b0;
    public final k7u c0;
    public final ih5 d0;
    public final l7k e0;
    public final r9u f0;
    public final m1u g0;
    public final cmt h0;
    public final bm5 i0;
    public bby j0;
    public bby k0;
    public final k050 l0;
    public bby m0;
    public final k820 n0;
    public final ua20 o;
    public final v88 p;
    public final eqx q;
    public final mii0 r;
    public final gg5 s;
    public final ih5 t;
    public final m0u u;
    public final mrt v;
    public final rqt w;
    public final i1w0 x;
    public final rou y;
    public final x0u z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ln20(ua20 ua20Var, v88 v88Var, eqx eqxVar, mii0 mii0Var, gg5 gg5Var, ih5 ih5Var, m0u m0uVar, f6k f6kVar, mrt mrtVar, rqt rqtVar, i1w0 i1w0Var, x4u x4uVar, rou rouVar, x0u x0uVar, khf0 khf0Var, b8u b8uVar, yk5 yk5Var, hru hruVar, mne mneVar, w5z w5zVar, dyt dytVar, ctf0 ctf0Var, pyu pyuVar, q4u q4uVar, trm0 trm0Var, vyt vytVar, reu reuVar, ahu ahuVar, zr1 zr1Var, vzg0 vzg0Var, rxu rxuVar, lbu lbuVar, m1e m1eVar, b8u b8uVar2, v6q v6qVar, FinBetInfoModel finBetInfoModel, zlt0 zlt0Var, nw20 nw20Var, duj dujVar, ilt0 ilt0Var, mne mneVar2, pru pruVar, nou nouVar, iqt iqtVar, kc60 kc60Var, pyu pyuVar2, u4a u4aVar, wyu wyuVar, jtj jtjVar, k7u k7uVar, ih5 ih5Var2, l7k l7kVar, r9u r9uVar, m1u m1uVar, cmt cmtVar) {
        super(new h92((Object) jtjVar, (Object) finBetInfoModel, (Object) wyuVar, (Object) ctf0Var, (Object) reuVar, (Object) iqtVar, (Object) ua20Var, (Object) k7uVar, (byte) 7), cvm0.p(mneVar2.c, mneVar2.f22085a), new k9v((Object) ua20Var, (Object) ctf0Var, (Object) pruVar, (byte) 23), (yzn0) null);
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        yje yjeVar = null;
        this.o = ua20Var;
        this.p = v88Var;
        this.q = eqxVar;
        this.r = mii0Var;
        this.s = gg5Var;
        this.t = ih5Var;
        this.u = m0uVar;
        this.v = mrtVar;
        this.w = rqtVar;
        this.x = i1w0Var;
        this.y = rouVar;
        this.z = x0uVar;
        this.A = khf0Var;
        this.B = b8uVar;
        this.C = yk5Var;
        this.D = hruVar;
        this.E = mneVar;
        this.F = w5zVar;
        this.G = dytVar;
        this.H = ctf0Var;
        this.I = pyuVar;
        this.J = q4uVar;
        this.K = trm0Var;
        this.L = vytVar;
        this.M = reuVar;
        this.N = ahuVar;
        this.O = zr1Var;
        this.P = rxuVar;
        this.Q = m1eVar;
        this.R = b8uVar2;
        this.S = finBetInfoModel;
        this.T = zlt0Var;
        this.U = nw20Var;
        this.V = dujVar;
        this.W = ilt0Var;
        this.X = mneVar2;
        this.Y = pruVar;
        this.Z = nouVar;
        this.a0 = pyuVar2;
        this.b0 = u4aVar;
        this.c0 = k7uVar;
        this.d0 = ih5Var2;
        this.e0 = l7kVar;
        this.f0 = r9uVar;
        this.g0 = m1uVar;
        this.h0 = cmtVar;
        bm5 bm5Var = bm5.m;
        this.i0 = bm5Var;
        this.l0 = new k050();
        this.n0 = new k820(mii0Var, zr1Var, dujVar, new mh20(this, (byte) 4));
        final byte b = 2;
        sac.T(new fnq(new fc4(new i89(v6qVar.f36888a.d.c, (byte) 22), (byte) 6), new tk20(this, yjeVar, b), (byte) 4), jiu0.a(this), bm20.h);
        f6kVar.a(bm5Var);
        sac.T(new fnq(finBetInfoModel.k ? x4uVar.a(wbq.f38891a) : x4uVar.a(wbq.b), new khx((Object) finBetInfoModel, (Object) this, yjeVar, (byte) 13), (byte) 4), jiu0.a(this), new yl20(this, yjeVar, 0 == true ? 1 : 0));
        sac.T(new fnq(kc60Var.a(), new yl20(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new yl20(this, yjeVar, b));
        final boolean z = pruVar.a().l.g && !lbuVar.j();
        b = z ? (byte) 2 : (byte) 1;
        final boolean z2 = ((sg20) D()).k != b;
        H(new Function2() { // from class: a.kh20
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                sg20 sg20Var = (sg20) obj2;
                ((oyg0) obj).getClass();
                sg20Var.getClass();
                return sg20.a(sg20Var, null, null, z2 ? bo7.f2918a : sg20Var.d, null, ifc0.a(sg20Var.f, null, null, false, false, false, z, 63), false, false, false, b, 983);
            }
        });
    }

    public static bzc O(double d, double d2) {
        if (d2 == 0.0d) {
            return bzc.f3459a;
        }
        if (d == d2 || d == 0.0d) {
            return bzc.d;
        }
        if (d > d2) {
            return bzc.c;
        }
        return d < d2 ? bzc.b : bzc.f3459a;
    }

    public static double Y(double d, double d2, double d3) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(d2));
        BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(d3));
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal2);
        bigDecimalAdd.getClass();
        return bigDecimalAdd.compareTo(bigDecimal3) > 0 ? d3 : bigDecimalAdd.doubleValue();
    }

    public final boolean M() {
        nwo0 nwo0VarC = this.M.c();
        if (nwo0VarC.f24244a) {
            return true;
        }
        return ((sg20) D()).h && nwo0VarC.b && ((ovo0) this.a0.f27815a).f25934a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object N(double d, double d2, String str, p0z p0zVar, zje zjeVar) throws Throwable {
        ij20 ij20Var;
        double d3;
        String str2;
        p0z p0zVar2;
        double d4;
        String strE;
        double d5;
        if (zjeVar instanceof ij20) {
            ij20Var = (ij20) zjeVar;
            int i = ij20Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ij20Var.o = i - Integer.MIN_VALUE;
            } else {
                ij20Var = new ij20(this, zjeVar);
            }
        } else {
            ij20Var = new ij20(this, zjeVar);
        }
        ij20 ij20Var2 = ij20Var;
        Object obj = ij20Var2.m;
        Object obj2 = wne.f39444a;
        int i2 = ij20Var2.o;
        if (i2 == 0) {
            z1x.P(obj);
            ij20Var2.k = str;
            ij20Var2.l = p0zVar;
            ij20Var2.i = d;
            ij20Var2.j = d2;
            ij20Var2.o = 1;
            Object objQ = Q(d, d2, ij20Var2);
            if (objQ == obj2) {
                return obj2;
            }
            d3 = d2;
            obj = objQ;
            str2 = str;
            p0zVar2 = p0zVar;
            d4 = d;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d3 = ij20Var2.j;
            d4 = ij20Var2.i;
            p0zVar2 = ij20Var2.l;
            str2 = ij20Var2.k;
            z1x.P(obj);
        }
        hxu hxuVar = (hxu) obj;
        duw duwVarB = this.B.b();
        double d6 = d4 * d3;
        int i3 = duwVarB.f6716a;
        double d7 = duwVarB.b;
        double d8 = duwVarB.c;
        this.C.getClass();
        txu txuVarH0 = ozb.h0(hxuVar, yk5.i(d6, i3, d7, d8), duwVarB.f6716a);
        ivo0 ivo0Var = txuVarH0.g;
        Object objR = (ivo0Var.b > 0.0d || txuVarH0.d.b > 0.0d || txuVarH0.f34720a.b > 0.0d) ? rsm0.r(txuVarH0, str2, this.H) : iun.f15405a;
        if (d3 > 0.0d) {
            str2.getClass();
            int i4 = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            hxu hxuVar2 = hxu.h;
            if (hxuVar.equals(hxuVar2) || ivo0Var.b <= 0.0d) {
                d5 = !hxuVar.equals(hxuVar2) ? hxuVar.f.b : d6;
            } else {
                d5 = txuVarH0.f.b;
            }
            strE = cy7.e(pn40.p(str2, d5));
        } else {
            strE = "";
        }
        bby bbyVar = this.m0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        p0zVar2.F(txuVarH0, objR, strE);
        return Unit.f46060a;
    }

    public final String P() {
        boolean zM = M();
        ctf0 ctf0Var = this.H;
        ctf0Var.getClass();
        return ctf0Var.f(zM ? R.string.summary_possible_win : R.string.history_possible_win, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0100  */
    /* JADX WARN: Code duplicated, block: B:36:0x0126 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object Q(double d, double d2, zje zjeVar) throws Throwable {
        zj20 zj20Var;
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
        if (zjeVar instanceof zj20) {
            zj20Var = (zj20) zjeVar;
            int i2 = zj20Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zj20Var.s = i2 - Integer.MIN_VALUE;
            } else {
                zj20Var = new zj20(this, zjeVar);
            }
        } else {
            zj20Var = new zj20(this, zjeVar);
        }
        Object objG = zj20Var.q;
        wne wneVar = wne.f39444a;
        int i3 = zj20Var.s;
        if (i3 == 0) {
            z1x.P(objG);
            bm5 bm5Var = bm5.b;
            hru hruVar4 = this.D;
            zj20Var.m = hruVar4;
            zj20Var.i = d11;
            zj20Var.j = d12;
            zj20Var.k = d11;
            zj20Var.l = d12;
            zj20Var.s = 1;
            objG = khf0.G(this.A, bm5Var, zj20Var);
            if (objG != wneVar) {
                d3 = d11;
                hruVar = hruVar4;
                d4 = d12;
            }
            return wneVar;
        }
        if (i3 == 1) {
            double d13 = zj20Var.l;
            double d14 = zj20Var.k;
            d4 = zj20Var.j;
            d3 = zj20Var.i;
            hruVar = zj20Var.m;
            z1x.P(objG);
            d12 = d13;
            d11 = d14;
        } else {
            if (i3 == 2) {
                j = zj20Var.o;
                d12 = zj20Var.l;
                d5 = zj20Var.k;
                d6 = zj20Var.j;
                double d15 = zj20Var.i;
                qvo0Var = zj20Var.n;
                hru hruVar5 = zj20Var.m;
                z1x.P(objG);
                hruVar2 = hruVar5;
                d3 = d15;
                iIntValue = ((Number) objG).intValue();
                zj20Var.m = hruVar2;
                zj20Var.n = qvo0Var;
                zj20Var.i = d3;
                zj20Var.j = d6;
                zj20Var.k = d5;
                zj20Var.l = d12;
                zj20Var.o = j;
                zj20Var.p = iIntValue;
                j2 = j;
                zj20Var.s = 3;
                objA = this.y.a(false, zj20Var);
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
            int i4 = zj20Var.p;
            long j4 = zj20Var.o;
            double d16 = zj20Var.l;
            double d17 = zj20Var.k;
            double d18 = zj20Var.j;
            double d19 = zj20Var.i;
            qvo0 qvo0Var3 = zj20Var.n;
            hru hruVar6 = zj20Var.m;
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
        zj20Var.m = null;
        zj20Var.n = null;
        zj20Var.i = d7;
        zj20Var.j = d10;
        zj20Var.s = 4;
        serializableC = hruVar3.c(d9, d8, i, i5, j3, zj20Var, qvo0Var2);
        if (serializableC == wneVar) {
            return wneVar;
        }
        return serializableC;
        long j5 = ((ql5) objG).e;
        qvo0 qvo0Var4 = qvo0.b;
        zj20Var.m = hruVar;
        zj20Var.n = qvo0Var4;
        zj20Var.i = d3;
        zj20Var.j = d4;
        zj20Var.k = d11;
        zj20Var.l = d12;
        zj20Var.o = j5;
        zj20Var.s = 2;
        Object objC = this.z.c(zj20Var);
        if (objC != wneVar) {
            double d20 = d4;
            qvo0Var = qvo0Var4;
            objG = objC;
            hruVar2 = hruVar;
            d5 = d11;
            j = j5;
            d6 = d20;
            iIntValue = ((Number) objG).intValue();
            zj20Var.m = hruVar2;
            zj20Var.n = qvo0Var;
            zj20Var.i = d3;
            zj20Var.j = d6;
            zj20Var.k = d5;
            zj20Var.l = d12;
            zj20Var.o = j;
            zj20Var.p = iIntValue;
            j2 = j;
            zj20Var.s = 3;
            objA = this.y.a(false, zj20Var);
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
                zj20Var.m = null;
                zj20Var.n = null;
                zj20Var.i = d7;
                zj20Var.j = d10;
                zj20Var.s = 4;
                serializableC = hruVar3.c(d9, d8, i, i6, j3, zj20Var, qvo0Var2);
                if (serializableC == wneVar) {
                    return wneVar;
                }
                return serializableC;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object R(ql5 ql5Var, zje zjeVar) {
        ok20 ok20Var;
        ql5 ql5Var2;
        double d;
        if (zjeVar instanceof ok20) {
            ok20Var = (ok20) zjeVar;
            int i = ok20Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ok20Var.m = i - Integer.MIN_VALUE;
            } else {
                ok20Var = new ok20(this, zjeVar);
            }
        } else {
            ok20Var = new ok20(this, zjeVar);
        }
        Object objC = ok20Var.k;
        Object obj = wne.f39444a;
        int i2 = ok20Var.m;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(objC);
            long j = ql5Var.e;
            ok20Var.i = ql5Var;
            ok20Var.m = 1;
            objC = this.u.f20973a.c(j, ok20Var);
            if (objC != obj) {
                ql5Var2 = ql5Var;
            }
            return obj;
        }
        if (i2 == 1) {
            ql5Var2 = ok20Var.i;
            z1x.P(objC);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d2 = ok20Var.j;
            ql5Var2 = ok20Var.i;
            z1x.P(objC);
            d = d2;
        }
        ql5 ql5Var3 = ql5Var2;
        sac.V(jiu0.a(this), new mh20(this, b), null, this.E.b, new yk20(this, ql5Var3, d, null), 10);
        return Unit.f46060a;
        double d3 = ((xuf) objC).i;
        ok20Var.i = ql5Var2;
        ok20Var.j = d3;
        ok20Var.m = 2;
        if (Z(ql5Var2, ok20Var) != obj) {
            d = d3;
            ql5 ql5Var4 = ql5Var2;
            sac.V(jiu0.a(this), new mh20(this, b), null, this.E.b, new yk20(this, ql5Var4, d, null), 10);
            return Unit.f46060a;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final Object S(ql5 ql5Var, zje zjeVar) {
        qk20 qk20Var;
        if (zjeVar instanceof qk20) {
            qk20Var = (qk20) zjeVar;
            int i = qk20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qk20Var.k = i - Integer.MIN_VALUE;
            } else {
                qk20Var = new qk20(this, zjeVar);
            }
        } else {
            qk20Var = new qk20(this, zjeVar);
        }
        Object obj = qk20Var.i;
        wne wneVar = wne.f39444a;
        int i2 = qk20Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                qk20Var.k = 1;
                Object objR = R(ql5Var, qk20Var);
                this = objR;
                if (objR == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this = this;
            }
        } catch (Throwable th) {
            this.V.a(th);
        }
        return Unit.f46060a;
    }

    public final boolean T() {
        uw6 uw6Var = ((sg20) D()).e.f29389a.b;
        double d = uw6Var.f36378a;
        if (d != -1.0d && d >= uw6Var.d) {
            return d <= 9.99999999999999E12d || uw6Var.f;
        }
        return false;
    }

    public final void U(boolean z, ni20 ni20Var) {
        G(ib20.f14466a);
        this.j0 = sac.V(jiu0.a(this), new mh20(this, (byte) 3), null, this.E.b, new b2b(this, ni20Var, z, (yje) null), 10);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r14.U.m(r5, (a.ql5) r2, r8, r9) == r10) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(a.yh7 r15, a.ql5 r16, a.zje r17) {
        /*
            r14 = this;
            r1 = r16
            r2 = r17
            boolean r3 = r2 instanceof a.hm20
            if (r3 == 0) goto L18
            r3 = r2
            a.hm20 r3 = (a.hm20) r3
            int r4 = r3.m
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.m = r4
        L16:
            r9 = r3
            goto L1e
        L18:
            a.hm20 r3 = new a.hm20
            r3.<init>(r14, r2)
            goto L16
        L1e:
            java.lang.Object r2 = r9.k
            a.wne r10 = a.wne.f39444a
            int r3 = r9.m
            r7 = 2
            r8 = 1
            r11 = 0
            if (r3 == 0) goto L42
            if (r3 == r8) goto L37
            if (r3 != r7) goto L31
            a.z1x.P(r2)
            goto L92
        L31:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r14)
            return r11
        L37:
            a.ql5 r0 = r9.j
            a.yh7 r1 = r9.i
            a.z1x.P(r2)
            r13 = r1
            r1 = r0
            r0 = r13
            goto L77
        L42:
            a.z1x.P(r2)
            long r2 = r1.f28916a
            double r4 = r15.f42624a
            a.ilt0 r6 = r14.W
            r6.a(r4, r2)
            a.bm5 r12 = a.bm5.m
            double r2 = r15.f42624a
            r5 = 0
            r6 = 8189(0x1ffd, float:1.1475E-41)
            r4 = 0
            a.ql5 r2 = a.ql5.a(r1, r2, r4, r5, r6)
            a.trm0 r3 = r14.K
            r3.l(r12, r2)
            a.zlt0 r2 = r14.T
            boolean r2 = r2.n()
            if (r2 == 0) goto L95
            r9.i = r15
            r9.j = r1
            r9.m = r8
            a.ahu r2 = r14.N
            java.io.Serializable r2 = r2.b(r12, r9)
            if (r2 != r10) goto L76
            goto L91
        L76:
            r0 = r15
        L77:
            a.ql5 r2 = (a.ql5) r2
            long r5 = r1.f28916a
            long r0 = r0.b
            long[] r8 = new long[r8]
            r3 = 0
            r8[r3] = r0
            r9.i = r11
            r9.j = r11
            r9.m = r7
            a.nw20 r4 = r14.U
            r7 = r2
            java.lang.Object r14 = r4.m(r5, r7, r8, r9)
            if (r14 != r10) goto L92
        L91:
            return r10
        L92:
            kotlin.Unit r14 = kotlin.Unit.f46060a
            return r14
        L95:
            kotlin.Unit r14 = kotlin.Unit.f46060a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ln20.V(a.yh7, a.ql5, a.zje):java.lang.Object");
    }

    public final void W(a8q0 a8q0Var) {
        long jE;
        Object value;
        sg20 sg20Var;
        qvj0 qvj0Var;
        String strP = twn.p("[^0-9.]", a8q0Var.f440a.b, "");
        a8q0 a8q0Var2 = strP.length() == 0 ? new a8q0("", 0L, 6) : a8q0.b(a8q0Var, strP, 0L, 6);
        String strConcat = a8q0Var2.f440a.b;
        boolean z = strConcat.length() > 0 && strConcat.charAt(0) == '.';
        if (z) {
            strConcat = "0".concat(strConcat);
        } else {
            int iU = StringsKt.U('.', 0, 6, strConcat);
            if (iU != -1) {
                int i = iU + 1;
                strConcat = ttm0.L(i, strConcat).concat(kotlin.text.c.r(strConcat.substring(i), Separators.DOT, "", false));
            }
        }
        if (StringsKt.P(strConcat, '.')) {
            String strQ0 = StringsKt.q0(strConcat, '.');
            String strN0 = StringsKt.n0(strConcat, '.');
            if (strQ0.length() > 13) {
                strQ0 = ttm0.L(13, strQ0);
            }
            if (strN0.length() > 2) {
                strN0 = ttm0.L(2, strN0);
            }
            strConcat = kng0.l(strQ0, Separators.DOT, strN0);
        } else if (strConcat.length() > 13) {
            strConcat = ttm0.L(13, strConcat);
        }
        if (strConcat.length() > 1 && strConcat.charAt(0) == '0' && strConcat.charAt(1) != '.') {
            strConcat = strConcat.substring(1);
        }
        if (z) {
            int length = strConcat.length();
            jE = s7n0.e(length, length);
        } else {
            jE = a8q0Var2.b;
        }
        a8q0 a8q0VarB = a8q0.b(a8q0Var2, strConcat, jE, 4);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            sg20Var = (sg20) value;
            this.f.getClass();
            qvj0Var = sg20Var.e;
        } while (!p7m0Var.m(value, sg20.a(sg20Var, null, null, null, qvj0.a(qvj0Var, cx6.a(qvj0Var.f29389a, a8q0VarB, null, 2), null, null, null, 30), null, false, false, false, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS)));
        Double dI = kotlin.text.b.i(a8q0VarB.f440a.b);
        H(new ks6(dI != null ? dI.doubleValue() : -1.0d, (byte) 9));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X(yh7 yh7Var, zje zjeVar) {
        tm20 tm20Var;
        String str;
        if (zjeVar instanceof tm20) {
            tm20Var = (tm20) zjeVar;
            int i = tm20Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                tm20Var.o = i - Integer.MIN_VALUE;
            } else {
                tm20Var = new tm20(this, zjeVar);
            }
        } else {
            tm20Var = new tm20(this, zjeVar);
        }
        Object obj = tm20Var.m;
        wne wneVar = wne.f39444a;
        int i2 = tm20Var.o;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(obj);
            ygp ygpVar = ygp.Z;
            r9u r9uVar = this.f0;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            if (j1q0Var.f15748a.d(ygpVar)) {
                qjj.W(jiu0.a(this), null, null, new b2b(this, yh7Var, (yje) null), 3);
            } else {
                String strValueOf = String.valueOf(yh7Var.b);
                tm20Var.i = yh7Var;
                tm20Var.j = this;
                tm20Var.k = strValueOf;
                tm20Var.l = true;
                tm20Var.o = 1;
                Serializable serializableA = this.Z.a(tl5.c, tm20Var);
                if (serializableA == wneVar) {
                    return wneVar;
                }
                str = strValueOf;
                obj = serializableA;
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = tm20Var.l;
        String str2 = tm20Var.k;
        ln20 ln20Var = tm20Var.j;
        yh7 yh7Var2 = tm20Var.i;
        z1x.P(obj);
        str = str2;
        this = ln20Var;
        yh7Var = yh7Var2;
        this.G(new sc20(z, str, ((ql5) obj).f28916a, "", 0.0d, yh7Var.d, "", "", false));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z(ql5 ql5Var, zje zjeVar) {
        xm20 xm20Var;
        ql5 ql5Var2;
        int i;
        if (zjeVar instanceof xm20) {
            xm20Var = (xm20) zjeVar;
            int i2 = xm20Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xm20Var.m = i2 - Integer.MIN_VALUE;
            } else {
                xm20Var = new xm20(this, zjeVar);
            }
        } else {
            xm20Var = new xm20(this, zjeVar);
        }
        Object objA = xm20Var.k;
        wne wneVar = wne.f39444a;
        int i3 = xm20Var.m;
        boolean z = false;
        if (i3 == 0) {
            z1x.P(objA);
            xm20Var.i = ql5Var;
            xm20Var.m = 1;
            objA = this.v.a(xm20Var);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i3 == 1) {
            ql5Var = xm20Var.i;
            z1x.P(objA);
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = xm20Var.j;
            ql5Var2 = xm20Var.i;
            z1x.P(objA);
        }
        if (((Boolean) objA).booleanValue() && i != 0) {
            z = true;
        }
        H(new ns6(ql5Var2, z, (byte) 3));
        return Unit.f46060a;
        int i4 = (this.q.f8256a.c() && ((Boolean) objA).booleanValue()) ? 1 : 0;
        xm20Var.i = ql5Var;
        xm20Var.j = i4;
        xm20Var.m = 2;
        Object objA2 = this.b0.a(xm20Var);
        if (objA2 != wneVar) {
            ql5Var2 = ql5Var;
            i = i4;
            objA = objA2;
            if (((Boolean) objA).booleanValue()) {
                z = true;
            }
            H(new ns6(ql5Var2, z, (byte) 3));
            return Unit.f46060a;
        }
        return wneVar;
    }

    public final void a0() {
        String strE;
        Object value;
        sg20 sg20Var;
        qvj0 qvj0Var;
        eo7 eo7Var = ((sg20) D()).d;
        if (!eo7Var.equals(bo7.f2918a)) {
            if (eo7Var.equals(yn7.f42924a)) {
                return;
            }
            t9f.b();
            return;
        }
        double d = ((sg20) D()).e.f29389a.b.f36378a;
        double d2 = ((sg20) D()).e.d.f5262a;
        String str = ((sg20) D()).e.f29389a.b.e;
        if (!T() || d2 == 0.0d) {
            strE = "";
        } else {
            double d3 = d * d2;
            int i = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            strE = cy7.e(pn40.p(str, d3));
        }
        String str2 = strE;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            sg20Var = (sg20) value;
            this.f.getClass();
            qvj0Var = sg20Var.e;
        } while (!p7m0Var.m(value, sg20.a(sg20Var, null, null, null, qvj0.a(qvj0Var, null, lnb0.a(qvj0Var.b, true, null, str2, 2), null, null, 29), null, false, false, false, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS)));
    }

    public final void b0(double d) {
        Object value;
        sg20 sg20Var;
        qvj0 qvj0Var;
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(d, p3u0.g);
        int length = strC.length();
        a8q0 a8q0Var = new a8q0(strC, s7n0.e(length, length), 4);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            sg20Var = (sg20) value;
            this.f.getClass();
            qvj0Var = sg20Var.e;
        } while (!p7m0Var.m(value, sg20.a(sg20Var, null, null, null, qvj0.a(qvj0Var, cx6.a(qvj0Var.f29389a, a8q0Var, null, 2), null, null, null, 30), null, false, false, false, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS)));
    }

    public final void c0() {
        byte b = 0;
        if (this.o != ua20.FULLSCREEN_SLIDER) {
            H(new eh20(this, b));
            a0();
            return;
        }
        byte b2 = 1;
        yje yjeVar = null;
        if (!M() && Intrinsics.d(this.B.b(), duw.d)) {
            bby bbyVar = this.m0;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            H(new fd20(b2));
            a0();
            return;
        }
        eo7 eo7Var = ((sg20) D()).d;
        if (!eo7Var.equals(bo7.f2918a)) {
            if (eo7Var.equals(yn7.f42924a)) {
                return;
            }
            t9f.b();
        } else {
            if (T()) {
                i3t0.K(this, null, null, new dm4(this, new tk20(this, yjeVar, b), yjeVar, (byte) 3), 3);
                return;
            }
            bby bbyVar2 = this.k0;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            bby bbyVar3 = this.m0;
            if (bbyVar3 != null) {
                bbyVar3.cancel(null);
            }
            H(new eh20(this, b2));
            H(new eh20(this, (byte) 4));
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        sg20 sg20Var;
        double dY;
        l520 l520Var = (l520) obj;
        l520Var.getClass();
        super.x(l520Var);
        byte b = 2;
        byte b2 = 11;
        byte b3 = 0;
        if (l520Var instanceof v420) {
            v420 v420Var = (v420) l520Var;
            byte b4 = 4;
            double dDoubleValue = 9.99999999999999E12d;
            if (v420Var.equals(q420.f28077a)) {
                uw6 uw6Var = ((sg20) D()).e.f29389a.b;
                double d = uw6Var.f36378a;
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
                BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(uw6Var.c));
                double d2 = uw6Var.d;
                BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(d2));
                BigDecimal bigDecimal4 = new BigDecimal(String.valueOf(9.99999999999999E12d));
                if (d == -1.0d) {
                    dDoubleValue = uw6Var.b;
                } else {
                    BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
                    bigDecimalSubtract.getClass();
                    if (bigDecimalSubtract.compareTo(bigDecimal3) < 0) {
                        dDoubleValue = d2;
                    } else if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                        BigDecimal bigDecimalSubtract2 = bigDecimal.subtract(bigDecimal2);
                        bigDecimalSubtract2.getClass();
                        dDoubleValue = bigDecimalSubtract2.doubleValue();
                    }
                }
                b0(dDoubleValue);
                H(new ks6(dDoubleValue, b4));
                c0();
                return;
            }
            if (v420Var.equals(s420.f31584a)) {
                uw6 uw6Var2 = ((sg20) D()).e.f29389a.b;
                double d3 = uw6Var2.f36378a;
                if (d3 == -1.0d) {
                    boolean z = uw6Var2.g;
                    dY = uw6Var2.b;
                    if (!z) {
                        dY = Y(dY, uw6Var2.c, 9.99999999999999E12d);
                    }
                } else {
                    dY = Y(d3, uw6Var2.c, 9.99999999999999E12d);
                }
                b0(dY);
                H(new ks6(dY, b2));
                c0();
                return;
            }
            if (v420Var instanceof u420) {
                W(((u420) v420Var).f35024a);
                c0();
                return;
            }
            if (v420Var.equals(r420.f29815a)) {
                H(new fd20((byte) 8));
                return;
            }
            if (!(v420Var instanceof t420)) {
                t9f.b();
                return;
            }
            float f = ((t420) v420Var).f33298a;
            uw6 uw6Var3 = ((sg20) D()).e.f29389a.b;
            double d4 = uw6Var3.d;
            if (9.99999999999999E12d > d4) {
                BigDecimal scale = new BigDecimal(((((double) f) / 100.0d) * (9.99999999999999E12d - d4)) + d4).setScale(2, RoundingMode.HALF_UP);
                scale.getClass();
                double dB = l1e0.b(scale.doubleValue(), uw6Var3.d, 9.99999999999999E12d);
                if (dB != uw6Var3.f36378a) {
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dB);
                    String plainString = (bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros()).toPlainString();
                    plainString.getClass();
                    int length = plainString.length();
                    W(new a8q0(plainString, s7n0.e(length, length), 4));
                }
            }
            c0();
            return;
        }
        boolean z2 = l520Var instanceof k420;
        yje yjeVar = null;
        mne mneVar = this.E;
        if (z2) {
            sac.V(jiu0.a(this), im20.f15006a, null, mneVar.b, new xr10(this, ((k420) l520Var).f17648a, yjeVar, b2), 10);
            return;
        }
        if (l520Var instanceof l420) {
            String str = ((l420) l520Var).f19384a;
            ((sg20) D()).f.f14680a.f1710a.setValue(str);
            H(new s5h(b, str, ((sg20) D()).f.f));
            return;
        }
        if (l520Var.equals(c520.f3751a)) {
            sac.V(jiu0.a(this), new r520((byte) 12), null, mneVar.b, new nm20(this, yjeVar, b3), 10);
            return;
        }
        boolean z3 = l520Var instanceof g520;
        yn7 yn7Var = yn7.f42924a;
        bo7 bo7Var = bo7.f2918a;
        if (z3) {
            int i = ((g520) l520Var).f10697a;
            G(ib20.f14466a);
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                sg20Var = (sg20) value;
                this.f.getClass();
            } while (!p7m0Var.m(value, sg20.a(sg20Var, null, null, (i == 0 || i != 1) ? bo7Var : yn7Var, null, null, false, false, false, 0, 2039)));
            c0();
            return;
        }
        if (l520Var.equals(w420.f38525a)) {
            bby bbyVar = this.j0;
            if (bbyVar == null || !bbyVar.isActive()) {
                U(false, ni20.f23563a);
                return;
            }
            return;
        }
        if (l520Var.equals(m420.f21146a)) {
            U(false, ni20.b);
            return;
        }
        boolean zEquals = l520Var.equals(j520.f15913a);
        v88 v88Var = this.p;
        mii0 mii0Var = this.r;
        i1w0 i1w0Var = this.x;
        cmt cmtVar = this.h0;
        l7k l7kVar = this.e0;
        ih5 ih5Var = this.d0;
        if (zEquals) {
            ih5Var.f(k7k.FinBet);
            y1p y1pVar = y1p.MAIN;
            l7kVar.b("fin_bet", cmtVar.g());
            ql5 ql5Var = ((sg20) D()).c.c;
            ((kt2) mii0Var.b).c("ev_place_bet_deposit");
            v88Var.a(i1w0Var, true, ql5Var.f28916a);
            return;
        }
        if (l520Var.equals(m320.f21093a)) {
            ih5Var.f(k7k.NoMoneyFinBet);
            y1p y1pVar2 = y1p.MAIN;
            l7kVar.b("no_money_fin_bet", cmtVar.g());
            ql5 ql5Var2 = ((sg20) D()).c.c;
            ((kt2) mii0Var.b).c("ev_place_bet_deposit");
            v88Var.a(i1w0Var, true, ql5Var2.f28916a);
            return;
        }
        if (l520Var.equals(i320.f14077a)) {
            this.t.c("fin_bet");
            this.s.i("fin_bet");
            G(new pb20(this.i0));
            return;
        }
        if (l520Var.equals(i420.f14125a)) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (!l520Var.equals(p420.f26329a)) {
                if (!l520Var.equals(q320.f28029a)) {
                    if (l520Var.equals(k320.f17598a)) {
                        E();
                        return;
                    }
                    return;
                }
                eo7 eo7Var = ((sg20) D()).d;
                if (!eo7Var.equals(bo7Var)) {
                    if (eo7Var.equals(yn7Var)) {
                        U(true, ni20.b);
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                bby bbyVar2 = this.j0;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    U(true, ni20.f23563a);
                    return;
                }
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, o0w0.f24450a)), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
