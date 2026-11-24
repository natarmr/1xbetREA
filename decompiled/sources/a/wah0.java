package a;

import android.view.View;
import android.widget.HorizontalScrollView;
import org.xplatform.uikit.components.chips.DsChipGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class wah0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HorizontalScrollView f38826a;
    public final DsChipGroup b;

    public wah0(HorizontalScrollView horizontalScrollView, DsChipGroup dsChipGroup) {
        this.f38826a = horizontalScrollView;
        this.b = dsChipGroup;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38826a;
    }
}
