package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e5m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7240a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ e5m(mm40 mm40Var, int i, String str, long j, int i2) {
        this.f7240a = (byte) 3;
        this.b = mm40Var;
        this.e = i;
        this.c = str;
        this.d = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7240a;
        int i = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                thb.o(x8x.L(i | 1), this.d, (fet) obj, this.b, this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                hlm.g(x8x.L(i | 1), this.d, (fet) obj, this.b, this.c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                cjx.I(x8x.L(i | 1), this.d, (fet) obj, this.b, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                hfm0.k(this.e, iL, this.d, (fet) obj, this.b, this.c);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ e5m(byte b, int i, long j, mm40 mm40Var, String str) {
        this.f7240a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = j;
        this.e = i;
    }
}
