package a;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q8m0 implements nkj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28308a;
    public final Object b;

    public q8m0() {
        this.f28308a = (byte) 1;
        this.b = mnn0.d;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    @Override // a.nkj
    public final okj a(hmk0 hmk0Var, a780 a780Var) {
        ImageDecoder.Source sourceCreateSource;
        y190 y190VarQ0;
        byte b = this.f28308a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bitmap.Config configE = t1x.e(a780Var);
                Context context = a780Var.f354a;
                if (configE != Bitmap.Config.ARGB_8888 && configE != Bitmap.Config.HARDWARE) {
                    return null;
                }
                y1x y1xVar = hmk0Var.f13312a;
                if (y1xVar.getFileSystem() != yzp.f43526a || (y190VarQ0 = y1xVar.Q0()) == null) {
                    x1x metadata = y1xVar.getMetadata();
                    if (metadata instanceof oy3) {
                        sourceCreateSource = ImageDecoder.createSource(context.getAssets(), ((oy3) metadata).f26042a);
                    } else if ((metadata instanceof xfe) && Build.VERSION.SDK_INT >= 29) {
                        try {
                            AssetFileDescriptor assetFileDescriptor = ((xfe) metadata).f40786a;
                            Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                            sourceCreateSource = ImageDecoder.createSource(new hrd(assetFileDescriptor, (byte) 7));
                        } catch (ErrnoException unused) {
                            sourceCreateSource = null;
                        }
                        break;
                    } else if (metadata instanceof etf0) {
                        etf0 etf0Var = (etf0) metadata;
                        if (etf0Var.f8374a.equals(context.getPackageName())) {
                            sourceCreateSource = ImageDecoder.createSource(context.getResources(), etf0Var.b);
                        } else if (metadata instanceof xf9) {
                            sourceCreateSource = ImageDecoder.createSource(((xf9) metadata).f40780a);
                        } else {
                            sourceCreateSource = null;
                        }
                    } else if (metadata instanceof xf9) {
                        sourceCreateSource = ImageDecoder.createSource(((xf9) metadata).f40780a);
                    } else {
                        sourceCreateSource = null;
                    }
                } else {
                    sourceCreateSource = ImageDecoder.createSource(y190VarQ0.toFile());
                }
                if (sourceCreateSource == null) {
                    return null;
                }
                return new x68(sourceCreateSource, hmk0Var.f13312a, a780Var, (gbi0) obj);
            default:
                String str = hmk0Var.b;
                y1x y1xVar2 = hmk0Var.f13312a;
                if (!Intrinsics.d(str, "image/svg+xml")) {
                    u99 u99VarV0 = y1xVar2.V0();
                    if (!u99VarV0.m0(0L, ikj.b) || u99VarV0.y0(1024L, ikj.f14928a) == -1) {
                        return null;
                    }
                }
                return new mnn0(y1xVar2, a780Var, (Function1) obj);
        }
    }

    public q8m0(gbi0 gbi0Var) {
        this.f28308a = (byte) 0;
        this.b = gbi0Var;
    }
}
