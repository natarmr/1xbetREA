package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z9g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44016a = 0;
    public final /* synthetic */ kwd b;
    public final /* synthetic */ s7g c;
    public final /* synthetic */ hbg d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ z9g(kwd kwdVar, s7g s7gVar, hbg hbgVar, boolean z) {
        this.b = kwdVar;
        this.c = s7gVar;
        this.d = hbgVar;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44016a) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarQ = i120.Q(o7k0.d(jm40.b, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    kwd kwdVar = this.b;
                    s7g s7gVar = this.c;
                    hbg hbgVar = this.d;
                    kwdVar.d(s7gVar, hbgVar, this.e, fetVar, 64);
                    kwdVar.e(s7gVar, hbgVar, fetVar, 64);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                this.b.d(this.c, this.d, this.e, (fet) obj, x8x.L(65));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ z9g(kwd kwdVar, s7g s7gVar, hbg hbgVar, boolean z, int i) {
        this.b = kwdVar;
        this.c = s7gVar;
        this.d = hbgVar;
        this.e = z;
    }
}
