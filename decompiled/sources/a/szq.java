package a;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class szq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33083a;
    public final e0f b;
    public final ImageView c;

    public szq(ConstraintLayout constraintLayout, e0f e0fVar, ImageView imageView) {
        this.f33083a = constraintLayout;
        this.b = e0fVar;
        this.c = imageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f33083a;
    }
}
