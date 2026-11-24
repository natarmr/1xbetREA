package a;

import android.R;
import android.os.Build;

/* JADX INFO: loaded from: classes5.dex */
public enum c5q0 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(saj.m, R.string.cut, R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(saj.n, R.string.copy, R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(saj.o, R.string.paste, R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(saj.p, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(saj.q, Build.VERSION.SDK_INT <= 26 ? org.xbet.client1.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3784a;
    public final int b;
    public final int c;

    c5q0(Object obj, int i, int i2) {
        this.f3784a = obj;
        this.b = i;
        this.c = i2;
    }
}
