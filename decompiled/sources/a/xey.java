package a;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class xey extends q0x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40765a;

    public xey(Class cls) {
        cls.getClass();
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        this.f40765a = tx3.Y(declaredMethods, new wpv((byte) 4));
    }

    @Override // a.q0x
    public final String H() {
        return CollectionsKt.b0(this.f40765a, "", "<init>(", ")V", j9x.i, 24);
    }
}
