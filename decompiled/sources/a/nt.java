package a;

/* JADX INFO: loaded from: classes3.dex */
public final class nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mii0 f24073a;

    public /* synthetic */ nt(mii0 mii0Var) {
        this.f24073a = mii0Var;
    }

    public boolean a() {
        boolean z = false;
        for (mms mmsVar : ((gs6) this.f24073a.c).f11814a) {
            int i = mmsVar.i.f;
            m6m0 m6m0Var = bop0.b;
            if (i != 0 || mmsVar.j.f != 0) {
                z = true;
            }
        }
        return !z;
    }
}
