package a;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class dx3 implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6827a;
    public int b = -1;
    public boolean c;
    public final /* synthetic */ gx3 d;

    public dx3(gx3 gx3Var) {
        this.d = gx3Var;
        this.f6827a = gx3Var.c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.c) {
            jf4.n("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.b;
            gx3 gx3Var = this.d;
            if (Intrinsics.d(key, gx3Var.f(i)) && Intrinsics.d(entry.getValue(), gx3Var.j(this.b))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.c) {
            return this.d.f(this.b);
        }
        jf4.n("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.c) {
            return this.d.j(this.b);
        }
        jf4.n("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.f6827a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            jf4.n("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.b;
        gx3 gx3Var = this.d;
        Object objF = gx3Var.f(i);
        Object objJ = gx3Var.j(this.b);
        return (objF == null ? 0 : objF.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            itt0.a();
            return null;
        }
        this.b++;
        this.c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            v4i0.e();
            return;
        }
        this.d.g(this.b);
        this.b--;
        this.f6827a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.c) {
            return this.d.h(this.b, obj);
        }
        jf4.n("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return kng0.l(String.valueOf(getKey()), "=", String.valueOf(getValue()));
    }
}
