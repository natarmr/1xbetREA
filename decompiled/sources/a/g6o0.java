package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class g6o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f10778a;
    public final LinearLayout b;

    public g6o0(ConstraintLayout constraintLayout, LinearLayout linearLayout) {
        this.f10778a = constraintLayout;
        this.b = linearLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10778a;
    }
}
