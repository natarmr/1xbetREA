package a;

import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fbo0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fbo0 f9271a;
    private static final ugi0 descriptor;

    static {
        fbo0 fbo0Var = new fbo0();
        f9271a = fbo0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.api.navigation.TabCyberRoute", fbo0Var, 2);
        zna0Var.j("cyberGamesPage", false);
        zna0Var.j("parentSection", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = hbo0.c;
        return new jiy[]{a8zVarArr[0].getValue(), a8zVarArr[1].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = hbo0.c;
        boolean z = true;
        int i = 0;
        CyberGamesPage cyberGamesPage = null;
        CyberGamesParentSectionModel cyberGamesParentSectionModel = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                cyberGamesPage = (CyberGamesPage) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), cyberGamesPage);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                cyberGamesParentSectionModel = (CyberGamesParentSectionModel) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), cyberGamesParentSectionModel);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new hbo0(i, cyberGamesPage, cyberGamesParentSectionModel);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hbo0 hbo0Var = (hbo0) obj;
        hbo0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = hbo0.c;
        cldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), hbo0Var.f12779a);
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), hbo0Var.b);
        cldVarA.c(ugi0Var);
    }
}
