package a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zv40 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f45039a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv40(Context context) {
        super(context, null);
        context.getClass();
        this.f45039a = maz.a(wez.b, new ha30(this, this, (byte) 8));
    }

    private final qku0 getBinding() {
        return (qku0) this.f45039a.getValue();
    }

    public final void a(String str, String str2) {
        List list = u0d.f34849a;
        ImageView imageView = getBinding().b;
        qzw qzwVar = qzw.f29598a;
        u0d.n(imageView, str, 0, 10);
        getBinding().c.setText(str2);
    }
}
