package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w1m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38408a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    public /* synthetic */ w1m(int i, long j, mm40 mm40Var) {
        this.f38408a = (byte) 4;
        this.d = j;
        this.b = mm40Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38408a) {
            case 0:
                ((Integer) obj2).getClass();
                lmc.l(x8x.L(this.c | 1), this.d, (fet) obj, this.b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                hew0.f(this.c, iL, this.d, (fet) obj, this.b);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                v3c.G(this.c, iL2, this.d, (fet) obj, this.b);
                break;
            case 3:
                ((Integer) obj2).getClass();
                vdx.e(x8x.L(this.c | 1), this.d, (fet) obj, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                l8x.h(x8x.L(this.c | 1), this.d, (fet) obj, this.b);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ w1m(mm40 mm40Var, int i, long j, int i2, byte b) {
        this.f38408a = b;
        this.b = mm40Var;
        this.c = i;
        this.d = j;
    }

    public /* synthetic */ w1m(mm40 mm40Var, long j, int i, byte b) {
        this.f38408a = b;
        this.b = mm40Var;
        this.d = j;
        this.c = i;
    }
}
