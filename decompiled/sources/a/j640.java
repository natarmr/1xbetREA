package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j640 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j640 f15967a;
    private static final ugi0 descriptor;

    static {
        j640 j640Var = new j640();
        f15967a = j640Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.MessageResponse", j640Var, 11);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("$type", true);
        zna0Var.j("fromId", true);
        zna0Var.j(ParameterNames.TEXT, true);
        zna0Var.j("medias", true);
        zna0Var.j("replyMarkup", true);
        zna0Var.j("command", true);
        zna0Var.j("action", true);
        zna0Var.j("messageReplyHeader", true);
        zna0Var.j("textMarkup", true);
        zna0Var.j("createdAt", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = n640.l;
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[4].getValue()), mrv.j0(zkf0.f44529a), mrv.j0(q7d.f28243a), mrv.j0(ih.f14755a), mrv.j0(f640.f8992a), mrv.j0(a930.f457a), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = n640.l;
        Long l = null;
        List list = null;
        h640 h640Var = null;
        boolean z = true;
        th thVar = null;
        int i = 0;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list2 = null;
        hlf0 hlf0Var = null;
        s7d s7dVar = null;
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
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
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
                    list2 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    hlf0Var = (hlf0) bldVarA.e(ugi0Var, 5, zkf0.f44529a, hlf0Var);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    s7dVar = (s7d) bldVarA.e(ugi0Var, 6, q7d.f28243a, s7dVar);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    thVar = (th) bldVarA.e(ugi0Var, 7, ih.f14755a, thVar);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    h640Var = (h640) bldVarA.e(ugi0Var, 8, f640.f8992a, h640Var);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 9, a930.f457a, list);
                    i |= 512;
                    break;
                case 10:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l);
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
        return new n640(i, num, str, str2, str3, list2, hlf0Var, s7dVar, thVar, h640Var, list, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n640 n640Var = (n640) obj;
        n640Var.getClass();
        Long l = n640Var.k;
        List list = n640Var.j;
        h640 h640Var = n640Var.i;
        th thVar = n640Var.h;
        s7d s7dVar = n640Var.g;
        hlf0 hlf0Var = n640Var.f;
        List list2 = n640Var.e;
        String str = n640Var.d;
        String str2 = n640Var.c;
        String str3 = n640Var.b;
        Integer num = n640Var.f22978a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = n640.l;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || hlf0Var != null) {
            cldVarA.p(ugi0Var, 5, zkf0.f44529a, hlf0Var);
        }
        if (cldVarA.u(ugi0Var) || s7dVar != null) {
            cldVarA.p(ugi0Var, 6, q7d.f28243a, s7dVar);
        }
        if (cldVarA.u(ugi0Var) || thVar != null) {
            cldVarA.p(ugi0Var, 7, ih.f14755a, thVar);
        }
        if (cldVarA.u(ugi0Var) || h640Var != null) {
            cldVarA.p(ugi0Var, 8, f640.f8992a, h640Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 9, a930.f457a, list);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
