package a;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.subgames.impl.presentation.models.SelectedTabState;
import org.xplatform.ui_core.viewcomponents.tabs.TabLayoutChips;

/* JADX INFO: loaded from: classes6.dex */
public final class dym0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ eym0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dym0(eym0 eym0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = eym0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        eym0 eym0Var = this.k;
        switch (b) {
            case 0:
                dym0 dym0Var = new dym0(eym0Var, yjeVar, (byte) 0);
                dym0Var.j = obj;
                return dym0Var;
            case 1:
                dym0 dym0Var2 = new dym0(eym0Var, yjeVar, (byte) 1);
                dym0Var2.j = obj;
                return dym0Var2;
            default:
                dym0 dym0Var3 = new dym0(eym0Var, yjeVar, (byte) 2);
                dym0Var3.j = obj;
                return dym0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((dym0) create((owm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((dym0) create((SelectedTabState) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((dym0) create((wwm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        eym0 eym0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                owm0 owm0Var = (owm0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                gym0 gym0Var = eym0Var.N1;
                if (gym0Var == null) {
                    Intrinsics.h("subGamesFragmentDelegate");
                    throw null;
                }
                l5r l5rVarG0 = eym0Var.G0();
                androidx.fragment.app.e eVarC = eym0Var.C();
                eVarC.getClass();
                n6r n6rVarK = eym0Var.K();
                n6rVarK.b();
                glz glzVar = n6rVarK.c;
                cym0 cym0Var = new cym0(0, eym0Var.H0(), dzm0.class, "onTabScrollHandled", "onTabScrollHandled()V", 0, (byte) 0);
                j1l0 j1l0Var = new j1l0(eym0Var, (byte) 17);
                vd7 vd7Var = l5rVarG0.b;
                ComposeView composeView = (ComposeView) vd7Var.c;
                ConstraintLayout constraintLayout = (ConstraintLayout) vd7Var.b;
                uk5 uk5Var = l5rVarG0.c;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) uk5Var.b;
                TabLayoutChips tabLayoutChips = (TabLayoutChips) uk5Var.e;
                glzVar.getClass();
                owm0Var.getClass();
                if (owm0Var instanceof mwm0) {
                    mwm0 mwm0Var = (mwm0) owm0Var;
                    gym0Var.e = mwm0Var.c;
                    ViewPager2 viewPager2 = (ViewPager2) uk5Var.f;
                    if (viewPager2.getAdapter() == null) {
                        ex7 ex7Var = new ex7(eVarC, glzVar, gym0Var.f12138a, gym0Var.f);
                        ((yz3) ex7Var.n).b(gym0Var.e, null);
                        gym0Var.c = ex7Var;
                        viewPager2.setAdapter(ex7Var);
                        hhk hhkVar = new hhk(tabLayoutChips, viewPager2, new xn30(gym0Var, l5rVarG0.f19473a.getResources().getDimensionPixelSize(R.dimen.space_4), l5rVarG0, j1l0Var));
                        gym0Var.d = hhkVar;
                        hhkVar.a();
                    } else {
                        ex7 ex7Var2 = gym0Var.c;
                        if (ex7Var2 != null) {
                            ((yz3) ex7Var2.n).b(gym0Var.e, null);
                        }
                    }
                    gym0Var.a(l5rVarG0, mwm0Var.d, cym0Var);
                    constraintLayout2.setVisibility(0);
                    tabLayoutChips.setVisibility(0);
                    ((ImageView) uk5Var.g).setVisibility(mwm0Var.f22512a ? 0 : 8);
                    ((ImageView) uk5Var.d).setVisibility(mwm0Var.b ? 0 : 8);
                    constraintLayout.setVisibility(8);
                    composeView.setVisibility(8);
                    composeView.e();
                } else {
                    if (!owm0Var.equals(nwm0.f24241a)) {
                        t9f.b();
                        return null;
                    }
                    constraintLayout2.setVisibility(4);
                    constraintLayout.setVisibility(0);
                    ((TextView) vd7Var.d).setVisibility(8);
                    composeView.setVisibility(0);
                    b1j.t(composeView, new ugd(-2038214421, true, new edk0(gym0Var, (byte) 28)));
                }
                return Unit.f46060a;
            case 1:
                SelectedTabState selectedTabState = (SelectedTabState) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                gym0 gym0Var2 = eym0Var.N1;
                if (gym0Var2 != null) {
                    gym0Var2.a(eym0Var.G0(), selectedTabState, new cym0(0, eym0Var.H0(), dzm0.class, "onTabScrollHandled", "onTabScrollHandled()V", 0, (byte) 1));
                    return Unit.f46060a;
                }
                Intrinsics.h("subGamesFragmentDelegate");
                throw null;
            default:
                wwm0 wwm0Var = (wwm0) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean zD = Intrinsics.d(wwm0Var, vwm0.f38159a);
                uwm0 uwm0Var = uwm0.f36401a;
                if (zD) {
                    g9m0 g9m0Var = eym0.S1;
                    if (eym0Var.M1 == null) {
                        Intrinsics.h("subGameFiltersDialogFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC2 = eym0Var.C();
                    eVarC2.getClass();
                    hvm0.j2.getClass();
                    if (eVarC2.J("SUB_GAME_FILTERS_DIALOG_TAG") == null) {
                        new hvm0().H0(eVarC2, "SUB_GAME_FILTERS_DIALOG_TAG");
                    }
                    p7m0 p7m0Var = eym0Var.H0().o;
                    p7m0Var.getClass();
                    p7m0Var.o(null, uwm0Var);
                } else if (!Intrinsics.d(wwm0Var, uwm0Var)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
        }
    }
}
