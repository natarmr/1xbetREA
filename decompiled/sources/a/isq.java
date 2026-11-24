package a;

import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes.dex */
public abstract class isq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f15318a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile gnk0 b = new gnk0(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.c(115, new jsq(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.c(130, new jsq(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.c(150, new jsq(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.c(180, new jsq(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.c(Response.OK, new jsq(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.b(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        zcx.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static hsq a(float f) {
        float fB;
        hsq jsqVar;
        float[] fArr = f15318a;
        if (f < 1.03f) {
            return null;
        }
        gnk0 gnk0Var = b;
        int i = (int) (f * 100.0f);
        gnk0Var.getClass();
        hsq hsqVar = (hsq) j2e.L(gnk0Var, i);
        if (hsqVar != null) {
            return hsqVar;
        }
        gnk0 gnk0Var2 = b;
        int iX = jd8.X(gnk0Var2.c, i, gnk0Var2.f11593a);
        if (iX >= 0) {
            return (hsq) b.d(iX);
        }
        int i2 = -(iX + 1);
        int i3 = i2 - 1;
        if (i2 >= b.c) {
            jsq jsqVar2 = new jsq(new float[]{1.0f}, new float[]{f});
            b(f, jsqVar2);
            return jsqVar2;
        }
        if (i3 < 0) {
            jsqVar = new jsq(fArr, fArr);
            fB = 1.0f;
        } else {
            fB = b.b(i3) / 100.0f;
            jsqVar = (hsq) b.d(i3);
        }
        float fB2 = b.b(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fB == fB2 ? 0.0f : (f - fB) / (fB2 - fB))) * 1.0f) + 0.0f;
        hsq hsqVar2 = (hsq) b.d(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fB3 = jsqVar.b(f2);
            fArr2[i4] = ((hsqVar2.b(f2) - fB3) * fMax) + fB3;
        }
        jsq jsqVar3 = new jsq(fArr, fArr2);
        b(f, jsqVar3);
        return jsqVar3;
    }

    public static void b(float f, jsq jsqVar) {
        synchronized (c) {
            gnk0 gnk0VarA = b.clone();
            gnk0VarA.c((int) (f * 100.0f), jsqVar);
            b = gnk0VarA;
        }
    }
}
