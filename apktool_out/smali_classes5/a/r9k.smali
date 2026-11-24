.class public final synthetic La/r9k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w9k;


# direct methods
.method public synthetic constructor <init>(La/w9k;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r9k;->a:B

    iput-object p1, p0, La/r9k;->b:La/w9k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/r9k;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/r9k;->b:La/w9k;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/w9k;->P1:[La/iiy;

    .line 10
    .line 11
    invoke-virtual {p0}, La/w9k;->H0()La/iak;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, v0, La/iak;->n:La/p7m0;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    move-object v3, p0

    .line 22
    check-cast v3, La/hak;

    .line 23
    .line 24
    sget-object v3, La/gak;->a:La/gak;

    .line 25
    .line 26
    invoke-virtual {v2, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    new-instance v4, La/y9k;

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    invoke-direct {v4, v0, p0}, La/y9k;-><init>(La/iak;B)V

    .line 40
    .line 41
    .line 42
    new-instance v7, La/ya;

    .line 43
    .line 44
    const/16 p0, 0x1b

    .line 45
    .line 46
    invoke-direct {v7, v0, v1, p0}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 47
    .line 48
    .line 49
    const/16 v8, 0xe

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v6, 0x0

    .line 53
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_0
    sget-object v0, La/w9k;->P1:[La/iiy;

    .line 60
    .line 61
    new-instance v0, La/q9k;

    .line 62
    .line 63
    new-instance v1, La/y6h;

    .line 64
    .line 65
    invoke-virtual {p0}, La/w9k;->H0()La/iak;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const/4 v7, 0x0

    .line 70
    const/16 v8, 0x13

    .line 71
    .line 72
    const/4 v2, 0x1

    .line 73
    const-class v4, La/iak;

    .line 74
    .line 75
    const-string v5, "onItemClick"

    .line 76
    .line 77
    const-string v6, "onItemClick$impl(Lorg/xplatform/responsible_game/impl/domain/models/DepositLimitEnum;)V"

    .line 78
    .line 79
    invoke-direct/range {v1 .. v8}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 83
    .line 84
    .line 85
    new-instance p0, La/svj;

    .line 86
    .line 87
    const/16 v2, 0x8

    .line 88
    .line 89
    invoke-direct {p0, v2}, La/svj;-><init>(B)V

    .line 90
    .line 91
    .line 92
    new-instance v2, La/e3j;

    .line 93
    .line 94
    const/16 v3, 0xc

    .line 95
    .line 96
    invoke-direct {v2, v1, v3}, La/e3j;-><init>(Ljava/lang/Object;B)V

    .line 97
    .line 98
    .line 99
    new-instance v1, La/e9k;

    .line 100
    .line 101
    const/4 v3, 0x3

    .line 102
    const/4 v4, 0x1

    .line 103
    invoke-direct {v1, v3, v4}, La/e9k;-><init>(IB)V

    .line 104
    .line 105
    .line 106
    sget-object v3, La/zdh;->n:La/zdh;

    .line 107
    .line 108
    new-instance v4, La/gbn;

    .line 109
    .line 110
    invoke-direct {v4, p0, v1, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 111
    .line 112
    .line 113
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 114
    .line 115
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_1
    sget-object v0, La/w9k;->P1:[La/iiy;

    .line 120
    .line 121
    new-instance v0, La/ry3;

    .line 122
    .line 123
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget-object p0, p0, La/w9k;->K1:La/ifi;

    .line 128
    .line 129
    if-eqz p0, :cond_1

    .line 130
    .line 131
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 132
    .line 133
    .line 134
    return-object v0

    .line 135
    :cond_1
    const-string p0, "viewModelFactory"

    .line 136
    .line 137
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v1

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
