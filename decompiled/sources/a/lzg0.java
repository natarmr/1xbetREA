package a;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lzg0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lzg0 f20904a;
    private static final ugi0 descriptor;

    static {
        lzg0 lzg0Var = new lzg0();
        f20904a = lzg0Var;
        zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.SavedStateArrayValue", lzg0Var, 1);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{nzg0.b[0].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = nzg0.b;
        boolean z = true;
        int i = 0;
        Bundle[] bundleArr = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                bundleArr = (Bundle[]) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), bundleArr);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new nzg0(i, bundleArr);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nzg0 nzg0Var = (nzg0) obj;
        nzg0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) nzg0.b[0].getValue(), nzg0Var.f24371a);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
