package a;

import android.view.View;
import java.util.List;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes.dex */
public final class tr3 extends oyc {
    public final /* synthetic */ byte c;
    public final /* synthetic */ hie0 d;
    public final /* synthetic */ jie0 e;
    public final /* synthetic */ View f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tr3(byte b, hie0 hie0Var, jie0 jie0Var, View view, Object obj) {
        super(1);
        this.c = b;
        this.d = hie0Var;
        this.e = jie0Var;
        this.f = view;
        this.g = obj;
    }

    @Override // a.oyc
    public final void f(div0 div0Var) {
        byte b = this.c;
        Object obj = this.g;
        jie0 jie0Var = this.e;
        View view = this.f;
        hie0 hie0Var = this.d;
        switch (b) {
            case 0:
                if ((div0Var.f6156a.d() & 8) != 0) {
                    hie0Var.f13108a = false;
                }
                ApplicationActivity.y(view, jie0Var, (ApplicationActivity) obj);
                break;
            default:
                if ((div0Var.f6156a.d() & 8) != 0) {
                    hie0Var.f13108a = false;
                }
                osm0.n(view, jie0Var, (pz40) obj);
                break;
        }
    }

    @Override // a.oyc
    public final void g(div0 div0Var) {
        byte b = this.c;
        hie0 hie0Var = this.d;
        switch (b) {
            case 0:
                if ((div0Var.f6156a.d() & 8) != 0) {
                    hie0Var.f13108a = true;
                }
                break;
            default:
                if ((div0Var.f6156a.d() & 8) != 0) {
                    hie0Var.f13108a = true;
                }
                break;
        }
    }

    @Override // a.oyc
    public final xiv0 h(xiv0 xiv0Var, List list) {
        byte b = this.c;
        Object obj = this.g;
        jie0 jie0Var = this.e;
        View view = this.f;
        xiv0Var.getClass();
        list.getClass();
        switch (b) {
            case 0:
                uiv0 uiv0Var = xiv0Var.f40966a;
                ApplicationActivity.z(view, jie0Var, (ApplicationActivity) obj, uiv0Var.u(8), uiv0Var.i(8).d);
                break;
            default:
                uiv0 uiv0Var2 = xiv0Var.f40966a;
                osm0.m(view, jie0Var, (pz40) obj, uiv0Var2.u(8), uiv0Var2.i(8).d);
                break;
        }
        return xiv0Var;
    }

    @Override // a.oyc
    public final hcp0 i(div0 div0Var, hcp0 hcp0Var) {
        byte b = this.c;
        jie0 jie0Var = this.e;
        switch (b) {
            case 0:
                if ((div0Var.f6156a.d() & 8) != 0) {
                    float f = ((pfx) hcp0Var.c).d;
                    if (f > 0.0f) {
                        jie0Var.f16571a = f;
                    }
                }
                break;
            default:
                if ((div0Var.f6156a.d() & 8) != 0) {
                    float f2 = ((pfx) hcp0Var.c).d;
                    if (f2 > 0.0f) {
                        jie0Var.f16571a = f2;
                    }
                }
                break;
        }
        return hcp0Var;
    }
}
