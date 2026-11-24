package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i2d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14042a = new ArrayList();
    public final b9o0 b;
    public pfx c;
    public pfx d;
    public int e;
    public boolean f;

    public i2d0(b9o0 b9o0Var, ArrayList arrayList) {
        pfx pfxVar = pfx.e;
        this.c = pfxVar;
        this.d = pfxVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = b9o0Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            pfx pfxVar2 = b9o0Var.c;
            pfx pfxVar3 = b9o0Var.d;
            this.c = pfxVar2;
            this.d = pfxVar3;
            c();
            b(b9o0Var.e);
        }
        this.b = b9o0Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            p4d p4dVar = (p4d) list.get(i);
            p4dVar.getClass();
            if (true == z) {
                i2d0 i2d0Var = p4dVar.c;
                if (i2d0Var != null) {
                    throw new IllegalStateException(p4dVar + " (" + (i + 1) + Separators.SLASH + size + ") is already controlled by " + i2d0Var + " but is still added to " + this);
                }
                p4dVar.c = this;
                this.f14042a.add(p4dVar);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.f14042a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p4d p4dVar = (p4d) arrayList.get(size);
            if (!p4dVar.d && p4dVar.e != i) {
                p4dVar.e = i;
                throw null;
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f14042a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        p4d p4dVar = (p4d) arrayList.get(size);
        pfx pfxVar = this.c;
        pfx pfxVar2 = this.d;
        p4dVar.f26346a = pfxVar;
        p4dVar.b = pfxVar2;
        throw null;
    }
}
