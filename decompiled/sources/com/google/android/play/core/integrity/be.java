package com.google.android.play.core.integrity;

import a.h8w0;
import a.j5w0;
import a.m8w0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class be extends m8w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f45614a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.b = bnVar;
        this.f45614a = context;
    }

    @Override // a.m8w0
    public final void b() {
        int i;
        Context context = this.f45614a;
        TaskCompletionSource taskCompletionSource = this.b.d;
        h8w0 h8w0Var = j5w0.f15954a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            i = (applicationInfo != null && applicationInfo.enabled && j5w0.a(packageInfo.signatures)) ? packageInfo.versionCode : 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        taskCompletionSource.trySetResult(Integer.valueOf(i));
    }
}
