.class public final La/tvd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ts4;


# direct methods
.method public synthetic constructor <init>(La/ts4;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/tvd;->a:La/ts4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;La/bnn0;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, La/tvd;->a:La/ts4;

    .line 2
    .line 3
    iget-object v0, p0, La/ts4;->m:La/zo4;

    .line 4
    .line 5
    invoke-virtual {v0}, La/zo4;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/ws4;

    .line 10
    .line 11
    iget-object p0, p0, La/ts4;->d:La/at4;

    .line 12
    .line 13
    iget-object p0, p0, La/at4;->e:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v1, La/wvd;

    .line 16
    .line 17
    invoke-direct {v1, p1}, La/wvd;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string p1, "application/vnd.xenvelop+json"

    .line 21
    .line 22
    invoke-interface {v0, p0, v1, p1, p2}, La/ws4;->c(Ljava/lang/String;La/wvd;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object p1, La/wne;->a:La/wne;

    .line 27
    .line 28
    if-ne p0, p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    :goto_0
    if-ne p0, p1, :cond_1

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
