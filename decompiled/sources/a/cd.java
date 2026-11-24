package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4135a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ cd(mm40 mm40Var, Function0 function0, Function0 function1, boolean z, boolean z2, int i) {
        this.b = mm40Var;
        this.e = function0;
        this.f = function1;
        this.c = z;
        this.d = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4135a) {
            case 0:
                ((Integer) obj2).getClass();
                i120.a(x8x.L(1), (fet) obj, this.b, this.e, this.f, this.c, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                l8x.Q(x8x.L(7), (fet) obj, this.b, this.e, this.f, this.c, this.d);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cd(mm40 mm40Var, boolean z, boolean z2, Function0 function0, Function0 function1, int i) {
        this.b = mm40Var;
        this.c = z;
        this.d = z2;
        this.e = function0;
        this.f = function1;
    }
}
