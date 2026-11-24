.class public interface abstract La/sa0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001Jl\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0001\u0010\t\u001a\u00020\u00082\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00082\u0008\u0008\u0001\u0010\r\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "La/sa0;",
        "",
        "",
        "auth",
        "appGuid",
        "",
        "timeFrom",
        "timeTo",
        "",
        "typeGame",
        "lastKnownId",
        "limit",
        "amountSort",
        "typeTransaction",
        "La/i31;",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Long;IIILa/yje;)Ljava/lang/Object;",
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
.method public abstract a(Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Long;IIILa/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "AppGuid"
        .end annotation
    .end param
    .param p3    # J
        .annotation runtime La/nkd0;
            value = "UnixTimeFrom"
        .end annotation
    .end param
    .param p5    # J
        .annotation runtime La/nkd0;
            value = "UnixTimeTo"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime La/nkd0;
            value = "TypeGame"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Long;
        .annotation runtime La/nkd0;
            value = "LastKnownId"
        .end annotation
    .end param
    .param p9    # I
        .annotation runtime La/nkd0;
            value = "Limit"
        .end annotation
    .end param
    .param p10    # I
        .annotation runtime La/nkd0;
            value = "AmountSort"
        .end annotation
    .end param
    .param p11    # I
        .annotation runtime La/nkd0;
            value = "TypeTransaction"
        .end annotation
    .end param
    .annotation runtime La/ofr;
        value = "BetStorage/GetHistoryBetMobile"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJI",
            "Ljava/lang/Long;",
            "III",
            "La/yje<",
            "-",
            "La/i31;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
