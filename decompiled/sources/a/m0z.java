package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m0z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20979a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ jam0 c;

    public /* synthetic */ m0z(Function1 function1, jam0 jam0Var, byte b) {
        this.f20979a = b;
        this.b = function1;
        this.c = jam0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f20979a;
        jam0 jam0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new ot30(jam0Var));
                break;
            case 1:
                function1.invoke(new rt30(jam0Var));
                break;
            default:
                function1.invoke(new pt30(jam0Var));
                break;
        }
        return Unit.f46060a;
    }
}
