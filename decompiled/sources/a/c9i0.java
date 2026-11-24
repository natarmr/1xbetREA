package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.limits.rs.impl.navigation.internal.LimitsRsInternalScreens$SelfExclusionDisclaimerFragmentScreen;
import org.xplatform.security.api.navigation.EndFlowNavigation;
import org.xplatform.security.api.presentation.models.BindEmailScreenParams;
import org.xplatform.security.impl.navigation.EmailScreenFactoryImpl$getBindEmailScreen$1;
import org.xplatform.verification.status.impl.navigation.VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class c9i0 extends i3t0 {
    public static final /* synthetic */ int y = 0;
    public final i1w0 o;
    public final ctf0 p;
    public final duj q;
    public final ovt r;
    public final rou s;
    public final wsi0 t;
    public final drm0 u;
    public final sek v;
    public final mne w;
    public final evz x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9i0(vzg0 vzg0Var, i1w0 i1w0Var, ctf0 ctf0Var, duj dujVar, ovt ovtVar, rou rouVar, wsi0 wsi0Var, drm0 drm0Var, sek sekVar, ocl oclVar, mne mneVar, evz evzVar) {
        super(vzg0Var, new eoh0((byte) 19), new gpb0(ctf0Var, oclVar, (byte) 8), cvm0.p(mneVar.c, mneVar.f22085a));
        ctf0Var.getClass();
        ovtVar.getClass();
        wsi0Var.getClass();
        this.o = i1w0Var;
        this.p = ctf0Var;
        this.q = dujVar;
        this.r = ovtVar;
        this.s = rouVar;
        this.t = wsi0Var;
        this.u = drm0Var;
        this.v = sekVar;
        this.w = mneVar;
        this.x = evzVar;
        sac.V(jiu0.a(this), new b9i0(this, (byte) 0), null, mneVar.b, new tmg0(this, null, (byte) 5), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        p8i0 p8i0Var = (p8i0) obj;
        p8i0Var.getClass();
        super.x(p8i0Var);
        boolean zEquals = p8i0Var.equals(k8i0.f17873a);
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.o;
        if (zEquals) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            boolean zEquals2 = p8i0Var.equals(n8i0.f23090a);
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (zEquals2) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value2, z8i0.a((z8i0) value2, false, null, 0, false, false, true, 31)));
                I(this.w.b, new b9i0(this, (byte) 1), new hhb0(this, null, (byte) 9));
                return;
            }
            if (p8i0Var instanceof o8i0) {
                int i = ((o8i0) p8i0Var).f24830a;
                niq0 niq0Var = ((z8i0) D()).b;
                if (niq0Var != null && i >= 0 && i < niq0Var.i.size()) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                        q7x.F(oyg0Var, Integer.valueOf(i), "SELECTED_VALUE_INDEX_KEY");
                    } while (!p7m0Var2.m(value, z8i0.a((z8i0) value, false, null, i, false, false, false, 59)));
                    return;
                }
                return;
            }
            if (p8i0Var.equals(j8i0.f16086a)) {
                niq0 niq0Var2 = ((z8i0) D()).b;
                if (niq0Var2 == null) {
                    return;
                }
                v85 v85Var = (v85) CollectionsKt.W(((z8i0) D()).c, niq0Var2.i);
                if (v85Var == null) {
                    return;
                }
                long j = v85Var.f36965a;
                String str = v85Var.b;
                wsi0 wsi0Var = this.t;
                wsi0Var.getClass();
                j400 j400Var = wsi0Var.f39694a;
                d9i0 d9i0Var = new d9i0(j, str);
                e400 e400Var = j400Var.c;
                e400Var.getClass();
                e400Var.b = d9i0Var;
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                this.x.getClass();
                k0w0VarI.h(new LimitsRsInternalScreens$SelfExclusionDisclaimerFragmentScreen());
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else if (p8i0Var.equals(m8i0.f21372a)) {
                if (!((z8i0) D()).d) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                    svs0 svs0Var = mbu0.b;
                    FragmentScreen verificationStatusScreens$AdditionalVerificationStatusFragmentScreen = new VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen(0, (r9u) this.u.f6568a);
                    if (verificationStatusScreens$AdditionalVerificationStatusFragmentScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) verificationStatusScreens$AdditionalVerificationStatusFragmentScreen)));
                    } else {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(verificationStatusScreens$AdditionalVerificationStatusFragmentScreen)));
                    }
                    ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO2;
                        if (!pawVar3.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                    }
                } else {
                    if (((z8i0) D()).e) {
                        return;
                    }
                    BindEmailScreenParams bindEmailScreenParams = new BindEmailScreenParams(EndFlowNavigation.ToRsSelfExclusionScreen.f46927a, false, 21);
                    CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                    this.v.getClass();
                    FragmentScreen emailScreenFactoryImpl$getBindEmailScreen$1 = new EmailScreenFactoryImpl$getBindEmailScreen$1(bindEmailScreenParams);
                    if (emailScreenFactoryImpl$getBindEmailScreen$1 instanceof DialogScreen) {
                        copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) emailScreenFactoryImpl$getBindEmailScreen$1)));
                    } else {
                        copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(emailScreenFactoryImpl$getBindEmailScreen$1)));
                    }
                    ListIterator listIteratorO3 = b1j.o(i1w0Var, copyOnWriteArrayListQ3, 0);
                    while (true) {
                        paw pawVar4 = (paw) listIteratorO3;
                        if (!pawVar4.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar4.next());
                        }
                    }
                }
            } else {
                if (!p8i0Var.equals(l8i0.f19606a)) {
                    if (p8i0Var.equals(i8i0.f14339a)) {
                        E();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ4, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ4, 0);
                while (true) {
                    paw pawVar5 = (paw) listIteratorP2;
                    if (!pawVar5.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar5.next());
                    }
                }
            }
        }
    }
}
