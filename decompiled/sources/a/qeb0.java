package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class qeb0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28576a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ oeb0 c;

    public /* synthetic */ qeb0(Function1 function1, oeb0 oeb0Var, byte b) {
        this.f28576a = b;
        this.b = function1;
        this.c = oeb0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28576a;
        oeb0 oeb0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                Integer intOrNull = StringsKt.toIntOrNull(((ieb0) oeb0Var).f14624a);
                function1.invoke(new vdb0(intOrNull != null ? intOrNull.intValue() : -1));
                break;
            default:
                Integer intOrNull2 = StringsKt.toIntOrNull(((jeb0) oeb0Var).f16366a);
                function1.invoke(new xdb0(intOrNull2 != null ? intOrNull2.intValue() : -1));
                break;
        }
        return Unit.f46060a;
    }
}
