package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vy0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38225a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a4x d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ vy0(mm40 mm40Var, a4x a4xVar, boolean z, Function1 function1, int i, byte b) {
        this.f38225a = b;
        this.b = mm40Var;
        this.d = a4xVar;
        this.c = z;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38225a) {
            case 0:
                ((Integer) obj2).getClass();
                saj.a(x8x.L(this.f | 1), (fet) obj, this.d, this.b, this.e, this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                lgb.e(x8x.L(this.f | 1), (fet) obj, this.d, this.b, this.e, this.c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                vfc.y(x8x.L(this.f | 1), (fet) obj, this.d, this.b, this.e, this.c);
                break;
            case 3:
                ((Integer) obj2).getClass();
                jar0.s(x8x.L(this.f | 1), (fet) obj, this.d, this.b, this.e, this.c);
                break;
            case 4:
                ((Integer) obj2).getClass();
                wha0.m(x8x.L(this.f | 1), (fet) obj, this.d, this.b, this.e, this.c);
                break;
            case 5:
                ((Integer) obj2).getClass();
                unh0.g0(x8x.L(this.f | 1), (fet) obj, this.d, this.b, this.e, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                ohq0.U(x8x.L(this.f | 1), (fet) obj, this.d, this.b, this.e, this.c);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ vy0(mm40 mm40Var, boolean z, a4x a4xVar, Function1 function1, int i, byte b) {
        this.f38225a = b;
        this.b = mm40Var;
        this.c = z;
        this.d = a4xVar;
        this.e = function1;
        this.f = i;
    }
}
