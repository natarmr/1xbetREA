package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gf4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11189a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ ugd d;
    public final /* synthetic */ int e;

    public /* synthetic */ gf4(ugd ugdVar, ugd ugdVar2, mm40 mm40Var, int i) {
        this.f11189a = (byte) 2;
        this.c = ugdVar;
        this.d = ugdVar2;
        this.b = mm40Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11189a;
        int i = this.e;
        mm40 mm40Var = this.b;
        ugd ugdVar = this.d;
        ugd ugdVar2 = this.c;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                j120.f(x8x.L(i | 1), ugdVar2, ugdVar, fetVar, mm40Var);
                break;
            case 1:
                ieb.w(x8x.L(i | 1), ugdVar2, ugdVar, fetVar, mm40Var);
                break;
            default:
                o5n0.l(x8x.L(i | 1), ugdVar2, ugdVar, fetVar, mm40Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ gf4(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, int i, byte b) {
        this.f11189a = b;
        this.b = mm40Var;
        this.c = ugdVar;
        this.d = ugdVar2;
        this.e = i;
    }
}
