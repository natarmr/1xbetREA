package a;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class p7g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ s7g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7g(s7g s7gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = s7gVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        s7g s7gVar = this.k;
        switch (b) {
            case 0:
                p7g p7gVar = new p7g(s7gVar, yjeVar, (byte) 0);
                p7gVar.j = obj;
                return p7gVar;
            default:
                p7g p7gVar2 = new p7g(s7gVar, yjeVar, (byte) 1);
                p7gVar2.j = obj;
                return p7gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((p7g) create((abg) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((p7g) create((wl9) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 2;
        s7g s7gVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                abg abgVar = (abg) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (abgVar == null) {
                    t9f.b();
                    return null;
                }
                usd usdVar = s7g.U1;
                if (s7gVar.N1 == null) {
                    Intrinsics.h("tipsDialogFeature");
                    throw null;
                }
                androidx.fragment.app.e eVarC = s7gVar.C();
                eVarC.getClass();
                uuz uuzVar = fk60.b;
                ki60.q2.getClass();
                if (eVarC.J("OnboardingBottomSheetContainerFragment") == null) {
                    ki60 ki60Var = new ki60();
                    iiy[] iiyVarArr = ki60.r2;
                    ki60Var.n2.I(ki60Var, iiyVarArr[1], 25);
                    ki60Var.o2.x(ki60Var, iiyVarArr[2], "");
                    sj3.E0(ki60Var, eVarC, "OnboardingBottomSheetContainerFragment");
                }
                return Unit.f46060a;
            default:
                wl9 wl9Var = (wl9) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                vl9 vl9Var = (vl9) CollectionsKt.W(wl9Var.c, wl9Var.f39342a);
                if (vl9Var == null) {
                    vl9Var = (vl9) CollectionsKt.firstOrNull(wl9Var.f39342a);
                }
                if (vl9Var != null) {
                    yag yagVar = vl9Var.b;
                    usd usdVar2 = s7g.U1;
                    vef vefVar = new vef(yagVar, s7gVar, b2);
                    androidx.fragment.app.e eVarC2 = s7gVar.C();
                    eVarC2.getClass();
                    String strName = yagVar.name();
                    List listP = eVarC2.c.p();
                    ArrayList<Fragment> arrayListU = twn.u(listP);
                    for (Object obj3 : listP) {
                        Fragment fragment = (Fragment) obj3;
                        if (!fragment.O() && !Intrinsics.d(fragment.B, strName)) {
                            arrayListU.add(obj3);
                        }
                    }
                    Fragment fragmentJ = eVarC2.J(strName);
                    if (!arrayListU.isEmpty() || fragmentJ == null || !fragmentJ.S()) {
                        zb5 zb5Var = new zb5(eVarC2);
                        zb5Var.p(R.anim.nav_default_enter_anim, R.anim.nav_default_exit_anim, R.anim.nav_default_pop_enter_anim, R.anim.nav_default_pop_exit_anim);
                        if (fragmentJ == null) {
                            zb5Var.k(R.id.fragmentContainer, (Fragment) vefVar.invoke(), strName, 1);
                        } else if (!fragmentJ.S() || fragmentJ.O()) {
                            zb5Var.q(fragmentJ, lkz.e);
                            zb5Var.r(fragmentJ);
                        }
                        for (Fragment fragment2 : arrayListU) {
                            zb5Var.q(fragment2, lkz.d);
                            zb5Var.m(fragment2);
                        }
                        zb5Var.h();
                    }
                }
                return Unit.f46060a;
        }
    }
}
