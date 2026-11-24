package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iyw0 implements tmw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y50 f15608a = new y50((byte) 20);

    public static bww0 a(nrw0 nrw0Var) {
        vow0 vow0Var = new vow0((byte) 23);
        byte[] bArr = bww0.c;
        if (bww0.a(vow0.b())) {
            return new bww0(((icw0) nrw0Var.b.b).b(), nrw0Var.c.b(), vow0Var);
        }
        jf4.n("Cipher does not implement AES GCM SIV.");
        return null;
    }
}
