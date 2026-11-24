.class public interface abstract La/aqr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008g\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0008\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J,\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0008\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\u0008J,\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0008\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u0008J,\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0008\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u0008J \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00052\u0008\u0008\u0001\u0010\r\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "La/aqr;",
        "",
        "",
        "",
        "params",
        "La/dx5;",
        "La/f5h;",
        "a",
        "(Ljava/util/Map;La/yje;)Ljava/lang/Object;",
        "c",
        "e",
        "d",
        "La/bds;",
        "gameId",
        "La/zms0;",
        "b",
        "(JLa/yje;)Ljava/lang/Object;",
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
.method public abstract a(Ljava/util/Map;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/util/Map;
        .annotation runtime La/okd0;
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/ofr;
        value = "MainFeedLine/mobile/v3/game"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "La/yje<",
            "La/dx5<",
            "La/f5h;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(JLa/yje;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime La/nkd0;
            value = "id"
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/ofr;
        value = "RefGame/v2/GetMainLiveByLineId"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "La/yje<",
            "La/dx5<",
            "La/zms0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/util/Map;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/util/Map;
        .annotation runtime La/okd0;
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/ofr;
        value = "MainFeedLive/mobile/v3/game"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "La/yje<",
            "La/dx5<",
            "La/f5h;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/util/Map;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/util/Map;
        .annotation runtime La/okd0;
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/ofr;
        value = "MainFeedLive/mb/cyber/v3/game"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "La/yje<",
            "La/dx5<",
            "La/f5h;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/util/Map;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/util/Map;
        .annotation runtime La/okd0;
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/ofr;
        value = "MainFeedLine/mb/cyber/v3/game"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "La/yje<",
            "La/dx5<",
            "La/f5h;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
