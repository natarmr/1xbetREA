package a;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e33 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7115a;
    public final /* synthetic */ bhu0 b;

    public /* synthetic */ e33(bhu0 bhu0Var, byte b) {
        this.f7115a = b;
        this.b = bhu0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        byte b = this.f7115a;
        bhu0 bhu0Var = this.b;
        switch (b) {
            case 0:
                bhu0Var.q = (Function1) obj;
                return Unit.f46060a;
            case 1:
                cg80 cg80Var = (cg80) obj;
                AndroidComposeView androidComposeView = cg80Var instanceof AndroidComposeView ? (AndroidComposeView) cg80Var : null;
                if (androidComposeView != null) {
                    androidComposeView.getAndroidViewsHandler$ui().removeViewInLayout(bhu0Var);
                    zys0.c(androidComposeView.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(androidComposeView.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(bhu0Var));
                    bhu0Var.setImportantForAccessibility(0);
                }
                bhu0Var.removeAllViewsInLayout();
                return Unit.f46060a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = bhu0Var.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = bhu0Var.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
