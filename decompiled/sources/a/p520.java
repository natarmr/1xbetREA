package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p520 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26384a;
    public final /* synthetic */ h620 b;

    public /* synthetic */ p520(h620 h620Var, byte b) {
        this.f26384a = b;
        this.b = h620Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f26384a;
        hnb0 hnb0Var = hnb0.f13344a;
        h620 h620Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                if (!(th instanceof CancellationException)) {
                    h620Var.l0.n(hnb0Var);
                }
                break;
            case 1:
                th.getClass();
                h620Var.e.b(th, new gm10((byte) 27));
                break;
            case 2:
                th.getClass();
                if (!(th instanceof CancellationException)) {
                    h620Var.E(h620Var.e0.f24244a ? xvo0.f41571a : awo0.f1585a);
                    h620Var.l0.n(hnb0Var);
                }
                break;
            case 3:
                th.getClass();
                h620Var.e.b(th, new q520(h620Var, (byte) 0));
                break;
            default:
                th.getClass();
                h620Var.e.b(th, new gm10((byte) 28));
                break;
        }
        return Unit.f46060a;
    }
}
