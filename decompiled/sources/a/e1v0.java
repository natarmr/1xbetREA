package a;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class e1v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f7056a;
    public final int b;

    public e1v0(ClassLoader classLoader) {
        classLoader.getClass();
        this.f7056a = new WeakReference(classLoader);
        this.b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e1v0) && this.f7056a.get() == ((e1v0) obj).f7056a.get();
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f7056a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
