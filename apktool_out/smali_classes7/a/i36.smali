.class public final synthetic La/i36;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p36;


# direct methods
.method public synthetic constructor <init>(La/p36;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/i36;->a:B

    iput-object p1, p0, La/i36;->b:La/p36;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/i36;->a:B

    .line 2
    .line 3
    const-string v1, "PROPHYLAXIS_CANCEL"

    .line 4
    .line 5
    iget-object p0, p0, La/i36;->b:La/p36;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Throwable;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, La/p36;->h:La/sje;

    .line 16
    .line 17
    iget-object v0, v2, La/sje;->a:Lkotlin/coroutines/CoroutineContext;

    .line 18
    .line 19
    invoke-static {v0}, La/zvw;->I(Lkotlin/coroutines/CoroutineContext;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object v3, La/o36;->a:La/o36;

    .line 34
    .line 35
    new-instance v6, La/xw5;

    .line 36
    .line 37
    const/4 v0, 0x4

    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {v6, p1, p0, v1, v0}, La/xw5;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 40
    .line 41
    .line 42
    const/16 v7, 0xe

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 47
    .line 48
    .line 49
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    iget-object p0, p0, La/p36;->k:La/qoj0;

    .line 69
    .line 70
    sget-object p1, La/c56;->a:La/c56;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    :goto_1
    return-object p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
