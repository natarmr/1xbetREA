package a;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class d2a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5346a;

    static {
        int[] iArr = new int[Paint.Align.values().length];
        try {
            iArr[Paint.Align.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Paint.Align.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f5346a = iArr;
    }
}
