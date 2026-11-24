package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i5n0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14201a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Enum g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i5n0(mm40 mm40Var, String str, Enum r3, long j, int i, int i2, byte b) {
        this.f14201a = b;
        this.b = mm40Var;
        this.c = str;
        this.g = r3;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14201a;
        byte b2 = this.e;
        Enum r2 = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(b2 | 1);
                mm40 mm40Var = this.b;
                String str = this.c;
                j5n0.d(mm40Var, str, (ux3) r2, this.d, (fet) obj, iL, this.f ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(b2 | 1);
                mm40 mm40Var2 = this.b;
                String str2 = this.c;
                k5n0.a(mm40Var2, str2, (vx3) r2, this.d, (fet) obj, iL2, this.f ? 1 : 0);
                break;
        }
        return Unit.f46060a;
    }
}
