package a;

/* JADX INFO: loaded from: classes2.dex */
public final class daa extends vzs0 {
    public final /* synthetic */ byte b;
    public final vzs0 c;

    public daa(vzs0 vzs0Var, byte b) {
        this.b = b;
        switch (b) {
            case 1:
                this.c = vzs0Var;
                break;
            default:
                vzs0Var.getClass();
                this.c = vzs0Var;
                break;
        }
    }

    @Override // a.vzs0
    public boolean a() {
        switch (this.b) {
            case 0:
                return this.c.a();
            default:
                return super.a();
        }
    }

    @Override // a.vzs0
    public boolean b() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return super.b();
        }
    }

    @Override // a.vzs0
    public final g93 c(g93 g93Var) {
        byte b = this.b;
        vzs0 vzs0Var = this.c;
        g93Var.getClass();
        switch (b) {
            case 0:
                break;
        }
        return vzs0Var.c(g93Var);
    }

    @Override // a.vzs0
    public final pzs0 d(wsy wsyVar) {
        byte b = this.b;
        vzs0 vzs0Var = this.c;
        wsyVar.getClass();
        switch (b) {
            case 0:
                pzs0 pzs0VarD = vzs0Var.d(wsyVar);
                if (pzs0VarD == null) {
                    return null;
                }
                foc focVarN = wsyVar.S().n();
                return tke.R(pzs0VarD, focVarN instanceof hzs0 ? (hzs0) focVarN : null);
            default:
                return vzs0Var.d(wsyVar);
        }
    }

    @Override // a.vzs0
    public final boolean e() {
        switch (this.b) {
            case 0:
                break;
        }
        return this.c.e();
    }

    @Override // a.vzs0
    public final wsy f(wsy wsyVar, t3u0 t3u0Var) {
        byte b = this.b;
        vzs0 vzs0Var = this.c;
        wsyVar.getClass();
        t3u0Var.getClass();
        switch (b) {
            case 0:
                break;
        }
        return vzs0Var.f(wsyVar, t3u0Var);
    }
}
