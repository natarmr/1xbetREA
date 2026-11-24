package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cka implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4495a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ ugd d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ ugd f;
    public final /* synthetic */ int g;

    public /* synthetic */ cka(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, int i, byte b) {
        this.f4495a = b;
        this.b = mm40Var;
        this.c = ugdVar;
        this.d = ugdVar2;
        this.e = ugdVar3;
        this.f = ugdVar4;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4495a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                fka.b(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                z1x.f(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                d7x.h(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
