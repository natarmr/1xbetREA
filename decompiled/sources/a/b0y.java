package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b0y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1781a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ b0y(mm40 mm40Var, boolean z, String str, Function0 function0, int i) {
        this.f1781a = (byte) 0;
        this.b = mm40Var;
        this.d = z;
        this.c = str;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1781a) {
            case 0:
                ((Integer) obj2).getClass();
                m8x.B(x8x.L(1), (fet) obj, this.b, this.c, this.e, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                i4w0.E(x8x.L(1), (fet) obj, this.b, this.c, this.e, this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                vdx.r(x8x.L(1), (fet) obj, this.b, this.c, this.e, this.d);
                break;
            case 3:
                ((Integer) obj2).getClass();
                xvw.m(x8x.L(1), (fet) obj, this.b, this.c, this.e, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                bww.p(x8x.L(1), (fet) obj, this.b, this.c, this.e, this.d);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ b0y(mm40 mm40Var, String str, boolean z, Function0 function0, int i, byte b) {
        this.f1781a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = z;
        this.e = function0;
    }
}
