package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class br60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3063a;
    public final /* synthetic */ bs60 b;

    public /* synthetic */ br60(bs60 bs60Var, byte b) {
        this.f3063a = b;
        this.b = bs60Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3063a;
        bs60 bs60Var = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                bs60Var.Y();
                break;
            default:
                ((List) obj).getClass();
                bs60.T(bs60Var, false, Integer.valueOf(bs60Var.G.b()));
                break;
        }
        return Unit.f46060a;
    }
}
