package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45082a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ zw(int i, int i2, mm40 mm40Var, String str, boolean z) {
        this.f45082a = (byte) 5;
        this.b = mm40Var;
        this.d = i;
        this.c = str;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f45082a;
        boolean z = this.e;
        int i = this.d;
        String str = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                vbw0.b(x8x.L(i | 1), (fet) obj, mm40Var, str, z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                xkb.B(x8x.L(i | 1), z ? 1 : 0, (fet) obj, mm40Var, str);
                break;
            case 2:
                ((Integer) obj2).getClass();
                hkb.k(x8x.L(i | 1), z ? 1 : 0, (fet) obj, mm40Var, str);
                break;
            case 3:
                ((Integer) obj2).getClass();
                twm.d(x8x.L(i | 1), (fet) obj, mm40Var, str, z);
                break;
            case 4:
                ((Integer) obj2).getClass();
                sac.G(x8x.L(i | 1), (fet) obj, mm40Var, str, z);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL = x8x.L(7);
                ckb.b(this.d, iL, (fet) obj, this.b, this.c, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                xdx.u(x8x.L(i | 1), z ? 1 : 0, (fet) obj, mm40Var, str);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zw(mm40 mm40Var, String str, int i, int i2, byte b) {
        this.f45082a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ zw(mm40 mm40Var, String str, boolean z, int i, byte b) {
        this.f45082a = b;
        this.b = mm40Var;
        this.c = str;
        this.e = z;
        this.d = i;
    }
}
