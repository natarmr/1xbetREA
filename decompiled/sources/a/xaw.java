package a;

import android.net.Uri;
import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class xaw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jrs0 f40575a;
    public final prc b;
    public final rsj c;
    public final b4x d;
    public final b4x e;
    public final b4x f;
    public final b4x g;
    public final HashSet h;
    public final HashSet i;
    public final q9o0 j;
    public boolean k;
    public String l;
    public b4x m;

    public xaw(psc pscVar, vuj vujVar, prc prcVar, rsj rsjVar) {
        this.f40575a = new jrs0(new viq(pscVar, (byte) 9));
        this.b = prcVar;
        this.c = rsjVar;
        b4x b4xVarD = vujVar.d(0);
        b4xVarD.getClass();
        this.d = b4xVarD;
        b4x b4xVarD2 = vujVar.d(1);
        b4xVarD2.getClass();
        this.e = b4xVarD2;
        b4x b4xVarD3 = vujVar.d(2);
        b4xVarD3.getClass();
        this.f = b4xVarD3;
        b4x b4xVarD4 = vujVar.d(3);
        b4xVarD4.getClass();
        this.g = b4xVarD4;
        x0x.K(!b4xVarD.isEmpty());
        tbw tbwVar = (tbw) b4xVarD.get(0);
        tbwVar.getClass();
        this.h = new HashSet(tbwVar.a());
        this.i = new HashSet();
        this.j = new q9o0(new Handler(vtt0.u(), null));
        this.l = ((tbw) b4xVarD.get(0)).d;
    }

    public static Uri.Builder b(Uri uri, tom0 tom0Var) {
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        String str = tom0Var.f34292a;
        if (str != null) {
            builderClearQuery.authority(str);
        }
        TreeMap treeMap = new TreeMap();
        for (String str2 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str2);
            queryParameter.getClass();
            treeMap.put(str2, queryParameter);
        }
        treeMap.putAll(tom0Var.b);
        for (Map.Entry entry : treeMap.entrySet()) {
            builderClearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderClearQuery;
    }

    public static void d(som0 som0Var, List list, u3x u3xVar, u3x u3xVar2) {
        Uri uriBuild;
        tom0 tom0Var = som0Var.c;
        wcf0 wcf0Var = tom0Var.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tbw tbwVar = (tbw) it.next();
            Uri uri = (Uri) tbwVar.b.get(som0Var.f32550a);
            String str = tbwVar.f33689a.b;
            uri.getClass();
            if (wcf0Var.containsKey(str)) {
                uriBuild = (Uri) wcf0Var.get(str);
                uriBuild.getClass();
            } else {
                uriBuild = b(uri, tom0Var).build();
            }
            if (uriBuild != null) {
                u3xVar.b(uriBuild);
                u3xVar2.b(uri);
            }
        }
    }

    public final boolean a(long j) {
        if (!this.k || this.m == null) {
            return false;
        }
        String str = this.l;
        e(j);
        if (this.l.equals(str)) {
            return false;
        }
        this.i.add(str);
        this.j.f28360a.postDelayed(new llo(this, str, (byte) 6), j);
        return true;
    }

    public final void c(long j) {
        String str = this.l;
        vuj vujVar = (vuj) this.b.b;
        boolean z = j == -9223372036854775807L && vujVar.s == null;
        for (uuj uujVar : vujVar.d.values()) {
            Uri uriB = j != -9223372036854775807L ? uujVar.f36302a.b() : null;
            if (uriB == null) {
                uujVar.f(str, z);
            } else {
                uujVar.a(uriB, j, str);
            }
        }
    }

    public final void e(long j) {
        String str = this.l;
        v3x v3xVarListIterator = this.m.listIterator(0);
        while (v3xVarListIterator.hasNext()) {
            String str2 = (String) v3xVarListIterator.next();
            if (j == -9223372036854775807L || !str2.equals(str)) {
                if (this.h.contains(str2) && !this.i.contains(str2)) {
                    this.l = str2;
                    break;
                }
            }
        }
        if (this.l.equals(str)) {
            return;
        }
        c(j);
    }

    public final void f() {
        jrs0 jrs0Var = this.f40575a;
        lhf0 lhf0Var = (lhf0) jrs0Var.j;
        if (lhf0Var != null) {
            lhf0Var.F(null);
            jrs0Var.j = null;
        }
        q9o0 q9o0Var = (q9o0) jrs0Var.i;
        if (q9o0Var != null) {
            q9o0Var.f();
            jrs0Var.i = null;
        }
        jrs0Var.f = null;
        jrs0Var.h = null;
        jrs0Var.g = null;
        jrs0Var.f17020a = false;
        this.j.f();
        this.k = false;
    }
}
