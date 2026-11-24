package a;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final class a1r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f86a;
    public final Button b;
    public final FrameLayout c;
    public final LottieView d;
    public final nq8 e;
    public final RecyclerView f;
    public final MaterialToolbar g;

    public a1r(ConstraintLayout constraintLayout, Button button, FrameLayout frameLayout, LottieView lottieView, nq8 nq8Var, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        this.f86a = constraintLayout;
        this.b = button;
        this.c = frameLayout;
        this.d = lottieView;
        this.e = nq8Var;
        this.f = recyclerView;
        this.g = materialToolbar;
    }

    public static a1r a(View view) {
        int i = R.id.buttonSave;
        Button button = (Button) yum0.f(view, R.id.buttonSave);
        if (button != null) {
            i = R.id.flSave;
            FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.flSave);
            if (frameLayout != null) {
                i = R.id.lottieEmptyView;
                LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
                if (lottieView != null) {
                    i = R.id.progress;
                    View viewF = yum0.f(view, R.id.progress);
                    if (viewF != null) {
                        FrameLayout frameLayout2 = (FrameLayout) viewF;
                        nq8 nq8Var = new nq8(frameLayout2, frameLayout2, (byte) 12);
                        i = R.id.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerView);
                        if (recyclerView != null) {
                            i = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                return new a1r((ConstraintLayout) view, button, frameLayout, lottieView, nq8Var, recyclerView, materialToolbar);
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f86a;
    }
}
