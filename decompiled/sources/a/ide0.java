package a;

import android.content.Context;
import org.xbet.client1.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ide0 implements csz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ide0[] f14581a = {new ide0("MINUTES5", 0), new ide0("MINUTES10", 1), new ide0("MINUTES15", 2), new ide0("MINUTES30", 3), new ide0("MINUTES45", 4), new ide0("MINUTES60", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    ide0 EF5;

    public static ide0 valueOf(String str) {
        return (ide0) Enum.valueOf(ide0.class, str);
    }

    public static ide0[] values() {
        return (ide0[]) f14581a.clone();
    }

    @Override // a.csz
    public final String a(Context context) {
        context.getClass();
        String string = context.getString(R.string.reality_min_v2, Integer.valueOf(getValue()));
        string.getClass();
        return string;
    }

    @Override // a.csz
    public final int getValue() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 5;
        }
        if (iOrdinal == 1) {
            return 10;
        }
        if (iOrdinal == 2) {
            return 15;
        }
        if (iOrdinal == 3) {
            return 30;
        }
        if (iOrdinal == 4) {
            return 45;
        }
        if (iOrdinal == 5) {
            return 60;
        }
        t9f.b();
        return 0;
    }
}
