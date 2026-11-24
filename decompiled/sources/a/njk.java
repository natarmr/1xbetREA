package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.search_field.DsSearchField;

/* JADX INFO: loaded from: classes5.dex */
public final class njk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f23641a;
    public final LottieView b;
    public final RecyclerView c;
    public final DsSearchField d;
    public final View e;

    public njk(ConstraintLayout constraintLayout, LottieView lottieView, RecyclerView recyclerView, DsSearchField dsSearchField, View view) {
        this.f23641a = constraintLayout;
        this.b = lottieView;
        this.c = recyclerView;
        this.d = dsSearchField;
        this.e = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f23641a;
    }
}
