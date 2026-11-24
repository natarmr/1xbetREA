package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wna {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wna f39437a;
    public static final wna b;
    public static final wna c;
    public static final wna d;
    public static final wna e;
    public static final wna f;
    public static final wna g;
    public static final /* synthetic */ wna[] h;

    static {
        wna wnaVar = new wna("Idle", 0);
        f39437a = wnaVar;
        wna wnaVar2 = new wna("Dragging", 1);
        b = wnaVar2;
        wna wnaVar3 = new wna("RewindAnimating", 2);
        c = wnaVar3;
        wna wnaVar4 = new wna("AutomaticSwipeAnimating", 3);
        d = wnaVar4;
        wna wnaVar5 = new wna("AutomaticSwipeAnimated", 4);
        e = wnaVar5;
        wna wnaVar6 = new wna("ManualSwipeAnimating", 5);
        f = wnaVar6;
        wna wnaVar7 = new wna("ManualSwipeAnimated", 6);
        g = wnaVar7;
        h = new wna[]{wnaVar, wnaVar2, wnaVar3, wnaVar4, wnaVar5, wnaVar6, wnaVar7};
    }

    public static wna valueOf(String str) {
        return (wna) Enum.valueOf(wna.class, str);
    }

    public static wna[] values() {
        return (wna[]) h.clone();
    }

    public final boolean a() {
        return (this == f39437a || this == g || this == e) ? false : true;
    }
}
