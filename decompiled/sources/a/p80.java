package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gmt f26530a;
    public final ztt b;
    public final wkt0 c;
    public final r80 d;
    public final mne e;

    public p80(gmt gmtVar, ztt zttVar, wkt0 wkt0Var, r80 r80Var, mne mneVar) {
        this.f26530a = gmtVar;
        this.b = zttVar;
        this.c = wkt0Var;
        this.d = r80Var;
        this.e = mneVar;
    }

    public static double a(List list) {
        list.getClass();
        Iterator it = list.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += ((t70) it.next()).f33442a;
        }
        return d;
    }
}
