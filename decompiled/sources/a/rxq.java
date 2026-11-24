package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final class rxq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f31277a;
    public final LinearLayout b;
    public final MaterialButton c;
    public final MaterialButton d;
    public final LinearLayout e;
    public final RecyclerView f;
    public final RecyclerView g;
    public final DsNavigationBar h;

    public rxq(ConstraintLayout constraintLayout, LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, LinearLayout linearLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, DsNavigationBar dsNavigationBar) {
        this.f31277a = constraintLayout;
        this.b = linearLayout;
        this.c = materialButton;
        this.d = materialButton2;
        this.e = linearLayout2;
        this.f = recyclerView;
        this.g = recyclerView2;
        this.h = dsNavigationBar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31277a;
    }
}
