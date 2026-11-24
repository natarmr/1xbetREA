package a;

import android.gov.nist.core.Separators;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vvh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38098a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ fuh c;

    public /* synthetic */ vvh(mm40 mm40Var, fuh fuhVar) {
        this.b = mm40Var;
        this.c = fuhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        shd shdVar;
        shd shdVar2;
        int i;
        byte b = this.f38098a;
        fuh fuhVar = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                shd shdVar3 = gqw0.v;
                shd shdVar4 = gqw0.y;
                shd shdVar5 = gqw0.w;
                shd shdVar6 = gqw0.x;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                yx7 yx7Var = gqw0.j;
                lw3 lw3Var = uc9.f35418a;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                    pz40 pz40Var = s6t0.f31722a;
                    long backgroundGroup = s6t0.b().f33626a.getBackgroundGroup();
                    zcl zclVar = qmk.f;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, backgroundGroup, new ugg0(zclVar, zclVar, zclVar, zclVar)), 4.0f);
                    mw3 mw3Var = uc9.c;
                    xx7 xx7Var = gqw0.m;
                    x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar.i0();
                    boolean z = fetVar.S;
                    pcy pcyVar = e7z.u1;
                    if (z) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, shdVar6);
                    jpm0.o(fetVar, bh90VarM, shdVar5);
                    vqd.u(iHashCode, fetVar, shdVar4, fetVar);
                    jpm0.o(fetVar, mm40VarC0, shdVar3);
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 8.0f, 0.0f, 12.0f, 4);
                    thg0 thg0VarA = shg0.a(lw3Var, gqw0.k, fetVar, 48);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, shdVar6);
                    jpm0.o(fetVar, bh90VarM2, shdVar5);
                    vqd.u(iHashCode2, fetVar, shdVar4, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar3);
                    j0x.b(a8k0.F(R.drawable.ic_cycling, 0, fetVar), null, o7k0.n(jm40Var, 24.0f), null, gqw0.f1, 0.0f, null, fetVar, 24632, 104);
                    mm40 mm40VarN2 = s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                    String str = fuhVar.e;
                    a4x a4xVar = fuhVar.f;
                    v8q0.a(str, mm40VarN2, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.i(), fetVar, 0, 24576, 114680);
                    fetVar.r(true);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                    zcl zclVar2 = qmk.e;
                    mm40 mm40VarQ = i120.Q(mm40VarD2, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
                    x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarQ);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA2, shdVar6);
                    jpm0.o(fetVar, bh90VarM3, shdVar5);
                    vqd.u(iHashCode3, fetVar, shdVar4, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar3);
                    mm40 mm40VarJ2 = s5x0.J(o7k0.d(jm40Var, 1.0f), 8.0f);
                    thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 0);
                    int iHashCode4 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM4 = fetVar.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarJ2);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA2, shdVar6);
                    jpm0.o(fetVar, bh90VarM4, shdVar5);
                    vqd.u(iHashCode4, fetVar, shdVar4, fetVar);
                    jpm0.o(fetVar, mm40VarC3, shdVar3);
                    v8q0.a(ohs0.n(rsm0.w(R.string.dates, 0, fetVar), ": "), null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.l(), fetVar, 0, 0, 131066);
                    v8q0.a(fuhVar.f10162a, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 131066);
                    fetVar.r(true);
                    jcb.v(null, 0.0f, s6t0.b().f33626a.getBackgroundGroup(), fetVar, 0, 3);
                    mm40 mm40VarJ3 = s5x0.J(o7k0.d(jm40Var, 1.0f), 8.0f);
                    thg0 thg0VarA3 = shg0.a(lw3Var, yx7Var, fetVar, 0);
                    int iHashCode5 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM5 = fetVar.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarJ3);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA3, shdVar6);
                    jpm0.o(fetVar, bh90VarM5, shdVar5);
                    vqd.u(iHashCode5, fetVar, shdVar4, fetVar);
                    jpm0.o(fetVar, mm40VarC4, shdVar3);
                    v8q0.a(ohs0.n(rsm0.w(R.string.status, 0, fetVar), ": "), null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.l(), fetVar, 0, 0, 131066);
                    v8q0.a(fuhVar.c, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 131066);
                    fetVar.r(true);
                    jcb.v(null, 0.0f, s6t0.b().f33626a.getBackgroundGroup(), fetVar, 0, 3);
                    mm40 mm40VarJ4 = s5x0.J(o7k0.d(jm40Var, 1.0f), 8.0f);
                    thg0 thg0VarA4 = shg0.a(lw3Var, yx7Var, fetVar, 0);
                    int iHashCode6 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM6 = fetVar.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarJ4);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA4, shdVar6);
                    jpm0.o(fetVar, bh90VarM6, shdVar5);
                    vqd.u(iHashCode6, fetVar, shdVar4, fetVar);
                    jpm0.o(fetVar, mm40VarC5, shdVar3);
                    v8q0.a(ohs0.n(rsm0.w(R.string.document_number, 0, fetVar), ": "), null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.l(), fetVar, 0, 0, 131066);
                    v8q0.a(fuhVar.b, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 131066);
                    fet fetVar2 = fetVar;
                    fetVar2.r(true);
                    if (a4xVar.isEmpty()) {
                        shdVar = shdVar3;
                        shdVar2 = shdVar4;
                        i = 0;
                        fetVar2.e0(363355705);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(362611891);
                        jcb.v(null, 0.0f, s6t0.b().f33626a.getBackgroundGroup(), fetVar2, 0, 3);
                        mm40 mm40VarJ5 = s5x0.J(o7k0.d(jm40Var, 1.0f), 8.0f);
                        x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                        int iHashCode7 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM7 = fetVar2.m();
                        mm40 mm40VarC6 = kbc.c0(fetVar2, mm40VarJ5);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA3, shdVar6);
                        jpm0.o(fetVar2, bh90VarM7, shdVar5);
                        vqd.u(iHashCode7, fetVar2, shdVar4, fetVar2);
                        jpm0.o(fetVar2, mm40VarC6, shdVar3);
                        shdVar = shdVar3;
                        shdVar2 = shdVar4;
                        i = 0;
                        v8q0.a(ohs0.n(rsm0.w(R.string.leadership, 0, fetVar2), Separators.SP), null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.l(), fetVar2, 0, 0, 131066);
                        fetVar2 = fetVar2;
                        fetVar2.e0(589158733);
                        Iterator<E> it = a4xVar.iterator();
                        while (it.hasNext()) {
                            xkb.k((euh) it.next(), fetVar2, 0);
                        }
                        ohs0.x(fetVar2, false, true, false);
                    }
                    pz40 pz40Var2 = s6t0.f31722a;
                    jcb.v(null, 0.0f, s6t0.b().f33626a.getBackgroundGroup(), fetVar2, 0, 3);
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarJ6 = s5x0.J(mm40VarD3, 8.0f);
                    thg0 thg0VarA5 = shg0.a(lw3Var, yx7Var, fetVar2, i);
                    int iHashCode8 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM8 = fetVar2.m();
                    mm40 mm40VarC7 = kbc.c0(fetVar2, mm40VarJ6);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA5, shdVar6);
                    jpm0.o(fetVar2, bh90VarM8, shdVar5);
                    vqd.u(iHashCode8, fetVar2, shdVar2, fetVar2);
                    jpm0.o(fetVar2, mm40VarC7, shdVar);
                    fet fetVar3 = fetVar2;
                    v8q0.a(ohs0.n(rsm0.w(R.string.time, i, fetVar2), ": "), null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.l(), fetVar3, 0, 0, 131066);
                    v8q0.a(fuhVar.d, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar3, 0, 0, 131066);
                    ohs0.x(fetVar3, true, true, true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                xkb.j(mm40Var, fuhVar, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ vvh(mm40 mm40Var, fuh fuhVar, int i) {
        this.b = mm40Var;
        this.c = fuhVar;
    }
}
