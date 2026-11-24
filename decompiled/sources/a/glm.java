package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class glm implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11498a = 0;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ pu90 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ pu90 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ pu90 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ glm(pu90 pu90Var, int i, pu90 pu90Var2, int i2, int i3, pu90 pu90Var3, int i4, pu90 pu90Var4) {
        this.b = pu90Var;
        this.d = i;
        this.c = pu90Var2;
        this.f = i2;
        this.h = i3;
        this.e = pu90Var3;
        this.i = i4;
        this.g = pu90Var4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11498a;
        int i = this.i;
        int i2 = this.h;
        pu90 pu90Var = this.g;
        int i3 = this.f;
        pu90 pu90Var2 = this.e;
        int i4 = this.d;
        pu90 pu90Var3 = this.c;
        pu90 pu90Var4 = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                if (pu90Var4 != null) {
                    ou90Var.m(pu90Var4, 0, (i4 / 2) - (pu90Var4.b / 2), 0.0f);
                }
                if (pu90Var3 != null) {
                    ou90Var.m(pu90Var3, i3 + i2, (i4 / 2) - (pu90Var3.b / 2), 0.0f);
                }
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, i, (i4 / 2) - (pu90Var2.b / 2), 0.0f);
                }
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, 0, i4 - pu90Var.b, 0.0f);
                }
                break;
            default:
                ou90Var.getClass();
                ou90Var.g(pu90Var4, 0, 0, 0.0f);
                ou90Var.g(pu90Var3, 0, i4, 0.0f);
                ou90Var.g(pu90Var2, 0, i3, 0.0f);
                ou90Var.g(pu90Var, i2, i, 0.0f);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ glm(pu90 pu90Var, pu90 pu90Var2, int i, pu90 pu90Var3, int i2, pu90 pu90Var4, int i3, int i4) {
        this.b = pu90Var;
        this.c = pu90Var2;
        this.d = i;
        this.e = pu90Var3;
        this.f = i2;
        this.g = pu90Var4;
        this.h = i3;
        this.i = i4;
    }
}
