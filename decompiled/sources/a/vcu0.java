package a;

import android.view.View;
import org.xplatform.statistic.stage.impl.stagetable.presentation.common.NonScrollableRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class vcu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NonScrollableRecyclerView f37205a;

    public vcu0(NonScrollableRecyclerView nonScrollableRecyclerView) {
        this.f37205a = nonScrollableRecyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f37205a;
    }
}
