.class public interface abstract La/w4w0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J.\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0003\u0010\t\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000e2\u0008\u0008\u0001\u0010\r\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "Lorg/xplatform/domain/resolver/impl/data/datasource/network/DomainMirrorService;",
        "",
        "La/k85;",
        "getAvailableMirrors",
        "(La/yje;)Ljava/lang/Object;",
        "",
        "cookie",
        "Lokhttp3/RequestBody;",
        "hostsRequest",
        "type",
        "",
        "sendHostsStatus",
        "(Ljava/lang/String;Lokhttp3/RequestBody;Ljava/lang/String;La/yje;)Ljava/lang/Object;",
        "url",
        "La/jtf0;",
        "check",
        "(Ljava/lang/String;La/yje;)Ljava/lang/Object;",
        "org.xplatform.secret.resolver:impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Ljava/lang/String;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/bot0;
        .end annotation
    .end param
    .annotation runtime La/ofr;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La/yje<",
            "-",
            "La/jtf0<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(La/yje;)Ljava/lang/Object;
    .annotation runtime La/ofr;
        value = "/checker/redirect/stat/run/"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/yje<",
            "-",
            "La/k85;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;Lokhttp3/RequestBody;Ljava/lang/String;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "cookie"
        .end annotation
    .end param
    .param p2    # Lokhttp3/RequestBody;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "Content-Type"
        .end annotation
    .end param
    .annotation runtime La/kg80;
        value = "/checker/redirect/stat/"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lokhttp3/RequestBody;",
            "Ljava/lang/String;",
            "La/yje<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
