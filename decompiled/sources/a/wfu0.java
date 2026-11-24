package a;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class wfu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sab f39085a;
    public final ImageView b;

    public wfu0(sab sabVar, ImageView imageView) {
        this.f39085a = sabVar;
        this.b = imageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39085a;
    }
}
