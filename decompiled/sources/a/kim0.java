package a;

/* JADX INFO: loaded from: classes6.dex */
public interface kim0 extends mim0 {
    long a();

    vmm0 b();

    pim0 e();

    @Override // a.a2n
    default String getKey() {
        long jA = a();
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(jA);
        return sb.toString();
    }
}
