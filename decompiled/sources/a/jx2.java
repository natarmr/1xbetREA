package a;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* JADX INFO: loaded from: classes.dex */
public final class jx2 extends p6 {
    public final /* synthetic */ AndroidComposeView d;
    public final /* synthetic */ e7z e;
    public final /* synthetic */ AndroidComposeView f;

    public jx2(AndroidComposeView androidComposeView, e7z e7zVar, AndroidComposeView androidComposeView2) {
        this.d = androidComposeView;
        this.e = e7zVar;
        this.f = androidComposeView2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // a.p6
    public final void d(View view, k7 k7Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = k7Var.f17795a;
        this.f26429a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        AndroidComposeView androidComposeView = this.d;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = androidComposeView.w;
        if (androidComposeViewAccessibilityDelegateCompat.v()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        e7z e7zVar = this.e;
        e7z e7zVarV = e7zVar.v();
        while (true) {
            if (e7zVarV == null) {
                e7zVarV = null;
                break;
            } else if (e7zVarV.h1.j(8)) {
                break;
            } else {
                e7zVarV = e7zVarV.v();
            }
        }
        Integer numValueOf = e7zVarV != null ? Integer.valueOf(e7zVarV.b) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == androidComposeView.getSemanticsOwner().a().f) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        k7Var.b = iIntValue;
        AndroidComposeView androidComposeView2 = this.f;
        accessibilityNodeInfo.setParent(androidComposeView2, iIntValue);
        int i = e7zVar.b;
        int iD = androidComposeViewAccessibilityDelegateCompat.B.d(i);
        if (iD != -1) {
            k33 k33VarK = x1x.K(androidComposeView.getAndroidViewsHandler$ui(), iD);
            if (k33VarK != null) {
                accessibilityNodeInfo.setTraversalBefore(k33VarK);
            } else {
                accessibilityNodeInfo.setTraversalBefore(androidComposeView2, iD);
            }
            androidComposeView.b(i, accessibilityNodeInfo, androidComposeViewAccessibilityDelegateCompat.Z);
        }
        int iD2 = androidComposeViewAccessibilityDelegateCompat.Y.d(i);
        if (iD2 != -1) {
            k33 k33VarK2 = x1x.K(androidComposeView.getAndroidViewsHandler$ui(), iD2);
            if (k33VarK2 != null) {
                accessibilityNodeInfo.setTraversalAfter(k33VarK2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(androidComposeView2, iD2);
            }
            androidComposeView.b(i, accessibilityNodeInfo, androidComposeViewAccessibilityDelegateCompat.f1);
        }
    }
}
