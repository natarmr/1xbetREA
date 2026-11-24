.class public final synthetic La/dne0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jne0;


# direct methods
.method public synthetic constructor <init>(La/jne0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dne0;->a:B

    iput-object p1, p0, La/dne0;->b:La/jne0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/dne0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/dne0;->b:La/jne0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/jne0;->S1:La/gne0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/jne0;->H0()La/xne0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object v0, p0, La/xne0;->j:La/p7m0;

    .line 16
    .line 17
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v2, v0, La/one0;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    check-cast v0, La/one0;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v0, v1

    .line 29
    :goto_0
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v3, La/eme0;

    .line 37
    .line 38
    const/4 v4, 0x2

    .line 39
    invoke-direct {v3, p0, v4}, La/eme0;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    new-instance v6, La/vne0;

    .line 43
    .line 44
    invoke-direct {v6, v1, v0, p0}, La/vne0;-><init>(La/yje;La/one0;La/xne0;)V

    .line 45
    .line 46
    .line 47
    const/16 v7, 0xe

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 52
    .line 53
    .line 54
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_0
    sget-object v0, La/jne0;->S1:La/gne0;

    .line 58
    .line 59
    invoke-virtual {p0}, La/jne0;->H0()La/xne0;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iget-object p0, p0, La/xne0;->g:La/pzu;

    .line 64
    .line 65
    iget-object v0, p0, La/pzu;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, La/oeg0;

    .line 68
    .line 69
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v2, p0, La/pzu;->e:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, La/jh70;

    .line 80
    .line 81
    iget-object p0, p0, La/pzu;->f:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, La/pru;

    .line 84
    .line 85
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    iget-object p0, p0, La/sff0;->V0:La/zuc0;

    .line 90
    .line 91
    invoke-static {v2, p0}, La/jh70;->i(La/jh70;La/zuc0;)Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v1, p0}, La/k0w0;->c(La/m7h0;)V

    .line 96
    .line 97
    .line 98
    iget-object p0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    invoke-static {v0, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :goto_2
    move-object v1, p0

    .line 106
    check-cast v1, La/paw;

    .line 107
    .line 108
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_2

    .line 113
    .line 114
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    check-cast v1, La/oe50;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_1
    iget-object p0, p0, La/jne0;->L1:La/fiu0;

    .line 128
    .line 129
    if-eqz p0, :cond_3

    .line 130
    .line 131
    return-object p0

    .line 132
    :cond_3
    const-string p0, "viewModelFactory"

    .line 133
    .line 134
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v1

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
