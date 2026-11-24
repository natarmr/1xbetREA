package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lrs0 implements qde, oz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20549a;
    public final ArrayList b = new ArrayList();
    public final int c;
    public final hlq d;
    public final hlq e;
    public final hlq f;

    public lrs0(tz5 tz5Var, zkj0 zkj0Var) {
        this.f20549a = zkj0Var.e;
        this.c = zkj0Var.f44537a;
        hlq hlqVarF0 = zkj0Var.b.f0();
        this.d = hlqVarF0;
        hlq hlqVarF1 = zkj0Var.c.f0();
        this.e = hlqVarF1;
        hlq hlqVarF2 = zkj0Var.d.f0();
        this.f = hlqVarF2;
        tz5Var.f(hlqVarF0);
        tz5Var.f(hlqVarF1);
        tz5Var.f(hlqVarF2);
        hlqVarF0.a(this);
        hlqVarF1.a(this);
        hlqVarF2.a(this);
    }

    @Override // a.oz5
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((oz5) arrayList.get(i)).a();
            i++;
        }
    }

    public final void d(oz5 oz5Var) {
        this.b.add(oz5Var);
    }

    @Override // a.qde
    public final void b(List list, List list2) {
    }
}
