package org.xplatform.personal.impl.presentation.edit;

import a.bnn0;
import a.p7m0;
import a.wne;
import a.yje;
import a.z1x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ n j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = nVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        b bVar = new b(this.j, yjeVar);
        bVar.i = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ProfileEditViewModel$UiState) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        ProfileEditViewModel$UiState profileEditViewModel$UiState = (ProfileEditViewModel$UiState) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (profileEditViewModel$UiState instanceof ProfileEditViewModel$UiState.Loaded) {
            n nVar = this.j;
            p7m0 p7m0Var = nVar.s;
            do {
                value = p7m0Var.getValue();
                ((Boolean) value).getClass();
            } while (!p7m0Var.m(value, Boolean.valueOf(!Intrinsics.d(nVar.r, ((ProfileEditViewModel$UiState.Loaded) profileEditViewModel$UiState).f46786a))));
        }
        return Unit.f46060a;
    }
}
