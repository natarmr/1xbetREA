package org.xplatform.feature.balance_management.impl.balance_management;

import a.bl5;
import a.ej5;
import a.fl5;
import a.j1q0;
import a.lk5;
import a.m1r;
import a.ol5;
import a.r9u;
import a.si5;
import a.t9f;
import a.ufx;
import a.ygp;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/feature/balance_management/impl/balance_management/BalanceManagementScreenFactoryImpl$getScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BalanceManagementScreenFactoryImpl$getScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lk5 f46641a;
    public final /* synthetic */ String b;

    public BalanceManagementScreenFactoryImpl$getScreen$1(lk5 lk5Var, String str) {
        this.f46641a = lk5Var;
        this.b = str;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        lk5 lk5Var = this.f46641a;
        int iOrdinal = lk5Var.f20182a.a().g.q.ordinal();
        String str = this.b;
        if (iOrdinal == 0) {
            r9u r9uVar = lk5Var.b;
            ygp ygpVar = ygp.t1;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            if (!j1q0Var.f15748a.d(ygpVar)) {
                ej5.V1.getClass();
                str.getClass();
                ej5 ej5Var = new ej5();
                ej5Var.P1 = str;
                return ej5Var;
            }
            si5.Q1.getClass();
            str.getClass();
            si5 si5Var = new si5();
            si5Var.O1.x(si5Var, si5.R1[1], str);
            return si5Var;
        }
        if (iOrdinal == 1) {
            ol5.R1.getClass();
            str.getClass();
            ol5 ol5Var = new ol5();
            ol5Var.O1 = str;
            return ol5Var;
        }
        if (iOrdinal == 2) {
            fl5.P1.getClass();
            str.getClass();
            fl5 fl5Var = new fl5();
            fl5Var.M1 = str;
            return fl5Var;
        }
        if (iOrdinal != 3) {
            t9f.b();
            return null;
        }
        bl5.R1.getClass();
        str.getClass();
        bl5 bl5Var = new bl5();
        bl5Var.O1 = str;
        return bl5Var;
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
