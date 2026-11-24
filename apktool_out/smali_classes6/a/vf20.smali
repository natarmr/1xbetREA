.class public final synthetic La/vf20;
.super La/xo;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic h:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/vf20;->h:B

    invoke-direct/range {p0 .. p6}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, La/n570;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    iget-object p0, p0, La/xo;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/ez60;

    .line 8
    .line 9
    sget-object p2, La/ez60;->S1:[La/iiy;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_7

    .line 15
    .line 16
    iget-object p2, p1, La/n570;->a:La/r270;

    .line 17
    .line 18
    iget-wide v0, p1, La/n570;->b:J

    .line 19
    .line 20
    iget v2, p1, La/n570;->c:I

    .line 21
    .line 22
    iget-object p1, p1, La/n570;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4, v3}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    iget-object v5, v5, Landroidx/fragment/app/e;->c:La/pmi;

    .line 41
    .line 42
    invoke-virtual {v5}, La/pmi;->p()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-static {v5}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_1

    .line 59
    .line 60
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    move-object v8, v7

    .line 65
    check-cast v8, Landroidx/fragment/app/Fragment;

    .line 66
    .line 67
    instance-of v9, v8, La/sik;

    .line 68
    .line 69
    if-nez v9, :cond_0

    .line 70
    .line 71
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->O()Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-nez v9, :cond_0

    .line 76
    .line 77
    iget-object v8, v8, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-nez v8, :cond_0

    .line 84
    .line 85
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    const/4 v7, 0x1

    .line 94
    if-eqz v5, :cond_2

    .line 95
    .line 96
    if-eqz v4, :cond_2

    .line 97
    .line 98
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->S()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-ne v5, v7, :cond_2

    .line 103
    .line 104
    goto/16 :goto_3

    .line 105
    .line 106
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    new-instance v5, La/zb5;

    .line 114
    .line 115
    invoke-direct {v5, p0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 116
    .line 117
    .line 118
    const p0, 0x7f010033

    .line 119
    .line 120
    .line 121
    const/4 v8, 0x0

    .line 122
    const v9, 0x7f010030

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5, v9, p0, v8, v8}, La/zb5;->p(IIII)V

    .line 126
    .line 127
    .line 128
    if-eqz v4, :cond_4

    .line 129
    .line 130
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->S()Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-eqz p0, :cond_3

    .line 135
    .line 136
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->O()Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-eqz p0, :cond_5

    .line 141
    .line 142
    :cond_3
    sget-object p0, La/lkz;->e:La/lkz;

    .line 143
    .line 144
    invoke-virtual {v5, v4, p0}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v4}, La/zb5;->r(Landroidx/fragment/app/Fragment;)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_4
    sget-object p0, La/y370;->Y1:La/wsz;

    .line 152
    .line 153
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    new-instance p0, La/y370;

    .line 160
    .line 161
    invoke-direct {p0}, La/y370;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    new-instance v4, Lkotlin/Pair;

    .line 169
    .line 170
    const-string v8, "ARG_TAB_TAG"

    .line 171
    .line 172
    invoke-direct {v4, v8, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    new-instance v0, Lkotlin/Pair;

    .line 180
    .line 181
    const-string v1, "ARG_GAME_ID"

    .line 182
    .line 183
    invoke-direct {v0, v1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    new-instance v1, Lkotlin/Pair;

    .line 191
    .line 192
    const-string v2, "ARG_PROMO_TYPE_ID"

    .line 193
    .line 194
    invoke-direct {v1, v2, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    new-instance p2, Lkotlin/Pair;

    .line 198
    .line 199
    const-string v2, "WEB_GAME_SESSION_ID"

    .line 200
    .line 201
    invoke-direct {p2, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    filled-new-array {v4, v0, v1, p2}, [Lkotlin/Pair;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 213
    .line 214
    .line 215
    const p1, 0x7f0a03a0

    .line 216
    .line 217
    .line 218
    invoke-virtual {v5, p1, p0, v3, v7}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 219
    .line 220
    .line 221
    :cond_5
    :goto_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-eqz p1, :cond_6

    .line 230
    .line 231
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 236
    .line 237
    sget-object p2, La/lkz;->c:La/lkz;

    .line 238
    .line 239
    invoke-virtual {v5, p1, p2}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v5, p1}, La/zb5;->m(Landroidx/fragment/app/Fragment;)V

    .line 243
    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_6
    invoke-virtual {v5, v7, v7}, La/zb5;->g(ZZ)I

    .line 247
    .line 248
    .line 249
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object p0

    .line 252
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 253
    .line 254
    .line 255
    const/4 p0, 0x0

    .line 256
    return-object p0
.end method

.method private final b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/zy5;

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    check-cast v1, La/yje;

    .line 8
    .line 9
    move-object/from16 v1, p0

    .line 10
    .line 11
    iget-object v1, v1, La/xo;->a:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v4, v1

    .line 14
    check-cast v4, La/qf70;

    .line 15
    .line 16
    iget-object v1, v4, La/qf70;->E:La/y5s;

    .line 17
    .line 18
    iget-object v2, v4, La/qf70;->L:La/p7m0;

    .line 19
    .line 20
    iget-object v3, v4, La/qf70;->M:La/p7m0;

    .line 21
    .line 22
    iget-object v10, v4, La/qf70;->v:La/mne;

    .line 23
    .line 24
    iget-object v5, v4, La/qf70;->N:La/p7m0;

    .line 25
    .line 26
    iget-object v6, v4, La/qf70;->q:La/vcu;

    .line 27
    .line 28
    invoke-virtual {v6}, La/vcu;->a()La/vrs;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    sget-object v8, La/vrs;->a:La/vrs;

    .line 33
    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v12, 0x1

    .line 36
    if-eq v7, v8, :cond_1

    .line 37
    .line 38
    invoke-virtual {v6}, La/vcu;->a()La/vrs;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    sget-object v7, La/vrs;->c:La/vrs;

    .line 43
    .line 44
    if-ne v6, v7, :cond_0

    .line 45
    .line 46
    iget-object v6, v4, La/qf70;->r:La/oqt;

    .line 47
    .line 48
    invoke-virtual {v6}, La/oqt;->a()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-nez v6, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v6, v11

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    :goto_0
    move v6, v12

    .line 58
    :goto_1
    const/4 v13, 0x0

    .line 59
    invoke-static {v6, v5, v13}, La/twn;->A(ZLa/p7m0;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    goto/16 :goto_4

    .line 65
    .line 66
    :cond_2
    instance-of v5, v0, La/fy5;

    .line 67
    .line 68
    if-eqz v5, :cond_3

    .line 69
    .line 70
    iget-boolean v0, v1, La/y5s;->h:Z

    .line 71
    .line 72
    if-nez v0, :cond_17

    .line 73
    .line 74
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v13, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v13, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto/16 :goto_4

    .line 91
    .line 92
    :cond_3
    instance-of v5, v0, La/yy5;

    .line 93
    .line 94
    if-eqz v5, :cond_4

    .line 95
    .line 96
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v13, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v13, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto/16 :goto_4

    .line 113
    .line 114
    :cond_4
    instance-of v5, v0, La/my5;

    .line 115
    .line 116
    if-eqz v5, :cond_5

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    instance-of v5, v0, La/ey5;

    .line 120
    .line 121
    if-eqz v5, :cond_6

    .line 122
    .line 123
    :goto_2
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 124
    .line 125
    .line 126
    move-result-object v14

    .line 127
    new-instance v15, La/cf70;

    .line 128
    .line 129
    const/4 v8, 0x0

    .line 130
    const/16 v9, 0xb

    .line 131
    .line 132
    const/4 v3, 0x1

    .line 133
    const-class v5, La/qf70;

    .line 134
    .line 135
    const-string v6, "handleGameError"

    .line 136
    .line 137
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 138
    .line 139
    move-object v2, v15

    .line 140
    invoke-direct/range {v2 .. v9}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 141
    .line 142
    .line 143
    iget-object v0, v10, La/mne;->b:La/dvj;

    .line 144
    .line 145
    new-instance v1, La/ef70;

    .line 146
    .line 147
    const/4 v2, 0x4

    .line 148
    invoke-direct {v1, v4, v13, v2}, La/ef70;-><init>(La/qf70;La/yje;B)V

    .line 149
    .line 150
    .line 151
    const/16 v19, 0xa

    .line 152
    .line 153
    const/16 v16, 0x0

    .line 154
    .line 155
    move-object/from16 v17, v0

    .line 156
    .line 157
    move-object/from16 v18, v1

    .line 158
    .line 159
    invoke-static/range {v14 .. v19}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 160
    .line 161
    .line 162
    goto/16 :goto_4

    .line 163
    .line 164
    :cond_6
    instance-of v5, v0, La/ly5;

    .line 165
    .line 166
    if-eqz v5, :cond_7

    .line 167
    .line 168
    check-cast v0, La/ly5;

    .line 169
    .line 170
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, v13, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-wide v11, v0, La/ly5;->d:D

    .line 182
    .line 183
    iget-wide v0, v0, La/ly5;->g:J

    .line 184
    .line 185
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 186
    .line 187
    .line 188
    move-result-object v13

    .line 189
    new-instance v14, La/cf70;

    .line 190
    .line 191
    const/4 v8, 0x0

    .line 192
    const/16 v9, 0xa

    .line 193
    .line 194
    const/4 v3, 0x1

    .line 195
    const-class v5, La/qf70;

    .line 196
    .line 197
    const-string v6, "handleGameError"

    .line 198
    .line 199
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 200
    .line 201
    move-object v2, v14

    .line 202
    invoke-direct/range {v2 .. v9}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 203
    .line 204
    .line 205
    iget-object v9, v10, La/mne;->b:La/dvj;

    .line 206
    .line 207
    new-instance v17, La/lf70;

    .line 208
    .line 209
    const/4 v8, 0x0

    .line 210
    move-wide v6, v0

    .line 211
    move-object v3, v4

    .line 212
    move-wide v4, v11

    .line 213
    move-object/from16 v2, v17

    .line 214
    .line 215
    invoke-direct/range {v2 .. v8}, La/lf70;-><init>(La/qf70;DJLa/yje;)V

    .line 216
    .line 217
    .line 218
    const/16 v18, 0xa

    .line 219
    .line 220
    const/4 v15, 0x0

    .line 221
    move-object/from16 v16, v9

    .line 222
    .line 223
    invoke-static/range {v13 .. v18}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 224
    .line 225
    .line 226
    goto/16 :goto_4

    .line 227
    .line 228
    :cond_7
    instance-of v1, v0, La/sy5;

    .line 229
    .line 230
    if-eqz v1, :cond_8

    .line 231
    .line 232
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 233
    .line 234
    .line 235
    move-result-object v14

    .line 236
    iget-object v0, v10, La/mne;->b:La/dvj;

    .line 237
    .line 238
    new-instance v15, La/cf70;

    .line 239
    .line 240
    const/4 v8, 0x0

    .line 241
    const/4 v9, 0x7

    .line 242
    const/4 v3, 0x1

    .line 243
    const-class v5, La/qf70;

    .line 244
    .line 245
    const-string v6, "handleGameError"

    .line 246
    .line 247
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 248
    .line 249
    move-object v2, v15

    .line 250
    invoke-direct/range {v2 .. v9}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 251
    .line 252
    .line 253
    new-instance v1, La/kf70;

    .line 254
    .line 255
    invoke-direct {v1, v4, v13, v12}, La/kf70;-><init>(La/qf70;La/yje;B)V

    .line 256
    .line 257
    .line 258
    const/16 v19, 0xa

    .line 259
    .line 260
    const/16 v16, 0x0

    .line 261
    .line 262
    move-object/from16 v17, v0

    .line 263
    .line 264
    move-object/from16 v18, v1

    .line 265
    .line 266
    invoke-static/range {v14 .. v19}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 267
    .line 268
    .line 269
    goto/16 :goto_4

    .line 270
    .line 271
    :cond_8
    instance-of v1, v0, La/oy5;

    .line 272
    .line 273
    if-eqz v1, :cond_9

    .line 274
    .line 275
    check-cast v0, La/oy5;

    .line 276
    .line 277
    iget-wide v0, v0, La/oy5;->a:J

    .line 278
    .line 279
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 280
    .line 281
    .line 282
    move-result-object v14

    .line 283
    new-instance v15, La/cf70;

    .line 284
    .line 285
    const/4 v8, 0x0

    .line 286
    const/4 v9, 0x0

    .line 287
    const/4 v3, 0x1

    .line 288
    const-class v5, La/qf70;

    .line 289
    .line 290
    const-string v6, "handleGameError"

    .line 291
    .line 292
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 293
    .line 294
    move-object v2, v15

    .line 295
    invoke-direct/range {v2 .. v9}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 296
    .line 297
    .line 298
    iget-object v8, v10, La/mne;->b:La/dvj;

    .line 299
    .line 300
    new-instance v2, La/qe5;

    .line 301
    .line 302
    const/16 v7, 0x9

    .line 303
    .line 304
    move-object v3, v4

    .line 305
    move-object v6, v13

    .line 306
    move-wide v4, v0

    .line 307
    invoke-direct/range {v2 .. v7}, La/qe5;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 308
    .line 309
    .line 310
    const/16 v19, 0xa

    .line 311
    .line 312
    const/16 v16, 0x0

    .line 313
    .line 314
    move-object/from16 v18, v2

    .line 315
    .line 316
    move-object/from16 v17, v8

    .line 317
    .line 318
    invoke-static/range {v14 .. v19}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 319
    .line 320
    .line 321
    goto/16 :goto_4

    .line 322
    .line 323
    :cond_9
    move-object v1, v13

    .line 324
    instance-of v5, v0, La/cme;

    .line 325
    .line 326
    if-eqz v5, :cond_a

    .line 327
    .line 328
    invoke-virtual {v4}, La/qf70;->D()V

    .line 329
    .line 330
    .line 331
    sget-object v0, La/ve70;->a:La/ve70;

    .line 332
    .line 333
    invoke-virtual {v4, v0}, La/qf70;->E(La/we70;)V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_4

    .line 337
    .line 338
    :cond_a
    instance-of v5, v0, La/tle;

    .line 339
    .line 340
    if-eqz v5, :cond_b

    .line 341
    .line 342
    invoke-virtual {v4}, La/qf70;->D()V

    .line 343
    .line 344
    .line 345
    sget-object v0, La/se70;->a:La/se70;

    .line 346
    .line 347
    invoke-virtual {v4, v0}, La/qf70;->E(La/we70;)V

    .line 348
    .line 349
    .line 350
    goto/16 :goto_4

    .line 351
    .line 352
    :cond_b
    instance-of v5, v0, La/xle;

    .line 353
    .line 354
    if-eqz v5, :cond_c

    .line 355
    .line 356
    sget-object v0, La/re70;->a:La/re70;

    .line 357
    .line 358
    invoke-virtual {v4, v0}, La/qf70;->E(La/we70;)V

    .line 359
    .line 360
    .line 361
    goto/16 :goto_4

    .line 362
    .line 363
    :cond_c
    instance-of v5, v0, La/ame;

    .line 364
    .line 365
    if-eqz v5, :cond_d

    .line 366
    .line 367
    sget-object v0, La/te70;->a:La/te70;

    .line 368
    .line 369
    invoke-virtual {v4, v0}, La/qf70;->E(La/we70;)V

    .line 370
    .line 371
    .line 372
    goto/16 :goto_4

    .line 373
    .line 374
    :cond_d
    instance-of v5, v0, La/kle;

    .line 375
    .line 376
    if-eqz v5, :cond_e

    .line 377
    .line 378
    invoke-virtual {v4}, La/qf70;->D()V

    .line 379
    .line 380
    .line 381
    goto/16 :goto_4

    .line 382
    .line 383
    :cond_e
    instance-of v5, v0, La/ry5;

    .line 384
    .line 385
    if-eqz v5, :cond_f

    .line 386
    .line 387
    iget-object v0, v4, La/qf70;->l:La/spx;

    .line 388
    .line 389
    invoke-virtual {v0}, La/spx;->a()Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    xor-int/2addr v0, v12

    .line 394
    invoke-static {v0, v3, v1}, La/twn;->A(ZLa/p7m0;Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 398
    .line 399
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    goto/16 :goto_4

    .line 406
    .line 407
    :cond_f
    instance-of v5, v0, La/wy5;

    .line 408
    .line 409
    if-eqz v5, :cond_10

    .line 410
    .line 411
    goto :goto_3

    .line 412
    :cond_10
    instance-of v5, v0, La/bme;

    .line 413
    .line 414
    if-eqz v5, :cond_11

    .line 415
    .line 416
    goto :goto_3

    .line 417
    :cond_11
    instance-of v5, v0, La/yle;

    .line 418
    .line 419
    if-eqz v5, :cond_12

    .line 420
    .line 421
    goto :goto_3

    .line 422
    :cond_12
    instance-of v5, v0, La/zle;

    .line 423
    .line 424
    if-eqz v5, :cond_13

    .line 425
    .line 426
    :goto_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 427
    .line 428
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v3, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 435
    .line 436
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    goto/16 :goto_4

    .line 443
    .line 444
    :cond_13
    instance-of v2, v0, La/mle;

    .line 445
    .line 446
    if-eqz v2, :cond_15

    .line 447
    .line 448
    iget-object v2, v4, La/qf70;->J:La/p7m0;

    .line 449
    .line 450
    :cond_14
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    move-object v3, v0

    .line 455
    check-cast v3, La/qe70;

    .line 456
    .line 457
    const/16 v4, 0xe

    .line 458
    .line 459
    invoke-static {v3, v1, v11, v11, v4}, La/qe70;->a(La/qe70;La/ql5;ZZI)La/qe70;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    if-eqz v0, :cond_14

    .line 468
    .line 469
    goto :goto_4

    .line 470
    :cond_15
    instance-of v2, v0, La/hle;

    .line 471
    .line 472
    if-eqz v2, :cond_16

    .line 473
    .line 474
    check-cast v0, La/hle;

    .line 475
    .line 476
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 477
    .line 478
    .line 479
    move-result-object v11

    .line 480
    new-instance v2, La/cf70;

    .line 481
    .line 482
    const/4 v8, 0x0

    .line 483
    const/4 v9, 0x2

    .line 484
    const/4 v3, 0x1

    .line 485
    const-class v5, La/qf70;

    .line 486
    .line 487
    const-string v6, "handleGameError"

    .line 488
    .line 489
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 490
    .line 491
    invoke-direct/range {v2 .. v9}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 492
    .line 493
    .line 494
    iget-object v14, v10, La/mne;->b:La/dvj;

    .line 495
    .line 496
    new-instance v15, La/ku60;

    .line 497
    .line 498
    const/16 v3, 0xb

    .line 499
    .line 500
    invoke-direct {v15, v4, v0, v1, v3}, La/ku60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 501
    .line 502
    .line 503
    const/16 v16, 0xa

    .line 504
    .line 505
    const/4 v13, 0x0

    .line 506
    move-object v12, v2

    .line 507
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 508
    .line 509
    .line 510
    goto :goto_4

    .line 511
    :cond_16
    instance-of v0, v0, La/qle;

    .line 512
    .line 513
    if-eqz v0, :cond_17

    .line 514
    .line 515
    iget-object v0, v4, La/qf70;->D:La/d3c;

    .line 516
    .line 517
    invoke-virtual {v0}, La/d3c;->a()Z

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    if-nez v0, :cond_17

    .line 522
    .line 523
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 524
    .line 525
    .line 526
    move-result-object v12

    .line 527
    iget-object v15, v10, La/mne;->b:La/dvj;

    .line 528
    .line 529
    new-instance v13, La/cf70;

    .line 530
    .line 531
    const/4 v8, 0x0

    .line 532
    const/4 v9, 0x1

    .line 533
    const/4 v3, 0x1

    .line 534
    const-class v5, La/qf70;

    .line 535
    .line 536
    const-string v6, "handleGameError"

    .line 537
    .line 538
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 539
    .line 540
    move-object v2, v13

    .line 541
    invoke-direct/range {v2 .. v9}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 542
    .line 543
    .line 544
    new-instance v0, La/ef70;

    .line 545
    .line 546
    invoke-direct {v0, v4, v1, v11}, La/ef70;-><init>(La/qf70;La/yje;B)V

    .line 547
    .line 548
    .line 549
    const/16 v17, 0xa

    .line 550
    .line 551
    const/4 v14, 0x0

    .line 552
    move-object/from16 v16, v0

    .line 553
    .line 554
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 555
    .line 556
    .line 557
    :cond_17
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 558
    .line 559
    return-object v0
.end method

.method private final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, La/zy5;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    iget-object p0, p0, La/xo;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/rg70;

    .line 8
    .line 9
    iget-object p2, p0, La/rg70;->f:La/ztt;

    .line 10
    .line 11
    iget-boolean v0, p0, La/rg70;->h:Z

    .line 12
    .line 13
    iget-object v1, p0, La/rg70;->c:La/vcu;

    .line 14
    .line 15
    iget-object v2, p0, La/rg70;->b:La/oqt;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_13

    .line 20
    .line 21
    :cond_0
    instance-of v3, p1, La/ry5;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    sget-object p1, La/lg70;->a:La/lg70;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, La/rg70;->w(La/qg70;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_13

    .line 31
    .line 32
    :cond_1
    instance-of v3, p1, La/ole;

    .line 33
    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    new-instance p2, La/og70;

    .line 37
    .line 38
    check-cast p1, La/ole;

    .line 39
    .line 40
    iget-boolean p1, p1, La/ole;->a:Z

    .line 41
    .line 42
    invoke-direct {p2, p1}, La/og70;-><init>(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p2}, La/rg70;->w(La/qg70;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_13

    .line 49
    .line 50
    :cond_2
    instance-of v3, p1, La/gle;

    .line 51
    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    sget-object p1, La/ng70;->a:La/ng70;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, La/rg70;->w(La/qg70;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_13

    .line 60
    .line 61
    :cond_3
    instance-of v3, p1, La/yy5;

    .line 62
    .line 63
    const/4 v4, 0x1

    .line 64
    const/4 v5, 0x0

    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    instance-of v3, p1, La/uy5;

    .line 69
    .line 70
    if-eqz v3, :cond_a

    .line 71
    .line 72
    :goto_0
    invoke-virtual {v2}, La/oqt;->a()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-virtual {v1}, La/vcu;->a()La/vrs;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sget-object v2, La/vrs;->b:La/vrs;

    .line 81
    .line 82
    if-ne v1, v2, :cond_5

    .line 83
    .line 84
    move v1, v4

    .line 85
    goto :goto_1

    .line 86
    :cond_5
    move v1, v5

    .line 87
    :goto_1
    if-nez p1, :cond_7

    .line 88
    .line 89
    iget-boolean p1, p0, La/rg70;->j:Z

    .line 90
    .line 91
    if-eqz p1, :cond_6

    .line 92
    .line 93
    if-eqz v1, :cond_6

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_6
    move p1, v5

    .line 97
    goto :goto_3

    .line 98
    :cond_7
    :goto_2
    move p1, v4

    .line 99
    :goto_3
    invoke-virtual {p2}, La/ztt;->a()La/csr;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    iget-object p2, p2, La/csr;->a:La/bsr;

    .line 104
    .line 105
    iget-object p2, p2, La/bsr;->a:La/esr;

    .line 106
    .line 107
    sget-object v1, La/esr;->f:La/esr;

    .line 108
    .line 109
    if-ne p2, v1, :cond_8

    .line 110
    .line 111
    move p2, v4

    .line 112
    goto :goto_4

    .line 113
    :cond_8
    move p2, v5

    .line 114
    :goto_4
    if-eqz v0, :cond_9

    .line 115
    .line 116
    if-nez p2, :cond_9

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_9
    move v4, v5

    .line 120
    :goto_5
    new-instance p2, La/kg70;

    .line 121
    .line 122
    invoke-direct {p2, p1, v4}, La/kg70;-><init>(ZZ)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p2}, La/rg70;->w(La/qg70;)V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_13

    .line 129
    .line 130
    :cond_a
    instance-of v3, p1, La/jy5;

    .line 131
    .line 132
    if-eqz v3, :cond_f

    .line 133
    .line 134
    invoke-virtual {v1}, La/vcu;->a()La/vrs;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    sget-object v1, La/vrs;->b:La/vrs;

    .line 139
    .line 140
    if-ne p1, v1, :cond_1e

    .line 141
    .line 142
    invoke-virtual {v2}, La/oqt;->a()Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-nez p1, :cond_c

    .line 147
    .line 148
    iget-boolean p1, p0, La/rg70;->j:Z

    .line 149
    .line 150
    if-eqz p1, :cond_b

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_b
    move p1, v5

    .line 154
    goto :goto_7

    .line 155
    :cond_c
    :goto_6
    move p1, v4

    .line 156
    :goto_7
    invoke-virtual {p2}, La/ztt;->a()La/csr;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    iget-object p2, p2, La/csr;->a:La/bsr;

    .line 161
    .line 162
    iget-object p2, p2, La/bsr;->a:La/esr;

    .line 163
    .line 164
    sget-object v1, La/esr;->f:La/esr;

    .line 165
    .line 166
    if-ne p2, v1, :cond_d

    .line 167
    .line 168
    move p2, v4

    .line 169
    goto :goto_8

    .line 170
    :cond_d
    move p2, v5

    .line 171
    :goto_8
    if-eqz v0, :cond_e

    .line 172
    .line 173
    if-nez p2, :cond_e

    .line 174
    .line 175
    goto :goto_9

    .line 176
    :cond_e
    move v4, v5

    .line 177
    :goto_9
    new-instance p2, La/kg70;

    .line 178
    .line 179
    invoke-direct {p2, p1, v4}, La/kg70;-><init>(ZZ)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, p2}, La/rg70;->w(La/qg70;)V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_13

    .line 186
    .line 187
    :cond_f
    instance-of p2, p1, La/iy5;

    .line 188
    .line 189
    if-eqz p2, :cond_1b

    .line 190
    .line 191
    check-cast p1, La/iy5;

    .line 192
    .line 193
    iget-object p1, p1, La/iy5;->a:La/csr;

    .line 194
    .line 195
    iget-object p1, p1, La/csr;->a:La/bsr;

    .line 196
    .line 197
    iget-object p1, p1, La/bsr;->a:La/esr;

    .line 198
    .line 199
    sget-object p2, La/esr;->f:La/esr;

    .line 200
    .line 201
    if-ne p1, p2, :cond_10

    .line 202
    .line 203
    move p1, v4

    .line 204
    goto :goto_a

    .line 205
    :cond_10
    move p1, v5

    .line 206
    :goto_a
    invoke-virtual {v1}, La/vcu;->a()La/vrs;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    sget-object v3, La/vrs;->a:La/vrs;

    .line 211
    .line 212
    if-ne p2, v3, :cond_11

    .line 213
    .line 214
    move p2, v4

    .line 215
    goto :goto_b

    .line 216
    :cond_11
    move p2, v5

    .line 217
    :goto_b
    invoke-virtual {v1}, La/vcu;->a()La/vrs;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-virtual {v3}, La/vrs;->a()Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    invoke-virtual {v1}, La/vcu;->a()La/vrs;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    sget-object v6, La/vrs;->c:La/vrs;

    .line 230
    .line 231
    if-ne v1, v6, :cond_12

    .line 232
    .line 233
    move v1, v4

    .line 234
    goto :goto_c

    .line 235
    :cond_12
    move v1, v5

    .line 236
    :goto_c
    if-eqz v0, :cond_13

    .line 237
    .line 238
    if-nez p1, :cond_13

    .line 239
    .line 240
    if-nez v1, :cond_13

    .line 241
    .line 242
    move v0, v4

    .line 243
    goto :goto_d

    .line 244
    :cond_13
    move v0, v5

    .line 245
    :goto_d
    iget-object v1, p0, La/rg70;->e:La/pyb;

    .line 246
    .line 247
    invoke-virtual {v1}, La/pyb;->a()Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    invoke-virtual {v2}, La/oqt;->a()Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-nez p1, :cond_15

    .line 256
    .line 257
    if-nez p2, :cond_14

    .line 258
    .line 259
    if-eqz v1, :cond_15

    .line 260
    .line 261
    if-eqz v3, :cond_15

    .line 262
    .line 263
    if-eqz v2, :cond_15

    .line 264
    .line 265
    :cond_14
    move v1, v4

    .line 266
    goto :goto_e

    .line 267
    :cond_15
    move v1, v5

    .line 268
    :goto_e
    if-nez p1, :cond_16

    .line 269
    .line 270
    if-eqz p2, :cond_16

    .line 271
    .line 272
    move p1, v4

    .line 273
    goto :goto_f

    .line 274
    :cond_16
    move p1, v5

    .line 275
    :goto_f
    new-instance p2, La/pg70;

    .line 276
    .line 277
    if-nez v1, :cond_18

    .line 278
    .line 279
    if-eqz v0, :cond_17

    .line 280
    .line 281
    goto :goto_10

    .line 282
    :cond_17
    move v1, v5

    .line 283
    goto :goto_11

    .line 284
    :cond_18
    :goto_10
    move v1, v4

    .line 285
    :goto_11
    invoke-direct {p2, v1}, La/pg70;-><init>(Z)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0, p2}, La/rg70;->w(La/qg70;)V

    .line 289
    .line 290
    .line 291
    new-instance p2, La/mg70;

    .line 292
    .line 293
    if-nez p1, :cond_1a

    .line 294
    .line 295
    if-eqz v0, :cond_19

    .line 296
    .line 297
    goto :goto_12

    .line 298
    :cond_19
    move v4, v5

    .line 299
    :cond_1a
    :goto_12
    invoke-direct {p2, v4}, La/mg70;-><init>(Z)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p0, p2}, La/rg70;->w(La/qg70;)V

    .line 303
    .line 304
    .line 305
    goto :goto_13

    .line 306
    :cond_1b
    instance-of p2, p1, La/ple;

    .line 307
    .line 308
    if-eqz p2, :cond_1c

    .line 309
    .line 310
    invoke-virtual {v1}, La/vcu;->a()La/vrs;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    sget-object p2, La/vrs;->c:La/vrs;

    .line 315
    .line 316
    if-ne p1, p2, :cond_1e

    .line 317
    .line 318
    new-instance p1, La/mg70;

    .line 319
    .line 320
    invoke-direct {p1, v5}, La/mg70;-><init>(Z)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p0, p1}, La/rg70;->w(La/qg70;)V

    .line 324
    .line 325
    .line 326
    new-instance p1, La/pg70;

    .line 327
    .line 328
    invoke-direct {p1, v5}, La/pg70;-><init>(Z)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0, p1}, La/rg70;->w(La/qg70;)V

    .line 332
    .line 333
    .line 334
    goto :goto_13

    .line 335
    :cond_1c
    instance-of p2, p1, La/ly5;

    .line 336
    .line 337
    if-eqz p2, :cond_1d

    .line 338
    .line 339
    new-instance p1, La/jg70;

    .line 340
    .line 341
    invoke-virtual {v2}, La/oqt;->a()Z

    .line 342
    .line 343
    .line 344
    move-result p2

    .line 345
    invoke-direct {p1, p2}, La/jg70;-><init>(Z)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {p0, p1}, La/rg70;->w(La/qg70;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2}, La/oqt;->a()Z

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    if-nez p1, :cond_1e

    .line 356
    .line 357
    iput-boolean v5, p0, La/rg70;->j:Z

    .line 358
    .line 359
    goto :goto_13

    .line 360
    :cond_1d
    instance-of p1, p1, La/my5;

    .line 361
    .line 362
    if-eqz p1, :cond_1e

    .line 363
    .line 364
    invoke-virtual {v2}, La/oqt;->a()Z

    .line 365
    .line 366
    .line 367
    move-result p1

    .line 368
    if-eqz p1, :cond_1e

    .line 369
    .line 370
    iput-boolean v4, p0, La/rg70;->j:Z

    .line 371
    .line 372
    :cond_1e
    :goto_13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 373
    .line 374
    return-object p0
.end method

.method private final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/zy5;

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    check-cast v1, La/yje;

    .line 8
    .line 9
    move-object/from16 v1, p0

    .line 10
    .line 11
    iget-object v1, v1, La/xo;->a:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v4, v1

    .line 14
    check-cast v4, La/eh70;

    .line 15
    .line 16
    iget-object v1, v4, La/eh70;->u:La/y5s;

    .line 17
    .line 18
    iget-object v2, v4, La/eh70;->o:La/lg60;

    .line 19
    .line 20
    iget-object v10, v4, La/eh70;->l:La/mne;

    .line 21
    .line 22
    iget-object v3, v4, La/eh70;->z:La/p7m0;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    instance-of v5, v0, La/sy5;

    .line 28
    .line 29
    const-wide/16 v11, 0x0

    .line 30
    .line 31
    const/4 v13, 0x0

    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 35
    .line 36
    .line 37
    move-result-object v14

    .line 38
    new-instance v15, La/cf70;

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    const/16 v9, 0x10

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    const-class v5, La/eh70;

    .line 45
    .line 46
    const-string v6, "handleGameError"

    .line 47
    .line 48
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 49
    .line 50
    move-object v2, v15

    .line 51
    invoke-direct/range {v2 .. v9}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v10, La/mne;->b:La/dvj;

    .line 55
    .line 56
    new-instance v1, La/e3p;

    .line 57
    .line 58
    const/16 v2, 0x18

    .line 59
    .line 60
    invoke-direct {v1, v4, v13, v2}, La/e3p;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 61
    .line 62
    .line 63
    const/16 v19, 0xa

    .line 64
    .line 65
    const/16 v16, 0x0

    .line 66
    .line 67
    move-object/from16 v17, v0

    .line 68
    .line 69
    move-object/from16 v18, v1

    .line 70
    .line 71
    invoke-static/range {v14 .. v19}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x5

    .line 75
    invoke-static {v4, v11, v12, v0}, La/eh70;->D(La/eh70;JI)V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_3

    .line 79
    .line 80
    :cond_0
    instance-of v5, v0, La/fle;

    .line 81
    .line 82
    if-eqz v5, :cond_1

    .line 83
    .line 84
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, La/tg70;

    .line 89
    .line 90
    iget-wide v0, v0, La/tg70;->e:D

    .line 91
    .line 92
    invoke-virtual {v2, v0, v1}, La/lg60;->a(D)V

    .line 93
    .line 94
    .line 95
    sget-object v0, La/fy5;->a:La/fy5;

    .line 96
    .line 97
    invoke-virtual {v4, v0}, La/eh70;->w(La/zy5;)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_3

    .line 101
    .line 102
    :cond_1
    instance-of v5, v0, La/rle;

    .line 103
    .line 104
    if-eqz v5, :cond_2

    .line 105
    .line 106
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, La/tg70;

    .line 111
    .line 112
    iget-wide v0, v0, La/tg70;->e:D

    .line 113
    .line 114
    invoke-virtual {v2, v0, v1}, La/lg60;->a(D)V

    .line 115
    .line 116
    .line 117
    sget-object v0, La/qy5;->a:La/qy5;

    .line 118
    .line 119
    invoke-virtual {v4, v0}, La/eh70;->w(La/zy5;)V

    .line 120
    .line 121
    .line 122
    goto/16 :goto_3

    .line 123
    .line 124
    :cond_2
    instance-of v2, v0, La/nle;

    .line 125
    .line 126
    if-eqz v2, :cond_3

    .line 127
    .line 128
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 129
    .line 130
    .line 131
    move-result-object v14

    .line 132
    new-instance v15, La/cf70;

    .line 133
    .line 134
    const/4 v8, 0x0

    .line 135
    const/16 v9, 0x11

    .line 136
    .line 137
    const/4 v3, 0x1

    .line 138
    const-class v5, La/eh70;

    .line 139
    .line 140
    const-string v6, "handleGameError"

    .line 141
    .line 142
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 143
    .line 144
    move-object v2, v15

    .line 145
    invoke-direct/range {v2 .. v9}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 146
    .line 147
    .line 148
    iget-object v0, v10, La/mne;->b:La/dvj;

    .line 149
    .line 150
    new-instance v1, La/c670;

    .line 151
    .line 152
    const/4 v2, 0x2

    .line 153
    invoke-direct {v1, v4, v13, v2}, La/c670;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 154
    .line 155
    .line 156
    const/16 v19, 0xa

    .line 157
    .line 158
    const/16 v16, 0x0

    .line 159
    .line 160
    move-object/from16 v17, v0

    .line 161
    .line 162
    move-object/from16 v18, v1

    .line 163
    .line 164
    invoke-static/range {v14 .. v19}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 165
    .line 166
    .line 167
    goto/16 :goto_3

    .line 168
    .line 169
    :cond_3
    instance-of v2, v0, La/hle;

    .line 170
    .line 171
    const/4 v5, 0x0

    .line 172
    const/4 v6, 0x1

    .line 173
    if-eqz v2, :cond_4

    .line 174
    .line 175
    check-cast v0, La/hle;

    .line 176
    .line 177
    iget-object v0, v0, La/hle;->a:La/ql5;

    .line 178
    .line 179
    iget-wide v0, v0, La/ql5;->a:J

    .line 180
    .line 181
    invoke-virtual {v4, v0, v1, v6, v5}, La/eh70;->C(JZZ)V

    .line 182
    .line 183
    .line 184
    goto/16 :goto_3

    .line 185
    .line 186
    :cond_4
    instance-of v2, v0, La/oy5;

    .line 187
    .line 188
    if-eqz v2, :cond_5

    .line 189
    .line 190
    check-cast v0, La/oy5;

    .line 191
    .line 192
    iget-wide v0, v0, La/oy5;->a:J

    .line 193
    .line 194
    const/4 v2, 0x6

    .line 195
    invoke-static {v4, v0, v1, v2}, La/eh70;->D(La/eh70;JI)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_3

    .line 199
    .line 200
    :cond_5
    instance-of v2, v0, La/ry5;

    .line 201
    .line 202
    if-eqz v2, :cond_8

    .line 203
    .line 204
    iget-boolean v0, v4, La/eh70;->w:Z

    .line 205
    .line 206
    if-eqz v0, :cond_6

    .line 207
    .line 208
    goto/16 :goto_3

    .line 209
    .line 210
    :cond_6
    iget-object v0, v4, La/eh70;->k:La/r8u;

    .line 211
    .line 212
    invoke-virtual {v0}, La/r8u;->a()Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-nez v0, :cond_7

    .line 217
    .line 218
    const/4 v0, 0x7

    .line 219
    invoke-static {v4, v11, v12, v0}, La/eh70;->D(La/eh70;JI)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_3

    .line 223
    .line 224
    :cond_7
    invoke-virtual {v4}, La/eh70;->E()V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_3

    .line 228
    .line 229
    :cond_8
    instance-of v2, v0, La/ty5;

    .line 230
    .line 231
    if-eqz v2, :cond_9

    .line 232
    .line 233
    invoke-virtual {v4}, La/eh70;->E()V

    .line 234
    .line 235
    .line 236
    goto/16 :goto_3

    .line 237
    .line 238
    :cond_9
    instance-of v2, v0, La/ly5;

    .line 239
    .line 240
    if-eqz v2, :cond_d

    .line 241
    .line 242
    check-cast v0, La/ly5;

    .line 243
    .line 244
    iget-object v2, v0, La/ly5;->f:La/esr;

    .line 245
    .line 246
    invoke-virtual {v2}, La/esr;->a()Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-eqz v2, :cond_a

    .line 251
    .line 252
    iget-boolean v1, v1, La/y5s;->d:Z

    .line 253
    .line 254
    if-eqz v1, :cond_a

    .line 255
    .line 256
    iget-object v1, v4, La/eh70;->e:La/l1u;

    .line 257
    .line 258
    invoke-virtual {v1}, La/l1u;->a()D

    .line 259
    .line 260
    .line 261
    move-result-wide v1

    .line 262
    iput-wide v1, v4, La/eh70;->y:D

    .line 263
    .line 264
    :cond_a
    iget-wide v7, v0, La/ly5;->d:D

    .line 265
    .line 266
    iget-object v0, v4, La/eh70;->f:La/k1u;

    .line 267
    .line 268
    invoke-virtual {v0}, La/k1u;->a()D

    .line 269
    .line 270
    .line 271
    move-result-wide v9

    .line 272
    :cond_b
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    move-object v11, v0

    .line 277
    check-cast v11, La/tg70;

    .line 278
    .line 279
    iget-wide v1, v11, La/tg70;->e:D

    .line 280
    .line 281
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(DD)D

    .line 282
    .line 283
    .line 284
    move-result-wide v12

    .line 285
    cmpl-double v1, v1, v12

    .line 286
    .line 287
    if-ltz v1, :cond_c

    .line 288
    .line 289
    move/from16 v20, v6

    .line 290
    .line 291
    goto :goto_0

    .line 292
    :cond_c
    move/from16 v20, v5

    .line 293
    .line 294
    :goto_0
    const/16 v25, 0x0

    .line 295
    .line 296
    const/16 v26, 0x1f3f

    .line 297
    .line 298
    const-wide/16 v12, 0x0

    .line 299
    .line 300
    const-wide/16 v14, 0x0

    .line 301
    .line 302
    const/16 v16, 0x0

    .line 303
    .line 304
    const-wide/16 v17, 0x0

    .line 305
    .line 306
    const/16 v19, 0x0

    .line 307
    .line 308
    const/16 v22, 0x0

    .line 309
    .line 310
    const/16 v23, 0x0

    .line 311
    .line 312
    const/16 v24, 0x0

    .line 313
    .line 314
    move/from16 v21, v20

    .line 315
    .line 316
    invoke-static/range {v11 .. v26}, La/tg70;->a(La/tg70;DDLjava/lang/String;DZZZZZZZI)La/tg70;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-virtual {v3, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_b

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :cond_d
    instance-of v0, v0, La/mle;

    .line 328
    .line 329
    if-eqz v0, :cond_11

    .line 330
    .line 331
    :cond_e
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    move-object v7, v0

    .line 336
    check-cast v7, La/tg70;

    .line 337
    .line 338
    iget-object v2, v4, La/eh70;->p:La/vcu;

    .line 339
    .line 340
    invoke-virtual {v2}, La/vcu;->a()La/vrs;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    sget-object v8, La/vrs;->a:La/vrs;

    .line 345
    .line 346
    if-eq v2, v8, :cond_10

    .line 347
    .line 348
    iget-boolean v2, v1, La/y5s;->e:Z

    .line 349
    .line 350
    if-eqz v2, :cond_f

    .line 351
    .line 352
    goto :goto_1

    .line 353
    :cond_f
    move/from16 v21, v5

    .line 354
    .line 355
    goto :goto_2

    .line 356
    :cond_10
    :goto_1
    move/from16 v21, v6

    .line 357
    .line 358
    :goto_2
    const/16 v22, 0x7ff

    .line 359
    .line 360
    const-wide/16 v8, 0x0

    .line 361
    .line 362
    const-wide/16 v10, 0x0

    .line 363
    .line 364
    const/4 v12, 0x0

    .line 365
    const-wide/16 v13, 0x0

    .line 366
    .line 367
    const/4 v15, 0x0

    .line 368
    const/16 v16, 0x0

    .line 369
    .line 370
    const/16 v17, 0x0

    .line 371
    .line 372
    const/16 v18, 0x0

    .line 373
    .line 374
    const/16 v19, 0x0

    .line 375
    .line 376
    const/16 v20, 0x0

    .line 377
    .line 378
    invoke-static/range {v7 .. v22}, La/tg70;->a(La/tg70;DDLjava/lang/String;DZZZZZZZI)La/tg70;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    invoke-virtual {v3, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    if-eqz v0, :cond_e

    .line 387
    .line 388
    :cond_11
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    return-object v0
.end method

.method private final i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, La/zy5;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    iget-object p0, p0, La/xo;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/gh70;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    instance-of p2, p1, La/hy5;

    .line 16
    .line 17
    const/16 v0, 0x13

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    new-instance p2, La/fh70;

    .line 24
    .line 25
    check-cast p1, La/hy5;

    .line 26
    .line 27
    iget-boolean p1, p1, La/hy5;->a:Z

    .line 28
    .line 29
    invoke-direct {p2, p1}, La/fh70;-><init>(Z)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v3, La/ku60;

    .line 37
    .line 38
    invoke-direct {v3, p0, p2, v2, v0}, La/ku60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v2, v2, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    instance-of p2, p1, La/zle;

    .line 46
    .line 47
    if-eqz p2, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    instance-of p2, p1, La/yle;

    .line 51
    .line 52
    if-eqz p2, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    instance-of p2, p1, La/tle;

    .line 56
    .line 57
    if-eqz p2, :cond_4

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    instance-of p1, p1, La/xle;

    .line 61
    .line 62
    if-eqz p1, :cond_5

    .line 63
    .line 64
    :goto_0
    new-instance p1, La/fh70;

    .line 65
    .line 66
    const/4 p2, 0x0

    .line 67
    invoke-direct {p1, p2}, La/fh70;-><init>(Z)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    new-instance v3, La/ku60;

    .line 75
    .line 76
    invoke-direct {v3, p0, p1, v2, v0}, La/ku60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {p2, v2, v2, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 80
    .line 81
    .line 82
    :cond_5
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vf20;->h:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const-string v3, "actionDialogManager"

    .line 8
    .line 9
    const/4 v6, 0x3

    .line 10
    const/4 v7, 0x0

    .line 11
    const/16 v8, 0x8

    .line 12
    .line 13
    const/4 v10, 0x1

    .line 14
    const/4 v11, 0x0

    .line 15
    const/4 v12, 0x0

    .line 16
    iget-object v13, v0, La/xo;->a:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v0, p1

    .line 22
    .line 23
    check-cast v0, La/zy5;

    .line 24
    .line 25
    move-object/from16 v1, p2

    .line 26
    .line 27
    check-cast v1, La/yje;

    .line 28
    .line 29
    check-cast v13, La/ai70;

    .line 30
    .line 31
    iget-object v1, v13, La/ai70;->f:La/ztt;

    .line 32
    .line 33
    iget-object v2, v13, La/ai70;->c:La/vcu;

    .line 34
    .line 35
    iget-object v3, v13, La/ai70;->b:La/oqt;

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    goto/16 :goto_c

    .line 40
    .line 41
    :cond_0
    instance-of v4, v0, La/ry5;

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    sget-object v0, La/uh70;->a:La/uh70;

    .line 46
    .line 47
    invoke-virtual {v13, v0}, La/ai70;->w(La/zh70;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_c

    .line 51
    .line 52
    :cond_1
    instance-of v4, v0, La/ole;

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    new-instance v1, La/xh70;

    .line 57
    .line 58
    check-cast v0, La/ole;

    .line 59
    .line 60
    iget-boolean v0, v0, La/ole;->a:Z

    .line 61
    .line 62
    invoke-direct {v1, v0}, La/xh70;-><init>(Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v13, v1}, La/ai70;->w(La/zh70;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_c

    .line 69
    .line 70
    :cond_2
    instance-of v4, v0, La/gle;

    .line 71
    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    sget-object v0, La/wh70;->a:La/wh70;

    .line 75
    .line 76
    invoke-virtual {v13, v0}, La/ai70;->w(La/zh70;)V

    .line 77
    .line 78
    .line 79
    goto/16 :goto_c

    .line 80
    .line 81
    :cond_3
    instance-of v4, v0, La/yy5;

    .line 82
    .line 83
    if-eqz v4, :cond_4

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    instance-of v4, v0, La/uy5;

    .line 87
    .line 88
    if-eqz v4, :cond_9

    .line 89
    .line 90
    :goto_0
    iget-object v0, v13, La/ai70;->h:La/fpi0;

    .line 91
    .line 92
    invoke-virtual {v0, v10}, La/fpi0;->a(Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, La/oqt;->a()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-virtual {v2}, La/vcu;->a()La/vrs;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    sget-object v3, La/vrs;->b:La/vrs;

    .line 104
    .line 105
    if-ne v2, v3, :cond_5

    .line 106
    .line 107
    move v2, v10

    .line 108
    goto :goto_1

    .line 109
    :cond_5
    move v2, v11

    .line 110
    :goto_1
    if-nez v0, :cond_7

    .line 111
    .line 112
    iget-boolean v0, v13, La/ai70;->j:Z

    .line 113
    .line 114
    if-eqz v0, :cond_6

    .line 115
    .line 116
    if-eqz v2, :cond_6

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_6
    move v0, v11

    .line 120
    goto :goto_3

    .line 121
    :cond_7
    :goto_2
    move v0, v10

    .line 122
    :goto_3
    invoke-virtual {v1}, La/ztt;->a()La/csr;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iget-object v1, v1, La/csr;->a:La/bsr;

    .line 127
    .line 128
    iget-object v1, v1, La/bsr;->a:La/esr;

    .line 129
    .line 130
    sget-object v2, La/esr;->f:La/esr;

    .line 131
    .line 132
    if-ne v1, v2, :cond_8

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_8
    move v10, v11

    .line 136
    :goto_4
    new-instance v1, La/th70;

    .line 137
    .line 138
    invoke-direct {v1, v0, v10}, La/th70;-><init>(ZZ)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v13, v1}, La/ai70;->w(La/zh70;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_c

    .line 145
    .line 146
    :cond_9
    instance-of v4, v0, La/jy5;

    .line 147
    .line 148
    if-eqz v4, :cond_d

    .line 149
    .line 150
    invoke-virtual {v2}, La/vcu;->a()La/vrs;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    sget-object v2, La/vrs;->b:La/vrs;

    .line 155
    .line 156
    if-ne v0, v2, :cond_16

    .line 157
    .line 158
    invoke-virtual {v3}, La/oqt;->a()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-nez v0, :cond_b

    .line 163
    .line 164
    iget-boolean v0, v13, La/ai70;->j:Z

    .line 165
    .line 166
    if-eqz v0, :cond_a

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_a
    move v0, v11

    .line 170
    goto :goto_6

    .line 171
    :cond_b
    :goto_5
    move v0, v10

    .line 172
    :goto_6
    invoke-virtual {v1}, La/ztt;->a()La/csr;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iget-object v1, v1, La/csr;->a:La/bsr;

    .line 177
    .line 178
    iget-object v1, v1, La/bsr;->a:La/esr;

    .line 179
    .line 180
    sget-object v2, La/esr;->f:La/esr;

    .line 181
    .line 182
    if-ne v1, v2, :cond_c

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_c
    move v10, v11

    .line 186
    :goto_7
    new-instance v1, La/th70;

    .line 187
    .line 188
    invoke-direct {v1, v0, v10}, La/th70;-><init>(ZZ)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v13, v1}, La/ai70;->w(La/zh70;)V

    .line 192
    .line 193
    .line 194
    goto/16 :goto_c

    .line 195
    .line 196
    :cond_d
    instance-of v1, v0, La/iy5;

    .line 197
    .line 198
    if-eqz v1, :cond_13

    .line 199
    .line 200
    check-cast v0, La/iy5;

    .line 201
    .line 202
    iget-object v0, v0, La/iy5;->a:La/csr;

    .line 203
    .line 204
    iget-object v0, v0, La/csr;->a:La/bsr;

    .line 205
    .line 206
    iget-object v0, v0, La/bsr;->a:La/esr;

    .line 207
    .line 208
    sget-object v1, La/esr;->f:La/esr;

    .line 209
    .line 210
    if-ne v0, v1, :cond_e

    .line 211
    .line 212
    move v0, v10

    .line 213
    goto :goto_8

    .line 214
    :cond_e
    move v0, v11

    .line 215
    :goto_8
    iget-object v1, v13, La/ai70;->g:La/spx;

    .line 216
    .line 217
    invoke-virtual {v1}, La/spx;->a()Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    iget-object v4, v13, La/ai70;->e:La/pyb;

    .line 222
    .line 223
    invoke-virtual {v4}, La/pyb;->a()Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    invoke-virtual {v3}, La/oqt;->a()Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-nez v1, :cond_f

    .line 232
    .line 233
    invoke-virtual {v2}, La/vcu;->a()La/vrs;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    sget-object v5, La/vrs;->a:La/vrs;

    .line 238
    .line 239
    if-ne v2, v5, :cond_f

    .line 240
    .line 241
    move v2, v10

    .line 242
    goto :goto_9

    .line 243
    :cond_f
    move v2, v11

    .line 244
    :goto_9
    if-nez v0, :cond_11

    .line 245
    .line 246
    if-nez v2, :cond_10

    .line 247
    .line 248
    if-eqz v4, :cond_11

    .line 249
    .line 250
    if-eqz v1, :cond_11

    .line 251
    .line 252
    if-eqz v3, :cond_11

    .line 253
    .line 254
    :cond_10
    move v1, v10

    .line 255
    goto :goto_a

    .line 256
    :cond_11
    move v1, v11

    .line 257
    :goto_a
    if-nez v0, :cond_12

    .line 258
    .line 259
    if-eqz v2, :cond_12

    .line 260
    .line 261
    goto :goto_b

    .line 262
    :cond_12
    move v10, v11

    .line 263
    :goto_b
    new-instance v0, La/yh70;

    .line 264
    .line 265
    invoke-direct {v0, v1}, La/yh70;-><init>(Z)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v13, v0}, La/ai70;->w(La/zh70;)V

    .line 269
    .line 270
    .line 271
    new-instance v0, La/vh70;

    .line 272
    .line 273
    invoke-direct {v0, v10}, La/vh70;-><init>(Z)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v13, v0}, La/ai70;->w(La/zh70;)V

    .line 277
    .line 278
    .line 279
    goto :goto_c

    .line 280
    :cond_13
    instance-of v1, v0, La/ple;

    .line 281
    .line 282
    if-eqz v1, :cond_14

    .line 283
    .line 284
    invoke-virtual {v2}, La/vcu;->a()La/vrs;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    sget-object v1, La/vrs;->c:La/vrs;

    .line 289
    .line 290
    if-ne v0, v1, :cond_16

    .line 291
    .line 292
    new-instance v0, La/vh70;

    .line 293
    .line 294
    invoke-direct {v0, v11}, La/vh70;-><init>(Z)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v13, v0}, La/ai70;->w(La/zh70;)V

    .line 298
    .line 299
    .line 300
    new-instance v0, La/yh70;

    .line 301
    .line 302
    invoke-direct {v0, v11}, La/yh70;-><init>(Z)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v13, v0}, La/ai70;->w(La/zh70;)V

    .line 306
    .line 307
    .line 308
    goto :goto_c

    .line 309
    :cond_14
    instance-of v1, v0, La/ly5;

    .line 310
    .line 311
    if-eqz v1, :cond_15

    .line 312
    .line 313
    new-instance v0, La/sh70;

    .line 314
    .line 315
    invoke-virtual {v3}, La/oqt;->a()Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    invoke-direct {v0, v1}, La/sh70;-><init>(Z)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v13, v0}, La/ai70;->w(La/zh70;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v3}, La/oqt;->a()Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-nez v0, :cond_16

    .line 330
    .line 331
    iput-boolean v11, v13, La/ai70;->j:Z

    .line 332
    .line 333
    goto :goto_c

    .line 334
    :cond_15
    instance-of v0, v0, La/my5;

    .line 335
    .line 336
    if-eqz v0, :cond_16

    .line 337
    .line 338
    invoke-virtual {v3}, La/oqt;->a()Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-eqz v0, :cond_16

    .line 343
    .line 344
    iput-boolean v10, v13, La/ai70;->j:Z

    .line 345
    .line 346
    :cond_16
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 347
    .line 348
    return-object v0

    .line 349
    :pswitch_0
    invoke-direct/range {p0 .. p2}, La/vf20;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    return-object v0

    .line 354
    :pswitch_1
    invoke-direct/range {p0 .. p2}, La/vf20;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    return-object v0

    .line 359
    :pswitch_2
    invoke-direct/range {p0 .. p2}, La/vf20;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    return-object v0

    .line 364
    :pswitch_3
    move-object/from16 v0, p1

    .line 365
    .line 366
    check-cast v0, La/zy5;

    .line 367
    .line 368
    move-object/from16 v1, p2

    .line 369
    .line 370
    check-cast v1, La/yje;

    .line 371
    .line 372
    check-cast v13, La/uf70;

    .line 373
    .line 374
    invoke-virtual {v13, v0}, La/uf70;->w(La/zy5;)V

    .line 375
    .line 376
    .line 377
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 378
    .line 379
    return-object v0

    .line 380
    :pswitch_4
    invoke-direct/range {p0 .. p2}, La/vf20;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    return-object v0

    .line 385
    :pswitch_5
    invoke-direct/range {p0 .. p2}, La/vf20;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    return-object v0

    .line 390
    :pswitch_6
    move-object/from16 v0, p1

    .line 391
    .line 392
    check-cast v0, La/hz60;

    .line 393
    .line 394
    move-object/from16 v1, p2

    .line 395
    .line 396
    check-cast v1, La/yje;

    .line 397
    .line 398
    check-cast v13, La/ez60;

    .line 399
    .line 400
    sget-object v1, La/ez60;->S1:[La/iiy;

    .line 401
    .line 402
    invoke-virtual {v13}, La/ez60;->G0()La/j0r;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    iget-object v1, v1, La/j0r;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 407
    .line 408
    iget-boolean v2, v0, La/hz60;->b:Z

    .line 409
    .line 410
    if-eqz v2, :cond_17

    .line 411
    .line 412
    move v8, v11

    .line 413
    :cond_17
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v13}, La/ez60;->G0()La/j0r;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    iget-object v1, v1, La/j0r;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 421
    .line 422
    iget-object v2, v0, La/hz60;->a:La/lao0;

    .line 423
    .line 424
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->setTabBarDSModel(La/lao0;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v13}, La/ez60;->G0()La/j0r;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    iget-object v1, v1, La/j0r;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 432
    .line 433
    new-instance v2, La/cy60;

    .line 434
    .line 435
    invoke-virtual {v13}, La/ez60;->H0()La/g670;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    const/4 v8, 0x0

    .line 440
    const/4 v9, 0x4

    .line 441
    const/4 v3, 0x1

    .line 442
    const-class v5, La/g670;

    .line 443
    .line 444
    const-string v6, "onNavigationItemClick"

    .line 445
    .line 446
    const-string v7, "onNavigationItemClick$games_list(Ljava/lang/String;)V"

    .line 447
    .line 448
    invoke-direct/range {v2 .. v9}, La/cy60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->setOnTabClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v13}, La/ez60;->G0()La/j0r;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    iget-object v1, v1, La/j0r;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 459
    .line 460
    iget-object v2, v0, La/hz60;->c:Ljava/lang/String;

    .line 461
    .line 462
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->setSelectedTab(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    iget-boolean v0, v0, La/hz60;->b:Z

    .line 466
    .line 467
    if-nez v0, :cond_18

    .line 468
    .line 469
    iget-object v0, v13, La/ez60;->R1:La/aa50;

    .line 470
    .line 471
    if-eqz v0, :cond_18

    .line 472
    .line 473
    invoke-virtual {v0, v12}, La/aa50;->a(Ljava/lang/Float;)V

    .line 474
    .line 475
    .line 476
    :cond_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 477
    .line 478
    return-object v0

    .line 479
    :pswitch_7
    move-object/from16 v0, p1

    .line 480
    .line 481
    check-cast v0, La/b370;

    .line 482
    .line 483
    move-object/from16 v1, p2

    .line 484
    .line 485
    check-cast v1, La/yje;

    .line 486
    .line 487
    check-cast v13, La/cu60;

    .line 488
    .line 489
    sget-object v1, La/cu60;->U1:La/evz;

    .line 490
    .line 491
    invoke-virtual {v13}, La/cu60;->H0()La/h2b;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    iget-object v2, v0, La/b370;->a:La/pat;

    .line 496
    .line 497
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    instance-of v3, v2, La/oat;

    .line 501
    .line 502
    if-eqz v3, :cond_19

    .line 503
    .line 504
    invoke-virtual {v1}, La/h2b;->B()V

    .line 505
    .line 506
    .line 507
    :cond_19
    iget-object v1, v1, La/h2b;->S:La/p7m0;

    .line 508
    .line 509
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v1, v12, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    invoke-virtual {v13}, La/cu60;->H0()La/h2b;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    iget-object v0, v0, La/b370;->b:La/pat;

    .line 520
    .line 521
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    iget-object v1, v1, La/h2b;->T:La/p7m0;

    .line 525
    .line 526
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v1, v12, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 533
    .line 534
    return-object v0

    .line 535
    :pswitch_8
    move-object/from16 v0, p1

    .line 536
    .line 537
    check-cast v0, La/r1b;

    .line 538
    .line 539
    move-object/from16 v1, p2

    .line 540
    .line 541
    check-cast v1, La/yje;

    .line 542
    .line 543
    check-cast v13, La/cu60;

    .line 544
    .line 545
    sget-object v1, La/cu60;->U1:La/evz;

    .line 546
    .line 547
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    iget-object v2, v0, La/r1b;->a:La/ra10;

    .line 555
    .line 556
    if-eqz v2, :cond_1a

    .line 557
    .line 558
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    iget-object v0, v0, La/aza;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 563
    .line 564
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    iget-object v0, v0, La/aza;->p:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;

    .line 572
    .line 573
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    iget-object v0, v0, La/aza;->d:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackCardView;

    .line 581
    .line 582
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    iget-object v0, v0, La/aza;->l:Landroidx/core/widget/NestedScrollView;

    .line 590
    .line 591
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    iget-object v0, v0, La/aza;->o:Landroid/widget/LinearLayout;

    .line 599
    .line 600
    invoke-static {v0, v1}, La/sj3;->N0(Landroid/view/View;Ljava/lang/Float;)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    iget-object v0, v0, La/aza;->j:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 608
    .line 609
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/lottie/LottieView;->w(La/ra10;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v0, v11}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    iget-object v0, v0, La/aza;->f:Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 620
    .line 621
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 622
    .line 623
    .line 624
    goto :goto_d

    .line 625
    :cond_1a
    iget-object v0, v0, La/r1b;->b:La/jkm;

    .line 626
    .line 627
    if-eqz v0, :cond_1b

    .line 628
    .line 629
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    iget-object v2, v2, La/aza;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 634
    .line 635
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    iget-object v2, v2, La/aza;->p:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;

    .line 643
    .line 644
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    iget-object v2, v2, La/aza;->d:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackCardView;

    .line 652
    .line 653
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    iget-object v2, v2, La/aza;->l:Landroidx/core/widget/NestedScrollView;

    .line 661
    .line 662
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    iget-object v2, v2, La/aza;->o:Landroid/widget/LinearLayout;

    .line 670
    .line 671
    invoke-static {v2, v1}, La/sj3;->N0(Landroid/view/View;Ljava/lang/Float;)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    iget-object v1, v1, La/aza;->f:Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 679
    .line 680
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->d(La/jkm;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    iget-object v0, v0, La/aza;->j:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 691
    .line 692
    invoke-virtual {v0, v8}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 693
    .line 694
    .line 695
    goto :goto_d

    .line 696
    :cond_1b
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    iget-object v0, v0, La/aza;->f:Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 701
    .line 702
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    iget-object v0, v0, La/aza;->j:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 710
    .line 711
    invoke-virtual {v0, v8}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 712
    .line 713
    .line 714
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 715
    .line 716
    return-object v0

    .line 717
    :pswitch_9
    move-object/from16 v0, p1

    .line 718
    .line 719
    check-cast v0, La/n1b;

    .line 720
    .line 721
    move-object/from16 v1, p2

    .line 722
    .line 723
    check-cast v1, La/yje;

    .line 724
    .line 725
    check-cast v13, La/cu60;

    .line 726
    .line 727
    sget-object v1, La/cu60;->U1:La/evz;

    .line 728
    .line 729
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    iget-object v1, v1, La/aza;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 734
    .line 735
    iget-object v2, v0, La/n1b;->a:Ljava/lang/String;

    .line 736
    .line 737
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setAccountTitle(Ljava/lang/CharSequence;)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 741
    .line 742
    .line 743
    move-result-object v1

    .line 744
    iget-object v1, v1, La/aza;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 745
    .line 746
    iget-object v2, v0, La/n1b;->b:Ljava/lang/String;

    .line 747
    .line 748
    iget-object v0, v0, La/n1b;->c:Ljava/lang/String;

    .line 749
    .line 750
    invoke-virtual {v1, v2, v0}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->x(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 751
    .line 752
    .line 753
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 754
    .line 755
    return-object v0

    .line 756
    :pswitch_a
    move-object/from16 v0, p1

    .line 757
    .line 758
    check-cast v0, Ljava/lang/Boolean;

    .line 759
    .line 760
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 761
    .line 762
    .line 763
    move-result v0

    .line 764
    move-object/from16 v1, p2

    .line 765
    .line 766
    check-cast v1, La/yje;

    .line 767
    .line 768
    check-cast v13, La/cu60;

    .line 769
    .line 770
    sget-object v1, La/cu60;->U1:La/evz;

    .line 771
    .line 772
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    iget-object v1, v1, La/aza;->h:Landroid/widget/FrameLayout;

    .line 777
    .line 778
    if-eqz v0, :cond_1c

    .line 779
    .line 780
    goto :goto_e

    .line 781
    :cond_1c
    move v11, v8

    .line 782
    :goto_e
    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    .line 783
    .line 784
    .line 785
    if-eqz v0, :cond_1d

    .line 786
    .line 787
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    iget-object v0, v0, La/aza;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 792
    .line 793
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    iget-object v0, v0, La/aza;->p:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;

    .line 801
    .line 802
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    iget-object v0, v0, La/aza;->d:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackCardView;

    .line 810
    .line 811
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 812
    .line 813
    .line 814
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    iget-object v0, v0, La/aza;->l:Landroidx/core/widget/NestedScrollView;

    .line 819
    .line 820
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 821
    .line 822
    .line 823
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    iget-object v0, v0, La/aza;->o:Landroid/widget/LinearLayout;

    .line 828
    .line 829
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    invoke-static {v0, v1}, La/sj3;->N0(Landroid/view/View;Ljava/lang/Float;)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    iget-object v0, v0, La/aza;->f:Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 841
    .line 842
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    iget-object v0, v0, La/aza;->j:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 850
    .line 851
    invoke-virtual {v0, v8}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 852
    .line 853
    .line 854
    :cond_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 855
    .line 856
    return-object v0

    .line 857
    :pswitch_b
    move-object/from16 v0, p1

    .line 858
    .line 859
    check-cast v0, La/vfu0;

    .line 860
    .line 861
    move-object/from16 v1, p2

    .line 862
    .line 863
    check-cast v1, La/yje;

    .line 864
    .line 865
    check-cast v13, La/cu60;

    .line 866
    .line 867
    sget-object v1, La/cu60;->U1:La/evz;

    .line 868
    .line 869
    instance-of v1, v0, La/vfu0;

    .line 870
    .line 871
    if-eqz v1, :cond_20

    .line 872
    .line 873
    iget-boolean v0, v0, La/vfu0;->a:Z

    .line 874
    .line 875
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 876
    .line 877
    .line 878
    move-result-object v1

    .line 879
    iget-object v1, v1, La/aza;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 880
    .line 881
    if-eqz v0, :cond_1e

    .line 882
    .line 883
    move v8, v11

    .line 884
    :cond_1e
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 885
    .line 886
    .line 887
    if-eqz v0, :cond_1f

    .line 888
    .line 889
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    new-instance v1, La/zt60;

    .line 894
    .line 895
    invoke-direct {v1, v13}, La/zt60;-><init>(La/cu60;)V

    .line 896
    .line 897
    .line 898
    const-string v2, "SELECT_BALANCE_REQUEST_KEY"

    .line 899
    .line 900
    invoke-virtual {v0, v2, v13, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    iget-object v0, v0, La/aza;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 908
    .line 909
    new-instance v1, La/yt60;

    .line 910
    .line 911
    const/4 v2, 0x4

    .line 912
    invoke-direct {v1, v13, v2}, La/yt60;-><init>(La/cu60;B)V

    .line 913
    .line 914
    .line 915
    sget-object v2, La/ivb0;->b:La/ymx;

    .line 916
    .line 917
    invoke-virtual {v0, v2, v1}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->A(La/ymx;Lkotlin/jvm/functions/Function0;)V

    .line 918
    .line 919
    .line 920
    new-instance v1, La/yt60;

    .line 921
    .line 922
    const/4 v2, 0x5

    .line 923
    invoke-direct {v1, v13, v0, v2}, La/yt60;-><init>(La/cu60;Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;B)V

    .line 924
    .line 925
    .line 926
    invoke-static {v0, v1, v6}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->v(Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Lkotlin/jvm/functions/Function0;I)V

    .line 927
    .line 928
    .line 929
    new-instance v1, La/yt60;

    .line 930
    .line 931
    const/4 v2, 0x6

    .line 932
    invoke-direct {v1, v13, v0, v2}, La/yt60;-><init>(La/cu60;Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;B)V

    .line 933
    .line 934
    .line 935
    invoke-static {v0, v1}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->z(Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Lkotlin/jvm/functions/Function0;)V

    .line 936
    .line 937
    .line 938
    :cond_1f
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 939
    .line 940
    goto :goto_f

    .line 941
    :cond_20
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 942
    .line 943
    .line 944
    invoke-static {}, La/t9f;->b()V

    .line 945
    .line 946
    .line 947
    :goto_f
    return-object v12

    .line 948
    :pswitch_c
    move-object/from16 v0, p1

    .line 949
    .line 950
    check-cast v0, La/q1b;

    .line 951
    .line 952
    move-object/from16 v1, p2

    .line 953
    .line 954
    check-cast v1, La/yje;

    .line 955
    .line 956
    move-object v14, v13

    .line 957
    check-cast v14, La/cu60;

    .line 958
    .line 959
    sget-object v1, La/cu60;->U1:La/evz;

    .line 960
    .line 961
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 962
    .line 963
    .line 964
    iget-object v1, v0, La/q1b;->a:La/o1b;

    .line 965
    .line 966
    if-eqz v1, :cond_21

    .line 967
    .line 968
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 969
    .line 970
    .line 971
    move-result-object v2

    .line 972
    iget-object v15, v2, La/aza;->g:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 973
    .line 974
    iget-object v2, v1, La/o1b;->a:La/a570;

    .line 975
    .line 976
    iget-boolean v3, v1, La/o1b;->b:Z

    .line 977
    .line 978
    iget-boolean v6, v1, La/o1b;->c:Z

    .line 979
    .line 980
    iget-object v7, v1, La/o1b;->d:Ljava/lang/String;

    .line 981
    .line 982
    iget-object v12, v1, La/o1b;->e:La/hds;

    .line 983
    .line 984
    iget-boolean v1, v1, La/o1b;->f:Z

    .line 985
    .line 986
    move/from16 v21, v1

    .line 987
    .line 988
    move-object/from16 v16, v2

    .line 989
    .line 990
    move/from16 v17, v3

    .line 991
    .line 992
    move/from16 v18, v6

    .line 993
    .line 994
    move-object/from16 v19, v7

    .line 995
    .line 996
    move-object/from16 v20, v12

    .line 997
    .line 998
    invoke-virtual/range {v14 .. v21}, La/cu60;->I0(Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;La/a570;ZZLjava/lang/String;La/hds;Z)V

    .line 999
    .line 1000
    .line 1001
    goto :goto_10

    .line 1002
    :cond_21
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v1

    .line 1006
    iget-object v1, v1, La/aza;->g:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 1007
    .line 1008
    invoke-virtual {v1}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->a()V

    .line 1009
    .line 1010
    .line 1011
    :goto_10
    iget-object v1, v0, La/q1b;->b:La/o1b;

    .line 1012
    .line 1013
    if-eqz v1, :cond_22

    .line 1014
    .line 1015
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v2

    .line 1019
    iget-object v15, v2, La/aza;->m:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 1020
    .line 1021
    iget-object v2, v1, La/o1b;->a:La/a570;

    .line 1022
    .line 1023
    iget-boolean v3, v1, La/o1b;->b:Z

    .line 1024
    .line 1025
    iget-boolean v6, v1, La/o1b;->c:Z

    .line 1026
    .line 1027
    iget-object v7, v1, La/o1b;->d:Ljava/lang/String;

    .line 1028
    .line 1029
    iget-object v12, v1, La/o1b;->e:La/hds;

    .line 1030
    .line 1031
    iget-boolean v1, v1, La/o1b;->f:Z

    .line 1032
    .line 1033
    move/from16 v21, v1

    .line 1034
    .line 1035
    move-object/from16 v16, v2

    .line 1036
    .line 1037
    move/from16 v17, v3

    .line 1038
    .line 1039
    move/from16 v18, v6

    .line 1040
    .line 1041
    move-object/from16 v19, v7

    .line 1042
    .line 1043
    move-object/from16 v20, v12

    .line 1044
    .line 1045
    invoke-virtual/range {v14 .. v21}, La/cu60;->I0(Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;La/a570;ZZLjava/lang/String;La/hds;Z)V

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v1

    .line 1052
    iget-object v1, v1, La/aza;->p:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;

    .line 1053
    .line 1054
    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    .line 1055
    .line 1056
    .line 1057
    goto :goto_11

    .line 1058
    :cond_22
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v1

    .line 1062
    iget-object v1, v1, La/aza;->m:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 1063
    .line 1064
    invoke-virtual {v1}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->a()V

    .line 1065
    .line 1066
    .line 1067
    :goto_11
    iget-object v1, v0, La/q1b;->c:La/o1b;

    .line 1068
    .line 1069
    if-eqz v1, :cond_23

    .line 1070
    .line 1071
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v2

    .line 1075
    iget-object v15, v2, La/aza;->k:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 1076
    .line 1077
    iget-object v2, v1, La/o1b;->a:La/a570;

    .line 1078
    .line 1079
    iget-boolean v3, v1, La/o1b;->b:Z

    .line 1080
    .line 1081
    iget-boolean v6, v1, La/o1b;->c:Z

    .line 1082
    .line 1083
    iget-object v7, v1, La/o1b;->d:Ljava/lang/String;

    .line 1084
    .line 1085
    iget-object v12, v1, La/o1b;->e:La/hds;

    .line 1086
    .line 1087
    iget-boolean v1, v1, La/o1b;->f:Z

    .line 1088
    .line 1089
    move/from16 v21, v1

    .line 1090
    .line 1091
    move-object/from16 v16, v2

    .line 1092
    .line 1093
    move/from16 v17, v3

    .line 1094
    .line 1095
    move/from16 v18, v6

    .line 1096
    .line 1097
    move-object/from16 v19, v7

    .line 1098
    .line 1099
    move-object/from16 v20, v12

    .line 1100
    .line 1101
    invoke-virtual/range {v14 .. v21}, La/cu60;->I0(Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;La/a570;ZZLjava/lang/String;La/hds;Z)V

    .line 1102
    .line 1103
    .line 1104
    goto :goto_12

    .line 1105
    :cond_23
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v1

    .line 1109
    iget-object v1, v1, La/aza;->k:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 1110
    .line 1111
    invoke-virtual {v1}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->a()V

    .line 1112
    .line 1113
    .line 1114
    :goto_12
    iget-object v0, v0, La/q1b;->d:La/p1b;

    .line 1115
    .line 1116
    new-instance v15, La/p1b;

    .line 1117
    .line 1118
    new-instance v16, La/jza;

    .line 1119
    .line 1120
    sget-object v1, La/a570;->Companion:La/t470;

    .line 1121
    .line 1122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1123
    .line 1124
    .line 1125
    const-wide/16 v1, -0x1

    .line 1126
    .line 1127
    invoke-static {v11, v1, v2}, La/t470;->a(ZJ)La/a570;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v17

    .line 1131
    sget-object v18, La/iun;->a:La/iun;

    .line 1132
    .line 1133
    const-wide/16 v31, 0x0

    .line 1134
    .line 1135
    const-wide/16 v33, 0x0

    .line 1136
    .line 1137
    const-wide/16 v19, 0x0

    .line 1138
    .line 1139
    const-string v21, ""

    .line 1140
    .line 1141
    const-wide/16 v22, 0x0

    .line 1142
    .line 1143
    const-wide/16 v25, 0x0

    .line 1144
    .line 1145
    const-wide/16 v27, 0x0

    .line 1146
    .line 1147
    const-wide/16 v29, 0x0

    .line 1148
    .line 1149
    move-object/from16 v24, v18

    .line 1150
    .line 1151
    invoke-direct/range {v16 .. v34}, La/jza;-><init>(La/a570;Ljava/util/List;DLjava/lang/String;DLjava/util/List;DDDDJ)V

    .line 1152
    .line 1153
    .line 1154
    const-string v20, ""

    .line 1155
    .line 1156
    const/16 v21, 0x1

    .line 1157
    .line 1158
    const-string v17, ""

    .line 1159
    .line 1160
    const/16 v18, 0x0

    .line 1161
    .line 1162
    const-string v19, ""

    .line 1163
    .line 1164
    invoke-direct/range {v15 .. v21}, La/p1b;-><init>(La/jza;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V

    .line 1165
    .line 1166
    .line 1167
    invoke-static {v0, v15}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1168
    .line 1169
    .line 1170
    move-result v1

    .line 1171
    if-eqz v1, :cond_24

    .line 1172
    .line 1173
    goto/16 :goto_18

    .line 1174
    .line 1175
    :cond_24
    iget-object v1, v0, La/p1b;->a:La/jza;

    .line 1176
    .line 1177
    iget-wide v2, v1, La/jza;->h:D

    .line 1178
    .line 1179
    iget-boolean v6, v0, La/p1b;->c:Z

    .line 1180
    .line 1181
    iget-boolean v7, v0, La/p1b;->f:Z

    .line 1182
    .line 1183
    iget-wide v12, v1, La/jza;->i:D

    .line 1184
    .line 1185
    cmpg-double v15, v12, v2

    .line 1186
    .line 1187
    if-gtz v15, :cond_25

    .line 1188
    .line 1189
    move v15, v10

    .line 1190
    goto :goto_13

    .line 1191
    :cond_25
    move v15, v11

    .line 1192
    :goto_13
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v8

    .line 1196
    iget-object v8, v8, La/aza;->o:Landroid/widget/LinearLayout;

    .line 1197
    .line 1198
    const/high16 v17, 0x41800000    # 16.0f

    .line 1199
    .line 1200
    const-wide/16 v18, 0x3e8

    .line 1201
    .line 1202
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v4

    .line 1206
    invoke-static {v8, v4}, La/sj3;->N0(Landroid/view/View;Ljava/lang/Float;)V

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v4

    .line 1213
    iget-object v4, v4, La/aza;->l:Landroidx/core/widget/NestedScrollView;

    .line 1214
    .line 1215
    invoke-virtual {v4, v11}, Landroid/view/View;->setVisibility(I)V

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v4

    .line 1222
    iget-object v4, v4, La/aza;->d:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackCardView;

    .line 1223
    .line 1224
    invoke-virtual {v4, v11}, Landroid/view/View;->setVisibility(I)V

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v4

    .line 1231
    iget-object v4, v4, La/aza;->p:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;

    .line 1232
    .line 1233
    if-nez v7, :cond_26

    .line 1234
    .line 1235
    move v5, v11

    .line 1236
    goto :goto_14

    .line 1237
    :cond_26
    const/16 v5, 0x8

    .line 1238
    .line 1239
    :goto_14
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v4

    .line 1246
    iget-object v4, v4, La/aza;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1247
    .line 1248
    if-eqz v7, :cond_27

    .line 1249
    .line 1250
    move v8, v11

    .line 1251
    goto :goto_15

    .line 1252
    :cond_27
    const/16 v8, 0x8

    .line 1253
    .line 1254
    :goto_15
    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v4

    .line 1261
    iget-object v4, v4, La/aza;->p:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;

    .line 1262
    .line 1263
    iget-object v5, v4, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;->a:La/jk3;

    .line 1264
    .line 1265
    iget-object v7, v5, La/jk3;->e:Landroid/view/View;

    .line 1266
    .line 1267
    check-cast v7, Landroid/widget/TextView;

    .line 1268
    .line 1269
    iget-object v5, v5, La/jk3;->f:Landroid/view/View;

    .line 1270
    .line 1271
    check-cast v5, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;

    .line 1272
    .line 1273
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v8

    .line 1277
    iget-object v11, v1, La/jza;->d:Ljava/lang/String;

    .line 1278
    .line 1279
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v11

    .line 1283
    const v9, 0x7f1307e4

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {v8, v9, v11}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v8

    .line 1290
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1291
    .line 1292
    .line 1293
    iget-wide v7, v1, La/jza;->k:J

    .line 1294
    .line 1295
    const-wide/16 v21, 0x0

    .line 1296
    .line 1297
    cmp-long v9, v7, v21

    .line 1298
    .line 1299
    if-lez v9, :cond_28

    .line 1300
    .line 1301
    move v9, v10

    .line 1302
    goto :goto_16

    .line 1303
    :cond_28
    const/4 v9, 0x0

    .line 1304
    :goto_16
    const-wide/16 v21, 0x0

    .line 1305
    .line 1306
    cmpl-double v11, v2, v21

    .line 1307
    .line 1308
    if-lez v11, :cond_29

    .line 1309
    .line 1310
    move v11, v10

    .line 1311
    goto :goto_17

    .line 1312
    :cond_29
    const/4 v11, 0x0

    .line 1313
    :goto_17
    invoke-virtual {v4, v9, v11}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;->a(ZZ)V

    .line 1314
    .line 1315
    .line 1316
    if-eqz v9, :cond_2a

    .line 1317
    .line 1318
    sget-object v9, La/rdj;->a:La/rdj;

    .line 1319
    .line 1320
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1321
    .line 1322
    .line 1323
    move-result-wide v21

    .line 1324
    div-long v21, v21, v18

    .line 1325
    .line 1326
    add-long v21, v21, v7

    .line 1327
    .line 1328
    invoke-static/range {v21 .. v22}, La/rdj;->k(J)Ljava/util/Date;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v7

    .line 1332
    invoke-virtual {v5, v7, v10}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->v(Ljava/util/Date;Z)V

    .line 1333
    .line 1334
    .line 1335
    new-instance v7, La/rd7;

    .line 1336
    .line 1337
    const/4 v8, 0x2

    .line 1338
    invoke-direct {v7, v4, v11, v8}, La/rd7;-><init>(Ljava/lang/Object;ZB)V

    .line 1339
    .line 1340
    .line 1341
    invoke-static {v5, v7, v8}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->u(Lorg/xplatform/ui_core/viewcomponents/views/TimerView;La/rd7;I)V

    .line 1342
    .line 1343
    .line 1344
    :cond_2a
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v4

    .line 1348
    iget-object v4, v4, La/aza;->g:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 1349
    .line 1350
    iget-object v5, v0, La/p1b;->d:Ljava/lang/String;

    .line 1351
    .line 1352
    const/4 v7, 0x0

    .line 1353
    invoke-virtual {v4, v5, v15, v7, v6}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->b(Ljava/lang/String;ZZZ)V

    .line 1354
    .line 1355
    .line 1356
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v4

    .line 1360
    iget-object v4, v4, La/aza;->m:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 1361
    .line 1362
    iget-object v5, v0, La/p1b;->e:Ljava/lang/String;

    .line 1363
    .line 1364
    invoke-virtual {v4, v5, v15, v7, v6}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->b(Ljava/lang/String;ZZZ)V

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual {v14}, La/cu60;->G0()La/aza;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v4

    .line 1371
    iget-object v4, v4, La/aza;->d:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackCardView;

    .line 1372
    .line 1373
    iget-object v0, v0, La/p1b;->b:Ljava/lang/String;

    .line 1374
    .line 1375
    iget-wide v5, v1, La/jza;->c:D

    .line 1376
    .line 1377
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1378
    .line 1379
    .line 1380
    iget-object v1, v4, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackCardView;->a:La/dc3;

    .line 1381
    .line 1382
    iget-object v4, v1, La/dc3;->e:Ljava/lang/Object;

    .line 1383
    .line 1384
    check-cast v4, Landroid/widget/TextView;

    .line 1385
    .line 1386
    sget-object v7, La/pn40;->a:La/pn40;

    .line 1387
    .line 1388
    sget-object v7, La/p3u0;->c:La/p3u0;

    .line 1389
    .line 1390
    invoke-static {v12, v13, v0, v7}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v8

    .line 1394
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1395
    .line 1396
    .line 1397
    iget-object v4, v1, La/dc3;->d:Ljava/lang/Object;

    .line 1398
    .line 1399
    check-cast v4, Landroid/widget/TextView;

    .line 1400
    .line 1401
    cmpl-double v8, v2, v12

    .line 1402
    .line 1403
    if-lez v8, :cond_2b

    .line 1404
    .line 1405
    move-wide v2, v12

    .line 1406
    :cond_2b
    invoke-static {v2, v3, v0, v7}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v0

    .line 1410
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1411
    .line 1412
    .line 1413
    iget-object v0, v1, La/dc3;->c:Landroid/view/View;

    .line 1414
    .line 1415
    check-cast v0, Landroid/widget/ProgressBar;

    .line 1416
    .line 1417
    invoke-static {v5, v6}, La/si30;->a(D)I

    .line 1418
    .line 1419
    .line 1420
    move-result v1

    .line 1421
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1422
    .line 1423
    .line 1424
    :goto_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1425
    .line 1426
    return-object v0

    .line 1427
    :pswitch_d
    move-object/from16 v0, p1

    .line 1428
    .line 1429
    check-cast v0, La/y1b;

    .line 1430
    .line 1431
    move-object/from16 v1, p2

    .line 1432
    .line 1433
    check-cast v1, La/yje;

    .line 1434
    .line 1435
    check-cast v13, La/cu60;

    .line 1436
    .line 1437
    sget-object v1, La/cu60;->U1:La/evz;

    .line 1438
    .line 1439
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1440
    .line 1441
    .line 1442
    iget-object v1, v13, La/cu60;->P1:La/kiu0;

    .line 1443
    .line 1444
    sget-object v15, La/rek0;->b:La/rek0;

    .line 1445
    .line 1446
    if-eqz v0, :cond_3b

    .line 1447
    .line 1448
    instance-of v4, v0, La/s1b;

    .line 1449
    .line 1450
    if-eqz v4, :cond_2d

    .line 1451
    .line 1452
    iget-object v0, v13, La/cu60;->L1:La/ii;

    .line 1453
    .line 1454
    if-eqz v0, :cond_2c

    .line 1455
    .line 1456
    new-instance v14, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1457
    .line 1458
    const v1, 0x7f1304e0

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v13, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v15

    .line 1465
    const v1, 0x7f130c24

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {v13, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v16

    .line 1472
    const v1, 0x7f130e5c

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v13, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v17

    .line 1479
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1480
    .line 1481
    .line 1482
    sget-object v23, La/n12;->c:La/n12;

    .line 1483
    .line 1484
    const/16 v24, 0x0

    .line 1485
    .line 1486
    const/16 v25, 0x5d8

    .line 1487
    .line 1488
    const/16 v18, 0x0

    .line 1489
    .line 1490
    const/16 v19, 0x0

    .line 1491
    .line 1492
    const-string v20, "REQUEST_FREE_SPIN"

    .line 1493
    .line 1494
    const/16 v21, 0x0

    .line 1495
    .line 1496
    const/16 v22, 0x0

    .line 1497
    .line 1498
    invoke-direct/range {v14 .. v25}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1499
    .line 1500
    .line 1501
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v1

    .line 1505
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1506
    .line 1507
    .line 1508
    invoke-virtual {v0, v14, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1509
    .line 1510
    .line 1511
    goto/16 :goto_1c

    .line 1512
    .line 1513
    :cond_2c
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1514
    .line 1515
    .line 1516
    throw v12

    .line 1517
    :cond_2d
    instance-of v3, v0, La/x1b;

    .line 1518
    .line 1519
    const-string v4, "snackbarManager"

    .line 1520
    .line 1521
    if-eqz v3, :cond_2f

    .line 1522
    .line 1523
    iget-object v0, v13, La/cu60;->M1:La/wdk0;

    .line 1524
    .line 1525
    if-eqz v0, :cond_2e

    .line 1526
    .line 1527
    new-instance v14, La/xdk0;

    .line 1528
    .line 1529
    const v1, 0x7f13096f

    .line 1530
    .line 1531
    .line 1532
    invoke-virtual {v13, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v16

    .line 1536
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1537
    .line 1538
    .line 1539
    const/16 v20, 0x0

    .line 1540
    .line 1541
    const/16 v21, 0x7c

    .line 1542
    .line 1543
    const/16 v17, 0x0

    .line 1544
    .line 1545
    const/16 v18, 0x0

    .line 1546
    .line 1547
    const/16 v19, 0x0

    .line 1548
    .line 1549
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1550
    .line 1551
    .line 1552
    const/16 v21, 0x3fc

    .line 1553
    .line 1554
    const/16 v19, 0x0

    .line 1555
    .line 1556
    move-object/from16 v16, v13

    .line 1557
    .line 1558
    move-object v15, v14

    .line 1559
    move-object v14, v0

    .line 1560
    invoke-static/range {v14 .. v21}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1561
    .line 1562
    .line 1563
    goto/16 :goto_1c

    .line 1564
    .line 1565
    :cond_2e
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1566
    .line 1567
    .line 1568
    throw v12

    .line 1569
    :cond_2f
    instance-of v3, v0, La/w1b;

    .line 1570
    .line 1571
    if-eqz v3, :cond_31

    .line 1572
    .line 1573
    iget-object v0, v13, La/cu60;->N1:La/peg0;

    .line 1574
    .line 1575
    if-eqz v0, :cond_30

    .line 1576
    .line 1577
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 1578
    .line 1579
    check-cast v0, La/yzn0;

    .line 1580
    .line 1581
    invoke-virtual {v0}, La/yzn0;->i()La/ynb;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v1

    .line 1585
    sget-object v2, La/bm5;->d:La/bm5;

    .line 1586
    .line 1587
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v4

    .line 1591
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1592
    .line 1593
    .line 1594
    const-string v6, "SELECT_BALANCE_REQUEST_KEY"

    .line 1595
    .line 1596
    const/16 v7, 0x1ee

    .line 1597
    .line 1598
    const/4 v3, 0x0

    .line 1599
    const/4 v5, 0x0

    .line 1600
    invoke-static/range {v1 .. v7}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 1601
    .line 1602
    .line 1603
    goto/16 :goto_1c

    .line 1604
    .line 1605
    :cond_30
    const-string v0, "changeBalanceDialogProvider"

    .line 1606
    .line 1607
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1608
    .line 1609
    .line 1610
    throw v12

    .line 1611
    :cond_31
    instance-of v3, v0, La/t1b;

    .line 1612
    .line 1613
    if-eqz v3, :cond_38

    .line 1614
    .line 1615
    check-cast v0, La/t1b;

    .line 1616
    .line 1617
    iget-object v0, v0, La/t1b;->a:Ljava/lang/Throwable;

    .line 1618
    .line 1619
    const v1, 0x7f13115d

    .line 1620
    .line 1621
    .line 1622
    if-nez v0, :cond_32

    .line 1623
    .line 1624
    goto :goto_1a

    .line 1625
    :cond_32
    instance-of v3, v0, La/qct;

    .line 1626
    .line 1627
    if-eqz v3, :cond_34

    .line 1628
    .line 1629
    check-cast v0, La/qct;

    .line 1630
    .line 1631
    iget-object v0, v0, La/qct;->a:Ljava/lang/String;

    .line 1632
    .line 1633
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1634
    .line 1635
    .line 1636
    move-result v2

    .line 1637
    if-nez v2, :cond_33

    .line 1638
    .line 1639
    invoke-virtual {v13, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v0

    .line 1643
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1644
    .line 1645
    .line 1646
    :cond_33
    move-object v2, v0

    .line 1647
    :goto_19
    move-object/from16 v16, v2

    .line 1648
    .line 1649
    goto :goto_1b

    .line 1650
    :cond_34
    instance-of v3, v0, La/zhi0;

    .line 1651
    .line 1652
    if-eqz v3, :cond_36

    .line 1653
    .line 1654
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v0

    .line 1658
    if-nez v0, :cond_35

    .line 1659
    .line 1660
    goto :goto_19

    .line 1661
    :cond_35
    move-object/from16 v16, v0

    .line 1662
    .line 1663
    goto :goto_1b

    .line 1664
    :cond_36
    :goto_1a
    invoke-virtual {v13, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v2

    .line 1668
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1669
    .line 1670
    .line 1671
    goto :goto_19

    .line 1672
    :goto_1b
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    .line 1673
    .line 1674
    .line 1675
    move-result v0

    .line 1676
    if-lez v0, :cond_3a

    .line 1677
    .line 1678
    iget-object v0, v13, La/cu60;->M1:La/wdk0;

    .line 1679
    .line 1680
    if-eqz v0, :cond_37

    .line 1681
    .line 1682
    new-instance v14, La/xdk0;

    .line 1683
    .line 1684
    const/16 v20, 0x0

    .line 1685
    .line 1686
    const/16 v21, 0x7c

    .line 1687
    .line 1688
    const/16 v17, 0x0

    .line 1689
    .line 1690
    const/16 v18, 0x0

    .line 1691
    .line 1692
    const/16 v19, 0x0

    .line 1693
    .line 1694
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1695
    .line 1696
    .line 1697
    const/16 v21, 0x3fc

    .line 1698
    .line 1699
    const/16 v19, 0x0

    .line 1700
    .line 1701
    move-object/from16 v16, v13

    .line 1702
    .line 1703
    move-object v15, v14

    .line 1704
    move-object v14, v0

    .line 1705
    invoke-static/range {v14 .. v21}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1706
    .line 1707
    .line 1708
    goto :goto_1c

    .line 1709
    :cond_37
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1710
    .line 1711
    .line 1712
    throw v12

    .line 1713
    :cond_38
    instance-of v2, v0, La/u1b;

    .line 1714
    .line 1715
    if-eqz v2, :cond_39

    .line 1716
    .line 1717
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v0

    .line 1721
    check-cast v0, La/k370;

    .line 1722
    .line 1723
    sget-object v1, La/y270;->a:La/y270;

    .line 1724
    .line 1725
    invoke-virtual {v0, v1}, La/k370;->y(La/a370;)V

    .line 1726
    .line 1727
    .line 1728
    goto :goto_1c

    .line 1729
    :cond_39
    instance-of v0, v0, La/v1b;

    .line 1730
    .line 1731
    if-eqz v0, :cond_3b

    .line 1732
    .line 1733
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v0

    .line 1737
    check-cast v0, La/k370;

    .line 1738
    .line 1739
    new-instance v1, La/z270;

    .line 1740
    .line 1741
    invoke-direct {v1, v10}, La/z270;-><init>(Z)V

    .line 1742
    .line 1743
    .line 1744
    invoke-virtual {v0, v1}, La/k370;->y(La/a370;)V

    .line 1745
    .line 1746
    .line 1747
    :cond_3a
    :goto_1c
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1748
    .line 1749
    goto :goto_1d

    .line 1750
    :cond_3b
    invoke-static {}, La/t9f;->b()V

    .line 1751
    .line 1752
    .line 1753
    :goto_1d
    return-object v12

    .line 1754
    :pswitch_e
    move-object/from16 v0, p1

    .line 1755
    .line 1756
    check-cast v0, Ljava/lang/Number;

    .line 1757
    .line 1758
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1759
    .line 1760
    .line 1761
    move-result v0

    .line 1762
    move-object/from16 v1, p2

    .line 1763
    .line 1764
    check-cast v1, La/yje;

    .line 1765
    .line 1766
    check-cast v13, La/cu60;

    .line 1767
    .line 1768
    sget-object v1, La/cu60;->U1:La/evz;

    .line 1769
    .line 1770
    invoke-virtual {v13}, La/cu60;->G0()La/aza;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v1

    .line 1774
    iget-object v1, v1, La/aza;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 1775
    .line 1776
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setStyle(I)V

    .line 1777
    .line 1778
    .line 1779
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1780
    .line 1781
    return-object v0

    .line 1782
    :pswitch_f
    move-object/from16 v0, p1

    .line 1783
    .line 1784
    check-cast v0, Ljava/lang/Number;

    .line 1785
    .line 1786
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1787
    .line 1788
    .line 1789
    move-result v0

    .line 1790
    move-object/from16 v1, p2

    .line 1791
    .line 1792
    check-cast v1, La/yje;

    .line 1793
    .line 1794
    check-cast v13, La/ik60;

    .line 1795
    .line 1796
    sget-object v1, La/ik60;->Q1:[La/iiy;

    .line 1797
    .line 1798
    iget-object v1, v13, La/ik60;->N1:La/roq0;

    .line 1799
    .line 1800
    if-eqz v1, :cond_3c

    .line 1801
    .line 1802
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v3

    .line 1806
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1807
    .line 1808
    .line 1809
    invoke-virtual {v1, v3, v0, v2}, La/roq0;->d(Landroidx/fragment/app/e;ILjava/lang/String;)V

    .line 1810
    .line 1811
    .line 1812
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1813
    .line 1814
    return-object v0

    .line 1815
    :cond_3c
    const-string v0, "tipsDialogScreenFactory"

    .line 1816
    .line 1817
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1818
    .line 1819
    .line 1820
    throw v12

    .line 1821
    :pswitch_10
    move-object/from16 v0, p1

    .line 1822
    .line 1823
    check-cast v0, Ljava/util/List;

    .line 1824
    .line 1825
    move-object/from16 v1, p2

    .line 1826
    .line 1827
    check-cast v1, La/yje;

    .line 1828
    .line 1829
    check-cast v13, La/ik60;

    .line 1830
    .line 1831
    sget-object v1, La/ik60;->Q1:[La/iiy;

    .line 1832
    .line 1833
    iget-object v1, v13, La/ik60;->P1:La/a8z;

    .line 1834
    .line 1835
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v1

    .line 1839
    check-cast v1, La/kk60;

    .line 1840
    .line 1841
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 1842
    .line 1843
    .line 1844
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1845
    .line 1846
    return-object v0

    .line 1847
    :pswitch_11
    move-object/from16 v0, p1

    .line 1848
    .line 1849
    check-cast v0, Ljava/lang/Throwable;

    .line 1850
    .line 1851
    move-object/from16 v1, p2

    .line 1852
    .line 1853
    check-cast v1, La/yje;

    .line 1854
    .line 1855
    check-cast v13, La/j340;

    .line 1856
    .line 1857
    invoke-virtual {v13, v0}, La/j340;->P(Ljava/lang/Throwable;)V

    .line 1858
    .line 1859
    .line 1860
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1861
    .line 1862
    return-object v0

    .line 1863
    :pswitch_12
    move-object/from16 v0, p1

    .line 1864
    .line 1865
    check-cast v0, Ljava/lang/Throwable;

    .line 1866
    .line 1867
    move-object/from16 v1, p2

    .line 1868
    .line 1869
    check-cast v1, La/yje;

    .line 1870
    .line 1871
    check-cast v13, La/j340;

    .line 1872
    .line 1873
    invoke-virtual {v13, v0}, La/j340;->P(Ljava/lang/Throwable;)V

    .line 1874
    .line 1875
    .line 1876
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1877
    .line 1878
    return-object v0

    .line 1879
    :pswitch_13
    move-object/from16 v0, p1

    .line 1880
    .line 1881
    check-cast v0, Ljava/lang/Throwable;

    .line 1882
    .line 1883
    move-object/from16 v1, p2

    .line 1884
    .line 1885
    check-cast v1, La/yje;

    .line 1886
    .line 1887
    check-cast v13, La/j340;

    .line 1888
    .line 1889
    invoke-virtual {v13, v0}, La/j340;->P(Ljava/lang/Throwable;)V

    .line 1890
    .line 1891
    .line 1892
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1893
    .line 1894
    return-object v0

    .line 1895
    :pswitch_14
    move-object/from16 v0, p1

    .line 1896
    .line 1897
    check-cast v0, Ljava/lang/Throwable;

    .line 1898
    .line 1899
    move-object/from16 v1, p2

    .line 1900
    .line 1901
    check-cast v1, La/yje;

    .line 1902
    .line 1903
    check-cast v13, La/j340;

    .line 1904
    .line 1905
    invoke-virtual {v13, v0}, La/j340;->P(Ljava/lang/Throwable;)V

    .line 1906
    .line 1907
    .line 1908
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1909
    .line 1910
    return-object v0

    .line 1911
    :pswitch_15
    move-object/from16 v0, p1

    .line 1912
    .line 1913
    check-cast v0, La/ks30;

    .line 1914
    .line 1915
    move-object/from16 v1, p2

    .line 1916
    .line 1917
    check-cast v1, La/yje;

    .line 1918
    .line 1919
    check-cast v13, La/sr30;

    .line 1920
    .line 1921
    sget-object v1, La/sr30;->P1:[La/iiy;

    .line 1922
    .line 1923
    invoke-virtual {v13}, La/sr30;->G0()La/b2r;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v1

    .line 1927
    iget-object v1, v1, La/b2r;->b:Landroid/widget/FrameLayout;

    .line 1928
    .line 1929
    iget-boolean v2, v0, La/ks30;->a:Z

    .line 1930
    .line 1931
    if-eqz v2, :cond_3d

    .line 1932
    .line 1933
    const/4 v8, 0x0

    .line 1934
    goto :goto_1e

    .line 1935
    :cond_3d
    const/16 v8, 0x8

    .line 1936
    .line 1937
    :goto_1e
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1938
    .line 1939
    .line 1940
    invoke-virtual {v13}, La/sr30;->G0()La/b2r;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v1

    .line 1944
    iget-object v1, v1, La/b2r;->e:Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryPickerView;

    .line 1945
    .line 1946
    invoke-static {v1}, La/phu0;->M(Landroid/view/View;)La/sx3;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v1

    .line 1950
    iget-object v1, v1, La/sx3;->b:Ljava/lang/Object;

    .line 1951
    .line 1952
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 1953
    .line 1954
    invoke-static {v1}, La/igi0;->a(Lkotlin/jvm/functions/Function2;)La/egi0;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v1

    .line 1958
    :goto_1f
    invoke-virtual {v1}, La/egi0;->hasNext()Z

    .line 1959
    .line 1960
    .line 1961
    move-result v2

    .line 1962
    if-eqz v2, :cond_3e

    .line 1963
    .line 1964
    invoke-virtual {v1}, La/egi0;->next()Ljava/lang/Object;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v2

    .line 1968
    check-cast v2, Landroid/view/View;

    .line 1969
    .line 1970
    iget-boolean v3, v0, La/ks30;->b:Z

    .line 1971
    .line 1972
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 1973
    .line 1974
    .line 1975
    goto :goto_1f

    .line 1976
    :cond_3e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1977
    .line 1978
    return-object v0

    .line 1979
    :pswitch_16
    move-object/from16 v0, p1

    .line 1980
    .line 1981
    check-cast v0, La/js30;

    .line 1982
    .line 1983
    move-object/from16 v1, p2

    .line 1984
    .line 1985
    check-cast v1, La/yje;

    .line 1986
    .line 1987
    check-cast v13, La/sr30;

    .line 1988
    .line 1989
    sget-object v1, La/sr30;->P1:[La/iiy;

    .line 1990
    .line 1991
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1992
    .line 1993
    .line 1994
    iget-object v0, v0, La/js30;->a:Ljava/util/List;

    .line 1995
    .line 1996
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v0

    .line 2000
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2001
    .line 2002
    .line 2003
    move-result v1

    .line 2004
    if-eqz v1, :cond_40

    .line 2005
    .line 2006
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v1

    .line 2010
    check-cast v1, Lkotlin/Pair;

    .line 2011
    .line 2012
    iget-object v2, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 2013
    .line 2014
    move-object v4, v2

    .line 2015
    check-cast v4, Ljava/lang/String;

    .line 2016
    .line 2017
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 2018
    .line 2019
    check-cast v1, La/ht30;

    .line 2020
    .line 2021
    invoke-virtual {v13}, La/sr30;->G0()La/b2r;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v2

    .line 2025
    iget-object v2, v2, La/b2r;->e:Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryPickerView;

    .line 2026
    .line 2027
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2028
    .line 2029
    .line 2030
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2031
    .line 2032
    .line 2033
    new-instance v3, Landroid/widget/ImageView;

    .line 2034
    .line 2035
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v5

    .line 2039
    invoke-direct {v3, v5}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2040
    .line 2041
    .line 2042
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2043
    .line 2044
    .line 2045
    sget-object v5, La/ymx;->h:La/ymx;

    .line 2046
    .line 2047
    new-instance v6, La/bw20;

    .line 2048
    .line 2049
    const/16 v7, 0xd

    .line 2050
    .line 2051
    invoke-direct {v6, v2, v1, v7}, La/bw20;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2052
    .line 2053
    .line 2054
    invoke-static {v3, v5, v6}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 2055
    .line 2056
    .line 2057
    invoke-virtual {v2}, Landroid/view/View;->isInEditMode()Z

    .line 2058
    .line 2059
    .line 2060
    move-result v2

    .line 2061
    if-nez v2, :cond_3f

    .line 2062
    .line 2063
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 2064
    .line 2065
    const/4 v9, 0x0

    .line 2066
    const/16 v10, 0x1fe

    .line 2067
    .line 2068
    const/4 v5, 0x0

    .line 2069
    const/4 v6, 0x0

    .line 2070
    const/4 v7, 0x0

    .line 2071
    const/4 v8, 0x0

    .line 2072
    invoke-static/range {v3 .. v10}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 2073
    .line 2074
    .line 2075
    :cond_3f
    invoke-virtual {v1}, La/ht30;->getId()I

    .line 2076
    .line 2077
    .line 2078
    move-result v1

    .line 2079
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2080
    .line 2081
    const-string v4, "sport_icon"

    .line 2082
    .line 2083
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2084
    .line 2085
    .line 2086
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2087
    .line 2088
    .line 2089
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2090
    .line 2091
    .line 2092
    move-result-object v1

    .line 2093
    invoke-virtual {v3, v1}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    .line 2094
    .line 2095
    .line 2096
    goto :goto_20

    .line 2097
    :cond_40
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2098
    .line 2099
    return-object v0

    .line 2100
    :pswitch_17
    const-wide/16 v18, 0x3e8

    .line 2101
    .line 2102
    move-object/from16 v0, p1

    .line 2103
    .line 2104
    check-cast v0, La/fs30;

    .line 2105
    .line 2106
    move-object/from16 v1, p2

    .line 2107
    .line 2108
    check-cast v1, La/yje;

    .line 2109
    .line 2110
    check-cast v13, La/sr30;

    .line 2111
    .line 2112
    sget-object v1, La/sr30;->P1:[La/iiy;

    .line 2113
    .line 2114
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2115
    .line 2116
    .line 2117
    if-eqz v0, :cond_4d

    .line 2118
    .line 2119
    instance-of v1, v0, La/es30;

    .line 2120
    .line 2121
    const/16 v2, 0x9

    .line 2122
    .line 2123
    if-eqz v1, :cond_49

    .line 2124
    .line 2125
    invoke-virtual {v13}, La/sr30;->G0()La/b2r;

    .line 2126
    .line 2127
    .line 2128
    move-result-object v1

    .line 2129
    iget-object v1, v1, La/b2r;->c:Landroid/widget/TextView;

    .line 2130
    .line 2131
    check-cast v0, La/es30;

    .line 2132
    .line 2133
    iget v3, v0, La/es30;->d:I

    .line 2134
    .line 2135
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 2136
    .line 2137
    .line 2138
    invoke-virtual {v13, v10}, La/sr30;->I0(Z)V

    .line 2139
    .line 2140
    .line 2141
    invoke-virtual {v13}, La/sr30;->G0()La/b2r;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v1

    .line 2145
    iget-object v1, v1, La/b2r;->d:Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;

    .line 2146
    .line 2147
    iget v3, v0, La/es30;->c:I

    .line 2148
    .line 2149
    iget-object v4, v0, La/es30;->a:Ljava/util/List;

    .line 2150
    .line 2151
    iget-object v0, v0, La/es30;->b:Ljava/util/List;

    .line 2152
    .line 2153
    iget-object v1, v1, Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;->a:[La/gt30;

    .line 2154
    .line 2155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2156
    .line 2157
    .line 2158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2159
    .line 2160
    .line 2161
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 2162
    .line 2163
    .line 2164
    move-result v5

    .line 2165
    if-eq v5, v2, :cond_41

    .line 2166
    .line 2167
    goto/16 :goto_25

    .line 2168
    .line 2169
    :cond_41
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 2170
    .line 2171
    .line 2172
    move-result v2

    .line 2173
    const/4 v11, 0x0

    .line 2174
    :goto_21
    if-ge v11, v2, :cond_4c

    .line 2175
    .line 2176
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2177
    .line 2178
    .line 2179
    move-result-object v5

    .line 2180
    check-cast v5, Ljava/lang/Number;

    .line 2181
    .line 2182
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 2183
    .line 2184
    .line 2185
    move-result v5

    .line 2186
    if-nez v5, :cond_42

    .line 2187
    .line 2188
    aget-object v5, v1, v11

    .line 2189
    .line 2190
    if-eqz v5, :cond_43

    .line 2191
    .line 2192
    invoke-virtual {v5}, La/gt30;->b()V

    .line 2193
    .line 2194
    .line 2195
    goto :goto_22

    .line 2196
    :cond_42
    aget-object v6, v1, v11

    .line 2197
    .line 2198
    if-eqz v6, :cond_43

    .line 2199
    .line 2200
    sget v7, La/gt30;->f:I

    .line 2201
    .line 2202
    invoke-virtual {v6, v3, v5, v12}, La/gt30;->a(IILa/f73;)V

    .line 2203
    .line 2204
    .line 2205
    :cond_43
    :goto_22
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2206
    .line 2207
    .line 2208
    move-result-object v5

    .line 2209
    invoke-interface {v0, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 2210
    .line 2211
    .line 2212
    move-result v5

    .line 2213
    if-eqz v5, :cond_48

    .line 2214
    .line 2215
    aget-object v5, v1, v11

    .line 2216
    .line 2217
    if-eqz v5, :cond_48

    .line 2218
    .line 2219
    iget-boolean v6, v5, La/gt30;->b:Z

    .line 2220
    .line 2221
    if-nez v6, :cond_48

    .line 2222
    .line 2223
    iget-object v6, v5, La/gt30;->d:Landroid/animation/AnimatorSet;

    .line 2224
    .line 2225
    if-eqz v6, :cond_44

    .line 2226
    .line 2227
    invoke-virtual {v6}, Landroid/animation/AnimatorSet;->isRunning()Z

    .line 2228
    .line 2229
    .line 2230
    move-result v6

    .line 2231
    if-ne v6, v10, :cond_44

    .line 2232
    .line 2233
    goto/16 :goto_23

    .line 2234
    .line 2235
    :cond_44
    iget-object v6, v5, La/gt30;->d:Landroid/animation/AnimatorSet;

    .line 2236
    .line 2237
    if-eqz v6, :cond_45

    .line 2238
    .line 2239
    invoke-virtual {v6}, Landroid/animation/AnimatorSet;->end()V

    .line 2240
    .line 2241
    .line 2242
    :cond_45
    new-instance v6, Landroid/view/View;

    .line 2243
    .line 2244
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2245
    .line 2246
    .line 2247
    move-result-object v7

    .line 2248
    invoke-direct {v6, v7}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2249
    .line 2250
    .line 2251
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    .line 2252
    .line 2253
    sget-object v8, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 2254
    .line 2255
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2256
    .line 2257
    .line 2258
    move-result-object v9

    .line 2259
    const v13, 0x7f0606da

    .line 2260
    .line 2261
    .line 2262
    invoke-virtual {v9, v13}, Landroid/content/Context;->getColor(I)I

    .line 2263
    .line 2264
    .line 2265
    move-result v9

    .line 2266
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2267
    .line 2268
    .line 2269
    move-result-object v13

    .line 2270
    const v14, 0x7f0606d8

    .line 2271
    .line 2272
    .line 2273
    invoke-virtual {v13, v14}, Landroid/content/Context;->getColor(I)I

    .line 2274
    .line 2275
    .line 2276
    move-result v13

    .line 2277
    filled-new-array {v9, v13}, [I

    .line 2278
    .line 2279
    .line 2280
    move-result-object v9

    .line 2281
    invoke-direct {v7, v8, v9}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 2282
    .line 2283
    .line 2284
    invoke-virtual {v6, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2285
    .line 2286
    .line 2287
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2288
    .line 2289
    .line 2290
    const/4 v8, 0x2

    .line 2291
    new-array v7, v8, [F

    .line 2292
    .line 2293
    fill-array-data v7, :array_0

    .line 2294
    .line 2295
    .line 2296
    const-string v9, "alpha"

    .line 2297
    .line 2298
    invoke-static {v6, v9, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 2299
    .line 2300
    .line 2301
    move-result-object v7

    .line 2302
    const-wide/16 v13, 0x1f4

    .line 2303
    .line 2304
    invoke-virtual {v7, v13, v14}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 2305
    .line 2306
    .line 2307
    move-result-object v7

    .line 2308
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2309
    .line 2310
    .line 2311
    new-array v15, v8, [F

    .line 2312
    .line 2313
    fill-array-data v15, :array_1

    .line 2314
    .line 2315
    .line 2316
    invoke-static {v6, v9, v15}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v15

    .line 2320
    invoke-virtual {v15, v13, v14}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 2321
    .line 2322
    .line 2323
    move-result-object v15

    .line 2324
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2325
    .line 2326
    .line 2327
    new-array v10, v8, [F

    .line 2328
    .line 2329
    fill-array-data v10, :array_2

    .line 2330
    .line 2331
    .line 2332
    invoke-static {v6, v9, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 2333
    .line 2334
    .line 2335
    move-result-object v10

    .line 2336
    invoke-virtual {v10, v13, v14}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 2337
    .line 2338
    .line 2339
    move-result-object v10

    .line 2340
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2341
    .line 2342
    .line 2343
    new-array v12, v8, [F

    .line 2344
    .line 2345
    fill-array-data v12, :array_3

    .line 2346
    .line 2347
    .line 2348
    invoke-static {v6, v9, v12}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 2349
    .line 2350
    .line 2351
    move-result-object v8

    .line 2352
    invoke-virtual {v8, v13, v14}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 2353
    .line 2354
    .line 2355
    move-result-object v8

    .line 2356
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2357
    .line 2358
    .line 2359
    invoke-virtual {v15, v13, v14}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 2360
    .line 2361
    .line 2362
    move-wide/from16 v12, v18

    .line 2363
    .line 2364
    invoke-virtual {v10, v12, v13}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 2365
    .line 2366
    .line 2367
    const-wide/16 v12, 0x5dc

    .line 2368
    .line 2369
    invoke-virtual {v8, v12, v13}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 2370
    .line 2371
    .line 2372
    new-instance v9, Landroid/animation/AnimatorSet;

    .line 2373
    .line 2374
    invoke-direct {v9}, Landroid/animation/AnimatorSet;-><init>()V

    .line 2375
    .line 2376
    .line 2377
    iput-object v9, v5, La/gt30;->d:Landroid/animation/AnimatorSet;

    .line 2378
    .line 2379
    invoke-virtual {v9, v7}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 2380
    .line 2381
    .line 2382
    move-result-object v7

    .line 2383
    if-eqz v7, :cond_46

    .line 2384
    .line 2385
    invoke-virtual {v7, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 2386
    .line 2387
    .line 2388
    move-result-object v7

    .line 2389
    if-eqz v7, :cond_46

    .line 2390
    .line 2391
    invoke-virtual {v7, v10}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 2392
    .line 2393
    .line 2394
    move-result-object v7

    .line 2395
    if-eqz v7, :cond_46

    .line 2396
    .line 2397
    invoke-virtual {v7, v8}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 2398
    .line 2399
    .line 2400
    :cond_46
    iget-object v7, v5, La/gt30;->d:Landroid/animation/AnimatorSet;

    .line 2401
    .line 2402
    if-eqz v7, :cond_47

    .line 2403
    .line 2404
    new-instance v8, La/x73;

    .line 2405
    .line 2406
    new-instance v9, La/mbz;

    .line 2407
    .line 2408
    const/16 v10, 0x1b

    .line 2409
    .line 2410
    invoke-direct {v9, v5, v6, v10}, La/mbz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2411
    .line 2412
    .line 2413
    const/16 v6, 0xb

    .line 2414
    .line 2415
    const/4 v10, 0x0

    .line 2416
    invoke-direct {v8, v10, v9, v6}, La/x73;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 2417
    .line 2418
    .line 2419
    invoke-virtual {v7, v8}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 2420
    .line 2421
    .line 2422
    :cond_47
    iget-object v5, v5, La/gt30;->d:Landroid/animation/AnimatorSet;

    .line 2423
    .line 2424
    if-eqz v5, :cond_48

    .line 2425
    .line 2426
    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    .line 2427
    .line 2428
    .line 2429
    :cond_48
    :goto_23
    add-int/lit8 v11, v11, 0x1

    .line 2430
    .line 2431
    const/4 v10, 0x1

    .line 2432
    const/4 v12, 0x0

    .line 2433
    const-wide/16 v18, 0x3e8

    .line 2434
    .line 2435
    goto/16 :goto_21

    .line 2436
    .line 2437
    :cond_49
    instance-of v1, v0, La/cs30;

    .line 2438
    .line 2439
    if-eqz v1, :cond_4b

    .line 2440
    .line 2441
    invoke-virtual {v13}, La/sr30;->G0()La/b2r;

    .line 2442
    .line 2443
    .line 2444
    move-result-object v0

    .line 2445
    iget-object v0, v0, La/b2r;->c:Landroid/widget/TextView;

    .line 2446
    .line 2447
    const v1, 0x7f130ce2

    .line 2448
    .line 2449
    .line 2450
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 2451
    .line 2452
    .line 2453
    invoke-virtual {v13}, La/sr30;->G0()La/b2r;

    .line 2454
    .line 2455
    .line 2456
    move-result-object v0

    .line 2457
    iget-object v0, v0, La/b2r;->d:Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;

    .line 2458
    .line 2459
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2460
    .line 2461
    .line 2462
    const/4 v1, 0x0

    .line 2463
    :goto_24
    if-ge v1, v2, :cond_4a

    .line 2464
    .line 2465
    new-instance v3, La/gt30;

    .line 2466
    .line 2467
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2468
    .line 2469
    .line 2470
    move-result-object v4

    .line 2471
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2472
    .line 2473
    .line 2474
    invoke-direct {v3, v4}, La/gt30;-><init>(Landroid/content/Context;)V

    .line 2475
    .line 2476
    .line 2477
    invoke-virtual {v3, v0}, La/gt30;->setListener(La/o9k0;)V

    .line 2478
    .line 2479
    .line 2480
    iget-object v4, v0, Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;->a:[La/gt30;

    .line 2481
    .line 2482
    aput-object v3, v4, v1

    .line 2483
    .line 2484
    new-instance v4, La/yr30;

    .line 2485
    .line 2486
    const/4 v5, 0x1

    .line 2487
    invoke-direct {v4, v0, v1, v5}, La/yr30;-><init>(Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;IB)V

    .line 2488
    .line 2489
    .line 2490
    invoke-static {v3, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 2491
    .line 2492
    .line 2493
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2494
    .line 2495
    .line 2496
    add-int/lit8 v1, v1, 0x1

    .line 2497
    .line 2498
    goto :goto_24

    .line 2499
    :cond_4a
    const/4 v7, 0x0

    .line 2500
    invoke-virtual {v13, v7}, La/sr30;->I0(Z)V

    .line 2501
    .line 2502
    .line 2503
    goto :goto_25

    .line 2504
    :cond_4b
    const/4 v7, 0x0

    .line 2505
    instance-of v0, v0, La/ds30;

    .line 2506
    .line 2507
    if-eqz v0, :cond_4d

    .line 2508
    .line 2509
    invoke-virtual {v13, v7}, La/sr30;->I0(Z)V

    .line 2510
    .line 2511
    .line 2512
    :cond_4c
    :goto_25
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2513
    .line 2514
    goto :goto_26

    .line 2515
    :cond_4d
    invoke-static {}, La/t9f;->b()V

    .line 2516
    .line 2517
    .line 2518
    const/4 v12, 0x0

    .line 2519
    :goto_26
    return-object v12

    .line 2520
    :pswitch_18
    move-object/from16 v0, p1

    .line 2521
    .line 2522
    check-cast v0, La/is30;

    .line 2523
    .line 2524
    move-object/from16 v1, p2

    .line 2525
    .line 2526
    check-cast v1, La/yje;

    .line 2527
    .line 2528
    check-cast v13, La/sr30;

    .line 2529
    .line 2530
    sget-object v1, La/sr30;->P1:[La/iiy;

    .line 2531
    .line 2532
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2533
    .line 2534
    .line 2535
    if-eqz v0, :cond_53

    .line 2536
    .line 2537
    instance-of v1, v0, La/hs30;

    .line 2538
    .line 2539
    if-eqz v1, :cond_51

    .line 2540
    .line 2541
    iget-object v0, v13, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2542
    .line 2543
    instance-of v1, v0, La/us30;

    .line 2544
    .line 2545
    if-eqz v1, :cond_4e

    .line 2546
    .line 2547
    check-cast v0, La/us30;

    .line 2548
    .line 2549
    goto :goto_27

    .line 2550
    :cond_4e
    const/4 v0, 0x0

    .line 2551
    :goto_27
    if-eqz v0, :cond_4f

    .line 2552
    .line 2553
    invoke-virtual {v0}, La/us30;->K0()La/gkc0;

    .line 2554
    .line 2555
    .line 2556
    move-result-object v0

    .line 2557
    iget-object v0, v0, La/gkc0;->p:La/p7m0;

    .line 2558
    .line 2559
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2560
    .line 2561
    .line 2562
    move-result-object v0

    .line 2563
    instance-of v0, v0, La/tjc0;

    .line 2564
    .line 2565
    const/4 v5, 0x1

    .line 2566
    if-ne v0, v5, :cond_4f

    .line 2567
    .line 2568
    goto/16 :goto_28

    .line 2569
    .line 2570
    :cond_4f
    iget-object v0, v13, La/sr30;->M1:La/ii;

    .line 2571
    .line 2572
    if-eqz v0, :cond_50

    .line 2573
    .line 2574
    new-instance v23, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2575
    .line 2576
    const v1, 0x7f1316f5

    .line 2577
    .line 2578
    .line 2579
    invoke-virtual {v13, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2580
    .line 2581
    .line 2582
    move-result-object v24

    .line 2583
    const v1, 0x7f1316f7

    .line 2584
    .line 2585
    .line 2586
    invoke-virtual {v13, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2587
    .line 2588
    .line 2589
    move-result-object v25

    .line 2590
    const v1, 0x7f1316f6

    .line 2591
    .line 2592
    .line 2593
    invoke-virtual {v13, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2594
    .line 2595
    .line 2596
    move-result-object v26

    .line 2597
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2598
    .line 2599
    .line 2600
    sget-object v32, La/n12;->a:La/n12;

    .line 2601
    .line 2602
    const/16 v33, 0x0

    .line 2603
    .line 2604
    const/16 v34, 0x5d8

    .line 2605
    .line 2606
    const/16 v27, 0x0

    .line 2607
    .line 2608
    const/16 v28, 0x0

    .line 2609
    .line 2610
    const-string v29, "MEMORY_UNFINISHED_GAME_DIALOG"

    .line 2611
    .line 2612
    const/16 v30, 0x0

    .line 2613
    .line 2614
    const/16 v31, 0x0

    .line 2615
    .line 2616
    invoke-direct/range {v23 .. v34}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2617
    .line 2618
    .line 2619
    move-object/from16 v1, v23

    .line 2620
    .line 2621
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2622
    .line 2623
    .line 2624
    move-result-object v2

    .line 2625
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2626
    .line 2627
    .line 2628
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2629
    .line 2630
    .line 2631
    goto :goto_28

    .line 2632
    :cond_50
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2633
    .line 2634
    .line 2635
    const/16 v22, 0x0

    .line 2636
    .line 2637
    throw v22

    .line 2638
    :cond_51
    instance-of v1, v0, La/gs30;

    .line 2639
    .line 2640
    if-eqz v1, :cond_53

    .line 2641
    .line 2642
    invoke-virtual {v13}, La/sr30;->G0()La/b2r;

    .line 2643
    .line 2644
    .line 2645
    move-result-object v1

    .line 2646
    iget-object v1, v1, La/b2r;->d:Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;

    .line 2647
    .line 2648
    move-object v2, v0

    .line 2649
    check-cast v2, La/gs30;

    .line 2650
    .line 2651
    iget v3, v2, La/gs30;->e:I

    .line 2652
    .line 2653
    iget v4, v2, La/gs30;->a:I

    .line 2654
    .line 2655
    iget v2, v2, La/gs30;->b:I

    .line 2656
    .line 2657
    new-instance v5, La/mbz;

    .line 2658
    .line 2659
    const/16 v7, 0x19

    .line 2660
    .line 2661
    invoke-direct {v5, v13, v0, v7}, La/mbz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2662
    .line 2663
    .line 2664
    iget-object v0, v1, Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;->a:[La/gt30;

    .line 2665
    .line 2666
    invoke-static {v2, v0}, La/tx3;->G(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2667
    .line 2668
    .line 2669
    move-result-object v0

    .line 2670
    check-cast v0, La/gt30;

    .line 2671
    .line 2672
    if-eqz v0, :cond_52

    .line 2673
    .line 2674
    new-instance v2, La/f73;

    .line 2675
    .line 2676
    new-instance v7, La/mbz;

    .line 2677
    .line 2678
    const/16 v8, 0x1a

    .line 2679
    .line 2680
    invoke-direct {v7, v1, v5, v8}, La/mbz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2681
    .line 2682
    .line 2683
    new-instance v5, La/np30;

    .line 2684
    .line 2685
    invoke-direct {v5, v1, v6}, La/np30;-><init>(Ljava/lang/Object;B)V

    .line 2686
    .line 2687
    .line 2688
    const/4 v1, 0x0

    .line 2689
    invoke-direct {v2, v7, v5, v1}, La/f73;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2690
    .line 2691
    .line 2692
    invoke-virtual {v0, v3, v4, v2}, La/gt30;->a(IILa/f73;)V

    .line 2693
    .line 2694
    .line 2695
    :cond_52
    :goto_28
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2696
    .line 2697
    goto :goto_29

    .line 2698
    :cond_53
    invoke-static {}, La/t9f;->b()V

    .line 2699
    .line 2700
    .line 2701
    const/4 v12, 0x0

    .line 2702
    :goto_29
    return-object v12

    .line 2703
    :pswitch_19
    move-object/from16 v0, p1

    .line 2704
    .line 2705
    check-cast v0, La/z0k0;

    .line 2706
    .line 2707
    move-object/from16 v1, p2

    .line 2708
    .line 2709
    check-cast v1, La/yje;

    .line 2710
    .line 2711
    check-cast v13, La/ik30;

    .line 2712
    .line 2713
    sget-object v1, La/ik30;->W1:La/atz;

    .line 2714
    .line 2715
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2716
    .line 2717
    .line 2718
    instance-of v1, v0, La/w0k0;

    .line 2719
    .line 2720
    sget-object v2, La/s0k0;->a:La/s0k0;

    .line 2721
    .line 2722
    if-eqz v1, :cond_55

    .line 2723
    .line 2724
    sget-object v1, La/cuk;->l2:La/bek;

    .line 2725
    .line 2726
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2727
    .line 2728
    .line 2729
    move-result-object v3

    .line 2730
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2731
    .line 2732
    .line 2733
    check-cast v0, La/w0k0;

    .line 2734
    .line 2735
    iget v4, v0, La/w0k0;->a:I

    .line 2736
    .line 2737
    iget-object v0, v0, La/w0k0;->b:Ljava/lang/String;

    .line 2738
    .line 2739
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2740
    .line 2741
    .line 2742
    const-string v1, "DISCIPLINE_PICKER_DIALOG_TAG"

    .line 2743
    .line 2744
    invoke-virtual {v3, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 2745
    .line 2746
    .line 2747
    move-result-object v5

    .line 2748
    if-eqz v5, :cond_54

    .line 2749
    .line 2750
    goto :goto_2a

    .line 2751
    :cond_54
    new-instance v5, La/cuk;

    .line 2752
    .line 2753
    invoke-direct {v5}, La/cuk;-><init>()V

    .line 2754
    .line 2755
    .line 2756
    sget-object v6, La/cuk;->m2:[La/iiy;

    .line 2757
    .line 2758
    const/16 v21, 0x1

    .line 2759
    .line 2760
    aget-object v7, v6, v21

    .line 2761
    .line 2762
    iget-object v8, v5, La/cuk;->j2:La/zz2;

    .line 2763
    .line 2764
    invoke-virtual {v8, v5, v7, v4}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 2765
    .line 2766
    .line 2767
    iget-object v4, v5, La/cuk;->k2:La/phf0;

    .line 2768
    .line 2769
    const/16 v20, 0x2

    .line 2770
    .line 2771
    aget-object v6, v6, v20

    .line 2772
    .line 2773
    invoke-virtual {v4, v5, v6, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 2774
    .line 2775
    .line 2776
    invoke-virtual {v5, v3, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 2777
    .line 2778
    .line 2779
    :goto_2a
    invoke-virtual {v13}, La/ik30;->H0()La/zk30;

    .line 2780
    .line 2781
    .line 2782
    move-result-object v0

    .line 2783
    iget-object v0, v0, La/zk30;->o:La/p7m0;

    .line 2784
    .line 2785
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2786
    .line 2787
    .line 2788
    const/4 v10, 0x0

    .line 2789
    invoke-virtual {v0, v10, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2790
    .line 2791
    .line 2792
    goto :goto_2b

    .line 2793
    :cond_55
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2794
    .line 2795
    .line 2796
    move-result v0

    .line 2797
    if-eqz v0, :cond_56

    .line 2798
    .line 2799
    :goto_2b
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2800
    .line 2801
    goto :goto_2c

    .line 2802
    :cond_56
    invoke-static {}, La/t9f;->b()V

    .line 2803
    .line 2804
    .line 2805
    const/4 v12, 0x0

    .line 2806
    :goto_2c
    return-object v12

    .line 2807
    :pswitch_1a
    move-object/from16 v0, p1

    .line 2808
    .line 2809
    check-cast v0, La/sk30;

    .line 2810
    .line 2811
    move-object/from16 v1, p2

    .line 2812
    .line 2813
    check-cast v1, La/yje;

    .line 2814
    .line 2815
    check-cast v13, La/ik30;

    .line 2816
    .line 2817
    sget-object v1, La/ik30;->W1:La/atz;

    .line 2818
    .line 2819
    iget-object v1, v13, La/ik30;->P1:La/bg5;

    .line 2820
    .line 2821
    instance-of v2, v0, La/ok30;

    .line 2822
    .line 2823
    if-eqz v2, :cond_5b

    .line 2824
    .line 2825
    check-cast v0, La/ok30;

    .line 2826
    .line 2827
    iget-object v2, v0, La/ok30;->a:Ljava/util/ArrayList;

    .line 2828
    .line 2829
    invoke-virtual {v1, v2}, La/zz3;->A(Ljava/util/List;)V

    .line 2830
    .line 2831
    .line 2832
    invoke-virtual {v1}, La/yge0;->g()V

    .line 2833
    .line 2834
    .line 2835
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 2836
    .line 2837
    .line 2838
    move-result-object v1

    .line 2839
    iget-object v1, v1, La/a2r;->f:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 2840
    .line 2841
    const/4 v7, 0x0

    .line 2842
    invoke-virtual {v1, v7}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 2843
    .line 2844
    .line 2845
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 2846
    .line 2847
    .line 2848
    move-result-object v1

    .line 2849
    iget-object v1, v1, La/a2r;->f:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 2850
    .line 2851
    const/4 v5, 0x1

    .line 2852
    invoke-virtual {v1, v5}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 2853
    .line 2854
    .line 2855
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 2856
    .line 2857
    .line 2858
    move-result-object v1

    .line 2859
    iget-object v1, v1, La/a2r;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 2860
    .line 2861
    const/16 v2, 0x8

    .line 2862
    .line 2863
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 2864
    .line 2865
    .line 2866
    iget-boolean v1, v0, La/ok30;->b:Z

    .line 2867
    .line 2868
    if-eqz v1, :cond_57

    .line 2869
    .line 2870
    const v2, 0x7f080910

    .line 2871
    .line 2872
    .line 2873
    goto :goto_2d

    .line 2874
    :cond_57
    const v2, 0x7f080911

    .line 2875
    .line 2876
    .line 2877
    :goto_2d
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2878
    .line 2879
    .line 2880
    move-result-object v3

    .line 2881
    invoke-virtual {v3, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2882
    .line 2883
    .line 2884
    move-result-object v2

    .line 2885
    if-eqz v1, :cond_58

    .line 2886
    .line 2887
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2888
    .line 2889
    .line 2890
    move-result-object v1

    .line 2891
    const v3, 0x7f040afc

    .line 2892
    .line 2893
    .line 2894
    invoke-static {v2, v1, v3}, La/vcc;->c0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 2895
    .line 2896
    .line 2897
    :cond_58
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 2898
    .line 2899
    .line 2900
    move-result-object v1

    .line 2901
    iget-object v1, v1, La/a2r;->g:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 2902
    .line 2903
    iget-object v1, v1, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 2904
    .line 2905
    if-eqz v1, :cond_59

    .line 2906
    .line 2907
    const-string v3, "FILTER_NAV_ITEM_ID"

    .line 2908
    .line 2909
    invoke-interface {v1, v3}, La/s96;->b(Ljava/lang/String;)La/ukm;

    .line 2910
    .line 2911
    .line 2912
    move-result-object v12

    .line 2913
    goto :goto_2e

    .line 2914
    :cond_59
    const/4 v12, 0x0

    .line 2915
    :goto_2e
    if-eqz v12, :cond_5a

    .line 2916
    .line 2917
    invoke-virtual {v12, v2}, La/ukm;->setNavigationBarButtonImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2918
    .line 2919
    .line 2920
    :cond_5a
    iget-boolean v0, v0, La/ok30;->c:Z

    .line 2921
    .line 2922
    const/16 v21, 0x1

    .line 2923
    .line 2924
    xor-int/lit8 v0, v0, 0x1

    .line 2925
    .line 2926
    invoke-virtual {v13, v0}, La/ik30;->J0(Z)V

    .line 2927
    .line 2928
    .line 2929
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 2930
    .line 2931
    .line 2932
    move-result-object v0

    .line 2933
    iget-object v0, v0, La/a2r;->b:La/ewe;

    .line 2934
    .line 2935
    iget-object v0, v0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2936
    .line 2937
    const/4 v7, 0x0

    .line 2938
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2939
    .line 2940
    .line 2941
    invoke-virtual {v13}, La/ik30;->I0()V

    .line 2942
    .line 2943
    .line 2944
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 2945
    .line 2946
    .line 2947
    move-result-object v0

    .line 2948
    iget-object v0, v0, La/a2r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 2949
    .line 2950
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2951
    .line 2952
    .line 2953
    goto/16 :goto_30

    .line 2954
    .line 2955
    :cond_5b
    const/4 v7, 0x0

    .line 2956
    instance-of v2, v0, La/qk30;

    .line 2957
    .line 2958
    if-eqz v2, :cond_5c

    .line 2959
    .line 2960
    invoke-virtual {v13, v7}, La/ik30;->J0(Z)V

    .line 2961
    .line 2962
    .line 2963
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 2964
    .line 2965
    .line 2966
    move-result-object v2

    .line 2967
    iget-object v2, v2, La/a2r;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 2968
    .line 2969
    check-cast v0, La/qk30;

    .line 2970
    .line 2971
    iget-object v0, v0, La/qk30;->a:La/jkm;

    .line 2972
    .line 2973
    sget v3, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 2974
    .line 2975
    new-instance v3, La/bmh;

    .line 2976
    .line 2977
    const/16 v4, 0xc

    .line 2978
    .line 2979
    invoke-direct {v3, v4}, La/bmh;-><init>(B)V

    .line 2980
    .line 2981
    .line 2982
    const-wide/16 v4, 0x2710

    .line 2983
    .line 2984
    invoke-virtual {v2, v0, v4, v5, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 2985
    .line 2986
    .line 2987
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 2988
    .line 2989
    .line 2990
    move-result-object v0

    .line 2991
    iget-object v0, v0, La/a2r;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 2992
    .line 2993
    const/4 v7, 0x0

    .line 2994
    invoke-virtual {v0, v7}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 2995
    .line 2996
    .line 2997
    sget-object v0, La/iun;->a:La/iun;

    .line 2998
    .line 2999
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 3000
    .line 3001
    .line 3002
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3003
    .line 3004
    .line 3005
    move-result-object v0

    .line 3006
    iget-object v0, v0, La/a2r;->f:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 3007
    .line 3008
    invoke-virtual {v0, v7}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 3009
    .line 3010
    .line 3011
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3012
    .line 3013
    .line 3014
    move-result-object v0

    .line 3015
    iget-object v0, v0, La/a2r;->f:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 3016
    .line 3017
    invoke-virtual {v0, v7}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 3018
    .line 3019
    .line 3020
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3021
    .line 3022
    .line 3023
    move-result-object v0

    .line 3024
    iget-object v0, v0, La/a2r;->b:La/ewe;

    .line 3025
    .line 3026
    iget-object v0, v0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 3027
    .line 3028
    const/16 v2, 0x8

    .line 3029
    .line 3030
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3031
    .line 3032
    .line 3033
    invoke-virtual {v13}, La/ik30;->I0()V

    .line 3034
    .line 3035
    .line 3036
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3037
    .line 3038
    .line 3039
    move-result-object v0

    .line 3040
    iget-object v0, v0, La/a2r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 3041
    .line 3042
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3043
    .line 3044
    .line 3045
    goto/16 :goto_30

    .line 3046
    .line 3047
    :cond_5c
    sget-object v2, La/rk30;->a:La/rk30;

    .line 3048
    .line 3049
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3050
    .line 3051
    .line 3052
    move-result v2

    .line 3053
    if-eqz v2, :cond_5e

    .line 3054
    .line 3055
    iget-object v0, v1, La/zz3;->e:La/yz3;

    .line 3056
    .line 3057
    iget-object v0, v0, La/yz3;->f:Ljava/util/List;

    .line 3058
    .line 3059
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 3060
    .line 3061
    .line 3062
    move-result v0

    .line 3063
    if-eqz v0, :cond_5d

    .line 3064
    .line 3065
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3066
    .line 3067
    .line 3068
    move-result-object v0

    .line 3069
    iget-object v0, v0, La/a2r;->f:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 3070
    .line 3071
    const/4 v7, 0x0

    .line 3072
    invoke-virtual {v0, v7}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 3073
    .line 3074
    .line 3075
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3076
    .line 3077
    .line 3078
    move-result-object v0

    .line 3079
    iget-object v0, v0, La/a2r;->f:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 3080
    .line 3081
    invoke-virtual {v0, v7}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 3082
    .line 3083
    .line 3084
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3085
    .line 3086
    .line 3087
    move-result-object v0

    .line 3088
    iget-object v0, v0, La/a2r;->b:La/ewe;

    .line 3089
    .line 3090
    iget-object v0, v0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 3091
    .line 3092
    const/16 v2, 0x8

    .line 3093
    .line 3094
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3095
    .line 3096
    .line 3097
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3098
    .line 3099
    .line 3100
    move-result-object v0

    .line 3101
    iget-object v0, v0, La/a2r;->c:La/vr9;

    .line 3102
    .line 3103
    iget-object v0, v0, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 3104
    .line 3105
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 3106
    .line 3107
    .line 3108
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3109
    .line 3110
    .line 3111
    move-result-object v0

    .line 3112
    iget-object v0, v0, La/a2r;->c:La/vr9;

    .line 3113
    .line 3114
    iget-object v0, v0, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 3115
    .line 3116
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 3117
    .line 3118
    .line 3119
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3120
    .line 3121
    .line 3122
    move-result-object v0

    .line 3123
    iget-object v0, v0, La/a2r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 3124
    .line 3125
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3126
    .line 3127
    .line 3128
    goto :goto_2f

    .line 3129
    :cond_5d
    const/4 v7, 0x0

    .line 3130
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3131
    .line 3132
    .line 3133
    move-result-object v0

    .line 3134
    iget-object v0, v0, La/a2r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 3135
    .line 3136
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 3137
    .line 3138
    .line 3139
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3140
    .line 3141
    .line 3142
    move-result-object v0

    .line 3143
    iget-object v0, v0, La/a2r;->f:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 3144
    .line 3145
    const/4 v5, 0x1

    .line 3146
    invoke-virtual {v0, v5}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 3147
    .line 3148
    .line 3149
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3150
    .line 3151
    .line 3152
    move-result-object v0

    .line 3153
    iget-object v0, v0, La/a2r;->f:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 3154
    .line 3155
    invoke-virtual {v0, v5}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 3156
    .line 3157
    .line 3158
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3159
    .line 3160
    .line 3161
    move-result-object v0

    .line 3162
    iget-object v0, v0, La/a2r;->b:La/ewe;

    .line 3163
    .line 3164
    iget-object v0, v0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 3165
    .line 3166
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 3167
    .line 3168
    .line 3169
    invoke-virtual {v13}, La/ik30;->I0()V

    .line 3170
    .line 3171
    .line 3172
    :goto_2f
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3173
    .line 3174
    .line 3175
    move-result-object v0

    .line 3176
    iget-object v0, v0, La/a2r;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 3177
    .line 3178
    const/16 v2, 0x8

    .line 3179
    .line 3180
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 3181
    .line 3182
    .line 3183
    invoke-virtual {v13, v7}, La/ik30;->J0(Z)V

    .line 3184
    .line 3185
    .line 3186
    goto :goto_30

    .line 3187
    :cond_5e
    const/4 v7, 0x0

    .line 3188
    instance-of v1, v0, La/pk30;

    .line 3189
    .line 3190
    if-eqz v1, :cond_5f

    .line 3191
    .line 3192
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3193
    .line 3194
    .line 3195
    move-result-object v1

    .line 3196
    iget-object v1, v1, La/a2r;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 3197
    .line 3198
    invoke-virtual {v1, v7}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 3199
    .line 3200
    .line 3201
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3202
    .line 3203
    .line 3204
    move-result-object v1

    .line 3205
    iget-object v1, v1, La/a2r;->f:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 3206
    .line 3207
    invoke-virtual {v1, v7}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 3208
    .line 3209
    .line 3210
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3211
    .line 3212
    .line 3213
    move-result-object v1

    .line 3214
    iget-object v1, v1, La/a2r;->f:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 3215
    .line 3216
    invoke-virtual {v1, v7}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 3217
    .line 3218
    .line 3219
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3220
    .line 3221
    .line 3222
    move-result-object v1

    .line 3223
    iget-object v1, v1, La/a2r;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 3224
    .line 3225
    check-cast v0, La/pk30;

    .line 3226
    .line 3227
    iget-object v0, v0, La/pk30;->a:La/jkm;

    .line 3228
    .line 3229
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 3230
    .line 3231
    .line 3232
    const/4 v5, 0x1

    .line 3233
    invoke-virtual {v13, v5}, La/ik30;->J0(Z)V

    .line 3234
    .line 3235
    .line 3236
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3237
    .line 3238
    .line 3239
    move-result-object v0

    .line 3240
    iget-object v0, v0, La/a2r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 3241
    .line 3242
    const/16 v2, 0x8

    .line 3243
    .line 3244
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3245
    .line 3246
    .line 3247
    invoke-virtual {v13}, La/ik30;->G0()La/a2r;

    .line 3248
    .line 3249
    .line 3250
    move-result-object v0

    .line 3251
    iget-object v0, v0, La/a2r;->b:La/ewe;

    .line 3252
    .line 3253
    iget-object v0, v0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 3254
    .line 3255
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3256
    .line 3257
    .line 3258
    invoke-virtual {v13}, La/ik30;->I0()V

    .line 3259
    .line 3260
    .line 3261
    :goto_30
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3262
    .line 3263
    goto :goto_31

    .line 3264
    :cond_5f
    invoke-static {}, La/t9f;->b()V

    .line 3265
    .line 3266
    .line 3267
    const/4 v12, 0x0

    .line 3268
    :goto_31
    return-object v12

    .line 3269
    :pswitch_1b
    move-object/from16 v0, p1

    .line 3270
    .line 3271
    check-cast v0, Ljava/lang/Boolean;

    .line 3272
    .line 3273
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3274
    .line 3275
    .line 3276
    move-result v0

    .line 3277
    move-object/from16 v1, p2

    .line 3278
    .line 3279
    check-cast v1, La/yje;

    .line 3280
    .line 3281
    check-cast v13, La/kn20;

    .line 3282
    .line 3283
    iget-object v1, v13, La/kn20;->j:La/p7m0;

    .line 3284
    .line 3285
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 3286
    .line 3287
    .line 3288
    move-result-object v1

    .line 3289
    instance-of v1, v1, La/li20;

    .line 3290
    .line 3291
    if-nez v1, :cond_60

    .line 3292
    .line 3293
    goto :goto_32

    .line 3294
    :cond_60
    invoke-static {v13}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 3295
    .line 3296
    .line 3297
    move-result-object v2

    .line 3298
    iget-object v1, v13, La/kn20;->e:La/mne;

    .line 3299
    .line 3300
    iget-object v5, v1, La/mne;->b:La/dvj;

    .line 3301
    .line 3302
    new-instance v3, La/km00;

    .line 3303
    .line 3304
    const/16 v1, 0x15

    .line 3305
    .line 3306
    invoke-direct {v3, v13, v1}, La/km00;-><init>(Ljava/lang/Object;B)V

    .line 3307
    .line 3308
    .line 3309
    new-instance v6, La/w620;

    .line 3310
    .line 3311
    const/4 v10, 0x0

    .line 3312
    invoke-direct {v6, v0, v13, v10}, La/w620;-><init>(ZLa/kn20;La/yje;)V

    .line 3313
    .line 3314
    .line 3315
    const/16 v7, 0xa

    .line 3316
    .line 3317
    const/4 v4, 0x0

    .line 3318
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 3319
    .line 3320
    .line 3321
    :goto_32
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3322
    .line 3323
    return-object v0

    .line 3324
    :pswitch_1c
    move-object/from16 v0, p1

    .line 3325
    .line 3326
    check-cast v0, Ljava/lang/Throwable;

    .line 3327
    .line 3328
    move-object/from16 v1, p2

    .line 3329
    .line 3330
    check-cast v1, La/yje;

    .line 3331
    .line 3332
    check-cast v13, La/qg20;

    .line 3333
    .line 3334
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 3335
    .line 3336
    if-nez v1, :cond_61

    .line 3337
    .line 3338
    iget-object v1, v13, La/qg20;->t:La/duj;

    .line 3339
    .line 3340
    new-instance v2, La/ed20;

    .line 3341
    .line 3342
    const/4 v8, 0x2

    .line 3343
    invoke-direct {v2, v13, v8}, La/ed20;-><init>(La/qg20;B)V

    .line 3344
    .line 3345
    .line 3346
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 3347
    .line 3348
    .line 3349
    goto :goto_33

    .line 3350
    :cond_61
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3351
    .line 3352
    .line 3353
    :goto_33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3354
    .line 3355
    return-object v0

    .line 3356
    nop

    .line 3357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method
