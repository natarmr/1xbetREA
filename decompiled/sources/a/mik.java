package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;
import org.xplatform.uikit.components.search_field.DsSearchField;

/* JADX INFO: loaded from: classes5.dex */
public final class mik implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f21850a;
    public final DsLottieEmpty b;
    public final RecyclerView c;
    public final DsSearchField d;
    public final View e;

    public mik(ConstraintLayout constraintLayout, DsLottieEmpty dsLottieEmpty, RecyclerView recyclerView, DsSearchField dsSearchField, View view) {
        this.f21850a = constraintLayout;
        this.b = dsLottieEmpty;
        this.c = recyclerView;
        this.d = dsSearchField;
        this.e = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21850a;
    }
}
