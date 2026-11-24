package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lno0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20357a = 0;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ float c;
    public final /* synthetic */ zyn d;

    public /* synthetic */ lno0(float f, zyn zynVar, ugd ugdVar) {
        this.c = f;
        this.d = zynVar;
        this.b = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20357a;
        zyn zynVar = this.d;
        float f = this.c;
        ugd ugdVar = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarG = o7k0.g(lgb.K(jm40.b), 0.0f, f, 1);
                    boolean zG = fetVar.g(zynVar);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new mno0(zynVar);
                        fetVar.o0(objP);
                    }
                    y0x0.B(mm40VarG, (mno0) objP, ugdVar, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                num.getClass();
                y0x0.l(ugdVar, f, zynVar, fetVar, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ lno0(ugd ugdVar, float f, zyn zynVar, int i) {
        this.b = ugdVar;
        this.c = f;
        this.d = zynVar;
    }
}
