package a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class x0x {
    public static void A(boolean z) {
        if (z) {
            return;
        }
        e9d0.o();
    }

    public static void B(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        jf4.o(jtm0.p(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static void C(boolean z, String str, Object obj, Comparable comparable) {
        if (z) {
            return;
        }
        jf4.o(jtm0.p(str, obj, comparable));
    }

    public static void D(int i, int i2) {
        String strP;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strP = jtm0.p("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    jf4.o(twn.m(i2, "negative size: "));
                    return;
                }
                strP = jtm0.p("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strP);
        }
    }

    public static void E(ig00 ig00Var, String str, Object obj) {
        if (ig00Var != null) {
            return;
        }
        hny.u(jtm0.p(str, obj));
    }

    public static void F(Object obj) {
        obj.getClass();
    }

    public static void G(Object obj, String str) {
        if (obj != null) {
            return;
        }
        hny.u(str);
    }

    public static void H(int i, int i2) {
        if (i < 0 || i > i2) {
            v4i0.m(t(i, i2, "index"));
        }
    }

    public static void I(int i, int i2, int i3) {
        String strT;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strT = t(i, i3, "start index");
            } else {
                strT = (i2 < 0 || i2 > i3) ? t(i2, i3, "end index") : jtm0.p("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strT);
        }
    }

    public static void J(String str, boolean z) {
        if (z) {
            return;
        }
        jf4.n(str);
    }

    public static void K(boolean z) {
        if (z) {
            return;
        }
        v4i0.e();
    }

    public static final int L(float f) {
        return si30.b(f) * (-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View, android.view.ViewGroup, com.google.android.flexbox.FlexboxLayout] */
    public static final void M(FlexboxLayout flexboxLayout, ArrayList arrayList) {
        ?? imageView;
        flexboxLayout.removeAllViews();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lc90 lc90Var = (lc90) it.next();
            if (lc90Var != null) {
                if (lc90Var instanceof bc90) {
                    Context context = flexboxLayout.getContext();
                    context.getClass();
                    bc90 bc90Var = (bc90) lc90Var;
                    imageView = new TextView(context);
                    imageView.setBackground(context.getDrawable(bc90Var.f2345a));
                    c0(imageView, bc90Var);
                    imageView.setGravity(17);
                    imageView.setText(bc90Var.c);
                    TypedValue typedValue = j5d.f15927a;
                    imageView.setTextColor(context.getColor(bc90Var.b));
                    imageView.setTextSize(0, imageView.getResources().getDimension(R.dimen.text_10));
                } else if (lc90Var instanceof gc90) {
                    Context context2 = flexboxLayout.getContext();
                    context2.getClass();
                    gc90 gc90Var = (gc90) lc90Var;
                    imageView = new ImageView(context2);
                    imageView.setImageDrawable(context2.getDrawable(gc90Var.f11048a));
                    c0(imageView, gc90Var);
                }
                flexboxLayout.addView(imageView);
            }
            t9f.b();
            return;
        }
    }

    public static boolean N() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            nfq.d();
            nfq nfqVarD = nfq.d();
            nfqVarD.a();
            Context context = nfqVarD.f23449a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static final void O(ViewGroup viewGroup) {
        viewGroup.getClass();
        b5q b5qVar = new b5q(pgi0.h(pym0.j(viewGroup), b180.y));
        while (b5qVar.hasNext()) {
            ((DsShimmerView) b5qVar.next()).setVisibility(8);
        }
    }

    public static final int P(xpg0 xpg0Var, String str) {
        xpg0Var.getClass();
        int iZ = x1x.z(xpg0Var, str);
        if (iZ >= 0) {
            return iZ;
        }
        int columnCount = xpg0Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(xpg0Var.getColumnName(i));
        }
        jf4.o(b1j.k("Column '", str, "' does not exist. Available columns: [", CollectionsKt.b0(arrayList, null, null, null, null, 63), "]"));
        return 0;
    }

    public static final tkz Q(glz glzVar) {
        glzVar.getClass();
        yk50 yk50Var = glzVar.f11517a;
        while (true) {
            tkz tkzVar = (tkz) ((AtomicReference) yk50Var.b).get();
            if (tkzVar != null) {
                return tkzVar;
            }
            kin0 kin0VarE = qem0.e();
            rwj rwjVar = tvk.f34603a;
            tkz tkzVar2 = new tkz(glzVar, kotlin.coroutines.e.c(kin0VarE, ys10.f43147a.x()));
            AtomicReference atomicReference = (AtomicReference) yk50Var.b;
            do {
                yje yjeVar = null;
                if (atomicReference.compareAndSet(null, tkzVar2)) {
                    rwj rwjVar2 = tvk.f34603a;
                    qjj.W(tkzVar2, ys10.f43147a.x(), null, new kaw(tkzVar2, yjeVar, (byte) 17), 2);
                    return tkzVar2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final String R(mer merVar) {
        mp9 mp9VarJ;
        g950 g950Var;
        merVar.getClass();
        mp9 mp9VarS = ary.A(merVar) ? S(merVar) : null;
        if (mp9VarS != null && (mp9VarJ = rek.j(mp9VarS)) != null) {
            if (mp9VarJ instanceof d0d0) {
                ary.A(mp9VarJ);
                mp9 mp9VarB = rek.b(rek.j(mp9VarJ), i13.x);
                if (mp9VarB != null && (g950Var = (g950) ld9.f19838a.get(rek.g(mp9VarB))) != null) {
                    return g950Var.b();
                }
            } else if (mp9VarJ instanceof fyj0) {
                int i = jd9.l;
                LinkedHashMap linkedHashMap = jxk0.i;
                String strX = m7x.x((fyj0) mp9VarJ);
                g950 g950Var2 = strX == null ? null : (g950) linkedHashMap.get(strX);
                if (g950Var2 != null) {
                    return g950Var2.b();
                }
            }
        }
        return null;
    }

    public static final mp9 S(mp9 mp9Var) {
        mp9Var.getClass();
        if (!jxk0.j.contains(mp9Var.getName()) && !ld9.d.contains(rek.j(mp9Var).getName())) {
            return null;
        }
        if ((mp9Var instanceof d0d0) || (mp9Var instanceof b0d0)) {
            return rek.b(mp9Var, b180.f1);
        }
        if (mp9Var instanceof fyj0) {
            return rek.b(mp9Var, pnk0.b);
        }
        return null;
    }

    public static final mp9 T(mp9 mp9Var) {
        mp9Var.getClass();
        mp9 mp9VarS = S(mp9Var);
        if (mp9VarS != null) {
            return mp9VarS;
        }
        int i = kd9.l;
        g950 name = mp9Var.getName();
        name.getClass();
        if (jxk0.e.contains(name)) {
            return rek.b(mp9Var, pnk0.c);
        }
        return null;
    }

    public static final int U(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5f ? i | 2 : i;
    }

    public static final String V(t270 t270Var) {
        int iOrdinal = t270Var.ordinal();
        if (iOrdinal == 0) {
            return "ALL_GAMES_TAB_BAR_ITEM";
        }
        if (iOrdinal == 1) {
            return "PROMO_TAB_BAR_ITEM";
        }
        if (iOrdinal == 2) {
            return "CASH_BACK_TAB_BAR_ITEM";
        }
        if (iOrdinal == 3) {
            return "FAVORITES_TAB_BAR_ITEM";
        }
        t9f.b();
        return null;
    }

    public static final boolean W(wm40 wm40Var, mp9 mp9Var) {
        wm40Var.getClass();
        mp9Var.getClass();
        vjj vjjVarJ = mp9Var.j();
        vjjVarJ.getClass();
        kzj0 kzj0VarI = ((wm40) vjjVarJ).I();
        kzj0VarI.getClass();
        wm40 wm40VarJ = oek.j(wm40Var);
        while (true) {
            char c = 0;
            if (wm40VarJ == null) {
                return false;
            }
            if (!(wm40VarJ instanceof l9z)) {
                kzj0 kzj0VarI2 = wm40VarJ.I();
                if (kzj0VarI2 == null) {
                    Object[] objArr = new Object[3];
                    switch (c) {
                        case 1:
                        case 3:
                        case 18:
                        case 20:
                            objArr[0] = "supertype";
                            break;
                        case 2:
                        case 17:
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        default:
                            objArr[0] = "subtype";
                            break;
                        case 4:
                            objArr[0] = "typeCheckingProcedureCallbacks";
                            break;
                        case 5:
                        case '\b':
                        case 23:
                            objArr[0] = "parameter";
                            break;
                        case 6:
                        case '\t':
                            objArr[0] = "argument";
                            break;
                        case 7:
                        case '\n':
                            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                            break;
                        case 11:
                            objArr[0] = "type1";
                            break;
                        case '\f':
                            objArr[0] = "type2";
                            break;
                        case '\r':
                            objArr[0] = "typeParameter";
                            break;
                        case 14:
                            objArr[0] = "typeArgument";
                            break;
                        case 15:
                            objArr[0] = "typeParameterVariance";
                            break;
                        case 16:
                            objArr[0] = "typeArgumentVariance";
                            break;
                        case 21:
                            objArr[0] = "subtypeArgumentProjection";
                            break;
                        case 22:
                            objArr[0] = "supertypeArgumentProjection";
                            break;
                    }
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                    switch (c) {
                        case 5:
                        case 6:
                            objArr[2] = "getOutType";
                            break;
                        case 7:
                        case '\n':
                            break;
                        case '\b':
                        case '\t':
                            objArr[2] = "getInType";
                            break;
                        case 11:
                        case '\f':
                            objArr[2] = "equalTypes";
                            break;
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                            objArr[2] = "getEffectiveProjectionKind";
                            break;
                        case 17:
                        case 18:
                            objArr[2] = "isSubtypeOf";
                            break;
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        case 20:
                            objArr[2] = "checkSubtypeForTheSameConstructor";
                            break;
                        case 21:
                        case 22:
                        case 23:
                            objArr[2] = "capture";
                            break;
                        default:
                            objArr[2] = "findCorrespondingSupertype";
                            break;
                    }
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                tft0 tft0VarH = null;
                arrayDeque.add(new ofn0(kzj0VarI2, null));
                iys0 iys0VarS = kzj0VarI.S();
                while (!arrayDeque.isEmpty()) {
                    ofn0 ofn0Var = (ofn0) arrayDeque.poll();
                    wsy wsyVarF = ofn0Var.f25177a;
                    iys0 iys0VarS2 = wsyVarF.S();
                    if (iys0VarS2 == null) {
                        knm0.a(3);
                        throw null;
                    }
                    if (iys0VarS == null) {
                        knm0.a(4);
                        throw null;
                    }
                    if (iys0VarS2.equals(iys0VarS)) {
                        boolean zU = wsyVarF.U();
                        for (ofn0 ofn0Var2 = ofn0Var.b; ofn0Var2 != null; ofn0Var2 = ofn0Var2.b) {
                            wsy wsyVar = ofn0Var2.f25177a;
                            List listJ = wsyVar.J();
                            kys0 kys0Var = lys0.b;
                            if (listJ != null && listJ.isEmpty()) {
                                wsyVarF = new xzs0(kys0Var.a(wsyVar.S(), wsyVar.J())).f(wsyVarF, t3u0.c);
                                break;
                            }
                            Iterator it = listJ.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    wsyVarF = new xzs0(kys0Var.a(wsyVar.S(), wsyVar.J())).f(wsyVarF, t3u0.c);
                                    break;
                                }
                                t3u0 t3u0VarA = ((pzs0) it.next()).a();
                                t3u0 t3u0Var = t3u0.c;
                                if (t3u0VarA != t3u0Var) {
                                    wsyVarF = (wsy) o2e.W(new xzs0(tke.m0(kys0Var.a(wsyVar.S(), wsyVar.J()))).f(wsyVarF, t3u0Var)).b;
                                    break;
                                }
                            }
                            zU = zU || wsyVar.U();
                        }
                        iys0 iys0VarS3 = wsyVarF.S();
                        if (iys0VarS3 == null) {
                            knm0.a(3);
                            throw null;
                        }
                        if (iys0VarS3.equals(iys0VarS)) {
                            tft0VarH = e0t0.h(wsyVarF, zU);
                            break;
                        }
                        throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + j5n0.y(iys0VarS3) + ", \n\nsupertype: " + j5n0.y(iys0VarS) + " \n" + iys0VarS3.equals(iys0VarS));
                    }
                    for (wsy wsyVar2 : iys0VarS2.b()) {
                        wsyVar2.getClass();
                        arrayDeque.add(new ofn0(wsyVar2, ofn0Var));
                    }
                }
                if (tft0VarH != null) {
                    return !ary.A(wm40VarJ);
                }
            }
            wm40VarJ = oek.j(wm40VarJ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0195  */
    /* JADX WARN: Code duplicated, block: B:110:0x019e  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db A[PHI: r6
  0x00db: PHI (r6v22 java.lang.String) = (r6v21 java.lang.String), (r6v34 java.lang.String) binds: [B:46:0x00c3, B:50:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0121  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:80:0x012e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0130  */
    /* JADX WARN: Code duplicated, block: B:84:0x0139  */
    /* JADX WARN: Code duplicated, block: B:85:0x013c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0146  */
    /* JADX WARN: Code duplicated, block: B:89:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x0164  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void X(Intent intent) {
        int iIntValue;
        int i;
        String string;
        p940 p940Var;
        String string2;
        Object[] objArr;
        String string3;
        String str;
        String string4;
        String str2;
        String string5;
        String str3;
        String string6;
        String str4;
        String string7;
        String str5;
        long j;
        long j2;
        nfq nfqVarD;
        mgq mgqVar;
        String str6;
        String str7;
        String[] strArrSplit;
        String str8;
        if (d0(intent)) {
            Y(intent.getExtras(), "_nr");
        }
        int i2 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : N()) {
            mos0 mos0Var = (mos0) FirebaseMessaging.m.get();
            if (mos0Var == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            r940 r940Var = null;
            str = null;
            String str9 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            iIntValue = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                            i = 0;
                        }
                    }
                    i = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            nfq nfqVarD2 = nfq.d();
                            try {
                                Object obj2 = cgq.l;
                                string = (String) Tasks.await(((cgq) nfqVarD2.b(dgq.class)).c());
                            } catch (InterruptedException e) {
                                e = e;
                                ohq.p(e);
                                return;
                            }
                        } catch (InterruptedException | ExecutionException e2) {
                            e = e2;
                        }
                    }
                    String str10 = string;
                    nfq nfqVarD3 = nfq.d();
                    nfqVarD3.a();
                    String packageName = nfqVarD3.f23449a.getPackageName();
                    if (pyu.l(extras)) {
                        p940Var = p940.DISPLAY_NOTIFICATION;
                    } else {
                        p940Var = p940.DATA_MESSAGE;
                    }
                    p940 p940Var2 = p940Var;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 != null) {
                        if ("high".equals(string2)) {
                            objArr = 1;
                        } else if ("normal".equals(string2)) {
                            objArr = 2;
                        } else {
                            objArr = 0;
                        }
                    } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                        objArr = 2;
                    } else {
                        string2 = extras.getString("google.priority");
                        if ("high".equals(string2)) {
                            objArr = 1;
                        } else if ("normal".equals(string2)) {
                            objArr = 2;
                        } else {
                            objArr = 0;
                        }
                    }
                    if (objArr == 2) {
                        i2 = 5;
                    } else if (objArr == 1) {
                        i2 = 10;
                    }
                    int i3 = i2;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    if (string3 != null) {
                        str = string3;
                    } else {
                        str = "";
                    }
                    string4 = extras.getString(RemoteMessageConst.FROM);
                    if (string4 != null && string4.startsWith("/topics/")) {
                        str9 = string4;
                    }
                    if (str9 != null) {
                        str2 = str9;
                    } else {
                        str2 = "";
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 != null) {
                        str3 = string5;
                    } else {
                        str3 = "";
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 != null) {
                        str4 = string6;
                    } else {
                        str4 = "";
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                        str5 = string7;
                    } else {
                        str5 = "";
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            j = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException e3) {
                            Log.w("FirebaseMessaging", "error parsing project number", e3);
                            nfqVarD = nfq.d();
                            mgqVar = nfqVarD.c;
                            nfqVarD.a();
                            str6 = mgqVar.e;
                            if (str6 != null) {
                                try {
                                    j = Long.parseLong(str6);
                                } catch (NumberFormatException e4) {
                                    Log.w("FirebaseMessaging", "error parsing sender ID", e4);
                                    nfqVarD.a();
                                    str7 = mgqVar.b;
                                    if (str7.startsWith("1:")) {
                                        strArrSplit = str7.split(Separators.COLON);
                                        if (strArrSplit.length < 2) {
                                            j = 0;
                                        } else {
                                            str8 = strArrSplit[1];
                                            if (str8.isEmpty()) {
                                                j = 0;
                                            } else {
                                                try {
                                                    j = Long.parseLong(str8);
                                                } catch (NumberFormatException e5) {
                                                    Log.w("FirebaseMessaging", "error parsing app ID", e5);
                                                    j = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        try {
                                            j = Long.parseLong(str7);
                                        } catch (NumberFormatException e6) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", e6);
                                            j = 0;
                                        }
                                    }
                                }
                            } else {
                                nfqVarD.a();
                                str7 = mgqVar.b;
                                if (str7.startsWith("1:")) {
                                    j = Long.parseLong(str7);
                                } else {
                                    strArrSplit = str7.split(Separators.COLON);
                                    if (strArrSplit.length < 2) {
                                        j = 0;
                                    } else {
                                        str8 = strArrSplit[1];
                                        if (str8.isEmpty()) {
                                            j = 0;
                                        } else {
                                            j = Long.parseLong(str8);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        nfqVarD = nfq.d();
                        mgqVar = nfqVarD.c;
                        nfqVarD.a();
                        str6 = mgqVar.e;
                        if (str6 != null) {
                            j = Long.parseLong(str6);
                        } else {
                            nfqVarD.a();
                            str7 = mgqVar.b;
                            if (str7.startsWith("1:")) {
                                j = Long.parseLong(str7);
                            } else {
                                strArrSplit = str7.split(Separators.COLON);
                                if (strArrSplit.length < 2) {
                                    j = 0;
                                } else {
                                    str8 = strArrSplit[1];
                                    if (str8.isEmpty()) {
                                        j = 0;
                                    } else {
                                        j = Long.parseLong(str8);
                                    }
                                }
                            }
                        }
                    }
                    if (j > 0) {
                        j2 = j;
                    } else {
                        j2 = 0;
                    }
                    r940Var = new r940(j2, str, str10, p940Var2, packageName, str3, i3, i, str2, str4, str5);
                }
                i = iIntValue;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    nfq nfqVarD4 = nfq.d();
                    Object obj3 = cgq.l;
                    string = (String) Tasks.await(((cgq) nfqVarD4.b(dgq.class)).c());
                }
                String str11 = string;
                nfq nfqVarD5 = nfq.d();
                nfqVarD5.a();
                String packageName2 = nfqVarD5.f23449a.getPackageName();
                if (pyu.l(extras)) {
                    p940Var = p940.DISPLAY_NOTIFICATION;
                } else {
                    p940Var = p940.DATA_MESSAGE;
                }
                p940 p940Var3 = p940Var;
                string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    objArr = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                }
                if (objArr == 2) {
                    i2 = 5;
                } else if (objArr == 1) {
                    i2 = 10;
                }
                int i4 = i2;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                    string3 = extras.getString("message_id");
                }
                if (string3 != null) {
                    str = string3;
                } else {
                    str = "";
                }
                string4 = extras.getString(RemoteMessageConst.FROM);
                if (string4 != null) {
                    str9 = string4;
                }
                if (str9 != null) {
                    str2 = str9;
                } else {
                    str2 = "";
                }
                string5 = extras.getString("collapse_key");
                if (string5 != null) {
                    str3 = string5;
                } else {
                    str3 = "";
                }
                string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                    str4 = string6;
                } else {
                    str4 = "";
                }
                string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                    str5 = string7;
                } else {
                    str5 = "";
                }
                if (extras.containsKey("google.c.sender.id")) {
                    j = Long.parseLong(extras.getString("google.c.sender.id"));
                } else {
                    nfqVarD = nfq.d();
                    mgqVar = nfqVarD.c;
                    nfqVarD.a();
                    str6 = mgqVar.e;
                    if (str6 != null) {
                        j = Long.parseLong(str6);
                    } else {
                        nfqVarD.a();
                        str7 = mgqVar.b;
                        if (str7.startsWith("1:")) {
                            j = Long.parseLong(str7);
                        } else {
                            strArrSplit = str7.split(Separators.COLON);
                            if (strArrSplit.length < 2) {
                                j = 0;
                            } else {
                                str8 = strArrSplit[1];
                                if (str8.isEmpty()) {
                                    j = 0;
                                } else {
                                    j = Long.parseLong(str8);
                                }
                            }
                        }
                    }
                }
                if (j > 0) {
                    j2 = j;
                } else {
                    j2 = 0;
                }
                r940Var = new r940(j2, str, str11, p940Var3, packageName2, str3, i4, i, str2, str4, str5);
            }
            if (r940Var == null) {
                return;
            }
            try {
                ((nos0) mos0Var).a("FCM_CLIENT_EVENT_LOGGING", new gwn("proto"), new hny((byte) 11)).z(new p35(new s940(r940Var), mwb0.f22496a, new t45(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new v4i0((byte) 21));
            } catch (RuntimeException e7) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e7);
            }
        }
    }

    public static void Y(Bundle bundle, String str) {
        try {
            nfq.d();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString(RemoteMessageConst.FROM);
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = pyu.l(bundle) ? CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL : RemoteMessageConst.DATA;
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            vp2 vp2Var = (vp2) nfq.d().b(vp2.class);
            if (vp2Var != null) {
                ((wp2) vp2Var).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static final boolean Z(qzd0 qzd0Var) {
        qzd0Var.getClass();
        List list = qzd0Var.b.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zzd0) obj).f45249a != -1) {
                arrayList.add(obj);
            }
        }
        List list2 = qzd0Var.c.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((zzd0) obj2).f45249a != -1) {
                arrayList2.add(obj2);
            }
        }
        return arrayList.size() < 5 || arrayList2.size() < 5;
    }

    public static final bk50 a0(fet fetVar) {
        View view = (View) fetVar.k(dy2.f);
        wgu0 wgu0Var = (wgu0) fetVar.k(bmd.t);
        boolean zG = fetVar.g(view) | fetVar.g(wgu0Var);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            wgu0Var.d();
            objP = new bk50(view);
            fetVar.o0(objP);
        }
        return (bk50) objP;
    }

    public static List b0(List list) {
        if (list instanceof b4x) {
            return ((b4x) list).y();
        }
        if (list instanceof yg00) {
            return ((yg00) list).f42563a;
        }
        return list instanceof RandomAccess ? new wg00(list) : new yg00(list);
    }

    public static final void c0(View view, lc90 lc90Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) view.getContext().getResources().getDimension(R.dimen.icon_size_18), (int) view.getContext().getResources().getDimension(R.dimen.icon_size_18));
        marginLayoutParams.setMarginStart((int) view.getContext().getResources().getDimension(R.dimen.space_2));
        marginLayoutParams.setMarginEnd((int) view.getContext().getResources().getDimension(R.dimen.space_2));
        marginLayoutParams.topMargin = (int) view.getContext().getResources().getDimension(R.dimen.space_2);
        view.setLayoutParams(marginLayoutParams);
    }

    public static boolean d0(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c A[PHI: r11
  0x004c: PHI (r11v11 float) = (r11v4 float), (r11v12 float) binds: [B:16:0x0059, B:13:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0073 A[PHI: r11
  0x0073: PHI (r11v9 float) = (r11v6 float), (r11v10 float) binds: [B:24:0x0080, B:21:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    public static final long e0(int i, int i2, int[] iArr, long j) {
        float f;
        float fIntBitsToFloat;
        float f2;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3 = Math.abs(iArr[0]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j >> 32)) - (i * (-1.0f));
        float fIntBitsToFloat4 = Math.abs(iArr[1]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j & 4294967295L)) - (i2 * (-1.0f));
        int i3 = (int) (j >> 32);
        if (Float.intBitsToFloat(i3) >= 0.0f) {
            f = (iArr[0] * (-1.0f)) + fIntBitsToFloat3;
            fIntBitsToFloat = Float.intBitsToFloat(i3);
            if (f > fIntBitsToFloat) {
                f = fIntBitsToFloat;
            }
        } else {
            f = (iArr[0] * (-1.0f)) + fIntBitsToFloat3;
            fIntBitsToFloat = Float.intBitsToFloat(i3);
            if (f < fIntBitsToFloat) {
                f = fIntBitsToFloat;
            }
        }
        int i4 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i4) >= 0.0f) {
            f2 = (iArr[1] * (-1.0f)) + fIntBitsToFloat4;
            fIntBitsToFloat2 = Float.intBitsToFloat(i4);
            if (f2 > fIntBitsToFloat2) {
                f2 = fIntBitsToFloat2;
            }
        } else {
            f2 = (iArr[1] * (-1.0f)) + fIntBitsToFloat4;
            fIntBitsToFloat2 = Float.intBitsToFloat(i4);
            if (f2 < fIntBitsToFloat2) {
                f2 = fIntBitsToFloat2;
            }
        }
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final void f(mdm mdmVar, ArrayList arrayList, boolean z, Function1 function1, Function0 function0, fet fetVar, int i) {
        mdm mdmVar2;
        int i2;
        k6z k6zVar;
        function1.getClass();
        function0.getClass();
        fetVar.g0(1256102542);
        if ((i & 6) == 0) {
            mdmVar2 = mdmVar;
            i2 = (fetVar.g(mdmVar2) ? 4 : 2) | i;
        } else {
            mdmVar2 = mdmVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(arrayList) : fetVar.i(arrayList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(5) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function0) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            if (z) {
                fetVar.e0(228742517);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(228743441);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            jm40 jm40Var = jm40.b;
            float f = 1.0f;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarW, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (arrayList.isEmpty()) {
                fetVar.e0(2145499065);
                jcb.l(s5x0.L(jm40Var, 0.0f, 24.0f, 1), mdmVar2, true, null, fetVar, ((i3 << 3) & 112) | 384, 8);
                x1x.l((i3 >> 15) & 14, 0, fetVar, s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), function0);
                fetVar.r(false);
            } else {
                fetVar.e0(2144155928);
                fetVar.e0(2008828835);
                int i4 = 0;
                while (i4 < arrayList.size()) {
                    a0z a0zVar = (a0z) arrayList.get(i4);
                    mm40 mm40VarW2 = o7k0.w(o7k0.d(jm40Var, f), null, false, 3);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(mm40VarW2, 0.0f, 4.0f);
                    boolean z2 = (i3 & 57344) == 16384;
                    Object objP = fetVar.P();
                    if (z2 || objP == ukd.f35823a) {
                        objP = new i1y(function1, (byte) 16);
                        fetVar.o0(objP);
                    }
                    qim0.d(mm40VarK, a0zVar, (Function1) objP, fetVar, 384);
                    if (i4 == 4) {
                        break;
                    }
                    i4++;
                    f = 1.0f;
                }
                fetVar.r(false);
                if (arrayList.size() > 5) {
                    fetVar.e0(2144984000);
                    obc.d(bmd.n.a(k6zVar), u1c.M(1257594810, new wr4(function0, (byte) 7), fetVar), fetVar, 56);
                    fetVar.r(false);
                } else {
                    fetVar.e0(2145474110);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) mdmVar, (Object) arrayList, z, function1, (wdr) function0, i, (byte) 24);
        }
    }

    public static final ftc0 f0(etc0 etc0Var) {
        etc0Var.getClass();
        return new ftc0(etc0Var.f8369a, etc0Var.b, etc0Var.c, etc0Var.d);
    }

    public static final o2g0 g0(r2g0 r2g0Var) {
        r2g0Var.getClass();
        String str = r2g0Var.f29733a;
        if (str == null) {
            str = "";
        }
        boolean zD = Intrinsics.d(r2g0Var.b, Boolean.TRUE);
        Integer num = r2g0Var.c;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = r2g0Var.d;
        return new o2g0(iIntValue, num2 != null ? num2.intValue() : 0, str, zD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(final d250 d250Var, final Function1 function1, fet fetVar, int i) {
        final byte b;
        boolean z;
        d250Var.getClass();
        fetVar.g0(-957881270);
        int i2 = (fetVar.g(d250Var) ? 32 : 16) | i | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 5;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            float f = xfn.a(fetVar).c;
            float f2 = xfn.a(fetVar).c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, f, 0.0f, f2, 8.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            a0i a0iVar = d250Var.b;
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new pd10(function1, b2);
                fetVar.o0(objP);
            }
            ntr.s(mm40VarD2, a0iVar, (Function0) objP, fetVar, 6);
            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
            a4x a4xVar = d250Var.c;
            int i4 = i2 & 112;
            boolean z3 = (i3 == 256) | (i4 == 32);
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                b = 0;
                objP2 = new Function1() { // from class: a.qh10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b;
                        d250 d250Var2 = d250Var;
                        Function1 function2 = function1;
                        String str = (String) obj;
                        switch (b3) {
                            case 0:
                                str.getClass();
                                function2.invoke(new k150(str, d250Var2.f5341a));
                                break;
                            default:
                                str.getClass();
                                function2.invoke(new p050(d250Var2.f5341a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            } else {
                b = 0;
            }
            Function1 function2 = (Function1) objP2;
            byte b3 = i3 == 256 ? (byte) 1 : b;
            if (i4 == 32) {
                b = 1;
            }
            boolean z4 = b3 | b;
            Object objP3 = fetVar.P();
            if (z4 != 0 || objP3 == cl5Var) {
                z = true;
                final char c = 1 == true ? 1 : 0;
                objP3 = new Function1() { // from class: a.qh10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = c;
                        d250 d250Var2 = d250Var;
                        Function1 function3 = function1;
                        String str = (String) obj;
                        switch (b4) {
                            case 0:
                                str.getClass();
                                function3.invoke(new k150(str, d250Var2.f5341a));
                                break;
                            default:
                                str.getClass();
                                function3.invoke(new p050(d250Var2.f5341a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP3);
            } else {
                z = true;
            }
            idx.j(mm40VarD3, a4xVar, function2, (Function1) objP3, fetVar, 6);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k110(d250Var, function1, i, b2);
        }
    }

    public static final m0k0 h0(l9s l9sVar, String str, long j, boolean z) {
        Object next;
        Integer intOrNull;
        Integer intOrNull2;
        jts jtsVar;
        jts jtsVar2;
        l9sVar.getClass();
        str.getClass();
        long jC = l9sVar.c();
        String strN = l9sVar.N();
        Long l = (Long) CollectionsKt.firstOrNull(l9sVar.p());
        long jLongValue = l != null ? l.longValue() : 0L;
        String strJ = l9sVar.j();
        String str2 = (String) CollectionsKt.firstOrNull(l9sVar.G());
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) CollectionsKt.W(1, l9sVar.G());
        if (str3 == null) {
            str3 = "";
        }
        Long l2 = (Long) CollectionsKt.firstOrNull(l9sVar.m());
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        String strG = l9sVar.g();
        String str4 = (String) CollectionsKt.firstOrNull(l9sVar.v());
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) CollectionsKt.W(1, l9sVar.v());
        if (str5 == null) {
            str5 = "";
        }
        int iMax = Math.max(l9sVar.p().size(), l9sVar.m().size());
        pqs pqsVarZ = l9sVar.z();
        Object obj = null;
        String str6 = pqsVarZ != null ? pqsVarZ.b : null;
        if (str6 == null) {
            str6 = "";
        }
        String strO = l9sVar.o();
        String strL = l9sVar.L();
        boolean zE = l9sVar.e();
        long jU = l9sVar.u();
        long jB = l9sVar.b();
        boolean zE2 = l9sVar.E();
        long jD = l9sVar.d();
        long jA = l9sVar.a();
        String strI = l9sVar.i();
        pqs pqsVarZ2 = l9sVar.z();
        int i = pqsVarZ2 != null ? pqsVarZ2.f : -1;
        pqs pqsVarZ3 = l9sVar.z();
        int i2 = pqsVarZ3 != null ? pqsVarZ3.g : -1;
        pqs pqsVarZ4 = l9sVar.z();
        String str7 = (pqsVarZ4 == null || (jtsVar2 = pqsVarZ4.i) == null) ? null : jtsVar2.f17115a;
        String str8 = str7 == null ? "" : str7;
        pqs pqsVarZ5 = l9sVar.z();
        String str9 = (pqsVarZ5 == null || (jtsVar = pqsVarZ5.i) == null) ? null : jtsVar.b;
        String str10 = str9 != null ? str9 : "";
        List listP = l9sVar.P();
        ano0 ano0Var = ano0.c;
        long j2 = jLongValue2;
        ArrayList arrayList = new ArrayList(r3d.q(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(((cno0) it.next()).f4666a);
        }
        Iterator it2 = r3d.r(arrayList).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((bno0) next).f2894a != ano0Var);
        bno0 bno0Var = (bno0) next;
        int iIntValue = (bno0Var == null || (intOrNull2 = StringsKt.toIntOrNull(bno0Var.c)) == null) ? 0 : intOrNull2.intValue();
        List listP2 = l9sVar.P();
        ano0 ano0Var2 = ano0.c;
        ArrayList arrayList2 = new ArrayList(r3d.q(listP2, 10));
        Iterator it3 = listP2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((cno0) it3.next()).f4666a);
        }
        for (Object obj2 : r3d.r(arrayList2)) {
            if (((bno0) obj2).f2894a == ano0Var2) {
                obj = obj2;
                break;
            }
        }
        bno0 bno0Var2 = (bno0) obj;
        return new m0k0(jC, strN, jLongValue, strJ, str2, str3, j2, strG, str4, str5, iMax, str6, i, i2, str8, str10, iIntValue, (bno0Var2 == null || (intOrNull = StringsKt.toIntOrNull(bno0Var2.d)) == null) ? 0 : intOrNull.intValue(), strO, str, "", strL, j, zE, jU, jB, zE2, jD, jA, strI, z, false, l9sVar.A() != boh.UNKNOWN);
    }

    public static final void i(mm40 mm40Var, uv20 uv20Var, Function0 function0, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, ugd ugdVar5, ugd ugdVar6, fet fetVar, int i) {
        int i2;
        boolean z;
        Object obj = uv20Var.f;
        function0.getClass();
        fetVar.g0(-1339907181);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(uv20Var) : fetVar.i(uv20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(ugdVar3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(ugdVar4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(ugdVar5) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(ugdVar6) ? 67108864 : 33554432;
        }
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            int i3 = i2;
            mm40 mm40VarW = y860.W(mm40Var, null, null, false, null, function0, 28);
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            Object obj2 = uv20Var.h;
            boolean z2 = obj instanceof qv20;
            zhg0 zhg0Var = zhg0.f44392a;
            if (z2) {
                fetVar.e0(811976403);
                fetVar.r(false);
            } else {
                fetVar.e0(811919704);
                ugdVar.j(zhg0Var, obj, fetVar, Integer.valueOf(((i3 >> 3) & 896) | 6));
                fetVar.r(false);
            }
            ugdVar5.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 18) & 112) | 6));
            if (uv20Var.d) {
                z = false;
                fetVar.e0(812084531);
                fetVar.r(false);
            } else {
                fetVar.e0(812037442);
                z = false;
                h97.p(((i3 >> 9) & 112) | 6, ugdVar2, zhg0Var, fetVar, false);
            }
            if (obj2 == null) {
                fetVar.e0(812119715);
                fetVar.r(z);
            } else {
                fetVar.e0(812119716);
                ugdVar3.j(zhg0Var, obj2, fetVar, Integer.valueOf(((i3 >> 9) & 896) | 6));
                fetVar.r(z);
            }
            if (uv20Var.g) {
                fetVar.e0(812231595);
                h97.p(((i3 >> 15) & 112) | 6, ugdVar4, zhg0Var, fetVar, z);
            } else {
                fetVar.e0(812270035);
                fetVar.r(z);
            }
            h97.p(((i3 >> 21) & 112) | 6, ugdVar6, zhg0Var, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ez3(mm40Var, (Object) uv20Var, (Object) function0, (Object) ugdVar, (Object) ugdVar2, (Object) ugdVar3, (Object) ugdVar4, (Object) ugdVar5, (Object) ugdVar6, i, (byte) 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static final gko0 i0(rko0 rko0Var) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        List list = rko0Var.f30658a;
        if (list == null) {
            list = iun.f15405a;
        }
        List<lmo0> list2 = rko0Var.b;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            for (lmo0 lmo0Var : list2) {
                Long l = lmo0Var.f20307a;
                long jLongValue = l != null ? l.longValue() : 0L;
                List<z2u0> list3 = lmo0Var.b;
                if (list3 != null) {
                    arrayList4 = new ArrayList(r3d.q(list3, 10));
                    for (z2u0 z2u0Var : list3) {
                        Long l2 = z2u0Var.f43689a;
                        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                        String str = z2u0Var.b;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = z2u0Var.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList4.add(new t2u0(jLongValue2, str, str2));
                    }
                } else {
                    arrayList4 = iun.f15405a;
                }
                arrayList.add(new cmo0(jLongValue, arrayList4));
            }
        } else {
            arrayList = iun.f15405a;
        }
        List<List> list4 = rko0Var.c;
        if (list4 != null) {
            arrayList2 = new ArrayList(r3d.q(list4, 10));
            for (List<ajo0> list5 : list4) {
                ArrayList arrayList5 = new ArrayList(r3d.q(list5, 10));
                for (ajo0 ajo0Var : list5) {
                    Long l3 = ajo0Var.f987a;
                    long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                    List<r2u0> list6 = ajo0Var.b;
                    if (list6 != null) {
                        arrayList3 = new ArrayList(r3d.q(list6, 10));
                        for (r2u0 r2u0Var : list6) {
                            Long l4 = r2u0Var.f29756a;
                            long jLongValue4 = l4 != null ? l4.longValue() : 0L;
                            String str3 = r2u0Var.b;
                            String str4 = str3 == null ? "" : str3;
                            List list7 = r2u0Var.c;
                            if (list7 == null) {
                                list7 = iun.f15405a;
                            }
                            List list8 = list7;
                            String str5 = r2u0Var.d;
                            arrayList3.add(new l2u0(jLongValue4, str4, str5 == null ? "" : str5, list8));
                        }
                    } else {
                        arrayList3 = iun.f15405a;
                    }
                    arrayList5.add(new uio0(jLongValue3, arrayList3));
                }
                arrayList2.add(arrayList5);
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        List list9 = rko0Var.d;
        if (list9 == null) {
            list9 = iun.f15405a;
        }
        return new gko0(list, arrayList, arrayList2, list9);
    }

    public static final void j(xrp xrpVar, fet fetVar, int i) {
        float f;
        fetVar.g0(-545207962);
        int i2 = (i & 6) == 0 ? (fetVar.g(xrpVar) ? 4 : 2) | i : i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
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
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(i120.Q(jm40Var, jM73getBlack400d7_KjU, ugg0Var2), "MatchStatisticsTestTag");
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE0);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.e0(-1802122688);
            int i3 = 0;
            for (Object obj : xrpVar.f41379a) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                vrp vrpVar = (vrp) obj;
                if (i3 == 0) {
                    zcl zclVar2 = qmk.f28987a;
                    f = 4.0f;
                } else {
                    zcl zclVar3 = qmk.f28987a;
                    f = 0.0f;
                }
                jeb.z(s5x0.M(jm40Var, 4.0f, f, 4.0f, 4.0f), vrpVar, fetVar, 0);
                i3 = i4;
            }
            ohs0.x(fetVar, false, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(xrpVar, i, (byte) 27);
        }
    }

    public static AbstractList j0(List list, tdr tdrVar) {
        return list instanceof RandomAccess ? new ah00(list, tdrVar) : new bh00(list, tdrVar);
    }

    public static final void k(mm40 mm40Var, Calendar calendar, Locale locale, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        calendar.getClass();
        fetVar.g0(-1665965138);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(calendar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(locale) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = ((i2 & 896) == 256) | fetVar.g(calendar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale, "LLLL yyyy"), locale).format(calendar.getTime());
                fetVar.o0(objP);
            }
            String str = (String) objP;
            zx7 zx7Var = gqw0.d;
            mm40 mm40VarE = o7k0.e(o7k0.d(mm40Var, 1.0f), sq40.f32612a);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarE, 16.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            str.getClass();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, s5x0.L(o7k0.d(mm40Var, 1.0f), 8.0f, 0.0f, 2), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, g1t0.m(), fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var, (Object) calendar, (Object) locale, i, (byte) 14);
        }
    }

    public static final void l(String str, boolean z, Function0 function0, boolean z2, mm40 mm40Var, fet fetVar, int i) {
        String str2;
        int i2;
        fet fetVar2;
        Pair pair;
        str.getClass();
        function0.getClass();
        fetVar.g0(1919882242);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (fetVar.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(mm40Var) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (z) {
                fetVar.e0(-867388688);
                zfn zfnVar = zaq0.b;
                pair = new Pair(new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimaryForeground()));
                fetVar.r(false);
            } else {
                fetVar.e0(-867302570);
                zfn zfnVar2 = zaq0.b;
                pair = new Pair(new y3d(((ThemeColors) fetVar.k(zfnVar2)).getSecondaryButtonBackground()), new y3d(((ThemeColors) fetVar.k(zfnVar2)).getSecondaryButtonForeground()));
                fetVar.r(false);
            }
            long j = ((y3d) pair.f46059a).f41946a;
            long j2 = ((y3d) pair.b).f41946a;
            zcl zclVar = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), j, jd8.n);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            ncg0 ncg0VarA = lcg0.a(0.0f, 7);
            if (!z2) {
                ncg0VarA = null;
            }
            ncg0 ncg0Var = ncg0VarA;
            boolean z3 = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new a2z(function0, (byte) 23);
                fetVar.o0(objP2);
            }
            mm40 mm40VarK = s5x0.K(y860.W(mm40VarQ, gy40Var, ncg0Var, false, null, (Function0) objP2, 28), 8.0f, 10.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(str2, jr8.f16991a.b(jm40.b, gqw0.e), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, y9q0.a(new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), j2, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, i2 & 14, 24960, 109564);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ue(str, z, function0, z2, mm40Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(mm40 mm40Var, deo0 deo0Var, fet fetVar, int i) {
        final byte b;
        pcy pcyVar;
        final deo0 deo0Var2;
        final byte b2;
        final deo0 deo0Var3 = deo0Var;
        fet fetVar2 = fetVar;
        deo0Var3.getClass();
        fetVar2.g0(-1898712072);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(deo0Var3) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, 30.0f);
            String str = deo0Var3.b;
            pz40 pz40Var = s6t0.f31722a;
            y9q0 y9q0VarN = g1t0.n();
            long textPrimary = s6t0.b().f33626a.getTextPrimary();
            long j = qmk.p;
            long j2 = qmk.r;
            long j3 = qmk.n;
            v8q0.a(str, mm40VarS, textPrimary, new n05(j, j2, j3), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0VarN, fetVar, 0, 24960, 109552);
            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                b = 0;
                objP = new Function0() { // from class: a.b4a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b;
                        deo0 deo0Var4 = deo0Var3;
                        switch (b3) {
                            case 0:
                                return deo0Var4.c;
                            default:
                                return deo0Var4.f;
                        }
                    }
                };
                fetVar.o0(objP);
            } else {
                b = 0;
            }
            kkb.p(b, fetVar, mm40VarN, (Function0) objP);
            mm40 mm40VarN2 = s5x0.N(new x7z(1.0f, true), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            String str2 = deo0Var3.d;
            y9q0 y9q0VarN2 = g1t0.n();
            long textPrimary2 = s6t0.b().f33626a.getTextPrimary();
            long j4 = qmk.q;
            pcy pcyVar3 = pcyVar;
            v8q0.a(str2, null, textPrimary2, new n05(j4, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarN2, fetVar, 0, 24960, 110578);
            mm40 mm40VarN3 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            mm40 mm40VarN4 = s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11);
            boolean z3 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                deo0Var2 = deo0Var;
                b2 = 1;
                objP2 = new Function0() { // from class: a.b4a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        deo0 deo0Var4 = deo0Var2;
                        switch (b3) {
                            case 0:
                                return deo0Var4.c;
                            default:
                                return deo0Var4.f;
                        }
                    }
                };
                fetVar.o0(objP2);
            } else {
                deo0Var2 = deo0Var;
                b2 = 1;
            }
            kkb.p(0, fetVar, mm40VarN4, (Function0) objP2);
            boolean z4 = b2;
            deo0Var3 = deo0Var;
            v8q0.a(deo0Var2.e, null, s6t0.b().f33626a.getSecondary(), new n05(j, j4, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110578);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, z4, z4, z4);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(mm40Var, deo0Var3, i, (byte) 25);
        }
    }

    public static final void n(mm40 mm40Var, final hh8 hh8Var, final Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        hh8Var.getClass();
        function1.getClass();
        fetVar.g0(-1794047973);
        int i2 = i | 6 | (fetVar.g(hh8Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            rqm rqmVar = hh8Var.c;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z = (i3 == 256) | (i4 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new Function0() { // from class: a.iue0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (b) {
                            case 0:
                                function1.invoke(hh8Var);
                                break;
                            default:
                                function1.invoke(hh8Var);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            int i5 = (i3 == 256 ? (byte) 1 : (byte) 0) | (i4 == 32 ? (byte) 1 : (byte) 0);
            Object objP2 = fetVar.P();
            if (i5 != 0 || objP2 == cl5Var) {
                objP2 = new Function0() { // from class: a.iue0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (b2) {
                            case 0:
                                function1.invoke(hh8Var);
                                break;
                            default:
                                function1.invoke(hh8Var);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            }
            jm40 jm40Var = jm40.b;
            obc.q(jm40Var, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 6, 172);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var2, hh8Var, function1, i, (byte) 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    public static final tai0 o(e7z e7zVar, boolean z) {
        lm40 lm40Var = (lm40) e7zVar.h1.g;
        yzj yzjVar = null;
        if ((lm40Var.d & 8) != 0) {
            loop0: while (lm40Var != null) {
                if ((lm40Var.c & 8) == 0) {
                    if ((lm40Var.d & 8) != 0) {
                        break;
                        break;
                    }
                    lm40Var = lm40Var.f;
                } else {
                    lm40 lm40VarV = lm40Var;
                    xz40 xz40Var = null;
                    while (lm40VarV != null) {
                        if (lm40VarV instanceof qai0) {
                            yzjVar = lm40VarV;
                            break loop0;
                        }
                        if ((lm40VarV.c & 8) != 0 && (lm40VarV instanceof f3k)) {
                            int i = 0;
                            for (lm40 lm40Var2 = ((f3k) lm40VarV).p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
                                if ((lm40Var2.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        lm40VarV = lm40Var2;
                                    } else {
                                        if (xz40Var == null) {
                                            xz40Var = new xz40(new lm40[16]);
                                        }
                                        if (lm40VarV != null) {
                                            xz40Var.b(lm40VarV);
                                            lm40VarV = null;
                                        }
                                        xz40Var.b(lm40Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        lm40VarV = vcc.V(xz40Var);
                    }
                    if ((lm40Var.d & 8) != 0) {
                        break;
                    }
                    lm40Var = lm40Var.f;
                }
            }
        }
        yzjVar.getClass();
        lm40 lm40Var3 = ((lm40) ((qai0) yzjVar)).f20279a;
        nai0 nai0VarX = e7zVar.x();
        if (nai0VarX == null) {
            nai0VarX = new nai0();
        }
        return new tai0(lm40Var3, z, e7zVar, nai0VarX);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static final void p(mm40 mm40Var, kvl0 kvl0Var, fet fetVar, int i) {
        kvl0 kvl0Var2;
        fet fetVar2;
        Function0 function0;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        Function0 function1;
        ?? r1;
        fet fetVar3;
        fet fetVar4;
        jm40 jm40Var;
        fet fetVar5;
        fet fetVar6 = fetVar;
        kvl0Var.getClass();
        fetVar6.g0(1201667286);
        int i2 = i | (fetVar6.g(mm40Var) ? 4 : 2) | (fetVar6.g(kvl0Var) ? 32 : 16);
        if (fetVar6.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(qw3Var, xx7Var, fetVar6, 0);
            int iHashCode = Long.hashCode(fetVar6.T);
            bh90 bh90VarM = fetVar6.m();
            mm40 mm40VarC0 = kbc.c0(fetVar6, mm40Var);
            mkd.c0.getClass();
            fetVar6.i0();
            boolean z = fetVar6.S;
            Function0 function2 = e7z.u1;
            if (z) {
                fetVar6.l(function2);
            } else {
                fetVar6.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar6, x5dVarA, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar6, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar6, numValueOf, shdVar7);
            jpm0.n(fetVar6);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar6, mm40VarC0, shdVar8);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(s5x0.L(o7k0.e(jm40Var2, 48.0f), 12.0f, 0.0f, 2), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar6.T);
            bh90 bh90VarM2 = fetVar6.m();
            mm40 mm40VarC1 = kbc.c0(fetVar6, mm40VarN);
            fetVar6.i0();
            if (fetVar6.S) {
                fetVar6.l(function2);
            } else {
                fetVar6.r0();
            }
            jpm0.o(fetVar6, tj30VarC, shdVar5);
            jpm0.o(fetVar6, bh90VarM2, shdVar6);
            vqd.u(iHashCode2, fetVar6, shdVar7, fetVar6);
            jpm0.o(fetVar6, mm40VarC1, shdVar8);
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var2, 1.0f), "STADIUM_NAME");
            String str = kvl0Var.b;
            y9q0 y9q0VarJ = g1t0.j();
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarE0, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarJ, fetVar, 48, 24960, 110584);
            fet fetVar7 = fetVar;
            fetVar7.r(true);
            mm40 mm40VarL = s5x0.L(o7k0.f(jm40Var2, 92.0f, 116.0f), 12.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar7, 48);
            int iHashCode3 = Long.hashCode(fetVar7.T);
            bh90 bh90VarM3 = fetVar7.m();
            mm40 mm40VarC2 = kbc.c0(fetVar7, mm40VarL);
            fetVar7.i0();
            if (fetVar7.S) {
                function0 = function2;
                fetVar7.l(function0);
            } else {
                function0 = function2;
                fetVar7.r0();
            }
            jpm0.o(fetVar7, thg0VarA, shdVar5);
            jpm0.o(fetVar7, bh90VarM3, shdVar6);
            vqd.u(iHashCode3, fetVar7, shdVar7, fetVar7);
            x7z x7zVarI = ohs0.i(fetVar7, mm40VarC2, shdVar8, 1.0f, true);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar7, 0);
            int iHashCode4 = Long.hashCode(fetVar7.T);
            bh90 bh90VarM4 = fetVar7.m();
            mm40 mm40VarC3 = kbc.c0(fetVar7, x7zVarI);
            fetVar7.i0();
            if (fetVar7.S) {
                fetVar7.l(function0);
            } else {
                fetVar7.r0();
            }
            jpm0.o(fetVar7, x5dVarA2, shdVar5);
            jpm0.o(fetVar7, bh90VarM4, shdVar6);
            vqd.u(iHashCode4, fetVar7, shdVar7, fetVar7);
            jpm0.o(fetVar7, mm40VarC3, shdVar8);
            if (kvl0Var.d == null) {
                fetVar7.e0(1416066381);
                fetVar7.r(false);
                kvl0Var2 = kvl0Var;
                shdVar4 = shdVar6;
                shdVar = shdVar8;
                shdVar2 = shdVar7;
                function1 = function0;
                shdVar3 = shdVar5;
                r1 = 0;
                fetVar3 = fetVar7;
            } else {
                fetVar7.e0(1416066382);
                kvl0Var2 = kvl0Var;
                shdVar = shdVar8;
                shdVar2 = shdVar7;
                shdVar3 = shdVar5;
                shdVar4 = shdVar6;
                function1 = function0;
                r1 = 0;
                v8q0.a(kvl0Var.d, o2e.e0(jm40Var2, "STADIUM_CAPACITY"), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.n(), fetVar, 48, 24960, 110584);
                fet fetVar8 = fetVar;
                fetVar8.r(false);
                fetVar3 = fetVar8;
            }
            if (kvl0Var2.e == null) {
                fetVar3.e0(1416497839);
                fetVar3.r(r1);
                fetVar4 = fetVar3;
            } else {
                fetVar3.e0(1416497840);
                v8q0.a(kvl0Var2.e, o2e.e0(r1, "STADIUM_DATE"), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.n(), fetVar, 48, 24960, 110584);
                fet fetVar9 = fetVar;
                fetVar9.r(r1);
                fetVar4 = fetVar9;
            }
            if (kvl0Var2.f == null) {
                fetVar4.e0(1416930599);
                fetVar4.r(r1);
                jm40Var = jm40Var2;
                fetVar5 = fetVar4;
            } else {
                fetVar4.e0(1416930600);
                jm40Var = r1;
                v8q0.a(kvl0Var2.f, o2e.e0(r1, "STADIUM_ARCHITECT"), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.n(), fetVar, 48, 24960, 110584);
                fet fetVar10 = fetVar;
                fetVar10.r(r1);
                fetVar5 = fetVar10;
            }
            fetVar5.r(true);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_stadium, r1, fetVar5);
            Object objP = fetVar5.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = ju70.T(pm80VarF, new m78(s6t0.b().f33626a.getSecondary40(), 5), null, 10);
                fetVar5.o0(objP);
            }
            pm80 pm80Var = (pm80) objP;
            Object objP2 = fetVar5.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar5.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            String str2 = kvl0Var2.c;
            Object objP3 = fetVar5.P();
            if (objP3 == obj) {
                objP3 = new ryc0(pz40Var2, (byte) 22);
                fetVar5.o0(objP3);
            }
            mz3 mz3VarX = l7x.X(str2, (Function1) objP3, null, fetVar5, 384, 26);
            jm40 jm40Var3 = jm40Var;
            mm40 mm40VarP = o7k0.p(jm40Var3, 158.0f, 92.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP);
            tj30 tj30VarC2 = zq8.c(zx7Var, r1);
            int iHashCode5 = Long.hashCode(fetVar5.T);
            bh90 bh90VarM5 = fetVar5.m();
            mm40 mm40VarC4 = kbc.c0(fetVar5, mm40VarE);
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(function1);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, tj30VarC2, shdVar3);
            jpm0.o(fetVar5, bh90VarM5, shdVar4);
            vqd.u(iHashCode5, fetVar5, shdVar2, fetVar5);
            jpm0.o(fetVar5, mm40VarC4, shdVar);
            lz3 lz3Var = (lz3) pz40Var2.getValue();
            jr8 jr8Var = jr8.f16991a;
            if (lz3Var != null && ((lz3Var instanceof jz3) || (lz3Var instanceof iz3))) {
                fetVar5.e0(-1541336708);
                j0x.b(pm80Var, null, jr8Var.a(jm40Var3), null, gqw0.B, 0.0f, null, fetVar5, 24632, 104);
                fetVar5.r(r1);
            } else {
                fetVar5.e0(-1541015114);
                j0x.b(mz3VarX, null, jr8Var.a(jm40Var3), null, gqw0.A, 0.0f, null, fetVar5, 24624, 104);
                fetVar5.r(r1);
            }
            ohs0.x(fetVar5, true, true, true);
            fetVar2 = fetVar5;
        } else {
            kvl0Var2 = kvl0Var;
            fetVar6.X();
            fetVar2 = fetVar6;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(mm40Var, kvl0Var2, i, (byte) 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x020f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0220  */
    /* JADX WARN: Code duplicated, block: B:118:0x0237 A[LOOP:0: B:116:0x0231->B:118:0x0237, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x025c A[LOOP:1: B:120:0x0256->B:122:0x025c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0131  */
    /* JADX WARN: Code duplicated, block: B:67:0x0136  */
    /* JADX WARN: Code duplicated, block: B:69:0x0139  */
    /* JADX WARN: Code duplicated, block: B:71:0x013c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0151  */
    /* JADX WARN: Code duplicated, block: B:75:0x0161  */
    /* JADX WARN: Code duplicated, block: B:76:0x0171  */
    /* JADX WARN: Code duplicated, block: B:77:0x0184  */
    /* JADX WARN: Code duplicated, block: B:78:0x0197  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ff  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v23, types: [int] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.CharSequence, java.lang.StringBuilder] */
    public static final void q(lc00 lc00Var, m9s m9sVar, gdh0 gdh0Var, ctf0 ctf0Var) {
        fdh0 fdh0Var;
        boolean z;
        ?? r8;
        String str;
        int iOrdinal;
        String strA;
        String str2;
        int iOrdinal2;
        float f;
        int iOrdinal3;
        float f2;
        int iOrdinal4;
        float f3;
        int iOrdinal5;
        float f4;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it2;
        char c;
        char c2;
        List list = gdh0Var.g;
        List list2 = gdh0Var.f;
        m9sVar.getClass();
        ctf0Var.getClass();
        List listSplit$default = StringsKt__StringsKt.split$default(m9sVar.h.b, new String[]{"-"}, false, 0, 6, null);
        String str3 = (String) CollectionsKt.firstOrNull(listSplit$default);
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) CollectionsKt.f0(listSplit$default);
        String str5 = str4 != null ? str4 : "";
        if (str3.equals("0") && str5.equals("0")) {
            String str6 = gdh0Var.e;
            if (list2.isEmpty() && list.isEmpty()) {
                fdh0Var = fdh0.f9358a;
            } else if (str6.equals("1")) {
                fdh0Var = fdh0.b;
            } else {
                fdh0Var = str6.equals("2") ? fdh0.c : fdh0.f;
            }
        } else if (str3.equals("1")) {
            fdh0Var = fdh0.d;
        } else {
            fdh0Var = str5.equals("1") ? fdh0.e : fdh0.f;
        }
        long j = m9sVar.f21426a;
        StringBuilder sb = new StringBuilder(ujn.h);
        String str7 = "0";
        if (StringsKt.O("/static/img/android/esports/243/Capitan1.png", ujn.h, false) || kotlin.text.c.x("/static/img/android/esports/243/Capitan1.png", "https://", false)) {
            z = false;
            sb.setLength(0);
            sb.append("/static/img/android/esports/243/Capitan1.png");
        } else {
            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                c2 = '/';
            } else {
                sb.append('/');
                c2 = '/';
            }
            z = false;
            sb.append(StringsKt.y0("/static/img/android/esports/243/Capitan1.png", c2));
        }
        String string = sb.toString();
        ?? sb2 = new StringBuilder(ujn.h);
        fdh0 fdh0Var2 = fdh0Var;
        if (!StringsKt.O("/static/img/android/esports/243/Capitan2.png", ujn.h, z)) {
            if (kotlin.text.c.x("/static/img/android/esports/243/Capitan2.png", "https://", z)) {
                r8 = 0;
            } else {
                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                    c = '/';
                } else {
                    c = '/';
                    sb2.append('/');
                }
                sb2.append(StringsKt.y0("/static/img/android/esports/243/Capitan2.png", c));
            }
            String string2 = sb2.toString();
            String str8 = m9sVar.i;
            str8.getClass();
            str = m9sVar.j;
            str.getClass();
            iOrdinal = fdh0Var2.ordinal();
            if (iOrdinal != 0) {
                strA = ctf0Var.b.a(R.string.bet_before_game_start, Arrays.copyOf(new Object[0], 0));
            } else if (iOrdinal != 1) {
                strA = ctf0Var.b.a(R.string.synthetic_sea_battle_player_turn_v2, Arrays.copyOf(new Object[]{"1"}, 1));
            } else if (iOrdinal != 2) {
                strA = ctf0Var.b.a(R.string.synthetic_sea_battle_player_turn_v2, Arrays.copyOf(new Object[]{"2"}, 1));
            } else if (iOrdinal != 3) {
                strA = ctf0Var.b.a(R.string.synthetic_sea_battle_player_win_v2, Arrays.copyOf(new Object[]{"1"}, 1));
            } else if (iOrdinal != 4) {
                strA = ctf0Var.b.a(R.string.synthetic_sea_battle_player_win_v2, Arrays.copyOf(new Object[]{"2"}, 1));
            } else {
                if (iOrdinal == 5) {
                    t9f.b();
                    return;
                }
                strA = ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
            }
            str2 = gdh0Var.c;
            List list3 = gdh0Var.b;
            List list4 = gdh0Var.f11104a;
            if (str2.length() == 0) {
                str2 = str7;
            }
            lsm0 lsm0Var = ctf0Var.b;
            String strA2 = lsm0Var.a(R.string.synthetic_sea_battle_shots_v2, Arrays.copyOf(new Object[]{str2}, 1));
            String str9 = gdh0Var.d;
            String strA3 = lsm0Var.a(R.string.synthetic_sea_battle_shots_v2, Arrays.copyOf(new Object[]{str9.length() != 0 ? str9 : "0"}, 1));
            iOrdinal2 = fdh0Var2.ordinal();
            if (iOrdinal2 != 0 || iOrdinal2 == 1 || iOrdinal2 == 3) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            iOrdinal3 = fdh0Var2.ordinal();
            if (iOrdinal3 != 0 || iOrdinal3 == 2 || iOrdinal3 == 4) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            iOrdinal4 = fdh0Var2.ordinal();
            if (iOrdinal4 != 0 || iOrdinal4 == 2 || iOrdinal4 == 3) {
                f3 = 1.0f;
            } else {
                f3 = 0.5f;
            }
            iOrdinal5 = fdh0Var2.ordinal();
            if (iOrdinal5 != 0 || iOrdinal5 == 1 || iOrdinal5 == 4) {
                f4 = 1.0f;
            } else {
                f4 = 0.5f;
            }
            arrayList = new ArrayList(r3d.q(list4, 10));
            it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(q0x.W((ldh0) it.next()));
            }
            arrayList2 = new ArrayList(r3d.q(list3, 10));
            it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(q0x.W((ldh0) it2.next()));
                str = str;
            }
            lc00Var.add(new jeh0(j, string, string2, str8, str, strA, strA2, strA3, f, f2, f3, f4, arrayList, arrayList2, s0x.Q(list2, list4), s0x.Q(list, list3)));
        }
        r8 = z;
        sb2.setLength(r8);
        sb2.append("/static/img/android/esports/243/Capitan2.png");
        String string3 = sb2.toString();
        String str10 = m9sVar.i;
        str10.getClass();
        str = m9sVar.j;
        str.getClass();
        iOrdinal = fdh0Var2.ordinal();
        if (iOrdinal != 0) {
            strA = ctf0Var.b.a(R.string.bet_before_game_start, Arrays.copyOf(new Object[0], 0));
        } else if (iOrdinal != 1) {
            strA = ctf0Var.b.a(R.string.synthetic_sea_battle_player_turn_v2, Arrays.copyOf(new Object[]{"1"}, 1));
        } else if (iOrdinal != 2) {
            strA = ctf0Var.b.a(R.string.synthetic_sea_battle_player_turn_v2, Arrays.copyOf(new Object[]{"2"}, 1));
        } else if (iOrdinal != 3) {
            strA = ctf0Var.b.a(R.string.synthetic_sea_battle_player_win_v2, Arrays.copyOf(new Object[]{"1"}, 1));
        } else if (iOrdinal != 4) {
            strA = ctf0Var.b.a(R.string.synthetic_sea_battle_player_win_v2, Arrays.copyOf(new Object[]{"2"}, 1));
        } else {
            if (iOrdinal == 5) {
                t9f.b();
                return;
            }
            strA = ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
        }
        str2 = gdh0Var.c;
        List list5 = gdh0Var.b;
        List list6 = gdh0Var.f11104a;
        if (str2.length() == 0) {
            str2 = str7;
        }
        lsm0 lsm0Var2 = ctf0Var.b;
        String strA4 = lsm0Var2.a(R.string.synthetic_sea_battle_shots_v2, Arrays.copyOf(new Object[]{str2}, 1));
        String str11 = gdh0Var.d;
        String strA5 = lsm0Var2.a(R.string.synthetic_sea_battle_shots_v2, Arrays.copyOf(new Object[]{str11.length() != 0 ? str11 : "0"}, 1));
        iOrdinal2 = fdh0Var2.ordinal();
        if (iOrdinal2 != 0) {
            f = 1.0f;
        } else {
            f = 1.0f;
        }
        iOrdinal3 = fdh0Var2.ordinal();
        if (iOrdinal3 != 0) {
            f2 = 1.0f;
        } else {
            f2 = 1.0f;
        }
        iOrdinal4 = fdh0Var2.ordinal();
        if (iOrdinal4 != 0) {
            f3 = 1.0f;
        } else {
            f3 = 1.0f;
        }
        iOrdinal5 = fdh0Var2.ordinal();
        if (iOrdinal5 != 0) {
            f4 = 1.0f;
        } else {
            f4 = 1.0f;
        }
        arrayList = new ArrayList(r3d.q(list6, 10));
        it = list6.iterator();
        while (it.hasNext()) {
            arrayList.add(q0x.W((ldh0) it.next()));
        }
        arrayList2 = new ArrayList(r3d.q(list5, 10));
        it2 = list5.iterator();
        while (it2.hasNext()) {
            arrayList2.add(q0x.W((ldh0) it2.next()));
            str = str;
        }
        lc00Var.add(new jeh0(j, string, string3, str10, str, strA, strA4, strA5, f, f2, f3, f4, arrayList, arrayList2, s0x.Q(list2, list6), s0x.Q(list, list5)));
    }

    public static final pm80 r(dyw dywVar, Context context, int i) {
        if (dywVar instanceof b78) {
            return s5x0.f(new vz2(((b78) dywVar).f2092a), i);
        }
        if (!(dywVar instanceof khl)) {
            return new hb3(dywVar);
        }
        Drawable drawableMutate = c3x.q(dywVar, context.getResources()).mutate();
        drawableMutate.setFilterBitmap(true ^ (i == 0));
        return new lhl(drawableMutate);
    }

    public static final void s(ViewGroup viewGroup) {
        viewGroup.getClass();
        b5q b5qVar = new b5q(pgi0.h(pym0.j(viewGroup), b180.y));
        while (b5qVar.hasNext()) {
            ((DsShimmerView) b5qVar.next()).setVisibility(0);
        }
    }

    public static String t(int i, int i2, String str) {
        if (i < 0) {
            return jtm0.p("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return jtm0.p("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        jf4.o(twn.m(i2, "negative size: "));
        return null;
    }

    public static final ArrayList u(List list, List list2, pep0 pep0Var) {
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            String str = (String) obj;
            String str2 = (String) CollectionsKt.W(i, list2);
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (kotlin.text.c.x(str2, ujn.h, false)) {
                str3 = str2;
            } else if (str2.length() != 0) {
                List list3 = u0d.f34849a;
                if (!u0d.c(str2)) {
                    str3 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
            arrayList.add(new fal0(str, pep0Var, new e5a0(new c280(str3, R.drawable.ic_glyph_placeholder_player))));
            i = i2;
        }
        return arrayList;
    }

    public static void v(int i, int i2, String str, boolean z) {
        if (z) {
            return;
        }
        jf4.o(jtm0.p(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void w(String str, int i, boolean z) {
        if (z) {
            return;
        }
        jf4.o(jtm0.p(str, Integer.valueOf(i)));
    }

    public static void x(String str, long j, boolean z) {
        if (z) {
            return;
        }
        jf4.o(jtm0.p(str, Long.valueOf(j)));
    }

    public static void y(String str, Object obj, boolean z) {
        if (z) {
            return;
        }
        jf4.o(jtm0.p(str, obj));
    }

    public static void z(String str, boolean z) {
        if (z) {
            return;
        }
        jf4.o(str);
    }
}
