package org.xplatform.statistic.team.impl.team_statistic.domain.models;

import a.t9f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static final String a(TypeParam typeParam) {
        typeParam.getClass();
        if (typeParam != null) {
            if (typeParam instanceof TypeParam.Game) {
                return ((TypeParam.Game) typeParam).f47088a;
            }
            if (typeParam instanceof TypeParam.Team) {
                return ((TypeParam.Team) typeParam).f47089a;
            }
        }
        t9f.b();
        return null;
    }
}
