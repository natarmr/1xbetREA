package org.xplatform.client1.providers;

import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/client1/providers/PopularScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", Payload.TYPE_APP}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PopularScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f46447a;

    public PopularScreen(Function1 function1) {
        this.f46447a = function1;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        return (Fragment) this.f46447a.invoke(m1rVar);
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
