package a;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f8w implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f8w f9129a;
    public static final f8w b;
    public static final /* synthetic */ f8w[] c;

    static {
        f8w f8wVar = new f8w("BET_HISTORY", 0);
        f9129a = f8wVar;
        f8w f8wVar2 = new f8w("BET_CHAMP_HISTORY", 1);
        b = f8wVar2;
        c = new f8w[]{f8wVar, f8wVar2};
    }

    public static f8w valueOf(String str) {
        return (f8w) Enum.valueOf(f8w.class, str);
    }

    public static f8w[] values() {
        return (f8w[]) c.clone();
    }
}
