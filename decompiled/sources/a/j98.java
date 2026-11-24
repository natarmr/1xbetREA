package a;

import android.text.style.StrikethroughSpan;
import io.noties.markwon.core.spans.LinkSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class j98 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16125a;

    public /* synthetic */ j98(byte b) {
        this.f16125a = b;
    }

    public final Object a(w5z w5zVar, ljf0 ljf0Var) {
        byte b = 0;
        switch (this.f16125a) {
            case 0:
                return new i98((b930) w5zVar.f38604a, (byte) 0);
            case 1:
                return new xxc((b930) w5zVar.f38604a);
            case 2:
                return new fyc((b930) w5zVar.f38604a, b);
            case 3:
                return new ltn((byte) 0);
            case 4:
                return new gtv((b930) w5zVar.f38604a, ((Integer) uc9.q.a(ljf0Var)).intValue());
            case 5:
                return new LinkSpan((b930) w5zVar.f38604a, (String) uc9.r.a(ljf0Var), (ub00) w5zVar.c);
            case 6:
                b930 b930Var = (b930) w5zVar.f38604a;
                return jme.f16760a == uc9.n.a(ljf0Var) ? new pd9(b930Var, ((Integer) uc9.o.a(ljf0Var)).intValue()) : new ga80(b930Var, String.valueOf(uc9.p.a(ljf0Var)).concat(". "));
            case 7:
                return new StrikethroughSpan();
            case 8:
                return new ltn((byte) 2);
            default:
                return new i98((b930) w5zVar.f38604a, (byte) 1);
        }
    }
}
