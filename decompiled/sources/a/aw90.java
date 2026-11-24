package a;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class aw90 implements yv90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aw90 f1563a = new aw90();

    @Override // a.yv90
    public final xv90 a(View view, boolean z, long j, float f, float f2, boolean z2, w6k w6kVar, float f3) {
        return new zv90(new Magnifier(view));
    }

    @Override // a.yv90
    public final boolean b() {
        return false;
    }
}
