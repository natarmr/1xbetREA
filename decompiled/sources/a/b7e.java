package a;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class b7e extends lhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e7e f2104a;
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ RecyclerView d;

    public b7e(e7e e7eVar, ImageView imageView, TextView textView, RecyclerView recyclerView) {
        this.f2104a = e7eVar;
        this.b = imageView;
        this.c = textView;
        this.d = recyclerView;
    }

    @Override // a.lhe0
    public final void b(RecyclerView recyclerView, int i) {
        kwd kwdVar = e7e.d2;
        RecyclerView recyclerView2 = this.d;
        tl60.a(recyclerView2, new hf5(recyclerView2, this.f2104a, this.b, this.c, (byte) 4));
    }
}
