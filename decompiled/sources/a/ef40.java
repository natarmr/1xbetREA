package a;

/* JADX INFO: loaded from: classes3.dex */
public interface ef40 {
    default String getKey() {
        String strJ = sre0.f32672a.b(getClass()).J();
        return strJ == null ? "" : strJ;
    }

    vbj getState();
}
