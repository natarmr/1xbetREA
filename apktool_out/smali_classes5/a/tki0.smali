.class public final synthetic La/tki0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xki0;


# direct methods
.method public synthetic constructor <init>(La/xki0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tki0;->a:B

    iput-object p1, p0, La/tki0;->b:La/xki0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/tki0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/tki0;->b:La/xki0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/xki0;->P1:[La/iiy;

    .line 10
    .line 11
    invoke-virtual {p0}, La/xki0;->H0()La/imi0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, v0, La/imi0;->l:La/p7m0;

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
    check-cast v3, La/hmi0;

    .line 23
    .line 24
    sget-object v3, La/gmi0;->a:La/gmi0;

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
    new-instance v4, La/yli0;

    .line 37
    .line 38
    const/4 p0, 0x1

    .line 39
    invoke-direct {v4, v0, p0}, La/yli0;-><init>(La/imi0;B)V

    .line 40
    .line 41
    .line 42
    new-instance v7, La/z8b0;

    .line 43
    .line 44
    const/16 p0, 0xf

    .line 45
    .line 46
    invoke-direct {v7, v0, v1, p0}, La/z8b0;-><init>(Ljava/lang/Object;La/yje;B)V

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
    sget-object v0, La/xki0;->P1:[La/iiy;

    .line 60
    .line 61
    new-instance v0, La/lki0;

    .line 62
    .line 63
    new-instance v1, La/uki0;

    .line 64
    .line 65
    invoke-virtual {p0}, La/xki0;->H0()La/imi0;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v8, 0x0

    .line 71
    const/4 v2, 0x1

    .line 72
    const-class v4, La/imi0;

    .line 73
    .line 74
    const-string v5, "onItemClick"

    .line 75
    .line 76
    const-string v6, "onItemClick$impl(Lorg/xplatform/responsible_game/impl/domain/models/SessionTimeLimitEnum;)V"

    .line 77
    .line 78
    invoke-direct/range {v1 .. v8}, La/uki0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 82
    .line 83
    .line 84
    new-instance p0, La/d1i0;

    .line 85
    .line 86
    const/16 v2, 0x1d

    .line 87
    .line 88
    invoke-direct {p0, v2}, La/d1i0;-><init>(B)V

    .line 89
    .line 90
    .line 91
    new-instance v2, La/rai0;

    .line 92
    .line 93
    const/4 v3, 0x5

    .line 94
    invoke-direct {v2, v1, v3}, La/rai0;-><init>(Ljava/lang/Object;B)V

    .line 95
    .line 96
    .line 97
    new-instance v1, La/gsh0;

    .line 98
    .line 99
    const/4 v3, 0x3

    .line 100
    const/4 v4, 0x4

    .line 101
    invoke-direct {v1, v3, v4}, La/gsh0;-><init>(IB)V

    .line 102
    .line 103
    .line 104
    sget-object v3, La/ynh0;->k:La/ynh0;

    .line 105
    .line 106
    new-instance v4, La/gbn;

    .line 107
    .line 108
    invoke-direct {v4, p0, v1, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 109
    .line 110
    .line 111
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 112
    .line 113
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_1
    sget-object v0, La/xki0;->P1:[La/iiy;

    .line 118
    .line 119
    new-instance v0, La/ry3;

    .line 120
    .line 121
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iget-object p0, p0, La/xki0;->K1:La/nti;

    .line 126
    .line 127
    if-eqz p0, :cond_1

    .line 128
    .line 129
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 130
    .line 131
    .line 132
    return-object v0

    .line 133
    :cond_1
    const-string p0, "viewModelFactory"

    .line 134
    .line 135
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v1

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
