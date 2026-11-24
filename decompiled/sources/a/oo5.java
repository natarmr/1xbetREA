package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public enum oo5 implements Serializable {
    ACTION_INFO(0),
    ACTION_ONE_X_GAME(10),
    ACTION_OPEN_SECTION(11),
    ACTION_OPEN_MATCHES(13),
    /* JADX INFO: Fake field, exist only in values array */
    ACTION_NEW_YEAR(24),
    ACTION_DYNAMIC(25);

    public static final bj5 b = new bj5();
    public static final oo5[] c = values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f25576a;

    /* JADX WARN: Multi-variable type inference failed */
    oo5(int i2) {
        this.f25576a = i2;
    }
}
