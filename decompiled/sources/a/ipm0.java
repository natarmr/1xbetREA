package a;

import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ipm0 {
    public static final void a(final ybp0 ybp0Var, fet fetVar, final int i) {
        final ybp0 ybp0Var2;
        final byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(1664520693);
        int i2 = (fetVar2.g(ybp0Var) ? 4 : 2) | i;
        final byte b2 = 0;
        if (!fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            ybp0Var2 = ybp0Var;
            b = 1;
            fetVar2.X();
        } else {
            if (!ybp0Var.f42349a) {
                yfe0 yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2(ybp0Var, i, b2) { // from class: a.xbp0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f40611a;
                        public final /* synthetic */ ybp0 b;

                        {
                            this.f40611a = b2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.f40611a;
                            ybp0 ybp0Var3 = this.b;
                            fet fetVar3 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    ipm0.a(ybp0Var3, fetVar3, x8x.L(1));
                                    break;
                                default:
                                    ipm0.a(ybp0Var3, fetVar3, x8x.L(1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7), "LOL_TEAM_DRAGONS");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
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
            mm40 mm40VarE = o7k0.e(jm40Var, 24.0f);
            long j = kkg.f;
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarH = dw9.h(1.0f, i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), true);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarH);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            b = 1;
            v8q0.a(rsm0.w(R.string.dragons, 0, fetVar2), o2e.e0(s5x0.N(jr8.f16991a.b(jm40Var, gqw0.d), 8.0f, 0.0f, 0.0f, 0.0f, 14), "LOL_TEAM_DRAGONS_TITLE"), StaticColors.INSTANCE.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.e0(1024738344);
            ybp0Var2 = ybp0Var;
            Iterator<E> it = ybp0Var2.b.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                zcl zclVar3 = qmk.f28987a;
                qxw.o(fetVar2, o7k0.s(jm40Var, 6.0f));
                j0x.b(a8k0.F(iIntValue, 0, fetVar2), null, o2e.e0(o7k0.n(jm40Var, 24.0f), "LOL_TEAM_DRAGON_IMAGE"), null, null, 0.0f, null, fetVar2, 56, 120);
            }
            fetVar2.r(false);
            fetVar2.r(true);
        }
        yfe0 yfe0VarU2 = fetVar2.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new Function2(ybp0Var2, i, b) { // from class: a.xbp0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f40611a;
                public final /* synthetic */ ybp0 b;

                {
                    this.f40611a = b;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = this.f40611a;
                    ybp0 ybp0Var3 = this.b;
                    fet fetVar3 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            ipm0.a(ybp0Var3, fetVar3, x8x.L(1));
                            break;
                        default:
                            ipm0.a(ybp0Var3, fetVar3, x8x.L(1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        str.getClass();
        fetVar.g0(889119165);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 24.0f, 0L, fetVar, 0, 5);
            wwb.i(null, str, 0L, 0, 0L, fetVar, i2 & 112, 29);
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(mm40Var2, str, i, (byte) 14);
        }
    }

    public static final void c(cp cpVar, twn0 twn0Var) {
        DsTimer dsTimer = ((own0) cpVar.u).s;
        dsTimer.setTimerType(twn0Var.b);
        dsTimer.setVisibility(twn0Var.d ? 0 : 8);
        dsTimer.setTime(twn0Var.f34659a);
        dsTimer.setTimeDirection(twn0Var.c);
        if (twn0Var.e) {
            dsTimer.d();
        }
    }

    public static final i4 d(int i, Function2 function2) {
        List listJ = q3d.j(Integer.valueOf(R.drawable.ic_sportsman_1), Integer.valueOf(R.drawable.ic_sportsman_2), Integer.valueOf(R.drawable.ic_sportsman_3), Integer.valueOf(R.drawable.ic_sportsman_4), Integer.valueOf(R.drawable.ic_sportsman_5), Integer.valueOf(R.drawable.ic_sportsman_6), Integer.valueOf(R.drawable.ic_sportsman_7), Integer.valueOf(R.drawable.ic_sportsman_8));
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        int i2 = 0;
        for (Object obj : listJ) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            arrayList.add((nt30) function2.invoke(Integer.valueOf(((Number) obj).intValue()), Boolean.valueOf(i2 <= i)));
            i2 = i3;
        }
        return dyb.r0(arrayList);
    }

    public static long e(boolean z, int i, af5 af5Var, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        af5Var.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long jScalb = af5Var == af5.b ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (z2) {
            long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    public static final boolean g(zjh zjhVar, String str) {
        zjhVar.getClass();
        if (str != null) {
            return zjhVar.d.b.equalsIgnoreCase(str) || zjhVar.e.b.equalsIgnoreCase(str);
        }
        return false;
    }

    public static final int i(ygq0 ygq0Var) {
        ygq0Var.getClass();
        switch (ygq0Var.ordinal()) {
            case 0:
                return R.string.filter_not_capital_letter;
            case 1:
                return R.string.filter_30min;
            case 2:
                return R.string.filter_1h;
            case 3:
                return R.string.filter_2h;
            case 4:
                return R.string.filter_6h;
            case 5:
                return R.string.filter_12h;
            case 6:
                return R.string.filter_24h;
            case 7:
                return R.string.filter_48h;
            case 8:
                return R.string.filter_1d;
            case 9:
                return R.string.filter_5d;
            case 10:
                return R.string.filter_7d;
            case 11:
                return R.string.filter_10d;
            case 12:
                return R.string.filter_30d;
            case 13:
                return R.string.arbitary_period;
            case 14:
                return R.string.one_x_drive_filter;
            default:
                t9f.b();
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    public static final String l(String str) {
        String str2;
        str.getClass();
        if (kotlin.text.c.x(str, ujn.h, false)) {
            str2 = str;
        } else if (str.length() == 0) {
            str2 = "";
        } else {
            List list = u0d.f34849a;
            if (u0d.c(str)) {
                str2 = "";
            } else {
                str2 = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
            }
        }
        if (str.length() <= 0) {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    public static final efp0 m(int i, xte xteVar, List list) {
        if (i < (ttp0.f34520a[xteVar.ordinal()] == 1 ? 3 : 2)) {
            if (i == 1) {
                String str = (String) CollectionsKt.firstOrNull(list);
                return new dfp0(str != null ? str : "");
            }
            if (i == 2) {
                String str2 = (String) CollectionsKt.firstOrNull(list);
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = (String) CollectionsKt.W(1, list);
                return new cfp0(str2, str3 != null ? str3 : "");
            }
        }
        return bfp0.f2514a;
    }

    public static final boolean n(int i, ArrayList arrayList, boolean z) {
        if (z) {
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (!StringsKt.W(((glh) it.next()).f11490a)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1 && i < i2) {
                return true;
            }
        }
        return false;
    }

    public static final Integer o(String str, Map map, Map map2) {
        map.getClass();
        map2.getClass();
        if (str != null) {
            if (StringsKt.W(str)) {
                str = null;
            }
            if (str != null) {
                Integer num = (Integer) map.get(str);
                return num == null ? (Integer) map2.get(str) : num;
            }
        }
        return null;
    }

    public static final Object p(Set set, Object obj, Object obj2, Enum r4, boolean z) {
        Set setP0;
        Object obj3;
        if (!z) {
            if (r4 != null && (setP0 = CollectionsKt.P0(eui0.h(set, r4))) != null) {
                set = setP0;
            }
            return CollectionsKt.w0(set);
        }
        if (set.contains(obj)) {
            obj3 = obj;
        } else {
            obj3 = set.contains(obj2) ? obj2 : null;
        }
        if (Intrinsics.d(obj3, obj) && Intrinsics.d(r4, obj2)) {
            return null;
        }
        return r4 == null ? obj3 : r4;
    }

    public static final tmp0 q(wmp0 wmp0Var) {
        xmp0 xmp0Var;
        wmp0Var.getClass();
        String str = wmp0Var.f39416a;
        if (str == null) {
            str = "";
        }
        String strE = lmc.E(wmp0Var.b);
        String str2 = wmp0Var.c;
        if (str2 == null) {
            str2 = "";
        }
        g9m0 g9m0Var = fks0.b;
        String str3 = wmp0Var.d;
        g9m0Var.getClass();
        fks0 fks0VarE = g9m0.e(str3);
        Long l = wmp0Var.e;
        long jLongValue = l != null ? l.longValue() : 0L;
        String lowerCase = (str != null ? str : "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (StringsKt.O(lowerCase, "inactive", false)) {
            xmp0Var = xmp0.b;
        } else if (StringsKt.O(lowerCase, "none", false)) {
            xmp0Var = xmp0.c;
        } else {
            xmp0Var = StringsKt.O(lowerCase, "retired", false) ? xmp0.f41140a : xmp0.d;
        }
        Boolean bool = wmp0Var.f;
        return new tmp0(str, strE, str2, fks0VarE, jLongValue, xmp0Var, bool != null ? bool.booleanValue() : false);
    }

    public static final y8r0 r(b9r0 b9r0Var) {
        b9r0Var.getClass();
        String str = b9r0Var.f2225a;
        if (str == null) {
            str = "";
        }
        String str2 = b9r0Var.b;
        return new y8r0(str, str2 != null ? str2 : "");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    public static final float s(List list) {
        float f;
        list.getClass();
        zcl zclVar = qmk.f28987a;
        Iterator it = list.iterator();
        float f2 = 0.0f;
        while (it.hasNext()) {
            p6t0 p6t0Var = (p6t0) it.next();
            if (p6t0Var == null) {
                zcl zclVar2 = qmk.f28987a;
                f = 0.0f;
            } else if (p6t0Var instanceof exr0) {
                f = 2.0f * kxr0.f19071a;
            } else if (p6t0Var instanceof xwr0) {
                f = kxr0.f19071a * ((xwr0) p6t0Var).b;
            } else if (p6t0Var instanceof fxr0) {
                f = ((fxr0) p6t0Var).f10324a;
            } else {
                zcl zclVar3 = qmk.f28987a;
                f = 0.0f;
            }
            f2 += f;
        }
        return f2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object t(Function1 function1, Function0 function0, Class cls, zje zjeVar) {
        wmt0 wmt0Var;
        if (zjeVar instanceof wmt0) {
            wmt0Var = (wmt0) zjeVar;
            int i = wmt0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wmt0Var.k = i - Integer.MIN_VALUE;
            } else {
                wmt0Var = new wmt0(zjeVar);
            }
        } else {
            wmt0Var = new wmt0(zjeVar);
        }
        Object obj = wmt0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = wmt0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                wmt0Var.i = function0;
                wmt0Var.k = 1;
                if (u(function1, cls, wmt0Var) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function0 = wmt0Var.i;
                z1x.P(obj);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            function0.invoke();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object u(Function1 function1, Class cls, zje zjeVar) {
        xmt0 xmt0Var;
        Object objE;
        if (zjeVar instanceof xmt0) {
            xmt0Var = (xmt0) zjeVar;
            int i = xmt0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                xmt0Var.j = i - Integer.MIN_VALUE;
            } else {
                xmt0Var = new xmt0(zjeVar);
            }
        } else {
            xmt0Var = new xmt0(zjeVar);
        }
        xmt0 xmt0Var2 = xmt0Var;
        Object obj = xmt0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = xmt0Var2.j;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            String name = cls.getName();
            uen uenVar = wen.b;
            long jW0 = ibc.w0(3L, bfn.SECONDS);
            List listJ = q3d.j(oqt0.class, fpd0.class, SocketException.class, SocketTimeoutException.class, ConnectException.class, UnknownHostException.class);
            a2f a2fVar = new a2f(function1, yjeVar, (byte) 11);
            xmt0Var2.j = 1;
            objE = j0x.E(3, jW0, xmt0Var2, name, listJ, a2fVar);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objE = ((j0g0) obj).f15681a;
        }
        z1x.P(objE);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (r15.invoke(r0, r1) == r2) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(kotlin.jvm.functions.Function1 r15, kotlin.jvm.functions.Function1 r16, kotlin.jvm.functions.Function1 r17, kotlin.jvm.functions.Function0 r18, kotlin.jvm.functions.Function2 r19, java.lang.Class r20, a.zje r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ipm0.v(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, java.lang.Class, a.zje):java.lang.Object");
    }

    public static ukw0 w(Object obj, Object obj2) {
        ukw0 ukw0VarB = (ukw0) obj;
        ukw0 ukw0Var = (ukw0) obj2;
        if (!ukw0Var.isEmpty()) {
            if (!ukw0VarB.f35848a) {
                ukw0VarB = ukw0VarB.b();
            }
            ukw0VarB.d();
            if (!ukw0Var.isEmpty()) {
                ukw0VarB.putAll(ukw0Var);
            }
        }
        return ukw0VarB;
    }

    public static void x(Object obj) {
    }

    public boolean f() {
        sba0 sba0VarJ = j();
        sba0 sba0Var = sba0.GAMING;
        if (sba0VarJ == sba0Var && (h() instanceof wdt) && (k() instanceof puo0)) {
            return true;
        }
        if (j() == sba0Var && (h() instanceof ydt) && (k() instanceof puo0)) {
            return true;
        }
        if (j() == sba0Var && (h() instanceof xdt) && (k() instanceof puo0)) {
            return true;
        }
        return j() == sba0Var && (h() instanceof zdt) && (k() instanceof puo0);
    }

    public abstract huo0 h();

    public abstract sba0 j();

    public abstract suo0 k();
}
