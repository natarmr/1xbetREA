package a;

/* JADX INFO: loaded from: classes6.dex */
public interface b2o0 extends c2o0 {
    long a();

    m5o0 b();

    nem c();

    s5o0 d();

    @Override // a.a2n
    default String getKey() {
        long jA = a();
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(jA);
        return sb.toString();
    }
}
