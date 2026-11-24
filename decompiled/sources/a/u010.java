package a;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u010 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u010 f34833a;
    private static final ugi0 descriptor;

    static {
        u010 u010Var = new u010();
        f34833a = u010Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.cyber_info.lol.data.model.LolInfoResponse", u010Var, 11);
        zna0Var.j("startedAtStamp", true);
        zna0Var.j("endedAtStamp", true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("location", true);
        zna0Var.j("description", true);
        zna0Var.j("prizePool", true);
        zna0Var.j("heroes", true);
        zna0Var.j("prizeDistribution", true);
        zna0Var.j("topTeams", true);
        zna0Var.j("players", true);
        zna0Var.j("groups", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = w010.l;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[6].getValue()), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0((jiy) a8zVarArr[8].getValue()), mrv.j0((jiy) a8zVarArr[9].getValue()), mrv.j0((jiy) a8zVarArr[10].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = w010.l;
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = true;
        List list4 = null;
        int i = 0;
        Long l = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l3 = null;
        List list5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    l3 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l3);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    list5 = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list5);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    list4 = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list4);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    list3 = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list3);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    list2 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list2);
                    i |= 512;
                    break;
                case 10:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
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
        return new w010(i, l, l2, str, str2, str3, l3, list5, list4, list3, list2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        w010 w010Var = (w010) obj;
        w010Var.getClass();
        List list = w010Var.k;
        List list2 = w010Var.j;
        List list3 = w010Var.i;
        List list4 = w010Var.h;
        List list5 = w010Var.g;
        Long l = w010Var.f;
        String str = w010Var.e;
        String str2 = w010Var.d;
        String str3 = w010Var.c;
        Long l2 = w010Var.b;
        Long l3 = w010Var.f38326a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = w010.l;
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
