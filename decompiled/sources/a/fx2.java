package a;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fx2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10288a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ fx2(Function0 function0, byte b) {
        this.f10288a = b;
        this.b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f10288a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                Class cls = AndroidComposeView.j2;
                function0.invoke();
                break;
            case 1:
                Class cls2 = AndroidComposeView.j2;
                function0.invoke();
                break;
            case 2:
                function0.invoke();
                break;
            case 3:
                function0.invoke();
                break;
            case 4:
                function0.invoke();
                break;
            case 5:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
    }
}
