package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class h4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f12447a;
    public final TextView b;
    public final TextView c;
    public final DsTextField d;
    public final TextView e;

    public h4r(ConstraintLayout constraintLayout, TextView textView, TextView textView2, DsTextField dsTextField, TextView textView3) {
        this.f12447a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = dsTextField;
        this.e = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f12447a;
    }
}
