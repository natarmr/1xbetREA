package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xq40 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41298a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xq40(float f, vz2 vz2Var, boolean z, int i) {
        this.f41298a = (byte) 2;
        this.b = f;
        this.d = vz2Var;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41298a;
        jm40 jm40Var = jm40.b;
        boolean z = this.c;
        Object obj3 = this.d;
        float f = this.b;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qzb.n(a8k0.I(jm40Var, f), new wul(qul.e, oe9.c, new te9(R.drawable.ic_glyph_chevron_left_small), this.c, false, false), function0, fetVar, 0, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                Function0 function1 = (Function0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    boolean z2 = fetVar2.S;
                    pcy pcyVar = e7z.u1;
                    if (z2) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar2, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf, shdVar3);
                    jpm0.n(fetVar2);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC0, shdVar4);
                    Float fValueOf = Float.valueOf(f);
                    if (!z) {
                        fValueOf = null;
                    }
                    lv00.k(fValueOf != null ? fValueOf.floatValue() : 1.0f, fetVar2, 0);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, shdVar);
                    jpm0.o(fetVar2, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar4);
                    Float fValueOf2 = Float.valueOf(f);
                    if (!z) {
                        fValueOf2 = null;
                    }
                    lv00.r(epv0.N(jm40Var, fValueOf2 != null ? fValueOf2.floatValue() : 1.0f), xsm0.s(R.string.news_catalog, fetVar2), function1, fetVar2, 0);
                    Float fValueOf3 = z ? Float.valueOf(1.0f - f) : null;
                    lv00.D(0, fetVar2, epv0.N(jm40Var, fValueOf3 != null ? fValueOf3.floatValue() : 0.0f), function1);
                    fetVar2.r(true);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                y0x0.C(f, (vz2) obj3, z, (fet) obj, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ xq40(float f, boolean z, Function0 function0, byte b) {
        this.f41298a = b;
        this.b = f;
        this.c = z;
        this.d = function0;
    }
}
