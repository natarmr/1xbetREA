package org.xplatform.cyber.section.api.domain.entity;

import a.t9f;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final String a(CyberGamesPage cyberGamesPage) {
        cyberGamesPage.getClass();
        if (Intrinsics.d(cyberGamesPage, CyberGamesPage.OneXCyber.INSTANCE)) {
            return "1XCyber";
        }
        if (Intrinsics.d(cyberGamesPage, CyberGamesPage.Real.INSTANCE)) {
            return "real";
        }
        if (Intrinsics.d(cyberGamesPage, CyberGamesPage.Virtual.INSTANCE)) {
            return "virtual";
        }
        t9f.b();
        return null;
    }

    public static final String b(CyberGamesPage cyberGamesPage) {
        cyberGamesPage.getClass();
        if (Intrinsics.d(cyberGamesPage, CyberGamesPage.OneXCyber.INSTANCE)) {
            return "stream";
        }
        if (Intrinsics.d(cyberGamesPage, CyberGamesPage.Real.INSTANCE)) {
            return "real";
        }
        if (Intrinsics.d(cyberGamesPage, CyberGamesPage.Virtual.INSTANCE)) {
            return "virtual";
        }
        t9f.b();
        return null;
    }

    public static final Pair c(long j, CyberGamesPage cyberGamesPage) {
        cyberGamesPage.getClass();
        return Intrinsics.d(cyberGamesPage, CyberGamesPage.Real.INSTANCE) ? new Pair(40L, Long.valueOf(j)) : new Pair(Long.valueOf(j), -1L);
    }

    public static final CyberGamesPage d(int i) {
        CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
        if (i != real.f46556a) {
            CyberGamesPage.Virtual virtual = CyberGamesPage.Virtual.INSTANCE;
            if (i == virtual.f46556a) {
                return virtual;
            }
            CyberGamesPage.OneXCyber oneXCyber = CyberGamesPage.OneXCyber.INSTANCE;
            if (i == oneXCyber.f46556a) {
                return oneXCyber;
            }
        }
        return real;
    }

    public static final String e(int i) {
        if (i == CyberGamesPage.Real.INSTANCE.f46556a) {
            return "real";
        }
        if (i == CyberGamesPage.Virtual.INSTANCE.f46556a) {
            return "virtual";
        }
        return i == CyberGamesPage.OneXCyber.INSTANCE.f46556a ? "cyber" : "real";
    }
}
