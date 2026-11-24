package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class clb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4549a = 2;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ clb(qa00 qa00Var, float f, float f2, Function1 function1, int i) {
        this.e = qa00Var;
        this.b = f;
        this.c = f2;
        this.f = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4549a;
        Object obj3 = this.f;
        int i = this.d;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ntr.j((mm40) obj4, (flb) obj3, this.b, this.c, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                g8x.s((qa00) obj4, this.b, this.c, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            default:
                c5n0 c5n0Var = (c5n0) obj4;
                ugd ugdVar = (ugd) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    ugdVar.F(s5x0.u(0.0f, Math.max(0.0f, c5n0Var.r0(i) - (this.b * this.c)), 0.0f, 0.0f, 13), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ clb(mm40 mm40Var, flb flbVar, float f, float f2, int i) {
        this.e = mm40Var;
        this.f = flbVar;
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    public /* synthetic */ clb(c5n0 c5n0Var, int i, float f, float f2, ugd ugdVar) {
        this.e = c5n0Var;
        this.d = i;
        this.b = f;
        this.c = f2;
        this.f = ugdVar;
    }
}
