package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e7h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7327a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e7h(mm40 mm40Var, String str, int i, int i2, int i3) {
        this.f7327a = (byte) 3;
        this.b = mm40Var;
        this.e = str;
        this.c = i;
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7327a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(this.c | 1);
                wzb.j(this.b, (hh80) this.e, (fet) obj, iL, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(this.c | 1);
                kpb.j(this.b, (dkm) this.e, (fet) obj, iL2, this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(this.c | 1);
                x2x.q(this.b, (xdr) this.e, (fet) obj, iL3, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1);
                rsm0.i(this.b, (String) this.e, this.c, (fet) obj, iL4, this.d);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e7h(mm40 mm40Var, Object obj, int i, int i2, byte b) {
        this.f7327a = b;
        this.b = mm40Var;
        this.e = obj;
        this.c = i;
        this.d = i2;
    }
}
