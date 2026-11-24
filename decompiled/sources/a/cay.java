package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public enum cay {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(og9.class, og9.b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4036a;
    public final Object b;

    cay(Class cls, Serializable serializable) {
        this.f4036a = cls;
        this.b = serializable;
    }
}
