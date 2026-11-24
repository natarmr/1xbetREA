package a;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dkj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6233a;
    public PointF b;
    public boolean c;

    public dkj0(PointF pointF, boolean z, List list) {
        this.b = pointF;
        this.c = z;
        this.f6233a = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.f6233a.size());
        sb.append("closed=");
        return brm0.o(sb, this.c, '}');
    }

    public dkj0() {
        this.f6233a = new ArrayList();
    }
}
