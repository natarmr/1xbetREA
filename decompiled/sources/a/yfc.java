package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class yfc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42534a;
    public final /* synthetic */ Application b;

    public /* synthetic */ yfc(Application application, byte b) {
        this.f42534a = b;
        this.b = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42534a;
        ComponentCallbacks2 componentCallbacks2 = this.b;
        switch (b) {
            case 0:
                af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(fgc.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof fgc)) {
                        ze3Var = null;
                    }
                    fgc fgcVar = (fgc) ze3Var;
                    if (fgcVar != null) {
                        cad cadVar = fgcVar.f9484a;
                        iw20 iw20Var = fgcVar.b;
                        ii iiVar = fgcVar.c;
                        nv20 nv20Var = fgcVar.d;
                        iqt iqtVar = fgcVar.e;
                        c1d0 c1d0Var = fgcVar.f;
                        gr70 gr70Var = fgcVar.g;
                        sue sueVar = fgcVar.h;
                        ctf0 ctf0Var = fgcVar.i;
                        wgu wguVar = fgcVar.j;
                        gr70Var.getClass();
                        sueVar.getClass();
                        iiVar.getClass();
                        c1d0Var.getClass();
                        ctf0Var.getClass();
                        wguVar.getClass();
                        return new mji(cadVar, iw20Var, nv20Var, iqtVar, ctf0Var, wguVar);
                    }
                }
                jf4.n(b1j.i(fgc.class, "Cannot create dependency "));
                return null;
            default:
                af3 af3Var2 = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
                if (af3Var2 != null) {
                    o5d0 o5d0Var2 = (o5d0) af3Var2.d().get(bk60.class);
                    ze3 ze3Var2 = o5d0Var2 != null ? (ze3) o5d0Var2.get() : null;
                    if (!(ze3Var2 instanceof bk60)) {
                        ze3Var2 = null;
                    }
                    bk60 bk60Var = (bk60) ze3Var2;
                    if (bk60Var != null) {
                        nr00 nr00Var = bk60Var.b;
                        wsf0 wsf0Var = bk60Var.f2735a;
                        mne mneVar = bk60Var.c;
                        ctf0 ctf0Var2 = bk60Var.d;
                        r990 r990Var = bk60Var.e;
                        v6k v6kVar = bk60Var.f;
                        i1w0 i1w0VarC = bk60Var.g.c();
                        kt2 kt2Var = bk60Var.h;
                        ix0 ix0Var = bk60Var.i;
                        l7k l7kVar = bk60Var.j;
                        ih5 ih5Var = bk60Var.k;
                        ctf0Var2.getClass();
                        i1w0VarC.getClass();
                        kt2Var.getClass();
                        return new kmi(nr00Var, v6kVar, wsf0Var, mneVar, ctf0Var2, r990Var, i1w0VarC, kt2Var, ix0Var, l7kVar, ih5Var);
                    }
                }
                jf4.n(b1j.i(bk60.class, "Cannot create dependency "));
                return null;
        }
    }
}
