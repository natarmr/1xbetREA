package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class lfk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19961a;
    public final Function0 b;

    public /* synthetic */ lfk(Function0 function0, byte b) {
        this.f19961a = b;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19961a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                return CollectionsKt.P0((Iterable) function0.invoke());
            case 1:
                function0.invoke();
                return Unit.f46060a;
            case 2:
                function0.invoke();
                return Unit.f46060a;
            case 3:
                function0.invoke();
                return Unit.f46060a;
            case 4:
                return (riu0) function0.invoke();
            case 5:
                function0.invoke();
                return Unit.f46060a;
            case 6:
                function0.invoke();
                return Unit.f46060a;
            default:
                cr30 cr30Var = (cr30) function0.invoke();
                return cr30Var instanceof mdz ? ((mdz) cr30Var).h() : cr30Var;
        }
    }
}
