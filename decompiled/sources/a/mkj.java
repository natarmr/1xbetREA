package a;

/* JADX INFO: loaded from: classes.dex */
public final class mkj extends syx {
    public final int e;
    public final int f;

    public mkj(int i, int i2, int i3) throws bwq {
        super(i, (byte) 2);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw bwq.a();
        }
        this.e = i2;
        this.f = i3;
    }
}
