package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class vvn implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vvn f38109a = new vvn();
    public static final ewb0 b = x2x.j("EnEventResultStateResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        Iterator it = svn.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((svn) next).f32877a.equals(strM));
        svn svnVar = (svn) next;
        if (svnVar != null) {
            return svnVar;
        }
        v4i0.n(kng0.k("Unknown EnEventResultStateResponse code: ", strM));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        svn svnVar = (svn) obj;
        svnVar.getClass();
        String str = svnVar.f32877a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
