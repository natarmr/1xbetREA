package a;

/* JADX INFO: loaded from: classes.dex */
public interface qpg0 extends AutoCloseable {
    default boolean P0() {
        throw new q660(this + " does not implement inTransaction().");
    }

    xpg0 Z0(String str);
}
