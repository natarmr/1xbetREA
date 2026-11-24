package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32023a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sda(int i, int i2, x8n x8nVar, mm40 mm40Var, boolean z) {
        this.f32023a = (byte) 1;
        this.f = x8nVar;
        this.b = z;
        this.c = mm40Var;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        byte b = this.f32023a;
        int i = this.e;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                oja0.S(this.d, iL, (fet) obj, (mm40) obj4, (Function0) obj3, this.b);
                return Unit.f46060a;
            case 1:
                x8n x8nVar = (x8n) obj3;
                mm40 mm40Var = (mm40) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w8n w8nVar = x8nVar.f40471a;
                    boolean z3 = w8nVar instanceof v8n;
                    boolean z4 = this.b;
                    int i2 = this.d;
                    int i3 = this.e;
                    if (z3) {
                        fetVar.e0(477433814);
                        boolean z5 = w8nVar instanceof u8n;
                        if (z4) {
                            z2 = !z5;
                        } else {
                            z2 = z5;
                        }
                        zfn zfnVar = zaq0.b;
                        p8n.a(i2, i3, 0, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), ((ThemeColors) fetVar.k(zfnVar)).getSeparator(), w8nVar.a(), fetVar, mm40Var, z2);
                        fetVar.r(false);
                    } else {
                        if (!(w8nVar instanceof s8n)) {
                            throw b1j.f(1400872489, fetVar, false);
                        }
                        fetVar.e0(477999502);
                        boolean z6 = w8nVar instanceof r8n;
                        if (z4) {
                            z = !z6;
                        } else {
                            z = z6;
                        }
                        zfn zfnVar2 = m8m0.f21378a;
                        p8n.a(i2, i3, 0, ((StaticColors) fetVar.k(zfnVar2)).m75getBlack600d7_KjU(), ((StaticColors) fetVar.k(zfnVar2)).m126getWhite200d7_KjU(), w8nVar.a(), fetVar, mm40Var, z);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).intValue();
                hkb.o((xcz) obj4, this.d, this.b, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                ucx.N((znp0) obj4, this.b, this.d, (zx7) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                l8x.b((mm40) obj4, this.d, (Function1) obj3, (fet) obj, x8x.L(i | 1), this.b ? 1 : 0);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sda(mm40 mm40Var, int i, Function1 function1, int i2, int i3) {
        this.f32023a = (byte) 4;
        this.c = mm40Var;
        this.d = i;
        this.f = function1;
        this.e = i2;
        this.b = i3;
    }

    public /* synthetic */ sda(znp0 znp0Var, boolean z, int i, zx7 zx7Var, int i2) {
        this.f32023a = (byte) 3;
        this.c = znp0Var;
        this.b = z;
        this.d = i;
        this.f = zx7Var;
        this.e = i2;
    }

    public /* synthetic */ sda(Object obj, int i, boolean z, Function0 function0, int i2, byte b) {
        this.f32023a = b;
        this.c = obj;
        this.d = i;
        this.b = z;
        this.f = function0;
        this.e = i2;
    }
}
