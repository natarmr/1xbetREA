package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class pyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f27809a;
    public final DsBottomBar b;
    public final DsNavigationBarBasic c;
    public final ContentLoadingProgressBar d;
    public final DsPhoneTextField e;
    public final MaterialTextView f;
    public final MaterialTextView g;
    public final MaterialTextView h;

    public pyq(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsNavigationBarBasic dsNavigationBarBasic, ContentLoadingProgressBar contentLoadingProgressBar, DsPhoneTextField dsPhoneTextField, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f27809a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsNavigationBarBasic;
        this.d = contentLoadingProgressBar;
        this.e = dsPhoneTextField;
        this.f = materialTextView;
        this.g = materialTextView2;
        this.h = materialTextView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f27809a;
    }
}
