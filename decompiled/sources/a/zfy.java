package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zfy extends ajt implements e540 {
    public int b;
    public int c;
    public int d;
    public Object e;
    public agy f;
    public List g;
    public List h;

    public static zfy g() {
        zfy zfyVar = new zfy();
        zfyVar.c = 1;
        zfyVar.e = "";
        zfyVar.f = agy.NONE;
        List list = Collections.EMPTY_LIST;
        zfyVar.g = list;
        zfyVar.h = list;
        return zfyVar;
    }

    @Override // a.ajt
    public final z3 c() {
        bgy bgyVarF = f();
        if (bgyVarF.b()) {
            return bgyVarF;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        zfy zfyVarG = g();
        zfyVarG.h(f());
        return zfyVarG;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        bgy bgyVar = null;
        try {
            try {
                bgy.n.getClass();
                h(new bgy(pycVar));
                return this;
            } catch (aox e) {
                bgy bgyVar2 = (bgy) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    bgyVar = bgyVar2;
                    if (bgyVar != null) {
                        h(bgyVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (bgyVar != null) {
                h(bgyVar);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        h((bgy) ljtVar);
        return this;
    }

    public final bgy f() {
        bgy bgyVar = new bgy(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        bgyVar.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        bgyVar.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        bgyVar.e = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        bgyVar.f = this.f;
        if ((i & 16) == 16) {
            this.g = Collections.unmodifiableList(this.g);
            i = this.b & (-17);
            this.b = i;
        }
        bgyVar.g = this.g;
        if ((i & 32) == 32) {
            this.h = Collections.unmodifiableList(this.h);
            this.b &= -33;
        }
        bgyVar.i = this.h;
        bgyVar.b = i2;
        return bgyVar;
    }

    public final void h(bgy bgyVar) {
        if (bgyVar == bgy.m) {
            return;
        }
        int i = bgyVar.b;
        if ((i & 1) == 1) {
            int i2 = bgyVar.c;
            this.b = 1 | this.b;
            this.c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = bgyVar.d;
            this.b = 2 | this.b;
            this.d = i3;
        }
        if ((i & 4) == 4) {
            this.b |= 4;
            this.e = bgyVar.e;
        }
        if ((i & 8) == 8) {
            agy agyVar = bgyVar.f;
            agyVar.getClass();
            this.b = 8 | this.b;
            this.f = agyVar;
        }
        if (!bgyVar.g.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = bgyVar.g;
                this.b &= -17;
            } else {
                if ((this.b & 16) != 16) {
                    this.g = new ArrayList(this.g);
                    this.b |= 16;
                }
                this.g.addAll(bgyVar.g);
            }
        }
        if (!bgyVar.i.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h = bgyVar.i;
                this.b &= -33;
            } else {
                if ((this.b & 32) != 32) {
                    this.h = new ArrayList(this.h);
                    this.b |= 32;
                }
                this.h.addAll(bgyVar.i);
            }
        }
        this.f994a = this.f994a.c(bgyVar.f2578a);
    }
}
