package a;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class uxk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36444a;
    public String b;
    public float c;
    public int d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public PointF l;
    public PointF m;

    public final int hashCode() {
        int iE = ((hne.E(this.d) + (((int) (ua80.b(this.f36444a.hashCode() * 31, 31, this.b) + this.c)) * 31)) * 31) + this.e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((iE * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.h;
    }
}
