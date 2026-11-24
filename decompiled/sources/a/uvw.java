package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class uvw {
    public static final u1i A(cws cwsVar, fet fetVar) {
        cwsVar.getClass();
        int i = cwsVar.i.f;
        m6m0 m6m0Var = bop0.b;
        if (i == 1) {
            fetVar.e0(-1832803663);
            s1i s1iVar = new s1i(rsm0.w(R.string.team_first, 0, fetVar));
            fetVar.r(false);
            return s1iVar;
        }
        if (i == 2) {
            fetVar.e0(-1832799536);
            t1i t1iVar = new t1i(rsm0.w(R.string.team_sec, 0, fetVar));
            fetVar.r(false);
            return t1iVar;
        }
        fetVar.e0(-1832796038);
        r1i r1iVar = new r1i(rsm0.w(R.string.add_to_command_text, 0, fetVar));
        fetVar.r(false);
        return r1iVar;
    }

    public static Intent B(yc3 yc3Var) {
        Intent parentActivityIntent = yc3Var.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strD = D(yc3Var, yc3Var.getComponentName());
            if (strD == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(yc3Var, strD);
            try {
                return D(yc3Var, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strD + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent C(yc3 yc3Var, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strD = D(yc3Var, componentName);
        if (strD == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strD);
        return D(yc3Var, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String D(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final ffa0 E(Float f, Float f2, String str) {
        return new ffa0(J(f, str), K(f, f2, false));
    }

    public static ffa0 F(Integer num, Integer num2) {
        String str;
        if (num != null) {
            str = num + "";
        } else {
            str = "-";
        }
        return new ffa0(str, L(num, num2, false));
    }

    public static ffa0 G(Float f, Float f2) {
        return new ffa0(J(f, ""), K(f, f2, true));
    }

    public static final u1i H(cws cwsVar, fet fetVar) {
        cwsVar.getClass();
        int i = cwsVar.j.f;
        m6m0 m6m0Var = bop0.b;
        if (i == 1) {
            fetVar.e0(1033360054);
            s1i s1iVar = new s1i(rsm0.w(R.string.team_first, 0, fetVar));
            fetVar.r(false);
            return s1iVar;
        }
        if (i == 2) {
            fetVar.e0(1033364181);
            t1i t1iVar = new t1i(rsm0.w(R.string.team_sec, 0, fetVar));
            fetVar.r(false);
            return t1iVar;
        }
        fetVar.e0(1033367679);
        r1i r1iVar = new r1i(rsm0.w(R.string.add_to_command_text, 0, fetVar));
        fetVar.r(false);
        return r1iVar;
    }

    public static final chl0 I(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new chl0(str, str2, k0d.f17460a, a65.f301a, false, false, false, false, new xgl0(0L, 0.0d, 0.0d, "", 0, 0L, 0, 0L, false));
    }

    public static final String J(Float f, String str) {
        if (f == null) {
            return "-";
        }
        float fFloatValue = f.floatValue();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return ohs0.n(decimalFormat.format(new BigDecimal(String.valueOf(fFloatValue))), str);
    }

    public static final long K(Float f, Float f2, boolean z) {
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        float fFloatValue2 = f2 != null ? f2.floatValue() : 0.0f;
        float f3 = fFloatValue2 >= 0.0f ? fFloatValue2 : 0.0f;
        return (!z ? fFloatValue > f3 : fFloatValue < f3) ? y3d.c : kkg.i;
    }

    public static final long L(Integer num, Integer num2, boolean z) {
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue < 0) {
            iIntValue = 0;
        }
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        int i = iIntValue2 >= 0 ? iIntValue2 : 0;
        return (!z ? iIntValue > i : iIntValue < i) ? y3d.c : kkg.i;
    }

    public static final boolean M(long j) {
        if (h2t0.a(j, y3d.f)) {
            return false;
        }
        y4d y4dVarF = y3d.f(j);
        if (!kbc.T(y4dVarF.b, 12884901888L)) {
            wcx.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(kbc.k0(y4dVarF.b)));
        }
        qbg0 qbg0Var = ((ubg0) y4dVarF).p;
        float fE = (float) ((qbg0Var.e(y3d.e(j)) * 0.0722d) + (qbg0Var.e(y3d.g(j)) * 0.7152d) + (qbg0Var.e(y3d.h(j)) * 0.2126d));
        if (fE < 0.0f) {
            fE = 0.0f;
        }
        if (fE > 1.0f) {
            fE = 1.0f;
        }
        return ((double) fE) <= 0.5d;
    }

    public static final void N(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final a1g O(gmq gmqVar, Function1 function1, xdr xdrVar) {
        return new a1g(gmqVar, new pnf(function1, xdrVar, null), (byte) 20);
    }

    public static a1g P(gmq gmqVar, Function0 function0, long j, Function1 function1, xdr xdrVar, Function1 function2, int i) {
        boolean z = (i & 8) != 0;
        if ((i & 16) != 0) {
            xdrVar = new bk9(3, null, (byte) 4);
        }
        return new a1g(gmqVar, new t7h0((i & 32) != 0 ? new w0h0((byte) 16) : function2, j, function1, function0, xdrVar, z, null), (byte) 20);
    }

    public static final a1g Q(gmq gmqVar, boolean z) {
        return new a1g(gmqVar, new u7h0(z, null), (byte) 20);
    }

    public static final void R(View view, Fragment fragment, RecyclerView recyclerView) throws Exception {
        view.getClass();
        fragment.getClass();
        int paddingBottom = view.getPaddingBottom();
        int paddingBottom2 = recyclerView != null ? recyclerView.getPaddingBottom() : 0;
        p7m0 p7m0Var = tfx.B(view).f37357a;
        mw0 mw0Var = new mw0(view, paddingBottom, recyclerView, paddingBottom2, null);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(fragment);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new cxd(p7m0Var, clzVarW, mw0Var, (yje) null), 3);
    }

    public static final String S(Object[] objArr, int i, int i2, e4 e4Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == e4Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final vt20 T(gw20 gw20Var, boolean z) {
        return new vt20(0, gw20Var.b, gw20Var.f12005a, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    public static final p830 U(z830 z830Var) {
        ?? arrayList;
        ?? arrayList2;
        Integer num;
        ?? arrayList3;
        ?? arrayList4;
        z830Var.getClass();
        ?? arrayList5 = 0;
        if (z830Var instanceof s830) {
            List list = ((s830) z830Var).f31784a;
            if (list != null) {
                ArrayList arrayList6 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List list2 = ((md00) it.next()).f21573a;
                    if (list2 != null) {
                        arrayList3 = new ArrayList();
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            List list3 = ((y830) it2.next()).f42177a;
                            if (list3 != null) {
                                arrayList4 = new ArrayList();
                                Iterator it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    r4q0 r4q0VarZ = Z((o4q0) it3.next());
                                    if (r4q0VarZ != null) {
                                        arrayList4.add(r4q0VarZ);
                                    }
                                }
                            } else {
                                arrayList4 = 0;
                            }
                            if (arrayList4 == 0) {
                                arrayList4 = iun.f15405a;
                            }
                            arrayList3.add(new o830(arrayList4));
                        }
                    } else {
                        arrayList3 = 0;
                    }
                    if (arrayList3 == 0) {
                        arrayList3 = iun.f15405a;
                    }
                    arrayList6.add(new ld00(arrayList3));
                }
                return new m830(arrayList6);
            }
        } else {
            if (!(z830Var instanceof v830)) {
                if (!(z830Var instanceof y830)) {
                    t9f.b();
                    return null;
                }
                List list4 = ((y830) z830Var).f42177a;
                if (list4 != null) {
                    arrayList5 = new ArrayList();
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        r4q0 r4q0VarZ2 = Z((o4q0) it4.next());
                        if (r4q0VarZ2 != null) {
                            arrayList5.add(r4q0VarZ2);
                        }
                    }
                }
                if (arrayList5 == 0) {
                    arrayList5 = iun.f15405a;
                }
                return new o830(arrayList5);
            }
            v830 v830Var = (v830) z830Var;
            fa80 fa80Var = v830Var.f36962a;
            ca80 ca80Var = (fa80Var == null || (num = fa80Var.f9196a) == null) ? null : new ca80(num.intValue());
            List list5 = v830Var.b;
            if (list5 != null) {
                ArrayList arrayList7 = new ArrayList();
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    List list6 = ((md00) it5.next()).f21573a;
                    if (list6 != null) {
                        arrayList = new ArrayList();
                        Iterator it6 = list6.iterator();
                        while (it6.hasNext()) {
                            List list7 = ((y830) it6.next()).f42177a;
                            if (list7 != null) {
                                arrayList2 = new ArrayList();
                                Iterator it7 = list7.iterator();
                                while (it7.hasNext()) {
                                    r4q0 r4q0VarZ3 = Z((o4q0) it7.next());
                                    if (r4q0VarZ3 != null) {
                                        arrayList2.add(r4q0VarZ3);
                                    }
                                }
                            } else {
                                arrayList2 = 0;
                            }
                            if (arrayList2 == 0) {
                                arrayList2 = iun.f15405a;
                            }
                            arrayList.add(new o830(arrayList2));
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = iun.f15405a;
                    }
                    arrayList7.add(new ld00(arrayList));
                }
                return new n830(ca80Var, arrayList7);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    public static final v5m V(f2h f2hVar, long j, boolean z, List list) {
        long j2 = f2hVar.b;
        String str = f2hVar.c;
        String str2 = f2hVar.d;
        str2.getClass();
        if (!kotlin.text.c.x(str2, ujn.h, false)) {
            if (str2.length() == 0) {
                str2 = "";
            } else {
                List list2 = u0d.f34849a;
                if (u0d.c(str2)) {
                    str2 = "";
                } else {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
        }
        n0x n0xVar = new n0x(str2);
        List list3 = z ? list : null;
        return new v5m(j2, str, n0xVar, R.drawable.ic_glyph_circle_globe, list3 != null ? Boolean.valueOf(jpm0.i(list3, f2hVar.b, 40L, j)) : null, false);
    }

    public static final lb90 W(Integer num) {
        if (num != null && num.intValue() == 0) {
            return lb90.f19744a;
        }
        return (num != null && num.intValue() == 1) ? lb90.b : lb90.f19744a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    public static final xxh0 X(ayh0 ayh0Var, jch jchVar) {
        ?? arrayList;
        ?? arrayList2;
        wxh0 wxh0Var;
        bih bihVar;
        Long l;
        ayh0Var.getClass();
        List list = ayh0Var.f1669a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(x1x.Q((ooa) it.next()));
            }
        } else {
            arrayList = iun.f15405a;
        }
        ?? r4 = arrayList;
        List list2 = ayh0Var.b;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(x1x.Q((ooa) it2.next()));
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        ?? r5 = arrayList2;
        rxh0 rxh0Var = ayh0Var.d;
        if (rxh0Var != null) {
            int iOrdinal = rxh0Var.ordinal();
            if (iOrdinal == 0) {
                wxh0Var = wxh0.f39931a;
            } else if (iOrdinal == 1) {
                wxh0Var = wxh0.b;
            } else if (iOrdinal == 2) {
                wxh0Var = wxh0.c;
            } else if (iOrdinal == 3) {
                wxh0Var = wxh0.d;
            } else if (iOrdinal == 4) {
                wxh0Var = wxh0.e;
            } else {
                if (iOrdinal != 5) {
                    t9f.b();
                    return null;
                }
                wxh0Var = wxh0.f;
            }
        } else {
            wxh0Var = wxh0.g;
        }
        return new xxh0(r4, r5, wxh0Var, (jchVar == null || (bihVar = jchVar.j) == null || (l = bihVar.f2659a) == null) ? 0L : l.longValue());
    }

    public static final List Y(wx90 wx90Var) {
        String[] strArr;
        wx90Var.getClass();
        vx90[] vx90VarArr = wx90Var.f39922a;
        if (vx90VarArr == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (vx90 vx90Var : vx90VarArr) {
            Integer num = vx90Var.d;
            if ((num == null || num.intValue() != 1) && (strArr = vx90Var.c) != null) {
                ArrayList arrayList2 = new ArrayList(strArr.length);
                for (String str : strArr) {
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    arrayList2.add(lowerCase);
                }
                if (arrayList2.contains("android")) {
                    arrayList.add(vx90Var);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num2 = ((vx90) it.next()).f38190a;
            arrayList3.add(Long.valueOf(num2 != null ? num2.intValue() : 0L));
        }
        return arrayList3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final r4q0 Z(o4q0 o4q0Var) {
        y2q0 v2q0Var;
        String str;
        String str2 = o4q0Var.f24653a;
        Integer num = o4q0Var.d;
        List list = null;
        if (Intrinsics.d(str2, ParameterNames.TEXT)) {
            Integer num2 = o4q0Var.c;
            if (num2 != null && num != null) {
                int iIntValue = num2.intValue();
                int iIntValue2 = num.intValue();
                List<s2q0> list2 = o4q0Var.e;
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (s2q0 s2q0Var : list2) {
                        String str3 = s2q0Var.f31515a;
                        if (str3 != null) {
                            switch (str3.hashCode()) {
                                case -1178781136:
                                    v2q0Var = str3.equals("italic") ? u2q0.f34959a : null;
                                    break;
                                case -1026963764:
                                    v2q0Var = str3.equals("underline") ? x2q0.f40182a : null;
                                    break;
                                case -891985998:
                                    v2q0Var = str3.equals("strike") ? w2q0.f38464a : null;
                                    break;
                                case 3029637:
                                    v2q0Var = str3.equals("bold") ? t2q0.f33228a : null;
                                    break;
                                case 3321850:
                                    v2q0Var = (str3.equals("link") && (str = s2q0Var.b) != null) ? new v2q0(str) : null;
                                    break;
                                default:
                                    v2q0Var = null;
                                    break;
                            }
                        } else {
                            v2q0Var = null;
                        }
                        if (v2q0Var != null) {
                            arrayList.add(v2q0Var);
                        }
                    }
                    list = arrayList;
                }
                if (list == null) {
                    list = iun.f15405a;
                }
                return new q4q0(iIntValue, iIntValue2, list);
            }
        } else if (Intrinsics.d(str2, "hardBreak")) {
            return p4q0.f26367a;
        }
        return null;
    }

    public static final void a(mm40 mm40Var, mkg0 mkg0Var, fet fetVar, int i) {
        fetVar.g0(-1918294295);
        int i2 = i | 6 | (fetVar.g(mkg0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1871723433, new dke0(mkg0Var), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(mm40Var, mkg0Var, i, (byte) 19);
        }
    }

    public static final void b(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        yfe0 yfe0VarU;
        zw1 zw1Var;
        a4xVar.getClass();
        fetVar.g0(-1041761268);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (a4xVar.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    zw1Var = new zw1(mm40Var, a4xVar, i, (byte) 12);
                }
            } else {
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (z || objP == cl5Var) {
                    Iterator<E> it = a4xVar.iterator();
                    double dFloatValue = 0.0d;
                    while (it.hasNext()) {
                        dFloatValue += (double) ((Number) it.next()).floatValue();
                    }
                    objP = Float.valueOf((float) dFloatValue);
                    fetVar.o0(objP);
                }
                float fFloatValue = ((Number) objP).floatValue();
                if (fFloatValue <= 0.0f) {
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU == null) {
                        return;
                    } else {
                        zw1Var = new zw1(mm40Var, a4xVar, i, (byte) 13);
                    }
                } else {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40Var, 6.0f);
                    boolean zD = fetVar.d(fFloatValue) | (i3 == 32);
                    Object objP2 = fetVar.P();
                    if (zD || objP2 == cl5Var) {
                        objP2 = new sfz(a4xVar, fFloatValue, b);
                        fetVar.o0(objP2);
                    }
                    zq8.a(0, fetVar, rq8.L(mm40VarE, (Function1) objP2));
                }
            }
            yfe0VarU.d = zw1Var;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            zw1Var = new zw1(mm40Var, a4xVar, i, (byte) 14);
            yfe0VarU.d = zw1Var;
        }
    }

    public static final void c(final c610 c610Var, mm40 mm40Var, fet fetVar, int i) {
        c610Var.getClass();
        fetVar.g0(989380751);
        final byte b = 4;
        final byte b2 = 2;
        int i2 = i | (fetVar.g(c610Var) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16);
        final byte b3 = 0;
        final byte b4 = 1;
        final byte b5 = 3;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            final mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 6.0f, 8.0f, 6.0f, 1);
            mbc.f(mm40Var, 0.0f, 0.55f, u1c.M(-1885127414, new xdr() { // from class: a.j610
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b6 = b3;
                    c610 c610Var2 = c610Var;
                    mm40 mm40Var2 = mm40VarN;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b6) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 24.0f), c610Var2.f3797a);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, mm40Var2, c610Var2.b);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 2:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.c);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 3:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.d);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-394558709, new xdr() { // from class: a.j610
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b6 = b4;
                    c610 c610Var2 = c610Var;
                    mm40 mm40Var2 = mm40VarN;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b6) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 24.0f), c610Var2.f3797a);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, mm40Var2, c610Var2.b);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 2:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.c);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 3:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.d);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), null, null, null, u1c.M(381142796, new xdr() { // from class: a.j610
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b6 = b2;
                    c610 c610Var2 = c610Var;
                    mm40 mm40Var2 = mm40VarN;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b6) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 24.0f), c610Var2.f3797a);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, mm40Var2, c610Var2.b);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 2:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.c);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 3:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.d);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(1871711501, new xdr() { // from class: a.j610
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b6 = b5;
                    c610 c610Var2 = c610Var;
                    mm40 mm40Var2 = mm40VarN;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b6) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 24.0f), c610Var2.f3797a);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, mm40Var2, c610Var2.b);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 2:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.c);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 3:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.d);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-932687090, new xdr() { // from class: a.j610
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b6 = b;
                    c610 c610Var2 = c610Var;
                    mm40 mm40Var2 = mm40VarN;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b6) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 24.0f), c610Var2.f3797a);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, mm40Var2, c610Var2.b);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 2:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.c);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 3:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.d);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, 46.0f), c610Var2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, ((i2 >> 3) & 14) | 1772544, 438, 918);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k110((Object) c610Var, (Object) mm40Var, i, (byte) 3);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        int i2;
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(-1316609535);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40Var2 = mm40Var;
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_more_vertically, 6, fetVar), fetVar), null, o2e.e0(y860.W(epv0.N(mm40Var2, z ? 1.0f : 0.5f), null, null, z, null, function0, 24), "MENU_ICON_TAG"), obc.O(R.color.static_white, fetVar), fetVar, 56, 0);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ed(mm40Var2, z, function0, i, (byte) 12);
        }
    }

    public static final void e(Function0 function0, long j, em40 em40Var, t33 t33Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        long j2;
        em40 em40Var2;
        k6z k6zVar;
        boolean z;
        boolean z2;
        Object obj;
        fetVar.g0(766784632);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= fetVar.f(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            em40Var2 = em40Var;
            i2 |= fetVar.g(em40Var2) ? 256 : 128;
        } else {
            em40Var2 = em40Var;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? fetVar.g(t33Var) : fetVar.i(t33Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            View view = (View) fetVar.k(dy2.f);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            k6z k6zVar2 = (k6z) fetVar.k(bmd.n);
            androidx.compose.runtime.a aVarG = e3c.G(fetVar);
            pz40 pz40VarF = androidx.compose.runtime.e.f(ugdVar, fetVar);
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = new ec40((byte) 8);
                fetVar.o0(objP);
            }
            UUID uuid = (UUID) e9x.Q(objArr, (Function0) objP, fetVar, 48);
            Object objP2 = fetVar.P();
            if (objP2 == obj2) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            boolean zG = fetVar.g(view) | fetVar.g(w6kVar);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj2) {
                k6zVar = k6zVar2;
                z = true;
                z2 = false;
                wl40 wl40Var = new wl40(function0, em40Var2, j2, view, k6zVar, w6kVar, uuid, t33Var, vneVar);
                ugd ugdVar2 = new ugd(-1051373467, true, new f42(pz40VarF, (byte) 9));
                tl40 tl40Var = wl40Var.i;
                tl40Var.setParentCompositionContext(aVarG);
                ((hgk0) tl40Var.k).setValue(ugdVar2);
                tl40Var.l = true;
                tl40Var.d();
                fetVar.o0(wl40Var);
                obj = wl40Var;
            } else {
                k6zVar = k6zVar2;
                z = true;
                z2 = false;
                obj = objP3;
            }
            wl40 wl40Var2 = (wl40) obj;
            boolean zI = fetVar.i(wl40Var2);
            Object objP4 = fetVar.P();
            if (zI || objP4 == obj2) {
                objP4 = new b530((Object) wl40Var2, (byte) 12);
                fetVar.o0(objP4);
            }
            m0x0.o(wl40Var2, (Function1) objP4, fetVar);
            int i3 = i2;
            boolean zI2 = fetVar.i(wl40Var2) | ((i3 & 14) == 4 ? z : z2) | ((i3 & 896) == 256 ? z : z2) | ((i3 & 112) == 32 ? z : z2) | fetVar.e(k6zVar.ordinal());
            Object objP5 = fetVar.P();
            if (zI2 || objP5 == obj2) {
                objP5 = new fkm(wl40Var2, function0, em40Var, j, k6zVar);
                fetVar.o0(objP5);
            }
            m0x0.D((Function0) objP5, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o040(function0, j, em40Var, t33Var, ugdVar, i);
        }
    }

    public static final void f(mm40 mm40Var, rl60 rl60Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1219682815);
        int i2 = i | 6 | (fetVar2.g(rl60Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            o(0, fetVar2, null, rl60Var.f30682a);
            v8q0.a(rl60Var.b, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(mm40Var2, rl60Var, i, (byte) 9);
        }
    }

    public static final void g(String str, j43 j43Var, fet fetVar, int i) {
        boolean z;
        j43 j43Var2 = j43Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(614693735);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(j43Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            long jT = idm0.t(8);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            n05 n05Var = new n05(jT, g1t0.g().f42262a.b, idm0.t(1));
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, x7zVar, 0L, n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), ((StaticColors) fetVar2.k(m8m0.f21378a)).m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, i2 & 14, 24960, 110580);
            j43Var2 = j43Var;
            fetVar2 = fetVar;
            if (j43Var2.d) {
                fetVar2.e0(-671960861);
                mm40 mm40VarP = o7k0.p(jm40Var, 72.0f, 18.0f);
                zcl zclVar2 = qmk.m;
                ugg0 ugg0Var = vgg0.f37379a;
                z = true;
                h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(null, fetVar2, 0, 1), fetVar2, false);
            } else {
                z = true;
                fetVar2.e0(-671668748);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                kkb.q(x7zVar2, j43Var2, new cy6(g1t0.d(), 1019), fetVar2, i2 & 112);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m680(str, j43Var2, i, (byte) 2);
        }
    }

    public static final void h(mm40 mm40Var, j680 j680Var, fet fetVar, int i) {
        int i2;
        j680Var.getClass();
        fetVar.g0(1938940400);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j680Var) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            long jM125getWhite100d7_KjU = StaticColors.INSTANCE.m125getWhite100d7_KjU();
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40Var, jM125getWhite100d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f, 6.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            g(rsm0.w(R.string.edit_coupon_maximum_coef, 0, fetVar), j680Var.f15972a, fetVar, 0);
            g(rsm0.w(R.string.edit_coupon_optional_coef, 0, fetVar), j680Var.b, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680(mm40Var, j680Var, i, b);
        }
    }

    public static final void i(mm40 mm40Var, qfc0 qfc0Var, cqq cqqVar, Function1 function1, fet fetVar, int i) {
        qfc0Var.getClass();
        function1.getClass();
        fetVar.g0(-1561669502);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(qfc0Var) ? 32 : 16) | (fetVar.g(cqqVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = Boolean.valueOf(qfc0Var.b);
                fetVar.o0(objP);
            }
            obc.d(h36.f12370a.a(cqqVar), u1c.M(271340482, new lfc0(mm40Var, qfc0Var, function1, ((Boolean) objP).booleanValue()), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0(mm40Var, (Object) qfc0Var, (Object) cqqVar, function1, i, (byte) 2);
        }
    }

    public static final void j(Function1 function1, vhj0 vhj0Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        function1.getClass();
        vhj0Var.getClass();
        fetVar.g0(2104858746);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(vhj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = gij0.f11350a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new thj0(b);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new gb(vhj0Var, function1, b);
                fetVar.o0(objP3);
            }
            y860.g(xdrVar, null, function2, null, (Function1) objP3, fetVar, 390, 10);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) function1, (Object) vhj0Var, mm40Var, i, (byte) 14);
        }
    }

    public static final void k(mm40 mm40Var, jzj0 jzj0Var, cqq cqqVar, Function1 function1, fet fetVar, int i) {
        jzj0Var.getClass();
        function1.getClass();
        fetVar.g0(1777436758);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(jzj0Var) ? 32 : 16) | (fetVar.g(cqqVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            obc.d(h36.f12370a.a(cqqVar), u1c.M(979794838, new fzi0((byte) 18, mm40Var, (p6t0) jzj0Var, function1), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0(mm40Var, (Object) jzj0Var, (Object) cqqVar, function1, i, (byte) 21);
        }
    }

    public static final void l(mm40 mm40Var, gjk0 gjk0Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        gjk0 gjk0Var2 = gjk0Var;
        Object obj = function1;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        gjk0Var2.getClass();
        obj.getClass();
        fetVar2.g0(1041843975);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(gjk0Var2) ? 32 : 16) | (fetVar2.i(obj) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC0, shdVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), "SOCIAL_SECTION_COLUMN");
            zcl zclVar = qmk.f28987a;
            float f = 8.0f;
            x5d x5dVarA2 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE0);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar4);
            jpm0.o(fetVar2, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar);
            List list = gjk0Var2.f11402a;
            int i3 = gjk0Var2.c;
            ArrayList arrayListK = CollectionsKt.K(list, i3);
            fetVar2.e0(520401062);
            Iterator it = arrayListK.iterator();
            while (it.hasNext()) {
                List list2 = (List) it.next();
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                Iterator it2 = it;
                thg0 thg0VarA = shg0.a(new qw3(f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD2);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar4);
                jpm0.o(fetVar2, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
                Iterator itV = kng0.v(fetVar2, mm40VarC2, shdVar, -1276132091, list2);
                while (itV.hasNext()) {
                    p6t0 p6t0Var = (p6t0) itV.next();
                    fetVar2.b0(756321099, p6t0Var.getKey());
                    List list3 = list2;
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, x7zVar);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, shdVar4);
                    jpm0.o(fetVar2, bh90VarM4, shdVar3);
                    vqd.u(iHashCode4, fetVar2, shdVar2, fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, shdVar);
                    if (p6t0Var instanceof bhk0) {
                        fetVar2.e0(-976445132);
                        efx.n(o7k0.d(jm40Var, 1.0f), (bhk0) p6t0Var, function1, fetVar2, (i2 & 896) | 6);
                        z3 = false;
                        fetVar2.r(false);
                    } else if (p6t0Var instanceof tgk0) {
                        fetVar2.e0(-976043279);
                        mrv.a(o7k0.d(jm40Var, 1.0f), (tgk0) p6t0Var, function1, fetVar2, (i2 & 896) | 6);
                        z3 = false;
                        fetVar2.r(false);
                    } else {
                        z3 = false;
                        fetVar2.e0(-975680889);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    fetVar2.r(z3);
                    list2 = list3;
                }
                List list4 = list2;
                fetVar2.r(false);
                if (list4.size() < i3) {
                    fetVar2.e0(-904278549);
                    int size = i3 - list4.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (1.0f <= 0.0d) {
                            vcx.a("invalid weight; must be greater than zero");
                        }
                        qxw.o(fetVar2, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    }
                    z2 = true;
                    fetVar2.r(false);
                } else {
                    z2 = true;
                    fetVar2.e0(-904104608);
                    fetVar2.r(false);
                }
                fetVar2.r(z2);
                obj = function1;
                it = it2;
                f = 8.0f;
            }
            byte b = 0;
            fetVar2.r(false);
            fetVar2.r(true);
            gjk0Var2 = gjk0Var;
            if (gjk0Var2.b) {
                fetVar2.e0(-81388809);
                mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(mm40VarD3, 0.0f, 10.0f, 0.0f, 0.0f, 13);
                thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 54);
                int iHashCode5 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM5 = fetVar2.m();
                mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarN);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA2, shdVar4);
                jpm0.o(fetVar2, bh90VarM5, shdVar3);
                vqd.u(iHashCode5, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC4, shdVar);
                mm40 mm40VarE1 = o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), "SOCIAL_SECTION_WARNING_MESSAGE");
                String strS = xsm0.s(R.string.choose_social_network, fetVar2);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0 y9q0VarG = g1t0.g();
                zfn zfnVar = zaq0.b;
                v8q0.a(strS, mm40VarE1, ((ThemeColors) fetVar2.k(zfnVar)).getWarning(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarG, fetVar, 0, 0, 131064);
                fetVar2 = fetVar;
                mm40 mm40VarE2 = o2e.e0(o7k0.n(jm40Var, 16.0f), "SOCIAL_SECTION_WARNING_ICON");
                Object objP = fetVar2.P();
                if (objP == ukd.f35823a) {
                    objP = new ejk0(b);
                    fetVar2.o0(objP);
                }
                dww.c(a8k0.F(R.drawable.ic_glyph_circle_warning, 0, fetVar2), null, pai0.a(mm40VarE2, false, (Function1) objP), ((ThemeColors) fetVar2.k(zfnVar)).getWarning(), fetVar2, 56, 0);
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(-80195247);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var, gjk0Var2, function1, i, (byte) 6);
        }
    }

    public static final void m(mm40 mm40Var, i9l0 i9l0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        i9l0Var.getClass();
        function1.getClass();
        fetVar.g0(892441791);
        int i2 = i | 6 | (fetVar.g(i9l0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).c;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, f, 0.0f, 2), 1.0f);
            int iOrdinal = i9l0Var.b.ordinal();
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, (iOrdinal == 1 || iOrdinal == 2) ? 8.0f : 0.0f, 0.0f, 0.0f, 13);
            gga ggaVar = i9l0Var.f14393a;
            boolean zBooleanValue = ((Boolean) fetVar.k(kr00.f18743a)).booleanValue();
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new elk0(function1, (byte) 13);
                fetVar.o0(objP);
            }
            u1c.j(mm40VarN, ggaVar, zBooleanValue, (Function1) objP, fetVar);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var2, i9l0Var, function1, i, (byte) 16);
        }
    }

    public static final void n(y5d y5dVar, mm40 mm40Var, j83 j83Var, j83 j83Var2, y9q0 y9q0Var, ugd ugdVar, fet fetVar, int i) {
        y5dVar.getClass();
        j83Var.getClass();
        j83Var2.getClass();
        fetVar.e0(1825580397);
        ugdVar.F(y5dVar, fetVar, Integer.valueOf((i & 14) | ((i >> 12) & 112)));
        fetVar.r(false);
        zcl zclVar = qmk.f28987a;
        int i2 = (i >> 3) & 112;
        int i3 = i >> 6;
        t9x.u(o7k0.e(s5x0.N(mm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 24.0f), j83Var, y9q0Var, fetVar, i2 | (i3 & 896));
        t9x.u(o7k0.e(s5x0.N(mm40Var, 0.0f, 5.0f, 0.0f, 0.0f, 13), 24.0f), j83Var2, y9q0Var, fetVar, i3 & 1008);
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(456312938);
        int i2 = i | 6 | (fetVar2.g(null) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
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
            brm0.x(fetVar2, mm40VarC0, gqw0.v, -1435724004, false);
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, (i2 >> 6) & 14, 24960, 110586);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var2, str2, i, (byte) 9);
        }
    }

    public static final void p(lc00 lc00Var, ctf0 ctf0Var, ypl0 ypl0Var, ljg ljgVar, int i, int i2, List list, List list2, boolean z, String str, long j, boolean z2) {
        b6m b6mVar;
        ctf0Var.getClass();
        ypl0Var.getClass();
        ljgVar.getClass();
        list.getClass();
        list2.getClass();
        String str2 = ljgVar.h;
        String strM0 = StringsKt.m0(str2, ". ", str2);
        String strM1 = StringsKt.m0(strM0, ". ", strM0);
        boolean z3 = !z;
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.statistic, Arrays.copyOf(new Object[0], 0));
        StringBuilder sb = new StringBuilder(ujn.h);
        lel0 lel0Var = ypl0Var.c;
        long j2 = ypl0Var.f43037a;
        String str3 = lel0Var.f19909a;
        str3.getClass();
        if (str3.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str3, ujn.h, false) || kotlin.text.c.x(str3, "https://", false)) {
            sb.setLength(0);
            sb.append(str3);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str3, '/'));
        }
        n0x n0xVar = new n0x(sb.toString());
        f6m f6mVar = new f6m(new m0x(R.drawable.ic_cyber_game_tournaments, null, 6), strM1);
        v5m v5mVarV = V(ljgVar.b, j2, z3, list2);
        v5m v5mVarV2 = V(ljgVar.c, j2, z3, list2);
        String str4 = ljgVar.g;
        String str5 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(str4, new String[]{Separators.COLON}, false, 0, 6, null));
        String string = str5 != null ? StringsKt.u0(str5).toString() : null;
        String str6 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(str4, new String[]{Separators.COLON}, false, 0, 6, null));
        String string2 = str6 != null ? StringsKt.u0(str6).toString() : null;
        a6m z5mVar = (string == null || string.length() == 0 || string2 == null || string2.length() == 0) ? new z5m(null) : new y5m(string, string2, null, null);
        znq0 znq0Var = ljgVar.f;
        rdj rdjVar = rdj.f30294a;
        f5m f5mVar = new f5m(null, rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56));
        if (i2 < 2 || list.isEmpty()) {
            b6mVar = null;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((StatisticBlockModel) it.next()).c) {
                    ArrayList arrayList = new ArrayList(i2);
                    int i3 = 0;
                    while (i3 < i2) {
                        i3++;
                        arrayList.add(new s4i(lsm0Var.a(R.string.dota_map_name_number_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)), 0, null, false, 14));
                    }
                    b6mVar = new b6m(dyb.r0(arrayList), i, new r4i(new y3d(j), null, null, null, new y3d(y3d.f), 30));
                }
            }
            b6mVar = null;
        }
        lc00Var.add(new zog(str, new m5m(new h6m(strA, n0xVar, f6mVar, null, v5mVarV, v5mVarV2, z5mVar, f5mVar, b6mVar, z2)), ljgVar.i, strM1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final sv9 q(q9y q9yVar, boolean z) {
        Field fieldU = q9yVar.p().u();
        byte b = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (Modifier.isStatic(fieldU.getModifiers())) {
            byte b2 = 2;
            return z ? new iv9(fieldU, objArr3 == true ? 1 : 0, b2) : new mv9(fieldU, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, b2);
        }
        boolean z2 = true;
        if (z) {
            return fre0.W(q9yVar) ? new gv9(fieldU, fre0.P(q9yVar.p())) : new iv9(fieldU, z2, b);
        }
        return fre0.W(q9yVar) ? new kv9(fieldU, false, fre0.P(q9yVar.p())) : new mv9(fieldU, objArr5 == true ? 1 : 0, z2, objArr4 == true ? 1 : 0);
    }

    public static final iun r(t9y t9yVar) {
        if (Modifier.isStatic(t9yVar.u().getModifiers())) {
            return iun.f15405a;
        }
        hny.v(t9yVar.u(), "Only static properties are supported for now: ");
        return null;
    }

    public static final String s(double d) {
        Double dValueOf = Double.valueOf(d);
        String strC = null;
        if (d == 0.0d) {
            dValueOf = null;
        }
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            pn40 pn40Var = pn40.f27267a;
            strC = pn40.c(dDoubleValue, p3u0.c);
        }
        return strC == null ? "" : strC;
    }

    public static Collection t(cr30 cr30Var, cek cekVar, int i) {
        if ((i & 1) != 0) {
            cekVar = cek.m;
        }
        cr30.f4824a.getClass();
        return cr30Var.b(cekVar, j9x.Y);
    }

    public static final ffa0 u(String str) {
        str.getClass();
        int i = y3d.h;
        return new ffa0(str, y3d.c);
    }

    public static final tvw v(int i, long j, q4f q4fVar) {
        String string;
        if (i > 1) {
            return new svw(lgb.S(q4fVar));
        }
        if (j == 95) {
            return new svw(R.drawable.ic_nav_bet_constructor);
        }
        if (i != 1) {
            return qvw.f29409a;
        }
        if (j != 0) {
            bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
            rz4.s(j, ".svg", bzuVarD);
            string = ((StringBuilder) bzuVarD.b).toString();
        } else {
            string = "";
        }
        return new rvw(string);
    }

    public static final String w(int i, boolean z) {
        rdj rdjVar = rdj.f30294a;
        return rdj.g(new znq0(i), efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
    }

    public static final Constructor x(jhy jhyVar) {
        bv9 bv9VarX;
        jhyVar.getClass();
        dre0 dre0VarA = xtt0.a(jhyVar);
        Member memberB = (dre0VarA == null || (bv9VarX = dre0VarA.x()) == null) ? null : bv9VarX.b();
        if (memberB instanceof Constructor) {
            return (Constructor) memberB;
        }
        return null;
    }

    public static final Field y(iiy iiyVar) {
        iiyVar.getClass();
        ire0 ire0VarC = xtt0.c(iiyVar);
        if (ire0VarC != null) {
            return ire0VarC.y();
        }
        return null;
    }

    public static final Method z(jhy jhyVar) {
        bv9 bv9VarX;
        jhyVar.getClass();
        dre0 dre0VarA = xtt0.a(jhyVar);
        n9y n9yVar = dre0VarA instanceof n9y ? (n9y) dre0VarA : null;
        if (n9yVar != null) {
            return n9yVar.B();
        }
        Member memberB = (dre0VarA == null || (bv9VarX = dre0VarA.x()) == null) ? null : bv9VarX.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }
}
