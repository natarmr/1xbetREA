package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ecd implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7561a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ fak0 c;

    public /* synthetic */ ecd(byte b, fak0 fak0Var, Function1 function1) {
        this.f7561a = b;
        this.b = function1;
        this.c = fak0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7561a;
        fak0 fak0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                String str = fak0Var.c;
                str.getClass();
                function1.invoke(new e27(str));
                break;
            case 1:
                String str2 = fak0Var.c;
                str2.getClass();
                function1.invoke(new e27(str2));
                break;
            case 2:
                String str3 = fak0Var.c;
                str3.getClass();
                function1.invoke(new g27(str3));
                break;
            default:
                function1.invoke(new t27(HistoryMenuItem.c, fak0Var.c));
                break;
        }
        return Unit.f46060a;
    }
}
