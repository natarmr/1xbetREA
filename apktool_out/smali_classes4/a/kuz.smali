.class public interface abstract La/kuz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J0\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ4\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ4\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ&\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\u00060\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J$\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0014H\u00a7@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J.\u0010\u0019\u001a\u00020\u00152\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0018H\u00a7@\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b\u00c0\u0006\u0003"
    }
    d2 = {
        "La/kuz;",
        "",
        "",
        "auth",
        "language",
        "La/dx5;",
        "",
        "La/qhu;",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;",
        "La/qpi0;",
        "request",
        "La/tpi0;",
        "f",
        "(Ljava/lang/String;Ljava/lang/String;La/qpi0;La/yje;)Ljava/lang/Object;",
        "La/ypi0;",
        "c",
        "La/wqt;",
        "d",
        "(Ljava/lang/String;La/yje;)Ljava/lang/Object;",
        "La/fce0;",
        "",
        "b",
        "(Ljava/lang/String;La/fce0;La/yje;)Ljava/lang/Object;",
        "La/xmz;",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;La/xmz;La/yje;)Ljava/lang/Object;",
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
.method public abstract a(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime La/nkd0;
            value = "lng"
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/ofr;
        value = "LimitService/v2/external/mobile/limits"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "La/yje<",
            "-",
            "La/dx5<",
            "+",
            "Ljava/util/List<",
            "La/qhu;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;La/fce0;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # La/fce0;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/kg80;
        value = "LimitService/v2/external/mobile/realitycheckaction"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La/fce0;",
            "La/yje<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;Ljava/lang/String;La/qpi0;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime La/nkd0;
            value = "X-Language"
        .end annotation
    .end param
    .param p3    # La/qpi0;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/kg80;
        value = "LimitService/v2/external/mobile/limits"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "La/qpi0;",
            "La/yje<",
            "-",
            "La/dx5<",
            "La/ypi0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/ofr;
        value = "Limit/time/v1/AvaliableLimits"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La/yje<",
            "-",
            "La/dx5<",
            "+",
            "Ljava/util/List<",
            "La/wqt;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;Ljava/lang/String;La/xmz;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime La/nkd0;
            value = "X-Language"
        .end annotation
    .end param
    .param p3    # La/xmz;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/kg80;
        value = "LimitService/v2/external/mobile/limitaction"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "La/xmz;",
            "La/yje<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract f(Ljava/lang/String;Ljava/lang/String;La/qpi0;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime La/nkd0;
            value = "X-Language"
        .end annotation
    .end param
    .param p3    # La/qpi0;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/kg80;
        value = "LimitService/v2/external/mobile/limits"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "La/qpi0;",
            "La/yje<",
            "-",
            "La/dx5<",
            "La/tpi0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
