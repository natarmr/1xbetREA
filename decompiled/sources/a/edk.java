package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class edk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7621a;
    public final fdk b;

    public /* synthetic */ edk(fdk fdkVar, byte b) {
        this.f7621a = b;
        this.b = fdkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7621a;
        fdk fdkVar = this.b;
        switch (b) {
            case 0:
                g0d0 g0d0VarD = fdkVar.B().z().d();
                if (g0d0VarD != null) {
                    return g0d0VarD;
                }
                g0d0 g0d0VarN = obb.N(fdkVar.B().z(), ujn.c);
                g0d0VarN.s1(fdkVar.B().z().getType());
                return g0d0VarN;
            default:
                return jcb.V(fdkVar, true);
        }
    }
}
