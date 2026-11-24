package a;

import android.app.Activity;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.widget.AutoCompleteTextView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.work.impl.foreground.SystemForegroundService;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class sf3 {
    public static void A(int i, String str) {
        Trace.setCounter(str, i);
    }

    public static void B(xd3 xd3Var, Rect rect) {
        xd3Var.setEpicenterBounds(rect);
    }

    public static void C(SearchView$SearchAutoComplete searchView$SearchAutoComplete) {
        searchView$SearchAutoComplete.setInputMethodMode(1);
    }

    public static void D(xd3 xd3Var) {
        xd3Var.setIsClippedToScreen(true);
    }

    public static void E(PopupWindow popupWindow) {
        popupWindow.setTouchModal(false);
    }

    public static void F(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void G(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            wv00.f().i(e, SystemForegroundService.e, "Unable to start foreground service");
        } catch (SecurityException e2) {
            wv00.f().i(e2, SystemForegroundService.e, "Unable to start foreground service");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            jfv.m();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (jfv.g(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && r8x.f30049a == null) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 37) {
                    z = false;
                } else {
                    int iF = f(true);
                    if (i5 < 35 ? !(f(false) != 2 || iF == 1) : iF != 1) {
                        z = false;
                    }
                }
                r8x.f30049a = Boolean.valueOf(z);
                if (z) {
                }
            }
            return i3;
        }
        return 0;
    }

    public static void b(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }

    public static void c(Rect rect, Rect rect2, View view) {
        Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }

    public static ColorFilter d(int i, Object obj) {
        return new BlendModeColorFilter(i, (BlendMode) obj);
    }

    public static void e(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    public static int f(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            awq awqVar = new awq();
            awqVar.o = mg40.n("video/avc");
            androidx.media3.common.b bVar = new androidx.media3.common.b(awqVar);
            if (bVar.p != null) {
                rcf0 rcf0VarG = qm30.g(bVar, z, false);
                for (int i = 0; i < rcf0VarG.d; i++) {
                    if (((jm30) rcf0VarG.get(i)).d != null && (videoCapabilities = ((jm30) rcf0VarG.get(i)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        jfv.m();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (jfv.g(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (om30 unused) {
        }
        return 0;
    }

    public static ContentCaptureSession g(View view) {
        return view.getContentCaptureSession();
    }

    public static String h(Context context) {
        return context.getOpPackageName();
    }

    public static Insets i(Drawable drawable) {
        return drawable.getOpticalInsets();
    }

    public static boolean j() {
        return Trace.isEnabled();
    }

    public static boolean k() {
        return Trace.isEnabled();
    }

    public static AutofillId l(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static ViewStructure m(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static void n(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void o(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void p(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void q(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static Object r(n78 n78Var) {
        switch (o78.f24773a[n78Var.ordinal()]) {
            case 1:
                return BlendMode.CLEAR;
            case 2:
                return BlendMode.SRC;
            case 3:
                return BlendMode.DST;
            case 4:
                return BlendMode.SRC_OVER;
            case 5:
                return BlendMode.DST_OVER;
            case 6:
                return BlendMode.SRC_IN;
            case 7:
                return BlendMode.DST_IN;
            case 8:
                return BlendMode.SRC_OUT;
            case 9:
                return BlendMode.DST_OUT;
            case 10:
                return BlendMode.SRC_ATOP;
            case 11:
                return BlendMode.DST_ATOP;
            case 12:
                return BlendMode.XOR;
            case 13:
                return BlendMode.PLUS;
            case 14:
                return BlendMode.MODULATE;
            case 15:
                return BlendMode.SCREEN;
            case 16:
                return BlendMode.OVERLAY;
            case 17:
                return BlendMode.DARKEN;
            case 18:
                return BlendMode.LIGHTEN;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return BlendMode.COLOR_DODGE;
            case 20:
                return BlendMode.COLOR_BURN;
            case 21:
                return BlendMode.HARD_LIGHT;
            case 22:
                return BlendMode.SOFT_LIGHT;
            case 23:
                return BlendMode.DIFFERENCE;
            case 24:
                return BlendMode.EXCLUSION;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return BlendMode.MULTIPLY;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return BlendMode.HUE;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return BlendMode.SATURATION;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return BlendMode.COLOR;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets s(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void t(Resources.Theme theme) {
        theme.rebase();
    }

    public static void u(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static final void v(Activity activity, syb0.a aVar) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    public static void w(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void x(Paint paint, Object obj) {
        paint.setBlendMode((BlendMode) obj);
    }

    public static void y(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void z(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
