package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class idh0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final idh0 f14587a;
    private static final ugi0 descriptor;

    static {
        idh0 idh0Var = new idh0();
        f14587a = idh0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.sea_battle.SeaBattleResponse", idh0Var, 7);
        zna0Var.j("F1Ships", true);
        zna0Var.j("F2Ships", true);
        zna0Var.j("Pl1ShotsCount", true);
        zna0Var.j("Pl2ShotsCount", true);
        zna0Var.j("F1Cross", true);
        zna0Var.j("F2Cross", true);
        zna0Var.j("NextShot", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = kdh0.h;
        jiy jiyVarJ0 = mrv.j0((jiy) a8zVarArr[0].getValue());
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[4].getValue()), mrv.j0((jiy) a8zVarArr[5].getValue()), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = kdh0.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        String str = null;
        String str2 = null;
        List list3 = null;
        List list4 = null;
        String str3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                    i |= 8;
                    break;
                case 4:
                    list3 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list3);
                    i |= 16;
                    break;
                case 5:
                    list4 = (List) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list4);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str3);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new kdh0(i, list, list2, str, str2, list3, list4, str3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kdh0 kdh0Var = (kdh0) obj;
        kdh0Var.getClass();
        String str = kdh0Var.g;
        List list = kdh0Var.f;
        List list2 = kdh0Var.e;
        String str2 = kdh0Var.d;
        String str3 = kdh0Var.c;
        List list3 = kdh0Var.b;
        List list4 = kdh0Var.f18108a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = kdh0.h;
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
