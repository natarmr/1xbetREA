package a;

import org.xplatform.uikit.components.segmented_control.DsSegmentItem;

/* JADX INFO: loaded from: classes6.dex */
public final class vvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f38099a;
    public DsSegmentItem b;

    public final void a(CharSequence charSequence) {
        this.f38099a = charSequence;
        DsSegmentItem dsSegmentItem = this.b;
        if (dsSegmentItem != null) {
            dsSegmentItem.setText(charSequence);
        }
    }
}
