package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class knv implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final knv f18603a;
    private static final ugi0 descriptor;

    static {
        knv knvVar = new knv();
        f18603a = knvVar;
        zna0 zna0Var = new zna0("org.xplatform.services.mobile_services.api.data.models.Hashes", knvVar, 1);
        zna0Var.j("messages", true);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mnv.b[0].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = mnv.b;
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
        return new mnv(i, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mnv mnvVar = (mnv) obj;
        mnvVar.getClass();
        List list = mnvVar.f22108a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = mnv.b;
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(list, new ArrayList())) {
            cldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
