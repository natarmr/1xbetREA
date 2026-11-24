package a;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xfn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f40798a = new zfn(new dcn(8), 1);

    public static final wfn a(fet fetVar) {
        return ((Configuration) fetVar.k(dy2.f6873a)).smallestScreenWidthDp < 600 ? yfn.g : yfn.h;
    }

    public static final wfn b(boolean z) {
        return z ? yfn.h : yfn.g;
    }
}
