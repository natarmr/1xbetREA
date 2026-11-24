package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class xeu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dgu f40761a;

    public /* synthetic */ xeu(dgu dguVar) {
        this.f40761a = dguVar;
    }

    public Object a(String str, String str2, bnn0 bnn0Var) {
        dgu dguVar = this.f40761a;
        Object objD0 = qjj.d0(((mne) dguVar.d).b, new efu((yje) null, dguVar, str, str2), bnn0Var);
        wne wneVar = wne.f39444a;
        if (objD0 != wneVar) {
            objD0 = Unit.f46060a;
        }
        return objD0 == wneVar ? objD0 : Unit.f46060a;
    }
}
