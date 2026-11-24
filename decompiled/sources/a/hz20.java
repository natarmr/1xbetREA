package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hz20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13887a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ kz20 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ int f;

    public /* synthetic */ hz20(mm40 mm40Var, kz20 kz20Var, Function1 function1, ugd ugdVar, int i, byte b) {
        this.f13887a = b;
        this.b = mm40Var;
        this.c = kz20Var;
        this.d = function1;
        this.e = ugdVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13887a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                e9x.j(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                k9x.e(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                t9x.h(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                w9x.d(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
