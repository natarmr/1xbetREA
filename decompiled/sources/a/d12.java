package a;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d12 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5290a;

    public /* synthetic */ d12(o55 o55Var, int i) {
        this.f5290a = (byte) 5;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5290a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.f45457a;
                return;
            case 1:
                vy40 vy40Var = AndroidComposeView.m2;
                synchronized (vy40Var) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr = vy40Var.f38232a;
                        int i3 = vy40Var.b;
                        int i4 = 0;
                        if (i2 < 30) {
                            while (i4 < i3) {
                                AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i4];
                                boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                                Class cls = AndroidComposeView.j2;
                                androidComposeView.setShowLayoutBounds(uc9.W());
                                if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                    androidComposeView.post(new gx2(androidComposeView, (byte) 2));
                                }
                                i4++;
                            }
                        } else {
                            while (i4 < i3) {
                                AndroidComposeView androidComposeView2 = (AndroidComposeView) objArr[i4];
                                androidComposeView2.post(new gx2(androidComposeView2, (byte) 3));
                                i4++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                kwd kwdVar = e7e.d2;
                return;
            case 3:
            case 4:
            default:
                return;
        }
    }

    public /* synthetic */ d12(byte b) {
        this.f5290a = b;
    }

    public /* synthetic */ d12(o55 o55Var, Bitmap bitmap) {
        this.f5290a = (byte) 4;
    }
}
