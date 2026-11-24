package a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j44 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15866a;
    public final /* synthetic */ Handler b;

    public /* synthetic */ j44(Handler handler, byte b) {
        this.f15866a = b;
        this.b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.f15866a;
        this.b.post(runnable);
    }
}
