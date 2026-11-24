package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class i7m0 implements jot0, opt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1a f14299a;
    public final lz4 b;
    public final tpt0 c;
    public final Object d;
    public pot0 e;
    public final ArrayList f;
    public long g;
    public int h;
    public int i;
    public boolean j;
    public Integer k;
    public Integer l;

    public i7m0(l1a l1aVar, lz4 lz4Var, tpt0 tpt0Var) {
        l1aVar.getClass();
        tpt0Var.getClass();
        this.f14299a = l1aVar;
        this.b = lz4Var;
        this.c = tpt0Var;
        this.d = new Object();
        this.f = new ArrayList();
        this.h = 2;
        this.i = 1;
    }

    @Override // a.opt0
    public final void a(LinkedHashSet linkedHashSet) {
        yje yjeVar = null;
        qjj.W(this.c.f, null, null, new ssl0(yjeVar, (Object) CollectionsKt.P0(linkedHashSet), (Object) this, (byte) 6), 3);
    }

    @Override // a.jot0
    public final void b(pot0 pot0Var) {
        this.e = pot0Var;
        f();
    }

    public final void c(Exception exc) {
        List listL0;
        synchronized (this.d) {
            listL0 = CollectionsKt.L0(this.f);
            this.f.clear();
        }
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            ((odd) ((ndd) it.next())).b0(exc);
        }
    }

    public final int d(int i, boolean z, Integer num) {
        int iB;
        if (num != null) {
            iB = num.intValue();
        } else if (i != 0) {
            iB = i != 1 ? 1 : 3;
        } else {
            iB = this.b.b();
        }
        if (z && b34.m0(this.f14299a.b)) {
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "State3AControl.invalidate: trying external flash AE mode.");
            }
            iB = 5;
        }
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "State3AControl.getFinalPreferredAeMode: preferAeMode = " + iB);
        }
        return iB;
    }

    public final int e() {
        int iJ0;
        synchronized (this.d) {
            iJ0 = b34.j0(this.f14299a.b, d(this.h, this.j, this.k));
        }
        return iJ0;
    }

    public final odd f() {
        odd oddVar = new odd();
        lie0 lie0Var = new lie0();
        synchronized (this.d) {
            this.f.add(oddVar);
            long j = this.g + 1;
            this.g = j;
            lie0Var.f20100a = j;
        }
        qjj.W(this.c.f, null, null, new ssl0((yje) null, (Object) this, (Object) lie0Var, (byte) 7), 3);
        return oddVar;
    }

    @Override // a.jot0
    public final void reset() {
        synchronized (this.d) {
            this.j = false;
            this.k = null;
            this.l = null;
            this.h = 2;
            this.i = 1;
        }
        f();
    }
}
