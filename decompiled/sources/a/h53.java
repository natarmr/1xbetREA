package a;

/* JADX INFO: loaded from: classes.dex */
public final class h53 extends fnx {
    public vls0 p;
    public pz40 q;
    public i53 r;
    public pu90 s;
    public pu90 t;
    public long u;
    public long v;
    public final f53 w;
    public final f53 x;
    public long y;

    public h53(vls0 vls0Var, pz40 pz40Var, i53 i53Var) {
        super((byte) 1);
        this.p = vls0Var;
        this.q = pz40Var;
        this.r = i53Var;
        this.u = 0L;
        this.v = 0L;
        this.w = new f53(this, (byte) 1);
        this.x = new f53(this, (byte) 0);
        this.y = -9223372034707292160L;
    }

    @Override // a.lm40
    public final void T0() {
        this.y = -9223372034707292160L;
    }

    @Override // a.fnx, a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        long j2;
        pu90 pu90VarS = pj30Var.S(j);
        if (vj30Var.M()) {
            j2 = (((long) pu90VarS.f27604a) << 32) | (((long) pu90VarS.b) & 4294967295L);
        } else {
            vls0 vls0Var = this.p;
            int i = pu90VarS.f27604a;
            if (vls0Var == null) {
                j2 = (((long) i) << 32) | (((long) pu90VarS.b) & 4294967295L);
                this.y = j2;
            } else {
                long j3 = (((long) pu90VarS.b) & 4294967295L) | (((long) i) << 32);
                uls0 uls0VarA = vls0Var.a(new g53(this, j3, (byte) 0), null, null, new g53(this, j3, (byte) 1));
                j2 = ((qkx) uls0VarA.getValue()).f28908a;
                this.y = ((qkx) uls0VarA.getValue()).f28908a;
            }
        }
        if (vj30Var.M()) {
            this.s = pu90VarS;
            this.u = j2;
            return vj30.x(vj30Var, (int) (j2 >> 32), (int) (j2 & 4294967295L), this.w);
        }
        this.t = pu90VarS;
        this.v = j2;
        return vj30.x(vj30Var, (int) (j2 >> 32), (int) (j2 & 4294967295L), this.x);
    }
}
