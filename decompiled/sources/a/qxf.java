package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qxf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29482a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qxf(h2m h2mVar, boolean z, l7m0 l7m0Var, boolean z2, l7m0 l7m0Var2, l7m0 l7m0Var3) {
        this.f = h2mVar;
        this.c = z;
        this.b = l7m0Var;
        this.d = z2;
        this.g = l7m0Var2;
        this.e = l7m0Var3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29482a;
        Object obj3 = this.e;
        Object obj4 = this.g;
        Object obj5 = this.b;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                dub.j((ooh0) obj6, (Function0) obj5, (Function1) obj4, this.c, this.d, (mm40) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                wwb.d((Function0) obj5, this.c, this.d, (ugd) obj6, (ugd) obj4, (mm40) obj3, (fet) obj, x8x.L(27649));
                return Unit.f46060a;
            case 2:
                h2m h2mVar = (h2m) obj6;
                l7m0 l7m0Var = (l7m0) obj5;
                l7m0 l7m0Var2 = (l7m0) obj4;
                l7m0 l7m0Var3 = (l7m0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iOrdinal = h2mVar.ordinal();
                    jm40 jm40Var = jm40.b;
                    boolean z = this.c;
                    boolean z2 = this.d;
                    if (iOrdinal == 0) {
                        fetVar.e0(1259137812);
                        rcb.w(jm40Var, z, l7m0Var, z2, l7m0Var2, l7m0Var3, ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), fetVar, 196992);
                        fetVar.r(false);
                    } else if (iOrdinal == 1) {
                        fetVar.e0(1258699472);
                        rcb.w(jm40Var, z, l7m0Var, z2, l7m0Var2, l7m0Var3, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), fetVar, 196992);
                        fetVar.r(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw b1j.f(1426074603, fetVar, false);
                        }
                        fetVar.e0(1259544687);
                        rcb.y(jm40Var, z2, z, l7m0Var, l7m0Var2, l7m0Var3, fetVar, 199680);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                rcb.y((mm40) obj3, this.c, this.d, (l7m0) obj6, (l7m0) obj5, (l7m0) obj4, (fet) obj, x8x.L(199681));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                nia0.B((mm40) obj3, this.c, (a4x) obj6, (bdz) obj5, this.d, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                return glb0.a((glb0) obj2, false, false, new trd(Boolean.valueOf(this.c)), new trd((wcb) obj5), new trd((uql0) obj6), new trd((v5l0) obj3), new trd((npo) obj4), null, null, null, null, null, null, null, null, null, null, null, this.d, 16769887);
        }
    }

    public /* synthetic */ qxf(mm40 mm40Var, boolean z, a4x a4xVar, bdz bdzVar, boolean z2, Function1 function1, int i) {
        this.e = mm40Var;
        this.c = z;
        this.f = a4xVar;
        this.b = bdzVar;
        this.d = z2;
        this.g = function1;
    }

    public /* synthetic */ qxf(mm40 mm40Var, boolean z, boolean z2, l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, int i) {
        this.e = mm40Var;
        this.c = z;
        this.d = z2;
        this.f = l7m0Var;
        this.b = l7m0Var2;
        this.g = l7m0Var3;
    }

    public /* synthetic */ qxf(ooh0 ooh0Var, Function0 function0, Function1 function1, boolean z, boolean z2, mm40 mm40Var, int i) {
        this.f = ooh0Var;
        this.b = function0;
        this.g = function1;
        this.c = z;
        this.d = z2;
        this.e = mm40Var;
    }

    public /* synthetic */ qxf(uql0 uql0Var, boolean z, wcb wcbVar, npo npoVar, v5l0 v5l0Var, boolean z2) {
        this.f = uql0Var;
        this.c = z;
        this.b = wcbVar;
        this.g = npoVar;
        this.e = v5l0Var;
        this.d = z2;
    }

    public /* synthetic */ qxf(Function0 function0, boolean z, boolean z2, ugd ugdVar, ugd ugdVar2, mm40 mm40Var, int i) {
        this.b = function0;
        this.c = z;
        this.d = z2;
        this.f = ugdVar;
        this.g = ugdVar2;
        this.e = mm40Var;
    }
}
