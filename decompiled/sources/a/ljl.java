package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ljl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20157a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ akl c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ljl(mm40 mm40Var, akl aklVar, Function1 function1, int i, byte b) {
        this.f20157a = b;
        this.b = mm40Var;
        this.c = aklVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20157a;
        int i = this.e;
        Function1 function1 = this.d;
        akl aklVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                jeb.k(mm40Var, aklVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 1:
                uc9.l(mm40Var, aklVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 2:
                ny9.j(mm40Var, aklVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 3:
                p8a.o(mm40Var, aklVar, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                q8a.g(mm40Var, aklVar, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
