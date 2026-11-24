package com.google.gson.internal;

import a.c99;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Excluder implements Cloneable {
    static {
        List list = Collections.EMPTY_LIST;
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            c99.l(e);
            return null;
        }
    }
}
