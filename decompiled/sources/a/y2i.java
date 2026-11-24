package a;

import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y2i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41905a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ y2i(int i, pu90 pu90Var, int i2, pu90 pu90Var2, pu90 pu90Var3, pu90 pu90Var4, pu90 pu90Var5, int i3, int i4, int i5) {
        this.b = i;
        this.g = pu90Var;
        this.c = i2;
        this.h = pu90Var2;
        this.i = pu90Var3;
        this.j = pu90Var4;
        this.k = pu90Var5;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wvb wvbVar;
        byte b = this.f41905a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        Object obj6 = this.g;
        switch (b) {
            case 0:
                pu90 pu90Var = (pu90) obj6;
                pu90 pu90Var2 = (pu90) obj5;
                pu90 pu90Var3 = (pu90) obj4;
                pu90 pu90Var4 = (pu90) obj3;
                pu90 pu90Var5 = (pu90) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                ou90Var.m(pu90Var, i3, i2, 0.0f);
                int i4 = pu90Var.b;
                Integer numValueOf = i4 != 0 ? Integer.valueOf(i4) : null;
                int i5 = this.f;
                ou90Var.m(pu90Var2, i3, i2 + (numValueOf != null ? numValueOf.intValue() + i5 : 0), 0.0f);
                ah30 ah30Var = new ah30(tx3.z(new pu90[]{pu90Var3, pu90Var4, pu90Var5}));
                int i6 = i - this.e;
                Iterator it = ah30Var.iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((xag0) it).b;
                    if (listIterator.hasPrevious()) {
                        pu90 pu90Var6 = (pu90) listIterator.previous();
                        i6 -= pu90Var6.f27604a;
                        ou90Var.m(pu90Var6, i6, i5, 0.0f);
                    }
                    break;
                }
                break;
            default:
                int[] iArr = (int[]) obj6;
                pu90[] pu90VarArr = (pu90[]) obj5;
                yoq yoqVar = (yoq) obj4;
                k6z k6zVar = (k6z) obj3;
                int[] iArr2 = (int[]) obj2;
                ou90 ou90Var2 = (ou90) obj;
                int i7 = iArr != null ? iArr[i3] : 0;
                for (int i8 = i2; i8 < i; i8++) {
                    pu90 pu90Var7 = pu90VarArr[i8];
                    pu90Var7.getClass();
                    Object objN = pu90Var7.n();
                    mhg0 mhg0Var = objN instanceof mhg0 ? (mhg0) objN : null;
                    if (mhg0Var == null || (wvbVar = mhg0Var.c) == null) {
                        wvbVar = yoqVar.d;
                    }
                    ou90Var2.g(pu90Var7, iArr2[i8 - i2], wvbVar.K(this.e, pu90Var7.d0(), k6zVar, pu90Var7, this.f) + i7, 0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ y2i(int[] iArr, int i, int i2, int i3, pu90[] pu90VarArr, yoq yoqVar, int i4, k6z k6zVar, int i5, int[] iArr2) {
        this.g = iArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.h = pu90VarArr;
        this.i = yoqVar;
        this.e = i4;
        this.j = k6zVar;
        this.f = i5;
        this.k = iArr2;
    }
}
