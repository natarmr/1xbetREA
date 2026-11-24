package com.scottyab.rootbeer;

import a.vdx;

/* JADX INFO: loaded from: classes.dex */
public class RootBeerNative {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f46049a;

    static {
        try {
            System.loadLibrary("toolChecker");
            f46049a = true;
        } catch (UnsatisfiedLinkError e) {
            vdx.H(e);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);
}
