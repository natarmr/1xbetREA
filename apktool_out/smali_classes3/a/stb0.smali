.class public final La/stb0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/f310;


# direct methods
.method public constructor <init>(La/f310;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/stb0;->a:La/f310;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(ILa/bnn0;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/stb0;->a:La/f310;

    .line 2
    .line 3
    iget-object v0, p0, La/f310;->a:La/x010;

    .line 4
    .line 5
    iget-object v1, v0, La/x010;->a:La/p7m0;

    .line 6
    .line 7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    instance-of v1, v1, La/bqk0;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    iget-object v0, v0, La/x010;->a:La/p7m0;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, La/f310;->d:La/mne;

    .line 32
    .line 33
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 34
    .line 35
    new-instance v2, La/u52;

    .line 36
    .line 37
    const/16 v3, 0xe

    .line 38
    .line 39
    invoke-direct {v2, p0, p1, v1, v3}, La/u52;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v2, p2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object p1, La/wne;->a:La/wne;

    .line 47
    .line 48
    if-ne p0, p1, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    :goto_1
    sget-object p1, La/wne;->a:La/wne;

    .line 54
    .line 55
    if-ne p0, p1, :cond_3

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0
.end method
