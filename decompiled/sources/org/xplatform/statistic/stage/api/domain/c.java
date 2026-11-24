package org.xplatform.statistic.stage.api.domain;

import a.t9f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static final String a(TypeStageId typeStageId) {
        typeStageId.getClass();
        if (typeStageId != null) {
            if (typeStageId instanceof TypeStageId.Game) {
                return ((TypeStageId.Game) typeStageId).f47068a;
            }
            if (typeStageId instanceof TypeStageId.Champ) {
                return ((TypeStageId.Champ) typeStageId).f47067a;
            }
        }
        t9f.b();
        return null;
    }
}
