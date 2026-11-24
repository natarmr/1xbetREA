package a;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ckj0 implements b290, oz5, vky {
    public final String b;
    public final boolean c;
    public final bb10 d;
    public final lkj0 e;
    public boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f4509a = new Path();
    public final emd g = new emd((byte) 0);

    public ckj0(bb10 bb10Var, tz5 tz5Var, ukj0 ukj0Var) {
        this.b = ukj0Var.f35829a;
        this.c = ukj0Var.d;
        this.d = bb10Var;
        lkj0 lkj0Var = new lkj0((List) ukj0Var.c.b);
        this.e = lkj0Var;
        tz5Var.f(lkj0Var);
        lkj0Var.a(this);
    }

    @Override // a.oz5
    public final void a() {
        this.f = false;
        this.d.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d A[SYNTHETIC] */
    @Override // a.qde
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.e.m = arrayList;
                return;
            }
            qde qdeVar = (qde) arrayList2.get(i);
            if (qdeVar instanceof lrs0) {
                lrs0 lrs0Var = (lrs0) qdeVar;
                if (lrs0Var.c == 1) {
                    this.g.f8040a.add(lrs0Var);
                    lrs0Var.d(this);
                } else if (!(qdeVar instanceof ygg0)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    ygg0 ygg0Var = (ygg0) qdeVar;
                    ygg0Var.b.a(this);
                    arrayList.add(ygg0Var);
                }
            } else if (!(qdeVar instanceof ygg0)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ygg0 ygg0Var2 = (ygg0) qdeVar;
                ygg0Var2.b.a(this);
                arrayList.add(ygg0Var2);
            }
            i++;
        }
    }

    @Override // a.b290
    public final Path c() {
        boolean z = this.f;
        lkj0 lkj0Var = this.e;
        Path path = this.f4509a;
        if (z && lkj0Var.e == null) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.f = true;
            return path;
        }
        Path path2 = (Path) lkj0Var.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.g.a(path);
        this.f = true;
        return path;
    }

    @Override // a.uky
    public final void d(tky tkyVar, int i, ArrayList arrayList, tky tkyVar2) {
        ah40.g(tkyVar, i, arrayList, tkyVar2, this);
    }

    @Override // a.uky
    public final void g(zn00 zn00Var, Object obj) {
        if (obj == nb10.N) {
            this.e.j(zn00Var);
        }
    }

    @Override // a.qde
    public final String getName() {
        return this.b;
    }
}
