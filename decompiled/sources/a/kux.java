package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class kux implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f18933a;
    public final TextView b;

    public kux(ConstraintLayout constraintLayout, TextView textView) {
        this.f18933a = constraintLayout;
        this.b = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f18933a;
    }
}
