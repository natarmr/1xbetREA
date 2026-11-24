package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zml implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44631a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ uzh c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ zml(mm40 mm40Var, uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, int i, byte b) {
        this.f44631a = b;
        this.b = mm40Var;
        this.c = uzhVar;
        this.d = function0;
        this.e = function1;
        this.f = function2;
        this.g = function3;
        this.h = function4;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44631a;
        int i = this.i;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                eeq.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                kkb.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ntr.e(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                mrv.e(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
