package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m280 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m280 f21044a;
    private static final ugi0 descriptor;

    static {
        m280 m280Var = new m280();
        f21044a = m280Var;
        zna0 zna0Var = new zna0("org.xplatform.feed.linelive.data.models.OpponentResponse", m280Var, 3);
        zna0Var.j("countryId", true);
        zna0Var.j("fullName", true);
        zna0Var.j("opps", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(ysm0.f43175a), mrv.j0((jiy) f380.d[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = f380.d;
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new f380(i, num, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        f380 f380Var = (f380) obj;
        f380Var.getClass();
        List list = f380Var.c;
        String str = f380Var.b;
        Integer num = f380Var.f8848a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = f380.d;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
