.class public interface abstract La/l9s0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J`\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00042\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0003\u0010\u000b\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJH\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000c2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u000b\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "La/l9s0;",
        "",
        "",
        "token",
        "",
        "whence",
        "lng",
        "ref",
        "country",
        "currencyId",
        "La/fk9;",
        "cachingTag",
        "La/dx5;",
        "La/fzr0;",
        "c",
        "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/Integer;La/fk9;La/yje;)Ljava/lang/Object;",
        "ids",
        "La/v9s0;",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;",
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


# direct methods
.method public static synthetic b(La/l9s0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    new-instance v7, La/fk9;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v7, v0}, La/fk9;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    const/16 v2, 0x16

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    move-object v0, p0

    .line 11
    move-object v1, p1

    .line 12
    move-object v3, p2

    .line 13
    move v5, p3

    .line 14
    move-object v6, p4

    .line 15
    move-object v8, p5

    .line 16
    invoke-interface/range {v0 .. v8}, La/l9s0;->c(Ljava/lang/String;ILjava/lang/String;IILjava/lang/Integer;La/fk9;La/yje;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime La/nkd0;
            value = "tournament_ids"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime La/nkd0;
            value = "whence"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime La/nkd0;
            value = "lng"
        .end annotation
    .end param
    .param p5    # La/fk9;
        .annotation runtime La/doo0;
        .end annotation
    .end param
    .annotation runtime La/dtv;
        value = {
            "Accept: application/vnd.xenvelop+json"
        }
    .end annotation

    .annotation runtime La/ofr;
        value = "TournamentClientsV2/GetTournamentsPersonalInfo"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "La/fk9;",
            "La/yje<",
            "-",
            "La/dx5<",
            "La/v9s0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;ILjava/lang/String;IILjava/lang/Integer;La/fk9;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime La/nkd0;
            value = "whence"
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
            value = "country"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation runtime La/nkd0;
            value = "currency_id"
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
        value = "TournamentClientsV2/GetTournaments"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/Integer;",
            "La/fk9;",
            "La/yje<",
            "-",
            "La/dx5<",
            "La/fzr0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
