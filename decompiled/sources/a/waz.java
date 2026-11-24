package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface waz {
    Function1 getKey();

    default Function1 getType() {
        return j9x.z;
    }
}
