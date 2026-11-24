package a;

import android.content.ComponentCallbacks2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zs00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44885a;
    public final /* synthetic */ ct00 b;

    public /* synthetic */ zs00(ct00 ct00Var, byte b) {
        this.f44885a = b;
        this.b = ct00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44885a;
        ct00 ct00Var = this.b;
        switch (b) {
            case 0:
                atz atzVar = ct00.n2;
                ComponentCallbacks2 application = ct00Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(et00.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof et00)) {
                        ze3Var = null;
                    }
                    et00 et00Var = (et00) ze3Var;
                    if (et00Var != null) {
                        ft00 ft00VarP0 = ct00Var.P0();
                        mne mneVar = et00Var.f8353a;
                        wdk0 wdk0Var = et00Var.b;
                        p4u p4uVar = et00Var.c;
                        kpt kptVar = et00Var.d;
                        wdk0Var.getClass();
                        return new zji(ft00VarP0, mneVar, wdk0Var, p4uVar, kptVar);
                    }
                }
                jf4.n(b1j.i(et00.class, "Cannot create dependency "));
                return null;
            default:
                atz atzVar2 = ct00.n2;
                return (yji) ((zji) ct00Var.k2.getValue()).f.get();
        }
    }
}
