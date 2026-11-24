package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public enum day {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(lg9.class, lg9.c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5774a;
    public final Object b;

    day(Class cls, Serializable serializable) {
        this.f5774a = cls;
        this.b = serializable;
    }
}
