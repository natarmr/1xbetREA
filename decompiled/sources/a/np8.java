package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class np8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23899a;
    public final /* synthetic */ xpj0 b;
    public final /* synthetic */ nul0 c;
    public final /* synthetic */ nul0 d;
    public final /* synthetic */ nul0 e;

    public /* synthetic */ np8(xpj0 xpj0Var, nul0 nul0Var, nul0 nul0Var2, nul0 nul0Var3, byte b) {
        this.f23899a = b;
        this.b = xpj0Var;
        this.c = nul0Var;
        this.d = nul0Var2;
        this.e = nul0Var3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23899a;
        nul0 nul0Var = this.e;
        nul0 nul0Var2 = this.d;
        nul0 nul0Var3 = this.c;
        xpj0 xpj0Var = this.b;
        switch (b) {
            case 0:
                xpj0Var.f = nul0Var3;
                xpj0Var.g = nul0Var2;
                xpj0Var.d = nul0Var;
                break;
            default:
                xpj0Var.f = nul0Var3;
                xpj0Var.g = nul0Var2;
                xpj0Var.d = nul0Var;
                break;
        }
        return Unit.f46060a;
    }
}
