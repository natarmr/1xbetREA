package a;

import android.graphics.Typeface;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ad3 implements sbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f658a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ad3(Object obj, byte b) {
        this.f658a = b;
        this.b = obj;
    }

    @Override // a.sbe
    public final void accept(Object obj) {
        byte b = this.f658a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            case 1:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            case 2:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            case 3:
                l55 l55Var = (l55) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int i = l55Var.b - ((l45) entry.getKey()).f;
                    if (((l45) entry.getKey()).g) {
                        i = -i;
                    }
                    int i2 = jls0.i(i);
                    cmn0 cmn0Var = (cmn0) entry.getValue();
                    cmn0Var.getClass();
                    ofm0.w(new vmd0(cmn0Var, i2, -1));
                }
                break;
            case 4:
                hi hiVar = (hi) obj2;
                l8x.U("SurfaceViewImpl", "Safe to release surface.");
                if (hiVar != null) {
                    hiVar.b();
                }
                break;
            case 5:
                ((tu9) obj2).b((k55) obj);
                break;
            default:
                ((hzb0) obj2).f((jjv0) obj);
                break;
        }
    }
}
