package a;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r0h0 implements miu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f29630a;
    public final liu0 b;
    public final Bundle c;
    public final glz d;
    public final kd30 e;

    public r0h0(Application application, i0h0 i0h0Var, Bundle bundle) {
        liu0 liu0Var;
        this.e = i0h0Var.h();
        this.d = i0h0Var.x();
        this.c = bundle;
        this.f29630a = application;
        if (application != null) {
            liu0Var = liu0.c;
            if (liu0Var == null) {
                liu0Var = new liu0(application);
                liu0.c = liu0Var;
            }
        } else {
            liu0Var = new liu0(null);
        }
        this.b = liu0Var;
    }

    @Override // a.miu0
    public final diu0 a(sgy sgyVar, by40 by40Var) {
        sgyVar.getClass();
        return c(azw.G(sgyVar), by40Var);
    }

    @Override // a.miu0
    public final diu0 b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        jf4.o("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // a.miu0
    public final diu0 c(Class cls, by40 by40Var) {
        LinkedHashMap linkedHashMap = by40Var.f38875a;
        String str = (String) linkedHashMap.get(oiu0.f25329a);
        if (str == null) {
            jf4.n("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(zzg0.f45252a) == null || linkedHashMap.get(zzg0.b) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            jf4.n("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(liu0.d);
        boolean zIsAssignableFrom = m33.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? s0h0.a(cls, s0h0.b) : s0h0.a(cls, s0h0.f31408a);
        if (constructorA == null) {
            return this.b.c(cls, by40Var);
        }
        return (!zIsAssignableFrom || application == null) ? s0h0.b(cls, constructorA, zzg0.a(by40Var)) : s0h0.b(cls, constructorA, application, zzg0.a(by40Var));
    }

    public final diu0 d(Class cls, String str) {
        vzg0 vzg0Var;
        glz glzVar = this.d;
        if (glzVar == null) {
            v4i0.p("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = m33.class.isAssignableFrom(cls);
        Application application = this.f29630a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? s0h0.a(cls, s0h0.b) : s0h0.a(cls, s0h0.f31408a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.b(cls);
            }
            niu0 niu0Var = niu0.f23607a;
            if (niu0Var == null) {
                niu0Var = new niu0();
                niu0.f23607a = niu0Var;
            }
            return niu0Var.b(cls);
        }
        kd30 kd30Var = this.e;
        kd30Var.getClass();
        Bundle bundleH = kd30Var.H(str);
        if (bundleH == null) {
            bundleH = this.c;
        }
        if (bundleH == null) {
            vzg0Var = new vzg0();
        } else {
            ClassLoader classLoader = vzg0.class.getClassLoader();
            classLoader.getClass();
            bundleH.setClassLoader(classLoader);
            vzg0Var = new vzg0(b8k0.a0(bundleH));
        }
        wzg0 wzg0Var = new wzg0(str, vzg0Var);
        wzg0Var.a(kd30Var, glzVar);
        lkz lkzVar = glzVar.i;
        if (lkzVar == lkz.b || lkzVar.compareTo(lkz.d) >= 0) {
            kd30Var.V();
        } else {
            glzVar.a(new lz2((Object) glzVar, (Object) kd30Var, (byte) 4));
        }
        diu0 diu0VarB = (!zIsAssignableFrom || application == null) ? s0h0.b(cls, constructorA, vzg0Var) : s0h0.b(cls, constructorA, application, vzg0Var);
        diu0VarB.s("androidx.lifecycle.savedstate.vm.tag", wzg0Var);
        return diu0VarB;
    }
}
