package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.top.api.presentation.header.TopHeaderTagType;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r7r0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29991a = 1;
    public final /* synthetic */ t7r0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ r7r0(t7r0 t7r0Var, Function1 function1) {
        this.b = t7r0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29991a;
        Function1 function1 = this.c;
        t7r0 t7r0Var = this.b;
        switch (b) {
            case 0:
                function1.invoke(new qxq0(t7r0Var.f33480a));
                break;
            default:
                TopHeaderTagType topHeaderTagType = t7r0Var.b;
                if (topHeaderTagType != null) {
                    function1.invoke(new rxq0(topHeaderTagType));
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ r7r0(Function1 function1, t7r0 t7r0Var) {
        this.c = function1;
        this.b = t7r0Var;
    }
}
