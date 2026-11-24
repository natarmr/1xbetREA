package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rfo implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30398a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ nfo c;
    public final /* synthetic */ rim d;
    public final /* synthetic */ v3n e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;

    public /* synthetic */ rfo(mm40 mm40Var, nfo nfoVar, rim rimVar, v3n v3nVar, Function1 function1, int i, byte b) {
        this.f30398a = b;
        this.b = mm40Var;
        this.c = nfoVar;
        this.d = rimVar;
        this.e = v3nVar;
        this.f = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30398a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                mbc.u(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                mbc.z(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                mbc.I(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                obc.u(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
