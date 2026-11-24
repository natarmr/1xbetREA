package a;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class nka extends lhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function2 f23673a = new im8((byte) 23);
    public RecyclerView b;
    public nka c;

    @Override // a.lhe0
    public final void b(RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2;
        nka nkaVar;
        RecyclerView recyclerView3;
        if (i != 0) {
            if (i != 1 || (nkaVar = this.c) == null || (recyclerView3 = this.b) == null) {
                return;
            }
            recyclerView3.u0(nkaVar);
            return;
        }
        nka nkaVar2 = this.c;
        if (nkaVar2 == null || (recyclerView2 = this.b) == null) {
            return;
        }
        recyclerView2.o(nkaVar2);
    }

    @Override // a.lhe0
    public final void d(RecyclerView recyclerView, int i, int i2) {
        this.f23673a.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
