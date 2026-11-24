.class public interface abstract La/scb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008a\u0018\u00002\u00020\u0001JT\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u00070\n2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00022\u000e\u0008\u0001\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e\u00c0\u0006\u0003"
    }
    d2 = {
        "La/scb;",
        "",
        "",
        "refId",
        "groupId",
        "fCountryId",
        "whence",
        "",
        "",
        "champIds",
        "La/dx5;",
        "La/cdb;",
        "a",
        "(IIIILjava/util/List;La/yje;)Ljava/lang/Object;",
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
.method public abstract a(IIIILjava/util/List;La/yje;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime La/xpv;
            value = "X-Referral"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime La/xpv;
            value = "X-Group"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime La/xpv;
            value = "X-FCountry"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime La/xpv;
            value = "X-Whence"
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
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
        value = "cyberImages/v2/champs"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "La/yje<",
            "La/dx5<",
            "Ljava/util/List<",
            "La/cdb;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
