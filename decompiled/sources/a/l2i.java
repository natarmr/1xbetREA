package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l2i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19309a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ x3i c;

    public /* synthetic */ l2i(Function1 function1, x3i x3iVar, byte b) {
        this.f19309a = b;
        this.b = function1;
        this.c = x3iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19309a;
        x3i x3iVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(x3iVar);
                break;
            case 1:
                function1.invoke(x3iVar);
                break;
            case 2:
                function1.invoke(x3iVar);
                break;
            default:
                function1.invoke(x3iVar);
                break;
        }
        return Unit.f46060a;
    }
}
