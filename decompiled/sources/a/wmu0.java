package a;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class wmu0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f39420a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmu0(Fragment fragment, String str) {
        super(str);
        fragment.getClass();
        this.f39420a = fragment;
    }
}
