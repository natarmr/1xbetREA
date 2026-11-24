package okhttp3.internal;

import a.azw;
import a.lgi0;
import a.pgi0;
import a.sgy;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/LinkedTags;", "", TokenNames.K, "Lokhttp3/internal/Tags;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class LinkedTags<K> extends Tags {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sgy f46119a;
    public final Object b;
    public final Tags c;

    public LinkedTags(sgy sgyVar, Object obj, Tags tags) {
        obj.getClass();
        tags.getClass();
        this.f46119a = sgyVar;
        this.b = obj;
        this.c = tags;
    }

    @Override // okhttp3.internal.Tags
    public final Object a(sgy sgyVar) {
        sgyVar.getClass();
        return sgyVar.equals(this.f46119a) ? azw.G(sgyVar).cast(this.b) : this.c.a(sgyVar);
    }

    @Override // okhttp3.internal.Tags
    public final Tags b(sgy sgyVar, Object obj) {
        sgy sgyVar2 = this.f46119a;
        boolean zEquals = sgyVar.equals(sgyVar2);
        Tags tags = this.c;
        if (!zEquals) {
            Tags tagsB = tags.b(sgyVar, null);
            if (tagsB != tags) {
                this = new LinkedTags<>(sgyVar2, this.b, tagsB);
            }
            tags = this;
        }
        return obj != null ? new LinkedTags(sgyVar, obj, tags) : tags;
    }

    public final String toString() {
        final byte b = 0;
        List listT0 = CollectionsKt.t0(pgi0.t(lgi0.e(new Function1() { // from class: okhttp3.internal.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                LinkedTags linkedTags = (LinkedTags) obj;
                switch (b) {
                    case 0:
                        linkedTags.getClass();
                        Tags tags = linkedTags.c;
                        if (tags instanceof LinkedTags) {
                            return (LinkedTags) tags;
                        }
                        return null;
                    default:
                        linkedTags.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append(linkedTags.f46119a);
                        sb.append('=');
                        sb.append(linkedTags.b);
                        return sb.toString();
                }
            }
        }, this)));
        final byte b2 = 1;
        return CollectionsKt.b0(listT0, null, "{", "}", new Function1() { // from class: okhttp3.internal.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                LinkedTags linkedTags = (LinkedTags) obj;
                switch (b2) {
                    case 0:
                        linkedTags.getClass();
                        Tags tags = linkedTags.c;
                        if (tags instanceof LinkedTags) {
                            return (LinkedTags) tags;
                        }
                        return null;
                    default:
                        linkedTags.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append(linkedTags.f46119a);
                        sb.append('=');
                        sb.append(linkedTags.b);
                        return sb.toString();
                }
            }
        }, 25);
    }
}
