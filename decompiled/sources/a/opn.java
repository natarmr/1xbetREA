package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class opn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final opn f25650a;
    public static final opn b;
    public static final opn c;
    public static final /* synthetic */ opn[] d;

    static {
        opn opnVar = new opn("SPORT_TYPE", 0);
        f25650a = opnVar;
        opn opnVar2 = new opn("OUTCOMES_TYPE", 1);
        b = opnVar2;
        opn opnVar3 = new opn(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        c = opnVar3;
        d = new opn[]{opnVar, opnVar2, opnVar3};
    }

    public static opn valueOf(String str) {
        return (opn) Enum.valueOf(opn.class, str);
    }

    public static opn[] values() {
        return (opn[]) d.clone();
    }
}
