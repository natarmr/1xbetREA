package a;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class cky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rrd f4531a;
    public String b;
    public int c = 0;
    public String d = null;
    public int e = 0;
    public final ArrayList f = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:19:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:20:0x00af  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ec  */
    public final float a(float f) {
        double d;
        double d2;
        double dSignum;
        double dAbs;
        rrd rrdVar = this.f4531a;
        kpb kpbVar = (kpb) rrdVar.h;
        double[] dArr = (double[]) rrdVar.i;
        char c = 2;
        if (kpbVar != null) {
            kpbVar.P(f, dArr);
        } else {
            dArr[0] = ((float[]) rrdVar.f)[0];
            dArr[1] = ((float[]) rrdVar.g)[0];
            dArr[2] = ((float[]) rrdVar.c)[0];
        }
        double[] dArr2 = (double[]) rrdVar.i;
        double d3 = dArr2[0];
        double d4 = dArr2[1];
        ucs0 ucs0Var = (ucs0) rrdVar.b;
        double d5 = f;
        ucs0Var.getClass();
        double d6 = 0.0d;
        if (d5 > 0.0d) {
            if (d5 >= 1.0d) {
                d6 = 1.0d;
            } else {
                int iBinarySearch = Arrays.binarySearch((double[]) ucs0Var.d, d5);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                float[] fArr = (float[]) ucs0Var.c;
                float f2 = fArr[iBinarySearch];
                int i = iBinarySearch - 1;
                float f3 = fArr[i];
                c = 2;
                double[] dArr3 = (double[]) ucs0Var.d;
                double d7 = dArr3[iBinarySearch];
                double d8 = dArr3[i];
                double d9 = ((double) (f2 - f3)) / (d7 - d8);
                d = 2.0d;
                d6 = ((((d5 * d5) - (d8 * d8)) * d9) / 2.0d) + ((d5 - d8) * (((double) f3) - (d9 * d8))) + ((double[]) ucs0Var.e)[i];
            }
            d2 = d6 + d4;
            switch (ucs0Var.b) {
                case 1:
                    dSignum = Math.signum(0.5d - (d2 % 1.0d));
                    break;
                case 2:
                    dAbs = Math.abs((((d2 * 4.0d) + 1.0d) % 4.0d) - d);
                    dSignum = 1.0d - dAbs;
                    break;
                case 3:
                    dSignum = (((d2 * d) + 1.0d) % d) - 1.0d;
                    break;
                case 4:
                    dSignum = 1.0d - (((d2 * d) + 1.0d) % d);
                    break;
                case 5:
                    dSignum = Math.cos((d4 + d2) * 6.283185307179586d);
                    break;
                case 6:
                    double dAbs2 = 1.0d - Math.abs(((d2 * 4.0d) % 4.0d) - d);
                    dAbs = dAbs2 * dAbs2;
                    dSignum = 1.0d - dAbs;
                    break;
                case 7:
                    dSignum = ((pq40) ucs0Var.f).O(d2 % 1.0d);
                    break;
                default:
                    dSignum = Math.sin(6.283185307179586d * d2);
                    break;
            }
            return (float) ((dSignum * ((double[]) rrdVar.i)[c]) + d3);
        }
        d = 2.0d;
        d2 = d6 + d4;
        switch (ucs0Var.b) {
            case 1:
                dSignum = Math.signum(0.5d - (d2 % 1.0d));
                break;
            case 2:
                dAbs = Math.abs((((d2 * 4.0d) + 1.0d) % 4.0d) - d);
                dSignum = 1.0d - dAbs;
                break;
            case 3:
                dSignum = (((d2 * d) + 1.0d) % d) - 1.0d;
                break;
            case 4:
                dSignum = 1.0d - (((d2 * d) + 1.0d) % d);
                break;
            case 5:
                dSignum = Math.cos((d4 + d2) * 6.283185307179586d);
                break;
            case 6:
                double dAbs3 = 1.0d - Math.abs(((d2 * 4.0d) % 4.0d) - d);
                dAbs = dAbs3 * dAbs3;
                dSignum = 1.0d - dAbs;
                break;
            case 7:
                dSignum = ((pq40) ucs0Var.f).O(d2 % 1.0d);
                break;
            default:
                dSignum = Math.sin(6.283185307179586d * d2);
                break;
        }
        return (float) ((dSignum * ((double[]) rrdVar.i)[c]) + d3);
    }

    public final void d() {
        int i;
        int i2;
        double d;
        int i3;
        ArrayList<bky> arrayList = this.f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new wpv((byte) 6));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i4 = this.c;
        String str = this.d;
        rrd rrdVar = new rrd((byte) 21);
        ucs0 ucs0Var = new ucs0((byte) 6);
        ucs0Var.c = new float[0];
        ucs0Var.d = new double[0];
        rrdVar.b = ucs0Var;
        ucs0Var.b = i4;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            i2 = 0;
            i = 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i5 = 0;
            d = 1.0d;
            while (iIndexOf2 != -1) {
                dArr3[i5] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i5++;
            }
            dArr3[i5] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr3, i5 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / ((double) length2);
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            int i6 = 0;
            while (i6 < dArrCopyOf.length) {
                double d3 = dArrCopyOf[i6];
                int i7 = i6 + length2;
                dArr4[i7][0] = d3;
                double[] dArr6 = dArrCopyOf;
                double d4 = ((double) i6) * d2;
                dArr5[i7] = d4;
                if (i6 > 0) {
                    int i8 = (length2 * 2) + i6;
                    dArr4[i8][0] = d3 + 1.0d;
                    dArr5[i8] = d4 + 1.0d;
                    int i9 = i6 - 1;
                    dArr4[i9][0] = (d3 - 1.0d) - d2;
                    dArr5[i9] = (d4 - 1.0d) - d2;
                }
                i6++;
                dArrCopyOf = dArr6;
            }
            ucs0Var.f = new pq40(dArr5, dArr4);
        } else {
            i = 1;
            i2 = 0;
            d = 1.0d;
        }
        rrdVar.c = new float[size];
        rrdVar.d = new double[size];
        rrdVar.e = new float[size];
        rrdVar.f = new float[size];
        rrdVar.g = new float[size];
        float[] fArr = new float[size];
        this.f4531a = rrdVar;
        int i10 = i2;
        for (bky bkyVar : arrayList) {
            float f = bkyVar.d;
            dArr[i10] = ((double) f) * 0.01d;
            double[] dArr7 = dArr2[i10];
            float f2 = bkyVar.b;
            dArr7[i2] = f2;
            float f3 = bkyVar.c;
            dArr7[i] = f3;
            float f4 = bkyVar.e;
            dArr7[r5] = f4;
            rrd rrdVar2 = this.f4531a;
            ((double[]) rrdVar2.d)[i10] = ((double) bkyVar.f2770a) / 100.0d;
            ((float[]) rrdVar2.e)[i10] = f;
            ((float[]) rrdVar2.f)[i10] = f3;
            ((float[]) rrdVar2.g)[i10] = f4;
            ((float[]) rrdVar2.c)[i10] = f2;
            i10++;
        }
        rrd rrdVar3 = this.f4531a;
        float[] fArr2 = (float[]) rrdVar3.e;
        ucs0 ucs0Var2 = (ucs0) rrdVar3.b;
        double[] dArr8 = (double[]) rrdVar3.d;
        int length3 = dArr8.length;
        int[] iArr = new int[2];
        iArr[i] = 3;
        iArr[i2] = length3;
        double[][] dArr9 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr3 = (float[]) rrdVar3.c;
        rrdVar3.i = new double[fArr3.length + 2];
        double[] dArr10 = new double[fArr3.length + 2];
        double d5 = 0.0d;
        if (dArr8[i2] > 0.0d) {
            ucs0Var2.h(0.0d, fArr2[i2]);
        }
        int length4 = dArr8.length - 1;
        if (dArr8[length4] < d) {
            ucs0Var2.h(d, fArr2[length4]);
        }
        for (int i11 = i2; i11 < dArr9.length; i11++) {
            double[] dArr11 = dArr9[i11];
            dArr11[i2] = ((float[]) rrdVar3.f)[i11];
            dArr11[i] = ((float[]) rrdVar3.g)[i11];
            dArr11[2] = fArr3[i11];
            ucs0Var2.h(dArr8[i11], fArr2[i11]);
        }
        double d6 = 0.0d;
        int i12 = i2;
        while (true) {
            float[] fArr4 = (float[]) ucs0Var2.c;
            if (i12 >= fArr4.length) {
                break;
            }
            d6 += (double) fArr4[i12];
            i12++;
        }
        double d7 = 0.0d;
        int i13 = i;
        while (true) {
            float[] fArr5 = (float[]) ucs0Var2.c;
            if (i13 >= fArr5.length) {
                break;
            }
            int i14 = i13 - 1;
            float f5 = (fArr5[i14] + fArr5[i13]) / 2.0f;
            double[] dArr12 = (double[]) ucs0Var2.d;
            d7 = ((dArr12[i13] - dArr12[i14]) * ((double) f5)) + d7;
            i13++;
        }
        int i15 = i2;
        while (true) {
            float[] fArr6 = (float[]) ucs0Var2.c;
            if (i15 >= fArr6.length) {
                break;
            }
            fArr6[i15] = fArr6[i15] * ((float) (d6 / d7));
            i15++;
            d5 = d5;
        }
        ((double[]) ucs0Var2.e)[i2] = d5;
        int i16 = i;
        while (true) {
            float[] fArr7 = (float[]) ucs0Var2.c;
            if (i16 >= fArr7.length) {
                break;
            }
            int i17 = i16 - 1;
            float f6 = (fArr7[i17] + fArr7[i16]) / 2.0f;
            double[] dArr13 = (double[]) ucs0Var2.d;
            double d8 = dArr13[i16] - dArr13[i17];
            double[] dArr14 = (double[]) ucs0Var2.e;
            dArr14[i16] = (d8 * ((double) f6)) + dArr14[i17];
            i16++;
        }
        if (dArr8.length > i) {
            i3 = i2;
            rrdVar3.h = kpb.y(i3, dArr8, dArr9);
        } else {
            i3 = i2;
            rrdVar3.h = null;
        }
        kpb.y(i3, dArr, dArr2);
    }

    public final String toString() {
        String str = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (bky bkyVar : this.f) {
            str = str + "[" + bkyVar.f2770a + " , " + decimalFormat.format(bkyVar.b) + "] ";
        }
        return str;
    }

    public void b(Object obj) {
    }

    public void c(ywu ywuVar, float f) {
    }
}
