package a;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class t500 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f33346a;

    static {
        int[] iArr = new int[n700.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            n700 n700Var = n700.f23018a;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            n700 n700Var2 = n700.f23018a;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[Paint.Align.values().length];
        try {
            iArr2[Paint.Align.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Paint.Align.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Paint.Align.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f33346a = iArr2;
    }
}
