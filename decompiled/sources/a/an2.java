package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class an2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1130a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ int f;

    public /* synthetic */ an2(mm40 mm40Var, boolean z, Function1 function1, ugd ugdVar, int i, byte b) {
        this.f1130a = b;
        this.b = mm40Var;
        this.c = z;
        this.d = function1;
        this.e = ugdVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1130a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                nnw0.u(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                tke.G(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                x8f.I(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                kc5.t0(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                hp4.q(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                dj8.J(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                jd8.L(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                j47.f0(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                kc5.u0(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                xf0.u(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
