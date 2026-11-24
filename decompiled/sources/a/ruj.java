package a;

import android.gov.nist.core.Separators;
import androidx.appcompat.widget.ActionBarContextView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ruj implements cku0 {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f31131a;
    public byte b;
    public Object c;

    public static void b(int i, ArrayList arrayList) {
        int i2 = 0;
        while (true) {
            if (i2 >= 7) {
                i2 = -1;
                break;
            } else if (d[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    @Override // a.cku0
    public void a() {
        this.f31131a = true;
    }

    public androidx.media3.common.b c(androidx.media3.common.b bVar) {
        if (!this.f31131a || !((kwd) this.c).c(bVar)) {
            return bVar;
        }
        awq awqVarA = bVar.a();
        String str = bVar.l;
        awqVarA.o = mg40.n("application/x-media3-cues");
        awqVarA.P = ((kwd) this.c).a(bVar);
        StringBuilder sb = new StringBuilder();
        sb.append(bVar.p);
        sb.append(str != null ? Separators.SP.concat(str) : "");
        awqVarA.k = sb.toString();
        awqVarA.t = Long.MAX_VALUE;
        return new androidx.media3.common.b(awqVarA);
    }

    @Override // a.cku0
    public void onAnimationEnd() {
        if (this.f31131a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.f = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    @Override // a.cku0
    public void onAnimationStart() {
        super/*android.view.View*/.setVisibility(0);
        this.f31131a = false;
    }
}
