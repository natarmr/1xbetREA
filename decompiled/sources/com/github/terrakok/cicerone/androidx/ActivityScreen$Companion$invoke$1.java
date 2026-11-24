package com.github.terrakok.cicerone.androidx;

import a.uq;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/github/terrakok/cicerone/androidx/ActivityScreen$Companion$invoke$1", "Lcom/github/terrakok/cicerone/androidx/ActivityScreen;", "cicerone"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ActivityScreen$Companion$invoke$1 implements ActivityScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45455a;
    public final /* synthetic */ uq b;

    public ActivityScreen$Companion$invoke$1(String str, uq uqVar) {
        this.b = uqVar;
        this.f45455a = str;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF45455a() {
        return this.f45455a;
    }

    public final Intent c(Context context) {
        context.getClass();
        return (Intent) this.b.c(context);
    }
}
