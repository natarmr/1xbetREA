.class public final synthetic La/x8k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/c9k;


# direct methods
.method public synthetic constructor <init>(La/c9k;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x8k;->a:B

    iput-object p1, p0, La/x8k;->b:La/c9k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/x8k;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/x8k;->b:La/c9k;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/c9k;->Q1:La/nwd;

    .line 11
    .line 12
    invoke-virtual {p0}, La/c9k;->H0()La/p9k;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, La/p9k;->x()V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    sget-object v0, La/c9k;->Q1:La/nwd;

    .line 23
    .line 24
    invoke-virtual {p0}, La/c9k;->H0()La/p9k;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v3, v0, La/p9k;->o:La/p7m0;

    .line 29
    .line 30
    :cond_0
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    move-object v4, p0

    .line 35
    check-cast v4, La/o9k;

    .line 36
    .line 37
    sget-object v4, La/n9k;->a:La/n9k;

    .line 38
    .line 39
    invoke-virtual {v3, p0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    new-instance v5, La/f9k;

    .line 50
    .line 51
    invoke-direct {v5, v0, v2}, La/f9k;-><init>(La/p9k;B)V

    .line 52
    .line 53
    .line 54
    new-instance v8, La/ya;

    .line 55
    .line 56
    const/16 p0, 0x1a

    .line 57
    .line 58
    invoke-direct {v8, v0, v1, p0}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 59
    .line 60
    .line 61
    const/16 v9, 0xe

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_1
    sget-object v0, La/c9k;->Q1:La/nwd;

    .line 72
    .line 73
    new-instance v0, La/w8k;

    .line 74
    .line 75
    new-instance v3, La/y6h;

    .line 76
    .line 77
    invoke-virtual {p0}, La/c9k;->H0()La/p9k;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    const/4 v9, 0x0

    .line 82
    const/16 v10, 0x12

    .line 83
    .line 84
    const/4 v4, 0x1

    .line 85
    const-class v6, La/p9k;

    .line 86
    .line 87
    const-string v7, "onItemClick"

    .line 88
    .line 89
    const-string v8, "onItemClick$impl(Lorg/xplatform/responsible_game/impl/presentation/limits/deposit_limit_kz/DepositLimitKzEnum;)V"

    .line 90
    .line 91
    invoke-direct/range {v3 .. v10}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 92
    .line 93
    .line 94
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance p0, La/svj;

    .line 98
    .line 99
    const/4 v1, 0x7

    .line 100
    invoke-direct {p0, v1}, La/svj;-><init>(B)V

    .line 101
    .line 102
    .line 103
    new-instance v1, La/e3j;

    .line 104
    .line 105
    const/16 v4, 0xb

    .line 106
    .line 107
    invoke-direct {v1, v3, v4}, La/e3j;-><init>(Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    new-instance v3, La/e9k;

    .line 111
    .line 112
    const/4 v4, 0x3

    .line 113
    invoke-direct {v3, v4, v2}, La/e9k;-><init>(IB)V

    .line 114
    .line 115
    .line 116
    sget-object v2, La/zdh;->m:La/zdh;

    .line 117
    .line 118
    new-instance v4, La/gbn;

    .line 119
    .line 120
    invoke-direct {v4, p0, v3, v1, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 121
    .line 122
    .line 123
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 124
    .line 125
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 126
    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_2
    sget-object v0, La/c9k;->Q1:La/nwd;

    .line 130
    .line 131
    new-instance v0, La/ry3;

    .line 132
    .line 133
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    iget-object p0, p0, La/c9k;->K1:La/hfi;

    .line 138
    .line 139
    if-eqz p0, :cond_1

    .line 140
    .line 141
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 142
    .line 143
    .line 144
    return-object v0

    .line 145
    :cond_1
    const-string p0, "viewModelFactory"

    .line 146
    .line 147
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v1

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
