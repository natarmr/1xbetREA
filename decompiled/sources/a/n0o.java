package a;

import java.util.List;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final class n0o implements uto {
    @Override // a.uto
    public final int a(kp9 kp9Var, kp9 kp9Var2, wm40 wm40Var) {
        kp9Var.getClass();
        kp9Var2.getClass();
        if (!(kp9Var2 instanceof u9y)) {
            return 3;
        }
        u9y u9yVar = (u9y) kp9Var2;
        if (!u9yVar.getTypeParameters().isEmpty()) {
            return 3;
        }
        rf80 rf80VarI = sf80.i(kp9Var, kp9Var2);
        if ((rf80VarI != null ? rf80VarI.b() : 0) != 0) {
            return 3;
        }
        List listZ = u9yVar.z();
        listZ.getClass();
        qls0 qls0VarP = pgi0.p(new sx3(listZ, (byte) 1), ske.x);
        wsy wsyVar = u9yVar.h;
        wsyVar.getClass();
        Sequence sequenceT = tx3.t(new Sequence[]{qls0VarP, new sx3(wsyVar, (byte) 5)});
        sequenceT.getClass();
        ckq ckqVarC = lgi0.c(sequenceT, new eoh0((byte) 22));
        c8z c8zVar = u9yVar.j;
        bkq bkqVar = new bkq(pgi0.s(ckqVarC, q3d.k(c8zVar != null ? c8zVar.getType() : null)));
        while (bkqVar.hasNext()) {
            wsy wsyVar2 = (wsy) bkqVar.next();
            if (!wsyVar2.J().isEmpty() && !(wsyVar2.j0() instanceof dae0)) {
                return 3;
            }
        }
        kp9 kp9VarBuild = (kp9) kp9Var.f(new xzs0(new cae0()));
        if (kp9VarBuild == null) {
            return 3;
        }
        if (kp9VarBuild instanceof fyj0) {
            fyj0 fyj0Var = (fyj0) kp9VarBuild;
            if (!fyj0Var.getTypeParameters().isEmpty()) {
                kp9VarBuild = fyj0Var.g0().p(iun.f15405a).build();
                kp9VarBuild.getClass();
            }
        }
        int iB = sf80.c.n(kp9VarBuild, kp9Var2, false).b();
        if (iB != 0) {
            return m0o.f20963a[hne.E(iB)] == 1 ? 1 : 3;
        }
        throw null;
    }

    @Override // a.uto
    public final int b() {
        return 2;
    }
}
