package androidx.camera.camera2;

import a.b780;
import a.fvt0;
import a.fz9;
import a.k4a;
import a.l4a;
import a.ww9;
import a.wy40;
import a.xw9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/camera/camera2/Camera2Config$DefaultProvider", "La/k4a;", "<init>", "()V", "La/l4a;", "getCameraXConfig", "()La/l4a;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2Config$DefaultProvider implements k4a {
    @Override // a.k4a
    public l4a getCameraXConfig() {
        fz9 fz9Var = new fz9();
        wy40 wy40Var = (wy40) new fvt0().f10231a;
        wy40Var.y(l4a.b, fz9Var);
        wy40Var.y(l4a.c, new ww9());
        wy40Var.y(l4a.d, new xw9());
        wy40Var.y(l4a.l, Boolean.TRUE);
        return new l4a(b780.j(wy40Var));
    }
}
