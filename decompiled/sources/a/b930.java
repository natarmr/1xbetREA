package a;

import android.gov.nist.core.Separators;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class b930 {
    public static final float[] g = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2188a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public /* synthetic */ b930(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f2188a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public static b930 a(String str) {
        x0x.A(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), Separators.COMMA);
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            String strH0 = j47.H0(strArrSplit[i6].trim());
            strH0.getClass();
            switch (strH0) {
                case "end":
                    i3 = i6;
                    break;
                case "text":
                    i5 = i6;
                    break;
                case "layer":
                    i = i6;
                    break;
                case "start":
                    i2 = i6;
                    break;
                case "style":
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new b930(i, i2, i3, i4, i5, strArrSplit.length);
    }
}
