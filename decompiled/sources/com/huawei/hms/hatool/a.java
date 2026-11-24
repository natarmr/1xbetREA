package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static z0 f45846a;

    public static void a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !q1.b().a()) {
            return;
        }
        if (i == 1 || i == 0) {
            f45846a.a(i, str, linkedHashMap);
            return;
        }
        v.d("hmsSdk", "Data type no longer collects range.type: " + i);
    }

    public static void b(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !q1.b().a()) {
            return;
        }
        if (i == 1 || i == 0) {
            f45846a.b(i, str, linkedHashMap);
            return;
        }
        v.d("hmsSdk", "Data type no longer collects range.type: " + i);
    }

    public static void c() {
        if (a() == null || !q1.b().a()) {
            return;
        }
        f45846a.a(-1);
    }

    private static synchronized z0 a() {
        z0 z0VarB;
        z0VarB = f45846a;
        if (z0VarB == null) {
            z0VarB = q.c().b();
            f45846a = z0VarB;
        }
        return z0VarB;
    }

    public static boolean b() {
        return q.c().a();
    }

    @Deprecated
    public static void a(Context context, String str, String str2) {
        if (a() != null) {
            f45846a.a(context, str, str2);
        }
    }
}
