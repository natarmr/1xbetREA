package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a8m0 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ngk0 f433a;
    public final Iterator b;
    public int c;
    public Map.Entry d;
    public Map.Entry e;
    public final /* synthetic */ byte f;

    public a8m0(ngk0 ngk0Var, Iterator it, byte b) {
        this.f = b;
        this.f433a = ngk0Var;
        this.b = it;
        this.c = ngk0Var.c().d;
        a();
    }

    public final void a() {
        this.d = this.e;
        Iterator it = this.b;
        this.e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f) {
            case 0:
                a();
                if (this.d != null) {
                    return new z7m0(this);
                }
                v4i0.e();
                return null;
            case 1:
                Map.Entry entry = this.e;
                if (entry != null) {
                    a();
                    return entry.getKey();
                }
                v4i0.e();
                return null;
            default:
                Map.Entry entry2 = this.e;
                if (entry2 != null) {
                    a();
                    return entry2.getValue();
                }
                v4i0.e();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        ngk0 ngk0Var = this.f433a;
        if (ngk0Var.c().d != this.c) {
            jf4.e();
            return;
        }
        Map.Entry entry = this.d;
        if (entry == null) {
            v4i0.e();
            return;
        }
        ngk0Var.remove(entry.getKey());
        this.d = null;
        this.c = ngk0Var.c().d;
    }
}
