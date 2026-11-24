package a;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class vdy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final edu f37255a = edu.q("x", "y");

    public static int a(ndy ndyVar) {
        ndyVar.a();
        int iQ = (int) (ndyVar.q() * 255.0d);
        int iQ2 = (int) (ndyVar.q() * 255.0d);
        int iQ3 = (int) (ndyVar.q() * 255.0d);
        while (ndyVar.l()) {
            ndyVar.H();
        }
        ndyVar.d();
        return Color.argb(255, iQ, iQ2, iQ3);
    }

    public static PointF b(ndy ndyVar, float f) {
        int iE = hne.E(ndyVar.w());
        if (iE == 0) {
            ndyVar.a();
            float fQ = (float) ndyVar.q();
            float fQ2 = (float) ndyVar.q();
            while (ndyVar.w() != 2) {
                ndyVar.H();
            }
            ndyVar.d();
            return new PointF(fQ * f, fQ2 * f);
        }
        if (iE != 2) {
            if (iE != 6) {
                jf4.o("Unknown point starts with ".concat(w6x.B(ndyVar.w())));
                return null;
            }
            float fQ3 = (float) ndyVar.q();
            float fQ4 = (float) ndyVar.q();
            while (ndyVar.l()) {
                ndyVar.H();
            }
            return new PointF(fQ3 * f, fQ4 * f);
        }
        ndyVar.c();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (ndyVar.l()) {
            int iY = ndyVar.y(f37255a);
            if (iY == 0) {
                fD = d(ndyVar);
            } else if (iY != 1) {
                ndyVar.F();
                ndyVar.H();
            } else {
                fD2 = d(ndyVar);
            }
        }
        ndyVar.e();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(ndy ndyVar, float f) {
        ArrayList arrayList = new ArrayList();
        ndyVar.a();
        while (ndyVar.w() == 1) {
            ndyVar.a();
            arrayList.add(b(ndyVar, f));
            ndyVar.d();
        }
        ndyVar.d();
        return arrayList;
    }

    public static float d(ndy ndyVar) {
        int iW = ndyVar.w();
        int iE = hne.E(iW);
        if (iE != 0) {
            if (iE == 6) {
                return (float) ndyVar.q();
            }
            jf4.o("Unknown value for token of type ".concat(w6x.B(iW)));
            return 0.0f;
        }
        ndyVar.a();
        float fQ = (float) ndyVar.q();
        while (ndyVar.l()) {
            ndyVar.H();
        }
        ndyVar.d();
        return fQ;
    }
}
