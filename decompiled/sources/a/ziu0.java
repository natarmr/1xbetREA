package a;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ziu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f44455a;
    public int b;
    public int c;
    public int d;

    public ziu0(View view) {
        this.f44455a = view;
    }

    public final void a() {
        int i = this.d;
        View view = this.f44455a;
        int top = i - (view.getTop() - this.b);
        WeakHashMap weakHashMap = rgu0.f30456a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.c));
    }

    public final boolean b(int i) {
        if (this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}
