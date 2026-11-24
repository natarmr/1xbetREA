package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class il30 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final il30 f14958a;
    private static final ugi0 descriptor;

    static {
        il30 il30Var = new il30();
        f14958a = il30Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.Media", il30Var, 6);
        zna0Var.j("$type", true);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("size", true);
        zna0Var.j("mimeType", true);
        zna0Var.j("thumbs", true);
        zna0Var.j("attributes", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710.f31729a), mrv.j0(ysm0Var), mrv.j0(ko30.f18611a), mrv.j0(ym30.f42868a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        List list = null;
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
                    l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) bldVarA.e(ugi0Var, 4, ko30.f18611a, list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) bldVarA.e(ugi0Var, 5, ym30.f42868a, list2);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new yl30(i, str, str2, l, str3, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yl30 yl30Var = (yl30) obj;
        yl30Var.getClass();
        List list = yl30Var.f;
        List list2 = yl30Var.e;
        String str = yl30Var.d;
        Long l = yl30Var.c;
        String str2 = yl30Var.b;
        String str3 = yl30Var.f42821a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 4, ko30.f18611a, list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 5, ym30.f42868a, list);
        }
        cldVarA.c(ugi0Var);
    }
}
