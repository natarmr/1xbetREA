package a;

import android.content.ComponentCallbacks2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fxk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10314a;
    public final /* synthetic */ gxk b;

    public /* synthetic */ fxk(gxk gxkVar, byte b) {
        this.f10314a = b;
        this.b = gxkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10314a;
        gxk gxkVar = this.b;
        switch (b) {
            case 0:
                xak xakVar = gxk.n2;
                ComponentCallbacks2 application = gxkVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(jxk.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof jxk)) {
                        ze3Var = null;
                    }
                    jxk jxkVar = (jxk) ze3Var;
                    if (jxkVar != null) {
                        kxk kxkVar = (kxk) gxkVar.m2.n(gxkVar, gxk.o2[0]);
                        mne mneVar = jxkVar.f17309a;
                        wdk0 wdk0Var = jxkVar.b;
                        knf0 knf0Var = jxkVar.d;
                        ctf0 ctf0Var = jxkVar.e;
                        gii0 gii0Var = jxkVar.c;
                        knf0Var.getClass();
                        gii0Var.getClass();
                        wdk0Var.getClass();
                        ctf0Var.getClass();
                        return new mfi(kxkVar, mneVar, knf0Var, gii0Var, wdk0Var, ctf0Var);
                    }
                }
                jf4.n(b1j.i(jxk.class, "Cannot create dependency "));
                return null;
            default:
                xak xakVar2 = gxk.n2;
                return (lfi) ((mfi) gxkVar.k2.getValue()).g.get();
        }
    }
}
