package org.xplatform.rules.impl.navigation;

import a.iiy;
import a.j1q0;
import a.lmg0;
import a.m1r;
import a.r9u;
import a.ufx;
import a.x790;
import a.ygp;
import a.yox;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yox f46904a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    public PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1(yox yoxVar, int i, String str, int i2, boolean z) {
        this.f46904a = yoxVar;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        r9u r9uVar = (r9u) this.f46904a.f43005a;
        ygp ygpVar = ygp.C1;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        boolean z = this.e;
        int i = this.d;
        String str = this.c;
        int i2 = this.b;
        if (zD) {
            x790.V1.getClass();
            x790 x790Var = new x790();
            iiy[] iiyVarArr = x790.W1;
            x790Var.P1.I(x790Var, iiyVarArr[1], i2);
            x790Var.Q1.x(x790Var, iiyVarArr[2], str);
            x790Var.R1.I(x790Var, iiyVarArr[3], i);
            x790Var.S1.v(x790Var, iiyVarArr[4], z);
            return x790Var;
        }
        lmg0.Y1.getClass();
        lmg0 lmg0Var = new lmg0();
        iiy[] iiyVarArr2 = lmg0.Z1;
        lmg0Var.Q1.I(lmg0Var, iiyVarArr2[1], i2);
        lmg0Var.R1.x(lmg0Var, iiyVarArr2[2], str);
        lmg0Var.S1.I(lmg0Var, iiyVarArr2[3], i);
        lmg0Var.U1.v(lmg0Var, iiyVarArr2[4], z);
        return lmg0Var;
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
