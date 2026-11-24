package a;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hzh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13905a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ hzh(mm40 mm40Var, long j, long j2) {
        this.f13905a = (byte) 3;
        this.b = mm40Var;
        this.c = j;
        this.d = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13905a) {
            case 0:
                ((Integer) obj2).getClass();
                wvb.A(this.b, this.c, this.d, (fet) obj, x8x.L(7));
                break;
            case 1:
                ((Integer) obj2).getClass();
                i2m.a(this.b, this.c, this.d, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                dyb.a(this.b, this.c, this.d, (fet) obj, x8x.L(1));
                break;
            default:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, this.b);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    StaticColors staticColors = StaticColors.INSTANCE;
                    long jM73getBlack400d7_KjU = staticColors.m73getBlack400d7_KjU();
                    zcl zclVar = qmk.c;
                    ugg0 ugg0Var = vgg0.f37379a;
                    ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarE0 = o2e.e0(s5x0.K(i120.Q(jm40Var, jM73getBlack400d7_KjU, ugg0Var2), 4.0f, 2.0f), "MinutesTestTag");
                    Locale locale = Locale.ENGLISH;
                    v8q0.a(String.format(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(this.c)}, 1)), mm40VarE0, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 0, false, 1, 0, null, g1t0.g(), fetVar, 0, 24576, 113656);
                    v8q0.a(" : ", new ecu0(gqw0.k), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 6, 0, 131064);
                    v8q0.a(String.format(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(this.d)}, 1)), o2e.e0(s5x0.K(i120.Q(jm40Var, staticColors.m73getBlack400d7_KjU(), new ugg0(zclVar, zclVar, zclVar, zclVar)), 4.0f, 2.0f), "SecondsTestTag"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 0, false, 1, 0, null, g1t0.g(), fetVar, 0, 24576, 113656);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ hzh(mm40 mm40Var, long j, long j2, int i, byte b) {
        this.f13905a = b;
        this.b = mm40Var;
        this.c = j;
        this.d = j2;
    }
}
