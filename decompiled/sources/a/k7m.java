package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k7m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17829a = 0;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ pu90 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ pu90 f;

    public /* synthetic */ k7m(pu90 pu90Var, int i, pu90 pu90Var2, int i2, pu90 pu90Var3) {
        this.b = pu90Var;
        this.d = i;
        this.c = pu90Var2;
        this.e = i2;
        this.f = pu90Var3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f17829a;
        pu90 pu90Var = this.f;
        int i = this.e;
        int i2 = this.d;
        pu90 pu90Var2 = this.c;
        pu90 pu90Var3 = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                ou90Var.m(pu90Var3, 0, i2, 0.0f);
                ou90Var.m(pu90Var2, i, i2, 0.0f);
                ou90Var.m(pu90Var, 0, 0, 0.0f);
                break;
            default:
                ou90Var.getClass();
                ou90Var.m(pu90Var3, 0, 0, 0.0f);
                ou90Var.m(pu90Var2, (i2 / 2) - (i / 2), 0, 0.0f);
                ou90Var.m(pu90Var, i2 - pu90Var.f27604a, 0, 0.0f);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ k7m(pu90 pu90Var, pu90 pu90Var2, int i, int i2, pu90 pu90Var3) {
        this.b = pu90Var;
        this.c = pu90Var2;
        this.d = i;
        this.e = i2;
        this.f = pu90Var3;
    }
}
