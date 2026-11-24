package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class r63 extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29916a;
    public final /* synthetic */ pu90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r63(pu90 pu90Var, byte b) {
        super(1);
        this.f29916a = b;
        this.b = pu90Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29916a;
        pu90 pu90Var = this.b;
        switch (b) {
            case 0:
                ((ou90) obj).g(pu90Var, 0, 0, 0.0f);
                break;
            case 1:
                ((ou90) obj).g(pu90Var, 0, 0, 0.0f);
                break;
            case 2:
                ((ou90) obj).g(pu90Var, 0, 0, 0.0f);
                break;
            default:
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                ou90Var.m(pu90Var, 0, 0, 0.0f);
                break;
        }
        return Unit.f46060a;
    }
}
