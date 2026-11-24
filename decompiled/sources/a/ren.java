package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ren implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ren f30344a;
    private static final ugi0 descriptor;

    static {
        ren renVar = new ren();
        f30344a = renVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.durak.DurakResponse", renVar, 11);
        zna0Var.j("Mode", true);
        zna0Var.j("TrumpCard", true);
        zna0Var.j("Status", true);
        zna0Var.j("Deck", true);
        zna0Var.j("Rebound", true);
        zna0Var.j("Take", true);
        zna0Var.j("P1", true);
        zna0Var.j("P2", true);
        zna0Var.j("PT1", true);
        zna0Var.j("PT2", true);
        zna0Var.j("Result", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ten.l;
        jiy jiyVarJ0 = mrv.j0(oen.f25131a);
        jiy jiyVarJ1 = mrv.j0(moa.f22125a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[6].getValue()), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0((jiy) a8zVarArr[8].getValue()), mrv.j0((jiy) a8zVarArr[9].getValue()), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = ten.l;
        String str = null;
        List list = null;
        List list2 = null;
        boolean z = true;
        List list3 = null;
        int i = 0;
        qen qenVar = null;
        ooa ooaVar = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    qenVar = (qen) bldVarA.e(ugi0Var, 0, oen.f25131a, qenVar);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    ooaVar = (ooa) bldVarA.e(ugi0Var, 1, moa.f22125a, ooaVar);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    str4 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str4);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    str5 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str5);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    list4 = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list4);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    list3 = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list3);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    list2 = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list2);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list);
                    i |= 512;
                    break;
                case 10:
                    a8zVarArr = a8zVarArr2;
                    str = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new ten(i, qenVar, ooaVar, str2, str3, str4, str5, list4, list3, list2, list, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ten tenVar = (ten) obj;
        tenVar.getClass();
        String str = tenVar.k;
        List list = tenVar.j;
        List list2 = tenVar.i;
        List list3 = tenVar.h;
        List list4 = tenVar.g;
        String str2 = tenVar.f;
        String str3 = tenVar.e;
        String str4 = tenVar.d;
        String str5 = tenVar.c;
        ooa ooaVar = tenVar.b;
        qen qenVar = tenVar.f33829a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ten.l;
        if (cldVarA.u(ugi0Var) || qenVar != null) {
            cldVarA.p(ugi0Var, 0, oen.f25131a, qenVar);
        }
        if (cldVarA.u(ugi0Var) || ooaVar != null) {
            cldVarA.p(ugi0Var, 1, moa.f22125a, ooaVar);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
