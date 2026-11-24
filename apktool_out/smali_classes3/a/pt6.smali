.class public final La/pt6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/st6;


# direct methods
.method public constructor <init>(La/st6;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/pt6;->j:La/st6;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/pt6;

    .line 2
    .line 3
    iget-object p0, p0, La/pt6;->j:La/st6;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, La/pt6;-><init>(La/st6;La/yje;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, La/pt6;->i:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/zd20;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/pt6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/pt6;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/pt6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/pt6;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/zd20;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object v2, La/wd20;->a:La/wd20;

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    iget-object v0, v0, La/pt6;->j:La/st6;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-nez v3, :cond_6

    .line 22
    .line 23
    sget-object v3, La/xd20;->a:La/xd20;

    .line 24
    .line 25
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    iget-object v5, v0, La/st6;->M1:La/ynb;

    .line 32
    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    sget-object v6, La/bm5;->k:La/bm5;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const-string v10, "change_balance_request_key"

    .line 45
    .line 46
    const/16 v11, 0x18e

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    invoke-static/range {v5 .. v11}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_1

    .line 54
    .line 55
    :cond_0
    const-string v0, "changeBalanceDialogProvider"

    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v4

    .line 61
    :cond_1
    instance-of v3, v1, La/yd20;

    .line 62
    .line 63
    if-eqz v3, :cond_5

    .line 64
    .line 65
    iget-object v3, v0, La/st6;->O1:La/lgn0;

    .line 66
    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    new-instance v5, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 70
    .line 71
    const v6, 0x7f13025d

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-direct {v5, v6, v4, v4, v4}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const v6, 0x7f130105

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    check-cast v1, La/yd20;

    .line 92
    .line 93
    iget-object v9, v1, La/yd20;->a:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    new-instance v7, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 100
    .line 101
    const v10, 0x7f130494

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v11, v1, La/yd20;->d:Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {v7, v10, v11}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v6, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    new-instance v12, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 120
    .line 121
    const v7, 0x7f130270

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    sget-object v7, La/pn40;->a:La/pn40;

    .line 132
    .line 133
    iget-wide v10, v1, La/yd20;->c:D

    .line 134
    .line 135
    sget-object v7, La/p3u0;->c:La/p3u0;

    .line 136
    .line 137
    invoke-static {v10, v11, v7}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v15

    .line 141
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    const v10, 0x7f040b72

    .line 146
    .line 147
    .line 148
    invoke-static {v10, v7}, La/m5d;->b(ILandroid/content/Context;)I

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    iget-object v7, v1, La/yd20;->g:Ljava/lang/String;

    .line 153
    .line 154
    const/16 v17, 0x1

    .line 155
    .line 156
    move-object/from16 v16, v7

    .line 157
    .line 158
    invoke-direct/range {v12 .. v17}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    iget-boolean v7, v1, La/yd20;->h:Z

    .line 165
    .line 166
    if-nez v7, :cond_2

    .line 167
    .line 168
    new-instance v10, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 169
    .line 170
    iget-object v12, v1, La/yd20;->f:Ljava/lang/String;

    .line 171
    .line 172
    iget-object v13, v1, La/yd20;->e:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    const v11, 0x7f040aeb

    .line 179
    .line 180
    .line 181
    invoke-static {v11, v7}, La/m5d;->b(ILandroid/content/Context;)I

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    iget-object v14, v1, La/yd20;->g:Ljava/lang/String;

    .line 186
    .line 187
    const/4 v15, 0x0

    .line 188
    invoke-direct/range {v10 .. v15}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v6, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    :cond_2
    invoke-static {v6}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 195
    .line 196
    .line 197
    move-result-object v13

    .line 198
    iget-wide v6, v1, La/yd20;->b:J

    .line 199
    .line 200
    new-instance v1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 201
    .line 202
    new-instance v11, Ljava/lang/Long;

    .line 203
    .line 204
    invoke-direct {v11, v6, v7}, Ljava/lang/Long;-><init>(J)V

    .line 205
    .line 206
    .line 207
    const-string v12, "SIMPLE"

    .line 208
    .line 209
    const-string v10, "REQUEST_SUCCESS_BET_KEY"

    .line 210
    .line 211
    move-object v7, v1

    .line 212
    invoke-direct/range {v7 .. v13}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v3, v5, v7, v1}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 224
    .line 225
    .line 226
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 227
    .line 228
    instance-of v3, v1, La/yo8;

    .line 229
    .line 230
    if-eqz v3, :cond_3

    .line 231
    .line 232
    check-cast v1, La/yo8;

    .line 233
    .line 234
    goto :goto_0

    .line 235
    :cond_3
    move-object v1, v4

    .line 236
    :goto_0
    if-eqz v1, :cond_6

    .line 237
    .line 238
    invoke-virtual {v1}, La/yo8;->x0()V

    .line 239
    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_4
    const-string v0, "successBetAlertManager"

    .line 243
    .line 244
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw v4

    .line 248
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 249
    .line 250
    .line 251
    return-object v4

    .line 252
    :cond_6
    :goto_1
    sget-object v1, La/st6;->R1:La/yk5;

    .line 253
    .line 254
    invoke-virtual {v0}, La/st6;->H0()La/rg20;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    iget-object v0, v0, La/rg20;->N:La/p7m0;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0, v4, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    return-object v0
.end method
