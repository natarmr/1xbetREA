package com.huawei.hms.common.data;

import a.kw3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        return freezeIterable(Arrays.asList(eArr));
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        kw3 kw3Var = (ArrayList<T>) new ArrayList();
        if (iterable != null) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                kw3Var.add(it.next().freeze());
            }
        }
        return kw3Var;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        return freezeIterable(arrayList);
    }
}
