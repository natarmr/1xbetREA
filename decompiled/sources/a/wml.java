package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wml implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39412a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ uzh c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ int j;

    public /* synthetic */ wml(mm40 mm40Var, uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, int i, byte b) {
        this.f39412a = b;
        this.b = mm40Var;
        this.c = uzhVar;
        this.d = function0;
        this.e = function1;
        this.f = function2;
        this.g = function3;
        this.h = function4;
        this.i = function5;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39412a;
        int i = this.j;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                eeq.u(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                kkb.l(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                xkb.l(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ntr.w(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                mrv.A(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
