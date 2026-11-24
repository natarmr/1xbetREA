package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x9t implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x9t f40524a;
    private static final ugi0 descriptor;

    static {
        x9t x9tVar = new x9t();
        f40524a = x9tVar;
        zna0 zna0Var = new zna0("org.xplatform.games_mania.data.models.GamesManiaResponse", x9tVar, 10);
        zna0Var.j("POS", true);
        zna0Var.j("PUZZLE_IDS", true);
        zna0Var.j("TCs", true);
        zna0Var.j("NEW_PUZZLE_ID", true);
        zna0Var.j("NEW_MAP", true);
        zna0Var.j("TH_VL", true);
        zna0Var.j("IS_WINNER", true);
        zna0Var.j("MAP_CUR", true);
        zna0Var.j("MAP_OLD", true);
        zna0Var.j("MAP_NEW", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = z9t.k;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ4 = mrv.j0(sm8Var);
        jiy jiyVarJ5 = mrv.j0((jiy) a8zVarArr[5].getValue());
        jiy jiyVarJ6 = mrv.j0(sm8Var);
        j9t j9tVar = j9t.f16156a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(j9tVar), mrv.j0(j9tVar), mrv.j0(j9tVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = z9t.k;
        l9t l9tVar = null;
        l9t l9tVar2 = null;
        boolean z = true;
        l9t l9tVar3 = null;
        int i = 0;
        Integer num = null;
        List list = null;
        Integer num2 = null;
        Integer num3 = null;
        Boolean bool = null;
        List list2 = null;
        Boolean bool2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    bool = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    list2 = (List) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool2);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    l9tVar3 = (l9t) bldVarA.e(ugi0Var, 7, j9t.f16156a, l9tVar3);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    l9tVar2 = (l9t) bldVarA.e(ugi0Var, 8, j9t.f16156a, l9tVar2);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    l9tVar = (l9t) bldVarA.e(ugi0Var, 9, j9t.f16156a, l9tVar);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new z9t(i, num, list, num2, num3, bool, list2, bool2, l9tVar3, l9tVar2, l9tVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        z9t z9tVar = (z9t) obj;
        z9tVar.getClass();
        l9t l9tVar = z9tVar.j;
        l9t l9tVar2 = z9tVar.i;
        l9t l9tVar3 = z9tVar.h;
        Boolean bool = z9tVar.g;
        List list = z9tVar.f;
        Boolean bool2 = z9tVar.e;
        Integer num = z9tVar.d;
        Integer num2 = z9tVar.c;
        List list2 = z9tVar.b;
        Integer num3 = z9tVar.f44037a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = z9t.k;
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || l9tVar3 != null) {
            cldVarA.p(ugi0Var, 7, j9t.f16156a, l9tVar3);
        }
        if (cldVarA.u(ugi0Var) || l9tVar2 != null) {
            cldVarA.p(ugi0Var, 8, j9t.f16156a, l9tVar2);
        }
        if (cldVarA.u(ugi0Var) || l9tVar != null) {
            cldVarA.p(ugi0Var, 9, j9t.f16156a, l9tVar);
        }
        cldVarA.c(ugi0Var);
    }
}
