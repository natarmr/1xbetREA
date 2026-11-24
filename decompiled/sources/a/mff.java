package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mff f21691a;
    public static final mff b;
    public static final mff c;
    public static final mff d;
    public static final mff e;
    public static final /* synthetic */ mff[] f;
    public static final /* synthetic */ c0o g;

    static {
        mff mffVar = new mff("PREMATCH", 0);
        f21691a = mffVar;
        mff mffVar2 = new mff("BREAK", 1);
        b = mffVar2;
        mff mffVar3 = new mff("PLAYER_ONE_WIN", 2);
        mff mffVar4 = new mff("PLAYER_TWO_WIN", 3);
        mff mffVar5 = new mff("DRAW", 4);
        mff mffVar6 = new mff("ROUND_ONE", 5);
        c = mffVar6;
        mff mffVar7 = new mff("ROUND_TWO", 6);
        d = mffVar7;
        mff mffVar8 = new mff(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7);
        e = mffVar8;
        mff[] mffVarArr = {mffVar, mffVar2, mffVar3, mffVar4, mffVar5, mffVar6, mffVar7, mffVar8};
        f = mffVarArr;
        g = new c0o(mffVarArr);
    }

    public static mff valueOf(String str) {
        return (mff) Enum.valueOf(mff.class, str);
    }

    public static mff[] values() {
        return (mff[]) f.clone();
    }
}
