.class public interface abstract La/ta0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008g\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001a\u0010\t\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ$\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f\u00c0\u0006\u0003"
    }
    d2 = {
        "La/ta0;",
        "",
        "",
        "auth",
        "Lokhttp3/RequestBody;",
        "request",
        "La/e02;",
        "c",
        "(Ljava/lang/String;Lokhttp3/RequestBody;La/yje;)Ljava/lang/Object;",
        "b",
        "(Lokhttp3/RequestBody;La/yje;)Ljava/lang/Object;",
        "La/obf;",
        "La/rbf;",
        "a",
        "(Ljava/lang/String;La/obf;La/yje;)Ljava/lang/Object;",
        "impl"
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
.method public abstract a(Ljava/lang/String;La/obf;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # La/obf;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .annotation runtime La/kg80;
        value = "Aggregator_v3/v2/CreateNick"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La/obf;",
            "La/yje<",
            "La/rbf;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(Lokhttp3/RequestBody;La/yje;)Ljava/lang/Object;
    .param p1    # Lokhttp3/RequestBody;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .annotation runtime La/kg80;
        value = "aggrop/OpenGame"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/RequestBody;",
            "La/yje<",
            "La/e02;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;Lokhttp3/RequestBody;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # Lokhttp3/RequestBody;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .annotation runtime La/kg80;
        value = "aggrop/OpenGame2"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lokhttp3/RequestBody;",
            "La/yje<",
            "La/e02;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
