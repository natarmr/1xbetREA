package a;

import android.graphics.Rect;
import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class jwq implements b1x {
    public final b1x b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17265a = new Object();
    public final HashSet c = new HashSet();

    public jwq(b1x b1xVar) {
        this.b = b1xVar;
    }

    @Override // a.b1x
    public f0x K0() {
        return this.b.K0();
    }

    public final void a(iwq iwqVar) {
        synchronized (this.f17265a) {
            this.c.add(iwqVar);
        }
    }

    @Override // a.b1x
    public final Image b() {
        return this.b.b();
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.b.close();
        synchronized (this.f17265a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((iwq) it.next()).a(this);
        }
    }

    @Override // a.b1x
    public int f() {
        return this.b.f();
    }

    @Override // a.b1x
    public final int getFormat() {
        return this.b.getFormat();
    }

    @Override // a.b1x
    public int j() {
        return this.b.j();
    }

    @Override // a.b1x
    public wsf0[] l0() {
        return this.b.l0();
    }

    @Override // a.b1x
    public Rect u0() {
        return this.b.u0();
    }
}
