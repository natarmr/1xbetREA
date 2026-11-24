package org.xplatform.personal.impl.presentation.edit;

import a.bnn0;
import a.vne;
import a.w2c0;
import a.yje;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends bnn0 implements Function2 {
    public n i;
    public int j;
    public byte k;
    public final /* synthetic */ w2c0 l;
    public final /* synthetic */ n m;
    public final /* synthetic */ ProfileEditViewModel$UiState.Loaded n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(w2c0 w2c0Var, n nVar, ProfileEditViewModel$UiState.Loaded loaded, yje yjeVar) {
        super(2, yjeVar);
        this.l = w2c0Var;
        this.m = nVar;
        this.n = loaded;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new k(this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x013d  */
    /* JADX WARN: Code duplicated, block: B:60:0x014e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    /* JADX WARN: Code duplicated, block: B:63:0x0170  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ff, code lost:
    
        if (r9 == r0) goto L55;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xplatform.personal.impl.presentation.edit.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
