.class public final La/f620;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/aer;


# instance fields
.field public synthetic i:Lkotlin/Pair;

.field public synthetic j:Z

.field public synthetic k:La/q4f;

.field public synthetic l:Z

.field public final synthetic m:La/h620;


# direct methods
.method public constructor <init>(La/h620;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/f620;->m:La/h620;

    .line 2
    .line 3
    const/4 p1, 0x6

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/f620;->i:Lkotlin/Pair;

    .line 4
    .line 5
    iget-boolean v2, v0, La/f620;->j:Z

    .line 6
    .line 7
    iget-object v6, v0, La/f620;->k:La/q4f;

    .line 8
    .line 9
    iget-boolean v3, v0, La/f620;->l:Z

    .line 10
    .line 11
    sget-object v4, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v4, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v7, v4

    .line 19
    check-cast v7, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;

    .line 20
    .line 21
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v5, v1

    .line 24
    check-cast v5, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 25
    .line 26
    iget-object v4, v0, La/f620;->m:La/h620;

    .line 27
    .line 28
    iget-object v0, v4, La/h620;->k0:La/p7m0;

    .line 29
    .line 30
    iget-object v1, v4, La/h620;->e0:La/nwo0;

    .line 31
    .line 32
    iget-object v15, v4, La/h620;->G:La/vzg0;

    .line 33
    .line 34
    const/4 v13, 0x1

    .line 35
    const/16 v14, 0xff

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x0

    .line 39
    const/4 v10, 0x0

    .line 40
    const/4 v11, 0x0

    .line 41
    const/4 v12, 0x0

    .line 42
    invoke-static/range {v7 .. v14}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    const-string v9, "SAVED_STATE_COEF_KEY"

    .line 47
    .line 48
    invoke-virtual {v15, v9, v8}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/16 v29, 0x0

    .line 52
    .line 53
    const v30, 0x37fff

    .line 54
    .line 55
    .line 56
    const-wide/16 v9, 0x0

    .line 57
    .line 58
    const-wide/16 v11, 0x0

    .line 59
    .line 60
    const-wide/16 v13, 0x0

    .line 61
    .line 62
    move-object v8, v15

    .line 63
    const-wide/16 v15, 0x0

    .line 64
    .line 65
    const-wide/16 v17, 0x0

    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/16 v20, 0x0

    .line 70
    .line 71
    const/16 v21, 0x0

    .line 72
    .line 73
    const/16 v22, 0x0

    .line 74
    .line 75
    const/16 v23, 0x0

    .line 76
    .line 77
    const/16 v24, 0x0

    .line 78
    .line 79
    const/16 v25, 0x0

    .line 80
    .line 81
    const/16 v26, 0x0

    .line 82
    .line 83
    const/16 v27, 0x1

    .line 84
    .line 85
    const/16 v28, 0x0

    .line 86
    .line 87
    move-object/from16 v31, v8

    .line 88
    .line 89
    move-object v8, v5

    .line 90
    move-object/from16 v5, v31

    .line 91
    .line 92
    invoke-static/range {v8 .. v30}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    const-string v10, "SAVED_STATE_BET_SUM_KEY"

    .line 97
    .line 98
    invoke-virtual {v5, v10, v9}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object v5, v4, La/h620;->X:La/bby;

    .line 102
    .line 103
    const-string v9, "New config"

    .line 104
    .line 105
    if-eqz v5, :cond_0

    .line 106
    .line 107
    new-instance v10, Ljava/util/concurrent/CancellationException;

    .line 108
    .line 109
    invoke-direct {v10, v9}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v5, v10}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 113
    .line 114
    .line 115
    :cond_0
    iget-object v5, v4, La/h620;->Y:La/bby;

    .line 116
    .line 117
    if-eqz v5, :cond_1

    .line 118
    .line 119
    new-instance v10, Ljava/util/concurrent/CancellationException;

    .line 120
    .line 121
    invoke-direct {v10, v9}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v5, v10}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 125
    .line 126
    .line 127
    :cond_1
    invoke-static {v8, v7}, La/h620;->C(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;)Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-eqz v5, :cond_2

    .line 132
    .line 133
    if-eqz v2, :cond_2

    .line 134
    .line 135
    iget-boolean v2, v1, La/nwo0;->a:Z

    .line 136
    .line 137
    if-nez v2, :cond_3

    .line 138
    .line 139
    iget-boolean v2, v1, La/nwo0;->b:Z

    .line 140
    .line 141
    if-eqz v2, :cond_2

    .line 142
    .line 143
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_2

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_2
    move-object v5, v8

    .line 157
    goto :goto_1

    .line 158
    :cond_3
    :goto_0
    if-eqz v3, :cond_2

    .line 159
    .line 160
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    iget-object v1, v4, La/h620;->c:La/mne;

    .line 165
    .line 166
    iget-object v13, v1, La/mne;->b:La/dvj;

    .line 167
    .line 168
    new-instance v14, La/p520;

    .line 169
    .line 170
    const/4 v1, 0x2

    .line 171
    invoke-direct {v14, v4, v1}, La/p520;-><init>(La/h620;B)V

    .line 172
    .line 173
    .line 174
    new-instance v15, La/c620;

    .line 175
    .line 176
    move-object v5, v8

    .line 177
    const/4 v8, 0x0

    .line 178
    move-object v3, v15

    .line 179
    invoke-direct/range {v3 .. v8}, La/c620;-><init>(La/h620;Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;La/q4f;Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;La/yje;)V

    .line 180
    .line 181
    .line 182
    const/16 v16, 0x20

    .line 183
    .line 184
    const-wide/16 v10, 0x1f4

    .line 185
    .line 186
    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 187
    .line 188
    invoke-static/range {v9 .. v16}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    iput-object v1, v4, La/h620;->X:La/bby;

    .line 193
    .line 194
    iget-object v1, v4, La/h620;->x:La/pyu;

    .line 195
    .line 196
    iget-object v1, v1, La/pyu;->a:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v1, La/ovo0;

    .line 199
    .line 200
    iget-boolean v1, v1, La/ovo0;->a:Z

    .line 201
    .line 202
    const/4 v2, 0x0

    .line 203
    invoke-static {v1, v0, v2}, La/twn;->A(ZLa/p7m0;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :goto_1
    invoke-static {v5, v7}, La/h620;->C(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_4

    .line 212
    .line 213
    sget-object v0, La/hxu;->h:La/hxu;

    .line 214
    .line 215
    invoke-virtual {v4, v5, v7, v0, v6}, La/h620;->x(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;La/hxu;La/q4f;)V

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_4
    iget-boolean v0, v1, La/nwo0;->a:Z

    .line 220
    .line 221
    if-eqz v0, :cond_5

    .line 222
    .line 223
    sget-object v0, La/xvo0;->a:La/xvo0;

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_5
    sget-object v0, La/awo0;->a:La/awo0;

    .line 227
    .line 228
    :goto_2
    invoke-virtual {v4, v0}, La/h620;->E(La/hwo0;)V

    .line 229
    .line 230
    .line 231
    sget-object v0, La/hnb0;->a:La/hnb0;

    .line 232
    .line 233
    iget-object v1, v4, La/h620;->l0:La/p7m0;

    .line 234
    .line 235
    invoke-virtual {v1, v0}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object v0
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/Pair;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, La/q4f;

    .line 10
    .line 11
    check-cast p4, Ljava/util/List;

    .line 12
    .line 13
    check-cast p5, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p4

    .line 19
    check-cast p6, La/yje;

    .line 20
    .line 21
    new-instance p5, La/f620;

    .line 22
    .line 23
    iget-object p0, p0, La/f620;->m:La/h620;

    .line 24
    .line 25
    invoke-direct {p5, p0, p6}, La/f620;-><init>(La/h620;La/yje;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p5, La/f620;->i:Lkotlin/Pair;

    .line 29
    .line 30
    iput-boolean p2, p5, La/f620;->j:Z

    .line 31
    .line 32
    iput-object p3, p5, La/f620;->k:La/q4f;

    .line 33
    .line 34
    iput-boolean p4, p5, La/f620;->l:Z

    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p5, p0}, La/f620;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
