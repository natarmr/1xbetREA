package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z6y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43892a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ int j;

    public /* synthetic */ z6y(mm40 mm40Var, l7m0 l7m0Var, String str, String str2, boolean z, boolean z2, Function1 function1, Function1 function2, int i, byte b) {
        this.f43892a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = z2;
        this.h = function1;
        this.i = function2;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43892a) {
            case 0:
                ((Integer) obj2).getClass();
                x9x.e(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, x8x.L(this.j | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                kcx.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, x8x.L(this.j | 1));
                break;
        }
        return Unit.f46060a;
    }
}
