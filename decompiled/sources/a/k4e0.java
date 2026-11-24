package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.statistic.rating.impl.rating_statistic.domain.model.SelectorOptionModel;

/* JADX INFO: loaded from: classes6.dex */
public final class k4e0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17666a;
    public final /* synthetic */ l4e0 b;
    public final /* synthetic */ SelectorOptionModel c;

    public /* synthetic */ k4e0(l4e0 l4e0Var, SelectorOptionModel selectorOptionModel, byte b) {
        this.f17666a = b;
        this.b = l4e0Var;
        this.c = selectorOptionModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17666a;
        SelectorOptionModel selectorOptionModel = this.c;
        l4e0 l4e0Var = this.b;
        switch (b) {
            case 0:
                fl70 fl70Var = l4e0.n2;
                l4e0Var.P0(selectorOptionModel);
                break;
            default:
                fl70 fl70Var2 = l4e0.n2;
                l4e0Var.P0(selectorOptionModel);
                break;
        }
        return Unit.f46060a;
    }
}
