package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n0z implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22723a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ n0z(mdm mdmVar, h1z h1zVar, int i, boolean z, Function1 function1, Function1 function2, Function0 function0, int i2) {
        this.g = mdmVar;
        this.h = h1zVar;
        this.c = i;
        this.b = z;
        this.d = function1;
        this.i = function2;
        this.e = function0;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22723a;
        int i = this.f;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                azw.x((mdm) obj5, (h1z) obj4, this.c, this.b, this.d, (Function1) obj3, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                g7x.r((mm40) obj5, (l7m0) obj4, this.b, (String) obj3, this.c, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ n0z(mm40 mm40Var, l7m0 l7m0Var, boolean z, String str, int i, Function1 function1, Function0 function0, int i2) {
        this.g = mm40Var;
        this.h = l7m0Var;
        this.b = z;
        this.i = str;
        this.c = i;
        this.d = function1;
        this.e = function0;
        this.f = i2;
    }
}
