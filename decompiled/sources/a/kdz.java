package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class kdz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dp00 f18128a;

    static {
        bp00 bp00Var = new bp00(false);
        f18128a = new dp00(ap00.b, bp00Var, bp00Var);
    }

    public static final hdz a(gmq gmqVar, fet fetVar) {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f46065a;
        boolean zG = fetVar.g(gmqVar);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zG || objP == obj) {
            objP = new hdz(gmqVar);
            fetVar.o0(objP);
        }
        hdz hdzVar = (hdz) objP;
        boolean zI = fetVar.i(gVar) | fetVar.i(hdzVar);
        Object objP2 = fetVar.P();
        yje yjeVar = null;
        if (zI || objP2 == obj) {
            objP2 = new jdz(gVar, hdzVar, yjeVar, (byte) 0);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, hdzVar, (Function2) objP2);
        boolean zI2 = fetVar.i(gVar) | fetVar.i(hdzVar);
        Object objP3 = fetVar.P();
        if (zI2 || objP3 == obj) {
            objP3 = new jdz(gVar, hdzVar, yjeVar, (byte) 1);
            fetVar.o0(objP3);
        }
        m0x0.t(fetVar, hdzVar, (Function2) objP3);
        return hdzVar;
    }
}
