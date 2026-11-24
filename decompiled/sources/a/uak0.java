package a;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class uak0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35333a;
    public int b = -1;
    public boolean c;
    public Iterator d;
    public final /* synthetic */ AbstractMap e;

    public /* synthetic */ uak0(AbstractMap abstractMap, byte b) {
        this.f35333a = b;
        this.e = abstractMap;
    }

    public Iterator a() {
        byte b = this.f35333a;
        AbstractMap abstractMap = this.e;
        switch (b) {
            case 0:
                Iterator it = this.d;
                if (it != null) {
                    return it;
                }
                Iterator it2 = ((nak0) abstractMap).c.entrySet().iterator();
                this.d = it2;
                return it2;
            case 1:
                Iterator it3 = this.d;
                if (it3 != null) {
                    return it3;
                }
                Iterator it4 = ((oak0) abstractMap).c.entrySet().iterator();
                this.d = it4;
                return it4;
            default:
                Iterator it5 = this.d;
                if (it5 != null) {
                    return it5;
                }
                Iterator it6 = ((pak0) abstractMap).b.entrySet().iterator();
                this.d = it6;
                return it6;
        }
    }

    public Iterator b() {
        Iterator it = this.d;
        if (it != null) {
            return it;
        }
        Iterator it2 = ((ggw0) this.e).c.entrySet().iterator();
        this.d = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f35333a;
        AbstractMap abstractMap = this.e;
        switch (b) {
            case 0:
                nak0 nak0Var = (nak0) abstractMap;
                if (this.b + 1 >= nak0Var.b.size()) {
                    return !nak0Var.c.isEmpty() && a().hasNext();
                }
                return true;
            case 1:
                return this.b + 1 < ((oak0) abstractMap).b.size() || a().hasNext();
            case 2:
                pak0 pak0Var = (pak0) abstractMap;
                if (this.b + 1 >= pak0Var.f26659a.size()) {
                    return !pak0Var.b.isEmpty() && a().hasNext();
                }
                return true;
            default:
                ggw0 ggw0Var = (ggw0) abstractMap;
                if (this.b + 1 >= ggw0Var.b) {
                    return !ggw0Var.c.isEmpty() && b().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f35333a;
        AbstractMap abstractMap = this.e;
        switch (b) {
            case 0:
                this.c = true;
                int i = this.b + 1;
                this.b = i;
                nak0 nak0Var = (nak0) abstractMap;
                return i < nak0Var.b.size() ? (Map.Entry) nak0Var.b.get(this.b) : (Map.Entry) a().next();
            case 1:
                this.c = true;
                int i2 = this.b + 1;
                this.b = i2;
                oak0 oak0Var = (oak0) abstractMap;
                return i2 < oak0Var.b.size() ? (Map.Entry) oak0Var.b.get(this.b) : (Map.Entry) a().next();
            case 2:
                this.c = true;
                int i3 = this.b + 1;
                this.b = i3;
                pak0 pak0Var = (pak0) abstractMap;
                return i3 < pak0Var.f26659a.size() ? (Map.Entry) pak0Var.f26659a.get(this.b) : (Map.Entry) a().next();
            default:
                this.c = true;
                int i4 = this.b + 1;
                this.b = i4;
                ggw0 ggw0Var = (ggw0) abstractMap;
                return i4 < ggw0Var.b ? (hgw0) ggw0Var.f11271a[i4] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.f35333a;
        AbstractMap abstractMap = this.e;
        switch (b) {
            case 0:
                nak0 nak0Var = (nak0) abstractMap;
                if (!this.c) {
                    jf4.n("remove() was called before next()");
                } else {
                    this.c = false;
                    int i = nak0.g;
                    nak0Var.b();
                    if (this.b >= nak0Var.b.size()) {
                        a().remove();
                    } else {
                        int i2 = this.b;
                        this.b = i2 - 1;
                        nak0Var.g(i2);
                    }
                }
                break;
            case 1:
                oak0 oak0Var = (oak0) abstractMap;
                if (!this.c) {
                    jf4.n("remove() was called before next()");
                } else {
                    this.c = false;
                    int i3 = oak0.f;
                    oak0Var.b();
                    if (this.b >= oak0Var.b.size()) {
                        a().remove();
                    } else {
                        int i4 = this.b;
                        this.b = i4 - 1;
                        oak0Var.f(i4);
                    }
                }
                break;
            case 2:
                pak0 pak0Var = (pak0) abstractMap;
                if (!this.c) {
                    jf4.n("remove() was called before next()");
                } else {
                    this.c = false;
                    int i5 = pak0.f;
                    pak0Var.b();
                    if (this.b >= pak0Var.f26659a.size()) {
                        a().remove();
                    } else {
                        int i6 = this.b;
                        this.b = i6 - 1;
                        pak0Var.h(i6);
                    }
                }
                break;
            default:
                if (!this.c) {
                    jf4.n("remove() was called before next()");
                } else {
                    this.c = false;
                    ggw0 ggw0Var = (ggw0) abstractMap;
                    ggw0Var.f();
                    int i7 = this.b;
                    if (i7 >= ggw0Var.b) {
                        b().remove();
                    } else {
                        this.b = i7 - 1;
                        ggw0Var.d(i7);
                    }
                }
                break;
        }
    }
}
