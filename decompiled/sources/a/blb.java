package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class blb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2787a = 2;
    public final /* synthetic */ float b;
    public final /* synthetic */ String c;

    public /* synthetic */ blb(float f, int i, String str) {
        this.c = str;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2787a;
        jm40 jm40Var = jm40.b;
        float f = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zD = fetVar.d(f);
                    Object objP = fetVar.P();
                    if (zD || objP == ukd.f35823a) {
                        objP = new f54(f, (byte) 5);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarD = o7k0.d(i4w0.T(jm40Var, (Function1) objP), 1.0f);
                    zcl zclVar = qmk.f28987a;
                    v8q0.a(this.c, s5x0.N(mm40VarD, 0.0f, 0.0f, 56.0f, 0.0f, 11), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 24960, 109560);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!fetVar2.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    fetVar2.X();
                } else if (f == 1.0f) {
                    fetVar2.e0(1721374524);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    v8q0.a(this.c, s5x0.N(mm40VarD2, 0.0f, 0.0f, 56.0f, 0.0f, 11), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar2, 0, 24960, 109560);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(1721820428);
                    fetVar2.r(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                m8x.x(this.c, f, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ blb(float f, String str) {
        this.b = f;
        this.c = str;
    }

    public /* synthetic */ blb(String str, float f) {
        this.c = str;
        this.b = f;
    }
}
