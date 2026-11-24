package a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class x2x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f40191a = true;

    public static final void A(cp cpVar) {
        if (((goz) cpVar.u()).c.length() == 0) {
            return;
        }
        ((wvx) cpVar.u).c.setText(((goz) cpVar.u()).c);
    }

    public static final void B(cp cpVar) {
        Object objU = cpVar.u();
        yfu0 yfu0Var = cpVar.u;
        if (((goz) objU).c.length() > 0) {
            return;
        }
        wvx wvxVar = (wvx) yfu0Var;
        TextView textView = wvxVar.c;
        rdj rdjVar = rdj.f30294a;
        textView.setText(rdj.g(new znq0(((goz) cpVar.u()).d), efj.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar.w)), false, 56));
        wvxVar.f39860a.setEnabled(((goz) cpVar.u()).f11657a != LimitTypeEnum.SELF_EXCLUSION);
    }

    public static final void C(cp cpVar) {
        String str = ((goz) cpVar.u()).e;
        wvx wvxVar = (wvx) cpVar.u;
        wvxVar.d.setVisibility(str.length() == 0 ? 4 : 0);
        wvxVar.d.setText(str);
    }

    public static final void D(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((wvx) yfu0Var).b.setVisibility((((goz) cpVar.u()).f == 0 || ((goz) cpVar.u()).f11657a == LimitTypeEnum.SELF_EXCLUSION) ? 8 : 0);
        TextView textView = ((wvx) yfu0Var).b;
        Context context = cpVar.w;
        rdj rdjVar = rdj.f30294a;
        boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
        textView.setText(context.getString(R.string.limit_pending_info_v2, rdj.g(new znq0(((goz) cpVar.u()).f), efj.UNIVERSAL, Boolean.valueOf(zIs24HourFormat), false, 56)));
    }

    public static final wgi0 E(String str, ugi0[] ugi0VarArr, Function1 function1) {
        if (StringsKt.W(str)) {
            jf4.o("Blank serial names are prohibited");
            return null;
        }
        cmc cmcVar = new cmc(str);
        function1.invoke(cmcVar);
        return new wgi0(str, aum0.b, cmcVar.c.size(), tx3.g0(ugi0VarArr), cmcVar);
    }

    public static wgi0 F(String str, ugi0[] ugi0VarArr) {
        if (StringsKt.W(str)) {
            jf4.o("Blank serial names are prohibited");
            return null;
        }
        cmc cmcVar = new cmc(str);
        return new wgi0(str, aum0.b, cmcVar.c.size(), tx3.g0(ugi0VarArr), cmcVar);
    }

    public static final wgi0 G(String str, c3x c3xVar, ugi0[] ugi0VarArr, Function1 function1) {
        if (StringsKt.W(str)) {
            jf4.o("Blank serial names are prohibited");
            return null;
        }
        if (c3xVar.equals(aum0.b)) {
            jf4.o("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        cmc cmcVar = new cmc(str);
        function1.invoke(cmcVar);
        return new wgi0(str, c3xVar, cmcVar.c.size(), tx3.g0(ugi0VarArr), cmcVar);
    }

    public static wgi0 H(String str, c3x c3xVar, ugi0[] ugi0VarArr) {
        if (StringsKt.W(str)) {
            jf4.o("Blank serial names are prohibited");
            return null;
        }
        if (c3xVar.equals(aum0.b)) {
            jf4.o("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        cmc cmcVar = new cmc(str);
        return new wgi0(str, c3xVar, cmcVar.c.size(), tx3.g0(ugi0VarArr), cmcVar);
    }

    public static final boolean I(dpa0 dpa0Var) {
        return (dpa0Var.c() || dpa0Var.h || !dpa0Var.d) ? false : true;
    }

    public static final boolean J(dpa0 dpa0Var) {
        return !dpa0Var.h && dpa0Var.d;
    }

    public static final boolean K(dpa0 dpa0Var) {
        return (dpa0Var.c() || !dpa0Var.h || dpa0Var.d) ? false : true;
    }

    public static final boolean L(dpa0 dpa0Var) {
        return dpa0Var.h && !dpa0Var.d;
    }

    public static final void M(int i, int i2) {
        if (i == i2) {
            return;
        }
        jf4.o(ohs0.m("Class declares ", i, " type parameters, but ", " were provided.", i2));
    }

    public static v2 N(fhy fhyVar, List list, int i) {
        if ((i & 1) != 0) {
            list = iun.f15405a;
        }
        iun iunVar = iun.f15405a;
        fhyVar.getClass();
        list.getClass();
        iunVar.getClass();
        if (!aao0.f538a) {
            sgy sgyVar = fhyVar instanceof sgy ? (sgy) fhyVar : null;
            List listO = sgyVar != null ? y9a.O(sgyVar) : null;
            if (listO == null) {
                listO = iunVar;
            }
            M(listO.size(), list.size());
        }
        return P(fhyVar, list, false, iunVar, 8);
    }

    public static final v2 O(fhy fhyVar, List list, boolean z, List list2, sgy sgyVar) {
        foc focVarW;
        q4m0 q4m0Var;
        fhyVar.getClass();
        list.getClass();
        list2.getClass();
        if (!aao0.f538a) {
            return new iyj0(fhyVar, list, z, new obx(list2), null, false, false, false, sgyVar, null);
        }
        if (fhyVar instanceof xgy) {
            focVarW = ((xgy) fhyVar).W();
            if (sgyVar != null) {
                focVarW.getClass();
                swq swqVar = (swq) bay.k.get(oek.f(focVarW));
                if (swqVar == null) {
                    ohq.q(focVarW, " is not a read-only collection", "Given class ");
                    return null;
                }
                focVarW = rek.i(focVarW).c().j(swqVar);
            }
        } else {
            if (!(fhyVar instanceof niy)) {
                StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
                sb.append(fhyVar);
                Class<?> cls = fhyVar.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new poe(sb.toString());
            }
            niy niyVar = (niy) fhyVar;
            hzs0 hzs0Var = niyVar.f;
            if (hzs0Var == null) {
                udk.e(niyVar, "Descriptor-less type parameter: ");
                return null;
            }
            focVarW = hzs0Var;
        }
        M(focVarW.h().getParameters().size(), list.size());
        iys0 iys0VarH = focVarW.h();
        iys0VarH.getClass();
        List parameters = iys0VarH.getParameters();
        parameters.getClass();
        ays0.b.getClass();
        ays0 ays0Var = ays0.c;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj;
            wdk wdkVar = (wdk) kTypeProjection.b;
            wsy wsyVar = wdkVar != null ? wdkVar.b : null;
            uiy uiyVar = kTypeProjection.f46069a;
            int i3 = uiyVar == null ? -1 : ngy.f23506a[uiyVar.ordinal()];
            if (i3 == -1) {
                Object obj2 = parameters.get(i);
                obj2.getClass();
                q4m0Var = new q4m0((hzs0) obj2);
            } else if (i3 == 1) {
                t3u0 t3u0Var = t3u0.c;
                wsyVar.getClass();
                q4m0Var = new q4m0(wsyVar, t3u0Var);
            } else if (i3 == 2) {
                t3u0 t3u0Var2 = t3u0.d;
                wsyVar.getClass();
                q4m0Var = new q4m0(wsyVar, t3u0Var2);
            } else {
                if (i3 != 3) {
                    t9f.b();
                    return null;
                }
                t3u0 t3u0Var3 = t3u0.e;
                wsyVar.getClass();
                q4m0Var = new q4m0(wsyVar, t3u0Var3);
            }
            arrayList.add(q4m0Var);
            i = i2;
        }
        return new wdk(ucx.g0(ays0Var, iys0VarH, arrayList, z), null);
    }

    public static v2 P(fhy fhyVar, List list, boolean z, List list2, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list2 = iun.f15405a;
        }
        return O(fhyVar, list, z, list2, null);
    }

    public static final long R(Date date, boolean z) {
        date.getClass();
        if (!z) {
            return (((date.getTime() - 86400000) / 1000) / 60) * 60;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -2);
        long timeInMillis = (((calendar.getTimeInMillis() / 1000) + 59) / 60) * 60;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return Math.max(timeInMillis, ((calendar2.getTimeInMillis() / 1000) / 60) * 60);
    }

    public static final long S(Date date, boolean z) {
        long time;
        date.getClass();
        if (z) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
            time = calendar.getTimeInMillis() / 1000;
        } else {
            time = date.getTime() / 1000;
        }
        return ((time + 59) / 60) * 60;
    }

    public static final ArrayList T(Date date, boolean z) {
        date.getClass();
        long jR = R(date, z);
        long jS = S(date, z);
        ArrayList arrayList = new ArrayList();
        long j = jR;
        while (j < jS) {
            long jMin = Math.min(28800 + j, jS);
            arrayList.add(new Pair(Long.valueOf(j), Long.valueOf(jMin)));
            j = jMin;
        }
        if (!arrayList.isEmpty() && arrayList.size() > 1) {
            Pair pair = (Pair) CollectionsKt.d0(arrayList);
            long jLongValue = ((Number) pair.b).longValue() - ((Number) pair.f46059a).longValue();
            uen uenVar = wen.b;
            if (jLongValue <= wen.l(ibc.v0(1, bfn.MINUTES), bfn.SECONDS)) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.set(arrayList.size() - 1, new Pair(((Pair) CollectionsKt.d0(arrayList)).f46059a, pair.b));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new Pair(Long.valueOf(jR), Long.valueOf(jS)));
        }
        return arrayList;
    }

    public static Object U(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return f7.h(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }

    public static Serializable V(Intent intent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return f7.l(intent);
        }
        Serializable serializableExtra = intent.getSerializableExtra("com.yandex.authsdk.EXTRA_ERROR");
        if (d2w0.class.isInstance(serializableExtra)) {
            return serializableExtra;
        }
        return null;
    }

    public static final boolean W(bvd0 bvd0Var) {
        List list = bvd0Var.f3275a.i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            wud0 wud0Var = (wud0) obj;
            if (wud0Var.f39788a != -1 && wud0Var.b.length() > 0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        List list2 = bvd0Var.b.i;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            wud0 wud0Var2 = (wud0) obj2;
            if (wud0Var2.f39788a != -1 && wud0Var2.b.length() > 0) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2.isEmpty() && bvd0Var.c.c.isEmpty();
    }

    public static final boolean X(g0e0 g0e0Var) {
        g0e0Var.getClass();
        syd0 syd0Var = g0e0Var.g;
        ezd0 ezd0Var = syd0Var.f33020a;
        ezd0 ezd0Var2 = syd0Var.b;
        List list = syd0Var.f33020a.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((wyd0) obj).f39970a.length() > 0) {
                arrayList.add(obj);
            }
        }
        List list2 = ezd0Var2.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((wyd0) obj2).f39970a.length() > 0) {
                arrayList2.add(obj2);
            }
        }
        List list3 = ezd0Var.f;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list3) {
            if (((azd0) obj3).b.length() > 0) {
                arrayList3.add(obj3);
            }
        }
        List list4 = ezd0Var2.f;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list4) {
            if (((azd0) obj4).b.length() > 0) {
                arrayList4.add(obj4);
            }
        }
        List list5 = ezd0Var.e;
        ArrayList arrayList5 = new ArrayList(r3d.q(list5, 10));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList5.add(((wyd0) it.next()).f39970a);
        }
        List list6 = ezd0Var2.e;
        ArrayList arrayList6 = new ArrayList(r3d.q(list6, 10));
        Iterator it2 = list6.iterator();
        while (it2.hasNext()) {
            arrayList6.add(((wyd0) it2.next()).f39970a);
        }
        List list7 = ezd0Var.f;
        ArrayList arrayList7 = new ArrayList(r3d.q(list7, 10));
        Iterator it3 = list7.iterator();
        while (it3.hasNext()) {
            arrayList7.add(Integer.valueOf(((azd0) it3.next()).f1712a));
        }
        List list8 = ezd0Var2.f;
        ArrayList arrayList8 = new ArrayList(r3d.q(list8, 10));
        Iterator it4 = list8.iterator();
        while (it4.hasNext()) {
            arrayList8.add(Integer.valueOf(((azd0) it4.next()).f1712a));
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj5 : arrayList5) {
            if (arrayList6.contains((String) obj5)) {
                arrayList9.add(obj5);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        for (Object obj6 : arrayList7) {
            if (arrayList8.contains(Integer.valueOf(((Number) obj6).intValue()))) {
                arrayList10.add(obj6);
            }
        }
        return (arrayList.isEmpty() && arrayList2.isEmpty() && arrayList9.isEmpty() && arrayList3.isEmpty() && arrayList4.isEmpty() && arrayList10.isEmpty()) || g0e0Var.d.c.length() == 0 || g0e0Var.e.c.length() == 0;
    }

    public static final boolean Y(c110 c110Var, c110 c110Var2) {
        return c110Var.equals(new c110(-1, -1, -1.0f, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f)) && c110Var2.equals(new c110(-1, -1, -1.0f, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f));
    }

    public static final boolean Z(g0e0 g0e0Var) {
        g0e0Var.getClass();
        syd0 syd0Var = g0e0Var.g;
        iun iunVar = iun.f15405a;
        if (syd0Var.equals(new syd0(new ezd0(-1, -1, -1, -1, iunVar, iunVar), new ezd0(-1, -1, -1, -1, iunVar, iunVar)))) {
            return true;
        }
        ezd0 ezd0Var = syd0Var.f33020a;
        if (ezd0Var.f8668a != 0 || ezd0Var.b != 0 || ezd0Var.c != 0 || ezd0Var.d != 0) {
            return false;
        }
        ezd0 ezd0Var2 = syd0Var.b;
        return ezd0Var2.f8668a == 0 && ezd0Var2.b == 0 && ezd0Var2.c == 0 && ezd0Var2.d == 0;
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(-1947438639);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            v8q0.a(str2, mm40Var, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 0, 130040);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var, str2, i, (byte) 2);
        }
    }

    public static final boolean a0(oxd0 oxd0Var) {
        oxd0Var.getClass();
        List list = oxd0Var.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            pxd0 pxd0Var = (pxd0) obj;
            if (pxd0Var.f27749a.length() > 0 && pxd0Var.b.length() > 0 && !pxd0Var.e.equals(new qxd0(null, null, null, null, null))) {
                arrayList.add(obj);
            }
        }
        List list2 = oxd0Var.f;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            pxd0 pxd0Var2 = (pxd0) obj2;
            if (pxd0Var2.f27749a.length() > 0 && pxd0Var2.b.length() > 0 && !pxd0Var2.e.equals(new qxd0(null, null, null, null, null))) {
                arrayList2.add(obj2);
            }
        }
        return arrayList.isEmpty() || arrayList2.isEmpty() || CollectionsKt.q0(arrayList, arrayList2).size() != 10 || oxd0Var.f26007a.length() == 0 || oxd0Var.d.length() == 0;
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-2005560851);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new dg00(function1, (byte) 14);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dg00(function1, (byte) 15);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            Object[] objArr = new Object[0];
            int i4 = i2 & 112;
            boolean z3 = i4 == 32;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new x000(l7m0Var, (byte) 5);
                fetVar.o0(objP3);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP3, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z4 = i4 == 32;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new x000(l7m0Var, (byte) 6);
                fetVar.o0(objP4);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP4, fetVar);
            mm40 mm40VarR = knm0.r(mm40Var);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o050.P(j120.K(mm40VarR, s5x0.u(0.0f, 0.0f, 0.0f, 56.0f, 7))), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            boolean z5 = i3 == 256;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new lj00(function1, b);
                fetVar.o0(objP5);
            }
            m(mm40VarQ, l7m0VarY, l7m0VarY2, function1, (Function1) objP5, fetVar, (i2 << 3) & 7168);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var, l7m0Var, function1, i, (byte) 24);
        }
    }

    public static final boolean b0(ljg ljgVar, m9s m9sVar) {
        ljgVar.getClass();
        v1h v1hVar = ljgVar.d;
        return (v1hVar.d.isEmpty() && v1hVar.e.isEmpty() && v1hVar.f.isEmpty()) || m9sVar == null || !qzb.A0(m9sVar);
    }

    public static final void c(String str, ja40 ja40Var, fet fetVar, int i) {
        ja40 ja40Var2;
        fet fetVar2 = fetVar;
        str.getClass();
        ja40Var.getClass();
        fetVar2.g0(1265734721);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(ja40Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            zfn zfnVar = zaq0.b;
            long separator60 = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = i120.S(jm40Var, 1.0f, separator60, ugg0Var2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarL = s5x0.L(o7k0.s(jm40Var, 24.0f), 4.0f, 0.0f, 2);
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarL, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, i2 & 14, 0, 130040);
            fetVar2 = fetVar;
            mm40 mm40VarN = o7k0.n(s5x0.J(jm40Var, 4.0f), 28.0f);
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar2 = qmk.e;
            mm40 mm40VarQ = i120.Q(mm40VarN, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            ja40Var2 = ja40Var;
            lgb.w(lgb.J(o7k0.n(jm40Var, 28.0f), vgg0.a(8.0f)), jr8.f16991a.b(o7k0.n(jm40Var, 20.0f), gqw0.e), ja40Var2.b, new m0x(R.drawable.ic_glyph_circle_globe, null, 6), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary60(), null, null, gqw0.A, fetVar2, 12582912, 96);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            ja40Var2 = ja40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba30(str, ja40Var2, i, (byte) 7);
        }
    }

    public static final boolean c0(myd0 myd0Var) {
        return myd0Var.b.isEmpty() && myd0Var.f22599a.length() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(rr40 rr40Var, fet fetVar, int i) {
        int i2;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar.g0(1443024803);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(rr40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "MORTAL_KOMBAT");
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarE0, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), shdVar2);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, shdVar);
            fetVar.e0(-1786713326);
            Iterator it = rr40Var.f30963a.iterator();
            while (it.hasNext()) {
                qr40 qr40Var = (qr40) it.next();
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarE1 = o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), "ROW_MORTAL_KOMBAT");
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, i3);
                jm40 jm40Var2 = jm40Var;
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE1);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                jpm0.o(fetVar, Integer.valueOf(iHashCode2), shdVar2);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                String str = qr40Var.f29192a;
                mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(o2e.e0(jm40Var2, "ROUND_INFO"), 0.0f, 0.0f, 2.0f, 0.0f, 11), 56.0f), 32.0f);
                StaticColors staticColors = StaticColors.INSTANCE;
                long jM73getBlack400d7_KjU = staticColors.m73getBlack400d7_KjU();
                zcl zclVar3 = qmk.e;
                ugg0 ugg0Var = vgg0.f37379a;
                shd shdVar5 = shdVar;
                mm40 mm40VarQ = i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3));
                yx7 yx7Var = gqw0.k;
                l(0, fetVar, o7k0.w(mm40VarQ, yx7Var, false, 2), str);
                String str2 = qr40Var.b;
                mm40 mm40VarE2 = o7k0.e(s5x0.N(o2e.e0(jm40Var2, "TIME_INFO"), 2.0f, 0.0f, 2.0f, 0.0f, 10), 32.0f);
                zhg0 zhg0Var = zhg0.f44392a;
                w(0, fetVar, o7k0.w(i120.Q(zhg0Var.a(1.0f, mm40VarE2, true), staticColors.m73getBlack400d7_KjU(), new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), yx7Var, false, 2), str2);
                x(o7k0.w(i120.Q(zhg0Var.a(1.0f, o7k0.e(s5x0.N(o2e.e0(jm40Var2, "WINNER_INFO"), 2.0f, 0.0f, 2.0f, 0.0f, 10), 32.0f), true), staticColors.m73getBlack400d7_KjU(), new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), yx7Var, false, 2), qr40Var.d, fetVar, 0);
                a(0, fetVar, o7k0.w(i120.Q(zhg0Var.a(1.0f, o7k0.e(s5x0.N(o2e.e0(jm40Var2, "FINISH_INFO"), 2.0f, 0.0f, 0.0f, 0.0f, 14), 32.0f), true), staticColors.m73getBlack400d7_KjU(), new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), yx7Var, false, 2), qr40Var.c);
                fetVar.r(true);
                it = it;
                shdVar4 = shdVar4;
                jm40Var = jm40Var2;
                i3 = 0;
                shdVar = shdVar5;
                shdVar2 = shdVar2;
                shdVar3 = shdVar3;
            }
            fetVar.r(i3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(rr40Var, i, (byte) 29);
        }
    }

    public static final boolean d0(ljg ljgVar) {
        ljgVar.getClass();
        v1h v1hVar = ljgVar.d;
        return v1hVar.d.isEmpty() && v1hVar.e.isEmpty() && v1hVar.f.isEmpty();
    }

    public static final void e(r970 r970Var, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(1962652682);
        int i2 = (fetVar.g(r970Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            vul vulVar = vul.b;
            wul wulVar = r970Var.f30064a;
            wul wulVar2 = r970Var.b;
            boolean z = true;
            long j = r970Var.c;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new ju60(function1, (byte) 27);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            if (i3 != 32) {
                z = false;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new ju60(function1, (byte) 28);
                fetVar.o0(objP2);
            }
            gkb.i(mm40VarD, vulVar, wulVar, wulVar2, j, function0, (Function0) objP2, fetVar, 6, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(r970Var, function1, i, (byte) 19);
        }
    }

    public static final boolean e0(bvd0 bvd0Var) {
        ivd0 ivd0Var = bvd0Var.f3275a;
        ivd0 ivd0Var2 = bvd0Var.b;
        rvd0 rvd0Var = ivd0Var.h;
        rvd0 rvd0Var2 = rvd0.c;
        if (rvd0Var == rvd0Var2 && ivd0Var2.h == rvd0Var2) {
            return true;
        }
        return ivd0Var.f.isEmpty() && ivd0Var2.f.isEmpty();
    }

    public static final void f(s970 s970Var, fet fetVar, int i) {
        fetVar.g0(-1199599661);
        int i2 = (fetVar.g(s970Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            dub.x(ua80.d(jm40Var, 16.0f, fetVar, jm40Var, 1.0f), s970Var.f31840a, null, null, fetVar, 6, 28);
            dub.x(ua80.d(jm40Var, 8.0f, fetVar, jm40Var, 1.0f), s970Var.b, null, null, fetVar, 6, 28);
            kkb.m(ua80.d(jm40Var, 10.0f, fetVar, jm40Var, 1.0f), s970Var.c, ro8.b, 0, s970Var.d, s970Var.e, fetVar, 6, 8);
            qxw.o(fetVar, o7k0.e(jm40Var, 12.0f));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ds60(s970Var, i, (byte) 6);
        }
    }

    public static final boolean f0(bvd0 bvd0Var) {
        ivd0 ivd0Var = bvd0Var.f3275a;
        ivd0 ivd0Var2 = bvd0Var.b;
        rvd0 rvd0Var = ivd0Var.h;
        rvd0 rvd0Var2 = rvd0.c;
        return rvd0Var == rvd0Var2 || ivd0Var2.h == rvd0Var2 || ivd0Var.d.size() < 5 || ivd0Var2.d.size() < 5;
    }

    public static final void g(t970 t970Var, fet fetVar, int i) {
        fetVar.g0(732662641);
        int i2 = (fetVar.g(t970Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            wwb.i(s5x0.L(ua80.d(jm40Var, 28.0f, fetVar, jm40Var, 1.0f), 16.0f, 0.0f, 2), t970Var.f33548a, t970Var.b, 0, t970Var.c, fetVar, 0, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ds60(t970Var, i, (byte) 7);
        }
    }

    public static final boolean g0(pg80 pg80Var, swq swqVar) {
        pg80Var.getClass();
        swqVar.getClass();
        return pg80Var.b(swqVar);
    }

    public static final void h(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, fet fetVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        boolean z = (((i & 896) ^ 384) > 256 && fetVar.g(ugdVar2)) || (i & 384) == 256;
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            objP = new x4a0(ugdVar2, (byte) 2);
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
        ugdVar.invoke(fetVar, Integer.valueOf((i >> 3) & 14));
        if (ugdVar2 == null) {
            fetVar.e0(-1232789579);
            fetVar.r(false);
        } else {
            fetVar.e0(1899895244);
            twn.v((i >> 6) & 14, ugdVar2, fetVar, false);
        }
        fetVar.r(true);
    }

    public static final boolean h0(dpa0 dpa0Var, long j, long j2) {
        int i = dpa0Var.i == 1 ? 1 : 0;
        long j3 = dpa0Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final void i(mm40 mm40Var, int i, float f, ugd ugdVar, ugd ugdVar2, fet fetVar, int i2) {
        mm40 mm40Var2;
        mm40 mm40Var3;
        fetVar.g0(616585273);
        int i3 = i2 | 6 | (fetVar.e(i) ? 32 : 16) | (fetVar.d(f) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                mm40Var3 = jm40.b;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var;
            }
            fetVar.s();
            mm40 mm40VarD = o7k0.d(mm40Var3, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 48.0f), 0.0f, f, 1);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new o680(i, ugdVar, ugdVar2);
                fetVar.o0(objP);
            }
            x4n0.a(mm40VarL, (Function2) objP, fetVar, 0, 0);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zm2(mm40Var2, i, f, ugdVar, ugdVar2, i2);
        }
    }

    public static final ArrayList i0(pg80 pg80Var, swq swqVar) {
        pg80Var.getClass();
        swqVar.getClass();
        ArrayList arrayList = new ArrayList();
        pg80Var.a(swqVar, arrayList);
        return arrayList;
    }

    public static final ewb0 j(String str, zvb0 zvb0Var) {
        if (StringsKt.W(str)) {
            jf4.o("Blank serial names are prohibited");
            return null;
        }
        kwb0.a(str);
        return new ewb0(str, zvb0Var);
    }

    public static final long j0(dpa0 dpa0Var, boolean z) {
        long jE = ne60.e(dpa0Var.c, dpa0Var.g);
        if (z || !dpa0Var.c()) {
            return jE;
        }
        return 0L;
    }

    public static final void k(mm40 mm40Var, nuc0 nuc0Var, boolean z, Function1 function1, fet fetVar, int i, int i2) {
        int i3;
        boolean z2;
        Function1 function2;
        Function1 function3;
        nuc0Var.getClass();
        fetVar.g0(-1338230028);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(nuc0Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z3 = i4 != 0 ? true : z;
            if (i5 != 0) {
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new ljc0((byte) 15);
                    fetVar.o0(objP);
                }
                function3 = (Function1) objP;
            } else {
                function3 = function1;
            }
            if (nuc0Var instanceof luc0) {
                fetVar.e0(-1324088190);
                luc0 luc0Var = (luc0) nuc0Var;
                a4x a4xVar = luc0Var.f20668a;
                hh80 hh80VarT = luc0Var.c;
                if (hh80VarT == null) {
                    fetVar.e0(-1843823338);
                    hh80VarT = s5x0.t(xfn.a(fetVar).d, 0.0f, 2);
                } else {
                    fetVar.e0(-1843824144);
                }
                fetVar.r(false);
                guc0 guc0Var = luc0Var.b;
                int i6 = i3 & 14;
                int i7 = i3 << 6;
                boolean z4 = z3;
                n2x.h(mm40Var, a4xVar, guc0Var, hh80VarT, z4, function3, fetVar, (i7 & 458752) | i6 | (57344 & i7));
                z3 = z4;
                fetVar.r(false);
            } else {
                if (!(nuc0Var instanceof muc0)) {
                    throw b1j.f(-1843828664, fetVar, false);
                }
                fetVar.e0(-1323705495);
                muc0 muc0Var = (muc0) nuc0Var;
                guc0 guc0Var2 = muc0Var.f22409a;
                hh80 hh80VarT2 = muc0Var.b;
                if (hh80VarT2 == null) {
                    fetVar.e0(-1843808810);
                    hh80VarT2 = s5x0.t(xfn.a(fetVar).d, 0.0f, 2);
                } else {
                    fetVar.e0(-1843809616);
                }
                fetVar.r(false);
                c3x.j(mm40Var, hh80VarT2, z3, guc0Var2, fetVar, i3 & 910);
                fetVar.r(false);
            }
            z2 = z3;
            function2 = function3;
        } else {
            fetVar.X();
            z2 = z;
            function2 = function1;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr8(mm40Var, nuc0Var, z2, function2, i, i2, (byte) 2);
        }
    }

    public static final void l(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(-1446188974);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            v8q0.a(str2, mm40Var, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 0, 130040);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var, str2, i, (byte) 1);
        }
    }

    public static final u6n l0(d280 d280Var, w6n w6nVar, fet fetVar) {
        d280Var.getClass();
        w6nVar.getClass();
        boolean zG = fetVar.g(d280Var) | fetVar.e(w6nVar.ordinal());
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new u6n(d4d.STATIC_WHITE60, w6nVar, d280Var);
            fetVar.o0(objP);
        }
        return (u6n) objP;
    }

    public static final void m(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var3;
        l7m0 l7m0Var4;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(67151698);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            l7m0Var3 = l7m0Var;
            i2 |= fetVar2.g(l7m0Var3) ? 32 : 16;
        } else {
            l7m0Var3 = l7m0Var;
        }
        if ((i & 384) == 0) {
            l7m0Var4 = l7m0Var2;
            i2 |= fetVar2.g(l7m0Var4) ? 256 : 128;
        } else {
            l7m0Var4 = l7m0Var2;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function2) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            kj00 kj00Var = (kj00) l7m0Var3.getValue();
            if (kj00Var != null) {
                boolean z2 = kj00Var instanceof gj00;
                cl5 cl5Var = ukd.f35823a;
                if (z2) {
                    fetVar2.e0(-938156009);
                    wom womVarF = mom.f(fetVar2);
                    boolean zBooleanValue = ((Boolean) l7m0Var4.getValue()).booleanValue();
                    boolean z3 = (i2 & 7168) == 2048;
                    Object objP = fetVar2.P();
                    if (z3 || objP == cl5Var) {
                        objP = new dg00(function1, b);
                        fetVar2.o0(objP);
                    }
                    mom.c(null, zBooleanValue, womVarF, null, false, null, (Function0) objP, null, u1c.M(-1204299755, new eyn(kj00Var, mm40Var, function2, (byte) 18), fetVar2), fetVar, 100663296, ModuleDescriptor.MODULE_VERSION);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (kj00Var instanceof hj00) {
                    fetVar2.e0(-937485510);
                    mm40 mm40VarW = o7k0.w(mm40Var, null, false, 3);
                    mdm mdmVar = ((hj00) kj00Var).f13140a;
                    boolean z4 = (i2 & 7168) == 2048;
                    Object objP2 = fetVar2.P();
                    if (z4 || objP2 == cl5Var) {
                        objP2 = new dg00(function1, (byte) 17);
                        fetVar2.o0(objP2);
                    }
                    jcb.l(mm40VarW, mdmVar, false, (Function0) objP2, fetVar2, 0, 4);
                    fetVar2.r(false);
                } else if (kj00Var instanceof jj00) {
                    fetVar2.e0(-937141441);
                    a4x a4xVar = ((jj00) kj00Var).f16599a;
                    Object objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = new w800((byte) 11);
                        fetVar2.o0(objP3);
                    }
                    jar0.s((i2 & 14) | 24960, fetVar2, a4xVar, mm40Var, (Function1) objP3, false);
                    fetVar2.r(false);
                } else {
                    z = false;
                    if (kj00Var instanceof ij00) {
                        fetVar2.e0(-936847282);
                        fetVar2.r(false);
                    }
                }
            } else {
                z = false;
            }
            throw b1j.f(108282004, fetVar2, z);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o4p(mm40Var, l7m0Var, l7m0Var2, function1, function2, i, (byte) 2);
        }
    }

    public static final lq5 m0(hr10 hr10Var) {
        switch (hr10Var.ordinal()) {
            case 0:
                return new jq5();
            case 1:
                return kq5.f18703a;
            case 2:
                return hq5.f13470a;
            case 3:
                return iq5.f15191a;
            case 4:
                return fq5.f9956a;
            case 5:
                return gq5.f11714a;
            case 6:
                return dq5.f6497a;
            case 7:
                return eq5.f8219a;
            case 8:
                return cq5.f4775a;
            default:
                t9f.b();
                return null;
        }
    }

    public static final void n(mm40 mm40Var, agh0 agh0Var, fet fetVar, int i) {
        agh0Var.getClass();
        fetVar.g0(-1441689598);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(agh0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.N(o7k0.d(s5x0.L(mm40Var, qmk.a(fetVar).c, 0.0f, 2), 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), agh0Var.f825a, kjm.f18392a, null, null, null, fetVar, 384, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(mm40Var, agh0Var, i, (byte) 27);
        }
    }

    public static final lq5 n0(h650 h650Var) {
        switch (h650Var.ordinal()) {
            case 0:
                return new jq5();
            case 1:
                return kq5.f18703a;
            case 2:
                return hq5.f13470a;
            case 3:
                return iq5.f15191a;
            case 4:
                return fq5.f9956a;
            case 5:
                return gq5.f11714a;
            case 6:
                return dq5.f6497a;
            case 7:
                return eq5.f8219a;
            case 8:
                return cq5.f4775a;
            default:
                t9f.b();
                return null;
        }
    }

    public static final zqv0 o(String str, ugi0 ugi0Var) {
        ugi0Var.getClass();
        if (StringsKt.W(str)) {
            jf4.o("Blank serial names are prohibited");
            return null;
        }
        if (!str.equals(ugi0Var.h())) {
            if (ugi0Var.l() instanceof zvb0) {
                kwb0.a(str);
            }
            return new zqv0(str, ugi0Var);
        }
        StringBuilder sbT = kng0.t("The name of the wrapped descriptor (", str, ") cannot be the same as the name of the original descriptor (");
        sbT.append(ugi0Var.h());
        sbT.append(')');
        throw new IllegalArgumentException(sbT.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r37v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r38v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r39v2 */
    public static final xt20 o0(cas casVar, boolean z, long j, long j2, boolean z2, List list, List list2, List list3, String str, boolean z3, boolean z4, boolean z5) {
        Object next;
        Object next2;
        List list4;
        ArrayList arrayList;
        String str2;
        Object next3;
        String strA;
        String strC;
        String str3;
        sh7 sh7Var;
        cao caoVar;
        Object next4;
        Long l;
        List list5;
        casVar.getClass();
        Long l2 = casVar.f4027a;
        list.getClass();
        list2.getClass();
        list3.getClass();
        str.getClass();
        Iterator it = list3.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long j3 = ((rco) next).f30249a;
            if (l2 != null && j3 == l2.longValue()) {
                break;
            }
        }
        rco rcoVar = (rco) next;
        String str4 = rcoVar != null ? rcoVar.b : null;
        String str5 = "";
        String str6 = str4 == null ? "" : str4;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            long j4 = ((xt20) next2).b;
            if (l2 != null && j4 == l2.longValue()) {
                break;
            }
        }
        xt20 xt20Var = (xt20) next2;
        Object objR = (xt20Var == null || (list5 = xt20Var.f41445a) == null) ? null : r3d.r(list5);
        if (objR == null) {
            objR = iun.f15405a;
        }
        List<List> list6 = casVar.c;
        if (list6 != null) {
            int i = 10;
            ArrayList arrayList2 = new ArrayList(r3d.q(list6, 10));
            for (List list7 : list6) {
                ArrayList arrayList3 = new ArrayList(r3d.q(list7, i));
                ArrayList arrayList4 = arrayList2;
                int i2 = 0;
                for (Object obj : list7) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    gas gasVar = (gas) obj;
                    long jLongValue = l2 != null ? l2.longValue() : 0L;
                    gasVar.getClass();
                    Double d = gasVar.e;
                    String str7 = gasVar.f;
                    Long l3 = gasVar.f10984a;
                    objR.getClass();
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            arrayList = arrayList3;
                            str2 = null;
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                        str2 = null;
                        arrayList = arrayList3;
                        long j5 = ((obo) next3).f24991a;
                        if (l3 != null && j5 == l3.longValue()) {
                            break;
                        }
                        arrayList3 = arrayList;
                    }
                    obo oboVar = (obo) next3;
                    qfo qfoVar = gasVar.c;
                    Double d2 = gasVar.d;
                    if (l3 != null && l3.longValue() == 707) {
                        strA = str;
                    } else {
                        String str8 = oboVar != null ? oboVar.b : str2;
                        String str9 = str8 == null ? str5 : str8;
                        lfo lfoVar = gasVar.i;
                        Object obj2 = lfoVar != null ? lfoVar.f19966a : str2;
                        if (obj2 == null) {
                            obj2 = iun.f15405a;
                        }
                        ?? r37 = obj2;
                        Object obj3 = lfoVar != null ? lfoVar.b : str2;
                        if (obj3 == null) {
                            obj3 = iun.f15405a;
                        }
                        strA = dii0.a(str9, r37, obj3, oboVar != null ? Integer.valueOf(oboVar.c) : str2, z3, kotlin.text.b.h(String.valueOf(d2)), qfoVar != null ? qfoVar.b : str2, Long.valueOf(j2), oboVar != null ? oboVar.f24991a : 0L, nt20.e, z4, z5);
                    }
                    ArrayList arrayList5 = arrayList4;
                    long jLongValue2 = l3 != null ? l3.longValue() : 0L;
                    double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
                    double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
                    String strValueOf = d2 != null ? String.valueOf(d2.doubleValue()) : str2;
                    if (strValueOf == null) {
                        strValueOf = str5;
                    }
                    Boolean bool = gasVar.b;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    String str10 = str7 == null ? str5 : str7;
                    if (d == null || Intrinsics.d(str7, "SP")) {
                        arrayList5 = arrayList5;
                        str5 = str5;
                        strC = "SP";
                    } else if (z2 || str7 == null || str7.length() <= 0) {
                        pn40 pn40Var = pn40.f27267a;
                        strC = pn40.c(d != null ? d.doubleValue() : 0.0d, p3u0.e);
                    } else {
                        arrayList5 = arrayList5;
                        str5 = str5;
                        strC = str7;
                    }
                    long jLongValue3 = (qfoVar == null || (l = qfoVar.f28645a) == null) ? 0L : l.longValue();
                    String str11 = qfoVar != null ? qfoVar.b : str2;
                    if (str11 == null) {
                        str11 = str5;
                    }
                    sh7 sh7Var2 = new sh7(jLongValue3, str11);
                    double dDoubleValue3 = d != null ? d.doubleValue() : 0.0d;
                    if (objR.isEmpty()) {
                        str3 = strA;
                        sh7Var = sh7Var2;
                        caoVar = cao.f4021a;
                    } else {
                        Iterator it4 = objR.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                sh7Var = sh7Var2;
                                next4 = str2;
                                break;
                            }
                            next4 = it4.next();
                            sh7Var = sh7Var2;
                            if (((dao) next4).l.equals(strA)) {
                                break;
                            }
                            sh7Var2 = sh7Var;
                        }
                        dao daoVar = (dao) next4;
                        str3 = strA;
                        ?? ValueOf = daoVar != null ? Double.valueOf(daoVar.d) : str2;
                        if (ValueOf != 0) {
                            double dDoubleValue4 = ValueOf.doubleValue();
                            caoVar = dDoubleValue4 > dDoubleValue3 ? cao.c : dDoubleValue4 < dDoubleValue3 ? cao.b : cao.f4021a;
                        } else {
                            caoVar = cao.f4021a;
                        }
                    }
                    ArrayList arrayList6 = arrayList5;
                    ArrayList arrayList7 = arrayList;
                    arrayList7.add(new dao(i2, jLongValue2, j, dDoubleValue, jLongValue, dDoubleValue2, strValueOf, zBooleanValue, str10, strC, str6, str3, sh7Var, caoVar, false, false, z ? uoy.LIVE : uoy.LINE, false, d == null || Intrinsics.d(str7, "SP")));
                    i = 10;
                    arrayList4 = arrayList6;
                    arrayList3 = arrayList7;
                    i2 = i3;
                    str5 = str5;
                    l2 = l2;
                    objR = objR;
                }
                Object obj4 = objR;
                ArrayList arrayList8 = arrayList4;
                arrayList8.add(arrayList3);
                arrayList2 = arrayList8;
                l2 = l2;
                objR = obj4;
            }
            list4 = arrayList2;
        } else {
            list4 = null;
        }
        Long l4 = l2;
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        return new xt20(list4, l4 != null ? l4.longValue() : 0L, str6, false, -1L, -1.0d, false, Intrinsics.d(casVar.d, Boolean.TRUE));
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-2024611266);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, i120.Q(lgb.J(o7k0.e(mm40Var, 16.0f), vgg0.a(16.0f)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroup(), jd8.n));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 7);
        }
    }

    public static final hg30 p0(anq0 anq0Var, boolean z) {
        return new hg30(anq0Var.d, anq0Var.e, anq0Var.c, anq0Var.j, anq0Var.b, anq0Var.f1167a, z);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public static final void q(mm40 mm40Var, xdr xdrVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        xdr xdrVar2;
        boolean z;
        xdr xdrVar3;
        mm40 mm40Var3;
        yfe0 yfe0VarU;
        jm40 jm40Var;
        xdr xdrVar4;
        zhg0 zhg0Var;
        float f;
        fetVar.g0(-1376167105);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                xdrVar2 = xdrVar;
                i3 |= fetVar.i(xdrVar2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                jm40Var = jm40.b;
                if (i4 != 0) {
                    mm40Var2 = jm40Var;
                }
                if (i5 != 0) {
                    xdrVar4 = null;
                } else {
                    xdrVar4 = xdrVar2;
                }
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var2, 48.0f), 1.0f);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
                zhg0Var = zhg0.f44392a;
                if (xdrVar4 == null) {
                    fetVar.e0(-908506950);
                } else {
                    fetVar.e0(-1276232665);
                    xdrVar4.F(zhg0Var, fetVar, Integer.valueOf((i3 & 112) | 6));
                }
                fetVar.r(false);
                if (xdrVar4 == null) {
                    f = 110.0f;
                } else {
                    f = 16.0f;
                }
                p(0, fetVar, zhg0Var.a(1.0f, s5x0.N(jm40Var, f, 0.0f, 8.0f, 0.0f, 10), true));
                fetVar.r(true);
                xdrVar3 = xdrVar4;
            } else {
                fetVar.X();
                xdrVar3 = xdrVar2;
            }
            mm40Var3 = mm40Var2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new e7h(mm40Var3, (Object) xdrVar3, i, i2, (byte) 2);
            }
        }
        i3 |= 48;
        xdrVar2 = xdrVar;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            if (i5 != 0) {
                xdrVar4 = null;
            } else {
                xdrVar4 = xdrVar2;
            }
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarD2 = o7k0.d(o7k0.e(mm40Var2, 48.0f), 1.0f);
            thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            zhg0Var = zhg0.f44392a;
            if (xdrVar4 == null) {
                fetVar.e0(-908506950);
            } else {
                fetVar.e0(-1276232665);
                xdrVar4.F(zhg0Var, fetVar, Integer.valueOf((i3 & 112) | 6));
            }
            fetVar.r(false);
            if (xdrVar4 == null) {
                f = 110.0f;
            } else {
                f = 16.0f;
            }
            p(0, fetVar, zhg0Var.a(1.0f, s5x0.N(jm40Var, f, 0.0f, 8.0f, 0.0f, 10), true));
            fetVar.r(true);
            xdrVar3 = xdrVar4;
        } else {
            fetVar.X();
            xdrVar3 = xdrVar2;
        }
        mm40Var3 = mm40Var2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e7h(mm40Var3, (Object) xdrVar3, i, i2, (byte) 2);
        }
    }

    public static final hf90 q0(mf90 mf90Var) {
        mf90Var.getClass();
        Integer num = mf90Var.f21684a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = mf90Var.b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = mf90Var.c;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        String str = mf90Var.d;
        if (str == null) {
            str = "";
        }
        String str2 = mf90Var.e;
        String str3 = str2 != null ? str2 : "";
        Integer num4 = mf90Var.f;
        return new hf90(iIntValue, iIntValue2, iIntValue3, num4 != null ? num4.intValue() : 0, str, str3);
    }

    public static final void r(int i, fet fetVar) {
        fetVar.g0(-1474031829);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            p(0, fetVar, s5x0.N(o7k0.s(jm40.b, 94.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ogj0(i, (byte) 14);
        }
    }

    public static final j5a0 r0(ah50 ah50Var, List list, boolean z, cap capVar) {
        ah50Var.getClass();
        String str = ah50Var.c;
        long j = ah50Var.f857a;
        c280 c280Var = new c280(vsm0.s(j, str), R.drawable.ic_glyph_placeholder_player);
        if (z) {
            return new e5a0(c280Var);
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
        return new a5a0(c280Var, ah50Var.f857a, z2, capVar);
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1618184868);
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarC0 = xbc.c0(i120.Q(mm40VarD, backgroundContent, ljcVar), vbc.d0(null, fetVar, 0, 1));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarC0);
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
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            jm40 jm40Var = jm40.b;
            q(i120.Q(jm40Var, background, ljcVar), null, fetVar, 0, 2);
            q(null, ny9.f, fetVar, 48, 1);
            q(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), ljcVar), ny9.g, fetVar, 48, 0);
            q(null, ny9.h, fetVar, 48, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 6);
        }
    }

    public static final u0f0 s0(q0f0 q0f0Var) {
        q0f0Var.getClass();
        if (q0f0Var != null) {
            if (q0f0Var instanceof gze0) {
                return u0f0.s;
            }
            if (q0f0Var instanceof hze0) {
                return u0f0.f1;
            }
            if (q0f0Var instanceof pze0) {
                return u0f0.g;
            }
            if (q0f0Var instanceof jze0) {
                return u0f0.v;
            }
            if (q0f0Var instanceof kze0) {
                return u0f0.o;
            }
            if (q0f0Var instanceof lze0) {
                return u0f0.f;
            }
            if (q0f0Var instanceof mze0) {
                return u0f0.y;
            }
            if (q0f0Var instanceof nze0) {
                return u0f0.d;
            }
            if (q0f0Var instanceof oze0) {
                return u0f0.i;
            }
            if (q0f0Var instanceof qze0) {
                return u0f0.p;
            }
            if (q0f0Var instanceof rze0) {
                return u0f0.k;
            }
            if (q0f0Var instanceof sze0) {
                return u0f0.c;
            }
            if (q0f0Var instanceof uze0) {
                return u0f0.f34852a;
            }
            if (q0f0Var instanceof wze0) {
                return u0f0.Y;
            }
            if (q0f0Var instanceof a0f0) {
                return u0f0.q;
            }
            if (q0f0Var instanceof b0f0) {
                return u0f0.l;
            }
            if (q0f0Var instanceof c0f0) {
                return u0f0.h;
            }
            if (q0f0Var instanceof d0f0) {
                return u0f0.Z;
            }
            if (q0f0Var instanceof e0f0) {
                return u0f0.t;
            }
            if (q0f0Var instanceof f0f0) {
                return u0f0.u;
            }
            if (q0f0Var instanceof g0f0) {
                return u0f0.e;
            }
            if (q0f0Var instanceof i0f0) {
                return u0f0.A;
            }
            if (q0f0Var instanceof j0f0) {
                return u0f0.B;
            }
            if (q0f0Var instanceof k0f0) {
                return u0f0.b;
            }
            if (q0f0Var instanceof l0f0) {
                return u0f0.x;
            }
            if (q0f0Var instanceof m0f0) {
                return u0f0.w;
            }
            if (q0f0Var instanceof tze0) {
                return u0f0.r;
            }
            if (q0f0Var instanceof o0f0) {
                return u0f0.z;
            }
            if (q0f0Var instanceof p0f0) {
                return u0f0.j;
            }
            if (q0f0Var instanceof h0f0) {
                return u0f0.n;
            }
            if (q0f0Var instanceof ize0) {
                return u0f0.q1;
            }
            if (q0f0Var instanceof yze0) {
                return u0f0.m1;
            }
            if (q0f0Var instanceof zze0) {
                return u0f0.l1;
            }
            if (q0f0Var instanceof vze0) {
                return u0f0.r1;
            }
            if (q0f0Var instanceof xze0) {
                return u0f0.n1;
            }
            if (q0f0Var instanceof n0f0) {
                return u0f0.o1;
            }
        }
        t9f.b();
        return null;
    }

    public static final void t(mm40 mm40Var, i5a0 i5a0Var, w6n w6nVar, Function2 function2, fet fetVar, int i, int i2) {
        ugd ugdVarM;
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        byte b = 24;
        if ((i2 & 8) != 0) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ogj0(b);
                fetVar.o0(objP);
            }
            function2 = (Function2) objP;
        }
        ugd ugdVarM2 = u1c.M(2017373635, new kqh0(i5a0Var, w6nVar, (byte) 29), fetVar);
        if (i5a0Var instanceof z4a0) {
            fetVar.e0(240591769);
            ugdVarM = u1c.M(355154602, new fzi0(w6nVar, i5a0Var, function2, b), fetVar);
            fetVar.r(false);
        } else {
            if (!(i5a0Var instanceof d5a0)) {
                throw b1j.f(284853466, fetVar, false);
            }
            fetVar.e0(241216387);
            fetVar.r(false);
            ugdVarM = null;
        }
        n2x.g(mm40Var, ugdVarM2, ugdVarM, fetVar, (i & 14) | 48, 0);
    }

    public static final fqm t0(yo50 yo50Var, int i) {
        boolean z = yo50Var.c;
        int i2 = yo50Var.b;
        ArrayList arrayList = new ArrayList(i);
        for (int iC = 0; iC < i; iC = w6x.c(5000, iC, 1, arrayList)) {
        }
        return new fqm(i2, arrayList, z);
    }

    public static final void u(int i, int i2, fet fetVar, mm40 mm40Var, String str) {
        int i3;
        mm40 mm40Var2;
        str.getClass();
        fetVar.g0(2105557924);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i5 & 1, (i5 & 19) != 18)) {
            mm40 mm40Var3 = i4 != 0 ? jm40.b : mm40Var;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40Var3, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, ((i5 >> 3) & 14) | ((i5 << 3) & 112), 24960, 109560);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z05(mm40Var2, str, i, i2, (byte) 6);
        }
    }

    public static final nal0 u0(eh50 eh50Var, List list, boolean z, cap capVar, kal0 kal0Var) {
        eh50Var.getClass();
        List list2 = eh50Var.d;
        int size = list2.size();
        String str = eh50Var.b;
        if (size >= 2) {
            return new lal0(str, r0((ah50) list2.get(0), list, z, cap.b), r0((ah50) list2.get(1), list, z, cap.f4022a), kal0Var);
        }
        ah50 ah50Var = (ah50) CollectionsKt.firstOrNull(list2);
        return new mal0(str, ah50Var != null ? r0(ah50Var, list, z, capVar) : new e5a0(new c280("", R.drawable.ic_glyph_placeholder_player)), kal0Var);
    }

    public static final void v(mm40 mm40Var, a4x a4xVar, String str, String str2, String str3, fet fetVar, int i) {
        fet fetVar2;
        a4xVar.getClass();
        fetVar.g0(-618041348);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str3) ? 16384 : 8192;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            u23 u23Var = (u23) fetVar.k(bmd.s);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40Var, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 12.0f, 1);
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str3, mm40VarL, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, (i2 >> 12) & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.e0(-157908500);
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                v8q0.b((j83) it.next(), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 0, 262142);
                fetVar2 = fetVar;
                qxw.o(fetVar2, o7k0.e(jm40Var, 4.0f));
            }
            fetVar2.r(false);
            if (str == null || str2 == null) {
                fetVar2.e0(-599193104);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-599966709);
                fetVar2.e0(-157900163);
                h83 h83Var = new h83();
                int iG = h83Var.g(new smk0(0L, 0L, psq.f, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65531));
                try {
                    h83Var.c(str2);
                    h83Var.c(": ");
                    h83Var.d(iG);
                    pz40 pz40Var2 = s6t0.f31722a;
                    long textPrimary = s6t0.b().f33626a.getTextPrimary();
                    long jM81getDarkBlue0d7_KjU = StaticColors.INSTANCE.m81getDarkBlue0d7_KjU();
                    boolean zI = fetVar2.i(h83Var) | fetVar2.i(u23Var);
                    Object objP = fetVar2.P();
                    if (zI || objP == ukd.f35823a) {
                        objP = new svl0(h83Var, u23Var, b);
                        fetVar2.o0(objP);
                    }
                    Function1 function1 = (Function1) objP;
                    SpannableString spannableString = new SpannableString(str);
                    Linkify.addLinks(spannableString, 1);
                    Object[] spans = spannableString.getSpans(0, spannableString.length(), URLSpan.class);
                    spans.getClass();
                    int spanEnd = 0;
                    for (URLSpan uRLSpan : tx3.Y(spans, new wvl0(spannableString, (byte) 2))) {
                        qrq qrqVar = j1t0.c;
                        SpannableString spannableString2 = spannableString;
                        int i3 = spanEnd;
                        int iG2 = h83Var.g(new smk0(textPrimary, 0L, null, null, null, qrqVar, null, 0L, null, null, null, 0L, null, null, null, 65502));
                        try {
                            h83Var.c(spannableString2.subSequence(i3, spannableString2.getSpanStart(uRLSpan)).toString());
                            h83Var.d(iG2);
                            String url = uRLSpan.getURL();
                            url.getClass();
                            long j = jM81getDarkBlue0d7_KjU;
                            jb00 jb00Var = new jb00(url, new f9q0(new smk0(j, 0L, null, null, null, qrqVar, null, 0L, null, null, null, 0L, k5q0.c, null, null, 61406), null, null, null), new sa4(function1, (byte) 5));
                            String string = spannableString2.subSequence(spannableString2.getSpanStart(uRLSpan), spannableString2.getSpanEnd(uRLSpan)).toString();
                            int iE = h83Var.e(jb00Var);
                            try {
                                h83Var.c(string);
                                h83Var.d(iE);
                                spannableString = spannableString2;
                                jM81getDarkBlue0d7_KjU = j;
                                spanEnd = spannableString2.getSpanEnd(uRLSpan);
                            } catch (Throwable th) {
                                h83Var.d(iE);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            h83Var.d(iG2);
                            throw th2;
                        }
                    }
                    SpannableString spannableString3 = spannableString;
                    int i4 = spanEnd;
                    if (i4 < spannableString3.length()) {
                        int iG3 = h83Var.g(new smk0(textPrimary, 0L, null, null, null, j1t0.c, null, 0L, null, null, null, 0L, null, null, null, 65502));
                        try {
                            h83Var.c(spannableString3.subSequence(i4, spannableString3.length()).toString());
                            h83Var.d(iG3);
                        } catch (Throwable th3) {
                            h83Var.d(iG3);
                            throw th3;
                        }
                    }
                    j83 j83VarH = h83Var.h();
                    fetVar2.r(false);
                    y9q0 y9q0Var2 = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
                    pz40 pz40Var3 = s6t0.f31722a;
                    fet fetVar3 = fetVar2;
                    v8q0.b(j83VarH, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y9q0Var2, fetVar3, 0, 0, 262138);
                    fetVar2 = fetVar3;
                    fetVar2.r(false);
                } catch (Throwable th4) {
                    h83Var.d(iG);
                    throw th4;
                }
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) a4xVar, (Object) str, (Object) str2, (Object) str3, i, (byte) 25);
        }
    }

    public static final void w(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(220391511);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            v8q0.a(str2, mm40Var, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 0, 130040);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var, str2, i, (byte) 3);
        }
    }

    public static final void x(mm40 mm40Var, ur40 ur40Var, fet fetVar, int i) {
        fetVar.g0(-1254780674);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(ur40Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1311660994, new gr40(ur40Var, mm40Var), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gr40(mm40Var, ur40Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102  */
    /* JADX WARN: Code duplicated, block: B:54:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:65:0x014b  */
    public static final void y(lc00 lc00Var, f2h f2hVar, int i, List list, List list2, boolean z, long j) {
        Object next;
        List list3;
        boolean z2;
        int i2;
        String str;
        int i3;
        String str2 = f2hVar.d;
        str2.getClass();
        String str3 = "%s/playerlogo/%s";
        String str4 = "%s/%s";
        boolean z3 = true;
        if (!kotlin.text.c.x(str2, ujn.h, false)) {
            if (str2.length() == 0) {
                str2 = "";
            } else {
                List list4 = u0d.f34849a;
                if (u0d.c(str2)) {
                    str2 = "";
                } else {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
        }
        lc00Var.add(new q4k0(new o4k0(str2), i));
        List listD0 = z ? CollectionsKt.D0(list2, 5) : list2;
        Iterator it = listD0.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next2 = it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                q3d.p();
                throw null;
            }
            q1h q1hVar = (q1h) next2;
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((f2h) next).f8812a.equals(q1hVar.c));
            f2h f2hVar2 = (f2h) next;
            if (f2hVar2 != null) {
                String str5 = q1hVar.f27952a;
                int i6 = q1hVar.e;
                int i7 = q1hVar.d;
                String str6 = f2hVar2.d;
                str6.getClass();
                list3 = listD0;
                if (!kotlin.text.c.x(str6, ujn.h, false)) {
                    if (str6.length() != 0) {
                        List list5 = u0d.f34849a;
                        if (!u0d.c(str6)) {
                            str3 = str3;
                            str6 = String.format(Locale.ENGLISH, StringsKt.O(str6, "playerlogo/", true) ? str4 : str3, Arrays.copyOf(new Object[]{ujn.h, str6}, 2));
                        }
                        e4k0 e4k0Var = new e4k0(str6);
                        String str7 = f2hVar2.c;
                        str7.getClass();
                        g4k0 g4k0Var = new g4k0(String.valueOf(i7), String.valueOf(i6));
                        if (i7 > i6) {
                            i2 = R.drawable.cyber_game_last_matches_result_win_bg;
                        } else if (i7 < i6) {
                            i2 = R.drawable.cyber_game_last_matches_result_lose_bg;
                        } else {
                            i2 = R.drawable.cyber_game_last_matches_result_draw_bg;
                        }
                        int i8 = i2;
                        String str8 = q1hVar.g;
                        str = q1hVar.h;
                        if (str.length() == 0) {
                            str = "VS";
                        }
                        String str9 = str;
                        rdj rdjVar = rdj.f30294a;
                        String strF = rdj.f(new znq0(q1hVar.f), sdj.UNIVERSAL, null, 60);
                        strF.getClass();
                        z2 = true;
                        if (i4 == list3.size() - 1 || list2.size() > 5) {
                            i3 = R.drawable.cyber_game_last_matches_item_bg;
                        } else {
                            i3 = R.drawable.cyber_game_last_matches_last_item_bg;
                        }
                        lc00Var.add(new m4k0(str5, e4k0Var, str7, g4k0Var, i8, str8, str9, strF, i3));
                    }
                    str6 = "";
                }
                e4k0 e4k0Var2 = new e4k0(str6);
                String str10 = f2hVar2.c;
                str10.getClass();
                g4k0 g4k0Var2 = new g4k0(String.valueOf(i7), String.valueOf(i6));
                if (i7 > i6) {
                    i2 = R.drawable.cyber_game_last_matches_result_win_bg;
                } else if (i7 < i6) {
                    i2 = R.drawable.cyber_game_last_matches_result_lose_bg;
                } else {
                    i2 = R.drawable.cyber_game_last_matches_result_draw_bg;
                }
                int i9 = i2;
                String str11 = q1hVar.g;
                str = q1hVar.h;
                if (str.length() == 0) {
                    str = "VS";
                }
                String str12 = str;
                rdj rdjVar2 = rdj.f30294a;
                String strF2 = rdj.f(new znq0(q1hVar.f), sdj.UNIVERSAL, null, 60);
                strF2.getClass();
                z2 = true;
                if (i4 == list3.size() - 1) {
                    i3 = R.drawable.cyber_game_last_matches_item_bg;
                } else {
                    i3 = R.drawable.cyber_game_last_matches_item_bg;
                }
                lc00Var.add(new m4k0(str5, e4k0Var2, str10, g4k0Var2, i9, str11, str12, strF2, i3));
            } else {
                list3 = listD0;
                str3 = str3;
                z2 = z3;
            }
            str4 = str4;
            i4 = i5;
            z3 = z2;
            listD0 = list3;
            it = it;
            str3 = str3;
        }
        if (list2.size() > 5) {
            lc00Var.add(new b2z(z ? R.drawable.ic_glyph_chevron_down_small : R.drawable.ic_glyph_chevron_up_small, R.drawable.cyber_game_last_matches_last_item_bg, j));
        }
    }

    public static void z(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            w2x.a(imageView, matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        if (f40191a) {
            try {
                w2x.a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f40191a = false;
            }
        }
    }

    public boolean Q(qrg0 qrg0Var) {
        return true;
    }

    public abstract void k0(String str);
}
