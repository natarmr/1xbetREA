package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z6a implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z6a f43856a;
    public static final zna0 b;

    static {
        z6a z6aVar = new z6a();
        f43856a = z6aVar;
        zna0 zna0Var = new zna0("org.xplatform.captcha.impl.data.model.CaptchaResponse", z6aVar, 2);
        zna0Var.j("tasks", true);
        zna0Var.j(ParameterNames.ID, true);
        b = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) b7a.c[0].getValue()), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        zna0 zna0Var = b;
        bld bldVarA = rkjVar.a(zna0Var);
        a8z[] a8zVarArr = b7a.c;
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(zna0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(zna0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(zna0Var, 1, ysm0.f43175a, str);
                i |= 2;
            }
        }
        bldVarA.c(zna0Var);
        return new b7a(str, list, i);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        b7a b7aVar = (b7a) obj;
        b7aVar.getClass();
        String str = b7aVar.b;
        List list = b7aVar.f2096a;
        zna0 zna0Var = b;
        cld cldVarA = bwnVar.a(zna0Var);
        a8z[] a8zVarArr = b7a.c;
        if (cldVarA.u(zna0Var) || list != null) {
            cldVarA.p(zna0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(zna0Var) || str != null) {
            cldVarA.p(zna0Var, 1, ysm0.f43175a, str);
        }
        cldVarA.c(zna0Var);
    }
}
