package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dsl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6616a;
    public final /* synthetic */ py1 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    public /* synthetic */ dsl(py1 py1Var, Function0 function0, Function0 function1, Function0 function2, int i, byte b) {
        this.f6616a = b;
        this.b = py1Var;
        this.c = function0;
        this.d = function1;
        this.e = function2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6616a) {
            case 0:
                ((Integer) obj2).intValue();
                feb.c(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                feb.a(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ieb.a(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                jeb.c(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                jeb.a(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
        }
        return Unit.f46060a;
    }
}
