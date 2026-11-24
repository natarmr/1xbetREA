package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v1m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36639a;
    public final /* synthetic */ String b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ v1m(mm40 mm40Var, l7m0 l7m0Var, long j, String str, int i, int i2) {
        this.f36639a = (byte) 0;
        this.c = mm40Var;
        this.g = l7m0Var;
        this.d = j;
        this.b = str;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36639a) {
            case 0:
                ((Integer) obj2).getClass();
                plc.j(this.c, (l7m0) this.g, this.d, this.b, (fet) obj, x8x.L(this.e | 1), this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                dww.c((pm80) this.g, this.b, this.c, this.d, (fet) obj, x8x.L(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                dww.b((r2x) this.g, this.b, this.c, this.d, (fet) obj, x8x.L(this.e | 1), this.f);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ v1m(Object obj, String str, mm40 mm40Var, long j, int i, int i2, byte b) {
        this.f36639a = b;
        this.g = obj;
        this.b = str;
        this.c = mm40Var;
        this.d = j;
        this.e = i;
        this.f = i2;
    }
}
