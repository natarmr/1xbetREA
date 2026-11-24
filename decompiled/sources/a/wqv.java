package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.bet_history.TimeTypeModel;
import org.xplatform.statistic.horse_menu.domain.model.HorseInfoModel;
import org.xplatform.ui_core.viewcomponents.views.large_banner_games_collection.LargeBannerGamesShimmerCollection;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wqv implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39611a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wqv(m1z m1zVar, Function1 function1) {
        this.f39611a = (byte) 26;
        this.c = m1zVar;
        this.b = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v32, types: [a.lc00, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r4v27 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jA;
        String[] strArrNames;
        http2StreamArr = null;
        Http2Stream[] http2StreamArr = null;
        switch (this.f39611a) {
            case 0:
                ((Function1) this.b).invoke(Long.valueOf(((vqv) this.c).d));
                return Unit.f46060a;
            case 1:
                mco mcoVar = (mco) this.b;
                n0o0 n0o0Var = mcoVar.r;
                n0o0 n0o0Var2 = mcoVar.s;
                n0o0 n0o0Var3 = mcoVar.o;
                n0o0 n0o0Var4 = mcoVar.n;
                n0o0 n0o0Var5 = mcoVar.m;
                n0o0 n0o0Var6 = mcoVar.p;
                jih jihVar = (jih) this.c;
                n0o0 n0o0Var7 = mcoVar.q;
                fee feeVar = (fee) n0o0Var7.getValue();
                Object obj = jihVar.b;
                e0g0 e0g0Var = j0g0.b;
                if (obj instanceof g0g0) {
                    obj = null;
                }
                Object obj2 = (List) obj;
                if (obj2 == null) {
                    obj2 = iun.f15405a;
                }
                feeVar.d(obj2);
                ((fee) n0o0Var6.getValue()).d(mcoVar.b());
                ((fee) n0o0Var5.getValue()).d(jwb.X(jihVar));
                ((fee) n0o0Var4.getValue()).d(Boolean.valueOf(kih.a(jihVar, ((ekw) mcoVar.b().c()).f7971a, true)));
                fee feeVar2 = (fee) n0o0Var3.getValue();
                Object obj3 = jihVar.e;
                if (obj3 instanceof g0g0) {
                    obj3 = null;
                }
                Object obj4 = (List) obj3;
                if (obj4 == null) {
                    obj4 = iun.f15405a;
                }
                feeVar2.d(obj4);
                ((fee) n0o0Var2.getValue()).d(phu0.W(jihVar));
                fee feeVar3 = (fee) n0o0Var.getValue();
                Object obj5 = jihVar.i;
                List list = (List) (obj5 instanceof g0g0 ? null : obj5);
                if (list == null) {
                    list = iun.f15405a;
                }
                feeVar3.d(cwr0.S(list));
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.add(((fee) n0o0Var7.getValue()).b());
                lc00VarB.add(((fee) n0o0Var6.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var5.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var4.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var3.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var2.getValue()).b());
                return twn.k(lc00VarB, (Collection) ((fee) n0o0Var.getValue()).b(), lc00VarB);
            case 2:
                ((Function1) this.b).invoke(((esv) this.c).f8347a);
                return Unit.f46060a;
            case 3:
                ((Function1) this.b).invoke(((dsv) this.c).b);
                return Unit.f46060a;
            case 4:
                ((x6f) this.b).invoke(Long.valueOf(((tvv) this.c).f34621a));
                return Unit.f46060a;
            case 5:
                axv axvVar = (axv) this.b;
                vcc.f0(i120.V(new Pair("TIME_MODEL_RESULT", (TimeTypeModel) this.c)), axvVar, axvVar.l2.n(axvVar, axv.o2[1]));
                axvVar.y0();
                return Unit.f46060a;
            case 6:
                izv izvVar = (izv) this.b;
                n3w n3wVar = (n3w) this.c;
                rqt rqtVar = izv.d2;
                izvVar.M0().d.A(n3wVar, izvVar.H0(), sys0.b);
                return Unit.f46060a;
            case 7:
                ((oaw) this.b).d((lm40) this.c);
                return Unit.f46060a;
            case 8:
                ((Function1) this.b).invoke(new jhw(((siw) this.c).c.f7879a));
                return Unit.f46060a;
            case 9:
                Function2 function2 = (Function2) this.b;
                xjw xjwVar = (xjw) this.c;
                function2.invoke(Integer.valueOf(xjwVar.f41006a), xjwVar.b);
                return Unit.f46060a;
            case 10:
                return new gnw(true, false, false, "", lak0.c, new wmw("", hmw.d, "", ""), new mc5(!h97.A((wyu) this.c, uaq0.f35345a), ((HorseInfoModel) this.b).f47035a));
            case 11:
                ((Function1) this.b).invoke(new xqw(((fpw) this.c).f9947a));
                return Unit.f46060a;
            case 12:
                Http2Connection http2Connection = (Http2Connection) this.b;
                Http2Stream http2Stream = (Http2Stream) this.c;
                try {
                    http2Connection.f46186a.b(http2Stream);
                    break;
                } catch (IOException e) {
                    Platform platform = Platform.f46208a;
                    Platform.f46208a.k(4, "Http2Connection.Listener failure for " + http2Connection.c, e);
                    try {
                        http2Stream.e(ErrorCode.PROTOCOL_ERROR, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return Unit.f46060a;
            case 13:
                Http2Connection.ReaderRunnable readerRunnable = (Http2Connection.ReaderRunnable) this.b;
                Settings settings = (Settings) this.c;
                mie0 mie0Var = new mie0();
                Http2Connection http2Connection2 = Http2Connection.this;
                synchronized (http2Connection2.x) {
                    synchronized (http2Connection2) {
                        try {
                            Settings settings2 = http2Connection2.s;
                            Settings settings3 = new Settings();
                            settings2.getClass();
                            for (int i = 0; i < 10; i++) {
                                if (((1 << i) & settings2.f46200a) != 0) {
                                    settings3.b(i, settings2.b[i]);
                                }
                            }
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & settings.f46200a) != 0) {
                                    settings3.b(i2, settings.b[i2]);
                                }
                            }
                            mie0Var.f21842a = settings3;
                            jA = ((long) settings3.a()) - ((long) settings2.a());
                            if (jA != 0 && !http2Connection2.b.isEmpty()) {
                                http2StreamArr = (Http2Stream[]) http2Connection2.b.values().toArray(new Http2Stream[0]);
                            }
                            Settings settings4 = (Settings) mie0Var.f21842a;
                            settings4.getClass();
                            http2Connection2.s = settings4;
                            TaskQueue.c(http2Connection2.j, http2Connection2.c + " onSettings", 0L, new wqv(http2Connection2, mie0Var, (byte) 14), 6);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        http2Connection2.x.a((Settings) mie0Var.f21842a);
                    } catch (IOException e2) {
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        http2Connection2.a(errorCode, errorCode, e2);
                    }
                    break;
                }
                if (http2StreamArr != null) {
                    for (Http2Stream http2Stream2 : http2StreamArr) {
                        synchronized (http2Stream2) {
                            http2Stream2.e += jA;
                            if (jA > 0) {
                                http2Stream2.notifyAll();
                            }
                            break;
                        }
                    }
                }
                return Unit.f46060a;
            case 14:
                Http2Connection http2Connection3 = (Http2Connection) this.b;
                http2Connection3.f46186a.a(http2Connection3, (Settings) ((mie0) this.c).f21842a);
                return Unit.f46060a;
            case 15:
                v70 v70Var = (v70) this.b;
                ykg0 ykg0Var = (ykg0) this.c;
                dke0 dke0Var = (dke0) v70Var.v;
                ysw yswVar = ykg0Var.c;
                String str = yswVar.b;
                if (str.length() == 0) {
                    str = yswVar.f43189a;
                }
                dke0Var.invoke(str, Boolean.valueOf(yswVar.b.length() > 0));
                return Unit.f46060a;
            case 16:
                ((Function1) this.b).invoke(Long.valueOf(((doh) this.c).f6415a));
                return Unit.f46060a;
            case 17:
                ((Function1) this.b).invoke(((eoh) this.c).g);
                return Unit.f46060a;
            case 18:
                return new x5y(String.valueOf(((hrc) this.b).a()), new vm5(0L, -1L, "", "", false), new zw6(androidx.compose.runtime.e.e(new a8q0("", 0L, 6)), -1.0d, -1.0d, -1.0d), ((ctf0) this.c).b.a(R.string.toto_jackpot_tax_info, Arrays.copyOf(new Object[0], 0)), false, false);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ugi0 ugi0Var = (ugi0) this.b;
                vby vbyVar = (vby) this.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                dcy dcyVar = vbyVar.f37162a;
                ady.d(vbyVar, ugi0Var);
                int iD = ugi0Var.d();
                for (int i3 = 0; i3 < iD; i3++) {
                    List listF = ugi0Var.f(i3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : listF) {
                        if (obj6 instanceof zcy) {
                            arrayList.add(obj6);
                        }
                    }
                    zcy zcyVar = (zcy) CollectionsKt.x0(arrayList);
                    if (zcyVar != null && (strArrNames = zcyVar.names()) != null) {
                        for (String str2 : strArrNames) {
                            String str3 = Intrinsics.d(ugi0Var.l(), zgi0.b) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                throw new kcy(xww.B(-1, "The suggested name '" + str2 + "' for " + str3 + ' ' + ugi0Var.e(i3) + " is already one of the names for " + str3 + ' ' + ugi0Var.e(((Number) xp20.d(linkedHashMap, str2)).intValue()) + " in " + ugi0Var, null, null, null));
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i3));
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    return linkedHashMap;
                }
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return lunVar;
            case 20:
                ((kuy) this.b).f18934a.a().unregisterOnSharedPreferenceChangeListener((iuy) this.c);
                return Unit.f46060a;
            case 21:
                Context context = (Context) this.b;
                LargeBannerGamesShimmerCollection largeBannerGamesShimmerCollection = (LargeBannerGamesShimmerCollection) this.c;
                int i4 = LargeBannerGamesShimmerCollection.g;
                ?? B = kotlin.collections.a.b();
                for (int i5 = 0; i5 < 3; i5++) {
                    DsShimmerView dsShimmerView = new DsShimmerView(context, null, 6);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary20, context)));
                    dsShimmerView.setBackground(gradientDrawable);
                    jmu0.i(dsShimmerView, largeBannerGamesShimmerCollection.f47217a);
                    B.add(dsShimmerView);
                }
                lc00 lc00VarA = kotlin.collections.a.a(B);
                ListIterator listIterator = lc00VarA.listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        return lc00VarA;
                    }
                    largeBannerGamesShimmerCollection.addView((View) pawVar.next());
                }
                break;
            case 22:
                ((Function1) this.b).invoke(((ezy) this.c).e);
                return Unit.f46060a;
            case 23:
                ((Function1) this.b).invoke(((fzy) this.c).e);
                return Unit.f46060a;
            case 24:
                ((Function1) this.b).invoke(((hzy) this.c).g);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                q0z q0zVar = (q0z) this.b;
                n3q n3qVar = (n3q) this.c;
                art artVar = q0z.n2;
                if (!q0zVar.R()) {
                    vcc.f0(i120.V(new Pair("REQUEST_SELECT_FILTER_MODEL", n3qVar)), q0zVar, q0zVar.k2.n(q0zVar, q0z.o2[0]));
                    q0zVar.y0();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                m1z m1zVar = (m1z) this.c;
                Function1 function1 = (Function1) this.b;
                if (m1zVar.c().h) {
                    function1.invoke(k0z.f17492a);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gxu gxuVar = (gxu) this.b;
                j4z j4zVar = (j4z) this.c;
                ix50 ix50Var = ((jx50) gxuVar.c).f17287a;
                Long l = ix50Var.b;
                if (l == null) {
                    l = ix50Var.f15525a;
                }
                if (l != null) {
                    return new z3z(l.longValue());
                }
                h4z h4zVar = j4zVar.f15908a;
                return new y3z(h4zVar.f12456a, h4zVar.d);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                e7z e7zVar = (e7z) this.b;
                mie0 mie0Var2 = (mie0) this.c;
                tzi tziVar = e7zVar.h1;
                if ((((lm40) tziVar.g).d & 8) != 0) {
                    for (lm40 lm40Var = (wso0) tziVar.f; lm40Var != null; lm40Var = lm40Var.e) {
                        if ((lm40Var.c & 8) != 0) {
                            ?? V = lm40Var;
                            ?? xz40Var = 0;
                            while (V != 0) {
                                if (V instanceof qai0) {
                                    qai0 qai0Var = (qai0) V;
                                    if (qai0Var.y()) {
                                        nai0 nai0Var = new nai0();
                                        mie0Var2.f21842a = nai0Var;
                                        nai0Var.d = true;
                                    }
                                    if (qai0Var.J0()) {
                                        ((nai0) mie0Var2.f21842a).c = true;
                                    }
                                    qai0Var.x0((abi0) mie0Var2.f21842a);
                                } else if ((V.c & 8) != 0 && (V instanceof f3k)) {
                                    lm40 lm40Var2 = ((f3k) V).p;
                                    int i6 = 0;
                                    V = V;
                                    xz40Var = xz40Var;
                                    while (lm40Var2 != null) {
                                        if ((lm40Var2.c & 8) != 0) {
                                            i6++;
                                            xz40Var = xz40Var;
                                            if (i6 == 1) {
                                                V = lm40Var2;
                                            } else {
                                                if (xz40Var == 0) {
                                                    xz40Var = new xz40(new lm40[16]);
                                                }
                                                if (V != 0) {
                                                    xz40Var.b(V);
                                                    V = 0;
                                                }
                                                xz40Var.b(lm40Var2);
                                            }
                                        }
                                        lm40Var2 = lm40Var2.f;
                                        V = V;
                                        xz40Var = xz40Var;
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                V = vcc.V(xz40Var);
                            }
                        }
                    }
                }
                return Unit.f46060a;
            default:
                zbk zbkVar = (zbk) this.b;
                d9z d9zVar = (d9z) this.c;
                i8z i8zVar = (i8z) zbkVar.getValue();
                return new j8z(d9zVar, i8zVar, new androidx.compose.foundation.lazy.layout.c((IntRange) d9zVar.d.f.getValue(), i8zVar));
        }
    }

    public /* synthetic */ wqv(Object obj, Object obj2, byte b) {
        this.f39611a = b;
        this.b = obj;
        this.c = obj2;
    }
}
