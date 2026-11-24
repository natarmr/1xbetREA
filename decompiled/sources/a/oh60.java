package a;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import androidx.camera.view.PreviewView;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.xplatform.cyber.game.universal.impl.presentation.seabattle.view.SeaBattleView;
import org.xplatform.feature.office.payment.impl.presentation.view.PaymentWebView;
import org.xplatform.ui_core.viewcomponents.views.date.ScrollableSquaredDateView;
import org.xplatform.uikit_sport.score.SportScore;
import org.xplatform.uikit_sport.sport_collection.SportsCollectionMain;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh60 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25252a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oh60(Object obj, Object obj2, byte b) {
        this.f25252a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        ycm0 ziv0Var;
        ArrayList arrayList;
        Uri uriBuild;
        float fB;
        j0a j0aVarA;
        byte b = 1;
        switch (this.f25252a) {
            case 0:
                ((o2i0) this.b).i((qh60) this.c, Unit.f46060a);
                return;
            case 1:
                dg70 dg70Var = (dg70) this.b;
                ck60 ck60Var = (ck60) this.c;
                xuz xuzVar = dg70.Q1;
                kxq kxqVarB = dg70Var.B();
                if (kxqVarB != null) {
                    dg70Var.O1 = new iha(kxqVarB, new ds60(ck60Var, (byte) 11));
                    return;
                }
                return;
            case 2:
                mh70 mh70Var = (mh70) this.b;
                ck60 ck60Var2 = (ck60) this.c;
                jh70 jh70Var = mh70.Q1;
                kxq kxqVarB2 = mh70Var.B();
                if (kxqVarB2 != null) {
                    mh70Var.O1 = new iha(kxqVarB2, new ds60(ck60Var2, (byte) 12));
                    return;
                }
                return;
            case 3:
                gb90 gb90Var = (gb90) this.b;
                View view = (View) this.c;
                Window window = ((PaymentWebView) gb90Var.d).getWindow();
                ani0 ani0Var = new ani0(view);
                int i = Build.VERSION.SDK_INT;
                if (i >= 35) {
                    ziv0Var = new bjv0(window, ani0Var);
                } else if (i >= 30) {
                    ziv0Var = new ajv0(window, ani0Var);
                } else {
                    ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
                }
                ziv0Var.s(2);
                ziv0Var.s(519);
                ziv0Var.x(2);
                return;
            case 4:
                tr90 tr90Var = (tr90) this.b;
                RecyclerView recyclerView = (RecyclerView) this.c;
                fl70 fl70Var = zo90.p2;
                if (((kr90) tr90Var).c) {
                    recyclerView.y0(0);
                    return;
                }
                return;
            case 5:
                PlayerView playerView = (PlayerView) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                int i2 = PlayerView.j1;
                playerView.d(bitmap);
                return;
            case 6:
                SportsCollectionMain sportsCollectionMain = (SportsCollectionMain) this.b;
                u6b0 u6b0Var = (u6b0) this.c;
                xi70 xi70Var = u6b0.e2;
                RecyclerView recyclerView2 = sportsCollectionMain.getRecyclerView();
                if (recyclerView2 != null) {
                    u6b0Var.b2.b("SPORTS_FILTER_KEY_STATE", recyclerView2);
                    return;
                }
                return;
            case 7:
                ((nub0) this.b).d((pmn0) this.c);
                return;
            case 8:
                ((PreviewView) ((nv20) this.b).f24171a).l.d((pmn0) this.c);
                return;
            case 9:
                dzb0 dzb0Var = (dzb0) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                l8x.e0("ProcessingRequest", "onPostviewBitmapAvailable: request ID = " + dzb0Var.f6936a);
                snf0 snf0Var = dzb0Var.g;
                ofm0.m();
                if (snf0Var.g) {
                    return;
                }
                o55 o55Var = snf0Var.f32492a;
                o55Var.c.execute(new d12(o55Var, bitmap2));
                return;
            case 10:
                dzb0 dzb0Var2 = (dzb0) this.b;
                b1x b1xVar = (b1x) this.c;
                l8x.e0("ProcessingRequest", "onFinalResult(ImageProxy): request ID = " + dzb0Var2.f6936a);
                snf0 snf0Var2 = dzb0Var2.g;
                ofm0.m();
                if (snf0Var2.g) {
                    b1xVar.close();
                    return;
                }
                z1x.y("onImageCaptured() must be called before onFinalResult()", snf0Var2.c.b.isDone());
                snf0Var2.a();
                o55 o55Var2 = snf0Var2.f32492a;
                o55Var2.c.execute(new oh60(o55Var2, b1xVar, (byte) 29));
                return;
            case 11:
                dzb0 dzb0Var3 = (dzb0) this.b;
                ozw ozwVar = (ozw) this.c;
                l8x.F0("ProcessingRequest", "onProcessFailure: request ID = " + dzb0Var3.f6936a, ozwVar);
                snf0 snf0Var3 = dzb0Var3.g;
                ofm0.m();
                if (snf0Var3.g) {
                    return;
                }
                z1x.y("onImageCaptured() must be called before onFinalResult()", snf0Var3.c.b.isDone());
                snf0Var3.a();
                ofm0.m();
                o55 o55Var3 = snf0Var3.f32492a;
                o55Var3.c.execute(new apj0(o55Var3, ozwVar));
                return;
            case 12:
                ezb0 ezb0Var = (ezb0) this.b;
                xov0 xov0Var = (xov0) this.c;
                synchronized (ezb0Var.k) {
                    arrayList = new ArrayList(ezb0Var.j);
                    break;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zjo) it.next()).c(xov0Var, false);
                }
                return;
            case 13:
                ((y3c0) this.b).F((fvh0) this.c);
                return;
            case 14:
                amf0 amf0Var = (amf0) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    eps0.a().d.H(((q55) amf0Var.h.b).b(mwb0.c), 1);
                    break;
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 15:
                ((xvw) this.b).U((Typeface) this.c);
                return;
            case 16:
                ((a1d) ((ybf) this.b)).k((g0u) this.c);
                return;
            case 17:
                cym0 cym0Var = (cym0) this.b;
                htg0 htg0Var = (htg0) this.c;
                cym0Var.invoke();
                sps0 sps0Var = htg0Var.c;
                if (sps0Var != null) {
                    sps0Var.f();
                    return;
                }
                return;
            case 18:
                ((RecyclerView) this.b).B0(((ScrollableSquaredDateView) this.c).d.z());
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                SeaBattleView seaBattleView = (SeaBattleView) this.b;
                mie0 mie0Var = (mie0) this.c;
                int i3 = SeaBattleView.k;
                seaBattleView.g = (xch0) mie0Var.f21842a;
                seaBattleView.invalidate();
                return;
            case 20:
                ((ztj0) this.b).c.accept((jjv0) this.c);
                return;
            case 21:
                qxk0 qxk0Var = (qxk0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                int i4 = qxk0.l;
                SurfaceTexture surfaceTexture2 = qxk0Var.g;
                Surface surface = qxk0Var.h;
                Surface surface2 = new Surface(surfaceTexture);
                qxk0Var.g = surfaceTexture;
                qxk0Var.h = surface2;
                Iterator it2 = qxk0Var.f29488a.iterator();
                while (it2.hasNext()) {
                    ((qlo) it2.next()).f28944a.S(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 22:
                SportScore.j((p5h0) this.b, (SportScore) this.c);
                return;
            case 23:
                cam0 cam0Var = (cam0) this.b;
                o9m0 o9m0Var = (o9m0) this.c;
                if (((aam0) cam0Var).c) {
                    o9m0Var.g();
                    return;
                }
                return;
            case 24:
                pmi0 pmi0Var = (pmi0) this.b;
                uom0 uom0Var = (uom0) this.c;
                hru hruVar = (hru) ((jrs0) pmi0Var.f27236a).f;
                hruVar.getClass();
                xaw xawVar = (xaw) hruVar.f13549a;
                x0x.K(xawVar.k);
                b4x b4xVar = uom0Var.e;
                HashSet hashSet = xawVar.h;
                v3x v3xVarListIterator = b4xVar.listIterator(0);
                while (v3xVarListIterator.hasNext()) {
                    som0 som0Var = (som0) v3xVarListIterator.next();
                    String str = som0Var.f32550a;
                    tom0 tom0Var = som0Var.c;
                    String str2 = som0Var.b;
                    if (hashSet.contains(str) && !hashSet.contains(str2)) {
                        u3x u3xVar = new u3x(4);
                        u3x u3xVar2 = new u3x(4);
                        b4x<tbw> b4xVar2 = xawVar.d;
                        wcf0 wcf0Var = tom0Var.c;
                        for (tbw tbwVar : b4xVar2) {
                            Uri uri = (Uri) tbwVar.b.get(str);
                            String str3 = tbwVar.f33689a.b;
                            uri.getClass();
                            if (wcf0Var.containsKey(str3)) {
                                uriBuild = (Uri) wcf0Var.get(str3);
                                uriBuild.getClass();
                            } else {
                                uriBuild = xaw.b(uri, tom0Var).build();
                            }
                            if (uriBuild != null) {
                                u3xVar.b(uriBuild);
                                u3xVar2.b(uri);
                            }
                        }
                        xaw.d(som0Var, xawVar.e, u3xVar, u3xVar2);
                        xaw.d(som0Var, xawVar.f, u3xVar, u3xVar2);
                        xaw.d(som0Var, xawVar.g, u3xVar, u3xVar2);
                        hashSet.add(str2);
                        prc prcVar = xawVar.b;
                        rcf0 rcf0VarG = u3xVar.g();
                        rcf0 rcf0VarG2 = u3xVar2.g();
                        HashMap map = ((vuj) prcVar.b).d;
                        x0x.K(rcf0VarG.d == rcf0VarG2.d);
                        for (int i5 = 0; i5 < rcf0VarG.d; i5++) {
                            uuj uujVar = (uuj) map.get(rcf0VarG2.get(i5));
                            uujVar.getClass();
                            Uri uri2 = (Uri) rcf0VarG.get(i5);
                            uujVar.f36302a.b.put(str2, uri2);
                            HashMap map2 = uujVar.b;
                            tuj tujVar = (tuj) map2.get(uri2);
                            if (tujVar == null) {
                                map2.put(uri2, new tuj(uujVar.d, uri2, str2));
                            } else {
                                tujVar.b.add(str2);
                            }
                            map.put(uri2, uujVar);
                        }
                    }
                }
                xawVar.m = uom0Var.d;
                xawVar.e(-9223372036854775807L);
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((sbe) ((AtomicReference) this.c).get()).accept(new j55((imn0) this.b));
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ViewPager2 viewPager2 = (ViewPager2) this.b;
                fgo0 fgo0Var = (fgo0) this.c;
                s2m0 s2m0Var = ufo0.Q1;
                viewPager2.setCurrentItem(fgo0Var.b);
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ViewPager2 viewPager3 = (ViewPager2) this.b;
                xho0 xho0Var = (xho0) this.c;
                y2m0 y2m0Var = jho0.R1;
                viewPager3.setCurrentItem(xho0Var.b);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((ito0) this.b).e.remove((snf0) this.c);
                return;
            default:
                o55 o55Var4 = (o55) this.b;
                b1x b1xVar2 = (b1x) this.c;
                mz9 mz9Var = o55Var4.d;
                Objects.requireNonNull(mz9Var);
                Objects.requireNonNull(b1xVar2);
                Bitmap bitmapQ = m2x.q(b1xVar2);
                qz9 qz9Var = mz9Var.f22642a;
                okz okzVar = qz9Var.q2;
                if (okzVar == null || (j0aVarA = okzVar.a()) == null) {
                    fB = 0.0f;
                } else {
                    ewq ewqVar = (ewq) j0aVarA;
                    fB = ewqVar.B(((jyw) qz9Var.o2.getValue()).m()) - ewqVar.d();
                }
                float f = fB;
                d4a d4aVarS0 = qz9Var.S0();
                Rect rectU0 = b1xVar2.u0();
                rectU0.getClass();
                sac.V(jiu0.a(d4aVarS0), new y3a(d4aVarS0, b), null, null, new b4a(d4aVarS0, bitmapQ, rectU0, b1xVar2.K0().a(), f, null), 14);
                b1xVar2.close();
                return;
        }
    }
}
