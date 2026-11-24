package org.xplatform.web.impl.di.feature;

import a.ca70;
import a.csr;
import a.htz;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class WebGameScreenFactoryImpl$getWebGameScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f47318a;
    public final /* synthetic */ csr b;
    public final /* synthetic */ boolean c;

    public WebGameScreenFactoryImpl$getWebGameScreen$1(long j, csr csrVar, boolean z) {
        this.f47318a = j;
        this.b = csrVar;
        this.c = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        htz htzVar = ca70.U1;
        String string = UUID.randomUUID().toString();
        string.getClass();
        htzVar.getClass();
        return htz.g(this.f47318a, this.b, true, this.c, string);
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
