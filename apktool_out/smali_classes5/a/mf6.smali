.class public interface abstract La/mf6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008a\u0018\u00002\u00020\u0001JF\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00082\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ6\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00082\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010\u00c0\u0006\u0003"
    }
    d2 = {
        "La/mf6;",
        "",
        "",
        "betType",
        "",
        "params",
        "La/kg6;",
        "request",
        "La/dx5;",
        "",
        "La/ah6;",
        "a",
        "(Ljava/lang/String;Ljava/util/Map;La/kg6;La/yje;)Ljava/lang/Object;",
        "La/ph6;",
        "b",
        "(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;",
        "core"
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
.method public abstract a(Ljava/lang/String;Ljava/util/Map;La/kg6;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/z190;
            value = "BetType"
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation runtime La/okd0;
        .end annotation
    .end param
    .param p3    # La/kg6;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/kg80;
        value = "/MainFeed{BetType}/mobile/betbuilder/v3/events"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "La/kg6;",
            "La/yje<",
            "La/dx5<",
            "Ljava/util/List<",
            "La/ah6;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/z190;
            value = "BetType"
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation runtime La/okd0;
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/ofr;
        value = "/MainFeed{BetType}/mobile/betbuilder/v3/gameInfo"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "La/yje<",
            "La/dx5<",
            "La/ph6;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
