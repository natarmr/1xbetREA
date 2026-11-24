package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nt8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24084a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ nt8(mm40 mm40Var, List list, int i, Function1 function1, int i2) {
        this.f24084a = (byte) 0;
        this.b = mm40Var;
        this.c = list;
        this.e = i;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24084a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                aad.g(this.b, this.c, this.e, this.d, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                y860.o(x8x.L(this.e | 1), (fet) obj, this.b, this.c, this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                y860.o(x8x.L(this.e | 1), (fet) obj, this.b, this.c, this.d);
                break;
            case 3:
                ((Integer) obj2).getClass();
                mbc.B(x8x.L(this.e | 1), (fet) obj, this.b, this.c, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                bdx.k(x8x.L(this.e | 1), (fet) obj, this.b, this.c, this.d);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ nt8(mm40 mm40Var, List list, Function1 function1, int i, byte b) {
        this.f24084a = b;
        this.b = mm40Var;
        this.c = list;
        this.d = function1;
        this.e = i;
    }
}
