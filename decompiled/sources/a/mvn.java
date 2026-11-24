package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class mvn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mvn f22465a;
    public static final mvn b;
    public static final mvn c;
    public static final mvn d;
    public static final mvn e;
    public static final mvn f;
    public static final mvn g;
    public static final mvn h;
    public static final /* synthetic */ mvn[] i;

    static {
        mvn mvnVar = new mvn("NONE", 0);
        f22465a = mvnVar;
        mvn mvnVar2 = new mvn("LOST", 1);
        b = mvnVar2;
        mvn mvnVar3 = new mvn("WIN", 2);
        c = mvnVar3;
        mvn mvnVar4 = new mvn("RETURN_FULL", 3);
        d = mvnVar4;
        mvn mvnVar5 = new mvn("RETURN", 4);
        e = mvnVar5;
        mvn mvnVar6 = new mvn("WIN_RETURN_HALF", 5);
        f = mvnVar6;
        mvn mvnVar7 = new mvn("RETURN_HALF", 6);
        g = mvnVar7;
        mvn mvnVar8 = new mvn("RESULT", 7);
        h = mvnVar8;
        i = new mvn[]{mvnVar, mvnVar2, mvnVar3, mvnVar4, mvnVar5, mvnVar6, mvnVar7, mvnVar8};
    }

    public static mvn valueOf(String str) {
        return (mvn) Enum.valueOf(mvn.class, str);
    }

    public static mvn[] values() {
        return (mvn[]) i.clone();
    }
}
