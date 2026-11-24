package org.xplatform.bet_history.edit_event.presentation;

import a.iiy;
import a.m1r;
import a.ufx;
import a.xon;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/edit_event/presentation/EditEventFragmentScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class EditEventFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46391a;
    public final boolean b;
    public final long c;

    public EditEventFragmentScreen(long j, boolean z, long j2) {
        this.f46391a = j;
        this.b = z;
        this.c = j2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        xon.S1.getClass();
        xon xonVar = new xon();
        iiy[] iiyVarArr = xon.U1;
        xonVar.K1.j(xonVar, iiyVarArr[0], this.f46391a);
        xonVar.L1.v(xonVar, iiyVarArr[1], this.b);
        xonVar.M1.j(xonVar, iiyVarArr[2], this.c);
        return xonVar;
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
