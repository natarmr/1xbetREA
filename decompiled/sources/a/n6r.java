package a;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class n6r implements wmv, i0h0, riu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23008a;
    public final piu0 b;
    public glz c;
    public miu0 d;
    public final Object e;
    public final Object f;
    public Object g;

    public n6r(kd30 kd30Var, piu0 piu0Var, glz glzVar, miu0 miu0Var, wbf wbfVar, Bundle bundle) {
        this.f23008a = (byte) 1;
        this.e = kd30Var;
        this.b = piu0Var;
        this.c = glzVar;
        this.d = miu0Var;
        this.f = wbfVar;
        this.g = bundle;
        if (kd30Var.L("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            zzg0.b(this);
        }
    }

    public void a(kkz kkzVar) {
        this.c.d(kkzVar);
    }

    public void b() {
        if (this.c == null) {
            this.c = new glz(this, true);
            h0h0 h0h0Var = new h0h0(this, new a7g0(this, (byte) 12));
            this.g = new nw20(h0h0Var);
            h0h0Var.a();
            ((vwq) this.f).run();
        }
    }

    @Override // a.riu0
    public final piu0 g() {
        byte b = this.f23008a;
        piu0 piu0Var = this.b;
        switch (b) {
            case 0:
                b();
                break;
        }
        return piu0Var;
    }

    @Override // a.i0h0
    public final kd30 h() {
        switch (this.f23008a) {
            case 0:
                b();
                return (kd30) ((nw20) this.g).b;
            default:
                return (kd30) this.e;
        }
    }

    @Override // a.wmv
    public final miu0 n() {
        Application application;
        switch (this.f23008a) {
            case 0:
                Fragment fragment = (Fragment) this.e;
                miu0 miu0VarN = fragment.n();
                if (miu0VarN != fragment.y1) {
                    this.d = miu0VarN;
                    return miu0VarN;
                }
                miu0 miu0Var = this.d;
                if (miu0Var != null) {
                    return miu0Var;
                }
                for (Context applicationContext = fragment.o0().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        r0h0 r0h0Var = new r0h0(application, fragment, fragment.g);
                        this.d = r0h0Var;
                        return r0h0Var;
                    }
                }
                application = null;
                r0h0 r0h0Var2 = new r0h0(application, fragment, fragment.g);
                this.d = r0h0Var2;
                return r0h0Var2;
            default:
                return this.d;
        }
    }

    @Override // a.wmv
    public final by40 o() {
        Application application;
        byte b = this.f23008a;
        gne0 gne0Var = zzg0.b;
        lme0 lme0Var = zzg0.f45252a;
        cge0 cge0Var = zzg0.c;
        switch (b) {
            case 0:
                Fragment fragment = (Fragment) this.e;
                Context applicationContext = fragment.o0().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                by40 by40Var = new by40(0);
                LinkedHashMap linkedHashMap = by40Var.f38875a;
                if (application != null) {
                    linkedHashMap.put(liu0.d, application);
                }
                linkedHashMap.put(lme0Var, fragment);
                linkedHashMap.put(gne0Var, this);
                Bundle bundle = fragment.g;
                if (bundle != null) {
                    linkedHashMap.put(cge0Var, bundle);
                }
                return by40Var;
            default:
                by40 by40Var2 = new by40((wbf) this.f);
                Bundle bundle2 = (Bundle) this.g;
                lun.f20680a.getClass();
                Bundle bundleV = i120.V((Pair[]) Arrays.copyOf(new Pair[0], 0));
                LinkedHashMap linkedHashMap2 = by40Var2.f38875a;
                Bundle bundle3 = (Bundle) linkedHashMap2.get(cge0Var);
                if (bundle3 != null) {
                    bundleV.putAll(bundle3);
                }
                bundle2.getClass();
                bundleV.putAll(bundle2);
                linkedHashMap2.put(cge0Var, bundleV);
                linkedHashMap2.put(lme0Var, this);
                linkedHashMap2.put(gne0Var, this);
                return by40Var2;
        }
    }

    @Override // a.clz
    public final glz x() {
        switch (this.f23008a) {
            case 0:
                b();
                break;
        }
        return this.c;
    }

    public n6r(Fragment fragment, piu0 piu0Var, vwq vwqVar) {
        this.f23008a = (byte) 0;
        this.c = null;
        this.g = null;
        this.e = fragment;
        this.b = piu0Var;
        this.f = vwqVar;
    }
}
