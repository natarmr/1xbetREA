package a;

/* JADX INFO: loaded from: classes6.dex */
public interface q56 extends y56 {
    long a();

    n76 b();

    nem c();

    t76 d();

    @Override // a.a2n
    default String getKey() {
        long jA = a();
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(jA);
        return sb.toString();
    }
}
