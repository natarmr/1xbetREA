package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30213a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ tbz c;

    public rbz(tbz tbzVar, int i) {
        this.c = tbzVar;
        this.f30213a = i;
    }

    public final void a(int i) {
        tbz tbzVar = this.c;
        o24 o24Var = tbzVar.c;
        if (o24Var == null) {
            return;
        }
        this.b.add(new ktb0(o24Var, i, tbzVar.b, null));
    }
}
