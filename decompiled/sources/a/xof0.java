package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xof0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xof0 f41216a;
    private static final ugi0 descriptor;

    static {
        xof0 xof0Var = new xof0();
        f41216a = xof0Var;
        zna0 zna0Var = new zna0("org.xplatform.resident.data.model.response.ResidentGameResponse", xof0Var, 14);
        zna0Var.j("AI", true);
        zna0Var.j("BNINF", true);
        zna0Var.j("BN", true);
        zna0Var.j("BS", true);
        zna0Var.j("CGS", true);
        zna0Var.j("CS", true);
        zna0Var.j("FE", true);
        zna0Var.j("GI", true);
        zna0Var.j("IBA", true);
        zna0Var.j("NB", true);
        zna0Var.j("SAFES", true);
        zna0Var.j("SB", true);
        zna0Var.j("SW", true);
        zna0Var.j("UI", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = zof0.o;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(ok10.f25385a);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ3 = mrv.j0(tblVar);
        jiy jiyVarJ4 = mrv.j0(cpf0.f4743a);
        jiy jiyVarJ5 = mrv.j0(okx.f25427a);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(sm8Var), mrv.j0(ysm0.f43175a), mrv.j0(sm8Var), mrv.j0(tblVar), mrv.j0((jiy) a8zVarArr[10].getValue()), mrv.j0(fpf0.f9926a), mrv.j0(tblVar), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = zof0.o;
        epf0 epf0Var = null;
        List list = null;
        Double d = null;
        Boolean bool = null;
        Double d2 = null;
        String str = null;
        int i = 0;
        Long l2 = null;
        rk10 rk10Var = null;
        Long l3 = null;
        Double d3 = null;
        bpf0 bpf0Var = null;
        Integer num = null;
        Boolean bool2 = null;
        boolean z = true;
        Long l4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l4;
                    z = false;
                    list = list;
                    l3 = l3;
                    l4 = l;
                    epf0Var = epf0Var;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l4);
                    i |= 1;
                    rk10Var = rk10Var;
                    list = list;
                    l3 = l3;
                    l4 = l;
                    epf0Var = epf0Var;
                    break;
                case 1:
                    epf0Var = epf0Var;
                    rk10Var = (rk10) bldVarA.e(ugi0Var, 1, ok10.f25385a, rk10Var);
                    i |= 2;
                    l3 = l3;
                    epf0Var = epf0Var;
                    break;
                case 2:
                    epf0Var = epf0Var;
                    l3 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l3);
                    i |= 4;
                    rk10Var = rk10Var;
                    epf0Var = epf0Var;
                    break;
                case 3:
                    d3 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d3);
                    i |= 8;
                    rk10Var = rk10Var;
                    l3 = l3;
                    break;
                case 4:
                    bpf0Var = (bpf0) bldVarA.e(ugi0Var, 4, cpf0.f4743a, bpf0Var);
                    i |= 16;
                    rk10Var = rk10Var;
                    l3 = l3;
                    break;
                case 5:
                    num = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num);
                    i |= 32;
                    rk10Var = rk10Var;
                    l3 = l3;
                    break;
                case 6:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool2);
                    i |= 64;
                    rk10Var = rk10Var;
                    l3 = l3;
                    break;
                case 7:
                    str = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str);
                    i |= 128;
                    rk10Var = rk10Var;
                    l3 = l3;
                    break;
                case 8:
                    bool = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool);
                    i |= 256;
                    rk10Var = rk10Var;
                    l3 = l3;
                    break;
                case 9:
                    d = (Double) bldVarA.e(ugi0Var, 9, tbl.f33669a, d);
                    i |= 512;
                    rk10Var = rk10Var;
                    l3 = l3;
                    break;
                case 10:
                    list = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
                    i |= 1024;
                    rk10Var = rk10Var;
                    l3 = l3;
                    break;
                case 11:
                    epf0Var = (epf0) bldVarA.e(ugi0Var, 11, fpf0.f9926a, epf0Var);
                    i |= 2048;
                    rk10Var = rk10Var;
                    l3 = l3;
                    break;
                case 12:
                    d2 = (Double) bldVarA.e(ugi0Var, 12, tbl.f33669a, d2);
                    i |= 4096;
                    rk10Var = rk10Var;
                    l3 = l3;
                    break;
                case 13:
                    l2 = (Long) bldVarA.e(ugi0Var, 13, s710.f31729a, l2);
                    i |= 8192;
                    rk10Var = rk10Var;
                    l3 = l3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        epf0 epf0Var2 = epf0Var;
        Long l5 = l4;
        bldVarA.c(ugi0Var);
        return new zof0(i, l5, rk10Var, l3, d3, bpf0Var, num, bool2, str, bool, d, list, epf0Var2, d2, l2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zof0 zof0Var = (zof0) obj;
        zof0Var.getClass();
        Long l = zof0Var.n;
        Double d = zof0Var.m;
        epf0 epf0Var = zof0Var.l;
        List list = zof0Var.k;
        Double d2 = zof0Var.j;
        Boolean bool = zof0Var.i;
        String str = zof0Var.h;
        Boolean bool2 = zof0Var.g;
        Integer num = zof0Var.f;
        bpf0 bpf0Var = zof0Var.e;
        Double d3 = zof0Var.d;
        Long l2 = zof0Var.c;
        rk10 rk10Var = zof0Var.b;
        Long l3 = zof0Var.f44718a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = zof0.o;
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || rk10Var != null) {
            cldVarA.p(ugi0Var, 1, ok10.f25385a, rk10Var);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || bpf0Var != null) {
            cldVarA.p(ugi0Var, 4, cpf0.f4743a, bpf0Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 9, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || epf0Var != null) {
            cldVarA.p(ugi0Var, 11, fpf0.f9926a, epf0Var);
        }
        if (cldVarA.u(ugi0Var) || d != 0) {
            cldVarA.p(ugi0Var, 12, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || l != 0) {
            cldVarA.p(ugi0Var, 13, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
