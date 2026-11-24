package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xkr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xkr0 f41041a;
    private static final ugi0 descriptor;

    static {
        xkr0 xkr0Var = new xkr0();
        f41041a = xkr0Var;
        zna0 zna0Var = new zna0("org.xplatform.toto_bet.makebet.data.model.request.TotoBetRequest", xkr0Var, 6);
        zna0Var.j("AccountId", false);
        zna0Var.j("TotoTypeId", false);
        zna0Var.j("TiragNumber", false);
        zna0Var.j("ArrayBet", false);
        zna0Var.j("BetSum", false);
        zna0Var.j("PromoCode", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = zkr0.g;
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(okx.f25427a), mrv.j0(s710Var), a8zVarArr[3].getValue(), mrv.j0(tbl.f33669a), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = zkr0.g;
        boolean z = true;
        int i = 0;
        Long l = null;
        Integer num = null;
        Long l2 = null;
        List list = null;
        Double d = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) bldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    d = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d);
                    i |= 16;
                    break;
                case 5:
                    str = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new zkr0(i, l, num, l2, list, d, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zkr0 zkr0Var = (zkr0) obj;
        zkr0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = zkr0.g;
        s710 s710Var = s710.f31729a;
        cldVarA.p(ugi0Var, 0, s710Var, zkr0Var.f44548a);
        cldVarA.p(ugi0Var, 1, okx.f25427a, zkr0Var.b);
        cldVarA.p(ugi0Var, 2, s710Var, zkr0Var.c);
        cldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), zkr0Var.d);
        cldVarA.p(ugi0Var, 4, tbl.f33669a, zkr0Var.e);
        cldVarA.p(ugi0Var, 5, ysm0.f43175a, zkr0Var.f);
        cldVarA.c(ugi0Var);
    }
}
