package a;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fuw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator f10186a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(fuw0.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = buw0.f3256a;
        }
        f10186a = comparator;
    }
}
