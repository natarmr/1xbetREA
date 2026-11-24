package a;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0h0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0h0 f20954a;
    private static final ugi0 descriptor;

    static {
        m0h0 m0h0Var = new m0h0();
        f20954a = m0h0Var;
        zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.SavedStateValue", m0h0Var, 1);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{k0h0.f17467a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Bundle bundle = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                bundle = (Bundle) bldVarA.m(ugi0Var, 0, k0h0.f17467a, bundle);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new o0h0(i, bundle);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        o0h0 o0h0Var = (o0h0) obj;
        o0h0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, k0h0.f17467a, o0h0Var.f24424a);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
