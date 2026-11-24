package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.search_field.DsSearchField;

/* JADX INFO: loaded from: classes3.dex */
public final class b7g implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f2106a;
    public final DsButton b;
    public final DSLottieEmptyContainer c;
    public final RecyclerView d;
    public final DsSearchField e;

    public b7g(ConstraintLayout constraintLayout, DsButton dsButton, DSLottieEmptyContainer dSLottieEmptyContainer, RecyclerView recyclerView, DsSearchField dsSearchField) {
        this.f2106a = constraintLayout;
        this.b = dsButton;
        this.c = dSLottieEmptyContainer;
        this.d = recyclerView;
        this.e = dsSearchField;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f2106a;
    }
}
