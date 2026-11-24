package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i0w implements jvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0w f13966a;
    public static final i0w b;
    public static final i0w c;
    public static final i0w d;
    public static final i0w e;
    public static final i0w f;
    public static final i0w g;
    public static final i0w h;
    public static final i0w i;
    public static final /* synthetic */ i0w[] j;

    static {
        i0w i0wVar = new i0w("NONE", 0);
        f13966a = i0wVar;
        i0w i0wVar2 = new i0w("ACCEPTED", 1);
        b = i0wVar2;
        i0w i0wVar3 = new i0w("LOST", 2);
        c = i0wVar3;
        i0w i0wVar4 = new i0w("WIN", 3);
        d = i0wVar4;
        i0w i0wVar5 = new i0w("PAID", 4);
        e = i0wVar5;
        i0w i0wVar6 = new i0w("REMOVED", 5);
        f = i0wVar6;
        i0w i0wVar7 = new i0w("EXPIRED", 6);
        g = i0wVar7;
        i0w i0wVar8 = new i0w("BLOCKED", 7);
        h = i0wVar8;
        i0w i0wVar9 = new i0w("PURCHASING", 8);
        i = i0wVar9;
        j = new i0w[]{i0wVar, i0wVar2, i0wVar3, i0wVar4, i0wVar5, i0wVar6, i0wVar7, i0wVar8, i0wVar9};
    }

    public static i0w valueOf(String str) {
        return (i0w) Enum.valueOf(i0w.class, str);
    }

    public static i0w[] values() {
        return (i0w[]) j.clone();
    }
}
