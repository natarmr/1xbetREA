package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hbd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12764a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ wdr h;

    public /* synthetic */ hbd(mm40 mm40Var, pyp pypVar, l7m0 l7m0Var, float f, float f2, Function0 function0, int i) {
        this.b = mm40Var;
        this.f = pypVar;
        this.g = l7m0Var;
        this.c = f;
        this.d = f2;
        this.h = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f12764a;
        int i = this.e;
        wdr wdrVar = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                mm40 mm40Var = this.b;
                float f = this.c;
                float f2 = this.d;
                bkb.d(mm40Var, (ua00) obj4, f, f2, (Function1) obj3, (Function1) wdrVar, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                mm40 mm40Var2 = this.b;
                float f3 = this.c;
                float f4 = this.d;
                u1c.n(mm40Var2, (pyp) obj4, (l7m0) obj3, f3, f4, (Function0) wdrVar, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ hbd(mm40 mm40Var, ua00 ua00Var, float f, float f2, Function1 function1, Function1 function2, int i) {
        this.b = mm40Var;
        this.f = ua00Var;
        this.c = f;
        this.d = f2;
        this.g = function1;
        this.h = function2;
        this.e = i;
    }
}
