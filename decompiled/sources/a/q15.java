package a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class q15 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f27934a;
    public final Handler b;

    public q15(Executor executor, Handler handler) {
        if (executor == null) {
            hny.u("Null cameraExecutor");
            throw null;
        }
        this.f27934a = executor;
        if (handler != null) {
            this.b = handler;
        } else {
            hny.u("Null schedulerHandler");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q15) {
            q15 q15Var = (q15) obj;
            if (this.f27934a.equals(q15Var.f27934a) && this.b.equals(q15Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.f27934a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f27934a + ", schedulerHandler=" + this.b + "}";
    }
}
