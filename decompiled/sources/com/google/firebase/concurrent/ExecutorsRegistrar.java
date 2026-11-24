package com.google.firebase.concurrent;

import a.a7t0;
import a.b8z;
import a.cc5;
import a.g1x;
import a.jkd0;
import a.jmz;
import a.ofd;
import a.ogd;
import a.pfd;
import a.sa8;
import a.udk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b8z f45662a = new b8z(new ogd((byte) 1));
    public static final b8z b = new b8z(new ogd((byte) 2));
    public static final b8z c = new b8z(new ogd((byte) 3));
    public static final b8z d = new b8z(new ogd((byte) 4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        jkd0 jkd0Var = new jkd0(cc5.class, ScheduledExecutorService.class);
        jkd0[] jkd0VarArr = {new jkd0(cc5.class, ExecutorService.class), new jkd0(cc5.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(jkd0Var);
        for (int i = 0; i < 2; i++) {
            g1x.q(jkd0VarArr[i], "Null interface");
        }
        Collections.addAll(hashSet, jkd0VarArr);
        pfd pfdVar = new pfd(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new udk((byte) 9), hashSet3);
        jkd0 jkd0Var2 = new jkd0(sa8.class, ScheduledExecutorService.class);
        jkd0[] jkd0VarArr2 = {new jkd0(sa8.class, ExecutorService.class), new jkd0(sa8.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(jkd0Var2);
        for (int i2 = 0; i2 < 2; i2++) {
            g1x.q(jkd0VarArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, jkd0VarArr2);
        pfd pfdVar2 = new pfd(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new udk((byte) 10), hashSet6);
        jkd0 jkd0Var3 = new jkd0(jmz.class, ScheduledExecutorService.class);
        jkd0[] jkd0VarArr3 = {new jkd0(jmz.class, ExecutorService.class), new jkd0(jmz.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(jkd0Var3);
        for (int i3 = 0; i3 < 2; i3++) {
            g1x.q(jkd0VarArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, jkd0VarArr3);
        pfd pfdVar3 = new pfd(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new udk((byte) 11), hashSet9);
        ofd ofdVarA = pfd.a(new jkd0(a7t0.class, Executor.class));
        ofdVarA.f = new udk((byte) 12);
        return Arrays.asList(pfdVar, pfdVar2, pfdVar3, ofdVarA.b());
    }
}
