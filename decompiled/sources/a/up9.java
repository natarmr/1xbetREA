package a;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class up9 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final up9 f36052a;
    private static final ugi0 descriptor;

    static {
        up9 up9Var = new up9();
        f36052a = up9Var;
        zna0 zna0Var = new zna0("org.xplatform.callback.impl.data.model.request.CallbackFeedbackRequestBody", up9Var, 1);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{wp9.b[0].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = wp9.b;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                map = (Map) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), map);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new wp9(i, map);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wp9 wp9Var = (wp9) obj;
        wp9Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) wp9.b[0].getValue(), wp9Var.f39533a);
        cldVarA.c(ugi0Var);
    }
}
