package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.bet_history.history.presentation.BetHistoryScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hpb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13433a;
    public final /* synthetic */ lpb0 b;

    public /* synthetic */ hpb0(lpb0 lpb0Var, byte b) {
        this.f13433a = b;
        this.b = lpb0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f13433a;
        lpb0 lpb0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                lpb0Var.C.b(th, new j3b0((byte) 14));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                p7m0 p7m0Var = lpb0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    lpb0Var.f.getClass();
                } while (!p7m0Var.m(value, zob0.a((zob0) value, false, false, null, null, null, null, null, null, 32765)));
                lpb0Var.C.b(th2, new j3b0((byte) 15));
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                lpb0Var.C.b(th3, new lma0(lpb0Var, (byte) 14));
                break;
            default:
                ((k0w0) obj).c(new BetHistoryScreen(new p57(0, lpb0Var.p, 0L), lpb0Var.v.a().g.u));
                break;
        }
        return Unit.f46060a;
    }
}
