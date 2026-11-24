package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jp2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16880a = 0;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ pu90 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public /* synthetic */ jp2(pu90 pu90Var, int i, int i2, pu90 pu90Var2, int i3, int i4, pu90 pu90Var3, int i5, int i6) {
        this.b = pu90Var;
        this.d = i;
        this.e = i2;
        this.c = pu90Var2;
        this.f = i3;
        this.g = i4;
        this.j = pu90Var3;
        this.h = i5;
        this.i = i6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f16880a;
        int i = this.i;
        Object obj2 = this.j;
        int i2 = this.h;
        int i3 = this.g;
        int i4 = this.f;
        int i5 = this.e;
        int i6 = this.d;
        pu90 pu90Var = this.c;
        pu90 pu90Var2 = this.b;
        switch (b) {
            case 0:
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                ou90Var.g(pu90Var2, i6, i5, 0.0f);
                ou90Var.g(pu90Var, i4, i3, 0.0f);
                ou90Var.g((pu90) obj2, i2, i, 0.0f);
                break;
            default:
                pu90[][] pu90VarArr = (pu90[][]) obj2;
                ou90 ou90Var2 = (ou90) obj;
                ou90Var2.getClass();
                ou90Var2.m(pu90Var2, 0, 0, 0.0f);
                ou90Var2.m(pu90Var, i6, 0, 0.0f);
                for (int i7 = 0; i7 < i5; i7++) {
                    int i8 = ((i2 + i3) * i7) + i4 + i3;
                    ou90Var2.m(pu90VarArr[i7][0], 0, i8, 0.0f);
                    ou90Var2.m(pu90VarArr[i7][1], i6, i8, 0.0f);
                    ou90Var2.m(pu90VarArr[i7][2], i, i8, 0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ jp2(pu90 pu90Var, pu90 pu90Var2, int i, int i2, int i3, int i4, int i5, pu90[][] pu90VarArr, int i6) {
        this.b = pu90Var;
        this.c = pu90Var2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.j = pu90VarArr;
        this.i = i6;
    }
}
