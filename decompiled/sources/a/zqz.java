package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class zqz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44830a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ m85 c;

    public /* synthetic */ zqz(Function1 function1, m85 m85Var, byte b) {
        this.f44830a = b;
        this.b = function1;
        this.c = m85Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44830a;
        m85 m85Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new qqz(m85Var));
                break;
            default:
                function1.invoke(new qqz(m85Var));
                break;
        }
        return Unit.f46060a;
    }
}
