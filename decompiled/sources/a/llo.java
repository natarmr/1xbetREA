package a;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.appsflyer.huawei_referrer.HuaweiReferrer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.bonus_games.impl.memories.presentation.views.MemoryGameView;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class llo implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20257a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ llo(Object obj, Object obj2, byte b) {
        this.f20257a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        boolean z;
        View decorView;
        long j2 = -9223372036854775807L;
        byte b = 7;
        boolean z2 = true;
        switch (this.f20257a) {
            case 0:
                ulo uloVar = (ulo) this.b;
                amo amoVar = (amo) this.c;
                int i = uloVar.J - amoVar.b;
                uloVar.J = i;
                if (amoVar.e) {
                    uloVar.K = amoVar.c;
                    uloVar.L = true;
                }
                if (i == 0) {
                    bmq0 bmq0Var = ((yx90) amoVar.f).f43410a;
                    int iJ = -1;
                    if (!uloVar.n0.f43410a.p() && bmq0Var.p()) {
                        uloVar.o0 = -1;
                        uloVar.p0 = 0L;
                    }
                    if (!bmq0Var.p()) {
                        List listAsList = Arrays.asList(((wna0) bmq0Var).h);
                        x0x.K(listAsList.size() == uloVar.p.size());
                        for (int i2 = 0; i2 < listAsList.size(); i2++) {
                            ((slo) uloVar.p.get(i2)).b = (bmq0) listAsList.get(i2);
                        }
                    }
                    if (uloVar.L) {
                        boolean z3 = ((yx90) amoVar.f).f43410a.p() && uloVar.n0.f43410a.p();
                        boolean zB = ((yx90) amoVar.f).b.b(uloVar.n0.b);
                        boolean z4 = ((yx90) amoVar.f).d == uloVar.n0.s;
                        if (z3 || (zB && z4)) {
                            z2 = false;
                        }
                        if (z2) {
                            iJ = uloVar.j();
                            if (bmq0Var.p() || ((yx90) amoVar.f).b.c()) {
                                j2 = ((yx90) amoVar.f).d;
                            } else {
                                yx90 yx90Var = (yx90) amoVar.f;
                                vn30 vn30Var = yx90Var.b;
                                long j3 = yx90Var.d;
                                Object obj = vn30Var.f37698a;
                                amq0 amq0Var = uloVar.o;
                                bmq0Var.g(obj, amq0Var);
                                j2 = j3 + amq0Var.e;
                            }
                        }
                        j = j2;
                        z = z2;
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                    }
                    int i3 = iJ;
                    uloVar.L = false;
                    uloVar.a0((yx90) amoVar.f, 1, z, uloVar.K, j, i3, false);
                    return;
                }
                return;
            case 1:
                ((cgp) this.b).a((Intent) this.c);
                return;
            case 2:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 3:
                String str = (String) this.b;
                wmu0 wmu0Var = (wmu0) this.c;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(str), wmu0Var);
                throw wmu0Var;
            case 4:
                d930 d930Var = (d930) this.b;
                cp cpVar = (cp) this.c;
                d930Var.b(String.valueOf(cpVar.d()), ((q7b0) cpVar.u).b.getGameCollection());
                return;
            case 5:
                ((n5a) this.b).D((hmv) this.c, Unit.f46060a);
                return;
            case 6:
                xaw xawVar = (xaw) this.b;
                String str2 = (String) this.c;
                x0x.K(xawVar.k);
                xawVar.i.remove(str2);
                if (xawVar.m != null) {
                    xawVar.e(-9223372036854775807L);
                    return;
                }
                return;
            case 7:
                ybw ybwVar = (ybw) this.b;
                yaw yawVar = (yaw) this.c;
                jru jruVar = ybwVar.c;
                Uri uri = yawVar.m;
                uuj uujVar = (uuj) ((zaw) jruVar.b).b.d.get(uri);
                if (uujVar != null) {
                    uujVar.e(true, uri);
                    return;
                }
                return;
            case 8:
                ((HuaweiReferrer) this.b).lambda$start$0((Context) this.c);
                return;
            case 9:
                ibe0 ibe0Var = (ibe0) this.b;
                ibe0 ibe0Var2 = (ibe0) this.c;
                ibe0Var.e();
                if (ibe0Var2 != null) {
                    ibe0Var2.e();
                    return;
                }
                return;
            case 10:
                vzw vzwVar = (vzw) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(vzwVar.a());
                    return;
                } catch (Exception e2) {
                    taskCompletionSource2.setException(e2);
                    return;
                }
            case 11:
                Window window = (Window) this.b;
                q7y q7yVar = (q7y) this.c;
                if (window == null || (decorView = window.getDecorView()) == null) {
                    return;
                }
                decorView.post(q7yVar);
                return;
            case 12:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i4 = JobInfoSchedulerService.f45458a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 13:
                wsf0 wsf0Var = (wsf0) this.b;
                rrd rrdVar = (rrd) this.c;
                HashSet hashSet = new HashSet();
                if (wsf0Var != null) {
                    hashSet.addAll((LinkedHashSet) wsf0Var.b);
                }
                ((jhk) rrdVar.h).getClass();
                return;
            case 14:
                cyu cyuVar = (cyu) this.b;
                ca60 ca60Var = (ca60) this.c;
                yh00 yh00Var = (yh00) ((hy40) cyuVar.f5196a).d();
                if (yh00Var == null) {
                    return;
                }
                ca60Var.a(yh00Var.f42612a);
                return;
            case 15:
                Map.Entry entry = (Map.Entry) this.b;
                yh00 yh00Var2 = (yh00) this.c;
                ca60 ca60Var2 = (ca60) entry.getKey();
                yh00Var2.getClass();
                ca60Var2.a(yh00Var2.f42612a);
                return;
            case 16:
                Function1 function1 = (Function1) this.b;
                Throwable th = (Throwable) this.c;
                int i5 = LoadableImageView.i;
                function1.invoke(th);
                return;
            case 17:
                i820 i820Var = (i820) this.b;
                ViewPager2 viewPager2 = (ViewPager2) this.c;
                if (i820Var.N()) {
                    viewPager2.requestLayout();
                    return;
                }
                return;
            case 18:
                MaterialButton materialButton = (MaterialButton) this.b;
                Runnable runnable = (Runnable) this.c;
                int[] iArr = MaterialButton.r1;
                runnable.run();
                LinearLayout.LayoutParams layoutParams = materialButton.g1;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.g1 = null;
                    materialButton.A = -2.1474836E9f;
                }
                materialButton.requestLayout();
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((kn30) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 20:
                ((kn30) this.b).d.reportNetworkEvent((NetworkEvent) this.c);
                return;
            case 21:
                ((kn30) this.b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.c);
                return;
            case 22:
                ((kn30) this.b).d.reportPlaybackMetrics((PlaybackMetrics) this.c);
                return;
            case 23:
                ((kn30) this.b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.c);
                return;
            case 24:
                ((rbe) this.b).accept((bo30) this.c);
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                MemoryGameView memoryGameView = (MemoryGameView) this.b;
                mbz mbzVar = (mbz) this.c;
                memoryGameView.d = false;
                mbzVar.invoke();
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((d1x) this.c).e((ld40) this.b);
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Surface surface = (Surface) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                surface.release();
                surfaceTexture.release();
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wl50 wl50Var = (wl50) this.b;
                Context context = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new md3(wl50Var, b), intentFilter);
                return;
            default:
                md3 md3Var = (md3) this.b;
                Context context2 = (Context) this.c;
                wl50 wl50Var2 = (wl50) md3Var.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                if (connectivityManager == null) {
                    b = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            b = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        b = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        b = 4;
                                        break;
                                    case 13:
                                        b = 5;
                                        break;
                                    case 16:
                                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                    default:
                                        b = 6;
                                        break;
                                    case 18:
                                        b = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            b = 9;
                                        } else {
                                            b = 0;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                b = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        b = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        b = 4;
                                        break;
                                    case 13:
                                        b = 5;
                                        break;
                                    case 16:
                                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                    default:
                                        b = 6;
                                        break;
                                    case 18:
                                        b = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            b = 9;
                                        } else {
                                            b = 0;
                                        }
                                        break;
                                }
                            } else if (type == 6) {
                                b = 5;
                            } else if (type != 9) {
                                b = 8;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || b != 5) {
                    wl50Var2.c(b);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                    telephonyManager.getClass();
                    ul50 ul50Var = new ul50(wl50Var2);
                    telephonyManager.registerTelephonyCallback(wl50Var2.f39337a, ul50Var);
                    telephonyManager.unregisterTelephonyCallback(ul50Var);
                    return;
                } catch (RuntimeException unused2) {
                    wl50Var2.c(5);
                    return;
                }
        }
    }
}
