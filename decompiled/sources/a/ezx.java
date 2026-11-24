package a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ezx implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ezx f8692a;
    public static final /* synthetic */ ezx[] b;

    static {
        ezx ezxVar = new ezx("INSTANCE", 0);
        f8692a = ezxVar;
        b = new ezx[]{ezxVar};
    }

    public static ezx valueOf(String str) {
        return (ezx) Enum.valueOf(ezx.class, str);
    }

    public static ezx[] values() {
        return (ezx[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        x0x.J("no calls to next() since the last call to remove()", false);
    }
}
