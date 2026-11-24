package a;

/* JADX INFO: loaded from: classes6.dex */
public interface w56 extends y56 {
    long a();

    i96 b();

    nem c();

    o96 d();

    @Override // a.a2n
    default String getKey() {
        long jA = a();
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(jA);
        return sb.toString();
    }
}
