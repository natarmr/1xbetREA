package a;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lkj0 extends sz5 {
    public final dkj0 i;
    public final Path j;
    public Path k;
    public Path l;
    public ArrayList m;

    public lkj0(List list) {
        super(list);
        this.i = new dkj0();
        this.j = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x017a  */
    @Override // a.sz5
    public final Object f(cmy cmyVar, float f) {
        dkj0 dkj0Var;
        dkj0 dkj0Var2;
        int i;
        int i2;
        dkj0 dkj0Var3;
        dkj0 dkj0Var4 = (dkj0) cmyVar.b;
        dkj0 dkj0Var5 = (dkj0) cmyVar.c;
        dkj0 dkj0Var6 = dkj0Var5 == null ? dkj0Var4 : dkj0Var5;
        dkj0 dkj0Var7 = this.i;
        ArrayList arrayList = dkj0Var7.f6233a;
        if (dkj0Var7.b == null) {
            dkj0Var7.b = new PointF();
        }
        boolean z = dkj0Var4.c;
        ArrayList arrayList2 = dkj0Var4.f6233a;
        boolean z2 = true;
        dkj0Var7.c = z || dkj0Var6.c;
        int size = arrayList2.size();
        ArrayList arrayList3 = dkj0Var6.f6233a;
        if (size != arrayList3.size()) {
            xv00.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new atf());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = dkj0Var4.b;
        PointF pointF2 = dkj0Var6.b;
        float f2 = ah40.f(pointF.x, pointF2.x, f);
        float f3 = ah40.f(pointF.y, pointF2.y, f);
        PointF pointF3 = dkj0Var7.b;
        if (pointF3 == null) {
            pointF3 = new PointF();
            dkj0Var7.b = pointF3;
        }
        pointF3.set(f2, f3);
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            atf atfVar = (atf) arrayList2.get(size4);
            atf atfVar2 = (atf) arrayList3.get(size4);
            PointF pointF4 = atfVar.f1429a;
            PointF pointF5 = atfVar.b;
            PointF pointF6 = atfVar.c;
            boolean z3 = z2;
            PointF pointF7 = atfVar2.f1429a;
            PointF pointF8 = atfVar2.b;
            PointF pointF9 = atfVar2.c;
            ((atf) arrayList.get(size4)).f1429a.set(ah40.f(pointF4.x, pointF7.x, f), ah40.f(pointF4.y, pointF7.y, f));
            ((atf) arrayList.get(size4)).b.set(ah40.f(pointF5.x, pointF8.x, f), ah40.f(pointF5.y, pointF8.y, f));
            ((atf) arrayList.get(size4)).c.set(ah40.f(pointF6.x, pointF9.x, f), ah40.f(pointF6.y, pointF9.y, f));
            size4--;
            z2 = z3;
            arrayList2 = arrayList2;
            dkj0Var7 = dkj0Var7;
            arrayList3 = arrayList3;
        }
        dkj0 dkj0Var8 = dkj0Var7;
        boolean z4 = z2;
        ArrayList arrayList4 = this.m;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            dkj0Var = dkj0Var8;
            while (true) {
                ArrayList arrayList5 = dkj0Var.f6233a;
                if (size5 < 0) {
                    break;
                }
                ygg0 ygg0Var = (ygg0) this.m.get(size5);
                ygg0Var.getClass();
                if (arrayList5.size() <= 2) {
                    i = size5;
                } else {
                    float fFloatValue = ((Float) ygg0Var.b.e()).floatValue();
                    if (fFloatValue == 0.0f) {
                        i = size5;
                    } else {
                        boolean z5 = dkj0Var.c;
                        int size6 = arrayList5.size() - 1;
                        int i3 = 0;
                        while (size6 >= 0) {
                            atf atfVar3 = (atf) arrayList5.get(size6);
                            atf atfVar4 = (atf) arrayList5.get(ygg0.d(size6 - 1, arrayList5.size()));
                            PointF pointF10 = (size6 != 0 || z5) ? atfVar4.c : dkj0Var.b;
                            int i4 = size5;
                            i3 = (((size6 != 0 || z5) ? atfVar4.b : pointF10).equals(pointF10) && atfVar3.f1429a.equals(pointF10) && !((dkj0Var.c || (size6 != 0 && size6 != arrayList5.size() + (-1))) ? false : z4)) ? i3 + 2 : i3 + 1;
                            size6--;
                            size5 = i4;
                        }
                        i = size5;
                        dkj0 dkj0Var9 = ygg0Var.c;
                        if (dkj0Var9 == null || dkj0Var9.f6233a.size() != i3) {
                            ArrayList arrayList6 = new ArrayList(i3);
                            for (int i5 = 0; i5 < i3; i5++) {
                                arrayList6.add(new atf());
                            }
                            i2 = 0;
                            ygg0Var.c = new dkj0(new PointF(0.0f, 0.0f), false, arrayList6);
                        } else {
                            i2 = 0;
                        }
                        dkj0 dkj0Var10 = ygg0Var.c;
                        dkj0Var10.c = z5;
                        PointF pointF11 = dkj0Var.b;
                        float f4 = pointF11.x;
                        float f5 = pointF11.y;
                        PointF pointF12 = dkj0Var10.b;
                        if (pointF12 == null) {
                            pointF12 = new PointF();
                            dkj0Var10.b = pointF12;
                        }
                        pointF12.set(f4, f5);
                        ArrayList arrayList7 = dkj0Var10.f6233a;
                        boolean z6 = dkj0Var.c;
                        int i6 = i2;
                        int i7 = i6;
                        while (i6 < arrayList5.size()) {
                            atf atfVar5 = (atf) arrayList5.get(i6);
                            atf atfVar6 = (atf) arrayList5.get(ygg0.d(i6 - 1, arrayList5.size()));
                            atf atfVar7 = (atf) arrayList5.get(ygg0.d(i6 - 2, arrayList5.size()));
                            PointF pointF13 = (i6 != 0 || z6) ? atfVar6.c : dkj0Var.b;
                            PointF pointF14 = (i6 != 0 || z6) ? atfVar6.b : pointF13;
                            float f6 = fFloatValue;
                            PointF pointF15 = atfVar5.f1429a;
                            PointF pointF16 = atfVar7.c;
                            boolean z7 = z6;
                            PointF pointF17 = atfVar5.c;
                            boolean z8 = (dkj0Var.c || !(i6 == 0 || i6 == arrayList5.size() + (-1))) ? false : z4;
                            if (pointF14.equals(pointF13) && pointF15.equals(pointF13) && !z8) {
                                float f7 = pointF13.x;
                                float f8 = f7 - pointF16.x;
                                float f9 = pointF13.y;
                                float f10 = f9 - pointF16.y;
                                float f11 = pointF17.x - f7;
                                float f12 = pointF17.y - f9;
                                dkj0 dkj0Var11 = dkj0Var;
                                float fHypot = (float) Math.hypot(f8, f10);
                                float fHypot2 = (float) Math.hypot(f11, f12);
                                float fMin = Math.min(f6 / fHypot, 0.5f);
                                float fMin2 = Math.min(f6 / fHypot2, 0.5f);
                                float f13 = pointF13.x;
                                float fA = rw2.a(pointF16.x, f13, fMin, f13);
                                float f14 = pointF13.y;
                                float fA2 = rw2.a(pointF16.y, f14, fMin, f14);
                                float fA3 = rw2.a(pointF17.x, f13, fMin2, f13);
                                float fA4 = rw2.a(pointF17.y, f14, fMin2, f14);
                                float f15 = fA - ((fA - f13) * 0.5519f);
                                float f16 = fA2 - ((fA2 - f14) * 0.5519f);
                                float f17 = fA3 - ((fA3 - f13) * 0.5519f);
                                float f18 = fA4 - ((fA4 - f14) * 0.5519f);
                                atf atfVar8 = (atf) arrayList7.get(ygg0.d(i7 - 1, arrayList7.size()));
                                atf atfVar9 = (atf) arrayList7.get(i7);
                                dkj0Var3 = dkj0Var11;
                                atfVar8.b.set(fA, fA2);
                                atfVar8.c.set(fA, fA2);
                                if (i6 == 0) {
                                    PointF pointF18 = dkj0Var10.b;
                                    if (pointF18 == null) {
                                        pointF18 = new PointF();
                                        dkj0Var10.b = pointF18;
                                    }
                                    pointF18.set(fA, fA2);
                                }
                                atfVar9.f1429a.set(f15, f16);
                                atf atfVar10 = (atf) arrayList7.get(i7 + 1);
                                atfVar9.b.set(f17, f18);
                                atfVar9.c.set(fA3, fA4);
                                atfVar10.f1429a.set(fA3, fA4);
                                i7 += 2;
                            } else {
                                dkj0Var3 = dkj0Var;
                                atf atfVar11 = (atf) arrayList7.get(ygg0.d(i7 - 1, arrayList7.size()));
                                atf atfVar12 = (atf) arrayList7.get(i7);
                                PointF pointF19 = atfVar6.b;
                                atfVar11.b.set(pointF19.x, pointF19.y);
                                PointF pointF20 = atfVar6.c;
                                atfVar11.c.set(pointF20.x, pointF20.y);
                                PointF pointF21 = atfVar5.f1429a;
                                atfVar12.f1429a.set(pointF21.x, pointF21.y);
                                i7++;
                            }
                            i6++;
                            arrayList5 = arrayList5;
                            fFloatValue = f6;
                            z6 = z7;
                            dkj0Var4 = dkj0Var4;
                            dkj0Var5 = dkj0Var5;
                            dkj0Var = dkj0Var3;
                        }
                        dkj0Var = dkj0Var10;
                    }
                }
                size5 = i - 1;
                dkj0Var4 = dkj0Var4;
                dkj0Var5 = dkj0Var5;
            }
        } else {
            dkj0Var = dkj0Var8;
        }
        dkj0 dkj0Var12 = dkj0Var4;
        dkj0 dkj0Var13 = dkj0Var5;
        Path path = this.j;
        ah40.e(dkj0Var, path);
        if (this.e == null) {
            return path;
        }
        if (this.k == null) {
            this.k = new Path();
            this.l = new Path();
        }
        ah40.e(dkj0Var12, this.k);
        if (dkj0Var13 != null) {
            dkj0Var2 = dkj0Var13;
            ah40.e(dkj0Var2, this.l);
        } else {
            dkj0Var2 = dkj0Var13;
        }
        zn00 zn00Var = this.e;
        float f19 = cmyVar.g;
        float fFloatValue2 = cmyVar.h.floatValue();
        dkj0 dkj0Var14 = dkj0Var2;
        Path path2 = this.k;
        return (Path) zn00Var.L0(f19, fFloatValue2, path2, dkj0Var14 == null ? path2 : this.l, f, d(), this.d);
    }

    @Override // a.sz5
    public final boolean k() {
        ArrayList arrayList = this.m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
