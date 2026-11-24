package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class zcu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f44183a;
    public final TextView b;
    public final TextView c;

    public zcu0(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f44183a = constraintLayout;
        this.b = textView;
        this.c = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f44183a;
    }
}
