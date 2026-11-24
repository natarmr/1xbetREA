package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ejk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f7914a;
    public final View b;

    public ejk(ConstraintLayout constraintLayout, View view) {
        this.f7914a = constraintLayout;
        this.b = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f7914a;
    }
}
