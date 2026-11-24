package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0h0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0h0 f3524a;
    private static final ugi0 descriptor;

    static {
        c0h0 c0h0Var = new c0h0();
        f3524a = c0h0Var;
        zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.SavedStateListValue", c0h0Var, 1);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{e0h0.b[0].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = e0h0.b;
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
        return new e0h0(i, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e0h0 e0h0Var = (e0h0) obj;
        e0h0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) e0h0.b[0].getValue(), e0h0Var.f6989a);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
