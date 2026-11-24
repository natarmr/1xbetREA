package a;

import com.vk.dto.common.id.UserId;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class dvt0 {
    public static final dvt0 g = new dvt0(0, 0, null, "", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6761a;
    public final String b;
    public final UserId c;
    public final int d;
    public final long e;
    public final boolean f;

    public dvt0(int i, long j, UserId userId, String str, String str2) {
        this.f6761a = str;
        this.b = str2;
        this.c = userId;
        this.d = i;
        this.e = j;
        this.f = true ^ (str2 == null || StringsKt.W(str2));
    }
}
