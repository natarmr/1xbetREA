package a;

/* JADX INFO: loaded from: classes2.dex */
public final class pgq extends pd90 {
    public final set c;

    public pgq(set setVar) {
        this.c = setVar;
    }

    @Override // a.pd90
    public final boolean a() {
        set setVar = this.c;
        if (!setVar.y()) {
            return false;
        }
        if (setVar.u() > 0 || setVar.t() > 0) {
            return true;
        }
        return setVar.x() && setVar.w().s();
    }
}
