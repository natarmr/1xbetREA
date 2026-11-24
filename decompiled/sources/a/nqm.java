package a;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.xplatform.uikit.components.segmented_control.DsSegmentItem;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes6.dex */
public final class nqm implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DsSegmentItem f23967a;
    public final /* synthetic */ DsSegmentedGroup b;
    public final /* synthetic */ boolean c;

    public nqm(DsSegmentItem dsSegmentItem, DsSegmentedGroup dsSegmentedGroup, boolean z) {
        this.f23967a = dsSegmentItem;
        this.b = dsSegmentedGroup;
        this.c = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        DsSegmentItem dsSegmentItem = this.f23967a;
        int x = (int) dsSegmentItem.getX();
        int width = dsSegmentItem.getWidth();
        DsSegmentedGroup dsSegmentedGroup = this.b;
        dsSegmentedGroup.i = width;
        Rect rect = dsSegmentedGroup.f;
        if (!rect.isEmpty() && this.c) {
            kul0 kul0Var = dsSegmentedGroup.h;
            if (kul0Var != null) {
                kul0Var.a(x);
                return;
            }
            return;
        }
        dsSegmentItem.getHeight();
        rect.set(x, (int) dsSegmentItem.getY(), dsSegmentItem.getWidth() + x, dsSegmentItem.getHeight() + ((int) dsSegmentItem.getY()));
        Drawable drawable = dsSegmentedGroup.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        dsSegmentedGroup.g.f13023a = x;
        dsSegmentItem.invalidate();
    }
}
