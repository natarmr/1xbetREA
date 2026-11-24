package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class khl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18299a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ ugd j;
    public final /* synthetic */ int k;

    public /* synthetic */ khl0(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, long j, long j2, long j3, Function0 function0, Function0 function1, ugd ugdVar, int i, byte b) {
        this.f18299a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = l7m0Var2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = function0;
        this.i = function1;
        this.j = ugdVar;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18299a;
        int i = this.k;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                h8x.e(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                l8x.o(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                m8x.i(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }
}
