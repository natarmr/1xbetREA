package a;

import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma3 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21441a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ma3(Object obj, byte b) {
        this.f21441a = b;
        this.b = obj;
    }

    public final void onBackInvoked() {
        byte b = this.f21441a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                ((pd3) obj).U();
                break;
            case 2:
                ((Function0) ((pz40) obj).getValue()).invoke();
                break;
            case 3:
                ((ph30) obj).d();
                break;
            case 4:
                ((ag60) obj).a();
                break;
            case 5:
                iiy[] iiyVarArr = bn70.S1;
                WindowInsetsController insetsController = ((Window) obj).getInsetsController();
                if (insetsController != null) {
                    insetsController.hide(WindowInsets.Type.ime());
                }
                break;
            default:
                ((ewq0) obj).run();
                break;
        }
    }
}
