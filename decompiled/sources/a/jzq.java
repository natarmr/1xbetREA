package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes4.dex */
public final class jzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f17429a;
    public final DsBottomBar b;
    public final Group c;
    public final DsNavigationBar d;
    public final FrameLayout e;
    public final DsTextField f;
    public final MaterialTextView g;
    public final MaterialTextView h;
    public final MaterialTextView i;
    public final View j;
    public final View k;

    public jzq(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, Group group, DsNavigationBar dsNavigationBar, FrameLayout frameLayout, DsTextField dsTextField, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, View view, View view2) {
        this.f17429a = constraintLayout;
        this.b = dsBottomBar;
        this.c = group;
        this.d = dsNavigationBar;
        this.e = frameLayout;
        this.f = dsTextField;
        this.g = materialTextView;
        this.h = materialTextView2;
        this.i = materialTextView3;
        this.j = view;
        this.k = view2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17429a;
    }
}
