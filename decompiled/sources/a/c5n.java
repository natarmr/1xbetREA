package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class c5n extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3780a;
    public final /* synthetic */ bk30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5n(bk30 bk30Var, byte b) {
        super(1);
        this.f3780a = b;
        this.b = bk30Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3780a) {
            case 0:
                swq0.a((abi0) obj, this.b);
                break;
            case 1:
                swq0.a((abi0) obj, this.b);
                break;
            case 2:
                swq0.a((abi0) obj, this.b);
                break;
            default:
                swq0.a((abi0) obj, this.b);
                break;
        }
        return Unit.f46060a;
    }
}
