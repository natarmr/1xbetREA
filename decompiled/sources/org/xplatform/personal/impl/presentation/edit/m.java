package org.xplatform.personal.impl.presentation.edit;

import a.bfn;
import a.bnn0;
import a.ibc;
import a.jf4;
import a.qcc;
import a.sdj;
import a.uen;
import a.vne;
import a.w2c0;
import a.wen;
import a.wne;
import a.yje;
import a.z1x;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModel;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItem;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ n j;
    public final /* synthetic */ w2c0 k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, w2c0 w2c0Var, String str, yje yjeVar) {
        super(2, yjeVar);
        this.j = nVar;
        this.k = w2c0Var;
        this.l = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new m(this.j, this.k, this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            uen uenVar = wen.b;
            long jW0 = ibc.w0(300L, bfn.MILLISECONDS);
            this.i = true;
            if (qcc.P(jW0, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        sdj sdjVar = n.v;
        n nVar = this.j;
        ProfileEditViewModel$UiState profileEditViewModel$UiStateB = nVar.B();
        if (!(profileEditViewModel$UiStateB instanceof ProfileEditViewModel$UiState.Loaded)) {
            return Unit.f46060a;
        }
        ProfileEditViewModel$UiState.Loaded loaded = (ProfileEditViewModel$UiState.Loaded) profileEditViewModel$UiStateB;
        Map map = loaded.f46786a;
        w2c0 w2c0Var = this.k;
        Object obj2 = map.get(w2c0Var);
        ProfileEditUiModelItem profileEditUiModelItem = obj2 instanceof ProfileEditUiModelItem ? (ProfileEditUiModelItem) obj2 : null;
        if (profileEditUiModelItem == null) {
            return Unit.f46060a;
        }
        String str = profileEditUiModelItem.b;
        String str2 = this.l;
        if (str.equals(str2)) {
            return Unit.f46060a;
        }
        Object obj3 = map.get(w2c0Var);
        ProfileEditUiModel profileEditUiModel = obj3 instanceof ProfileEditUiModel ? (ProfileEditUiModel) obj3 : null;
        if (profileEditUiModel != null) {
            str2.getClass();
            ProfileEditUiModelItem profileEditUiModelItemZ = ProfileEditUiModelItem.z((ProfileEditUiModelItem) profileEditUiModel, str2, "", 45);
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(w2c0Var, profileEditUiModelItemZ);
            loaded = new ProfileEditViewModel$UiState.Loaded(linkedHashMap);
        }
        nVar.E(loaded);
        return Unit.f46060a;
    }
}
