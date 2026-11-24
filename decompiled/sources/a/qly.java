package a;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class qly implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28957a;
    public final /* synthetic */ iha b;

    public qly(iha ihaVar) {
        this.b = ihaVar;
        kxq kxqVar = (kxq) ihaVar.c;
        this.f28957a = b8k0.S(kxqVar, ihaVar.b(), b8k0.N(kxqVar));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        iha ihaVar = this.b;
        kxq kxqVar = (kxq) ihaVar.c;
        int iN = b8k0.N(kxqVar);
        boolean zS = b8k0.S(kxqVar, ihaVar.b(), iN);
        if (!zS) {
            ihaVar.b = ihaVar.b() - iN;
        }
        int iB = (ihaVar.b() - iN) - ihaVar.b;
        boolean z = ihaVar.f14770a == iB;
        if (zS != this.f28957a) {
            ihaVar.a(iB, zS);
            this.f28957a = zS;
            ihaVar.f14770a = iB;
        } else {
            if (z) {
                return;
            }
            ihaVar.a(iB, zS);
            ihaVar.f14770a = iB;
        }
    }
}
