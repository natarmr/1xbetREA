package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ajo implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ajo f986a;
    private static final ugi0 descriptor;

    static {
        ajo ajoVar = new ajo();
        f986a = ajoVar;
        zna0 zna0Var = new zna0("org.xplatform.responsible_game.impl.data.limits.models.gambling_exam.ExamAnswersRequest", ajoVar, 2);
        zna0Var.j("tokenGuid", false);
        zna0Var.j("answers", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a, ejo.c[1].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ejo.c;
        boolean z = true;
        int i = 0;
        String strX = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ejo(strX, list, i);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ejo ejoVar = (ejo) obj;
        ejoVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ejo.c;
        cldVarA.z(ugi0Var, 0, ejoVar.f7918a);
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), ejoVar.b);
        cldVarA.c(ugi0Var);
    }
}
