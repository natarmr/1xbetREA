package a;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidDispatcherFactory;
import kotlinx.coroutines.test.internal.TestMainDispatcherFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ys10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vs10 f43147a;

    static {
        String property;
        int i = bao0.f2270a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            List listT = pgi0.t(lgi0.b(Arrays.asList(new AndroidDispatcherFactory(), new TestMainDispatcherFactory()).iterator()));
            Iterator it = listT.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iB = ((xs10) next).b();
                    do {
                        Object next2 = it.next();
                        int iB2 = ((xs10) next2).b();
                        if (iB < iB2) {
                            next = next2;
                            iB = iB2;
                        }
                    } while (it.hasNext());
                }
            }
            xs10 xs10Var = (xs10) next;
            if (xs10Var != null) {
                f43147a = xs10Var.a(listT);
            } else {
                jf4.n("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
