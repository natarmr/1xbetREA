package a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l7 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ok50 f19532a;

    public l7(ok50 ok50Var) {
        this.f19532a = ok50Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        k7 k7VarE = this.f19532a.e(i);
        if (k7VarE == null) {
            return null;
        }
        return k7VarE.f17795a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        k7 k7VarH = this.f19532a.h(i);
        if (k7VarH == null) {
            return null;
        }
        return k7VarH.f17795a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f19532a.n(i, i2, bundle);
    }
}
