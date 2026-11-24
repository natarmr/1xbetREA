package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.IndividualColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bn2 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2861a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ bn2(fie fieVar, pn2 pn2Var, bdz bdzVar, float f, bzl bzlVar, Function1 function1) {
        this.c = fieVar;
        this.d = pn2Var;
        this.e = bdzVar;
        this.b = f;
        this.f = bzlVar;
        this.g = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar;
        byte b = this.f2861a;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                fie fieVar = (fie) obj8;
                pn2 pn2Var = (pn2) obj7;
                bdz bdzVar = (bdz) obj6;
                bzl bzlVar = (bzl) obj5;
                Function1 function1 = (Function1) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nnw0.p(o2e.e0(o7k0.c, "VIEWED_LAZY_COLUMN"), (nhe) fieVar, pn2Var.b, bdzVar, this.b, bzlVar, function1, fetVar2, 6);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                l7m0 l7m0Var = (l7m0) obj8;
                w0q w0qVar = (w0q) obj7;
                l7m0 l7m0Var2 = (l7m0) obj6;
                n05 n05Var = (n05) obj5;
                y9q0 y9q0Var = (y9q0) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Object value = l7m0Var.getValue();
                    k0d k0dVar = k0d.b;
                    jm40 jm40Var = jm40.b;
                    float f = this.b;
                    if (value == k0dVar) {
                        fetVar3.e0(-333715970);
                        dww.c(a8k0.F(R.drawable.ic_glyph_lock, 0, fetVar3), null, o2e.e0(o7k0.n(jm40Var, f), "SPORT_MARKET_FILLED_L_BADGE_BLOCKED_TAG"), w0qVar.g, fetVar3, 56, 0);
                        fetVar = fetVar3;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar3;
                        fetVar.e0(-333258689);
                        fetVar.r(false);
                    }
                    if (l7m0Var.getValue() == k0d.c) {
                        fetVar.e0(-333138657);
                        dww.c(a8k0.F(R.drawable.ic_glyph_triangle_arrow_up, 0, fetVar), null, o7k0.n(jm40Var, f), ((IndividualColors) fetVar.k(j7x.f16059a)).getCoefHigher(), fetVar, 56, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-332774593);
                        fetVar.r(false);
                    }
                    if (l7m0Var.getValue() == k0d.d) {
                        fetVar.e0(-332655522);
                        dww.c(a8k0.F(R.drawable.ic_glyph_triangle_arrow_down, 0, fetVar), null, o7k0.n(jm40Var, f), ((IndividualColors) fetVar.k(j7x.f16059a)).getCoefLower(), fetVar, 56, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-332290497);
                        fetVar.r(false);
                    }
                    v8q0.a((String) l7m0Var2.getValue(), o2e.e0(jm40Var, "SPORT_MARKET_FILLED_L_TEXT_TAG"), c9x.v((k0d) l7m0Var.getValue(), w0qVar.e, fetVar), n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, 48, 24960, 110576);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ bn2(l7m0 l7m0Var, float f, w0q w0qVar, l7m0 l7m0Var2, n05 n05Var, y9q0 y9q0Var) {
        this.c = l7m0Var;
        this.b = f;
        this.d = w0qVar;
        this.e = l7m0Var2;
        this.f = n05Var;
        this.g = y9q0Var;
    }
}
