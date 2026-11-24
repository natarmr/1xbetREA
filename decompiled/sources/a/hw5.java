package a;

import android.content.Context;
import android.view.MotionEvent;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class hw5 extends wo8 {
    public final /* synthetic */ byte r = 0;
    public final /* synthetic */ yo8 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw5(stl stlVar, Context context) {
        super(context, R.style.ThemeOverlay_AppTheme_BottomSheetDialog);
        this.s = stlVar;
    }

    @Override // a.wo8, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        byte b = this.r;
        yo8 yo8Var = this.s;
        switch (b) {
            case 0:
                ((iw5) yo8Var).e2 = true;
                super.cancel();
                break;
            case 1:
                ((nw5) yo8Var).Z1 = true;
                super.cancel();
                break;
            default:
                ((stl) yo8Var).d2 = true;
                super.cancel();
                break;
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.r;
        motionEvent.getClass();
        switch (b) {
            case 0:
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (NullPointerException e) {
                    if (StringsKt.O(tjo.b(e), "resetCancelNextUpFlag", false)) {
                        return false;
                    }
                    throw e;
                }
            case 1:
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (NullPointerException e2) {
                    if (StringsKt.O(tjo.b(e2), "resetCancelNextUpFlag", false)) {
                        return false;
                    }
                    throw e2;
                }
            default:
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (NullPointerException e3) {
                    if (StringsKt.O(tjo.b(e3), "resetCancelNextUpFlag", false)) {
                        return false;
                    }
                    throw e3;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw5(nw5 nw5Var, Context context) {
        super(context, R.style.ThemeOverlay_AppTheme_BottomSheetDialog);
        this.s = nw5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw5(iw5 iw5Var, Context context) {
        super(context, R.style.ThemeOverlay_AppTheme_BottomSheetDialog);
        this.s = iw5Var;
    }
}
