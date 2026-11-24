package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g6b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10754a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ w6b c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ ugd f;
    public final /* synthetic */ int g;

    public /* synthetic */ g6b(mm40 mm40Var, w6b w6bVar, xcz xczVar, Function1 function1, ugd ugdVar, int i, byte b) {
        this.f10754a = b;
        this.b = mm40Var;
        this.c = w6bVar;
        this.d = xczVar;
        this.e = function1;
        this.f = ugdVar;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10754a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                epv0.j(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                i4w0.n(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                vbw0.l(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                hew0.g(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
