package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yhq implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42650a;
    public final /* synthetic */ jjl b;
    public final /* synthetic */ gjl c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    public /* synthetic */ yhq(jjl jjlVar, gjl gjlVar, Function0 function0, Function0 function1, Function0 function2, int i, byte b) {
        this.f42650a = b;
        this.b = jjlVar;
        this.c = gjlVar;
        this.d = function0;
        this.e = function1;
        this.f = function2;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42650a) {
            case 0:
                ((Integer) obj2).intValue();
                vdb.F(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                q5x.s(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                xdx.m(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                n7x.m(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                xsm0.g(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
        }
        return Unit.f46060a;
    }
}
