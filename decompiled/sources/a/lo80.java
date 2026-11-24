package a;

import java.lang.reflect.Method;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes7.dex */
public final class lo80 extends q8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20379a;
    public final Method b;
    public final int c;

    public /* synthetic */ lo80(Method method, int i, byte b) {
        this.f20379a = b;
        this.b = method;
        this.c = i;
    }

    @Override // a.q8x
    public final void y(emf0 emf0Var, Object obj) {
        byte b = this.f20379a;
        int i = this.c;
        Method method = this.b;
        switch (b) {
            case 0:
                Headers headers = (Headers) obj;
                if (headers == null) {
                    throw ay3.Z(method, i, "Headers parameter must not be null.", new Object[0]);
                }
                emf0Var.f.b(headers);
                return;
            default:
                if (obj == null) {
                    throw ay3.Z(method, i, "@Url parameter is null.", new Object[0]);
                }
                emf0Var.c = obj.toString();
                return;
        }
    }
}
