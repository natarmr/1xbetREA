package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vty implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38028a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vty(int i, int i2, mm40 mm40Var, Function0 function0) {
        this.e = function0;
        this.b = mm40Var;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38028a;
        byte b2 = this.d;
        int i = this.c;
        mm40 mm40Var = this.b;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                vdx.f(mm40Var, (foh) obj3, b2, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                x1x.l(iL, b2, (fet) obj, mm40Var, (Function0) obj3);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vty(mm40 mm40Var, foh fohVar, int i, int i2) {
        this.b = mm40Var;
        this.e = fohVar;
        this.d = i;
        this.c = i2;
    }
}
