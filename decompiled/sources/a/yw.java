package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43345a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yw(mm40 mm40Var, boolean z, boolean z2, Function0 function0) {
        this.f43345a = (byte) 2;
        this.b = mm40Var;
        this.c = z;
        this.d = z2;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43345a;
        Object obj3 = this.e;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                vbw0.a((mm40) obj4, (ex) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                u1c.q((mm40) obj4, (roh) obj3, this.c, this.d, (fet) obj, x8x.L(3073));
                break;
            case 2:
                mm40 mm40Var = (mm40) obj4;
                Function0 function0 = (Function0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarN = o7k0.n(mm40Var, yom.f42994a);
                    zfn zfnVar = zaq0.b;
                    yom.a(mm40VarN, this.c, this.d, new utd0(((ThemeColors) fetVar.k(zfnVar)).getPrimary(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary60(), y3d.c(0.5f, ((ThemeColors) fetVar.k(zfnVar)).getPrimary()), y3d.c(0.5f, ((ThemeColors) fetVar.k(zfnVar)).getSecondary60())), function0, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                y860.M((dra0) obj4, this.c, this.d, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                y860.J((ara0) obj4, this.c, this.d, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                y860.L((cra0) obj4, this.c, this.d, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                vds0.a((mm40) obj4, (ogs0) obj3, this.c, this.d, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ yw(mm40 mm40Var, Object obj, boolean z, boolean z2, int i, byte b) {
        this.f43345a = b;
        this.b = mm40Var;
        this.e = obj;
        this.c = z;
        this.d = z2;
    }

    public /* synthetic */ yw(era0 era0Var, boolean z, boolean z2, Function1 function1, int i, byte b) {
        this.f43345a = b;
        this.b = era0Var;
        this.c = z;
        this.d = z2;
        this.e = function1;
    }
}
