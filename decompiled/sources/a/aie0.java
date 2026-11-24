package a;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class aie0 extends lhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f921a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aie0(Object obj, Object obj2, byte b) {
        this.f921a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // a.lhe0
    public final void b(RecyclerView recyclerView, int i) {
        byte b = this.f921a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Function1) obj).invoke(Integer.valueOf(i));
                break;
            default:
                if (i == 0) {
                    recyclerView.u0(this);
                    ((vju0) obj).x((lk50) this.c, false);
                }
                break;
        }
    }

    @Override // a.lhe0
    public void d(RecyclerView recyclerView, int i, int i2) {
        switch (this.f921a) {
            case 0:
                ((Function2) this.c).invoke(Integer.valueOf(i), Integer.valueOf(i2));
                break;
        }
    }
}
