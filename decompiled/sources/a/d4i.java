package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d4i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5456a = 0;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ pu90 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ d4i(int i, pu90 pu90Var, pu90 pu90Var2, int i2) {
        this.d = i;
        this.b = pu90Var;
        this.c = pu90Var2;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5456a;
        int i = this.e;
        pu90 pu90Var = this.c;
        int i2 = this.d;
        pu90 pu90Var2 = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                int i3 = (i2 - pu90Var2.b) / 2;
                int i4 = (i2 - pu90Var.b) / 2;
                ou90Var.m(pu90Var2, 0, i3, 0.0f);
                ou90Var.m(pu90Var, i - pu90Var.f27604a, i4, 0.0f);
                break;
            case 1:
                ou90Var.getClass();
                ou90Var.m(pu90Var2, 0, 0, 0.0f);
                ou90Var.m(pu90Var, i2 + i, 0, 0.0f);
                break;
            default:
                ou90Var.getClass();
                if (pu90Var2 != null) {
                    int i5 = (i2 - pu90Var2.b) / 2;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    ou90Var.m(pu90Var2, 0, i5, 0.0f);
                }
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, i, 0, 0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ d4i(pu90 pu90Var, int i, pu90 pu90Var2, int i2) {
        this.b = pu90Var;
        this.d = i;
        this.c = pu90Var2;
        this.e = i2;
    }

    public /* synthetic */ d4i(pu90 pu90Var, pu90 pu90Var2, int i, int i2) {
        this.b = pu90Var;
        this.c = pu90Var2;
        this.d = i;
        this.e = i2;
    }
}
