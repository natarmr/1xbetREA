.class public interface abstract La/u8e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J6\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ6\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00072\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00052\u0014\u0008\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ4\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00072\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0003\u0010\u0012\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016\u00c0\u0006\u0003"
    }
    d2 = {
        "La/u8e;",
        "",
        "La/e2f0;",
        "registrationRequest",
        "",
        "",
        "headers",
        "La/dx5;",
        "La/h2f0;",
        "c",
        "(La/e2f0;Ljava/util/Map;La/yje;)Ljava/lang/Object;",
        "projectId",
        "La/jji0;",
        "b",
        "(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;",
        "url",
        "Lokhttp3/MultipartBody$Part;",
        "file",
        "acceptHeader",
        "La/glu;",
        "a",
        "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Ljava/lang/String;La/yje;)Ljava/lang/Object;",
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
.method public abstract a(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Ljava/lang/String;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/bot0;
        .end annotation
    .end param
    .param p2    # Lokhttp3/MultipartBody$Part;
        .annotation runtime La/nq80;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "Accept"
        .end annotation
    .end param
    .annotation runtime La/kg80;
    .end annotation

    .annotation runtime La/nx40;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lokhttp3/MultipartBody$Part;",
            "Ljava/lang/String;",
            "La/yje<",
            "-",
            "La/dx5<",
            "La/glu;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/nkd0;
            value = "projectId"
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation runtime La/jrv;
        .end annotation
    .end param
    .annotation runtime La/ofr;
        value = "v2/most-required/internal"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "La/yje<",
            "-",
            "La/dx5<",
            "La/jji0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(La/e2f0;Ljava/util/Map;La/yje;)Ljava/lang/Object;
    .param p1    # La/e2f0;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation runtime La/jrv;
        .end annotation
    .end param
    .annotation runtime La/kg80;
        value = "v2/login/internal"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/e2f0;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "La/yje<",
            "-",
            "La/dx5<",
            "La/h2f0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
