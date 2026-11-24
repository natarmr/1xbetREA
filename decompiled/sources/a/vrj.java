package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vrj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37901a;
    public final /* synthetic */ zrj b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ vrj(zrj zrjVar, boolean z, byte b) {
        this.f37901a = b;
        this.b = zrjVar;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f37901a;
        byte b2 = 0;
        boolean z = this.c;
        zrj zrjVar = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                ((c8d) k0w0Var.h(rek0.l(zrjVar.d.m())).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, z));
                break;
            case 1:
                i1w0 i1w0Var = (i1w0) obj;
                i1w0Var.getClass();
                i1w0Var.d(new vrj(zrjVar, z, b2));
                break;
            default:
                i1w0 i1w0Var2 = (i1w0) obj;
                i1w0Var2.getClass();
                i1w0Var2.d(new z(zrjVar, z));
                break;
        }
        return Unit.f46060a;
    }
}
