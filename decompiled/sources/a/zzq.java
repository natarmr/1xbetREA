package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f45267a;
    public final DSLottieEmptyContainer b;
    public final ConstraintLayout c;
    public final RecyclerView d;
    public final MaterialToolbar e;

    public zzq(ConstraintLayout constraintLayout, DSLottieEmptyContainer dSLottieEmptyContainer, ConstraintLayout constraintLayout2, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        this.f45267a = constraintLayout;
        this.b = dSLottieEmptyContainer;
        this.c = constraintLayout2;
        this.d = recyclerView;
        this.e = materialToolbar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f45267a;
    }
}
