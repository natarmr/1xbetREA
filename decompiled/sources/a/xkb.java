package a;

import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xkb {
    public static final void A(j8n j8nVar, boolean z, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(127510971);
        int i3 = i & 6;
        zhg0 zhg0Var = zhg0.f44392a;
        if (i3 == 0) {
            i2 = (fetVar.g(zhg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j8nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40.b, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarA, 20.0f);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new xjl((byte) 24);
                fetVar.o0(objP);
            }
            ay3.f(boolValueOf, mm40VarE, (Function1) objP, gqw0.e, null, null, u1c.M(-627987624, new ec30(j8nVar, function0, (byte) 23), fetVar), fetVar, ((i2 >> 6) & 14) | 1576320, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((Object) j8nVar, z, (Object) function0, i, (byte) 10);
        }
    }

    public static final void B(int i, int i2, fet fetVar, mm40 mm40Var, String str) {
        int i3;
        mm40 mm40Var2;
        mm40 mm40Var3;
        boolean z;
        Unit unit;
        mm40 mm40Var4;
        fet fetVar2 = fetVar;
        fetVar2.g0(-377015191);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(str) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40Var5 = i4 != 0 ? jm40.b : mm40Var;
            if (str == null) {
                fetVar2.e0(-319973275);
                fetVar2.r(false);
                unit = null;
                mm40Var3 = mm40Var5;
                z = false;
            } else {
                fetVar2.e0(-319973274);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(mm40Var5, 0.0f, 2.0f, 1);
                long jM130getWhite600d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                mm40Var3 = mm40Var5;
                v8q0.a(str, mm40VarL, jM130getWhite600d7_KjU, new n05(qmk.o, qmk.q, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, 0, 24960, 109552);
                fetVar2 = fetVar2;
                z = false;
                fetVar2.r(false);
                unit = Unit.f46060a;
            }
            if (unit == null) {
                fetVar2.e0(-1534324764);
                mm40Var4 = mm40Var3;
                qxw.o(fetVar2, mm40Var4);
            } else {
                mm40Var4 = mm40Var3;
                fetVar2.e0(-1534342558);
            }
            fetVar2.r(z);
            mm40Var2 = mm40Var4;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw(mm40Var2, str, i, i2, (byte) 1);
        }
    }

    public static final void C(mm40 mm40Var, j8n j8nVar, fet fetVar, int i) {
        fetVar.g0(-1171450243);
        int i2 = i | 6 | (fetVar.g(j8nVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            D(j8nVar.f16092a, j8nVar.c, j8nVar.b, fetVar, 6);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var, j8nVar, i, (byte) 2);
        }
    }

    public static final void D(String str, String str2, String str3, fet fetVar, int i) {
        int i2;
        fetVar.g0(1785903001);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str3) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            E(str, fetVar, (i2 & 112) | 6);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            B((i2 >> 6) & 112, 0, fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), str3);
            E(str2, fetVar, ((i2 >> 3) & 112) | 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ve(str, str2, str3, i, (byte) 1);
        }
    }

    public static final void E(String str, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1578807863);
        int i3 = i & 6;
        zhg0 zhg0Var = zhg0.f44392a;
        if (i3 == 0) {
            i2 = i | (fetVar.g(zhg0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarA = o7k0.A(zhg0Var.a(1.0f, jm40.b, true), gqw0.n, 2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(epv0.N(o7k0.u(o7k0.e(mm40VarA, 20.0f), 40.0f, 0.0f, 2), 0.9f), vgg0.a(6.0f));
            androidx.compose.runtime.d dVar = m8m0.f21378a;
            mm40 mm40VarW = o7k0.w(s5x0.L(i120.Q(mm40VarJ, ((StaticColors) fetVar.k(dVar)).m125getWhite100d7_KjU(), jd8.n), 4.0f, 0.0f, 2), gqw0.k, false, 2);
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(dVar)).m123getWhite0d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarW, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, (i2 >> 3) & 14, 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v((byte) 4, i, str);
        }
    }

    public static final void F(String str, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(281844357);
        int i2 = i | (fetVar2.g(str) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM125getWhite100d7_KjU = staticColors.m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.M(i120.Q(mm40VarN, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 6.0f, 4.0f, 6.0f, 4.0f), "GUILTY_GEAR_TIMER_ROW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            j0x.b(a8k0.F(R.drawable.ic_status_gray_waiting_circle, 0, fetVar2), null, o2e.e0(o7k0.n(jm40Var, 8.0f), "GUILTY_GEAR_TIMER_IMAGE"), null, null, 0.0f, null, fetVar2, 56, 120);
            v8q0.a(str, o2e.e0(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), "GUILTY_GEAR_TIMER"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.o, null, j1t0.b, 0L, null, 0, 0, qmk.B, 16646109), fetVar, i2 & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 18, i, str);
        }
    }

    public static final void G(mm40 mm40Var, uzh uzhVar, fet fetVar, int i) {
        fetVar.g0(-684984704);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(uzhVar) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            int iT = w6kVar.T(6.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean zE = fetVar.e(iT) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new inl(uzhVar, iT, b);
                fetVar.o0(objP);
            }
            x4n0.a(mm40VarD, (Function2) objP, fetVar, 0, 0);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jnl(mm40Var, uzhVar, i, b);
        }
    }

    public static final boolean H(n3w n3wVar) {
        n3wVar.getClass();
        s77 s77Var = n3wVar.c;
        return s77Var == s77.EVENTS || s77Var == s77.UNSETTLED;
    }

    public static final void I(lc00 lc00Var, ikk ikkVar, ctf0 ctf0Var, m9s m9sVar, boolean z) {
        gkk gkkVar;
        okk okkVar;
        String strA;
        nkk nkkVar;
        ctf0Var.getClass();
        m9sVar.getClass();
        qqs qqsVar = m9sVar.h;
        Pair pairW = slb.W(ikkVar.f14930a, ikkVar.b);
        List list = (List) pairW.f46059a;
        List list2 = (List) pairW.b;
        Pair pairW2 = slb.W(ikkVar.c, ikkVar.d);
        List list3 = (List) pairW2.f46059a;
        List list4 = (List) pairW2.b;
        hkk hkkVar = ikkVar.e;
        String str = ikkVar.f;
        String str2 = ikkVar.g;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        jkk jkkVarS = S(list, true);
        jkk jkkVarS2 = S(list3, false);
        if (list.size() == 5) {
            int iOrdinal = hkkVar.ordinal();
            if (iOrdinal == 4) {
                strA = ctf0Var.b.a(R.string.dice_poker_end_game_win_v2, Arrays.copyOf(new Object[]{1}, 1));
            } else if (iOrdinal != 5) {
                strA = iOrdinal != 6 ? "" : ctf0Var.b.a(R.string.draw, Arrays.copyOf(new Object[0], 0));
            } else {
                strA = ctf0Var.b.a(R.string.dice_poker_end_game_win_v2, Arrays.copyOf(new Object[]{2}, 1));
            }
            Locale locale = Locale.ROOT;
            String upperCase = strA.toUpperCase(locale);
            upperCase.getClass();
            String upperCase2 = str.toUpperCase(locale);
            upperCase2.getClass();
            String upperCase3 = str2.toUpperCase(locale);
            upperCase3.getClass();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            int i = 0;
            while (i < size) {
                i++;
                arrayList.add(Boolean.valueOf(list2.contains(Integer.valueOf(i))));
            }
            int size2 = list3.size();
            ArrayList arrayList2 = new ArrayList(size2);
            int i2 = 0;
            while (i2 < size2) {
                i2++;
                arrayList2.add(Boolean.valueOf(list4.contains(Integer.valueOf(i2))));
            }
            int iOrdinal2 = hkkVar.ordinal();
            if (iOrdinal2 == 4) {
                nkkVar = nkk.f23684a;
            } else if (iOrdinal2 != 5) {
                nkkVar = iOrdinal2 != 6 ? nkk.d : nkk.c;
            } else {
                nkkVar = nkk.b;
            }
            gkkVar = new gkk(upperCase, upperCase2, upperCase3, arrayList, arrayList2, nkkVar);
        } else {
            iun iunVar = iun.f15405a;
            gkkVar = new gkk("", "", "", iunVar, iunVar, nkk.d);
        }
        int iOrdinal3 = hkkVar.ordinal();
        if (iOrdinal3 == 0) {
            lsm0 lsm0Var = ctf0Var.b;
            okkVar = new okk(lsm0Var.a(R.string.bet_before_higher_vs_lower_game_start, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.bet_before_higher_vs_lower_game_start, Arrays.copyOf(new Object[0], 0)), false, false);
        } else if (iOrdinal3 == 1) {
            lsm0 lsm0Var2 = ctf0Var.b;
            okkVar = new okk(lsm0Var2.a(R.string.dice_poker_round_number_name_v2, Arrays.copyOf(new Object[]{"1"}, 1)), lsm0Var2.a(R.string.dice_poker_round_number_name_with_bet_v2, Arrays.copyOf(new Object[]{"2"}, 1)), false, true);
        } else if (iOrdinal3 != 2) {
            lsm0 lsm0Var3 = ctf0Var.b;
            okkVar = new okk(lsm0Var3.a(R.string.dice_poker_round_number_name_v2, Arrays.copyOf(new Object[]{"3"}, 1)), lsm0Var3.a(R.string.dice_poker_round_summarizing, Arrays.copyOf(new Object[0], 0)), true, false);
        } else {
            lsm0 lsm0Var4 = ctf0Var.b;
            okkVar = new okk(lsm0Var4.a(R.string.dice_poker_round_number_name_v2, Arrays.copyOf(new Object[]{"2"}, 1)), lsm0Var4.a(R.string.dice_poker_round_number_name_with_bet_v2, Arrays.copyOf(new Object[]{"3"}, 1)), false, true);
        }
        long jF = znq0.f(qqsVar.h);
        znq0 znq0Var = qqsVar.k;
        lc00Var.add(new xkk(jkkVarS, jkkVarS2, gkkVar, okkVar, new vkk(znq0Var != null ? Long.valueOf(znq0.f(znq0Var.f44687a)) : null, jF), z));
    }

    public static void J(jbj jbjVar) {
        if (jbjVar != null) {
            try {
                jbjVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final itb K(q99 q99Var) {
        return new itb(q99Var, true);
    }

    public static final l4t0 L(apv apvVar, String str, String str2) {
        Integer num = apvVar.h;
        if (num != null && num.intValue() == 0) {
            return h4t0.f12450a;
        }
        if (num != null && num.intValue() == 1) {
            return new i4t0(str);
        }
        return (num != null && num.intValue() == 2) ? new j4t0(str2) : k4t0.f17684a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0053, B:28:0x0068, B:30:0x0070, B:20:0x0045, B:23:0x004f), top: B:47:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r2.a(r10, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0082 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M(a.kmq r7, a.htb r8, boolean r9, a.yje r10) {
        /*
            boolean r0 = r10 instanceof a.umq
            if (r0 == 0) goto L13
            r0 = r10
            a.umq r0 = (a.umq) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.umq r0 = new a.umq
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.m
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L37
            boolean r9 = r0.l
            a.j99 r7 = r0.k
            a.htb r8 = r0.j
            a.kmq r2 = r0.i
            a.z1x.P(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L53
        L35:
            r7 = move-exception
            goto L8d
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r5
        L3d:
            boolean r9 = r0.l
            a.j99 r7 = r0.k
            a.htb r8 = r0.j
            a.kmq r2 = r0.i
            a.z1x.P(r10)     // Catch: java.lang.Throwable -> L35
            goto L68
        L49:
            a.z1x.P(r10)
            a.f7k.J(r7)
            a.j99 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L53:
            r0.i = r7     // Catch: java.lang.Throwable -> L35
            r0.j = r8     // Catch: java.lang.Throwable -> L35
            r0.k = r10     // Catch: java.lang.Throwable -> L35
            r0.l = r9     // Catch: java.lang.Throwable -> L35
            r0.n = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L64
            goto L84
        L64:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L85
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.i = r2     // Catch: java.lang.Throwable -> L35
            r0.j = r8     // Catch: java.lang.Throwable -> L35
            r0.k = r7     // Catch: java.lang.Throwable -> L35
            r0.l = r9     // Catch: java.lang.Throwable -> L35
            r0.n = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.a(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
        L84:
            return r1
        L85:
            if (r9 == 0) goto L8a
            r8.cancel(r5)
        L8a:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L8d:
            throw r7     // Catch: java.lang.Throwable -> L8e
        L8e:
            r10 = move-exception
            if (r9 == 0) goto La3
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L98
            r5 = r7
            java.util.concurrent.CancellationException r5 = (java.util.concurrent.CancellationException) r5
        L98:
            if (r5 != 0) goto La0
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r5 = a.plc.b(r9, r7)
        La0:
            r8.cancel(r5)
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xkb.M(a.kmq, a.htb, boolean, a.yje):java.lang.Object");
    }

    public static final String N(n3w n3wVar) {
        n3wVar.getClass();
        return (n3wVar.P1 && H(n3wVar)) ? n3wVar.f22868a : "";
    }

    public static final String O(dao daoVar) {
        boolean z = daoVar.s;
        String strF = daoVar.i;
        if (z) {
            strF = "SP";
        } else if (strF.length() <= 0) {
            pn40 pn40Var = pn40.f27267a;
            strF = pn40.f(daoVar.d);
        }
        return kng0.l("\u2066", strF, "\u2069");
    }

    public static List P() {
        return q3d.j(gsg.d, zwg.d, ttg.d, axg.d, mug.d, pug.d, kvg.d, owg.d, gxg.d, oxg.d, bxg.d, ztg.d, bwg.d, fxg.d, exg.d, rvg.d, twg.d, fvg.d, xug.d, ltg.d, mxg.d, tvg.d, jrg.d, jwg.d, hwg.d, qtg.d, ktg.d, iwg.d, ysg.d, msg.d, jtg.d, iug.d, sxg.d, jvg.d, dsg.d, qxg.d, fug.d, cxg.d, qvg.d, vxg.d, urg.d, ywg.d, hrg.d, pwg.d, frg.d, wvg.d, aug.d, kxg.d, yvg.d, hug.d, asg.d, gwg.d, avg.d, jxg.d, qug.d, ixg.d, uxg.d, xxg.d, dxg.d, erg.d, pvg.d, lwg.d, bsg.d, irg.d, xsg.d, lsg.d, vsg.d, mtg.d, lrg.d, dtg.d, btg.d, ctg.d, nvg.d, usg.d, ksg.d, rwg.d, tsg.d, zsg.d, qwg.d, rsg.d, wsg.d, stg.d, ytg.d, gtg.d, nsg.d, vvg.d, mvg.d, oug.d, lvg.d, mrg.d, etg.d, esg.d, atg.d, ssg.d, svg.d, kug.d, kwg.d, ftg.d, jsg.d, uwg.d, prg.d, isg.d, qsg.d, jug.d, nwg.d, krg.d, nrg.d, qrg.d, itg.d, ptg.d, htg.d, dwg.d, srg.d, vwg.d, zvg.d, rrg.d, rxg.d, utg.d, yug.d, dvg.d, nug.d, ivg.d, wug.d, xvg.d, sug.d, uug.d, evg.d, cvg.d, gvg.d, vug.d, wwg.d, bvg.d, zug.d, wxg.d, tug.d, swg.d, rug.d, txg.d, psg.d, lug.d, drg.d, grg.d, bug.d, xwg.d, eug.d, pxg.d, trg.d, otg.d, crg.d, ewg.d, fwg.d, ntg.d, xrg.d, yrg.d, fsg.d, rtg.d, cwg.d, xtg.d, uvg.d, cug.d, wrg.d, vrg.d, lxg.d, dug.d, wtg.d, hxg.d, gug.d, hsg.d, hvg.d, org.d, ovg.d, csg.d, awg.d, nxg.d, mwg.d);
    }

    public static final String Q(d0t d0tVar, dmr dmrVar) {
        Object next;
        String str;
        Iterator it = d0tVar.p.n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmrVar);
        cmr cmrVar = (cmr) next;
        return (cmrVar == null || (str = cmrVar.b) == null) ? "" : str;
    }

    public static final List R(kzv kzvVar, HistoryTypeModel historyTypeModel, List list) {
        list.getClass();
        if (kzvVar.g == i0w.b && historyTypeModel != HistoryTypeModel.TOTO && historyTypeModel != HistoryTypeModel.JACKPOT && historyTypeModel != HistoryTypeModel.AUTO) {
            list = CollectionsKt.r0(list, HistoryMenuItem.f46392a);
        }
        return U(list);
    }

    public static final jkk S(List list, boolean z) {
        List listC;
        ekk ekkVar;
        ekk ekkVar2;
        ekk ekkVar3;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            zjk zjkVar = (zjk) obj;
            int i3 = R.drawable.transparent;
            if (z) {
                switch (zjkVar.ordinal()) {
                    case 0:
                        i3 = R.drawable.ic_white_dice_one;
                        break;
                    case 1:
                        i3 = R.drawable.ic_white_dice_two;
                        break;
                    case 2:
                        i3 = R.drawable.ic_white_dice_three;
                        break;
                    case 3:
                        i3 = R.drawable.ic_white_dice_four;
                        break;
                    case 4:
                        i3 = R.drawable.ic_white_dice_five;
                        break;
                    case 5:
                        i3 = R.drawable.ic_white_dice_six;
                        break;
                    case 6:
                        break;
                    default:
                        t9f.b();
                        return null;
                }
            } else {
                switch (zjkVar.ordinal()) {
                    case 0:
                        i3 = R.drawable.ic_black_dice_one;
                        break;
                    case 1:
                        i3 = R.drawable.ic_black_dice_two;
                        break;
                    case 2:
                        i3 = R.drawable.ic_black_dice_three;
                        break;
                    case 3:
                        i3 = R.drawable.ic_black_dice_four;
                        break;
                    case 4:
                        i3 = R.drawable.ic_black_dice_five;
                        break;
                    case 5:
                        i3 = R.drawable.ic_black_dice_six;
                        break;
                    case 6:
                        break;
                    default:
                        t9f.b();
                        return null;
                }
            }
            if (z) {
                if (i2 == 1) {
                    ekkVar2 = new ekk(0.0f, 0.4f, 2.0f, 0.05f, 0.23f);
                    ekkVar = ekkVar2;
                } else if (i2 != 3) {
                    ekkVar = new ekk(45.0f, 0.7f, 0.5f, 0.09f, 0.13f);
                } else {
                    ekkVar3 = new ekk(27.0f, 0.75f, 0.1f, 0.2f, 0.18f);
                    ekkVar = ekkVar3;
                }
            } else if (i2 == 1) {
                ekkVar = new ekk(0.0f, 0.4f, -2.0f, -0.052f, 0.23f);
            } else if (i2 != 3) {
                ekkVar3 = new ekk(45.0f, 0.1f, -0.5f, -0.11f, 0.13f);
                ekkVar = ekkVar3;
            } else {
                ekkVar2 = new ekk(27.0f, 0.05f, -0.1f, -0.22f, 0.18f);
                ekkVar = ekkVar2;
            }
            arrayList.add(new fkk(i3, ekkVar));
            i = i2;
        }
        int size = arrayList.size();
        if (1 <= size && size < 4) {
            listC = CollectionsKt.D0(arrayList, 3);
        } else if (size == 4) {
            listC = kotlin.collections.a.c(arrayList.get(3));
        } else {
            listC = size == 5 ? kotlin.collections.a.c(arrayList.get(4)) : iun.f15405a;
        }
        return new jkk(arrayList, listC);
    }

    public static final long T(ctf0 ctf0Var, boolean z) {
        return z ? fbc.d(ctf0Var.a(R.color.static_green)) : fbc.d(ctf0.b(R.attr.uikitTextPrimary, ctf0Var));
    }

    public static final List U(List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (((HistoryMenuItem) obj) != HistoryMenuItem.c) {
                arrayListU.add(obj);
            }
        }
        return CollectionsKt.A0(arrayListU, new vvt((byte) 14));
    }

    public static final itb V(htb htbVar) {
        return new itb(htbVar, false);
    }

    public static final long W(i6l i6lVar) {
        i6lVar.getClass();
        if (e4l.f7187a[i6lVar.ordinal()] == 1) {
            int i = kkg.K;
            return kkg.k;
        }
        int i2 = kkg.K;
        return kkg.l;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    public static final a5l X(ual ualVar, ctf0 ctf0Var) {
        ualVar.getClass();
        ctf0Var.getClass();
        z4l z4lVar = ualVar.b;
        String strM = twn.m(z4lVar.f43775a, "BUYBACK_ITEM");
        String str = z4lVar.q;
        int i = z4lVar.p;
        String str2 = ualVar.f35334a;
        String strA = "";
        if (!kotlin.text.c.x(str2, ujn.h, false)) {
            if (str2.length() == 0) {
                str2 = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str2)) {
                    str2 = "";
                } else {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
        }
        String strA2 = i == 0 ? ctf0Var.b.a(R.string.cybergame_dota_yes_buyback_new, Arrays.copyOf(new Object[0], 0)) : "";
        long jW = W(z4lVar.r);
        if (i != 0) {
            strA = ctf0Var.b.a(R.string.cybergame_dota_no_buyback_new_v2, Arrays.copyOf(new Object[]{String.valueOf(i)}, 1));
        }
        return new a5l(strM, str2, str, new a4l(strA2, strA, jW));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    public static final a5l Y(ual ualVar) {
        ualVar.getClass();
        z4l z4lVar = ualVar.b;
        String strM = twn.m(z4lVar.f43775a, "TOTAL_VALUE_ITEM");
        String str = z4lVar.q;
        String str2 = ualVar.f35334a;
        if (!kotlin.text.c.x(str2, ujn.h, false)) {
            if (str2.length() == 0) {
                str2 = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str2)) {
                    str2 = "";
                } else {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
        }
        return new a5l(strM, str2, str, new a4l(String.valueOf(z4lVar.j.f), "", W(z4lVar.r)));
    }

    public static final cso Z(hso hsoVar) {
        ldx ldxVar;
        ndf ndfVar;
        wcv0 wcv0Var;
        hsoVar.getClass();
        odx odxVar = hsoVar.f13594a;
        if (odxVar != null) {
            Integer num = odxVar.f25097a;
            int iIntValue = num != null ? num.intValue() : 0;
            Integer num2 = odxVar.b;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            Double d = odxVar.c;
            double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
            String str = odxVar.d;
            ldxVar = new ldx(dDoubleValue, iIntValue, iIntValue2, str == null ? "" : str);
        } else {
            ldxVar = new ldx(0.0d, 0, 0, "");
        }
        sdf sdfVar = hsoVar.b;
        if (sdfVar != null) {
            zcv0 zcv0Var = sdfVar.f32032a;
            if (zcv0Var != null) {
                String str2 = zcv0Var.f44184a;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = zcv0Var.b;
                wcv0Var = new wcv0(str2, str3 != null ? str3 : "");
            } else {
                wcv0Var = new wcv0("", "");
            }
            ndfVar = new ndf(wcv0Var);
        } else {
            ndfVar = new ndf(new wcv0("", ""));
        }
        return new cso(ldxVar, ndfVar);
    }

    public static final void a(uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fet fetVar, int i) {
        int i2;
        ovl ovlVar;
        boolean z;
        tzh tzhVar;
        woo0 woo0Var;
        String str;
        String str2;
        String str3;
        String str4;
        fetVar.g0(-1145493612);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(uzhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function3) ? 16384 : 8192;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            a4x a4xVar = uzhVar.j;
            ovl ovlVar2 = uzhVar.r;
            String str5 = ovlVar2.b;
            tzh tzhVar2 = uzhVar.t;
            woo0 woo0Var2 = woo0.f39508a;
            if (a4xVar == null || a4xVar.isEmpty()) {
                ovlVar = ovlVar2;
                z = false;
                tzhVar = tzhVar2;
                woo0Var = woo0Var2;
                fetVar.e0(-90332892);
                fetVar.r(false);
            } else {
                fetVar.e0(-90742588);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                String str6 = uzhVar.f;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                tzhVar = tzhVar2;
                woo0Var = woo0Var2;
                ovlVar = ovlVar2;
                z = false;
                u1c.g(mm40VarD, str6, g1t0.g(), uzhVar.j, woo0Var, tzhVar2.b, function0, fetVar, ((i3 << 15) & 3670016) | 24582);
                fetVar.r(false);
            }
            a4x a4xVar2 = uzhVar.k;
            if (a4xVar2 == null || a4xVar2.isEmpty()) {
                fetVar.e0(-89864668);
                fetVar.r(z);
            } else {
                fetVar.e0(-90258027);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                String str7 = uzhVar.g;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                u1c.g(mm40VarD2, str7, g1t0.g(), uzhVar.k, woo0Var, tzhVar.c, function1, fetVar, ((i3 << 12) & 3670016) | 24582);
                fetVar.r(z);
            }
            if ((str5 == 0 || str5.length() == 0) && ((str = ovlVar.c) == null || str.length() == 0)) {
                fetVar.e0(-88425276);
                fetVar.r(z);
            } else {
                fetVar.e0(-89683535);
                String str8 = ovlVar.f25931a;
                String str9 = str5 == 0 ? "" : str5;
                String str10 = ovlVar.c;
                long backgroundContent = afn0.m(fetVar).getBackgroundContent();
                long secondary = afn0.m(fetVar).getSecondary();
                long textPrimary = afn0.m(fetVar).getTextPrimary();
                long secondary2 = afn0.m(fetVar).getSecondary();
                boolean z2 = tzhVar.f34803a;
                tnm tnmVar = tnm.f34243a;
                long primary = afn0.m(fetVar).getPrimary();
                long primary2 = afn0.m(fetVar).getPrimary();
                long background = afn0.m(fetVar).getBackground();
                zcl zclVar = qmk.f28987a;
                y8n y8nVar = new y8n(str8, str9, str10, backgroundContent, secondary, textPrimary, secondary2, z2, new unm(tnmVar, primary, primary2, background, 8.0f, 4.0f, uzhVar.q, 100, false, 768));
                afn0.v(fetVar).getClass();
                wha0.n(null, g1t0.g(), y8nVar, fetVar, 0, 1);
                fetVar.r(z);
            }
            String str11 = uzhVar.h;
            if (str11 == null || str11.length() == 0 || (str4 = uzhVar.m) == null || str4.length() == 0) {
                fetVar.e0(-88050300);
                fetVar.r(z);
            } else {
                fetVar.e0(-88317458);
                String str12 = uzhVar.h;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                gq80.r(null, str12, g1t0.g(), uzhVar.m, tzhVar.d, fetVar, 0);
                fetVar.r(z);
            }
            String str13 = uzhVar.i;
            if (str13 == null || str13.length() == 0 || (str3 = uzhVar.n) == null || str3.length() == 0) {
                fetVar.e0(-87664412);
                fetVar.r(z);
            } else {
                fetVar.e0(-87940219);
                String str14 = uzhVar.i;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                gq80.r(null, str14, g1t0.g(), uzhVar.n, false, fetVar, 0);
                fetVar.r(z);
            }
            String str15 = uzhVar.o;
            if ((str15 == null || str15.length() == 0) && ((str2 = uzhVar.p) == null || str2.length() == 0)) {
                fetVar.e0(-87274556);
                fetVar.r(z);
            } else {
                fetVar.e0(-87555168);
                pzb.l(uzhVar.o, uzhVar.p, function2, function3, fetVar, (i3 >> 3) & 8064);
                fetVar.r(z);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(uzhVar, function0, function1, function2, function3, i);
        }
    }

    public static final cmr a0(imr imrVar) {
        dmr dmrVar;
        imrVar.getClass();
        fmr fmrVar = imrVar.f15039a;
        if (fmrVar != null) {
            switch (fmrVar.ordinal()) {
                case 0:
                    dmrVar = dmr.f6334a;
                    break;
                case 1:
                    dmrVar = dmr.b;
                    break;
                case 2:
                    dmrVar = dmr.c;
                    break;
                case 3:
                    dmrVar = dmr.d;
                    break;
                case 4:
                    dmrVar = dmr.e;
                    break;
                case 5:
                    dmrVar = dmr.f;
                    break;
                case 6:
                    dmrVar = dmr.g;
                    break;
                case 7:
                    dmrVar = dmr.h;
                    break;
                case 8:
                    dmrVar = dmr.i;
                    break;
                case 9:
                    dmrVar = dmr.j;
                    break;
                case 10:
                    dmrVar = dmr.k;
                    break;
                case 11:
                    dmrVar = dmr.l;
                    break;
                case 12:
                    dmrVar = dmr.m;
                    break;
                case 13:
                    dmrVar = dmr.n;
                    break;
                case 14:
                    dmrVar = dmr.o;
                    break;
                case 15:
                    dmrVar = dmr.p;
                    break;
                case 16:
                    dmrVar = dmr.q;
                    break;
                case 17:
                    dmrVar = dmr.r;
                    break;
                case 18:
                    dmrVar = dmr.s;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    dmrVar = dmr.t;
                    break;
                case 20:
                    dmrVar = dmr.u;
                    break;
                case 21:
                    dmrVar = dmr.v;
                    break;
                case 22:
                    dmrVar = dmr.w;
                    break;
                case 23:
                    dmrVar = dmr.x;
                    break;
                case 24:
                    dmrVar = dmr.y;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    dmrVar = dmr.z;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    dmrVar = dmr.A;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    dmrVar = dmr.Y;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    dmrVar = dmr.Z;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    dmrVar = dmr.f1;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    dmrVar = dmr.B;
                    break;
                default:
                    t9f.b();
                    return null;
            }
        } else {
            dmrVar = dmr.f6334a;
        }
        String str = imrVar.b;
        if (str == null) {
            str = "";
        }
        return new cmr(dmrVar, str);
    }

    public static final void b(uzh uzhVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        boolean z;
        fet fetVar2 = fetVar;
        zx7 zx7Var = gqw0.e;
        fetVar2.g0(1486630728);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(uzhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarD, 8.0f, 12.0f, 8.0f, 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 32.0f, 8.0f, 3);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarN2 = o7k0.n(jm40Var, 52.0f);
            q7n q7nVar = uzhVar.s;
            v(0, fetVar2, mm40VarN2);
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), true);
            int i3 = i2;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarH);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            G(null, uzhVar, fetVar2, (i3 << 3) & 112);
            fetVar2.e0(-1946009475);
            mm40 mm40VarB = o7k0.b(o7k0.e(jm40Var, 20.0f), 20.0f, 0.0f, 2);
            long jM87getDarkOrange0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m87getDarkOrange0d7_KjU();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarB, jM87getDarkOrange0d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 6.0f, 0.0f, 2);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarL);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            fxb.k(q7nVar.b, new qol(null, 15), null, tol.b, jwb.E(hew0.b, fetVar2), null, function1, fetVar, ((i3 << 12) & 3670016) | 3072, 36);
            fetVar.r(true);
            fetVar.r(false);
            fetVar.r(true);
            fetVar.r(true);
            if (uzhVar.l) {
                fetVar.e0(1951611808);
                mm40 mm40VarN3 = o7k0.n(jr8.f16991a.b(jm40Var, gqw0.c), 24.0f);
                zfn zfnVar = zaq0.b;
                long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
                zcl zclVar3 = qmk.m;
                mm40 mm40VarQ = i120.Q(mm40VarN3, background, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3));
                tj30 tj30VarC3 = zq8.c(zx7Var, false);
                int iHashCode5 = Long.hashCode(fetVar.T);
                bh90 bh90VarM5 = fetVar.m();
                mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarQ);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC3, shdVar);
                jpm0.o(fetVar, bh90VarM5, shdVar2);
                vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC4, shdVar4);
                fetVar2 = fetVar;
                dww.c(a8k0.F(R.drawable.ic_glyph_cancel, 0, fetVar), null, y860.Y(o7k0.n(jm40Var, 24.0f), false, null, null, function0, 15), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                z = true;
                fetVar2.e0(1952430580);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) uzhVar, function0, function1, i, (byte) 2);
        }
    }

    public static final izr b0(d0t d0tVar, boolean z, boolean z2, String str, ctf0 ctf0Var, ArrayList arrayList, String str2, boolean z3, boolean z4, String str3) {
        d0tVar.getClass();
        str.getClass();
        ctf0Var.getClass();
        str2.getClass();
        long j = d0tVar.f5282a;
        dur durVarY = xbc.Y(d0tVar, str2, str3, arrayList, z, z2, true, z3, z4);
        qtr qtrVarF0 = vbc.f0(d0tVar, false, true, false);
        ezr ezrVar = new ezr(d0tVar.q.f8731a, qzb.c0(d0tVar));
        fzr fzrVar = new fzr(d0tVar.r.f8731a, qzb.r0(d0tVar));
        long j2 = d0tVar.s;
        boolean z5 = d0tVar.C;
        czr czrVar = new czr(z5 ? qzb.H0(d0tVar) : qzb.E0(d0tVar) ? 1 : 2, j2, str, z5 ? qzb.H0(d0tVar) : qzb.E0(d0tVar));
        fus fusVar = new fus(z5 ? d0tVar.p.j : d0tVar.t, d0tVar.P.getTime(), z5 ? qzb.H0(d0tVar) : qzb.E0(d0tVar), !z5);
        CharSequence charSequenceG0 = qzb.G0(d0tVar, ctf0Var.a(R.color.static_green), false);
        if (charSequenceG0.length() == 0) {
            charSequenceG0 = ctf0Var.f(R.string.vs, new Object[0]);
        }
        return new izr(j, durVarY, qtrVarF0, ezrVar, fzrVar, czrVar, fusVar, charSequenceG0);
    }

    public static final void c(mm40 mm40Var, uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fet fetVar, int i) {
        int i2;
        uzh uzhVar2;
        Function0 function4;
        Function0 function5;
        Function0 function6;
        Function0 function7;
        fetVar.g0(1524886229);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            uzhVar2 = uzhVar;
            i2 |= fetVar.g(uzhVar2) ? 32 : 16;
        } else {
            uzhVar2 = uzhVar;
        }
        if ((i & 384) == 0) {
            function4 = function0;
            i2 |= fetVar.i(function4) ? 256 : 128;
        } else {
            function4 = function0;
        }
        if ((i & 3072) == 0) {
            function5 = function1;
            i2 |= fetVar.i(function5) ? 2048 : 1024;
        } else {
            function5 = function1;
        }
        if ((i & 24576) == 0) {
            function6 = function2;
            i2 |= fetVar.i(function6) ? 16384 : 8192;
        } else {
            function6 = function2;
        }
        if ((196608 & i) == 0) {
            function7 = function3;
            i2 |= fetVar.i(function7) ? 131072 : 65536;
        } else {
            function7 = function3;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            jm40 jm40Var = jm40.b;
            zcl zclVar = qmk.i;
            int i3 = i2;
            mm40 mm40VarQ = i120.Q(dw9.i(zclVar, zclVar, zclVar, zclVar, jm40Var), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            a(uzhVar2, function4, function5, function6, function7, fetVar, (i3 >> 3) & 65534);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var, (Object) uzhVar, (Object) function0, (Object) function1, (Object) function2, (Object) function3, i, (byte) 14);
        }
    }

    public static final xem c0(d0t d0tVar) {
        int i = d0tVar.p.g;
        boolean z = i == 1;
        boolean z2 = i == 2;
        if (z) {
            return vem.f37292a;
        }
        return z2 ? wem.f39025a : tem.f33827a;
    }

    public static final void d(mm40 mm40Var, String str, kpm kpmVar, boolean z, fet fetVar, int i) {
        fet fetVar2;
        boolean z2;
        fetVar.g0(-37092493);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(kpmVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 24.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            int i3 = i2 >> 3;
            n4c.l(null, kpmVar, z, fetVar, 1);
            if (str.length() > 0) {
                fetVar.e0(1378478983);
                mm40 mm40VarE = o7k0.e(s5x0.N(o7k0.d(jm40.b, 1.0f), 0.0f, 10.0f, 0.0f, 0.0f, 13), 28.0f);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                z2 = true;
                v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, i3 & 14, 24960, 109562);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                z2 = true;
                fetVar2.e0(1379061349);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0((byte) 21, i, (Object) mm40Var, (Object) str, (Object) kpmVar, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:109:0x0138  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    public static final pqs d0(b5h0 b5h0Var, long j) {
        ?? arrayList;
        jts jtsVar;
        jts jtsVar2;
        String str;
        String str2;
        String str3;
        h4h0 h4h0Var;
        g4h0 g4h0Var;
        h4h0 h4h0Var2;
        g4h0 g4h0Var2;
        Integer num;
        Integer num2;
        String strValueOf;
        String strValueOf2;
        String str4 = null;
        if (b5h0Var == null) {
            return null;
        }
        String str5 = b5h0Var.f2004a;
        i4h0 i4h0Var = b5h0Var.c;
        List listI0 = str5 != null ? StringsKt.i0(str5, new char[]{'-'}, 6) : null;
        if (listI0 == null) {
            listI0 = iun.f15405a;
        }
        String str6 = (String) CollectionsKt.W(0, listI0);
        if (str6 == null) {
            str6 = "0";
        }
        String str7 = (String) CollectionsKt.W(1, listI0);
        if (str7 == null) {
            str7 = "0";
        }
        String str8 = b5h0Var.b;
        String str9 = str8 == null ? "" : str8;
        String str10 = str5 == null ? "" : str5;
        List<l4h0> list = b5h0Var.d;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (l4h0 l4h0Var : list) {
                String strValueOf3 = l4h0Var.f19405a;
                if (strValueOf3 == null) {
                    Integer num3 = l4h0Var.b;
                    strValueOf3 = num3 != null ? String.valueOf(num3.intValue()) : null;
                    if (strValueOf3 == null) {
                        strValueOf3 = "0";
                    }
                }
                Integer num4 = l4h0Var.c;
                if (num4 == null || (strValueOf = String.valueOf(num4.intValue())) == null) {
                    strValueOf = "0";
                }
                Integer num5 = l4h0Var.d;
                if (num5 == null || (strValueOf2 = String.valueOf(num5.intValue())) == null) {
                    strValueOf2 = "0";
                }
                arrayList.add(new ue90(strValueOf3, strValueOf, strValueOf2));
            }
        } else {
            arrayList = iun.f15405a;
        }
        ?? r14 = arrayList;
        Integer num6 = b5h0Var.e;
        int iIntValue = num6 != null ? num6.intValue() : 0;
        Integer num7 = b5h0Var.f;
        int iIntValue2 = num7 != null ? num7.intValue() : 0;
        Integer num8 = b5h0Var.g;
        int iIntValue3 = num8 != null ? num8.intValue() : 0;
        if (j == 66) {
            if (i4h0Var != null) {
                b4h0 b4h0Var = i4h0Var.f14146a;
                jtsVar = new jts((b4h0Var == null || (num2 = b4h0Var.f1958a) == null || num2.intValue() != 1) ? null : b4h0Var.c, (b4h0Var == null || (num = b4h0Var.f1958a) == null || num.intValue() != 2) ? null : b4h0Var.c, null, null);
            } else {
                jtsVar2 = null;
            }
            str = b5h0Var.i;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            if (i4h0Var != null || (h4h0Var2 = i4h0Var.b) == null || (g4h0Var2 = h4h0Var2.f12432a) == null) {
                str3 = null;
            } else {
                str3 = g4h0Var2.f10667a;
            }
            String strJ0 = sj3.j0(str3, str6);
            if (i4h0Var != null && (h4h0Var = i4h0Var.b) != null && (g4h0Var = h4h0Var.f12432a) != null) {
                str4 = g4h0Var.b;
            }
            return new pqs(str9, str10, r14, strJ0, sj3.j0(str4, str7), iIntValue, iIntValue2, iIntValue3, jtsVar2, str2);
        }
        r4h0 r4h0Var = b5h0Var.h;
        String str11 = r4h0Var != null ? r4h0Var.f29835a : null;
        String str12 = r4h0Var != null ? r4h0Var.b : null;
        x4h0 x4h0Var = b5h0Var.o;
        jtsVar = new jts(str11, str12, x4h0Var != null ? x4h0Var.f40264a : null, x4h0Var != null ? x4h0Var.b : null);
        jtsVar2 = jtsVar;
        str = b5h0Var.i;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (i4h0Var != null) {
            str3 = null;
        } else {
            str3 = null;
        }
        String strJ1 = sj3.j0(str3, str6);
        if (i4h0Var != null) {
            str4 = g4h0Var.b;
        }
        return new pqs(str9, str10, r14, strJ1, sj3.j0(str4, str7), iIntValue, iIntValue2, iIntValue3, jtsVar2, str2);
    }

    public static final void e(mm40 mm40Var, ykb ykbVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1907751298);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ykbVar) ? 32 : 16;
        }
        byte b = 1;
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
            nkb.h(s5x0.N(o7k0.d(mm40Var2, 1.0f), xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 0.0f, 10), ykbVar.f42780a, kjm.f18392a, null, null, null, fetVar, 384, 56);
            e3c.c(s5x0.I(o7k0.d(mm40Var2, 1.0f), s5x0.t(xfn.a(fetVar).c, 0.0f, 2)), ykbVar.b, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var2, ykbVar, i, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0047  */
    /* JADX WARN: Code duplicated, block: B:50:0x0077  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    public static final lov e0(qpv qpvVar) {
        String str;
        String str2;
        ?? arrayList;
        ?? arrayList2;
        List list;
        List list2;
        List list3;
        Object next;
        Object next2;
        cpv cpvVar = qpvVar.b;
        List list4 = qpvVar.f29139a;
        ?? arrayList3 = 0;
        arrayList3 = 0;
        String str3 = cpvVar != null ? cpvVar.f4767a : null;
        String str4 = str3 == null ? "" : str3;
        String str5 = cpvVar != null ? cpvVar.b : null;
        String str6 = str5 == null ? "" : str5;
        if (list4 != null) {
            Iterator it = list4.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!Intrinsics.d(((opv) next2).f25660a, cpvVar != null ? cpvVar.f4767a : null));
            opv opvVar = (opv) next2;
            if (opvVar != null) {
                str = opvVar.b;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        String str7 = str == null ? "" : str;
        if (list4 != null) {
            Iterator it2 = list4.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.d(((opv) next).f25660a, cpvVar != null ? cpvVar.b : null));
            opv opvVar2 = (opv) next;
            if (opvVar2 != null) {
                str2 = opvVar2.b;
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        String str8 = str2 == null ? "" : str2;
        if (cpvVar == null || (list3 = cpvVar.e) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList.add(g0((apv) it3.next(), list4 == null ? iun.f15405a : list4));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ?? r9 = arrayList;
        if (cpvVar == null || (list2 = cpvVar.c) == null) {
            arrayList2 = 0;
        } else {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(g0((apv) it4.next(), list4 == null ? iun.f15405a : list4));
            }
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        ?? r10 = arrayList2;
        if (cpvVar != null && (list = cpvVar.d) != null) {
            arrayList3 = new ArrayList(r3d.q(list, 10));
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList3.add(g0((apv) it5.next(), list4 == null ? iun.f15405a : list4));
            }
        }
        if (arrayList3 == 0) {
            arrayList3 = iun.f15405a;
        }
        return new lov(str4, str6, str7, str8, r9, r10, arrayList3);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:42:0x0109  */
    /* JADX WARN: Code duplicated, block: B:43:0x010b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0156  */
    /* JADX WARN: Code duplicated, block: B:53:0x0160  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void f(final mm40 mm40Var, final e900 e900Var, final int i, boolean z, fet fetVar, final int i2, final int i3) {
        boolean z2;
        boolean z3;
        final boolean z4;
        yfe0 yfe0VarU;
        jm40 jm40Var;
        Iterator it;
        int iNextInt;
        boolean z5;
        fetVar.g0(1329233834);
        int i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(e900Var) ? 32 : 16);
        int i5 = i3 & 8;
        if (i5 == 0) {
            if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= fetVar.h(z2) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i4 & 1, z3)) {
                if (i5 != 0) {
                    z2 = true;
                }
                long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                zcl zclVar = qmk.g;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarQ = i120.Q(mm40Var, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar));
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
                jm40Var = jm40.b;
                if (z2) {
                    fetVar.e0(-1628573278);
                    zq8.a(0, fetVar, i120.P(o7k0.p(s5x0.M(jm40Var, 12.0f, 18.0f, 12.0f, 10.0f), 128.0f, 20.0f), e900Var, vgg0.f37379a, 4));
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1628284978);
                    fetVar.r(false);
                }
                fetVar.e0(2025685988);
                it = l1e0.o(0, i).iterator();
                while (((kkx) it).c) {
                    iNextInt = ((bkx) it).nextInt();
                    if (iNextInt % 2 == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    u(i4 & 112, fetVar, e900Var, z5);
                    if (iNextInt < i - 1) {
                        fetVar.e0(463516926);
                        mm40 mm40VarQ2 = i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
                        zcl zclVar2 = qmk.f28987a;
                        rcb.p(0, fetVar, s5x0.N(mm40VarQ2, 64.0f, 0.0f, 0.0f, 0.0f, 14));
                        fetVar.r(false);
                    } else {
                        fetVar.e0(463739878);
                        fetVar.r(false);
                    }
                }
                fetVar.r(false);
                fetVar.r(true);
            } else {
                fetVar.X();
            }
            z4 = z2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.ccd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xkb.f(mm40Var, e900Var, i, z4, (fet) obj, x8x.L(i2 | 1), i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 3072;
        z2 = z;
        if ((i4 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i4 & 1, z3)) {
            if (i5 != 0) {
                z2 = true;
            }
            long backgroundContent2 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar3 = qmk.g;
            ugg0 ugg0Var2 = vgg0.f37379a;
            mm40 mm40VarQ3 = i120.Q(mm40Var, backgroundContent2, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3));
            x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ3);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            jm40Var = jm40.b;
            if (z2) {
                fetVar.e0(-1628573278);
                zq8.a(0, fetVar, i120.P(o7k0.p(s5x0.M(jm40Var, 12.0f, 18.0f, 12.0f, 10.0f), 128.0f, 20.0f), e900Var, vgg0.f37379a, 4));
                fetVar.r(false);
            } else {
                fetVar.e0(-1628284978);
                fetVar.r(false);
            }
            fetVar.e0(2025685988);
            it = l1e0.o(0, i).iterator();
            while (((kkx) it).c) {
                iNextInt = ((bkx) it).nextInt();
                if (iNextInt % 2 == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                u(i4 & 112, fetVar, e900Var, z5);
                if (iNextInt < i - 1) {
                    fetVar.e0(463516926);
                    mm40 mm40VarQ4 = i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    zcl zclVar4 = qmk.f28987a;
                    rcb.p(0, fetVar, s5x0.N(mm40VarQ4, 64.0f, 0.0f, 0.0f, 0.0f, 14));
                    fetVar.r(false);
                } else {
                    fetVar.e0(463739878);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        z4 = z2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ccd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xkb.f(mm40Var, e900Var, i, z4, (fet) obj, x8x.L(i2 | 1), i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final String f0(n3w n3wVar) {
        n3wVar.getClass();
        if (!n3wVar.P1 || !H(n3wVar)) {
            return "";
        }
        List list = n3wVar.J1;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((su6) it.next()).h1));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).longValue() != 0) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.b0(arrayList2, null, null, null, null, 63);
    }

    public static final void g(jie jieVar, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-837889450);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(jieVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(mm40Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String str = jieVar.f16570a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.k(), fetVar, 0, 24960, 110586);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13), "SubTitleTestTag");
            String str2 = jieVar.b;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, mm40VarE0, jieVar.c, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(jieVar, mm40Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:95:0x010c  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    public static final n4t0 g0(apv apvVar, List list) {
        Object next;
        Object next2;
        g4t0 f4t0Var;
        e4t0 e4t0Var;
        String str;
        String str2;
        List list2;
        List list3;
        apvVar.getClass();
        String str3 = apvVar.c;
        String str4 = apvVar.b;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((opv) next).f25660a, str4));
        opv opvVar = (opv) next;
        mpv mpvVar = (opvVar == null || (list3 = opvVar.d) == null) ? null : (mpv) CollectionsKt.firstOrNull(list3);
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.d(((opv) next2).f25660a, str3));
        opv opvVar2 = (opv) next2;
        mpv mpvVar2 = (opvVar2 == null || (list2 = opvVar2.d) == null) ? null : (mpv) CollectionsKt.firstOrNull(list2);
        String str5 = apvVar.f1270a;
        Integer num = apvVar.e;
        if (str5 == null) {
            str5 = "";
        }
        Long l = apvVar.g;
        long jLongValue = l != null ? l.longValue() : 0L;
        String str6 = str4 == null ? "" : str4;
        String str7 = mpvVar != null ? mpvVar.b : null;
        if (str7 == null) {
            str7 = "";
        }
        String strT = vsm0.t(str7);
        String str8 = mpvVar != null ? mpvVar.f22196a : null;
        if (str8 == null) {
            str8 = "";
        }
        m4t0 m4t0Var = new m4t0(str6, strT, str8);
        long j = jLongValue;
        String str9 = str3 == null ? "" : str3;
        String str10 = mpvVar2 != null ? mpvVar2.b : null;
        if (str10 == null) {
            str10 = "";
        }
        String strT2 = vsm0.t(str10);
        String str11 = mpvVar2 != null ? mpvVar2.f22196a : null;
        if (str11 == null) {
            str11 = "";
        }
        m4t0 m4t0Var2 = new m4t0(str9, strT2, str11);
        if (!Intrinsics.d(apvVar.f, Boolean.TRUE)) {
            Integer num2 = apvVar.d;
            if (num2 == null && num == null) {
                if (str4 == null) {
                    str4 = "";
                }
                if (str3 == null) {
                    str3 = "";
                }
                e4t0Var = new e4t0(L(apvVar, str4, str3));
            } else {
                int iIntValue = num2 != null ? num2.intValue() : 0;
                int iIntValue2 = num != null ? num.intValue() : 0;
                if (str4 == null) {
                    str4 = "";
                }
                if (str3 == null) {
                    str3 = "";
                }
                f4t0Var = new f4t0(iIntValue, iIntValue2, L(apvVar, str4, str3));
            }
            str = apvVar.i;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            return new n4t0(str5, j, m4t0Var, m4t0Var2, f4t0Var, str2);
        }
        if (str4 == null) {
            str4 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        e4t0Var = new e4t0(L(apvVar, str4, str3));
        f4t0Var = e4t0Var;
        str = apvVar.i;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        return new n4t0(str5, j, m4t0Var, m4t0Var2, f4t0Var, str2);
    }

    public static final void h(mm40 mm40Var, fuf fufVar, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(2001327134);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(fufVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            long jZ = ((w6k) fetVar2.k(bmd.h)).z(1);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            v8q0.a(fufVar.d, o2e.e0(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), "GUILTY_GEAR_ROUND_TITLE"), StaticColors.INSTANCE.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), 0L, 0L, null, null, null, jZ, null, null, 0, 0, 0L, null, null, 16777087), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            F(fufVar.e, fetVar2, 0);
            b = 1;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new guf(mm40Var, fufVar, i, b);
        }
    }

    public static final Pair h0(d0t d0tVar, ctf0 ctf0Var) {
        List listI0 = StringsKt.i0(d0tVar.p.c, new char[]{'-'}, 6);
        String strQ = Q(d0tVar, dmr.e);
        if (strQ.length() == 0 && (strQ = (String) CollectionsKt.firstOrNull(listI0)) == null) {
            strQ = "";
        }
        String strQ2 = Q(d0tVar, dmr.f);
        if (strQ2.length() == 0) {
            String str = (String) CollectionsKt.f0(listI0);
            strQ2 = str == null ? "" : str;
        }
        List listSplit$default = StringsKt__StringsKt.split$default(Q(d0tVar, dmr.t), new String[]{Separators.SEMICOLON}, false, 0, 6, null);
        String str2 = (String) CollectionsKt.firstOrNull(listSplit$default);
        Integer intOrNull = str2 != null ? StringsKt.toIntOrNull(str2) : null;
        String str3 = (String) CollectionsKt.f0(listSplit$default);
        Pair pair = (intOrNull == null || str3 == null) ? new Pair(0, "") : new Pair(intOrNull, Separators.SP.concat(ctf0Var.b.a(R.string.cricket_current_over, Arrays.copyOf(new Object[]{str3}, 1))));
        int iIntValue = ((Number) pair.f46059a).intValue();
        String str4 = (String) pair.b;
        if (iIntValue == 1) {
            strQ = kng0.k(strQ, str4);
        } else if (iIntValue == 2) {
            strQ2 = kng0.k(strQ2, str4);
        }
        return new Pair(strQ, strQ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final void i(mm40 mm40Var, smh smhVar, Function0 function0, fet fetVar, int i) {
        int i2;
        smh smhVar2;
        pcy pcyVar;
        ?? r2;
        zfn zfnVar;
        float f;
        fet fetVar2;
        jm40 jm40Var;
        fet fetVar3 = fetVar;
        smhVar.getClass();
        String str = smhVar.e;
        function0.getClass();
        fetVar3.g0(-780731219);
        if ((i & 6) == 0) {
            i2 = i | (fetVar3.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar3.g(smhVar) ? 32 : 16) | (fetVar3.i(function0) ? 256 : 128);
        if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 80.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            zfn zfnVar2 = zaq0.b;
            mm40 mm40VarS = i120.S(mm40VarE2, 1.0f, ((ThemeColors) fetVar3.k(zfnVar2)).getSeparator60(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar3.P();
            if (z || objP == ukd.f35823a) {
                objP = new pk9(function0, (byte) 21);
                fetVar3.o0(objP);
            }
            mm40 mm40VarO = feb.O(mm40VarS, (Function0) objP);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarO);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z2 = fetVar3.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar3.l(pcyVar2);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            pm80 pm80VarF = a8k0.F(R.drawable.tournament_card_placeholder, 0, fetVar3);
            String str2 = smhVar.b;
            rmh rmhVar = smhVar.f;
            omh omhVar = smhVar.c;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), 64.0f);
            zcl zclVar3 = qmk.f;
            k7x.b(str2, null, i120.Q(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarN), StaticColors.INSTANCE.m95getGray0d7_KjU(), jd8.n), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar, 36912, 0, 32736);
            fet fetVar4 = fetVar;
            mm40 mm40VarL = s5x0.L(jm40Var2, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar4, 0);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarL);
            fetVar4.i0();
            if (fetVar4.S) {
                pcyVar = pcyVar2;
                fetVar4.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar4.r0();
            }
            jpm0.o(fetVar4, x5dVarA, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar4);
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar4, 48);
            int iHashCode3 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM3 = fetVar4.m();
            mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarD);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, thg0VarA2, shdVar);
            jpm0.o(fetVar4, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC2, shdVar4);
            if (omhVar instanceof mmh) {
                fetVar4.e0(-1626343064);
                zfnVar = zfnVar2;
                r2 = 0;
                f = 1.0f;
                lgb.v(o7k0.n(jm40Var2, 20.0f), o7k0.n(jm40Var2, 20.0f), ((mmh) omhVar).f22037a, R.drawable.ic_glyph_cyber_gamepad, ((ThemeColors) fetVar4.k(zfnVar)).getSecondary(), gqw0.f1, fetVar4, 196608, 0);
                fetVar4.r(false);
            } else {
                r2 = 0;
                zfnVar = zfnVar2;
                f = 1.0f;
                fetVar4.e0(-1625867369);
                fetVar4.r(false);
            }
            if (str.length() > 0) {
                fetVar4.e0(-1625761814);
                mm40 mm40VarH = dw9.h(f, s5x0.L(jm40Var2, 6.0f, 0.0f, 2), r2);
                long secondary = ((ThemeColors) fetVar4.k(zfnVar)).getSecondary();
                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                v8q0.a(str, mm40VarH, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 110584);
                fet fetVar5 = fetVar;
                fetVar5.r(r2);
                fetVar2 = fetVar5;
            } else {
                fetVar4.e0(-1625270185);
                fetVar4.r(r2);
                fetVar2 = fetVar4;
            }
            if (rmhVar instanceof pmh) {
                fetVar2.e0(-1625172442);
                jm40Var = jm40Var2;
                kpb.l(R.style.Widget_DSTag_RectangularS_Red, r2, fetVar2, s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 1.0f, 7), ((pmh) rmhVar).f27234a);
                fetVar2.r(r2);
            } else {
                jm40Var = r15;
                fetVar2.e0(-1624910089);
                fetVar2.r(r2);
            }
            fetVar2.r(true);
            smhVar2 = smhVar;
            String str3 = smhVar2.d;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            long j = qmk.q;
            long j2 = qmk.s;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            kc5.N(str3, o7k0.d(jm40Var, f), textPrimary, null, null, 0L, j, j2, null, null, 0L, null, 2, false, 1, 0, false, null, g1t0.i(), 0.0f, fetVar, 48, 1597440, 0, 3063608);
            fetVar3 = fetVar;
            fetVar3.r(true);
            fetVar3.r(true);
        } else {
            smhVar2 = smhVar;
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51((Object) mm40Var, (Object) smhVar2, (Object) function0, i, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e7 -> B:41:0x00f3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object i0(a.myn r17, a.o1x r18, a.a780 r19, a.gqw0 r20, a.zje r21) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xkb.i0(a.myn, a.o1x, a.a780, a.gqw0, a.zje):java.lang.Object");
    }

    public static final void j(mm40 mm40Var, fuh fuhVar, fet fetVar, int i) {
        mm40Var.getClass();
        fuhVar.getClass();
        fetVar.g0(420239253);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(fuhVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(322960085, new vvh(mm40Var, fuhVar), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vvh(mm40Var, fuhVar, i);
        }
    }

    public static final void k(euh euhVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1029834079);
        int i2 = i | (fetVar2.g(euhVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            j0x.b(a8k0.F(euhVar.b, 0, fetVar2), null, o7k0.n(jm40Var, 16.0f), null, gqw0.f1, 0.0f, null, fetVar2, 24632, 104);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            String str = euhVar.f8420a;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarN2, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yfg(euhVar, i, (byte) 11);
        }
    }

    public static final void l(mm40 mm40Var, uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        fetVar2.g0(-874756864);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(uzhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.i(function4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar2.i(function5) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (4793491 & i3) != 4793490)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 320.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(dw9.i(zclVar2, zclVar2, zclVar2, zclVar2, jm40Var), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            int i4 = i3 >> 3;
            b(uzhVar, function2, function5, fetVar2, (i4 & 14) | ((i3 >> 9) & 112) | ((i3 >> 15) & 896));
            mbc.o(zfi0.f44303a, s5x0.L(jm40Var, 8.0f, 0.0f, 2), false, fetVar2, 6, 4);
            c(o7k0.d(jm40Var, 1.0f), uzhVar, function0, function1, function3, function4, fetVar, (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168) | (57344 & i4) | (458752 & i4));
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wml(mm40Var, uzhVar, function0, function1, function2, function3, function4, function5, i, (byte) 2);
        }
    }

    public static final void m(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        byte b;
        mm40 mm40Var2;
        fetVar.g0(1530033495);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        byte b2 = 1;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            b = 1;
            fetVar.X();
            mm40Var2 = mm40Var;
        } else {
            if (a4xVar.isEmpty()) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new d3m(a4xVar, i, b2);
                    return;
                }
                return;
            }
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(mm40Var2, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            j8n j8nVar = (j8n) CollectionsKt.U(a4xVar);
            boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new cml(pz40Var, (byte) 20);
                fetVar.o0(objP2);
            }
            z(j8nVar, zBooleanValue, (Function0) objP2, fetVar, 384);
            boolean zBooleanValue2 = ((Boolean) pz40Var.getValue()).booleanValue();
            yx7 yx7Var = gqw0.j;
            zsf zsfVar = ihn.f14788a;
            b34.e(y5d.f42040a, zBooleanValue2, null, kzn.c(ro4.m0(250, 0, zsfVar, 2), yx7Var, 12).a(kzn.d(ro4.m0(150, 0, null, 6), 0.0f, 2)), kzn.e(ro4.m0(100, 0, null, 6), 2).a(kzn.i(ro4.m0(250, 0, zsfVar, 2), yx7Var, 12)), null, u1c.M(-2049258423, new rgh(a4xVar, pz40Var, (byte) 11), fetVar), fetVar, 1572870, 18);
            b = 1;
            fetVar.r(true);
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new zph(mm40Var2, a4xVar, i, b);
        }
    }

    public static final void n(mm40 mm40Var, mdm mdmVar, long j, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        long j2;
        Function0 function1;
        fetVar.g0(-770689212);
        int i2 = i | 6 | (fetVar.g(mdmVar) ? 32 : 16) | 3456;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            long j3 = y3d.f;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new knl((byte) 17);
                fetVar.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, j3, ljcVar);
            zcl zclVar = qmk.f28987a;
            jcb.l(s5x0.L(mm40VarQ, 16.0f, 0.0f, 2), mdmVar, true, function2, fetVar, (i2 & 112) | 3456, 0);
            function1 = function2;
            j2 = j3;
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            j2 = j;
            function1 = function0;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ds8(mm40Var2, (Object) mdmVar, j2, (wdr) function1, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0149  */
    /* JADX WARN: Code duplicated, block: B:105:0x014e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0152  */
    /* JADX WARN: Code duplicated, block: B:109:0x015a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0165  */
    /* JADX WARN: Code duplicated, block: B:115:0x016c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0172  */
    /* JADX WARN: Code duplicated, block: B:119:0x0178  */
    /* JADX WARN: Code duplicated, block: B:123:0x018a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0197  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:145:0x01db  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:155:0x0249  */
    /* JADX WARN: Code duplicated, block: B:157:0x024f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0278  */
    /* JADX WARN: Code duplicated, block: B:162:0x0297  */
    /* JADX WARN: Code duplicated, block: B:164:0x029b  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:172:0x02df  */
    /* JADX WARN: Code duplicated, block: B:174:0x0319  */
    /* JADX WARN: Code duplicated, block: B:176:0x031f  */
    /* JADX WARN: Code duplicated, block: B:178:0x032c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0339  */
    /* JADX WARN: Code duplicated, block: B:181:0x0345  */
    /* JADX WARN: Code duplicated, block: B:183:0x0366  */
    /* JADX WARN: Code duplicated, block: B:186:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:188:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:191:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:193:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:195:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:196:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:198:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:199:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:201:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:203:0x0401  */
    /* JADX WARN: Code duplicated, block: B:207:0x0440  */
    /* JADX WARN: Code duplicated, block: B:209:0x0463  */
    /* JADX WARN: Code duplicated, block: B:213:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:215:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:219:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:222:0x04da  */
    /* JADX WARN: Code duplicated, block: B:224:0x04de  */
    /* JADX WARN: Code duplicated, block: B:227:0x0507  */
    /* JADX WARN: Code duplicated, block: B:228:0x050b  */
    /* JADX WARN: Code duplicated, block: B:232:0x0524  */
    /* JADX WARN: Code duplicated, block: B:235:0x052d  */
    /* JADX WARN: Code duplicated, block: B:238:0x054e  */
    /* JADX WARN: Code duplicated, block: B:239:0x0552  */
    /* JADX WARN: Code duplicated, block: B:242:0x0567  */
    /* JADX WARN: Code duplicated, block: B:243:0x057e  */
    /* JADX WARN: Code duplicated, block: B:246:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:247:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:250:0x05c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:253:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:256:0x061b  */
    /* JADX WARN: Code duplicated, block: B:258:0x062b  */
    /* JADX WARN: Code duplicated, block: B:260:0x0642  */
    /* JADX WARN: Code duplicated, block: B:262:0x0673  */
    /* JADX WARN: Code duplicated, block: B:264:0x067f  */
    /* JADX WARN: Code duplicated, block: B:266:0x0685  */
    /* JADX WARN: Code duplicated, block: B:286:0x0709  */
    /* JADX WARN: Code duplicated, block: B:288:0x074a  */
    /* JADX WARN: Code duplicated, block: B:291:0x075b  */
    /* JADX WARN: Code duplicated, block: B:292:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:295:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:297:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:300:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v28 */
    public static final void o(final mm40 mm40Var, final CharSequence charSequence, final boolean z, final y3d y3dVar, final o0x o0xVar, final o0x o0xVar2, final boolean z2, final CharSequence charSequence2, final Integer num, final y3d y3dVar2, final xe9 xe9Var, final sso0 sso0Var, final rjm rjmVar, Function0 function0, Function0 function1, Function0 function2, fet fetVar, final int i, final int i2, final int i3) {
        int i4;
        rjm rjmVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        final Function0 function3;
        final Function0 function4;
        final Function0 function5;
        fet fetVar2;
        yfe0 yfe0VarU;
        Object obj;
        Function0 function6;
        Function0 function7;
        Function0 function8;
        Object objP;
        gy40 gy40Var;
        yx7 yx7Var;
        lw3 lw3Var;
        boolean z4;
        pcy pcyVar;
        Function0 function9;
        shd shdVar;
        shd shdVar2;
        Function0 function10;
        shd shdVar3;
        shd shdVar4;
        boolean z5;
        jm40 jm40Var;
        shd shdVar5;
        float f;
        long jY;
        boolean z6;
        Object objP2;
        Function0 function11;
        Function0 function12;
        fet fetVar3;
        Function0 function13;
        boolean z7;
        fet fetVar4;
        sso0 sso0VarE;
        ?? r14;
        long background;
        boolean z8;
        oil oilVarT;
        Drawable drawable;
        c78 c78VarV;
        boolean z9;
        m78 m78Var;
        boolean z10;
        Drawable drawable2;
        long j;
        boolean z11;
        long j2;
        fet fetVar5;
        Object objP3;
        Object objP4;
        Object objP5;
        fet fetVar6 = fetVar;
        charSequence.getClass();
        rjmVar.getClass();
        fetVar6.g0(1215582833);
        int i9 = i | (fetVar6.g(mm40Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i9 |= fetVar6.g(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i9 |= fetVar6.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i9 |= fetVar6.g(y3dVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i9 |= fetVar6.g(o0xVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i9 |= fetVar6.g(o0xVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i9 |= fetVar6.h(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i9 |= fetVar6.g(charSequence2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i9 |= fetVar6.g(num) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i9 |= fetVar6.g(y3dVar2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (fetVar6.g(xe9Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar6.g(sso0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            rjmVar2 = rjmVar;
            i4 |= fetVar6.g(rjmVar2) ? 256 : 128;
        } else {
            rjmVar2 = rjmVar;
        }
        int i10 = i4;
        int i11 = i3 & 8192;
        if (i11 == 0) {
            i5 = i11;
            if ((i2 & 3072) == 0) {
                i10 |= fetVar6.i(function0) ? 2048 : 1024;
            }
            i6 = i3 & 16384;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    i10 |= fetVar6.i(function1) ? 16384 : 8192;
                }
                i7 = i3 & 32768;
                if (i7 != 0) {
                    i10 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i10 |= fetVar6.i(function2) ? 131072 : 65536;
                }
                i8 = i10;
                if ((i9 & 306783379) == 306783378 || (i8 & 74899) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar6.U(i9 & 1, z3)) {
                    obj = ukd.f35823a;
                    if (i5 != 0) {
                        objP5 = fetVar6.P();
                        if (objP5 == obj) {
                            objP5 = new ndm((byte) 9);
                            fetVar6.o0(objP5);
                        }
                        function6 = (Function0) objP5;
                    } else {
                        function6 = function0;
                    }
                    if (i6 != 0) {
                        objP4 = fetVar6.P();
                        if (objP4 == obj) {
                            objP4 = new ndm((byte) 10);
                            fetVar6.o0(objP4);
                        }
                        function7 = (Function0) objP4;
                    } else {
                        function6 = function6;
                        function7 = function1;
                    }
                    if (i7 != 0) {
                        objP3 = fetVar6.P();
                        if (objP3 == obj) {
                            objP3 = new ndm((byte) 11);
                            fetVar6.o0(objP3);
                        }
                        function8 = (Function0) objP3;
                    } else {
                        function8 = function2;
                    }
                    objP = fetVar6.P();
                    if (objP == obj) {
                        objP = dw9.j(fetVar6);
                    }
                    gy40Var = (gy40) objP;
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(o7k0.d(o7k0.e(mm40Var, 40.0f), 1.0f), "TAG_DS_HEADER_LARGE" + ((Object) charSequence));
                    yx7Var = gqw0.k;
                    lw3Var = uc9.f35418a;
                    thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar6, 54);
                    int iHashCode = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM = fetVar6.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar6, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    z4 = fetVar6.S;
                    pcyVar = e7z.u1;
                    if (z4) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    function9 = function7;
                    shdVar = gqw0.x;
                    jpm0.o(fetVar6, thg0VarA, shdVar);
                    shdVar2 = gqw0.w;
                    jpm0.o(fetVar6, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    function10 = function8;
                    shdVar3 = gqw0.y;
                    jpm0.o(fetVar6, numValueOf, shdVar3);
                    jpm0.n(fetVar6);
                    shdVar4 = gqw0.v;
                    jpm0.o(fetVar6, mm40VarC0, shdVar4);
                    z5 = rjmVar2 instanceof qjm;
                    jm40Var = jm40.b;
                    if (z5) {
                        fetVar6.e0(639217299);
                        y(jm40Var, (qjm) rjmVar2, fetVar6, ((i8 >> 3) & 112) | 6);
                        fetVar6.r(false);
                        function13 = function6;
                        function12 = function9;
                        function11 = function10;
                        fetVar5 = fetVar6;
                    } else {
                        if (rjmVar2 instanceof pjm) {
                            throw b1j.f(639222078, fetVar6, false);
                        }
                        fetVar6.e0(-1658759209);
                        if (o0xVar != null) {
                            fetVar6.e0(639226715);
                            if (o0xVar instanceof m0x) {
                                fetVar6.e0(-1658795386);
                                pm80 pm80VarF = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar6);
                                if (y3dVar == null) {
                                    fetVar6.e0(639231764);
                                    long jY2 = ibc.Y(((pjm) rjmVar).a(), fetVar6);
                                    fetVar6.r(false);
                                    j2 = jY2;
                                } else {
                                    fetVar6.e0(639230741);
                                    fetVar6.r(false);
                                    j2 = y3dVar.f41946a;
                                }
                                dww.c(pm80VarF, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), j2, fetVar6, 56, 0);
                                fetVar6.r(false);
                                shdVar5 = shdVar4;
                                z10 = false;
                            } else {
                                shdVar5 = shdVar4;
                                if (o0xVar instanceof l0x) {
                                    fetVar6.e0(-1658204557);
                                    drawable2 = ((l0x) o0xVar).f19222a;
                                    if (drawable2 == null) {
                                        fetVar6.e0(-1658204558);
                                        fetVar6.r(false);
                                        shdVar5 = shdVar5;
                                        z11 = false;
                                    } else {
                                        fetVar6.e0(-1658204557);
                                        c78 c78VarV2 = u7x.v(drawable2);
                                        if (y3dVar == null) {
                                            fetVar6.e0(-1117159064);
                                            long jY3 = ibc.Y(((pjm) rjmVar).a(), fetVar6);
                                            fetVar6.r(false);
                                            j = jY3;
                                        } else {
                                            fetVar6.e0(-1117160087);
                                            fetVar6.r(false);
                                            j = y3dVar.f41946a;
                                        }
                                        dww.c(c78VarV2, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), j, fetVar6, 56, 0);
                                        z11 = false;
                                        fetVar6.r(false);
                                    }
                                    fetVar6.r(z11);
                                    z10 = z11;
                                } else {
                                    shdVar5 = shdVar5;
                                    if (o0xVar instanceof n0x) {
                                        throw b1j.f(639226715, fetVar6, false);
                                    }
                                    fetVar6.e0(-1657556812);
                                    if (o0xVar2 == null) {
                                        z8 = false;
                                    } else {
                                        if (o0xVar2 instanceof l0x) {
                                            fetVar6.e0(-1657398774);
                                            drawable = ((l0x) o0xVar2).f19222a;
                                            if (drawable != null) {
                                                c78VarV = u7x.v(drawable);
                                            } else {
                                                c78VarV = null;
                                            }
                                            if (c78VarV == null) {
                                                fetVar6.e0(-1657398775);
                                                z9 = false;
                                                fetVar6.r(false);
                                                oilVarT = null;
                                            } else {
                                                fetVar6.e0(-1657398774);
                                                oilVarT = ju70.T(c78VarV, new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5), null, 10);
                                                z9 = false;
                                                fetVar6.r(false);
                                            }
                                            fetVar6.r(z9);
                                        } else {
                                            z8 = false;
                                            if (o0xVar2 instanceof m0x) {
                                                fetVar6.e0(639284380);
                                                oil oilVarT2 = ju70.T(a8k0.F(((m0x) o0xVar2).f20977a, 0, fetVar6), new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5), null, 10);
                                                fetVar6.r(false);
                                                oilVarT = oilVarT2;
                                            }
                                        }
                                        String str = ((n0x) o0xVar).f22722a;
                                        if (z2) {
                                            fetVar6.e0(-1656382625);
                                            m78 m78Var2 = new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5);
                                            fetVar6.r(false);
                                            m78Var = m78Var2;
                                        } else {
                                            fetVar6.e0(-1656260919);
                                            fetVar6.r(false);
                                            m78Var = null;
                                        }
                                        k7x.b(str, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), oilVarT, oilVarT, null, null, null, null, null, null, m78Var, fetVar6, 36912, 0, 28640);
                                        z10 = false;
                                        fetVar6.r(false);
                                    }
                                    fetVar6.e0(-1656750224);
                                    fetVar6.r(z8);
                                    oilVarT = null;
                                    String str2 = ((n0x) o0xVar).f22722a;
                                    if (z2) {
                                        fetVar6.e0(-1656382625);
                                        m78 m78Var3 = new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5);
                                        fetVar6.r(false);
                                        m78Var = m78Var3;
                                    } else {
                                        fetVar6.e0(-1656260919);
                                        fetVar6.r(false);
                                        m78Var = null;
                                    }
                                    k7x.b(str2, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), oilVarT, oilVarT, null, null, null, null, null, null, m78Var, fetVar6, 36912, 0, 28640);
                                    z10 = false;
                                    fetVar6.r(false);
                                }
                            }
                            fetVar6.r(z10);
                        } else {
                            shdVar5 = shdVar4;
                            fetVar6.e0(-1655886315);
                            fetVar6.r(false);
                        }
                        if (1.0f <= 0.0d) {
                            vcx.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        } else {
                            f = 1.0f;
                        }
                        mm40 mm40VarE1 = o2e.e0(new x7z(f, true), "TAG_HEADER_TITLE_BOX");
                        thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar6, 48);
                        int iHashCode2 = Long.hashCode(fetVar6.T);
                        bh90 bh90VarM2 = fetVar6.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar6, mm40VarE1);
                        fetVar6.i0();
                        if (fetVar6.S) {
                            fetVar6.l(pcyVar);
                        } else {
                            fetVar6.r0();
                        }
                        jpm0.o(fetVar6, thg0VarA2, shdVar);
                        jpm0.o(fetVar6, bh90VarM2, shdVar2);
                        vqd.u(iHashCode2, fetVar6, shdVar3, fetVar6);
                        shd shdVar6 = shdVar5;
                        jpm0.o(fetVar6, mm40VarC1, shdVar6);
                        if (1.0f <= 0.0d) {
                            vcx.a("invalid weight; must be greater than zero");
                        }
                        x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode3 = Long.hashCode(fetVar6.T);
                        bh90 bh90VarM3 = fetVar6.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar6, x7zVar);
                        fetVar6.i0();
                        if (fetVar6.S) {
                            fetVar6.l(pcyVar);
                        } else {
                            fetVar6.r0();
                        }
                        jpm0.o(fetVar6, tj30VarC, shdVar);
                        jpm0.o(fetVar6, bh90VarM3, shdVar2);
                        vqd.u(iHashCode3, fetVar6, shdVar3, fetVar6);
                        jpm0.o(fetVar6, mm40VarC2, shdVar6);
                        String string = charSequence.toString();
                        if (y3dVar2 == null) {
                            fetVar6.e0(190565257);
                            jY = ibc.Y(((pjm) rjmVar).c(), fetVar6);
                            fetVar6.r(false);
                        } else {
                            fetVar6.e0(190564141);
                            fetVar6.r(false);
                            jY = y3dVar2.f41946a;
                        }
                        long j3 = qmk.p;
                        long j4 = qmk.u;
                        n05 n05Var = new n05(j3, j4, qmk.n);
                        y9q0 y9q0Var = new y9q0(0L, j4, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109);
                        if ((i8 & 458752) == 131072) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objP2 = fetVar6.P();
                        if (!z6 || objP2 == obj) {
                            function11 = function10;
                            objP2 = new unl(function11, (byte) 14);
                            fetVar6.o0(objP2);
                        } else {
                            function11 = function10;
                        }
                        v8q0.a(string, y860.W(jm40Var, gy40Var, null, false, null, (Function0) objP2, 28), jY, n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar6, 0, 24960, 110576);
                        fetVar6.r(true);
                        if (z) {
                            fetVar6.e0(946219948);
                            if (((pjm) rjmVar).g()) {
                                fetVar6.e0(2108737069);
                                background = ((StaticColors) fetVar6.k(m8m0.f21378a)).m62getBlack0d7_KjU();
                                r14 = 0;
                            } else {
                                r14 = 0;
                                fetVar6.e0(2108738002);
                                background = ((ThemeColors) fetVar6.k(zaq0.b)).getBackground();
                            }
                            fetVar6.r(r14);
                            qxw.o(fetVar6, o7k0.s(jm40Var, 8.0f));
                            thb.f(null, new rf5(2, new y3d(background)), fetVar6, r14, 1);
                            fetVar6.r(r14);
                        } else {
                            fetVar6.e0(946540922);
                            fetVar6.r(false);
                        }
                        if (charSequence2 != null || charSequence2.length() == 0) {
                            function12 = function9;
                            fetVar6.e0(947220442);
                            fetVar6.r(false);
                        } else {
                            fetVar6.e0(946631628);
                            if (sso0Var == null) {
                                sso0VarE = ((pjm) rjmVar).e();
                                if (sso0VarE == null) {
                                    sso0VarE = sqo0.f32639a;
                                }
                            } else {
                                sso0VarE = sso0Var;
                            }
                            String string2 = charSequence2.toString();
                            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                            boolean z12 = (i8 & 57344) == 16384;
                            Object objP6 = fetVar6.P();
                            if (z12 || objP6 == obj) {
                                function12 = function9;
                                objP6 = new unl(function12, (byte) 15);
                                fetVar6.o0(objP6);
                            } else {
                                function12 = function9;
                            }
                            j6n.h(string2, sso0VarE, y860.W(mm40VarN, gy40Var, null, false, null, (Function0) objP6, 28), 0, 0, fetVar6, 0, 24);
                            fetVar6.r(false);
                        }
                        if (num != null) {
                            fetVar6.e0(947278288);
                            tdc.e(new rpe(num.intValue()), new fpe(null, ((pjm) rjmVar).g(), 1), s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), fetVar6, 0, 0);
                            fet fetVar7 = fetVar6;
                            fetVar7.r(false);
                            fetVar3 = fetVar7;
                        } else {
                            fet fetVar8 = fetVar6;
                            fetVar8.e0(947626170);
                            fetVar8.r(false);
                            fetVar3 = fetVar8;
                        }
                        fetVar3.r(true);
                        if (xe9Var != null) {
                            fetVar3.e0(-1653075328);
                            pjm pjmVar = (pjm) rjmVar;
                            fet fetVar9 = fetVar3;
                            function13 = function6;
                            qzb.n(o2e.e0(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), "TAG_DS_BUTTON"), new wul(pjmVar.b(), pjmVar.d(), xe9Var, true, false, false), function13, fetVar9, (i8 >> 3) & 896, 0);
                            fet fetVar10 = fetVar9;
                            z7 = false;
                            fetVar10.r(false);
                            fetVar4 = fetVar10;
                        } else {
                            fet fetVar11 = fetVar3;
                            function13 = function6;
                            z7 = false;
                            fetVar11.e0(-1652409355);
                            fetVar11.r(false);
                            fetVar4 = fetVar11;
                        }
                        fetVar4.r(z7);
                        fetVar5 = fetVar4;
                    }
                    fetVar5.r(true);
                    function4 = function12;
                    function5 = function11;
                    function3 = function13;
                    fetVar2 = fetVar5;
                } else {
                    fetVar6.X();
                    function3 = function0;
                    function4 = function1;
                    function5 = function2;
                    fetVar2 = fetVar6;
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.fjm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iL = x8x.L(i | 1);
                            int iL2 = x8x.L(i2);
                            xkb.o(mm40Var, charSequence, z, y3dVar, o0xVar, o0xVar2, z2, charSequence2, num, y3dVar2, xe9Var, sso0Var, rjmVar, function3, function4, function5, (fet) obj2, iL, iL2, i3);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i10 |= 24576;
            i7 = i3 & 32768;
            if (i7 != 0) {
                i10 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i10 |= fetVar6.i(function2) ? 131072 : 65536;
            }
            i8 = i10;
            if ((i9 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (fetVar6.U(i9 & 1, z3)) {
                obj = ukd.f35823a;
                if (i5 != 0) {
                    objP5 = fetVar6.P();
                    if (objP5 == obj) {
                        objP5 = new ndm((byte) 9);
                        fetVar6.o0(objP5);
                    }
                    function6 = (Function0) objP5;
                } else {
                    function6 = function0;
                }
                if (i6 != 0) {
                    objP4 = fetVar6.P();
                    if (objP4 == obj) {
                        objP4 = new ndm((byte) 10);
                        fetVar6.o0(objP4);
                    }
                    function7 = (Function0) objP4;
                } else {
                    function6 = function6;
                    function7 = function1;
                }
                if (i7 != 0) {
                    objP3 = fetVar6.P();
                    if (objP3 == obj) {
                        objP3 = new ndm((byte) 11);
                        fetVar6.o0(objP3);
                    }
                    function8 = (Function0) objP3;
                } else {
                    function8 = function2;
                }
                objP = fetVar6.P();
                if (objP == obj) {
                    objP = dw9.j(fetVar6);
                }
                gy40Var = (gy40) objP;
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarE2 = o2e.e0(o7k0.d(o7k0.e(mm40Var, 40.0f), 1.0f), "TAG_DS_HEADER_LARGE" + ((Object) charSequence));
                yx7Var = gqw0.k;
                lw3Var = uc9.f35418a;
                thg0 thg0VarA3 = shg0.a(lw3Var, yx7Var, fetVar6, 54);
                int iHashCode4 = Long.hashCode(fetVar6.T);
                bh90 bh90VarM4 = fetVar6.m();
                mm40 mm40VarC3 = kbc.c0(fetVar6, mm40VarE2);
                mkd.c0.getClass();
                fetVar6.i0();
                z4 = fetVar6.S;
                pcyVar = e7z.u1;
                if (z4) {
                    fetVar6.l(pcyVar);
                } else {
                    fetVar6.r0();
                }
                function9 = function7;
                shdVar = gqw0.x;
                jpm0.o(fetVar6, thg0VarA3, shdVar);
                shdVar2 = gqw0.w;
                jpm0.o(fetVar6, bh90VarM4, shdVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                function10 = function8;
                shdVar3 = gqw0.y;
                jpm0.o(fetVar6, numValueOf2, shdVar3);
                jpm0.n(fetVar6);
                shdVar4 = gqw0.v;
                jpm0.o(fetVar6, mm40VarC3, shdVar4);
                z5 = rjmVar2 instanceof qjm;
                jm40Var = jm40.b;
                if (z5) {
                    fetVar6.e0(639217299);
                    y(jm40Var, (qjm) rjmVar2, fetVar6, ((i8 >> 3) & 112) | 6);
                    fetVar6.r(false);
                    function13 = function6;
                    function12 = function9;
                    function11 = function10;
                    fetVar5 = fetVar6;
                } else {
                    if (rjmVar2 instanceof pjm) {
                        throw b1j.f(639222078, fetVar6, false);
                    }
                    fetVar6.e0(-1658759209);
                    if (o0xVar != null) {
                        fetVar6.e0(639226715);
                        if (o0xVar instanceof m0x) {
                            fetVar6.e0(-1658795386);
                            pm80 pm80VarF2 = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar6);
                            if (y3dVar == null) {
                                fetVar6.e0(639231764);
                                long jY4 = ibc.Y(((pjm) rjmVar).a(), fetVar6);
                                fetVar6.r(false);
                                j2 = jY4;
                            } else {
                                fetVar6.e0(639230741);
                                fetVar6.r(false);
                                j2 = y3dVar.f41946a;
                            }
                            dww.c(pm80VarF2, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), j2, fetVar6, 56, 0);
                            fetVar6.r(false);
                            shdVar5 = shdVar4;
                            z10 = false;
                        } else {
                            shdVar5 = shdVar4;
                            if (o0xVar instanceof l0x) {
                                fetVar6.e0(-1658204557);
                                drawable2 = ((l0x) o0xVar).f19222a;
                                if (drawable2 == null) {
                                    fetVar6.e0(-1658204558);
                                    fetVar6.r(false);
                                    shdVar5 = shdVar5;
                                    z11 = false;
                                } else {
                                    fetVar6.e0(-1658204557);
                                    c78 c78VarV3 = u7x.v(drawable2);
                                    if (y3dVar == null) {
                                        fetVar6.e0(-1117159064);
                                        long jY5 = ibc.Y(((pjm) rjmVar).a(), fetVar6);
                                        fetVar6.r(false);
                                        j = jY5;
                                    } else {
                                        fetVar6.e0(-1117160087);
                                        fetVar6.r(false);
                                        j = y3dVar.f41946a;
                                    }
                                    dww.c(c78VarV3, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), j, fetVar6, 56, 0);
                                    z11 = false;
                                    fetVar6.r(false);
                                }
                                fetVar6.r(z11);
                                z10 = z11;
                            } else {
                                shdVar5 = shdVar5;
                                if (o0xVar instanceof n0x) {
                                    throw b1j.f(639226715, fetVar6, false);
                                }
                                fetVar6.e0(-1657556812);
                                if (o0xVar2 == null) {
                                    z8 = false;
                                } else {
                                    if (o0xVar2 instanceof l0x) {
                                        fetVar6.e0(-1657398774);
                                        drawable = ((l0x) o0xVar2).f19222a;
                                        if (drawable != null) {
                                            c78VarV = u7x.v(drawable);
                                        } else {
                                            c78VarV = null;
                                        }
                                        if (c78VarV == null) {
                                            fetVar6.e0(-1657398775);
                                            z9 = false;
                                            fetVar6.r(false);
                                            oilVarT = null;
                                        } else {
                                            fetVar6.e0(-1657398774);
                                            oilVarT = ju70.T(c78VarV, new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5), null, 10);
                                            z9 = false;
                                            fetVar6.r(false);
                                        }
                                        fetVar6.r(z9);
                                    } else {
                                        z8 = false;
                                        if (o0xVar2 instanceof m0x) {
                                            fetVar6.e0(639284380);
                                            oil oilVarT3 = ju70.T(a8k0.F(((m0x) o0xVar2).f20977a, 0, fetVar6), new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5), null, 10);
                                            fetVar6.r(false);
                                            oilVarT = oilVarT3;
                                        }
                                    }
                                    String str3 = ((n0x) o0xVar).f22722a;
                                    if (z2) {
                                        fetVar6.e0(-1656382625);
                                        m78 m78Var4 = new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5);
                                        fetVar6.r(false);
                                        m78Var = m78Var4;
                                    } else {
                                        fetVar6.e0(-1656260919);
                                        fetVar6.r(false);
                                        m78Var = null;
                                    }
                                    k7x.b(str3, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), oilVarT, oilVarT, null, null, null, null, null, null, m78Var, fetVar6, 36912, 0, 28640);
                                    z10 = false;
                                    fetVar6.r(false);
                                }
                                fetVar6.e0(-1656750224);
                                fetVar6.r(z8);
                                oilVarT = null;
                                String str4 = ((n0x) o0xVar).f22722a;
                                if (z2) {
                                    fetVar6.e0(-1656382625);
                                    m78 m78Var5 = new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5);
                                    fetVar6.r(false);
                                    m78Var = m78Var5;
                                } else {
                                    fetVar6.e0(-1656260919);
                                    fetVar6.r(false);
                                    m78Var = null;
                                }
                                k7x.b(str4, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), oilVarT, oilVarT, null, null, null, null, null, null, m78Var, fetVar6, 36912, 0, 28640);
                                z10 = false;
                                fetVar6.r(false);
                            }
                        }
                        fetVar6.r(z10);
                    } else {
                        shdVar5 = shdVar4;
                        fetVar6.e0(-1655886315);
                        fetVar6.r(false);
                    }
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    mm40 mm40VarE3 = o2e.e0(new x7z(f, true), "TAG_HEADER_TITLE_BOX");
                    thg0 thg0VarA4 = shg0.a(lw3Var, yx7Var, fetVar6, 48);
                    int iHashCode5 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM5 = fetVar6.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar6, mm40VarE3);
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, thg0VarA4, shdVar);
                    jpm0.o(fetVar6, bh90VarM5, shdVar2);
                    vqd.u(iHashCode5, fetVar6, shdVar3, fetVar6);
                    shd shdVar7 = shdVar5;
                    jpm0.o(fetVar6, mm40VarC4, shdVar7);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iHashCode6 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM6 = fetVar6.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar6, x7zVar2);
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, tj30VarC2, shdVar);
                    jpm0.o(fetVar6, bh90VarM6, shdVar2);
                    vqd.u(iHashCode6, fetVar6, shdVar3, fetVar6);
                    jpm0.o(fetVar6, mm40VarC5, shdVar7);
                    String string3 = charSequence.toString();
                    if (y3dVar2 == null) {
                        fetVar6.e0(190565257);
                        jY = ibc.Y(((pjm) rjmVar).c(), fetVar6);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(190564141);
                        fetVar6.r(false);
                        jY = y3dVar2.f41946a;
                    }
                    long j5 = qmk.p;
                    long j6 = qmk.u;
                    n05 n05Var2 = new n05(j5, j6, qmk.n);
                    y9q0 y9q0Var2 = new y9q0(0L, j6, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109);
                    if ((i8 & 458752) == 131072) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objP2 = fetVar6.P();
                    if (z6) {
                        function11 = function10;
                        objP2 = new unl(function11, (byte) 14);
                        fetVar6.o0(objP2);
                    } else {
                        function11 = function10;
                        objP2 = new unl(function11, (byte) 14);
                        fetVar6.o0(objP2);
                    }
                    v8q0.a(string3, y860.W(jm40Var, gy40Var, null, false, null, (Function0) objP2, 28), jY, n05Var2, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var2, fetVar6, 0, 24960, 110576);
                    fetVar6.r(true);
                    if (z) {
                        fetVar6.e0(946219948);
                        if (((pjm) rjmVar).g()) {
                            fetVar6.e0(2108737069);
                            background = ((StaticColors) fetVar6.k(m8m0.f21378a)).m62getBlack0d7_KjU();
                            r14 = 0;
                        } else {
                            r14 = 0;
                            fetVar6.e0(2108738002);
                            background = ((ThemeColors) fetVar6.k(zaq0.b)).getBackground();
                        }
                        fetVar6.r(r14);
                        qxw.o(fetVar6, o7k0.s(jm40Var, 8.0f));
                        thb.f(null, new rf5(2, new y3d(background)), fetVar6, r14, 1);
                        fetVar6.r(r14);
                    } else {
                        fetVar6.e0(946540922);
                        fetVar6.r(false);
                    }
                    if (charSequence2 != null) {
                        function12 = function9;
                        fetVar6.e0(947220442);
                        fetVar6.r(false);
                    } else {
                        function12 = function9;
                        fetVar6.e0(947220442);
                        fetVar6.r(false);
                    }
                    if (num != null) {
                        fetVar6.e0(947278288);
                        tdc.e(new rpe(num.intValue()), new fpe(null, ((pjm) rjmVar).g(), 1), s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), fetVar6, 0, 0);
                        fet fetVar12 = fetVar6;
                        fetVar12.r(false);
                        fetVar3 = fetVar12;
                    } else {
                        fet fetVar13 = fetVar6;
                        fetVar13.e0(947626170);
                        fetVar13.r(false);
                        fetVar3 = fetVar13;
                    }
                    fetVar3.r(true);
                    if (xe9Var != null) {
                        fetVar3.e0(-1653075328);
                        pjm pjmVar2 = (pjm) rjmVar;
                        fet fetVar14 = fetVar3;
                        function13 = function6;
                        qzb.n(o2e.e0(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), "TAG_DS_BUTTON"), new wul(pjmVar2.b(), pjmVar2.d(), xe9Var, true, false, false), function13, fetVar14, (i8 >> 3) & 896, 0);
                        fet fetVar15 = fetVar14;
                        z7 = false;
                        fetVar15.r(false);
                        fetVar4 = fetVar15;
                    } else {
                        fet fetVar16 = fetVar3;
                        function13 = function6;
                        z7 = false;
                        fetVar16.e0(-1652409355);
                        fetVar16.r(false);
                        fetVar4 = fetVar16;
                    }
                    fetVar4.r(z7);
                    fetVar5 = fetVar4;
                }
                fetVar5.r(true);
                function4 = function12;
                function5 = function11;
                function3 = function13;
                fetVar2 = fetVar5;
            } else {
                fetVar6.X();
                function3 = function0;
                function4 = function1;
                function5 = function2;
                fetVar2 = fetVar6;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.fjm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iL = x8x.L(i | 1);
                        int iL2 = x8x.L(i2);
                        xkb.o(mm40Var, charSequence, z, y3dVar, o0xVar, o0xVar2, z2, charSequence2, num, y3dVar2, xe9Var, sso0Var, rjmVar, function3, function4, function5, (fet) obj2, iL, iL2, i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i10 |= 3072;
        i5 = i11;
        i6 = i3 & 16384;
        if (i6 != 0) {
            if ((i2 & 24576) == 0) {
                i10 |= fetVar6.i(function1) ? 16384 : 8192;
            }
            i7 = i3 & 32768;
            if (i7 != 0) {
                i10 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i10 |= fetVar6.i(function2) ? 131072 : 65536;
            }
            i8 = i10;
            if ((i9 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (fetVar6.U(i9 & 1, z3)) {
                obj = ukd.f35823a;
                if (i5 != 0) {
                    objP5 = fetVar6.P();
                    if (objP5 == obj) {
                        objP5 = new ndm((byte) 9);
                        fetVar6.o0(objP5);
                    }
                    function6 = (Function0) objP5;
                } else {
                    function6 = function0;
                }
                if (i6 != 0) {
                    objP4 = fetVar6.P();
                    if (objP4 == obj) {
                        objP4 = new ndm((byte) 10);
                        fetVar6.o0(objP4);
                    }
                    function7 = (Function0) objP4;
                } else {
                    function6 = function6;
                    function7 = function1;
                }
                if (i7 != 0) {
                    objP3 = fetVar6.P();
                    if (objP3 == obj) {
                        objP3 = new ndm((byte) 11);
                        fetVar6.o0(objP3);
                    }
                    function8 = (Function0) objP3;
                } else {
                    function8 = function2;
                }
                objP = fetVar6.P();
                if (objP == obj) {
                    objP = dw9.j(fetVar6);
                }
                gy40Var = (gy40) objP;
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarE4 = o2e.e0(o7k0.d(o7k0.e(mm40Var, 40.0f), 1.0f), "TAG_DS_HEADER_LARGE" + ((Object) charSequence));
                yx7Var = gqw0.k;
                lw3Var = uc9.f35418a;
                thg0 thg0VarA5 = shg0.a(lw3Var, yx7Var, fetVar6, 54);
                int iHashCode7 = Long.hashCode(fetVar6.T);
                bh90 bh90VarM7 = fetVar6.m();
                mm40 mm40VarC6 = kbc.c0(fetVar6, mm40VarE4);
                mkd.c0.getClass();
                fetVar6.i0();
                z4 = fetVar6.S;
                pcyVar = e7z.u1;
                if (z4) {
                    fetVar6.l(pcyVar);
                } else {
                    fetVar6.r0();
                }
                function9 = function7;
                shdVar = gqw0.x;
                jpm0.o(fetVar6, thg0VarA5, shdVar);
                shdVar2 = gqw0.w;
                jpm0.o(fetVar6, bh90VarM7, shdVar2);
                Integer numValueOf3 = Integer.valueOf(iHashCode7);
                function10 = function8;
                shdVar3 = gqw0.y;
                jpm0.o(fetVar6, numValueOf3, shdVar3);
                jpm0.n(fetVar6);
                shdVar4 = gqw0.v;
                jpm0.o(fetVar6, mm40VarC6, shdVar4);
                z5 = rjmVar2 instanceof qjm;
                jm40Var = jm40.b;
                if (z5) {
                    fetVar6.e0(639217299);
                    y(jm40Var, (qjm) rjmVar2, fetVar6, ((i8 >> 3) & 112) | 6);
                    fetVar6.r(false);
                    function13 = function6;
                    function12 = function9;
                    function11 = function10;
                    fetVar5 = fetVar6;
                } else {
                    if (rjmVar2 instanceof pjm) {
                        throw b1j.f(639222078, fetVar6, false);
                    }
                    fetVar6.e0(-1658759209);
                    if (o0xVar != null) {
                        fetVar6.e0(639226715);
                        if (o0xVar instanceof m0x) {
                            fetVar6.e0(-1658795386);
                            pm80 pm80VarF3 = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar6);
                            if (y3dVar == null) {
                                fetVar6.e0(639231764);
                                long jY6 = ibc.Y(((pjm) rjmVar).a(), fetVar6);
                                fetVar6.r(false);
                                j2 = jY6;
                            } else {
                                fetVar6.e0(639230741);
                                fetVar6.r(false);
                                j2 = y3dVar.f41946a;
                            }
                            dww.c(pm80VarF3, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), j2, fetVar6, 56, 0);
                            fetVar6.r(false);
                            shdVar5 = shdVar4;
                            z10 = false;
                        } else {
                            shdVar5 = shdVar4;
                            if (o0xVar instanceof l0x) {
                                fetVar6.e0(-1658204557);
                                drawable2 = ((l0x) o0xVar).f19222a;
                                if (drawable2 == null) {
                                    fetVar6.e0(-1658204558);
                                    fetVar6.r(false);
                                    shdVar5 = shdVar5;
                                    z11 = false;
                                } else {
                                    fetVar6.e0(-1658204557);
                                    c78 c78VarV4 = u7x.v(drawable2);
                                    if (y3dVar == null) {
                                        fetVar6.e0(-1117159064);
                                        long jY7 = ibc.Y(((pjm) rjmVar).a(), fetVar6);
                                        fetVar6.r(false);
                                        j = jY7;
                                    } else {
                                        fetVar6.e0(-1117160087);
                                        fetVar6.r(false);
                                        j = y3dVar.f41946a;
                                    }
                                    dww.c(c78VarV4, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), j, fetVar6, 56, 0);
                                    z11 = false;
                                    fetVar6.r(false);
                                }
                                fetVar6.r(z11);
                                z10 = z11;
                            } else {
                                shdVar5 = shdVar5;
                                if (o0xVar instanceof n0x) {
                                    throw b1j.f(639226715, fetVar6, false);
                                }
                                fetVar6.e0(-1657556812);
                                if (o0xVar2 == null) {
                                    z8 = false;
                                } else {
                                    if (o0xVar2 instanceof l0x) {
                                        fetVar6.e0(-1657398774);
                                        drawable = ((l0x) o0xVar2).f19222a;
                                        if (drawable != null) {
                                            c78VarV = u7x.v(drawable);
                                        } else {
                                            c78VarV = null;
                                        }
                                        if (c78VarV == null) {
                                            fetVar6.e0(-1657398775);
                                            z9 = false;
                                            fetVar6.r(false);
                                            oilVarT = null;
                                        } else {
                                            fetVar6.e0(-1657398774);
                                            oilVarT = ju70.T(c78VarV, new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5), null, 10);
                                            z9 = false;
                                            fetVar6.r(false);
                                        }
                                        fetVar6.r(z9);
                                    } else {
                                        z8 = false;
                                        if (o0xVar2 instanceof m0x) {
                                            fetVar6.e0(639284380);
                                            oil oilVarT4 = ju70.T(a8k0.F(((m0x) o0xVar2).f20977a, 0, fetVar6), new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5), null, 10);
                                            fetVar6.r(false);
                                            oilVarT = oilVarT4;
                                        }
                                    }
                                    String str5 = ((n0x) o0xVar).f22722a;
                                    if (z2) {
                                        fetVar6.e0(-1656382625);
                                        m78 m78Var6 = new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5);
                                        fetVar6.r(false);
                                        m78Var = m78Var6;
                                    } else {
                                        fetVar6.e0(-1656260919);
                                        fetVar6.r(false);
                                        m78Var = null;
                                    }
                                    k7x.b(str5, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), oilVarT, oilVarT, null, null, null, null, null, null, m78Var, fetVar6, 36912, 0, 28640);
                                    z10 = false;
                                    fetVar6.r(false);
                                }
                                fetVar6.e0(-1656750224);
                                fetVar6.r(z8);
                                oilVarT = null;
                                String str6 = ((n0x) o0xVar).f22722a;
                                if (z2) {
                                    fetVar6.e0(-1656382625);
                                    m78 m78Var7 = new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5);
                                    fetVar6.r(false);
                                    m78Var = m78Var7;
                                } else {
                                    fetVar6.e0(-1656260919);
                                    fetVar6.r(false);
                                    m78Var = null;
                                }
                                k7x.b(str6, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), oilVarT, oilVarT, null, null, null, null, null, null, m78Var, fetVar6, 36912, 0, 28640);
                                z10 = false;
                                fetVar6.r(false);
                            }
                        }
                        fetVar6.r(z10);
                    } else {
                        shdVar5 = shdVar4;
                        fetVar6.e0(-1655886315);
                        fetVar6.r(false);
                    }
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    mm40 mm40VarE5 = o2e.e0(new x7z(f, true), "TAG_HEADER_TITLE_BOX");
                    thg0 thg0VarA6 = shg0.a(lw3Var, yx7Var, fetVar6, 48);
                    int iHashCode8 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM8 = fetVar6.m();
                    mm40 mm40VarC7 = kbc.c0(fetVar6, mm40VarE5);
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, thg0VarA6, shdVar);
                    jpm0.o(fetVar6, bh90VarM8, shdVar2);
                    vqd.u(iHashCode8, fetVar6, shdVar3, fetVar6);
                    shd shdVar8 = shdVar5;
                    jpm0.o(fetVar6, mm40VarC7, shdVar8);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar3 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                    tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                    int iHashCode9 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM9 = fetVar6.m();
                    mm40 mm40VarC8 = kbc.c0(fetVar6, x7zVar3);
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, tj30VarC3, shdVar);
                    jpm0.o(fetVar6, bh90VarM9, shdVar2);
                    vqd.u(iHashCode9, fetVar6, shdVar3, fetVar6);
                    jpm0.o(fetVar6, mm40VarC8, shdVar8);
                    String string4 = charSequence.toString();
                    if (y3dVar2 == null) {
                        fetVar6.e0(190565257);
                        jY = ibc.Y(((pjm) rjmVar).c(), fetVar6);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(190564141);
                        fetVar6.r(false);
                        jY = y3dVar2.f41946a;
                    }
                    long j7 = qmk.p;
                    long j8 = qmk.u;
                    n05 n05Var3 = new n05(j7, j8, qmk.n);
                    y9q0 y9q0Var3 = new y9q0(0L, j8, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109);
                    if ((i8 & 458752) == 131072) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objP2 = fetVar6.P();
                    if (z6) {
                        function11 = function10;
                        objP2 = new unl(function11, (byte) 14);
                        fetVar6.o0(objP2);
                    } else {
                        function11 = function10;
                        objP2 = new unl(function11, (byte) 14);
                        fetVar6.o0(objP2);
                    }
                    v8q0.a(string4, y860.W(jm40Var, gy40Var, null, false, null, (Function0) objP2, 28), jY, n05Var3, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var3, fetVar6, 0, 24960, 110576);
                    fetVar6.r(true);
                    if (z) {
                        fetVar6.e0(946219948);
                        if (((pjm) rjmVar).g()) {
                            fetVar6.e0(2108737069);
                            background = ((StaticColors) fetVar6.k(m8m0.f21378a)).m62getBlack0d7_KjU();
                            r14 = 0;
                        } else {
                            r14 = 0;
                            fetVar6.e0(2108738002);
                            background = ((ThemeColors) fetVar6.k(zaq0.b)).getBackground();
                        }
                        fetVar6.r(r14);
                        qxw.o(fetVar6, o7k0.s(jm40Var, 8.0f));
                        thb.f(null, new rf5(2, new y3d(background)), fetVar6, r14, 1);
                        fetVar6.r(r14);
                    } else {
                        fetVar6.e0(946540922);
                        fetVar6.r(false);
                    }
                    if (charSequence2 != null) {
                        function12 = function9;
                        fetVar6.e0(947220442);
                        fetVar6.r(false);
                    } else {
                        function12 = function9;
                        fetVar6.e0(947220442);
                        fetVar6.r(false);
                    }
                    if (num != null) {
                        fetVar6.e0(947278288);
                        tdc.e(new rpe(num.intValue()), new fpe(null, ((pjm) rjmVar).g(), 1), s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), fetVar6, 0, 0);
                        fet fetVar17 = fetVar6;
                        fetVar17.r(false);
                        fetVar3 = fetVar17;
                    } else {
                        fet fetVar18 = fetVar6;
                        fetVar18.e0(947626170);
                        fetVar18.r(false);
                        fetVar3 = fetVar18;
                    }
                    fetVar3.r(true);
                    if (xe9Var != null) {
                        fetVar3.e0(-1653075328);
                        pjm pjmVar3 = (pjm) rjmVar;
                        fet fetVar19 = fetVar3;
                        function13 = function6;
                        qzb.n(o2e.e0(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), "TAG_DS_BUTTON"), new wul(pjmVar3.b(), pjmVar3.d(), xe9Var, true, false, false), function13, fetVar19, (i8 >> 3) & 896, 0);
                        fet fetVar110 = fetVar19;
                        z7 = false;
                        fetVar110.r(false);
                        fetVar4 = fetVar110;
                    } else {
                        fet fetVar111 = fetVar3;
                        function13 = function6;
                        z7 = false;
                        fetVar111.e0(-1652409355);
                        fetVar111.r(false);
                        fetVar4 = fetVar111;
                    }
                    fetVar4.r(z7);
                    fetVar5 = fetVar4;
                }
                fetVar5.r(true);
                function4 = function12;
                function5 = function11;
                function3 = function13;
                fetVar2 = fetVar5;
            } else {
                fetVar6.X();
                function3 = function0;
                function4 = function1;
                function5 = function2;
                fetVar2 = fetVar6;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.fjm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iL = x8x.L(i | 1);
                        int iL2 = x8x.L(i2);
                        xkb.o(mm40Var, charSequence, z, y3dVar, o0xVar, o0xVar2, z2, charSequence2, num, y3dVar2, xe9Var, sso0Var, rjmVar, function3, function4, function5, (fet) obj2, iL, iL2, i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i10 |= 24576;
        i7 = i3 & 32768;
        if (i7 != 0) {
            i10 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i10 |= fetVar6.i(function2) ? 131072 : 65536;
        }
        i8 = i10;
        if ((i9 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (fetVar6.U(i9 & 1, z3)) {
            obj = ukd.f35823a;
            if (i5 != 0) {
                objP5 = fetVar6.P();
                if (objP5 == obj) {
                    objP5 = new ndm((byte) 9);
                    fetVar6.o0(objP5);
                }
                function6 = (Function0) objP5;
            } else {
                function6 = function0;
            }
            if (i6 != 0) {
                objP4 = fetVar6.P();
                if (objP4 == obj) {
                    objP4 = new ndm((byte) 10);
                    fetVar6.o0(objP4);
                }
                function7 = (Function0) objP4;
            } else {
                function6 = function6;
                function7 = function1;
            }
            if (i7 != 0) {
                objP3 = fetVar6.P();
                if (objP3 == obj) {
                    objP3 = new ndm((byte) 11);
                    fetVar6.o0(objP3);
                }
                function8 = (Function0) objP3;
            } else {
                function8 = function2;
            }
            objP = fetVar6.P();
            if (objP == obj) {
                objP = dw9.j(fetVar6);
            }
            gy40Var = (gy40) objP;
            zcl zclVar4 = qmk.f28987a;
            mm40 mm40VarE6 = o2e.e0(o7k0.d(o7k0.e(mm40Var, 40.0f), 1.0f), "TAG_DS_HEADER_LARGE" + ((Object) charSequence));
            yx7Var = gqw0.k;
            lw3Var = uc9.f35418a;
            thg0 thg0VarA7 = shg0.a(lw3Var, yx7Var, fetVar6, 54);
            int iHashCode10 = Long.hashCode(fetVar6.T);
            bh90 bh90VarM10 = fetVar6.m();
            mm40 mm40VarC9 = kbc.c0(fetVar6, mm40VarE6);
            mkd.c0.getClass();
            fetVar6.i0();
            z4 = fetVar6.S;
            pcyVar = e7z.u1;
            if (z4) {
                fetVar6.l(pcyVar);
            } else {
                fetVar6.r0();
            }
            function9 = function7;
            shdVar = gqw0.x;
            jpm0.o(fetVar6, thg0VarA7, shdVar);
            shdVar2 = gqw0.w;
            jpm0.o(fetVar6, bh90VarM10, shdVar2);
            Integer numValueOf4 = Integer.valueOf(iHashCode10);
            function10 = function8;
            shdVar3 = gqw0.y;
            jpm0.o(fetVar6, numValueOf4, shdVar3);
            jpm0.n(fetVar6);
            shdVar4 = gqw0.v;
            jpm0.o(fetVar6, mm40VarC9, shdVar4);
            z5 = rjmVar2 instanceof qjm;
            jm40Var = jm40.b;
            if (z5) {
                fetVar6.e0(639217299);
                y(jm40Var, (qjm) rjmVar2, fetVar6, ((i8 >> 3) & 112) | 6);
                fetVar6.r(false);
                function13 = function6;
                function12 = function9;
                function11 = function10;
                fetVar5 = fetVar6;
            } else {
                if (rjmVar2 instanceof pjm) {
                    throw b1j.f(639222078, fetVar6, false);
                }
                fetVar6.e0(-1658759209);
                if (o0xVar != null) {
                    fetVar6.e0(639226715);
                    if (o0xVar instanceof m0x) {
                        fetVar6.e0(-1658795386);
                        pm80 pm80VarF4 = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar6);
                        if (y3dVar == null) {
                            fetVar6.e0(639231764);
                            long jY8 = ibc.Y(((pjm) rjmVar).a(), fetVar6);
                            fetVar6.r(false);
                            j2 = jY8;
                        } else {
                            fetVar6.e0(639230741);
                            fetVar6.r(false);
                            j2 = y3dVar.f41946a;
                        }
                        dww.c(pm80VarF4, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), j2, fetVar6, 56, 0);
                        fetVar6.r(false);
                        shdVar5 = shdVar4;
                        z10 = false;
                    } else {
                        shdVar5 = shdVar4;
                        if (o0xVar instanceof l0x) {
                            fetVar6.e0(-1658204557);
                            drawable2 = ((l0x) o0xVar).f19222a;
                            if (drawable2 == null) {
                                fetVar6.e0(-1658204558);
                                fetVar6.r(false);
                                shdVar5 = shdVar5;
                                z11 = false;
                            } else {
                                fetVar6.e0(-1658204557);
                                c78 c78VarV5 = u7x.v(drawable2);
                                if (y3dVar == null) {
                                    fetVar6.e0(-1117159064);
                                    long jY9 = ibc.Y(((pjm) rjmVar).a(), fetVar6);
                                    fetVar6.r(false);
                                    j = jY9;
                                } else {
                                    fetVar6.e0(-1117160087);
                                    fetVar6.r(false);
                                    j = y3dVar.f41946a;
                                }
                                dww.c(c78VarV5, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), j, fetVar6, 56, 0);
                                z11 = false;
                                fetVar6.r(false);
                            }
                            fetVar6.r(z11);
                            z10 = z11;
                        } else {
                            shdVar5 = shdVar5;
                            if (o0xVar instanceof n0x) {
                                throw b1j.f(639226715, fetVar6, false);
                            }
                            fetVar6.e0(-1657556812);
                            if (o0xVar2 == null) {
                                z8 = false;
                            } else {
                                if (o0xVar2 instanceof l0x) {
                                    fetVar6.e0(-1657398774);
                                    drawable = ((l0x) o0xVar2).f19222a;
                                    if (drawable != null) {
                                        c78VarV = u7x.v(drawable);
                                    } else {
                                        c78VarV = null;
                                    }
                                    if (c78VarV == null) {
                                        fetVar6.e0(-1657398775);
                                        z9 = false;
                                        fetVar6.r(false);
                                        oilVarT = null;
                                    } else {
                                        fetVar6.e0(-1657398774);
                                        oilVarT = ju70.T(c78VarV, new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5), null, 10);
                                        z9 = false;
                                        fetVar6.r(false);
                                    }
                                    fetVar6.r(z9);
                                } else {
                                    z8 = false;
                                    if (o0xVar2 instanceof m0x) {
                                        fetVar6.e0(639284380);
                                        oil oilVarT5 = ju70.T(a8k0.F(((m0x) o0xVar2).f20977a, 0, fetVar6), new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5), null, 10);
                                        fetVar6.r(false);
                                        oilVarT = oilVarT5;
                                    }
                                }
                                String str7 = ((n0x) o0xVar).f22722a;
                                if (z2) {
                                    fetVar6.e0(-1656382625);
                                    m78 m78Var8 = new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5);
                                    fetVar6.r(false);
                                    m78Var = m78Var8;
                                } else {
                                    fetVar6.e0(-1656260919);
                                    fetVar6.r(false);
                                    m78Var = null;
                                }
                                k7x.b(str7, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), oilVarT, oilVarT, null, null, null, null, null, null, m78Var, fetVar6, 36912, 0, 28640);
                                z10 = false;
                                fetVar6.r(false);
                            }
                            fetVar6.e0(-1656750224);
                            fetVar6.r(z8);
                            oilVarT = null;
                            String str8 = ((n0x) o0xVar).f22722a;
                            if (z2) {
                                fetVar6.e0(-1656382625);
                                m78 m78Var9 = new m78(ibc.Y(((pjm) rjmVar).a(), fetVar6), 5);
                                fetVar6.r(false);
                                m78Var = m78Var9;
                            } else {
                                fetVar6.e0(-1656260919);
                                fetVar6.r(false);
                                m78Var = null;
                            }
                            k7x.b(str8, null, s5x0.N(o7k0.p(jm40Var, 32.0f, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), oilVarT, oilVarT, null, null, null, null, null, null, m78Var, fetVar6, 36912, 0, 28640);
                            z10 = false;
                            fetVar6.r(false);
                        }
                    }
                    fetVar6.r(z10);
                } else {
                    shdVar5 = shdVar4;
                    fetVar6.e0(-1655886315);
                    fetVar6.r(false);
                }
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f;
                }
                mm40 mm40VarE7 = o2e.e0(new x7z(f, true), "TAG_HEADER_TITLE_BOX");
                thg0 thg0VarA8 = shg0.a(lw3Var, yx7Var, fetVar6, 48);
                int iHashCode11 = Long.hashCode(fetVar6.T);
                bh90 bh90VarM11 = fetVar6.m();
                mm40 mm40VarC10 = kbc.c0(fetVar6, mm40VarE7);
                fetVar6.i0();
                if (fetVar6.S) {
                    fetVar6.l(pcyVar);
                } else {
                    fetVar6.r0();
                }
                jpm0.o(fetVar6, thg0VarA8, shdVar);
                jpm0.o(fetVar6, bh90VarM11, shdVar2);
                vqd.u(iHashCode11, fetVar6, shdVar3, fetVar6);
                shd shdVar9 = shdVar5;
                jpm0.o(fetVar6, mm40VarC10, shdVar9);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                x7z x7zVar4 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                tj30 tj30VarC4 = zq8.c(gqw0.f11754a, false);
                int iHashCode12 = Long.hashCode(fetVar6.T);
                bh90 bh90VarM12 = fetVar6.m();
                mm40 mm40VarC11 = kbc.c0(fetVar6, x7zVar4);
                fetVar6.i0();
                if (fetVar6.S) {
                    fetVar6.l(pcyVar);
                } else {
                    fetVar6.r0();
                }
                jpm0.o(fetVar6, tj30VarC4, shdVar);
                jpm0.o(fetVar6, bh90VarM12, shdVar2);
                vqd.u(iHashCode12, fetVar6, shdVar3, fetVar6);
                jpm0.o(fetVar6, mm40VarC11, shdVar9);
                String string5 = charSequence.toString();
                if (y3dVar2 == null) {
                    fetVar6.e0(190565257);
                    jY = ibc.Y(((pjm) rjmVar).c(), fetVar6);
                    fetVar6.r(false);
                } else {
                    fetVar6.e0(190564141);
                    fetVar6.r(false);
                    jY = y3dVar2.f41946a;
                }
                long j9 = qmk.p;
                long j10 = qmk.u;
                n05 n05Var4 = new n05(j9, j10, qmk.n);
                y9q0 y9q0Var4 = new y9q0(0L, j10, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109);
                if ((i8 & 458752) == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objP2 = fetVar6.P();
                if (z6) {
                    function11 = function10;
                    objP2 = new unl(function11, (byte) 14);
                    fetVar6.o0(objP2);
                } else {
                    function11 = function10;
                    objP2 = new unl(function11, (byte) 14);
                    fetVar6.o0(objP2);
                }
                v8q0.a(string5, y860.W(jm40Var, gy40Var, null, false, null, (Function0) objP2, 28), jY, n05Var4, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var4, fetVar6, 0, 24960, 110576);
                fetVar6.r(true);
                if (z) {
                    fetVar6.e0(946219948);
                    if (((pjm) rjmVar).g()) {
                        fetVar6.e0(2108737069);
                        background = ((StaticColors) fetVar6.k(m8m0.f21378a)).m62getBlack0d7_KjU();
                        r14 = 0;
                    } else {
                        r14 = 0;
                        fetVar6.e0(2108738002);
                        background = ((ThemeColors) fetVar6.k(zaq0.b)).getBackground();
                    }
                    fetVar6.r(r14);
                    qxw.o(fetVar6, o7k0.s(jm40Var, 8.0f));
                    thb.f(null, new rf5(2, new y3d(background)), fetVar6, r14, 1);
                    fetVar6.r(r14);
                } else {
                    fetVar6.e0(946540922);
                    fetVar6.r(false);
                }
                if (charSequence2 != null) {
                    function12 = function9;
                    fetVar6.e0(947220442);
                    fetVar6.r(false);
                } else {
                    function12 = function9;
                    fetVar6.e0(947220442);
                    fetVar6.r(false);
                }
                if (num != null) {
                    fetVar6.e0(947278288);
                    tdc.e(new rpe(num.intValue()), new fpe(null, ((pjm) rjmVar).g(), 1), s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), fetVar6, 0, 0);
                    fet fetVar112 = fetVar6;
                    fetVar112.r(false);
                    fetVar3 = fetVar112;
                } else {
                    fet fetVar113 = fetVar6;
                    fetVar113.e0(947626170);
                    fetVar113.r(false);
                    fetVar3 = fetVar113;
                }
                fetVar3.r(true);
                if (xe9Var != null) {
                    fetVar3.e0(-1653075328);
                    pjm pjmVar4 = (pjm) rjmVar;
                    fet fetVar114 = fetVar3;
                    function13 = function6;
                    qzb.n(o2e.e0(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), "TAG_DS_BUTTON"), new wul(pjmVar4.b(), pjmVar4.d(), xe9Var, true, false, false), function13, fetVar114, (i8 >> 3) & 896, 0);
                    fet fetVar115 = fetVar114;
                    z7 = false;
                    fetVar115.r(false);
                    fetVar4 = fetVar115;
                } else {
                    fet fetVar116 = fetVar3;
                    function13 = function6;
                    z7 = false;
                    fetVar116.e0(-1652409355);
                    fetVar116.r(false);
                    fetVar4 = fetVar116;
                }
                fetVar4.r(z7);
                fetVar5 = fetVar4;
            }
            fetVar5.r(true);
            function4 = function12;
            function5 = function11;
            function3 = function13;
            fetVar2 = fetVar5;
        } else {
            fetVar6.X();
            function3 = function0;
            function4 = function1;
            function5 = function2;
            fetVar2 = fetVar6;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.fjm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = x8x.L(i | 1);
                    int iL2 = x8x.L(i2);
                    xkb.o(mm40Var, charSequence, z, y3dVar, o0xVar, o0xVar2, z2, charSequence2, num, y3dVar2, xe9Var, sso0Var, rjmVar, function3, function4, function5, (fet) obj2, iL, iL2, i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void p(mm40 mm40Var, String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, kpm kpmVar, String str5, boolean z, fet fetVar, int i) {
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        k6z k6zVar;
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str4.getClass();
        str5.getClass();
        fetVar.g0(-1829200450);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = str2;
            i2 |= fetVar.g(obj) ? 256 : 128;
        } else {
            obj = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(a4xVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            obj2 = a4xVar2;
            i2 |= fetVar.g(obj2) ? 16384 : 8192;
        } else {
            obj2 = a4xVar2;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(str3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(str4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            obj3 = kpmVar;
            i2 |= fetVar.g(obj3) ? 8388608 : 4194304;
        } else {
            obj3 = kpmVar;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.g(str5) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= fetVar.h(z) ? 536870912 : 268435456;
        }
        if (fetVar.U(i2 & 1, (306783379 & i2) != 306783378)) {
            if (z) {
                fetVar.e0(-1219994939);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1219994015);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            int i3 = i2;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            if (str3.length() <= 0 && str5.length() <= 0) {
                fetVar.e0(1311589678);
                fetVar.r(false);
            } else {
                fetVar.e0(1311456099);
                w(((i3 >> 21) & 112) | ((i3 >> 9) & 896), fetVar, null, str5, str3);
                fetVar.r(false);
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(1274768756, new ecc((Object) str, (Object) a4xVar, (Object) str4, obj3, z, obj, obj2, (byte) 3), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bcc(mm40Var, str, str2, a4xVar, a4xVar2, str3, str4, (Object) kpmVar, str5, z, i, (byte) 2);
        }
    }

    public static final void q(mm40 mm40Var, i3o0 i3o0Var, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        i3o0Var.getClass();
        fetVar.g0(-481377801);
        int i2 = i | 6 | (fetVar.g(i3o0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = i3o0Var instanceof b3o0;
            mm40Var2 = jm40.b;
            if (z2) {
                fetVar.e0(170063052);
                b3o0 b3o0Var = (b3o0) i3o0Var;
                kkb.n(mm40Var2, new itm(b3o0Var.f1918a, b3o0Var.b, b3o0Var.c, b3o0Var.d, b3o0Var.e, b3o0Var.f, b3o0Var.g, b3o0Var.h, z), fetVar, 6);
                fetVar.r(false);
            } else if (i3o0Var instanceof c3o0) {
                fetVar.e0(170907213);
                c3o0 c3o0Var = (c3o0) i3o0Var;
                ntb.q(mm40Var2, new cvm(c3o0Var.f3687a, c3o0Var.b, c3o0Var.c, "", c3o0Var.d, c3o0Var.e, c3o0Var.f, c3o0Var.g, z), fetVar, 6);
                fetVar.r(false);
            } else if (i3o0Var instanceof d3o0) {
                fetVar.e0(171742229);
                d3o0 d3o0Var = (d3o0) i3o0Var;
                d5c.l(mm40Var2, new owm(d3o0Var.d, d3o0Var.e, d3o0Var.f, d3o0Var.f5413a, d3o0Var.b, d3o0Var.c, d3o0Var.g, z), fetVar, 6);
                fetVar.r(false);
            } else if (i3o0Var instanceof f3o0) {
                fetVar.e0(172505356);
                f3o0 f3o0Var = (f3o0) i3o0Var;
                ibc.p(mm40Var2, new cxm(f3o0Var.f8874a, f3o0Var.b, f3o0Var.c, f3o0Var.d, f3o0Var.e), fetVar, 6);
                fetVar.r(false);
            } else if (i3o0Var instanceof h3o0) {
                fetVar.e0(173068378);
                h3o0 h3o0Var = (h3o0) i3o0Var;
                kbc.o(mm40Var2, new e2n(h3o0Var.f12395a, h3o0Var.b, h3o0Var.c, h3o0Var.d, h3o0Var.e), fetVar, 6);
                fetVar.r(false);
            } else if (i3o0Var instanceof e3o0) {
                fetVar.e0(173659703);
                e3o0 e3o0Var = (e3o0) i3o0Var;
                pzb.o(mm40Var2, new cwm(e3o0Var.f7148a, e3o0Var.b, e3o0Var.c, e3o0Var.d, e3o0Var.e, e3o0Var.f, e3o0Var.g, e3o0Var.h, e3o0Var.i, e3o0Var.j, z), fetVar, 6);
                fetVar.r(false);
            } else {
                if (!(i3o0Var instanceof g3o0)) {
                    throw b1j.f(1252413670, fetVar, false);
                }
                fetVar.e0(174744176);
                g3o0 g3o0Var = (g3o0) i3o0Var;
                thb.i(mm40Var2, new lym(g3o0Var.f10620a, g3o0Var.b, g3o0Var.c, g3o0Var.d, g3o0Var.e, g3o0Var.f, g3o0Var.g, g3o0Var.h, g3o0Var.i, g3o0Var.j, g3o0Var.k), fetVar, 6);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm((byte) 25, i, mm40Var2, (Object) i3o0Var, z);
        }
    }

    public static final void r(final mm40 mm40Var, final s6x s6xVar, int i, int i2, fet fetVar, final int i3) {
        int i4;
        final int i5;
        final int i6;
        int i7;
        int i8;
        s6xVar.getClass();
        fetVar.g0(1665691046);
        if ((i3 & 6) == 0) {
            i4 = i3 | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i4 = i3;
        }
        int i9 = i4 | (fetVar.g(s6xVar) ? 32 : 16) | 1152;
        if (fetVar.U(i9 & 1, (i9 & 1171) != 1170)) {
            fetVar.Z();
            if ((i3 & 1) == 0 || fetVar.B()) {
                i7 = R.color.static_green;
                i8 = R.color.static_blue;
            } else {
                fetVar.X();
                i7 = i;
                i8 = i2;
            }
            fetVar.s();
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            ofm0.f(0, fetVar, null, s6xVar.f31725a, s6xVar.b, s6xVar.c);
            int i10 = i7;
            int i11 = i8;
            fre0.i(s6xVar.d, s6xVar.e, i10, i11, fetVar, 0);
            fetVar.r(true);
            i5 = i10;
            i6 = i11;
        } else {
            fetVar.X();
            i5 = i;
            i6 = i2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.y4n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xkb.r(mm40Var, s6xVar, i5, i6, (fet) obj, x8x.L(i3 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void s(mm40 mm40Var, bao baoVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        String str = baoVar.f2269a;
        fetVar2.g0(-1914282193);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(baoVar) ? 32 : 16);
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = fetVar2.g(str.concat("FULL_ROTATE_REMEMBER_ID"));
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = xf0.c(0.0f);
                fetVar2.o0(objP);
            }
            t33 t33Var = (t33) objP;
            Object[] objArr = {str.concat("FULL_TURN_OVER_REMEMBER_ID")};
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new urn((byte) 10);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP2, fetVar2, 48);
            Boolean bool = (Boolean) pz40Var.getValue();
            bool.booleanValue();
            boolean zI = fetVar2.i(t33Var) | fetVar2.g(pz40Var);
            Object objP3 = fetVar2.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new lcd(t33Var, pz40Var, null, b);
                fetVar2.o0(objP3);
            }
            m0x0.t(fetVar2, bool, (Function2) objP3);
            zfn zfnVar = zaq0.b;
            long separator60 = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            boolean zD = fetVar2.d(8.0f) | fetVar2.f(separator60);
            Object objP4 = fetVar2.P();
            if (zD || objP4 == cl5Var) {
                objP4 = new nme((byte) 23, separator60);
                fetVar2.o0(objP4);
            }
            mm40 mm40VarK = s5x0.K(rq8.K(mm40VarD, (Function1) objP4), 8.0f, 6.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            boolean zG2 = fetVar2.g(pz40Var);
            Object objP5 = fetVar2.P();
            if (zG2 || objP5 == cl5Var) {
                objP5 = new cml(pz40Var, (byte) 25);
                fetVar2.o0(objP5);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var, null, null, false, null, (Function0) objP5, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            rq8.d(0, fetVar2, s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11));
            v8q0.a(rsm0.w(R.string.auto_sub_title, 0, fetVar2), new x7z(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.l(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2), fetVar, 0, 24960, 110588);
            dww.c(a8k0.F(R.drawable.accordion_drawable_down, 0, fetVar), null, a8k0.I(o7k0.n(jm40Var, 16.0f), ((Number) t33Var.d()).floatValue()), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            fetVar.r(true);
            b34.e(y5d.f42040a, ((Boolean) pz40Var.getValue()).booleanValue(), null, null, null, null, zgc.b, fetVar, 1572870, 30);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(mm40Var, baoVar, i, (byte) 14);
        }
    }

    public static final void t(mm40 mm40Var, a5a0 a5a0Var, Function2 function2, fet fetVar, int i) {
        function2.getClass();
        fetVar.g0(1967360128);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a5a0Var) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.runtime.d dVar = bmd.t;
            wgu0 wgu0Var = (wgu0) fetVar.k(dVar);
            boolean zG = fetVar.g(wgu0Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new vfp(wgu0Var);
                fetVar.o0(objP);
            }
            obc.d(dVar.a((vfp) objP), u1c.M(-3715776, new tfp(a5a0Var, mm40Var, function2), fetVar), fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tfp(mm40Var, a5a0Var, function2, i);
        }
    }

    public static final void u(int i, fet fetVar, e900 e900Var, boolean z) {
        int i2;
        byte b;
        fetVar.g0(1933615683);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(e900Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(o7k0.d(o7k0.e(jm40Var, 60.0f), 1.0f), 12.0f, 10.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, i120.P(mm40VarN, e900Var, ugg0Var, 4));
            mm40 mm40VarP = i120.P(o7k0.p(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), z ? 128.0f : 96.0f, 16.0f), e900Var, ugg0Var, 4);
            yx7 yx7Var = gqw0.k;
            zq8.a(0, fetVar, mm40VarP.e(new ecu0(yx7Var)));
            mm40 mm40VarL = twn.l(yx7Var, o7k0.d(jm40Var, 1.0f));
            x5d x5dVarA = w5d.a(uc9.e, gqw0.o, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
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
            b = 0;
            zq8.a(0, fetVar, i120.P(o7k0.p(jm40Var, 64.0f, 16.0f), e900Var, ugg0Var, 4));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            b = 0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dcd(z, e900Var, i, b);
        }
    }

    public static final void v(int i, fet fetVar, mm40 mm40Var) {
        byte b;
        fetVar.g0(-432033152);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.e(R.drawable.ic_glyph_quick_bet_inactive) ? 32 : 16) | 384;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 52.0f);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarN, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 6.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.n(jm40Var, 40.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), vgg0.f37379a);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_glyph_quick_bet_inactive, (i2 >> 3) & 14, fetVar), null, o7k0.n(jm40Var, 32.0f), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            b = 1;
            fetVar.r(true);
            fetVar.r(true);
        } else {
            b = 1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, b);
        }
    }

    public static final void w(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-18359561);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str2) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 16.0f), 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            if (str.length() > 0) {
                fetVar2.e0(-425265074);
                j6n.h(str, oro0.f25744a, null, 0, 0, fetVar2, ((i2 >> 3) & 14) | 48, 28);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-425118041);
                fetVar2.r(false);
            }
            mm40Var2 = jm40Var;
            v8q0.a(str2, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i2 >> 6) & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nd8(mm40Var2, str, str2, i, (byte) 3);
        }
    }

    public static final void x(mm40 mm40Var, String str, a4x a4xVar, boolean z, fet fetVar, int i) {
        fet fetVar2;
        float f;
        fetVar.g0(1494799141);
        byte b = 2;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xx7 xx7Var = z ? gqw0.m : gqw0.o;
            if (a4xVar.size() <= 3) {
                zcl zclVar = qmk.f28987a;
                f = 2.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = -8.0f;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 0);
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
            v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, (i2 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(661934811, new etm(f, xx7Var, a4xVar, b), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ftm(mm40Var, str, a4xVar, z, i, (byte) 1);
        }
    }

    public static final void y(mm40 mm40Var, qjm qjmVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(604276622);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(qjmVar) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 40.0f);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40.b, 20.0f), 128.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(qjmVar.f28846a, fetVar, 0, 0), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gjm(mm40Var, qjmVar, i, b);
        }
    }

    public static final void z(j8n j8nVar, boolean z, Function0 function0, fet fetVar, int i) {
        fetVar.g0(-1055378018);
        int i2 = (fetVar.g(j8nVar) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            E(j8nVar.f16092a, fetVar, 6);
            int i3 = i2 << 3;
            A(j8nVar, z, function0, fetVar, (i3 & 896) | (i3 & 112) | 6 | 3072);
            E(j8nVar.c, fetVar, 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm((Object) j8nVar, z, (wdr) function0, i, (byte) 16);
        }
    }
}
