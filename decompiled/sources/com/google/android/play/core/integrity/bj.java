package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class bj extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bk f45619a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bk bkVar, String str, long j) {
        super(str, j);
        this.f45619a = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    public final Task b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", this.f45619a.e);
        return this.f45619a.c.c(activity, bundle);
    }
}
