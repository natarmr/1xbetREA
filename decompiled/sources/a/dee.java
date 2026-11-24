package a;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dee implements thl, b290, oz5, uky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y78 f5947a;
    public final RectF b;
    public final me60 c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final String g;
    public final boolean h;
    public final ArrayList i;
    public final bb10 j;
    public ArrayList k;
    public final hls0 l;

    public dee(bb10 bb10Var, tz5 tz5Var, String str, boolean z, ArrayList arrayList, z33 z33Var) {
        this.f5947a = new y78((byte) 10);
        this.b = new RectF();
        this.c = new me60();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.g = str;
        this.j = bb10Var;
        this.h = z;
        this.i = arrayList;
        if (z33Var != null) {
            hls0 hls0Var = new hls0(z33Var);
            this.l = hls0Var;
            hls0Var.a(tz5Var);
            hls0Var.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            qde qdeVar = (qde) arrayList.get(size);
            if (qdeVar instanceof sfv) {
                arrayList2.add((sfv) qdeVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((sfv) arrayList2.get(size2)).f(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // a.oz5
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // a.qde
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            qde qdeVar = (qde) arrayList.get(size2);
            qdeVar.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(qdeVar);
        }
    }

    @Override // a.b290
    public final Path c() {
        Matrix matrix = this.d;
        matrix.reset();
        hls0 hls0Var = this.l;
        if (hls0Var != null) {
            matrix.set(hls0Var.e());
        }
        Path path = this.e;
        path.reset();
        if (!this.h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                qde qdeVar = (qde) arrayList.get(size);
                if (qdeVar instanceof b290) {
                    path.addPath(((b290) qdeVar).c(), matrix);
                }
            }
        }
        return path;
    }

    @Override // a.uky
    public final void d(tky tkyVar, int i, ArrayList arrayList, tky tkyVar2) {
        String str = this.g;
        if (!tkyVar.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            tky tkyVar3 = new tky(tkyVar2);
            tkyVar3.f34119a.add(str);
            if (tkyVar.a(i, str)) {
                tky tkyVar4 = new tky(tkyVar3);
                tkyVar4.b = this;
                arrayList.add(tkyVar4);
            }
            tkyVar2 = tkyVar3;
        }
        if (!tkyVar.d(i, str)) {
            return;
        }
        int iB = tkyVar.b(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i2 >= arrayList2.size()) {
                return;
            }
            qde qdeVar = (qde) arrayList2.get(i2);
            if (qdeVar instanceof uky) {
                ((uky) qdeVar).d(tkyVar, iB, arrayList, tkyVar2);
            }
            i2++;
        }
    }

    @Override // a.thl
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        hls0 hls0Var = this.l;
        if (hls0Var != null) {
            matrix2.preConcat(hls0Var.e());
        }
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            qde qdeVar = (qde) arrayList.get(size);
            if (qdeVar instanceof thl) {
                ((thl) qdeVar).e(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List f() {
        if (this.k == null) {
            this.k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                qde qdeVar = (qde) arrayList.get(i);
                if (qdeVar instanceof b290) {
                    this.k.add((b290) qdeVar);
                }
                i++;
            }
        }
        return this.k;
    }

    @Override // a.uky
    public final void g(zn00 zn00Var, Object obj) {
        hls0 hls0Var = this.l;
        if (hls0Var != null) {
            hls0Var.c(zn00Var, obj);
        }
    }

    @Override // a.qde
    public final String getName() {
        throw null;
    }

    @Override // a.thl
    public final void h(Canvas canvas, Matrix matrix, int i, kil kilVar) {
        if (this.h) {
            return;
        }
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        hls0 hls0Var = this.l;
        if (hls0Var != null) {
            matrix2.preConcat(hls0Var.e());
            sz5 sz5Var = hls0Var.p;
            i = (int) (((((sz5Var == null ? 100 : ((Integer) sz5Var.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        bb10 bb10Var = this.j;
        boolean z = (bb10Var.s && i() && i != 255) || (kilVar != null && bb10Var.t && i());
        int i2 = z ? 255 : i;
        me60 me60Var = this.c;
        if (z) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            e(rectF, matrix, true);
            y78 y78Var = this.f5947a;
            y78Var.b = i;
            if (kilVar != null) {
                if (Color.alpha(kilVar.d) > 0) {
                    y78Var.c = kilVar;
                } else {
                    y78Var.c = null;
                }
                kilVar = null;
            } else {
                y78Var.c = null;
            }
            canvas = me60Var.e(canvas, rectF, y78Var);
        } else if (kilVar != null) {
            kil kilVar2 = new kil(kilVar);
            kilVar2.b(i2);
            kilVar = kilVar2;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof thl) {
                ((thl) obj).h(canvas, matrix2, i2, kilVar);
            }
        }
        if (z) {
            me60Var.c();
        }
    }

    public final boolean i() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof thl) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public dee(bb10 bb10Var, tz5 tz5Var, ikj0 ikj0Var, fa10 fa10Var) {
        z33 z33Var;
        String str = ikj0Var.f14929a;
        boolean z = ikj0Var.c;
        List list = ikj0Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            qde qdeVarA = ((lge) list.get(i2)).a(bb10Var, fa10Var, tz5Var);
            if (qdeVarA != null) {
                arrayList.add(qdeVarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                z33Var = null;
                break;
            }
            lge lgeVar = (lge) list.get(i);
            if (lgeVar instanceof z33) {
                z33Var = (z33) lgeVar;
                break;
            }
            i++;
        }
        this(bb10Var, tz5Var, str, z, arrayList, z33Var);
    }
}
