package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rnr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30802a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ ugd d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ ugd f;
    public final /* synthetic */ int g;

    public /* synthetic */ rnr(mm40 mm40Var, Function0 function0, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, int i, byte b) {
        this.f30802a = b;
        this.b = mm40Var;
        this.c = function0;
        this.d = ugdVar;
        this.e = ugdVar2;
        this.f = ugdVar3;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30802a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                fre0.C(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                vcc.n(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
