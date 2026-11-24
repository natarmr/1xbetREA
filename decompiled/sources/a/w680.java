package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w680 implements Serializable {
    public Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean b() {
        return false;
    }

    public Object d() {
        return null;
    }
}
