package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m0i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20955a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ zpl c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int f;

    public /* synthetic */ m0i(mm40 mm40Var, zpl zplVar, Function0 function0, Function2 function2, int i, byte b) {
        this.f20955a = b;
        this.b = mm40Var;
        this.c = zplVar;
        this.d = function0;
        this.e = function2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20955a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                x4d0.w(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                fre0.w(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                unh0.t(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ccq0.q(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ohq0.z(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
