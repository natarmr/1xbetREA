package a;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ax2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1602a;
    public final /* synthetic */ AndroidComposeView b;

    public /* synthetic */ ax2(AndroidComposeView androidComposeView, byte b) {
        this.f1602a = b;
        this.b = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1602a;
        AndroidComposeView androidComposeView = this.b;
        switch (b) {
            case 0:
                Class cls = AndroidComposeView.j2;
                return new c13(androidComposeView, androidComposeView.getTextInputService(), (vne) obj);
            case 1:
                Function0 function0 = (Function0) obj;
                Class cls2 = AndroidComposeView.j2;
                Handler handler = androidComposeView.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = androidComposeView.getHandler();
                    if (handler2 != null) {
                        handler2.post(new fx2(function0, (byte) 0));
                    }
                }
                return Unit.f46060a;
            case 2:
                Class cls3 = AndroidComposeView.j2;
                ((ypq) androidComposeView.getFocusOwner()).i(((jpq) obj).f16914a, false);
                return Unit.f46060a;
            case 3:
                return androidComposeView.getSavedStateRegistry();
            default:
                return Boolean.valueOf(androidComposeView.getScrollCaptureInProgress());
        }
    }
}
