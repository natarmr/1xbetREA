package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum iov0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(mg9.c),
    ENUM(null),
    MESSAGE(null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15134a;

    iov0(Serializable serializable) {
        this.f15134a = serializable;
    }
}
