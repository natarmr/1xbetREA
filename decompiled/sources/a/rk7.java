package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class rk7 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f30635a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ l7m0 e;
    public final /* synthetic */ l7m0 f;
    public final /* synthetic */ l7m0 g;
    public final /* synthetic */ l7m0 h;
    public final /* synthetic */ l7m0 i;

    public rk7(List list, l7m0 l7m0Var, Function1 function1, l7m0 l7m0Var2, l7m0 l7m0Var3, l7m0 l7m0Var4, l7m0 l7m0Var5, l7m0 l7m0Var6, l7m0 l7m0Var7) {
        this.f30635a = list;
        this.b = l7m0Var;
        this.c = function1;
        this.d = l7m0Var2;
        this.e = l7m0Var3;
        this.f = l7m0Var4;
        this.g = l7m0Var5;
        this.h = l7m0Var6;
        this.i = l7m0Var7;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        l7m0 l7m0Var;
        float fFloatValue;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        int i = (iIntValue2 & 6) == 0 ? (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2 : iIntValue2;
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            jvg0 jvg0Var = (jvg0) this.f30635a.get(iIntValue);
            fetVar.e0(-2116400883);
            if (jvg0Var != null) {
                boolean z = jvg0Var instanceof cvg0;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar.e0(-2116436813);
                    zcl zclVar = qmk.f28987a;
                    k7x.q(0, fetVar, s5x0.L(jm40Var, 4.0f, 0.0f, 2), (String) this.b.getValue());
                    fetVar.r(false);
                } else if (jvg0Var instanceof j8k0) {
                    fetVar.e0(-2115977176);
                    pz40 pz40Var = s6t0.f31722a;
                    long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                    zcl zclVar2 = qmk.f28987a;
                    float f = 12.0f;
                    mm40 mm40VarJ = s5x0.J(i120.Q(jm40Var, backgroundContent, vgg0.a(16.0f)), 12.0f);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
                    fetVar.e0(1218055667);
                    int i2 = 0;
                    for (Object obj5 : ((j8k0) jvg0Var).f16088a) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            q3d.p();
                            throw null;
                        }
                        f8k0 f8k0Var = (f8k0) obj5;
                        if (i2 > 0) {
                            fetVar.e0(1070839754);
                            zcl zclVar3 = qmk.f28987a;
                            mbc.o(zfi0.f44303a, s5x0.L(jm40Var, 0.0f, f, 1), false, fetVar, 6, 4);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1071149785);
                            fetVar.r(false);
                        }
                        String str = f8k0Var.f9110a;
                        h8k0 h8k0Var = f8k0Var.c;
                        String str2 = f8k0Var.b;
                        int iOrdinal = h8k0Var.ordinal();
                        if (iOrdinal == 0) {
                            l7m0Var = (l7m0) this.d.getValue();
                        } else if (iOrdinal == 1) {
                            l7m0Var = (l7m0) this.e.getValue();
                        } else {
                            if (iOrdinal != 2) {
                                t9f.b();
                                return null;
                            }
                            l7m0Var = (l7m0) this.f.getValue();
                        }
                        int iOrdinal2 = h8k0Var.ordinal();
                        if (iOrdinal2 == 0) {
                            fFloatValue = ((Number) ((l7m0) this.g.getValue()).getValue()).floatValue();
                        } else if (iOrdinal2 == 1) {
                            fFloatValue = ((Number) ((l7m0) this.h.getValue()).getValue()).floatValue();
                        } else {
                            if (iOrdinal2 != 2) {
                                t9f.b();
                                return null;
                            }
                            fFloatValue = ((Number) ((l7m0) this.i.getValue()).getValue()).floatValue();
                        }
                        prm prmVar = new prm(fFloatValue, new jrm(f8k0Var.d, f8k0Var.e), null, null, false, 246);
                        Function1 function1 = this.c;
                        boolean zG = fetVar.g(function1) | fetVar.g(f8k0Var);
                        Object objP = fetVar.P();
                        if (zG || objP == ukd.f35823a) {
                            objP = new ci2(function1, f8k0Var, (byte) 27);
                            fetVar.o0(objP);
                        }
                        float f2 = f;
                        fet fetVar2 = fetVar;
                        n7x.l(null, str, str2, l7m0Var, prmVar, (Function1) objP, fetVar2, 0);
                        fetVar = fetVar2;
                        f = f2;
                        i2 = i3;
                    }
                    ohs0.x(fetVar, false, true, false);
                }
                fetVar.r(false);
            }
            throw b1j.f(-1869386314, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }
}
