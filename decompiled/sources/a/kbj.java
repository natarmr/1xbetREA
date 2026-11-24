package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class kbj extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18017a;

    public kbj(int i) {
        this.f18017a = i;
    }

    public kbj(Exception exc, int i) {
        super(exc);
        this.f18017a = i;
    }

    public kbj(String str, Exception exc, int i) {
        super(str, exc);
        this.f18017a = i;
    }
}
