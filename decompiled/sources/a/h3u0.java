package a;

/* JADX INFO: loaded from: classes2.dex */
public final class h3u0 extends ar30 {
    public final byte c;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public h3u0(int i) {
        StringBuilder sbM = b1j.m(i, "must have at least ", " value parameter");
        sbM.append(i > 1 ? "s" : "");
        super(sbM.toString(), (byte) 1);
        this.c = i;
    }

    @Override // a.eyb
    public final boolean b(u9y u9yVar) {
        return u9yVar.z().size() >= this.c;
    }
}
