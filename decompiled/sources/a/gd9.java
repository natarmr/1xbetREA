package a;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class gd9 {
    public static InputStream a(String str) {
        ClassLoader classLoader = gd9.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(resource.openConnection());
        uRLConnection.setUseCaches(false);
        return uRLConnection.getInputStream();
    }
}
