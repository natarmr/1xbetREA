package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class oyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f26069a;
    public final DsBottomBar b;
    public final DsNavigationBarBasic c;
    public final DsTextField d;
    public final MaterialTextView e;

    public oyq(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsNavigationBarBasic dsNavigationBarBasic, DsTextField dsTextField, MaterialTextView materialTextView) {
        this.f26069a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsNavigationBarBasic;
        this.d = dsTextField;
        this.e = materialTextView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f26069a;
    }
}
