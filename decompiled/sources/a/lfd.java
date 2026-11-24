package a;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lfd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lfd f19949a;
    public static final /* synthetic */ lfd[] b;

    /* JADX INFO: Fake field, exist only in values array */
    lfd EF0;

    static {
        lfd lfdVar = new lfd("NOT_SET", 0);
        lfd lfdVar2 = new lfd("EVENT_OVERRIDE", 1);
        f19949a = lfdVar2;
        b = new lfd[]{lfdVar, lfdVar2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, lfdVar);
        sparseArray.put(5, lfdVar2);
    }

    public static lfd valueOf(String str) {
        return (lfd) Enum.valueOf(lfd.class, str);
    }

    public static lfd[] values() {
        return (lfd[]) b.clone();
    }
}
