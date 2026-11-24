package a;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.timepicker.ClockFaceView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.ByteArrayInputStream;
import java.util.HashSet;
import java.util.Locale;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;
import org.xplatform.uikit.components.search_field.DsSearchField;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wss implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39707a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wss(Object obj, byte b) {
        this.f39707a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:95:0x014f A[Catch: all -> 0x0114, TryCatch #0 {, blocks: (B:67:0x0109, B:69:0x010d, B:76:0x011a, B:80:0x0121, B:86:0x012c, B:88:0x0130, B:90:0x0136, B:92:0x0140, B:94:0x014a, B:96:0x015b, B:95:0x014f, B:97:0x015d, B:99:0x0170, B:101:0x0178), top: B:165:0x0109 }] */
    @Override // java.lang.Runnable
    public final void run() {
        ViewPager2 viewPager2;
        String strI0;
        TelephonyManager telephonyManager;
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        byte b = this.f39707a;
        byte b2 = 0;
        yje yjeVar = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((FrameLayout) obj).requestLayout();
                return;
            case 1:
                ((jru) obj).i();
                return;
            case 2:
                pyw pywVar = (pyw) obj;
                synchronized (pywVar.q) {
                    try {
                        pywVar.s = null;
                        b1x b1xVar = pywVar.r;
                        if (b1xVar != null) {
                            pywVar.r = null;
                            pywVar.f(b1xVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 3:
                ((e5t) obj).invoke();
                return;
            case 4:
                rrd rrdVar = (rrd) obj;
                if (((j4a) rrdVar.e) != null) {
                    rrdVar.C();
                    skz skzVar = (skz) rrdVar.f;
                    skzVar.getClass();
                    HashSet<f45> hashSet = (HashSet) rrdVar.i;
                    synchronized (skzVar.f32373a) {
                        try {
                            for (f45 f45Var : hashSet) {
                                if (skzVar.b.containsKey(f45Var)) {
                                    skzVar.k((okz) skzVar.b.get(f45Var));
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return;
                }
                return;
            case 5:
                bby bbyVar = (bby) obj;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                    return;
                }
                return;
            case 6:
                cut0.b((ByteArrayInputStream) obj);
                return;
            case 7:
                ((sb10) obj).c();
                return;
            case 8:
                a720 a720Var = (a720) obj;
                if (!a720Var.N() || (viewPager2 = a720Var.u2) == null) {
                    return;
                }
                viewPager2.requestLayout();
                return;
            case 9:
                int i = MatchInfoContainerView.t1;
                ((MatchInfoContainerView) obj).K();
                return;
            case 10:
                int[] iArr = MaterialButton.r1;
                ((MaterialButton) obj).r();
                return;
            case 11:
                int i2 = MaterialCalendarGridView.c;
                ((MaterialCalendarGridView) obj).c();
                return;
            case 12:
                ((wf40) obj).b();
                return;
            case 13:
                vl50 vl50Var = (vl50) obj;
                qsj qsjVar = (qsj) vl50Var.f37606a.get();
                if (qsjVar != null) {
                    int iB = vl50Var.c.b();
                    rsj rsjVar = qsjVar.f29261a;
                    synchronized (rsjVar) {
                        int i3 = rsjVar.n;
                        if (i3 == 0 || rsjVar.e) {
                            if (i3 != iB || rsjVar.o == null) {
                                rsjVar.n = iB;
                                if (iB != 1 && iB != 0 && iB != 8) {
                                    if (rsjVar.o == null) {
                                        Context context = rsjVar.f31033a;
                                        String str = vtt0.f38024a;
                                        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                                            strI0 = j47.I0(Locale.getDefault().getCountry());
                                        } else {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (TextUtils.isEmpty(networkCountryIso)) {
                                                strI0 = j47.I0(Locale.getDefault().getCountry());
                                            } else {
                                                strI0 = j47.I0(networkCountryIso);
                                            }
                                        }
                                        rsjVar.o = strI0;
                                    }
                                    rsjVar.l = rsjVar.b(iB);
                                    rsjVar.d.getClass();
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    rsjVar.c(rsjVar.g > 0 ? (int) (jElapsedRealtime - rsjVar.h) : 0, rsjVar.i, rsjVar.l);
                                    rsjVar.h = jElapsedRealtime;
                                    rsjVar.i = 0L;
                                    rsjVar.k = 0L;
                                    rsjVar.j = 0L;
                                    l8k0 l8k0Var = rsjVar.f;
                                    l8k0Var.f19609a.clear();
                                    l8k0Var.b = -1;
                                    l8k0Var.c = 0;
                                    l8k0Var.d = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 14:
                ((gy90) obj).m--;
                return;
            case 15:
                float[] fArr = PlayerControlView.i2;
                ((PlayerControlView) obj).s();
                return;
            case 16:
                ((PlayerView) obj).invalidate();
                return;
            case 17:
                jh70 jh70Var = d4b0.S1;
                ((d4b0) obj).I0();
                return;
            case 18:
                nh70 nh70Var = w4b0.Q1;
                ((w4b0) obj).I0();
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fl70 fl70Var = z6b0.S1;
                ((z6b0) obj).I0();
                return;
            case 20:
                zrb0 zrb0Var = (zrb0) obj;
                zrb0Var.i();
                DsSearchField dsSearchField = zrb0Var.k;
                String strValueOf = String.valueOf(dsSearchField.getEditText().getText());
                if (strValueOf.length() == 0) {
                    dsSearchField.setHint(zrb0Var.h);
                }
                dsSearchField.getEditText().setSelection(strValueOf.length());
                return;
            case 21:
                ((oub0) obj).r();
                return;
            case 22:
                tyb0 tyb0Var = (tyb0) obj;
                glz glzVar = tyb0Var.f;
                if (tyb0Var.b == 0) {
                    tyb0Var.c = true;
                    glzVar.d(kkz.ON_PAUSE);
                }
                if (tyb0Var.f34745a == 0 && tyb0Var.c) {
                    glzVar.d(kkz.ON_STOP);
                    tyb0Var.d = true;
                    return;
                }
                return;
            case 23:
                ymd0 ymd0Var = (ymd0) obj;
                fl70 fl70Var2 = ymd0.o2;
                kxq kxqVarB = ymd0Var.B();
                if (kxqVarB == null || (window = kxqVarB.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.addOnGlobalLayoutListener(ymd0Var.m2);
                return;
            case 24:
                ((ClockFaceView) obj).v();
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((AnimationDrawable) obj).start();
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                kcg0.setRippleState$lambda$1((kcg0) obj);
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                deg0 deg0Var = (deg0) obj;
                boolean z = deg0Var.c > 0;
                if (deg0Var.p.compareAndSet(false, true) && z) {
                    qjj.W(deg0Var.l.f(), deg0Var.s, null, new geg0(deg0Var, yjeVar, b2), 2);
                    return;
                }
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((lzw) obj).g();
                return;
            default:
                f2i0 f2i0Var = (f2i0) obj;
                eke0 eke0Var = f2i0.q2;
                if (f2i0Var.N()) {
                    f2i0Var.y0();
                    return;
                }
                return;
        }
    }
}
