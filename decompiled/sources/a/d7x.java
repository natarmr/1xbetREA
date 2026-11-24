package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import android.util.TypedValue;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d7x {
    public static int A(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static yti0 B(Set set, f4x f4xVar) {
        x0x.G(set, "set1");
        x0x.G(f4xVar, "set2");
        return new yti0(set, f4xVar);
    }

    public static final boolean C(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static boolean D(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = k5d.f17714a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            jf4.o("outXyz must have a length of 3.");
            return false;
        }
        double d = ((double) iRed) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) iGreen) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iBlue) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    public static final boolean E(kiy kiyVar, kiy kiyVar2) {
        kiyVar.getClass();
        kiyVar2.getClass();
        if (aao0.f538a) {
            return vsm0.v(((wdk) kiyVar).b, ((wdk) kiyVar2).b);
        }
        jtv jtvVar = jtv.u;
        gys0 gys0Var = new gys0(false, false, false, jtvVar, u5.g, v5.b0);
        v2 v2Var = (v2) kiyVar;
        v2 v2Var2 = (v2) kiyVar2;
        if (v2Var == v2Var2) {
            return true;
        }
        Function2 function2I0 = jtvVar.i0();
        Boolean bool = function2I0 != null ? (Boolean) function2I0.invoke(v2Var, v2Var2) : null;
        return bool != null ? bool.booleanValue() : m2a.b.j(gys0Var, jtvVar, v2Var, v2Var2);
    }

    public static int F(int i, float f, int i2) {
        return k5d.c(k5d.e(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static HashSet G(int i) {
        int iCeil;
        if (i < 3) {
            e3c.s(i, "expectedSize");
            iCeil = i + 1;
        } else {
            iCeil = i < 1073741824 ? (int) Math.ceil(((double) i) / 0.75d) : Integer.MAX_VALUE;
        }
        return new HashSet(iCeil);
    }

    public static int H(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? context.getColor(i) : typedValue.data;
    }

    public static final int I(xrz xrzVar) {
        if (xrzVar == lf7.BET_LIMIT_1_DAY) {
            return R.string.limits_daily_limit_title;
        }
        if (xrzVar == lf7.BET_LIMIT_7_DAY) {
            return R.string.limits_weekly_limit_title;
        }
        if (xrzVar == lf7.BET_LIMIT_30_DAY) {
            return R.string.limits_monthly_limit_title;
        }
        if (xrzVar == xh7.BET_PROLONGATION_LIMIT_1_DAY) {
            return R.string.limits_daily_limit_title;
        }
        if (xrzVar == xh7.BET_PROLONGATION_LIMIT_7_DAY) {
            return R.string.limits_weekly_limit_title;
        }
        if (xrzVar == xh7.BET_PROLONGATION_LIMIT_30_DAY) {
            return R.string.limits_monthly_limit_title;
        }
        if (xrzVar == m810.LOSS_LIMIT_1_DAY) {
            return R.string.limits_daily_limit_title;
        }
        if (xrzVar == m810.LOSS_LIMIT_7_DAY) {
            return R.string.limits_weekly_limit_title;
        }
        if (xrzVar == m810.LOSS_LIMIT_30_DAY) {
            return R.string.limits_monthly_limit_title;
        }
        if (xrzVar == q8k.DEPOSIT_LIMIT_1_DAY) {
            return R.string.limits_daily_limit_title;
        }
        if (xrzVar == q8k.DEPOSIT_LIMIT_7_DAY) {
            return R.string.limits_weekly_limit_title;
        }
        if (xrzVar == q8k.DEPOSIT_LIMIT_30_DAY) {
            return R.string.limits_monthly_limit_title;
        }
        if (xrzVar == h8i0.SELF_EXCLUSION || xrzVar == h8i0.SHORT_SELF_EXCLUSION_SPORT || xrzVar == h8i0.SHORT_SELF_EXCLUSION_CASINO) {
            return R.string.limit_self_block;
        }
        if (xrzVar == tbe0.f33660a) {
            return R.string.reality_title;
        }
        if (xrzVar == pki0.SESSION_TIME_LIMIT_1_DAY) {
            return R.string.limits_session_time_title;
        }
        if (xrzVar == pki0.SESSION_TIME_LIMIT_7_DAY) {
            return R.string.limit_session_week_in_days;
        }
        if (xrzVar == pki0.SESSION_TIME_LIMIT_30_DAY) {
            return R.string.limit_session_month_in_days;
        }
        if (xrzVar == qmq0.f28997a) {
            return R.string.timeout_title;
        }
        if (xrzVar == q6i0.f28200a || xrzVar == h8i0.ETERNAL_SELF_EXCLUSION || xrzVar == zdy.f44231a || xrzVar == q8k.DEPOSIT_LIMIT_UNTIL_VERIFICATION || xrzVar == uvj.f36351a) {
            return R.string.empty_str;
        }
        t9f.b();
        return 0;
    }

    public static final Bitmap J(Image image) {
        Image.Plane[] planes = image.getPlanes();
        planes.getClass();
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i = 0; i < height; i++) {
            int i2 = iArr[i];
            iArr[i] = fbc.U(fbc.e(i2 & 255, (i2 >> 8) & 255, (i2 >> 16) & 255, (i2 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r54v3 */
    /* JADX WARN: Type inference failed for: r54v4, types: [a.knb, java.lang.String] */
    /* JADX WARN: Type inference failed for: r54v5 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    public static final knb K(List list, List list2, boolean z) {
        ?? arrayList;
        Long l;
        List list3;
        Object next;
        String str;
        ?? r54;
        ArrayList arrayList2;
        pgb pgbVar;
        ?? arrayList3;
        Long l2;
        Long l3;
        ArrayList arrayList4;
        pgb pgbVar2;
        Long l4;
        Long l5;
        Long l6;
        list.getClass();
        list2.getClass();
        ArrayList arrayList5 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            int i = 10;
            if (!it.hasNext()) {
                ArrayList arrayList6 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    pu10 pu10Var = (pu10) it2.next();
                    lu10 lu10Var = pu10Var.c;
                    long jLongValue = (lu10Var == null || (l = lu10Var.f20652a) == null) ? 0L : l.longValue();
                    List list4 = pu10Var.d;
                    if (list4 != null) {
                        arrayList = new ArrayList(r3d.q(list4, 10));
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(n2x.O((ej00) it3.next(), jLongValue));
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = iun.f15405a;
                    }
                    w3d.u(arrayList6, arrayList);
                }
                return new knb(arrayList5, arrayList6);
            }
            pu10 pu10Var2 = (pu10) it.next();
            List<iu10> list5 = pu10Var2.f27591a;
            lu10 lu10Var2 = pu10Var2.c;
            if (list5 != null) {
                ArrayList arrayList7 = new ArrayList(r3d.q(list5, 10));
                for (iu10 iu10Var : list5) {
                    Long l7 = lu10Var2 != null ? lu10Var2.f20652a : null;
                    Iterator it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                        long j = ((ril0) next).f30549a;
                        if (l7 != null && j == l7.longValue()) {
                            break;
                        }
                    }
                    ril0 ril0Var = (ril0) next;
                    if (ril0Var == null || (str = ril0Var.b) == null) {
                        str = "-";
                    }
                    String str2 = str;
                    Long l8 = iu10Var.f15378a;
                    Long l9 = iu10Var.k;
                    String str3 = iu10Var.b;
                    if (l8 == null) {
                        jf4.k(null);
                        return null;
                    }
                    long jLongValue2 = l8.longValue();
                    Long l10 = iu10Var.o;
                    long jLongValue3 = l10 != null ? l10.longValue() : 0L;
                    long jLongValue4 = (lu10Var2 == null || (l6 = lu10Var2.f20652a) == null) ? 0L : l6.longValue();
                    String str4 = str3 == null ? "" : str3;
                    int iLongValue = l9 != null ? (int) l9.longValue() : 0;
                    String str5 = iu10Var.c;
                    String str6 = str5 == null ? "" : str5;
                    String str7 = iu10Var.e;
                    String str8 = str7 == null ? "" : str7;
                    Integer num = iu10Var.f;
                    int iIntValue = num != null ? num.intValue() : 0;
                    Integer num2 = iu10Var.h;
                    long jIntValue = num2 != null ? num2.intValue() : 0L;
                    List<ou10> list6 = iu10Var.l;
                    if (list6 != null) {
                        ArrayList arrayList8 = new ArrayList(r3d.q(list6, i));
                        ArrayList arrayList9 = arrayList8;
                        for (ou10 ou10Var : list6) {
                            long jLongValue5 = (lu10Var2 == null || (l5 = lu10Var2.f20652a) == null) ? 0L : l5.longValue();
                            List list7 = ou10Var.l;
                            Long l11 = ou10Var.k;
                            Long l12 = ou10Var.f25855a;
                            String str9 = ou10Var.b;
                            Iterator it5 = it;
                            if (list7 != null) {
                                l3 = l11;
                                arrayList4 = new ArrayList(r3d.q(list7, i));
                                Iterator it6 = list7.iterator();
                                arrayList9 = arrayList9;
                                while (it6.hasNext()) {
                                    zps zpsVar = (zps) it6.next();
                                    Long l13 = zpsVar.f44775a;
                                    if (l13 == null) {
                                        jf4.k(null);
                                        return null;
                                    }
                                    long jLongValue6 = l13.longValue();
                                    long jLongValue7 = (lu10Var2 == null || (l4 = lu10Var2.f20652a) == null) ? 0L : l4.longValue();
                                    String str10 = str3;
                                    ou10 ou10Var2 = ou10Var;
                                    ArrayList arrayList10 = arrayList9;
                                    arrayList4.add(obc.V(zpsVar, jLongValue6, z, jLongValue7, str2, str9 == null ? str2 : str9, l12 != null ? l12.longValue() : 0L, l3 != null ? l3.longValue() : 0L));
                                    arrayList9 = arrayList10;
                                    ou10Var = ou10Var2;
                                    it6 = it6;
                                    l9 = l9;
                                    str3 = str10;
                                }
                            } else {
                                l3 = l11;
                                arrayList4 = null;
                            }
                            Long l14 = l9;
                            String str11 = str3;
                            ou10 ou10Var3 = ou10Var;
                            ArrayList arrayList11 = arrayList9;
                            List list8 = arrayList4;
                            if (arrayList4 == null) {
                                list8 = iun.f15405a;
                            }
                            List list9 = list8;
                            long jLongValue8 = l12 != null ? l12.longValue() : 0L;
                            Long l15 = ou10Var3.m;
                            long jLongValue9 = l15 != null ? l15.longValue() : 0L;
                            String str12 = str9 == null ? "" : str9;
                            Integer num3 = ou10Var3.h;
                            long jIntValue2 = num3 != null ? num3.intValue() : 0L;
                            String str13 = ou10Var3.c;
                            String str14 = str13 == null ? "" : str13;
                            int iLongValue2 = l3 != null ? (int) l3.longValue() : 0;
                            String str15 = ou10Var3.e;
                            String str16 = str15 == null ? "" : str15;
                            Integer num4 = ou10Var3.f;
                            int iIntValue2 = num4 != null ? num4.intValue() : 0;
                            Boolean bool = ou10Var3.i;
                            if (bool != null ? bool.booleanValue() : false) {
                                pgbVar2 = pgb.c;
                            } else {
                                Boolean bool2 = ou10Var3.j;
                                pgbVar2 = bool2 != null ? bool2.booleanValue() : false ? pgb.b : pgb.f26945a;
                            }
                            arrayList11.add(new sum0(jLongValue8, jLongValue9, str12, jIntValue2, str14, str16, iLongValue2, iIntValue2, jLongValue5, list9, pgbVar2));
                            arrayList9 = arrayList11;
                            it = it5;
                            l9 = l14;
                            str3 = str11;
                            i = 10;
                        }
                        r54 = 0;
                        arrayList2 = arrayList9;
                    } else {
                        r54 = 0;
                        arrayList2 = null;
                    }
                    Iterator it7 = it;
                    Long l16 = l9;
                    String str17 = str3;
                    List list10 = arrayList2;
                    if (arrayList2 == null) {
                        list10 = iun.f15405a;
                    }
                    List list11 = list10;
                    Boolean bool3 = iu10Var.i;
                    if (bool3 != null ? bool3.booleanValue() : false) {
                        pgbVar = pgb.c;
                    } else {
                        Boolean bool4 = iu10Var.j;
                        pgbVar = bool4 != null ? bool4.booleanValue() : false ? pgb.b : pgb.f26945a;
                    }
                    List<zps> list12 = iu10Var.n;
                    if (list12 != null) {
                        arrayList3 = new ArrayList(r3d.q(list12, 10));
                        for (zps zpsVar2 : list12) {
                            Long l17 = zpsVar2.f44775a;
                            if (l17 == null) {
                                jf4.k(r54);
                                return r54;
                            }
                            arrayList3.add(obc.V(zpsVar2, l17.longValue(), z, (lu10Var2 == null || (l2 = lu10Var2.f20652a) == null) ? 0L : l2.longValue(), str2, str17 == null ? str2 : str17, iu10Var.f15378a.longValue(), l16 != null ? l16.longValue() : 0L));
                        }
                    } else {
                        arrayList3 = r54;
                    }
                    if (arrayList3 == 0) {
                        arrayList3 = iun.f15405a;
                    }
                    arrayList7.add(new rbb(jLongValue2, jLongValue3, str4, list11, str2, jIntValue, str6, str8, iLongValue, iIntValue, z, jLongValue4, pgbVar, arrayList3, 67840));
                    it = it7;
                    i = 10;
                }
                list3 = arrayList7;
            } else {
                list3 = null;
            }
            Iterator it8 = it;
            if (list3 == null) {
                list3 = iun.f15405a;
            }
            w3d.u(arrayList5, list3);
            it = it8;
        }
    }

    public static final GameScreenGeneralParams L(long j, m9s m9sVar, boolean z) {
        m9sVar.getClass();
        Long l = m9sVar.q;
        if (!m9sVar.r) {
            return null;
        }
        if ((l != null && j == l.longValue()) || l == null || l.longValue() <= 0) {
            return null;
        }
        return new GameScreenGeneralParams(l.longValue(), 0L, m9sVar.o, m9sVar.p, z, 0L, kpb.u(m9sVar.y), GameBroadcastType.c, grs.b, "main_screen", "", ors.f25750a, 0, false, k1g.UNKNOWN);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0194  */
    /* JADX WARN: Code duplicated, block: B:137:0x0197  */
    /* JADX WARN: Code duplicated, block: B:140:0x019f  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:162:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public static final cm00 M(fm00 fm00Var) {
        ?? arrayList;
        boolean z;
        Iterator it;
        zfa0 xfa0Var;
        String str;
        String str2;
        List list;
        List list2;
        Integer num = fm00Var.e;
        int iIntValue = num != null ? num.intValue() : 0;
        Double d = fm00Var.b;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Long l = fm00Var.c;
        long jLongValue = l != null ? l.longValue() : 0L;
        Double d2 = fm00Var.d;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Boolean bool = fm00Var.f9763a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = fm00Var.f;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = fm00Var.g;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        List list3 = fm00Var.h;
        if (list3 == null) {
            jf4.k(null);
            return null;
        }
        long j = jLongValue;
        double d3 = dDoubleValue2;
        boolean z2 = zBooleanValue2;
        ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            mwe mweVar = (mwe) it2.next();
            mweVar.getClass();
            Integer num2 = mweVar.r;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            String str3 = mweVar.n;
            String str4 = str3 == null ? "" : str3;
            String str5 = mweVar.m;
            String str6 = str5 == null ? "" : str5;
            List list4 = mweVar.o;
            if (list4 == null) {
                list4 = iun.f15405a;
            }
            List list5 = list4;
            List list6 = mweVar.p;
            if (list6 == null) {
                list6 = iun.f15405a;
            }
            List list7 = list6;
            Double d4 = mweVar.b;
            double dDoubleValue3 = d4 != null ? d4.doubleValue() : 0.0d;
            Long l2 = mweVar.q;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            Long l3 = mweVar.c;
            long jLongValue3 = l3 != null ? l3.longValue() : 0L;
            Double d5 = mweVar.e;
            double dDoubleValue4 = d5 != null ? d5.doubleValue() : 0.0d;
            Long l4 = mweVar.k;
            long jLongValue4 = l4 != null ? l4.longValue() : 0L;
            Long l5 = mweVar.l;
            long jLongValue5 = l5 != null ? l5.longValue() : 0L;
            Boolean bool4 = mweVar.f;
            boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
            Long l6 = mweVar.f22499a;
            long jLongValue6 = l6 != null ? l6.longValue() : 0L;
            Long l7 = mweVar.d;
            long jLongValue7 = l7 != null ? l7.longValue() : 0L;
            Long l8 = mweVar.g;
            long jLongValue8 = l8 != null ? l8.longValue() : 0L;
            String str7 = mweVar.s;
            String str8 = str7 == null ? "" : str7;
            String str9 = mweVar.v;
            String str10 = str9 == null ? "" : str9;
            String str11 = mweVar.j;
            String str12 = str11 == null ? "" : str11;
            String str13 = mweVar.t;
            String str14 = str13 == null ? "" : str13;
            String str15 = mweVar.h;
            String str16 = str15 == null ? "" : str15;
            String str17 = mweVar.i;
            String str18 = str17 == null ? "" : str17;
            kga0 kga0Var = mweVar.w;
            if (kga0Var != null) {
                List list8 = kga0Var.f18229a;
                List list9 = kga0Var.b;
                if (list8 != null) {
                    z = zBooleanValue;
                    it = it2;
                    if ((!list8.isEmpty()) && list9 != null && (!list9.isEmpty())) {
                        xfa0Var = new xfa0(list8, list9);
                    }
                    if (xfa0Var == null) {
                    }
                    zfa0 zfa0Var = xfa0Var;
                    str = mweVar.u;
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    list = mweVar.x;
                    if (list == null) {
                        list = iun.f15405a;
                    }
                    list2 = mweVar.y;
                    if (list2 == null) {
                        list2 = iun.f15405a;
                    }
                    arrayList2.add(new am00(jLongValue6, dDoubleValue3, jLongValue3, jLongValue7, dDoubleValue4, zBooleanValue4, jLongValue8, str16, str18, str12, str14, str2, str10, jLongValue4, jLongValue5, str6, str4, list5, list7, jLongValue2, iIntValue2, str8, zfa0Var, new yeo(list, list2)));
                    zBooleanValue = z;
                    it2 = it;
                } else {
                    z = zBooleanValue;
                    it = it2;
                }
                xfa0Var = yfa0.INSTANCE;
                if (xfa0Var == null) {
                }
                zfa0 zfa0Var2 = xfa0Var;
                str = mweVar.u;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                list = mweVar.x;
                if (list == null) {
                    list = iun.f15405a;
                }
                list2 = mweVar.y;
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                arrayList2.add(new am00(jLongValue6, dDoubleValue3, jLongValue3, jLongValue7, dDoubleValue4, zBooleanValue4, jLongValue8, str16, str18, str12, str14, str2, str10, jLongValue4, jLongValue5, str6, str4, list5, list7, jLongValue2, iIntValue2, str8, zfa0Var2, new yeo(list, list2)));
                zBooleanValue = z;
                it2 = it;
            } else {
                z = zBooleanValue;
                it = it2;
            }
            xfa0Var = yfa0.INSTANCE;
            zfa0 zfa0Var3 = xfa0Var;
            str = mweVar.u;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            list = mweVar.x;
            if (list == null) {
                list = iun.f15405a;
            }
            list2 = mweVar.y;
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            arrayList2.add(new am00(jLongValue6, dDoubleValue3, jLongValue3, jLongValue7, dDoubleValue4, zBooleanValue4, jLongValue8, str16, str18, str12, str14, str2, str10, jLongValue4, jLongValue5, str6, str4, list5, list7, jLongValue2, iIntValue2, str8, zfa0Var3, new yeo(list, list2)));
            zBooleanValue = z;
            it2 = it;
        }
        boolean z3 = zBooleanValue;
        List list10 = fm00Var.i;
        if (list10 == null) {
            list10 = iun.f15405a;
        }
        List list11 = fm00Var.j;
        if (list11 != null) {
            arrayList = new ArrayList(r3d.q(list11, 10));
            Iterator it3 = list11.iterator();
            while (it3.hasNext()) {
                arrayList.add(knx.S((nn7) it3.next()));
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new cm00(z3, dDoubleValue, j, d3, iIntValue, z2, zBooleanValue3, arrayList2, list10, arrayList);
    }

    public static final k5a0 N(d280 d280Var, long j, List list, boolean z, dap dapVar) {
        dapVar.getClass();
        return z ? new f5a0(d280Var) : new b5a0(d280Var, j, dub.g0(j, list), dapVar);
    }

    public static final ytg0 O(eug0 eug0Var) {
        eug0Var.getClass();
        Double d = eug0Var.f8419a;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = eug0Var.b;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Double d3 = eug0Var.c;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
        Double d4 = eug0Var.d;
        double dDoubleValue4 = d4 != null ? d4.doubleValue() : 0.0d;
        Double d5 = eug0Var.e;
        double dDoubleValue5 = d5 != null ? d5.doubleValue() : 0.0d;
        Double d6 = eug0Var.f;
        double dDoubleValue6 = d6 != null ? d6.doubleValue() : 0.0d;
        Double d7 = eug0Var.g;
        double dDoubleValue7 = d7 != null ? d7.doubleValue() : 0.0d;
        Double d8 = eug0Var.h;
        double dDoubleValue8 = d8 != null ? d8.doubleValue() : 0.0d;
        String str = eug0Var.i;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Integer num = eug0Var.j;
        int iIntValue = num != null ? num.intValue() : 0;
        Boolean bool = eug0Var.k;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Long l = eug0Var.l;
        return new ytg0(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue7, dDoubleValue8, 0.0d, str2, iIntValue, zBooleanValue, l != null ? l.longValue() : 0L);
    }

    public static final nul0 P(yt40 yt40Var, fet fetVar) {
        xt40 xt40Var = (xt40) fetVar.k(pi30.f27025a);
        int iOrdinal = yt40Var.ordinal();
        if (iOrdinal == 0) {
            xt40Var.getClass();
            nul0 nul0Var = xt40.b;
            nul0Var.getClass();
            return nul0Var;
        }
        if (iOrdinal == 1) {
            xt40Var.getClass();
            nul0 nul0Var2 = xt40.c;
            nul0Var2.getClass();
            return nul0Var2;
        }
        if (iOrdinal == 2) {
            xt40Var.getClass();
            nul0 nul0Var3 = xt40.d;
            nul0Var3.getClass();
            return nul0Var3;
        }
        if (iOrdinal == 3) {
            xt40Var.getClass();
            nul0 nul0Var4 = xt40.e;
            nul0Var4.getClass();
            return nul0Var4;
        }
        if (iOrdinal == 4) {
            xt40Var.getClass();
            nul0 nul0Var5 = xt40.f;
            nul0Var5.getClass();
            return nul0Var5;
        }
        if (iOrdinal != 5) {
            t9f.b();
            return null;
        }
        xt40Var.getClass();
        nul0 nul0Var6 = xt40.g;
        nul0Var6.getClass();
        return nul0Var6;
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1346379434);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            ibc.A(mm40Var, 8.0f, j2e.e, fetVar, (i2 & 14) | 384);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 12);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(737638735);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            ugd ugdVar = j2e.f;
            jm40 jm40Var = jm40.b;
            btm0.k(jm40Var, ugdVar, fetVar, 390, 0);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 13);
        }
    }

    public static final void c(y5d y5dVar, mm40 mm40Var, ygx ygxVar, y9q0 y9q0Var, fet fetVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        b34.e(y5dVar, ygxVar.e, null, kzn.k(ro4.m0(300, 0, null, 6), null, 2).a(kzn.d(null, 0.0f, 3)), kzn.i(ro4.m0(300, 0, null, 6), null, 14).a(kzn.e(null, 3)), null, u1c.M(-343060148, new eyn(ygxVar, mm40Var, y9q0Var, (byte) 22), fetVar), fetVar, (i & 14) | 1600512, 18);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0124  */
    /* JADX WARN: Code duplicated, block: B:43:0x0126  */
    /* JADX WARN: Code duplicated, block: B:47:0x0130  */
    public static final void d(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        Function1 function2;
        cl5 cl5Var;
        boolean z;
        Object objP;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1957406038);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            imm immVar = ((zc40) l7m0Var.getValue()).f44149a;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z2 || objP2 == cl5Var2) {
                objP2 = new m040(function1, (byte) 15);
                fetVar.o0(objP2);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarD2, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
            hyl hylVar = ((zc40) l7m0Var.getValue()).b;
            vxl vxlVar = vxl.b;
            boolean z3 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z3) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP3 != cl5Var) {
                    function2 = function1;
                }
                Function1 function3 = (Function1) objP3;
                if (i3 == 32) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new rp30(function2, (byte) 7);
                    fetVar.o0(objP);
                }
                ebc.r(mm40VarQ, hylVar, vxlVar, function3, (Function1) objP, fetVar, 384, 8);
                mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                jcb.v(mm40VarD3, 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator60(), fetVar, 6, 0);
                fetVar.r(true);
            }
            function2 = function1;
            objP3 = new rp30(function2, (byte) 6);
            fetVar.o0(objP3);
            Function1 function4 = (Function1) objP3;
            if (i3 == 32) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar.P();
            if (z) {
                objP = new rp30(function2, (byte) 7);
                fetVar.o0(objP);
            } else {
                objP = new rp30(function2, (byte) 7);
                fetVar.o0(objP);
            }
            ebc.r(mm40VarQ, hylVar, vxlVar, function4, (Function1) objP, fetVar, 384, 8);
            mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar2 = qmk.f28987a;
            jcb.v(mm40VarD4, 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator60(), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function2, i, (byte) 21);
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(326210211);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            s4u0 s4u0VarR = iom0.r(jpm0.t(R.drawable.ic_glyph_live_indicator, 6, fetVar2), fetVar2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            zcl zclVar = qmk.f28987a;
            dww.c(s4u0VarR, null, o7k0.n(jm40Var, 24.0f), qcc.S(R.attr.uikitSecondary, fetVar2), fetVar2, 56, 0);
            str2 = str;
            v8q0.a(str2, o7k0.y(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), null, 3), qcc.S(R.attr.uikitTextPrimary, fetVar2), null, qmk.s, null, null, j1t0.b, 0L, null, 0L, 0, false, 0, 0, null, null, fetVar, (i2 >> 3) & 14, 0, 261992);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var2, str2, i, (byte) 11);
        }
    }

    public static final void f(mm40 mm40Var, pz40 pz40Var, xdr xdrVar, ugd ugdVar, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        yfe0 yfe0VarU;
        dg90 dg90Var;
        pz40 pz40Var2;
        pz40 pz40Var3;
        fetVar.g0(-651238184);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (((List) pz40Var.getValue()).isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    dg90Var = new dg90(mm40Var, pz40Var, xdrVar, ugdVar, i, (byte) 3);
                }
            } else {
                mm40Var2 = mm40Var;
                boolean z = fetVar.k(bmd.n) == k6z.f17794a;
                xcz xczVarA = ddz.a(q3d.i((List) pz40Var.getValue()), 0, fetVar, 0, 2);
                Object obj = Boolean.FALSE;
                pz40 pz40VarZ = v3c.Z(obj, new Object[0], fetVar);
                pz40 pz40VarZ2 = v3c.Z(obj, new Object[0], fetVar);
                pz40 pz40VarA0 = v3c.a0(0, new Object[0], fetVar, 6);
                Object objP = fetVar.P();
                Object obj2 = ukd.f35823a;
                if (objP == obj2) {
                    objP = twn.s(fetVar);
                }
                List list = (List) objP;
                hie0 hie0Var = new hie0();
                Object objP2 = fetVar.P();
                if (objP2 == obj2) {
                    fetVar.o0(obj);
                } else {
                    obj = objP2;
                }
                hie0Var.f13108a = ((Boolean) obj).booleanValue();
                boolean zG = fetVar.g(xczVarA) | fetVar.g(pz40VarA0);
                Object objP3 = fetVar.P();
                yje yjeVar = null;
                if (zG || objP3 == obj2) {
                    objP3 = new bz0(xczVarA, pz40VarA0, yjeVar, (byte) 9);
                    fetVar.o0(objP3);
                }
                m0x0.t(fetVar, xczVarA, (Function2) objP3);
                m0x0.t(fetVar, xczVarA, new jg90(xczVarA, list, hie0Var, yjeVar, (byte) 1));
                boolean zG2 = fetVar.g(xczVarA) | fetVar.g(pz40VarZ) | fetVar.g(pz40VarZ2);
                Object objP4 = fetVar.P();
                if (zG2 || objP4 == obj2) {
                    pz40Var2 = pz40VarZ;
                    objP4 = new rf30(xczVarA, pz40Var2, pz40VarZ2, yjeVar, (byte) 10);
                    pz40Var3 = pz40VarZ2;
                    fetVar.o0(objP4);
                } else {
                    pz40Var2 = pz40VarZ;
                    pz40Var3 = pz40VarZ2;
                }
                m0x0.t(fetVar, xczVarA, (Function2) objP4);
                boolean zG3 = fetVar.g(xczVarA);
                Object objP5 = fetVar.P();
                if (zG3 || objP5 == obj2) {
                    objP5 = new qg90(list, z, pz40Var3, hie0Var, pz40Var2);
                    fetVar.o0(objP5);
                }
                qg90 qg90Var = (qg90) objP5;
                Object objP6 = fetVar.P();
                if (objP6 == obj2) {
                    objP6 = new rx50();
                    fetVar.o0(objP6);
                }
                rx50 rx50Var = (rx50) objP6;
                mm40 mm40VarV = cjx.V(mm40Var2, qg90Var, 0);
                zcl zclVar = qmk.f28987a;
                qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
                Object objP7 = fetVar.P();
                if (z2 || objP7 == obj2) {
                    objP7 = new eg90(pz40Var, xdrVar, ugdVar, (byte) 2);
                    fetVar.o0(objP7);
                }
                b8k0.f(mm40VarV, xczVarA, null, false, qw3Var, null, rx50Var, false, null, (Function1) objP7, fetVar, 100663296, 172);
            }
            yfe0VarU.d = dg90Var;
        }
        mm40Var2 = mm40Var;
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            dg90Var = new dg90(mm40Var2, pz40Var, xdrVar, ugdVar, i, (byte) 5);
            yfe0VarU.d = dg90Var;
        }
    }

    public static final void g(mm40 mm40Var, spa0 spa0Var, Function1 function1, fet fetVar, int i) {
        long jC;
        fet fetVar2 = fetVar;
        spa0Var.getClass();
        function1.getClass();
        fetVar2.g0(-1585824114);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(spa0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.w(jm40Var, null, false, 3), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 16.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true);
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109);
            String str = spa0Var.f32582a;
            if (spa0Var.c) {
                fetVar2.e0(-95262737);
                jC = afn0.m(fetVar2).getWarning();
                fetVar2.r(false);
            } else {
                jC = rz4.c(fetVar2, -95261741, fetVar2, false);
            }
            v8q0.a(str, x7zVarI, jC, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new i0a0(function1, (byte) 20);
                fetVar2.o0(objP);
            }
            dww.c(a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2), null, y860.W(mm40VarN, null, null, false, null, (Function0) objP, 28), afn0.m(fetVar2).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
            fyl fylVar = spa0Var.b;
            vxl vxlVar = vxl.b;
            boolean z3 = i3 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new hs80(function1, (byte) 29);
                fetVar2.o0(objP2);
            }
            ebc.r(null, fylVar, vxlVar, (Function1) objP2, null, fetVar2, 384, 41);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var, spa0Var, function1, i, (byte) 14);
        }
    }

    public static final void h(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, fet fetVar, int i) {
        int i2;
        fetVar.g0(67273198);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar4) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(o7k0.e(o7k0.s(jm40.b, 48.0f), 56.0f), 6.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int i3 = i2;
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ);
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
            ua80.p((i3 & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
            Object objValueOf = Integer.valueOf(((i3 >> 3) & 112) | 6);
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar2.F(zhg0Var, fetVar, objValueOf);
            ugdVar3.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
            h97.p(((i3 >> 9) & 112) | 6, ugdVar4, zhg0Var, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cka(mm40Var, ugdVar, ugdVar2, ugdVar3, ugdVar4, i, (byte) 2);
        }
    }

    public static final void i(mm40 mm40Var, final kxb0 kxb0Var, fet fetVar, int i) {
        fetVar.g0(51754125);
        final byte b = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(kxb0Var) ? 32 : 16);
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            final byte b4 = 3;
            h(mm40Var, u1c.M(1412369213, new xdr() { // from class: a.zwb0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b2;
                    kxb0 kxb0Var2 = kxb0Var;
                    switch (b5) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((ir8) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                String str = kxb0Var2.f19047a;
                                qrq qrqVar = j1t0.f15753a;
                                long j = qmk.s;
                                kc5.N(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), q3d.j(new daq0(qmk.q), new daq0(j)), null, 0L, 0L, 0L, null, null, 0L, null, 0, false, 1, 0, false, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.G, 16646109), 0.0f, fetVar2, 0, 1572864, 0, 3080178);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                Object objP = fetVar3.P();
                                cl5 cl5Var = ukd.f35823a;
                                if (objP == cl5Var) {
                                    objP = new peb0((byte) 28);
                                    fetVar3.o0(objP);
                                }
                                Function1 function1 = (Function1) objP;
                                boolean zG = fetVar3.g(kxb0Var2);
                                Object objP2 = fetVar3.P();
                                if (zG || objP2 == cl5Var) {
                                    objP2 = new ppb0(kxb0Var2, (byte) 1);
                                    fetVar3.o0(objP2);
                                }
                                dwi0.b(function1, null, (Function1) objP2, fetVar3, 6, 2);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            yhg0 yhg0Var = (yhg0) obj;
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            yhg0Var.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= fetVar4.g(yhg0Var) ? 4 : 2;
                            }
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                String str2 = kxb0Var2.c;
                                mm40 mm40VarA = yhg0Var.a(1.0f, jm40.b, true);
                                zcl zclVar = qmk.f28987a;
                                v8q0.a(str2, s5x0.L(mm40VarA, 8.0f, 0.0f, 2), ((ThemeColors) fetVar4.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, 0, 24960, 110584);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                v8q0.a(kxb0Var2.d, s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, 0, 24960, 110584);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(130107691, new xdr() { // from class: a.zwb0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b3;
                    kxb0 kxb0Var2 = kxb0Var;
                    switch (b5) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((ir8) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                String str = kxb0Var2.f19047a;
                                qrq qrqVar = j1t0.f15753a;
                                long j = qmk.s;
                                kc5.N(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), q3d.j(new daq0(qmk.q), new daq0(j)), null, 0L, 0L, 0L, null, null, 0L, null, 0, false, 1, 0, false, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.G, 16646109), 0.0f, fetVar2, 0, 1572864, 0, 3080178);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                Object objP = fetVar3.P();
                                cl5 cl5Var = ukd.f35823a;
                                if (objP == cl5Var) {
                                    objP = new peb0((byte) 28);
                                    fetVar3.o0(objP);
                                }
                                Function1 function1 = (Function1) objP;
                                boolean zG = fetVar3.g(kxb0Var2);
                                Object objP2 = fetVar3.P();
                                if (zG || objP2 == cl5Var) {
                                    objP2 = new ppb0(kxb0Var2, (byte) 1);
                                    fetVar3.o0(objP2);
                                }
                                dwi0.b(function1, null, (Function1) objP2, fetVar3, 6, 2);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            yhg0 yhg0Var = (yhg0) obj;
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            yhg0Var.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= fetVar4.g(yhg0Var) ? 4 : 2;
                            }
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                String str2 = kxb0Var2.c;
                                mm40 mm40VarA = yhg0Var.a(1.0f, jm40.b, true);
                                zcl zclVar = qmk.f28987a;
                                v8q0.a(str2, s5x0.L(mm40VarA, 8.0f, 0.0f, 2), ((ThemeColors) fetVar4.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, 0, 24960, 110584);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                v8q0.a(kxb0Var2.d, s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, 0, 24960, 110584);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(723596362, new xdr() { // from class: a.zwb0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b;
                    kxb0 kxb0Var2 = kxb0Var;
                    switch (b5) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((ir8) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                String str = kxb0Var2.f19047a;
                                qrq qrqVar = j1t0.f15753a;
                                long j = qmk.s;
                                kc5.N(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), q3d.j(new daq0(qmk.q), new daq0(j)), null, 0L, 0L, 0L, null, null, 0L, null, 0, false, 1, 0, false, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.G, 16646109), 0.0f, fetVar2, 0, 1572864, 0, 3080178);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                Object objP = fetVar3.P();
                                cl5 cl5Var = ukd.f35823a;
                                if (objP == cl5Var) {
                                    objP = new peb0((byte) 28);
                                    fetVar3.o0(objP);
                                }
                                Function1 function1 = (Function1) objP;
                                boolean zG = fetVar3.g(kxb0Var2);
                                Object objP2 = fetVar3.P();
                                if (zG || objP2 == cl5Var) {
                                    objP2 = new ppb0(kxb0Var2, (byte) 1);
                                    fetVar3.o0(objP2);
                                }
                                dwi0.b(function1, null, (Function1) objP2, fetVar3, 6, 2);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            yhg0 yhg0Var = (yhg0) obj;
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            yhg0Var.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= fetVar4.g(yhg0Var) ? 4 : 2;
                            }
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                String str2 = kxb0Var2.c;
                                mm40 mm40VarA = yhg0Var.a(1.0f, jm40.b, true);
                                zcl zclVar = qmk.f28987a;
                                v8q0.a(str2, s5x0.L(mm40VarA, 8.0f, 0.0f, 2), ((ThemeColors) fetVar4.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, 0, 24960, 110584);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                v8q0.a(kxb0Var2.d, s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, 0, 24960, 110584);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(1317085033, new xdr() { // from class: a.zwb0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b4;
                    kxb0 kxb0Var2 = kxb0Var;
                    switch (b5) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((ir8) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                String str = kxb0Var2.f19047a;
                                qrq qrqVar = j1t0.f15753a;
                                long j = qmk.s;
                                kc5.N(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), q3d.j(new daq0(qmk.q), new daq0(j)), null, 0L, 0L, 0L, null, null, 0L, null, 0, false, 1, 0, false, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.G, 16646109), 0.0f, fetVar2, 0, 1572864, 0, 3080178);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                Object objP = fetVar3.P();
                                cl5 cl5Var = ukd.f35823a;
                                if (objP == cl5Var) {
                                    objP = new peb0((byte) 28);
                                    fetVar3.o0(objP);
                                }
                                Function1 function1 = (Function1) objP;
                                boolean zG = fetVar3.g(kxb0Var2);
                                Object objP2 = fetVar3.P();
                                if (zG || objP2 == cl5Var) {
                                    objP2 = new ppb0(kxb0Var2, (byte) 1);
                                    fetVar3.o0(objP2);
                                }
                                dwi0.b(function1, null, (Function1) objP2, fetVar3, 6, 2);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            yhg0 yhg0Var = (yhg0) obj;
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            yhg0Var.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= fetVar4.g(yhg0Var) ? 4 : 2;
                            }
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                String str2 = kxb0Var2.c;
                                mm40 mm40VarA = yhg0Var.a(1.0f, jm40.b, true);
                                zcl zclVar = qmk.f28987a;
                                v8q0.a(str2, s5x0.L(mm40VarA, 8.0f, 0.0f, 2), ((ThemeColors) fetVar4.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, 0, 24960, 110584);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                v8q0.a(kxb0Var2.d, s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, 0, 24960, 110584);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i2 & 14) | 28080);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(mm40Var, kxb0Var, i, (byte) 15);
        }
    }

    public static final void j(mm40 mm40Var, boolean z, int i, vyc0 vyc0Var, Function0 function0, xdr xdrVar, fet fetVar, int i2) {
        mm40 mm40Var2;
        xdr xdrVar2;
        xdr xdrVar3;
        int i3;
        mm40 mm40Var3;
        boolean z2;
        boolean z3;
        fetVar.g0(1682128105);
        int i4 = i2 | 6 | (fetVar.h(z) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.e(vyc0Var.ordinal()) ? 2048 : 1024) | (fetVar.i(function0) ? 16384 : 8192) | 65536;
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                xdrVar3 = z ? cwr0.e : null;
                i3 = i4 & (-458753);
                mm40Var3 = jm40.b;
            } else {
                fetVar.X();
                xdrVar3 = xdrVar;
                i3 = i4 & (-458753);
                mm40Var3 = mm40Var;
            }
            fetVar.s();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40Var3, 6.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            boolean z4 = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                mul mulVar = mul.e;
                oe9 oe9Var = oe9.c;
                te9 te9Var = new te9(i);
                int iOrdinal = vyc0Var.ordinal();
                if (iOrdinal == 0) {
                    z2 = true;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    z2 = false;
                }
                objP = new wul(mulVar, oe9Var, te9Var, z2, false, false);
                fetVar.o0(objP);
            }
            wul wulVar = (wul) objP;
            boolean z5 = (57344 & i3) == 16384;
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new l3c0(function0, (byte) 3);
                fetVar.o0(objP2);
            }
            qzb.n(null, wulVar, (Function0) objP2, fetVar, 0, 1);
            if (xdrVar3 == null) {
                fetVar.e0(-1198313038);
                z3 = false;
            } else {
                z3 = false;
                fetVar.e0(-1839770577);
                xdrVar3.F(jr8.f16991a, fetVar, 6);
            }
            fetVar.r(z3);
            fetVar.r(true);
            xdrVar2 = xdrVar3;
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            xdrVar2 = xdrVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ztc0(mm40Var2, z, i, vyc0Var, function0, xdrVar2, i2, (byte) 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(mm40 mm40Var, zyc0 zyc0Var, vyc0 vyc0Var, Function1 function1, Function0 function0, Function2 function2, Function2 function3, fet fetVar, int i, int i2) {
        Function0 function4;
        int i3;
        Function2 function5;
        mm40 mm40Var2;
        Function2 function6;
        Function0 function7;
        Function2 function8;
        Function2 function2M;
        Function2 function2M2;
        Function0 function9;
        int i4;
        mm40 mm40Var3;
        long jE;
        byte b;
        Object obj;
        byte b2;
        byte b3;
        Object obj2;
        function1.getClass();
        fetVar.g0(-1653611940);
        int i5 = i | 6;
        if ((i & 48) == 0) {
            i5 |= fetVar.g(zyc0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= fetVar.e(vyc0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= fetVar.i(function1) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i5 | 24576;
            function4 = function0;
        } else {
            function4 = function0;
            i3 = i5 | (fetVar.i(function4) ? 16384 : 8192);
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                function5 = function2;
                int i7 = fetVar.i(function5) ? 131072 : 65536;
                i3 |= i7;
            } else {
                function5 = function2;
            }
            i3 |= i7;
        } else {
            function5 = function2;
        }
        int i8 = i3 | 524288;
        if (fetVar.U(i8 & 1, (599187 & i8) != 599186)) {
            fetVar.Z();
            int i9 = i & 1;
            byte b4 = 3;
            jm40 jm40Var = jm40.b;
            if (i9 == 0 || fetVar.B()) {
                if (i6 != 0) {
                    function4 = null;
                }
                if ((i2 & 32) != 0) {
                    if (zyc0Var.d) {
                        fetVar.e0(521874834);
                        function2M = u1c.M(-2134099585, new rwc0((Object) zyc0Var, (Object) vyc0Var, (Object) function4, (byte) 4), fetVar);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(522330657);
                        fetVar.r(false);
                        function2M = null;
                    }
                    i8 &= -458753;
                } else {
                    function2M = function5;
                }
                String str = zyc0Var.c;
                if (str == null || str.length() <= 0) {
                    fetVar.e0(522863361);
                    fetVar.r(false);
                    function2M2 = null;
                } else {
                    fetVar.e0(522457510);
                    function2M2 = u1c.M(1721353549, new nrc0(zyc0Var, b4), fetVar);
                    fetVar.r(false);
                }
                function9 = function4;
                i4 = i8 & (-3670017);
                mm40Var3 = jm40Var;
            } else {
                fetVar.X();
                if ((i2 & 32) != 0) {
                    i8 &= -458753;
                }
                function9 = function4;
                function2M = function5;
                function2M2 = function3;
                i4 = i8 & (-3670017);
                mm40Var3 = mm40Var;
            }
            fetVar.s();
            String str2 = (String) zyc0Var.f45200a.getValue();
            if (str2 == null) {
                str2 = "";
            }
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            byte b5 = 14;
            Object obj3 = ukd.f35823a;
            Object obj4 = objP;
            if (objP == obj3) {
                Object cbc0Var = new cbc0(b5);
                fetVar.o0(cbc0Var);
                obj4 = cbc0Var;
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) obj4, fetVar, 48);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = epv0.N(o7k0.d(o7k0.e(s5x0.L(mm40Var3, 16.0f, 0.0f, 2), 48.0f), 1.0f), vyc0Var == vyc0.b ? 0.5f : 1.0f);
            zcl zclVar2 = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                jE = cs0.e(fetVar, 16884963, fetVar, false);
            } else {
                fetVar.e0(16885958);
                long background = afn0.m(fetVar).getBackground();
                fetVar.r(false);
                jE = background;
            }
            zcl zclVar3 = qmk.i;
            mm40 mm40VarQ = i120.Q(i120.S(mm40VarE, 1.0f, jE, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), afn0.m(fetVar).getBackground(), jd8.n);
            nw3 nw3Var = uc9.e;
            thg0 thg0VarA = shg0.a(nw3Var, gqw0.k, fetVar, 54);
            mm40 mm40Var4 = mm40Var3;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function10 = e7z.u1;
            if (z) {
                fetVar.l(function10);
            } else {
                fetVar.r0();
            }
            Function2 function11 = function2M2;
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
            String str3 = str2;
            mm40 mm40VarM = s5x0.M(dw9.h(1.0f, o7k0.c(jm40Var, 1.0f), true), 48.0f, 6.0f, function2M != 0 ? 6.0f : 48.0f, 6.0f);
            x5d x5dVarA = w5d.a(nw3Var, gqw0.n, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function10);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarE2 = o7k0.e(o7k0.d(jm40Var, 1.0f), 22.0f);
            boolean zG = fetVar.g(pz40Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj3) {
                b = 0;
                Object ryc0Var = new ryc0(pz40Var, b);
                fetVar.o0(ryc0Var);
                obj = ryc0Var;
            } else {
                b = 0;
                obj = objP2;
            }
            mm40 mm40VarB0 = j120.b0(mm40VarE2, (Function1) obj);
            afn0.v(fetVar).getClass();
            y9q0 y9q0VarA = y9q0.a(g1t0.j(), afn0.m(fetVar).getTextPrimary(), 0L, null, null, null, 0L, null, null, str3.length() == 0 ? 5 : 3, 0, 0L, null, null, 16744446);
            int iOrdinal = vyc0Var.ordinal();
            if (iOrdinal != 0) {
                b2 = 1;
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                b3 = b;
            } else {
                b2 = 1;
                b3 = 1;
            }
            skk0 skk0Var = new skk0(afn0.m(fetVar).getPrimary());
            uly ulyVar = new uly(0, null, 1, 0, 123);
            byte b6 = (i4 & 7168) == 2048 ? b2 : b;
            Object objP3 = fetVar.P();
            if (b6 != 0 || objP3 == obj3) {
                Object rpa0Var = new rpa0(function1, (byte) 28);
                fetVar.o0(rpa0Var);
                obj2 = rpa0Var;
            } else {
                obj2 = objP3;
            }
            boolean z2 = b;
            mm40Var2 = mm40Var4;
            int i10 = i4;
            boolean z3 = b3;
            Function2 function12 = function2M;
            z96.b(str3, (Function1) obj2, mm40VarB0, z3, y9q0VarA, ulyVar, null, true, 0, 0, null, null, skk0Var, u1c.M(-1058720781, new in80(str3, zyc0Var, (byte) 11), fetVar), fetVar, 102236160, 196608, 16016);
            if (((Boolean) pz40Var.getValue()).booleanValue() || str3.length() > 0) {
                fetVar.e0(-79804418);
                if (function11 == null) {
                    fetVar.e0(1821030339);
                } else {
                    fetVar.e0(-79804418);
                    function11.invoke(fetVar, Integer.valueOf(z2 ? 1 : 0));
                }
                fetVar.r(z2);
                fetVar.r(z2);
            } else {
                fetVar.e0(1821051916);
                fetVar.r(z2);
            }
            fetVar.r(true);
            if (function12 == null) {
                fetVar.e0(1882008985);
                fetVar.r(z2);
            } else {
                fetVar.e0(891993960);
                h97.q((i10 >> 15) & 14, fetVar, function12, z2);
            }
            fetVar.r(true);
            function8 = function12;
            function6 = function11;
            function7 = function9;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            function6 = function3;
            function7 = function4;
            function8 = function5;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pol(mm40Var2, zyc0Var, vyc0Var, function1, function7, function8, function6, i, i2, (byte) 3);
        }
    }

    public static final void l(mm40 mm40Var, l7m0 l7m0Var, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(1411399729);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | 16;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                l7m0Var = g8x.U((View) fetVar.k(dy2.f), fetVar, 0);
            } else {
                fetVar.X();
            }
            fetVar.s();
            WeakHashMap weakHashMap = djv0.w;
            int iF = h8x.F((tly) l7m0Var.getValue(), zcm0.i(fetVar).e.e().d);
            boolean zE = fetVar.e(iF);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new mq8(iF, (byte) 9);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            twn.v(6, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        l7m0 l7m0Var2 = l7m0Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jwe0(mm40Var, l7m0Var2, ugdVar, i, (byte) 1);
        }
    }

    public static final void m(int i, fet fetVar, mm40 mm40Var) {
        float f;
        fetVar.g0(256783261);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarV = o7k0.v(mm40Var, gqw0.j, true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarV);
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
            jm40 jm40Var = jm40.b;
            aem0.i(0, 0, fetVar, s5x0.N(s5x0.L(jm40Var, 0.0f, 8.0f, 1), qmk.a(fetVar).c, 0.0f, 0.0f, 0.0f, 14));
            nkb.h(s5x0.N(s5x0.L(jm40Var, qmk.a(fetVar).e, 0.0f, 2), 0.0f, 8.0f, 0.0f, 0.0f, 13), new ijm(), kjm.f18392a, null, null, null, fetVar, 384, 56);
            fetVar.e0(-1411646282);
            for (int i3 = 0; i3 < 3; i3++) {
                if (i3 == 2) {
                    zcl zclVar2 = qmk.f28987a;
                    f = 0.0f;
                } else {
                    zcl zclVar3 = qmk.f28987a;
                    f = 8.0f;
                }
                tdc.k(s5x0.N(s5x0.L(jm40Var, qmk.a(fetVar).c, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7), g0l0.f10465a, fetVar, 48);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, (byte) 19);
        }
    }

    public static final void n(mm40 mm40Var, rrj0 rrj0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        rrj0 rrj0Var2 = rrj0Var;
        fet fetVar2 = fetVar;
        rrj0Var2.getClass();
        fetVar2.g0(-1158112644);
        int i2 = i | 6 | (fetVar2.g(rrj0Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 4.0f, 7);
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
            String str = rrj0Var2.b;
            y9q0 y9q0VarG = g1t0.g();
            zfn zfnVar = m8m0.f21378a;
            v8q0.a(str, null, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarG, fetVar, 0, 0, 131066);
            rrj0Var2 = rrj0Var;
            v8q0.a(rrj0Var.f30987a, s5x0.L(new x7z(1.0f, true), 8.0f, 0.0f, 2), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            v8q0.a(rrj0Var2.c, null, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
            c9x.b(o7k0.e(o7k0.d(mm40Var2, 1.0f), 4.0f), rrj0Var2.d, rrj0Var2.e, fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) mm40Var2, (Object) rrj0Var2, i, (byte) 24);
        }
    }

    public static final void o(mm40 mm40Var, a4k0 a4k0Var, ugd ugdVar, fet fetVar, int i) {
        mm40 mm40Var2;
        xdr xdrVar;
        fet fetVar2;
        a4k0Var.getClass();
        jjm jjmVar = a4k0Var.f228a;
        fetVar.g0(-919503392);
        int i2 = i | (fetVar.g(a4k0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40Var2 = mm40Var;
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
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
            mm40 mm40VarN = jm40.b;
            if (jjmVar == null) {
                fetVar.e0(1377085414);
                fetVar.r(false);
                fetVar2 = fetVar;
            } else {
                fetVar.e0(1377085415);
                float f = xfn.a(fetVar).e;
                float f2 = xfn.a(fetVar).e;
                zcl zclVar = qmk.f28987a;
                nkb.h(s5x0.N(mm40VarN, f, 8.0f, f2, 0.0f, 8), a4k0Var.f228a, kjm.f18392a, null, null, null, fetVar, 384, 56);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            x7z x7zVar = new x7z(1.0f, true);
            if (jjmVar == null) {
                zcl zclVar2 = qmk.f28987a;
                mm40VarN = s5x0.N(mm40VarN, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            }
            xdrVar = ugdVar;
            xdrVar.F(x7zVar.e(mm40VarN), fetVar2, 48);
            fetVar2.r(true);
        } else {
            mm40Var2 = mm40Var;
            xdrVar = ugdVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(mm40Var2, (Object) a4k0Var, (wdr) xdrVar, i, (byte) 27);
        }
    }

    public static final void p(mm40 mm40Var, boolean z, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        xx7 xx7Var = gqw0.m;
        mw3 mw3Var = uc9.c;
        fetVar.g0(-609491216);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, qmk.a(fetVar).c, 0.0f, 0.0f, 0.0f, 14);
            cl5 cl5Var = ukd.f35823a;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.e0(1769143669);
                x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA, shdVar4);
                jpm0.o(fetVar, bh90VarM, shdVar3);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), shdVar2);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, shdVar);
                aem0.i(0, 0, fetVar, s5x0.N(mm40VarN, 0.0f, 8.0f, 0.0f, 0.0f, 13));
                a(0, fetVar, s5x0.N(mm40VarN, 0.0f, 8.0f, 0.0f, 4.0f, 5));
                mm40 mm40VarN2 = s5x0.N(s5x0.L(jm40Var, qmk.a(fetVar).e, 0.0f, 2), 0.0f, 8.0f, 0.0f, 0.0f, 13);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new ijm();
                    fetVar.o0(objP);
                }
                nkb.h(mm40VarN2, (ijm) objP, kjm.f18392a, null, null, null, fetVar, 432, 56);
                b(0, fetVar, null);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                fetVar.e0(1769749347);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40Var2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                jpm0.o(fetVar, Integer.valueOf(iHashCode2), shdVar2);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                a(0, fetVar, s5x0.L(mm40VarN, 0.0f, 8.0f, 1));
                aem0.i(0, 0, fetVar, s5x0.L(mm40VarN, 0.0f, 8.0f, 1));
                mm40 mm40VarN3 = s5x0.N(s5x0.L(jm40Var, qmk.a(fetVar).e, 0.0f, 2), 0.0f, 4.0f, 0.0f, 0.0f, 13);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new ijm();
                    fetVar.o0(objP2);
                }
                nkb.h(mm40VarN3, (ijm) objP2, kjm.f18392a, null, null, null, fetVar, 432, 56);
                b(0, fetVar, null);
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tb5(i, i2, mm40Var2, z);
        }
    }

    public static final void q(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        int i2;
        a4xVar.getClass();
        fetVar.g0(2101030813);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ife(a4xVar, (byte) 7);
                fetVar.o0(objP);
            }
            kwj kwjVarB = zk80.b(0, (Function0) objP, fetVar, 0, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarO = ny9.O(1.5f, o7k0.d(s5x0.N(s5x0.L(mm40Var, 12.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 0.0f, 13), 1.0f), false);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarO);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarE, background, ljcVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            q5x.e(kwjVarB, jr8Var.a(jm40Var), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-60150858, new ftl(a4xVar, b), fetVar), fetVar, 0, 24576, 16380);
            if (a4xVar.size() > 1) {
                fetVar.e0(-635435606);
                mm40 mm40VarN = s5x0.N(jr8Var.b(jm40Var, gqw0.h), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                zcl zclVar3 = qmk.m;
                mm40 mm40VarQ2 = i120.Q(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarN), ((StaticColors) fetVar.k(m8m0.f21378a)).m70getBlack200d7_KjU(), ljcVar);
                smm smmVar = smm.b;
                pz40 pz40Var = s6t0.f31722a;
                n1i.a(mm40VarQ2, kwjVarB, smmVar, new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU()), fetVar, 384, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-634973365);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zph(mm40Var, a4xVar, i, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[LOOP:0: B:21:0x0050->B:25:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object r(a.inn0 r7, a.zw5 r8) {
        /*
            boolean r0 = r8 instanceof a.vbg0
            if (r0 == 0) goto L13
            r0 = r8
            a.vbg0 r0 = (a.vbg0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.vbg0 r0 = new a.vbg0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            a.inn0 r7 = r0.i
            a.z1x.P(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L30:
            a.z1x.P(r8)
        L33:
            r0.i = r7
            r0.k = r3
            a.xoa0 r8 = a.xoa0.b
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            a.woa0 r8 = (a.woa0) r8
            int r2 = r8.d
            java.util.List r8 = r8.f39485a
            r2 = r2 & 66
            if (r2 == 0) goto L33
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L50:
            if (r5 >= r2) goto L62
            java.lang.Object r6 = r8.get(r5)
            a.dpa0 r6 = (a.dpa0) r6
            boolean r6 = a.x2x.I(r6)
            if (r6 != 0) goto L5f
            goto L33
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d7x.r(a.inn0, a.zw5):java.lang.Object");
    }

    public static final jlo0 s(ivd0 ivd0Var, amo0 amo0Var, ctf0 ctf0Var) {
        long j;
        ctf0Var.getClass();
        String strK = kng0.k("STATISTIC_TABLE", amo0Var.name());
        int i = 0;
        boolean z = amo0Var == amo0.f1119a;
        lc00 lc00VarB = kotlin.collections.a.b();
        int iOrdinal = amo0Var.ordinal();
        if (iOrdinal == 0) {
            j = kkg.r;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            j = kkg.q;
        }
        long j2 = j;
        eko0 eko0Var = new eko0(j2);
        sjo0 sjo0Var = sjo0.f32312a;
        String str = ivd0Var.b;
        StringBuilder sb = new StringBuilder(ujn.h);
        String str2 = (String) CollectionsKt.firstOrNull(ivd0Var.c);
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
            sb.setLength(0);
            sb.append(str2);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str2, '/'));
            i = 0;
        }
        vlo0 vlo0Var = new vlo0(sjo0Var, str, sb.toString(), "", j2);
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.rainbow_six_EPS, Arrays.copyOf(new Object[i], i));
        rlo0 rlo0Var = rlo0.f30708a;
        mlo0 mlo0Var = new mlo0(strA, eko0Var, rlo0Var);
        String strA2 = lsm0Var.a(R.string.rainbow_six_kd, Arrays.copyOf(new Object[i], i));
        plo0 plo0Var = plo0.f27195a;
        lc00VarB.add(new tlo0(vlo0Var, dyb.g0(mlo0Var, new mlo0(strA2, eko0Var, plo0Var), new mlo0(lsm0Var.a(R.string.rainbow_six_kost, Arrays.copyOf(new Object[i], i)), eko0Var, rlo0Var), new mlo0(lsm0Var.a(R.string.rainbow_six_kpr, Arrays.copyOf(new Object[i], i)), eko0Var, rlo0Var), new mlo0(lsm0Var.a(R.string.rainbow_six_hs, Arrays.copyOf(new Object[0], 0)), eko0Var, rlo0Var))));
        List<kvd0> list = ivd0Var.d;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (kvd0 kvd0Var : list) {
            kvd0Var.getClass();
            xlo0 xlo0Var = new xlo0(kvd0Var.f18952a);
            String strValueOf = String.valueOf(kvd0Var.e);
            qek0 qek0Var = qek0.c;
            arrayList.add(new tlo0(xlo0Var, dyb.g0(new mlo0(strValueOf, qek0Var, rlo0Var), new mlo0(w6x.n(kvd0Var.b, kvd0Var.c, "-"), qek0Var, plo0Var), new mlo0(f140.i(kvd0Var.d, Separators.PERCENT), qek0Var, rlo0Var), new mlo0(String.valueOf(kvd0Var.f), qek0Var, rlo0Var), new mlo0(f140.i(kvd0Var.g, Separators.PERCENT), qek0Var, rlo0Var))));
        }
        return new jlo0(strK, cs0.f(lc00VarB, lc00VarB, arrayList), ulo0.f35883a, z);
    }

    public static int t(int i, int i2) {
        return k5d.e(i, (Color.alpha(i) * i2) / 255);
    }

    public static boolean u(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static zti0 v(Set set, lsb0 lsb0Var) {
        if (set instanceof SortedSet) {
            Collection collection = (SortedSet) set;
            if (!(collection instanceof zti0)) {
                return new aui0(collection, lsb0Var);
            }
            zti0 zti0Var = (zti0) collection;
            return new aui0((SortedSet) zti0Var.f44961a, new msb0(Arrays.asList(zti0Var.b, lsb0Var)));
        }
        if (set instanceof zti0) {
            zti0 zti0Var2 = (zti0) set;
            return new zti0((Set) zti0Var2.f44961a, new msb0(Arrays.asList(zti0Var2.b, lsb0Var)));
        }
        set.getClass();
        return new zti0(set, lsb0Var);
    }

    public static final void w(dpi0 dpi0Var, String str, y9q0 y9q0Var) {
        smk0 smk0Var = y9q0Var.f42262a;
        boolean zK = dpi0Var.k();
        h83 h83Var = (h83) dpi0Var.f6468a;
        k5q0 k5q0Var = k5q0.b;
        float f = 0.0f;
        if (zK) {
            h83 h83Var2 = new h83();
            long j = y3d.g;
            long j2 = daq0.c;
            pz40 pz40Var = s6t0.f31722a;
            smk0 smk0Var2 = new smk0(StaticColors.INSTANCE.m123getWhite0d7_KjU(), smk0Var.b, null, smk0Var.d, null, null, null, j2, new j56(f), null, null, j, k5q0Var, null, null, 17424);
            h83Var2.c(". ");
            StringBuilder sb = h83Var2.f12607a;
            h83Var2.a(smk0Var2, 0, sb.length());
            sb.length();
            h83Var.b(h83Var2.h());
        }
        h83 h83Var3 = new h83();
        str.getClass();
        long j3 = y3d.g;
        long j4 = daq0.c;
        pz40 pz40Var2 = s6t0.f31722a;
        long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
        long j5 = smk0Var.b;
        lsq lsqVar = smk0Var.d;
        smk0 smk0Var3 = new smk0(jM123getWhite0d7_KjU, j5, smk0Var.c, lsqVar, null, smk0Var.f, null, j4, new j56(0.0f), null, null, j3, k5q0Var, null, smk0Var.o, 17424);
        h83Var3.c(str);
        StringBuilder sb2 = h83Var3.f12607a;
        h83Var3.a(smk0Var3, 0, sb2.length());
        sb2.length();
        h83Var.b(h83Var3.h());
    }

    public static final wj30 x(jbz jbzVar, int i, long j, kk80 kk80Var, long j2, yx7 yx7Var, k6z k6zVar, int i2, ey40 ey40Var) {
        List list;
        ma80 ma80Var = ma80.f21447a;
        Object objD = kk80Var.d(i);
        List list2 = (List) ey40Var.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listA = jbzVar.a(i);
            int size = listA.size();
            ArrayList arrayList = new ArrayList(size);
            int iE = 0;
            while (iE < size) {
                iE = w6x.e((pj30) listA.get(iE), j, arrayList, iE, 1);
            }
            ey40Var.j(i, arrayList);
            list = arrayList;
        }
        return new wj30(i, i2, list, j2, objD, yx7Var, k6zVar);
    }

    public static Integer y(int i, Context context) {
        TypedValue typedValueQ = n6x.Q(context.getTheme(), i);
        if (typedValueQ != null) {
            return Integer.valueOf(H(context, typedValueQ));
        }
        return null;
    }

    public static final j83 z(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        dpi0 dpi0Var = new dpi0((byte) 15);
        if (str.length() > 0) {
            pz40 pz40Var = s6t0.f31722a;
            w(dpi0Var, str, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045));
        }
        if (!StringsKt.W(str2)) {
            pz40 pz40Var2 = s6t0.f31722a;
            w(dpi0Var, str2, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045));
        }
        if (str3.length() > 0) {
            pz40 pz40Var3 = s6t0.f31722a;
            w(dpi0Var, str3, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045));
        }
        if (str4.length() > 0) {
            pz40 pz40Var4 = s6t0.f31722a;
            w(dpi0Var, str4, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045));
        }
        if (str5.length() > 0) {
            pz40 pz40Var5 = s6t0.f31722a;
            w(dpi0Var, str5, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045));
        }
        if (str6.length() > 0) {
            pz40 pz40Var6 = s6t0.f31722a;
            w(dpi0Var, str6, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109));
        }
        return ((h83) dpi0Var.f6468a).h();
    }
}
