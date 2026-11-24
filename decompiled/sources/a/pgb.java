package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class pgb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pgb f26945a;
    public static final pgb b;
    public static final pgb c;
    public static final /* synthetic */ pgb[] d;

    static {
        pgb pgbVar = new pgb(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f26945a = pgbVar;
        pgb pgbVar2 = new pgb("TOP_CHAMP", 1);
        b = pgbVar2;
        pgb pgbVar3 = new pgb("NEW_CHAMP", 2);
        c = pgbVar3;
        d = new pgb[]{pgbVar, pgbVar2, pgbVar3};
    }

    public static pgb valueOf(String str) {
        return (pgb) Enum.valueOf(pgb.class, str);
    }

    public static pgb[] values() {
        return (pgb[]) d.clone();
    }
}
