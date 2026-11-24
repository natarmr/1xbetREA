package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class y5o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f42058a;
    public final iab b;
    public final lth c;
    public final iab d;
    public final lth e;
    public final TextView f;
    public final TextView g;
    public final TextView h;

    public y5o0(ConstraintLayout constraintLayout, iab iabVar, lth lthVar, iab iabVar2, lth lthVar2, TextView textView, TextView textView2, TextView textView3) {
        this.f42058a = constraintLayout;
        this.b = iabVar;
        this.c = lthVar;
        this.d = iabVar2;
        this.e = lthVar2;
        this.f = textView;
        this.g = textView2;
        this.h = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f42058a;
    }
}
