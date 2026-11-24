package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b330 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1883a = 0;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ pu90 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ pu90 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ pu90 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ b330(pu90 pu90Var, int i, int i2, pu90 pu90Var2, pu90 pu90Var3, int i3, int i4, pu90 pu90Var4, int i5) {
        this.b = pu90Var;
        this.c = i;
        this.e = i2;
        this.d = pu90Var2;
        this.f = pu90Var3;
        this.g = i3;
        this.i = i4;
        this.h = pu90Var4;
        this.j = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1883a;
        int i = this.j;
        int i2 = this.i;
        pu90 pu90Var = this.h;
        int i3 = this.g;
        pu90 pu90Var2 = this.f;
        int i4 = this.e;
        pu90 pu90Var3 = this.d;
        int i5 = this.c;
        pu90 pu90Var4 = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                if (pu90Var4 != null) {
                    ou90Var.m(pu90Var4, 0, i4 + i5, 0.0f);
                }
                if (pu90Var3 != null) {
                    ou90Var.m(pu90Var3, 0, ((i3 - i2) - i) - pu90Var3.b, 0.0f);
                }
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, 0, i3 - i2, 0.0f);
                }
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, 0, i5, 0.0f);
                }
                break;
            default:
                ou90Var.getClass();
                if (pu90Var4 != null) {
                    ou90Var.m(pu90Var4, 0, i5, 0.0f);
                }
                if (pu90Var3 != null) {
                    ou90Var.m(pu90Var3, 0, i4 + i5, 0.0f);
                }
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, 0, i3 + i4 + i5, 0.0f);
                }
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, i2, i, 0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ b330(pu90 pu90Var, int i, pu90 pu90Var2, int i2, pu90 pu90Var3, int i3, pu90 pu90Var4, int i4, int i5) {
        this.b = pu90Var;
        this.c = i;
        this.d = pu90Var2;
        this.e = i2;
        this.f = pu90Var3;
        this.g = i3;
        this.h = pu90Var4;
        this.i = i4;
        this.j = i5;
    }
}
