package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mbe f21502a;
    public static final mbe b;
    public static final mbe c;
    public static final mbe d;
    public static final mbe e;
    public static final /* synthetic */ mbe[] f;

    static {
        mbe mbeVar = new mbe("STAGE_TEST", 0);
        f21502a = mbeVar;
        mbe mbeVar2 = new mbe("PROD_TEST", 1);
        b = mbeVar2;
        mbe mbeVar3 = new mbe("STAGE", 2);
        c = mbeVar3;
        mbe mbeVar4 = new mbe("CUSTOM", 3);
        d = mbeVar4;
        mbe mbeVar5 = new mbe("PROD", 4);
        e = mbeVar5;
        f = new mbe[]{mbeVar, mbeVar2, mbeVar3, mbeVar4, mbeVar5};
    }

    public static mbe valueOf(String str) {
        return (mbe) Enum.valueOf(mbe.class, str);
    }

    public static mbe[] values() {
        return (mbe[]) f.clone();
    }
}
