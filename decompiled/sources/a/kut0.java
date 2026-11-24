package a;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kut0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18929a;

    static {
        int[] iArr = new int[uv00.values().length];
        try {
            uv00[] uv00VarArr = uv00.f36325a;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            uv00[] uv00VarArr2 = uv00.f36325a;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            uv00[] uv00VarArr3 = uv00.f36325a;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            uv00[] uv00VarArr4 = uv00.f36325a;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            uv00[] uv00VarArr5 = uv00.f36325a;
            iArr[4] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        try {
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        f18929a = iArr2;
    }
}
