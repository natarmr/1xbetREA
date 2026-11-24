package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ymh0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42888a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ i4 c;
    public final /* synthetic */ hjm d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ezj f;
    public final /* synthetic */ gy40 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Function0 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ int l;

    public /* synthetic */ ymh0(mm40 mm40Var, i4 i4Var, hjm hjmVar, float f, ezj ezjVar, gy40 gy40Var, Function2 function2, Function0 function0, Function0 function1, Function0 function3, int i, byte b) {
        this.f42888a = b;
        this.b = mm40Var;
        this.c = i4Var;
        this.d = hjmVar;
        this.e = f;
        this.f = ezjVar;
        this.g = gy40Var;
        this.h = function2;
        this.i = function0;
        this.j = function1;
        this.k = function3;
        this.l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42888a;
        int i = this.l;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                q7x.o(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                u7x.n(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
