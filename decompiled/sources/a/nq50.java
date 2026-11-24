package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nq50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23943a;
    public final /* synthetic */ sq50 b;

    public /* synthetic */ nq50(sq50 sq50Var, byte b) {
        this.f23943a = b;
        this.b = sq50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23943a;
        sq50 sq50Var = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                sq50Var.H(new nq50(sq50Var, (byte) 1));
                return Unit.f46060a;
            default:
                iq50 iq50Var = (iq50) obj2;
                ((oyg0) obj).getClass();
                iq50Var.getClass();
                return iq50.a(iq50Var, false, null, null, sq50Var.N(), 14);
        }
    }
}
