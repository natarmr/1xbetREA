.class public final La/xeu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/dgu;


# direct methods
.method public synthetic constructor <init>(La/dgu;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/xeu;->a:La/dgu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;La/bnn0;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object p0, p0, La/xeu;->a:La/dgu;

    .line 2
    .line 3
    iget-object v0, p0, La/dgu;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/mne;

    .line 6
    .line 7
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 8
    .line 9
    new-instance v1, La/efu;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, v2, p0, p1, p2}, La/efu;-><init>(La/yje;La/dgu;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, p3}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, La/wne;->a:La/wne;

    .line 20
    .line 21
    if-ne p0, p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    :goto_0
    if-ne p0, p1, :cond_1

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0
.end method
