package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fb8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9244a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ugd c;

    public /* synthetic */ fb8(ugd ugdVar, mm40 mm40Var, byte b) {
        this.f9244a = b;
        this.c = ugdVar;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9244a;
        y5d y5dVar = y5d.f42040a;
        ugd ugdVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                dj8.j(mm40Var, ugdVar, fetVar, x8x.L(49));
                break;
            case 1:
                num.getClass();
                nia0.o(mm40Var, ugdVar, fetVar, x8x.L(49));
                break;
            case 2:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ugdVar.j(y5dVar, mm40Var, fetVar, 48);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                int iIntValue2 = num.intValue();
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ugdVar.j(y5dVar, mm40Var, fetVar, 48);
                } else {
                    fetVar.X();
                }
                break;
            case 4:
                num.getClass();
                jd8.v(mm40Var, ugdVar, fetVar, x8x.L(49));
                break;
            case 5:
                num.getClass();
                ahb.n(mm40Var, ugdVar, fetVar, x8x.L(385));
                break;
            case 6:
                num.getClass();
                v3c.v(mm40Var, ugdVar, fetVar, x8x.L(385));
                break;
            case 7:
                num.getClass();
                q8x.h(mm40Var, ugdVar, fetVar, x8x.L(49));
                break;
            case 8:
                num.getClass();
                ydx.t(mm40Var, ugdVar, fetVar, x8x.L(49));
                break;
            case 9:
                num.getClass();
                yqm0.b(mm40Var, ugdVar, fetVar, x8x.L(49));
                break;
            default:
                num.getClass();
                msm0.b(mm40Var, ugdVar, fetVar, x8x.L(49));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ fb8(mm40 mm40Var, ugd ugdVar, int i, byte b) {
        this.f9244a = b;
        this.b = mm40Var;
        this.c = ugdVar;
    }
}
