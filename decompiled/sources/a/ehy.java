package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ehy extends r2e {
    public ehy(qlc qlcVar, int i) {
        super(new chy(new tlc(qlcVar, i)));
    }

    @Override // a.r2e
    public final wsy a(ym40 ym40Var) {
        wsy wsyVarC;
        ym40Var.getClass();
        ays0.b.getClass();
        ays0 ays0Var = ays0.c;
        ary aryVarC = ym40Var.c();
        aryVarC.getClass();
        wm40 wm40VarJ = aryVarC.j(i4m0.Q.i());
        Object obj = this.f29728a;
        dhy dhyVar = (dhy) obj;
        if (dhyVar instanceof bhy) {
            wsyVarC = ((bhy) obj).f2632a;
        } else {
            if (!(dhyVar instanceof chy)) {
                t9f.b();
                return null;
            }
            tlc tlcVar = ((chy) obj).f4385a;
            qlc qlcVar = tlcVar.f34135a;
            int i = tlcVar.b;
            wm40 wm40VarV = obb.V(ym40Var, qlcVar);
            if (wm40VarV == null) {
                wsyVarC = f2o.c(c2o.d, qlcVar.toString(), String.valueOf(i));
            } else {
                kzj0 kzj0VarI = wm40VarV.I();
                kzj0VarI.getClass();
                wsy wsyVarZ = vsm0.z(kzj0VarI);
                for (int i2 = 0; i2 < i; i2++) {
                    ary aryVarC2 = ym40Var.c();
                    t3u0 t3u0Var = t3u0.c;
                    wsyVarZ = aryVarC2.h(wsyVarZ);
                }
                wsyVarC = wsyVarZ;
            }
        }
        return ucx.f0(ays0Var, wm40VarJ, kotlin.collections.a.c(new q4m0(wsyVarC)));
    }
}
