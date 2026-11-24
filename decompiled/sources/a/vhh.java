package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vhh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37429a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vhh(long j, long j2, ugd ugdVar, int i) {
        this.b = j;
        this.c = j2;
        this.e = ugdVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37429a;
        int i = this.d;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                yhh.c(this.b, this.c, (ugd) obj3, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                atm0.a((mm40) obj3, this.b, this.c, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ vhh(mm40 mm40Var, long j, long j2, int i) {
        this.e = mm40Var;
        this.b = j;
        this.c = j2;
        this.d = i;
    }
}
