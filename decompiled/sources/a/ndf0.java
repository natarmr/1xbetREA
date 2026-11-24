package a;

import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final class ndf0 {
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(mm40 mm40Var, mm40 mm40Var2, Fragment fragment, RelatedParams relatedParams, fet fetVar) {
        boolean z;
        ugd ugdVar;
        boolean z2;
        boolean z3;
        fet fetVar2 = fetVar;
        mm40Var.getClass();
        mm40Var2.getClass();
        fragment.getClass();
        relatedParams.getClass();
        fetVar2.e0(803795612);
        boolean zG = fetVar2.g(fragment);
        Object objP = fetVar2.P();
        if (zG || objP == ukd.f35823a) {
            ComponentCallbacks2 componentCallbacks2I = vqd.i(fragment);
            af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(mdf0.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                if (!(ze3Var instanceof mdf0)) {
                    ze3Var = null;
                }
                mdf0 mdf0Var = (mdf0) ze3Var;
                if (mdf0Var != null) {
                    Fragment fragment2 = fragment;
                    while (true) {
                        if (fragment2 == 0) {
                            jf4.n("Can't find feature provider!");
                            return;
                        }
                        if (fragment2 instanceof odf0) {
                            pdf0 pdf0VarB = ((odf0) fragment2).b();
                            cad cadVar = mdf0Var.f21594a;
                            ctf0 ctf0Var = mdf0Var.b;
                            ctf0Var.getClass();
                            rri rriVar = new rri(pdf0VarB, cadVar, ctf0Var);
                            fetVar2.o0(rriVar);
                            objP = rriVar;
                            break;
                        }
                        fragment2 = fragment2.y;
                    }
                }
            }
            jf4.n(b1j.i(mdf0.class, "Cannot create dependency "));
            return;
        }
        q0h0 q0h0Var = new q0h0((qri) ((rri) objP).d.get());
        sgy sgyVarB = sre0.f32672a.b(sef0.class);
        int i = sef0.o;
        pz40 pz40VarY = ((i3t0) n4c.X(sgyVarB, null, q0h0Var, fetVar2, 14)).y(fetVar2);
        ugd ugdVarM = u1c.M(-518241075, new rwc0(this, mm40Var2, fragment, relatedParams), fetVar2);
        pz40VarY.getClass();
        mw3 mw3Var = uc9.c;
        xx7 xx7Var = gqw0.m;
        x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
        int iHashCode = Long.hashCode(fetVar2.T);
        bh90 bh90VarM = fetVar2.m();
        mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
        mkd.c0.getClass();
        fetVar2.i0();
        boolean z4 = fetVar2.S;
        pcy pcyVar = e7z.u1;
        if (z4) {
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
        jm40 jm40Var = jm40.b;
        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
        tj30 tj30VarC = zq8.c(gqw0.e, false);
        int iHashCode2 = Long.hashCode(fetVar2.T);
        bh90 bh90VarM2 = fetVar2.m();
        mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
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
        ref0 ref0Var = (ref0) pz40VarY.getValue();
        if (ref0Var != null) {
            if (ref0Var instanceof oef0) {
                fetVar2.e0(-470474170);
                fetVar2.r(false);
                ugdVar = ugdVarM;
                z3 = true;
                z2 = false;
            } else if (ref0Var instanceof pef0) {
                fetVar2.e0(-470379992);
                zcl zclVar = qmk.f28987a;
                ugdVar = ugdVarM;
                v8q0.a(((pef0) ref0Var).f26849a, s5x0.K(jm40Var, 8.0f, 12.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(false);
                z2 = false;
                z3 = true;
            } else {
                ugdVar = ugdVarM;
                if (ref0Var instanceof qef0) {
                    fetVar2.e0(-469832005);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, shdVar);
                    jpm0.o(fetVar2, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, shdVar4);
                    zcl zclVar2 = qmk.f28987a;
                    ycl yclVar = new ycl(24.0f);
                    ycl yclVar2 = new ycl(2.0f);
                    zfn zfnVar = zaq0.b;
                    kpb.j(null, new dkm(yclVar, yclVar2, new y3d(((ThemeColors) fetVar2.k(zfnVar)).getSecondary())), fetVar2, 0, 1);
                    mm40 mm40VarL = s5x0.L(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 12.0f, 1);
                    x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarL);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA2, shdVar);
                    jpm0.o(fetVar2, bh90VarM4, shdVar2);
                    vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, shdVar4);
                    qef0 qef0Var = (qef0) ref0Var;
                    v8q0.a(qef0Var.f28580a, null, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 130042);
                    v8q0.a(qef0Var.b, s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, g1t0.m(), fetVar, 0, 0, 130040);
                    fetVar2 = fetVar;
                    z2 = false;
                    z3 = true;
                    ohs0.x(fetVar2, true, true, false);
                } else {
                    z = false;
                }
            }
            fetVar2.r(z3);
            ugdVar.invoke(fetVar2, 6);
            fetVar2.r(z3);
            fetVar2.r(z2);
            return;
        }
        z = false;
        throw b1j.f(-1954839773, fetVar2, z);
    }
}
