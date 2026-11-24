package a;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final class b8k0 implements c8k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2162a;

    public static final nsp A(rsp rspVar, long j) {
        List list;
        Object next;
        if (rspVar != null && (list = rspVar.c) != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((jsp) next).f17063a != j);
            jsp jspVar = (jsp) next;
            if (jspVar != null) {
                return jspVar.h;
            }
        }
        return null;
    }

    public static final int B(int i, List list) {
        int i2;
        byte b;
        int i3 = ((yn80) CollectionsKt.d0(list)).c;
        if (i > ((yn80) CollectionsKt.d0(list)).c) {
            ycx.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            yn80 yn80Var = (yn80) list.get(i2);
            if (yn80Var.b > i) {
                b = 1;
            } else {
                b = yn80Var.c <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        int size2 = list.size();
        String strA = qf00.a(list, null, new da40((byte) 14), 31);
        StringBuilder sbT = dw9.t("Found paragraph index ", i2, " should be in range [0, ", ").\nDebug info: index=", size2);
        sbT.append(i);
        sbT.append(", paragraphs=[");
        sbT.append(strA);
        sbT.append("]");
        ycx.a(sbT.toString());
        return i2;
    }

    public static final int C(int i, List list) {
        byte b;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            yn80 yn80Var = (yn80) list.get(i3);
            if (yn80Var.d > i) {
                b = 1;
            } else {
                b = yn80Var.e <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int D(float f, ArrayList arrayList) {
        byte b;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((yn80) CollectionsKt.d0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            yn80 yn80Var = (yn80) arrayList.get(i2);
            if (yn80Var.f > f) {
                b = 1;
            } else {
                b = yn80Var.g <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void E(ArrayList arrayList, long j, Function1 function1) {
        int size = arrayList.size();
        for (int iB = B(o9q0.f(j), arrayList); iB < size; iB++) {
            yn80 yn80Var = (yn80) arrayList.get(iB);
            if (yn80Var.b >= o9q0.e(j)) {
                return;
            }
            if (yn80Var.b != yn80Var.c) {
                function1.invoke(yn80Var);
            }
        }
    }

    public static final float F(mgl0 mgl0Var) {
        if (mgl0Var.d != k8l0.None) {
            zcl zclVar = qmk.f28987a;
            return 12.0f;
        }
        int iOrdinal = mgl0Var.c.ordinal();
        if (iOrdinal == 0) {
            zcl zclVar2 = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 1) {
            zcl zclVar3 = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 2) {
            zcl zclVar4 = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 3) {
            zcl zclVar5 = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 4) {
            zcl zclVar6 = qmk.f28987a;
            return 8.0f;
        }
        t9f.b();
        return 0.0f;
    }

    public static final int G(Bundle bundle, String str) {
        str.getClass();
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        g8x.O(str);
        throw null;
    }

    public static final us00 H(Context context) {
        context.getClass();
        return new us00(context, I(context));
    }

    public static final l4x I(Context context) {
        context.getClass();
        Object applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return (l4x) ((ApplicationLoader) ((xs00) applicationContext)).u1.getValue();
    }

    public static final zva0 J(View view) {
        zva0 zva0Var = (zva0) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (zva0Var != null) {
            return zva0Var;
        }
        zva0 zva0Var2 = new zva0();
        view.setTag(R.id.pooling_container_listener_holder_tag, zva0Var2);
        return zva0Var2;
    }

    public static final String K(d0t d0tVar) {
        Object next;
        dmr dmrVar = dmr.i1;
        Iterator it = d0tVar.p.n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmrVar);
        cmr cmrVar = (cmr) next;
        String str = cmrVar != null ? cmrVar.b : null;
        return str == null ? "" : str;
    }

    public static final Bundle L(Bundle bundle, String str) {
        str.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        g8x.O(str);
        throw null;
    }

    public static final float M(mgl0 mgl0Var) {
        if (mgl0Var.d != k8l0.None) {
            zcl zclVar = qmk.f28987a;
            return 12.0f;
        }
        int iOrdinal = mgl0Var.c.ordinal();
        if (iOrdinal == 0) {
            zcl zclVar2 = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 1) {
            zcl zclVar3 = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 2) {
            zcl zclVar4 = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 3) {
            zcl zclVar5 = qmk.f28987a;
            return 12.0f;
        }
        if (iOrdinal == 4) {
            zcl zclVar6 = qmk.f28987a;
            return 0.0f;
        }
        t9f.b();
        return 0.0f;
    }

    public static final int N(Activity activity) {
        Rect rect = new Rect();
        View viewFindViewById = activity.findViewById(android.R.id.content);
        viewFindViewById.getClass();
        viewFindViewById.getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    public static final boolean O(jup jupVar) {
        c0o c0oVar = gsj0.d;
        if (c0oVar != null && c0oVar.isEmpty()) {
            return true;
        }
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (y2VarH.hasNext()) {
            if (f0(jupVar, (gsj0) y2VarH.next()) == null) {
                return false;
            }
        }
        return true;
    }

    public static final boolean P(jup jupVar, jup jupVar2) {
        if (O(jupVar) && O(jupVar2)) {
            return true;
        }
        c0o c0oVar = esj0.c;
        if (c0oVar != null && c0oVar.isEmpty()) {
            return false;
        }
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (y2VarH.hasNext()) {
            esj0 esj0Var = (esj0) y2VarH.next();
            if (e0(jupVar, esj0Var) != null && e0(jupVar2, esj0Var) != null) {
                return true;
            }
        }
        return false;
    }

    public static final boolean Q(c1l0 c1l0Var) {
        c1l0Var.getClass();
        return !(c1l0Var.i || c1l0Var.e) || c1l0Var.f3578a == null;
    }

    public static final int R(w2c0 w2c0Var) {
        w2c0Var.getClass();
        switch (w2c0Var.ordinal()) {
            case 3:
                return R.string.reg_user_name_x;
            case 4:
                return R.string.reg_user_second_name_x;
            case 5:
                return R.string.reg_user_middle_name_x_if_available;
            case 6:
                return R.string.date_of_birth;
            case 7:
                return R.string.place_of_birth;
            case 8:
                return R.string.reg_country_x;
            case 9:
                return R.string.reg_region_hint_title;
            case 10:
                return R.string.reg_city_hint_title;
            case 11:
                return R.string.address_of_registration;
            case 12:
                return R.string.document_type;
            case 13:
                return R.string.document_series;
            case 14:
                return R.string.document_number_new;
            case 15:
                return R.string.passport_date_of_issue;
            case 16:
                return R.string.passport_issued_by;
            case 17:
                return R.string.inn;
            case 18:
                return R.string.iin;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return R.string.iban_ibn_hint;
            default:
                return R.string.name;
        }
    }

    public static final boolean S(Activity activity, int i, int i2) {
        return i - i2 > si30.b(z(activity, 50.0f));
    }

    public static final String T(String... strArr) {
        return CollectionsKt.b0(tx3.z(strArr), "&", null, null, null, 62);
    }

    public static final String U(fw70 fw70Var) {
        Integer num = fw70Var.f10246a;
        String str = null;
        String strM = num != null ? twn.m(num.intValue(), "cybertype=") : null;
        Long l = fw70Var.g;
        String strH = l != null ? h97.h(l.longValue(), "champid=") : null;
        Long l2 = fw70Var.d;
        String strH2 = l2 != null ? h97.h(l2.longValue(), "subsportid=") : null;
        Long l3 = fw70Var.c;
        String strH3 = l3 != null ? h97.h(l3.longValue(), "sportid=") : null;
        String str2 = fw70Var.b;
        if (str2 != null) {
            str = "islive=" + str2.equals("live");
        }
        return "://open/cyberchamp?".concat(T(strM, strH, strH2, strH3, str));
    }

    public static final z7x V(String str, fet fetVar, int i) {
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            objP = new z7x();
            fetVar.o0(objP);
        }
        z7x z7xVar = (z7x) objP;
        z7xVar.a(0, fetVar);
        return z7xVar;
    }

    public static final tl W(zl zlVar) {
        String str = zlVar.b;
        if (str == null) {
            str = "";
        }
        Double d = zlVar.f44556a;
        if (d == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue = d.doubleValue();
        String str2 = zlVar.c;
        if (str2 != null) {
            return new tl(dDoubleValue, str, str2);
        }
        jf4.k(null);
        return null;
    }

    public static final a95 X(t95 t95Var, boolean z) {
        Double d = t95Var.f33545a;
        if (d == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue = d.doubleValue();
        String str = t95Var.b;
        String str2 = "";
        if (str == null) {
            if (z) {
                jf4.k(null);
                return null;
            }
            str = "";
        }
        String str3 = t95Var.c;
        if (str3 != null) {
            str2 = str3;
        } else if (z) {
            jf4.k(null);
            return null;
        }
        return new a95(dDoubleValue, str, str2);
    }

    public static final String Y(fw70 fw70Var) {
        String str = fw70Var.e;
        Integer num = fw70Var.f10246a;
        Long l = fw70Var.c;
        Long l2 = fw70Var.g;
        String str2 = fw70Var.b;
        Long l3 = fw70Var.f;
        Long l4 = fw70Var.d;
        String str3 = null;
        if (Intrinsics.d(str, "cybersection")) {
            boolean z = false;
            boolean z2 = (num == null || l2 == null || l == null || str2 == null) ? false : true;
            boolean z3 = (num == null || l2 != null || l == null) ? false : true;
            boolean z4 = num != null && l2 == null && l == null;
            if (num != null && l2 == null && l != null && l3 != null && str2 != null) {
                z = true;
            }
            if (z2) {
                return U(fw70Var);
            }
            if (z) {
                return "://open/cybergame?".concat(T(str2 != null ? "type=".concat(str2) : null, l != null ? h97.h(l.longValue(), "sportid=") : null, l3 != null ? h97.h(l3.longValue(), "id=") : null, l4 != null ? h97.h(l4.longValue(), "subsportid=") : null));
            }
            if (z3) {
                return "://open/cyberdiscipline?".concat(T(num != null ? twn.m(num.intValue(), "cybertype=") : null, l4 != null ? h97.h(l4.longValue(), "subsportid=") : null, l != null ? h97.h(l.longValue(), "sportid=") : null));
            }
            if (z4) {
                return "://open/cyber?".concat(T(num != null ? twn.m(num.intValue(), "cybertype=") : null));
            }
            return "";
        }
        if (Intrinsics.d(str, "cyberTopChamps")) {
            String strM = num != null ? twn.m(num.intValue(), "cybertype=") : null;
            if (str2 != null) {
                str3 = "islive=" + str2.equals("live");
            }
            return "://open/cybertopchamps?".concat(T(strM, str3));
        }
        if (l3 != null || l4 != null) {
            return "://open/game?".concat(T(str2 != null ? "type=".concat(str2) : null, l != null ? h97.h(l.longValue(), "sportid=") : null, l3 != null ? h97.h(l3.longValue(), "id=") : null, l4 != null ? h97.h(l4.longValue(), "subsportid=") : null));
        }
        if (l2 != null && Intrinsics.d(str, "cyber")) {
            return U(fw70Var);
        }
        String strH = l4 != null ? h97.h(l4.longValue(), "subsportid=") : null;
        return "://open/champs?".concat(T(str2 != null ? "type=".concat(str2) : null, l != null ? h97.h(l.longValue(), "sportid=") : null, l3 != null ? h97.h(l3.longValue(), "id=") : null, strH, l2 != null ? h97.h(l2.longValue(), "champid=") : null));
    }

    /* JADX WARN: Code duplicated, block: B:147:0x037a  */
    /* JADX WARN: Code duplicated, block: B:148:0x037f  */
    /* JADX WARN: Code duplicated, block: B:151:0x038d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0399  */
    /* JADX WARN: Code duplicated, block: B:158:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:161:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:163:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:166:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:167:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:169:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:170:0x03de  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:174:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:176:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:177:0x0404  */
    /* JADX WARN: Code duplicated, block: B:179:0x0408  */
    /* JADX WARN: Code duplicated, block: B:180:0x040d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0413  */
    /* JADX WARN: Code duplicated, block: B:184:0x0416  */
    public static final List Z(jj30 jj30Var, sip sipVar) {
        ArrayList arrayList;
        List list;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j;
        long jLongValue;
        String str;
        Integer numValueOf;
        long jLongValue2;
        String str2;
        ufs ufsVarA0;
        boolean zBooleanValue;
        Integer numValueOf2;
        String str3;
        Boolean bool;
        Integer num;
        Long l;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j2;
        ArrayList arrayList6;
        Long l2;
        Long l3;
        jj30 jj30Var2 = jj30Var;
        sipVar.getClass();
        if (jj30Var2 == null || (list = jj30Var2.c) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList7 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mj30 mj30Var = (mj30) it.next();
                l26 l26Var = jj30Var2.f16603a;
                long jLongValue3 = (l26Var == null || (l3 = l26Var.f19293a) == null) ? 0L : l3.longValue();
                l26 l26Var2 = jj30Var2.b;
                long jLongValue4 = (l26Var2 == null || (l2 = l26Var2.f19293a) == null) ? 0L : l2.longValue();
                List list2 = mj30Var.D;
                Long l4 = mj30Var.f21875a;
                dss dssVar = mj30Var.E;
                Long l5 = mj30Var.q;
                Boolean bool2 = mj30Var.v;
                Boolean bool3 = mj30Var.x;
                mbr mbrVar = mj30Var.H;
                h2g h2gVar = mj30Var.C;
                h2g h2gVar2 = mj30Var.B;
                Long l6 = mj30Var.b;
                Long l7 = mj30Var.c;
                gxs gxsVar = mj30Var.F;
                wz5 wz5Var = mj30Var.A;
                Iterator it2 = it;
                if (list2 != null) {
                    arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        cas casVar = (cas) it3.next();
                        Long l8 = casVar.f4027a;
                        long jLongValue5 = l8 != null ? l8.longValue() : 0L;
                        List list3 = casVar.c;
                        Iterator it4 = it3;
                        if (list3 != null) {
                            j2 = jLongValue4;
                            int i = 10;
                            arrayList6 = new ArrayList(r3d.q(list3, 10));
                            Iterator it5 = list3.iterator();
                            while (it5.hasNext()) {
                                Iterator it6 = it5;
                                ArrayList arrayList8 = new ArrayList(r3d.q((List) it5.next(), i));
                                for (Iterator it7 = r9.iterator(); it7.hasNext(); it7 = it7) {
                                    gas gasVar = (gas) it7.next();
                                    Long l9 = casVar.f4027a;
                                    arrayList8.add(u1c.U(gasVar, l9 != null ? l9.longValue() : 0L, mj30Var.t, mj30Var.f21875a, mj30Var.w, Long.valueOf(j2)));
                                }
                                arrayList6.add(arrayList8);
                                it5 = it6;
                                i = 10;
                            }
                        } else {
                            j2 = jLongValue4;
                            arrayList6 = null;
                        }
                        arrayList2.add(new u9s(arrayList6, Long.valueOf(jLongValue5), casVar.d));
                        it3 = it4;
                        h2gVar2 = h2gVar2;
                        jLongValue4 = j2;
                    }
                } else {
                    arrayList2 = null;
                }
                h2g h2gVar3 = h2gVar2;
                long j3 = jLongValue4;
                List list4 = mj30Var.G;
                if (list4 != null) {
                    ArrayList arrayList9 = new ArrayList(r3d.q(list4, 10));
                    for (Iterator it8 = list4.iterator(); it8.hasNext(); it8 = it8) {
                        zxm0 zxm0Var = (zxm0) it8.next();
                        zxm0Var.getClass();
                        List list5 = zxm0Var.d;
                        Long l10 = zxm0Var.f45167a;
                        if (list5 != null) {
                            ArrayList arrayList10 = new ArrayList(r3d.q(list5, 10));
                            Iterator it9 = list5.iterator();
                            while (it9.hasNext()) {
                                cas casVar2 = (cas) it9.next();
                                Long l11 = casVar2.f4027a;
                                long jLongValue6 = l11 != null ? l11.longValue() : 0L;
                                List list6 = casVar2.c;
                                Iterator it10 = it9;
                                if (list6 != null) {
                                    int i2 = 10;
                                    arrayList5 = new ArrayList(r3d.q(list6, 10));
                                    Iterator it11 = list6.iterator();
                                    while (it11.hasNext()) {
                                        List<gas> list7 = (List) it11.next();
                                        Iterator it12 = it11;
                                        Long l12 = l5;
                                        ArrayList arrayList11 = new ArrayList(r3d.q(list7, i2));
                                        for (gas gasVar2 : list7) {
                                            Long l13 = casVar2.f4027a;
                                            arrayList11.add(u1c.U(gasVar2, l13 != null ? l13.longValue() : 0L, mj30Var.t, zxm0Var.f45167a, mj30Var.w, Long.valueOf(j3)));
                                        }
                                        arrayList5.add(arrayList11);
                                        it11 = it12;
                                        l5 = l12;
                                        i2 = 10;
                                    }
                                } else {
                                    arrayList5 = null;
                                }
                                Long l14 = l5;
                                arrayList10.add(new u9s(arrayList5, Long.valueOf(jLongValue6), casVar2.d));
                                it9 = it10;
                                l10 = l10;
                                l4 = l4;
                                l5 = l14;
                            }
                            arrayList4 = arrayList10;
                        } else {
                            arrayList4 = null;
                        }
                        Long l15 = l10;
                        Long l16 = l4;
                        Long l17 = l5;
                        long jLongValue7 = l15 != null ? l15.longValue() : 0L;
                        long jLongValue8 = l7 != null ? l7.longValue() : l15 != null ? l15.longValue() : 0L;
                        Long l18 = mj30Var.d;
                        String str4 = mj30Var.j;
                        String str5 = mj30Var.m;
                        String str6 = mj30Var.h;
                        String str7 = gxsVar != null ? gxsVar.b : null;
                        Integer num2 = mj30Var.y;
                        String str8 = mj30Var.l;
                        long j4 = jLongValue7;
                        Integer numValueOf3 = l6 != 0 ? Integer.valueOf((int) l6.longValue()) : null;
                        Boolean bool4 = mj30Var.w;
                        String str9 = zxm0Var.b;
                        Long l19 = wz5Var != null ? wz5Var.f40006a : null;
                        String str10 = wz5Var != null ? wz5Var.b : null;
                        oas oasVarB0 = d5c.b0(h2gVar3);
                        oas oasVarB1 = d5c.b0(h2gVar);
                        Long l20 = mj30Var.f;
                        long jT = pzb.T(l20);
                        ufs ufsVarA1 = mbrVar != null ? acb.a0(mbrVar) : null;
                        boolean zBooleanValue2 = bool3 != null ? bool3.booleanValue() : false;
                        Boolean bool5 = Boolean.TRUE;
                        boolean zD = Intrinsics.d(bool2, bool5);
                        Boolean bool6 = mj30Var.p;
                        Integer num3 = numValueOf3;
                        Integer numValueOf4 = l17 != null ? Integer.valueOf((int) l17.longValue()) : null;
                        String str11 = dssVar != null ? dssVar.b : null;
                        Boolean bool7 = gxsVar != null ? gxsVar.f12093a : null;
                        qud qudVar = boh.b;
                        Integer num4 = wz5Var != null ? wz5Var.d : null;
                        qudVar.getClass();
                        arrayList9.add(new nas(j4, jLongValue8, l18, str4, str5, str6, str7, bool7, num2, str8, num3, bool4, str9, null, null, arrayList4, l19, sipVar, str10, null, l20, Long.valueOf(jT), Long.valueOf(j3), jLongValue3, oasVarB0, oasVarB1, zD, null, ufsVarA1, Boolean.valueOf(zBooleanValue2), null, null, bool6, numValueOf4, str11, null, qud.d(num4, bool5), mj30Var.g));
                        l4 = l16;
                        dssVar = dssVar;
                        l5 = l17;
                        bool3 = bool3;
                        bool2 = bool2;
                        arrayList2 = arrayList2;
                    }
                    arrayList3 = arrayList9;
                } else {
                    arrayList3 = null;
                }
                ArrayList arrayList12 = arrayList2;
                Long l21 = l4;
                dss dssVar2 = dssVar;
                Long l22 = l5;
                Boolean bool8 = bool2;
                Boolean bool9 = bool3;
                jch jchVar = mj30Var.I;
                tas tasVarY = jchVar != null ? qbc.Y(jchVar) : null;
                long jLongValue9 = l21 != null ? l21.longValue() : 0L;
                if (l7 != null) {
                    jLongValue = l7.longValue();
                } else {
                    if (l21 != null) {
                        jLongValue = l21.longValue();
                    } else {
                        j = 0;
                    }
                    Long l23 = mj30Var.d;
                    String str12 = mj30Var.j;
                    String str13 = mj30Var.m;
                    String str14 = mj30Var.h;
                    if (gxsVar != null) {
                        str = gxsVar.b;
                    } else {
                        str = null;
                    }
                    Integer num5 = mj30Var.y;
                    String str15 = mj30Var.l;
                    if (l6 != 0) {
                        numValueOf = Integer.valueOf((int) l6.longValue());
                    } else {
                        numValueOf = null;
                    }
                    Boolean bool10 = mj30Var.w;
                    String str16 = mj30Var.e;
                    if (wz5Var != null || (l = wz5Var.f40006a) == null) {
                        jLongValue2 = 0;
                    } else {
                        jLongValue2 = l.longValue();
                    }
                    if (wz5Var != null) {
                        str2 = wz5Var.b;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str17 = str2;
                    oas oasVarB2 = d5c.b0(h2gVar3);
                    oas oasVarB3 = d5c.b0(h2gVar);
                    Long l24 = mj30Var.f;
                    long jT2 = pzb.T(l24);
                    if (mbrVar != null) {
                        ufsVarA0 = acb.a0(mbrVar);
                    } else {
                        ufsVarA0 = null;
                    }
                    if (bool9 != null) {
                        zBooleanValue = bool9.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    Boolean bool11 = mj30Var.p;
                    Boolean bool12 = Boolean.TRUE;
                    boolean zD2 = Intrinsics.d(bool8, bool12);
                    if (l22 != null) {
                        numValueOf2 = Integer.valueOf((int) l22.longValue());
                    } else {
                        numValueOf2 = null;
                    }
                    if (dssVar2 != null) {
                        str3 = dssVar2.b;
                    } else {
                        str3 = null;
                    }
                    if (gxsVar != null) {
                        bool = gxsVar.f12093a;
                    } else {
                        bool = null;
                    }
                    qud qudVar2 = boh.b;
                    if (wz5Var != null) {
                        num = wz5Var.d;
                    } else {
                        num = null;
                    }
                    qudVar2.getClass();
                    arrayList7.add(new nas(jLongValue9, j, l23, str12, str13, str14, str, bool, num5, str15, numValueOf, bool10, str16, null, arrayList3, arrayList12, Long.valueOf(jLongValue2), sipVar, str17, tasVarY, l24, Long.valueOf(jT2), Long.valueOf(j3), jLongValue3, oasVarB2, oasVarB3, zD2, null, ufsVarA0, Boolean.valueOf(zBooleanValue), null, null, bool11, numValueOf2, str3, null, qud.d(num, bool12), mj30Var.g));
                    jj30Var2 = jj30Var;
                    it = it2;
                }
                j = jLongValue;
                Long l25 = mj30Var.d;
                String str18 = mj30Var.j;
                String str19 = mj30Var.m;
                String str110 = mj30Var.h;
                if (gxsVar != null) {
                    str = gxsVar.b;
                } else {
                    str = null;
                }
                Integer num6 = mj30Var.y;
                String str111 = mj30Var.l;
                if (l6 != 0) {
                    numValueOf = Integer.valueOf((int) l6.longValue());
                } else {
                    numValueOf = null;
                }
                Boolean bool13 = mj30Var.w;
                String str112 = mj30Var.e;
                if (wz5Var != null) {
                    jLongValue2 = 0;
                } else {
                    jLongValue2 = 0;
                }
                if (wz5Var != null) {
                    str2 = wz5Var.b;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                String str113 = str2;
                oas oasVarB4 = d5c.b0(h2gVar3);
                oas oasVarB5 = d5c.b0(h2gVar);
                Long l26 = mj30Var.f;
                long jT3 = pzb.T(l26);
                if (mbrVar != null) {
                    ufsVarA0 = acb.a0(mbrVar);
                } else {
                    ufsVarA0 = null;
                }
                if (bool9 != null) {
                    zBooleanValue = bool9.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                Boolean bool14 = mj30Var.p;
                Boolean bool15 = Boolean.TRUE;
                boolean zD3 = Intrinsics.d(bool8, bool15);
                if (l22 != null) {
                    numValueOf2 = Integer.valueOf((int) l22.longValue());
                } else {
                    numValueOf2 = null;
                }
                if (dssVar2 != null) {
                    str3 = dssVar2.b;
                } else {
                    str3 = null;
                }
                if (gxsVar != null) {
                    bool = gxsVar.f12093a;
                } else {
                    bool = null;
                }
                qud qudVar3 = boh.b;
                if (wz5Var != null) {
                    num = wz5Var.d;
                } else {
                    num = null;
                }
                qudVar3.getClass();
                arrayList7.add(new nas(jLongValue9, j, l25, str18, str19, str110, str, bool, num6, str111, numValueOf, bool13, str112, null, arrayList3, arrayList12, Long.valueOf(jLongValue2), sipVar, str113, tasVarY, l26, Long.valueOf(jT3), Long.valueOf(j3), jLongValue3, oasVarB4, oasVarB5, zD3, null, ufsVarA0, Boolean.valueOf(zBooleanValue), null, null, bool14, numValueOf2, str3, null, qud.d(num, bool15), mj30Var.g));
                jj30Var2 = jj30Var;
                it = it2;
            }
            arrayList = arrayList7;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public static final jo20 a0(Bundle bundle) {
        jo20 jo20Var = new jo20(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            jo20Var.put(str, bundle.get(str));
        }
        return jo20Var.b();
    }

    public static final List b0(rtk0 rtk0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        List list = rtk0Var.b;
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        String strA = ctf0Var.b.a(R.string.my_special_event_promotions_title, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        lc00VarB.add(new eok0(new hjm(strA, null, new y3d(s6t0.b().f33626a.getTextPrimary()), null, null, null, false, null, null, false, null, null, 8186), null, i9h0.f14386a));
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            kr5 kr5Var = (kr5) obj;
            kr5Var.getClass();
            arrayList.add(new lzc0(new kzc0(kr5Var.b, kr5Var.o, kr5Var.q, new n0x(kr5Var.g), null), unh0.i0(i, lc00VarB)));
            i = i2;
        }
        lc00VarB.addAll(arrayList);
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final void c(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(945208877);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            b = 0;
            fetVar2.X();
        } else if (str == null) {
            fetVar2.e0(912128999);
            fetVar2.r(false);
            b = 0;
        } else {
            fetVar2.e0(912129000);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40.b, 24.0f);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarA = g1t0.a();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarS, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0VarA, fetVar, (i2 >> 3) & 14, 0, 130040);
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(Separators.COLON, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, 6, 0, 131066);
            fetVar2 = fetVar;
            b = 0;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, b);
        }
    }

    public static final xcp0 c0(Pair pair, String str, List list) {
        Object obj = pair.b;
        Object obj2 = pair.f46059a;
        str.getClass();
        list.getClass();
        if (str.length() > 0) {
            String str2 = (String) CollectionsKt.firstOrNull(list);
            if (str2 == null) {
                str2 = "";
            }
            d5a0 d5a0Var = new d5a0(new c280(vsm0.s(((Number) obj2).longValue(), str2), R.drawable.ic_glyph_placeholder_player));
            String str3 = (String) CollectionsKt.W(1, list);
            return new qcp0(str, d5a0Var, new d5a0(new c280(vsm0.s(((Number) obj).longValue(), str3 != null ? str3 : ""), R.drawable.ic_glyph_placeholder_player)));
        }
        String str4 = (String) CollectionsKt.firstOrNull(list);
        if (str4 == null) {
            str4 = "";
        }
        d5a0 d5a0Var2 = new d5a0(new c280(vsm0.s(((Number) obj2).longValue(), str4), R.drawable.ic_glyph_placeholder_player));
        String str5 = (String) CollectionsKt.W(1, list);
        return new tcp0(d5a0Var2, new d5a0(new c280(vsm0.s(((Number) obj).longValue(), str5 != null ? str5 : ""), R.drawable.ic_glyph_placeholder_player)));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0131  */
    /* JADX WARN: Code duplicated, block: B:103:0x013b  */
    /* JADX WARN: Code duplicated, block: B:104:0x013e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:110:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0154  */
    /* JADX WARN: Code duplicated, block: B:113:0x0185  */
    /* JADX WARN: Code duplicated, block: B:116:0x018f  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb A[PHI: r5 r6 r12
  0x00fb: PHI (r5v20 int) = (r5v15 int), (r5v13 int), (r5v21 int) binds: [B:92:0x010b, B:83:0x00f7, B:84:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x00fb: PHI (r6v26 a.sw3) = (r6v7 a.sw3), (r6v4 a.sw3), (r6v4 a.sw3) binds: [B:92:0x010b, B:83:0x00f7, B:84:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x00fb: PHI (r12v10 boolean) = (r12v5 boolean), (r12v3 boolean), (r12v3 boolean) binds: [B:92:0x010b, B:83:0x00f7, B:84:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e  */
    public static final void d(mm40 mm40Var, xcz xczVar, l7m0 l7m0Var, sw3 sw3Var, hh80 hh80Var, boolean z, Function1 function1, ugd ugdVar, fet fetVar, int i, int i2) {
        int i3;
        sw3 sw3Var2;
        boolean z2;
        int i4;
        Function1 function2;
        int i5;
        boolean z3;
        Function1 function3;
        yfe0 yfe0VarU;
        int i6;
        cl5 cl5Var;
        Object objP;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objP2;
        int i7;
        xczVar.getClass();
        l7m0Var.getClass();
        fetVar.g0(-171007790);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 256 : 128;
        }
        int i8 = i3 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                sw3Var2 = sw3Var;
                int i9 = fetVar.g(sw3Var2) ? 16384 : 8192;
                i8 |= i9;
            } else {
                sw3Var2 = sw3Var;
            }
            i8 |= i9;
        } else {
            sw3Var2 = sw3Var;
        }
        if ((196608 & i) == 0) {
            i8 |= fetVar.g(hh80Var) ? 131072 : 65536;
        }
        int i10 = i2 & 64;
        if (i10 == 0) {
            if ((1572864 & i) == 0) {
                z2 = z;
                i8 |= fetVar.h(z2) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    function2 = function1;
                    if (fetVar.i(function2)) {
                        i5 = 8388608;
                    } else {
                        i5 = 4194304;
                    }
                    i8 |= i5;
                }
                if ((i & 100663296) == 0) {
                    if (fetVar.i(ugdVar)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i8 |= i7;
                }
                if ((i8 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i8 & 1, z3)) {
                    fetVar.Z();
                    i6 = i & 1;
                    cl5Var = ukd.f35823a;
                    if (i6 != 0 || fetVar.B()) {
                        if ((i2 & 16) != 0) {
                            sw3Var2 = uc9.c;
                            i8 &= -57345;
                        }
                        if (i10 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = new djx((byte) 6);
                                fetVar.o0(objP);
                            }
                            function3 = (Function1) objP;
                        }
                        boolean z7 = z2;
                        sw3 sw3Var3 = sw3Var2;
                        fetVar.s();
                        mm40 mm40VarE0 = o2e.e0(mm40Var, "ITEMS_LAZY_COLUMN");
                        if ((i8 & 896) == 256) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if ((i8 & 29360128) == 8388608) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z5 | z4 | ((234881024 & i8) == 67108864);
                        objP2 = fetVar.P();
                        if (z6 || objP2 == cl5Var) {
                            objP2 = new k9v(l7m0Var, function3, (Object) ugdVar, (byte) 8);
                            fetVar.o0(objP2);
                        }
                        e(mm40VarE0, xczVar, hh80Var, sw3Var3, null, null, z7, null, (Function1) objP2, fetVar, (i8 & 112) | ((i8 >> 9) & 896) | (i8 & 7168) | (57344 & i8) | ((i8 << 3) & 29360128), 352);
                        sw3Var2 = sw3Var3;
                        z2 = z7;
                    } else {
                        fetVar.X();
                        if ((i2 & 16) != 0) {
                            i8 &= -57345;
                        }
                    }
                    function3 = function2;
                    boolean z8 = z2;
                    sw3 sw3Var4 = sw3Var2;
                    fetVar.s();
                    mm40 mm40VarE1 = o2e.e0(mm40Var, "ITEMS_LAZY_COLUMN");
                    if ((i8 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((i8 & 29360128) == 8388608) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | z4 | ((234881024 & i8) == 67108864);
                    objP2 = fetVar.P();
                    if (z6) {
                        objP2 = new k9v(l7m0Var, function3, (Object) ugdVar, (byte) 8);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new k9v(l7m0Var, function3, (Object) ugdVar, (byte) 8);
                        fetVar.o0(objP2);
                    }
                    e(mm40VarE1, xczVar, hh80Var, sw3Var4, null, null, z8, null, (Function1) objP2, fetVar, (i8 & 112) | ((i8 >> 9) & 896) | (i8 & 7168) | (57344 & i8) | ((i8 << 3) & 29360128), 352);
                    sw3Var2 = sw3Var4;
                    z2 = z8;
                } else {
                    fetVar.X();
                    function3 = function2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new le9(mm40Var, xczVar, l7m0Var, sw3Var2, hh80Var, z2, function3, ugdVar, i, i2);
                }
            }
            i8 |= 12582912;
            function2 = function1;
            if ((i & 100663296) == 0) {
                if (fetVar.i(ugdVar)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i8 |= i7;
            }
            if ((i8 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i8 & 1, z3)) {
                fetVar.Z();
                i6 = i & 1;
                cl5Var = ukd.f35823a;
                if (i6 != 0) {
                    if ((i2 & 16) != 0) {
                        sw3Var2 = uc9.c;
                        i8 &= -57345;
                    }
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = new djx((byte) 6);
                            fetVar.o0(objP);
                        }
                        function3 = (Function1) objP;
                    } else {
                        function3 = function2;
                    }
                } else {
                    if ((i2 & 16) != 0) {
                        sw3Var2 = uc9.c;
                        i8 &= -57345;
                    }
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = new djx((byte) 6);
                            fetVar.o0(objP);
                        }
                        function3 = (Function1) objP;
                    } else {
                        function3 = function2;
                    }
                }
                boolean z9 = z2;
                sw3 sw3Var5 = sw3Var2;
                fetVar.s();
                mm40 mm40VarE2 = o2e.e0(mm40Var, "ITEMS_LAZY_COLUMN");
                if ((i8 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i8 & 29360128) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | z4 | ((234881024 & i8) == 67108864);
                objP2 = fetVar.P();
                if (z6) {
                    objP2 = new k9v(l7m0Var, function3, (Object) ugdVar, (byte) 8);
                    fetVar.o0(objP2);
                } else {
                    objP2 = new k9v(l7m0Var, function3, (Object) ugdVar, (byte) 8);
                    fetVar.o0(objP2);
                }
                e(mm40VarE2, xczVar, hh80Var, sw3Var5, null, null, z9, null, (Function1) objP2, fetVar, (i8 & 112) | ((i8 >> 9) & 896) | (i8 & 7168) | (57344 & i8) | ((i8 << 3) & 29360128), 352);
                sw3Var2 = sw3Var5;
                z2 = z9;
            } else {
                fetVar.X();
                function3 = function2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new le9(mm40Var, xczVar, l7m0Var, sw3Var2, hh80Var, z2, function3, ugdVar, i, i2);
            }
        }
        i8 |= 1572864;
        z2 = z;
        i4 = i2 & 128;
        if (i4 != 0) {
            if ((12582912 & i) == 0) {
                function2 = function1;
                if (fetVar.i(function2)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i8 |= i5;
            }
            if ((i & 100663296) == 0) {
                if (fetVar.i(ugdVar)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i8 |= i7;
            }
            if ((i8 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i8 & 1, z3)) {
                fetVar.Z();
                i6 = i & 1;
                cl5Var = ukd.f35823a;
                if (i6 != 0) {
                    if ((i2 & 16) != 0) {
                        sw3Var2 = uc9.c;
                        i8 &= -57345;
                    }
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = new djx((byte) 6);
                            fetVar.o0(objP);
                        }
                        function3 = (Function1) objP;
                    } else {
                        function3 = function2;
                    }
                } else {
                    if ((i2 & 16) != 0) {
                        sw3Var2 = uc9.c;
                        i8 &= -57345;
                    }
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = new djx((byte) 6);
                            fetVar.o0(objP);
                        }
                        function3 = (Function1) objP;
                    } else {
                        function3 = function2;
                    }
                }
                boolean z10 = z2;
                sw3 sw3Var6 = sw3Var2;
                fetVar.s();
                mm40 mm40VarE3 = o2e.e0(mm40Var, "ITEMS_LAZY_COLUMN");
                if ((i8 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i8 & 29360128) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | z4 | ((234881024 & i8) == 67108864);
                objP2 = fetVar.P();
                if (z6) {
                    objP2 = new k9v(l7m0Var, function3, (Object) ugdVar, (byte) 8);
                    fetVar.o0(objP2);
                } else {
                    objP2 = new k9v(l7m0Var, function3, (Object) ugdVar, (byte) 8);
                    fetVar.o0(objP2);
                }
                e(mm40VarE3, xczVar, hh80Var, sw3Var6, null, null, z10, null, (Function1) objP2, fetVar, (i8 & 112) | ((i8 >> 9) & 896) | (i8 & 7168) | (57344 & i8) | ((i8 << 3) & 29360128), 352);
                sw3Var2 = sw3Var6;
                z2 = z10;
            } else {
                fetVar.X();
                function3 = function2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new le9(mm40Var, xczVar, l7m0Var, sw3Var2, hh80Var, z2, function3, ugdVar, i, i2);
            }
        }
        i8 |= 12582912;
        function2 = function1;
        if ((i & 100663296) == 0) {
            if (fetVar.i(ugdVar)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i8 |= i7;
        }
        if ((i8 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i8 & 1, z3)) {
            fetVar.Z();
            i6 = i & 1;
            cl5Var = ukd.f35823a;
            if (i6 != 0) {
                if ((i2 & 16) != 0) {
                    sw3Var2 = uc9.c;
                    i8 &= -57345;
                }
                if (i10 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new djx((byte) 6);
                        fetVar.o0(objP);
                    }
                    function3 = (Function1) objP;
                } else {
                    function3 = function2;
                }
            } else {
                if ((i2 & 16) != 0) {
                    sw3Var2 = uc9.c;
                    i8 &= -57345;
                }
                if (i10 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new djx((byte) 6);
                        fetVar.o0(objP);
                    }
                    function3 = (Function1) objP;
                } else {
                    function3 = function2;
                }
            }
            boolean z11 = z2;
            sw3 sw3Var7 = sw3Var2;
            fetVar.s();
            mm40 mm40VarE4 = o2e.e0(mm40Var, "ITEMS_LAZY_COLUMN");
            if ((i8 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i8 & 29360128) == 8388608) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z5 | z4 | ((234881024 & i8) == 67108864);
            objP2 = fetVar.P();
            if (z6) {
                objP2 = new k9v(l7m0Var, function3, (Object) ugdVar, (byte) 8);
                fetVar.o0(objP2);
            } else {
                objP2 = new k9v(l7m0Var, function3, (Object) ugdVar, (byte) 8);
                fetVar.o0(objP2);
            }
            e(mm40VarE4, xczVar, hh80Var, sw3Var7, null, null, z11, null, (Function1) objP2, fetVar, (i8 & 112) | ((i8 >> 9) & 896) | (i8 & 7168) | (57344 & i8) | ((i8 << 3) & 29360128), 352);
            sw3Var2 = sw3Var7;
            z2 = z11;
        } else {
            fetVar.X();
            function3 = function2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new le9(mm40Var, xczVar, l7m0Var, sw3Var2, hh80Var, z2, function3, ugdVar, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:67:0x0107  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0119  */
    /* JADX WARN: Code duplicated, block: B:75:0x014f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0152  */
    /* JADX WARN: Code duplicated, block: B:79:0x0163  */
    /* JADX WARN: Code duplicated, block: B:80:0x0170  */
    public static final ArrayList d0(mk50 mk50Var, boolean z, v5l0 v5l0Var, long j, ctf0 ctf0Var, boolean z2) {
        cys0 cys0VarW;
        cys0 cys0Var;
        y3n0 y3n0Var;
        String str;
        String str2;
        kbo kboVar;
        List list;
        boolean z3;
        int iOrdinal;
        long j2;
        nim0 nim0Var;
        mim0 mim0VarC0;
        v5l0Var.getClass();
        ctf0Var.getClass();
        List list2 = mk50Var.l;
        List list3 = mk50Var.o;
        List list4 = mk50Var.n;
        String str3 = mk50Var.g;
        String str4 = mk50Var.f;
        String str5 = mk50Var.d;
        String str6 = mk50Var.c;
        String str7 = mk50Var.b;
        String str8 = mk50Var.f21928a;
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            u0m0 u0m0Var = (u0m0) it.next();
            String str9 = u0m0Var.b;
            lho lhoVar = u0m0Var.i;
            String str10 = u0m0Var.c;
            String str11 = str9.equals(str6) ? str4 : str3;
            String str12 = str10.equals(str5) ? str3 : str4;
            String str13 = str9.equals(str6) ? str8 : str7;
            String str14 = str10.equals(str5) ? str7 : str8;
            List list5 = str9.equals(str6) ? list4 : list3;
            List list6 = str10.equals(str5) ? list3 : list4;
            if (z2 && str8.length() == 0 && str7.length() == 0) {
                cys0Var = cys0.g;
            } else {
                if (z2 && (str8.length() == 0 || str7.length() == 0)) {
                    cys0Var = cys0.f;
                } else {
                    list5.getClass();
                    list6.getClass();
                    cys0VarW = wvb.W(list5.size() > 1 && list6.size() > 1, j);
                }
                y3n0Var = (y3n0) CollectionsKt.f0(list5);
                if (y3n0Var != null) {
                    str = y3n0Var.b;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                String strT = vsm0.t(str);
                y3n0 y3n0Var2 = (y3n0) CollectionsKt.f0(list6);
                String str15 = y3n0Var2 != null ? y3n0Var2.b : null;
                String strT2 = vsm0.t(str15 != null ? str15 : "");
                str2 = u0m0Var.l;
                String str16 = u0m0Var.m;
                if (str2.length() == 0) {
                    list = list3;
                } else {
                    list = list3;
                    if (u0m0Var.m.length() == 0) {
                        z3 = false;
                    }
                    List list7 = list4;
                    kboVar = new kbo(str13, str11, str14, str12, strT, strT2, str2, str16, z3, "", "", u0m0Var.h, u0m0Var.j, z, kotlin.collections.a.c(new Pair(str2, str16)));
                    iOrdinal = lhoVar.ordinal();
                    j2 = u0m0Var.k;
                    nim0Var = nim0.f23597a;
                    if (iOrdinal != 1) {
                        mim0VarC0 = ntb.c0(j2, cys0VarW, kboVar, v5l0Var, nim0Var);
                    } else if (iOrdinal != 2) {
                        mim0VarC0 = wwb.S(j2, cys0VarW, kboVar, v5l0Var, ctf0Var, nim0Var);
                    } else {
                        mim0VarC0 = vtb.j0(j2, cys0VarW, kboVar, v5l0Var, ctf0Var, nim0Var);
                    }
                    arrayList.add(new dyl0(u0m0Var.k, u0m0Var.f34860a, lhoVar, mim0VarC0, kboVar, list5, list6));
                    str8 = str8;
                    it = it;
                    list3 = list;
                    list4 = list7;
                }
                z3 = true;
                List list8 = list4;
                kboVar = new kbo(str13, str11, str14, str12, strT, strT2, str2, str16, z3, "", "", u0m0Var.h, u0m0Var.j, z, kotlin.collections.a.c(new Pair(str2, str16)));
                iOrdinal = lhoVar.ordinal();
                j2 = u0m0Var.k;
                nim0Var = nim0.f23597a;
                if (iOrdinal != 1) {
                    mim0VarC0 = ntb.c0(j2, cys0VarW, kboVar, v5l0Var, nim0Var);
                } else if (iOrdinal != 2) {
                    mim0VarC0 = wwb.S(j2, cys0VarW, kboVar, v5l0Var, ctf0Var, nim0Var);
                } else {
                    mim0VarC0 = vtb.j0(j2, cys0VarW, kboVar, v5l0Var, ctf0Var, nim0Var);
                }
                arrayList.add(new dyl0(u0m0Var.k, u0m0Var.f34860a, lhoVar, mim0VarC0, kboVar, list5, list6));
                str8 = str8;
                it = it;
                list3 = list;
                list4 = list8;
            }
            cys0VarW = cys0Var;
            y3n0Var = (y3n0) CollectionsKt.f0(list5);
            if (y3n0Var != null) {
                str = y3n0Var.b;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String strT3 = vsm0.t(str);
            y3n0 y3n0Var3 = (y3n0) CollectionsKt.f0(list6);
            if (y3n0Var3 != null) {
            }
            String strT4 = vsm0.t(str15 != null ? str15 : "");
            str2 = u0m0Var.l;
            String str17 = u0m0Var.m;
            if (str2.length() == 0) {
                list = list3;
            } else {
                list = list3;
                if (u0m0Var.m.length() == 0) {
                    z3 = false;
                }
                List list9 = list4;
                kboVar = new kbo(str13, str11, str14, str12, strT3, strT4, str2, str17, z3, "", "", u0m0Var.h, u0m0Var.j, z, kotlin.collections.a.c(new Pair(str2, str17)));
                iOrdinal = lhoVar.ordinal();
                j2 = u0m0Var.k;
                nim0Var = nim0.f23597a;
                if (iOrdinal != 1) {
                    mim0VarC0 = ntb.c0(j2, cys0VarW, kboVar, v5l0Var, nim0Var);
                } else if (iOrdinal != 2) {
                    mim0VarC0 = wwb.S(j2, cys0VarW, kboVar, v5l0Var, ctf0Var, nim0Var);
                } else {
                    mim0VarC0 = vtb.j0(j2, cys0VarW, kboVar, v5l0Var, ctf0Var, nim0Var);
                }
                arrayList.add(new dyl0(u0m0Var.k, u0m0Var.f34860a, lhoVar, mim0VarC0, kboVar, list5, list6));
                str8 = str8;
                it = it;
                list3 = list;
                list4 = list9;
            }
            z3 = true;
            List list10 = list4;
            kboVar = new kbo(str13, str11, str14, str12, strT3, strT4, str2, str17, z3, "", "", u0m0Var.h, u0m0Var.j, z, kotlin.collections.a.c(new Pair(str2, str17)));
            iOrdinal = lhoVar.ordinal();
            j2 = u0m0Var.k;
            nim0Var = nim0.f23597a;
            if (iOrdinal != 1) {
                mim0VarC0 = ntb.c0(j2, cys0VarW, kboVar, v5l0Var, nim0Var);
            } else if (iOrdinal != 2) {
                mim0VarC0 = wwb.S(j2, cys0VarW, kboVar, v5l0Var, ctf0Var, nim0Var);
            } else {
                mim0VarC0 = vtb.j0(j2, cys0VarW, kboVar, v5l0Var, ctf0Var, nim0Var);
            }
            arrayList.add(new dyl0(u0m0Var.k, u0m0Var.f34860a, lhoVar, mim0VarC0, kboVar, list5, list6));
            str8 = str8;
            it = it;
            list3 = list;
            list4 = list10;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x010c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0112  */
    /* JADX WARN: Code duplicated, block: B:105:0x0115  */
    /* JADX WARN: Code duplicated, block: B:109:0x0127  */
    /* JADX WARN: Code duplicated, block: B:110:0x012a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0133  */
    /* JADX WARN: Code duplicated, block: B:115:0x0143  */
    /* JADX WARN: Code duplicated, block: B:131:0x0165 A[PHI: r0 r4 r5 r7 r8 r11 r12 r15
  0x0165: PHI (r0v12 a.mm40) = (r0v9 a.mm40), (r0v18 a.mm40) binds: [B:156:0x01c2, B:130:0x0164] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r4v34 int) = (r4v24 int), (r4v38 int) binds: [B:156:0x01c2, B:130:0x0164] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r5v11 a.xcz) = (r5v5 a.xcz), (r5v2 a.xcz) binds: [B:156:0x01c2, B:130:0x0164] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r7v10 a.hh80) = (r7v5 a.hh80), (r7v2 a.hh80) binds: [B:156:0x01c2, B:130:0x0164] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r8v20 a.sw3) = (r8v15 a.sw3), (r8v12 a.sw3) binds: [B:156:0x01c2, B:130:0x0164] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r11v14 a.xx7) = (r11v5 a.xx7), (r11v3 a.xx7) binds: [B:156:0x01c2, B:130:0x0164] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r12v12 a.qkq) = (r12v9 a.qkq), (r12v7 a.qkq) binds: [B:156:0x01c2, B:130:0x0164] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r15v7 boolean) = (r15v4 boolean), (r15v3 boolean) binds: [B:156:0x01c2, B:130:0x0164] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0170  */
    /* JADX WARN: Code duplicated, block: B:134:0x0173  */
    /* JADX WARN: Code duplicated, block: B:137:0x0178  */
    /* JADX WARN: Code duplicated, block: B:139:0x0183  */
    /* JADX WARN: Code duplicated, block: B:142:0x018e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0195  */
    /* JADX WARN: Code duplicated, block: B:147:0x019c  */
    /* JADX WARN: Code duplicated, block: B:149:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:154:0x01be  */
    /* JADX WARN: Code duplicated, block: B:157:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:159:0x0214  */
    /* JADX WARN: Code duplicated, block: B:162:0x0225  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00df  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:99:0x0102  */
    public static final void e(mm40 mm40Var, xcz xczVar, hh80 hh80Var, sw3 sw3Var, xx7 xx7Var, qkq qkqVar, boolean z, vf80 vf80Var, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        xcz xczVarA;
        hh80 lh80Var;
        int i4;
        sw3 sw3Var2;
        int i5;
        xx7 xx7Var2;
        int i6;
        qkq qkqVar2;
        int i7;
        boolean z2;
        int i8;
        vf80 vf80Var2;
        boolean z3;
        mm40 mm40Var3;
        xcz xczVar2;
        hh80 hh80Var2;
        sw3 sw3Var3;
        vf80 vf80Var3;
        xx7 xx7Var3;
        qkq qkqVar3;
        boolean z4;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        xcz xczVar3;
        hh80 hh80Var3;
        sw3 sw3Var4;
        xx7 xx7Var4;
        qkq qkqVar4;
        boolean z5;
        vf80 vf80VarB;
        sjj sjjVarA;
        boolean zG;
        Object objP;
        int i9;
        fetVar.g0(53695811);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                xczVarA = xczVar;
                int i11 = fetVar.g(xczVarA) ? 32 : 16;
                i3 |= i11;
            } else {
                xczVarA = xczVar;
            }
            i3 |= i11;
        } else {
            xczVarA = xczVar;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                lh80Var = hh80Var;
                i3 |= fetVar.g(lh80Var) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (fetVar.h(false)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    sw3Var2 = sw3Var;
                    int i13 = fetVar.g(sw3Var2) ? 16384 : 8192;
                    i3 |= i13;
                } else {
                    sw3Var2 = sw3Var;
                }
                i3 |= i13;
            } else {
                sw3Var2 = sw3Var;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    xx7Var2 = xx7Var;
                    if (fetVar.g(xx7Var2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        qkqVar2 = qkqVar;
                        int i14 = fetVar.g(qkqVar2) ? 1048576 : 524288;
                        i3 |= i14;
                    } else {
                        qkqVar2 = qkqVar;
                    }
                    i3 |= i14;
                } else {
                    qkqVar2 = qkqVar;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    if ((12582912 & i) == 0) {
                        z2 = z;
                        if (fetVar.h(z2)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i2 & 256) == 0) {
                            vf80Var2 = vf80Var;
                            int i15 = fetVar.g(vf80Var2) ? 67108864 : 33554432;
                            i3 |= i15;
                        } else {
                            vf80Var2 = vf80Var;
                        }
                        i3 |= i15;
                    } else {
                        vf80Var2 = vf80Var;
                    }
                    if ((i & 805306368) == 0) {
                        if (fetVar.i(function1)) {
                            i9 = 536870912;
                        } else {
                            i9 = 268435456;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (fetVar.U(i3 & 1, z3)) {
                        fetVar.Z();
                        if ((i & 1) != 0 || fetVar.B()) {
                            if (i10 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                            }
                            if (i12 != 0) {
                                lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                sw3Var2 = uc9.c;
                            }
                            if (i5 != 0) {
                                xx7Var2 = gqw0.m;
                            }
                            if ((i2 & 64) != 0) {
                                sjjVarA = wzk0.a(fetVar);
                                zG = fetVar.g(sjjVarA);
                                objP = fetVar.P();
                                if (zG || objP == ukd.f35823a) {
                                    objP = new iuj(sjjVarA);
                                    fetVar.o0(objP);
                                }
                                i3 &= -3670017;
                                qkqVar2 = (iuj) objP;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                xczVar3 = xczVarA;
                                hh80Var3 = lh80Var;
                                sw3Var4 = sw3Var2;
                                xx7Var4 = xx7Var2;
                                qkqVar4 = qkqVar2;
                                z5 = z2;
                                vf80VarB = xf80.b(fetVar);
                            }
                            fetVar.s();
                            int i16 = i3 >> 3;
                            bdx.h(mm40Var4, xczVar3, hh80Var3, false, true, qkqVar4, z5, vf80VarB, xx7Var4, sw3Var4, null, null, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i16) | (3670016 & i16) | (i16 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                            boolean z6 = z5;
                            qkqVar3 = qkqVar4;
                            xx7Var3 = xx7Var4;
                            vf80Var3 = vf80VarB;
                            z4 = z6;
                            hh80Var2 = hh80Var3;
                            sw3Var3 = sw3Var4;
                            xczVar2 = xczVar3;
                            mm40Var3 = mm40Var4;
                        } else {
                            fetVar.X();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            mm40Var4 = mm40Var2;
                        }
                        xczVar3 = xczVarA;
                        hh80Var3 = lh80Var;
                        vf80VarB = vf80Var2;
                        qkqVar4 = qkqVar2;
                        z5 = z2;
                        sw3Var4 = sw3Var2;
                        xx7Var4 = xx7Var2;
                        fetVar.s();
                        int i17 = i3 >> 3;
                        bdx.h(mm40Var4, xczVar3, hh80Var3, false, true, qkqVar4, z5, vf80VarB, xx7Var4, sw3Var4, null, null, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                        boolean z7 = z5;
                        qkqVar3 = qkqVar4;
                        xx7Var3 = xx7Var4;
                        vf80Var3 = vf80VarB;
                        z4 = z7;
                        hh80Var2 = hh80Var3;
                        sw3Var3 = sw3Var4;
                        xczVar2 = xczVar3;
                        mm40Var3 = mm40Var4;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        xczVar2 = xczVarA;
                        hh80Var2 = lh80Var;
                        sw3Var3 = sw3Var2;
                        vf80Var3 = vf80Var2;
                        xx7Var3 = xx7Var2;
                        qkqVar3 = qkqVar2;
                        z4 = z2;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new wpm(mm40Var3, xczVar2, hh80Var2, sw3Var3, xx7Var3, qkqVar3, z4, vf80Var3, function1, i, i2);
                    }
                }
                i3 |= 12582912;
                z2 = z;
                if ((i & 100663296) == 0) {
                    if ((i2 & 256) == 0) {
                        vf80Var2 = vf80Var;
                        if (fetVar.g(vf80Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        vf80Var2 = vf80Var;
                    }
                    i3 |= i15;
                } else {
                    vf80Var2 = vf80Var;
                }
                if ((i & 805306368) == 0) {
                    if (fetVar.i(function1)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i3 |= i9;
                }
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i3 & 1, z3)) {
                    fetVar.Z();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                        }
                        if (i12 != 0) {
                            lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            sw3Var2 = uc9.c;
                        }
                        if (i5 != 0) {
                            xx7Var2 = gqw0.m;
                        }
                        if ((i2 & 64) != 0) {
                            sjjVarA = wzk0.a(fetVar);
                            zG = fetVar.g(sjjVarA);
                            objP = fetVar.P();
                            if (zG) {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            } else {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            }
                            i3 &= -3670017;
                            qkqVar2 = (iuj) objP;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            xczVar3 = xczVarA;
                            hh80Var3 = lh80Var;
                            sw3Var4 = sw3Var2;
                            xx7Var4 = xx7Var2;
                            qkqVar4 = qkqVar2;
                            z5 = z2;
                            vf80VarB = xf80.b(fetVar);
                        } else {
                            xczVar3 = xczVarA;
                            hh80Var3 = lh80Var;
                            vf80VarB = vf80Var2;
                            qkqVar4 = qkqVar2;
                            z5 = z2;
                            sw3Var4 = sw3Var2;
                            xx7Var4 = xx7Var2;
                        }
                    } else {
                        if (i10 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                        }
                        if (i12 != 0) {
                            lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            sw3Var2 = uc9.c;
                        }
                        if (i5 != 0) {
                            xx7Var2 = gqw0.m;
                        }
                        if ((i2 & 64) != 0) {
                            sjjVarA = wzk0.a(fetVar);
                            zG = fetVar.g(sjjVarA);
                            objP = fetVar.P();
                            if (zG) {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            } else {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            }
                            i3 &= -3670017;
                            qkqVar2 = (iuj) objP;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            xczVar3 = xczVarA;
                            hh80Var3 = lh80Var;
                            sw3Var4 = sw3Var2;
                            xx7Var4 = xx7Var2;
                            qkqVar4 = qkqVar2;
                            z5 = z2;
                            vf80VarB = xf80.b(fetVar);
                        } else {
                            xczVar3 = xczVarA;
                            hh80Var3 = lh80Var;
                            vf80VarB = vf80Var2;
                            qkqVar4 = qkqVar2;
                            z5 = z2;
                            sw3Var4 = sw3Var2;
                            xx7Var4 = xx7Var2;
                        }
                    }
                    fetVar.s();
                    int i18 = i3 >> 3;
                    bdx.h(mm40Var4, xczVar3, hh80Var3, false, true, qkqVar4, z5, vf80VarB, xx7Var4, sw3Var4, null, null, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i18) | (3670016 & i18) | (i18 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                    boolean z8 = z5;
                    qkqVar3 = qkqVar4;
                    xx7Var3 = xx7Var4;
                    vf80Var3 = vf80VarB;
                    z4 = z8;
                    hh80Var2 = hh80Var3;
                    sw3Var3 = sw3Var4;
                    xczVar2 = xczVar3;
                    mm40Var3 = mm40Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    xczVar2 = xczVarA;
                    hh80Var2 = lh80Var;
                    sw3Var3 = sw3Var2;
                    vf80Var3 = vf80Var2;
                    xx7Var3 = xx7Var2;
                    qkqVar3 = qkqVar2;
                    z4 = z2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new wpm(mm40Var3, xczVar2, hh80Var2, sw3Var3, xx7Var3, qkqVar3, z4, vf80Var3, function1, i, i2);
                }
            }
            i3 |= 196608;
            xx7Var2 = xx7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    qkqVar2 = qkqVar;
                    if (fetVar.g(qkqVar2)) {
                    }
                    i3 |= i14;
                } else {
                    qkqVar2 = qkqVar;
                }
                i3 |= i14;
            } else {
                qkqVar2 = qkqVar;
            }
            i7 = i2 & 128;
            if (i7 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (fetVar.h(z2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((i & 100663296) == 0) {
                    if ((i2 & 256) == 0) {
                        vf80Var2 = vf80Var;
                        if (fetVar.g(vf80Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        vf80Var2 = vf80Var;
                    }
                    i3 |= i15;
                } else {
                    vf80Var2 = vf80Var;
                }
                if ((i & 805306368) == 0) {
                    if (fetVar.i(function1)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i3 |= i9;
                }
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i3 & 1, z3)) {
                    fetVar.Z();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                        }
                        if (i12 != 0) {
                            lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            sw3Var2 = uc9.c;
                        }
                        if (i5 != 0) {
                            xx7Var2 = gqw0.m;
                        }
                        if ((i2 & 64) != 0) {
                            sjjVarA = wzk0.a(fetVar);
                            zG = fetVar.g(sjjVarA);
                            objP = fetVar.P();
                            if (zG) {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            } else {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            }
                            i3 &= -3670017;
                            qkqVar2 = (iuj) objP;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            xczVar3 = xczVarA;
                            hh80Var3 = lh80Var;
                            sw3Var4 = sw3Var2;
                            xx7Var4 = xx7Var2;
                            qkqVar4 = qkqVar2;
                            z5 = z2;
                            vf80VarB = xf80.b(fetVar);
                        } else {
                            xczVar3 = xczVarA;
                            hh80Var3 = lh80Var;
                            vf80VarB = vf80Var2;
                            qkqVar4 = qkqVar2;
                            z5 = z2;
                            sw3Var4 = sw3Var2;
                            xx7Var4 = xx7Var2;
                        }
                    } else {
                        if (i10 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                        }
                        if (i12 != 0) {
                            lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            sw3Var2 = uc9.c;
                        }
                        if (i5 != 0) {
                            xx7Var2 = gqw0.m;
                        }
                        if ((i2 & 64) != 0) {
                            sjjVarA = wzk0.a(fetVar);
                            zG = fetVar.g(sjjVarA);
                            objP = fetVar.P();
                            if (zG) {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            } else {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            }
                            i3 &= -3670017;
                            qkqVar2 = (iuj) objP;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            xczVar3 = xczVarA;
                            hh80Var3 = lh80Var;
                            sw3Var4 = sw3Var2;
                            xx7Var4 = xx7Var2;
                            qkqVar4 = qkqVar2;
                            z5 = z2;
                            vf80VarB = xf80.b(fetVar);
                        } else {
                            xczVar3 = xczVarA;
                            hh80Var3 = lh80Var;
                            vf80VarB = vf80Var2;
                            qkqVar4 = qkqVar2;
                            z5 = z2;
                            sw3Var4 = sw3Var2;
                            xx7Var4 = xx7Var2;
                        }
                    }
                    fetVar.s();
                    int i19 = i3 >> 3;
                    bdx.h(mm40Var4, xczVar3, hh80Var3, false, true, qkqVar4, z5, vf80VarB, xx7Var4, sw3Var4, null, null, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i19) | (3670016 & i19) | (i19 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                    boolean z9 = z5;
                    qkqVar3 = qkqVar4;
                    xx7Var3 = xx7Var4;
                    vf80Var3 = vf80VarB;
                    z4 = z9;
                    hh80Var2 = hh80Var3;
                    sw3Var3 = sw3Var4;
                    xczVar2 = xczVar3;
                    mm40Var3 = mm40Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    xczVar2 = xczVarA;
                    hh80Var2 = lh80Var;
                    sw3Var3 = sw3Var2;
                    vf80Var3 = vf80Var2;
                    xx7Var3 = xx7Var2;
                    qkqVar3 = qkqVar2;
                    z4 = z2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new wpm(mm40Var3, xczVar2, hh80Var2, sw3Var3, xx7Var3, qkqVar3, z4, vf80Var3, function1, i, i2);
                }
            }
            i3 |= 12582912;
            z2 = z;
            if ((i & 100663296) == 0) {
                if ((i2 & 256) == 0) {
                    vf80Var2 = vf80Var;
                    if (fetVar.g(vf80Var2)) {
                    }
                    i3 |= i15;
                } else {
                    vf80Var2 = vf80Var;
                }
                i3 |= i15;
            } else {
                vf80Var2 = vf80Var;
            }
            if ((i & 805306368) == 0) {
                if (fetVar.i(function1)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i3 |= i9;
            }
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                fetVar.Z();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    }
                    if (i12 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        sw3Var2 = uc9.c;
                    }
                    if (i5 != 0) {
                        xx7Var2 = gqw0.m;
                    }
                    if ((i2 & 64) != 0) {
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        } else {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        i3 &= -3670017;
                        qkqVar2 = (iuj) objP;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        xczVar3 = xczVarA;
                        hh80Var3 = lh80Var;
                        sw3Var4 = sw3Var2;
                        xx7Var4 = xx7Var2;
                        qkqVar4 = qkqVar2;
                        z5 = z2;
                        vf80VarB = xf80.b(fetVar);
                    } else {
                        xczVar3 = xczVarA;
                        hh80Var3 = lh80Var;
                        vf80VarB = vf80Var2;
                        qkqVar4 = qkqVar2;
                        z5 = z2;
                        sw3Var4 = sw3Var2;
                        xx7Var4 = xx7Var2;
                    }
                } else {
                    if (i10 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    }
                    if (i12 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        sw3Var2 = uc9.c;
                    }
                    if (i5 != 0) {
                        xx7Var2 = gqw0.m;
                    }
                    if ((i2 & 64) != 0) {
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        } else {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        i3 &= -3670017;
                        qkqVar2 = (iuj) objP;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        xczVar3 = xczVarA;
                        hh80Var3 = lh80Var;
                        sw3Var4 = sw3Var2;
                        xx7Var4 = xx7Var2;
                        qkqVar4 = qkqVar2;
                        z5 = z2;
                        vf80VarB = xf80.b(fetVar);
                    } else {
                        xczVar3 = xczVarA;
                        hh80Var3 = lh80Var;
                        vf80VarB = vf80Var2;
                        qkqVar4 = qkqVar2;
                        z5 = z2;
                        sw3Var4 = sw3Var2;
                        xx7Var4 = xx7Var2;
                    }
                }
                fetVar.s();
                int i110 = i3 >> 3;
                bdx.h(mm40Var4, xczVar3, hh80Var3, false, true, qkqVar4, z5, vf80VarB, xx7Var4, sw3Var4, null, null, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i110) | (3670016 & i110) | (i110 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                boolean z10 = z5;
                qkqVar3 = qkqVar4;
                xx7Var3 = xx7Var4;
                vf80Var3 = vf80VarB;
                z4 = z10;
                hh80Var2 = hh80Var3;
                sw3Var3 = sw3Var4;
                xczVar2 = xczVar3;
                mm40Var3 = mm40Var4;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                xczVar2 = xczVarA;
                hh80Var2 = lh80Var;
                sw3Var3 = sw3Var2;
                vf80Var3 = vf80Var2;
                xx7Var3 = xx7Var2;
                qkqVar3 = qkqVar2;
                z4 = z2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new wpm(mm40Var3, xczVar2, hh80Var2, sw3Var3, xx7Var3, qkqVar3, z4, vf80Var3, function1, i, i2);
            }
        }
        i3 |= 384;
        lh80Var = hh80Var;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (fetVar.h(false)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                sw3Var2 = sw3Var;
                if (fetVar.g(sw3Var2)) {
                }
                i3 |= i13;
            } else {
                sw3Var2 = sw3Var;
            }
            i3 |= i13;
        } else {
            sw3Var2 = sw3Var;
        }
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                xx7Var2 = xx7Var;
                if (fetVar.g(xx7Var2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    qkqVar2 = qkqVar;
                    if (fetVar.g(qkqVar2)) {
                    }
                    i3 |= i14;
                } else {
                    qkqVar2 = qkqVar;
                }
                i3 |= i14;
            } else {
                qkqVar2 = qkqVar;
            }
            i7 = i2 & 128;
            if (i7 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (fetVar.h(z2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((i & 100663296) == 0) {
                    if ((i2 & 256) == 0) {
                        vf80Var2 = vf80Var;
                        if (fetVar.g(vf80Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        vf80Var2 = vf80Var;
                    }
                    i3 |= i15;
                } else {
                    vf80Var2 = vf80Var;
                }
                if ((i & 805306368) == 0) {
                    if (fetVar.i(function1)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i3 |= i9;
                }
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i3 & 1, z3)) {
                    fetVar.Z();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                        }
                        if (i12 != 0) {
                            lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            sw3Var2 = uc9.c;
                        }
                        if (i5 != 0) {
                            xx7Var2 = gqw0.m;
                        }
                        if ((i2 & 64) != 0) {
                            sjjVarA = wzk0.a(fetVar);
                            zG = fetVar.g(sjjVarA);
                            objP = fetVar.P();
                            if (zG) {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            } else {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            }
                            i3 &= -3670017;
                            qkqVar2 = (iuj) objP;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            xczVar3 = xczVarA;
                            hh80Var3 = lh80Var;
                            sw3Var4 = sw3Var2;
                            xx7Var4 = xx7Var2;
                            qkqVar4 = qkqVar2;
                            z5 = z2;
                            vf80VarB = xf80.b(fetVar);
                        } else {
                            xczVar3 = xczVarA;
                            hh80Var3 = lh80Var;
                            vf80VarB = vf80Var2;
                            qkqVar4 = qkqVar2;
                            z5 = z2;
                            sw3Var4 = sw3Var2;
                            xx7Var4 = xx7Var2;
                        }
                    } else {
                        if (i10 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                        }
                        if (i12 != 0) {
                            lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            sw3Var2 = uc9.c;
                        }
                        if (i5 != 0) {
                            xx7Var2 = gqw0.m;
                        }
                        if ((i2 & 64) != 0) {
                            sjjVarA = wzk0.a(fetVar);
                            zG = fetVar.g(sjjVarA);
                            objP = fetVar.P();
                            if (zG) {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            } else {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            }
                            i3 &= -3670017;
                            qkqVar2 = (iuj) objP;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            xczVar3 = xczVarA;
                            hh80Var3 = lh80Var;
                            sw3Var4 = sw3Var2;
                            xx7Var4 = xx7Var2;
                            qkqVar4 = qkqVar2;
                            z5 = z2;
                            vf80VarB = xf80.b(fetVar);
                        } else {
                            xczVar3 = xczVarA;
                            hh80Var3 = lh80Var;
                            vf80VarB = vf80Var2;
                            qkqVar4 = qkqVar2;
                            z5 = z2;
                            sw3Var4 = sw3Var2;
                            xx7Var4 = xx7Var2;
                        }
                    }
                    fetVar.s();
                    int i111 = i3 >> 3;
                    bdx.h(mm40Var4, xczVar3, hh80Var3, false, true, qkqVar4, z5, vf80VarB, xx7Var4, sw3Var4, null, null, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i111) | (3670016 & i111) | (i111 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                    boolean z11 = z5;
                    qkqVar3 = qkqVar4;
                    xx7Var3 = xx7Var4;
                    vf80Var3 = vf80VarB;
                    z4 = z11;
                    hh80Var2 = hh80Var3;
                    sw3Var3 = sw3Var4;
                    xczVar2 = xczVar3;
                    mm40Var3 = mm40Var4;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    xczVar2 = xczVarA;
                    hh80Var2 = lh80Var;
                    sw3Var3 = sw3Var2;
                    vf80Var3 = vf80Var2;
                    xx7Var3 = xx7Var2;
                    qkqVar3 = qkqVar2;
                    z4 = z2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new wpm(mm40Var3, xczVar2, hh80Var2, sw3Var3, xx7Var3, qkqVar3, z4, vf80Var3, function1, i, i2);
                }
            }
            i3 |= 12582912;
            z2 = z;
            if ((i & 100663296) == 0) {
                if ((i2 & 256) == 0) {
                    vf80Var2 = vf80Var;
                    if (fetVar.g(vf80Var2)) {
                    }
                    i3 |= i15;
                } else {
                    vf80Var2 = vf80Var;
                }
                i3 |= i15;
            } else {
                vf80Var2 = vf80Var;
            }
            if ((i & 805306368) == 0) {
                if (fetVar.i(function1)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i3 |= i9;
            }
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                fetVar.Z();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    }
                    if (i12 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        sw3Var2 = uc9.c;
                    }
                    if (i5 != 0) {
                        xx7Var2 = gqw0.m;
                    }
                    if ((i2 & 64) != 0) {
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        } else {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        i3 &= -3670017;
                        qkqVar2 = (iuj) objP;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        xczVar3 = xczVarA;
                        hh80Var3 = lh80Var;
                        sw3Var4 = sw3Var2;
                        xx7Var4 = xx7Var2;
                        qkqVar4 = qkqVar2;
                        z5 = z2;
                        vf80VarB = xf80.b(fetVar);
                    } else {
                        xczVar3 = xczVarA;
                        hh80Var3 = lh80Var;
                        vf80VarB = vf80Var2;
                        qkqVar4 = qkqVar2;
                        z5 = z2;
                        sw3Var4 = sw3Var2;
                        xx7Var4 = xx7Var2;
                    }
                } else {
                    if (i10 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    }
                    if (i12 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        sw3Var2 = uc9.c;
                    }
                    if (i5 != 0) {
                        xx7Var2 = gqw0.m;
                    }
                    if ((i2 & 64) != 0) {
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        } else {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        i3 &= -3670017;
                        qkqVar2 = (iuj) objP;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        xczVar3 = xczVarA;
                        hh80Var3 = lh80Var;
                        sw3Var4 = sw3Var2;
                        xx7Var4 = xx7Var2;
                        qkqVar4 = qkqVar2;
                        z5 = z2;
                        vf80VarB = xf80.b(fetVar);
                    } else {
                        xczVar3 = xczVarA;
                        hh80Var3 = lh80Var;
                        vf80VarB = vf80Var2;
                        qkqVar4 = qkqVar2;
                        z5 = z2;
                        sw3Var4 = sw3Var2;
                        xx7Var4 = xx7Var2;
                    }
                }
                fetVar.s();
                int i112 = i3 >> 3;
                bdx.h(mm40Var4, xczVar3, hh80Var3, false, true, qkqVar4, z5, vf80VarB, xx7Var4, sw3Var4, null, null, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i112) | (3670016 & i112) | (i112 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                boolean z12 = z5;
                qkqVar3 = qkqVar4;
                xx7Var3 = xx7Var4;
                vf80Var3 = vf80VarB;
                z4 = z12;
                hh80Var2 = hh80Var3;
                sw3Var3 = sw3Var4;
                xczVar2 = xczVar3;
                mm40Var3 = mm40Var4;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                xczVar2 = xczVarA;
                hh80Var2 = lh80Var;
                sw3Var3 = sw3Var2;
                vf80Var3 = vf80Var2;
                xx7Var3 = xx7Var2;
                qkqVar3 = qkqVar2;
                z4 = z2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new wpm(mm40Var3, xczVar2, hh80Var2, sw3Var3, xx7Var3, qkqVar3, z4, vf80Var3, function1, i, i2);
            }
        }
        i3 |= 196608;
        xx7Var2 = xx7Var;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                qkqVar2 = qkqVar;
                if (fetVar.g(qkqVar2)) {
                }
                i3 |= i14;
            } else {
                qkqVar2 = qkqVar;
            }
            i3 |= i14;
        } else {
            qkqVar2 = qkqVar;
        }
        i7 = i2 & 128;
        if (i7 != 0) {
            if ((12582912 & i) == 0) {
                z2 = z;
                if (fetVar.h(z2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((i & 100663296) == 0) {
                if ((i2 & 256) == 0) {
                    vf80Var2 = vf80Var;
                    if (fetVar.g(vf80Var2)) {
                    }
                    i3 |= i15;
                } else {
                    vf80Var2 = vf80Var;
                }
                i3 |= i15;
            } else {
                vf80Var2 = vf80Var;
            }
            if ((i & 805306368) == 0) {
                if (fetVar.i(function1)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i3 |= i9;
            }
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                fetVar.Z();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    }
                    if (i12 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        sw3Var2 = uc9.c;
                    }
                    if (i5 != 0) {
                        xx7Var2 = gqw0.m;
                    }
                    if ((i2 & 64) != 0) {
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        } else {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        i3 &= -3670017;
                        qkqVar2 = (iuj) objP;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        xczVar3 = xczVarA;
                        hh80Var3 = lh80Var;
                        sw3Var4 = sw3Var2;
                        xx7Var4 = xx7Var2;
                        qkqVar4 = qkqVar2;
                        z5 = z2;
                        vf80VarB = xf80.b(fetVar);
                    } else {
                        xczVar3 = xczVarA;
                        hh80Var3 = lh80Var;
                        vf80VarB = vf80Var2;
                        qkqVar4 = qkqVar2;
                        z5 = z2;
                        sw3Var4 = sw3Var2;
                        xx7Var4 = xx7Var2;
                    }
                } else {
                    if (i10 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    }
                    if (i12 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        sw3Var2 = uc9.c;
                    }
                    if (i5 != 0) {
                        xx7Var2 = gqw0.m;
                    }
                    if ((i2 & 64) != 0) {
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        } else {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        i3 &= -3670017;
                        qkqVar2 = (iuj) objP;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        xczVar3 = xczVarA;
                        hh80Var3 = lh80Var;
                        sw3Var4 = sw3Var2;
                        xx7Var4 = xx7Var2;
                        qkqVar4 = qkqVar2;
                        z5 = z2;
                        vf80VarB = xf80.b(fetVar);
                    } else {
                        xczVar3 = xczVarA;
                        hh80Var3 = lh80Var;
                        vf80VarB = vf80Var2;
                        qkqVar4 = qkqVar2;
                        z5 = z2;
                        sw3Var4 = sw3Var2;
                        xx7Var4 = xx7Var2;
                    }
                }
                fetVar.s();
                int i113 = i3 >> 3;
                bdx.h(mm40Var4, xczVar3, hh80Var3, false, true, qkqVar4, z5, vf80VarB, xx7Var4, sw3Var4, null, null, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i113) | (3670016 & i113) | (i113 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                boolean z13 = z5;
                qkqVar3 = qkqVar4;
                xx7Var3 = xx7Var4;
                vf80Var3 = vf80VarB;
                z4 = z13;
                hh80Var2 = hh80Var3;
                sw3Var3 = sw3Var4;
                xczVar2 = xczVar3;
                mm40Var3 = mm40Var4;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                xczVar2 = xczVarA;
                hh80Var2 = lh80Var;
                sw3Var3 = sw3Var2;
                vf80Var3 = vf80Var2;
                xx7Var3 = xx7Var2;
                qkqVar3 = qkqVar2;
                z4 = z2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new wpm(mm40Var3, xczVar2, hh80Var2, sw3Var3, xx7Var3, qkqVar3, z4, vf80Var3, function1, i, i2);
            }
        }
        i3 |= 12582912;
        z2 = z;
        if ((i & 100663296) == 0) {
            if ((i2 & 256) == 0) {
                vf80Var2 = vf80Var;
                if (fetVar.g(vf80Var2)) {
                }
                i3 |= i15;
            } else {
                vf80Var2 = vf80Var;
            }
            i3 |= i15;
        } else {
            vf80Var2 = vf80Var;
        }
        if ((i & 805306368) == 0) {
            if (fetVar.i(function1)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i3 |= i9;
        }
        if ((i3 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i3 & 1, z3)) {
            fetVar.Z();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                }
                if (i12 != 0) {
                    lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    sw3Var2 = uc9.c;
                }
                if (i5 != 0) {
                    xx7Var2 = gqw0.m;
                }
                if ((i2 & 64) != 0) {
                    sjjVarA = wzk0.a(fetVar);
                    zG = fetVar.g(sjjVarA);
                    objP = fetVar.P();
                    if (zG) {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    } else {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    }
                    i3 &= -3670017;
                    qkqVar2 = (iuj) objP;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    xczVar3 = xczVarA;
                    hh80Var3 = lh80Var;
                    sw3Var4 = sw3Var2;
                    xx7Var4 = xx7Var2;
                    qkqVar4 = qkqVar2;
                    z5 = z2;
                    vf80VarB = xf80.b(fetVar);
                } else {
                    xczVar3 = xczVarA;
                    hh80Var3 = lh80Var;
                    vf80VarB = vf80Var2;
                    qkqVar4 = qkqVar2;
                    z5 = z2;
                    sw3Var4 = sw3Var2;
                    xx7Var4 = xx7Var2;
                }
            } else {
                if (i10 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                }
                if (i12 != 0) {
                    lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    sw3Var2 = uc9.c;
                }
                if (i5 != 0) {
                    xx7Var2 = gqw0.m;
                }
                if ((i2 & 64) != 0) {
                    sjjVarA = wzk0.a(fetVar);
                    zG = fetVar.g(sjjVarA);
                    objP = fetVar.P();
                    if (zG) {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    } else {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    }
                    i3 &= -3670017;
                    qkqVar2 = (iuj) objP;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    xczVar3 = xczVarA;
                    hh80Var3 = lh80Var;
                    sw3Var4 = sw3Var2;
                    xx7Var4 = xx7Var2;
                    qkqVar4 = qkqVar2;
                    z5 = z2;
                    vf80VarB = xf80.b(fetVar);
                } else {
                    xczVar3 = xczVarA;
                    hh80Var3 = lh80Var;
                    vf80VarB = vf80Var2;
                    qkqVar4 = qkqVar2;
                    z5 = z2;
                    sw3Var4 = sw3Var2;
                    xx7Var4 = xx7Var2;
                }
            }
            fetVar.s();
            int i114 = i3 >> 3;
            bdx.h(mm40Var4, xczVar3, hh80Var3, false, true, qkqVar4, z5, vf80VarB, xx7Var4, sw3Var4, null, null, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i114) | (3670016 & i114) | (i114 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
            boolean z14 = z5;
            qkqVar3 = qkqVar4;
            xx7Var3 = xx7Var4;
            vf80Var3 = vf80VarB;
            z4 = z14;
            hh80Var2 = hh80Var3;
            sw3Var3 = sw3Var4;
            xczVar2 = xczVar3;
            mm40Var3 = mm40Var4;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
            xczVar2 = xczVarA;
            hh80Var2 = lh80Var;
            sw3Var3 = sw3Var2;
            vf80Var3 = vf80Var2;
            xx7Var3 = xx7Var2;
            qkqVar3 = qkqVar2;
            z4 = z2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wpm(mm40Var3, xczVar2, hh80Var2, sw3Var3, xx7Var3, qkqVar3, z4, vf80Var3, function1, i, i2);
        }
    }

    public static final Integer e0(jup jupVar, esj0 esj0Var) {
        int iOrdinal = esj0Var.ordinal();
        if (iOrdinal == 0) {
            return jupVar.i;
        }
        if (iOrdinal == 1) {
            return jupVar.j;
        }
        if (iOrdinal == 2) {
            return jupVar.k;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0111  */
    /* JADX WARN: Code duplicated, block: B:104:0x0117  */
    /* JADX WARN: Code duplicated, block: B:105:0x011a  */
    /* JADX WARN: Code duplicated, block: B:109:0x012d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0130  */
    /* JADX WARN: Code duplicated, block: B:113:0x0139  */
    /* JADX WARN: Code duplicated, block: B:115:0x0149  */
    /* JADX WARN: Code duplicated, block: B:132:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x017a  */
    /* JADX WARN: Code duplicated, block: B:134:0x017d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0183  */
    /* JADX WARN: Code duplicated, block: B:139:0x018c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0193  */
    /* JADX WARN: Code duplicated, block: B:143:0x0197  */
    /* JADX WARN: Code duplicated, block: B:146:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x019e  */
    /* JADX WARN: Code duplicated, block: B:148:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:152:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:156:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:158:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:160:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:165:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:168:0x01db  */
    /* JADX WARN: Code duplicated, block: B:169:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:171:0x0233  */
    /* JADX WARN: Code duplicated, block: B:174:0x0248  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:96:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0107  */
    public static final void f(mm40 mm40Var, xcz xczVar, hh80 hh80Var, boolean z, ow3 ow3Var, yx7 yx7Var, qkq qkqVar, boolean z2, vf80 vf80Var, final Function1 function1, fet fetVar, final int i, final int i2) {
        int i3;
        xcz xczVarA;
        hh80 hh80Var2;
        int i4;
        boolean z3;
        int i5;
        ow3 ow3Var2;
        int i6;
        yx7 yx7Var2;
        int i7;
        qkq qkqVar2;
        int i8;
        int i9;
        boolean z4;
        final mm40 mm40Var2;
        final boolean z5;
        final xcz xczVar2;
        final hh80 hh80Var3;
        final boolean z6;
        final ow3 ow3Var3;
        final yx7 yx7Var3;
        final qkq qkqVar3;
        final vf80 vf80Var2;
        yfe0 yfe0VarU;
        mm40 mm40Var3;
        hh80 lh80Var;
        boolean z7;
        ow3 ow3Var4;
        yx7 yx7Var4;
        qkq qkqVar4;
        boolean z8;
        xcz xczVar3;
        hh80 hh80Var4;
        ow3 ow3Var5;
        yx7 yx7Var5;
        qkq qkqVar5;
        boolean z9;
        vf80 vf80VarB;
        sjj sjjVarA;
        boolean zG;
        Object objP;
        int i10;
        fetVar.g0(-1884325601);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                xczVarA = xczVar;
                int i12 = fetVar.g(xczVarA) ? 32 : 16;
                i3 |= i12;
            } else {
                xczVarA = xczVar;
            }
            i3 |= i12;
        } else {
            xczVarA = xczVar;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                hh80Var2 = hh80Var;
                i3 |= fetVar.g(hh80Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z;
                    if (fetVar.h(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        ow3Var2 = ow3Var;
                        int i14 = fetVar.g(ow3Var2) ? 16384 : 8192;
                        i3 |= i14;
                    } else {
                        ow3Var2 = ow3Var;
                    }
                    i3 |= i14;
                } else {
                    ow3Var2 = ow3Var;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        yx7Var2 = yx7Var;
                        if (fetVar.g(yx7Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            qkqVar2 = qkqVar;
                            int i15 = fetVar.g(qkqVar2) ? 1048576 : 524288;
                            i3 |= i15;
                        } else {
                            qkqVar2 = qkqVar;
                        }
                        i3 |= i15;
                    } else {
                        qkqVar2 = qkqVar;
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (fetVar.h(z2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i & 100663296) != 0) {
                        i3 |= ((i2 & 256) == 0 || !fetVar.g(vf80Var)) ? 33554432 : 67108864;
                    }
                    if ((i & 805306368) == 0) {
                        if (fetVar.i(function1)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i3 |= i10;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (fetVar.U(i3 & 1, z4)) {
                        fetVar.Z();
                        if ((i & 1) != 0 || fetVar.B()) {
                            if (i11 != 0) {
                                mm40Var3 = jm40.b;
                            } else {
                                mm40Var3 = mm40Var;
                            }
                            if ((i2 & 2) != 0) {
                                xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                                i3 &= -113;
                            }
                            if (i13 != 0) {
                                lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                lh80Var = hh80Var2;
                            }
                            z7 = i4 == 0 ? z3 : false;
                            if ((i2 & 16) != 0) {
                                if (z7) {
                                    ow3Var4 = uc9.b;
                                } else {
                                    ow3Var4 = uc9.f35418a;
                                }
                                i3 &= -57345;
                            } else {
                                ow3Var4 = ow3Var2;
                            }
                            if (i6 != 0) {
                                yx7Var4 = gqw0.j;
                            } else {
                                yx7Var4 = yx7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                sjjVarA = wzk0.a(fetVar);
                                zG = fetVar.g(sjjVarA);
                                objP = fetVar.P();
                                if (zG || objP == ukd.f35823a) {
                                    objP = new iuj(sjjVarA);
                                    fetVar.o0(objP);
                                }
                                qkqVar4 = (iuj) objP;
                                i3 &= -3670017;
                            } else {
                                qkqVar4 = qkqVar2;
                            }
                            z8 = i8 == 0 ? z2 : true;
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                xczVar3 = xczVarA;
                                hh80Var4 = lh80Var;
                                ow3Var5 = ow3Var4;
                                qkqVar5 = qkqVar4;
                                vf80VarB = xf80.b(fetVar);
                                z9 = z8;
                                yx7Var5 = yx7Var4;
                            } else {
                                xczVar3 = xczVarA;
                                hh80Var4 = lh80Var;
                                ow3Var5 = ow3Var4;
                                yx7Var5 = yx7Var4;
                                qkqVar5 = qkqVar4;
                                z9 = z8;
                            }
                            fetVar.s();
                            int i16 = i3 >> 3;
                            bdx.h(mm40Var3, xczVar3, hh80Var4, z7, false, qkqVar5, z9, vf80VarB, null, null, yx7Var5, ow3Var5, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i16) | (3670016 & i16) | (i16 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                            z6 = z7;
                            z5 = z9;
                            vf80Var2 = vf80VarB;
                            yx7Var3 = yx7Var5;
                            hh80Var3 = hh80Var4;
                            qkqVar3 = qkqVar5;
                            ow3Var3 = ow3Var5;
                            xczVar2 = xczVar3;
                            mm40Var2 = mm40Var3;
                        } else {
                            fetVar.X();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            mm40Var3 = mm40Var;
                            z9 = z2;
                            xczVar3 = xczVarA;
                            hh80Var4 = hh80Var2;
                            z7 = z3;
                            ow3Var5 = ow3Var2;
                            yx7Var5 = yx7Var2;
                            qkqVar5 = qkqVar2;
                        }
                        vf80VarB = vf80Var;
                        fetVar.s();
                        int i17 = i3 >> 3;
                        bdx.h(mm40Var3, xczVar3, hh80Var4, z7, false, qkqVar5, z9, vf80VarB, null, null, yx7Var5, ow3Var5, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                        z6 = z7;
                        z5 = z9;
                        vf80Var2 = vf80VarB;
                        yx7Var3 = yx7Var5;
                        hh80Var3 = hh80Var4;
                        qkqVar3 = qkqVar5;
                        ow3Var3 = ow3Var5;
                        xczVar2 = xczVar3;
                        mm40Var2 = mm40Var3;
                    } else {
                        fetVar.X();
                        mm40Var2 = mm40Var;
                        z5 = z2;
                        xczVar2 = xczVarA;
                        hh80Var3 = hh80Var2;
                        z6 = z3;
                        ow3Var3 = ow3Var2;
                        yx7Var3 = yx7Var2;
                        qkqVar3 = qkqVar2;
                        vf80Var2 = vf80Var;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.e8z
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                b8k0.f(mm40Var2, xczVar2, hh80Var3, z6, ow3Var3, yx7Var3, qkqVar3, z5, vf80Var2, function1, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                yx7Var2 = yx7Var;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        qkqVar2 = qkqVar;
                        if (fetVar.g(qkqVar2)) {
                        }
                        i3 |= i15;
                    } else {
                        qkqVar2 = qkqVar;
                    }
                    i3 |= i15;
                } else {
                    qkqVar2 = qkqVar;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (fetVar.h(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !fetVar.g(vf80Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (fetVar.i(function1)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i3 |= i10;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (fetVar.U(i3 & 1, z4)) {
                    fetVar.Z();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if ((i2 & 2) != 0) {
                            xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                            i3 &= -113;
                        }
                        if (i13 != 0) {
                            lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            lh80Var = hh80Var2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            if (z7) {
                                ow3Var4 = uc9.f35418a;
                            } else {
                                ow3Var4 = uc9.b;
                            }
                            i3 &= -57345;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            sjjVarA = wzk0.a(fetVar);
                            zG = fetVar.g(sjjVarA);
                            objP = fetVar.P();
                            if (zG) {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            } else {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            }
                            qkqVar4 = (iuj) objP;
                            i3 &= -3670017;
                        } else {
                            qkqVar4 = qkqVar2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            xczVar3 = xczVarA;
                            hh80Var4 = lh80Var;
                            ow3Var5 = ow3Var4;
                            qkqVar5 = qkqVar4;
                            vf80VarB = xf80.b(fetVar);
                            z9 = z8;
                            yx7Var5 = yx7Var4;
                        } else {
                            xczVar3 = xczVarA;
                            hh80Var4 = lh80Var;
                            ow3Var5 = ow3Var4;
                            yx7Var5 = yx7Var4;
                            qkqVar5 = qkqVar4;
                            z9 = z8;
                            vf80VarB = vf80Var;
                        }
                    } else {
                        if (i11 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if ((i2 & 2) != 0) {
                            xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                            i3 &= -113;
                        }
                        if (i13 != 0) {
                            lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            lh80Var = hh80Var2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            if (z7) {
                                ow3Var4 = uc9.f35418a;
                            } else {
                                ow3Var4 = uc9.b;
                            }
                            i3 &= -57345;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            sjjVarA = wzk0.a(fetVar);
                            zG = fetVar.g(sjjVarA);
                            objP = fetVar.P();
                            if (zG) {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            } else {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            }
                            qkqVar4 = (iuj) objP;
                            i3 &= -3670017;
                        } else {
                            qkqVar4 = qkqVar2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            xczVar3 = xczVarA;
                            hh80Var4 = lh80Var;
                            ow3Var5 = ow3Var4;
                            qkqVar5 = qkqVar4;
                            vf80VarB = xf80.b(fetVar);
                            z9 = z8;
                            yx7Var5 = yx7Var4;
                        } else {
                            xczVar3 = xczVarA;
                            hh80Var4 = lh80Var;
                            ow3Var5 = ow3Var4;
                            yx7Var5 = yx7Var4;
                            qkqVar5 = qkqVar4;
                            z9 = z8;
                            vf80VarB = vf80Var;
                        }
                    }
                    fetVar.s();
                    int i18 = i3 >> 3;
                    bdx.h(mm40Var3, xczVar3, hh80Var4, z7, false, qkqVar5, z9, vf80VarB, null, null, yx7Var5, ow3Var5, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i18) | (3670016 & i18) | (i18 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                    z6 = z7;
                    z5 = z9;
                    vf80Var2 = vf80VarB;
                    yx7Var3 = yx7Var5;
                    hh80Var3 = hh80Var4;
                    qkqVar3 = qkqVar5;
                    ow3Var3 = ow3Var5;
                    xczVar2 = xczVar3;
                    mm40Var2 = mm40Var3;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    z5 = z2;
                    xczVar2 = xczVarA;
                    hh80Var3 = hh80Var2;
                    z6 = z3;
                    ow3Var3 = ow3Var2;
                    yx7Var3 = yx7Var2;
                    qkqVar3 = qkqVar2;
                    vf80Var2 = vf80Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.e8z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            b8k0.f(mm40Var2, xczVar2, hh80Var3, z6, ow3Var3, yx7Var3, qkqVar3, z5, vf80Var2, function1, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 3072;
            z3 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    ow3Var2 = ow3Var;
                    if (fetVar.g(ow3Var2)) {
                    }
                    i3 |= i14;
                } else {
                    ow3Var2 = ow3Var;
                }
                i3 |= i14;
            } else {
                ow3Var2 = ow3Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    yx7Var2 = yx7Var;
                    if (fetVar.g(yx7Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        qkqVar2 = qkqVar;
                        if (fetVar.g(qkqVar2)) {
                        }
                        i3 |= i15;
                    } else {
                        qkqVar2 = qkqVar;
                    }
                    i3 |= i15;
                } else {
                    qkqVar2 = qkqVar;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (fetVar.h(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !fetVar.g(vf80Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (fetVar.i(function1)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i3 |= i10;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (fetVar.U(i3 & 1, z4)) {
                    fetVar.Z();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if ((i2 & 2) != 0) {
                            xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                            i3 &= -113;
                        }
                        if (i13 != 0) {
                            lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            lh80Var = hh80Var2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            if (z7) {
                                ow3Var4 = uc9.f35418a;
                            } else {
                                ow3Var4 = uc9.b;
                            }
                            i3 &= -57345;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            sjjVarA = wzk0.a(fetVar);
                            zG = fetVar.g(sjjVarA);
                            objP = fetVar.P();
                            if (zG) {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            } else {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            }
                            qkqVar4 = (iuj) objP;
                            i3 &= -3670017;
                        } else {
                            qkqVar4 = qkqVar2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            xczVar3 = xczVarA;
                            hh80Var4 = lh80Var;
                            ow3Var5 = ow3Var4;
                            qkqVar5 = qkqVar4;
                            vf80VarB = xf80.b(fetVar);
                            z9 = z8;
                            yx7Var5 = yx7Var4;
                        } else {
                            xczVar3 = xczVarA;
                            hh80Var4 = lh80Var;
                            ow3Var5 = ow3Var4;
                            yx7Var5 = yx7Var4;
                            qkqVar5 = qkqVar4;
                            z9 = z8;
                            vf80VarB = vf80Var;
                        }
                    } else {
                        if (i11 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if ((i2 & 2) != 0) {
                            xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                            i3 &= -113;
                        }
                        if (i13 != 0) {
                            lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            lh80Var = hh80Var2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            if (z7) {
                                ow3Var4 = uc9.f35418a;
                            } else {
                                ow3Var4 = uc9.b;
                            }
                            i3 &= -57345;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            sjjVarA = wzk0.a(fetVar);
                            zG = fetVar.g(sjjVarA);
                            objP = fetVar.P();
                            if (zG) {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            } else {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            }
                            qkqVar4 = (iuj) objP;
                            i3 &= -3670017;
                        } else {
                            qkqVar4 = qkqVar2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            xczVar3 = xczVarA;
                            hh80Var4 = lh80Var;
                            ow3Var5 = ow3Var4;
                            qkqVar5 = qkqVar4;
                            vf80VarB = xf80.b(fetVar);
                            z9 = z8;
                            yx7Var5 = yx7Var4;
                        } else {
                            xczVar3 = xczVarA;
                            hh80Var4 = lh80Var;
                            ow3Var5 = ow3Var4;
                            yx7Var5 = yx7Var4;
                            qkqVar5 = qkqVar4;
                            z9 = z8;
                            vf80VarB = vf80Var;
                        }
                    }
                    fetVar.s();
                    int i19 = i3 >> 3;
                    bdx.h(mm40Var3, xczVar3, hh80Var4, z7, false, qkqVar5, z9, vf80VarB, null, null, yx7Var5, ow3Var5, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i19) | (3670016 & i19) | (i19 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                    z6 = z7;
                    z5 = z9;
                    vf80Var2 = vf80VarB;
                    yx7Var3 = yx7Var5;
                    hh80Var3 = hh80Var4;
                    qkqVar3 = qkqVar5;
                    ow3Var3 = ow3Var5;
                    xczVar2 = xczVar3;
                    mm40Var2 = mm40Var3;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    z5 = z2;
                    xczVar2 = xczVarA;
                    hh80Var3 = hh80Var2;
                    z6 = z3;
                    ow3Var3 = ow3Var2;
                    yx7Var3 = yx7Var2;
                    qkqVar3 = qkqVar2;
                    vf80Var2 = vf80Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.e8z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            b8k0.f(mm40Var2, xczVar2, hh80Var3, z6, ow3Var3, yx7Var3, qkqVar3, z5, vf80Var2, function1, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 196608;
            yx7Var2 = yx7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    qkqVar2 = qkqVar;
                    if (fetVar.g(qkqVar2)) {
                    }
                    i3 |= i15;
                } else {
                    qkqVar2 = qkqVar;
                }
                i3 |= i15;
            } else {
                qkqVar2 = qkqVar;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (fetVar.h(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & 256) == 0 || !fetVar.g(vf80Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if (fetVar.i(function1)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i3 |= i10;
            }
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fetVar.U(i3 & 1, z4)) {
                fetVar.Z();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if ((i2 & 2) != 0) {
                        xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                        i3 &= -113;
                    }
                    if (i13 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        lh80Var = hh80Var2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        if (z7) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = uc9.b;
                        }
                        i3 &= -57345;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        } else {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        qkqVar4 = (iuj) objP;
                        i3 &= -3670017;
                    } else {
                        qkqVar4 = qkqVar2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        xczVar3 = xczVarA;
                        hh80Var4 = lh80Var;
                        ow3Var5 = ow3Var4;
                        qkqVar5 = qkqVar4;
                        vf80VarB = xf80.b(fetVar);
                        z9 = z8;
                        yx7Var5 = yx7Var4;
                    } else {
                        xczVar3 = xczVarA;
                        hh80Var4 = lh80Var;
                        ow3Var5 = ow3Var4;
                        yx7Var5 = yx7Var4;
                        qkqVar5 = qkqVar4;
                        z9 = z8;
                        vf80VarB = vf80Var;
                    }
                } else {
                    if (i11 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if ((i2 & 2) != 0) {
                        xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                        i3 &= -113;
                    }
                    if (i13 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        lh80Var = hh80Var2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        if (z7) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = uc9.b;
                        }
                        i3 &= -57345;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        } else {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        qkqVar4 = (iuj) objP;
                        i3 &= -3670017;
                    } else {
                        qkqVar4 = qkqVar2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        xczVar3 = xczVarA;
                        hh80Var4 = lh80Var;
                        ow3Var5 = ow3Var4;
                        qkqVar5 = qkqVar4;
                        vf80VarB = xf80.b(fetVar);
                        z9 = z8;
                        yx7Var5 = yx7Var4;
                    } else {
                        xczVar3 = xczVarA;
                        hh80Var4 = lh80Var;
                        ow3Var5 = ow3Var4;
                        yx7Var5 = yx7Var4;
                        qkqVar5 = qkqVar4;
                        z9 = z8;
                        vf80VarB = vf80Var;
                    }
                }
                fetVar.s();
                int i110 = i3 >> 3;
                bdx.h(mm40Var3, xczVar3, hh80Var4, z7, false, qkqVar5, z9, vf80VarB, null, null, yx7Var5, ow3Var5, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i110) | (3670016 & i110) | (i110 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                z6 = z7;
                z5 = z9;
                vf80Var2 = vf80VarB;
                yx7Var3 = yx7Var5;
                hh80Var3 = hh80Var4;
                qkqVar3 = qkqVar5;
                ow3Var3 = ow3Var5;
                xczVar2 = xczVar3;
                mm40Var2 = mm40Var3;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                z5 = z2;
                xczVar2 = xczVarA;
                hh80Var3 = hh80Var2;
                z6 = z3;
                ow3Var3 = ow3Var2;
                yx7Var3 = yx7Var2;
                qkqVar3 = qkqVar2;
                vf80Var2 = vf80Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.e8z
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b8k0.f(mm40Var2, xczVar2, hh80Var3, z6, ow3Var3, yx7Var3, qkqVar3, z5, vf80Var2, function1, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 384;
        hh80Var2 = hh80Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                if (fetVar.h(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    ow3Var2 = ow3Var;
                    if (fetVar.g(ow3Var2)) {
                    }
                    i3 |= i14;
                } else {
                    ow3Var2 = ow3Var;
                }
                i3 |= i14;
            } else {
                ow3Var2 = ow3Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    yx7Var2 = yx7Var;
                    if (fetVar.g(yx7Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        qkqVar2 = qkqVar;
                        if (fetVar.g(qkqVar2)) {
                        }
                        i3 |= i15;
                    } else {
                        qkqVar2 = qkqVar;
                    }
                    i3 |= i15;
                } else {
                    qkqVar2 = qkqVar;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (fetVar.h(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !fetVar.g(vf80Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (fetVar.i(function1)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i3 |= i10;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (fetVar.U(i3 & 1, z4)) {
                    fetVar.Z();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if ((i2 & 2) != 0) {
                            xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                            i3 &= -113;
                        }
                        if (i13 != 0) {
                            lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            lh80Var = hh80Var2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            if (z7) {
                                ow3Var4 = uc9.f35418a;
                            } else {
                                ow3Var4 = uc9.b;
                            }
                            i3 &= -57345;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            sjjVarA = wzk0.a(fetVar);
                            zG = fetVar.g(sjjVarA);
                            objP = fetVar.P();
                            if (zG) {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            } else {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            }
                            qkqVar4 = (iuj) objP;
                            i3 &= -3670017;
                        } else {
                            qkqVar4 = qkqVar2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            xczVar3 = xczVarA;
                            hh80Var4 = lh80Var;
                            ow3Var5 = ow3Var4;
                            qkqVar5 = qkqVar4;
                            vf80VarB = xf80.b(fetVar);
                            z9 = z8;
                            yx7Var5 = yx7Var4;
                        } else {
                            xczVar3 = xczVarA;
                            hh80Var4 = lh80Var;
                            ow3Var5 = ow3Var4;
                            yx7Var5 = yx7Var4;
                            qkqVar5 = qkqVar4;
                            z9 = z8;
                            vf80VarB = vf80Var;
                        }
                    } else {
                        if (i11 != 0) {
                            mm40Var3 = jm40.b;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if ((i2 & 2) != 0) {
                            xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                            i3 &= -113;
                        }
                        if (i13 != 0) {
                            lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            lh80Var = hh80Var2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            if (z7) {
                                ow3Var4 = uc9.f35418a;
                            } else {
                                ow3Var4 = uc9.b;
                            }
                            i3 &= -57345;
                        } else {
                            ow3Var4 = ow3Var2;
                        }
                        if (i6 != 0) {
                            yx7Var4 = gqw0.j;
                        } else {
                            yx7Var4 = yx7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            sjjVarA = wzk0.a(fetVar);
                            zG = fetVar.g(sjjVarA);
                            objP = fetVar.P();
                            if (zG) {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            } else {
                                objP = new iuj(sjjVarA);
                                fetVar.o0(objP);
                            }
                            qkqVar4 = (iuj) objP;
                            i3 &= -3670017;
                        } else {
                            qkqVar4 = qkqVar2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            xczVar3 = xczVarA;
                            hh80Var4 = lh80Var;
                            ow3Var5 = ow3Var4;
                            qkqVar5 = qkqVar4;
                            vf80VarB = xf80.b(fetVar);
                            z9 = z8;
                            yx7Var5 = yx7Var4;
                        } else {
                            xczVar3 = xczVarA;
                            hh80Var4 = lh80Var;
                            ow3Var5 = ow3Var4;
                            yx7Var5 = yx7Var4;
                            qkqVar5 = qkqVar4;
                            z9 = z8;
                            vf80VarB = vf80Var;
                        }
                    }
                    fetVar.s();
                    int i111 = i3 >> 3;
                    bdx.h(mm40Var3, xczVar3, hh80Var4, z7, false, qkqVar5, z9, vf80VarB, null, null, yx7Var5, ow3Var5, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i111) | (3670016 & i111) | (i111 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                    z6 = z7;
                    z5 = z9;
                    vf80Var2 = vf80VarB;
                    yx7Var3 = yx7Var5;
                    hh80Var3 = hh80Var4;
                    qkqVar3 = qkqVar5;
                    ow3Var3 = ow3Var5;
                    xczVar2 = xczVar3;
                    mm40Var2 = mm40Var3;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    z5 = z2;
                    xczVar2 = xczVarA;
                    hh80Var3 = hh80Var2;
                    z6 = z3;
                    ow3Var3 = ow3Var2;
                    yx7Var3 = yx7Var2;
                    qkqVar3 = qkqVar2;
                    vf80Var2 = vf80Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.e8z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            b8k0.f(mm40Var2, xczVar2, hh80Var3, z6, ow3Var3, yx7Var3, qkqVar3, z5, vf80Var2, function1, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 196608;
            yx7Var2 = yx7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    qkqVar2 = qkqVar;
                    if (fetVar.g(qkqVar2)) {
                    }
                    i3 |= i15;
                } else {
                    qkqVar2 = qkqVar;
                }
                i3 |= i15;
            } else {
                qkqVar2 = qkqVar;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (fetVar.h(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & 256) == 0 || !fetVar.g(vf80Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if (fetVar.i(function1)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i3 |= i10;
            }
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fetVar.U(i3 & 1, z4)) {
                fetVar.Z();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if ((i2 & 2) != 0) {
                        xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                        i3 &= -113;
                    }
                    if (i13 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        lh80Var = hh80Var2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        if (z7) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = uc9.b;
                        }
                        i3 &= -57345;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        } else {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        qkqVar4 = (iuj) objP;
                        i3 &= -3670017;
                    } else {
                        qkqVar4 = qkqVar2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        xczVar3 = xczVarA;
                        hh80Var4 = lh80Var;
                        ow3Var5 = ow3Var4;
                        qkqVar5 = qkqVar4;
                        vf80VarB = xf80.b(fetVar);
                        z9 = z8;
                        yx7Var5 = yx7Var4;
                    } else {
                        xczVar3 = xczVarA;
                        hh80Var4 = lh80Var;
                        ow3Var5 = ow3Var4;
                        yx7Var5 = yx7Var4;
                        qkqVar5 = qkqVar4;
                        z9 = z8;
                        vf80VarB = vf80Var;
                    }
                } else {
                    if (i11 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if ((i2 & 2) != 0) {
                        xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                        i3 &= -113;
                    }
                    if (i13 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        lh80Var = hh80Var2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        if (z7) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = uc9.b;
                        }
                        i3 &= -57345;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        } else {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        qkqVar4 = (iuj) objP;
                        i3 &= -3670017;
                    } else {
                        qkqVar4 = qkqVar2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        xczVar3 = xczVarA;
                        hh80Var4 = lh80Var;
                        ow3Var5 = ow3Var4;
                        qkqVar5 = qkqVar4;
                        vf80VarB = xf80.b(fetVar);
                        z9 = z8;
                        yx7Var5 = yx7Var4;
                    } else {
                        xczVar3 = xczVarA;
                        hh80Var4 = lh80Var;
                        ow3Var5 = ow3Var4;
                        yx7Var5 = yx7Var4;
                        qkqVar5 = qkqVar4;
                        z9 = z8;
                        vf80VarB = vf80Var;
                    }
                }
                fetVar.s();
                int i112 = i3 >> 3;
                bdx.h(mm40Var3, xczVar3, hh80Var4, z7, false, qkqVar5, z9, vf80VarB, null, null, yx7Var5, ow3Var5, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i112) | (3670016 & i112) | (i112 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                z6 = z7;
                z5 = z9;
                vf80Var2 = vf80VarB;
                yx7Var3 = yx7Var5;
                hh80Var3 = hh80Var4;
                qkqVar3 = qkqVar5;
                ow3Var3 = ow3Var5;
                xczVar2 = xczVar3;
                mm40Var2 = mm40Var3;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                z5 = z2;
                xczVar2 = xczVarA;
                hh80Var3 = hh80Var2;
                z6 = z3;
                ow3Var3 = ow3Var2;
                yx7Var3 = yx7Var2;
                qkqVar3 = qkqVar2;
                vf80Var2 = vf80Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.e8z
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b8k0.f(mm40Var2, xczVar2, hh80Var3, z6, ow3Var3, yx7Var3, qkqVar3, z5, vf80Var2, function1, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 3072;
        z3 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                ow3Var2 = ow3Var;
                if (fetVar.g(ow3Var2)) {
                }
                i3 |= i14;
            } else {
                ow3Var2 = ow3Var;
            }
            i3 |= i14;
        } else {
            ow3Var2 = ow3Var;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                yx7Var2 = yx7Var;
                if (fetVar.g(yx7Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    qkqVar2 = qkqVar;
                    if (fetVar.g(qkqVar2)) {
                    }
                    i3 |= i15;
                } else {
                    qkqVar2 = qkqVar;
                }
                i3 |= i15;
            } else {
                qkqVar2 = qkqVar;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (fetVar.h(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & 256) == 0 || !fetVar.g(vf80Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if (fetVar.i(function1)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i3 |= i10;
            }
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fetVar.U(i3 & 1, z4)) {
                fetVar.Z();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if ((i2 & 2) != 0) {
                        xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                        i3 &= -113;
                    }
                    if (i13 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        lh80Var = hh80Var2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        if (z7) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = uc9.b;
                        }
                        i3 &= -57345;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        } else {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        qkqVar4 = (iuj) objP;
                        i3 &= -3670017;
                    } else {
                        qkqVar4 = qkqVar2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        xczVar3 = xczVarA;
                        hh80Var4 = lh80Var;
                        ow3Var5 = ow3Var4;
                        qkqVar5 = qkqVar4;
                        vf80VarB = xf80.b(fetVar);
                        z9 = z8;
                        yx7Var5 = yx7Var4;
                    } else {
                        xczVar3 = xczVarA;
                        hh80Var4 = lh80Var;
                        ow3Var5 = ow3Var4;
                        yx7Var5 = yx7Var4;
                        qkqVar5 = qkqVar4;
                        z9 = z8;
                        vf80VarB = vf80Var;
                    }
                } else {
                    if (i11 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if ((i2 & 2) != 0) {
                        xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                        i3 &= -113;
                    }
                    if (i13 != 0) {
                        lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        lh80Var = hh80Var2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        if (z7) {
                            ow3Var4 = uc9.f35418a;
                        } else {
                            ow3Var4 = uc9.b;
                        }
                        i3 &= -57345;
                    } else {
                        ow3Var4 = ow3Var2;
                    }
                    if (i6 != 0) {
                        yx7Var4 = gqw0.j;
                    } else {
                        yx7Var4 = yx7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        } else {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        qkqVar4 = (iuj) objP;
                        i3 &= -3670017;
                    } else {
                        qkqVar4 = qkqVar2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        xczVar3 = xczVarA;
                        hh80Var4 = lh80Var;
                        ow3Var5 = ow3Var4;
                        qkqVar5 = qkqVar4;
                        vf80VarB = xf80.b(fetVar);
                        z9 = z8;
                        yx7Var5 = yx7Var4;
                    } else {
                        xczVar3 = xczVarA;
                        hh80Var4 = lh80Var;
                        ow3Var5 = ow3Var4;
                        yx7Var5 = yx7Var4;
                        qkqVar5 = qkqVar4;
                        z9 = z8;
                        vf80VarB = vf80Var;
                    }
                }
                fetVar.s();
                int i113 = i3 >> 3;
                bdx.h(mm40Var3, xczVar3, hh80Var4, z7, false, qkqVar5, z9, vf80VarB, null, null, yx7Var5, ow3Var5, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i113) | (3670016 & i113) | (i113 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                z6 = z7;
                z5 = z9;
                vf80Var2 = vf80VarB;
                yx7Var3 = yx7Var5;
                hh80Var3 = hh80Var4;
                qkqVar3 = qkqVar5;
                ow3Var3 = ow3Var5;
                xczVar2 = xczVar3;
                mm40Var2 = mm40Var3;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                z5 = z2;
                xczVar2 = xczVarA;
                hh80Var3 = hh80Var2;
                z6 = z3;
                ow3Var3 = ow3Var2;
                yx7Var3 = yx7Var2;
                qkqVar3 = qkqVar2;
                vf80Var2 = vf80Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.e8z
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b8k0.f(mm40Var2, xczVar2, hh80Var3, z6, ow3Var3, yx7Var3, qkqVar3, z5, vf80Var2, function1, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 196608;
        yx7Var2 = yx7Var;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                qkqVar2 = qkqVar;
                if (fetVar.g(qkqVar2)) {
                }
                i3 |= i15;
            } else {
                qkqVar2 = qkqVar;
            }
            i3 |= i15;
        } else {
            qkqVar2 = qkqVar;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (fetVar.h(z2)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        if ((i & 100663296) != 0) {
            i3 |= ((i2 & 256) == 0 || !fetVar.g(vf80Var)) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            if (fetVar.i(function1)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i3 |= i10;
        }
        if ((i3 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (fetVar.U(i3 & 1, z4)) {
            fetVar.Z();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var;
                }
                if ((i2 & 2) != 0) {
                    xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    i3 &= -113;
                }
                if (i13 != 0) {
                    lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    lh80Var = hh80Var2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    if (z7) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = uc9.b;
                    }
                    i3 &= -57345;
                } else {
                    ow3Var4 = ow3Var2;
                }
                if (i6 != 0) {
                    yx7Var4 = gqw0.j;
                } else {
                    yx7Var4 = yx7Var2;
                }
                if ((i2 & 64) != 0) {
                    sjjVarA = wzk0.a(fetVar);
                    zG = fetVar.g(sjjVarA);
                    objP = fetVar.P();
                    if (zG) {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    } else {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    }
                    qkqVar4 = (iuj) objP;
                    i3 &= -3670017;
                } else {
                    qkqVar4 = qkqVar2;
                }
                if (i8 == 0) {
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    xczVar3 = xczVarA;
                    hh80Var4 = lh80Var;
                    ow3Var5 = ow3Var4;
                    qkqVar5 = qkqVar4;
                    vf80VarB = xf80.b(fetVar);
                    z9 = z8;
                    yx7Var5 = yx7Var4;
                } else {
                    xczVar3 = xczVarA;
                    hh80Var4 = lh80Var;
                    ow3Var5 = ow3Var4;
                    yx7Var5 = yx7Var4;
                    qkqVar5 = qkqVar4;
                    z9 = z8;
                    vf80VarB = vf80Var;
                }
            } else {
                if (i11 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var;
                }
                if ((i2 & 2) != 0) {
                    xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    i3 &= -113;
                }
                if (i13 != 0) {
                    lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    lh80Var = hh80Var2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    if (z7) {
                        ow3Var4 = uc9.f35418a;
                    } else {
                        ow3Var4 = uc9.b;
                    }
                    i3 &= -57345;
                } else {
                    ow3Var4 = ow3Var2;
                }
                if (i6 != 0) {
                    yx7Var4 = gqw0.j;
                } else {
                    yx7Var4 = yx7Var2;
                }
                if ((i2 & 64) != 0) {
                    sjjVarA = wzk0.a(fetVar);
                    zG = fetVar.g(sjjVarA);
                    objP = fetVar.P();
                    if (zG) {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    } else {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    }
                    qkqVar4 = (iuj) objP;
                    i3 &= -3670017;
                } else {
                    qkqVar4 = qkqVar2;
                }
                if (i8 == 0) {
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    xczVar3 = xczVarA;
                    hh80Var4 = lh80Var;
                    ow3Var5 = ow3Var4;
                    qkqVar5 = qkqVar4;
                    vf80VarB = xf80.b(fetVar);
                    z9 = z8;
                    yx7Var5 = yx7Var4;
                } else {
                    xczVar3 = xczVarA;
                    hh80Var4 = lh80Var;
                    ow3Var5 = ow3Var4;
                    yx7Var5 = yx7Var4;
                    qkqVar5 = qkqVar4;
                    z9 = z8;
                    vf80VarB = vf80Var;
                }
            }
            fetVar.s();
            int i114 = i3 >> 3;
            bdx.h(mm40Var3, xczVar3, hh80Var4, z7, false, qkqVar5, z9, vf80VarB, null, null, yx7Var5, ow3Var5, function1, fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i114) | (3670016 & i114) | (i114 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
            z6 = z7;
            z5 = z9;
            vf80Var2 = vf80VarB;
            yx7Var3 = yx7Var5;
            hh80Var3 = hh80Var4;
            qkqVar3 = qkqVar5;
            ow3Var3 = ow3Var5;
            xczVar2 = xczVar3;
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            z5 = z2;
            xczVar2 = xczVarA;
            hh80Var3 = hh80Var2;
            z6 = z3;
            ow3Var3 = ow3Var2;
            yx7Var3 = yx7Var2;
            qkqVar3 = qkqVar2;
            vf80Var2 = vf80Var;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.e8z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b8k0.f(mm40Var2, xczVar2, hh80Var3, z6, ow3Var3, yx7Var3, qkqVar3, z5, vf80Var2, function1, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final Integer f0(jup jupVar, gsj0 gsj0Var) {
        int iOrdinal = gsj0Var.ordinal();
        if (iOrdinal == 0) {
            return jupVar.f;
        }
        if (iOrdinal == 1) {
            return jupVar.g;
        }
        if (iOrdinal == 2) {
            return jupVar.h;
        }
        t9f.b();
        return null;
    }

    public static final void g(mm40 mm40Var, final l7m0 l7m0Var, final Function1 function1, Function1 function2, fet fetVar, final int i, final int i2) {
        int i3;
        Function1 function3;
        int i4;
        final mm40 mm40Var2;
        final Function1 function4;
        Function1 function5;
        Function1 function6;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(-743466440);
        int i5 = i2 & 1;
        byte b = 2;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        }
        int i6 = i3 | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i6 | 3072;
            function3 = function2;
        } else {
            function3 = function2;
            i4 = i6 | (fetVar2.i(function3) ? 2048 : 1024);
        }
        if (fetVar2.U(i4 & 1, (i4 & 1171) != 1170)) {
            mm40 mm40Var3 = i5 != 0 ? jm40.b : mm40Var;
            if (i7 != 0) {
                Object objP = fetVar2.P();
                if (objP == ukd.f35823a) {
                    objP = new r520(b);
                    fetVar2.o0(objP);
                }
                function5 = (Function1) objP;
            } else {
                function5 = function3;
            }
            d820 d820Var = (d820) l7m0Var.getValue();
            int i8 = z720.f43898a[d820Var.f5623a.ordinal()];
            if (i8 == 1 && d820Var.b != null) {
                fetVar2.e0(-1506666675);
                Function1 function7 = function5;
                x1x.e(wha0.a0(cjx.V(mm40Var3, x0x.a0(fetVar2), null), wha0.T(fetVar2), false, 14), d820Var.b, function1, function7, fetVar2, i4 & 8064);
                function6 = function7;
                fetVar2.r(false);
            } else if (i8 == 2 && d820Var.c != null) {
                fetVar2.e0(-1506652059);
                Function1 function8 = function5;
                w9x.e(wha0.a0(cjx.V(mm40Var3, x0x.a0(fetVar2), null), wha0.T(fetVar2), false, 14), d820Var.c, function1, function8, null, null, fetVar, i4 & 8064);
                function6 = function8;
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                if (i8 != 3 || d820Var.d == null) {
                    fetVar2.e0(539375556);
                    fetVar2.r(false);
                    yfe0 yfe0VarU = fetVar2.u();
                    if (yfe0VarU != null) {
                        final byte b2 = 0;
                        final Function1 function9 = function5;
                        final mm40 mm40Var4 = mm40Var3;
                        yfe0VarU.d = new Function2(mm40Var4, l7m0Var, function1, function9, i, i2, b2) { // from class: a.x720

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ byte f40392a;
                            public final /* synthetic */ mm40 b;
                            public final /* synthetic */ l7m0 c;
                            public final /* synthetic */ Function1 d;
                            public final /* synthetic */ Function1 e;
                            public final /* synthetic */ byte f;

                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                this.f40392a = b2;
                                this.f = i2;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (this.f40392a) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iL = x8x.L(1);
                                        b8k0.g(this.b, this.c, this.d, this.e, (fet) obj, iL, this.f);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iL2 = x8x.L(1);
                                        b8k0.g(this.b, this.c, this.d, this.e, (fet) obj, iL2, this.f);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        return;
                    }
                    return;
                }
                fetVar2.e0(538894343);
                rah0 rah0VarT = wha0.T(fetVar2);
                Function1 function10 = function5;
                rcb.L(wha0.a0(cjx.V(mm40Var3, x0x.a0(fetVar2), null), rah0VarT, false, 14), d820Var.d, rah0VarT, function1, function10, fetVar2, (i4 << 3) & 64512);
                function6 = function10;
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            function4 = function6;
            mm40Var2 = mm40Var3;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
            function4 = function3;
        }
        yfe0 yfe0VarU2 = fetVar2.u();
        if (yfe0VarU2 != null) {
            final byte b3 = 1;
            yfe0VarU2.d = new Function2(mm40Var2, l7m0Var, function1, function4, i, i2, b3) { // from class: a.x720

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f40392a;
                public final /* synthetic */ mm40 b;
                public final /* synthetic */ l7m0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ byte f;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f40392a = b3;
                    this.f = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f40392a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iL = x8x.L(1);
                            b8k0.g(this.b, this.c, this.d, this.e, (fet) obj, iL, this.f);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iL2 = x8x.L(1);
                            b8k0.g(this.b, this.c, this.d, this.e, (fet) obj, iL2, this.f);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void h(mm40 mm40Var, udl0 udl0Var, fet fetVar) {
        ljc ljcVar = jd8.n;
        int iOrdinal = udl0Var.ordinal();
        if (iOrdinal == 0) {
            fetVar.e0(-652258363);
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar, s5x0.N(mm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13));
            fetVar.r(false);
            return;
        }
        if (iOrdinal == 1) {
            fetVar.e0(-652255527);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarD, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar);
            zcl zclVar2 = qmk.f28987a;
            zq8.a(0, fetVar, i120.Q(o7k0.e(s5x0.L(mm40VarQ, qmk.a(fetVar).d, 0.0f, 2), 1.0f), ((ThemeColors) fetVar.k(zfnVar)).getSeparator60(), ljcVar));
            fetVar.r(false);
            return;
        }
        if (iOrdinal == 2) {
            fetVar.e0(-652244379);
            zcl zclVar3 = qmk.f28987a;
            qxw.o(fetVar, s5x0.N(mm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13));
            fetVar.r(false);
            return;
        }
        if (iOrdinal != 3) {
            throw b1j.f(-652259376, fetVar, false);
        }
        fetVar.e0(-652241743);
        zcl zclVar4 = qmk.f28987a;
        zq8.a(0, fetVar, i120.Q(o7k0.e(o7k0.d(s5x0.L(mm40Var, qmk.a(fetVar).c, 0.0f, 2), 1.0f), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60(), ljcVar));
        fetVar.r(false);
    }

    public static final void i(int i, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var, boolean z) {
        ugd ugdVar3;
        ugd ugdVar4;
        boolean z2;
        fetVar.g0(-1743805131);
        int i2 = i | 16;
        boolean z3 = false;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
                z3 = z;
            } else if (fetVar.k(bmd.n) == k6z.b) {
                z3 = true;
            }
            fetVar.s();
            boolean zH = fetVar.h(z3);
            Object objP = fetVar.P();
            if (zH || objP == ukd.f35823a) {
                objP = new kp2((byte) 6, z3);
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
            jm40 jm40Var = jm40.b;
            ugdVar4 = ugdVar2;
            ugdVar4.F(mrv.k0(jm40Var, "SCORE"), fetVar, 54);
            mm40 mm40VarK0 = mrv.k0(jm40Var, Request.INFO);
            zcl zclVar = qmk.f28987a;
            ugdVar3 = ugdVar;
            ugdVar3.F(s5x0.N(mm40VarK0, 0.0f, 0.0f, 4.0f, 0.0f, 11), fetVar, 48);
            fetVar.r(true);
            z2 = z3;
        } else {
            ugdVar3 = ugdVar;
            ugdVar4 = ugdVar2;
            fetVar.X();
            z2 = z;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gka(mm40Var, z2, ugdVar3, ugdVar4, i, (byte) 6);
        }
    }

    public static final void j(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1910894813);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar2.X();
        } else if (str == null) {
            fetVar2.e0(1970905781);
            fetVar2.r(false);
        } else {
            fetVar2.e0(1970905782);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40.b, 24.0f);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarA = g1t0.a();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarS, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0VarA, fetVar, (i2 >> 3) & 14, 0, 130040);
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(Separators.COLON, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, 6, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, (byte) 1);
        }
    }

    public static final void k(final c5a0 c5a0Var, final c5a0 c5a0Var2, final w6n w6nVar, fet fetVar) {
        final byte b = 0;
        ugd ugdVarM = u1c.M(-2021736552, new Function2() { // from class: a.um80
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                cl5 cl5Var = ukd.f35823a;
                jm40 jm40Var = jm40.b;
                w6n w6nVar2 = w6nVar;
                c5a0 c5a0Var3 = c5a0Var;
                fet fetVar2 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (b2) {
                    case 0:
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            u6n u6nVarB = m2x.B(c5a0Var3.f3761a, w6nVar2, fetVar2);
                            mm40 mm40VarK0 = mrv.k0(jm40Var, "LOGO");
                            boolean zG = fetVar2.g(u6nVarB);
                            Object objP = fetVar2.P();
                            if (zG || objP == cl5Var) {
                                objP = new m2m(u6nVarB, (byte) 1);
                                fetVar2.o0(objP);
                            }
                            kkb.p(0, fetVar2, mm40VarK0, (Function0) objP);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            u6n u6nVarB2 = m2x.B(c5a0Var3.f3761a, w6nVar2, fetVar2);
                            mm40 mm40VarK1 = mrv.k0(jm40Var, "LOGO");
                            boolean zG2 = fetVar2.g(u6nVarB2);
                            Object objP2 = fetVar2.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new m2m(u6nVarB2, (byte) 1);
                                fetVar2.o0(objP2);
                            }
                            kkb.p(0, fetVar2, mm40VarK1, (Function0) objP2);
                        } else {
                            fetVar2.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar);
        jm40 jm40Var = jm40.b;
        m2x.d(jm40Var, ugdVarM, null, fetVar, 48, 4);
        final byte b2 = 1;
        m2x.d(jm40Var, u1c.M(-2086577087, new Function2() { // from class: a.um80
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                cl5 cl5Var = ukd.f35823a;
                jm40 jm40Var2 = jm40.b;
                w6n w6nVar2 = w6nVar;
                c5a0 c5a0Var3 = c5a0Var2;
                fet fetVar2 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (b3) {
                    case 0:
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            u6n u6nVarB = m2x.B(c5a0Var3.f3761a, w6nVar2, fetVar2);
                            mm40 mm40VarK0 = mrv.k0(jm40Var2, "LOGO");
                            boolean zG = fetVar2.g(u6nVarB);
                            Object objP = fetVar2.P();
                            if (zG || objP == cl5Var) {
                                objP = new m2m(u6nVarB, (byte) 1);
                                fetVar2.o0(objP);
                            }
                            kkb.p(0, fetVar2, mm40VarK0, (Function0) objP);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            u6n u6nVarB2 = m2x.B(c5a0Var3.f3761a, w6nVar2, fetVar2);
                            mm40 mm40VarK1 = mrv.k0(jm40Var2, "LOGO");
                            boolean zG2 = fetVar2.g(u6nVarB2);
                            Object objP2 = fetVar2.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new m2m(u6nVarB2, (byte) 1);
                                fetVar2.o0(objP2);
                            }
                            kkb.p(0, fetVar2, mm40VarK1, (Function0) objP2);
                        } else {
                            fetVar2.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), null, fetVar, 48, 4);
    }

    public static final void l(mm40 mm40Var, j4n j4nVar, fet fetVar, int i) {
        j4n j4nVar2 = j4nVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        xx7 xx7Var = gqw0.m;
        fetVar.g0(-1047603986);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(j4nVar2) ? 32 : 16);
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            mm40 mm40VarV = o7k0.v(mm40Var, gqw0.j, true);
            x5d x5dVarA = w5d.a(qw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarV);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar, shdVar2, fetVar);
            jpm0.o(fetVar, mm40VarC0, shdVar);
            fetVar.e0(-452033500);
            int i3 = 0;
            while (i3 < 5) {
                long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                ugg0 ugg0Var2 = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
                jm40 jm40Var = jm40.b;
                mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ugg0Var2);
                x5d x5dVarA2 = w5d.a(uc9.c, xx7Var, fetVar, 0);
                int i4 = i3;
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
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
                mm40 mm40VarP = o7k0.p(s5x0.K(jm40Var, 12.0f, 8.0f), 128.0f, 16.0f);
                zcl zclVar3 = qmk.f;
                zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarP), vbc.d0(null, fetVar, 0, 1)));
                j4nVar2 = j4nVar;
                agc.t(s5x0.N(jm40Var, 12.0f, 0.0f, 12.0f, 6.0f, 2), j4nVar2, ((Boolean) fetVar.k(kr00.f18743a)).booleanValue(), null, null, fetVar, i2 & 112, 24);
                fetVar.r(true);
                i3 = i4 + 1;
                pcyVar = pcyVar;
                shdVar = shdVar;
                z = false;
            }
            fetVar.r(z);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x6a0(mm40Var, j4nVar2, i);
        }
    }

    public static final void m(l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, fet fetVar, int i) {
        l7m0 l7m0Var3;
        int i2;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        l7m0Var2.getClass();
        function1.getClass();
        fetVar2.g0(35645724);
        if ((i & 6) == 0) {
            l7m0Var3 = l7m0Var;
            i2 = (fetVar2.g(l7m0Var3) ? 4 : 2) | i;
        } else {
            l7m0Var3 = l7m0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(l7m0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarX = yyw.X(i120.Q(jm40Var, backgroundContent, ljcVar), null, fetVar2, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarX);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            imm immVar = ((b9e0) l7m0Var3.getValue()).f2205a;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new evd0(function1, (byte) 17);
                fetVar2.o0(objP);
            }
            int i4 = i2;
            hlm.c(mm40VarD, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            fetVar2 = fetVar;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD2, 8.0f);
            fetVar2.e0(-1409420063);
            a4x a4xVar = ((i7e0) l7m0Var2.getValue()).b;
            ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                arrayList.add(new yvh0(rsm0.w(((h7e0) it.next()).b, 0, fetVar2), bwh0.f3325a));
            }
            fetVar2.r(false);
            a4x a4xVarO0 = dyb.o0(arrayList);
            boolean z2 = (i4 & 112) == 32;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new wda0(l7m0Var2, (byte) 19);
                fetVar2.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z3 = i3 == 256;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new dvd0(function1, (byte) 15);
                fetVar2.o0(objP3);
            }
            ibc.n(mm40VarJ, a4xVarO0, gxh0.f12078a, axh0.f1625a, false, function0, (Function1) objP3, fetVar2, 3456, 16);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new erv(l7m0Var, l7m0Var2, function1, i, (byte) 1);
        }
    }

    public static final void n(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(832907069);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar2.X();
        } else if (str == null) {
            fetVar2.e0(1108492005);
            fetVar2.r(false);
        } else {
            fetVar2.e0(1108492006);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40.b, 24.0f);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarS, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, (i2 >> 3) & 14, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, (byte) 2);
        }
    }

    public static final void o(String str, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1989817357);
        int i2 = i | (fetVar2.g(str) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40Var, 4.0f, 2.0f, 4.0f, 0.0f, 8), 52.0f);
            zfn zfnVar = zaq0.b;
            long backgroundGroup = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundGroup();
            zcl zclVar2 = qmk.f;
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40VarE, backgroundGroup, new ugg0(zclVar2, zclVar2, zclVar3, zclVar3));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(str, s5x0.J(o7k0.d(jm40Var, 1.0f), 16.0f), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 24, i, str);
        }
    }

    public static final void p(pzi0 pzi0Var, Function1 function1, fet fetVar, int i) {
        pzi0Var.getClass();
        function1.getClass();
        fetVar.g0(1379891274);
        int i2 = (fetVar.g(pzi0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 60.0f);
            String str = pzi0Var.f27848a;
            zfn zfnVar = zaq0.b;
            rqm rqmVar = new rqm((vui0) new uui0(str, new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), pzi0Var.b, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), null, 48), (pui0) new nui0(Integer.valueOf(R.drawable.ic_glyph_phone), null, new m0x(R.drawable.ic_glyph_phone, null, 6), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), null, null, 0.0f, 242), (pvi0) new evi0(pzi0Var.c, new y3d(ibc.Y(pzi0Var.d, fetVar))), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, Response.SERVER_TIMEOUT);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new x6h0(function1, pzi0Var, (byte) 16);
                fetVar.o0(objP);
            }
            obc.q(mm40VarE, rqmVar, false, null, null, null, (Function0) objP, null, fetVar, 0, 188);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) pzi0Var, function1, i, (byte) 16);
        }
    }

    public static final void q(y5d y5dVar, String str, fet fetVar, int i) {
        int i2;
        byte b;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(933841473);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(y5dVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            b = 0;
            fetVar2.X();
        } else if (str.length() > 0) {
            fetVar2.e0(1568246455);
            mm40 mm40VarA = y5dVar.a(jm40.b, gqw0.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarA, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.h(), fetVar, (i2 >> 3) & 14, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            b = 0;
            fetVar2.r(false);
        } else {
            b = 0;
            fetVar2.e0(1568717345);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z460(y5dVar, str, i, b);
        }
    }

    public static final x7x r(z7x z7xVar, float f, float f2, w7x w7xVar, String str, fet fetVar, int i, int i2) {
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        int i3 = i << 3;
        int i4 = (i & 1022) | (i3 & 57344) | (i3 & 458752);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = new x7x(z7xVar, fValueOf, fValueOf2, w7xVar);
            fetVar.o0(objP);
        }
        x7x x7xVar = (x7x) objP;
        boolean z = true;
        boolean z2 = ((((i4 & 112) ^ 48) > 32 && fetVar.i(fValueOf)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && fetVar.i(fValueOf2)) || (i4 & 384) == 256);
        if ((((57344 & i4) ^ 24576) <= 16384 || !fetVar.i(w7xVar)) && (i4 & 24576) != 16384) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objP2 = fetVar.P();
        if (z3 || objP2 == obj) {
            Object mr0Var = new mr0(fValueOf, x7xVar, fValueOf2, w7xVar, (byte) 17);
            fetVar.o0(mr0Var);
            objP2 = mr0Var;
        }
        m0x0.D((Function0) objP2, fetVar);
        boolean zI = fetVar.i(z7xVar);
        Object objP3 = fetVar.P();
        if (zI || objP3 == obj) {
            objP3 = new okw(z7xVar, x7xVar, (byte) 10);
            fetVar.o0(objP3);
        }
        m0x0.o(x7xVar, (Function1) objP3, fetVar);
        return x7xVar;
    }

    public static final void s(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((cfx) yfu0Var).b.b.f(((xl90) cpVar.u()).c.length() > 0);
        ((cfx) yfu0Var).b.setPhoneErrorText(((xl90) cpVar.u()).c);
    }

    public static final void t(cp cpVar) {
        if (((xl90) cpVar.u()).e.length() > 0) {
            ((cfx) cpVar.u).b.setPhoneMask(((xl90) cpVar.u()).e);
        }
    }

    public static final void u(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        if (Intrinsics.d(((cfx) yfu0Var).b.getPhone(), ((xl90) cpVar.u()).d)) {
            return;
        }
        ((cfx) yfu0Var).b.setPhoneText(((xl90) cpVar.u()).d);
    }

    public static final aqh v(int i, int i2, int i3, ctf0 ctf0Var) {
        return new aqh(ctf0Var.b.a(R.string.ufc_shot_map_value, Arrays.copyOf(new Object[]{String.valueOf(i), wzb.H0(Float.valueOf(si30.b((i3 <= 0 ? 0.0f : (i * 100.0f) / i3) * 10.0f) / 10.0f))}, 2)), i, i >= i2);
    }

    public static final a4x w(List list) {
        Object next;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Integer intOrNull = StringsKt.toIntOrNull(str);
            Iterator it2 = jfg0.d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                int i = ((jfg0) next).f16424a;
                if (intOrNull != null && i == intOrNull.intValue()) {
                    break;
                }
            }
            jfg0 jfg0Var = (jfg0) next;
            arrayList.add(new egm(str, jfg0Var != null ? jfg0Var.b : StaticColors.INSTANCE.m121getTransparent0d7_KjU()));
        }
        return dyb.o0(arrayList);
    }

    public static final a4x x(jup jupVar, ctf0 ctf0Var) {
        c0o c0oVar = gsj0.d;
        ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            gsj0 gsj0Var = (gsj0) y2Var.next();
            Integer numF0 = f0(jupVar, gsj0Var);
            int iIntValue = numF0 != null ? numF0.intValue() : 0;
            c0o c0oVar2 = gsj0.d;
            y2 y2VarH = ohs0.h(c0oVar2, c0oVar2);
            int iIntValue2 = 0;
            while (y2VarH.hasNext()) {
                Integer numF1 = f0(jupVar, (gsj0) y2VarH.next());
                iIntValue2 += numF1 != null ? numF1.intValue() : 0;
            }
            float f = iIntValue2 <= 0 ? 0.0f : (iIntValue * 100.0f) / iIntValue2;
            arrayList.add(new xoh(gsj0Var.b, ctf0Var.b.a(gsj0Var.f11833a, Arrays.copyOf(new Object[0], 0)), "\u200e".concat(ctf0Var.b.a(R.string.ufc_shot_map_value, Arrays.copyOf(new Object[]{String.valueOf(iIntValue), wzb.H0(Float.valueOf(si30.b(f * 10.0f) / 10.0f))}, 2))), si30.b(f)));
        }
        return dyb.o0(arrayList);
    }

    public static final void y(View view) {
        view.getClass();
        egi0 egi0VarA = igi0.a((Function2) phu0.M(view).b);
        while (egi0VarA.hasNext()) {
            ArrayList arrayList = J((View) egi0VarA.next()).f45046a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((tgu0) arrayList.get(size)).f33932a.e();
                }
            }
        }
    }

    public static final float z(Context context, float f) {
        context.getClass();
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    @Override // a.c8k0
    public float a(View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }

    @Override // a.c8k0
    public final float b(View view, ViewGroup viewGroup) {
        switch (this.f2162a) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }
}
