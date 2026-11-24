package a;

import android.view.View;
import android.view.ViewParent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetPlayerZip;
import org.xplatform.betting.core.zip.model.zip.EventParams;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k7n0 {
    public static final long A(int i, jge0 jge0Var, jge0 jge0Var2) {
        float f;
        float f2;
        float fZ;
        float f3;
        float f4;
        if (i == 3) {
            f = jge0Var.f16474a;
            f2 = jge0Var2.c;
        } else if (i == 4) {
            f = jge0Var2.f16474a;
            f2 = jge0Var.c;
        } else if (i == 5) {
            f = jge0Var.b;
            f2 = jge0Var2.d;
        } else {
            if (i != 6) {
                jf4.n("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = jge0Var2.b;
            f2 = jge0Var.d;
        }
        float f5 = f - f2;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        long j = (long) f5;
        if (i == 3 || i == 4) {
            float f6 = jge0Var.b;
            fZ = rw2.z(jge0Var.d, f6, 2.0f, f6);
            f3 = jge0Var2.b;
            f4 = jge0Var2.d;
        } else {
            if (i != 5 && i != 6) {
                jf4.n("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f7 = jge0Var.f16474a;
            fZ = rw2.z(jge0Var.c, f7, 2.0f, f7);
            f3 = jge0Var2.f16474a;
            f4 = jge0Var2.c;
        }
        long j2 = (long) (fZ - (((f4 - f3) / 2.0f) + f3));
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean B(int i, f8m f8mVar, nqq nqqVar, jge0 jge0Var) {
        nqq nqqVarS;
        xz40 xz40Var = new xz40(new nqq[16]);
        if (!nqqVar.f20279a.n) {
            xcx.b("visitChildren called on an unattached node");
        }
        xz40 xz40Var2 = new xz40(new lm40[16]);
        lm40 lm40Var = nqqVar.f20279a;
        lm40 lm40Var2 = lm40Var.f;
        if (lm40Var2 == null) {
            vcc.v(xz40Var2, lm40Var);
        } else {
            xz40Var2.b(lm40Var2);
        }
        while (true) {
            int i2 = xz40Var2.c;
            if (i2 == 0) {
                break;
            }
            lm40 lm40VarV = (lm40) xz40Var2.k(i2 - 1);
            if ((lm40VarV.d & 1024) == 0) {
                vcc.v(xz40Var2, lm40VarV);
            } else {
                while (lm40VarV != null) {
                    if ((lm40VarV.c & 1024) != 0) {
                        xz40 xz40Var3 = null;
                        while (lm40VarV != null) {
                            if (lm40VarV instanceof nqq) {
                                nqq nqqVar2 = (nqq) lm40VarV;
                                if (nqqVar2.n) {
                                    xz40Var.b(nqqVar2);
                                }
                            } else if ((lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                                int i3 = 0;
                                for (lm40 lm40Var3 = ((f3k) lm40VarV).p; lm40Var3 != null; lm40Var3 = lm40Var3.f) {
                                    if ((lm40Var3.c & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            lm40VarV = lm40Var3;
                                        } else {
                                            if (xz40Var3 == null) {
                                                xz40Var3 = new xz40(new lm40[16]);
                                            }
                                            if (lm40VarV != null) {
                                                xz40Var3.b(lm40VarV);
                                                lm40VarV = null;
                                            }
                                            xz40Var3.b(lm40Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            lm40VarV = vcc.V(xz40Var3);
                        }
                        break;
                    }
                    lm40VarV = lm40VarV.f;
                }
            }
        }
        while (xz40Var.c != 0 && (nqqVarS = s(xz40Var, jge0Var, i)) != null) {
            if (nqqVarS.b1().f1309a) {
                return ((Boolean) f8mVar.invoke(nqqVarS)).booleanValue();
            }
            if (u(i, f8mVar, nqqVarS, jge0Var)) {
                return true;
            }
            xz40Var.j(nqqVarS);
        }
        return false;
    }

    public static final v9s C(j7n0 j7n0Var, long j, Integer num, long j2, Boolean bool, Long l) {
        BigDecimal bigDecimalH;
        String strValueOf;
        Long l2;
        j7n0Var.getClass();
        g7n0 g7n0Var = j7n0Var.c;
        Double d = j7n0Var.d;
        long jLongValue = (g7n0Var == null || (l2 = g7n0Var.f10825a) == null) ? 0L : l2.longValue();
        String str = g7n0Var != null ? g7n0Var.b : null;
        if (str == null) {
            str = "";
        }
        BetPlayerZip betPlayerZip = new BetPlayerZip(jLongValue, str);
        Long l3 = j7n0Var.f16050a;
        long jLongValue2 = l3 != null ? l3.longValue() : 0L;
        Double d2 = j7n0Var.e;
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        double dDoubleValue2 = d != null ? d.doubleValue() : 0.0d;
        if (d == null || (strValueOf = String.valueOf(d.doubleValue())) == null || (bigDecimalH = kotlin.text.b.h(strValueOf)) == null) {
            bigDecimalH = BigDecimal.ZERO;
            bigDecimalH.getClass();
        }
        boolean zD = Intrinsics.d(j7n0Var.b, Boolean.TRUE);
        String str2 = j7n0Var.f;
        tqt tqtVar = uoy.b;
        int iIntValue = num != null ? num.intValue() : 0;
        tqtVar.getClass();
        uoy uoyVarJ = tqt.j(iIntValue);
        Long lValueOf = Long.valueOf(j2);
        Long lValueOf2 = Long.valueOf(jLongValue);
        Boolean bool2 = Boolean.FALSE;
        Boolean bool3 = j7n0Var.g;
        Integer numValueOf = bool3 != null ? Integer.valueOf(bool3.booleanValue() ? 1 : 0) : null;
        d7n0 d7n0Var = j7n0Var.h;
        List list = d7n0Var != null ? d7n0Var.f5602a : null;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = d7n0Var != null ? d7n0Var.b : null;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new v9s(jLongValue2, dDoubleValue, j, dDoubleValue2, "", bigDecimalH, zD, str2, "", betPlayerZip, null, null, null, uoyVarJ, lValueOf, null, lValueOf2, bool, l, bool2, null, numValueOf, new EventParams(list, list2));
    }

    public static final q5p0 D(vvb vvbVar) {
        Integer numValueOf;
        long jM121getTransparent0d7_KjU;
        vvbVar.getClass();
        hwb hwbVar = vvbVar.f38090a;
        dwb dwbVar = vvbVar.c;
        int iOrdinal = hwbVar.ordinal();
        if (iOrdinal == 0) {
            numValueOf = Integer.valueOf(R.drawable.ic_statistic_sword);
        } else if (iOrdinal == 1) {
            numValueOf = Integer.valueOf(R.drawable.ic_statistic_shield);
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            numValueOf = null;
        }
        if (dwbVar instanceof awb) {
            pz40 pz40Var = s6t0.f31722a;
            jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
        } else if ((dwbVar instanceof xvb) || (dwbVar instanceof yvb)) {
            pz40 pz40Var2 = s6t0.f31722a;
            jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m119getTeal0d7_KjU();
        } else if (dwbVar instanceof cwb) {
            pz40 pz40Var3 = s6t0.f31722a;
            jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m87getDarkOrange0d7_KjU();
        } else if (dwbVar instanceof bwb) {
            pz40 pz40Var4 = s6t0.f31722a;
            jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
        } else {
            if (!dwbVar.equals(zvb.b)) {
                t9f.b();
                return null;
            }
            pz40 pz40Var5 = s6t0.f31722a;
            jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
        }
        return new q5p0(jM121getTransparent0d7_KjU, numValueOf, vvbVar.b, dwbVar.f6789a);
    }

    public static final q2s0 E(c5s0 c5s0Var) {
        r1s0 r1s0Var;
        u1s0 u1s0Var = c5s0Var.f3788a;
        if (u1s0Var != null) {
            Integer num = u1s0Var.f34915a;
            int iIntValue = num != null ? num.intValue() : -1;
            Long l = u1s0Var.b;
            long jLongValue = l != null ? l.longValue() : -1L;
            String str = u1s0Var.c;
            if (str == null) {
                str = "";
            }
            String str2 = u1s0Var.e;
            if (str2 == null) {
                str2 = "";
            }
            Long l2 = u1s0Var.d;
            long jLongValue2 = l2 != null ? l2.longValue() : -1L;
            String str3 = u1s0Var.f;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = u1s0Var.g;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = u1s0Var.h;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = u1s0Var.i;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = u1s0Var.j;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = u1s0Var.k;
            r1s0Var = new r1s0(iIntValue, jLongValue, str, str2, jLongValue2, str3, str4, str5, str6, str7, str8 == null ? "" : str8);
        } else {
            r1s0Var = new r1s0(-1, -1L, "", "", -1L, "", "", "", "", "", "");
        }
        return new q2s0(r1s0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public static final o4t0 F(d6t0 d6t0Var) {
        ?? arrayList;
        d6t0Var.getClass();
        List<h6t0> list = d6t0Var.f5567a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (h6t0 h6t0Var : list) {
                Integer num = h6t0Var.f12545a;
                int iIntValue = num != null ? num.intValue() : 0;
                String str = h6t0Var.b;
                String str2 = str == null ? "" : str;
                String str3 = h6t0Var.c;
                String str4 = str3 == null ? "" : str3;
                Long l = h6t0Var.d;
                arrayList.add(new e6t0(iIntValue, l != null ? l.longValue() : 0L, str2, str4));
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new o4t0(arrayList);
    }

    public static final Boolean G(int i, f8m f8mVar, nqq nqqVar, jge0 jge0Var) {
        int iOrdinal = nqqVar.e1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                nqq nqqVarC0 = uzb.c0(nqqVar);
                if (nqqVarC0 == null) {
                    jf4.n("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = nqqVarC0.e1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolG = G(i, f8mVar, nqqVarC0, jge0Var);
                        if (!Intrinsics.d(boolG, Boolean.FALSE)) {
                            return boolG;
                        }
                        if (jge0Var == null) {
                            if (nqqVarC0.e1() != iqq.b) {
                                jf4.n("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            nqq nqqVarZ = uzb.Z(nqqVarC0);
                            if (nqqVarZ == null) {
                                jf4.n("ActiveParent must have a focusedChild");
                                return null;
                            }
                            jge0Var = uzb.a0(nqqVarZ);
                        }
                        return Boolean.valueOf(u(i, f8mVar, nqqVar, jge0Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            t9f.b();
                            return null;
                        }
                        jf4.n("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (jge0Var == null) {
                    jge0Var = uzb.a0(nqqVarC0);
                }
                return Boolean.valueOf(u(i, f8mVar, nqqVar, jge0Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                if (nqqVar.b1().f1309a) {
                    return (Boolean) f8mVar.invoke(nqqVar);
                }
                return jge0Var == null ? Boolean.valueOf(t(nqqVar, i, f8mVar)) : Boolean.valueOf(B(i, f8mVar, nqqVar, jge0Var));
            }
        }
        return Boolean.valueOf(t(nqqVar, i, f8mVar));
    }

    public static final mm40 H(mm40 mm40Var, float f) {
        return mm40Var.e(new z2w0(f));
    }

    public static final void I(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        pb90 pb90Var = new pb90(level, exc, str, objArr, (byte) 11);
        int i = pex0.f26873a;
        executor.execute(new hf5(new mie0(), wcx0.a(), pb90Var, (byte) 23));
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-2031114581);
        byte b = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, pkd.l(mm40VarN, ugg0Var, 0L, fetVar, 2));
            zq8.a(0, fetVar, pkd.l(o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 12.0f), 64.0f), ugg0Var, 0L, fetVar, 2));
            zq8.a(0, fetVar, pkd.l(o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 20.0f), 100.0f), ugg0Var, 0L, fetVar, 2));
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.j, fetVar, 6);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            zq8.a(0, fetVar, pkd.l(o7k0.e(o7k0.s(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 126.0f), 44.0f), vgg0.a(16.0f), 0L, fetVar, 2));
            qxw.o(fetVar, o7k0.s(jm40Var, 4.0f));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            zq8.a(0, fetVar, pkd.l(o7k0.e(o7k0.s(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 126.0f), 44.0f), vgg0.a(16.0f), 0L, fetVar, 2));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tsu0(mm40Var, i, b);
        }
    }

    public static final void b(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i) {
        mm40Var.getClass();
        fqj0Var.getClass();
        fetVar.g0(1996341572);
        byte b = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(fqj0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 62.0f), 32.0f);
            zcl zclVar2 = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new buv(mm40Var, fqj0Var, i, b);
        }
    }

    public static final void c(long j, fet fetVar, int i) {
        fetVar.g0(-345799638);
        int i2 = (fetVar.f(j) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.n(s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), 8.0f), "STATISTIC_HEADER_CIRCLE_BADGE");
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new r2a0((byte) 13, j);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarE0, (Function1) objP, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e3b0(j, i, (byte) 11);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1178361049);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar, pkd.l(o7k0.d(o7k0.e(jm40Var, 72.0f), 1.0f), vgg0.a(16.0f), 0L, fetVar, 2));
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.g);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarB);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 12.0f), 64.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, pkd.l(mm40VarS, ugg0Var, 0L, fetVar, 2));
            zq8.a(0, fetVar, pkd.l(o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 20.0f), 100.0f), ugg0Var, 0L, fetVar, 2));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tsu0(mm40Var, i, (byte) 3);
        }
    }

    public static final void e(fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(597321290);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarD, s6t0.b().f33626a.getBackground(), jd8.n), xfn.a(fetVar).e, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.L(jm40Var, 0.0f, 8.0f, 1), 1.0f), 20.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 21, i, fqj0Var);
        }
    }

    public static final void f(vlo0 vlo0Var, fet fetVar, int i) {
        fetVar.g0(398409252);
        int i2 = (fetVar.g(vlo0Var) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            int iOrdinal = vlo0Var.f37636a.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(619206217);
                h(vlo0Var, fetVar, i2 & 14);
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(619204666, fetVar, false);
                }
                fetVar.e0(619208008);
                g(vlo0Var, fetVar, i2 & 14);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hlo0(vlo0Var, i, b);
        }
    }

    public static final void g(vlo0 vlo0Var, fet fetVar, int i) {
        vlo0 vlo0Var2;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(-846549467);
        int i2 = i | (fetVar2.g(vlo0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM73getBlack400d7_KjU = staticColors.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 0.0f, 2), "STATISTIC_HEADER_PARAM_BADGED_ROW");
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.g, yx7Var, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            thg0 thg0VarA2 = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            String str = vlo0Var.c;
            String str2 = vlo0Var.d;
            i(str, fetVar2, 0);
            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(vlo0Var.b, o2e.e0(mm40VarN.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false)), "STATISTIC_HEADER_PARAM_BADGED_TEXT"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            if (str2.length() > 0) {
                fetVar2.e0(-1968569068);
                m(0, fetVar2, null, str2);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1968506603);
                fetVar2.r(false);
            }
            b = 1;
            fetVar2.r(true);
            vlo0Var2 = vlo0Var;
            c(vlo0Var2.e, fetVar2, 0);
            fetVar2.r(true);
        } else {
            vlo0Var2 = vlo0Var;
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hlo0(vlo0Var2, i, b);
        }
    }

    public static final void h(vlo0 vlo0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(341970876);
        int i2 = i | (fetVar2.g(vlo0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
            long j = vlo0Var.e;
            String str = vlo0Var.d;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 0.0f, 2), "STATISTIC_HEADER_PARAM_COLORED_ROW");
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new ttn0(vlo0Var, (byte) 11);
                fetVar2.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            i(vlo0Var.c, fetVar2, 0);
            v8q0.a(vlo0Var.b, o2e.e0(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14).e(new x7z(1.0f, false)), "STATISTIC_HEADER_PARAM_COLORED_TEXT"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            if (str.length() > 0) {
                fetVar2.e0(-1263269071);
                m(0, fetVar2, null, str);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1263214294);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hlo0(vlo0Var, i, (byte) 2);
        }
    }

    public static final void i(String str, fet fetVar, int i) {
        String str2;
        fet fetVar2;
        fetVar.g0(-1169722841);
        byte b = 2;
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            pge pgeVar = gqw0.A;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            str2 = str;
            fetVar2 = fetVar;
            lgb.v(o2e.e0(o7k0.n(jm40Var, 16.0f), "STATISTIC_HEADER_TEAM_LOGO"), o2e.e0(o7k0.n(jm40Var, 16.0f), "STATISTIC_HEADER_TEAM_LOGO"), str2, R.drawable.ic_glyph_circle_globe, StaticColors.INSTANCE.m130getWhite600d7_KjU(), pgeVar, fetVar2, ((i2 << 6) & 896) | 196608, 0);
        } else {
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f5n0(b, i, str2);
        }
    }

    public static final void j(mm40 mm40Var, frq0 frq0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        Function0 function1;
        function0.getClass();
        fetVar.g0(-197217198);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(frq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function1 = function0;
            i2 |= fetVar.i(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.e0(217934172);
            qzb.n(o7k0.d(mm40Var, 1.0f), new wul(lul.e, oe9.f25112a, new ue9(xsm0.s(R.string.tournaments_take_part_confirm, fetVar)), true, false, false), function1, fetVar, i2 & 896, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, frq0Var, function0, i, (byte) 8);
        }
    }

    public static final void k(mm40 mm40Var, irq0 irq0Var, Function0 function0, fet fetVar, int i) {
        Function0 function1;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        xx7 xx7Var = gqw0.m;
        mw3 mw3Var = uc9.c;
        function0.getClass();
        fetVar.g0(-685944026);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(irq0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            function1 = function0;
            fetVar.X();
        } else if (irq0Var.equals(grq0.f11794a)) {
            fetVar.e0(-2062206637);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, o7k0.e(mm40Var, 0.0f));
            fetVar.r(false);
            function1 = function0;
        } else {
            boolean zEquals = irq0Var.equals(hrq0.f13544a);
            jm40 jm40Var = jm40.b;
            pcy pcyVar = e7z.u1;
            if (zEquals) {
                fetVar.e0(496212009);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(mm40Var, 0.0f, 8.0f, 0.0f, 16.0f, 5);
                x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA, shdVar4);
                jpm0.o(fetVar, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC0, shdVar);
                mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 194.0f);
                StaticColors staticColors = StaticColors.INSTANCE;
                long jM75getBlack600d7_KjU = staticColors.m75getBlack600d7_KjU();
                zcl zclVar3 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                zq8.a(0, fetVar, i120.Q(mm40VarE, jM75getBlack600d7_KjU, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)));
                mm40 mm40VarE2 = o7k0.e(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), 40.0f);
                long jM75getBlack600d7_KjU2 = staticColors.m75getBlack600d7_KjU();
                zcl zclVar4 = qmk.f;
                zq8.a(0, fetVar, i120.Q(mm40VarE2, jM75getBlack600d7_KjU2, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4)));
                fetVar.r(true);
                fetVar.r(false);
                function1 = function0;
            } else {
                if (!(irq0Var instanceof frq0)) {
                    throw b1j.f(-2062207004, fetVar, false);
                }
                fetVar.e0(497113675);
                zcl zclVar5 = qmk.f28987a;
                mm40 mm40VarN2 = s5x0.N(mm40Var, 0.0f, 8.0f, 0.0f, 16.0f, 5);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                frq0 frq0Var = (frq0) irq0Var;
                btm0.f(null, frq0Var, fetVar, i2 & 112);
                function1 = function0;
                j(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), frq0Var, function1, fetVar, i2 & 1008);
                fetVar.r(true);
                fetVar.r(false);
            }
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, irq0Var, function1, i, (byte) 19);
        }
    }

    public static final void l(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(-777036381);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            o5n0.l(((i3 << 6) & 896) | 54, s5x0.e, s5x0.f, fetVar, mm40Var);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, i, i2, (byte) 21);
        }
    }

    public static final void m(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fetVar.g0(-1606615328);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(o7k0.e(mm40Var2, 16.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14), "WIN_TAG");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            j6n.h(str, lso0.f20590a, jr8.f16991a.b(mm40Var2, gqw0.e), 0, 0, fetVar, ((i2 >> 3) & 14) | 48, 24);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var2, str, i, (byte) 26);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.f16474a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        a.jf4.n("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        a.jf4.n("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean n(a.jge0 r18, a.jge0 r19, a.jge0 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = o(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.f16474a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.f16474a
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = o(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.f16474a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            a.jf4.n(r4)
            return r12
        L94:
            a.jf4.n(r4)
            return r12
        L98:
            return r18
        L99:
            a.jf4.n(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k7n0.n(a.jge0, a.jge0, a.jge0, int):boolean");
    }

    public static final boolean o(int i, jge0 jge0Var, jge0 jge0Var2) {
        if (i == 3 || i == 4) {
            return jge0Var.d > jge0Var2.b && jge0Var.b < jge0Var2.d;
        }
        if (i == 5 || i == 6) {
            return jge0Var.c > jge0Var2.f16474a && jge0Var.f16474a < jge0Var2.c;
        }
        jf4.n("This function should only be used for 2-D focus search");
        return false;
    }

    public static final s6q0 p(String str, String str2, String str3, boolean z) {
        return new s6q0(str, e6q0.f7299a, k6q0.f17783a, str3.length() > 0 ? new s7q0(str3) : r7q0.f29989a, z, str3.length() > 0, null, str2, null, 32128);
    }

    public static final void q(nqq nqqVar, xz40 xz40Var) {
        if (!nqqVar.f20279a.n) {
            xcx.b("visitChildren called on an unattached node");
        }
        xz40 xz40Var2 = new xz40(new lm40[16]);
        lm40 lm40Var = nqqVar.f20279a;
        lm40 lm40Var2 = lm40Var.f;
        if (lm40Var2 == null) {
            vcc.v(xz40Var2, lm40Var);
        } else {
            xz40Var2.b(lm40Var2);
        }
        while (true) {
            int i = xz40Var2.c;
            if (i == 0) {
                return;
            }
            lm40 lm40VarV = (lm40) xz40Var2.k(i - 1);
            if ((lm40VarV.d & 1024) == 0) {
                vcc.v(xz40Var2, lm40VarV);
            } else {
                while (lm40VarV != null) {
                    if ((lm40VarV.c & 1024) != 0) {
                        xz40 xz40Var3 = null;
                        while (lm40VarV != null) {
                            if (lm40VarV instanceof nqq) {
                                nqq nqqVar2 = (nqq) lm40VarV;
                                if (nqqVar2.n && !vcc.Z(nqqVar2).s1) {
                                    if (nqqVar2.b1().f1309a) {
                                        xz40Var.b(nqqVar2);
                                    } else {
                                        q(nqqVar2, xz40Var);
                                    }
                                }
                            } else if ((lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                                int i2 = 0;
                                for (lm40 lm40Var3 = ((f3k) lm40VarV).p; lm40Var3 != null; lm40Var3 = lm40Var3.f) {
                                    if ((lm40Var3.c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            lm40VarV = lm40Var3;
                                        } else {
                                            if (xz40Var3 == null) {
                                                xz40Var3 = new xz40(new lm40[16]);
                                            }
                                            if (lm40VarV != null) {
                                                xz40Var3.b(lm40VarV);
                                                lm40VarV = null;
                                            }
                                            xz40Var3.b(lm40Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            lm40VarV = vcc.V(xz40Var3);
                        }
                        break;
                    }
                    lm40VarV = lm40VarV.f;
                }
            }
        }
    }

    public static final String r(Long l) {
        if (l == null) {
            return "";
        }
        rdj rdjVar = rdj.f30294a;
        ynq0 ynq0Var = new ynq0(l.longValue());
        sdj sdjVar = sdj.UNIVERSAL;
        return rdj.b(ynq0Var);
    }

    public static final nqq s(xz40 xz40Var, jge0 jge0Var, int i) {
        jge0 jge0VarL;
        nqq nqqVar = null;
        if (i == 3) {
            jge0VarL = jge0Var.l((jge0Var.c - jge0Var.f16474a) + 1.0f, 0.0f);
        } else if (i == 4) {
            jge0VarL = jge0Var.l(-((jge0Var.c - jge0Var.f16474a) + 1.0f), 0.0f);
        } else if (i == 5) {
            jge0VarL = jge0Var.l(0.0f, (jge0Var.d - jge0Var.b) + 1.0f);
        } else {
            if (i != 6) {
                jf4.n("This function should only be used for 2-D focus search");
                return null;
            }
            jge0VarL = jge0Var.l(0.0f, -((jge0Var.d - jge0Var.b) + 1.0f));
        }
        Object[] objArr = xz40Var.f41739a;
        int i2 = xz40Var.c;
        for (int i3 = 0; i3 < i2; i3++) {
            nqq nqqVar2 = (nqq) objArr[i3];
            if (uzb.r0(nqqVar2)) {
                jge0 jge0VarA0 = uzb.a0(nqqVar2);
                if (y(jge0VarA0, jge0VarL, jge0Var, i)) {
                    nqqVar = nqqVar2;
                    jge0VarL = jge0VarA0;
                }
            }
        }
        return nqqVar;
    }

    public static final boolean t(nqq nqqVar, int i, Function1 function1) {
        jge0 jge0Var;
        xz40 xz40Var = new xz40(new nqq[16]);
        q(nqqVar, xz40Var);
        int i2 = xz40Var.c;
        if (i2 <= 1) {
            nqq nqqVar2 = (nqq) (i2 == 0 ? null : xz40Var.f41739a[0]);
            if (nqqVar2 != null) {
                return ((Boolean) function1.invoke(nqqVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                jge0 jge0VarA0 = uzb.a0(nqqVar);
                float f = jge0VarA0.f16474a;
                float f2 = jge0VarA0.b;
                jge0Var = new jge0(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    jf4.n("This function should only be used for 2-D focus search");
                    return false;
                }
                jge0 jge0VarA1 = uzb.a0(nqqVar);
                float f3 = jge0VarA1.c;
                float f4 = jge0VarA1.d;
                jge0Var = new jge0(f3, f4, f3, f4);
            }
            nqq nqqVarS = s(xz40Var, jge0Var, i);
            if (nqqVarS != null) {
                return ((Boolean) function1.invoke(nqqVarS)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean u(int i, f8m f8mVar, nqq nqqVar, jge0 jge0Var) {
        if (B(i, f8mVar, nqqVar, jge0Var)) {
            return true;
        }
        Boolean bool = (Boolean) rsr0.f0(nqqVar, i, new kc0(((ypq) vcc.a0(nqqVar).getFocusOwner()).h(), nqqVar, jge0Var, i, f8mVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final ViewParent v(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final String w(long j, ijr0 ijr0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        if (ijr0Var instanceof djr0) {
            int i = cy7.f5159a;
            return cy7.e(ctf0Var.b.a(R.string.toto_tiraj_is_coming_v2, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)));
        }
        if (!(ijr0Var instanceof hjr0)) {
            return "";
        }
        int i2 = cy7.f5159a;
        String strE = cy7.e(ctf0Var.b.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)));
        if (j <= 0) {
            strE = null;
        }
        return strE == null ? "-" : strE;
    }

    public static final int x(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean y(jge0 jge0Var, jge0 jge0Var2, jge0 jge0Var3, int i) {
        if (!z(i, jge0Var, jge0Var3)) {
            return false;
        }
        if (z(i, jge0Var2, jge0Var3) && !n(jge0Var3, jge0Var, jge0Var2, i)) {
            return !n(jge0Var3, jge0Var2, jge0Var, i) && A(i, jge0Var3, jge0Var) < A(i, jge0Var3, jge0Var2);
        }
        return true;
    }

    public static final boolean z(int i, jge0 jge0Var, jge0 jge0Var2) {
        if (i == 3) {
            float f = jge0Var2.c;
            float f2 = jge0Var2.f16474a;
            float f3 = jge0Var.c;
            return (f > f3 || f2 >= f3) && f2 > jge0Var.f16474a;
        }
        if (i == 4) {
            float f4 = jge0Var2.f16474a;
            float f5 = jge0Var2.c;
            float f6 = jge0Var.f16474a;
            return (f4 < f6 || f5 <= f6) && f5 < jge0Var.c;
        }
        if (i == 5) {
            float f7 = jge0Var2.d;
            float f8 = jge0Var2.b;
            float f9 = jge0Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > jge0Var.b;
        }
        if (i != 6) {
            jf4.n("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = jge0Var2.b;
        float f11 = jge0Var2.d;
        float f12 = jge0Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < jge0Var.d;
    }
}
