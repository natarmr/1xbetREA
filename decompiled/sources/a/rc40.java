package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rc40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rc40 f30221a;
    private static final ugi0 descriptor;

    static {
        rc40 rc40Var = new rc40();
        f30221a = rc40Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.meta_heroes.data.model.MetaHeroesSkillBuildResponse", rc40Var, 3);
        zna0Var.j("matches", true);
        zna0Var.j("winRate", true);
        zna0Var.j("skills", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(klq.f18504a), mrv.j0((jiy) tc40.d[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = tc40.d;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Float f = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                f = (Float) bldVarA.e(ugi0Var, 1, klq.f18504a, f);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new tc40(i, num, f, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tc40 tc40Var = (tc40) obj;
        tc40Var.getClass();
        List list = tc40Var.c;
        Float f = tc40Var.b;
        Integer num = tc40Var.f33702a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = tc40.d;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 1, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
