package a;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class uuj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbw f36302a;
    public final HashMap b;
    public final boolean c;
    public final /* synthetic */ vuj d;

    public uuj(vuj vujVar, tbw tbwVar, boolean z) {
        this.d = vujVar;
        this.f36302a = tbwVar;
        HashMap map = new HashMap();
        eet0 it = tbwVar.a().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) tbwVar.b.get(str);
            uri.getClass();
            map.put(uri, new tuj(this.d, uri, str));
        }
        this.b = map;
        this.c = z;
    }

    public final boolean a(Uri uri, long j, String str) {
        Uri uri2;
        HashMap map = this.b;
        x0x.K(map.containsKey(uri));
        tuj tujVar = (tuj) map.get(uri);
        tujVar.getClass();
        tujVar.i = SystemClock.elapsedRealtime() + j;
        vuj vujVar = this.d;
        xaw xawVar = vujVar.m;
        if ((!(xawVar != null && xawVar.k && str == null) && f(str, false)) || !((uri2 = vujVar.r) == null || uri.equals(uri2))) {
            return true;
        }
        b4x b4xVar = vujVar.n;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < b4xVar.size(); i++) {
            Uri uriB = ((tbw) b4xVar.get(i)).b();
            uuj uujVar = (uuj) vujVar.d.get(uriB);
            uujVar.getClass();
            if (!uujVar.c(uriB, jElapsedRealtime)) {
                vujVar.r = uriB;
                uujVar.d(uriB, vujVar.e(uriB));
                return true;
            }
        }
        return false;
    }

    public final ibw b(Uri uri) {
        HashMap map = this.b;
        x0x.K(map.containsKey(uri));
        tuj tujVar = (tuj) map.get(uri);
        tujVar.getClass();
        return tujVar.e;
    }

    public final boolean c(Uri uri, long j) {
        HashMap map = this.b;
        x0x.K(map.containsKey(uri));
        tuj tujVar = (tuj) map.get(uri);
        tujVar.getClass();
        return j <= tujVar.i;
    }

    public final void d(Uri uri, Uri uri2) {
        HashMap map = this.b;
        x0x.K(map.containsKey(uri));
        tuj tujVar = (tuj) map.get(uri);
        tujVar.getClass();
        tujVar.d(uri2);
    }

    public final void e(boolean z, Uri uri) {
        HashMap map = this.b;
        x0x.K(map.containsKey(uri));
        tuj tujVar = (tuj) map.get(uri);
        tujVar.getClass();
        tujVar.d(z ? tujVar.b() : tujVar.f34553a);
    }

    public final boolean f(String str, boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        tbw tbwVar = this.f36302a;
        HashMap map = this.b;
        if (str == null) {
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                tuj tujVar = (tuj) it.next();
                if (!tujVar.b.contains(tbwVar.d) && jElapsedRealtime > tujVar.i) {
                    str = (String) tujVar.b.iterator().next();
                    break;
                }
            }
        } else {
            for (tuj tujVar2 : map.values()) {
                if (tujVar2.b.contains(str)) {
                    tujVar2.i = 0L;
                }
            }
        }
        if (str == null) {
            return false;
        }
        Uri uriB = tbwVar.b();
        x0x.K(tbwVar.b.containsKey(str));
        tbwVar.d = str;
        Uri uriB2 = tbwVar.b();
        vuj vujVar = this.d;
        if (uriB.equals(vujVar.r)) {
            vujVar.i(z, uriB2);
        }
        tuj tujVar3 = (tuj) map.get(uriB);
        tujVar3.getClass();
        tuj tujVar4 = (tuj) map.get(uriB2);
        tujVar4.getClass();
        tujVar4.l = tujVar3.l;
        tujVar3.l = false;
        return true;
    }
}
