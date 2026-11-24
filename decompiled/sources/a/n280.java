package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n280 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n280 f22786a;
    private static final ugi0 descriptor;

    static {
        n280 n280Var = new n280();
        f22786a = n280Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.who_win.data.model.response.OpponentResponse", n280Var, 4);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("images", true);
        zna0Var.j("name", true);
        zna0Var.j("event", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0((jiy) g380.e[1].getValue()), mrv.j0(ysm0.f43175a), mrv.j0(ego.f7774a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = g380.e;
        boolean z = true;
        int i = 0;
        Integer num = null;
        List list = null;
        String str = null;
        zgo zgoVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else if (iF == 2) {
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                zgoVar = (zgo) bldVarA.e(ugi0Var, 3, ego.f7774a, zgoVar);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new g380(i, num, list, str, zgoVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        g380 g380Var = (g380) obj;
        g380Var.getClass();
        zgo zgoVar = g380Var.d;
        String str = g380Var.c;
        List list = g380Var.b;
        Integer num = g380Var.f10600a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = g380.e;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || zgoVar != null) {
            cldVarA.p(ugi0Var, 3, ego.f7774a, zgoVar);
        }
        cldVarA.c(ugi0Var);
    }
}
