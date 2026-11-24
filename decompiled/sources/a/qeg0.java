package a;

import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public final class qeg0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Stack f28582a = new Stack();
    public nh00 b;

    public qeg0(pg9 pg9Var) {
        while (pg9Var instanceof seg0) {
            seg0 seg0Var = (seg0) pg9Var;
            this.f28582a.push(seg0Var);
            pg9Var = seg0Var.c;
        }
        this.b = (nh00) pg9Var;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nh00 next() {
        nh00 nh00Var;
        nh00 nh00Var2 = this.b;
        nh00 nh00Var3 = null;
        if (nh00Var2 == null) {
            itt0.a();
            return null;
        }
        do {
            Stack stack = this.f28582a;
            if (!stack.isEmpty()) {
                pg9 pg9Var = ((seg0) stack.pop()).d;
                while (pg9Var instanceof seg0) {
                    seg0 seg0Var = (seg0) pg9Var;
                    stack.push(seg0Var);
                    pg9Var = seg0Var.c;
                }
                nh00Var = (nh00) pg9Var;
            }
            this.b = nh00Var3;
            return nh00Var2;
        } while (nh00Var.b.length == 0);
        nh00Var3 = nh00Var;
        this.b = nh00Var3;
        return nh00Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
