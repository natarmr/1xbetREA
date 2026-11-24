package a;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ex2 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8555a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ex2(Object obj, byte b) {
        this.f8555a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.f8555a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((AndroidComposeView) obj).postOnAnimation(runnable);
                break;
            case 1:
                ((q9o0) obj).e(runnable);
                break;
            default:
                tpt0 tpt0Var = (tpt0) obj;
                tpt0Var.c.execute(new qaq0(tpt0Var, runnable, (byte) 7));
                break;
        }
    }
}
