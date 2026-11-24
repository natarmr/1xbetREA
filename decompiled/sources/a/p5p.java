package a;

import android.content.ComponentCallbacks2;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p5p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26416a;
    public final /* synthetic */ s5p b;

    public /* synthetic */ p5p(s5p s5pVar, byte b) {
        this.f26416a = b;
        this.b = s5pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26416a;
        s5p s5pVar = this.b;
        switch (b) {
            case 0:
                nek nekVar = s5p.P1;
                i1w0 i1w0Var = ((k6p) s5pVar.N1.getValue()).b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 1:
                nek nekVar2 = s5p.P1;
                ComponentCallbacks2 application = s5pVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(t5p.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof t5p)) {
                        ze3Var = null;
                    }
                    t5p t5pVar = (t5p) ze3Var;
                    if (t5pVar != null) {
                        return t5pVar.a(a4n0.f(s5pVar));
                    }
                }
                jf4.n(b1j.i(t5p.class, "Cannot create dependency "));
                return null;
            case 2:
                nek nekVar3 = s5p.P1;
                return (hgi) ((igi) s5pVar.M1.getValue()).r.get();
            default:
                nek nekVar4 = s5p.P1;
                kiu0 kiu0Var = s5pVar.N1;
                Class<k6p> cls = k6p.class;
                k4p k4pVar = new k4p(1, (k6p) kiu0Var.getValue(), cls, "onFavoriteChampClick", "onFavoriteChampClick(Lorg/xplatform/favorites/impl/presentation/all_champs/models/FavoriteChampsUiModel;)V", 0, (byte) 1);
                k4p k4pVar2 = new k4p(1, (k6p) kiu0Var.getValue(), cls, "onRemoveFavoriteChampClick", "onRemoveFavoriteChampClick(Lorg/xplatform/favorites/impl/presentation/all_champs/models/FavoriteChampsUiModel;)V", 0, (byte) 2);
                o5p o5pVar = new o5p();
                int i = 3;
                gbn gbnVar = new gbn(new x6o((byte) 28), new e9k(i, (byte) 26), new f5p(k4pVar2, k4pVar, (byte) 1), gzn.t);
                dp dpVar = o5pVar.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new x6o((byte) 27), new e9k(i, (byte) 25), new e4p((byte) 7), gzn.s));
                return o5pVar;
        }
    }
}
