package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j2i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15780a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ z3i c;

    public /* synthetic */ j2i(Function1 function1, z3i z3iVar, byte b) {
        this.f15780a = b;
        this.b = function1;
        this.c = z3iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15780a;
        z3i z3iVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(z3iVar);
                break;
            case 1:
                function1.invoke(z3iVar);
                break;
            case 2:
                function1.invoke(z3iVar);
                break;
            default:
                function1.invoke(z3iVar);
                break;
        }
        return Unit.f46060a;
    }
}
