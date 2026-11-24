package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c6t implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c6t f3835a;
    private static final ugi0 descriptor;

    static {
        c6t c6tVar = new c6t();
        f3835a = c6tVar;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.main.data.eventgames.history.model.response.GamesHistoryResponse", c6tVar, 3);
        zna0Var.j("count", true);
        zna0Var.j("items", true);
        zna0Var.j("isAll", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0((jiy) l6t.d[1].getValue()), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = l6t.d;
        boolean z = true;
        int i = 0;
        Integer num = null;
        List list = null;
        Boolean bool = null;
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
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new l6t(i, bool, num, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l6t l6tVar = (l6t) obj;
        l6tVar.getClass();
        Boolean bool = l6tVar.c;
        List list = l6tVar.b;
        Integer num = l6tVar.f19524a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = l6t.d;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
