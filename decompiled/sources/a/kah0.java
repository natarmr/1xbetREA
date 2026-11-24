package a;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class kah0 implements lah0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f17963a;

    public kah0(NestedScrollView nestedScrollView) {
        this.f17963a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // a.lah0
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f17963a.onScrollLimit(i, i2, i3, z);
    }

    @Override // a.lah0
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f17963a.onScrollProgress(i, i2, i3, i4);
    }
}
