package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nzf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nzf0 f24369a;
    private static final ugi0 descriptor;

    static {
        nzf0 nzf0Var = new nzf0();
        f24369a = nzf0Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.restore.RestorePasswordResponse", nzf0Var, 4);
        zna0Var.j("AuthenticatorEnabled", true);
        zna0Var.j("Auth", true);
        zna0Var.j("CodeTypes", true);
        zna0Var.j("CodeTypesRepeat", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = pzf0.e;
        return new jiy[]{mrv.j0(sm8.f32432a), mrv.j0(wwp0.f39896a), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = pzf0.e;
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        ywp0 ywp0Var = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                i |= 1;
            } else if (iF == 1) {
                ywp0Var = (ywp0) bldVarA.e(ugi0Var, 1, wwp0.f39896a, ywp0Var);
                i |= 2;
            } else if (iF == 2) {
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new pzf0(i, bool, ywp0Var, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pzf0 pzf0Var = (pzf0) obj;
        pzf0Var.getClass();
        List list = pzf0Var.d;
        List list2 = pzf0Var.c;
        ywp0 ywp0Var = pzf0Var.b;
        Boolean bool = pzf0Var.f27842a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = pzf0.e;
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || ywp0Var != null) {
            cldVarA.p(ugi0Var, 1, wwp0.f39896a, ywp0Var);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
