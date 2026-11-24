package com.github.terrakok.cicerone.androidx;

import a.m1r;
import a.xbf;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "cicerone"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FragmentScreen$Companion$invoke$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45456a;
    public final boolean b;
    public final /* synthetic */ xbf c;

    public FragmentScreen$Companion$invoke$1(String str, xbf xbfVar, boolean z) {
        this.c = xbfVar;
        this.f45456a = str == null ? xbfVar.getClass().getName() : str;
        this.b = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        return (Fragment) this.c.c(m1rVar);
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF46460a() {
        return this.f45456a;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }
}
