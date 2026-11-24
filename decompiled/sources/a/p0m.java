package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p0m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26158a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ p0m(o0x o0xVar, long j, ut90 ut90Var, tt90 tt90Var, long j2, int i) {
        this.e = o0xVar;
        this.b = j;
        this.f = ut90Var;
        this.g = tt90Var;
        this.c = j2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26158a;
        int i = this.d;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                tdc.z((mm40) obj5, (tpe) obj4, (ope) obj3, this.b, this.c, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                ibc.E((o0x) obj5, this.b, (ut90) obj4, (tt90) obj3, this.c, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                r8x.p((mm40) obj5, this.b, this.c, (Function0) obj4, (ugd) obj3, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ p0m(mm40 mm40Var, long j, long j2, Function0 function0, ugd ugdVar, int i) {
        this.e = mm40Var;
        this.b = j;
        this.c = j2;
        this.f = function0;
        this.g = ugdVar;
        this.d = i;
    }

    public /* synthetic */ p0m(mm40 mm40Var, tpe tpeVar, ope opeVar, long j, long j2, int i) {
        this.e = mm40Var;
        this.f = tpeVar;
        this.g = opeVar;
        this.b = j;
        this.c = j2;
        this.d = i;
    }
}
