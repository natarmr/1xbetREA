package a;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* JADX INFO: loaded from: classes2.dex */
public abstract class one {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f25542a;

    static {
        try {
            f25542a = pgi0.t(lgi0.b(Arrays.asList(new AndroidExceptionPreHandler(), new qjo()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
