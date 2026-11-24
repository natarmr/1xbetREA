package a;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16014a;

    public /* synthetic */ j7(Object obj) {
        this.f16014a = obj;
    }

    public static j7 a(boolean z, int i, int i2, int i3, int i4) {
        return new j7(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
