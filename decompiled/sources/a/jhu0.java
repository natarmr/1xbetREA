package a;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jhu0 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16545a;
    final /* synthetic */ ViewGroup b;

    public jhu0(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16545a < this.b.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup = this.b;
        int i = this.f16545a;
        this.f16545a = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ViewGroup viewGroup = this.b;
        int i = this.f16545a - 1;
        this.f16545a = i;
        viewGroup.removeViewAt(i);
    }
}
