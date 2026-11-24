package a;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u560 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35080a;
    public final /* synthetic */ w560 b;

    public /* synthetic */ u560(w560 w560Var, byte b) {
        this.f35080a = b;
        this.b = w560Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35080a;
        d560 d560Var = d560.f5490a;
        w560 w560Var = this.b;
        switch (b) {
            case 0:
                uuz uuzVar = w560.Q1;
                fiu0 fiu0Var = w560Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                uuz uuzVar2 = w560.Q1;
                ComponentCallbacks2 application = w560Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(j560.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof j560)) {
                        ze3Var = null;
                    }
                    j560 j560Var = (j560) ze3Var;
                    if (j560Var != null) {
                        i1w0 i1w0VarF = a4n0.f(w560Var);
                        i1w0VarF.getClass();
                        btt0 btt0Var = j560Var.f15919a;
                        duj dujVar = j560Var.b;
                        mne mneVar = j560Var.c;
                        gii0 gii0Var = j560Var.d;
                        j1q0 j1q0Var = j560Var.e;
                        ilp0 ilp0Var = j560Var.f;
                        ii iiVar = j560Var.g;
                        ctf0 ctf0Var = j560Var.h;
                        ntu ntuVar = j560Var.i;
                        knf0 knf0Var = j560Var.j;
                        kuy kuyVar = j560Var.k;
                        i7u0 i7u0Var = j560Var.l;
                        q7u0 q7u0Var = j560Var.m;
                        btt0Var.getClass();
                        j1q0Var.getClass();
                        iiVar.getClass();
                        gii0Var.getClass();
                        ctf0Var.getClass();
                        knf0Var.getClass();
                        kuyVar.getClass();
                        return new fmi(new htz(), mneVar, i1w0VarF, btt0Var, j1q0Var, iiVar, dujVar, ilp0Var, ntuVar, knf0Var, kuyVar, i7u0Var, q7u0Var);
                    }
                }
                jf4.n(b1j.i(j560.class, "Cannot create dependency "));
                return null;
            case 2:
                uuz uuzVar3 = w560.Q1;
                return m7x.P(w560Var, "android.permission.CAMERA", new String[0]).d();
            case 3:
                uuz uuzVar4 = w560.Q1;
                w560Var.G0().x(d560Var);
                return Unit.f46060a;
            case 4:
                uuz uuzVar5 = w560.Q1;
                w560Var.G0().x(new c560(true));
                return Unit.f46060a;
            case 5:
                uuz uuzVar6 = w560.Q1;
                kxq kxqVarB = w560Var.B();
                if (kxqVarB != null) {
                    Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intentJ.setData(Uri.fromParts("package", kxqVarB.getPackageName(), null));
                    kxqVarB.startActivityForResult(intentJ, 555);
                    w560Var.G0().x(g560.f10703a);
                }
                return Unit.f46060a;
            default:
                uuz uuzVar7 = w560.Q1;
                w560Var.G0().x(d560Var);
                return Unit.f46060a;
        }
    }
}
