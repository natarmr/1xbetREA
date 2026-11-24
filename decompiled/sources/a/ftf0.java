package a;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public final class ftf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f10110a;
    public final Configuration b;
    public final int c;

    public ftf0(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f10110a = colorStateList;
        this.b = configuration;
        this.c = theme == null ? 0 : theme.hashCode();
    }
}
