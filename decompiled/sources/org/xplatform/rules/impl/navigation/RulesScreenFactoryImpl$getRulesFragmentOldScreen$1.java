package org.xplatform.rules.impl.navigation;

import a.bmg0;
import a.iiy;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.rules.api.presentation.models.RuleData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RulesScreenFactoryImpl$getRulesFragmentOldScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RuleData f46906a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public RulesScreenFactoryImpl$getRulesFragmentOldScreen$1(RuleData ruleData, int i, boolean z) {
        this.f46906a = ruleData;
        this.b = i;
        this.c = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        bmg0.Z1.getClass();
        bmg0 bmg0Var = new bmg0();
        iiy[] iiyVarArr = bmg0.a2;
        bmg0Var.S1.v(bmg0Var, iiyVarArr[3], true);
        bmg0Var.Q1.J(bmg0Var, iiyVarArr[1], this.f46906a);
        bmg0Var.R1.I(bmg0Var, iiyVarArr[2], this.b);
        bmg0Var.U1.v(bmg0Var, iiyVarArr[4], false);
        bmg0Var.V1.v(bmg0Var, iiyVarArr[5], this.c);
        bmg0Var.W1.v(bmg0Var, iiyVarArr[6], false);
        bmg0Var.X1.v(bmg0Var, iiyVarArr[7], false);
        return bmg0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF46460a() {
        return ufx.C(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
