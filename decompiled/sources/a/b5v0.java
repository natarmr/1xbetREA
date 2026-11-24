package a;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b5v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h5v0 f2025a;

    static {
        h5v0 jtvVar;
        try {
            jtvVar = new rkt0((WebViewProviderFactoryBoundaryInterface) rq8.G(WebViewProviderFactoryBoundaryInterface.class, osm0.h()), (byte) 8);
        } catch (ClassNotFoundException unused) {
            jtvVar = new jtv();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            ohq.p(e);
            return;
        }
        f2025a = jtvVar;
    }
}
