package org.xplatform.favorites.impl.di;

import a.b160;
import a.cl5;
import a.g5b;
import a.gl5;
import a.gnc;
import a.kl5;
import a.m1r;
import a.t9f;
import a.tcp;
import a.ufx;
import a.vcp;
import a.xra;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/favorites/impl/di/FavoritesScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FavoritesScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46632a;
    public final vcp b;
    public final tcp c;

    public FavoritesScreen(boolean z, vcp vcpVar, tcp tcpVar) {
        this.f46632a = z;
        this.b = vcpVar;
        this.c = tcpVar;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        boolean z = this.f46632a;
        tcp tcpVar = this.c;
        if (!z) {
            kl5 kl5Var = gnc.Z1;
            if (tcpVar == null) {
                tcpVar = tcp.GAMES;
            }
            kl5Var.getClass();
            gnc gncVar = new gnc();
            gncVar.L1.u(gncVar, gnc.a2[0], tcpVar);
            return gncVar;
        }
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            kl5 kl5Var2 = gnc.Z1;
            if (tcpVar == null) {
                tcpVar = tcp.GAMES;
            }
            kl5Var2.getClass();
            gnc gncVar2 = new gnc();
            gncVar2.L1.u(gncVar2, gnc.a2[0], tcpVar);
            return gncVar2;
        }
        if (iOrdinal == 1) {
            b160.O1.getClass();
            return new b160();
        }
        if (iOrdinal == 2) {
            cl5 cl5Var = xra.X1;
            if (tcpVar == null) {
                tcpVar = tcp.GAMES;
            }
            cl5Var.getClass();
            xra xraVar = new xra();
            xraVar.L1.u(xraVar, xra.Y1[0], tcpVar);
            return xraVar;
        }
        if (iOrdinal != 3) {
            t9f.b();
            return null;
        }
        gl5 gl5Var = g5b.c2;
        if (tcpVar == null) {
            tcpVar = tcp.GAMES;
        }
        gl5Var.getClass();
        g5b g5bVar = new g5b();
        g5bVar.L1.u(g5bVar, g5b.d2[0], tcpVar);
        return g5bVar;
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
