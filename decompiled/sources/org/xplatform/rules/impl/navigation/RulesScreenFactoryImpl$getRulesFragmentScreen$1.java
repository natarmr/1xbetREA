package org.xplatform.rules.impl.navigation;

import a.iiy;
import a.m1r;
import a.ufx;
import a.wlg0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.rules.api.presentation.models.RuleData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RulesScreenFactoryImpl$getRulesFragmentScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RuleData f46907a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public RulesScreenFactoryImpl$getRulesFragmentScreen$1(RuleData ruleData, int i, boolean z, boolean z2, boolean z3) {
        this.f46907a = ruleData;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        wlg0.X1.getClass();
        wlg0 wlg0Var = new wlg0();
        iiy[] iiyVarArr = wlg0.Y1;
        wlg0Var.R1.v(wlg0Var, iiyVarArr[3], true);
        wlg0Var.P1.J(wlg0Var, iiyVarArr[1], this.f46907a);
        wlg0Var.Q1.I(wlg0Var, iiyVarArr[2], this.b);
        wlg0Var.S1.v(wlg0Var, iiyVarArr[4], false);
        wlg0Var.U1.v(wlg0Var, iiyVarArr[5], this.c);
        wlg0Var.V1.v(wlg0Var, iiyVarArr[6], this.d);
        wlg0Var.W1.v(wlg0Var, iiyVarArr[7], this.e);
        return wlg0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return ufx.C(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
