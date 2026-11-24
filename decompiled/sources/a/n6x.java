package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.collection.MutableIntList;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.limits_africa.api.domain.LimitGroupEnum;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n6x {
    public static int A(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static final LimitGroupEnum B(trz trzVar) {
        if (trzVar instanceof he7) {
            return LimitGroupEnum.f46745a;
        }
        if (trzVar instanceof q7k) {
            return LimitGroupEnum.b;
        }
        return trzVar instanceof miq0 ? LimitGroupEnum.c : LimitGroupEnum.d;
    }

    public static final int C(pk80 pk80Var) {
        return (int) (pk80Var.e == ma80.f21447a ? pk80Var.h() & 4294967295L : pk80Var.h() >> 32);
    }

    public static final boolean D(List list, vr20 vr20Var, long j) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ru6 ru6Var = (ru6) it.next();
            if (G(vr20Var, j, ru6Var.d, ru6Var.h, ru6Var.g, ru6Var.f)) {
                return true;
            }
        }
        return false;
    }

    public static final void E(jo20 jo20Var, List list) {
        Boolean bool;
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof v1q) {
                arrayListU.add(obj);
            }
        }
        v1q v1qVar = (v1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        Integer numValueOf = (v1qVar == null || (bool = v1qVar.b) == null) ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
        if (numValueOf != null) {
            jo20Var.put("IsPoliticallyExposedPerson", ncy.b(numValueOf));
        }
    }

    public static final void F(kxq kxqVar, wdk0 wdk0Var, String str, String str2, String str3) {
        wdk0Var.getClass();
        try {
            kxqVar.getPackageManager().getPackageInfo(str2, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            str3 = "";
        }
        i0(kxqVar, wdk0Var, str, str2, str3);
    }

    public static final boolean G(vr20 vr20Var, long j, long j2, long j3, long j4, double d) {
        return j2 == j && j3 == vr20Var.b && j4 == vr20Var.m.f30476a && d == vr20Var.f;
    }

    public static final void H(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof m1q) {
                arrayListU.add(obj);
            }
        }
        m1q m1qVar = (m1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        String str = m1qVar != null ? m1qVar.f21020a : null;
        if (str == null || str.length() == 0) {
            return;
        }
        jo20Var.put("MediaSourceId", ncy.c(str));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    public static final void I(jo20 jo20Var, List list) {
        String strValueOf;
        boolean z;
        Boolean bool;
        Boolean bool2;
        String strValueOf2;
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof f1q) {
                arrayListU.add(obj);
            }
        }
        f1q f1qVar = (f1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof o1q) {
                arrayList.add(obj2);
            }
        }
        o1q o1qVar = (o1q) ((j2q) CollectionsKt.firstOrNull(arrayList));
        String strValueOf3 = null;
        if (f1qVar != null) {
            boolean z2 = f1qVar.c;
            if (z2) {
                bool2 = Boolean.FALSE;
            } else {
                if (z2) {
                    t9f.b();
                    return;
                }
                bool2 = null;
            }
            if (bool2 != null && (strValueOf2 = String.valueOf(bool2.booleanValue() ? 1 : 0)) != null) {
                strValueOf3 = strValueOf2;
            } else if (f1qVar != null) {
                strValueOf3 = String.valueOf(f1qVar.b ? 1 : 0);
            } else {
                if (o1qVar == null) {
                    strValueOf = null;
                } else {
                    z = o1qVar.c;
                    if (z) {
                        bool = Boolean.FALSE;
                    } else {
                        if (!z) {
                            t9f.b();
                            return;
                        }
                        bool = null;
                    }
                    if (bool != null) {
                        strValueOf = String.valueOf(bool.booleanValue() ? 1 : 0);
                    } else {
                        strValueOf = null;
                    }
                }
                if (strValueOf == null) {
                    strValueOf3 = strValueOf;
                } else if (o1qVar != null) {
                    strValueOf3 = String.valueOf(o1qVar.b ? 1 : 0);
                }
            }
        } else if (f1qVar != null) {
            strValueOf3 = String.valueOf(f1qVar.b ? 1 : 0);
        } else {
            if (o1qVar == null) {
                strValueOf = null;
            } else {
                z = o1qVar.c;
                if (z) {
                    bool = Boolean.FALSE;
                } else {
                    if (!z) {
                        t9f.b();
                        return;
                    }
                    bool = null;
                }
                if (bool != null) {
                    strValueOf = String.valueOf(bool.booleanValue() ? 1 : 0);
                } else {
                    strValueOf = null;
                }
            }
            if (strValueOf == null) {
                strValueOf3 = strValueOf;
            } else if (o1qVar != null) {
                strValueOf3 = String.valueOf(o1qVar.b ? 1 : 0);
            }
        }
        if (strValueOf3 != null) {
            jo20Var.put("NotifyNewsCall", ncy.c(strValueOf3));
        }
    }

    public static final jiy J(sgy sgyVar, List list, Function0 function0) {
        jiy zw3Var;
        to20 to20Var;
        list.getClass();
        tre0 tre0Var = sre0.f32672a;
        if (sgyVar.equals(tre0Var.b(Collection.class)) || sgyVar.equals(tre0Var.b(List.class)) || sgyVar.equals(tre0Var.b(List.class)) || sgyVar.equals(tre0Var.b(ArrayList.class))) {
            zw3Var = new zw3((jiy) list.get(0), (byte) 0);
        } else if (sgyVar.equals(tre0Var.b(HashSet.class))) {
            zw3Var = new zw3((jiy) list.get(0), (byte) 1);
        } else if (sgyVar.equals(tre0Var.b(Set.class)) || sgyVar.equals(tre0Var.b(Set.class)) || sgyVar.equals(tre0Var.b(LinkedHashSet.class))) {
            zw3Var = new zw3((jiy) list.get(0), (byte) 2);
        } else if (sgyVar.equals(tre0Var.b(HashMap.class))) {
            zw3Var = new inv((jiy) list.get(0), (jiy) list.get(1), (byte) 0);
        } else if (sgyVar.equals(tre0Var.b(Map.class)) || sgyVar.equals(tre0Var.b(Map.class)) || sgyVar.equals(tre0Var.b(LinkedHashMap.class))) {
            zw3Var = new inv((jiy) list.get(0), (jiy) list.get(1), (byte) 1);
        } else {
            if (sgyVar.equals(tre0Var.b(Map.Entry.class))) {
                jiy jiyVar = (jiy) list.get(0);
                jiy jiyVar2 = (jiy) list.get(1);
                jiyVar.getClass();
                jiyVar2.getClass();
                to20Var = new to20(jiyVar, jiyVar2, (byte) 0);
            } else if (sgyVar.equals(tre0Var.b(Pair.class))) {
                jiy jiyVar3 = (jiy) list.get(0);
                jiy jiyVar4 = (jiy) list.get(1);
                jiyVar3.getClass();
                jiyVar4.getClass();
                to20Var = new to20(jiyVar3, jiyVar4, (byte) 1);
            } else if (sgyVar.equals(tre0Var.b(prs0.class))) {
                jiy jiyVar5 = (jiy) list.get(0);
                jiy jiyVar6 = (jiy) list.get(1);
                jiy jiyVar7 = (jiy) list.get(2);
                jiyVar5.getClass();
                jiyVar6.getClass();
                jiyVar7.getClass();
                zw3Var = new qrs0(jiyVar5, jiyVar6, jiyVar7);
            } else if (azw.G(sgyVar).isArray()) {
                Object objInvoke = function0.invoke();
                objInvoke.getClass();
                zw3Var = mrv.k((sgy) objInvoke, (jiy) list.get(0));
            } else {
                zw3Var = null;
            }
            zw3Var = to20Var;
        }
        if (zw3Var != null) {
            return zw3Var;
        }
        jiy[] jiyVarArr = (jiy[]) list.toArray(new jiy[0]);
        jiy[] jiyVarArr2 = (jiy[]) Arrays.copyOf(jiyVarArr, jiyVarArr.length);
        return gfx.B(azw.G(sgyVar), (jiy[]) Arrays.copyOf(jiyVarArr2, jiyVarArr2.length));
    }

    public static final void K(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof r1q) {
                arrayListU.add(obj);
            }
        }
        r1q r1qVar = (r1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        String str = r1qVar != null ? r1qVar.b : null;
        if (str == null || str.length() == 0) {
            return;
        }
        jo20Var.put("PassportNumber", ncy.c(str));
    }

    public static final void L(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof w1q) {
                arrayListU.add(obj);
            }
        }
        w1q w1qVar = (w1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        String str = w1qVar != null ? w1qVar.b : null;
        if (str == null || str.length() == 0) {
            return;
        }
        jo20Var.put("Postcode", ncy.c(str));
    }

    public static final void M(jo20 jo20Var, List list, boolean z, String str) {
        list.getClass();
        if (z && !StringsKt.W(str)) {
            jo20Var.put("PromoCode", ncy.c(""));
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof x1q) {
                arrayList.add(obj);
            }
        }
        x1q x1qVar = (x1q) ((j2q) CollectionsKt.firstOrNull(arrayList));
        String str2 = x1qVar != null ? x1qVar.b : null;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        jo20Var.put("PromoCode", ncy.c(str2));
    }

    public static final void N(jo20 jo20Var, cne0 cne0Var) {
        cne0Var.getClass();
        String str = cne0Var.b;
        String str2 = cne0Var.f4650a;
        if (str.length() > 0) {
            jo20Var.put("PostBack", ncy.c(str));
        }
        if (str2.length() > 0) {
            jo20Var.put("ReferralLink", ncy.c(str2));
        }
        if (str2.length() > 0) {
            jo20Var.put("RefGuid", ncy.c(str2));
        }
        String str3 = cne0Var.c;
        str3.getClass();
        if (str3.length() > 0) {
            jo20Var.put("QTag", ncy.c(str3));
        }
    }

    public static final void O(jo20 jo20Var, q7f0 q7f0Var) {
        jo20Var.put("RegType", ncy.b(Integer.valueOf(q7f0Var.f28247a)));
    }

    public static final void P(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof y1q) {
                arrayListU.add(obj);
            }
        }
        y1q y1qVar = (y1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        Integer numValueOf = y1qVar != null ? Integer.valueOf(y1qVar.b) : null;
        if (numValueOf != null) {
            jo20Var.put("RegionId", ncy.b(numValueOf));
        }
    }

    public static TypedValue Q(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean R(Context context, int i, boolean z) {
        return S(context.getTheme(), i, z);
    }

    public static boolean S(Resources.Theme theme, int i, boolean z) {
        TypedValue typedValueQ = Q(theme, i);
        if (typedValueQ == null || typedValueQ.type != 18) {
            return z;
        }
        return typedValueQ.data != 0;
    }

    public static int T(Context context, int i, int i2) {
        TypedValue typedValueQ = Q(context.getTheme(), i);
        return (typedValueQ == null || typedValueQ.type != 16) ? i2 : typedValueQ.data;
    }

    public static TypedValue U(Context context, int i, String str) {
        TypedValue typedValueQ = Q(context.getTheme(), i);
        if (typedValueQ != null) {
            return typedValueQ;
        }
        jf4.l("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return null;
    }

    public static TypedValue V(View view, int i) {
        return U(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static final void W(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof a2q) {
                arrayListU.add(obj);
            }
        }
        a2q a2qVar = (a2q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        if (a2qVar != null) {
            jo20Var.put("RulesConfirmation", ncy.b(Integer.valueOf(a2qVar.b ? 1 : 0)));
        }
    }

    public static final void X(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof b2q) {
                arrayListU.add(obj);
            }
        }
        b2q b2qVar = (b2q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        if (b2qVar != null) {
            jo20Var.put("RulesConfirmationAll", ncy.b(Integer.valueOf(b2qVar.b ? 1 : 0)));
        }
    }

    public static int Y(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final void Z(jo20 jo20Var, List list) {
        String strValueOf;
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof f1q) {
                arrayListU.add(obj);
            }
        }
        f1q f1qVar = (f1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        if (f1qVar == null || (strValueOf = String.valueOf(f1qVar.b ? 1 : 0)) == null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof d2q) {
                    arrayList.add(obj2);
                }
            }
            d2q d2qVar = (d2q) ((j2q) CollectionsKt.firstOrNull(arrayList));
            strValueOf = d2qVar != null ? String.valueOf(d2qVar.b ? 1 : 0) : null;
        }
        if (strValueOf != null) {
            jo20Var.put("SendEmailBet", ncy.c(strValueOf));
        }
    }

    public static final void a(mm40 mm40Var, hp00 hp00Var, fet fetVar, int i) {
        fetVar.g0(-1843204756);
        int i2 = i | (fetVar.g(hp00Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            String str = hp00Var.f13419a;
            pge pgeVar = gqw0.A;
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            k7x.b(str, null, mm40Var, new i4d(staticColors.m123getWhite0d7_KjU()), new i4d(staticColors.m123getWhite0d7_KjU()), null, null, null, null, null, pgeVar, null, fetVar, 37296, 6, 31712);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(mm40Var, hp00Var, i, (byte) 23);
        }
    }

    public static final void a0(jo20 jo20Var, List list) {
        String strValueOf;
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof f1q) {
                arrayListU.add(obj);
            }
        }
        f1q f1qVar = (f1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        if (f1qVar == null || (strValueOf = String.valueOf(f1qVar.b ? 1 : 0)) == null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof e2q) {
                    arrayList.add(obj2);
                }
            }
            e2q e2qVar = (e2q) ((j2q) CollectionsKt.firstOrNull(arrayList));
            strValueOf = e2qVar != null ? String.valueOf(e2qVar.b ? 1 : 0) : null;
        }
        if (strValueOf != null) {
            jo20Var.put("SendEmailEvents", ncy.c(strValueOf));
        }
    }

    public static final void b(s3e s3eVar, s3e s3eVar2, float f, boolean z, boolean z2, boolean z3, mm40 mm40Var, pz40 pz40Var, nie0 nie0Var, lwf lwfVar, ugd ugdVar, fet fetVar, int i) {
        int i2;
        ugd ugdVar2;
        fetVar.g0(-657259923);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(s3eVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(s3eVar2) ? 32 : 16;
        }
        int i3 = i2 | (fetVar.g(null) ? 256 : 128) | (fetVar.d(f) ? 2048 : 1024) | (fetVar.e(257) ? 131072 : 65536) | (fetVar.h(z) ? 1048576 : 524288) | (fetVar.h(z2) ? 8388608 : 4194304) | (fetVar.h(z3) ? 67108864 : 33554432);
        if ((i & 805306368) == 0) {
            i3 |= fetVar.g(mm40Var) ? 536870912 : 268435456;
        }
        char c = 128;
        int i4 = (fetVar.i(nie0Var) ? ' ' : (char) 16) | 3142;
        if (fetVar.i(lwfVar)) {
            c = 256;
        }
        int i5 = i4 | c;
        if ((306783379 & i3) == 306783378 && (i5 & 1171) == 1170 && fetVar.D()) {
            fetVar.X();
            ugdVar2 = ugdVar;
        } else {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.a(f);
                fetVar.o0(objP);
            }
            agk0 agk0Var = (agk0) objP;
            Object objP2 = fetVar.P();
            Object obj2 = objP2;
            if (objP2 == obj) {
                jie0 jie0Var = new jie0();
                jie0Var.f16571a = f;
                fetVar.o0(jie0Var);
                obj2 = jie0Var;
            }
            jie0 jie0Var2 = (jie0) obj2;
            if (jie0Var2.f16571a != f) {
                jie0Var2.f16571a = f;
                agk0Var.m(f);
            }
            mms0 mms0Var = mms0.b;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.c(0L);
                fetVar.o0(objP3);
            }
            ((egk0) objP3).l();
            h(agk0Var, fetVar, 48);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            k6z k6zVar = (k6z) fetVar.k(bmd.n);
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = new ot40(w6kVar);
                fetVar.o0(objP4);
            }
            ot40 ot40Var = (ot40) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = new nt40();
                fetVar.o0(objP5);
            }
            nt40 nt40Var = (nt40) objP5;
            boolean z4 = ((i3 & 896) == 256) | ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objP6 = fetVar.P();
            if (z4 || objP6 == obj) {
                float fL = agk0Var.l();
                l4e l4eVar = ot40Var.f2731a;
                fms0 fms0Var = ot40Var.i;
                fms0Var.b.clear();
                ot40Var.d.clear();
                f7m0 f7m0Var = ot40Var.e;
                f7m0Var.b = !(k6zVar == k6z.b);
                iun iunVar = iun.f15405a;
                s3eVar.b(f7m0Var, iunVar);
                f7m0Var.a(l4eVar);
                fms0Var.f(l4eVar, 0);
                s3eVar.b(f7m0Var, iunVar);
                s3eVar2.getClass();
                f7m0Var.a(l4eVar);
                fms0Var.f(l4eVar, 1);
                fms0Var.b(0, fL, 0);
                mms0Var.getClass();
                try {
                    xsm0.q(mms0Var.f22058a, fms0Var);
                } catch (ch9 e) {
                    Log.e("CML", "Error parsing JSON " + e);
                }
                objP6 = Boolean.TRUE;
                fetVar.o0(objP6);
            }
            ((Boolean) objP6).getClass();
            fetVar.e0(-487863565);
            lwfVar.getClass();
            fetVar.r(false);
            dt40 dt40Var = new dt40(pz40Var, ot40Var, s3eVar, s3eVar2, mms0Var, agk0Var, nie0Var, lwfVar);
            ot40Var.getClass();
            float f2 = ot40Var.h;
            fetVar.e0(-487805395);
            boolean z5 = Build.VERSION.SDK_INT >= 30 && e7.j((View) fetVar.k(dy2.f));
            fetVar.r(false);
            boolean z6 = z5 ? true : z;
            mm40 mm40VarX = !Float.isNaN(f2) ? r8x.X(mm40Var, f2, f2) : mm40Var;
            if (z6 || z3 || z2) {
                mm40VarX = rq8.K(mm40VarX, new ct40(ot40Var, z6, z2, z3));
            }
            mm40 mm40VarO = kbc.O(mm40VarX, new is40(ot40Var, mms0.b, agk0Var));
            boolean zI = fetVar.i(ot40Var);
            Object objP7 = fetVar.P();
            if (zI || objP7 == obj) {
                objP7 = new s43(ot40Var, (byte) 14);
                fetVar.o0(objP7);
            }
            ugdVar2 = ugdVar;
            l7x.s(pai0.a(mm40VarO, false, (Function1) objP7), u1c.M(1008059664, new hs40(ugdVar2, nt40Var, (byte) 1), fetVar), dt40Var, fetVar, 48);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new at40(s3eVar, s3eVar2, f, z, z2, z3, mm40Var, pz40Var, nie0Var, lwfVar, ugdVar2, i);
        }
    }

    public static final jiy b0(kiy kiyVar) {
        kiyVar.getClass();
        qaj qajVar = qhi0.f28741a;
        qajVar.getClass();
        jiy jiyVarC0 = c0(qajVar, kiyVar, true);
        if (jiyVarC0 != null) {
            return jiyVarC0;
        }
        v4i0.n(j2e.Q(j2e.P(kiyVar)));
        return null;
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        mm40 mm40Var2;
        fetVar.g0(781817203);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.e(R.drawable.ic_sip_phone_back) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            j0x.b(iom0.r(jpm0.t(R.drawable.ic_sip_phone_back, (i2 & 112) | 6, fetVar), fetVar), null, mm40Var2, null, null, 0.0f, null, fetVar2, 56 | ((i2 << 6) & 896), 120);
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var2, i, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e3 A[RETURN] */
    public static final jiy c0(qaj qajVar, kiy kiyVar, boolean z) {
        jiy jiyVarA;
        jiy jiyVarD;
        uua0 uua0Var;
        sgy sgyVarP = j2e.P(kiyVar);
        boolean zH = kiyVar.h();
        List<KTypeProjection> listM = kiyVar.M();
        ArrayList arrayList = new ArrayList(r3d.q(listM, 10));
        for (KTypeProjection kTypeProjection : listM) {
            kTypeProjection.getClass();
            kiy kiyVar2 = kTypeProjection.b;
            if (kiyVar2 == null) {
                hny.v(kiyVar2, "Star projections in type arguments are not allowed, but had ");
                return null;
            }
            arrayList.add(kiyVar2);
        }
        if (arrayList.isEmpty()) {
            if (!azw.G(sgyVarP).isInterface() || qajVar.d(sgyVarP, iun.f15405a) == null) {
                nhi0 nhi0Var = ohi0.f25266a;
                if (zH) {
                    jiyVarA = ohi0.b.a(sgyVarP);
                } else {
                    jiyVarA = ohi0.f25266a.a(sgyVarP);
                    if (jiyVarA == null) {
                        jiyVarA = null;
                    }
                }
            } else {
                jiyVarA = null;
            }
        } else if (qajVar.f28396a) {
            jiyVarA = null;
        } else {
            nhi0 nhi0Var2 = ohi0.f25266a;
            Object objH = !zH ? ohi0.c.h(sgyVarP, arrayList) : ohi0.d.h(sgyVarP, arrayList);
            e0g0 e0g0Var = j0g0.b;
            if (objH instanceof g0g0) {
                objH = null;
            }
            jiyVarA = (jiy) objH;
        }
        if (jiyVarA != null) {
            return jiyVarA;
        }
        if (arrayList.isEmpty()) {
            jiyVarD = d0(sgyVarP);
            if (jiyVarD == null && (jiyVarD = qajVar.d(sgyVarP, iun.f15405a)) == null) {
                if (azw.G(sgyVarP).isInterface()) {
                    uua0Var = new uua0(sgyVarP);
                    jiyVarD = uua0Var;
                } else {
                    jiyVarD = null;
                }
            }
            if (jiyVarD != null) {
                if (zH) {
                    return mrv.j0(jiyVarD);
                }
                return jiyVarD;
            }
        } else {
            ArrayList arrayListE0 = e0(qajVar, arrayList, z);
            if (arrayListE0 != null) {
                jiy jiyVarJ = J(sgyVarP, arrayListE0, new l82(arrayList, (byte) 2));
                if (jiyVarJ == null) {
                    jiyVarD = qajVar.d(sgyVarP, arrayListE0);
                    if (jiyVarD == null) {
                        if (azw.G(sgyVarP).isInterface()) {
                            uua0Var = new uua0(sgyVarP);
                            jiyVarD = uua0Var;
                        } else {
                            jiyVarD = null;
                        }
                    }
                } else {
                    jiyVarD = jiyVarJ;
                }
                if (jiyVarD != null) {
                    if (zH) {
                        return mrv.j0(jiyVarD);
                    }
                    return jiyVarD;
                }
            }
        }
        return null;
    }

    public static final void d(mm40 mm40Var, pz40 pz40Var, xdr xdrVar, ugd ugdVar, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        yfe0 yfe0VarU;
        dg90 dg90Var;
        fetVar.g0(124026311);
        byte b = 2;
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
                    dg90Var = new dg90(mm40Var, pz40Var, xdrVar, ugdVar, i, (byte) 2);
                }
            } else {
                mm40Var2 = mm40Var;
                boolean z = fetVar.k(bmd.n) == k6z.f17794a;
                xcz xczVarA = ddz.a(q3d.i((List) pz40Var.getValue()), 0, fetVar, 0, 2);
                kie0 kie0Var = new kie0();
                Object[] objArr = new Object[0];
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (objP == obj) {
                    objP = new i280((byte) 29);
                    fetVar.o0(objP);
                }
                kie0Var.f18333a = ((Number) e9x.Q(objArr, (Function0) objP, fetVar, 48)).intValue();
                Object objP2 = fetVar.P();
                if (objP2 == obj) {
                    objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                    fetVar.o0(objP2);
                }
                pz40 pz40Var2 = (pz40) objP2;
                Object objP3 = fetVar.P();
                if (objP3 == obj) {
                    objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                    fetVar.o0(objP3);
                }
                pz40 pz40Var3 = (pz40) objP3;
                Object objP4 = fetVar.P();
                if (objP4 == obj) {
                    objP4 = new mg90();
                    fetVar.o0(objP4);
                }
                mg90 mg90Var = (mg90) objP4;
                yje yjeVar = null;
                m0x0.t(fetVar, xczVarA, new o690(xczVarA, kie0Var, yjeVar, b));
                boolean zG = fetVar.g(xczVarA);
                Object objP5 = fetVar.P();
                if (zG || objP5 == obj) {
                    objP5 = new rf30(xczVarA, pz40Var2, pz40Var3, yjeVar, (byte) 7);
                    fetVar.o0(objP5);
                }
                m0x0.t(fetVar, xczVarA, (Function2) objP5);
                boolean zG2 = fetVar.g(xczVarA) | fetVar.i(mg90Var);
                Object objP6 = fetVar.P();
                byte b2 = 3;
                if (zG2 || objP6 == obj) {
                    objP6 = new o690(xczVarA, mg90Var, yjeVar, b2);
                    fetVar.o0(objP6);
                }
                m0x0.t(fetVar, xczVarA, (Function2) objP6);
                sjj sjjVarA = wzk0.a(fetVar);
                boolean zG3 = fetVar.g(sjjVarA);
                Object objP7 = fetVar.P();
                if (zG3 || objP7 == obj) {
                    objP7 = new iuj(sjjVarA);
                    fetVar.o0(objP7);
                }
                iuj iujVar = (iuj) objP7;
                boolean zG4 = fetVar.g(iujVar);
                Object objP8 = fetVar.P();
                if (zG4 || objP8 == obj) {
                    objP8 = new lg90(mg90Var, iujVar);
                    fetVar.o0(objP8);
                }
                lg90 lg90Var = (lg90) objP8;
                boolean zG5 = fetVar.g(xczVarA);
                Object objP9 = fetVar.P();
                if (zG5 || objP9 == obj) {
                    objP9 = new pg90(mg90Var, z, pz40Var3, pz40Var2);
                    fetVar.o0(objP9);
                }
                mm40 mm40VarV = cjx.V(mm40Var2, (pg90) objP9, null);
                zcl zclVar = qmk.f28987a;
                qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
                Object objP10 = fetVar.P();
                if (z2 || objP10 == obj) {
                    objP10 = new eg90(pz40Var, xdrVar, ugdVar, (byte) 3);
                    fetVar.o0(objP10);
                }
                b8k0.f(mm40VarV, xczVarA, null, false, qw3Var, null, lg90Var, false, null, (Function1) objP10, fetVar, 100663296, 172);
            }
            yfe0VarU.d = dg90Var;
        }
        mm40Var2 = mm40Var;
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            dg90Var = new dg90(mm40Var2, pz40Var, xdrVar, ugdVar, i, (byte) 6);
            yfe0VarU.d = dg90Var;
        }
    }

    public static final jiy d0(sgy sgyVar) {
        jiy jiyVarB = gfx.B(azw.G(sgyVar), (jiy[]) Arrays.copyOf(new jiy[0], 0));
        return jiyVarB == null ? (jiy) kwb0.f18994a.get(sgyVar) : jiyVarB;
    }

    public static final void e(mm40 mm40Var, aec0 aec0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        zfn zfnVar;
        int i3;
        fet fetVar2;
        pcy pcyVar;
        fet fetVar3 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        aec0Var.getClass();
        String str = aec0Var.f;
        int i4 = aec0Var.b;
        int i5 = aec0Var.c;
        function1.getClass();
        fetVar3.g0(-1159091130);
        int i6 = i | 6 | (fetVar3.g(aec0Var) ? 32 : 16) | (fetVar3.i(function1) ? 256 : 128);
        if (fetVar3.U(i6 & 1, (i6 & 147) != 146)) {
            zfn zfnVar2 = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar3.k(zfnVar2)).getTextPrimary();
            long primary = ((ThemeColors) fetVar3.k(zfnVar2)).getPrimary();
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar3.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            long jO = obc.O(i5, fetVar3);
            boolean zE = fetVar3.e(i4) | fetVar3.e(i5) | fetVar3.g(aec0Var.e) | fetVar3.g(str) | fetVar3.f(jO) | fetVar3.f(textPrimary) | fetVar3.f(primary);
            Object objP = fetVar3.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                i2 = i6;
                zfnVar = zfnVar2;
                i3 = 0;
                fetVar2 = fetVar;
                objP = new rqm((vui0) new uui0(aec0Var.e, new y3d(textPrimary), str, new y3d(primary), null, 48), (pui0) new nui0(Integer.valueOf(i4), null, new m0x(i4, null, 6), new y3d(jM123getWhite0d7_KjU), null, new pc5(new y3d(jO)), 0.0f, 210), (pvi0) new dvi0(new m0x(R.drawable.data_copy_icon, null, 6), new y3d(primary), 0), (d4d) null, (tvi0) qvi0.f29388a, wui0.f39793a, false, (e900) null, Response.REQUEST_TIMEOUT);
                fetVar2.o0(objP);
            } else {
                i2 = i6;
                zfnVar = zfnVar2;
                i3 = 0;
                fetVar2 = fetVar;
            }
            rqm rqmVar = (rqm) objP;
            jm40 jm40Var = jm40.b;
            float f = 1.0f;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(mm40VarD, vgg0.a(16.0f)), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, i3);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC0, shdVar);
            int i7 = i2;
            boolean z2 = ((i7 & 896) == 256) | ((i7 & 112) == 32);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new gvb0(function1, aec0Var, (byte) 9);
                fetVar2.o0(objP2);
            }
            shd shdVar5 = shdVar;
            obc.q(null, rqmVar, false, null, null, null, (Function0) objP2, null, fetVar, 384, ModuleDescriptor.MODULE_VERSION);
            mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
            fetVar3 = fetVar;
            mm40 mm40VarM = s5x0.M(o7k0.d(jm40Var, 1.0f), 12.0f, 8.0f, 12.0f, 12.0f);
            boolean z3 = true;
            boolean z4 = false;
            x5d x5dVarA2 = w5d.a(new qw3(6.0f, true, new jf4((byte) 14)), xx7Var, fetVar3, 0);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarM);
            fetVar3.i0();
            if (fetVar3.S) {
                pcyVar = pcyVar2;
                fetVar3.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar3.r0();
            }
            shd shdVar6 = shdVar4;
            jpm0.o(fetVar3, x5dVarA2, shdVar6);
            shd shdVar7 = shdVar3;
            jpm0.o(fetVar3, bh90VarM2, shdVar7);
            shd shdVar8 = shdVar2;
            vqd.u(iHashCode2, fetVar3, shdVar8, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar5);
            fetVar3.e0(-1341710633);
            for (zdc0 zdc0Var : aec0Var.g) {
                mm40 mm40VarD2 = o7k0.d(jm40Var, f);
                thg0 thg0VarA = shg0.a(uc9.g, gqw0.j, fetVar3, 6);
                int iHashCode3 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM3 = fetVar3.m();
                mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarD2);
                mkd.c0.getClass();
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(pcyVar);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, thg0VarA, shdVar6);
                jpm0.o(fetVar3, bh90VarM3, shdVar7);
                vqd.u(iHashCode3, fetVar3, shdVar8, fetVar3);
                jpm0.o(fetVar3, mm40VarC2, shdVar5);
                String str2 = zdc0Var.f44206a;
                shd shdVar9 = shdVar7;
                x7z x7zVar = new x7z(f, z4);
                y9q0 y9q0VarG = g1t0.g();
                zfn zfnVar3 = zaq0.b;
                v8q0.a(str2, x7zVar, ((ThemeColors) fetVar3.k(zfnVar3)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarG, fetVar, 0, 24960, 110584);
                v8q0.a(zdc0Var.b, yyw.U(jm40Var, 0.67f), ((ThemeColors) fetVar.k(zfnVar3)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
                fetVar3 = fetVar;
                fetVar3.r(true);
                z3 = true;
                shdVar8 = shdVar8;
                shdVar5 = shdVar5;
                shdVar7 = shdVar9;
                shdVar6 = shdVar6;
                pcyVar = pcyVar;
                f = 1.0f;
                z4 = false;
            }
            boolean z5 = z3;
            ohs0.x(fetVar3, z4, z5, z5);
            mm40Var2 = jm40Var;
        } else {
            fetVar3.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var2, aec0Var, function1, i, (byte) 3);
        }
    }

    public static final ArrayList e0(qaj qajVar, List list, boolean z) {
        qajVar.getClass();
        if (!z) {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kiy kiyVar = (kiy) it.next();
                kiyVar.getClass();
                jiy jiyVarC0 = c0(qajVar, kiyVar, false);
                if (jiyVarC0 == null) {
                    return null;
                }
                arrayList.add(jiyVarC0);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            kiy kiyVar2 = (kiy) it2.next();
            kiyVar2.getClass();
            jiy jiyVarC1 = c0(qajVar, kiyVar2, true);
            if (jiyVarC1 == null) {
                v4i0.n(j2e.Q(j2e.P(kiyVar2)));
                return null;
            }
            arrayList2.add(jiyVarC1);
        }
        return arrayList2;
    }

    public static final void f(mm40 mm40Var, qrj0 qrj0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        qrj0 qrj0Var2 = qrj0Var;
        fet fetVar2 = fetVar;
        qrj0Var2.getClass();
        fetVar2.g0(-622757230);
        int i2 = i | 6 | (fetVar2.g(qrj0Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarW, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 4.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN2);
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
            String str = qrj0Var2.b;
            y9q0 y9q0VarH = g1t0.h();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarH, fetVar, 0, 0, 131066);
            qrj0Var2 = qrj0Var;
            v8q0.a(qrj0Var.f29213a, s5x0.L(new x7z(1.0f, true), 8.0f, 0.0f, 2), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 109560);
            v8q0.a(qrj0Var2.c, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.h(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
            x8x.c(o7k0.e(o7k0.d(mm40Var2, 1.0f), 4.0f), qrj0Var2.d, qrj0Var2.e, fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) mm40Var2, (Object) qrj0Var2, i, (byte) 23);
        }
    }

    public static final void f0(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof g2q) {
                arrayListU.add(obj);
            }
        }
        g2q g2qVar = (g2q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        if (g2qVar != null) {
            jo20Var.put("Sex", ncy.b(Integer.valueOf(g2qVar.b)));
        }
    }

    public static final void g(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        a4xVar.getClass();
        fetVar.g0(1325829075);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ife(a4xVar, (byte) 6);
                fetVar.o0(objP);
            }
            kwj kwjVarB = zk80.b(0, (Function0) objP, fetVar, 0, 3);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
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
            mm40 mm40VarO = ny9.O(1.5f, o7k0.d(jm40.b, 1.0f), false);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            q5x.e(kwjVarB, i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarO), ((StaticColors) fetVar.k(m8m0.f21378a)).m76getBlack700d7_KjU(), jd8.n), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(164861500, new ftl(a4xVar, b), fetVar), fetVar, 0, 24576, 16380);
            if (a4xVar.size() > 1) {
                fetVar.e0(225279177);
                wkw wkwVar = new wkw(gqw0.n);
                smm smmVar = smm.b;
                pz40 pz40Var = s6t0.f31722a;
                n1i.a(wkwVar, kwjVarB, smmVar, new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU()), fetVar, 384, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(225552101);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i, (byte) 20);
        }
    }

    public static final void g0(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof h2q) {
                arrayListU.add(obj);
            }
        }
        h2q h2qVar = (h2q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        if (h2qVar != null) {
            jo20Var.put("SharePersonalDataConfirmation", ncy.b(Integer.valueOf(h2qVar.b ? 1 : 0)));
        }
    }

    public static final void h(agk0 agk0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1501096015);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(agk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(null) : fetVar.i(null) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !fetVar.D()) {
            yfe0 yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new bt40(agk0Var, i, (byte) 0);
                return;
            }
            return;
        }
        fetVar.X();
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new bt40(agk0Var, i, (byte) 1);
        }
    }

    public static final void h0(kxq kxqVar, wdk0 wdk0Var) {
        rek0 rek0Var = rek0.b;
        String string = kxqVar.getString(R.string.social_app_not_found_v2, "GooglePlay");
        string.getClass();
        wdk0.j(wdk0Var, new xdk0(rek0Var, string, null, null, null, null, 124), kxqVar, null, null, false, false, null, 124);
    }

    public static final void i(MutableIntList mutableIntList, int i) {
        if (mutableIntList.b == 0 || !(mutableIntList.c(0) == i || mutableIntList.c(mutableIntList.b - 1) == i)) {
            int i2 = mutableIntList.b;
            mutableIntList.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iC = mutableIntList.c(i3);
                if (i <= iC) {
                    break;
                }
                mutableIntList.f(i2, iC);
                i2 = i3;
            }
            mutableIntList.f(i2, i);
        }
    }

    public static final void i0(kxq kxqVar, wdk0 wdk0Var, String str, String str2, String str3) {
        wdk0Var.getClass();
        str.getClass();
        str3.getClass();
        try {
            kxqVar.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str3)));
        } catch (Exception unused) {
            rek0 rek0Var = rek0.b;
            String string = kxqVar.getString(R.string.social_app_not_found_v2, str);
            string.getClass();
            jtv jtvVar = jtv.x;
            String string2 = kxqVar.getString(R.string.install);
            string2.getClass();
            wdk0.j(wdk0Var, new xdk0(rek0Var, string, null, new hdk0(string2, new g8l(kxqVar, str2, wdk0Var, (byte) 19)), jtvVar, null, 100), kxqVar, null, null, false, false, null, 124);
        }
    }

    public static final void j(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof y0q) {
                arrayListU.add(obj);
            }
        }
        y0q y0qVar = (y0q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        String str = y0qVar != null ? y0qVar.b : null;
        if (str == null || str.length() == 0) {
            return;
        }
        jo20Var.put("Address", ncy.c(str));
    }

    public static final void j0(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof c2q) {
                arrayListU.add(obj);
            }
        }
        c2q c2qVar = (c2q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        String str = c2qVar != null ? c2qVar.b : null;
        if (str == null || str.length() == 0) {
            return;
        }
        jo20Var.put("SurnameTwo", ncy.c(str));
    }

    public static final List k(long j, long j2, List list) {
        if (j != 40) {
            return CollectionsKt.N(list);
        }
        List listN = CollectionsKt.N(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN) {
            switch (((Number) obj).intValue()) {
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    if (j2 == 2 || j2 == 1 || j2 == 46) {
                        arrayList.add(obj);
                    }
                    break;
                case 15:
                    if (j2 == 46) {
                        arrayList.add(obj);
                    }
                    break;
                case 16:
                    if (j2 == 1) {
                        arrayList.add(obj);
                    }
                    break;
                case 17:
                    if (j2 == 2) {
                        arrayList.add(obj);
                    }
                    break;
                default:
                    arrayList.add(obj);
                    break;
            }
        }
        return arrayList;
    }

    public static final int k0(MutableIntList mutableIntList) {
        int iC;
        int i = mutableIntList.b;
        int iC2 = mutableIntList.c(0);
        while (mutableIntList.b != 0 && mutableIntList.c(0) == iC2) {
            mutableIntList.f(0, mutableIntList.d());
            mutableIntList.e(mutableIntList.b - 1);
            int i2 = mutableIntList.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iC3 = mutableIntList.c(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iC4 = mutableIntList.c(i6);
                if (i5 < i2 && (iC = mutableIntList.c(i5)) > iC4) {
                    if (iC <= iC3) {
                        break;
                    }
                    mutableIntList.f(i4, iC);
                    mutableIntList.f(i5, iC3);
                    i4 = i5;
                } else {
                    if (iC4 <= iC3) {
                        break;
                    }
                    mutableIntList.f(i4, iC4);
                    mutableIntList.f(i6, iC3);
                    i4 = i6;
                }
            }
        }
        return iC2;
    }

    public static final void l(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof a1q) {
                arrayListU.add(obj);
            }
        }
        a1q a1qVar = (a1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        String str = a1qVar != null ? a1qVar.f84a : null;
        if (str == null || str.length() == 0) {
            return;
        }
        jo20Var.put("AppsflyerId", ncy.c(str));
    }

    public static final void l0(jo20 jo20Var) {
        int offset = TimeZone.getDefault().getOffset(new Date().getTime());
        long j = offset;
        double d = j / 3600000;
        double d2 = ((j / 60000) - (60.0d * d)) / 100.0d;
        jo20Var.put("TimeZone", ncy.c(String.valueOf(offset < 0 ? d - Math.abs(d2) : d + d2)));
    }

    public static final boolean m(kiy kiyVar, kiy kiyVar2) {
        kiyVar.getClass();
        kiyVar2.getClass();
        return d7x.E(kiyVar, kiyVar2) && d7x.E(kiyVar2, kiyVar);
    }

    public static int[] m0(Collection collection) {
        if (collection instanceof snx) {
            snx snxVar = (snx) collection;
            return Arrays.copyOfRange(snxVar.f32515a, snxVar.b, snxVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static float n(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    public static final knb n0(List list, List list2, boolean z) {
        ?? arrayList;
        Long l;
        List list3;
        Object next;
        String str;
        Iterator it;
        cu10 cu10Var;
        rbb rbbVar;
        ArrayList arrayList2;
        pgb pgbVar;
        zps zpsVar;
        long jLongValue;
        Long l2;
        Long l3;
        Long l4;
        ArrayList arrayListU = twn.u(list2);
        Iterator it2 = list.iterator();
        while (true) {
            int i = 10;
            if (!it2.hasNext()) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    du10 du10Var = (du10) it3.next();
                    cu10 cu10Var2 = du10Var.c;
                    long jLongValue2 = (cu10Var2 == null || (l = cu10Var2.f4967a) == null) ? 0L : l.longValue();
                    List list4 = du10Var.d;
                    if (list4 != null) {
                        arrayList = new ArrayList(r3d.q(list4, 10));
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            arrayList.add(n2x.O((ej00) it4.next(), jLongValue2));
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = iun.f15405a;
                    }
                    w3d.u(arrayList3, arrayList);
                }
                return new knb(arrayListU, arrayList3);
            }
            du10 du10Var2 = (du10) it2.next();
            List<wt10> list5 = du10Var2.f6680a;
            cu10 cu10Var3 = du10Var2.c;
            if (list5 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (wt10 wt10Var : list5) {
                    Long l5 = cu10Var3 != null ? cu10Var3.f4967a : null;
                    Iterator it5 = list2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it5.next();
                        long j = ((ril0) next).f30549a;
                        if (l5 != null && j == l5.longValue()) {
                            break;
                        }
                    }
                    ril0 ril0Var = (ril0) next;
                    if (ril0Var == null || (str = ril0Var.b) == null) {
                        str = "-";
                    }
                    String str2 = str;
                    List list6 = wt10Var.e;
                    Long l6 = wt10Var.f39717a;
                    if (list6 == null || list6.isEmpty()) {
                        it = it2;
                        cu10Var = cu10Var3;
                        rbbVar = null;
                    } else {
                        if (l6 == null) {
                            jf4.k(null);
                            return null;
                        }
                        long jLongValue3 = l6.longValue();
                        long jLongValue4 = (cu10Var3 == null || (l4 = cu10Var3.f4967a) == null) ? 0L : l4.longValue();
                        String str3 = wt10Var.b;
                        if (str3 == null) {
                            str3 = "";
                        }
                        int iLongValue = (int) l6.longValue();
                        String str4 = wt10Var.c;
                        String str5 = str4 == null ? "" : str4;
                        Integer num = wt10Var.d;
                        long jIntValue = num != null ? num.intValue() : 0L;
                        List<zt10> list7 = wt10Var.e;
                        ArrayList arrayList5 = new ArrayList(r3d.q(list7, i));
                        for (zt10 zt10Var : list7) {
                            long jLongValue5 = (cu10Var3 == null || (l3 = cu10Var3.f4967a) == null) ? 0L : l3.longValue();
                            List list8 = zt10Var.l;
                            Long l7 = zt10Var.k;
                            Long l8 = zt10Var.f44934a;
                            String str6 = zt10Var.b;
                            if (list8 != null) {
                                arrayList2 = new ArrayList(r3d.q(list8, i));
                                Iterator it6 = list8.iterator();
                                while (it6.hasNext()) {
                                    zps zpsVar2 = (zps) it6.next();
                                    Long l9 = zpsVar2.f44775a;
                                    if (l9 == null) {
                                        jf4.k(null);
                                        return null;
                                    }
                                    long jLongValue6 = l9.longValue();
                                    long jLongValue7 = (cu10Var3 == null || (l2 = cu10Var3.f4967a) == null) ? 0L : l2.longValue();
                                    ArrayList arrayList6 = arrayList5;
                                    zt10 zt10Var2 = zt10Var;
                                    String str7 = str6 == null ? str2 : str6;
                                    long jLongValue8 = l8 != null ? l8.longValue() : 0L;
                                    if (l7 != null) {
                                        zpsVar = zpsVar2;
                                        jLongValue = l7.longValue();
                                    } else {
                                        zpsVar = zpsVar2;
                                        jLongValue = 0;
                                    }
                                    arrayList2.add(obc.V(zpsVar, jLongValue6, z, jLongValue7, str2, str7, jLongValue8, jLongValue));
                                    arrayList5 = arrayList6;
                                    zt10Var = zt10Var2;
                                    iLongValue = iLongValue;
                                    it6 = it6;
                                    l7 = l7;
                                    cu10Var3 = cu10Var3;
                                }
                            } else {
                                arrayList2 = null;
                            }
                            cu10 cu10Var4 = cu10Var3;
                            int i2 = iLongValue;
                            ArrayList arrayList7 = arrayList5;
                            zt10 zt10Var3 = zt10Var;
                            Long l10 = l7;
                            List list9 = arrayList2;
                            if (arrayList2 == null) {
                                list9 = iun.f15405a;
                            }
                            List list10 = list9;
                            long jLongValue9 = l8 != null ? l8.longValue() : 0L;
                            Long l11 = zt10Var3.m;
                            long jLongValue10 = l11 != null ? l11.longValue() : 0L;
                            String str8 = str6 == null ? "" : str6;
                            Integer num2 = zt10Var3.h;
                            long jIntValue2 = num2 != null ? num2.intValue() : 0L;
                            String str9 = zt10Var3.c;
                            String str10 = str9 == null ? "" : str9;
                            String str11 = zt10Var3.e;
                            String str12 = str11 == null ? "" : str11;
                            Integer num3 = zt10Var3.f;
                            int iIntValue = num3 != null ? num3.intValue() : 0;
                            int iLongValue2 = l10 != null ? (int) l10.longValue() : 0;
                            Boolean bool = zt10Var3.i;
                            if (bool != null ? bool.booleanValue() : false) {
                                pgbVar = pgb.c;
                            } else {
                                Boolean bool2 = zt10Var3.j;
                                pgbVar = bool2 != null ? bool2.booleanValue() : false ? pgb.b : pgb.f26945a;
                            }
                            arrayList7.add(new sum0(jLongValue9, jLongValue10, str8, jIntValue2, str10, str12, iLongValue2, iIntValue, jLongValue5, list10, pgbVar));
                            arrayList5 = arrayList7;
                            iLongValue = i2;
                            it2 = it2;
                            cu10Var3 = cu10Var4;
                            i = 10;
                        }
                        it = it2;
                        cu10Var = cu10Var3;
                        rbbVar = new rbb(jLongValue3, 0L, str3, arrayList5, str2, jIntValue, null, str5, 0, iLongValue, z, jLongValue4, null, null, 117570);
                    }
                    if (rbbVar != null) {
                        arrayList4.add(rbbVar);
                    }
                    it2 = it;
                    cu10Var3 = cu10Var;
                    i = 10;
                }
                list3 = arrayList4;
            } else {
                list3 = null;
            }
            Iterator it7 = it2;
            if (list3 == null) {
                list3 = iun.f15405a;
            }
            w3d.u(arrayListU, list3);
            it2 = it7;
        }
    }

    public static List o(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new snx(0, iArr.length, iArr);
    }

    public static final i5a0 o0(d280 d280Var, long j, List list, boolean z, bap bapVar) {
        list.getClass();
        if (z) {
            return new d5a0(d280Var);
        }
        boolean z2 = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (j == ((xcp) it.next()).b.a()) {
                    z2 = true;
                    break;
                }
            }
        }
        return new z4a0(d280Var, j, z2, bapVar);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0256 A[PHI: r1
  0x0256: PHI (r1v23 java.lang.Object) = (r1v21 java.lang.Object), (r1v24 java.lang.Object) binds: [B:83:0x0254, B:79:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0261  */
    /* JADX WARN: Code duplicated, block: B:91:0x026a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0271  */
    /* JADX WARN: Code duplicated, block: B:98:0x0283 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0285  */
    public static final mm40 p(e6x e6xVar, int i, l7m0 l7m0Var, fet fetVar, int i2) {
        Object objJ;
        Object objJ2;
        Object obj;
        boolean z;
        Object obj2;
        boolean zG;
        Object objP;
        fetVar.e0(-207647192);
        boolean zIsEmpty = ((List) l7m0Var.getValue()).isEmpty();
        jm40 jm40Var = jm40.b;
        byte b = 0;
        if (zIsEmpty) {
            fetVar.r(false);
            return jm40Var;
        }
        byte b2 = 2;
        oms0 oms0VarZ = phu0.Z(Integer.valueOf(i), null, fetVar, (i2 >> 6) & 14, 2);
        p4 p4Var = oms0VarZ.f25519a;
        lxs0 lxs0Var = hp4.l;
        boolean zH = oms0VarZ.h();
        Object obj3 = ukd.f35823a;
        if (zH) {
            objJ = vqd.j(fetVar, 1666827533, false, p4Var);
        } else {
            fetVar.e0(1666573488);
            boolean zG2 = fetVar.g(oms0VarZ);
            objJ = fetVar.P();
            if (zG2 || objJ == obj3) {
                rfk0 rfk0VarJ = vdx.J();
                Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                try {
                    Object objY0 = p4Var.y0();
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    fetVar.o0(objY0);
                    objJ = objY0;
                } catch (Throwable th) {
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    throw th;
                }
            }
            fetVar.r(false);
        }
        int iIntValue = ((Number) objJ).intValue();
        fetVar.e0(1347167664);
        if (iIntValue > q3d.i((List) l7m0Var.getValue())) {
            iIntValue = q3d.i((List) l7m0Var.getValue());
        } else if (iIntValue < 0) {
            iIntValue = 0;
        }
        ycl yclVarG = dw9.g(fetVar, false, ((ovx) ((List) l7m0Var.getValue()).get(iIntValue)).f25946a);
        boolean zG3 = fetVar.g(oms0VarZ);
        Object objP2 = fetVar.P();
        if (zG3 || objP2 == obj3) {
            objP2 = jgk0.b(new elb(oms0VarZ, (byte) 28));
            fetVar.o0(objP2);
        }
        int iIntValue2 = ((Number) ((l7m0) objP2).getValue()).intValue();
        fetVar.e0(1347167664);
        if (iIntValue2 > q3d.i((List) l7m0Var.getValue())) {
            iIntValue2 = q3d.i((List) l7m0Var.getValue());
        } else if (iIntValue2 < 0) {
            iIntValue2 = 0;
        }
        ycl yclVarG2 = dw9.g(fetVar, false, ((ovx) ((List) l7m0Var.getValue()).get(iIntValue2)).f25946a);
        boolean zG4 = fetVar.g(oms0VarZ);
        Object objP3 = fetVar.P();
        if (zG4 || objP3 == obj3) {
            objP3 = jgk0.b(new m6x(oms0VarZ, b));
            fetVar.o0(objP3);
        }
        ((ams0) ((l7m0) objP3).getValue()).getClass();
        fetVar.e0(-923448950);
        zsf zsfVar = ihn.b;
        uts0 uts0VarM0 = ro4.m0(Response.OK, 0, zsfVar, 2);
        fetVar.r(false);
        Object objE = phu0.E(oms0VarZ, yclVarG, yclVarG2, uts0VarM0, lxs0Var, fetVar, 0);
        if (oms0VarZ.h()) {
            objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
        } else {
            fetVar.e0(1666573488);
            boolean zG5 = fetVar.g(oms0VarZ);
            objJ2 = fetVar.P();
            if (zG5 || objJ2 == obj3) {
                rfk0 rfk0VarJ2 = vdx.J();
                Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                try {
                    Object objY1 = p4Var.y0();
                    vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                    fetVar.o0(objY1);
                    objJ2 = objY1;
                } catch (Throwable th2) {
                    vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                    throw th2;
                }
            }
            fetVar.r(false);
        }
        int iIntValue3 = ((Number) objJ2).intValue();
        fetVar.e0(1332267845);
        if (iIntValue3 > q3d.i((List) l7m0Var.getValue())) {
            iIntValue3 = q3d.i((List) l7m0Var.getValue());
        } else if (iIntValue3 < 0) {
            iIntValue3 = 0;
        }
        ycl yclVarG3 = dw9.g(fetVar, false, ((ovx) ((List) l7m0Var.getValue()).get(iIntValue3)).b);
        boolean zG6 = fetVar.g(oms0VarZ);
        Object objP4 = fetVar.P();
        if (zG6 || objP4 == obj3) {
            objP4 = jgk0.b(new m6x(oms0VarZ, b2));
            fetVar.o0(objP4);
        }
        int iIntValue4 = ((Number) ((l7m0) objP4).getValue()).intValue();
        fetVar.e0(1332267845);
        if (iIntValue4 > q3d.i((List) l7m0Var.getValue())) {
            iIntValue4 = q3d.i((List) l7m0Var.getValue());
        } else if (iIntValue4 < 0) {
            iIntValue4 = 0;
        }
        ycl yclVarG4 = dw9.g(fetVar, false, ((ovx) ((List) l7m0Var.getValue()).get(iIntValue4)).b);
        boolean zG7 = fetVar.g(oms0VarZ);
        Object objP5 = fetVar.P();
        if (zG7 || objP5 == obj3) {
            objP5 = jgk0.b(new m6x(oms0VarZ, (byte) 4));
            fetVar.o0(objP5);
        }
        ((ams0) ((l7m0) objP5).getValue()).getClass();
        fetVar.e0(427738155);
        uts0 uts0VarM1 = ro4.m0(Response.OK, 0, zsfVar, 2);
        fetVar.r(false);
        Object objE2 = phu0.E(oms0VarZ, yclVarG3, yclVarG4, uts0VarM1, lxs0Var, fetVar, 0);
        boolean z2 = true;
        if (((i2 & 112) ^ 48) > 32) {
            obj = e6xVar;
            if (fetVar.g(obj)) {
                z = true;
            }
            if (((i2 & 7168) ^ 3072) > 2048) {
                obj2 = l7m0Var;
                if (!fetVar.g(obj2)) {
                }
                zG = z2 | z | fetVar.g(objE) | fetVar.g(objE2);
                objP = fetVar.P();
                if (zG || objP == obj3) {
                    objP = new enm(obj, obj2, objE, objE2, (byte) 14);
                    fetVar.o0(objP);
                }
                mm40 mm40VarL = rq8.L(jm40Var, (Function1) objP);
                fetVar.r(false);
                return mm40VarL;
            }
            obj2 = l7m0Var;
            if ((i2 & 3072) != 2048) {
                z2 = false;
            }
            zG = z2 | z | fetVar.g(objE) | fetVar.g(objE2);
            objP = fetVar.P();
            if (zG) {
                objP = new enm(obj, obj2, objE, objE2, (byte) 14);
                fetVar.o0(objP);
            } else {
                objP = new enm(obj, obj2, objE, objE2, (byte) 14);
                fetVar.o0(objP);
            }
            mm40 mm40VarL2 = rq8.L(jm40Var, (Function1) objP);
            fetVar.r(false);
            return mm40VarL2;
        }
        obj = e6xVar;
        if ((i2 & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        if (((i2 & 7168) ^ 3072) > 2048) {
            obj2 = l7m0Var;
            if (!fetVar.g(obj2)) {
            }
            zG = z2 | z | fetVar.g(objE) | fetVar.g(objE2);
            objP = fetVar.P();
            if (zG) {
                objP = new enm(obj, obj2, objE, objE2, (byte) 14);
                fetVar.o0(objP);
            } else {
                objP = new enm(obj, obj2, objE, objE2, (byte) 14);
                fetVar.o0(objP);
            }
            mm40 mm40VarL3 = rq8.L(jm40Var, (Function1) objP);
            fetVar.r(false);
            return mm40VarL3;
        }
        obj2 = l7m0Var;
        if ((i2 & 3072) != 2048) {
            z2 = false;
        }
        zG = z2 | z | fetVar.g(objE) | fetVar.g(objE2);
        objP = fetVar.P();
        if (zG) {
            objP = new enm(obj, obj2, objE, objE2, (byte) 14);
            fetVar.o0(objP);
        } else {
            objP = new enm(obj, obj2, objE, objE2, (byte) 14);
            fetVar.o0(objP);
        }
        mm40 mm40VarL4 = rq8.L(jm40Var, (Function1) objP);
        fetVar.r(false);
        return mm40VarL4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    public static final mpa0 p0(qpa0 qpa0Var) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        ?? arrayList5;
        qpa0Var.getClass();
        String str = qpa0Var.f29107a;
        String str2 = str == null ? "" : str;
        String str3 = qpa0Var.b;
        String str4 = str3 == null ? "" : str3;
        String str5 = qpa0Var.c;
        String str6 = str5 == null ? "" : str5;
        List list = qpa0Var.d;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(x1x.Q((ooa) it.next()));
            }
        } else {
            arrayList = iun.f15405a;
        }
        ?? r6 = arrayList;
        List list2 = qpa0Var.e;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(x1x.Q((ooa) it2.next()));
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        ?? r7 = arrayList2;
        List list3 = qpa0Var.f;
        if (list3 != null) {
            arrayList3 = new ArrayList(r3d.q(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(x1x.Q((ooa) it3.next()));
            }
        } else {
            arrayList3 = iun.f15405a;
        }
        ?? r8 = arrayList3;
        List list4 = qpa0Var.g;
        if (list4 != null) {
            arrayList4 = new ArrayList(r3d.q(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(x1x.Q((ooa) it4.next()));
            }
        } else {
            arrayList4 = iun.f15405a;
        }
        ?? r9 = arrayList4;
        List list5 = qpa0Var.h;
        if (list5 != null) {
            arrayList5 = new ArrayList(r3d.q(list5, 10));
            Iterator it5 = list5.iterator();
            while (it5.hasNext()) {
                arrayList5.add(x1x.Q((ooa) it5.next()));
            }
        } else {
            arrayList5 = iun.f15405a;
        }
        return new mpa0(str2, str4, str6, r6, r7, r8, r9, arrayList5);
    }

    public static final void q(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof b1q) {
                arrayListU.add(obj);
            }
        }
        b1q b1qVar = (b1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        String str = b1qVar != null ? b1qVar.b : null;
        if (str == null || str.length() == 0) {
            return;
        }
        jo20Var.put("Birthday", ncy.c(str));
    }

    public static final k0e0 q0(t0e0 t0e0Var) {
        t0e0Var.getClass();
        Integer num = t0e0Var.f33115a;
        int iIntValue = num != null ? num.intValue() : -1;
        Long l = t0e0Var.b;
        long jLongValue = l != null ? l.longValue() : -1L;
        String str = t0e0Var.c;
        if (str == null) {
            str = "";
        }
        return new k0e0(iIntValue, jLongValue, str, lmc.E(t0e0Var.e));
    }

    public static final ad40 r(l7m0 l7m0Var, g2v g2vVar) {
        l7m0Var.getClass();
        return new ad40(l7m0Var, new oc40(new eb40(ozb.Q(1L, g2vVar)), lak0.c));
    }

    public static final wgh0 r0(bfo0 bfo0Var) {
        bfo0Var.getClass();
        int iOrdinal = bfo0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return wgh0.POPULAR_1X_GAMES;
            }
            if (iOrdinal == 2) {
                return wgh0.POPULAR_AGGREGATOR_GAMES;
            }
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    return wgh0.AGGREGATOR_BRANDS_GLOBAL_SEARCH;
                }
                t9f.b();
                return null;
            }
        }
        return wgh0.POPULAR_SPORT;
    }

    public static int s(long j) {
        int i = (int) j;
        x0x.x("Out of range: %s", j, ((long) i) == j);
        return i;
    }

    public static final nxl0 s0(wwl0 wwl0Var, int i, String str, ctf0 ctf0Var, long j) {
        str.getClass();
        ctf0Var.getClass();
        return new nxl0(wwl0Var.f39890a + BundleUtil.UNDERLINE_TAG + j, g1x.G(wwl0Var, i, str, ctf0Var));
    }

    public static final void t(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof e1q) {
                arrayListU.add(obj);
            }
        }
        e1q e1qVar = (e1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        Integer numValueOf = e1qVar != null ? Integer.valueOf(e1qVar.b) : null;
        if (numValueOf != null) {
            jo20Var.put("CityId", ncy.b(numValueOf));
        }
    }

    public static final j83 t0(uf50 uf50Var) {
        String str;
        String str2;
        uf50Var.getClass();
        String str3 = uf50Var.b().f;
        String strH = uf50Var.h();
        vg50 vg50VarD = uf50Var.d();
        String str4 = vg50VarD != null ? vg50VarD.f37366a : null;
        if (str4 == null) {
            str4 = "";
        }
        vg50 vg50VarD2 = uf50Var.d();
        String str5 = vg50VarD2 != null ? vg50VarD2.e : null;
        if (str5 == null) {
            str5 = "";
        }
        vg50 vg50VarD3 = uf50Var.d();
        String str6 = vg50VarD3 != null ? vg50VarD3.l : null;
        if (str6 == null) {
            str6 = "";
        }
        vg50 vg50VarD4 = uf50Var.d();
        String str7 = vg50VarD4 != null ? vg50VarD4.k : null;
        if (str7 == null) {
            String str8 = str6;
            str2 = "";
            str = str8;
        } else {
            str = str6;
            str2 = str7;
        }
        return d7x.z(str3, strH, str4, str5, str, str2);
    }

    public static final void u(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof g1q) {
                arrayListU.add(obj);
            }
        }
        g1q g1qVar = (g1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        Integer numValueOf = g1qVar != null ? Integer.valueOf(g1qVar.b) : null;
        if (numValueOf != null) {
            jo20Var.put("CountryId", ncy.b(numValueOf));
        }
    }

    public static final Serializable u0(kxq kxqVar, wdk0 wdk0Var, String str) {
        wdk0Var.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            if (kotlin.text.c.x(str, "tg:", false)) {
                String string = kxqVar.getString(R.string.social_telegram);
                string.getClass();
                i0(kxqVar, wdk0Var, string, "org.telegram.messenger", str);
                return Boolean.TRUE;
            }
            if (kotlin.text.c.x(str, "viber:", false)) {
                String string2 = kxqVar.getString(R.string.social_viber);
                string2.getClass();
                i0(kxqVar, wdk0Var, string2, "com.viber.voip&hl", str);
                return Boolean.TRUE;
            }
            if (kotlin.text.c.x(str, "fb:", false)) {
                String string3 = kxqVar.getString(R.string.social_facebook);
                string3.getClass();
                i0(kxqVar, wdk0Var, string3, "www.facebook.com/1xBet.info", str);
                return Boolean.TRUE;
            }
            if (kotlin.text.c.x(str, "tel:", false)) {
                Uri uri = Uri.parse(str);
                uri.getClass();
                kxqVar.startActivity(new Intent("android.intent.action.DIAL", uri));
                return Boolean.TRUE;
            }
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setData(Uri.parse(str));
            kxqVar.startActivity(intent);
            return Boolean.FALSE;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            return new g0g0(th);
        }
    }

    public static final void v(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof h1q) {
                arrayListU.add(obj);
            }
        }
        h1q h1qVar = (h1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        Integer numValueOf = h1qVar != null ? Integer.valueOf(h1qVar.b) : null;
        if (numValueOf != null) {
            jo20Var.put("CurrencyId", ncy.b(numValueOf));
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer v0(String str) {
        byte b;
        Long lValueOf;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt < 128) {
                    b = z710.f43896a[cCharAt];
                } else {
                    byte[] bArr = z710.f43896a;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j = -b;
                    while (true) {
                        if (i2 >= str.length()) {
                            if (i == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i3 = i2 + 1;
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 128) {
                            b2 = z710.f43896a[cCharAt2];
                        } else {
                            byte[] bArr2 = z710.f43896a;
                            b2 = -1;
                        }
                        if (b2 >= 0 && b2 < 10 && j >= -922337203685477580L) {
                            long j2 = j * 10;
                            long j3 = b2;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i2 = i3;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    public static SafeParcelable w(byte[] bArr, Parcelable.Creator creator) {
        s0x.H(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return safeParcelable;
    }

    public static final mm40 w0(g6x g6xVar, int i, l7m0 l7m0Var, fet fetVar, int i2) {
        Object objJ;
        Object objJ2;
        fetVar.e0(534360468);
        boolean zIsEmpty = ((List) l7m0Var.getValue()).isEmpty();
        jm40 jm40Var = jm40.b;
        if (zIsEmpty) {
            fetVar.r(false);
            return jm40Var;
        }
        byte b = 6;
        s4u0 s4u0VarR = iom0.r(jpm0.t(R.drawable.market_categories_indicator, 6, fetVar), fetVar);
        oms0 oms0VarZ = phu0.Z(Integer.valueOf(i), null, fetVar, (i2 >> 6) & 14, 2);
        p4 p4Var = oms0VarZ.f25519a;
        lxs0 lxs0Var = hp4.l;
        boolean zH = oms0VarZ.h();
        Object obj = ukd.f35823a;
        if (zH) {
            objJ = vqd.j(fetVar, 1666827533, false, p4Var);
        } else {
            fetVar.e0(1666573488);
            boolean zG = fetVar.g(oms0VarZ);
            objJ = fetVar.P();
            if (zG || objJ == obj) {
                rfk0 rfk0VarJ = vdx.J();
                Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                try {
                    Object objY0 = p4Var.y0();
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    fetVar.o0(objY0);
                    objJ = objY0;
                } catch (Throwable th) {
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    throw th;
                }
            }
            fetVar.r(false);
        }
        int iIntValue = ((Number) objJ).intValue();
        fetVar.e0(-1470723300);
        if (iIntValue > q3d.i((List) l7m0Var.getValue())) {
            iIntValue = q3d.i((List) l7m0Var.getValue());
        } else if (iIntValue < 0) {
            iIntValue = 0;
        }
        ycl yclVarG = dw9.g(fetVar, false, ((ovx) ((List) l7m0Var.getValue()).get(iIntValue)).f25946a + 4.0f);
        boolean zG2 = fetVar.g(oms0VarZ);
        Object objP = fetVar.P();
        if (zG2 || objP == obj) {
            objP = jgk0.b(new m6x(oms0VarZ, b));
            fetVar.o0(objP);
        }
        int iIntValue2 = ((Number) ((l7m0) objP).getValue()).intValue();
        fetVar.e0(-1470723300);
        if (iIntValue2 > q3d.i((List) l7m0Var.getValue())) {
            iIntValue2 = q3d.i((List) l7m0Var.getValue());
        } else if (iIntValue2 < 0) {
            iIntValue2 = 0;
        }
        ycl yclVarG2 = dw9.g(fetVar, false, ((ovx) ((List) l7m0Var.getValue()).get(iIntValue2)).f25946a + 4.0f);
        boolean zG3 = fetVar.g(oms0VarZ);
        Object objP2 = fetVar.P();
        if (zG3 || objP2 == obj) {
            objP2 = jgk0.b(new m6x(oms0VarZ, (byte) 8));
            fetVar.o0(objP2);
        }
        ((ams0) ((l7m0) objP2).getValue()).getClass();
        fetVar.e0(1825234294);
        zsf zsfVar = ihn.b;
        uts0 uts0VarM0 = ro4.m0(Response.OK, 0, zsfVar, 2);
        fetVar.r(false);
        cms0 cms0VarE = phu0.E(oms0VarZ, yclVarG, yclVarG2, uts0VarM0, lxs0Var, fetVar, 0);
        if (oms0VarZ.h()) {
            objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
        } else {
            fetVar.e0(1666573488);
            boolean zG4 = fetVar.g(oms0VarZ);
            objJ2 = fetVar.P();
            if (zG4 || objJ2 == obj) {
                rfk0 rfk0VarJ2 = vdx.J();
                Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                try {
                    Object objY1 = p4Var.y0();
                    vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                    fetVar.o0(objY1);
                    objJ2 = objY1;
                } catch (Throwable th2) {
                    vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                    throw th2;
                }
            }
            fetVar.r(false);
        }
        int iIntValue3 = ((Number) objJ2).intValue();
        fetVar.e0(-1944481295);
        if (iIntValue3 > q3d.i((List) l7m0Var.getValue())) {
            iIntValue3 = q3d.i((List) l7m0Var.getValue());
        } else if (iIntValue3 < 0) {
            iIntValue3 = 0;
        }
        ycl yclVarG3 = dw9.g(fetVar, false, ((ovx) ((List) l7m0Var.getValue()).get(iIntValue3)).b - 8.0f);
        boolean zG5 = fetVar.g(oms0VarZ);
        Object objP3 = fetVar.P();
        if (zG5 || objP3 == obj) {
            objP3 = jgk0.b(new m6x(oms0VarZ, (byte) 10));
            fetVar.o0(objP3);
        }
        int iIntValue4 = ((Number) ((l7m0) objP3).getValue()).intValue();
        fetVar.e0(-1944481295);
        if (iIntValue4 > q3d.i((List) l7m0Var.getValue())) {
            iIntValue4 = q3d.i((List) l7m0Var.getValue());
        } else if (iIntValue4 < 0) {
            iIntValue4 = 0;
        }
        ycl yclVarG4 = dw9.g(fetVar, false, ((ovx) ((List) l7m0Var.getValue()).get(iIntValue4)).b - 8.0f);
        boolean zG6 = fetVar.g(oms0VarZ);
        Object objP4 = fetVar.P();
        if (zG6 || objP4 == obj) {
            objP4 = jgk0.b(new m6x(oms0VarZ, (byte) 12));
            fetVar.o0(objP4);
        }
        ((ams0) ((l7m0) objP4).getValue()).getClass();
        fetVar.e0(-452686761);
        uts0 uts0VarM1 = ro4.m0(Response.OK, 0, zsfVar, 2);
        fetVar.r(false);
        cms0 cms0VarE2 = phu0.E(oms0VarZ, yclVarG3, yclVarG4, uts0VarM1, lxs0Var, fetVar, 0);
        boolean zI = fetVar.i(s4u0VarR) | fetVar.g(cms0VarE) | ((((i2 & 112) ^ 48) > 32 && fetVar.g(g6xVar)) || (i2 & 48) == 32) | fetVar.g(cms0VarE2);
        Object objP5 = fetVar.P();
        if (zI || objP5 == obj) {
            Object l6xVar = new l6x(s4u0VarR, cms0VarE, g6xVar, cms0VarE2, (byte) 0);
            fetVar.o0(l6xVar);
            objP5 = l6xVar;
        }
        mm40 mm40VarK = rq8.K(jm40Var, (Function1) objP5);
        fetVar.r(false);
        return mm40VarK;
    }

    public static final void x(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof j1q) {
                arrayListU.add(obj);
            }
        }
        j1q j1qVar = (j1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        String str = j1qVar != null ? j1qVar.b : null;
        if (str == null || str.length() == 0) {
            return;
        }
        jo20Var.put("Email", ncy.c(str));
    }

    public static final void x0(jo20 jo20Var, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof i1q) {
                arrayListU.add(obj);
            }
        }
        i1q i1qVar = (i1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        Integer numValueOf = i1qVar != null ? Integer.valueOf(i1qVar.b) : null;
        if (numValueOf != null) {
            jo20Var.put("VidDoc", ncy.b(numValueOf));
        }
    }

    public static final List y(String str, List list) {
        Object objPrevious;
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!Intrinsics.d(((igp0) objPrevious).f14745a.f35586a, str));
        igp0 igp0Var = (igp0) objPrevious;
        if (igp0Var != null) {
            return igp0Var.b;
        }
        return null;
    }

    public static final void z(jo20 jo20Var, List list, int i) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof c1q) {
                arrayListU.add(obj);
            }
        }
        c1q c1qVar = (c1q) ((j2q) CollectionsKt.firstOrNull(arrayListU));
        if (c1qVar != null) {
            i = c1qVar.b;
        }
        jo20Var.put("FirstBonusChoice", ncy.b(Integer.valueOf(i)));
    }
}
