package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xwk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41613a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xwk(mm40 mm40Var, float f, long j, int i, int i2, byte b) {
        this.f41613a = b;
        this.b = mm40Var;
        this.c = f;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41613a) {
            case 0:
                ((Integer) obj2).getClass();
                jcb.H(this.b, this.c, this.d, (fet) obj, x8x.L(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                jcb.v(this.b, this.c, this.d, (fet) obj, x8x.L(this.e | 1), this.f);
                break;
        }
        return Unit.f46060a;
    }
}
