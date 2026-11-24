package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ium implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15403a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ium(int i, int i2, mm40 mm40Var, boolean z) {
        this.f15403a = (byte) 2;
        this.b = mm40Var;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15403a) {
            case 0:
                ((Integer) obj2).getClass();
                f7k.w(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(7));
                break;
            case 1:
                ((Integer) obj2).getClass();
                f7k.w(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(7));
                break;
            default:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zfn zfnVar = m8m0.f21378a;
                    ktt0.a(this.c, this.d, 0, ((StaticColors) fetVar.k(zfnVar)).m125getWhite100d7_KjU(), ((StaticColors) fetVar.k(zfnVar)).m126getWhite200d7_KjU(), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), fetVar, this.b, this.e);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ium(mm40 mm40Var, int i, int i2, boolean z, int i3, byte b) {
        this.f15403a = b;
        this.b = mm40Var;
        this.c = i;
        this.d = i2;
        this.e = z;
    }
}
