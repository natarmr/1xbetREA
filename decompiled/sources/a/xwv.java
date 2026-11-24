package a;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xwv implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41629a;
    public final /* synthetic */ View b;
    public final /* synthetic */ yke c;

    public /* synthetic */ xwv(yke ykeVar, View view, byte b) {
        this.f41629a = b;
        this.c = ykeVar;
        this.b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        byte b = this.f41629a;
        View view = this.b;
        yke ykeVar = this.c;
        switch (b) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) ykeVar;
                if (z && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.x(view);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) ykeVar;
                if (z && hideViewOnScrollBehavior.j == 1) {
                    hideViewOnScrollBehavior.y(view);
                    break;
                }
                break;
        }
    }
}
