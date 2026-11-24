.class public interface abstract La/gqs;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J>\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\\\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\t2\u0008\u0008\u0001\u0010\r\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "La/gqs;",
        "",
        "",
        "gameId",
        "",
        "lng",
        "",
        "ref",
        "fCountry",
        "La/dx5;",
        "La/we30;",
        "b",
        "(JLjava/lang/String;IILa/yje;)Ljava/lang/Object;",
        "country",
        "fcountry",
        "groupId",
        "whence",
        "La/of30;",
        "a",
        "(IIJILjava/lang/String;IILa/yje;)Ljava/lang/Object;",
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
.method public abstract a(IIJILjava/lang/String;IILa/yje;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime La/nkd0;
            value = "country"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime La/nkd0;
            value = "fcountry"
        .end annotation
    .end param
    .param p3    # J
        .annotation runtime La/nkd0;
            value = "gameId"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime La/nkd0;
            value = "gr"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime La/nkd0;
            value = "lng"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime La/nkd0;
            value = "ref"
        .end annotation
    .end param
    .param p8    # I
        .annotation runtime La/nkd0;
            value = "whence"
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/ofr;
        value = "MainFeedLive/mobile/v3/chronoLine"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIJI",
            "Ljava/lang/String;",
            "II",
            "La/yje<",
            "-",
            "La/dx5<",
            "La/of30;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(JLjava/lang/String;IILa/yje;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime La/nkd0;
            value = "id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime La/nkd0;
            value = "lng"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime La/nkd0;
            value = "ref"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime La/nkd0;
            value = "fcountry"
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/ofr;
        value = "statisticGame/v2/Events"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "II",
            "La/yje<",
            "-",
            "La/dx5<",
            "La/we30;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
