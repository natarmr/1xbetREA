.class public final synthetic La/ie7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ke7;


# direct methods
.method public synthetic constructor <init>(La/ke7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ie7;->a:B

    iput-object p1, p0, La/ie7;->b:La/ke7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/ie7;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/ie7;->b:La/ke7;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/ke7;->R1:La/yk5;

    .line 10
    .line 11
    invoke-virtual {p0}, La/ke7;->H0()La/uf7;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v2, La/ye7;

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x2

    .line 23
    const/4 v3, 0x1

    .line 24
    const-class v5, La/uf7;

    .line 25
    .line 26
    const-string v6, "handleError"

    .line 27
    .line 28
    const-string v7, "handleError(Ljava/lang/Throwable;)V"

    .line 29
    .line 30
    invoke-direct/range {v2 .. v9}, La/ye7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 31
    .line 32
    .line 33
    new-instance v7, La/of7;

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    invoke-direct {v7, v4, v0}, La/of7;-><init>(La/uf7;B)V

    .line 37
    .line 38
    .line 39
    new-instance v9, La/tf7;

    .line 40
    .line 41
    invoke-direct {v9, v4, v1, v0}, La/tf7;-><init>(La/uf7;La/yje;B)V

    .line 42
    .line 43
    .line 44
    const/16 v10, 0xc

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    move-object v5, p0

    .line 48
    move-object v6, v2

    .line 49
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_0
    sget-object v0, La/ke7;->R1:La/yk5;

    .line 56
    .line 57
    new-instance v0, La/isz;

    .line 58
    .line 59
    new-instance v1, La/ur6;

    .line 60
    .line 61
    invoke-virtual {p0}, La/ke7;->H0()La/uf7;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    const/4 v7, 0x0

    .line 66
    const/16 v8, 0x1d

    .line 67
    .line 68
    const/4 v2, 0x1

    .line 69
    const-class v4, La/uf7;

    .line 70
    .line 71
    const-string v5, "onLimitChosen"

    .line 72
    .line 73
    const-string v6, "onLimitChosen$impl(Lorg/xplatform/responsible_game/impl/presentation/limits/adapter/LimitUiModel;)V"

    .line 74
    .line 75
    invoke-direct/range {v1 .. v8}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, v1}, La/isz;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_1
    new-instance v0, La/q0h0;

    .line 83
    .line 84
    iget-object p0, p0, La/ke7;->K1:La/z9i;

    .line 85
    .line 86
    if-eqz p0, :cond_0

    .line 87
    .line 88
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 89
    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_0
    const-string p0, "viewModelFactory"

    .line 93
    .line 94
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v1

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
