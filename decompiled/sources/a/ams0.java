package a;

/* JADX INFO: loaded from: classes.dex */
public interface ams0 {
    Object b();

    Object d();

    default boolean e(Object obj, Object obj2) {
        return obj.equals(d()) && obj2.equals(b());
    }
}
