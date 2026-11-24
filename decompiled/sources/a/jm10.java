package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jm10 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16742a = 0;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ pu90 c;
    public final /* synthetic */ pu90 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ pu90 f;
    public final /* synthetic */ int g;

    public /* synthetic */ jm10(pu90 pu90Var, int i, pu90 pu90Var2, pu90 pu90Var3, pu90 pu90Var4, int i2) {
        this.b = pu90Var;
        this.e = i;
        this.c = pu90Var2;
        this.d = pu90Var3;
        this.f = pu90Var4;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f16742a;
        int i = this.g;
        pu90 pu90Var = this.f;
        int i2 = this.e;
        pu90 pu90Var2 = this.d;
        pu90 pu90Var3 = this.c;
        pu90 pu90Var4 = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                ou90Var.g(pu90Var4, 0, i2 - pu90Var4.b, 0.0f);
                ou90Var.g(pu90Var3, 0, i2, 0.0f);
                ou90Var.g(pu90Var2, 0, i2 + pu90Var3.b, 0.0f);
                ou90Var.g(pu90Var, 0, i - pu90Var.b, 0.0f);
                break;
            default:
                ou90Var.getClass();
                if (pu90Var4 != null) {
                    ou90Var.g(pu90Var4, 0, 0, 0.0f);
                }
                if (pu90Var3 != null) {
                    ou90Var.g(pu90Var3, 0, pu90Var4 != null ? pu90Var4.b : 0, 0.0f);
                }
                ou90Var.g(pu90Var2, 0, i2, 0.0f);
                if (pu90Var != null) {
                    ou90Var.g(pu90Var, 0, i - pu90Var.b, 0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ jm10(pu90 pu90Var, pu90 pu90Var2, pu90 pu90Var3, int i, pu90 pu90Var4, int i2) {
        this.b = pu90Var;
        this.c = pu90Var2;
        this.d = pu90Var3;
        this.e = i;
        this.f = pu90Var4;
        this.g = i2;
    }
}
