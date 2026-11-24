package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.list_checkbox.DsListCheckBox;

/* JADX INFO: loaded from: classes.dex */
public final class k7g implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f17817a;
    public final DsListCheckBox b;
    public final ConstraintLayout c;
    public final AppCompatImageView d;
    public final AppCompatTextView e;

    public k7g(ConstraintLayout constraintLayout, DsListCheckBox dsListCheckBox, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f17817a = constraintLayout;
        this.b = dsListCheckBox;
        this.c = constraintLayout2;
        this.d = appCompatImageView;
        this.e = appCompatTextView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17817a;
    }
}
