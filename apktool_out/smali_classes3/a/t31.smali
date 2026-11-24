.class public interface abstract La/t31;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008`\u0018\u00002\u00020\u0001Jf\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0001\u0010\n\u001a\u00020\t2\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0003\u0010\r\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011JR\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000e2\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0003\u0010\r\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\\\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0001\u0010\n\u001a\u00020\t2\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0003\u0010\r\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019\u00c0\u0006\u0003"
    }
    d2 = {
        "La/t31;",
        "",
        "",
        "token",
        "",
        "ref",
        "whence",
        "fcountry",
        "lang",
        "",
        "incWins",
        "currency",
        "La/fk9;",
        "cachingTag",
        "La/dx5;",
        "La/t41;",
        "c",
        "(Ljava/lang/String;IIILjava/lang/String;ZLjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;",
        "",
        "campaignId",
        "La/q41;",
        "b",
        "(JIIILjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;",
        "a",
        "(IIILjava/lang/String;ZLjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;",
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
.method public abstract a(IIILjava/lang/String;ZLjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime La/nkd0;
            value = "ref"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime La/nkd0;
            value = "whence"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime La/nkd0;
            value = "fcountry"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime La/nkd0;
            value = "lng"
        .end annotation
    .end param
    .param p5    # Z
        .annotation runtime La/nkd0;
            value = "incWins"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime La/nkd0;
            value = "cur"
        .end annotation
    .end param
    .param p7    # La/fk9;
        .annotation runtime La/doo0;
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/ofr;
        value = "JackpotsCasino/AvailableCampaigns"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "La/fk9;",
            "La/yje<",
            "-",
            "La/dx5<",
            "La/t41;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(JIIILjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime La/nkd0;
            value = "campaignId"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime La/nkd0;
            value = "ref"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime La/nkd0;
            value = "whence"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime La/nkd0;
            value = "fcountry"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime La/nkd0;
            value = "cur"
        .end annotation
    .end param
    .param p7    # La/fk9;
        .annotation runtime La/doo0;
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/ofr;
        value = "/JackpotsCasino/CurrentAmountJackpots"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JIII",
            "Ljava/lang/String;",
            "La/fk9;",
            "La/yje<",
            "-",
            "La/dx5<",
            "La/q41;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;IIILjava/lang/String;ZLjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime La/nkd0;
            value = "ref"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime La/nkd0;
            value = "whence"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime La/nkd0;
            value = "fcountry"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime La/nkd0;
            value = "lng"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime La/nkd0;
            value = "incWins"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime La/nkd0;
            value = "cur"
        .end annotation
    .end param
    .param p8    # La/fk9;
        .annotation runtime La/doo0;
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/ofr;
        value = "JackpotsCasino/AvailableCampaignsByPlayer"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "III",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "La/fk9;",
            "La/yje<",
            "-",
            "La/dx5<",
            "La/t41;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
