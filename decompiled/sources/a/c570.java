package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class c570 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c570 f3758a = new c570();
    public static final ewb0 b = x2x.j("OneXGamesType", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = s470.v.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((s470) next).f31592a.equals(strZ));
        s470 s470Var = (s470) next;
        return s470Var == null ? s470.GAME_UNAVAILABLE : s470Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        s470 s470Var = (s470) obj;
        s470Var.getClass();
        String str = s470Var.f31592a;
        Long lT0 = StringsKt.t0(str);
        if (lT0 != null) {
            bwnVar.l(lT0.longValue());
        } else {
            bwnVar.E(str);
        }
    }
}
