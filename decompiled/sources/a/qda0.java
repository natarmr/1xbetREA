package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qda0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qda0 f28526a;
    private static final ugi0 descriptor;

    static {
        qda0 qda0Var = new qda0();
        f28526a = qda0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.player_transfers.data.model.PlayerTransfersResponse", qda0Var, 2);
        zna0Var.j("player", true);
        zna0Var.j("transfers", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(lda0.f19841a), mrv.j0((jiy) sda0.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = sda0.c;
        boolean z = true;
        int i = 0;
        nda0 nda0Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                nda0Var = (nda0) bldVarA.e(ugi0Var, 0, lda0.f19841a, nda0Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new sda0(i, nda0Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        sda0 sda0Var = (sda0) obj;
        sda0Var.getClass();
        List list = sda0Var.b;
        nda0 nda0Var = sda0Var.f32024a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = sda0.c;
        if (cldVarA.u(ugi0Var) || nda0Var != null) {
            cldVarA.p(ugi0Var, 0, lda0.f19841a, nda0Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
