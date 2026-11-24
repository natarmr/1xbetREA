package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mdf implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21593a;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ pu90 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ pu90 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ mdf(pu90 pu90Var, pu90 pu90Var2, int i, int i2, pu90 pu90Var3, int i3, int i4, int i5) {
        this.f21593a = (byte) 2;
        this.b = pu90Var;
        this.d = pu90Var2;
        this.c = i;
        this.e = i2;
        this.g = pu90Var3;
        this.f = i3;
        this.h = i4;
        this.i = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f21593a;
        int i = this.i;
        int i2 = this.h;
        int i3 = this.f;
        pu90 pu90Var = this.g;
        int i4 = this.e;
        int i5 = this.c;
        pu90 pu90Var2 = this.d;
        pu90 pu90Var3 = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                ou90Var.m(pu90Var3, 0, i5, 0.0f);
                ou90Var.m(pu90Var2, pu90Var3.e0() + i4, i3, 0.0f);
                ou90Var.m(pu90Var, i2 - pu90Var.e0(), i, 0.0f);
                break;
            case 1:
                ou90Var.getClass();
                ou90Var.m(pu90Var3, 0, i5, 0.0f);
                ou90Var.m(pu90Var2, pu90Var3.e0() + i4, i3, 0.0f);
                ou90Var.m(pu90Var, i2 - pu90Var.e0(), i, 0.0f);
                break;
            default:
                ou90Var.getClass();
                if (pu90Var3 != null) {
                    ou90Var.m(pu90Var3, 0, 0, 0.0f);
                }
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, (i5 / 2) - (pu90Var2.f27604a / 2), i4, 0.0f);
                }
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, (i5 / 2) - (i3 / 2), ((i2 / 2) + i4) - (i / 2), 0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ mdf(pu90 pu90Var, int i, pu90 pu90Var2, int i2, int i3, pu90 pu90Var3, int i4, int i5, byte b) {
        this.f21593a = b;
        this.b = pu90Var;
        this.c = i;
        this.d = pu90Var2;
        this.e = i2;
        this.f = i3;
        this.g = pu90Var3;
        this.h = i4;
        this.i = i5;
    }
}
