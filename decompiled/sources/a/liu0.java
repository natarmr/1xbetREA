package a;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class liu0 extends niu0 {
    public static liu0 c;
    public static final wxs0 d = new wxs0(8);
    public final Application b;

    public liu0(Application application) {
        this.b = application;
    }

    @Override // a.niu0, a.miu0
    public final diu0 b(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        v4i0.p("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // a.niu0, a.miu0
    public final diu0 c(Class cls, by40 by40Var) {
        if (this.b != null) {
            return b(cls);
        }
        Application application = (Application) by40Var.f38875a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!m33.class.isAssignableFrom(cls)) {
            return x1x.B(cls);
        }
        jf4.o("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final diu0 d(Class cls, Application application) {
        if (!m33.class.isAssignableFrom(cls)) {
            return x1x.B(cls);
        }
        try {
            diu0 diu0Var = (diu0) cls.getConstructor(Application.class).newInstance(application);
            diu0Var.getClass();
            return diu0Var;
        } catch (IllegalAccessException e) {
            e9d0.l("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            e9d0.l("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            e9d0.l("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            e9d0.l("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
