package a;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class suj implements rbw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vuj f32823a;

    public suj(vuj vujVar) {
        this.f32823a = vujVar;
    }

    @Override // a.rbw
    public final void a() {
        this.f32823a.e.remove(this);
    }

    @Override // a.rbw
    public final boolean f(Uri uri, y78 y78Var, boolean z) {
        vuj vujVar = this.f32823a;
        HashMap map = vujVar.d;
        if (vujVar.s == null) {
            xaw xawVar = vujVar.m;
            boolean z2 = xawVar != null && xawVar.k;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            uuj uujVar = (uuj) map.get(uri);
            uujVar.getClass();
            tbw tbwVar = uujVar.f36302a;
            int size = tbwVar.b.size();
            eet0 it = f4x.m(tbwVar.b.values()).iterator();
            int i = 0;
            while (it.hasNext()) {
                if (vujVar.g((Uri) it.next(), jElapsedRealtime)) {
                    i++;
                }
            }
            int size2 = vujVar.n.size();
            v3x v3xVarListIterator = vujVar.n.listIterator(0);
            int i2 = 0;
            while (v3xVarListIterator.hasNext()) {
                tbw tbwVar2 = (tbw) v3xVarListIterator.next();
                if (z2 ? vujVar.g(tbwVar2.b(), jElapsedRealtime) : vujVar.f(tbwVar2, jElapsedRealtime)) {
                    i2++;
                }
            }
            dmk dmkVar = new dmk(z2, size, i, size2, i2);
            vujVar.c.getClass();
            un00 un00VarC = x860.c(dmkVar, y78Var);
            if (un00VarC != null) {
                long j = un00VarC.b;
                if (z2 && un00VarC.f35939a == 1) {
                    xaw xawVar2 = vujVar.m;
                    xawVar2.getClass();
                    return xawVar2.a(j);
                }
                uuj uujVar2 = (uuj) map.get(uri);
                if (uujVar2 != null) {
                    return uujVar2.a(uri, j, null);
                }
            }
        }
        return false;
    }
}
