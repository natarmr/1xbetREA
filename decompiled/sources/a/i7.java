package a;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class i7 implements l5w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14266a;

    public /* synthetic */ i7(Object obj) {
        this.f14266a = obj;
    }

    public static i7 b(int i, int i2, int i3) {
        return new i7(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    @Override // a.m5w0
    public Object a() {
        return this.f14266a;
    }
}
