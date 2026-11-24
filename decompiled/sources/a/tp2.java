package a;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class tp2 implements kt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34311a;
    public final Set b;

    public tp2(String str, cu cuVar, qo qoVar, tkz tkzVar, us00 us00Var) {
        str.getClass();
        this.f34311a = str;
        this.b = tx3.l0(new kt2[]{new njj(us00Var), new njj(cuVar)});
        sac.T(new fnq(new eu4(Boolean.TRUE, (byte) 12), new pa(this, (yje) null, (byte) 27), (byte) 4), tkzVar, sp2.h);
    }

    @Override // a.kt2
    public final void a(String str, Map map) {
        map.getClass();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((kt2) it.next()).a(str, map);
        }
    }

    @Override // a.kt2
    public final void b(String str, String str2) {
        str2.getClass();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((kt2) it.next()).b(str, str2);
        }
    }

    @Override // a.kt2
    public final void c(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((kt2) it.next()).c(str);
        }
    }

    @Override // a.kt2
    public final void d(long j) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((kt2) it.next()).d(j);
        }
    }

    @Override // a.kt2
    public final void e() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((kt2) it.next()).e();
        }
    }

    @Override // a.kt2
    public final void f(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((kt2) it.next()).f(str);
        }
    }

    @Override // a.kt2
    public final void g(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((kt2) it.next()).g(z);
        }
        if (z) {
            b("ref_id", this.f34311a);
        }
    }
}
