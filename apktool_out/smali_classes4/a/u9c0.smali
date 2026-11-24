.class public final La/u9c0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/u9c0;->i:B

    iput-object p1, p0, La/u9c0;->k:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/u9c0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/u9c0;->k:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/u9c0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/u9c0;-><init>(Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/u9c0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/u9c0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/u9c0;-><init>(Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/u9c0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/u9c0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/x1j;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/u9c0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/u9c0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/u9c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/sw00;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/u9c0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/u9c0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/u9c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u9c0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, La/u9c0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, La/x1j;

    .line 12
    .line 13
    sget-object v3, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    instance-of v3, v1, La/v1j;

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, La/v1j;

    .line 24
    .line 25
    :cond_0
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iget-boolean v1, v2, La/v1j;->a:Z

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    sget v1, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->Q:I

    .line 32
    .line 33
    iget-object v0, v0, La/u9c0;->k:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 34
    .line 35
    sget-object v1, La/dac0;->a:La/dac0;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object v1, La/a4j;->c:La/usd;

    .line 41
    .line 42
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, La/iac0;

    .line 47
    .line 48
    iget-object v2, v2, La/iac0;->g:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {v2}, La/usd;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v2, v0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->y:La/b4j;

    .line 58
    .line 59
    invoke-virtual {v2, v1}, La/b4j;->k(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, v0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->z:La/je;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, La/je;->k(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_0
    iget-object v1, v0, La/u9c0;->j:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, La/sw00;

    .line 73
    .line 74
    sget-object v3, La/wne;->a:La/wne;

    .line 75
    .line 76
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget v3, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->Q:I

    .line 80
    .line 81
    iget-object v6, v0, La/u9c0;->k:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 82
    .line 83
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 84
    .line 85
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 86
    .line 87
    :cond_2
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-object v7, v4

    .line 95
    check-cast v7, La/iac0;

    .line 96
    .line 97
    iget-boolean v15, v1, La/sw00;->a:Z

    .line 98
    .line 99
    const/16 v16, 0x0

    .line 100
    .line 101
    const/16 v17, 0x1eff

    .line 102
    .line 103
    const/4 v8, 0x0

    .line 104
    const/4 v9, 0x0

    .line 105
    const/4 v10, 0x0

    .line 106
    const/4 v11, 0x0

    .line 107
    const/4 v12, 0x0

    .line 108
    const/4 v13, 0x0

    .line 109
    const/4 v14, 0x0

    .line 110
    invoke-static/range {v7 .. v17}, La/iac0;->a(La/iac0;Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState;ZLjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZZZI)La/iac0;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-virtual {v3, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_2

    .line 119
    .line 120
    iget-boolean v3, v1, La/sw00;->b:Z

    .line 121
    .line 122
    if-nez v3, :cond_6

    .line 123
    .line 124
    iget-boolean v1, v1, La/sw00;->a:Z

    .line 125
    .line 126
    if-eqz v1, :cond_6

    .line 127
    .line 128
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 129
    .line 130
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    move-object v7, v1

    .line 138
    check-cast v7, La/iac0;

    .line 139
    .line 140
    const/16 v16, 0x0

    .line 141
    .line 142
    const/16 v17, 0x1f7f

    .line 143
    .line 144
    const/4 v8, 0x0

    .line 145
    const/4 v9, 0x0

    .line 146
    const/4 v10, 0x0

    .line 147
    const/4 v11, 0x0

    .line 148
    const/4 v12, 0x0

    .line 149
    const/4 v13, 0x0

    .line 150
    const/4 v14, 0x1

    .line 151
    const/4 v15, 0x0

    .line 152
    invoke-static/range {v7 .. v17}, La/iac0;->a(La/iac0;Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState;ZLjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZZZI)La/iac0;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_3

    .line 161
    .line 162
    iget-object v0, v6, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->J:La/bby;

    .line 163
    .line 164
    if-eqz v0, :cond_4

    .line 165
    .line 166
    invoke-interface {v0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 167
    .line 168
    .line 169
    :cond_4
    iget-object v0, v6, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->P:La/bby;

    .line 170
    .line 171
    if-eqz v0, :cond_5

    .line 172
    .line 173
    invoke-interface {v0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 174
    .line 175
    .line 176
    :cond_5
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iget-object v1, v6, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->r:La/mne;

    .line 181
    .line 182
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 183
    .line 184
    new-instance v4, La/l8c0;

    .line 185
    .line 186
    const/4 v10, 0x0

    .line 187
    const/4 v11, 0x7

    .line 188
    const/4 v5, 0x1

    .line 189
    const-class v7, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 190
    .line 191
    const-string v8, "onError"

    .line 192
    .line 193
    const-string v9, "onError(Ljava/lang/Throwable;)V"

    .line 194
    .line 195
    invoke-direct/range {v4 .. v11}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 196
    .line 197
    .line 198
    new-instance v13, La/t9c0;

    .line 199
    .line 200
    const/4 v3, 0x0

    .line 201
    invoke-direct {v13, v6, v2, v3}, La/t9c0;-><init>(Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;La/yje;B)V

    .line 202
    .line 203
    .line 204
    const/16 v14, 0x20

    .line 205
    .line 206
    const-wide/16 v8, 0xa

    .line 207
    .line 208
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 209
    .line 210
    move-object v7, v0

    .line 211
    move-object v11, v1

    .line 212
    move-object v12, v4

    .line 213
    invoke-static/range {v7 .. v14}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    iput-object v0, v6, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->P:La/bby;

    .line 218
    .line 219
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object v0

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
