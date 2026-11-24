package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class lfi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yei f19957a;

    public lfi(yei yeiVar) {
        this.f19957a = yeiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        mfi mfiVar = (mfi) this.f19957a.b;
        kxk kxkVar = mfiVar.f21695a;
        lrc lrcVar = new lrc(mfiVar.b);
        iyk iykVar = new iyk();
        iykVar.f15593a = new LinkedHashMap();
        return new txk(kxkVar, new rpt(new pmi(lrcVar, iykVar, mfiVar.c, mfiVar.d)), mfiVar.d, mfiVar.e, vzg0Var);
    }
}
