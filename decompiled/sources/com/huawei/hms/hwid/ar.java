package com.huawei.hms.hwid;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<Integer> f45901a;

    static {
        HashSet hashSet = new HashSet();
        f45901a = hashSet;
        hashSet.add(0);
    }

    public static int a(int i) {
        return f45901a.contains(Integer.valueOf(i)) ? 0 : 1;
    }
}
