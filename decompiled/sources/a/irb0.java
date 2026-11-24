package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.bet_history.history.presentation.BetHistoryScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class irb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15249a;
    public final /* synthetic */ orb0 b;

    public /* synthetic */ irb0(orb0 orb0Var, byte b) {
        this.f15249a = b;
        this.b = orb0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15249a;
        orb0 orb0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                orb0Var.c.b(th, new j3b0((byte) 17));
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                ((m0w) orb0Var.k.f13434a.g).getClass();
                k0w0Var.c(new BetHistoryScreen(new p57(0, orb0Var.i, 0L), orb0Var.l.a().g.u));
                break;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                orb0Var.c.b(th2, new r7a0(orb0Var, th2, (byte) 14));
                break;
        }
        return Unit.f46060a;
    }
}
