package a;

import a.ayk0;
import a.csr;
import a.g80;
import a.hj10;
import a.kfl;
import a.kqf0;
import a.l7h0;
import a.m1r;
import a.min;
import a.mzk;
import a.qeq0;
import a.rp3;
import a.s470;
import a.u7t;
import a.ufx;
import a.yef;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.work.WorkerParameters;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.ResponseBody;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.games_list.features.common.OneXGamesScreens$LuckyWheelDsScreen;
import org.xplatform.games_list.features.common.OneXGamesScreens$LuckyWheelScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class jtv implements yq, gk3, vq8, vke, jgd, h5v0, lkq, b0o, c6z, da30, r4x, yzs0, ach0, kdk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jtv f17121a = new jtv();
    public static final jtv b = new jtv();
    public static final jtv c = new jtv();
    public static final jtv d = new jtv();
    public static final jtv e = new jtv();
    public static final jtv f = new jtv();
    public static final jtv g = new jtv();
    public static final jtv h = new jtv();
    public static final jtv i = new jtv();
    public static final jge0 j = new jge0(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final String[] k = new String[0];
    public static final jtv l = new jtv();
    public static final jtv m = new jtv();
    public static final jtv n = new jtv();
    public static final jtv o = new jtv();
    public static final jtv p = new jtv();
    public static final pn20 q = new pn20(3);
    public static final jtv r = new jtv();
    public static final uj80 s = new uj80(false);
    public static final /* synthetic */ jtv t = new jtv();
    public static final jtv u = new jtv();
    public static final jtv v = new jtv();
    public static final pn20 w = new pn20(12);
    public static final jtv x = new jtv();

    public static mx3 E0(List list, ym40 ym40Var, iwb0 iwb0Var) {
        List listL0 = CollectionsKt.L0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            r2e r2eVarG0 = G0(null, it.next());
            if (r2eVarG0 != null) {
                arrayList.add(r2eVarG0);
            }
        }
        return ym40Var != null ? new h0t0(arrayList, ym40Var.c().r(iwb0Var)) : new mx3(arrayList, new w0((Object) iwb0Var, (byte) 17));
    }

    public static r2e G0(zm40 zm40Var, Object obj) {
        if (obj instanceof Byte) {
            return new rg9(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new bsj0(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new vkx(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new x710(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new svb((Character) obj);
        }
        if (obj instanceof Float) {
            return new vm8(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new vm8(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new vm8((Boolean) obj);
        }
        if (obj instanceof String) {
            return new htm0((String) obj);
        }
        if (obj instanceof byte[]) {
            return E0(tx3.a0((byte[]) obj), zm40Var, iwb0.BYTE);
        }
        if (obj instanceof short[]) {
            return E0(tx3.h0((short[]) obj), zm40Var, iwb0.SHORT);
        }
        if (obj instanceof int[]) {
            return E0(tx3.e0((int[]) obj), zm40Var, iwb0.INT);
        }
        if (obj instanceof long[]) {
            return E0(tx3.f0((long[]) obj), zm40Var, iwb0.LONG);
        }
        if (obj instanceof char[]) {
            return E0(tx3.b0((char[]) obj), zm40Var, iwb0.CHAR);
        }
        if (obj instanceof float[]) {
            return E0(tx3.d0((float[]) obj), zm40Var, iwb0.FLOAT);
        }
        if (obj instanceof double[]) {
            return E0(tx3.c0((double[]) obj), zm40Var, iwb0.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return E0(tx3.i0((boolean[]) obj), zm40Var, iwb0.BOOLEAN);
        }
        if (obj == null) {
            return new l860(null);
        }
        return null;
    }

    public static String I0(double d2, String str, boolean z) {
        String str2;
        str.getClass();
        if (!z || Math.signum(d2) >= 0.0d) {
            str2 = (!z || Math.signum(d2) <= 0.0d) ? "" : "+";
        } else {
            str2 = "-";
        }
        pn40 pn40Var = pn40.f27267a;
        String strD = pn40.d(Math.abs(d2), str, p3u0.c);
        return (!cy7.c() || str.equals("A$")) ? str2.concat(strD) : CollectionsKt.b0(CollectionsKt.t0(StringsKt__StringsKt.split$default(strD, new String[]{Separators.SP}, false, 0, 6, null)), Separators.SP, null, null, null, 62).concat(str2);
    }

    public static String K0(znq0 znq0Var, dfj dfjVar, int i2) {
        Locale locale = Locale.ENGLISH;
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        if ((i2 & 8) != 0) {
            locale = Locale.getDefault();
            locale.getClass();
        }
        locale.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dfjVar.f6004a, locale);
        simpleDateFormat.setTimeZone(timeZone);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.clear();
        gregorianCalendar.setTimeInMillis(znq0Var.c());
        Date time = gregorianCalendar.getTime();
        time.getClass();
        String str = simpleDateFormat.format(time);
        str.getClass();
        return str;
    }

    public static FragmentScreen L0(long j2, final csr csrVar, r9u r9uVar) {
        csrVar.getClass();
        s470.Companion.getClass();
        switch (r470.a(j2).ordinal()) {
            case 5:
                return new FragmentScreen(csrVar) { // from class: org.xplatform.games_list.features.common.OneXGamesScreens$ResidentScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final csr f46715a;

                    {
                        csrVar.getClass();
                        this.f46715a = csrVar;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        int i2 = kqf0.X1;
                        csr csrVar2 = this.f46715a;
                        csrVar2.getClass();
                        kqf0 kqf0Var = new kqf0();
                        kqf0Var.S0(csrVar2);
                        return kqf0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            case 6:
                return new FragmentScreen(csrVar) { // from class: org.xplatform.games_list.features.common.OneXGamesScreens$LuckyCardScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final csr f46710a;

                    {
                        csrVar.getClass();
                        this.f46710a = csrVar;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        int i2 = hj10.X1;
                        csr csrVar2 = this.f46710a;
                        csrVar2.getClass();
                        hj10 hj10Var = new hj10();
                        hj10Var.S0(csrVar2);
                        return hj10Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            case 7:
                return new FragmentScreen(csrVar) { // from class: org.xplatform.games_list.features.common.OneXGamesScreens$NewDominoScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final csr f46713a;

                    {
                        csrVar.getClass();
                        this.f46713a = csrVar;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        int i2 = mzk.X1;
                        csr csrVar2 = this.f46713a;
                        csrVar2.getClass();
                        mzk mzkVar = new mzk();
                        mzkVar.S0(csrVar2);
                        return mzkVar;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            case 8:
                return new FragmentScreen(csrVar) { // from class: org.xplatform.games_list.features.common.OneXGamesScreens$AppleFortuneScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final csr f46705a;

                    {
                        csrVar.getClass();
                        this.f46705a = csrVar;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        int i2 = rp3.X1;
                        csr csrVar2 = this.f46705a;
                        csrVar2.getClass();
                        rp3 rp3Var = new rp3();
                        rp3Var.S0(csrVar2);
                        return rp3Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            case 9:
                return new FragmentScreen(csrVar) { // from class: org.xplatform.games_list.features.common.OneXGamesScreens$DragonGoldScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final csr f46707a;

                    {
                        csrVar.getClass();
                        this.f46707a = csrVar;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        int i2 = kfl.X1;
                        csr csrVar2 = this.f46707a;
                        csrVar2.getClass();
                        kfl kflVar = new kfl();
                        kflVar.S0(csrVar2);
                        return kflVar;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            case 10:
                return new FragmentScreen(csrVar) { // from class: org.xplatform.games_list.features.common.OneXGamesScreens$SpinAndWinScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final csr f46717a;

                    {
                        csrVar.getClass();
                        this.f46717a = csrVar;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        int i2 = ayk0.X1;
                        csr csrVar2 = this.f46717a;
                        csrVar2.getClass();
                        ayk0 ayk0Var = new ayk0();
                        ayk0Var.S0(csrVar2);
                        return ayk0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            case 11:
                return new FragmentScreen(csrVar) { // from class: org.xplatform.games_list.features.common.OneXGamesScreens$ScratchCardsScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final csr f46716a;

                    {
                        csrVar.getClass();
                        this.f46716a = csrVar;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        int i2 = l7h0.X1;
                        csr csrVar2 = this.f46716a;
                        csrVar2.getClass();
                        l7h0 l7h0Var = new l7h0();
                        l7h0Var.S0(csrVar2);
                        return l7h0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            case 12:
                return new FragmentScreen(csrVar) { // from class: org.xplatform.games_list.features.common.OneXGamesScreens$AfricanRouletteScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final csr f46704a;

                    {
                        csrVar.getClass();
                        this.f46704a = csrVar;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        int i2 = g80.X1;
                        csr csrVar2 = this.f46704a;
                        csrVar2.getClass();
                        g80 g80Var = new g80();
                        g80Var.S0(csrVar2);
                        return g80Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            case 13:
                return new FragmentScreen(csrVar) { // from class: org.xplatform.games_list.features.common.OneXGamesScreens$CrystalScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final csr f46706a;

                    {
                        csrVar.getClass();
                        this.f46706a = csrVar;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        int i2 = yef.X1;
                        csr csrVar2 = this.f46706a;
                        csrVar2.getClass();
                        yef yefVar = new yef();
                        yefVar.S0(csrVar2);
                        return yefVar;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            case 14:
                if (r9uVar == null) {
                    return new OneXGamesScreens$LuckyWheelScreen(csrVar);
                }
                ygp ygpVar = ygp.s;
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return j1q0Var.f15748a.d(ygpVar) ? new OneXGamesScreens$LuckyWheelDsScreen(csrVar) : new OneXGamesScreens$LuckyWheelScreen(csrVar);
            case 15:
                final s470 s470Var = s470.ODYSSEY;
                return new FragmentScreen(csrVar, s470Var) { // from class: org.xplatform.games_list.features.common.OneXGamesScreens$TileMatchingScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final csr f46718a;
                    public final s470 b;

                    {
                        csrVar.getClass();
                        this.f46718a = csrVar;
                        this.b = s470Var;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        qeq0.Y1.getClass();
                        csr csrVar2 = this.f46718a;
                        csrVar2.getClass();
                        qeq0 qeq0Var = new qeq0();
                        qeq0Var.S0(csrVar2);
                        long jA = this.b.a();
                        qeq0Var.U1.j(qeq0Var, qeq0.Z1[0], jA);
                        return qeq0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            case 16:
                final s470 s470Var2 = s470.FRUIT_BLAST;
                return new FragmentScreen(csrVar, s470Var2) { // from class: org.xplatform.games_list.features.common.OneXGamesScreens$TileMatchingScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final csr f46718a;
                    public final s470 b;

                    {
                        csrVar.getClass();
                        this.f46718a = csrVar;
                        this.b = s470Var2;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        qeq0.Y1.getClass();
                        csr csrVar2 = this.f46718a;
                        csrVar2.getClass();
                        qeq0 qeq0Var = new qeq0();
                        qeq0Var.S0(csrVar2);
                        long jA = this.b.a();
                        qeq0Var.U1.j(qeq0Var, qeq0.Z1[0], jA);
                        return qeq0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            case 17:
                return new FragmentScreen(csrVar) { // from class: org.xplatform.games_list.features.common.OneXGamesScreens$EasterNightsScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final csr f46708a;

                    {
                        csrVar.getClass();
                        this.f46708a = csrVar;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        int i2 = min.X1;
                        csr csrVar2 = this.f46708a;
                        csrVar2.getClass();
                        min minVar = new min();
                        minVar.S0(csrVar2);
                        return minVar;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            case 18:
                return new FragmentScreen(csrVar) { // from class: org.xplatform.games_list.features.common.OneXGamesScreens$GamesManiaScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final csr f46709a;

                    {
                        csrVar.getClass();
                        this.f46709a = csrVar;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        int i2 = u7t.X1;
                        csr csrVar2 = this.f46709a;
                        csrVar2.getClass();
                        u7t u7tVar = new u7t();
                        u7tVar.S0(csrVar2);
                        return u7tVar;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            default:
                return null;
        }
    }

    public static FragmentScreen M0(int i2, long j2, csr csrVar) {
        if ((i2 & 2) != 0) {
            csrVar = csr.e;
        }
        return L0(j2, csrVar, null);
    }

    public static void O0(Object obj) {
        throw new poe(f140.k(obj, "This method should not be called on ", " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f0(mm40 mm40Var, Fragment fragment, CyberBottomSheetParams cyberBottomSheetParams, boolean z, String str, boolean z2, Function0 function0, fet fetVar, int i2) {
        mm40Var.getClass();
        fetVar.e0(-72176675);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            ComponentCallbacks2 componentCallbacks2I = vqd.i(fragment);
            af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(bbh.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                if (!(ze3Var instanceof bbh)) {
                    ze3Var = null;
                }
                bbh bbhVar = (bbh) ze3Var;
                if (bbhVar != null) {
                    Fragment fragment2 = fragment;
                    while (true) {
                        if (fragment2 == 0) {
                            jf4.n("Can't find feature provider!");
                            return;
                        }
                        if (fragment2 instanceof drs) {
                            xhi xhiVarQ = ((drs) fragment2).q();
                            cad cadVar = bbhVar.f2308a;
                            itr itrVar = bbhVar.b;
                            iip iipVar = bbhVar.c;
                            ugf0 ugf0Var = bbhVar.d;
                            rtu rtuVar = bbhVar.e;
                            pru pruVar = bbhVar.f;
                            lbu lbuVar = bbhVar.g;
                            y78 y78Var = bbhVar.h;
                            r9u r9uVar = bbhVar.i;
                            ctf0 ctf0Var = bbhVar.j;
                            wdk0 wdk0Var = bbhVar.k;
                            itrVar.getClass();
                            iipVar.getClass();
                            r9uVar.getClass();
                            ctf0Var.getClass();
                            wdk0Var.getClass();
                            Object veiVar = new vei(cadVar, xhiVarQ, itrVar, iipVar, ugf0Var, cyberBottomSheetParams, Boolean.valueOf(z), rtuVar, pruVar, lbuVar, y78Var, r9uVar, ctf0Var, wdk0Var);
                            fetVar.o0(veiVar);
                            objP = veiVar;
                            break;
                        }
                        fragment2 = fragment2.y;
                    }
                }
            }
            jf4.n(b1j.i(bbh.class, "Cannot create dependency "));
            return;
        }
        vei veiVar2 = (vei) objP;
        q0h0 q0h0Var = new q0h0((uei) veiVar2.o.get());
        String str2 = z ? null : "CyberRelatedViewModelEmbeddedInMarkets";
        sgy sgyVarB = sre0.f32672a.b(dch.class);
        int i3 = dch.F;
        k3t0 k3t0VarX = n4c.X(sgyVarB, str2, q0h0Var, fetVar, 12);
        Object objP2 = fetVar.P();
        if (objP2 == obj) {
            veiVar2.n.getClass();
            objP2 = new gbh();
            fetVar.o0(objP2);
        }
        gbh gbhVar = (gbh) objP2;
        boolean zG = fetVar.g(veiVar2);
        Object objP3 = fetVar.P();
        if (zG || objP3 == obj) {
            objP3 = veiVar2.f.d();
            x1x.x(objP3);
            fetVar.o0(objP3);
        }
        ujd ujdVar = (ujd) objP3;
        boolean zI = fetVar.i(ujdVar) | fetVar.i(fragment) | fetVar.i(k3t0VarX);
        Object objP4 = fetVar.P();
        byte b2 = 0;
        if (zI || objP4 == obj) {
            objP4 = new cbh(ujdVar, fragment, k3t0VarX, b2);
            fetVar.o0(objP4);
        }
        m0x0.o(fragment, (Function1) objP4, fetVar);
        boolean zI2 = fetVar.i(k3t0VarX);
        Object objP5 = fetVar.P();
        if (zI2 || objP5 == obj) {
            objP5 = new dbh(k3t0VarX, b2);
            fetVar.o0(objP5);
        }
        Function0 function1 = (Function0) objP5;
        boolean zI3 = fetVar.i(k3t0VarX);
        Object objP6 = fetVar.P();
        if (zI3 || objP6 == obj) {
            objP6 = new dbh(k3t0VarX, (byte) 1);
            fetVar.o0(objP6);
        }
        v3c.z(function1, (Function0) objP6, null, fetVar, 0, 4);
        Object objP7 = fetVar.P();
        if (objP7 == obj) {
            objP7 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
            fetVar.o0(objP7);
        }
        vne vneVar = (vne) objP7;
        boolean zI4 = fetVar.i(ujdVar) | fetVar.i(fragment) | fetVar.i(gbhVar) | fetVar.i(k3t0VarX);
        Object objP8 = fetVar.P();
        if (zI4 || objP8 == obj) {
            objP8 = new cbh(ujdVar, fragment, gbhVar, k3t0VarX);
            fetVar.o0(objP8);
        }
        Function1 function2 = (Function1) objP8;
        Unit unit = Unit.f46060a;
        boolean zI5 = fetVar.i(vneVar) | fetVar.i(k3t0VarX) | fetVar.g(function2) | fetVar.g(null);
        Object objP9 = fetVar.P();
        if (zI5 || objP9 == obj) {
            objP9 = new et(vneVar, k3t0VarX, function2, (byte) 23);
            fetVar.o0(objP9);
        }
        m0x0.o(unit, (Function1) objP9, fetVar);
        i3t0 i3t0Var = (i3t0) k3t0VarX;
        xbh xbhVar = (xbh) i3t0Var.y(fetVar).getValue();
        if (Intrinsics.d(xbhVar, wbh.f38878a)) {
            fetVar.e0(-642215615);
            fetVar.r(false);
        } else {
            if (!(xbhVar instanceof vbh)) {
                throw b1j.f(-642217314, fetVar, false);
            }
            fetVar.e0(1566218602);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            vbh vbhVar = (vbh) xbhVar;
            boolean zI6 = fetVar.i(i3t0Var);
            Object objP10 = fetVar.P();
            if (zI6 || objP10 == obj) {
                objP10 = new vi6(i3t0Var, (byte) 5);
                fetVar.o0(objP10);
            }
            Function1 function3 = (Function1) objP10;
            boolean zI7 = fetVar.i(i3t0Var);
            Object objP11 = fetVar.P();
            byte b3 = 6;
            if (zI7 || objP11 == obj) {
                objP11 = new ui6(i3t0Var, b3);
                fetVar.o0(objP11);
            }
            i120.p(mm40VarE, vbhVar, str, z2, function0, function3, (Function0) objP11, fetVar, (i2 >> 6) & 65408);
            fetVar.r(false);
        }
        fetVar.r(false);
    }

    @Override // a.yzs0
    public faa A(dcg0 dcg0Var) {
        mzj0 mzj0VarN0 = N0(dcg0Var);
        if (mzj0VarN0 instanceof faa) {
            return (faa) mzj0VarN0;
        }
        return null;
    }

    @Override // a.yzs0
    public xnm0 A0(dcg0 dcg0Var) {
        siy siyVar = siy.c;
        return new pre0(b5x.x((kiy) dcg0Var));
    }

    @Override // a.yzs0
    public boolean B(jys0 jys0Var) {
        jys0Var.getClass();
        return Intrinsics.d(jys0Var, v660.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.yzs0
    public f0t0 B0(jzs0 jzs0Var) {
        jzs0Var.getClass();
        int iOrdinal = ((niy) ((miy) jzs0Var)).e.ordinal();
        if (iOrdinal == 0) {
            return f0t0.INV;
        }
        if (iOrdinal == 1) {
            return f0t0.IN;
        }
        if (iOrdinal == 2) {
            return f0t0.OUT;
        }
        t9f.b();
        return null;
    }

    @Override // a.yzs0
    public jzs0 C(jys0 jys0Var) {
        if (jys0Var instanceof niy) {
            return (niy) jys0Var;
        }
        return null;
    }

    @Override // a.yzs0
    public aty C0(zxs0 zxs0Var) {
        zxs0Var.getClass();
        return (aty) ((riy) zxs0Var).f30565a.b;
    }

    @Override // a.yzs0
    public boolean D(jys0 jys0Var) {
        if (!(jys0Var instanceof xgy)) {
            return false;
        }
        xgy xgyVar = (xgy) jys0Var;
        return (xgyVar.Y() != fm40.FINAL || xgyVar.V() == rlc.ENUM_CLASS || xgyVar.V() == rlc.ENUM_ENTRY || xgyVar.V() == rlc.ANNOTATION_CLASS) ? false : true;
    }

    @Override // a.yzs0
    public zxs0 E(aty atyVar, int i2) {
        atyVar.getClass();
        return new riy((KTypeProjection) ((kiy) atyVar).M().get(i2));
    }

    @Override // a.yzs0
    public aty F(aty atyVar) {
        return ((v2) atyVar).B(true);
    }

    @Override // a.yzs0
    public boolean F0(aty atyVar) {
        atyVar.getClass();
        return !Intrinsics.d(N(m0(atyVar)), N(W(atyVar)));
    }

    @Override // a.r4x
    public void G(int i2, hzj hzjVar, b0a b0aVar) {
        hzjVar.getClass();
    }

    @Override // a.yzs0
    public boolean H(aty atyVar) {
        wsy wsyVar;
        atyVar.getClass();
        if (!(atyVar instanceof v2) || !(((v2) atyVar).o() instanceof d2o)) {
            wdk wdkVar = atyVar instanceof wdk ? (wdk) atyVar : null;
            if (wdkVar == null || (wsyVar = wdkVar.b) == null || !bdx.k0(wsyVar)) {
                return false;
            }
        }
        return true;
    }

    public og00 H0(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(og00.class);
            clsAsSubclass.getClass();
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                objNewInstance.getClass();
                og00 og00Var = (og00) objNewInstance;
                if (!og00Var.d) {
                    return og00Var;
                }
                jf4.n(b1j.k("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
                return null;
            } catch (Throwable th) {
                wv00.f().e(aqv0.f1315a, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            wv00.f().e(aqv0.f1315a, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }

    @Override // a.yzs0
    public boolean I(jys0 jys0Var) {
        return jys0Var instanceof sgy;
    }

    @Override // a.yzs0
    public boolean J(dcg0 dcg0Var, dcg0 dcg0Var2) {
        dcg0Var.getClass();
        dcg0Var2.getClass();
        return false;
    }

    @Override // a.yzs0
    public Collection K(dcg0 dcg0Var) {
        O0(dcg0Var);
        throw null;
    }

    @Override // a.yzs0
    public int L(aty atyVar) {
        atyVar.getClass();
        return ((kiy) atyVar).M().size();
    }

    @Override // a.yzs0
    public boolean M(aty atyVar) {
        atyVar.getClass();
        O0(atyVar);
        throw null;
    }

    @Override // a.yzs0
    public jys0 N(dcg0 dcg0Var) {
        Class<?> componentType;
        dcg0Var.getClass();
        if (dcg0Var instanceof w9a) {
            return ((w9a) dcg0Var).c;
        }
        v2 v2Var = (v2) dcg0Var;
        if (v2Var.p()) {
            return v660.b;
        }
        fhy fhyVarO = v2Var.o();
        xgy xgyVar = fhyVarO instanceof xgy ? (xgy) fhyVarO : null;
        if (xgyVar != null && (componentType = azw.G(xgyVar).getComponentType()) != null && !componentType.isPrimitive()) {
            return (jys0) sre0.f32672a.b(Object[].class);
        }
        fhy fhyVarJ = v2Var.j();
        if (fhyVarJ == null) {
            fhyVarJ = v2Var.o();
        }
        fhyVarJ.getClass();
        return (jys0) fhyVarJ;
    }

    public mzj0 N0(dcg0 dcg0Var) {
        v2 v2VarA;
        tzj tzjVarZ0 = z0(dcg0Var);
        return (tzjVarZ0 == null || (v2VarA = ((v2) tzjVarZ0).A(false)) == null) ? (mzj0) dcg0Var : v2VarA;
    }

    @Override // a.yzs0
    public dcg0 O(dcg0 dcg0Var) {
        List listM;
        int i2;
        u9a u9aVar = u9a.f35274a;
        dcg0Var.getClass();
        v2 v2Var = (v2) dcg0Var;
        fhy fhyVarO = v2Var.o();
        sgy sgyVar = fhyVarO instanceof sgy ? (sgy) fhyVarO : null;
        if (sgyVar != null && ((listM = v2Var.M()) == null || !listM.isEmpty())) {
            Iterator it = listM.iterator();
            while (it.hasNext()) {
                if (((KTypeProjection) it.next()).f46069a != uiy.f35755a) {
                    List listO = y9a.O(sgyVar);
                    if (listO.size() != listM.size()) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList(r3d.q(listM, 10));
                    Iterator it2 = listM.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        KTypeProjection kTypeProjectionA = (KTypeProjection) it2.next();
                        uiy uiyVar = kTypeProjectionA.f46069a;
                        if (uiyVar != uiy.f35755a) {
                            kiy kiyVar = kTypeProjectionA.b;
                            if (uiyVar != uiy.b) {
                                kiyVar = null;
                            }
                            piy piyVar = KTypeProjection.c;
                            w9a w9aVar = new w9a(kiyVar, new x9a(kTypeProjectionA), false);
                            piyVar.getClass();
                            kTypeProjectionA = piy.a(w9aVar);
                        }
                        arrayList.add(kTypeProjectionA);
                    }
                    siy siyVar = siy.c;
                    List listO2 = y9a.O(sgyVar);
                    if (listO2.size() != arrayList.size()) {
                        StringBuilder sb = new StringBuilder("Params vs args count mismatch (");
                        sb.append(listO2.size());
                        sb.append(" != ");
                        sb.append(arrayList.size());
                        sb.append(") for class '");
                        sb.append(sgyVar);
                        c99.r(sb, "' with args: ", CollectionsKt.b0(arrayList, null, null, null, null, 63));
                        break;
                    }
                    siy siyVarA = listO2.isEmpty() ? siy.c.a(false) : new siy(xp20.m(CollectionsKt.T0(listO2, arrayList)), false);
                    int size = listM.size();
                    for (i2 = 0; i2 < size; i2++) {
                        KTypeProjection kTypeProjection = (KTypeProjection) listM.get(i2);
                        if (kTypeProjection.f46069a != uiy.f35755a) {
                            List upperBounds = ((miy) listO.get(i2)).getUpperBounds();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = upperBounds.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(siyVarA.c((kiy) it3.next(), null));
                            }
                            if (kTypeProjection.f46069a == uiy.c) {
                                kiy kiyVar2 = kTypeProjection.b;
                                kiyVar2.getClass();
                                arrayList2.add(kiyVar2);
                            }
                            kiy kiyVar3 = ((KTypeProjection) arrayList.get(i2)).b;
                            kiyVar3.getClass();
                            ((w9a) kiyVar3).c.b = arrayList2;
                        }
                    }
                    return new iyj0(sgyVar, arrayList, v2Var.h(), v2Var.f(), v2Var.c(), false, false, false, v2Var.j(), null);
                }
            }
        }
        return null;
    }

    @Override // a.yzs0
    public boolean P(aty atyVar) {
        atyVar.getClass();
        dcg0 dcg0VarA = a(atyVar);
        return (dcg0VarA != null ? z0(dcg0VarA) : null) != null;
    }

    @Override // a.yzs0
    public boolean Q(jys0 jys0Var, jys0 jys0Var2) {
        jys0Var.getClass();
        jys0Var2.getClass();
        return Intrinsics.d(jys0Var, jys0Var2);
    }

    @Override // a.yzs0
    public boolean R(dcg0 dcg0Var) {
        N(dcg0Var).getClass();
        return false;
    }

    @Override // a.yzs0
    public nkq S(aty atyVar) {
        atyVar.getClass();
        if (!(atyVar instanceof v2) || ((v2) atyVar).z() == null) {
            return null;
        }
        return (nkq) atyVar;
    }

    @Override // a.yzs0
    public zxs0 T(yxs0 yxs0Var, int i2) {
        yxs0Var.getClass();
        if (yxs0Var instanceof mzj0) {
            return E((aty) yxs0Var, i2);
        }
        if (yxs0Var instanceof kw3) {
            E e2 = ((kw3) yxs0Var).get(i2);
            e2.getClass();
            return (zxs0) e2;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(yxs0Var);
        e9d0.n(sb, sre0.f32672a.b(yxs0Var.getClass()));
        return null;
    }

    @Override // a.yzs0
    public boolean U(aty atyVar) {
        atyVar.getClass();
        return ((kiy) m0(atyVar)).h() != ((kiy) W(atyVar)).h();
    }

    @Override // a.yzs0
    public zxs0 V(eaa eaaVar) {
        return new riy(((x9a) eaaVar).f40501a);
    }

    @Override // a.yzs0
    public dcg0 W(aty atyVar) {
        atyVar.getClass();
        nkq nkqVarS = S(atyVar);
        if (nkqVarS != null) {
            return e(nkqVarS);
        }
        dcg0 dcg0VarA = a(atyVar);
        dcg0VarA.getClass();
        return dcg0VarA;
    }

    @Override // a.yzs0
    public faa X(mzj0 mzj0Var) {
        if (mzj0Var instanceof faa) {
            return (faa) mzj0Var;
        }
        return null;
    }

    @Override // a.yzs0
    public boolean Y(jys0 jys0Var) {
        return false;
    }

    @Override // a.yzs0
    public void Z(aty atyVar) {
        atyVar.getClass();
    }

    @Override // a.yzs0
    public dcg0 a(aty atyVar) {
        atyVar.getClass();
        if (S(atyVar) != null) {
            return null;
        }
        return (dcg0) atyVar;
    }

    @Override // a.yzs0
    public zxs0 a0(dcg0 dcg0Var, int i2) {
        if (i2 < 0 || i2 >= L(dcg0Var)) {
            return null;
        }
        return E(dcg0Var, i2);
    }

    @Override // a.c6z
    public Object b(dfv dfvVar, yje yjeVar) {
        long j2 = dfvVar.u;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (j2 >> 32), (int) (j2 & 4294967295L), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Canvas canvas2 = vw2.f38128a;
        uw2 uw2Var = new uw2();
        uw2Var.f36374a = canvas;
        dfvVar.c(uw2Var, null);
        return bitmapCreateBitmap;
    }

    @Override // a.b0o
    public Boolean b0() {
        return Boolean.TRUE;
    }

    @Override // a.h5v0
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // a.yzs0
    public dcg0 d(nkq nkqVar) {
        v2 v2VarZ = ((v2) nkqVar).z();
        v2VarZ.getClass();
        return v2VarZ;
    }

    @Override // a.yzs0
    public aty d0(faa faaVar) {
        return (aty) ((w9a) faaVar).b;
    }

    @Override // a.yzs0
    public dcg0 e(nkq nkqVar) {
        v2 v2VarC = ((v2) nkqVar).C();
        v2VarC.getClass();
        return v2VarC;
    }

    @Override // a.yzs0
    public dcg0 e0(dcg0 dcg0Var, boolean z) {
        return ((v2) dcg0Var).B(z);
    }

    @Override // a.vq8
    public Rect f(Activity activity) throws Exception {
        uq8 uq8Var = vq8.G;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutoutH = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                objInvoke2.getClass();
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            uq8Var.getClass();
            Log.w(uq8.b, e2);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + dimensionPixelSize;
                if (i3 == point.x) {
                    rect.right = i3;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (x6.z(obj2)) {
                    displayCutoutH = x6.h(obj2);
                }
            } catch (Exception e3) {
                if (!(e3 instanceof ClassNotFoundException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof NoSuchFieldException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException) && !(e3 instanceof InstantiationException)) {
                    throw e3;
                }
                uq8Var.getClass();
                Log.w(uq8.b, e3);
            }
            if (displayCutoutH != null) {
                if (rect.left == displayCutoutH.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutH.getSafeInsetRight()) {
                    rect.right = displayCutoutH.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutH.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutH.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutH.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    @Override // a.yzs0
    public int g(yxs0 yxs0Var) {
        yxs0Var.getClass();
        if (yxs0Var instanceof dcg0) {
            return L((aty) yxs0Var);
        }
        if (yxs0Var instanceof kw3) {
            return ((kw3) yxs0Var).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(yxs0Var);
        e9d0.n(sb, sre0.f32672a.b(yxs0Var.getClass()));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.yzs0
    public List g0(jzs0 jzs0Var) {
        jzs0Var.getClass();
        List<kiy> upperBounds = ((miy) jzs0Var).getUpperBounds();
        ArrayList arrayList = new ArrayList(r3d.q(upperBounds, 10));
        for (kiy kiyVar : upperBounds) {
            kiyVar.getClass();
            arrayList.add((aty) kiyVar);
        }
        return arrayList;
    }

    @Override // a.h5v0
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // a.h5v0
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // a.lkq
    public wsy h0(a4d0 a4d0Var, String str, kzj0 kzj0Var, kzj0 kzj0Var2) {
        a4d0Var.getClass();
        str.getClass();
        kzj0Var.getClass();
        kzj0Var2.getClass();
        if (str.equals("kotlin.jvm.PlatformType")) {
            return a4d0Var.m(dgy.f) ? new dae0(kzj0Var, kzj0Var2) : ucx.W(kzj0Var, kzj0Var2);
        }
        return f2o.c(c2o.m, str, kzj0Var.toString(), kzj0Var2.toString());
    }

    @Override // a.yzs0
    public boolean i(dcg0 dcg0Var) {
        dcg0 dcg0VarA = a(dcg0Var);
        faa faaVar = null;
        if (dcg0VarA != null) {
            mzj0 mzj0VarN0 = N0(dcg0VarA);
            if (mzj0VarN0 instanceof faa) {
                faaVar = (faa) mzj0VarN0;
            }
        }
        return faaVar != null;
    }

    @Override // a.yzs0
    public Function2 i0() {
        return null;
    }

    @Override // a.yzs0
    public u9a j0(faa faaVar) {
        return u9a.f35274a;
    }

    @Override // a.h5v0
    public String[] k() {
        return k;
    }

    @Override // a.yzs0
    public f0t0 k0(zxs0 zxs0Var) {
        zxs0Var.getClass();
        uiy uiyVar = ((riy) zxs0Var).f30565a.f46069a;
        if (uiyVar == null) {
            return f0t0.OUT;
        }
        int iOrdinal = uiyVar.ordinal();
        if (iOrdinal == 0) {
            return f0t0.INV;
        }
        if (iOrdinal == 1) {
            return f0t0.IN;
        }
        if (iOrdinal == 2) {
            return f0t0.OUT;
        }
        t9f.b();
        return null;
    }

    @Override // a.yzs0
    public boolean l(dcg0 dcg0Var) {
        dcg0Var.getClass();
        if (!B(n0(dcg0Var))) {
            return false;
        }
        O0(dcg0Var);
        throw null;
    }

    @Override // a.yzs0
    public boolean l0(aty atyVar) {
        atyVar.getClass();
        return ((kiy) atyVar).h();
    }

    @Override // a.yzs0
    public boolean m(aty atyVar) {
        atyVar.getClass();
        O0(atyVar);
        throw null;
    }

    @Override // a.yzs0
    public dcg0 m0(aty atyVar) {
        atyVar.getClass();
        nkq nkqVarS = S(atyVar);
        if (nkqVarS != null) {
            return d(nkqVarS);
        }
        dcg0 dcg0VarA = a(atyVar);
        dcg0VarA.getClass();
        return dcg0VarA;
    }

    @Override // a.yzs0
    public zxs0 n(aty atyVar) {
        O0(atyVar);
        throw null;
    }

    @Override // a.yzs0
    public jys0 n0(aty atyVar) {
        atyVar.getClass();
        dcg0 dcg0VarA = a(atyVar);
        if (dcg0VarA == null) {
            dcg0VarA = m0(atyVar);
        }
        return N(dcg0VarA);
    }

    @Override // a.vke
    public Object o(Object obj) {
        ((ResponseBody) obj).close();
        return Unit.f46060a;
    }

    @Override // a.yzs0
    public boolean o0(jys0 jys0Var) {
        return !(jys0Var instanceof x9a);
    }

    @Override // a.yzs0
    public aty p(aty atyVar) {
        return ((v2) atyVar).A(true);
    }

    @Override // a.yzs0
    public boolean p0(jys0 jys0Var) {
        return false;
    }

    @Override // a.yzs0
    public yxs0 q(dcg0 dcg0Var) {
        dcg0Var.getClass();
        return (yxs0) dcg0Var;
    }

    @Override // a.yzs0
    public boolean q0(zxs0 zxs0Var) {
        zxs0Var.getClass();
        KTypeProjection kTypeProjection = ((riy) zxs0Var).f30565a;
        KTypeProjection.c.getClass();
        return Intrinsics.d(kTypeProjection, KTypeProjection.d);
    }

    @Override // a.yzs0
    public jzs0 r0(jys0 jys0Var, int i2) {
        Object obj = y9a.O((sgy) jys0Var).get(i2);
        obj.getClass();
        return (niy) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.yzs0
    public Collection s(jys0 jys0Var) {
        jys0Var.getClass();
        if (jys0Var instanceof sgy) {
            List<kiy> listB = ((sgy) jys0Var).b();
            ArrayList arrayList = new ArrayList(r3d.q(listB, 10));
            for (kiy kiyVar : listB) {
                kiyVar.getClass();
                arrayList.add((aty) kiyVar);
            }
            return arrayList;
        }
        if (jys0Var instanceof miy) {
            List<kiy> upperBounds = ((miy) jys0Var).getUpperBounds();
            ArrayList arrayList2 = new ArrayList(r3d.q(upperBounds, 10));
            for (kiy kiyVar2 : upperBounds) {
                kiyVar2.getClass();
                arrayList2.add((aty) kiyVar2);
            }
            return arrayList2;
        }
        if (!(jys0Var instanceof x9a)) {
            StringBuilder sbU = dw9.u("Unsupported type constructor: ", jys0Var, " (");
            sbU.append(jys0Var.getClass().getName());
            sbU.append(')');
            throw new IllegalStateException(sbU.toString().toString());
        }
        ArrayList<kiy> arrayList3 = ((x9a) jys0Var).b;
        if (arrayList3 == null) {
            Intrinsics.h("supertypes");
            throw null;
        }
        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
        for (kiy kiyVar3 : arrayList3) {
            kiyVar3.getClass();
            arrayList4.add((aty) kiyVar3);
        }
        return arrayList4;
    }

    @Override // a.yzs0
    public boolean s0(dcg0 dcg0Var) {
        dcg0Var.getClass();
        jys0 jys0VarN = N(dcg0Var);
        jys0VarN.getClass();
        return jys0VarN instanceof sgy;
    }

    @Override // a.yzs0
    public boolean t(aty atyVar) {
        atyVar.getClass();
        return false;
    }

    @Override // a.yzs0
    public eaa u(faa faaVar) {
        return ((w9a) faaVar).c;
    }

    @Override // a.yzs0
    public boolean u0(faa faaVar) {
        return false;
    }

    @Override // a.yzs0
    public boolean v(dcg0 dcg0Var) {
        dcg0Var.getClass();
        return z0(dcg0Var) != null;
    }

    @Override // a.yzs0
    public void v0(dcg0 dcg0Var) {
        dcg0Var.getClass();
    }

    @Override // a.yzs0
    public boolean w(jzs0 jzs0Var, jys0 jys0Var) {
        O0(jzs0Var);
        throw null;
    }

    @Override // a.yzs0
    public void w0(dcg0 dcg0Var, jys0 jys0Var) {
        dcg0Var.getClass();
    }

    @Override // a.yzs0
    public int x(jys0 jys0Var) {
        jys0Var.getClass();
        if (jys0Var instanceof sgy) {
            return y9a.O((sgy) jys0Var).size();
        }
        return 0;
    }

    @Override // a.jgd
    public Object x0(pzu pzuVar) {
        Object objE = pzuVar.e(new jkd0(jmz.class, Executor.class));
        objE.getClass();
        return obb.Y((Executor) objE);
    }

    @Override // a.yzs0
    public boolean y(faa faaVar) {
        return false;
    }

    @Override // a.yzs0
    public boolean y0(jys0 jys0Var) {
        return jys0Var.equals(sre0.f32672a.b(Object.class));
    }

    @Override // a.yzs0
    public aty z(ArrayList arrayList) {
        O0(this);
        throw null;
    }

    public tzj z0(dcg0 dcg0Var) {
        dcg0Var.getClass();
        if ((dcg0Var instanceof v2) && ((v2) dcg0Var).n()) {
            return (tzj) dcg0Var;
        }
        return null;
    }

    @Override // a.r4x
    public void h() {
    }

    @Override // a.r4x
    public void j(hzj hzjVar) {
    }

    @Override // a.yzs0
    public void t0(dcg0 dcg0Var) {
    }
}
