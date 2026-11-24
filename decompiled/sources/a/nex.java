package a;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class nex implements oex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputContentInfo f23408a;

    public nex(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f23408a = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // a.oex
    public final ClipDescription getDescription() {
        return this.f23408a.getDescription();
    }

    @Override // a.oex
    public final Object h() {
        return this.f23408a;
    }

    @Override // a.oex
    public final Uri l() {
        return this.f23408a.getContentUri();
    }

    @Override // a.oex
    public final void m() {
        this.f23408a.requestPermission();
    }

    @Override // a.oex
    public final Uri o() {
        return this.f23408a.getLinkUri();
    }

    public nex(Object obj) {
        this.f23408a = (InputContentInfo) obj;
    }
}
