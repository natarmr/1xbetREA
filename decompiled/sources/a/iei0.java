package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iei0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iei0 f14635a;
    private static final ugi0 descriptor;

    static {
        iei0 iei0Var = new iei0();
        f14635a = iei0Var;
        zna0 zna0Var = new zna0("FilesModel", iei0Var, 5);
        zna0Var.j(ParameterNames.TEXT, true);
        zna0Var.j("filePaths", true);
        zna0Var.j("createdDate", true);
        zna0Var.j("keyForLocalStore", true);
        zna0Var.j("sendWithError", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = kei0.g;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(yej.f42489a), mrv.j0(ysm0Var), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = kei0.g;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        Date date = null;
        String str2 = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else if (iF == 2) {
                date = (Date) bldVarA.e(ugi0Var, 2, yej.f42489a, date);
                i |= 4;
            } else if (iF == 3) {
                str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new kei0(i, str, list, date, str2, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kei0 kei0Var = (kei0) obj;
        kei0Var.getClass();
        Boolean bool = kei0Var.f;
        String str = kei0Var.e;
        Date date = kei0Var.d;
        List list = kei0Var.c;
        String str2 = kei0Var.b;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = kei0.g;
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || date != null) {
            cldVarA.p(ugi0Var, 2, yej.f42489a, date);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
