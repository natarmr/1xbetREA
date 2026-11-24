package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m3u0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3u0 f21136a;
    private static final ugi0 descriptor;

    static {
        m3u0 m3u0Var = new m3u0();
        f21136a = m3u0Var;
        zna0 zna0Var = new zna0("org.xplatform.authqr.impl.qr.data.models.ValueResponse", m3u0Var, 6);
        zna0Var.j("Type", true);
        zna0Var.j("Message", true);
        zna0Var.j("Auth", true);
        zna0Var.j("AnswerTypes", true);
        zna0Var.j("UserQuestion", true);
        zna0Var.j("CodeTypes", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = o3u0.g;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(wwp0.f39896a), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[5].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = o3u0.g;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        ywp0 ywp0Var = null;
        List list = null;
        String str3 = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    ywp0Var = (ywp0) bldVarA.e(ugi0Var, 2, wwp0.f39896a, ywp0Var);
                    i |= 4;
                    break;
                case 3:
                    list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new o3u0(i, str, str2, ywp0Var, list, str3, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        o3u0 o3u0Var = (o3u0) obj;
        o3u0Var.getClass();
        List list = o3u0Var.f;
        String str = o3u0Var.e;
        List list2 = o3u0Var.d;
        ywp0 ywp0Var = o3u0Var.c;
        String str2 = o3u0Var.b;
        String str3 = o3u0Var.f24603a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = o3u0.g;
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || ywp0Var != null) {
            cldVarA.p(ugi0Var, 2, wwp0.f39896a, ywp0Var);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
