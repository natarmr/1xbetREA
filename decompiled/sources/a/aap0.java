package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aap0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aap0 f540a;
    private static final ugi0 descriptor;

    static {
        aap0 aap0Var = new aap0();
        f540a = aap0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.team_details.data.model.TeamDetailsResponse", aap0Var, 10);
        zna0Var.j("name", true);
        zna0Var.j("feedId", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("description", true);
        zna0Var.j("locationImageS3", true);
        zna0Var.j("location", true);
        zna0Var.j("foundedAtStamp", true);
        zna0Var.j("achievements", true);
        zna0Var.j("transfers", true);
        zna0Var.j("sportsExists", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = cap0.k;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0((jiy) a8zVarArr[8].getValue()), mrv.j0((jiy) a8zVarArr[9].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = cap0.k;
        List list = null;
        List list2 = null;
        boolean z = true;
        List list3 = null;
        int i = 0;
        String str = null;
        Long l = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Long l2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
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
                    l2 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l2);
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
                    list = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr2[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new cap0(i, str, l, str2, str3, str4, str5, l2, list3, list2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cap0 cap0Var = (cap0) obj;
        cap0Var.getClass();
        List list = cap0Var.j;
        List list2 = cap0Var.i;
        List list3 = cap0Var.h;
        Long l = cap0Var.g;
        String str = cap0Var.f;
        String str2 = cap0Var.e;
        String str3 = cap0Var.d;
        String str4 = cap0Var.c;
        Long l2 = cap0Var.b;
        String str5 = cap0Var.f4023a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = cap0.k;
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l);
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
        cldVarA.c(ugi0Var);
    }
}
