package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p78 extends b4e {
    @Override // a.b4e
    public final b4e c() {
        return (p78) ((b4e) this.b);
    }

    @Override // a.b4e
    public final void e(b4e b4eVar) {
        if (b4eVar instanceof p78) {
            this.b = b4eVar;
        } else {
            jf4.o("Parent of block must also be block (can not be inline)");
        }
    }
}
