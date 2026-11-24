package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wv20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39820a = 0;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ pu90 d;
    public final /* synthetic */ pu90 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ wv20(pu90 pu90Var, int i, pu90 pu90Var2, int i2, pu90 pu90Var3, int i3, int i4) {
        this.b = pu90Var;
        this.c = i;
        this.d = pu90Var2;
        this.f = i2;
        this.e = pu90Var3;
        this.g = i3;
        this.h = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39820a;
        int i = this.h;
        int i2 = this.g;
        int i3 = this.f;
        pu90 pu90Var = this.e;
        pu90 pu90Var2 = this.d;
        int i4 = this.c;
        pu90 pu90Var3 = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                ou90Var.m(pu90Var3, 0, i4, 0.0f);
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, 0, i3, 0.0f);
                }
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, i2, i, 0.0f);
                }
                break;
            default:
                ou90Var.getClass();
                if (pu90Var3 != null) {
                    ou90Var.m(pu90Var3, 0, (i - pu90Var3.b) / 2, 0.0f);
                }
                int i5 = (pu90Var3 != null ? pu90Var3.f27604a : 0) + i4;
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, i5, (i - pu90Var2.b) / 2, 0.0f);
                }
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, i3 - i2, (i - pu90Var.b) / 2, 0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ wv20(pu90 pu90Var, int i, pu90 pu90Var2, pu90 pu90Var3, int i2, int i3, int i4) {
        this.b = pu90Var;
        this.c = i;
        this.d = pu90Var2;
        this.e = pu90Var3;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }
}
