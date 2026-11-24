package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xpm extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz40 f41276a;
    public final /* synthetic */ Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpm(pz40 pz40Var, Function1 function1) {
        super(1, knx.class, "onValueChange", "DsSearchField$onValueChange(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
        this.f41276a = pz40Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a8q0 a8q0Var = (a8q0) obj;
        a8q0Var.getClass();
        aac.o(this.f41276a, this.b, a8q0Var);
        return Unit.f46060a;
    }
}
