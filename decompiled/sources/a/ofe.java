package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ofe implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25163a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ofe(u1m u1mVar, ope opeVar, int i, mm40 mm40Var, int i2, int i3) {
        this.f = u1mVar;
        this.g = opeVar;
        this.b = i;
        this.c = mm40Var;
        this.d = i2;
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25163a;
        int i = this.d;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                mm40 mm40Var = this.c;
                gkb.c((a4x) obj4, mm40Var, (Function1) obj3, this.b, (fet) obj, iL, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                l8x.g((u1m) obj4, (ope) obj3, this.b, this.c, (fet) obj, x8x.L(i | 1), this.e);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ofe(a4x a4xVar, mm40 mm40Var, Function1 function1, int i, int i2, int i3) {
        this.f = a4xVar;
        this.c = mm40Var;
        this.g = function1;
        this.b = i;
        this.d = i2;
        this.e = i3;
    }
}
