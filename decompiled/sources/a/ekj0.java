package a;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class ekj0 implements l3u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ekj0 f7955a = new ekj0();
    public static final edu b = edu.q("c", "v", "i", "o");

    @Override // a.l3u0
    public final Object z0(ndy ndyVar, float f) {
        if (ndyVar.w() == 1) {
            ndyVar.a();
        }
        ndyVar.c();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zN = false;
        while (ndyVar.l()) {
            int iY = ndyVar.y(b);
            if (iY == 0) {
                zN = ndyVar.n();
            } else if (iY == 1) {
                arrayListC = vdy.c(ndyVar, f);
            } else if (iY == 2) {
                arrayListC2 = vdy.c(ndyVar, f);
            } else if (iY != 3) {
                ndyVar.F();
                ndyVar.H();
            } else {
                arrayListC3 = vdy.c(ndyVar, f);
            }
        }
        ndyVar.e();
        if (ndyVar.w() == 2) {
            ndyVar.d();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            jf4.o("Shape data was missing information.");
            return null;
        }
        if (arrayListC.isEmpty()) {
            return new dkj0(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new atf(ah40.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), ah40.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zN) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new atf(ah40.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), ah40.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new dkj0(pointF, zN, arrayList);
    }
}
