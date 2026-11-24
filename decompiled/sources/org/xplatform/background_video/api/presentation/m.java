package org.xplatform.background_video.api.presentation;

import a.ae5;
import a.be5;
import a.t9f;
import a.vd5;
import a.wd5;
import a.xd5;
import a.yd5;
import a.zd5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {
    public static final BackgroundVideoDownloadServiceParams a(be5 be5Var) {
        be5Var.getClass();
        if (be5Var instanceof vd5) {
            return new BackgroundVideoDownloadServiceParams$StartDestination$Preview.Large(((vd5) be5Var).f37215a);
        }
        if (be5Var instanceof wd5) {
            return new BackgroundVideoDownloadServiceParams$StartDestination$Preview.Medium(((wd5) be5Var).f38957a);
        }
        if (be5Var instanceof xd5) {
            return new BackgroundVideoDownloadServiceParams$StartDestination$Preview.Small(((xd5) be5Var).f40679a);
        }
        if (be5Var instanceof yd5) {
            return new BackgroundVideoDownloadServiceParams$StartDestination$Video.Large(((yd5) be5Var).f42416a);
        }
        if (be5Var instanceof zd5) {
            return new BackgroundVideoDownloadServiceParams$StartDestination$Video.Medium(((zd5) be5Var).f44196a);
        }
        if (be5Var instanceof ae5) {
            return new BackgroundVideoDownloadServiceParams$StartDestination$Video.Small(((ae5) be5Var).f710a);
        }
        t9f.b();
        return null;
    }
}
