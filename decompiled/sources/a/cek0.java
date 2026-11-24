package a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cek0 extends lek0 {
    public final /* synthetic */ byte c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cek0(int i, byte b) {
        super(false, i);
        this.c = b;
        switch (b) {
            case 1:
                super(true, i);
                this.d = i;
                break;
            default:
                this.d = i;
                break;
        }
    }

    @Override // a.lek0
    public final int a() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.d;
    }
}
