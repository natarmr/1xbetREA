package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public interface phi0 {
    void B(sgy sgyVar, Function1 function1);

    void G(sgy sgyVar, Function1 function1);

    void K(sgy sgyVar, Function1 function1);

    default void Z(sgy sgyVar, jiy jiyVar) {
        G(sgyVar, new rai0(jiyVar, (byte) 4));
    }

    void h(sgy sgyVar, sgy sgyVar2, jiy jiyVar);
}
