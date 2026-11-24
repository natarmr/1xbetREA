package a;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class gld extends e06 {
    public final HashMap i = new HashMap();
    public Handler j;

    @Override // a.e06
    public final void c() {
        for (fld fldVar : this.i.values()) {
            fldVar.f9731a.b(fldVar.b);
        }
    }

    @Override // a.e06
    public final void e() {
        for (fld fldVar : this.i.values()) {
            fldVar.f9731a.d(fldVar.b);
        }
    }

    @Override // a.e06
    public void i() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((fld) it.next()).f9731a.i();
        }
    }

    @Override // a.e06
    public void o() {
        HashMap map = this.i;
        for (fld fldVar : map.values()) {
            e06 e06Var = fldVar.f9731a;
            eld eldVar = fldVar.c;
            e06Var.n(fldVar.b);
            e06Var.q(eldVar);
            e06Var.p(eldVar);
        }
        map.clear();
    }

    public abstract vn30 s(Object obj, vn30 vn30Var);

    public abstract void v(Object obj, e06 e06Var, bmq0 bmq0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [a.dld, a.wn30] */
    public final void w(final Integer num, e06 e06Var) {
        HashMap map = this.i;
        x0x.A(!map.containsKey(num));
        ?? r1 = new wn30() { // from class: a.dld
            @Override // a.wn30
            public final void a(e06 e06Var2, bmq0 bmq0Var) {
                this.f6274a.v(num, e06Var2, bmq0Var);
            }
        };
        eld eldVar = new eld(this, num);
        map.put(num, new fld(e06Var, r1, eldVar));
        Handler handler = this.j;
        handler.getClass();
        e06Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = e06Var.c.c;
        ao30 ao30Var = new ao30();
        ao30Var.f1182a = handler;
        ao30Var.b = eldVar;
        copyOnWriteArrayList.add(ao30Var);
        this.j.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = e06Var.d.c;
        yhl yhlVar = new yhl();
        yhlVar.f42642a = eldVar;
        copyOnWriteArrayList2.add(yhlVar);
        a4a0 a4a0Var = this.g;
        a4a0Var.getClass();
        rsj rsjVar = this.h;
        rsjVar.getClass();
        e06Var.j(r1, a4a0Var, rsjVar);
        if (this.b.isEmpty()) {
            e06Var.b(r1);
        }
    }

    public long t(Object obj, long j) {
        return j;
    }

    public int u(int i, Object obj) {
        return i;
    }
}
