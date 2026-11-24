package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tkm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34101a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tkm(mm40 mm40Var, Object obj, Object obj2, int i, int i2, byte b) {
        this.f34101a = b;
        this.b = mm40Var;
        this.e = obj;
        this.f = obj2;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34101a) {
            case 0:
                ((Integer) obj2).getClass();
                vtb.v(this.b, (Function1) this.e, (vc50) this.f, (fet) obj, x8x.L(this.c | 1), this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                pzb.n(this.b, (String) this.e, (y3d) this.f, (fet) obj, x8x.L(this.c | 1), this.d);
                break;
        }
        return Unit.f46060a;
    }
}
