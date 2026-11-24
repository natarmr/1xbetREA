package a;

import android.gov.nist.core.Separators;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class iyf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15586a;
    public final short b;
    public int c;
    public float d;
    public String e;
    public final boolean f;

    public iyf(iyf iyfVar) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.f15586a = iyfVar.f15586a;
        this.b = iyfVar.b;
        this.c = iyfVar.c;
        this.d = iyfVar.d;
        this.e = iyfVar.e;
        this.f = iyfVar.f;
    }

    public static int a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public final float b() {
        switch (this.b) {
            case 900:
                return this.c;
            case 901:
                return this.d;
            case 902:
                itt0.k("Color does not have a single color to interpolate");
                return 0.0f;
            case 903:
                itt0.k("Cannot interpolate String");
                return 0.0f;
            default:
                return Float.NaN;
        }
    }

    public final void c(float[] fArr) {
        switch (this.b) {
            case 900:
                fArr[0] = this.c;
                break;
            case 901:
                fArr[0] = this.d;
                break;
            case 902:
                int i = this.c;
                int i2 = (i >> 24) & 255;
                float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                break;
            case 903:
                itt0.k("Cannot interpolate String");
                break;
        }
    }

    public final int d() {
        return this.b != 902 ? 1 : 4;
    }

    public final void e(ywu ywuVar, float[] fArr) {
        String str = this.f15586a;
        short s = this.b;
        switch (s) {
            case 900:
                int i = (int) fArr[0];
                HashMap map = ((vdv0) ywuVar.b).r;
                if (!map.containsKey(str)) {
                    map.put(str, new iyf(str, s, i));
                } else {
                    ((iyf) map.get(str)).c = i;
                }
                break;
            case 901:
                float f = fArr[0];
                HashMap map2 = ((vdv0) ywuVar.b).r;
                if (!map2.containsKey(str)) {
                    map2.put(str, new iyf(f, s, str));
                } else {
                    ((iyf) map2.get(str)).d = f;
                }
                break;
            case 902:
                int iA = (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                HashMap map3 = ((vdv0) ywuVar.b).r;
                if (!map3.containsKey(str)) {
                    map3.put(str, new iyf(str, s, iA));
                } else {
                    ((iyf) map3.get(str)).c = iA;
                }
                break;
            case 903:
                itt0.k(kng0.k("unable to interpolate ", str));
                break;
        }
    }

    public final String toString() {
        String strM = axq.m(new StringBuilder(), this.f15586a, ':');
        switch (this.b) {
            case 900:
                return strM + this.c;
            case 901:
                return strM + this.d;
            case 902:
                String str = "00000000" + Integer.toHexString(this.c);
                return strM.concat(Separators.POUND.concat(str.substring(str.length() - 8)));
            case 903:
                return strM + this.e;
            default:
                return strM.concat("????");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iyf(String str, int i, int i2) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.f15586a = str;
        this.b = i;
        if (i == 901) {
            this.d = i2;
        } else {
            this.c = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iyf(float f, int i, String str) {
        this.c = Integer.MIN_VALUE;
        this.e = null;
        this.f15586a = str;
        this.b = i;
        this.d = f;
    }
}
