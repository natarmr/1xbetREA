package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gu60 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11914a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gu60(mm40 mm40Var, ugd ugdVar, int i, int i2, byte b) {
        this.f11914a = b;
        this.b = mm40Var;
        this.c = ugdVar;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11914a;
        boolean z = this.e;
        int i = this.d;
        ugd ugdVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                jiq0.i(mm40Var, ugdVar, fetVar, x8x.L(i | 1), z ? 1 : 0);
                break;
            case 1:
                g1x.l(mm40Var, ugdVar, fetVar, x8x.L(i | 1), z ? 1 : 0);
                break;
            default:
                btm0.k(mm40Var, ugdVar, fetVar, x8x.L(i | 1), z ? 1 : 0);
                break;
        }
        return Unit.f46060a;
    }
}
