package a;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f29090a;
    public final Object b;
    public final Method c;
    public final List d;

    public qox(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f29090a = cls;
        this.b = obj;
        this.c = method;
        this.d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f29090a.getName(), this.c.getName(), this.d);
    }
}
