package a;

import android.content.Intent;
import android.content.IntentSender;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArraySet;
import org.xplatform.uikit.components.chips.Chip;
import org.xplatform.uikit.components.chips.DsChip;
import org.xplatform.uikit.components.chips.DsChipGroup;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f58 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8948a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f58(vx9 vx9Var, ux9 ux9Var, gnf0 gnf0Var, int i) {
        this.f8948a = (byte) 1;
        this.c = vx9Var;
        this.d = gnf0Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f8948a;
        byte b2 = 1;
        Object obj = this.d;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((l58) obj2).D0(i, (CharSequence) obj);
                break;
            case 1:
                ((vx9) obj2).d(ux9.g((gnf0) obj), i);
                break;
            case 2:
                ((HorizontalScrollView) obj2).smoothScrollTo(i, ((Chip) obj).getTop());
                break;
            case 3:
                yfd yfdVar = (yfd) obj2;
                Serializable serializable = (Serializable) ((r7v) obj).f29996a;
                String str = (String) yfdVar.f42535a.get(Integer.valueOf(i));
                if (str != null) {
                    eo eoVar = (eo) yfdVar.e.get(str);
                    if ((eoVar != null ? eoVar.f8117a : null) == null) {
                        yfdVar.g.remove(str);
                        yfdVar.f.put(str, serializable);
                    } else {
                        wn wnVar = eoVar.f8117a;
                        if (yfdVar.d.remove(str)) {
                            wnVar.a(serializable);
                        }
                    }
                    break;
                }
                break;
            case 4:
                ((yfd) obj2).a(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 5:
                e7e e7eVar = (e7e) obj;
                kwd kwdVar = e7e.d2;
                ((RecyclerView) obj2).y0(i);
                e7eVar.S1.removeCallbacks(e7eVar.b2);
                u6e u6eVar = new u6e(e7eVar, b2);
                e7eVar.b2 = u6eVar;
                e7eVar.S1.postDelayed(u6eVar, 400L);
                break;
            case 6:
                int i2 = DsChipGroup.r;
                ((HorizontalScrollView) obj2).smoothScrollTo(i, ((DsChip) obj).getTop());
                break;
            default:
                sg00 sg00Var = (sg00) obj;
                for (ug00 ug00Var : (CopyOnWriteArraySet) obj2) {
                    if (!ug00Var.d) {
                        if (i != -1) {
                            ug00Var.b.b(i);
                        }
                        ug00Var.c = true;
                        sg00Var.invoke(ug00Var.f35600a);
                    }
                }
                break;
        }
    }

    public /* synthetic */ f58(Object obj, int i, Object obj2, byte b) {
        this.f8948a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
