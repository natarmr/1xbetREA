package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes4.dex */
public final class rzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f31375a;
    public final DsButton b;
    public final RecyclerView c;
    public final jk3 d;
    public final DsButton e;

    public rzq(FrameLayout frameLayout, DsButton dsButton, RecyclerView recyclerView, jk3 jk3Var, DsButton dsButton2) {
        this.f31375a = frameLayout;
        this.b = dsButton;
        this.c = recyclerView;
        this.d = jk3Var;
        this.e = dsButton2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31375a;
    }
}
