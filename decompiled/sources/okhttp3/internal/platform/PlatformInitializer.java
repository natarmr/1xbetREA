package okhttp3.internal.platform;

import a.iun;
import a.pbx;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "La/pbx;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlatformInitializer implements pbx {
    @Override // a.pbx
    public final List a() {
        return iun.f15405a;
    }

    @Override // a.pbx
    public final Object b(Context context) {
        context.getClass();
        Platform platform = Platform.f46208a;
        Object obj = Platform.f46208a;
        ContextAwarePlatform contextAwarePlatform = obj != null ? (ContextAwarePlatform) obj : null;
        if (contextAwarePlatform != null) {
            contextAwarePlatform.b(context);
        }
        return Platform.f46208a;
    }
}
