package a;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class e8f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f7368a;
    public final /* synthetic */ f8f b;

    public e8f(f8f f8fVar, long j) {
        this.b = f8fVar;
        this.f7368a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f7368a);
        this.b.k.i(bundle);
        return null;
    }
}
