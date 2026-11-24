package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qo50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29057a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ w2d c;
    public final /* synthetic */ ugd d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ int f;

    public /* synthetic */ qo50(mm40 mm40Var, w2d w2dVar, ugd ugdVar, ugd ugdVar2, int i, byte b) {
        this.f29057a = b;
        this.b = mm40Var;
        this.c = w2dVar;
        this.d = ugdVar;
        this.e = ugdVar2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29057a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                lv00.s(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                m2x.c(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
