package a;

import java.io.IOException;
import java.lang.reflect.Method;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes7.dex */
public final class io80 extends q8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f15107a;
    public final int b;
    public final vke c;

    public io80(Method method, int i, vke vkeVar) {
        this.f15107a = method;
        this.b = i;
        this.c = vkeVar;
    }

    @Override // a.q8x
    public final void y(emf0 emf0Var, Object obj) {
        int i = this.b;
        Method method = this.f15107a;
        if (obj == null) {
            throw ay3.Z(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            emf0Var.k = (RequestBody) this.c.o(obj);
        } catch (IOException e) {
            throw ay3.a0(method, e, i, f140.k(obj, "Unable to convert ", " to RequestBody"), new Object[0]);
        }
    }
}
