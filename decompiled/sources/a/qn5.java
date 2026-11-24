package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class qn5 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29015a;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;

    public /* synthetic */ qn5(ConstraintLayout constraintLayout, TextView textView, TextView textView2, byte b) {
        this.f29015a = b;
        this.b = constraintLayout;
        this.c = textView;
        this.d = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f29015a;
        return this.b;
    }
}
