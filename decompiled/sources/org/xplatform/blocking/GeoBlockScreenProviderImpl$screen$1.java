package org.xplatform.blocking;

import a.hkt;
import a.iiy;
import a.m1r;
import a.rlt;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/blocking/GeoBlockScreenProviderImpl$screen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "blocking"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GeoBlockScreenProviderImpl$screen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rlt f46434a;
    public final /* synthetic */ boolean b;

    public GeoBlockScreenProviderImpl$screen$1(rlt rltVar, boolean z) {
        this.f46434a = rltVar;
        this.b = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        hkt.Z1.getClass();
        hkt hktVar = new hkt();
        iiy[] iiyVarArr = hkt.a2;
        hktVar.O1.u(hktVar, iiyVarArr[1], this.f46434a);
        hktVar.P1.v(hktVar, iiyVarArr[2], this.b);
        return hktVar;
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
