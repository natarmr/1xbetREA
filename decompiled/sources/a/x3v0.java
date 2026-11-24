package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x3v0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40239a;
    public final /* synthetic */ c4v0 b;

    public /* synthetic */ x3v0(c4v0 c4v0Var, byte b) {
        this.f40239a = b;
        this.b = c4v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40239a;
        c4v0 c4v0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                c4v0Var.f.b(th, new b4u0((byte) 26));
                break;
            default:
                th.getClass();
                p7m0 p7m0Var = c4v0Var.g;
                a4v0 a4v0Var = new a4v0(c4v0Var.d.a(pb10.g, R.string.data_retrieval_error, R.string.try_again_text, new rbt0(c4v0Var, (byte) 23), 10000L));
                p7m0Var.getClass();
                p7m0Var.o(null, a4v0Var);
                c4v0Var.f.b(th, new b4u0((byte) 25));
                break;
        }
        return Unit.f46060a;
    }
}
