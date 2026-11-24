package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yfy extends ajt implements e540 {
    public int b;
    public List c;
    public List d;

    @Override // a.ajt
    public final z3 c() {
        cgy cgyVarF = f();
        if (cgyVarF.b()) {
            return cgyVarF;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        yfy yfyVar = new yfy();
        List list = Collections.EMPTY_LIST;
        yfyVar.c = list;
        yfyVar.d = list;
        yfyVar.g(f());
        return yfyVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        cgy cgyVar = null;
        try {
            try {
                cgy.h.getClass();
                g(new cgy(pycVar, ssoVar));
                return this;
            } catch (aox e) {
                cgy cgyVar2 = (cgy) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cgyVar = cgyVar2;
                    if (cgyVar != null) {
                        g(cgyVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (cgyVar != null) {
                g(cgyVar);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        g((cgy) ljtVar);
        return this;
    }

    public final cgy f() {
        cgy cgyVar = new cgy(this);
        int i = this.b;
        if ((i & 1) == 1) {
            this.c = Collections.unmodifiableList(this.c);
            i = this.b & (-2);
            this.b = i;
        }
        cgyVar.b = this.c;
        if ((i & 2) == 2) {
            this.d = Collections.unmodifiableList(this.d);
            this.b &= -3;
        }
        cgyVar.c = this.d;
        return cgyVar;
    }

    public final void g(cgy cgyVar) {
        if (cgyVar == cgy.g) {
            return;
        }
        if (!cgyVar.b.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c = cgyVar.b;
                this.b &= -2;
            } else {
                if ((this.b & 1) != 1) {
                    this.c = new ArrayList(this.c);
                    this.b |= 1;
                }
                this.c.addAll(cgyVar.b);
            }
        }
        if (!cgyVar.c.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = cgyVar.c;
                this.b &= -3;
            } else {
                if ((this.b & 2) != 2) {
                    this.d = new ArrayList(this.d);
                    this.b |= 2;
                }
                this.d.addAll(cgyVar.c);
            }
        }
        this.f994a = this.f994a.c(cgyVar.f4337a);
    }
}
