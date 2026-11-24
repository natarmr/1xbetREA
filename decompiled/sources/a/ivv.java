package a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ivv extends hev0 {
    @Override // a.d7k
    public final void a(d7k d7kVar) {
        zu5 zu5Var = (zu5) this.b;
        int i = zu5Var.w0;
        i7k i7kVar = this.h;
        Iterator it = i7kVar.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((i7k) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            i7kVar.d(i3 + zu5Var.y0);
        } else {
            i7kVar.d(i2 + zu5Var.y0);
        }
    }

    @Override // a.hev0
    public final void d() {
        k4e k4eVar = this.b;
        if (k4eVar instanceof zu5) {
            i7k i7kVar = this.h;
            i7kVar.b = true;
            ArrayList arrayList = i7kVar.l;
            zu5 zu5Var = (zu5) k4eVar;
            int i = zu5Var.w0;
            boolean z = zu5Var.x0;
            int i2 = 0;
            if (i == 0) {
                i7kVar.e = 4;
                while (i2 < zu5Var.v0) {
                    k4e k4eVar2 = zu5Var.u0[i2];
                    if (z || k4eVar2.i0 != 8) {
                        i7k i7kVar2 = k4eVar2.d.h;
                        i7kVar2.k.add(i7kVar);
                        arrayList.add(i7kVar2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                i7kVar.e = 5;
                while (i2 < zu5Var.v0) {
                    k4e k4eVar3 = zu5Var.u0[i2];
                    if (z || k4eVar3.i0 != 8) {
                        i7k i7kVar3 = k4eVar3.d.i;
                        i7kVar3.k.add(i7kVar);
                        arrayList.add(i7kVar3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                i7kVar.e = 6;
                while (i2 < zu5Var.v0) {
                    k4e k4eVar4 = zu5Var.u0[i2];
                    if (z || k4eVar4.i0 != 8) {
                        i7k i7kVar4 = k4eVar4.e.h;
                        i7kVar4.k.add(i7kVar);
                        arrayList.add(i7kVar4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            i7kVar.e = 7;
            while (i2 < zu5Var.v0) {
                k4e k4eVar5 = zu5Var.u0[i2];
                if (z || k4eVar5.i0 != 8) {
                    i7k i7kVar5 = k4eVar5.e.i;
                    i7kVar5.k.add(i7kVar);
                    arrayList.add(i7kVar5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // a.hev0
    public final void e() {
        k4e k4eVar = this.b;
        if (k4eVar instanceof zu5) {
            int i = ((zu5) k4eVar).w0;
            i7k i7kVar = this.h;
            if (i == 0 || i == 1) {
                k4eVar.a0 = i7kVar.g;
            } else {
                k4eVar.b0 = i7kVar.g;
            }
        }
    }

    @Override // a.hev0
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // a.hev0
    public final boolean k() {
        return false;
    }

    public final void m(i7k i7kVar) {
        i7k i7kVar2 = this.h;
        i7kVar2.k.add(i7kVar);
        i7kVar.l.add(i7kVar2);
    }
}
