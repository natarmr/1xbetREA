package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n7v extends g8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23059a;
    public final /* synthetic */ o7v b;

    public n7v(ArrayList arrayList, o7v o7vVar) {
        this.f23059a = arrayList;
        this.b = o7vVar;
    }

    @Override // a.g8x
    public final void t(mp9 mp9Var) {
        mp9Var.getClass();
        sf80.r(mp9Var, null);
        this.f23059a.add(mp9Var);
    }

    @Override // a.g8x
    public final void y(mp9 mp9Var, mp9 mp9Var2) {
        throw new IllegalStateException(("Conflict in scope of " + this.b.b + ": " + mp9Var + " vs " + mp9Var2).toString());
    }
}
