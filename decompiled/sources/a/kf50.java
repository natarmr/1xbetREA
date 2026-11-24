package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kf50 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18183a;
    public final /* synthetic */ m7h0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ kf50(m7h0 m7h0Var, boolean z, boolean z2, byte b) {
        this.f18183a = b;
        this.b = m7h0Var;
        this.c = z;
        this.d = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f18183a;
        boolean z = this.d;
        boolean z2 = this.c;
        m7h0 m7h0Var = this.b;
        switch (b) {
            case 0:
                i1w0 i1w0Var = (i1w0) obj;
                i1w0Var.getClass();
                if (m7h0Var != null) {
                    i1w0Var.d(new kf50(m7h0Var, z2, z, (byte) 1));
                }
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                ((c8d) k0w0Var.h(m7h0Var).f14945a).f3908a = new v7d(z2, cfx0.o, new bjk(null, false, false, z));
                break;
        }
        return Unit.f46060a;
    }
}
