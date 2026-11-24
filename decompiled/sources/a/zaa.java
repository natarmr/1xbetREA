package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zaa f44057a;
    public static final zaa b;
    public static final zaa c;
    public static final zaa d;
    public static final zaa e;
    public static final zaa f;
    public static final /* synthetic */ zaa[] g;

    static {
        zaa zaaVar = new zaa("PRE_MATCH", 0);
        f44057a = zaaVar;
        zaa zaaVar2 = new zaa("LIVE", 1);
        b = zaaVar2;
        zaa zaaVar3 = new zaa("FIRST_WIN", 2);
        c = zaaVar3;
        zaa zaaVar4 = new zaa("DRAW", 3);
        d = zaaVar4;
        zaa zaaVar5 = new zaa("SECOND_WIN", 4);
        e = zaaVar5;
        zaa zaaVar6 = new zaa("UNDEFINED", 5);
        f = zaaVar6;
        g = new zaa[]{zaaVar, zaaVar2, zaaVar3, zaaVar4, zaaVar5, zaaVar6};
    }

    public static zaa valueOf(String str) {
        return (zaa) Enum.valueOf(zaa.class, str);
    }

    public static zaa[] values() {
        return (zaa[]) g.clone();
    }
}
