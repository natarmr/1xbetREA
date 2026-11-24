package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d110 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d110 f5289a;
    private static final ugi0 descriptor;

    static {
        d110 d110Var = new d110();
        f5289a = d110Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.playerscomposition.lol.LolPlayersCompositionResponse", d110Var, 5);
        zna0Var.j("name", true);
        zna0Var.j("image", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("players", true);
        zna0Var.j("statistics", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = f110.f;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0(d4h.f5455a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = f110.f;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        f4h f4hVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else if (iF == 2) {
                str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                i |= 4;
            } else if (iF == 3) {
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                f4hVar = (f4h) bldVarA.e(ugi0Var, 4, d4h.f5455a, f4hVar);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new f110(i, str, str2, str3, list, f4hVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        f110 f110Var = (f110) obj;
        f110Var.getClass();
        f4h f4hVar = f110Var.e;
        List list = f110Var.d;
        String str = f110Var.c;
        String str2 = f110Var.b;
        String str3 = f110Var.f8743a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = f110.f;
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || f4hVar != null) {
            cldVarA.p(ugi0Var, 4, d4h.f5455a, f4hVar);
        }
        cldVarA.c(ugi0Var);
    }
}
