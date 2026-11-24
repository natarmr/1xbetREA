package a;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.discipline.presentation.model.DisciplineListParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.presentation.CyberMainDisciplinesParams;

/* JADX INFO: loaded from: classes4.dex */
public final class w4h extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ y4h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4h(y4h y4hVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = y4hVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        y4h y4hVar = this.k;
        switch (b) {
            case 0:
                w4h w4hVar = new w4h(y4hVar, yjeVar, (byte) 0);
                w4hVar.j = obj;
                return w4hVar;
            case 1:
                w4h w4hVar2 = new w4h(y4hVar, yjeVar, (byte) 1);
                w4hVar2.j = obj;
                return w4hVar2;
            default:
                w4h w4hVar3 = new w4h(y4hVar, yjeVar, (byte) 2);
                w4hVar3.j = obj;
                return w4hVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((w4h) create((z4h) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((w4h) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((w4h) create((rz10) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        y4h y4hVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (((z4h) obj2) instanceof z4h) {
                    if (y4hVar.N1 == null) {
                        Intrinsics.h("tipsDialogFeature");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC = y4hVar.C();
                    eVarC.getClass();
                    uuz uuzVar = fk60.b;
                    ki60.q2.getClass();
                    if (eVarC.J("OnboardingBottomSheetContainerFragment") == null) {
                        ki60 ki60Var = new ki60();
                        iiy[] iiyVarArr = ki60.r2;
                        ki60Var.n2.I(ki60Var, iiyVarArr[1], 7);
                        ki60Var.o2.x(ki60Var, iiyVarArr[2], "");
                        sj3.E0(ki60Var, eVarC, "OnboardingBottomSheetContainerFragment");
                    }
                }
                return Unit.f46060a;
            case 1:
                String str = (String) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                kwd kwdVar = y4h.W1;
                c5h c5hVar = (c5h) y4hVar.R1.getValue();
                str.getClass();
                p7m0 p7m0Var = c5hVar.q;
                p7m0Var.o(null, l120.a((l120) p7m0Var.getValue(), str, false, false, false, false, 251));
                return Unit.f46060a;
            default:
                rz10 rz10Var = (rz10) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                qz10 qz10Var = (qz10) CollectionsKt.W(rz10Var.c, rz10Var.f31337a);
                if (qz10Var == null) {
                    qz10Var = (qz10) CollectionsKt.firstOrNull(rz10Var.f31337a);
                }
                if (qz10Var != null) {
                    CyberGamesPage cyberGamesPage = qz10Var.b;
                    kwd kwdVar2 = y4h.W1;
                    androidx.fragment.app.e eVarC2 = y4hVar.C();
                    eVarC2.getClass();
                    String name = cyberGamesPage.getClass().getName();
                    List listP = eVarC2.c.p();
                    ArrayList<Fragment> arrayListU = twn.u(listP);
                    for (Object obj3 : listP) {
                        Fragment fragment = (Fragment) obj3;
                        if (!fragment.O() && !Intrinsics.d(fragment.B, name)) {
                            arrayListU.add(obj3);
                        }
                    }
                    Fragment fragmentJ = eVarC2.J(name);
                    if (!arrayListU.isEmpty() || fragmentJ == null || !fragmentJ.S()) {
                        zb5 zb5Var = new zb5(eVarC2);
                        zb5Var.p(R.anim.nav_default_enter_anim, R.anim.nav_default_exit_anim, R.anim.nav_default_pop_enter_anim, R.anim.nav_default_pop_exit_anim);
                        if (fragmentJ == null) {
                            if (!(((CyberMainDisciplinesParams) y4hVar.Q1.n(y4hVar, y4h.X1[0])) instanceof CyberMainDisciplinesParams.Disciplines)) {
                                t9f.b();
                                return null;
                            }
                            if (y4hVar.P1 == null) {
                                Intrinsics.h("cyberGamesFragmentFactory");
                                throw null;
                            }
                            DisciplineListParams disciplineListParams = new DisciplineListParams(cyberGamesPage);
                            ptk.U1.getClass();
                            ptk ptkVar = new ptk();
                            ptkVar.N1.J(ptkVar, ptk.V1[0], disciplineListParams);
                            zb5Var.k(R.id.fragmentContainer, ptkVar, name, 1);
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
