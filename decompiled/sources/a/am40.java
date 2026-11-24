package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class am40 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1092a;
    public final /* synthetic */ xpj0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ am40(xpj0 xpj0Var, Function0 function0, byte b) {
        this.f1092a = b;
        this.b = xpj0Var;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1092a) {
            case 0:
                if (!this.b.e()) {
                    this.c.invoke();
                }
                break;
            default:
                if (!this.b.e()) {
                    this.c.invoke();
                }
                break;
        }
        return Unit.f46060a;
    }
}
