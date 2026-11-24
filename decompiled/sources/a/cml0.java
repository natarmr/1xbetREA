package a;

/* JADX INFO: loaded from: classes6.dex */
public interface cml0 extends jml0 {
    long a();

    ynl0 b();

    kol0 d();

    @Override // a.a2n
    default String getKey() {
        long jA = a();
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(jA);
        return sb.toString();
    }
}
