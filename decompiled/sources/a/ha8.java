package a;

/* JADX INFO: loaded from: classes3.dex */
public interface ha8 {
    Object a();

    default String getKey() {
        Object objA = a();
        return String.valueOf(objA != null ? objA.hashCode() : 0);
    }
}
