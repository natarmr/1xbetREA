package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kw7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18987a;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ pu90 c;
    public final /* synthetic */ int d;

    public /* synthetic */ kw7(pu90 pu90Var, int i, pu90 pu90Var2) {
        this.f18987a = (byte) 3;
        this.b = pu90Var;
        this.d = i;
        this.c = pu90Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f18987a;
        int i = this.d;
        pu90 pu90Var = this.c;
        pu90 pu90Var2 = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                ou90Var.m(pu90Var2, 0, 0, 0.0f);
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, pu90Var2.f27604a + i, 0, 0.0f);
                }
                break;
            case 1:
                ou90Var.getClass();
                ou90Var.m(pu90Var2, 0, 0, 0.0f);
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, pu90Var2.f27604a + i, 0, 0.0f);
                }
                break;
            case 2:
                ou90Var.getClass();
                ou90Var.m(pu90Var2, 0, 0, 0.0f);
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, 0, pu90Var2.b + i, 0.0f);
                }
                break;
            case 3:
                ou90Var.getClass();
                ou90Var.m(pu90Var2, 0, (i - pu90Var2.b) / 2, 0.0f);
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, pu90Var2.f27604a + ((int) (ou90Var.getDensity() * 4.0f)), (i - pu90Var.b) / 2, 0.0f);
                }
                break;
            default:
                ou90Var.getClass();
                ou90Var.g(pu90Var2, 0, 0, 0.0f);
                if (pu90Var != null) {
                    ou90Var.g(pu90Var, 0, i, 0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ kw7(pu90 pu90Var, pu90 pu90Var2, int i, byte b) {
        this.f18987a = b;
        this.b = pu90Var;
        this.c = pu90Var2;
        this.d = i;
    }
}
