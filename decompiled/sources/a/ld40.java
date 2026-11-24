package a;

import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ld40 implements e1x, iwq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19832a;
    public final wx9 b;
    public int c;
    public final viq d;
    public boolean e;
    public final cgx0 f;
    public d1x g;
    public Executor h;
    public final LongSparseArray i;
    public final LongSparseArray j;
    public int k;
    public final ArrayList l;
    public final ArrayList m;

    public ld40(int i, int i2, int i3, int i4) {
        cgx0 cgx0Var = new cgx0(ImageReader.newInstance(i, i2, i3, i4));
        this.f19832a = new Object();
        this.b = new wx9(this, (byte) 2);
        this.c = 0;
        this.d = new viq(this, (byte) 23);
        this.e = false;
        this.i = new LongSparseArray();
        this.j = new LongSparseArray();
        this.m = new ArrayList();
        this.f = cgx0Var;
        this.k = 0;
        this.l = new ArrayList(G());
    }

    @Override // a.e1x
    public final int G() {
        int iG;
        synchronized (this.f19832a) {
            iG = this.f.G();
        }
        return iG;
    }

    @Override // a.iwq
    public final void a(jwq jwqVar) {
        synchronized (this.f19832a) {
            c(jwqVar);
        }
    }

    @Override // a.e1x
    public final b1x b() {
        synchronized (this.f19832a) {
            try {
                if (this.l.isEmpty()) {
                    return null;
                }
                if (this.k >= this.l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.l.size() - 1; i++) {
                    if (!this.m.contains(this.l.get(i))) {
                        arrayList.add((b1x) this.l.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((b1x) it.next()).close();
                }
                int size = this.l.size();
                ArrayList arrayList2 = this.l;
                this.k = size;
                b1x b1xVar = (b1x) arrayList2.get(size - 1);
                this.m.add(b1xVar);
                return b1xVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.e1x
    public final b1x b0() {
        synchronized (this.f19832a) {
            try {
                if (this.l.isEmpty()) {
                    return null;
                }
                if (this.k >= this.l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.l;
                int i = this.k;
                this.k = i + 1;
                b1x b1xVar = (b1x) arrayList.get(i);
                this.m.add(b1xVar);
                return b1xVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(jwq jwqVar) {
        synchronized (this.f19832a) {
            try {
                int iIndexOf = this.l.indexOf(jwqVar);
                if (iIndexOf >= 0) {
                    this.l.remove(iIndexOf);
                    int i = this.k;
                    if (iIndexOf <= i) {
                        this.k = i - 1;
                    }
                }
                this.m.remove(jwqVar);
                if (this.c > 0) {
                    e(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.e1x
    public final void close() {
        synchronized (this.f19832a) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = new ArrayList(this.l).iterator();
                while (it.hasNext()) {
                    ((b1x) it.next()).close();
                }
                this.l.clear();
                this.f.close();
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(gui0 gui0Var) {
        d1x d1xVar;
        Executor executor;
        synchronized (this.f19832a) {
            try {
                if (this.l.size() < G()) {
                    gui0Var.a(this);
                    this.l.add(gui0Var);
                    d1xVar = this.g;
                    executor = this.h;
                } else {
                    l8x.U("TAG", "Maximum image number reached.");
                    gui0Var.close();
                    d1xVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d1xVar != null) {
            if (executor != null) {
                executor.execute(new llo(this, d1xVar, (byte) 26));
            } else {
                d1xVar.e(this);
            }
        }
    }

    public final void e(e1x e1xVar) {
        b1x b1xVarB0;
        synchronized (this.f19832a) {
            try {
                if (this.e) {
                    return;
                }
                int size = this.j.size() + this.l.size();
                if (size >= e1xVar.G()) {
                    l8x.U("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        b1xVarB0 = e1xVar.b0();
                        if (b1xVarB0 != null) {
                            this.c--;
                            size++;
                            this.j.put(b1xVarB0.K0().h(), b1xVarB0);
                            g();
                        }
                    } catch (IllegalStateException e) {
                        String strC0 = l8x.C0("MetadataImageReader");
                        if (l8x.i0(3, strC0)) {
                            Log.d(strC0, "Failed to acquire next image.", e);
                        }
                        b1xVarB0 = null;
                    }
                    if (b1xVarB0 == null || this.c <= 0) {
                        break;
                    }
                } while (size < e1xVar.G());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.e1x
    public final int f() {
        int iF;
        synchronized (this.f19832a) {
            iF = this.f.f();
        }
        return iF;
    }

    public final void g() {
        synchronized (this.f19832a) {
            try {
                for (int size = this.i.size() - 1; size >= 0; size--) {
                    f0x f0xVar = (f0x) this.i.valueAt(size);
                    long jH = f0xVar.h();
                    b1x b1xVar = (b1x) this.j.get(jH);
                    if (b1xVar != null) {
                        this.j.remove(jH);
                        this.i.removeAt(size);
                        d(new gui0(b1xVar, null, f0xVar));
                    }
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.e1x
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f19832a) {
            surface = this.f.getSurface();
        }
        return surface;
    }

    @Override // a.e1x
    public final int h() {
        int iH;
        synchronized (this.f19832a) {
            iH = this.f.h();
        }
        return iH;
    }

    public final void i() {
        synchronized (this.f19832a) {
            try {
                if (this.j.size() != 0 && this.i.size() != 0) {
                    long jKeyAt = this.j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.i.keyAt(0);
                    z1x.u(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.j.size() - 1; size >= 0; size--) {
                            if (this.j.keyAt(size) < jKeyAt2) {
                                ((b1x) this.j.valueAt(size)).close();
                                this.j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.i.size() - 1; size2 >= 0; size2--) {
                            if (this.i.keyAt(size2) < jKeyAt) {
                                this.i.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.e1x
    public final int j() {
        int iJ;
        synchronized (this.f19832a) {
            iJ = this.f.j();
        }
        return iJ;
    }

    @Override // a.e1x
    public final void k() {
        synchronized (this.f19832a) {
            this.f.k();
            this.g = null;
            this.h = null;
            this.c = 0;
        }
    }

    @Override // a.e1x
    public final void o(d1x d1xVar, Executor executor) {
        synchronized (this.f19832a) {
            d1xVar.getClass();
            this.g = d1xVar;
            executor.getClass();
            this.h = executor;
            this.f.o(this.d, executor);
        }
    }
}
