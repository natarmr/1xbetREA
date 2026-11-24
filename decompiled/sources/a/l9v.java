package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l9v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19675a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ l9v(int i, String str, t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, fav favVar, int i2) {
        this.b = i;
        this.d = str;
        this.e = t33Var;
        this.f = t33Var2;
        this.g = t33Var3;
        this.h = t33Var4;
        this.i = favVar;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19675a;
        int i = this.c;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                aac.C(this.b, (String) obj8, (t33) obj7, (t33) obj6, (t33) obj5, (t33) obj4, (fav) obj3, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                cvm0.b((mm40) obj8, (kz20) obj7, this.b, (mbh0) obj6, (Function1) obj5, (ugd) obj4, (ugd) obj3, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ l9v(mm40 mm40Var, kz20 kz20Var, int i, mbh0 mbh0Var, Function1 function1, ugd ugdVar, ugd ugdVar2, int i2) {
        this.d = mm40Var;
        this.e = kz20Var;
        this.b = i;
        this.f = mbh0Var;
        this.g = function1;
        this.h = ugdVar;
        this.i = ugdVar2;
        this.c = i2;
    }
}
