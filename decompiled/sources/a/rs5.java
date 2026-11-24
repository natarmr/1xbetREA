package a;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class rs5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kl5 f31016a;
    public static final rs5 b;
    public static final rs5 c;
    public static final rs5 d;
    public static final rs5 e;
    public static final rs5 f;
    public static final rs5 g;
    public static final rs5 h;
    public static final rs5 i;
    public static final rs5 j;
    public static final rs5 k;
    public static final /* synthetic */ rs5[] l;

    static {
        rs5 rs5Var = new rs5("TAB_UNKNOWN", 0);
        b = rs5Var;
        rs5 rs5Var2 = new rs5("TAB_RULE", 1);
        c = rs5Var2;
        rs5 rs5Var3 = new rs5("TAB_TICKET_LIST", 2);
        d = rs5Var3;
        rs5 rs5Var4 = new rs5("TAB_TICKET_BY_TOUR", 3);
        e = rs5Var4;
        rs5 rs5Var5 = new rs5("TAB_TICKET_BY_DAY", 4);
        f = rs5Var5;
        rs5 rs5Var6 = new rs5("TAB_WINNER", 5);
        g = rs5Var6;
        rs5 rs5Var7 = new rs5("TAB_PRIZE", 6);
        h = rs5Var7;
        rs5 rs5Var8 = new rs5("TAB_TICKET_LIST_CATEGORY", 7);
        i = rs5Var8;
        rs5 rs5Var9 = new rs5("TAB_TICKET_LIST_LEVELS", 8);
        j = rs5Var9;
        rs5 rs5Var10 = new rs5("TAB_WINNER_LEAGUE_CHAMPIONS", 9);
        k = rs5Var10;
        l = new rs5[]{rs5Var, rs5Var2, rs5Var3, rs5Var4, rs5Var5, rs5Var6, rs5Var7, rs5Var8, rs5Var9, rs5Var10};
        f31016a = new kl5();
    }

    public static rs5 valueOf(String str) {
        return (rs5) Enum.valueOf(rs5.class, str);
    }

    public static rs5[] values() {
        return (rs5[]) l.clone();
    }
}
