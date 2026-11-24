package a;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class ji5 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16559a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public ji5(Context context) {
        context.getClass();
        this.f16559a = context.getResources().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.extra_large_horizontal_margin_dynamic);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.space_12);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.space_24);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:63:0x0104  */
    /* JADX WARN: Code duplicated, block: B:79:0x0139  */
    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        List list;
        Object next;
        boolean z;
        boolean z2;
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        super.f(rect, view, recyclerView, the0Var);
        int iU = RecyclerView.U(view);
        if (iU == -1) {
            return;
        }
        yge0 adapter = recyclerView.getAdapter();
        adapter.getClass();
        ArrayList arrayList = (ArrayList) ((oqd) adapter).d.e;
        if (arrayList.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((nj50) it.next()).c);
            }
            list = arrayList2;
        }
        List listUnmodifiableList = Collections.unmodifiableList(list);
        listUnmodifiableList.getClass();
        Iterator it2 = listUnmodifiableList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(((yge0) next) instanceof fk5));
        fk5 fk5Var = next instanceof fk5 ? (fk5) next : null;
        if (fk5Var == null || iU == fk5Var.d()) {
            return;
        }
        if (iU == 0 || (fk5Var.B(iU) instanceof lfs0)) {
            rect.top = this.d;
        }
        if (fk5Var.B(iU) instanceof aes0) {
            if (iU > 0 ? ((vk5) fk5Var.B(iU - 1)) instanceof ogs0 : false) {
                rect.top = this.e;
            }
        }
        if (fk5Var.B(iU) instanceof gxn) {
            rect.top = this.f;
        }
        vk5 vk5Var = (vk5) fk5Var.B(iU);
        if (vk5Var == null) {
            int i = this.f16559a;
            rect.left = i;
            rect.right = i;
        } else if (vk5Var instanceof lfs0) {
            int i2 = this.b;
            rect.left = i2;
            rect.right = i2;
        } else if (vk5Var instanceof aes0) {
            int i3 = this.c;
            rect.left = i3;
            rect.right = i3;
        } else {
            int i4 = this.f16559a;
            rect.left = i4;
            rect.right = i4;
        }
        boolean z3 = true;
        if (iU > 0) {
            vk5 vk5Var2 = (vk5) fk5Var.B(iU);
            vk5 vk5Var3 = (vk5) fk5Var.B(iU - 1);
            if (vk5Var2 instanceof tjz) {
                z = vk5Var3 instanceof tjz;
            } else if (vk5Var2 == null || vk5Var3 == null || vk5Var3.getClass() != vk5Var2.getClass()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        boolean z4 = !z || iU == 0;
        if (iU < fk5Var.d() - 1) {
            vk5 vk5Var4 = (vk5) fk5Var.B(iU);
            vk5 vk5Var5 = (vk5) fk5Var.B(iU + 1);
            if (vk5Var4 instanceof tjz) {
                z2 = vk5Var5 instanceof tjz;
            } else if (vk5Var4 == null || vk5Var5 == null || vk5Var5.getClass() != vk5Var4.getClass()) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2 && iU != fk5Var.d() - 1) {
            z3 = false;
        }
        if ((fk5Var.B(iU) instanceof tjz) || (fk5Var.B(iU) instanceof ogs0)) {
            Object objP = recyclerView.P(iU, false);
            czx czxVar = objP instanceof czx ? (czx) objP : null;
            if (czxVar == null) {
                return;
            }
            czxVar.a(z4, z3);
        }
    }
}
