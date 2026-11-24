package a;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class pgu0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static ree b(View view, ree reeVar) {
        ContentInfo contentInfoE = reeVar.f30330a.e();
        Objects.requireNonNull(contentInfoE);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoE);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoE ? reeVar : new ree(new yqc(contentInfoPerformReceiveContent));
    }
}
