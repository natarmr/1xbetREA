package a;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public abstract class vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Canvas f38128a = new Canvas();

    public static final uw2 a(vz2 vz2Var) {
        uw2 uw2Var = new uw2();
        uw2Var.f36374a = new Canvas(j2e.G(vz2Var));
        return uw2Var;
    }

    public static final Canvas b(x5a x5aVar) {
        x5aVar.getClass();
        return ((uw2) x5aVar).f36374a;
    }
}
