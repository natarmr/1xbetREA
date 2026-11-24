package a;

import android.view.ActionMode;
import android.webkit.WebView;
import androidx.media3.exoplayer.ExoPlayer;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class ty2 implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34730a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ty2(Object obj, byte b) {
        this.f34730a = b;
        this.b = obj;
    }

    @Override // a.kwk
    public final void a() {
        xy40 xy40Var;
        boolean zIsTerminated;
        byte b = this.f34730a;
        boolean z = true;
        boolean z2 = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                xjk xjkVar = (xjk) obj;
                xjkVar.dismiss();
                xjkVar.h.e();
                break;
            case 1:
                rmb0 rmb0Var = (rmb0) obj;
                rmb0Var.e();
                rmb0Var.setTag(R.id.view_tree_lifecycle_owner, null);
                rmb0Var.p.removeViewImmediate(rmb0Var);
                break;
            case 2:
                h23 h23Var = (h23) obj;
                pgk0 pgk0Var = h23Var.e;
                jk8 jk8Var = pgk0Var.h;
                if (jk8Var != null) {
                    jk8Var.a();
                }
                pgk0Var.a();
                ActionMode actionMode = h23Var.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                h23Var.h = null;
                break;
            case 3:
                u96 u96Var = (u96) ((hgk0) ((v96) obj).c).getValue();
                if (u96Var != null) {
                    u96Var.close();
                }
                break;
            case 4:
                n5a n5aVar = ((bxq0) obj).c;
                if (n5aVar != null) {
                    n5aVar.h(null);
                }
                break;
            case 5:
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                try {
                    ((ulo) exoPlayer).W();
                    break;
                } catch (Exception unused) {
                }
                try {
                    ((ulo) exoPlayer).F();
                } catch (Exception unused2) {
                    return;
                }
                break;
            case 6:
                gl5 gl5Var = g5b.c2;
                o2t.a(((g5b) obj).F());
                break;
            case 7:
                kl5 kl5Var = gnc.Z1;
                o2t.a(((gnc) obj).F());
                break;
            case 8:
                ((k7q0) obj).m();
                break;
            case 9:
                ((aig) obj).x(fhg.f9539a);
                break;
            case 10:
                ((i3t0) obj).x(big.f2658a);
                break;
            case 11:
                ((fbz) obj).d = null;
                break;
            case 12:
                tbz tbzVar = (tbz) obj;
                o24 o24Var = tbzVar.c;
                if (o24Var != null) {
                    o24Var.f24513a = false;
                }
                tbzVar.c = null;
                break;
            case 13:
                WebView webView = (WebView) ((pz40) obj).getValue();
                if (webView != null) {
                    webView.destroy();
                }
                break;
            case 14:
                wl40 wl40Var = (wl40) obj;
                wl40Var.dismiss();
                wl40Var.i.e();
                break;
            case 15:
                ufk0 ufk0Var = (ufk0) obj;
                dw5 dw5Var = ufk0Var.f35582a;
                if (dw5Var == null) {
                    dsb0.b("Called dispose on a manager that has been disposed of");
                }
                dw5Var.e();
                ufk0Var.f35582a = null;
                break;
            case 16:
                wsz wszVar = dm60.P1;
                o2t.a(((dm60) obj).F());
                break;
            case 17:
                xuz xuzVar = xt60.V1;
                o2t.a(((xt60) obj).F());
                break;
            case 18:
                atz atzVar = gx60.R1;
                o2t.a(((gx60) obj).F());
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ccb0 ccb0Var = (ccb0) obj;
                mi70 mi70Var = ccb0.X1;
                vcc.C(ccb0Var, "ADD_ADDITIONAL_EVENTS_TO_COUPON_DIALOG_REQUEST__KEY");
                ccb0Var.C().g("KEY_2FA_ALERT");
                ccb0Var.C().g("REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY");
                ccb0Var.C().g("SWITCH_ON_NOTIFICATION_INFO_DIALOG_REQUEST_KEY");
                vcc.C(ccb0Var, "RESET_HASH_SECRET_KEY");
                ccb0Var.C().g("KZ_IDENTIFICATION_ALERT_REQUEST_KEY");
                ccb0Var.H0();
                vcc.C(ccb0Var, "request_key_notification_updated");
                break;
            case 20:
                o2t.a(((lmc0) obj).F());
                break;
            case 21:
                ye50 ye50Var = (ye50) obj;
                ye50Var.d();
                ye50Var.c = true;
                xw3 xw3Var = new xw3();
                xw3Var.addLast(ye50Var);
                while (!xw3Var.isEmpty()) {
                    ye50 ye50Var2 = (ye50) xw3Var.removeFirst();
                    ye50Var2.c = z;
                    xy40 xy40Var2 = ye50Var2.g;
                    xy40 xy40Var3 = ye50Var2.h;
                    xy40 xy40Var4 = ye50Var2.f;
                    Object[] objArr = xy40Var4.b;
                    long[] jArr = xy40Var4.c;
                    int i = xy40Var4.e;
                    while (true) {
                        long j = 2147483647L;
                        if (i != Integer.MAX_VALUE) {
                            int i2 = (int) (2147483647L & (jArr[i] >> 31));
                            xw3Var.addLast((ye50) objArr[i]);
                            i = i2;
                        } else {
                            xy40 xy40VarY = bww.Y(xy40Var3);
                            Object[] objArr2 = xy40VarY.b;
                            long[] jArr2 = xy40VarY.c;
                            int i3 = xy40VarY.e;
                            while (i3 != Integer.MAX_VALUE) {
                                long j2 = j;
                                int i4 = (int) ((jArr2[i3] >> 31) & j2);
                                ef50 ef50Var = (ef50) objArr2[i3];
                                ff50 ff50Var = ye50Var.e;
                                ff50Var.getClass();
                                ef50Var.getClass();
                                ff50Var.k.h(ef50Var);
                                ff50Var.j.h(ef50Var);
                                ff50Var.i.h(ef50Var);
                                ef50Var.f7705a = null;
                                ef50Var.b = false;
                                ef50Var.d();
                                i3 = i4;
                                j = j2;
                            }
                            long j3 = j;
                            xy40Var3.b();
                            xy40 xy40VarY2 = bww.Y(xy40Var2);
                            Object[] objArr3 = xy40VarY2.b;
                            long[] jArr3 = xy40VarY2.c;
                            int i5 = xy40VarY2.e;
                            while (i5 != Integer.MAX_VALUE) {
                                int i6 = (int) ((jArr3[i5] >> 31) & j3);
                                ((af50) objArr3[i5]).h();
                                i5 = i6;
                            }
                            xy40Var2.b();
                            xy40Var4.b();
                            ye50 ye50Var3 = ye50Var2.f42472a;
                            if (ye50Var3 != null && (xy40Var = ye50Var3.f) != null) {
                                xy40Var.h(ye50Var2);
                            }
                            ye50Var2.f42472a = null;
                            z = true;
                        }
                    }
                }
                break;
            case 22:
                AutoCloseable autoCloseable = (uiu0) obj;
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (!(autoCloseable instanceof ExecutorService)) {
                    e9d0.o();
                } else {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused3) {
                                if (!z2) {
                                    executorService.shutdownNow();
                                    z2 = true;
                                }
                            }
                        }
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                break;
            case 23:
                ((k3t0) obj).x(dkb0.f6223a);
                break;
            case 24:
                ((pvh0) ((p4) obj)).v1(null);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((mld) obj).a();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                svs0 svs0Var = nmu0.O1;
                o2t.a(((nmu0) obj).F());
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                hsv0 hsv0Var = (hsv0) obj;
                jvv0 jvv0Var = hsv0Var.b;
                gsv0 gsv0Var = hsv0Var.f;
                jvv0Var.getClass();
                if (jvv0Var.b == gsv0Var) {
                    jvv0Var.b = null;
                }
                hsv0Var.c = null;
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((hgk0) ((mwv0) obj).f22524a).setValue(null);
                break;
            default:
                ywv0 ywv0Var = (ywv0) obj;
                ((q99) ywv0Var.l.j.c).d(null);
                ((q99) ((hcp0) ywv0Var.m.e).c).d(null);
                break;
        }
    }
}
