package a;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b4d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b4d f1952a;
    public static final /* synthetic */ b4d[] b;

    /* JADX INFO: Fake field, exist only in values array */
    b4d EF1;

    static {
        b4d b4dVar = new b4d("CLEAR", 0);
        b4d b4dVar2 = new b4d("SRC", 1);
        b4d b4dVar3 = new b4d("DST", 2);
        b4d b4dVar4 = new b4d("SRC_OVER", 3);
        b4d b4dVar5 = new b4d("DST_OVER", 4);
        b4d b4dVar6 = new b4d("SRC_IN", 5);
        f1952a = b4dVar6;
        b = new b4d[]{b4dVar, b4dVar2, b4dVar3, b4dVar4, b4dVar5, b4dVar6, new b4d("DST_IN", 6), new b4d("SRC_OUT", 7), new b4d("DST_OUT", 8), new b4d("SRC_ATOP", 9), new b4d("DST_ATOP", 10), new b4d("XOR", 11), new b4d("DARKEN", 12), new b4d("LIGHTEN", 13), new b4d("MULTIPLY", 14), new b4d("SCREEN", 15), new b4d("ADD", 16), new b4d("OVERLAY", 17)};
    }

    public static b4d valueOf(String str) {
        return (b4d) Enum.valueOf(b4d.class, str);
    }

    public static b4d[] values() {
        return (b4d[]) b.clone();
    }

    public final BlendMode a() {
        switch (ordinal()) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.DARKEN;
            case 13:
                return BlendMode.LIGHTEN;
            case 14:
                return BlendMode.MULTIPLY;
            case 15:
                return BlendMode.SCREEN;
            case 16:
                return BlendMode.PLUS;
            case 17:
                return BlendMode.OVERLAY;
            default:
                t9f.b();
                return null;
        }
    }

    public final PorterDuff.Mode b() {
        switch (ordinal()) {
            case 0:
                return PorterDuff.Mode.CLEAR;
            case 1:
                return PorterDuff.Mode.SRC;
            case 2:
                return PorterDuff.Mode.DST;
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
                return PorterDuff.Mode.DST_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 6:
                return PorterDuff.Mode.DST_IN;
            case 7:
                return PorterDuff.Mode.SRC_OUT;
            case 8:
                return PorterDuff.Mode.DST_OUT;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 10:
                return PorterDuff.Mode.DST_ATOP;
            case 11:
                return PorterDuff.Mode.XOR;
            case 12:
                return PorterDuff.Mode.DARKEN;
            case 13:
                return PorterDuff.Mode.LIGHTEN;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            case 17:
                return PorterDuff.Mode.OVERLAY;
            default:
                t9f.b();
                return null;
        }
    }
}
