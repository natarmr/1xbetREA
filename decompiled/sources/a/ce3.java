package a;

/* JADX INFO: loaded from: classes.dex */
public final class ce3 extends lwq {
    public final /* synthetic */ ie3 j;
    public final /* synthetic */ androidx.appcompat.widget.b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce3(androidx.appcompat.widget.b bVar, androidx.appcompat.widget.b bVar2, ie3 ie3Var) {
        super(bVar2);
        this.k = bVar;
        this.j = ie3Var;
    }

    @Override // a.lwq
    public final tsj0 b() {
        return this.j;
    }

    @Override // a.lwq
    public final boolean c() {
        androidx.appcompat.widget.b bVar = this.k;
        if (bVar.getInternalPopup().f()) {
            return true;
        }
        bVar.f.m(bVar.getTextDirection(), bVar.getTextAlignment());
        return true;
    }
}
