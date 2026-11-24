package a;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class mre0 implements Function0 {
    public static final eke0 c = new eke0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f22268a;
    public volatile SoftReference b;

    public mre0(Object obj, Function0 function0) {
        if (function0 == null) {
            jf4.o("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            throw null;
        }
        this.b = null;
        this.f22268a = function0;
        if (obj != null) {
            this.b = new SoftReference(obj);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        Object obj2 = c;
        SoftReference softReference = this.b;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.f22268a.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.b = new SoftReference(obj2);
        return objInvoke;
    }
}
