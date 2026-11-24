package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ntt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kym0 f24117a;

    public ntt(kym0 kym0Var, byte b) {
        kym0Var.getClass();
        switch (b) {
            case 1:
                this.f24117a = kym0Var;
                break;
            case 2:
                this.f24117a = kym0Var;
                break;
            default:
                this.f24117a = kym0Var;
                break;
        }
    }

    public ArrayList a() {
        List listA = this.f24117a.f19113a.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof uvm0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public void b(long j) {
        Object next;
        kym0 kym0Var = this.f24117a;
        Iterator it = kym0Var.f19113a.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((xvm0) next) instanceof tvm0));
        xvm0 xvm0Var = (xvm0) next;
        if (xvm0Var != null) {
            kym0Var.getClass();
            kym0Var.b.b(xvm0Var);
        } else {
            tvm0 tvm0Var = new tvm0(null, j, j, 1);
            kym0Var.getClass();
            kym0Var.b.b(tvm0Var);
        }
    }

    public void c(boolean z) {
        Object value;
        p7m0 p7m0Var = this.f24117a.c.b;
        do {
            value = p7m0Var.getValue();
            ((Boolean) value).getClass();
        } while (!p7m0Var.m(value, Boolean.valueOf(z)));
    }
}
