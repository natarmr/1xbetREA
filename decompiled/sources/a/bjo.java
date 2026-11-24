package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bjo implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bjo f2715a;
    private static final ugi0 descriptor;

    static {
        bjo bjoVar = new bjo();
        f2715a = bjoVar;
        zna0 zna0Var = new zna0("org.xplatform.limits.ie.impl.data.models.requests.ExamAnswersRequest", bjoVar, 2);
        zna0Var.j("tokenGuid", false);
        zna0Var.j("answers", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a, fjo.c[1].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = fjo.c;
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
        return new fjo(strX, list, i);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fjo fjoVar = (fjo) obj;
        fjoVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = fjo.c;
        cldVarA.z(ugi0Var, 0, fjoVar.f9652a);
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), fjoVar.b);
        cldVarA.c(ugi0Var);
    }
}
