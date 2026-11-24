package a;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class wzk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f40025a = ViewConfiguration.getScrollFriction();

    public static final sjj a(fet fetVar) {
        w6k w6kVar = (w6k) fetVar.k(bmd.h);
        boolean zD = fetVar.d(w6kVar.getDensity());
        Object objP = fetVar.P();
        if (zD || objP == ukd.f35823a) {
            objP = new sjj(new epi0(w6kVar));
            fetVar.o0(objP);
        }
        return (sjj) objP;
    }
}
