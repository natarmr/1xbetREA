package org.xplatform.personal.impl.presentation.edit;

import a.bnn0;
import a.vne;
import a.yje;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ n j;
    public final /* synthetic */ ProfileEditViewModel$UiState.Loaded k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, ProfileEditViewModel$UiState.Loaded loaded, yje yjeVar) {
        super(2, yjeVar);
        this.j = nVar;
        this.k = loaded;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new l(this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01f6, code lost:
    
        if (r0 == r4) goto L134;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws a.ypn {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xplatform.personal.impl.presentation.edit.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
