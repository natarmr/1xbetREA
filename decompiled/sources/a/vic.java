package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.SparseArray;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
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
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleTwoTeams;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f37472a;

    public static final boolean A(IOException iOException) {
        b5q b5qVar = new b5q(pgi0.h(lgi0.e(new vzd((byte) 16), iOException), ske.f));
        while (b5qVar.hasNext()) {
            int i = ((ErrnoException) b5qVar.next()).errno;
            if (i == OsConstants.ENOSPC || i == OsConstants.EDQUOT) {
                return true;
            }
        }
        return false;
    }

    public static final boolean B(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!Intrinsics.d(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static void C(Context context, String str) {
        context.getClass();
        str.getClass();
        Integer numValueOf = Integer.valueOf(context.getColor(R.color.static_transparent));
        nhf0 nhf0Var = new nhf0(Integer.valueOf(context.getColor(R.color.static_transparent) | (-16777216)), numValueOf, Integer.valueOf(context.getColor(R.color.static_transparent) | (-16777216)), Integer.valueOf(context.getColor(R.color.static_transparent)));
        mii0 mii0Var = new mii0((byte) 22);
        Intent intent = (Intent) mii0Var.b;
        intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
        SparseArray sparseArray = (SparseArray) mii0Var.d;
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            mii0Var.d = sparseArray;
        }
        sparseArray.put(2, nhf0Var.B());
        intent.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", 2);
        mii0Var.e = nhf0Var.B();
        try {
            yzn0 yzn0VarM = mii0Var.m();
            Intent intent2 = (Intent) yzn0VarM.f43523a;
            String strD = D(context);
            if (strD != null) {
                intent2.setPackage(strD);
            }
            intent2.setData(Uri.parse(str));
            context.startActivity(intent2, (Bundle) yzn0VarM.b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b6 A[PHI: r0
  0x00b6: PHI (r0v15 java.lang.String) = (r0v11 java.lang.String), (r0v12 java.lang.String), (r0v13 java.lang.String), (r0v14 java.lang.String) binds: [B:31:0x00b4, B:34:0x00be, B:37:0x00c7, B:40:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    public static String D(Context context) {
        String str = f37472a;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        String str2 = null;
        Intent data = new Intent().setAction(CommonConstant.ACTION.HWID_SCHEME_URL).addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        data.getClass();
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(data, PackageManager.ResolveInfoFlags.of(131072L)) : packageManager.queryIntentActivities(data, 131072);
        ArrayList arrayListU = twn.u(listQueryIntentActivities);
        for (Object obj : listQueryIntentActivities) {
            Intent intentJ = hne.j("android.support.customtabs.action.CustomTabsService");
            intentJ.setPackage(((ResolveInfo) obj).activityInfo.packageName);
            if ((Build.VERSION.SDK_INT >= 33 ? packageManager.resolveService(intentJ, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveService(intentJ, 0)) != null) {
                arrayListU.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListU.iterator();
        while (it.hasNext()) {
            String str3 = ((ResolveInfo) it.next()).activityInfo.packageName;
            if (str3 != null) {
                arrayList.add(str3);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                str2 = (String) arrayList.get(0);
            } else {
                String str4 = "com.android.chrome";
                if (arrayList.contains("com.android.chrome")) {
                    str2 = str4;
                } else {
                    str4 = "com.chrome.beta";
                    if (arrayList.contains("com.chrome.beta")) {
                        str2 = str4;
                    } else {
                        str4 = "com.chrome.dev";
                        if (arrayList.contains("com.chrome.dev")) {
                            str2 = str4;
                        } else {
                            str4 = "com.google.android.apps.chrome";
                            if (arrayList.contains("com.google.android.apps.chrome")) {
                                str2 = str4;
                            }
                        }
                    }
                }
            }
        }
        f37472a = str2;
        return str2;
    }

    public static final p3b E(ypl0 ypl0Var) {
        ypl0Var.getClass();
        int i = (int) ypl0Var.f43037a;
        StringBuilder sb = new StringBuilder(ujn.h);
        String str = ypl0Var.c.b;
        str.getClass();
        if (str.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
            sb.setLength(0);
            sb.append(str);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str, '/'));
        }
        return new p3b(i, new n0x(sb.toString()), ypl0Var.b);
    }

    public static final ypf F(bqf bqfVar) {
        List listJ;
        bqfVar.getClass();
        Long l = bqfVar.f3026a;
        long jLongValue = l != null ? l.longValue() : 0L;
        String str = bqfVar.b;
        String str2 = str == null ? "" : str;
        String str3 = bqfVar.c;
        String str4 = str3 == null ? "" : str3;
        Integer num = bqfVar.d;
        int iIntValue = num != null ? num.intValue() : 0;
        String str5 = bqfVar.e;
        String str6 = str5 == null ? "" : str5;
        String strE = lmc.E(bqfVar.f);
        gqf gqfVar = bqfVar.h;
        if (gqfVar != null) {
            Float f = gqfVar.f11730a;
            cqf cqfVar = new cqf(f != null ? f.floatValue() : -1.0f, dqf.d);
            Float f2 = gqfVar.b;
            cqf cqfVar2 = new cqf(f2 != null ? f2.floatValue() : -1.0f, dqf.f6512a);
            Float f3 = gqfVar.c;
            cqf cqfVar3 = new cqf(f3 != null ? f3.floatValue() : -1.0f, dqf.c);
            Float f4 = gqfVar.d;
            cqf cqfVar4 = new cqf(f4 != null ? f4.floatValue() : -1.0f, dqf.e);
            Float f5 = gqfVar.e;
            cqf cqfVar5 = new cqf(f5 != null ? f5.floatValue() : -1.0f, dqf.f);
            Float f6 = gqfVar.f;
            listJ = q3d.j(cqfVar, cqfVar2, cqfVar3, cqfVar4, cqfVar5, new cqf(f6 != null ? f6.floatValue() : -1.0f, dqf.b));
        } else {
            listJ = null;
        }
        if (listJ == null) {
            listJ = iun.f15405a;
        }
        List list = listJ;
        jqf jqfVar = bqfVar.g;
        String str7 = jqfVar != null ? jqfVar.f16949a : null;
        return new ypf(jLongValue, str2, str4, iIntValue, str6, strE, lmc.E(jqfVar != null ? jqfVar.c : null), str7 == null ? "" : str7, list);
    }

    public static String G(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        String str = vtt0.f38024a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final elt H(xkt xktVar) {
        xktVar.getClass();
        String str = xktVar.f41044a;
        if (str == null) {
            str = "";
        }
        String str2 = xktVar.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = xktVar.c;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = xktVar.d;
        String str5 = str4 != null ? str4 : "";
        Integer num = xktVar.e;
        int iIntValue = num != null ? num.intValue() : 0;
        Long l = xktVar.f;
        int iLongValue = l != null ? (int) l.longValue() : 0;
        Integer num2 = xktVar.g;
        return new elt(str, str2, str3, str5, iIntValue, iLongValue, num2 != null ? num2.intValue() : 0);
    }

    public static final ybq I(bcq bcqVar) {
        bcqVar.getClass();
        Float f = bcqVar.f2365a;
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        Long l = bcqVar.b;
        return new ybq(fFloatValue, l != null ? l.longValue() : 0L);
    }

    public static final int J(iy4 iy4Var) {
        int iOrdinal = iy4Var.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.ic_red_cross_circle;
        }
        if (iOrdinal == 1) {
            return R.drawable.ic_gray_waiting_circle;
        }
        if (iOrdinal == 2) {
            return R.drawable.ic_red_cross_circle;
        }
        if (iOrdinal == 3) {
            return R.drawable.ic_status_check;
        }
        t9f.b();
        return 0;
    }

    public static final int K(i0w i0wVar) {
        i0wVar.getClass();
        switch (i0wVar.ordinal()) {
            case 0:
                return R.drawable.ic_red_cross_circle;
            case 1:
                return R.drawable.ic_status_check;
            case 2:
                return R.drawable.ic_red_minus_circle;
            case 3:
            case 4:
                return R.drawable.ic_green_check_circle;
            case 5:
            case 6:
                return R.drawable.ic_red_cross_circle;
            case 7:
                return R.drawable.ic_gray_block_circle;
            case 8:
                return R.drawable.ic_green_plus_circle;
            default:
                t9f.b();
                return 0;
        }
    }

    public static final e140 L(Map map, ctf0 ctf0Var, qho qhoVar, String str, String str2) {
        String str3;
        s4i s4iVar;
        s4i s4iVar2;
        map.getClass();
        ctf0Var.getClass();
        qhoVar.getClass();
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(r3d.q(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            switch ((r040) it.next()) {
                case SPORTS:
                case SINGLE_SPORTS:
                    str3 = str;
                    s4iVar = new s4i(ctf0Var.f(R.string.sport, new Object[0]), qhoVar.b(R.drawable.ic_glyph_sport), null, false, 12);
                    continue;
                    arrayList.add(s4iVar);
                    str = str3;
                    break;
                case AGGREGATOR:
                case SINGLE_AGGREGATOR:
                    str3 = str;
                    s4iVar = new s4i(ctf0Var.f(R.string.casino_chip, new Object[0]), qhoVar.b(R.drawable.ic_glyph_cards), null, false, 12);
                    continue;
                    arrayList.add(s4iVar);
                    str = str3;
                    break;
                case GAMES:
                case SINGLE_GAMES:
                    str3 = str;
                    s4iVar = new s4i(str3, qhoVar.b(R.drawable.ic_glyph_games), null, false, 12);
                    continue;
                    arrayList.add(s4iVar);
                    str = str3;
                    break;
                case OTHER:
                case SINGLE_OTHER:
                    s4iVar2 = new s4i(ctf0Var.f(R.string.other_menu, new Object[0]), qhoVar.b(R.drawable.ic_glyph_other), null, false, 12);
                    break;
                case TOP:
                case SINGLE_TOP:
                    s4iVar2 = new s4i(ctf0Var.f(R.string.top, new Object[0]), qhoVar.b(R.drawable.ic_glyph_top), null, false, 12);
                    break;
                case VIRTUAL:
                case SINGLE_VIRTUAL:
                    s4iVar2 = new s4i(ctf0Var.f(R.string.virtual, new Object[0]), qhoVar.b(R.drawable.ic_glyph_virtual), null, false, 12);
                    break;
                default:
                    t9f.b();
                    return null;
            }
            s4iVar = s4iVar2;
            str3 = str;
            arrayList.add(s4iVar);
            str = str3;
        }
        return new e140(str2, arrayList, CollectionsKt.L0(map.keySet()));
    }

    public static final String M(m1p m1pVar) {
        switch (m1pVar.ordinal()) {
            case 0:
                return "s1";
            case 1:
                return "s2";
            case 2:
                return "s3";
            case 3:
                return "i1";
            case 4:
                return "i2";
            case 5:
                return "i3";
            case 6:
                return "f1";
            case 7:
                return "f2";
            case 8:
                return "f3";
            default:
                t9f.b();
                return null;
        }
    }

    public static final long N(long j, long j2) {
        int iD;
        int iF = o9q0.f(j);
        int iE = o9q0.e(j);
        if ((o9q0.f(j2) < o9q0.e(j)) && (o9q0.f(j) < o9q0.e(j2))) {
            if ((o9q0.f(j2) <= o9q0.f(j)) && (o9q0.e(j) <= o9q0.e(j2))) {
                iF = o9q0.f(j2);
                iE = iF;
            } else {
                if ((o9q0.f(j) <= o9q0.f(j2)) && (o9q0.e(j2) <= o9q0.e(j))) {
                    iD = o9q0.d(j2);
                } else {
                    int iF2 = o9q0.f(j2);
                    if (iF >= o9q0.e(j2) || iF2 > iF) {
                        iE = o9q0.f(j2);
                    } else {
                        iF = o9q0.f(j2);
                        iD = o9q0.d(j2);
                    }
                }
                iE -= iD;
            }
        } else if (iE > o9q0.f(j2)) {
            iF -= o9q0.d(j2);
            iD = o9q0.d(j2);
            iE -= iD;
        }
        return s7n0.e(iF, iE);
    }

    public static final void a(mm40 mm40Var, j83 j83Var, fet fetVar, int i) {
        zcl zclVar = qmk.f28987a;
        mm40 mm40VarD = o7k0.d(s5x0.L(mm40Var, 8.0f, 0.0f, 2), 1.0f);
        ((g1t0) fetVar.k(j1t0.e)).getClass();
        v8q0.b(j83Var, mm40VarD, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, null, g1t0.h(), fetVar, (i >> 3) & 14, 24960, 240632);
    }

    public static final void b(mm40 mm40Var, final p0h p0hVar, fet fetVar, int i) {
        p0hVar.getClass();
        fetVar.g0(1376338456);
        final byte b = 2;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(p0hVar) ? 32 : 16);
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            final byte b4 = 3;
            final mm40 mm40VarW = o7k0.w(s5x0.L(jm40.b, 0.0f, 6.0f, 1), null, false, 3);
            mbc.f(mm40Var, 0.0f, 0.55f, u1c.M(-233992323, new xdr() { // from class: a.d9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b2;
                    jm40 jm40Var = jm40.b;
                    p0h p0hVar2 = p0hVar;
                    switch (b5) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                mm40 mm40VarS = o7k0.s(jm40Var, 24.0f);
                                String str = p0hVar2.f26150a;
                                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarS, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar2, 0, 0, 130040);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarM = s5x0.M(jm40Var, 56.0f, 6.0f, 4.0f, 6.0f);
                                String str2 = p0hVar2.b;
                                ((g1t0) fetVar3.k(j1t0.e)).getClass();
                                v8q0.a(str2, mm40VarM, ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar3, 0, 0, 130040);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                vic.j(null, (a9d) CollectionsKt.W(1, p0hVar2.c), fetVar4, 0, 1);
                            } else {
                                fetVar4.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-661262052, new xdr() { // from class: a.d9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b3;
                    jm40 jm40Var = jm40.b;
                    p0h p0hVar2 = p0hVar;
                    switch (b5) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                mm40 mm40VarS = o7k0.s(jm40Var, 24.0f);
                                String str = p0hVar2.f26150a;
                                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarS, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar2, 0, 0, 130040);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarM = s5x0.M(jm40Var, 56.0f, 6.0f, 4.0f, 6.0f);
                                String str2 = p0hVar2.b;
                                ((g1t0) fetVar3.k(j1t0.e)).getClass();
                                v8q0.a(str2, mm40VarM, ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar3, 0, 0, 130040);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                vic.j(null, (a9d) CollectionsKt.W(1, p0hVar2.c), fetVar4, 0, 1);
                            } else {
                                fetVar4.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), null, u1c.M(-1515801510, new xdr() { // from class: a.e9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b2;
                    p0h p0hVar2 = p0hVar;
                    mm40 mm40Var2 = mm40VarW;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b5) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(4, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(3, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 2:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(2, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(0, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1943071239, new xdr() { // from class: a.e9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b3;
                    p0h p0hVar2 = p0hVar;
                    mm40 mm40Var2 = mm40VarW;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b5) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(4, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(3, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 2:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(2, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(0, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(1852511419, new xdr() { // from class: a.e9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b;
                    p0h p0hVar2 = p0hVar;
                    mm40 mm40Var2 = mm40VarW;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b5) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(4, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(3, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 2:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(2, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(0, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(1425241690, new xdr() { // from class: a.d9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b;
                    jm40 jm40Var = jm40.b;
                    p0h p0hVar2 = p0hVar;
                    switch (b5) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                mm40 mm40VarS = o7k0.s(jm40Var, 24.0f);
                                String str = p0hVar2.f26150a;
                                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarS, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar2, 0, 0, 130040);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarM = s5x0.M(jm40Var, 56.0f, 6.0f, 4.0f, 6.0f);
                                String str2 = p0hVar2.b;
                                ((g1t0) fetVar3.k(j1t0.e)).getClass();
                                v8q0.a(str2, mm40VarM, ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar3, 0, 0, 130040);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                vic.j(null, (a9d) CollectionsKt.W(1, p0hVar2.c), fetVar4, 0, 1);
                            } else {
                                fetVar4.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(997971961, new xdr() { // from class: a.e9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b4;
                    p0h p0hVar2 = p0hVar;
                    mm40 mm40Var2 = mm40VarW;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b5) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(4, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(3, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 2:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(2, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                vic.j(mm40Var2, (a9d) CollectionsKt.W(0, p0hVar2.c), fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i2 & 14) | 907742208, 438, 150);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var, p0hVar, i, (byte) 23);
        }
    }

    public static final void c(sls slsVar, fet fetVar, int i) {
        boolean z;
        fet fetVar2 = fetVar;
        slsVar.getClass();
        String str = slsVar.c;
        fetVar2.g0(-468553009);
        int i2 = i | (fetVar2.g(slsVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            mm40 mm40VarN = s5x0.N(o7k0.A(jm40Var, null, 3), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM129getWhite400d7_KjU = staticColors.m129getWhite400d7_KjU();
            y9q0 y9q0VarF = g1t0.f();
            long j = qmk.o;
            v8q0.a(slsVar.e, mm40VarN, jM129getWhite400d7_KjU, null, j, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarF, fetVar, 0, 0, 131048);
            v8q0.a(slsVar.b, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), staticColors.m130getWhite600d7_KjU(), null, j, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.f(), fetVar, 0, 0, 131048);
            if (str.length() > 0) {
                fetVar.e0(1649565118);
                k7x.a(str, null, o7k0.n(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f), null, null, fetVar, 48, 2040);
                z = false;
                fetVar.r(false);
            } else {
                z = false;
                fetVar.e0(1649806639);
                fetVar.r(false);
            }
            v8q0.a(slsVar.d, s5x0.N(new x7z(1.0f, z), 4.0f, 0.0f, 0.0f, 0.0f, 14), staticColors.m123getWhite0d7_KjU(), null, j, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.f(), fetVar, 0, 24960, 109544);
            fetVar2 = fetVar;
            o(slsVar.f32414a, fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qls(slsVar, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static final void d(final mm40 mm40Var, final hrl hrlVar, final krl krlVar, float f, fet fetVar, final int i, final int i2) {
        int i3;
        float f2;
        int i4;
        boolean z;
        final float f3;
        yfe0 yfe0VarU;
        int iOrdinal;
        fetVar.g0(-1687406982);
        if ((i & 6) == 0) {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | (fetVar.e(hrlVar.ordinal()) ? 32 : 16) | (fetVar.g(krlVar) ? 256 : 128);
        if ((i2 & 8) == 0) {
            f2 = f;
            int i6 = fetVar.d(f2) ? 2048 : 1024;
            i4 = i5 | i6 | 24576;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                fetVar.Z();
                if ((i & 1) == 0 && !fetVar.B()) {
                    fetVar.X();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                } else if ((i2 & 8) != 0) {
                    f2 = xfn.a(fetVar).c;
                    i4 &= -7169;
                }
                fetVar.s();
                mm40 mm40VarL = s5x0.L(mm40Var, f2, 0.0f, 2);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                jpm0.o(fetVar, tj30VarC, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                iOrdinal = hrlVar.ordinal();
                if (iOrdinal != 0) {
                    fetVar.e0(-1485946572);
                    plc.g(null, krlVar, fetVar, (i4 >> 3) & 112);
                    fetVar.r(false);
                } else if (iOrdinal != 1) {
                    fetVar.e0(-1485942922);
                    agc.m(null, krlVar, fetVar, ((i4 >> 3) & 112) | 384);
                    fetVar.r(false);
                } else {
                    if (iOrdinal == 2) {
                        throw b1j.f(-1485948305, fetVar, false);
                    }
                    fetVar.e0(-1485936070);
                    hic.h(null, krlVar, fetVar, ((i4 >> 3) & 112) | 384);
                    fetVar.r(false);
                }
                fetVar.r(true);
            } else {
                fetVar.X();
            }
            f3 = f2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.grl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        vic.d(mm40Var, hrlVar, krlVar, f3, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        f2 = f;
        i4 = i5 | i6 | 24576;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            fetVar.Z();
            if ((i & 1) == 0) {
                if ((i2 & 8) != 0) {
                    f2 = xfn.a(fetVar).c;
                    i4 &= -7169;
                }
            } else if ((i2 & 8) != 0) {
                f2 = xfn.a(fetVar).c;
                i4 &= -7169;
            }
            fetVar.s();
            mm40 mm40VarL2 = s5x0.L(mm40Var, f2, 0.0f, 2);
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            iOrdinal = hrlVar.ordinal();
            if (iOrdinal != 0) {
                fetVar.e0(-1485946572);
                plc.g(null, krlVar, fetVar, (i4 >> 3) & 112);
                fetVar.r(false);
            } else if (iOrdinal != 1) {
                fetVar.e0(-1485942922);
                agc.m(null, krlVar, fetVar, ((i4 >> 3) & 112) | 384);
                fetVar.r(false);
            } else {
                if (iOrdinal == 2) {
                    throw b1j.f(-1485948305, fetVar, false);
                }
                fetVar.e0(-1485936070);
                hic.h(null, krlVar, fetVar, ((i4 >> 3) & 112) | 384);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        f3 = f2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.grl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vic.d(mm40Var, hrlVar, krlVar, f3, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void e(mm40 mm40Var, y0m y0mVar, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        float f;
        fetVar.g0(1300702306);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40Var3 = i4 != 0 ? jm40.b : mm40Var;
            int iOrdinal = y0mVar.ordinal();
            if (iOrdinal == 0) {
                zcl zclVar = qmk.f28987a;
                f = 16.0f;
            } else if (iOrdinal != 1) {
                t9f.b();
                return;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 12.0f;
            }
            j0x.b(a8k0.F(R.drawable.ic_status_branch_eliminated, 0, fetVar), null, o7k0.n(mm40Var3, f), null, null, 0.0f, null, fetVar, 56, 120);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm(mm40Var2, (Object) y0mVar, i, i2, (byte) 14);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1025947351);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 120.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 23);
        }
    }

    public static final void g(mm40 mm40Var, m6l0 m6l0Var, boolean z, Function1 function1, fet fetVar, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new aim((byte) 14);
                fetVar.o0(objP);
            }
            function1 = (Function1) objP;
        }
        if (m6l0Var instanceof d6l0) {
            fetVar.e0(917260868);
            plc.k(mm40Var, (d6l0) m6l0Var, z, function1, fetVar, 0);
            fetVar.r(false);
        } else if (m6l0Var instanceof k6l0) {
            fetVar.e0(917267524);
            lmc.o(mm40Var, (k6l0) m6l0Var, z, function1, fetVar, 0);
            fetVar.r(false);
        } else {
            if (!(m6l0Var instanceof l6l0)) {
                throw b1j.f(917259474, fetVar, false);
            }
            fetVar.e0(917274193);
            obb.s(0, fetVar, mm40Var);
            fetVar.r(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static final void h(mm40 mm40Var, pxm pxmVar, boolean z, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        int i3;
        ?? r0;
        fet fetVar3;
        fetVar.g0(-566028030);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pxmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.runtime.d dVar = bmd.n;
            Object obj = (k6z) fetVar.k(dVar);
            if (!z) {
                obj = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 8.0f, 0.0f, 8.0f, 8.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z2) {
                fetVar.l(function0);
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
            if (pxmVar.b.length() > 0) {
                fetVar.e0(434022314);
                mm40 mm40VarE = o7k0.e(jm40.b, 16.0f);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                String str = pxmVar.b;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                r0 = 1;
                v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109562);
                fet fetVar4 = fetVar;
                fetVar4.r(true);
                i3 = 0;
                fetVar4.r(false);
                fetVar3 = fetVar4;
            } else {
                i3 = 0;
                fet fetVar5 = fetVar;
                r0 = 1;
                fetVar5.e0(434556630);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            p(i3, fetVar3, null, pxmVar.f27759a);
            obc.d(dVar.a(obj), u1c.M(2054136204, new mxm(pxmVar, r0), fetVar3), fetVar3, 56);
            fetVar3.r(r0);
            fetVar2 = fetVar3;
        } else {
            fet fetVar6 = fetVar;
            fetVar6.X();
            fetVar2 = fetVar6;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 20, i, mm40Var, (Object) pxmVar, z);
        }
    }

    public static final void i(mm40 mm40Var, final bjl0 bjl0Var, boolean z, Function1 function1, fet fetVar, int i) {
        float f;
        ugd ugdVarM;
        fetVar.g0(-1272512649);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(bjl0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (bjl0Var instanceof wil0) {
                zcl zclVar = qmk.f28987a;
                f = 16.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 20.0f;
            }
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gnm(function1, bjl0Var, (byte) 13);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40Var, null, null, false, null, (Function0) objP, 28);
            if (bjl0Var instanceof yil0) {
                fetVar.e0(-2042266952);
                ugdVarM = u1c.M(-1160578882, new Function2() { // from class: a.l4n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ynm ynmVar;
                        byte b3 = b;
                        bjl0 bjl0Var2 = bjl0Var;
                        switch (b3) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    j2e.g(null, ((yil0) bjl0Var2).b, 0, null, 0.0f, 0.0f, fetVar2, 0);
                                } else {
                                    fetVar2.X();
                                }
                                return Unit.f46060a;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    if (bjl0Var2 instanceof wil0) {
                                        ynmVar = ((wil0) bjl0Var2).d;
                                    } else if (bjl0Var2 instanceof xil0) {
                                        ynmVar = ((xil0) bjl0Var2).d;
                                    } else if (bjl0Var2 instanceof yil0) {
                                        ynmVar = ((yil0) bjl0Var2).e;
                                    } else if (bjl0Var2 instanceof zil0) {
                                        ynmVar = ((zil0) bjl0Var2).d;
                                    } else {
                                        if (!(bjl0Var2 instanceof ajl0)) {
                                            t9f.b();
                                            return null;
                                        }
                                        ynmVar = ((ajl0) bjl0Var2).d;
                                    }
                                    boolean z3 = ynmVar instanceof vnm;
                                    jm40 jm40Var = jm40.b;
                                    if (z3) {
                                        fetVar3.e0(-1689117607);
                                        bkb.i(jm40Var, (vnm) ynmVar, fetVar3, 0);
                                        fetVar3.r(false);
                                    } else if (ynmVar instanceof wnm) {
                                        fetVar3.e0(-1689113740);
                                        ckb.l(jm40Var, (wnm) ynmVar, fetVar3, 0);
                                        fetVar3.r(false);
                                    } else {
                                        if (!(ynmVar instanceof xnm)) {
                                            throw b1j.f(-1689119353, fetVar3, false);
                                        }
                                        fetVar3.e0(-1689110028);
                                        gkb.k(jm40Var, (xnm) ynmVar, fetVar3, 0);
                                        fetVar3.r(false);
                                    }
                                } else {
                                    fetVar3.X();
                                }
                                return Unit.f46060a;
                        }
                    }
                }, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-2042149617);
                fetVar.r(false);
                ugdVarM = null;
            }
            a8k0.n(mm40VarW, f, 0L, ugdVarM, u1c.M(757317912, new d0n((Object) bjl0Var, (Object) function1, (byte) 7), fetVar), u1c.M(330048183, new jv1((Object) bjl0Var, z, (byte) 17), fetVar), u1c.M(-97221546, new Function2() { // from class: a.l4n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ynm ynmVar;
                    byte b3 = b2;
                    bjl0 bjl0Var2 = bjl0Var;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                j2e.g(null, ((yil0) bjl0Var2).b, 0, null, 0.0f, 0.0f, fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            return Unit.f46060a;
                        default:
                            fet fetVar3 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                if (bjl0Var2 instanceof wil0) {
                                    ynmVar = ((wil0) bjl0Var2).d;
                                } else if (bjl0Var2 instanceof xil0) {
                                    ynmVar = ((xil0) bjl0Var2).d;
                                } else if (bjl0Var2 instanceof yil0) {
                                    ynmVar = ((yil0) bjl0Var2).e;
                                } else if (bjl0Var2 instanceof zil0) {
                                    ynmVar = ((zil0) bjl0Var2).d;
                                } else {
                                    if (!(bjl0Var2 instanceof ajl0)) {
                                        t9f.b();
                                        return null;
                                    }
                                    ynmVar = ((ajl0) bjl0Var2).d;
                                }
                                boolean z3 = ynmVar instanceof vnm;
                                jm40 jm40Var = jm40.b;
                                if (z3) {
                                    fetVar3.e0(-1689117607);
                                    bkb.i(jm40Var, (vnm) ynmVar, fetVar3, 0);
                                    fetVar3.r(false);
                                } else if (ynmVar instanceof wnm) {
                                    fetVar3.e0(-1689113740);
                                    ckb.l(jm40Var, (wnm) ynmVar, fetVar3, 0);
                                    fetVar3.r(false);
                                } else {
                                    if (!(ynmVar instanceof xnm)) {
                                        throw b1j.f(-1689119353, fetVar3, false);
                                    }
                                    fetVar3.e0(-1689110028);
                                    gkb.k(jm40Var, (xnm) ynmVar, fetVar3, 0);
                                    fetVar3.r(false);
                                }
                            } else {
                                fetVar3.X();
                            }
                            return Unit.f46060a;
                    }
                }
            }, fetVar), fetVar, 1794048, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((byte) 1, i, (Object) mm40Var, (Object) bjl0Var, (Object) function1, z);
        }
    }

    public static final void j(mm40 mm40Var, a9d a9dVar, fet fetVar, int i, int i2) {
        int i3;
        fetVar.g0(-1888637292);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        int i5 = i3 | (fetVar.g(a9dVar) ? 32 : 16);
        if (fetVar.U(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            if (a9dVar == null) {
                fetVar.e0(-321840718);
                fetVar.r(false);
            } else {
                fetVar.e0(-321840717);
                x2x.u(0, 0, fetVar, o7k0.s(mm40Var, a9dVar.f470a), a9dVar.a());
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm(mm40Var2, (Object) a9dVar, i, i2, (byte) 5);
        }
    }

    public static final void k(y7o0 y7o0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-1622744906);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(y7o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = twn.s(fetVar);
            }
            List list = (List) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = d6o.f5559a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            byte b = 14;
            boolean zI = fetVar.i(list) | ((i2 & 14) == 4);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new qzn(y7o0Var, list, b);
                fetVar.o0(objP3);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, null, (Function1) objP3, fetVar2, 6, 2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(y7o0Var, i, (byte) 22);
        }
    }

    public static final void l(mm40 mm40Var, k3w k3wVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        k3wVar.getClass();
        fetVar2.g0(-440101438);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(k3wVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            long background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            boolean zF = fetVar2.f(background);
            Object objP = fetVar2.P();
            if (zF || objP == ukd.f35823a) {
                objP = new nme((byte) 26, background);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarD, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarK, 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(k3wVar.f17639a, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2), fetVar, 0, 0, 131070);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gup(mm40Var, k3wVar, i, (byte) 12);
        }
    }

    public static final void m(sls slsVar, fet fetVar, int i) {
        slsVar.getClass();
        fetVar.g0(1079243293);
        int i2 = (fetVar.g(slsVar) ? 4 : 2) | i;
        byte b = 0;
        if (!fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar.X();
        } else if (slsVar.f) {
            fetVar.e0(-388152391);
            q(slsVar, fetVar, i2 & 14);
            fetVar.r(false);
        } else {
            fetVar.e0(-388102884);
            c(slsVar, fetVar, i2 & 14);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qls(slsVar, i, b);
        }
    }

    public static final void n(mm40 mm40Var, pz40 pz40Var, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(-572674961);
        int i2 = i | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float f = ((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80VarT = s5x0.t(qmk.a(fetVar).c, 0.0f, 2);
            boolean zD = ((i2 & 112) == 32) | fetVar.d(f) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (zD || objP == ukd.f35823a) {
                objP = new ny2((Object) pz40Var, f, (Object) function1, (byte) 5);
                fetVar.o0(objP);
            }
            b8k0.f(mm40Var, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 6, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ugv(mm40Var, pz40Var, function1, i, (byte) 0);
        }
    }

    public static final void o(String str, fet fetVar, int i) {
        fetVar.g0(-1140105238);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 42.0f, 24.0f);
            long j = ijg.i;
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarP, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            lgb.v(dw9.i(zclVar2, zclVar2, zclVar2, zclVar2, jm40Var), h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.p(jm40Var, 16.0f, 16.0f)), str, R.drawable.ic_sport_color_dota_97, StaticColors.INSTANCE.m126getWhite200d7_KjU(), gqw0.A, fetVar, 196608 | ((i2 << 6) & 896), 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 18, i, str);
        }
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-1495758688);
        int i2 = i | 6 | (fetVar2.g(str2) ? 32 : 16) | (fetVar2.g(null) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(o7k0.g(jm40Var, 38.0f, 0.0f, 2), 0.0f, 10.0f, 1);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            brm0.x(fetVar2, mm40VarC0, gqw0.v, 1975165323, false);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, null, textPrimary, new n05(j, g1t0.m().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, y9q0VarM, fetVar2, (i2 >> 3) & 14, 24960, 109554);
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
            yfe0VarU.d = new gdm(mm40Var2, str2, i, (byte) 23);
        }
    }

    public static final void q(sls slsVar, fet fetVar, int i) {
        byte b;
        sls slsVar2 = slsVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1704296880);
        int i2 = i | (fetVar2.g(slsVar2) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            String str = slsVar2.f32414a;
            String str2 = slsVar2.c;
            o(str, fetVar2, 0);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
            y9q0 y9q0VarF = g1t0.f();
            long j = qmk.o;
            v8q0.a(slsVar2.b, mm40VarN, jM130getWhite600d7_KjU, null, j, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarF, fetVar, 0, 0, 131048);
            if (str2.length() > 0) {
                fetVar.e0(-1290607513);
                k7x.a(str2, null, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 12.0f), null, null, fetVar, 48, 2040);
                fetVar.r(false);
            } else {
                fetVar.e0(-1290367914);
                fetVar.r(false);
            }
            v8q0.a(slsVar.d, s5x0.N(new x7z(1.0f, false), 0.0f, 0.0f, 4.0f, 0.0f, 11), staticColors.m123getWhite0d7_KjU(), null, j, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.f(), fetVar, 0, 24960, 109544);
            slsVar2 = slsVar;
            v8q0.a(slsVar2.e, s5x0.N(o7k0.A(jm40Var, null, 3), 0.0f, 0.0f, 8.0f, 0.0f, 11), staticColors.m129getWhite400d7_KjU(), null, j, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.f(), fetVar, 0, 0, 131048);
            fetVar2 = fetVar;
            b = 1;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qls(slsVar2, i, b);
        }
    }

    public static final void r(EventCardMiddleTwoTeams eventCardMiddleTwoTeams, qur qurVar) {
        if (qurVar.d) {
            eventCardMiddleTwoTeams.setFirstTeamLogo(R.drawable.ic_home);
        } else {
            Context context = eventCardMiddleTwoTeams.getContext();
            context.getClass();
            eventCardMiddleTwoTeams.u(qurVar.c, context.getDrawable(R.drawable.no_photo_new));
        }
        eventCardMiddleTwoTeams.setFirstTeamName(qurVar.b);
        eventCardMiddleTwoTeams.setFirstTeamLogoVisibility(qurVar.g);
        if (qurVar.e) {
            eventCardMiddleTwoTeams.setFirstTeamCounter(Integer.valueOf(Integer.parseInt(qurVar.f)));
        } else {
            eventCardMiddleTwoTeams.setFirstTeamCounter(null);
        }
    }

    public static final void s(EventCardMiddleTwoTeams eventCardMiddleTwoTeams, rur rurVar) {
        if (rurVar.d) {
            eventCardMiddleTwoTeams.setSecondTeamLogo(R.drawable.ic_away);
        } else {
            Context context = eventCardMiddleTwoTeams.getContext();
            context.getClass();
            eventCardMiddleTwoTeams.v(rurVar.c, context.getDrawable(R.drawable.no_photo_new));
        }
        eventCardMiddleTwoTeams.setSecondTeamName(rurVar.b);
        eventCardMiddleTwoTeams.setSecondTeamLogoVisibility(rurVar.g);
        if (rurVar.e) {
            eventCardMiddleTwoTeams.setSecondTeamCounter(Integer.valueOf(Integer.parseInt(rurVar.f)));
        } else {
            eventCardMiddleTwoTeams.setSecondTeamCounter(null);
        }
    }

    public static final ofh t(int i, List list, List list2) {
        list.getClass();
        int i2 = 0;
        IntRange intRange = new IntRange(0, 4, 1);
        ArrayList arrayList = new ArrayList(r3d.q(intRange, 10));
        Iterator it = intRange.iterator();
        while (((kkx) it).c) {
            ((bkx) it).nextInt();
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            String str = (String) CollectionsKt.W(i2, list);
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
            i2 = i3;
        }
        return new ofh(i, arrayList, list2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r2 == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap u(android.graphics.drawable.Drawable r16, android.graphics.Bitmap.Config r17, a.f7k0 r18, a.j1h0 r19, a.f7k0 r20, boolean r21) {
        /*
            r0 = r16
            r1 = r18
            r4 = r19
            r5 = r20
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 32
            if (r2 == 0) goto L5d
            r2 = r0
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r11 = r2.getBitmap()
            android.graphics.Bitmap$Config r2 = r11.getConfig()
            if (r17 == 0) goto L2a
            boolean r3 = a.cy2.C(r17)
            if (r3 == 0) goto L27
            goto L2a
        L27:
            r3 = r17
            goto L2c
        L2a:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L2c:
            if (r2 != r3) goto L5d
            if (r21 == 0) goto L31
            goto L5c
        L31:
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            long r2 = a.u1c.z(r2, r3, r1, r4, r5)
            long r6 = r2 >> r10
            int r6 = (int) r6
            long r2 = r2 & r8
            int r2 = (int) r2
            r5 = r2
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            r7 = r6
            r6 = r4
            r4 = r7
            r7 = r20
            double r2 = a.u1c.A(r2, r3, r4, r5, r6, r7)
            r4 = r6
            r5 = r7
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L5d
        L5c:
            return r11
        L5d:
            android.graphics.drawable.Drawable r6 = r0.mutate()
            int r0 = a.lut0.b(r6)
            r2 = 512(0x200, float:7.17E-43)
            if (r0 <= 0) goto L6a
            goto L6b
        L6a:
            r0 = r2
        L6b:
            int r3 = a.lut0.a(r6)
            if (r3 <= 0) goto L72
            r2 = r3
        L72:
            long r11 = a.u1c.z(r0, r2, r1, r4, r5)
            long r13 = r11 >> r10
            int r1 = (int) r13
            long r7 = r11 & r8
            int r3 = (int) r7
            r15 = r2
            r2 = r1
            r1 = r15
            double r2 = a.u1c.A(r0, r1, r2, r3, r4, r5)
            double r4 = (double) r0
            double r4 = r4 * r2
            int r0 = a.si30.a(r4)
            double r4 = (double) r1
            double r2 = r2 * r4
            int r1 = a.si30.a(r2)
            if (r17 == 0) goto L9b
            boolean r2 = a.cy2.C(r17)
            if (r2 == 0) goto L98
            goto L9b
        L98:
            r2 = r17
            goto L9d
        L9b:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L9d:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Rect r3 = r6.getBounds()
            int r4 = r3.left
            int r5 = r3.top
            int r7 = r3.right
            int r3 = r3.bottom
            r8 = 0
            r6.setBounds(r8, r8, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r6.draw(r0)
            r6.setBounds(r4, r5, r7, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vic.u(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, a.f7k0, a.j1h0, a.f7k0, boolean):android.graphics.Bitmap");
    }

    public static final mm40 v(mm40 mm40Var) {
        mm40Var.getClass();
        mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
        long j = iph.b;
        zcl zclVar = qmk.i;
        ugg0 ugg0Var = vgg0.f37379a;
        return i120.Q(mm40VarD, j, new ugg0(zclVar, zclVar, zclVar, zclVar));
    }

    public static final mm40 w(mm40 mm40Var) {
        mm40Var.getClass();
        zcl zclVar = qmk.f28987a;
        long j = iph.c;
        zcl zclVar2 = qmk.g;
        ugg0 ugg0Var = vgg0.f37379a;
        return i120.S(mm40Var, 1.0f, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
    }

    public static final List x(g7k g7kVar, String str) {
        g7kVar.getClass();
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayListN0 = CollectionsKt.N0(g7kVar.a(str));
        while (!arrayListN0.isEmpty()) {
            String str2 = (String) w3d.z(arrayListN0);
            linkedHashSet.add(str2);
            arrayListN0.addAll(g7kVar.a(str2));
        }
        return CollectionsKt.L0(linkedHashSet);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    public static final ArrayList y(bfg bfgVar) {
        List list;
        j0g0 j0g0Var = bfgVar.b;
        List list2 = null;
        if (j0g0Var != null) {
            Object obj = j0g0Var.f15681a;
            if (obj instanceof g0g0) {
                obj = null;
            }
            fcg fcgVar = (fcg) obj;
            if (fcgVar != null) {
                list = fcgVar.f9311a;
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        j0g0 j0g0Var2 = bfgVar.c;
        if (j0g0Var2 != null) {
            Object obj2 = j0g0Var2.f15681a;
            if (obj2 instanceof g0g0) {
                obj2 = null;
            }
            fcg fcgVar2 = (fcg) obj2;
            if (fcgVar2 != null) {
                list2 = fcgVar2.f9311a;
            }
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return CollectionsKt.q0(list, list2);
    }

    public static final boolean z(File file) {
        return file.exists() && file.length() > 0;
    }
}
