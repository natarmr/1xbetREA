package a;

/* JADX INFO: loaded from: classes.dex */
public final class riv extends hev0 {
    @Override // a.d7k
    public final void a(d7k d7kVar) {
        i7k i7kVar = this.h;
        if (i7kVar.c && !i7kVar.j) {
            i7kVar.d((int) ((((i7k) i7kVar.l.get(0)).g * ((qiv) this.b).u0) + 0.5f));
        }
    }

    @Override // a.hev0
    public final void d() {
        k4e k4eVar = this.b;
        qiv qivVar = (qiv) k4eVar;
        int i = qivVar.v0;
        int i2 = qivVar.w0;
        int i3 = qivVar.y0;
        i7k i7kVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                i7kVar.l.add(k4eVar.V.d.h);
                this.b.V.d.h.k.add(i7kVar);
                i7kVar.f = i;
            } else if (i2 != -1) {
                i7kVar.l.add(k4eVar.V.d.i);
                this.b.V.d.i.k.add(i7kVar);
                i7kVar.f = -i2;
            } else {
                i7kVar.b = true;
                i7kVar.l.add(k4eVar.V.d.i);
                this.b.V.d.i.k.add(i7kVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            i7kVar.l.add(k4eVar.V.e.h);
            this.b.V.e.h.k.add(i7kVar);
            i7kVar.f = i;
        } else if (i2 != -1) {
            i7kVar.l.add(k4eVar.V.e.i);
            this.b.V.e.i.k.add(i7kVar);
            i7kVar.f = -i2;
        } else {
            i7kVar.b = true;
            i7kVar.l.add(k4eVar.V.e.i);
            this.b.V.e.i.k.add(i7kVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    public final void m(i7k i7kVar) {
        i7k i7kVar2 = this.h;
        i7kVar2.k.add(i7kVar);
        i7kVar.l.add(i7kVar2);
    }
}
