package a;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class htn extends nsn implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f13642a;

    public htn(EditText editText) {
        this.f13642a = new WeakReference(editText);
    }

    @Override // a.nsn
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f13642a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        itn.a((EditText) this.f13642a.get(), 1);
    }
}
