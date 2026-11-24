package a;

import android.os.Handler;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lz2 implements zkz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20889a;
    public final Object b;
    public final Object c;

    public lz2(blz blzVar) {
        this.f20889a = (byte) 6;
        this.b = blzVar;
        hmc hmcVar = hmc.c;
        Class<?> cls = blzVar.getClass();
        fmc fmcVar = (fmc) hmcVar.f13297a.get(cls);
        this.c = fmcVar == null ? hmcVar.a(cls, null) : fmcVar;
    }

    @Override // a.zkz
    public final void l(clz clzVar, kkz kkzVar) {
        byte b = this.f20889a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (kkzVar.a().compareTo(lkz.d) >= 0) {
                    ((hie0) obj).f13108a = false;
                    ((Fragment) obj2).u1.f(this);
                }
                break;
            case 1:
                qvj qvjVar = (qvj) obj;
                switch (rvj.f31170a[kkzVar.ordinal()]) {
                    case 1:
                        qvjVar.onCreate(clzVar);
                        break;
                    case 2:
                        qvjVar.onStart(clzVar);
                        break;
                    case 3:
                        qvjVar.onResume(clzVar);
                        break;
                    case 4:
                        qvjVar.onPause(clzVar);
                        break;
                    case 5:
                        qvjVar.onStop(clzVar);
                        break;
                    case 6:
                        qvjVar.onDestroy(clzVar);
                        break;
                    case 7:
                        jf4.o("ON_ANY must not been send by anybody");
                        break;
                    default:
                        t9f.b();
                        break;
                }
                zkz zkzVar = (zkz) obj2;
                if (zkzVar != null) {
                    zkzVar.l(clzVar, kkzVar);
                }
                break;
            case 2:
                m6r m6rVar = (m6r) obj;
                f5r f5rVar = (f5r) obj2;
                if (!f5rVar.e.a0()) {
                    clzVar.x().f(this);
                    if (((FrameLayout) m6rVar.f40887a).isAttachedToWindow()) {
                        f5rVar.E(m6rVar);
                    }
                    break;
                }
                break;
            case 3:
                if (kkzVar == kkz.ON_DESTROY) {
                    ((Handler) obj).removeCallbacks((mx2) obj2);
                    clzVar.x().f(this);
                }
                break;
            case 4:
                if (kkzVar == kkz.ON_START) {
                    ((glz) obj).f(this);
                    ((kd30) obj2).V();
                }
                break;
            case 5:
                dg60 dg60Var = (dg60) obj;
                int i = ig60.f14721a[kkzVar.ordinal()];
                if (i == 1) {
                    dg60Var.j(true);
                    break;
                } else if (i == 2) {
                    dg60Var.j(false);
                    break;
                } else if (i == 3) {
                    dg60Var.h();
                    ((glz) obj2).f(this);
                    break;
                }
                break;
            default:
                blz blzVar = (blz) obj;
                HashMap map = ((fmc) obj2).f9773a;
                fmc.a((List) map.get(kkzVar), clzVar, kkzVar, blzVar);
                fmc.a((List) map.get(kkz.ON_ANY), clzVar, kkzVar, blzVar);
                break;
        }
    }

    public /* synthetic */ lz2(Object obj, Object obj2, byte b) {
        this.f20889a = b;
        this.b = obj;
        this.c = obj2;
    }

    public lz2(dg60 dg60Var, jg60 jg60Var, glz glzVar) {
        this.f20889a = (byte) 5;
        this.b = dg60Var;
        this.c = glzVar;
    }

    public lz2(f5r f5rVar, m6r m6rVar) {
        this.f20889a = (byte) 2;
        this.c = f5rVar;
        this.b = m6rVar;
    }
}
