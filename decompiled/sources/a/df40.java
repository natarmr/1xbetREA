package a;

/* JADX INFO: loaded from: classes3.dex */
public interface df40 {
    default String getKey() {
        String strJ = sre0.f32672a.b(getClass()).J();
        return strJ == null ? "" : strJ;
    }

    fyx getState();
}
