package a;

/* JADX INFO: loaded from: classes6.dex */
public interface zfa extends gga {
    long a();

    @Override // a.a2n
    default String getKey() {
        long jA = a();
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(jA);
        return sb.toString();
    }
}
