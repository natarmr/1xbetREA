package a;

import android.gov.nist.core.Separators;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class igd implements p5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14730a;
    public final /* synthetic */ Object b;

    public /* synthetic */ igd(Object obj, byte b) {
        this.f14730a = b;
        this.b = obj;
    }

    @Override // a.p5d0
    public final Object get() {
        byte b = this.f14730a;
        Object obj = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new cox("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new cox(kng0.l("Could not instantiate ", str, Separators.DOT), e);
                } catch (InstantiationException e2) {
                    throw new cox(kng0.l("Could not instantiate ", str, Separators.DOT), e2);
                } catch (NoSuchMethodException e3) {
                    throw new cox(kng0.k("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new cox(kng0.k("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new zxw((nfq) obj);
        }
    }
}
