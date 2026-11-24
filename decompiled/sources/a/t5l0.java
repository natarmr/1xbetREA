package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t5l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33374a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ t5l0(boolean z, String str, long j, int i, byte b) {
        this.f33374a = b;
        this.b = z;
        this.c = str;
        this.d = j;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33374a) {
            case 0:
                ((Integer) obj2).intValue();
                x9x.v(x8x.L(this.e | 1), this.d, (fet) obj, this.c, this.b);
                break;
            case 1:
                ((Integer) obj2).intValue();
                kcx.q(x8x.L(this.e | 1), this.d, (fet) obj, this.c, this.b);
                break;
            case 2:
                ((Integer) obj2).intValue();
                bdx.F(x8x.L(this.e | 1), this.d, (fet) obj, this.c, this.b);
                break;
            case 3:
                ((Integer) obj2).intValue();
                idx.n(x8x.L(this.e | 1), this.d, (fet) obj, this.c, this.b);
                break;
            default:
                ((Integer) obj2).intValue();
                vdx.x(x8x.L(this.e | 1), this.d, (fet) obj, this.c, this.b);
                break;
        }
        return Unit.f46060a;
    }
}
