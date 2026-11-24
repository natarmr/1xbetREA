package a;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n4h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4h f22898a;
    private static final ugi0 descriptor;

    static {
        n4h n4hVar = new n4h();
        f22898a = n4hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.lol.CyberLolStatisticResponse", n4hVar, 10);
        zna0Var.j("TS", true);
        zna0Var.j("IS", true);
        zna0Var.j("RT", true);
        zna0Var.j("GT", true);
        zna0Var.j("DT", true);
        zna0Var.j("O1", true);
        zna0Var.j("O2", true);
        zna0Var.j("ST", true);
        zna0Var.j("DS", true);
        zna0Var.j("GL", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = p4h.k;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        r4h r4hVar = r4h.f29834a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, mrv.j0(r4hVar), mrv.j0(r4hVar), mrv.j0(h3h.f12385a), mrv.j0(s710.f31729a), mrv.j0((jiy) a8zVarArr[9].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = p4h.k;
        Map map = null;
        Long l = null;
        boolean z = true;
        j3h j3hVar = null;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        t4h t4hVar = null;
        t4h t4hVar2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                    i |= 2;
                    break;
                case 2:
                    num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                    i |= 4;
                    break;
                case 3:
                    num4 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num4);
                    i |= 8;
                    break;
                case 4:
                    num5 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num5);
                    i |= 16;
                    break;
                case 5:
                    t4hVar = (t4h) bldVarA.e(ugi0Var, 5, r4h.f29834a, t4hVar);
                    i |= 32;
                    break;
                case 6:
                    t4hVar2 = (t4h) bldVarA.e(ugi0Var, 6, r4h.f29834a, t4hVar2);
                    i |= 64;
                    break;
                case 7:
                    j3hVar = (j3h) bldVarA.e(ugi0Var, 7, h3h.f12385a, j3hVar);
                    i |= 128;
                    break;
                case 8:
                    l = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l);
                    i |= 256;
                    break;
                case 9:
                    map = (Map) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), map);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new p4h(i, num, num2, num3, num4, num5, t4hVar, t4hVar2, j3hVar, l, map);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        p4h p4hVar = (p4h) obj;
        p4hVar.getClass();
        Map map = p4hVar.j;
        Long l = p4hVar.i;
        j3h j3hVar = p4hVar.h;
        t4h t4hVar = p4hVar.g;
        t4h t4hVar2 = p4hVar.f;
        Integer num = p4hVar.e;
        Integer num2 = p4hVar.d;
        Integer num3 = p4hVar.c;
        Integer num4 = p4hVar.b;
        Integer num5 = p4hVar.f26352a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = p4h.k;
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || t4hVar2 != null) {
            cldVarA.p(ugi0Var, 5, r4h.f29834a, t4hVar2);
        }
        if (cldVarA.u(ugi0Var) || t4hVar != null) {
            cldVarA.p(ugi0Var, 6, r4h.f29834a, t4hVar);
        }
        if (cldVarA.u(ugi0Var) || j3hVar != null) {
            cldVarA.p(ugi0Var, 7, h3h.f12385a, j3hVar);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), map);
        }
        cldVarA.c(ugi0Var);
    }
}
