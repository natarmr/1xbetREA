package a;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: classes6.dex */
public final class rre0 extends gle0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30980a;

    @Override // a.gle0
    public String d(Method method, int i) {
        switch (this.f30980a) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                    return super.d(method, i);
                }
                return "parameter '" + parameter.getName() + '\'';
            default:
                return super.d(method, i);
        }
    }

    @Override // a.gle0
    public final Object e(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.f30980a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 26) {
                    return ibc.q0(method, cls, obj, objArr);
                }
                v4i0.p("Calling default methods on API 24 and 25 is not supported");
                return null;
            default:
                return ibc.q0(method, cls, obj, objArr);
        }
    }

    @Override // a.gle0
    public final boolean f(Method method) {
        switch (this.f30980a) {
            case 0:
                break;
        }
        return method.isDefault();
    }
}
