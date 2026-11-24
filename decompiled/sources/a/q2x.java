package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class q2x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28023a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final p2x j;
    public boolean k;

    public q2x(float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        String str = (i2 & 1) != 0 ? "" : "Filled.Close";
        long j2 = (i2 & 32) != 0 ? y3d.g : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.f28023a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        p2x p2xVar = new p2x(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = p2xVar;
        arrayList.add(p2xVar);
    }
}
