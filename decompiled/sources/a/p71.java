package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p71 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26482a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ ugd d;

    public /* synthetic */ p71(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, int i, byte b) {
        this.f26482a = b;
        this.b = mm40Var;
        this.c = ugdVar;
        this.d = ugdVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26482a;
        ugd ugdVar = this.d;
        ugd ugdVar2 = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                cjx.s(x8x.L(433), ugdVar2, ugdVar, fetVar, mm40Var);
                break;
            case 1:
                bsr0.a(x8x.L(439), ugdVar2, ugdVar, fetVar, mm40Var);
                break;
            case 2:
                y860.h(x8x.L(433), ugdVar2, ugdVar, fetVar, mm40Var);
                break;
            case 3:
                y0x0.h(x8x.L(3457), ugdVar2, ugdVar, fetVar, mm40Var);
                break;
            case 4:
                qcc.s(x8x.L(433), ugdVar2, ugdVar, fetVar, mm40Var);
                break;
            case 5:
                q5x.w(x8x.L(439), ugdVar2, ugdVar, fetVar, mm40Var);
                break;
            default:
                ltt0.k(x8x.L(439), ugdVar2, ugdVar, fetVar, mm40Var);
                break;
        }
        return Unit.f46060a;
    }
}
