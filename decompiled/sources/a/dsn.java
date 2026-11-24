package a;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dsn implements b290, oz5, vky {
    public final String b;
    public final bb10 c;
    public final ubv d;
    public final sz5 e;
    public final kjc f;
    public boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f6618a = new Path();
    public final emd g = new emd((byte) 0);

    public dsn(bb10 bb10Var, tz5 tz5Var, kjc kjcVar) {
        this.b = kjcVar.f18380a;
        this.c = bb10Var;
        sz5 sz5VarF0 = kjcVar.c.f0();
        this.d = (ubv) sz5VarF0;
        sz5 sz5VarF1 = kjcVar.b.f0();
        this.e = sz5VarF1;
        this.f = kjcVar;
        tz5Var.f(sz5VarF0);
        tz5Var.f(sz5VarF1);
        sz5VarF0.a(this);
        sz5VarF1.a(this);
    }

    @Override // a.oz5
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // a.qde
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            qde qdeVar = (qde) arrayList.get(i);
            if (qdeVar instanceof lrs0) {
                lrs0 lrs0Var = (lrs0) qdeVar;
                if (lrs0Var.c == 1) {
                    this.g.f8040a.add(lrs0Var);
                    lrs0Var.d(this);
                }
            }
            i++;
        }
    }

    @Override // a.b290
    public final Path c() {
        boolean z = this.h;
        Path path = this.f6618a;
        if (z) {
            return path;
        }
        path.reset();
        kjc kjcVar = this.f;
        if (kjcVar.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (kjcVar.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.a(path);
        this.h = true;
        return path;
    }

    @Override // a.uky
    public final void d(tky tkyVar, int i, ArrayList arrayList, tky tkyVar2) {
        ah40.g(tkyVar, i, arrayList, tkyVar2, this);
    }

    @Override // a.uky
    public final void g(zn00 zn00Var, Object obj) {
        if (obj == nb10.f) {
            this.d.j(zn00Var);
        } else if (obj == nb10.i) {
            this.e.j(zn00Var);
        }
    }

    @Override // a.qde
    public final String getName() {
        return this.b;
    }
}
