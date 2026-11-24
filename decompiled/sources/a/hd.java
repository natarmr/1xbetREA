package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hd implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hd f12845a;
    private static final ugi0 descriptor;

    static {
        hd hdVar = new hd();
        f12845a = hdVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.accountchange.AccountChangeResponse", hdVar, 14);
        zna0Var.j("UserId", true);
        zna0Var.j("MessageId", true);
        zna0Var.j("Password", true);
        zna0Var.j("Message", true);
        zna0Var.j("VerificationState", true);
        zna0Var.j("RAS", true);
        zna0Var.j("AnswerTypes", true);
        zna0Var.j("UserQuestion", true);
        zna0Var.j("Auth", true);
        zna0Var.j("Form", true);
        zna0Var.j("Ids", true);
        zna0Var.j("AuthenticatorEnabled", true);
        zna0Var.j("CodeTypes", true);
        zna0Var.j("CodeTypesRepeat", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = jd.o;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(nuf.f24143a), mrv.j0(okx.f25427a), mrv.j0((jiy) a8zVarArr[6].getValue()), mrv.j0(ysm0Var), mrv.j0(wwp0.f39896a), mrv.j0(wvq.f39850a), mrv.j0((jiy) a8zVarArr[10].getValue()), mrv.j0(sm8.f32432a), mrv.j0((jiy) a8zVarArr[12].getValue()), mrv.j0((jiy) a8zVarArr[13].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = jd.o;
        Boolean bool = null;
        List list = null;
        yvq yvqVar = null;
        ywp0 ywp0Var = null;
        List list2 = null;
        String str = null;
        int i = 0;
        List list3 = null;
        Long l2 = null;
        String str2 = null;
        String str3 = null;
        muf mufVar = null;
        Integer num = null;
        List list4 = null;
        boolean z = true;
        Long l3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l3;
                    z = false;
                    list = list;
                    str2 = str2;
                    l3 = l;
                    bool = bool;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l3);
                    i |= 1;
                    l2 = l2;
                    list = list;
                    str2 = str2;
                    l3 = l;
                    bool = bool;
                    break;
                case 1:
                    str2 = str2;
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    bool = bool;
                    str2 = str2;
                    break;
                case 2:
                    bool = bool;
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    l2 = l2;
                    bool = bool;
                    break;
                case 3:
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    l2 = l2;
                    str2 = str2;
                    break;
                case 4:
                    mufVar = (muf) bldVarA.e(ugi0Var, 4, nuf.f24143a, mufVar);
                    i |= 16;
                    l2 = l2;
                    str2 = str2;
                    break;
                case 5:
                    num = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num);
                    i |= 32;
                    l2 = l2;
                    str2 = str2;
                    break;
                case 6:
                    list4 = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list4);
                    i |= 64;
                    l2 = l2;
                    str2 = str2;
                    break;
                case 7:
                    str = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str);
                    i |= 128;
                    l2 = l2;
                    str2 = str2;
                    break;
                case 8:
                    ywp0Var = (ywp0) bldVarA.e(ugi0Var, 8, wwp0.f39896a, ywp0Var);
                    i |= 256;
                    l2 = l2;
                    str2 = str2;
                    break;
                case 9:
                    yvqVar = (yvq) bldVarA.e(ugi0Var, 9, wvq.f39850a, yvqVar);
                    i |= 512;
                    l2 = l2;
                    str2 = str2;
                    break;
                case 10:
                    list = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
                    i |= 1024;
                    l2 = l2;
                    str2 = str2;
                    break;
                case 11:
                    bool = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool);
                    i |= 2048;
                    l2 = l2;
                    str2 = str2;
                    break;
                case 12:
                    list2 = (List) bldVarA.e(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list2);
                    i |= 4096;
                    l2 = l2;
                    str2 = str2;
                    break;
                case 13:
                    list3 = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list3);
                    i |= 8192;
                    l2 = l2;
                    str2 = str2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool2 = bool;
        Long l4 = l3;
        bldVarA.c(ugi0Var);
        return new jd(i, l4, l2, str2, str3, mufVar, num, list4, str, ywp0Var, yvqVar, list, bool2, list2, list3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jd jdVar = (jd) obj;
        jdVar.getClass();
        List list = jdVar.n;
        List list2 = jdVar.m;
        Boolean bool = jdVar.l;
        List list3 = jdVar.k;
        yvq yvqVar = jdVar.j;
        ywp0 ywp0Var = jdVar.i;
        String str = jdVar.h;
        List list4 = jdVar.g;
        Integer num = jdVar.f;
        muf mufVar = jdVar.e;
        String str2 = jdVar.d;
        String str3 = jdVar.c;
        Long l = jdVar.b;
        Long l2 = jdVar.f16304a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = jd.o;
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || mufVar != null) {
            cldVarA.p(ugi0Var, 4, nuf.f24143a, mufVar);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || ywp0Var != null) {
            cldVarA.p(ugi0Var, 8, wwp0.f39896a, ywp0Var);
        }
        if (cldVarA.u(ugi0Var) || yvqVar != null) {
            cldVarA.p(ugi0Var, 9, wvq.f39850a, yvqVar);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(list3, iun.f15405a)) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list2 != 0) {
            cldVarA.p(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
