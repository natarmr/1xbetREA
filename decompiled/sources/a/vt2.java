package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vt2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37981a;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ float e;

    public /* synthetic */ vt2(ugd ugdVar, l7m0 l7m0Var, l7m0 l7m0Var2, float f, byte b) {
        this.f37981a = b;
        this.b = ugdVar;
        this.c = l7m0Var;
        this.d = l7m0Var2;
        this.e = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37981a;
        float f = this.e;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.b.O(this.c, this.d, new ycl(f), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    this.b.O(this.c, this.d, new ycl(f), fetVar2, 54);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    this.b.O(this.c, this.d, new ycl(f), fetVar3, 54);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
