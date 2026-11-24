package a;

/* JADX INFO: loaded from: classes6.dex */
public interface k6l0 extends m6l0 {
    long a();

    qzl c();

    @Override // a.a2n
    default String getKey() {
        long jA = a();
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(jA);
        return sb.toString();
    }
}
