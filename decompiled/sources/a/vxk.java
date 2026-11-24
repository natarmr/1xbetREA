package a;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class vxk implements l3u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vxk f38202a = new vxk();
    public static final edu b = edu.q("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // a.l3u0
    public final Object z0(ndy ndyVar, float f) {
        ndyVar.c();
        String strV = null;
        float fQ = 0.0f;
        float fQ2 = 0.0f;
        float fQ3 = 0.0f;
        float fQ4 = 0.0f;
        int iR = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zN = true;
        int i = 3;
        String strV2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (ndyVar.l()) {
            switch (ndyVar.y(b)) {
                case 0:
                    strV = ndyVar.v();
                    break;
                case 1:
                    strV2 = ndyVar.v();
                    break;
                case 2:
                    fQ = (float) ndyVar.q();
                    break;
                case 3:
                    int iR2 = ndyVar.r();
                    i = (iR2 <= 2 && iR2 >= 0) ? hne.H(3)[iR2] : 3;
                    break;
                case 4:
                    iR = ndyVar.r();
                    break;
                case 5:
                    fQ2 = (float) ndyVar.q();
                    break;
                case 6:
                    fQ3 = (float) ndyVar.q();
                    break;
                case 7:
                    iA = vdy.a(ndyVar);
                    break;
                case 8:
                    iA2 = vdy.a(ndyVar);
                    break;
                case 9:
                    fQ4 = (float) ndyVar.q();
                    break;
                case 10:
                    zN = ndyVar.n();
                    break;
                case 11:
                    ndyVar.a();
                    pointF = new PointF(((float) ndyVar.q()) * f, ((float) ndyVar.q()) * f);
                    ndyVar.d();
                    break;
                case 12:
                    ndyVar.a();
                    pointF = pointF;
                    pointF2 = new PointF(((float) ndyVar.q()) * f, ((float) ndyVar.q()) * f);
                    ndyVar.d();
                    break;
                default:
                    ndyVar.F();
                    ndyVar.H();
                    break;
            }
        }
        ndyVar.e();
        uxk uxkVar = new uxk();
        uxkVar.f36444a = strV;
        uxkVar.b = strV2;
        uxkVar.c = fQ;
        uxkVar.d = i;
        uxkVar.e = iR;
        uxkVar.f = fQ2;
        uxkVar.g = fQ3;
        uxkVar.h = iA;
        uxkVar.i = iA2;
        uxkVar.j = fQ4;
        uxkVar.k = zN;
        uxkVar.l = pointF;
        uxkVar.m = pointF2;
        return uxkVar;
    }
}
