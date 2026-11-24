package org.xplatform.feature.office.payment.impl.di.navigation;

import a.iiy;
import a.j1q0;
import a.m1r;
import a.o890;
import a.r790;
import a.r990;
import a.r9u;
import a.ufx;
import a.ygp;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentRedirectionScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PaymentScreenFactoryImpl$getPaymentRedirectionScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r990 f46651a;
    public final /* synthetic */ String b;

    public PaymentScreenFactoryImpl$getPaymentRedirectionScreen$1(r990 r990Var, String str) {
        this.f46651a = r990Var;
        this.b = str;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        r9u r9uVar = this.f46651a.f30068a;
        ygp ygpVar = ygp.e;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        String str = this.b;
        if (zD) {
            r790.Z1.getClass();
            r790 r790Var = new r790();
            iiy[] iiyVarArr = r790.a2;
            r790Var.X1.v(r790Var, iiyVarArr[3], false);
            r790Var.Y1.I(r790Var, iiyVarArr[4], 0);
            r790Var.W1.x(r790Var, iiyVarArr[2], str);
            r790Var.V1.j(r790Var, iiyVarArr[1], 0L);
            return r790Var;
        }
        o890.f2.getClass();
        o890 o890Var = new o890();
        iiy[] iiyVarArr2 = o890.g2;
        o890Var.d2.v(o890Var, iiyVarArr2[3], false);
        o890Var.e2.I(o890Var, iiyVarArr2[4], 0);
        o890Var.c2.x(o890Var, iiyVarArr2[2], str);
        o890Var.b2.j(o890Var, iiyVarArr2[1], 0L);
        return o890Var;
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
