package a;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vw40 extends dw5 {
    public final hz40 c;
    public final ArrayList d;
    public final hz40 e;
    public final jk8 f;

    public vw40() {
        super((byte) 2);
        this.c = e9x.J();
        this.d = new ArrayList();
        this.e = new hz40();
        pi40 pi40Var = new pi40(this, (byte) 8);
        xfk0.b(xfk0.f40794a);
        synchronized (xfk0.c) {
            xfk0.h = CollectionsKt.r0(xfk0.h, pi40Var);
        }
        this.f = new jk8(pi40Var, (byte) 3);
    }

    @Override // a.dw5
    public final void c(jbi0 jbi0Var) {
        this.d.add(new tw40(jbi0Var));
    }

    @Override // a.dw5
    public final void d() {
        synchronized (this.b) {
            try {
                ArrayList arrayList = this.d;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    uw40 uw40Var = (uw40) arrayList.get(i);
                    if (uw40Var instanceof sw40) {
                        e9x.F(this.c, ((sw40) uw40Var).f32902a, ((sw40) uw40Var).b);
                    } else {
                        if (!(uw40Var instanceof tw40)) {
                            throw new m460();
                        }
                        e9x.T(this.c, ((tw40) uw40Var).f34631a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.clear();
    }

    @Override // a.dw5
    public final void e() {
        this.f.a();
        this.d.clear();
        this.e.a();
        synchronized (this.b) {
            this.c.a();
        }
    }

    @Override // a.dw5
    public final Function1 f(jbi0 jbi0Var) {
        hz40 hz40Var = this.e;
        Function1 rw40Var = (Function1) hz40Var.g(jbi0Var);
        if (rw40Var == null) {
            rw40Var = new rw40(this, jbi0Var, (byte) 0);
            int iF = hz40Var.f(jbi0Var);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = hz40Var.c;
            Object obj = objArr[iF];
            hz40Var.b[iF] = jbi0Var;
            objArr[iF] = rw40Var;
        }
        return rw40Var;
    }

    @Override // a.dw5
    public final void g(htb htbVar) {
        this.e.l(htbVar);
        c(htbVar);
        d();
    }
}
