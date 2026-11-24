package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ur30 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ur30 f36146a;
    private static final ugi0 descriptor;

    static {
        ur30 ur30Var = new ur30();
        f36146a = ur30Var;
        zna0 zna0Var = new zna0("org.xplatform.bonus_games.impl.memories.data.models.MemoryGameResponse", ur30Var, 8);
        zna0Var.j("AN", true);
        zna0Var.j("CB", true);
        zna0Var.j("LC", true);
        zna0Var.j("LM", true);
        zna0Var.j("SB", true);
        zna0Var.j("SI", true);
        zna0Var.j("SW", true);
        zna0Var.j("VS", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = wr30.i;
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[7].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = wr30.i;
        Object obj = null;
        boolean z = true;
        List list = null;
        Integer num = null;
        List list2 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                    i |= 8;
                    break;
                case 4:
                    num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                    i |= 16;
                    break;
                case 5:
                    num5 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num5);
                    i |= 32;
                    break;
                case 6:
                    num6 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new wr30(i, num, list2, num2, num3, num4, num5, num6, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wr30 wr30Var = (wr30) obj;
        wr30Var.getClass();
        List list = wr30Var.h;
        Integer num = wr30Var.g;
        Integer num2 = wr30Var.f;
        Integer num3 = wr30Var.e;
        Integer num4 = wr30Var.d;
        Integer num5 = wr30Var.c;
        List list2 = wr30Var.b;
        Integer num6 = wr30Var.f39620a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = wr30.i;
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
