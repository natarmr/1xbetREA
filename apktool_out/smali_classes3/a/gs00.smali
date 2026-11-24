.class public interface abstract La/gs00;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t\u00c0\u0006\u0003"
    }
    d2 = {
        "La/gs00;",
        "",
        "",
        "currentTimeSeconds",
        "",
        "acceptHeader",
        "La/htt0;",
        "a",
        "(JLjava/lang/String;La/yje;)Ljava/lang/Object;",
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
.method public abstract a(JLjava/lang/String;La/yje;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime La/nkd0;
            value = "date"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "Accept"
        .end annotation
    .end param
    .annotation runtime La/ofr;
        value = "RestCoreService/v1/Mb/GetUtcLocalTimeDiff"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "La/yje<",
            "-",
            "La/htt0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
