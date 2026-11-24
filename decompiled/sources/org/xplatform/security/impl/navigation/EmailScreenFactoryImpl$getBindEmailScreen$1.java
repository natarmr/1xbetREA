package org.xplatform.security.impl.navigation;

import a.j28;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.security.api.presentation.models.BindEmailScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/security/impl/navigation/EmailScreenFactoryImpl$getBindEmailScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class EmailScreenFactoryImpl$getBindEmailScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BindEmailScreenParams f46944a;

    public EmailScreenFactoryImpl$getBindEmailScreen$1(BindEmailScreenParams bindEmailScreenParams) {
        this.f46944a = bindEmailScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        j28.R1.getClass();
        BindEmailScreenParams bindEmailScreenParams = this.f46944a;
        bindEmailScreenParams.getClass();
        j28 j28Var = new j28();
        j28Var.N1.J(j28Var, j28.S1[0], bindEmailScreenParams);
        return j28Var;
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
