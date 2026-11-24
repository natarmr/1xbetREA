package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i6k implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i6k f14243a;
    private static final ugi0 descriptor;

    static {
        i6k i6kVar = new i6k();
        f14243a = i6kVar;
        zna0 zna0Var = new zna0("org.xplatform.feed.subscriptions.data.models.DeleteTeamsRequest", i6kVar, 1);
        zna0Var.j("TeamId", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{k6k.b[0].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = k6k.b;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new k6k(i, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        k6k k6kVar = (k6k) obj;
        k6kVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) k6k.b[0].getValue(), k6kVar.f17775a);
        cldVarA.c(ugi0Var);
    }
}
