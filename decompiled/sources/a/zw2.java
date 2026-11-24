package a;

import android.content.ClipData;
import android.os.Build;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class zw2 implements iuc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5k f45086a;

    public zw2(c5k c5kVar) {
        this.f45086a = c5kVar;
    }

    public final Unit a(huc hucVar) {
        c5k c5kVar = this.f45086a;
        if (hucVar != null) {
            c5kVar.f().setPrimaryClip(hucVar.f13673a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            c5kVar.f().clearPrimaryClip();
        } else {
            c5kVar.f().setPrimaryClip(ClipData.newPlainText("", ""));
        }
        return Unit.f46060a;
    }
}
