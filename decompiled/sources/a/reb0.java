package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class reb0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30327a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ oeb0 c;

    public /* synthetic */ reb0(Function1 function1, oeb0 oeb0Var, byte b) {
        this.f30327a = b;
        this.b = function1;
        this.c = oeb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30327a;
        oeb0 oeb0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                wim wimVar = (wim) obj;
                String str = (String) obj2;
                wimVar.getClass();
                long j = wimVar.f39221a;
                Integer intOrNull = StringsKt.toIntOrNull(((ieb0) oeb0Var).f14624a);
                function1.invoke(new wdb0(str, intOrNull != null ? intOrNull.intValue() : -1, j));
                break;
            default:
                wim wimVar2 = (wim) obj;
                String str2 = (String) obj2;
                wimVar2.getClass();
                long j2 = wimVar2.f39221a;
                Integer intOrNull2 = StringsKt.toIntOrNull(((jeb0) oeb0Var).f16366a);
                function1.invoke(new ydb0(str2, intOrNull2 != null ? intOrNull2.intValue() : -1, j2));
                break;
        }
        return Unit.f46060a;
    }
}
