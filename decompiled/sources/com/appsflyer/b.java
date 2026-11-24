package com.appsflyer;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45425a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ b(Function1 function1, byte b) {
        this.f45425a = b;
        this.b = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Function1 function1;
        byte b = this.f45425a;
        Function1 function2 = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            default:
                function1 = (a) function2;
                break;
            case 3:
                function1 = (d) function2;
                break;
            case 4:
                function1 = (f) function2;
                break;
        }
        AFLogger.unregisterClient(function1);
    }
}
