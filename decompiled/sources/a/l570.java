package a;

import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class l570 extends eiu0 {
    public final yoc c;
    public final yoc d;
    public final ugf0 e;
    public final mne f;
    public final duj g;
    public bby h;

    public l570(yoc yocVar, yoc yocVar2, ugf0 ugf0Var, mne mneVar, duj dujVar) {
        this.c = yocVar;
        this.d = yocVar2;
        this.e = ugf0Var;
        this.f = mneVar;
        this.g = dujVar;
    }

    public final void v(bvc bvcVar, List list, String str, Function1 function1) {
        bby bbyVar = this.h;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.h = sac.S(bvcVar, str, this.d.a(), kotlin.collections.a.c(UnknownHostException.class), new az60(this, list, function1, (yje) null), this.f.f22085a, new jl40((Object) this, (Object) list, (Object) function1, (byte) 15));
        }
    }
}
