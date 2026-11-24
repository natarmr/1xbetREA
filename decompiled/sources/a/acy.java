package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class acy implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final acy f653a = new acy();
    public static final zby b = zby.b;

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        fww.t(rkjVar);
        return new yby((List) new zw3(qcy.f28507a, (byte) 0).e(rkjVar));
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yby ybyVar = (yby) obj;
        ybyVar.getClass();
        fww.u(bwnVar);
        qcy qcyVar = qcy.f28507a;
        ugi0 descriptor = qcyVar.getDescriptor();
        descriptor.getClass();
        uw3 uw3Var = new uw3(descriptor, (byte) 1);
        int size = ybyVar.size();
        cld cldVarA = bwnVar.a(uw3Var);
        Iterator<mcy> it = ybyVar.iterator();
        for (int i = 0; i < size; i++) {
            cldVarA.m(uw3Var, i, qcyVar, it.next());
        }
        cldVarA.c(uw3Var);
    }
}
