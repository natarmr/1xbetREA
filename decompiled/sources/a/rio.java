package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rio implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rio f30553a;
    private static final ugi0 descriptor;

    static {
        rio rioVar = new rio();
        f30553a = rioVar;
        zna0 zna0Var = new zna0("org.xplatform.responsible_game.impl.data.limits.models.gambling_exam.ExamAnswerRequest", rioVar, 2);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a, sm8.f32432a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                zB = bldVarA.B(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new vio(i, iJ, zB);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vio vioVar = (vio) obj;
        vioVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, vioVar.f37488a, ugi0Var);
        cldVarA.x(ugi0Var, 1, vioVar.b);
        cldVarA.c(ugi0Var);
    }
}
