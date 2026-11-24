package a;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class s24 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f31483a;
    public final Uri b;
    public final /* synthetic */ krs0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s24(krs0 krs0Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = krs0Var;
        this.f31483a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.c.j();
    }
}
