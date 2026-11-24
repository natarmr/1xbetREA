package a;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m7a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kl5 f21310a;
    public static final List b;
    public static final m7a c;
    public static final m7a d;
    public static final m7a e;
    public static final m7a f;
    public static final m7a g;
    public static final /* synthetic */ m7a[] h;

    static {
        m7a m7aVar = new m7a("PICTURE", 0);
        c = m7aVar;
        m7a m7aVar2 = new m7a("CRYPTO", 1);
        d = m7aVar2;
        m7a m7aVar3 = new m7a("FRAME", 2);
        e = m7aVar3;
        m7a m7aVar4 = new m7a("PUSH", 3);
        f = m7aVar4;
        m7a m7aVar5 = new m7a("WAIT", 4);
        g = m7aVar5;
        h = new m7a[]{m7aVar, m7aVar2, m7aVar3, m7aVar4, m7aVar5};
        f21310a = new kl5();
        b = q3d.j(m7aVar, m7aVar3, m7aVar4);
    }

    public static m7a valueOf(String str) {
        return (m7a) Enum.valueOf(m7a.class, str);
    }

    public static m7a[] values() {
        return (m7a[]) h.clone();
    }
}
