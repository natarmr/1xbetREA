package a;

import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class f4c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8908a;
    public final FloatBuffer b;
    public final FloatBuffer c;
    public final byte d;

    public f4c0(tyc tycVar) {
        float[] fArr = (float[]) tycVar.d;
        this.f8908a = fArr.length / 3;
        this.b = n4c.K(fArr);
        this.c = n4c.K((float[]) tycVar.e);
        int i = tycVar.c;
        if (i == 1) {
            this.d = (byte) 5;
        } else if (i != 2) {
            this.d = (byte) 4;
        } else {
            this.d = (byte) 6;
        }
    }
}
