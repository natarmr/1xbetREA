package a;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k1a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f17511a;

    public k1a(rgi0 rgi0Var, int i) {
        this.f17511a = (i & 8) != 0 ? null : rgi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1a) && Intrinsics.d(this.f17511a, ((k1a) obj).f17511a);
    }

    public final int hashCode() {
        Executor executor = this.f17511a;
        return (executor == null ? 0 : executor.hashCode()) * 29791;
    }

    public final String toString() {
        return "ThreadConfig(defaultLightweightExecutor=null, defaultBackgroundExecutor=null, defaultBlockingExecutor=null, defaultCameraExecutor=" + this.f17511a + ", defaultCameraHandler=null, defaultCameraHandlerFn=null, testOnlyScope=null)";
    }
}
