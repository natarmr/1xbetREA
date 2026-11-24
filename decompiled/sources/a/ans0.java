package a;

/* JADX INFO: loaded from: classes.dex */
public final class ans0 extends rms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1169a;
    public gms0 b;

    public /* synthetic */ ans0(gms0 gms0Var, byte b) {
        this.f1169a = b;
        this.b = gms0Var;
    }

    @Override // a.rms0, a.dms0
    public void b(gms0 gms0Var) {
        switch (this.f1169a) {
            case 1:
                bns0 bns0Var = (bns0) this.b;
                int i = bns0Var.l1 - 1;
                bns0Var.l1 = i;
                if (i == 0) {
                    bns0Var.m1 = false;
                    bns0Var.r();
                }
                gms0Var.I(this);
                break;
            case 2:
                this.b.K();
                gms0Var.I(this);
                break;
        }
    }

    @Override // a.rms0, a.dms0
    public void c(gms0 gms0Var) {
        switch (this.f1169a) {
            case 1:
                bns0 bns0Var = (bns0) this.b;
                if (!bns0Var.m1) {
                    bns0Var.S();
                    bns0Var.m1 = true;
                }
                break;
        }
    }

    @Override // a.rms0, a.dms0
    public void g(gms0 gms0Var) {
        switch (this.f1169a) {
            case 0:
                bns0 bns0Var = (bns0) this.b;
                bns0Var.j1.remove(gms0Var);
                if (!bns0Var.B()) {
                    bns0Var.F(bns0Var, v4i0.d, false);
                    bns0Var.w = true;
                    bns0Var.F(bns0Var, v4i0.c, false);
                }
                break;
        }
    }

    public /* synthetic */ ans0() {
        this.f1169a = (byte) 1;
    }
}
