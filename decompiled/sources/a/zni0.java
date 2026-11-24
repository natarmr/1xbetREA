package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zni0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zni0 f44676a;
    private static final ugi0 descriptor;

    static {
        zni0 zni0Var = new zni0();
        f44676a = zni0Var;
        zna0 zna0Var = new zna0("org.xplatform.games_section.feature.cashback.data.models.SetCategoryRequest", zni0Var, 1);
        zna0Var.j("gameIds", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{boi0.b[0].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = boi0.b;
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
        return new boi0(i, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        boi0 boi0Var = (boi0) obj;
        boi0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) boi0.b[0].getValue(), boi0Var.f2935a);
        cldVarA.c(ugi0Var);
    }
}
