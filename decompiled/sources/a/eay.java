package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public enum eay {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(mg9.class, mg9.c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f7492a;
    public final Object b;

    eay(Class cls, Serializable serializable) {
        this.f7492a = cls;
        this.b = serializable;
    }
}
