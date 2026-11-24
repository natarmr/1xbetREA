package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m4q0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m4q0 f21185a;
    private static final ugi0 descriptor;

    static {
        m4q0 m4q0Var = new m4q0();
        f21185a = m4q0Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.TextContent", m4q0Var, 5);
        zna0Var.j("$type", true);
        zna0Var.j(ParameterNames.TEXT, true);
        zna0Var.j("offset", true);
        zna0Var.j("length", true);
        zna0Var.j("attrs", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = o4q0.f;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = o4q0.f;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else if (iF == 2) {
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            } else if (iF == 3) {
                num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new o4q0(i, str, str2, num, num2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        o4q0 o4q0Var = (o4q0) obj;
        o4q0Var.getClass();
        List list = o4q0Var.e;
        Integer num = o4q0Var.d;
        Integer num2 = o4q0Var.c;
        String str = o4q0Var.b;
        String str2 = o4q0Var.f24653a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = o4q0.f;
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
