package a;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final erq f6803a = new erq(brq.c, wxv.b, false, le60.f19885a, new wqq(0, 0, 0, 0));

    public static final bwk a(ahk ahkVar) {
        zhk thkVar;
        tjv0 tjv0Var;
        ahkVar.getClass();
        Configuration configuration = ahkVar.f879a;
        int i = configuration.smallestScreenWidthDp;
        erq erqVar = ahkVar.c;
        int i2 = configuration.screenWidthDp;
        if (erqVar != null) {
            int iOrdinal = erqVar.f8294a.ordinal();
            boolean z = false;
            if (iOrdinal == 0) {
                tjv0.f34069a.getClass();
                if (i2 < 411) {
                    tjv0Var = tjv0.b;
                } else {
                    tjv0Var = i2 < 640 ? tjv0.c : tjv0.d;
                }
                if (tjv0Var == tjv0.b) {
                    z = true;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                z = true;
            }
            thkVar = new thk(z);
        } else {
            thkVar = i >= 600 ? xhk.f40896a : vhk.f37434a;
        }
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        la80 la80Var = i3 > i4 ? la80.b : la80.f19694a;
        float f = i3;
        float f2 = i4;
        w6k w6kVar = ahkVar.b;
        float f3 = configuration.fontScale;
        if (erqVar == null) {
            erqVar = ahkVar.f ? f6803a : null;
        }
        return new bwk(thkVar, la80Var, f, f2, w6kVar, f3, erqVar, ahkVar.d, ahkVar.e, 56.0f);
    }
}
