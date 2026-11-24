package a;

import android.animation.TimeInterpolator;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class uob extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36004a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uob(Class cls, String str, byte b) {
        super(cls, str);
        this.f36004a = b;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f36004a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return Float.valueOf(((vjc) obj).h);
            case 9:
                return Float.valueOf(((vjc) obj).i);
            case 10:
                return Float.valueOf(((xjc) obj).h);
            case 11:
                return Float.valueOf(((xjc) obj).i);
            case 12:
                return Float.valueOf(((shl) obj).b());
            case 13:
                return Float.valueOf(((f900) obj).h);
            case 14:
                return Float.valueOf(((h900) obj).i);
            case 15:
                return Float.valueOf(((SwitchCompat) obj).z);
            case 16:
                return Float.valueOf(bmu0.f2855a.z((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f36004a) {
            case 0:
                yob yobVar = (yob) obj;
                PointF pointF = (PointF) obj2;
                yobVar.getClass();
                yobVar.f42976a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                yobVar.b = iRound;
                int i = yobVar.f + 1;
                yobVar.f = i;
                if (i == yobVar.g) {
                    bmu0.a(yobVar.e, yobVar.f42976a, iRound, yobVar.c, yobVar.d);
                    yobVar.f = 0;
                    yobVar.g = 0;
                }
                break;
            case 1:
                yob yobVar2 = (yob) obj;
                PointF pointF2 = (PointF) obj2;
                yobVar2.getClass();
                yobVar2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                yobVar2.d = iRound2;
                int i2 = yobVar2.g + 1;
                yobVar2.g = i2;
                if (yobVar2.f == i2) {
                    bmu0.a(yobVar2.e, yobVar2.f42976a, yobVar2.b, yobVar2.c, iRound2);
                    yobVar2.f = 0;
                    yobVar2.g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                bmu0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                bmu0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                bmu0.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                x2x.z((ImageView) obj, (Matrix) obj2);
                break;
            case 6:
                lsb lsbVar = (lsb) obj;
                float[] fArr = (float[]) obj2;
                System.arraycopy(fArr, 0, lsbVar.c, 0, fArr.length);
                lsbVar.a();
                break;
            case 7:
                lsb lsbVar2 = (lsb) obj;
                PointF pointF6 = (PointF) obj2;
                lsbVar2.getClass();
                lsbVar2.d = pointF6.x;
                lsbVar2.e = pointF6.y;
                lsbVar2.a();
                break;
            case 8:
                vjc vjcVar = (vjc) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                vjcVar.h = fFloatValue;
                int i3 = (int) (fFloatValue * 5400.0f);
                f0p f0pVar = vjcVar.e;
                ArrayList arrayList = (ArrayList) vjcVar.b;
                uhl uhlVar = (uhl) arrayList.get(0);
                float f = vjcVar.h * 1520.0f;
                uhlVar.f35684a = (-20.0f) + f;
                uhlVar.b = f;
                for (int i4 = 0; i4 < 4; i4++) {
                    uhlVar.b = (f0pVar.getInterpolation(c2.l(i3, vjc.k[i4], 667)) * 250.0f) + uhlVar.b;
                    uhlVar.f35684a = (f0pVar.getInterpolation(c2.l(i3, vjc.l[i4], 667)) * 250.0f) + uhlVar.f35684a;
                }
                float f2 = uhlVar.f35684a;
                float f3 = uhlVar.b;
                uhlVar.f35684a = (((f3 - f2) * vjcVar.i) + f2) / 360.0f;
                uhlVar.b = f3 / 360.0f;
                for (int i5 = 0; i5 < 4; i5++) {
                    float fL = c2.l(i3, vjc.m[i5], 333);
                    if (fL > 0.0f && fL < 1.0f) {
                        int i6 = i5 + vjcVar.g;
                        int[] iArr = vjcVar.f.e;
                        int length = i6 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        ((uhl) arrayList.get(0)).c = jw3.a(f0pVar.getInterpolation(fL), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[length2])).intValue();
                        ((d5x) vjcVar.f3600a).invalidateSelf();
                    }
                    break;
                }
                ((d5x) vjcVar.f3600a).invalidateSelf();
                break;
            case 9:
                ((vjc) obj).i = ((Float) obj2).floatValue();
                break;
            case 10:
                xjc xjcVar = (xjc) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                xjcVar.h = fFloatValue2;
                int i7 = (int) (fFloatValue2 * 6000.0f);
                TimeInterpolator timeInterpolator = xjcVar.e;
                ArrayList arrayList2 = (ArrayList) xjcVar.b;
                uhl uhlVar2 = (uhl) arrayList2.get(0);
                float f4 = xjcVar.h * 1080.0f;
                int[] iArr2 = xjc.l;
                float interpolation = 0.0f;
                for (int i8 : iArr2) {
                    interpolation += timeInterpolator.getInterpolation(c2.l(i7, i8, 500)) * 90.0f;
                }
                uhlVar2.g = f4 + interpolation;
                float interpolation2 = timeInterpolator.getInterpolation(c2.l(i7, 0, 3000)) - timeInterpolator.getInterpolation(c2.l(i7, 3000, 3000));
                uhlVar2.f35684a = 0.0f;
                float[] fArr2 = xjc.m;
                float F = p7x.F(fArr2[0], fArr2[1], interpolation2);
                uhlVar2.b = F;
                float f5 = xjcVar.i;
                if (f5 > 0.0f) {
                    uhlVar2.b = (1.0f - f5) * F;
                }
                for (int i9 = 0; i9 < iArr2.length; i9++) {
                    float fL2 = c2.l(i7, iArr2[i9], 100);
                    if (fL2 >= 0.0f && fL2 <= 1.0f) {
                        int i10 = i9 + xjcVar.g;
                        int[] iArr3 = xjcVar.f.e;
                        int length3 = i10 % iArr3.length;
                        int length4 = (length3 + 1) % iArr3.length;
                        ((uhl) arrayList2.get(0)).c = jw3.a(timeInterpolator.getInterpolation(fL2), Integer.valueOf(iArr3[length3]), Integer.valueOf(iArr3[length4])).intValue();
                        ((d5x) xjcVar.f3600a).invalidateSelf();
                    }
                    break;
                }
                ((d5x) xjcVar.f3600a).invalidateSelf();
                break;
            case 11:
                ((xjc) obj).i = ((Float) obj2).floatValue();
                break;
            case 12:
                shl shlVar = (shl) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                if (shlVar.i != fFloatValue3) {
                    shlVar.i = fFloatValue3;
                    shlVar.invalidateSelf();
                }
                break;
            case 13:
                f900 f900Var = (f900) obj;
                float fFloatValue4 = ((Float) obj2).floatValue();
                f900Var.h = fFloatValue4;
                ArrayList arrayList3 = (ArrayList) f900Var.b;
                ((uhl) arrayList3.get(0)).f35684a = 0.0f;
                float fL3 = c2.l((int) (fFloatValue4 * 333.0f), 0, 667);
                uhl uhlVar3 = (uhl) arrayList3.get(0);
                uhl uhlVar4 = (uhl) arrayList3.get(1);
                f0p f0pVar2 = f900Var.d;
                float interpolation3 = f0pVar2.getInterpolation(fL3);
                uhlVar4.f35684a = interpolation3;
                uhlVar3.b = interpolation3;
                uhl uhlVar5 = (uhl) arrayList3.get(1);
                uhl uhlVar6 = (uhl) arrayList3.get(2);
                float interpolation4 = f0pVar2.getInterpolation(fL3 + 0.49925038f);
                uhlVar6.f35684a = interpolation4;
                uhlVar5.b = interpolation4;
                ((uhl) arrayList3.get(2)).b = 1.0f;
                if (f900Var.g && ((uhl) arrayList3.get(1)).b < 1.0f) {
                    ((uhl) arrayList3.get(2)).c = ((uhl) arrayList3.get(1)).c;
                    ((uhl) arrayList3.get(1)).c = ((uhl) arrayList3.get(0)).c;
                    ((uhl) arrayList3.get(0)).c = f900Var.e.e[f900Var.f];
                    f900Var.g = false;
                }
                ((d5x) f900Var.f3600a).invalidateSelf();
                break;
            case 14:
                h900 h900Var = (h900) obj;
                float fFloatValue5 = ((Float) obj2).floatValue();
                h900Var.i = fFloatValue5;
                int i11 = (int) (fFloatValue5 * 1800.0f);
                Interpolator[] interpolatorArr = h900Var.e;
                ArrayList arrayList4 = (ArrayList) h900Var.b;
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    uhl uhlVar7 = (uhl) arrayList4.get(i12);
                    int[] iArr4 = h900.l;
                    int i13 = i12 * 2;
                    int i14 = iArr4[i13];
                    int[] iArr5 = h900.k;
                    uhlVar7.f35684a = r7x.t(interpolatorArr[i13].getInterpolation(c2.l(i11, i14, iArr5[i13])), 0.0f, 1.0f);
                    int i15 = i13 + 1;
                    uhlVar7.b = r7x.t(interpolatorArr[i15].getInterpolation(c2.l(i11, iArr4[i15], iArr5[i15])), 0.0f, 1.0f);
                }
                if (h900Var.h) {
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ((uhl) it.next()).c = h900Var.f.e[h900Var.g];
                    }
                    h900Var.h = false;
                }
                ((d5x) h900Var.f3600a).invalidateSelf();
                break;
            case 15:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 16:
                bmu0.b((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
