package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gbn0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11023a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ short g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gbn0(fqh0 fqh0Var, boolean z, boolean z2, Function1 function1, mm40 mm40Var, int i) {
        this.f11023a = (byte) 2;
        this.c = fqh0Var;
        this.d = z;
        this.e = z2;
        this.f = function1;
        this.b = mm40Var;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11023a) {
            case 0:
                ((Integer) obj2).getClass();
                ccq0.L(this.b, (a4x) this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                bsr0.L(this.b, (a4x) this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                r8x.w((fqh0) this.c, this.d, this.e, this.f, this.b, (fet) obj, x8x.L(this.g | 1));
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gbn0(mm40 mm40Var, a4x a4xVar, boolean z, boolean z2, Function1 function1, int i, byte b) {
        this.f11023a = b;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = z;
        this.e = z2;
        this.f = function1;
        this.g = i;
    }
}
