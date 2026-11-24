package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class laf0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19703a = 0;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ pu90 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ pu90 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ laf0(pu90 pu90Var, pu90 pu90Var2, int i, int i2, int i3, pu90 pu90Var3) {
        this.b = pu90Var;
        this.c = pu90Var2;
        this.d = i;
        this.f = i2;
        this.g = i3;
        this.e = pu90Var3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f19703a;
        int i = this.g;
        int i2 = this.f;
        pu90 pu90Var = this.e;
        int i3 = this.d;
        pu90 pu90Var2 = this.c;
        pu90 pu90Var3 = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                ou90Var.g(pu90Var3, 0, 0, 0.0f);
                ou90Var.g(pu90Var2, 0, 0, 0.0f);
                int i4 = (i3 - i2) - i;
                if (pu90Var != null) {
                    ou90Var.g(pu90Var, 0, i4, 0.0f);
                }
                break;
            default:
                ou90Var.getClass();
                ou90Var.g(pu90Var3, 0, 0, 0.0f);
                ou90Var.g(pu90Var2, 0, i3, 0.0f);
                if (pu90Var != null) {
                    ou90Var.g(pu90Var, 0, i2 - i, 0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ laf0(pu90 pu90Var, pu90 pu90Var2, int i, pu90 pu90Var3, int i2, int i3) {
        this.b = pu90Var;
        this.c = pu90Var2;
        this.d = i;
        this.e = pu90Var3;
        this.f = i2;
        this.g = i3;
    }
}
