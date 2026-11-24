package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class z43 extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43749a;
    public final /* synthetic */ a53 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z43(a53 a53Var, byte b) {
        super(1);
        this.f43749a = b;
        this.b = a53Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        char c;
        byte b = this.f43749a;
        int i = 0;
        a53 a53Var = this.b;
        char c2 = ' ';
        switch (b) {
            case 0:
                ou90 ou90Var = (ou90) obj;
                pu90[] pu90VarArr = a53Var.c;
                pu90VarArr.getClass();
                int i2 = a53Var.e;
                int i3 = a53Var.g;
                int length = pu90VarArr.length;
                while (i < length) {
                    pu90 pu90Var = pu90VarArr[i];
                    if (pu90Var != null) {
                        long jA = a53Var.f250a.b.a((((long) pu90Var.f27604a) << 32) | (((long) pu90Var.b) & 4294967295L), (((long) i2) << 32) | (((long) i3) & 4294967295L), k6z.f17794a);
                        ou90Var.g(pu90Var, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
                    }
                    i++;
                }
                break;
            default:
                ou90 ou90Var2 = (ou90) obj;
                pu90[] pu90VarArr2 = a53Var.b;
                pu90VarArr2.getClass();
                int i4 = a53Var.d;
                int i5 = a53Var.f;
                int length2 = pu90VarArr2.length;
                while (i < length2) {
                    pu90 pu90Var2 = pu90VarArr2[i];
                    if (pu90Var2 != null) {
                        c = c2;
                        long jA2 = a53Var.f250a.b.a((((long) pu90Var2.f27604a) << c2) | (((long) pu90Var2.b) & 4294967295L), (((long) i4) << c) | (((long) i5) & 4294967295L), k6z.f17794a);
                        ou90Var2.g(pu90Var2, (int) (jA2 >> c), (int) (jA2 & 4294967295L), 0.0f);
                    } else {
                        c = c2;
                    }
                    i++;
                    c2 = c;
                }
                break;
        }
        return Unit.f46060a;
    }
}
