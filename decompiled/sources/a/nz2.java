package a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class nz2 {
    /* JADX WARN: Code duplicated, block: B:76:0x016d  */
    public static final void a(final Class cls, mm40 mm40Var, final d5r d5rVar, final Bundle bundle, lkz lkzVar, Function1 function1, fet fetVar, int i) {
        final lkz lkzVar2;
        fet fetVar2;
        cl5 cl5Var;
        cl5 cl5Var2;
        final nzq nzqVar;
        final androidx.fragment.app.e eVar;
        boolean zI;
        Object objP;
        fetVar.g0(1148251591);
        int i2 = i | (fetVar.i(cls) ? 4 : 2) | (fetVar.g(d5rVar) ? 256 : 128) | (fetVar.i(bundle) ? 2048 : 1024) | (fetVar.e(lkzVar == null ? -1 : lkzVar.ordinal()) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            final pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            final int iX = e3c.x(fetVar);
            View view = (View) fetVar.k(dy2.f);
            boolean zG = fetVar.g(view);
            Object objP2 = fetVar.P();
            cl5 cl5Var3 = ukd.f35823a;
            if (zG || objP2 == cl5Var3) {
                objP2 = androidx.fragment.app.e.K(view);
                fetVar.o0(objP2);
            }
            androidx.fragment.app.e eVar2 = (androidx.fragment.app.e) objP2;
            final Context context = (Context) fetVar.k(dy2.b);
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var3) {
                objP3 = new nzq(iX);
                fetVar.o0(objP3);
            }
            nzq nzqVar2 = (nzq) objP3;
            dwi0.b(nzqVar2, mm40Var, null, fetVar, 48, 4);
            fetVar2 = fetVar;
            Object[] objArr = {eVar2, nzqVar2, cls, d5rVar};
            int i3 = (57344 & i2) ^ 24576;
            boolean zI2 = fetVar2.i(eVar2) | fetVar2.i(nzqVar2) | fetVar2.i(context) | fetVar2.i(cls) | ((((i2 & 896) ^ 384) > 256 && fetVar2.g(d5rVar)) || (i2 & 384) == 256) | fetVar2.i(bundle) | fetVar2.e(iX) | ((i3 > 16384 && fetVar2.e(lkzVar.ordinal())) || (i2 & 24576) == 16384) | fetVar2.g(pz40VarF);
            Object objP4 = fetVar2.P();
            if (zI2) {
                cl5Var = cl5Var3;
            } else {
                cl5Var = cl5Var3;
                if (objP4 != cl5Var) {
                    lkzVar2 = lkzVar;
                    nzqVar = nzqVar2;
                    cl5Var2 = cl5Var;
                    eVar = eVar2;
                }
                m0x0.p(objArr, (Function1) objP4, fetVar2);
                zI = fetVar2.i(eVar) | fetVar2.i(nzqVar) | ((i3 <= 16384 && fetVar2.e(lkzVar2.ordinal())) || (i2 & 24576) == 16384);
                objP = fetVar2.P();
                if (zI || objP == cl5Var2) {
                    objP = new on((Object) eVar, (Object) nzqVar, (Object) lkzVar2, (byte) 12);
                    fetVar2.o0(objP);
                }
                m0x0.o(lkzVar2, (Function1) objP, fetVar2);
            }
            nzqVar = nzqVar2;
            eVar = eVar2;
            cl5Var2 = cl5Var;
            lkzVar2 = lkzVar;
            Function1 function2 = new Function1() { // from class: a.jz2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    hie0 hie0Var = new hie0();
                    nzq nzqVar3 = nzqVar;
                    int id = nzqVar3.a().getId();
                    androidx.fragment.app.e eVar3 = eVar;
                    Fragment fragmentI = eVar3.I(id);
                    d5r d5rVar2 = d5rVar;
                    if (fragmentI == null) {
                        m1r m1rVarS = eVar3.S();
                        context.getClassLoader();
                        fragmentI = m1rVarS.a(cls.getName());
                        fragmentI.t0((Fragment.SavedState) d5rVar2.f5520a.getValue());
                        fragmentI.s0(bundle);
                        zb5 zb5Var = new zb5(eVar3);
                        zb5Var.p = true;
                        FragmentContainerView fragmentContainerViewA = nzqVar3.a();
                        String strValueOf = String.valueOf(iX);
                        fragmentI.k1 = fragmentContainerViewA;
                        fragmentI.r = true;
                        zb5Var.k(fragmentContainerViewA.getId(), fragmentI, strValueOf, 1);
                        lkz lkzVar3 = lkz.c;
                        lkz lkzVar4 = lkzVar2;
                        if (lkzVar4.compareTo(lkzVar3) >= 0) {
                            zb5Var.q(fragmentI, lkzVar4);
                        }
                        if (eVar3.a0()) {
                            hie0Var.f13108a = true;
                            fragmentI.u1.a(new lz2(hie0Var, fragmentI, (byte) 0));
                            zb5Var.i();
                        } else {
                            zb5Var.h();
                        }
                    }
                    Fragment fragment = fragmentI;
                    eVar3.d0(nzqVar3.a());
                    ((Function1) pz40VarF.getValue()).invoke(fragment);
                    return new kz2(eVar3, fragment, d5rVar2, hie0Var, (byte) 0);
                }
            };
            fetVar2.o0(function2);
            objP4 = function2;
            m0x0.p(objArr, (Function1) objP4, fetVar2);
            zI = fetVar2.i(eVar) | fetVar2.i(nzqVar) | ((i3 <= 16384 && fetVar2.e(lkzVar2.ordinal())) || (i2 & 24576) == 16384);
            objP = fetVar2.P();
            if (zI) {
                objP = new on((Object) eVar, (Object) nzqVar, (Object) lkzVar2, (byte) 12);
                fetVar2.o0(objP);
            } else {
                objP = new on((Object) eVar, (Object) nzqVar, (Object) lkzVar2, (byte) 12);
                fetVar2.o0(objP);
            }
            m0x0.o(lkzVar2, (Function1) objP, fetVar2);
        } else {
            lkzVar2 = lkzVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(cls, mm40Var, d5rVar, bundle, lkzVar2, function1, i, (byte) 1);
        }
    }
}
