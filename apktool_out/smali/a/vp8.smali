.class public final synthetic La/vp8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vne;

.field public final synthetic c:La/xpj0;


# direct methods
.method public synthetic constructor <init>(La/vne;La/xpj0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vp8;->a:B

    iput-object p1, p0, La/vp8;->b:La/vne;

    iput-object p2, p0, La/vp8;->c:La/xpj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/xpj0;La/vne;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/vp8;->a:B

    iput-object p1, p0, La/vp8;->c:La/xpj0;

    iput-object p2, p0, La/vp8;->b:La/vne;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/vp8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-object v2, p0, La/vp8;->b:La/vne;

    .line 5
    .line 6
    iget-object p0, p0, La/vp8;->c:La/xpj0;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x3

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/xpj0;->e:La/qv2;

    .line 14
    .line 15
    iget-object v0, v0, La/qv2;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    sget-object v1, La/ypj0;->c:La/ypj0;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    new-instance v0, La/xp8;

    .line 34
    .line 35
    const/16 v1, 0xe

    .line 36
    .line 37
    invoke-direct {v0, p0, v3, v1}, La/xp8;-><init>(La/xpj0;La/yje;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3, v3, v0, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    new-instance v0, La/xp8;

    .line 47
    .line 48
    const/4 v1, 0x4

    .line 49
    invoke-direct {v0, p0, v3, v1}, La/xp8;-><init>(La/xpj0;La/yje;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3, v3, v0, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 53
    .line 54
    .line 55
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_1
    new-instance v0, La/xp8;

    .line 59
    .line 60
    invoke-direct {v0, p0, v3, v4}, La/xp8;-><init>(La/xpj0;La/yje;B)V

    .line 61
    .line 62
    .line 63
    invoke-static {v2, v3, v3, v0, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :pswitch_2
    new-instance v0, La/xp8;

    .line 68
    .line 69
    invoke-direct {v0, p0, v3, v1}, La/xp8;-><init>(La/xpj0;La/yje;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {v2, v3, v3, v0, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :pswitch_3
    invoke-virtual {p0}, La/xpj0;->c()La/ypj0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    const/4 v5, 0x1

    .line 85
    if-eq v0, v5, :cond_2

    .line 86
    .line 87
    if-eq v0, v1, :cond_1

    .line 88
    .line 89
    new-instance v0, La/xp8;

    .line 90
    .line 91
    invoke-direct {v0, p0, v3, v5}, La/xp8;-><init>(La/xpj0;La/yje;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {v2, v3, v3, v0, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    new-instance v0, La/xp8;

    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    invoke-direct {v0, p0, v3, v1}, La/xp8;-><init>(La/xpj0;La/yje;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {v2, v3, v3, v0, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    new-instance v0, La/ya;

    .line 109
    .line 110
    const/16 v1, 0xb

    .line 111
    .line 112
    invoke-direct {v0, p0, v3, v1}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 113
    .line 114
    .line 115
    invoke-static {v2, v3, v3, v0, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 116
    .line 117
    .line 118
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
