package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jw6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17236a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a8q0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ int l;

    public /* synthetic */ jw6(mm40 mm40Var, a8q0 a8q0Var, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Function1 function1, Function1 function2, int i, byte b) {
        this.f17236a = b;
        this.b = mm40Var;
        this.c = a8q0Var;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = function1;
        this.k = function2;
        this.l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17236a) {
            case 0:
                ((Integer) obj2).getClass();
                rsr0.A(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (fet) obj, x8x.L(this.l | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                cwr0.s(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (fet) obj, x8x.L(this.l | 1));
                break;
        }
        return Unit.f46060a;
    }
}
