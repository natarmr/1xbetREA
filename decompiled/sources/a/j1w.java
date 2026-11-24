package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.check_box.old.DsCheckBoxOld;

/* JADX INFO: loaded from: classes4.dex */
public final class j1w implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f15756a;
    public final DsCheckBoxOld b;
    public final TextView c;
    public final View d;

    public j1w(ConstraintLayout constraintLayout, DsCheckBoxOld dsCheckBoxOld, TextView textView, View view) {
        this.f15756a = constraintLayout;
        this.b = dsCheckBoxOld;
        this.c = textView;
        this.d = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15756a;
    }
}
