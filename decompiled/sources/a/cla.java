package a;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugg0 f4547a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        zcl zclVar = qmk.f28987a;
        f4547a = vgg0.a(16.0f);
        b = 38.0f;
        c = 38.0f;
        d = 24.0f;
        e = 44.0f;
    }

    public static float a(fet fetVar) {
        if (((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp >= 360) {
            zcl zclVar = qmk.f28987a;
            return 24.0f;
        }
        zcl zclVar2 = qmk.f28987a;
        return 12.0f;
    }
}
