package a;

import android.os.Trace;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gx2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12056a;
    public final /* synthetic */ AndroidComposeView b;

    public /* synthetic */ gx2(AndroidComposeView androidComposeView, byte b) {
        this.f12056a = b;
        this.b = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f12056a;
        AndroidComposeView androidComposeView = this.b;
        switch (b) {
            case 0:
                xw3 xw3Var = androidComposeView.i;
                Class cls = AndroidComposeView.j2;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!xw3Var.isEmpty()) {
                    try {
                        ((Function0) xw3Var.removeLast()).invoke();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            case 1:
                androidComposeView.Y1 = false;
                MotionEvent motionEvent = androidComposeView.N1;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    androidComposeView.I(motionEvent);
                    return;
                } else {
                    jf4.n("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                AndroidComposeView.j(androidComposeView.getRoot());
                return;
            default:
                AndroidComposeView.j(androidComposeView.getRoot());
                return;
        }
    }
}
