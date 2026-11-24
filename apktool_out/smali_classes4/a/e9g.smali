.class public final La/e9g;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/e9g;->i:B

    iput-object p1, p0, La/e9g;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/e9g;->i:B

    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    iput-object p2, p0, La/e9g;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/rek0;->b:La/rek0;

    .line 4
    .line 5
    iget-object v2, v0, La/e9g;->k:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v8, v2

    .line 8
    check-cast v8, La/u8k;

    .line 9
    .line 10
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/nak;

    .line 13
    .line 14
    sget-object v2, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_7

    .line 21
    .line 22
    instance-of v3, v0, La/kak;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    check-cast v0, La/kak;

    .line 27
    .line 28
    iget-object v0, v0, La/kak;->a:Ljava/lang/String;

    .line 29
    .line 30
    sget-object v1, La/u8k;->Q1:La/kwd;

    .line 31
    .line 32
    invoke-virtual {v8}, La/u8k;->G0()La/z0r;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v1, v1, La/z0r;->e:Lcom/google/android/material/textfield/TextInputLayout;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-nez v0, :cond_0

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_0
    invoke-virtual {v8}, La/u8k;->G0()La/z0r;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v1, v1, La/z0r;->e:Lcom/google/android/material/textfield/TextInputLayout;

    .line 54
    .line 55
    const v2, 0x7f080caf

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :cond_1
    instance-of v3, v0, La/jak;

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    check-cast v0, La/jak;

    .line 72
    .line 73
    iget-object v11, v0, La/jak;->a:Ljava/lang/String;

    .line 74
    .line 75
    sget-object v0, La/u8k;->Q1:La/kwd;

    .line 76
    .line 77
    iget-object v0, v8, La/u8k;->L1:La/ii;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 82
    .line 83
    const v1, 0x7f1307bb

    .line 84
    .line 85
    .line 86
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    const v1, 0x7f130e5d

    .line 91
    .line 92
    .line 93
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    sget-object v18, La/n12;->b:La/n12;

    .line 101
    .line 102
    const/16 v19, 0x0

    .line 103
    .line 104
    const/16 v20, 0x5f8

    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    const/4 v14, 0x0

    .line 108
    const/4 v15, 0x0

    .line 109
    const/16 v16, 0x0

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_2
    const-string v0, "actionDialogManager"

    .line 128
    .line 129
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v2

    .line 133
    :cond_3
    instance-of v3, v0, La/mak;

    .line 134
    .line 135
    const-string v4, "snackbarManager"

    .line 136
    .line 137
    if-eqz v3, :cond_5

    .line 138
    .line 139
    check-cast v0, La/mak;

    .line 140
    .line 141
    iget-object v0, v0, La/mak;->a:Ljava/lang/String;

    .line 142
    .line 143
    sget-object v3, La/u8k;->Q1:La/kwd;

    .line 144
    .line 145
    iget-object v9, v8, La/u8k;->M1:La/wdk0;

    .line 146
    .line 147
    if-eqz v9, :cond_4

    .line 148
    .line 149
    new-instance v4, La/xdk0;

    .line 150
    .line 151
    const/4 v6, 0x0

    .line 152
    const/16 v7, 0x7c

    .line 153
    .line 154
    const/4 v3, 0x0

    .line 155
    move-object v2, v0

    .line 156
    move-object v0, v4

    .line 157
    const/4 v4, 0x0

    .line 158
    const/4 v5, 0x0

    .line 159
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 160
    .line 161
    .line 162
    move-object v3, v9

    .line 163
    const/4 v9, 0x0

    .line 164
    const/16 v10, 0x3fc

    .line 165
    .line 166
    const/4 v7, 0x0

    .line 167
    move-object v5, v8

    .line 168
    const/4 v8, 0x0

    .line 169
    move-object v4, v0

    .line 170
    invoke-static/range {v3 .. v10}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 171
    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_4
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v2

    .line 178
    :cond_5
    instance-of v0, v0, La/lak;

    .line 179
    .line 180
    if-eqz v0, :cond_7

    .line 181
    .line 182
    sget-object v0, La/u8k;->Q1:La/kwd;

    .line 183
    .line 184
    iget-object v9, v8, La/u8k;->M1:La/wdk0;

    .line 185
    .line 186
    if-eqz v9, :cond_6

    .line 187
    .line 188
    new-instance v0, La/xdk0;

    .line 189
    .line 190
    const v2, 0x7f13131f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v8, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    const/4 v6, 0x0

    .line 201
    const/16 v7, 0x7c

    .line 202
    .line 203
    const/4 v3, 0x0

    .line 204
    const/4 v4, 0x0

    .line 205
    const/4 v5, 0x0

    .line 206
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 207
    .line 208
    .line 209
    move-object v3, v9

    .line 210
    const/4 v9, 0x0

    .line 211
    const/16 v10, 0x3fc

    .line 212
    .line 213
    const/4 v7, 0x0

    .line 214
    move-object v5, v8

    .line 215
    const/4 v8, 0x0

    .line 216
    move-object v4, v0

    .line 217
    invoke-static/range {v3 .. v10}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 218
    .line 219
    .line 220
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object v0

    .line 223
    :cond_6
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v2

    .line 227
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 228
    .line 229
    .line 230
    return-object v2
.end method

.method private final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/rek0;->b:La/rek0;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    iget-object v4, v0, La/e9g;->k:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v8, v4

    .line 13
    check-cast v8, La/atk;

    .line 14
    .line 15
    iget-object v4, v8, La/atk;->w:La/luu;

    .line 16
    .line 17
    iget-object v5, v8, La/atk;->s:La/ctf0;

    .line 18
    .line 19
    iget-object v6, v8, La/atk;->y:La/zr1;

    .line 20
    .line 21
    iget-object v7, v8, La/atk;->x:La/ih5;

    .line 22
    .line 23
    iget-object v9, v8, La/atk;->q:La/mne;

    .line 24
    .line 25
    iget-object v10, v8, La/atk;->p:La/hzg;

    .line 26
    .line 27
    sget-object v11, La/wne;->a:La/wne;

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, La/hpk;

    .line 35
    .line 36
    sget-object v11, La/pok;->a:La/pok;

    .line 37
    .line 38
    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v11

    .line 42
    if-eqz v11, :cond_0

    .line 43
    .line 44
    sget v0, La/atk;->J:I

    .line 45
    .line 46
    check-cast v10, La/uzg;

    .line 47
    .line 48
    invoke-virtual {v10}, La/uzg;->a()V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_f

    .line 52
    .line 53
    :cond_0
    sget-object v11, La/epk;->a:La/epk;

    .line 54
    .line 55
    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v11

    .line 59
    if-eqz v11, :cond_1

    .line 60
    .line 61
    sget v0, La/atk;->J:I

    .line 62
    .line 63
    iget-object v0, v8, La/atk;->H:La/n0o0;

    .line 64
    .line 65
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, La/ise0;

    .line 70
    .line 71
    invoke-virtual {v0}, La/ise0;->f()V

    .line 72
    .line 73
    .line 74
    iget-object v0, v8, La/atk;->I:La/n0o0;

    .line 75
    .line 76
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, La/ise0;

    .line 81
    .line 82
    invoke-virtual {v0}, La/ise0;->f()V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_f

    .line 86
    .line 87
    :cond_1
    instance-of v11, v0, La/yok;

    .line 88
    .line 89
    const/4 v12, 0x2

    .line 90
    const/4 v13, 0x0

    .line 91
    const/4 v14, 0x0

    .line 92
    if-eqz v11, :cond_d

    .line 93
    .line 94
    check-cast v0, La/yok;

    .line 95
    .line 96
    sget v1, La/atk;->J:I

    .line 97
    .line 98
    :try_start_0
    iget-object v0, v0, La/yok;->a:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    sparse-switch v1, :sswitch_data_0

    .line 105
    .line 106
    .line 107
    goto/16 :goto_f

    .line 108
    .line 109
    :sswitch_0
    const-string v1, "HEADER_ACTIVE_TEAMS"

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_2

    .line 116
    .line 117
    goto/16 :goto_f

    .line 118
    .line 119
    :cond_2
    invoke-virtual {v8}, La/atk;->P()V

    .line 120
    .line 121
    .line 122
    goto/16 :goto_f

    .line 123
    .line 124
    :sswitch_1
    const-string v1, "MATCH_RESULT_CHIP"

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-nez v0, :cond_3

    .line 131
    .line 132
    goto/16 :goto_f

    .line 133
    .line 134
    :cond_3
    invoke-virtual {v8}, La/atk;->T()V

    .line 135
    .line 136
    .line 137
    goto/16 :goto_f

    .line 138
    .line 139
    :sswitch_2
    const-string v1, "TRANSFER_CHIP"

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_49

    .line 146
    .line 147
    invoke-virtual {v8}, La/atk;->V()V

    .line 148
    .line 149
    .line 150
    goto/16 :goto_f

    .line 151
    .line 152
    :sswitch_3
    const-string v1, "CALENDAR_CHIP"

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-nez v0, :cond_4

    .line 159
    .line 160
    goto/16 :goto_f

    .line 161
    .line 162
    :cond_4
    invoke-virtual {v8}, La/atk;->Q()V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_f

    .line 166
    .line 167
    :sswitch_4
    const-string v1, "LEADERBOARD_CHIP"

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-nez v0, :cond_5

    .line 174
    .line 175
    goto/16 :goto_f

    .line 176
    .line 177
    :cond_5
    invoke-virtual {v8, v2}, La/atk;->S(Z)V

    .line 178
    .line 179
    .line 180
    goto/16 :goto_f

    .line 181
    .line 182
    :sswitch_5
    const-string v1, "HEADER_CHAMPIONSHIPS"

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-nez v0, :cond_6

    .line 189
    .line 190
    goto/16 :goto_f

    .line 191
    .line 192
    :cond_6
    invoke-virtual {v8}, La/atk;->M()V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_f

    .line 196
    .line 197
    :sswitch_6
    const-string v1, "HEADER_LIVE_GAMES"

    .line 198
    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-nez v0, :cond_7

    .line 204
    .line 205
    goto/16 :goto_f

    .line 206
    .line 207
    :cond_7
    invoke-virtual {v8}, La/atk;->O()V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_f

    .line 211
    .line 212
    :sswitch_7
    const-string v1, "META_HEROES_CHIP"

    .line 213
    .line 214
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_8

    .line 219
    .line 220
    goto/16 :goto_f

    .line 221
    .line 222
    :cond_8
    iget-object v0, v8, La/atk;->o:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 223
    .line 224
    iget-wide v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 225
    .line 226
    check-cast v10, La/uzg;

    .line 227
    .line 228
    iget-object v2, v10, La/uzg;->a:La/oeg0;

    .line 229
    .line 230
    invoke-virtual {v2}, La/oeg0;->c()La/i1w0;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    new-instance v3, La/pzg;

    .line 235
    .line 236
    invoke-direct {v3, v10, v0, v1, v14}, La/pzg;-><init>(La/uzg;JB)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_f

    .line 243
    .line 244
    :sswitch_8
    const-string v1, "HEADER_LINE_GAMES"

    .line 245
    .line 246
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-nez v0, :cond_9

    .line 251
    .line 252
    goto/16 :goto_f

    .line 253
    .line 254
    :cond_9
    invoke-virtual {v8}, La/atk;->N()V

    .line 255
    .line 256
    .line 257
    goto/16 :goto_f

    .line 258
    .line 259
    :sswitch_9
    const-string v1, "EXPAND_MARKET_CHIP"

    .line 260
    .line 261
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-nez v0, :cond_a

    .line 266
    .line 267
    goto/16 :goto_f

    .line 268
    .line 269
    :cond_a
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    iget-object v1, v9, La/mne;->a:La/rwj;

    .line 274
    .line 275
    new-instance v2, La/ysk;

    .line 276
    .line 277
    invoke-direct {v2, v8, v13, v12}, La/ysk;-><init>(La/atk;La/yje;B)V

    .line 278
    .line 279
    .line 280
    invoke-static {v0, v1, v13, v2, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 281
    .line 282
    .line 283
    goto/16 :goto_f

    .line 284
    .line 285
    :sswitch_a
    const-string v1, "HEADER_CHAMPIONSHIPS_REAL_LIVE"

    .line 286
    .line 287
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-nez v0, :cond_b

    .line 292
    .line 293
    goto/16 :goto_f

    .line 294
    .line 295
    :cond_b
    invoke-virtual {v8, v2}, La/atk;->U(Z)V

    .line 296
    .line 297
    .line 298
    goto/16 :goto_f

    .line 299
    .line 300
    :sswitch_b
    const-string v1, "HEADER_CHAMPIONSHIPS_REAL_LINE"

    .line 301
    .line 302
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-nez v0, :cond_c

    .line 307
    .line 308
    goto/16 :goto_f

    .line 309
    .line 310
    :cond_c
    invoke-virtual {v8, v14}, La/atk;->U(Z)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 311
    .line 312
    .line 313
    goto/16 :goto_f

    .line 314
    .line 315
    :catch_0
    move-exception v0

    .line 316
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_f

    .line 320
    .line 321
    :cond_d
    instance-of v11, v0, La/wok;

    .line 322
    .line 323
    if-eqz v11, :cond_e

    .line 324
    .line 325
    check-cast v0, La/wok;

    .line 326
    .line 327
    sget v1, La/atk;->J:I

    .line 328
    .line 329
    invoke-virtual {v8, v0}, La/atk;->R(La/wok;)V

    .line 330
    .line 331
    .line 332
    goto/16 :goto_f

    .line 333
    .line 334
    :cond_e
    instance-of v11, v0, La/cpk;

    .line 335
    .line 336
    const/16 v16, 0x3

    .line 337
    .line 338
    const/16 p0, 0x4

    .line 339
    .line 340
    const/4 v15, 0x5

    .line 341
    move/from16 p1, v12

    .line 342
    .line 343
    const-string v12, "cyber_champs_games"

    .line 344
    .line 345
    move/from16 v17, v2

    .line 346
    .line 347
    const/16 v13, 0xa

    .line 348
    .line 349
    sget-object v19, La/yvg;->d:La/yvg;

    .line 350
    .line 351
    sget-object v20, La/pug;->d:La/pug;

    .line 352
    .line 353
    sget-object v21, La/oxg;->d:La/oxg;

    .line 354
    .line 355
    sget-object v22, La/trg;->d:La/trg;

    .line 356
    .line 357
    sget-object v23, La/ttg;->d:La/ttg;

    .line 358
    .line 359
    if-eqz v11, :cond_11

    .line 360
    .line 361
    check-cast v0, La/cpk;

    .line 362
    .line 363
    sget v3, La/atk;->J:I

    .line 364
    .line 365
    new-array v3, v15, [La/yxg;

    .line 366
    .line 367
    aput-object v23, v3, v14

    .line 368
    .line 369
    aput-object v22, v3, v17

    .line 370
    .line 371
    aput-object v21, v3, p1

    .line 372
    .line 373
    aput-object v20, v3, v16

    .line 374
    .line 375
    aput-object v19, v3, p0

    .line 376
    .line 377
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    new-instance v4, Ljava/util/ArrayList;

    .line 382
    .line 383
    invoke-static {v3, v13}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 384
    .line 385
    .line 386
    move-result v9

    .line 387
    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 388
    .line 389
    .line 390
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v9

    .line 398
    if-eqz v9, :cond_f

    .line 399
    .line 400
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v9

    .line 404
    check-cast v9, La/yxg;

    .line 405
    .line 406
    move-object/from16 p0, v3

    .line 407
    .line 408
    iget-wide v2, v9, La/yxg;->a:J

    .line 409
    .line 410
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-object/from16 v3, p0

    .line 418
    .line 419
    goto :goto_0

    .line 420
    :cond_f
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    check-cast v2, La/ksk;

    .line 425
    .line 426
    iget-object v2, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 427
    .line 428
    iget-wide v2, v2, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 429
    .line 430
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v2

    .line 438
    if-eqz v2, :cond_10

    .line 439
    .line 440
    sget-object v1, La/r1g;->u:La/r1g;

    .line 441
    .line 442
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    check-cast v2, La/ksk;

    .line 447
    .line 448
    iget-object v2, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 449
    .line 450
    iget-wide v2, v2, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 451
    .line 452
    invoke-virtual {v7, v1, v2, v3}, La/ih5;->p(La/r1g;J)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    check-cast v1, La/ksk;

    .line 460
    .line 461
    iget-object v1, v1, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 462
    .line 463
    iget-wide v1, v1, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 464
    .line 465
    invoke-virtual {v6, v1, v2, v12}, La/zr1;->z(JLjava/lang/String;)V

    .line 466
    .line 467
    .line 468
    iget-wide v1, v0, La/cpk;->a:J

    .line 469
    .line 470
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    check-cast v3, La/ksk;

    .line 475
    .line 476
    iget-object v3, v3, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 477
    .line 478
    iget-wide v14, v3, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 479
    .line 480
    iget-object v0, v0, La/cpk;->b:Ljava/lang/String;

    .line 481
    .line 482
    sget-object v19, La/k1g;->b:La/k1g;

    .line 483
    .line 484
    move-object v13, v10

    .line 485
    check-cast v13, La/uzg;

    .line 486
    .line 487
    move-object/from16 v18, v0

    .line 488
    .line 489
    move-wide/from16 v16, v1

    .line 490
    .line 491
    invoke-virtual/range {v13 .. v19}, La/uzg;->n(JJLjava/lang/String;La/k1g;)V

    .line 492
    .line 493
    .line 494
    goto/16 :goto_f

    .line 495
    .line 496
    :cond_10
    new-instance v9, La/isk;

    .line 497
    .line 498
    new-instance v0, La/xdk0;

    .line 499
    .line 500
    new-array v2, v14, [Ljava/lang/Object;

    .line 501
    .line 502
    iget-object v3, v5, La/ctf0;->b:La/lsm0;

    .line 503
    .line 504
    invoke-static {v2, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    const v11, 0x7f131302

    .line 509
    .line 510
    .line 511
    invoke-virtual {v3, v11, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    const/4 v6, 0x0

    .line 516
    const/16 v7, 0x7c

    .line 517
    .line 518
    const/4 v3, 0x0

    .line 519
    const/4 v4, 0x0

    .line 520
    const/4 v5, 0x0

    .line 521
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 522
    .line 523
    .line 524
    invoke-direct {v9, v0}, La/isk;-><init>(La/xdk0;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v8, v9}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    goto/16 :goto_f

    .line 531
    .line 532
    :cond_11
    instance-of v2, v0, La/tok;

    .line 533
    .line 534
    const-wide/16 v24, 0x28

    .line 535
    .line 536
    if-eqz v2, :cond_20

    .line 537
    .line 538
    check-cast v0, La/tok;

    .line 539
    .line 540
    iget-wide v0, v0, La/tok;->a:J

    .line 541
    .line 542
    sget v2, La/atk;->J:I

    .line 543
    .line 544
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    check-cast v2, La/ksk;

    .line 549
    .line 550
    iget-object v2, v2, La/ksk;->d:La/j0g0;

    .line 551
    .line 552
    if-eqz v2, :cond_49

    .line 553
    .line 554
    iget-object v2, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 555
    .line 556
    instance-of v5, v2, La/g0g0;

    .line 557
    .line 558
    if-eqz v5, :cond_12

    .line 559
    .line 560
    const/4 v2, 0x0

    .line 561
    :cond_12
    check-cast v2, La/kuk;

    .line 562
    .line 563
    if-eqz v2, :cond_49

    .line 564
    .line 565
    iget-object v5, v2, La/kuk;->a:La/j0g0;

    .line 566
    .line 567
    if-eqz v5, :cond_14

    .line 568
    .line 569
    iget-object v5, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 570
    .line 571
    instance-of v6, v5, La/g0g0;

    .line 572
    .line 573
    if-eqz v6, :cond_13

    .line 574
    .line 575
    const/4 v5, 0x0

    .line 576
    :cond_13
    check-cast v5, Ljava/util/List;

    .line 577
    .line 578
    goto :goto_1

    .line 579
    :cond_14
    const/4 v5, 0x0

    .line 580
    :goto_1
    if-nez v5, :cond_15

    .line 581
    .line 582
    sget-object v5, La/iun;->a:La/iun;

    .line 583
    .line 584
    :cond_15
    iget-object v2, v2, La/kuk;->b:La/j0g0;

    .line 585
    .line 586
    if-eqz v2, :cond_17

    .line 587
    .line 588
    iget-object v2, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 589
    .line 590
    instance-of v6, v2, La/g0g0;

    .line 591
    .line 592
    if-eqz v6, :cond_16

    .line 593
    .line 594
    const/4 v2, 0x0

    .line 595
    :cond_16
    check-cast v2, Ljava/util/List;

    .line 596
    .line 597
    goto :goto_2

    .line 598
    :cond_17
    const/4 v2, 0x0

    .line 599
    :goto_2
    if-nez v2, :cond_18

    .line 600
    .line 601
    sget-object v2, La/iun;->a:La/iun;

    .line 602
    .line 603
    :cond_18
    invoke-static {v5, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    :cond_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 612
    .line 613
    .line 614
    move-result v5

    .line 615
    if-eqz v5, :cond_1a

    .line 616
    .line 617
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v5

    .line 621
    move-object v6, v5

    .line 622
    check-cast v6, La/nyg;

    .line 623
    .line 624
    iget-wide v6, v6, La/nyg;->g:J

    .line 625
    .line 626
    cmp-long v6, v6, v0

    .line 627
    .line 628
    if-nez v6, :cond_19

    .line 629
    .line 630
    goto :goto_3

    .line 631
    :cond_1a
    const/4 v5, 0x0

    .line 632
    :goto_3
    check-cast v5, La/nyg;

    .line 633
    .line 634
    if-eqz v5, :cond_49

    .line 635
    .line 636
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    check-cast v2, La/ksk;

    .line 641
    .line 642
    iget-object v2, v2, La/ksk;->b:La/sff0;

    .line 643
    .line 644
    iget-object v2, v2, La/sff0;->c:La/ech;

    .line 645
    .line 646
    iget-object v2, v2, La/ech;->p:Ljava/util/List;

    .line 647
    .line 648
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    iget-object v1, v4, La/luu;->a:La/nok0;

    .line 657
    .line 658
    invoke-virtual {v1}, La/nok0;->a()Ljava/util/List;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    :cond_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 667
    .line 668
    .line 669
    move-result v2

    .line 670
    if-eqz v2, :cond_1c

    .line 671
    .line 672
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    move-object v4, v2

    .line 677
    check-cast v4, La/lok0;

    .line 678
    .line 679
    iget v6, v4, La/lok0;->a:I

    .line 680
    .line 681
    iget v7, v5, La/nyg;->h:I

    .line 682
    .line 683
    if-ne v6, v7, :cond_1b

    .line 684
    .line 685
    iget-object v4, v4, La/lok0;->t:Ljava/util/List;

    .line 686
    .line 687
    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    move-result v4

    .line 691
    if-eqz v4, :cond_1b

    .line 692
    .line 693
    move-object v13, v2

    .line 694
    goto :goto_4

    .line 695
    :cond_1c
    const/4 v13, 0x0

    .line 696
    :goto_4
    check-cast v13, La/lok0;

    .line 697
    .line 698
    iget-wide v1, v5, La/nyg;->i:J

    .line 699
    .line 700
    cmp-long v3, v1, v24

    .line 701
    .line 702
    if-nez v3, :cond_1d

    .line 703
    .line 704
    iget-wide v1, v5, La/nyg;->l:J

    .line 705
    .line 706
    :cond_1d
    move-wide/from16 v16, v1

    .line 707
    .line 708
    if-eqz v0, :cond_1e

    .line 709
    .line 710
    check-cast v10, La/uzg;

    .line 711
    .line 712
    invoke-virtual {v10}, La/uzg;->g()V

    .line 713
    .line 714
    .line 715
    goto/16 :goto_f

    .line 716
    .line 717
    :cond_1e
    if-eqz v13, :cond_1f

    .line 718
    .line 719
    iget v0, v13, La/lok0;->a:I

    .line 720
    .line 721
    int-to-long v0, v0

    .line 722
    iget-object v2, v13, La/lok0;->b:Ljava/lang/String;

    .line 723
    .line 724
    check-cast v10, La/uzg;

    .line 725
    .line 726
    invoke-virtual {v10, v0, v1, v2}, La/uzg;->o(JLjava/lang/String;)V

    .line 727
    .line 728
    .line 729
    goto/16 :goto_f

    .line 730
    .line 731
    :cond_1f
    iget-wide v0, v5, La/nyg;->g:J

    .line 732
    .line 733
    iget-object v15, v5, La/nyg;->f:Ljava/lang/String;

    .line 734
    .line 735
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    check-cast v2, La/ksk;

    .line 740
    .line 741
    iget-object v2, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 742
    .line 743
    iget-object v2, v2, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 744
    .line 745
    iget-byte v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 746
    .line 747
    sget-object v3, La/k1g;->b:La/k1g;

    .line 748
    .line 749
    move-object v14, v10

    .line 750
    check-cast v14, La/uzg;

    .line 751
    .line 752
    move-wide/from16 v18, v0

    .line 753
    .line 754
    move/from16 v20, v2

    .line 755
    .line 756
    invoke-virtual/range {v14 .. v20}, La/uzg;->f(Ljava/lang/String;JJI)V

    .line 757
    .line 758
    .line 759
    goto/16 :goto_f

    .line 760
    .line 761
    :cond_20
    instance-of v2, v0, La/dpk;

    .line 762
    .line 763
    if-eqz v2, :cond_2a

    .line 764
    .line 765
    check-cast v0, La/dpk;

    .line 766
    .line 767
    iget-wide v0, v0, La/dpk;->a:J

    .line 768
    .line 769
    sget v2, La/atk;->J:I

    .line 770
    .line 771
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    check-cast v2, La/ksk;

    .line 776
    .line 777
    iget-object v2, v2, La/ksk;->d:La/j0g0;

    .line 778
    .line 779
    if-eqz v2, :cond_49

    .line 780
    .line 781
    iget-object v2, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 782
    .line 783
    instance-of v5, v2, La/g0g0;

    .line 784
    .line 785
    if-eqz v5, :cond_21

    .line 786
    .line 787
    const/4 v2, 0x0

    .line 788
    :cond_21
    check-cast v2, La/kuk;

    .line 789
    .line 790
    if-eqz v2, :cond_49

    .line 791
    .line 792
    iget-object v2, v2, La/kuk;->j:Ljava/lang/Object;

    .line 793
    .line 794
    instance-of v5, v2, La/g0g0;

    .line 795
    .line 796
    if-eqz v5, :cond_22

    .line 797
    .line 798
    const/4 v2, 0x0

    .line 799
    :cond_22
    check-cast v2, Ljava/util/List;

    .line 800
    .line 801
    if-eqz v2, :cond_49

    .line 802
    .line 803
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 804
    .line 805
    .line 806
    move-result-object v2

    .line 807
    :cond_23
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 808
    .line 809
    .line 810
    move-result v5

    .line 811
    if-eqz v5, :cond_24

    .line 812
    .line 813
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v5

    .line 817
    move-object v6, v5

    .line 818
    check-cast v6, La/xah;

    .line 819
    .line 820
    iget-wide v6, v6, La/xah;->g:J

    .line 821
    .line 822
    cmp-long v6, v6, v0

    .line 823
    .line 824
    if-nez v6, :cond_23

    .line 825
    .line 826
    goto :goto_5

    .line 827
    :cond_24
    const/4 v5, 0x0

    .line 828
    :goto_5
    check-cast v5, La/xah;

    .line 829
    .line 830
    if-eqz v5, :cond_49

    .line 831
    .line 832
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v2

    .line 836
    check-cast v2, La/ksk;

    .line 837
    .line 838
    iget-object v2, v2, La/ksk;->b:La/sff0;

    .line 839
    .line 840
    iget-object v2, v2, La/sff0;->c:La/ech;

    .line 841
    .line 842
    iget-object v2, v2, La/ech;->p:Ljava/util/List;

    .line 843
    .line 844
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 849
    .line 850
    .line 851
    move-result v0

    .line 852
    iget-object v1, v4, La/luu;->a:La/nok0;

    .line 853
    .line 854
    invoke-virtual {v1}, La/nok0;->a()Ljava/util/List;

    .line 855
    .line 856
    .line 857
    move-result-object v1

    .line 858
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    :cond_25
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 863
    .line 864
    .line 865
    move-result v2

    .line 866
    if-eqz v2, :cond_26

    .line 867
    .line 868
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v2

    .line 872
    move-object v4, v2

    .line 873
    check-cast v4, La/lok0;

    .line 874
    .line 875
    iget v6, v4, La/lok0;->a:I

    .line 876
    .line 877
    iget v7, v5, La/xah;->h:I

    .line 878
    .line 879
    if-ne v6, v7, :cond_25

    .line 880
    .line 881
    iget-object v4, v4, La/lok0;->t:Ljava/util/List;

    .line 882
    .line 883
    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 884
    .line 885
    .line 886
    move-result v4

    .line 887
    if-eqz v4, :cond_25

    .line 888
    .line 889
    move-object v13, v2

    .line 890
    goto :goto_6

    .line 891
    :cond_26
    const/4 v13, 0x0

    .line 892
    :goto_6
    check-cast v13, La/lok0;

    .line 893
    .line 894
    iget-wide v1, v5, La/xah;->i:J

    .line 895
    .line 896
    cmp-long v3, v1, v24

    .line 897
    .line 898
    if-nez v3, :cond_27

    .line 899
    .line 900
    iget-wide v1, v5, La/xah;->k:J

    .line 901
    .line 902
    :cond_27
    move-wide/from16 v16, v1

    .line 903
    .line 904
    if-eqz v0, :cond_28

    .line 905
    .line 906
    check-cast v10, La/uzg;

    .line 907
    .line 908
    invoke-virtual {v10}, La/uzg;->g()V

    .line 909
    .line 910
    .line 911
    goto/16 :goto_f

    .line 912
    .line 913
    :cond_28
    if-eqz v13, :cond_29

    .line 914
    .line 915
    iget v0, v13, La/lok0;->a:I

    .line 916
    .line 917
    int-to-long v0, v0

    .line 918
    iget-object v2, v13, La/lok0;->b:Ljava/lang/String;

    .line 919
    .line 920
    check-cast v10, La/uzg;

    .line 921
    .line 922
    invoke-virtual {v10, v0, v1, v2}, La/uzg;->o(JLjava/lang/String;)V

    .line 923
    .line 924
    .line 925
    goto/16 :goto_f

    .line 926
    .line 927
    :cond_29
    iget-wide v0, v5, La/xah;->g:J

    .line 928
    .line 929
    iget-object v15, v5, La/xah;->f:Ljava/lang/String;

    .line 930
    .line 931
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v2

    .line 935
    check-cast v2, La/ksk;

    .line 936
    .line 937
    iget-object v2, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 938
    .line 939
    iget-object v2, v2, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 940
    .line 941
    iget-byte v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 942
    .line 943
    sget-object v3, La/k1g;->b:La/k1g;

    .line 944
    .line 945
    move-object v14, v10

    .line 946
    check-cast v14, La/uzg;

    .line 947
    .line 948
    move-wide/from16 v18, v0

    .line 949
    .line 950
    move/from16 v20, v2

    .line 951
    .line 952
    invoke-virtual/range {v14 .. v20}, La/uzg;->f(Ljava/lang/String;JJI)V

    .line 953
    .line 954
    .line 955
    goto/16 :goto_f

    .line 956
    .line 957
    :cond_2a
    instance-of v2, v0, La/bpk;

    .line 958
    .line 959
    if-eqz v2, :cond_2c

    .line 960
    .line 961
    move-object v2, v0

    .line 962
    check-cast v2, La/bpk;

    .line 963
    .line 964
    sget v0, La/atk;->J:I

    .line 965
    .line 966
    iget-object v0, v8, La/i3t0;->i:La/ocj;

    .line 967
    .line 968
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 969
    .line 970
    :cond_2b
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 975
    .line 976
    .line 977
    iget-object v1, v8, La/i3t0;->f:La/oyg0;

    .line 978
    .line 979
    move-object v4, v0

    .line 980
    check-cast v4, La/ksk;

    .line 981
    .line 982
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 983
    .line 984
    .line 985
    iget-object v1, v2, La/bpk;->a:La/sip;

    .line 986
    .line 987
    const/16 v5, 0x17f

    .line 988
    .line 989
    const/4 v6, 0x0

    .line 990
    invoke-static {v4, v6, v6, v1, v5}, La/ksk;->a(La/ksk;La/j0g0;La/j0g0;La/sip;I)La/ksk;

    .line 991
    .line 992
    .line 993
    move-result-object v1

    .line 994
    invoke-virtual {v3, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 995
    .line 996
    .line 997
    move-result v0

    .line 998
    if-eqz v0, :cond_2b

    .line 999
    .line 1000
    goto/16 :goto_f

    .line 1001
    .line 1002
    :cond_2c
    instance-of v2, v0, La/gpk;

    .line 1003
    .line 1004
    if-eqz v2, :cond_38

    .line 1005
    .line 1006
    check-cast v0, La/gpk;

    .line 1007
    .line 1008
    sget v1, La/atk;->J:I

    .line 1009
    .line 1010
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v1

    .line 1014
    check-cast v1, La/ksk;

    .line 1015
    .line 1016
    iget-object v1, v1, La/ksk;->d:La/j0g0;

    .line 1017
    .line 1018
    if-eqz v1, :cond_2e

    .line 1019
    .line 1020
    iget-object v6, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 1021
    .line 1022
    instance-of v1, v6, La/g0g0;

    .line 1023
    .line 1024
    if-eqz v1, :cond_2d

    .line 1025
    .line 1026
    const/4 v6, 0x0

    .line 1027
    :cond_2d
    check-cast v6, La/kuk;

    .line 1028
    .line 1029
    goto :goto_7

    .line 1030
    :cond_2e
    const/4 v6, 0x0

    .line 1031
    :goto_7
    if-eqz v6, :cond_30

    .line 1032
    .line 1033
    iget-object v1, v6, La/kuk;->c:La/j0g0;

    .line 1034
    .line 1035
    if-eqz v1, :cond_30

    .line 1036
    .line 1037
    iget-object v1, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 1038
    .line 1039
    instance-of v2, v1, La/g0g0;

    .line 1040
    .line 1041
    if-eqz v2, :cond_2f

    .line 1042
    .line 1043
    const/4 v1, 0x0

    .line 1044
    :cond_2f
    check-cast v1, La/btk;

    .line 1045
    .line 1046
    if-eqz v1, :cond_30

    .line 1047
    .line 1048
    iget-object v1, v1, La/btk;->a:Ljava/util/List;

    .line 1049
    .line 1050
    goto :goto_8

    .line 1051
    :cond_30
    const/4 v1, 0x0

    .line 1052
    :goto_8
    if-nez v1, :cond_31

    .line 1053
    .line 1054
    sget-object v1, La/iun;->a:La/iun;

    .line 1055
    .line 1056
    :cond_31
    if-eqz v6, :cond_33

    .line 1057
    .line 1058
    iget-object v2, v6, La/kuk;->d:La/j0g0;

    .line 1059
    .line 1060
    if-eqz v2, :cond_33

    .line 1061
    .line 1062
    iget-object v6, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 1063
    .line 1064
    instance-of v2, v6, La/g0g0;

    .line 1065
    .line 1066
    if-eqz v2, :cond_32

    .line 1067
    .line 1068
    const/4 v6, 0x0

    .line 1069
    :cond_32
    check-cast v6, La/btk;

    .line 1070
    .line 1071
    if-eqz v6, :cond_33

    .line 1072
    .line 1073
    iget-object v6, v6, La/btk;->a:Ljava/util/List;

    .line 1074
    .line 1075
    goto :goto_9

    .line 1076
    :cond_33
    const/4 v6, 0x0

    .line 1077
    :goto_9
    if-nez v6, :cond_34

    .line 1078
    .line 1079
    sget-object v6, La/iun;->a:La/iun;

    .line 1080
    .line 1081
    :cond_34
    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v1

    .line 1085
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    :cond_35
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1090
    .line 1091
    .line 1092
    move-result v2

    .line 1093
    if-eqz v2, :cond_36

    .line 1094
    .line 1095
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    move-object v3, v2

    .line 1100
    check-cast v3, La/d0t;

    .line 1101
    .line 1102
    iget-wide v3, v3, La/d0t;->a:J

    .line 1103
    .line 1104
    iget-wide v5, v0, La/gpk;->c:J

    .line 1105
    .line 1106
    cmp-long v3, v3, v5

    .line 1107
    .line 1108
    if-nez v3, :cond_35

    .line 1109
    .line 1110
    move-object v13, v2

    .line 1111
    goto :goto_a

    .line 1112
    :cond_36
    const/4 v13, 0x0

    .line 1113
    :goto_a
    check-cast v13, La/d0t;

    .line 1114
    .line 1115
    if-nez v13, :cond_37

    .line 1116
    .line 1117
    goto/16 :goto_f

    .line 1118
    .line 1119
    :cond_37
    new-instance v0, La/uok;

    .line 1120
    .line 1121
    new-instance v1, La/pid;

    .line 1122
    .line 1123
    iget-wide v2, v13, La/d0t;->a:J

    .line 1124
    .line 1125
    invoke-direct {v1, v2, v3}, La/pid;-><init>(J)V

    .line 1126
    .line 1127
    .line 1128
    invoke-direct {v0, v1}, La/uok;-><init>(La/uid;)V

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual {v8, v0}, La/atk;->R(La/wok;)V

    .line 1132
    .line 1133
    .line 1134
    goto/16 :goto_f

    .line 1135
    .line 1136
    :cond_38
    instance-of v2, v0, La/fpk;

    .line 1137
    .line 1138
    if-eqz v2, :cond_39

    .line 1139
    .line 1140
    sget v0, La/atk;->J:I

    .line 1141
    .line 1142
    invoke-virtual {v8}, La/atk;->V()V

    .line 1143
    .line 1144
    .line 1145
    goto/16 :goto_f

    .line 1146
    .line 1147
    :cond_39
    instance-of v2, v0, La/zok;

    .line 1148
    .line 1149
    if-eqz v2, :cond_40

    .line 1150
    .line 1151
    check-cast v0, La/zok;

    .line 1152
    .line 1153
    iget-object v0, v0, La/zok;->a:La/m8m;

    .line 1154
    .line 1155
    sget v2, La/atk;->J:I

    .line 1156
    .line 1157
    new-array v2, v15, [La/yxg;

    .line 1158
    .line 1159
    aput-object v23, v2, v14

    .line 1160
    .line 1161
    aput-object v22, v2, v17

    .line 1162
    .line 1163
    aput-object v21, v2, p1

    .line 1164
    .line 1165
    aput-object v20, v2, v16

    .line 1166
    .line 1167
    aput-object v19, v2, p0

    .line 1168
    .line 1169
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v2

    .line 1173
    new-instance v3, Ljava/util/ArrayList;

    .line 1174
    .line 1175
    invoke-static {v2, v13}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1176
    .line 1177
    .line 1178
    move-result v4

    .line 1179
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1180
    .line 1181
    .line 1182
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v2

    .line 1186
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1187
    .line 1188
    .line 1189
    move-result v4

    .line 1190
    if-eqz v4, :cond_3a

    .line 1191
    .line 1192
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v4

    .line 1196
    check-cast v4, La/yxg;

    .line 1197
    .line 1198
    iget-wide v14, v4, La/yxg;->a:J

    .line 1199
    .line 1200
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v4

    .line 1204
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1205
    .line 1206
    .line 1207
    const/4 v14, 0x0

    .line 1208
    goto :goto_b

    .line 1209
    :cond_3a
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v2

    .line 1213
    check-cast v2, La/ksk;

    .line 1214
    .line 1215
    iget-object v2, v2, La/ksk;->d:La/j0g0;

    .line 1216
    .line 1217
    if-eqz v2, :cond_49

    .line 1218
    .line 1219
    iget-object v2, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 1220
    .line 1221
    instance-of v4, v2, La/g0g0;

    .line 1222
    .line 1223
    if-eqz v4, :cond_3b

    .line 1224
    .line 1225
    const/4 v2, 0x0

    .line 1226
    :cond_3b
    check-cast v2, La/kuk;

    .line 1227
    .line 1228
    if-eqz v2, :cond_49

    .line 1229
    .line 1230
    iget-object v2, v2, La/kuk;->i:La/j0g0;

    .line 1231
    .line 1232
    if-eqz v2, :cond_49

    .line 1233
    .line 1234
    iget-object v2, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 1235
    .line 1236
    instance-of v4, v2, La/g0g0;

    .line 1237
    .line 1238
    if-eqz v4, :cond_3c

    .line 1239
    .line 1240
    const/4 v2, 0x0

    .line 1241
    :cond_3c
    check-cast v2, Ljava/util/List;

    .line 1242
    .line 1243
    if-eqz v2, :cond_49

    .line 1244
    .line 1245
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v2

    .line 1249
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1250
    .line 1251
    .line 1252
    move-result v4

    .line 1253
    if-eqz v4, :cond_3e

    .line 1254
    .line 1255
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v4

    .line 1259
    move-object v9, v4

    .line 1260
    check-cast v9, La/esk;

    .line 1261
    .line 1262
    iget-wide v13, v9, La/esk;->b:J

    .line 1263
    .line 1264
    move-object/from16 v16, v12

    .line 1265
    .line 1266
    iget-wide v11, v0, La/m8m;->a:J

    .line 1267
    .line 1268
    cmp-long v9, v13, v11

    .line 1269
    .line 1270
    if-nez v9, :cond_3d

    .line 1271
    .line 1272
    move-object v13, v4

    .line 1273
    goto :goto_d

    .line 1274
    :cond_3d
    move-object/from16 v12, v16

    .line 1275
    .line 1276
    goto :goto_c

    .line 1277
    :cond_3e
    move-object/from16 v16, v12

    .line 1278
    .line 1279
    const/4 v13, 0x0

    .line 1280
    :goto_d
    check-cast v13, La/esk;

    .line 1281
    .line 1282
    if-eqz v13, :cond_49

    .line 1283
    .line 1284
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v2

    .line 1288
    check-cast v2, La/ksk;

    .line 1289
    .line 1290
    iget-object v2, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 1291
    .line 1292
    iget-wide v11, v2, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 1293
    .line 1294
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v2

    .line 1298
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 1299
    .line 1300
    .line 1301
    move-result v2

    .line 1302
    if-eqz v2, :cond_3f

    .line 1303
    .line 1304
    iget-boolean v2, v13, La/esk;->g:Z

    .line 1305
    .line 1306
    if-eqz v2, :cond_3f

    .line 1307
    .line 1308
    sget-object v1, La/r1g;->u:La/r1g;

    .line 1309
    .line 1310
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v2

    .line 1314
    check-cast v2, La/ksk;

    .line 1315
    .line 1316
    iget-object v2, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 1317
    .line 1318
    iget-wide v2, v2, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 1319
    .line 1320
    invoke-virtual {v7, v1, v2, v3}, La/ih5;->p(La/r1g;J)V

    .line 1321
    .line 1322
    .line 1323
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v1

    .line 1327
    check-cast v1, La/ksk;

    .line 1328
    .line 1329
    iget-object v1, v1, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 1330
    .line 1331
    iget-wide v1, v1, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 1332
    .line 1333
    move-object/from16 v3, v16

    .line 1334
    .line 1335
    invoke-virtual {v6, v1, v2, v3}, La/zr1;->z(JLjava/lang/String;)V

    .line 1336
    .line 1337
    .line 1338
    iget-wide v14, v0, La/m8m;->a:J

    .line 1339
    .line 1340
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v1

    .line 1344
    check-cast v1, La/ksk;

    .line 1345
    .line 1346
    iget-object v1, v1, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 1347
    .line 1348
    iget-wide v12, v1, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 1349
    .line 1350
    iget-object v0, v0, La/m8m;->b:La/w8m;

    .line 1351
    .line 1352
    iget-object v0, v0, La/w8m;->a:Ljava/lang/String;

    .line 1353
    .line 1354
    sget-object v17, La/k1g;->b:La/k1g;

    .line 1355
    .line 1356
    move-object v11, v10

    .line 1357
    check-cast v11, La/uzg;

    .line 1358
    .line 1359
    move-object/from16 v16, v0

    .line 1360
    .line 1361
    invoke-virtual/range {v11 .. v17}, La/uzg;->n(JJLjava/lang/String;La/k1g;)V

    .line 1362
    .line 1363
    .line 1364
    goto/16 :goto_f

    .line 1365
    .line 1366
    :cond_3f
    new-instance v9, La/isk;

    .line 1367
    .line 1368
    new-instance v0, La/xdk0;

    .line 1369
    .line 1370
    const/4 v2, 0x0

    .line 1371
    new-array v3, v2, [Ljava/lang/Object;

    .line 1372
    .line 1373
    iget-object v4, v5, La/ctf0;->b:La/lsm0;

    .line 1374
    .line 1375
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v2

    .line 1379
    const v11, 0x7f131302

    .line 1380
    .line 1381
    .line 1382
    invoke-virtual {v4, v11, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v2

    .line 1386
    const/4 v6, 0x0

    .line 1387
    const/16 v7, 0x7c

    .line 1388
    .line 1389
    const/4 v3, 0x0

    .line 1390
    const/4 v4, 0x0

    .line 1391
    const/4 v5, 0x0

    .line 1392
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1393
    .line 1394
    .line 1395
    invoke-direct {v9, v0}, La/isk;-><init>(La/xdk0;)V

    .line 1396
    .line 1397
    .line 1398
    invoke-virtual {v8, v9}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1399
    .line 1400
    .line 1401
    goto/16 :goto_f

    .line 1402
    .line 1403
    :cond_40
    instance-of v1, v0, La/apk;

    .line 1404
    .line 1405
    if-eqz v1, :cond_41

    .line 1406
    .line 1407
    sget v0, La/atk;->J:I

    .line 1408
    .line 1409
    const/4 v2, 0x0

    .line 1410
    invoke-virtual {v8, v2}, La/atk;->S(Z)V

    .line 1411
    .line 1412
    .line 1413
    goto/16 :goto_f

    .line 1414
    .line 1415
    :cond_41
    instance-of v1, v0, La/rok;

    .line 1416
    .line 1417
    if-eqz v1, :cond_42

    .line 1418
    .line 1419
    check-cast v0, La/rok;

    .line 1420
    .line 1421
    iget-wide v0, v0, La/rok;->a:J

    .line 1422
    .line 1423
    sget v2, La/atk;->J:I

    .line 1424
    .line 1425
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v2

    .line 1429
    check-cast v2, La/ksk;

    .line 1430
    .line 1431
    iget-object v2, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 1432
    .line 1433
    iget-object v2, v2, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1434
    .line 1435
    iget-byte v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 1436
    .line 1437
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v0

    .line 1441
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v0

    .line 1445
    check-cast v10, La/uzg;

    .line 1446
    .line 1447
    move/from16 v1, v17

    .line 1448
    .line 1449
    invoke-virtual {v10, v2, v0, v1}, La/uzg;->d(ILjava/util/List;Z)V

    .line 1450
    .line 1451
    .line 1452
    goto/16 :goto_f

    .line 1453
    .line 1454
    :cond_42
    instance-of v1, v0, La/qok;

    .line 1455
    .line 1456
    if-eqz v1, :cond_43

    .line 1457
    .line 1458
    check-cast v0, La/qok;

    .line 1459
    .line 1460
    iget-wide v0, v0, La/qok;->a:J

    .line 1461
    .line 1462
    sget v2, La/atk;->J:I

    .line 1463
    .line 1464
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v2

    .line 1468
    check-cast v2, La/ksk;

    .line 1469
    .line 1470
    iget-object v2, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 1471
    .line 1472
    iget-object v2, v2, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1473
    .line 1474
    iget-byte v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 1475
    .line 1476
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v0

    .line 1480
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v0

    .line 1484
    check-cast v10, La/uzg;

    .line 1485
    .line 1486
    const/4 v1, 0x0

    .line 1487
    invoke-virtual {v10, v2, v0, v1}, La/uzg;->d(ILjava/util/List;Z)V

    .line 1488
    .line 1489
    .line 1490
    goto/16 :goto_f

    .line 1491
    .line 1492
    :cond_43
    instance-of v1, v0, La/sok;

    .line 1493
    .line 1494
    if-eqz v1, :cond_48

    .line 1495
    .line 1496
    check-cast v0, La/sok;

    .line 1497
    .line 1498
    sget v1, La/atk;->J:I

    .line 1499
    .line 1500
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v1

    .line 1504
    check-cast v1, La/ksk;

    .line 1505
    .line 1506
    iget-object v1, v1, La/ksk;->d:La/j0g0;

    .line 1507
    .line 1508
    if-eqz v1, :cond_49

    .line 1509
    .line 1510
    iget-object v6, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 1511
    .line 1512
    instance-of v1, v6, La/g0g0;

    .line 1513
    .line 1514
    if-eqz v1, :cond_44

    .line 1515
    .line 1516
    const/4 v6, 0x0

    .line 1517
    :cond_44
    check-cast v6, La/kuk;

    .line 1518
    .line 1519
    if-eqz v6, :cond_49

    .line 1520
    .line 1521
    iget-object v6, v6, La/kuk;->j:Ljava/lang/Object;

    .line 1522
    .line 1523
    instance-of v1, v6, La/g0g0;

    .line 1524
    .line 1525
    if-eqz v1, :cond_45

    .line 1526
    .line 1527
    const/4 v6, 0x0

    .line 1528
    :cond_45
    check-cast v6, Ljava/util/List;

    .line 1529
    .line 1530
    if-eqz v6, :cond_49

    .line 1531
    .line 1532
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v1

    .line 1536
    :cond_46
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1537
    .line 1538
    .line 1539
    move-result v2

    .line 1540
    if-eqz v2, :cond_47

    .line 1541
    .line 1542
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v2

    .line 1546
    move-object v3, v2

    .line 1547
    check-cast v3, La/xah;

    .line 1548
    .line 1549
    iget-wide v3, v3, La/xah;->g:J

    .line 1550
    .line 1551
    iget-wide v5, v0, La/sok;->a:J

    .line 1552
    .line 1553
    cmp-long v3, v3, v5

    .line 1554
    .line 1555
    if-nez v3, :cond_46

    .line 1556
    .line 1557
    move-object v13, v2

    .line 1558
    goto :goto_e

    .line 1559
    :cond_47
    const/4 v13, 0x0

    .line 1560
    :goto_e
    check-cast v13, La/xah;

    .line 1561
    .line 1562
    if-eqz v13, :cond_49

    .line 1563
    .line 1564
    new-instance v0, La/npn;

    .line 1565
    .line 1566
    iget-wide v1, v13, La/xah;->g:J

    .line 1567
    .line 1568
    iget-wide v3, v13, La/xah;->i:J

    .line 1569
    .line 1570
    iget-wide v5, v13, La/xah;->k:J

    .line 1571
    .line 1572
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v5

    .line 1576
    iget-boolean v6, v13, La/xah;->n:Z

    .line 1577
    .line 1578
    invoke-direct/range {v0 .. v6}, La/npn;-><init>(JJLjava/lang/Long;Z)V

    .line 1579
    .line 1580
    .line 1581
    iget-object v14, v8, La/atk;->x:La/ih5;

    .line 1582
    .line 1583
    iget-wide v1, v13, La/xah;->i:J

    .line 1584
    .line 1585
    iget-wide v3, v13, La/xah;->k:J

    .line 1586
    .line 1587
    iget-wide v9, v13, La/xah;->g:J

    .line 1588
    .line 1589
    sget-object v21, La/r1g;->u:La/r1g;

    .line 1590
    .line 1591
    iget-boolean v5, v13, La/xah;->m:Z

    .line 1592
    .line 1593
    move-wide v15, v1

    .line 1594
    move-wide/from16 v17, v3

    .line 1595
    .line 1596
    move/from16 v23, v5

    .line 1597
    .line 1598
    move/from16 v22, v6

    .line 1599
    .line 1600
    move-wide/from16 v19, v9

    .line 1601
    .line 1602
    invoke-virtual/range {v14 .. v23}, La/ih5;->b(JJJLa/r1g;ZZ)V

    .line 1603
    .line 1604
    .line 1605
    iget-object v1, v8, La/atk;->y:La/zr1;

    .line 1606
    .line 1607
    iget-wide v2, v13, La/xah;->i:J

    .line 1608
    .line 1609
    iget-wide v4, v13, La/xah;->k:J

    .line 1610
    .line 1611
    iget-wide v6, v13, La/xah;->g:J

    .line 1612
    .line 1613
    iget-boolean v9, v13, La/xah;->n:Z

    .line 1614
    .line 1615
    iget-boolean v10, v13, La/xah;->m:Z

    .line 1616
    .line 1617
    const-string v29, "cyber_champs_games"

    .line 1618
    .line 1619
    move-object/from16 v22, v1

    .line 1620
    .line 1621
    move-wide/from16 v23, v2

    .line 1622
    .line 1623
    move-wide/from16 v25, v4

    .line 1624
    .line 1625
    move-wide/from16 v27, v6

    .line 1626
    .line 1627
    move/from16 v30, v9

    .line 1628
    .line 1629
    move/from16 v31, v10

    .line 1630
    .line 1631
    invoke-virtual/range {v22 .. v31}, La/zr1;->d(JJJLjava/lang/String;ZZ)V

    .line 1632
    .line 1633
    .line 1634
    iget-object v1, v8, La/atk;->C:La/oeg0;

    .line 1635
    .line 1636
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v1

    .line 1640
    new-instance v2, La/sw8;

    .line 1641
    .line 1642
    const/16 v3, 0x18

    .line 1643
    .line 1644
    invoke-direct {v2, v8, v0, v13, v3}, La/sw8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1645
    .line 1646
    .line 1647
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1648
    .line 1649
    .line 1650
    goto :goto_f

    .line 1651
    :cond_48
    sget-object v1, La/xok;->a:La/xok;

    .line 1652
    .line 1653
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1654
    .line 1655
    .line 1656
    move-result v0

    .line 1657
    if-eqz v0, :cond_4a

    .line 1658
    .line 1659
    sget v0, La/atk;->J:I

    .line 1660
    .line 1661
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v0

    .line 1665
    iget-object v1, v9, La/mne;->a:La/rwj;

    .line 1666
    .line 1667
    new-instance v2, La/ysk;

    .line 1668
    .line 1669
    move/from16 v3, p1

    .line 1670
    .line 1671
    const/4 v6, 0x0

    .line 1672
    invoke-direct {v2, v8, v6, v3}, La/ysk;-><init>(La/atk;La/yje;B)V

    .line 1673
    .line 1674
    .line 1675
    invoke-static {v0, v1, v6, v2, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1676
    .line 1677
    .line 1678
    :cond_49
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1679
    .line 1680
    return-object v0

    .line 1681
    :cond_4a
    const/4 v6, 0x0

    .line 1682
    invoke-static {}, La/t9f;->b()V

    .line 1683
    .line 1684
    .line 1685
    return-object v6

    .line 1686
    nop

    .line 1687
    :sswitch_data_0
    .sparse-switch
        -0x6def2dee -> :sswitch_b
        -0x6def2cf6 -> :sswitch_a
        -0x619e63b6 -> :sswitch_9
        -0x5714ac78 -> :sswitch_8
        -0x4e74cf37 -> :sswitch_7
        -0x180b4580 -> :sswitch_6
        0x5c889c -> :sswitch_5
        0x2f0edbee -> :sswitch_4
        0x307cb0ad -> :sswitch_3
        0x436ed820 -> :sswitch_2
        0x73fd8394 -> :sswitch_1
        0x770d6b8f -> :sswitch_0
    .end sparse-switch
.end method

.method private final o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, La/e9g;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/cuk;

    .line 4
    .line 5
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/ruk;

    .line 8
    .line 9
    sget-object v1, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    instance-of p1, p0, La/puk;

    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    check-cast p0, La/puk;

    .line 24
    .line 25
    iget-object p0, p0, La/puk;->a:Ljava/util/ArrayList;

    .line 26
    .line 27
    sget-object p1, La/cuk;->l2:La/bek;

    .line 28
    .line 29
    invoke-virtual {v0}, La/cuk;->T0()La/mik;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object p1, p1, La/mik;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 34
    .line 35
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, La/cuk;->T0()La/mik;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object p1, p1, La/mik;->b:Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    iget-object p1, v0, La/cuk;->h2:La/n0o0;

    .line 48
    .line 49
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, La/qnk;

    .line 54
    .line 55
    invoke-virtual {p1, p0}, La/zz3;->A(Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    instance-of p1, p0, La/quk;

    .line 60
    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    check-cast p0, La/quk;

    .line 64
    .line 65
    iget-object p0, p0, La/quk;->a:La/jkm;

    .line 66
    .line 67
    sget-object p1, La/cuk;->l2:La/bek;

    .line 68
    .line 69
    invoke-virtual {v0}, La/cuk;->T0()La/mik;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-object p1, p1, La/mik;->b:Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 74
    .line 75
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->d(La/jkm;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, La/cuk;->T0()La/mik;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget-object p0, p0, La/mik;->b:Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 83
    .line 84
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->setCenterInParent(Z)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, La/cuk;->T0()La/mik;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    iget-object p0, p0, La/mik;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 92
    .line 93
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, La/cuk;->T0()La/mik;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    iget-object p0, p0, La/mik;->b:Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 101
    .line 102
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 103
    .line 104
    .line 105
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 109
    .line 110
    .line 111
    const/4 p0, 0x0

    .line 112
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/e9g;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/e9g;->k:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/e9g;

    .line 9
    .line 10
    check-cast v1, La/gxk;

    .line 11
    .line 12
    const/16 v0, 0x1d

    .line 13
    .line 14
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    new-instance p0, La/e9g;

    .line 21
    .line 22
    check-cast v1, La/cuk;

    .line 23
    .line 24
    const/16 v0, 0x1c

    .line 25
    .line 26
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    new-instance p1, La/e9g;

    .line 33
    .line 34
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, La/hpk;

    .line 37
    .line 38
    check-cast v1, La/atk;

    .line 39
    .line 40
    const/16 v0, 0x1b

    .line 41
    .line 42
    invoke-direct {p1, p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 43
    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_2
    new-instance p1, La/e9g;

    .line 47
    .line 48
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, La/jbk;

    .line 51
    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    const/16 v0, 0x1a

    .line 55
    .line 56
    invoke-direct {p1, p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_3
    new-instance p0, La/e9g;

    .line 61
    .line 62
    check-cast v1, La/bbk;

    .line 63
    .line 64
    const/16 v0, 0x19

    .line 65
    .line 66
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_4
    new-instance p1, La/e9g;

    .line 73
    .line 74
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, La/pak;

    .line 77
    .line 78
    check-cast v1, La/nak;

    .line 79
    .line 80
    const/16 v0, 0x18

    .line 81
    .line 82
    invoke-direct {p1, p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    :pswitch_5
    new-instance p1, La/e9g;

    .line 87
    .line 88
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p0, La/iak;

    .line 91
    .line 92
    check-cast v1, La/dak;

    .line 93
    .line 94
    const/16 v0, 0x17

    .line 95
    .line 96
    invoke-direct {p1, p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 97
    .line 98
    .line 99
    return-object p1

    .line 100
    :pswitch_6
    new-instance p1, La/e9g;

    .line 101
    .line 102
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, La/p9k;

    .line 105
    .line 106
    check-cast v1, La/k9k;

    .line 107
    .line 108
    const/16 v0, 0x16

    .line 109
    .line 110
    invoke-direct {p1, p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 111
    .line 112
    .line 113
    return-object p1

    .line 114
    :pswitch_7
    new-instance p0, La/e9g;

    .line 115
    .line 116
    check-cast v1, La/u8k;

    .line 117
    .line 118
    const/16 v0, 0x15

    .line 119
    .line 120
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 121
    .line 122
    .line 123
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_8
    new-instance p0, La/e9g;

    .line 127
    .line 128
    check-cast v1, La/c8k;

    .line 129
    .line 130
    const/16 v0, 0x14

    .line 131
    .line 132
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 133
    .line 134
    .line 135
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_9
    new-instance p1, La/e9g;

    .line 139
    .line 140
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p0, La/btj;

    .line 143
    .line 144
    check-cast v1, Ljava/lang/String;

    .line 145
    .line 146
    const/16 v0, 0x13

    .line 147
    .line 148
    invoke-direct {p1, p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 149
    .line 150
    .line 151
    return-object p1

    .line 152
    :pswitch_a
    new-instance p1, La/e9g;

    .line 153
    .line 154
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p0, La/erj;

    .line 157
    .line 158
    check-cast v1, La/rlj;

    .line 159
    .line 160
    const/16 v0, 0x12

    .line 161
    .line 162
    invoke-direct {p1, p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 163
    .line 164
    .line 165
    return-object p1

    .line 166
    :pswitch_b
    new-instance p1, La/e9g;

    .line 167
    .line 168
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast p0, La/xgj;

    .line 171
    .line 172
    check-cast v1, La/bhj;

    .line 173
    .line 174
    const/16 v0, 0x11

    .line 175
    .line 176
    invoke-direct {p1, p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 177
    .line 178
    .line 179
    return-object p1

    .line 180
    :pswitch_c
    new-instance p0, La/e9g;

    .line 181
    .line 182
    check-cast v1, La/g7m0;

    .line 183
    .line 184
    const/16 v0, 0x10

    .line 185
    .line 186
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 187
    .line 188
    .line 189
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_d
    new-instance p1, La/e9g;

    .line 193
    .line 194
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p0, La/o7j;

    .line 197
    .line 198
    check-cast v1, Ljava/lang/String;

    .line 199
    .line 200
    const/16 v0, 0xf

    .line 201
    .line 202
    invoke-direct {p1, p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 203
    .line 204
    .line 205
    return-object p1

    .line 206
    :pswitch_e
    new-instance p0, La/e9g;

    .line 207
    .line 208
    check-cast v1, La/f7j;

    .line 209
    .line 210
    const/16 v0, 0xe

    .line 211
    .line 212
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 213
    .line 214
    .line 215
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_f
    new-instance p0, La/e9g;

    .line 219
    .line 220
    check-cast v1, La/f3j;

    .line 221
    .line 222
    const/16 v0, 0xd

    .line 223
    .line 224
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 225
    .line 226
    .line 227
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 228
    .line 229
    return-object p0

    .line 230
    :pswitch_10
    new-instance p0, La/e9g;

    .line 231
    .line 232
    check-cast v1, La/j2j;

    .line 233
    .line 234
    const/16 v0, 0xc

    .line 235
    .line 236
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 237
    .line 238
    .line 239
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 240
    .line 241
    return-object p0

    .line 242
    :pswitch_11
    new-instance p1, La/e9g;

    .line 243
    .line 244
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast p0, La/q1j;

    .line 247
    .line 248
    check-cast v1, La/kwj;

    .line 249
    .line 250
    const/16 v0, 0xb

    .line 251
    .line 252
    invoke-direct {p1, p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 253
    .line 254
    .line 255
    return-object p1

    .line 256
    :pswitch_12
    new-instance p1, La/e9g;

    .line 257
    .line 258
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast p0, La/rsh;

    .line 261
    .line 262
    check-cast v1, La/o5s0;

    .line 263
    .line 264
    const/16 v0, 0xa

    .line 265
    .line 266
    invoke-direct {p1, p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 267
    .line 268
    .line 269
    return-object p1

    .line 270
    :pswitch_13
    new-instance p0, La/e9g;

    .line 271
    .line 272
    check-cast v1, La/lmh;

    .line 273
    .line 274
    const/16 v0, 0x9

    .line 275
    .line 276
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 277
    .line 278
    .line 279
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 280
    .line 281
    return-object p0

    .line 282
    :pswitch_14
    new-instance p1, La/e9g;

    .line 283
    .line 284
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast p0, La/k7h;

    .line 287
    .line 288
    check-cast v1, La/pz40;

    .line 289
    .line 290
    const/16 v0, 0x8

    .line 291
    .line 292
    invoke-direct {p1, p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 293
    .line 294
    .line 295
    return-object p1

    .line 296
    :pswitch_15
    new-instance p0, La/e9g;

    .line 297
    .line 298
    check-cast v1, La/vqg;

    .line 299
    .line 300
    const/4 v0, 0x7

    .line 301
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 302
    .line 303
    .line 304
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 305
    .line 306
    return-object p0

    .line 307
    :pswitch_16
    new-instance p1, La/e9g;

    .line 308
    .line 309
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast p0, La/vqg;

    .line 312
    .line 313
    check-cast v1, Ljava/lang/String;

    .line 314
    .line 315
    const/4 v0, 0x6

    .line 316
    invoke-direct {p1, p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 317
    .line 318
    .line 319
    return-object p1

    .line 320
    :pswitch_17
    new-instance p0, La/e9g;

    .line 321
    .line 322
    check-cast v1, La/xig;

    .line 323
    .line 324
    const/4 v0, 0x5

    .line 325
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 326
    .line 327
    .line 328
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 329
    .line 330
    return-object p0

    .line 331
    :pswitch_18
    new-instance p0, La/e9g;

    .line 332
    .line 333
    check-cast v1, La/igg;

    .line 334
    .line 335
    const/4 v0, 0x4

    .line 336
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 337
    .line 338
    .line 339
    check-cast p1, La/j0g0;

    .line 340
    .line 341
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 342
    .line 343
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 344
    .line 345
    return-object p0

    .line 346
    :pswitch_19
    new-instance p1, La/e9g;

    .line 347
    .line 348
    iget-object p0, p0, La/e9g;->j:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast p0, La/teg;

    .line 351
    .line 352
    check-cast v1, La/jfg;

    .line 353
    .line 354
    const/4 v0, 0x3

    .line 355
    invoke-direct {p1, p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 356
    .line 357
    .line 358
    return-object p1

    .line 359
    :pswitch_1a
    new-instance p0, La/e9g;

    .line 360
    .line 361
    check-cast v1, La/wcg;

    .line 362
    .line 363
    const/4 v0, 0x2

    .line 364
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 365
    .line 366
    .line 367
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 368
    .line 369
    return-object p0

    .line 370
    :pswitch_1b
    new-instance p0, La/e9g;

    .line 371
    .line 372
    check-cast v1, La/dcg;

    .line 373
    .line 374
    const/4 v0, 0x1

    .line 375
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 376
    .line 377
    .line 378
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 379
    .line 380
    return-object p0

    .line 381
    :pswitch_1c
    new-instance p0, La/e9g;

    .line 382
    .line 383
    check-cast v1, La/g9g;

    .line 384
    .line 385
    const/4 v0, 0x0

    .line 386
    invoke-direct {p0, v1, p2, v0}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 387
    .line 388
    .line 389
    iput-object p1, p0, La/e9g;->j:Ljava/lang/Object;

    .line 390
    .line 391
    return-object p0

    .line 392
    nop

    .line 393
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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/e9g;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/nxk;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/e9g;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/ruk;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/e9g;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/e9g;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/vne;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/e9g;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/e9g;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/vne;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/e9g;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, La/vne;

    .line 109
    .line 110
    check-cast p2, La/yje;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/e9g;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_6
    check-cast p1, La/vne;

    .line 126
    .line 127
    check-cast p2, La/yje;

    .line 128
    .line 129
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, La/e9g;

    .line 134
    .line 135
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_7
    check-cast p1, La/nak;

    .line 143
    .line 144
    check-cast p2, La/yje;

    .line 145
    .line 146
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, La/e9g;

    .line 151
    .line 152
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_8
    check-cast p1, La/j8k;

    .line 160
    .line 161
    check-cast p2, La/yje;

    .line 162
    .line 163
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, La/e9g;

    .line 168
    .line 169
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    :pswitch_9
    check-cast p1, La/vne;

    .line 177
    .line 178
    check-cast p2, La/yje;

    .line 179
    .line 180
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    check-cast p0, La/e9g;

    .line 185
    .line 186
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0

    .line 193
    :pswitch_a
    check-cast p1, La/vne;

    .line 194
    .line 195
    check-cast p2, La/yje;

    .line 196
    .line 197
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, La/e9g;

    .line 202
    .line 203
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    return-object p0

    .line 210
    :pswitch_b
    check-cast p1, La/vne;

    .line 211
    .line 212
    check-cast p2, La/yje;

    .line 213
    .line 214
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    check-cast p0, La/e9g;

    .line 219
    .line 220
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    return-object p0

    .line 227
    :pswitch_c
    check-cast p1, La/g7m0;

    .line 228
    .line 229
    check-cast p2, La/yje;

    .line 230
    .line 231
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    check-cast p0, La/e9g;

    .line 236
    .line 237
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    return-object p0

    .line 244
    :pswitch_d
    check-cast p1, La/vne;

    .line 245
    .line 246
    check-cast p2, La/yje;

    .line 247
    .line 248
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    check-cast p0, La/e9g;

    .line 253
    .line 254
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    return-object p0

    .line 261
    :pswitch_e
    check-cast p1, Lkotlin/Pair;

    .line 262
    .line 263
    check-cast p2, La/yje;

    .line 264
    .line 265
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    check-cast p0, La/e9g;

    .line 270
    .line 271
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    return-object p0

    .line 278
    :pswitch_f
    check-cast p1, La/vmt0;

    .line 279
    .line 280
    check-cast p2, La/yje;

    .line 281
    .line 282
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    check-cast p0, La/e9g;

    .line 287
    .line 288
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    return-object p0

    .line 295
    :pswitch_10
    check-cast p1, La/sw00;

    .line 296
    .line 297
    check-cast p2, La/yje;

    .line 298
    .line 299
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    check-cast p0, La/e9g;

    .line 304
    .line 305
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    return-object p0

    .line 312
    :pswitch_11
    check-cast p1, La/vne;

    .line 313
    .line 314
    check-cast p2, La/yje;

    .line 315
    .line 316
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    check-cast p0, La/e9g;

    .line 321
    .line 322
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    return-object p0

    .line 329
    :pswitch_12
    check-cast p1, La/vne;

    .line 330
    .line 331
    check-cast p2, La/yje;

    .line 332
    .line 333
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    check-cast p0, La/e9g;

    .line 338
    .line 339
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    return-object p0

    .line 346
    :pswitch_13
    check-cast p1, La/bqr;

    .line 347
    .line 348
    check-cast p2, La/yje;

    .line 349
    .line 350
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    check-cast p0, La/e9g;

    .line 355
    .line 356
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    return-object p0

    .line 363
    :pswitch_14
    check-cast p1, La/vne;

    .line 364
    .line 365
    check-cast p2, La/yje;

    .line 366
    .line 367
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    check-cast p0, La/e9g;

    .line 372
    .line 373
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    return-object p0

    .line 380
    :pswitch_15
    check-cast p1, La/kam0;

    .line 381
    .line 382
    check-cast p2, La/yje;

    .line 383
    .line 384
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    check-cast p0, La/e9g;

    .line 389
    .line 390
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 391
    .line 392
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    return-object p0

    .line 397
    :pswitch_16
    check-cast p1, La/vne;

    .line 398
    .line 399
    check-cast p2, La/yje;

    .line 400
    .line 401
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    check-cast p0, La/e9g;

    .line 406
    .line 407
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 408
    .line 409
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    return-object p0

    .line 414
    :pswitch_17
    check-cast p1, La/mig;

    .line 415
    .line 416
    check-cast p2, La/yje;

    .line 417
    .line 418
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    check-cast p0, La/e9g;

    .line 423
    .line 424
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 425
    .line 426
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    return-object p0

    .line 431
    :pswitch_18
    check-cast p1, La/j0g0;

    .line 432
    .line 433
    iget-object v0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast p2, La/yje;

    .line 436
    .line 437
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    check-cast p0, La/e9g;

    .line 442
    .line 443
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 444
    .line 445
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object p0

    .line 449
    return-object p0

    .line 450
    :pswitch_19
    check-cast p1, La/vne;

    .line 451
    .line 452
    check-cast p2, La/yje;

    .line 453
    .line 454
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    check-cast p0, La/e9g;

    .line 459
    .line 460
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 461
    .line 462
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object p0

    .line 466
    return-object p0

    .line 467
    :pswitch_1a
    check-cast p1, La/cfb;

    .line 468
    .line 469
    check-cast p2, La/yje;

    .line 470
    .line 471
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 472
    .line 473
    .line 474
    move-result-object p0

    .line 475
    check-cast p0, La/e9g;

    .line 476
    .line 477
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 478
    .line 479
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    return-object p0

    .line 484
    :pswitch_1b
    if-nez p1, :cond_0

    .line 485
    .line 486
    check-cast p2, La/yje;

    .line 487
    .line 488
    const/4 p1, 0x0

    .line 489
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 490
    .line 491
    .line 492
    move-result-object p0

    .line 493
    check-cast p0, La/e9g;

    .line 494
    .line 495
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 496
    .line 497
    invoke-virtual {p0, p2}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    throw p1

    .line 501
    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    .line 502
    .line 503
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 504
    .line 505
    .line 506
    throw p0

    .line 507
    :pswitch_1c
    check-cast p1, La/c5g;

    .line 508
    .line 509
    check-cast p2, La/yje;

    .line 510
    .line 511
    invoke-virtual {p0, p1, p2}, La/e9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 512
    .line 513
    .line 514
    move-result-object p0

    .line 515
    check-cast p0, La/e9g;

    .line 516
    .line 517
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 518
    .line 519
    invoke-virtual {p0, p1}, La/e9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object p0

    .line 523
    return-object p0

    .line 524
    nop

    .line 525
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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 53

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e9g;->i:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const-string v3, "actionDialogManager"

    .line 7
    .line 8
    const v4, 0x7f1307bb

    .line 9
    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/16 v6, 0xa

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x0

    .line 17
    iget-object v10, v0, La/e9g;->k:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object v13, v10

    .line 23
    check-cast v13, La/gxk;

    .line 24
    .line 25
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, La/nxk;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    instance-of v1, v0, La/lxk;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    check-cast v0, La/lxk;

    .line 41
    .line 42
    iget-object v0, v0, La/lxk;->a:Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentUiModel;

    .line 43
    .line 44
    sget-object v1, La/gxk;->n2:La/xak;

    .line 45
    .line 46
    iget-object v1, v13, La/gxk;->m2:La/yzn0;

    .line 47
    .line 48
    sget-object v2, La/gxk;->o2:[La/iiy;

    .line 49
    .line 50
    aget-object v2, v2, v8

    .line 51
    .line 52
    invoke-virtual {v1, v13, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, La/kxk;

    .line 57
    .line 58
    new-instance v1, Lkotlin/Pair;

    .line 59
    .line 60
    const-string v2, "DOCUMENT_CHOICE_ITEM_KEY"

    .line 61
    .line 62
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0, v13, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v13}, La/yo8;->y0()V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    instance-of v0, v0, La/mxk;

    .line 81
    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    sget-object v0, La/gxk;->n2:La/xak;

    .line 85
    .line 86
    iget-object v0, v13, La/gxk;->k2:La/n0o0;

    .line 87
    .line 88
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, La/mfi;

    .line 93
    .line 94
    iget-object v11, v0, La/mfi;->f:La/wdk0;

    .line 95
    .line 96
    new-instance v14, La/xdk0;

    .line 97
    .line 98
    sget-object v15, La/rek0;->b:La/rek0;

    .line 99
    .line 100
    invoke-virtual {v13, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v16

    .line 104
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    const/16 v20, 0x0

    .line 108
    .line 109
    const/16 v21, 0x7c

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const/16 v18, 0x0

    .line 114
    .line 115
    const/16 v19, 0x0

    .line 116
    .line 117
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 118
    .line 119
    .line 120
    const/16 v18, 0x3fc

    .line 121
    .line 122
    move-object v12, v14

    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    const/16 v16, 0x0

    .line 126
    .line 127
    invoke-static/range {v11 .. v18}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 128
    .line 129
    .line 130
    :goto_0
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 134
    .line 135
    .line 136
    :goto_1
    return-object v9

    .line 137
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/e9g;->o(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    return-object v0

    .line 142
    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/e9g;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0

    .line 147
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 148
    .line 149
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, La/jbk;

    .line 155
    .line 156
    iget-object v0, v0, La/jbk;->g:La/ol60;

    .line 157
    .line 158
    check-cast v10, Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v0, v10}, La/ol60;->f(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object v0

    .line 166
    :pswitch_3
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 167
    .line 168
    move-object v13, v0

    .line 169
    check-cast v13, Ljava/lang/String;

    .line 170
    .line 171
    sget-object v0, La/wne;->a:La/wne;

    .line 172
    .line 173
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    check-cast v10, La/bbk;

    .line 177
    .line 178
    sget-object v0, La/bbk;->O1:[La/iiy;

    .line 179
    .line 180
    iget-object v0, v10, La/bbk;->L1:La/ii;

    .line 181
    .line 182
    if-eqz v0, :cond_2

    .line 183
    .line 184
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 185
    .line 186
    invoke-virtual {v10, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v12

    .line 190
    const v1, 0x7f130e5d

    .line 191
    .line 192
    .line 193
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    sget-object v20, La/n12;->b:La/n12;

    .line 201
    .line 202
    const/16 v21, 0x0

    .line 203
    .line 204
    const/16 v22, 0x5d8

    .line 205
    .line 206
    const/4 v15, 0x0

    .line 207
    const/16 v16, 0x0

    .line 208
    .line 209
    const-string v17, "ERROR_DIALOG_REQUEST_KEY"

    .line 210
    .line 211
    const/16 v18, 0x0

    .line 212
    .line 213
    const/16 v19, 0x0

    .line 214
    .line 215
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 226
    .line 227
    .line 228
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object v0

    .line 231
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw v9

    .line 235
    :pswitch_4
    sget-object v1, La/wne;->a:La/wne;

    .line 236
    .line 237
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, La/pak;

    .line 243
    .line 244
    iget-object v0, v0, La/pak;->g:La/ol60;

    .line 245
    .line 246
    check-cast v10, La/nak;

    .line 247
    .line 248
    invoke-virtual {v0, v10}, La/ol60;->f(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object v0

    .line 254
    :pswitch_5
    sget-object v1, La/wne;->a:La/wne;

    .line 255
    .line 256
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v0, La/iak;

    .line 262
    .line 263
    iget-object v0, v0, La/iak;->p:La/ol60;

    .line 264
    .line 265
    check-cast v10, La/dak;

    .line 266
    .line 267
    invoke-virtual {v0, v10}, La/ol60;->f(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object v0

    .line 273
    :pswitch_6
    sget-object v1, La/wne;->a:La/wne;

    .line 274
    .line 275
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, La/p9k;

    .line 281
    .line 282
    iget-object v0, v0, La/p9k;->q:La/ol60;

    .line 283
    .line 284
    check-cast v10, La/k9k;

    .line 285
    .line 286
    invoke-virtual {v0, v10}, La/ol60;->f(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object v0

    .line 292
    :pswitch_7
    invoke-direct/range {p0 .. p1}, La/e9g;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    return-object v0

    .line 297
    :pswitch_8
    check-cast v10, La/c8k;

    .line 298
    .line 299
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v0, La/j8k;

    .line 302
    .line 303
    sget-object v1, La/wne;->a:La/wne;

    .line 304
    .line 305
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    sget-object v1, La/h8k;->a:La/h8k;

    .line 309
    .line 310
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    const v2, 0x7f130162

    .line 315
    .line 316
    .line 317
    if-eqz v1, :cond_4

    .line 318
    .line 319
    sget-object v0, La/c8k;->Q1:La/kud;

    .line 320
    .line 321
    iget-object v0, v10, La/c8k;->M1:La/ii;

    .line 322
    .line 323
    if-eqz v0, :cond_3

    .line 324
    .line 325
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 326
    .line 327
    invoke-virtual {v10, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v12

    .line 331
    const v1, 0x7f1315b1

    .line 332
    .line 333
    .line 334
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v13

    .line 338
    const v1, 0x7f1304d0

    .line 339
    .line 340
    .line 341
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v14

    .line 345
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    const v1, 0x7f13032f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v15

    .line 355
    sget-object v20, La/n12;->b:La/n12;

    .line 356
    .line 357
    const/16 v21, 0x0

    .line 358
    .line 359
    const/16 v22, 0x5d0

    .line 360
    .line 361
    const/16 v16, 0x0

    .line 362
    .line 363
    const-string v17, "REQUEST_CONFIRMATION_DIALOG_KEY"

    .line 364
    .line 365
    const/16 v18, 0x0

    .line 366
    .line 367
    const/16 v19, 0x0

    .line 368
    .line 369
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_3

    .line 383
    .line 384
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    throw v9

    .line 388
    :cond_4
    instance-of v1, v0, La/i8k;

    .line 389
    .line 390
    if-eqz v1, :cond_6

    .line 391
    .line 392
    check-cast v0, La/i8k;

    .line 393
    .line 394
    iget-object v13, v0, La/i8k;->a:Ljava/lang/String;

    .line 395
    .line 396
    sget-object v0, La/c8k;->Q1:La/kud;

    .line 397
    .line 398
    iget-object v0, v10, La/c8k;->M1:La/ii;

    .line 399
    .line 400
    if-eqz v0, :cond_5

    .line 401
    .line 402
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 403
    .line 404
    invoke-virtual {v10, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    const v1, 0x7f130e5e

    .line 409
    .line 410
    .line 411
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v14

    .line 415
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    sget-object v20, La/n12;->b:La/n12;

    .line 419
    .line 420
    const/16 v21, 0x0

    .line 421
    .line 422
    const/16 v22, 0x5d8

    .line 423
    .line 424
    const/4 v15, 0x0

    .line 425
    const/16 v16, 0x0

    .line 426
    .line 427
    const-string v17, "REQUEST_RESPONSE_ERROR_DIALOG_KEY"

    .line 428
    .line 429
    const/16 v18, 0x0

    .line 430
    .line 431
    const/16 v19, 0x0

    .line 432
    .line 433
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 444
    .line 445
    .line 446
    goto :goto_3

    .line 447
    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    throw v9

    .line 451
    :cond_6
    sget-object v1, La/g8k;->a:La/g8k;

    .line 452
    .line 453
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    if-eqz v1, :cond_7

    .line 458
    .line 459
    invoke-static {v10}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 460
    .line 461
    .line 462
    sget-object v0, La/c8k;->Q1:La/kud;

    .line 463
    .line 464
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    const-string v1, "SEND_RESULT_REQUEST_KEY"

    .line 469
    .line 470
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    invoke-virtual {v0, v2, v1}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v10}, La/c8k;->G0()La/k3t0;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    sget-object v1, La/y7k;->a:La/y7k;

    .line 482
    .line 483
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    goto :goto_3

    .line 487
    :cond_7
    sget-object v1, La/f8k;->a:La/f8k;

    .line 488
    .line 489
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-eqz v0, :cond_a

    .line 494
    .line 495
    invoke-static {v10}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    iget-object v2, v10, La/c8k;->N1:La/atz;

    .line 504
    .line 505
    if-eqz v2, :cond_9

    .line 506
    .line 507
    new-instance v2, Lorg/xplatform/limits/ie/impl/navigation/internal/LimitsIeInternalScreens$GamblingExamIeFragmentScreen;

    .line 508
    .line 509
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 513
    .line 514
    .line 515
    iget-object v1, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 516
    .line 517
    invoke-static {v0, v1, v8}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    :goto_2
    move-object v2, v1

    .line 522
    check-cast v2, La/paw;

    .line 523
    .line 524
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 525
    .line 526
    .line 527
    move-result v3

    .line 528
    if-eqz v3, :cond_8

    .line 529
    .line 530
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    check-cast v2, La/oe50;

    .line 535
    .line 536
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 537
    .line 538
    .line 539
    goto :goto_2

    .line 540
    :cond_8
    :goto_3
    sget-object v0, La/c8k;->Q1:La/kud;

    .line 541
    .line 542
    invoke-virtual {v10}, La/c8k;->G0()La/k3t0;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    sget-object v1, La/s7k;->a:La/s7k;

    .line 547
    .line 548
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 552
    .line 553
    goto :goto_4

    .line 554
    :cond_9
    const-string v0, "screenFactory"

    .line 555
    .line 556
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    throw v9

    .line 560
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 561
    .line 562
    .line 563
    :goto_4
    return-object v9

    .line 564
    :pswitch_9
    sget-object v1, La/wne;->a:La/wne;

    .line 565
    .line 566
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v0, La/btj;

    .line 572
    .line 573
    iget-object v0, v0, La/btj;->l:La/ol60;

    .line 574
    .line 575
    new-instance v1, La/lrn;

    .line 576
    .line 577
    check-cast v10, Ljava/lang/String;

    .line 578
    .line 579
    invoke-direct {v1, v10}, La/lrn;-><init>(Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 586
    .line 587
    return-object v0

    .line 588
    :pswitch_a
    sget-object v1, La/wne;->a:La/wne;

    .line 589
    .line 590
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 594
    .line 595
    check-cast v0, La/erj;

    .line 596
    .line 597
    iget-object v0, v0, La/erj;->a:La/us00;

    .line 598
    .line 599
    const-string v1, "notification"

    .line 600
    .line 601
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    check-cast v0, Landroid/app/NotificationManager;

    .line 609
    .line 610
    check-cast v10, La/rlj;

    .line 611
    .line 612
    iget-object v1, v10, La/rlj;->a:Ljava/lang/String;

    .line 613
    .line 614
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 615
    .line 616
    .line 617
    move-result v1

    .line 618
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 619
    .line 620
    .line 621
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 622
    .line 623
    return-object v0

    .line 624
    :pswitch_b
    sget-object v1, La/wne;->a:La/wne;

    .line 625
    .line 626
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 630
    .line 631
    move-object v1, v0

    .line 632
    check-cast v1, La/xgj;

    .line 633
    .line 634
    iget-object v2, v1, La/xgj;->f:La/ctf0;

    .line 635
    .line 636
    iget-object v3, v1, La/xgj;->g:La/p7m0;

    .line 637
    .line 638
    move-object v4, v10

    .line 639
    check-cast v4, La/bhj;

    .line 640
    .line 641
    :goto_5
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    move-object v10, v0

    .line 646
    check-cast v10, La/ugj;

    .line 647
    .line 648
    iget-object v5, v4, La/bhj;->d:Ljava/util/List;

    .line 649
    .line 650
    iget-object v11, v4, La/bhj;->d:Ljava/util/List;

    .line 651
    .line 652
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v12

    .line 656
    check-cast v12, La/qhj;

    .line 657
    .line 658
    if-eqz v12, :cond_b

    .line 659
    .line 660
    iget-boolean v12, v12, La/qhj;->A:Z

    .line 661
    .line 662
    if-ne v12, v7, :cond_b

    .line 663
    .line 664
    const v12, 0x7f130fc7

    .line 665
    .line 666
    .line 667
    goto :goto_6

    .line 668
    :cond_b
    const v12, 0x7f130fc6

    .line 669
    .line 670
    .line 671
    :goto_6
    iget v13, v4, La/bhj;->b:I

    .line 672
    .line 673
    new-instance v14, Ljava/lang/Integer;

    .line 674
    .line 675
    invoke-direct {v14, v13}, Ljava/lang/Integer;-><init>(I)V

    .line 676
    .line 677
    .line 678
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v13

    .line 682
    iget-object v14, v2, La/ctf0;->b:La/lsm0;

    .line 683
    .line 684
    invoke-static {v13, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v13

    .line 688
    invoke-virtual {v14, v12, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v12

    .line 692
    move-object v13, v11

    .line 693
    move-object v11, v12

    .line 694
    iget-object v12, v4, La/bhj;->c:Ljava/lang/String;

    .line 695
    .line 696
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 697
    .line 698
    .line 699
    move-result v14

    .line 700
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v14

    .line 704
    move-object v15, v13

    .line 705
    move-object v13, v14

    .line 706
    new-instance v14, Ljava/util/ArrayList;

    .line 707
    .line 708
    move-object/from16 v17, v9

    .line 709
    .line 710
    invoke-static {v5, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 711
    .line 712
    .line 713
    move-result v9

    .line 714
    invoke-direct {v14, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 715
    .line 716
    .line 717
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 718
    .line 719
    .line 720
    move-result-object v5

    .line 721
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 722
    .line 723
    .line 724
    move-result v9

    .line 725
    const-wide/16 v18, 0x2c3

    .line 726
    .line 727
    if-eqz v9, :cond_d

    .line 728
    .line 729
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v9

    .line 733
    check-cast v9, La/qhj;

    .line 734
    .line 735
    iget-wide v6, v9, La/qhj;->c:J

    .line 736
    .line 737
    cmp-long v6, v6, v18

    .line 738
    .line 739
    if-nez v6, :cond_c

    .line 740
    .line 741
    move-wide/from16 v6, v18

    .line 742
    .line 743
    goto :goto_8

    .line 744
    :cond_c
    iget-wide v6, v9, La/qhj;->r:J

    .line 745
    .line 746
    :goto_8
    invoke-static {v6, v7, v14}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 747
    .line 748
    .line 749
    const/16 v6, 0xa

    .line 750
    .line 751
    const/4 v7, 0x1

    .line 752
    goto :goto_7

    .line 753
    :cond_d
    const/4 v5, 0x0

    .line 754
    const/16 v16, 0x10

    .line 755
    .line 756
    move-object/from16 v52, v15

    .line 757
    .line 758
    move-object v15, v5

    .line 759
    move-object/from16 v5, v52

    .line 760
    .line 761
    invoke-static/range {v10 .. v16}, La/ugj;->a(La/ugj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;I)La/ugj;

    .line 762
    .line 763
    .line 764
    move-result-object v6

    .line 765
    invoke-virtual {v3, v0, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    move-result v0

    .line 769
    if-eqz v0, :cond_1a

    .line 770
    .line 771
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    check-cast v0, La/qhj;

    .line 776
    .line 777
    if-eqz v0, :cond_e

    .line 778
    .line 779
    iget-boolean v0, v0, La/qhj;->A:Z

    .line 780
    .line 781
    const/4 v4, 0x1

    .line 782
    if-ne v0, v4, :cond_e

    .line 783
    .line 784
    const/4 v7, 0x1

    .line 785
    goto :goto_9

    .line 786
    :cond_e
    move v7, v8

    .line 787
    :goto_9
    iput-boolean v7, v1, La/xgj;->j:Z

    .line 788
    .line 789
    iput-object v5, v1, La/xgj;->k:Ljava/util/List;

    .line 790
    .line 791
    new-instance v14, Ljava/util/ArrayList;

    .line 792
    .line 793
    const/16 v0, 0xa

    .line 794
    .line 795
    invoke-static {v5, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 796
    .line 797
    .line 798
    move-result v0

    .line 799
    invoke-direct {v14, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 800
    .line 801
    .line 802
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    move v1, v8

    .line 807
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 808
    .line 809
    .line 810
    move-result v4

    .line 811
    if-eqz v4, :cond_19

    .line 812
    .line 813
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v4

    .line 817
    add-int/lit8 v5, v1, 0x1

    .line 818
    .line 819
    if-ltz v1, :cond_18

    .line 820
    .line 821
    check-cast v4, La/qhj;

    .line 822
    .line 823
    iget-wide v6, v4, La/qhj;->c:J

    .line 824
    .line 825
    iget-object v9, v4, La/qhj;->b:Ljava/lang/String;

    .line 826
    .line 827
    iget-boolean v10, v4, La/qhj;->z:Z

    .line 828
    .line 829
    iget-wide v11, v4, La/qhj;->a:D

    .line 830
    .line 831
    cmp-long v6, v6, v18

    .line 832
    .line 833
    if-nez v6, :cond_10

    .line 834
    .line 835
    iget-boolean v4, v4, La/qhj;->A:Z

    .line 836
    .line 837
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    new-array v6, v8, [Ljava/lang/Object;

    .line 841
    .line 842
    const v7, 0x7f130113

    .line 843
    .line 844
    .line 845
    invoke-virtual {v2, v7, v6}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v6

    .line 849
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v6

    .line 853
    const v7, 0x7f1302cc

    .line 854
    .line 855
    .line 856
    invoke-virtual {v2, v7, v6}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v6

    .line 860
    new-instance v7, La/uqo;

    .line 861
    .line 862
    new-instance v20, La/chl0;

    .line 863
    .line 864
    const v13, 0x7f130494

    .line 865
    .line 866
    .line 867
    new-array v15, v8, [Ljava/lang/Object;

    .line 868
    .line 869
    invoke-virtual {v2, v13, v15}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object v21

    .line 873
    if-nez v10, :cond_f

    .line 874
    .line 875
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 876
    .line 877
    .line 878
    move-result v10

    .line 879
    if-lez v10, :cond_f

    .line 880
    .line 881
    :goto_b
    move-object/from16 v22, v9

    .line 882
    .line 883
    goto :goto_c

    .line 884
    :cond_f
    sget-object v9, La/pn40;->a:La/pn40;

    .line 885
    .line 886
    sget-object v9, La/p3u0;->e:La/p3u0;

    .line 887
    .line 888
    invoke-static {v11, v12, v9}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v9

    .line 892
    goto :goto_b

    .line 893
    :goto_c
    sget-object v23, La/k0d;->a:La/k0d;

    .line 894
    .line 895
    sget-object v24, La/a65;->a:La/a65;

    .line 896
    .line 897
    new-instance v25, La/xgl0;

    .line 898
    .line 899
    const-wide/16 v37, 0x0

    .line 900
    .line 901
    const/16 v39, 0x0

    .line 902
    .line 903
    const-wide/16 v26, -0x1

    .line 904
    .line 905
    const-wide/16 v28, 0x0

    .line 906
    .line 907
    const-wide/16 v30, 0x0

    .line 908
    .line 909
    const-string v32, ""

    .line 910
    .line 911
    const/16 v33, 0x0

    .line 912
    .line 913
    const-wide/16 v34, 0x0

    .line 914
    .line 915
    const/16 v36, 0x0

    .line 916
    .line 917
    invoke-direct/range {v25 .. v39}, La/xgl0;-><init>(JDDLjava/lang/String;IJIJZ)V

    .line 918
    .line 919
    .line 920
    const/4 v9, 0x0

    .line 921
    const/16 v26, 0x0

    .line 922
    .line 923
    const/16 v27, 0x0

    .line 924
    .line 925
    const/16 v28, 0x0

    .line 926
    .line 927
    move-object/from16 v29, v25

    .line 928
    .line 929
    move/from16 v25, v9

    .line 930
    .line 931
    invoke-direct/range {v20 .. v29}, La/chl0;-><init>(Ljava/lang/String;Ljava/lang/String;La/k0d;La/a65;ZZZZLa/xgl0;)V

    .line 932
    .line 933
    .line 934
    move-object/from16 v9, v20

    .line 935
    .line 936
    invoke-direct {v7, v9}, La/uqo;-><init>(La/chl0;)V

    .line 937
    .line 938
    .line 939
    new-instance v9, La/vqo;

    .line 940
    .line 941
    invoke-direct {v9, v4, v1, v6, v7}, La/vqo;-><init>(ZILjava/lang/String;La/uqo;)V

    .line 942
    .line 943
    .line 944
    move-object/from16 p1, v0

    .line 945
    .line 946
    move/from16 v16, v5

    .line 947
    .line 948
    goto/16 :goto_11

    .line 949
    .line 950
    :cond_10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 951
    .line 952
    .line 953
    iget-object v1, v4, La/qhj;->l:Ljava/lang/String;

    .line 954
    .line 955
    iget-object v6, v4, La/qhj;->y:Ljava/lang/String;

    .line 956
    .line 957
    new-instance v7, La/hhj;

    .line 958
    .line 959
    invoke-direct {v7, v6, v1}, La/hhj;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 960
    .line 961
    .line 962
    move-object v1, v9

    .line 963
    iget-wide v8, v4, La/qhj;->r:J

    .line 964
    .line 965
    move-object/from16 v24, v7

    .line 966
    .line 967
    iget-wide v6, v4, La/qhj;->c:J

    .line 968
    .line 969
    move-object/from16 p1, v0

    .line 970
    .line 971
    move-object v13, v1

    .line 972
    iget-wide v0, v4, La/qhj;->q:J

    .line 973
    .line 974
    move-wide/from16 v25, v0

    .line 975
    .line 976
    iget-wide v0, v4, La/qhj;->p:J

    .line 977
    .line 978
    iget-boolean v15, v4, La/qhj;->A:Z

    .line 979
    .line 980
    move-wide/from16 v20, v0

    .line 981
    .line 982
    new-instance v0, La/ihj;

    .line 983
    .line 984
    iget-object v1, v4, La/qhj;->n:Ljava/lang/String;

    .line 985
    .line 986
    move-object/from16 v30, v1

    .line 987
    .line 988
    iget-object v1, v4, La/qhj;->o:Ljava/lang/String;

    .line 989
    .line 990
    move/from16 v16, v5

    .line 991
    .line 992
    move-wide/from16 v22, v6

    .line 993
    .line 994
    iget-wide v5, v4, La/qhj;->k:J

    .line 995
    .line 996
    move-wide/from16 v31, v5

    .line 997
    .line 998
    iget-wide v5, v4, La/qhj;->j:J

    .line 999
    .line 1000
    iget v7, v4, La/qhj;->h:I

    .line 1001
    .line 1002
    move-object/from16 v29, v1

    .line 1003
    .line 1004
    iget v1, v4, La/qhj;->i:I

    .line 1005
    .line 1006
    move/from16 v36, v1

    .line 1007
    .line 1008
    iget-object v1, v4, La/qhj;->B:Ljava/lang/String;

    .line 1009
    .line 1010
    move-object/from16 v37, v1

    .line 1011
    .line 1012
    iget-object v1, v4, La/qhj;->C:Ljava/lang/String;

    .line 1013
    .line 1014
    new-instance v27, La/j3h0;

    .line 1015
    .line 1016
    move-object/from16 v38, v1

    .line 1017
    .line 1018
    move-wide/from16 v33, v5

    .line 1019
    .line 1020
    move/from16 v35, v7

    .line 1021
    .line 1022
    move/from16 v28, v15

    .line 1023
    .line 1024
    invoke-direct/range {v27 .. v38}, La/j3h0;-><init>(ZLjava/lang/String;Ljava/lang/String;JJIILjava/lang/String;Ljava/lang/String;)V

    .line 1025
    .line 1026
    .line 1027
    move-object/from16 v6, v27

    .line 1028
    .line 1029
    move/from16 v31, v28

    .line 1030
    .line 1031
    move-object/from16 v1, v30

    .line 1032
    .line 1033
    move-object/from16 v5, v37

    .line 1034
    .line 1035
    invoke-direct {v0, v6}, La/ihj;-><init>(La/j3h0;)V

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1039
    .line 1040
    .line 1041
    move-result v6

    .line 1042
    if-lez v6, :cond_11

    .line 1043
    .line 1044
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1045
    .line 1046
    .line 1047
    move-result v6

    .line 1048
    if-lez v6, :cond_11

    .line 1049
    .line 1050
    const-string v6, " "

    .line 1051
    .line 1052
    invoke-static {v5, v6, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v1

    .line 1056
    goto :goto_d

    .line 1057
    :cond_11
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1058
    .line 1059
    .line 1060
    move-result v6

    .line 1061
    if-lez v6, :cond_12

    .line 1062
    .line 1063
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1064
    .line 1065
    .line 1066
    move-result v6

    .line 1067
    if-nez v6, :cond_12

    .line 1068
    .line 1069
    move-object v1, v5

    .line 1070
    goto :goto_d

    .line 1071
    :cond_12
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1072
    .line 1073
    .line 1074
    move-result v5

    .line 1075
    if-nez v5, :cond_13

    .line 1076
    .line 1077
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1078
    .line 1079
    .line 1080
    move-result v5

    .line 1081
    if-lez v5, :cond_13

    .line 1082
    .line 1083
    goto :goto_d

    .line 1084
    :cond_13
    invoke-virtual/range {v38 .. v38}, Ljava/lang/String;->length()I

    .line 1085
    .line 1086
    .line 1087
    move-result v1

    .line 1088
    if-lez v1, :cond_14

    .line 1089
    .line 1090
    move-object/from16 v1, v38

    .line 1091
    .line 1092
    goto :goto_d

    .line 1093
    :cond_14
    const/4 v6, 0x0

    .line 1094
    new-array v1, v6, [Ljava/lang/Object;

    .line 1095
    .line 1096
    iget-object v5, v2, La/ctf0;->b:La/lsm0;

    .line 1097
    .line 1098
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v1

    .line 1102
    const v7, 0x7f130c89

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v5, v7, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v1

    .line 1109
    :goto_d
    iget-object v4, v4, La/qhj;->m:Ljava/lang/String;

    .line 1110
    .line 1111
    const-string v5, ", "

    .line 1112
    .line 1113
    invoke-static {v1, v5, v4}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v33

    .line 1117
    new-instance v1, La/jhj;

    .line 1118
    .line 1119
    new-instance v32, La/chl0;

    .line 1120
    .line 1121
    if-nez v10, :cond_15

    .line 1122
    .line 1123
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 1124
    .line 1125
    .line 1126
    move-result v4

    .line 1127
    if-lez v4, :cond_15

    .line 1128
    .line 1129
    move-object/from16 v34, v13

    .line 1130
    .line 1131
    goto :goto_e

    .line 1132
    :cond_15
    sget-object v4, La/pn40;->a:La/pn40;

    .line 1133
    .line 1134
    sget-object v4, La/p3u0;->e:La/p3u0;

    .line 1135
    .line 1136
    invoke-static {v11, v12, v4}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v4

    .line 1140
    move-object/from16 v34, v4

    .line 1141
    .line 1142
    :goto_e
    cmpl-double v4, v11, v11

    .line 1143
    .line 1144
    if-lez v4, :cond_16

    .line 1145
    .line 1146
    sget-object v4, La/k0d;->d:La/k0d;

    .line 1147
    .line 1148
    :goto_f
    move-object/from16 v35, v4

    .line 1149
    .line 1150
    goto :goto_10

    .line 1151
    :cond_16
    cmpg-double v4, v11, v11

    .line 1152
    .line 1153
    if-gez v4, :cond_17

    .line 1154
    .line 1155
    sget-object v4, La/k0d;->c:La/k0d;

    .line 1156
    .line 1157
    goto :goto_f

    .line 1158
    :cond_17
    sget-object v4, La/k0d;->a:La/k0d;

    .line 1159
    .line 1160
    goto :goto_f

    .line 1161
    :goto_10
    sget-object v36, La/a65;->a:La/a65;

    .line 1162
    .line 1163
    new-instance v37, La/xgl0;

    .line 1164
    .line 1165
    const-wide/16 v49, 0x0

    .line 1166
    .line 1167
    const/16 v51, 0x0

    .line 1168
    .line 1169
    const-wide/16 v38, -0x1

    .line 1170
    .line 1171
    const-wide/16 v40, 0x0

    .line 1172
    .line 1173
    const-wide/16 v42, 0x0

    .line 1174
    .line 1175
    const-string v44, ""

    .line 1176
    .line 1177
    const/16 v45, 0x0

    .line 1178
    .line 1179
    const-wide/16 v46, 0x0

    .line 1180
    .line 1181
    const/16 v48, 0x0

    .line 1182
    .line 1183
    invoke-direct/range {v37 .. v51}, La/xgl0;-><init>(JDDLjava/lang/String;IJIJZ)V

    .line 1184
    .line 1185
    .line 1186
    const/4 v4, 0x0

    .line 1187
    const/16 v38, 0x0

    .line 1188
    .line 1189
    const/16 v39, 0x0

    .line 1190
    .line 1191
    const/16 v40, 0x0

    .line 1192
    .line 1193
    move-object/from16 v41, v37

    .line 1194
    .line 1195
    move/from16 v37, v4

    .line 1196
    .line 1197
    invoke-direct/range {v32 .. v41}, La/chl0;-><init>(Ljava/lang/String;Ljava/lang/String;La/k0d;La/a65;ZZZZLa/xgl0;)V

    .line 1198
    .line 1199
    .line 1200
    move-object/from16 v4, v32

    .line 1201
    .line 1202
    invoke-direct {v1, v4}, La/jhj;-><init>(La/chl0;)V

    .line 1203
    .line 1204
    .line 1205
    move-wide/from16 v27, v20

    .line 1206
    .line 1207
    new-instance v20, La/lhj;

    .line 1208
    .line 1209
    move-object/from16 v32, v1

    .line 1210
    .line 1211
    move-wide/from16 v29, v22

    .line 1212
    .line 1213
    move-object/from16 v23, v0

    .line 1214
    .line 1215
    move-wide/from16 v21, v8

    .line 1216
    .line 1217
    invoke-direct/range {v20 .. v32}, La/lhj;-><init>(JLa/ihj;La/hhj;JJJZLa/jhj;)V

    .line 1218
    .line 1219
    .line 1220
    move-object/from16 v9, v20

    .line 1221
    .line 1222
    :goto_11
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1223
    .line 1224
    .line 1225
    move-object/from16 v0, p1

    .line 1226
    .line 1227
    move/from16 v1, v16

    .line 1228
    .line 1229
    const/4 v8, 0x0

    .line 1230
    goto/16 :goto_a

    .line 1231
    .line 1232
    :cond_18
    invoke-static {}, La/q3d;->p()V

    .line 1233
    .line 1234
    .line 1235
    throw v17

    .line 1236
    :cond_19
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    move-object v9, v0

    .line 1241
    check-cast v9, La/ugj;

    .line 1242
    .line 1243
    const/4 v13, 0x0

    .line 1244
    const/16 v15, 0xf

    .line 1245
    .line 1246
    const/4 v10, 0x0

    .line 1247
    const/4 v11, 0x0

    .line 1248
    const/4 v12, 0x0

    .line 1249
    invoke-static/range {v9 .. v15}, La/ugj;->a(La/ugj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;I)La/ugj;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v1

    .line 1253
    invoke-virtual {v3, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1254
    .line 1255
    .line 1256
    move-result v0

    .line 1257
    if-eqz v0, :cond_19

    .line 1258
    .line 1259
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1260
    .line 1261
    return-object v0

    .line 1262
    :cond_1a
    move-object/from16 v9, v17

    .line 1263
    .line 1264
    const/16 v6, 0xa

    .line 1265
    .line 1266
    const/4 v7, 0x1

    .line 1267
    goto/16 :goto_5

    .line 1268
    .line 1269
    :pswitch_c
    sget-object v1, La/wne;->a:La/wne;

    .line 1270
    .line 1271
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1272
    .line 1273
    .line 1274
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 1275
    .line 1276
    check-cast v0, La/g7m0;

    .line 1277
    .line 1278
    instance-of v1, v0, La/naj;

    .line 1279
    .line 1280
    if-eqz v1, :cond_1b

    .line 1281
    .line 1282
    check-cast v0, La/naj;

    .line 1283
    .line 1284
    iget v0, v0, La/g7m0;->a:I

    .line 1285
    .line 1286
    check-cast v10, La/g7m0;

    .line 1287
    .line 1288
    check-cast v10, La/naj;

    .line 1289
    .line 1290
    iget v1, v10, La/g7m0;->a:I

    .line 1291
    .line 1292
    if-gt v0, v1, :cond_1b

    .line 1293
    .line 1294
    const/4 v7, 0x1

    .line 1295
    goto :goto_12

    .line 1296
    :cond_1b
    const/4 v7, 0x0

    .line 1297
    :goto_12
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v0

    .line 1301
    return-object v0

    .line 1302
    :pswitch_d
    move-object/from16 v17, v9

    .line 1303
    .line 1304
    sget-object v1, La/wne;->a:La/wne;

    .line 1305
    .line 1306
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1307
    .line 1308
    .line 1309
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 1310
    .line 1311
    check-cast v0, La/o7j;

    .line 1312
    .line 1313
    iget-object v1, v0, La/o7j;->c:La/xsu;

    .line 1314
    .line 1315
    check-cast v10, Ljava/lang/String;

    .line 1316
    .line 1317
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1321
    .line 1322
    .line 1323
    iget-object v1, v1, La/xsu;->a:Ljava/lang/Object;

    .line 1324
    .line 1325
    check-cast v1, La/ali;

    .line 1326
    .line 1327
    iget-object v1, v1, La/ali;->b:Ljava/lang/Object;

    .line 1328
    .line 1329
    check-cast v1, La/yzi;

    .line 1330
    .line 1331
    iget-object v1, v1, La/yzi;->c:Ljava/util/ArrayList;

    .line 1332
    .line 1333
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v1

    .line 1337
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v1

    .line 1341
    :cond_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1342
    .line 1343
    .line 1344
    move-result v2

    .line 1345
    if-eqz v2, :cond_1d

    .line 1346
    .line 1347
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v2

    .line 1351
    move-object v3, v2

    .line 1352
    check-cast v3, La/g7j;

    .line 1353
    .line 1354
    iget-object v3, v3, La/g7j;->a:Ljava/lang/String;

    .line 1355
    .line 1356
    invoke-virtual {v10, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1357
    .line 1358
    .line 1359
    move-result v3

    .line 1360
    if-eqz v3, :cond_1c

    .line 1361
    .line 1362
    move-object v9, v2

    .line 1363
    goto :goto_13

    .line 1364
    :cond_1d
    move-object/from16 v9, v17

    .line 1365
    .line 1366
    :goto_13
    check-cast v9, La/g7j;

    .line 1367
    .line 1368
    if-eqz v9, :cond_1e

    .line 1369
    .line 1370
    iget-object v1, v9, La/g7j;->b:Ljava/util/ArrayList;

    .line 1371
    .line 1372
    goto :goto_14

    .line 1373
    :cond_1e
    sget-object v1, La/iun;->a:La/iun;

    .line 1374
    .line 1375
    :goto_14
    new-instance v2, Ljava/util/ArrayList;

    .line 1376
    .line 1377
    const/16 v3, 0xa

    .line 1378
    .line 1379
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1380
    .line 1381
    .line 1382
    move-result v3

    .line 1383
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1384
    .line 1385
    .line 1386
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v1

    .line 1390
    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1391
    .line 1392
    .line 1393
    move-result v3

    .line 1394
    if-eqz v3, :cond_1f

    .line 1395
    .line 1396
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v3

    .line 1400
    check-cast v3, La/bkv0;

    .line 1401
    .line 1402
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1403
    .line 1404
    .line 1405
    new-instance v4, La/x1s0;

    .line 1406
    .line 1407
    iget-object v9, v3, La/bkv0;->b:Ljava/lang/String;

    .line 1408
    .line 1409
    iget v5, v3, La/bkv0;->a:F

    .line 1410
    .line 1411
    float-to-double v5, v5

    .line 1412
    invoke-static {v5, v6}, La/si30;->c(D)J

    .line 1413
    .line 1414
    .line 1415
    move-result-wide v5

    .line 1416
    iget-wide v7, v3, La/bkv0;->d:J

    .line 1417
    .line 1418
    iget-object v10, v3, La/bkv0;->c:Ljava/lang/String;

    .line 1419
    .line 1420
    invoke-direct/range {v4 .. v10}, La/x1s0;-><init>(JJLjava/lang/String;Ljava/lang/String;)V

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1424
    .line 1425
    .line 1426
    goto :goto_15

    .line 1427
    :cond_1f
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1428
    .line 1429
    .line 1430
    move-result v1

    .line 1431
    if-eqz v1, :cond_20

    .line 1432
    .line 1433
    new-instance v1, La/j7j;

    .line 1434
    .line 1435
    invoke-virtual {v0}, La/o7j;->w()La/jkm;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v2

    .line 1439
    invoke-direct {v1, v2}, La/j7j;-><init>(La/jkm;)V

    .line 1440
    .line 1441
    .line 1442
    invoke-virtual {v0, v1}, La/o7j;->y(La/m7j;)V

    .line 1443
    .line 1444
    .line 1445
    goto :goto_16

    .line 1446
    :cond_20
    new-instance v1, La/l7j;

    .line 1447
    .line 1448
    invoke-direct {v1, v2}, La/l7j;-><init>(Ljava/util/ArrayList;)V

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual {v0, v1}, La/o7j;->y(La/m7j;)V

    .line 1452
    .line 1453
    .line 1454
    :goto_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1455
    .line 1456
    return-object v0

    .line 1457
    :pswitch_e
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 1458
    .line 1459
    check-cast v0, Lkotlin/Pair;

    .line 1460
    .line 1461
    sget-object v1, La/wne;->a:La/wne;

    .line 1462
    .line 1463
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1464
    .line 1465
    .line 1466
    check-cast v10, La/f7j;

    .line 1467
    .line 1468
    sget-object v1, La/a7j;->a:La/a7j;

    .line 1469
    .line 1470
    invoke-virtual {v10, v1}, La/f7j;->x(La/d7j;)V

    .line 1471
    .line 1472
    .line 1473
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1474
    .line 1475
    .line 1476
    new-instance v2, La/y1s0;

    .line 1477
    .line 1478
    iget-object v1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1479
    .line 1480
    check-cast v1, La/y6j;

    .line 1481
    .line 1482
    iget-object v7, v1, La/y6j;->b:Ljava/lang/String;

    .line 1483
    .line 1484
    iget v3, v1, La/y6j;->a:F

    .line 1485
    .line 1486
    float-to-double v3, v3

    .line 1487
    invoke-static {v3, v4}, La/si30;->c(D)J

    .line 1488
    .line 1489
    .line 1490
    move-result-wide v3

    .line 1491
    iget-wide v5, v1, La/y6j;->c:J

    .line 1492
    .line 1493
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1494
    .line 1495
    check-cast v0, La/wxb0;

    .line 1496
    .line 1497
    iget-object v8, v0, La/wxb0;->a:Ljava/lang/String;

    .line 1498
    .line 1499
    iget-object v9, v0, La/wxb0;->b:Ljava/lang/String;

    .line 1500
    .line 1501
    invoke-direct/range {v2 .. v9}, La/y1s0;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1502
    .line 1503
    .line 1504
    new-instance v0, La/c7j;

    .line 1505
    .line 1506
    iget-object v1, v10, La/f7j;->d:La/ntu;

    .line 1507
    .line 1508
    invoke-virtual {v1}, La/ntu;->a()Ljava/lang/String;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v1

    .line 1512
    invoke-static {v1, v9}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v1

    .line 1516
    invoke-direct {v0, v2, v1}, La/c7j;-><init>(La/y1s0;Ljava/lang/String;)V

    .line 1517
    .line 1518
    .line 1519
    invoke-virtual {v10, v0}, La/f7j;->x(La/d7j;)V

    .line 1520
    .line 1521
    .line 1522
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1523
    .line 1524
    return-object v0

    .line 1525
    :pswitch_f
    move-object/from16 v17, v9

    .line 1526
    .line 1527
    check-cast v10, La/f3j;

    .line 1528
    .line 1529
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 1530
    .line 1531
    check-cast v0, La/vmt0;

    .line 1532
    .line 1533
    sget-object v1, La/wne;->a:La/wne;

    .line 1534
    .line 1535
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1536
    .line 1537
    .line 1538
    instance-of v0, v0, La/smt0;

    .line 1539
    .line 1540
    if-eqz v0, :cond_22

    .line 1541
    .line 1542
    iget-object v0, v10, La/f3j;->n:Ljava/lang/Object;

    .line 1543
    .line 1544
    check-cast v0, La/c4m0;

    .line 1545
    .line 1546
    move-object/from16 v1, v17

    .line 1547
    .line 1548
    if-eqz v0, :cond_21

    .line 1549
    .line 1550
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1551
    .line 1552
    .line 1553
    :cond_21
    invoke-virtual {v10}, La/eiu0;->s()La/diu0;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v0

    .line 1557
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v3

    .line 1561
    iget-object v0, v10, La/f3j;->d:La/mne;

    .line 1562
    .line 1563
    iget-object v6, v0, La/mne;->b:La/dvj;

    .line 1564
    .line 1565
    new-instance v4, La/x2i;

    .line 1566
    .line 1567
    invoke-direct {v4, v2}, La/x2i;-><init>(B)V

    .line 1568
    .line 1569
    .line 1570
    new-instance v7, La/igb;

    .line 1571
    .line 1572
    const/16 v0, 0x1b

    .line 1573
    .line 1574
    invoke-direct {v7, v10, v1, v0}, La/igb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 1575
    .line 1576
    .line 1577
    const/16 v8, 0xa

    .line 1578
    .line 1579
    const/4 v5, 0x0

    .line 1580
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1581
    .line 1582
    .line 1583
    :cond_22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1584
    .line 1585
    return-object v0

    .line 1586
    :pswitch_10
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 1587
    .line 1588
    check-cast v0, La/sw00;

    .line 1589
    .line 1590
    sget-object v1, La/wne;->a:La/wne;

    .line 1591
    .line 1592
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1593
    .line 1594
    .line 1595
    check-cast v10, La/j2j;

    .line 1596
    .line 1597
    iget-boolean v1, v0, La/sw00;->a:Z

    .line 1598
    .line 1599
    iput-boolean v1, v10, La/j2j;->w:Z

    .line 1600
    .line 1601
    iget-boolean v0, v0, La/sw00;->b:Z

    .line 1602
    .line 1603
    if-nez v0, :cond_25

    .line 1604
    .line 1605
    if-eqz v1, :cond_25

    .line 1606
    .line 1607
    const/4 v4, 0x1

    .line 1608
    iput-boolean v4, v10, La/j2j;->v:Z

    .line 1609
    .line 1610
    iget-object v0, v10, La/j2j;->o:La/bby;

    .line 1611
    .line 1612
    const/4 v1, 0x0

    .line 1613
    if-eqz v0, :cond_23

    .line 1614
    .line 1615
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1616
    .line 1617
    .line 1618
    :cond_23
    iget-object v0, v10, La/j2j;->u:La/bby;

    .line 1619
    .line 1620
    if-eqz v0, :cond_24

    .line 1621
    .line 1622
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1623
    .line 1624
    .line 1625
    :cond_24
    invoke-virtual {v10}, La/eiu0;->s()La/diu0;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v0

    .line 1629
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v18

    .line 1633
    iget-object v0, v10, La/j2j;->d:La/mne;

    .line 1634
    .line 1635
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 1636
    .line 1637
    new-instance v22, La/y6h;

    .line 1638
    .line 1639
    const/16 v28, 0x0

    .line 1640
    .line 1641
    const/16 v29, 0x7

    .line 1642
    .line 1643
    const/16 v23, 0x1

    .line 1644
    .line 1645
    const-class v25, La/j2j;

    .line 1646
    .line 1647
    const-string v26, "onError"

    .line 1648
    .line 1649
    const-string v27, "onError(Ljava/lang/Throwable;)V"

    .line 1650
    .line 1651
    move-object/from16 v24, v10

    .line 1652
    .line 1653
    invoke-direct/range {v22 .. v29}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1654
    .line 1655
    .line 1656
    new-instance v1, La/i2j;

    .line 1657
    .line 1658
    const/4 v2, 0x0

    .line 1659
    const/4 v6, 0x0

    .line 1660
    invoke-direct {v1, v10, v2, v6}, La/i2j;-><init>(La/j2j;La/yje;B)V

    .line 1661
    .line 1662
    .line 1663
    const/16 v25, 0x20

    .line 1664
    .line 1665
    const-wide/16 v19, 0xa

    .line 1666
    .line 1667
    sget-object v21, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1668
    .line 1669
    move-object/from16 v24, v1

    .line 1670
    .line 1671
    move-object/from16 v23, v22

    .line 1672
    .line 1673
    move-object/from16 v22, v0

    .line 1674
    .line 1675
    invoke-static/range {v18 .. v25}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v0

    .line 1679
    iput-object v0, v10, La/j2j;->u:La/bby;

    .line 1680
    .line 1681
    :cond_25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1682
    .line 1683
    return-object v0

    .line 1684
    :pswitch_11
    sget-object v1, La/wne;->a:La/wne;

    .line 1685
    .line 1686
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1687
    .line 1688
    .line 1689
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 1690
    .line 1691
    check-cast v0, La/q1j;

    .line 1692
    .line 1693
    sget v1, La/q1j;->n2:I

    .line 1694
    .line 1695
    invoke-virtual {v0}, La/q1j;->P0()La/k3t0;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v0

    .line 1699
    new-instance v1, La/m1j;

    .line 1700
    .line 1701
    check-cast v10, La/kwj;

    .line 1702
    .line 1703
    invoke-virtual {v10}, La/xk80;->k()I

    .line 1704
    .line 1705
    .line 1706
    move-result v2

    .line 1707
    invoke-virtual {v10}, La/kwj;->n()I

    .line 1708
    .line 1709
    .line 1710
    move-result v3

    .line 1711
    invoke-direct {v1, v2, v3}, La/m1j;-><init>(II)V

    .line 1712
    .line 1713
    .line 1714
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1715
    .line 1716
    .line 1717
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1718
    .line 1719
    return-object v0

    .line 1720
    :pswitch_12
    sget-object v1, La/wne;->a:La/wne;

    .line 1721
    .line 1722
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1723
    .line 1724
    .line 1725
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 1726
    .line 1727
    check-cast v0, La/rsh;

    .line 1728
    .line 1729
    iget-object v0, v0, La/rsh;->l:La/ol60;

    .line 1730
    .line 1731
    check-cast v10, La/o5s0;

    .line 1732
    .line 1733
    invoke-virtual {v0, v10}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1734
    .line 1735
    .line 1736
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1737
    .line 1738
    return-object v0

    .line 1739
    :pswitch_13
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 1740
    .line 1741
    move-object v2, v0

    .line 1742
    check-cast v2, La/bqr;

    .line 1743
    .line 1744
    sget-object v0, La/wne;->a:La/wne;

    .line 1745
    .line 1746
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1747
    .line 1748
    .line 1749
    check-cast v10, La/lmh;

    .line 1750
    .line 1751
    sget v0, La/lmh;->A:I

    .line 1752
    .line 1753
    iget-object v0, v10, La/i3t0;->i:La/ocj;

    .line 1754
    .line 1755
    iget-object v7, v0, La/ocj;->a:La/p7m0;

    .line 1756
    .line 1757
    :cond_26
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v0

    .line 1761
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1762
    .line 1763
    .line 1764
    move-object v1, v0

    .line 1765
    check-cast v1, La/fmh;

    .line 1766
    .line 1767
    const/4 v5, 0x0

    .line 1768
    const/16 v6, 0x1d

    .line 1769
    .line 1770
    const/4 v3, 0x0

    .line 1771
    const/4 v4, 0x0

    .line 1772
    invoke-static/range {v1 .. v6}, La/fmh;->a(La/fmh;La/bqr;La/j0g0;La/qlh;Ljava/lang/Integer;I)La/fmh;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v1

    .line 1776
    invoke-virtual {v7, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1777
    .line 1778
    .line 1779
    move-result v0

    .line 1780
    if-eqz v0, :cond_26

    .line 1781
    .line 1782
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1783
    .line 1784
    return-object v0

    .line 1785
    :pswitch_14
    sget-object v1, La/wne;->a:La/wne;

    .line 1786
    .line 1787
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1788
    .line 1789
    .line 1790
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 1791
    .line 1792
    check-cast v0, La/k7h;

    .line 1793
    .line 1794
    iget-boolean v0, v0, La/k7h;->f:Z

    .line 1795
    .line 1796
    if-eqz v0, :cond_27

    .line 1797
    .line 1798
    check-cast v10, La/pz40;

    .line 1799
    .line 1800
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1801
    .line 1802
    invoke-interface {v10, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 1803
    .line 1804
    .line 1805
    :cond_27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1806
    .line 1807
    return-object v0

    .line 1808
    :pswitch_15
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 1809
    .line 1810
    check-cast v0, La/kam0;

    .line 1811
    .line 1812
    sget-object v1, La/wne;->a:La/wne;

    .line 1813
    .line 1814
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1815
    .line 1816
    .line 1817
    iget-boolean v0, v0, La/kam0;->b:Z

    .line 1818
    .line 1819
    if-eqz v0, :cond_28

    .line 1820
    .line 1821
    check-cast v10, La/vqg;

    .line 1822
    .line 1823
    iget-object v0, v10, La/vqg;->D:La/ol60;

    .line 1824
    .line 1825
    sget-object v1, La/oqg;->a:La/oqg;

    .line 1826
    .line 1827
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1828
    .line 1829
    .line 1830
    :cond_28
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1831
    .line 1832
    return-object v0

    .line 1833
    :pswitch_16
    sget-object v1, La/wne;->a:La/wne;

    .line 1834
    .line 1835
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1836
    .line 1837
    .line 1838
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 1839
    .line 1840
    check-cast v0, La/vqg;

    .line 1841
    .line 1842
    iget-object v1, v0, La/vqg;->E:La/dqg;

    .line 1843
    .line 1844
    if-eqz v1, :cond_39

    .line 1845
    .line 1846
    iget-object v1, v1, La/dqg;->c:La/smg;

    .line 1847
    .line 1848
    if-eqz v1, :cond_39

    .line 1849
    .line 1850
    iget-object v1, v1, La/smg;->c:Ljava/util/List;

    .line 1851
    .line 1852
    if-eqz v1, :cond_39

    .line 1853
    .line 1854
    new-instance v2, Ljava/util/ArrayList;

    .line 1855
    .line 1856
    const/16 v3, 0xa

    .line 1857
    .line 1858
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1859
    .line 1860
    .line 1861
    move-result v4

    .line 1862
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1863
    .line 1864
    .line 1865
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v1

    .line 1869
    :goto_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1870
    .line 1871
    .line 1872
    move-result v3

    .line 1873
    if-eqz v3, :cond_29

    .line 1874
    .line 1875
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v3

    .line 1879
    check-cast v3, La/wmg;

    .line 1880
    .line 1881
    iget-object v3, v3, La/wmg;->a:Ljava/lang/String;

    .line 1882
    .line 1883
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1884
    .line 1885
    .line 1886
    goto :goto_17

    .line 1887
    :cond_29
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1888
    .line 1889
    .line 1890
    move-result v1

    .line 1891
    if-eqz v1, :cond_2b

    .line 1892
    .line 1893
    iget-object v1, v0, La/vqg;->E:La/dqg;

    .line 1894
    .line 1895
    if-eqz v1, :cond_2a

    .line 1896
    .line 1897
    iget-object v1, v1, La/dqg;->e:La/d4g;

    .line 1898
    .line 1899
    if-eqz v1, :cond_2a

    .line 1900
    .line 1901
    iget-object v1, v1, La/d4g;->c:La/s8h;

    .line 1902
    .line 1903
    iget-object v1, v1, La/s8h;->f:Ljava/util/List;

    .line 1904
    .line 1905
    if-eqz v1, :cond_2a

    .line 1906
    .line 1907
    new-instance v2, Ljava/util/ArrayList;

    .line 1908
    .line 1909
    const/16 v3, 0xa

    .line 1910
    .line 1911
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1912
    .line 1913
    .line 1914
    move-result v4

    .line 1915
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1916
    .line 1917
    .line 1918
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v1

    .line 1922
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1923
    .line 1924
    .line 1925
    move-result v3

    .line 1926
    if-eqz v3, :cond_2b

    .line 1927
    .line 1928
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v3

    .line 1932
    check-cast v3, La/q8h;

    .line 1933
    .line 1934
    iget-wide v3, v3, La/q8h;->a:J

    .line 1935
    .line 1936
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1937
    .line 1938
    .line 1939
    move-result-object v3

    .line 1940
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1941
    .line 1942
    .line 1943
    goto :goto_18

    .line 1944
    :cond_2a
    const/4 v2, 0x0

    .line 1945
    :cond_2b
    if-nez v2, :cond_2c

    .line 1946
    .line 1947
    goto/16 :goto_1e

    .line 1948
    .line 1949
    :cond_2c
    iget-object v1, v0, La/vqg;->E:La/dqg;

    .line 1950
    .line 1951
    if-eqz v1, :cond_38

    .line 1952
    .line 1953
    iget-object v1, v1, La/dqg;->c:La/smg;

    .line 1954
    .line 1955
    if-eqz v1, :cond_38

    .line 1956
    .line 1957
    iget-object v1, v1, La/smg;->f:Ljava/util/List;

    .line 1958
    .line 1959
    if-eqz v1, :cond_38

    .line 1960
    .line 1961
    new-instance v3, Ljava/util/ArrayList;

    .line 1962
    .line 1963
    const/16 v4, 0xa

    .line 1964
    .line 1965
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1966
    .line 1967
    .line 1968
    move-result v5

    .line 1969
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1970
    .line 1971
    .line 1972
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v1

    .line 1976
    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1977
    .line 1978
    .line 1979
    move-result v4

    .line 1980
    if-eqz v4, :cond_2d

    .line 1981
    .line 1982
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1983
    .line 1984
    .line 1985
    move-result-object v4

    .line 1986
    check-cast v4, La/wmg;

    .line 1987
    .line 1988
    iget-object v4, v4, La/wmg;->a:Ljava/lang/String;

    .line 1989
    .line 1990
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1991
    .line 1992
    .line 1993
    goto :goto_19

    .line 1994
    :cond_2d
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1995
    .line 1996
    .line 1997
    move-result v1

    .line 1998
    if-eqz v1, :cond_2f

    .line 1999
    .line 2000
    iget-object v1, v0, La/vqg;->E:La/dqg;

    .line 2001
    .line 2002
    if-eqz v1, :cond_2e

    .line 2003
    .line 2004
    iget-object v1, v1, La/dqg;->e:La/d4g;

    .line 2005
    .line 2006
    if-eqz v1, :cond_2e

    .line 2007
    .line 2008
    iget-object v1, v1, La/d4g;->d:La/s8h;

    .line 2009
    .line 2010
    iget-object v1, v1, La/s8h;->f:Ljava/util/List;

    .line 2011
    .line 2012
    if-eqz v1, :cond_2e

    .line 2013
    .line 2014
    new-instance v3, Ljava/util/ArrayList;

    .line 2015
    .line 2016
    const/16 v4, 0xa

    .line 2017
    .line 2018
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2019
    .line 2020
    .line 2021
    move-result v4

    .line 2022
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 2023
    .line 2024
    .line 2025
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v1

    .line 2029
    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2030
    .line 2031
    .line 2032
    move-result v4

    .line 2033
    if-eqz v4, :cond_2f

    .line 2034
    .line 2035
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v4

    .line 2039
    check-cast v4, La/q8h;

    .line 2040
    .line 2041
    iget-wide v4, v4, La/q8h;->a:J

    .line 2042
    .line 2043
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v4

    .line 2047
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2048
    .line 2049
    .line 2050
    goto :goto_1a

    .line 2051
    :cond_2e
    const/4 v3, 0x0

    .line 2052
    :cond_2f
    if-nez v3, :cond_30

    .line 2053
    .line 2054
    goto/16 :goto_1d

    .line 2055
    .line 2056
    :cond_30
    iget-object v0, v0, La/vqg;->K:La/p7m0;

    .line 2057
    .line 2058
    check-cast v10, Ljava/lang/String;

    .line 2059
    .line 2060
    :cond_31
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v1

    .line 2064
    move-object v4, v1

    .line 2065
    check-cast v4, La/wmm0;

    .line 2066
    .line 2067
    iget-object v5, v4, La/wmm0;->g:La/o4i0;

    .line 2068
    .line 2069
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2070
    .line 2071
    .line 2072
    move-result-object v6

    .line 2073
    :cond_32
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2074
    .line 2075
    .line 2076
    move-result v7

    .line 2077
    if-eqz v7, :cond_33

    .line 2078
    .line 2079
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v7

    .line 2083
    move-object v8, v7

    .line 2084
    check-cast v8, Ljava/lang/String;

    .line 2085
    .line 2086
    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2087
    .line 2088
    .line 2089
    move-result v8

    .line 2090
    if-eqz v8, :cond_32

    .line 2091
    .line 2092
    goto :goto_1b

    .line 2093
    :cond_33
    const/4 v7, 0x0

    .line 2094
    :goto_1b
    check-cast v7, Ljava/lang/String;

    .line 2095
    .line 2096
    if-nez v7, :cond_34

    .line 2097
    .line 2098
    iget-object v7, v5, La/o4i0;->a:Ljava/lang/String;

    .line 2099
    .line 2100
    :cond_34
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v6

    .line 2104
    :cond_35
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2105
    .line 2106
    .line 2107
    move-result v8

    .line 2108
    if-eqz v8, :cond_36

    .line 2109
    .line 2110
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2111
    .line 2112
    .line 2113
    move-result-object v8

    .line 2114
    move-object v9, v8

    .line 2115
    check-cast v9, Ljava/lang/String;

    .line 2116
    .line 2117
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2118
    .line 2119
    .line 2120
    move-result v9

    .line 2121
    if-eqz v9, :cond_35

    .line 2122
    .line 2123
    goto :goto_1c

    .line 2124
    :cond_36
    const/4 v8, 0x0

    .line 2125
    :goto_1c
    check-cast v8, Ljava/lang/String;

    .line 2126
    .line 2127
    if-nez v8, :cond_37

    .line 2128
    .line 2129
    iget-object v8, v5, La/o4i0;->b:Ljava/lang/String;

    .line 2130
    .line 2131
    :cond_37
    invoke-static {v7, v8}, La/o4i0;->a(Ljava/lang/String;Ljava/lang/String;)La/o4i0;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v31

    .line 2135
    const/16 v35, 0x0

    .line 2136
    .line 2137
    const/16 v36, 0x3bf

    .line 2138
    .line 2139
    const-wide/16 v19, 0x0

    .line 2140
    .line 2141
    const-wide/16 v21, 0x0

    .line 2142
    .line 2143
    const-wide/16 v23, 0x0

    .line 2144
    .line 2145
    const-wide/16 v25, 0x0

    .line 2146
    .line 2147
    const-wide/16 v27, 0x0

    .line 2148
    .line 2149
    const-wide/16 v29, 0x0

    .line 2150
    .line 2151
    const/16 v32, 0x0

    .line 2152
    .line 2153
    const-wide/16 v33, 0x0

    .line 2154
    .line 2155
    move-object/from16 v18, v4

    .line 2156
    .line 2157
    invoke-static/range {v18 .. v36}, La/wmm0;->a(La/wmm0;JJJJJJLa/o4i0;La/hyx;JLjava/util/ArrayList;I)La/wmm0;

    .line 2158
    .line 2159
    .line 2160
    move-result-object v4

    .line 2161
    invoke-virtual {v0, v1, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2162
    .line 2163
    .line 2164
    move-result v1

    .line 2165
    if-eqz v1, :cond_31

    .line 2166
    .line 2167
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2168
    .line 2169
    goto :goto_1f

    .line 2170
    :cond_38
    :goto_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2171
    .line 2172
    goto :goto_1f

    .line 2173
    :cond_39
    :goto_1e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2174
    .line 2175
    :goto_1f
    return-object v0

    .line 2176
    :pswitch_17
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 2177
    .line 2178
    move-object v4, v0

    .line 2179
    check-cast v4, La/mig;

    .line 2180
    .line 2181
    sget-object v0, La/wne;->a:La/wne;

    .line 2182
    .line 2183
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2184
    .line 2185
    .line 2186
    check-cast v10, La/xig;

    .line 2187
    .line 2188
    sget v0, La/xig;->J:I

    .line 2189
    .line 2190
    iget-object v0, v10, La/i3t0;->i:La/ocj;

    .line 2191
    .line 2192
    iget-object v11, v0, La/ocj;->a:La/p7m0;

    .line 2193
    .line 2194
    :cond_3a
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v0

    .line 2198
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2199
    .line 2200
    .line 2201
    move-object v1, v0

    .line 2202
    check-cast v1, La/sig;

    .line 2203
    .line 2204
    iget-object v3, v4, La/mig;->c:La/wcb;

    .line 2205
    .line 2206
    iget-object v5, v4, La/mig;->d:Ljava/lang/String;

    .line 2207
    .line 2208
    iget-object v6, v4, La/mig;->b:Ljava/util/List;

    .line 2209
    .line 2210
    const/4 v8, 0x0

    .line 2211
    const/16 v9, 0xc3f

    .line 2212
    .line 2213
    const/4 v2, 0x0

    .line 2214
    const/4 v7, 0x0

    .line 2215
    invoke-static/range {v1 .. v9}, La/sig;->a(La/sig;ZLa/wcb;La/mig;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)La/sig;

    .line 2216
    .line 2217
    .line 2218
    move-result-object v1

    .line 2219
    invoke-virtual {v11, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2220
    .line 2221
    .line 2222
    move-result v0

    .line 2223
    if-eqz v0, :cond_3a

    .line 2224
    .line 2225
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2226
    .line 2227
    return-object v0

    .line 2228
    :pswitch_18
    check-cast v10, La/igg;

    .line 2229
    .line 2230
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 2231
    .line 2232
    sget-object v1, La/wne;->a:La/wne;

    .line 2233
    .line 2234
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2235
    .line 2236
    .line 2237
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 2238
    .line 2239
    instance-of v1, v0, La/g0g0;

    .line 2240
    .line 2241
    if-eqz v1, :cond_3b

    .line 2242
    .line 2243
    const/4 v0, 0x0

    .line 2244
    :cond_3b
    check-cast v0, La/vdg;

    .line 2245
    .line 2246
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 2247
    .line 2248
    .line 2249
    move-result-object v1

    .line 2250
    check-cast v1, La/egg;

    .line 2251
    .line 2252
    iget-object v1, v1, La/egg;->e:Ljava/util/List;

    .line 2253
    .line 2254
    iget-object v2, v10, La/i3t0;->i:La/ocj;

    .line 2255
    .line 2256
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 2257
    .line 2258
    :goto_20
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2259
    .line 2260
    .line 2261
    move-result-object v3

    .line 2262
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2263
    .line 2264
    .line 2265
    move-object/from16 v18, v3

    .line 2266
    .line 2267
    check-cast v18, La/egg;

    .line 2268
    .line 2269
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 2270
    .line 2271
    .line 2272
    move-result v4

    .line 2273
    if-eqz v4, :cond_3e

    .line 2274
    .line 2275
    if-eqz v0, :cond_3c

    .line 2276
    .line 2277
    iget-object v4, v0, La/vdg;->a:Ljava/util/ArrayList;

    .line 2278
    .line 2279
    goto :goto_21

    .line 2280
    :cond_3c
    const/4 v4, 0x0

    .line 2281
    :goto_21
    if-nez v4, :cond_3d

    .line 2282
    .line 2283
    sget-object v4, La/iun;->a:La/iun;

    .line 2284
    .line 2285
    :cond_3d
    move-object/from16 v22, v4

    .line 2286
    .line 2287
    :goto_22
    const/4 v6, 0x0

    .line 2288
    goto :goto_23

    .line 2289
    :cond_3e
    move-object/from16 v22, v1

    .line 2290
    .line 2291
    goto :goto_22

    .line 2292
    :goto_23
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2293
    .line 2294
    .line 2295
    move-result-object v20

    .line 2296
    const/16 v23, 0x0

    .line 2297
    .line 2298
    const/16 v24, 0xc5

    .line 2299
    .line 2300
    const/16 v19, 0x0

    .line 2301
    .line 2302
    move-object/from16 v21, v0

    .line 2303
    .line 2304
    invoke-static/range {v18 .. v24}, La/egg;->a(La/egg;ZLjava/lang/Integer;La/vdg;Ljava/util/List;ZI)La/egg;

    .line 2305
    .line 2306
    .line 2307
    move-result-object v0

    .line 2308
    move-object/from16 v4, v21

    .line 2309
    .line 2310
    invoke-virtual {v2, v3, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2311
    .line 2312
    .line 2313
    move-result v0

    .line 2314
    if-eqz v0, :cond_3f

    .line 2315
    .line 2316
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2317
    .line 2318
    return-object v0

    .line 2319
    :cond_3f
    move-object v0, v4

    .line 2320
    goto :goto_20

    .line 2321
    :pswitch_19
    check-cast v10, La/jfg;

    .line 2322
    .line 2323
    iget-object v1, v10, La/jfg;->q:La/hjd;

    .line 2324
    .line 2325
    sget-object v2, La/wne;->a:La/wne;

    .line 2326
    .line 2327
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2328
    .line 2329
    .line 2330
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 2331
    .line 2332
    check-cast v0, La/teg;

    .line 2333
    .line 2334
    sget-object v2, La/seg;->a:La/seg;

    .line 2335
    .line 2336
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2337
    .line 2338
    .line 2339
    move-result v2

    .line 2340
    if-eqz v2, :cond_40

    .line 2341
    .line 2342
    sget v0, La/jfg;->B:I

    .line 2343
    .line 2344
    invoke-virtual {v10}, La/jfg;->M()V

    .line 2345
    .line 2346
    .line 2347
    goto/16 :goto_28

    .line 2348
    .line 2349
    :cond_40
    instance-of v2, v0, La/reg;

    .line 2350
    .line 2351
    if-eqz v2, :cond_47

    .line 2352
    .line 2353
    check-cast v0, La/reg;

    .line 2354
    .line 2355
    sget v2, La/jfg;->B:I

    .line 2356
    .line 2357
    instance-of v2, v0, La/peg;

    .line 2358
    .line 2359
    if-eqz v2, :cond_43

    .line 2360
    .line 2361
    new-instance v2, La/did;

    .line 2362
    .line 2363
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 2364
    .line 2365
    .line 2366
    move-result-object v3

    .line 2367
    check-cast v3, La/dfg;

    .line 2368
    .line 2369
    iget-object v3, v3, La/dfg;->c:La/j0g0;

    .line 2370
    .line 2371
    if-eqz v3, :cond_42

    .line 2372
    .line 2373
    iget-object v3, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 2374
    .line 2375
    instance-of v4, v3, La/g0g0;

    .line 2376
    .line 2377
    if-eqz v4, :cond_41

    .line 2378
    .line 2379
    const/4 v9, 0x0

    .line 2380
    goto :goto_24

    .line 2381
    :cond_41
    move-object v9, v3

    .line 2382
    :goto_24
    check-cast v9, La/bfg;

    .line 2383
    .line 2384
    if-eqz v9, :cond_42

    .line 2385
    .line 2386
    invoke-static {v9}, La/vic;->y(La/bfg;)Ljava/util/ArrayList;

    .line 2387
    .line 2388
    .line 2389
    move-result-object v3

    .line 2390
    goto :goto_25

    .line 2391
    :cond_42
    sget-object v3, La/iun;->a:La/iun;

    .line 2392
    .line 2393
    :goto_25
    invoke-direct {v2, v3}, La/did;-><init>(Ljava/util/List;)V

    .line 2394
    .line 2395
    .line 2396
    check-cast v0, La/peg;

    .line 2397
    .line 2398
    iget-object v0, v0, La/peg;->a:La/uid;

    .line 2399
    .line 2400
    new-array v3, v5, [La/vid;

    .line 2401
    .line 2402
    const/4 v6, 0x0

    .line 2403
    aput-object v2, v3, v6

    .line 2404
    .line 2405
    const/16 v21, 0x1

    .line 2406
    .line 2407
    aput-object v0, v3, v21

    .line 2408
    .line 2409
    invoke-static {v10, v1, v3}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 2410
    .line 2411
    .line 2412
    goto :goto_28

    .line 2413
    :cond_43
    instance-of v2, v0, La/qeg;

    .line 2414
    .line 2415
    if-eqz v2, :cond_46

    .line 2416
    .line 2417
    new-instance v2, La/did;

    .line 2418
    .line 2419
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 2420
    .line 2421
    .line 2422
    move-result-object v3

    .line 2423
    check-cast v3, La/dfg;

    .line 2424
    .line 2425
    iget-object v3, v3, La/dfg;->c:La/j0g0;

    .line 2426
    .line 2427
    if-eqz v3, :cond_45

    .line 2428
    .line 2429
    iget-object v3, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 2430
    .line 2431
    instance-of v4, v3, La/g0g0;

    .line 2432
    .line 2433
    if-eqz v4, :cond_44

    .line 2434
    .line 2435
    const/4 v9, 0x0

    .line 2436
    goto :goto_26

    .line 2437
    :cond_44
    move-object v9, v3

    .line 2438
    :goto_26
    check-cast v9, La/bfg;

    .line 2439
    .line 2440
    if-eqz v9, :cond_45

    .line 2441
    .line 2442
    invoke-static {v9}, La/vic;->y(La/bfg;)Ljava/util/ArrayList;

    .line 2443
    .line 2444
    .line 2445
    move-result-object v3

    .line 2446
    goto :goto_27

    .line 2447
    :cond_45
    sget-object v3, La/iun;->a:La/iun;

    .line 2448
    .line 2449
    :goto_27
    invoke-direct {v2, v3}, La/did;-><init>(Ljava/util/List;)V

    .line 2450
    .line 2451
    .line 2452
    check-cast v0, La/qeg;

    .line 2453
    .line 2454
    iget-object v0, v0, La/qeg;->a:La/bem;

    .line 2455
    .line 2456
    invoke-static {v0}, La/ebc;->n0(La/bem;)La/uid;

    .line 2457
    .line 2458
    .line 2459
    move-result-object v0

    .line 2460
    new-array v3, v5, [La/vid;

    .line 2461
    .line 2462
    const/4 v6, 0x0

    .line 2463
    aput-object v2, v3, v6

    .line 2464
    .line 2465
    const/16 v21, 0x1

    .line 2466
    .line 2467
    aput-object v0, v3, v21

    .line 2468
    .line 2469
    invoke-static {v10, v1, v3}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 2470
    .line 2471
    .line 2472
    :goto_28
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2473
    .line 2474
    goto :goto_2a

    .line 2475
    :cond_46
    invoke-static {}, La/t9f;->b()V

    .line 2476
    .line 2477
    .line 2478
    :goto_29
    const/4 v9, 0x0

    .line 2479
    goto :goto_2a

    .line 2480
    :cond_47
    invoke-static {}, La/t9f;->b()V

    .line 2481
    .line 2482
    .line 2483
    goto :goto_29

    .line 2484
    :goto_2a
    return-object v9

    .line 2485
    :pswitch_1a
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 2486
    .line 2487
    check-cast v0, La/cfb;

    .line 2488
    .line 2489
    sget-object v1, La/wne;->a:La/wne;

    .line 2490
    .line 2491
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2492
    .line 2493
    .line 2494
    iget-object v1, v0, La/cfb;->a:Ljava/util/List;

    .line 2495
    .line 2496
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 2497
    .line 2498
    .line 2499
    move-result v1

    .line 2500
    const/4 v4, 0x1

    .line 2501
    if-le v1, v4, :cond_48

    .line 2502
    .line 2503
    check-cast v10, La/wcg;

    .line 2504
    .line 2505
    sget-object v1, La/wcg;->U1:La/usd;

    .line 2506
    .line 2507
    invoke-virtual {v10}, La/wcg;->G0()La/fs10;

    .line 2508
    .line 2509
    .line 2510
    move-result-object v1

    .line 2511
    iget-object v1, v1, La/fs10;->b:La/nq8;

    .line 2512
    .line 2513
    iget-object v1, v1, La/nq8;->c:Landroid/view/View;

    .line 2514
    .line 2515
    check-cast v1, Landroidx/compose/ui/platform/ComposeView;

    .line 2516
    .line 2517
    new-instance v2, La/owp0;

    .line 2518
    .line 2519
    invoke-direct {v2, v10}, La/owp0;-><init>(La/clz;)V

    .line 2520
    .line 2521
    .line 2522
    new-instance v3, La/eod;

    .line 2523
    .line 2524
    const/16 v4, 0x12

    .line 2525
    .line 2526
    invoke-direct {v3, v0, v10, v4}, La/eod;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2527
    .line 2528
    .line 2529
    new-instance v0, La/ugd;

    .line 2530
    .line 2531
    const v4, -0xe8652a7

    .line 2532
    .line 2533
    .line 2534
    const/4 v5, 0x1

    .line 2535
    invoke-direct {v0, v4, v5, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2536
    .line 2537
    .line 2538
    const/4 v3, 0x0

    .line 2539
    invoke-static {v1, v2, v3, v0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 2540
    .line 2541
    .line 2542
    :cond_48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2543
    .line 2544
    return-object v0

    .line 2545
    :pswitch_1b
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 2546
    .line 2547
    if-nez v0, :cond_49

    .line 2548
    .line 2549
    sget-object v0, La/wne;->a:La/wne;

    .line 2550
    .line 2551
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2552
    .line 2553
    .line 2554
    check-cast v10, La/dcg;

    .line 2555
    .line 2556
    sget-object v0, La/dcg;->P1:La/nwd;

    .line 2557
    .line 2558
    iget-object v0, v10, La/dcg;->O1:La/s0r;

    .line 2559
    .line 2560
    sget-object v1, La/dcg;->Q1:[La/iiy;

    .line 2561
    .line 2562
    const/4 v6, 0x0

    .line 2563
    aget-object v1, v1, v6

    .line 2564
    .line 2565
    invoke-virtual {v0, v1, v10}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2566
    .line 2567
    .line 2568
    move-result-object v0

    .line 2569
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2570
    .line 2571
    .line 2572
    check-cast v0, La/tth;

    .line 2573
    .line 2574
    const/16 v17, 0x0

    .line 2575
    .line 2576
    throw v17

    .line 2577
    :cond_49
    new-instance v0, Ljava/lang/ClassCastException;

    .line 2578
    .line 2579
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 2580
    .line 2581
    .line 2582
    throw v0

    .line 2583
    :pswitch_1c
    iget-object v0, v0, La/e9g;->j:Ljava/lang/Object;

    .line 2584
    .line 2585
    check-cast v0, La/c5g;

    .line 2586
    .line 2587
    sget-object v1, La/wne;->a:La/wne;

    .line 2588
    .line 2589
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2590
    .line 2591
    .line 2592
    check-cast v10, La/g9g;

    .line 2593
    .line 2594
    iget-object v1, v10, La/g9g;->n:La/c5g;

    .line 2595
    .line 2596
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2597
    .line 2598
    .line 2599
    move-result v1

    .line 2600
    if-nez v1, :cond_55

    .line 2601
    .line 2602
    iget-object v1, v10, La/g9g;->f:La/a7q;

    .line 2603
    .line 2604
    iget-object v1, v1, La/a7q;->a:Ljava/lang/Object;

    .line 2605
    .line 2606
    check-cast v1, La/ul9;

    .line 2607
    .line 2608
    invoke-virtual {v1}, La/ul9;->b()La/o4g;

    .line 2609
    .line 2610
    .line 2611
    move-result-object v1

    .line 2612
    iget-object v3, v10, La/g9g;->b:La/yag;

    .line 2613
    .line 2614
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 2615
    .line 2616
    .line 2617
    move-result v4

    .line 2618
    const/4 v7, 0x6

    .line 2619
    const/4 v8, 0x5

    .line 2620
    const/16 v9, 0xd

    .line 2621
    .line 2622
    const/16 v11, 0x3b

    .line 2623
    .line 2624
    const/16 v12, 0xc

    .line 2625
    .line 2626
    const/16 v13, 0x17

    .line 2627
    .line 2628
    const/16 v14, 0xb

    .line 2629
    .line 2630
    const/4 v15, -0x1

    .line 2631
    const/4 v6, 0x1

    .line 2632
    if-eq v4, v6, :cond_4f

    .line 2633
    .line 2634
    if-eq v4, v5, :cond_4d

    .line 2635
    .line 2636
    if-eq v4, v2, :cond_4a

    .line 2637
    .line 2638
    sget-object v1, La/iun;->a:La/iun;

    .line 2639
    .line 2640
    :goto_2b
    move-object v11, v10

    .line 2641
    const/4 v6, 0x0

    .line 2642
    goto/16 :goto_2f

    .line 2643
    .line 2644
    :cond_4a
    iget-object v2, v10, La/g9g;->m:Ljava/util/List;

    .line 2645
    .line 2646
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 2647
    .line 2648
    .line 2649
    move-result v4

    .line 2650
    if-eqz v4, :cond_4c

    .line 2651
    .line 2652
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 2653
    .line 2654
    .line 2655
    move-result-object v2

    .line 2656
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2657
    .line 2658
    .line 2659
    move-result-object v4

    .line 2660
    invoke-static {v2, v4}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 2661
    .line 2662
    .line 2663
    move-result-object v2

    .line 2664
    iget-object v4, v1, La/o4g;->b:Ljava/util/List;

    .line 2665
    .line 2666
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 2667
    .line 2668
    .line 2669
    move-result-object v4

    .line 2670
    check-cast v4, La/d5g;

    .line 2671
    .line 2672
    iget v4, v4, La/d5g;->a:I

    .line 2673
    .line 2674
    iget-object v1, v1, La/o4g;->b:Ljava/util/List;

    .line 2675
    .line 2676
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 2677
    .line 2678
    .line 2679
    move-result-object v6

    .line 2680
    check-cast v6, La/d5g;

    .line 2681
    .line 2682
    iget-object v6, v6, La/d5g;->b:Ljava/util/List;

    .line 2683
    .line 2684
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->i0(Ljava/util/List;)Ljava/lang/Comparable;

    .line 2685
    .line 2686
    .line 2687
    move-result-object v6

    .line 2688
    check-cast v6, Ljava/lang/Number;

    .line 2689
    .line 2690
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 2691
    .line 2692
    .line 2693
    move-result v6

    .line 2694
    const/16 v21, 0x1

    .line 2695
    .line 2696
    add-int/lit8 v6, v6, -0x1

    .line 2697
    .line 2698
    invoke-virtual {v2, v8}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 2699
    .line 2700
    .line 2701
    move-result v7

    .line 2702
    invoke-virtual {v2, v4, v6, v7}, Ljava/util/Calendar;->set(III)V

    .line 2703
    .line 2704
    .line 2705
    invoke-virtual {v2, v14, v13}, Ljava/util/Calendar;->set(II)V

    .line 2706
    .line 2707
    .line 2708
    invoke-virtual {v2, v12, v11}, Ljava/util/Calendar;->set(II)V

    .line 2709
    .line 2710
    .line 2711
    invoke-virtual {v2, v9, v11}, Ljava/util/Calendar;->set(II)V

    .line 2712
    .line 2713
    .line 2714
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 2715
    .line 2716
    .line 2717
    move-result-object v4

    .line 2718
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2719
    .line 2720
    .line 2721
    move-result-object v6

    .line 2722
    invoke-static {v4, v6}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 2723
    .line 2724
    .line 2725
    move-result-object v4

    .line 2726
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 2727
    .line 2728
    .line 2729
    move-result-object v6

    .line 2730
    check-cast v6, La/d5g;

    .line 2731
    .line 2732
    iget v6, v6, La/d5g;->a:I

    .line 2733
    .line 2734
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 2735
    .line 2736
    .line 2737
    move-result-object v1

    .line 2738
    check-cast v1, La/d5g;

    .line 2739
    .line 2740
    iget-object v1, v1, La/d5g;->b:Ljava/util/List;

    .line 2741
    .line 2742
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->l0(Ljava/util/List;)Ljava/lang/Comparable;

    .line 2743
    .line 2744
    .line 2745
    move-result-object v1

    .line 2746
    check-cast v1, Ljava/lang/Number;

    .line 2747
    .line 2748
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 2749
    .line 2750
    .line 2751
    move-result v1

    .line 2752
    const/16 v21, 0x1

    .line 2753
    .line 2754
    add-int/lit8 v1, v1, -0x1

    .line 2755
    .line 2756
    invoke-virtual {v4, v8}, Ljava/util/Calendar;->getActualMinimum(I)I

    .line 2757
    .line 2758
    .line 2759
    move-result v7

    .line 2760
    invoke-virtual {v4, v6, v1, v7}, Ljava/util/Calendar;->set(III)V

    .line 2761
    .line 2762
    .line 2763
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 2764
    .line 2765
    .line 2766
    move-result-wide v6

    .line 2767
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 2768
    .line 2769
    .line 2770
    move-result-wide v1

    .line 2771
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 2772
    .line 2773
    .line 2774
    move-result-object v4

    .line 2775
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2776
    .line 2777
    .line 2778
    move-result-object v9

    .line 2779
    invoke-static {v4, v9}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 2780
    .line 2781
    .line 2782
    move-result-object v4

    .line 2783
    invoke-virtual {v4, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 2784
    .line 2785
    .line 2786
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 2787
    .line 2788
    .line 2789
    move-result-object v1

    .line 2790
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2791
    .line 2792
    .line 2793
    move-result-object v2

    .line 2794
    invoke-static {v1, v2}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 2795
    .line 2796
    .line 2797
    move-result-object v1

    .line 2798
    invoke-virtual {v1, v6, v7}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 2799
    .line 2800
    .line 2801
    new-instance v2, Ljava/util/ArrayList;

    .line 2802
    .line 2803
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2804
    .line 2805
    .line 2806
    :goto_2c
    invoke-virtual {v4, v1}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    .line 2807
    .line 2808
    .line 2809
    move-result v6

    .line 2810
    if-eqz v6, :cond_4b

    .line 2811
    .line 2812
    invoke-static {v1}, La/fre0;->S(Ljava/util/Calendar;)Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 2813
    .line 2814
    .line 2815
    move-result-object v6

    .line 2816
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2817
    .line 2818
    .line 2819
    const/4 v6, 0x1

    .line 2820
    invoke-virtual {v1, v5, v6}, Ljava/util/Calendar;->add(II)V

    .line 2821
    .line 2822
    .line 2823
    invoke-virtual {v1, v8}, Ljava/util/Calendar;->getActualMinimum(I)I

    .line 2824
    .line 2825
    .line 2826
    move-result v6

    .line 2827
    invoke-virtual {v1, v8, v6}, Ljava/util/Calendar;->set(II)V

    .line 2828
    .line 2829
    .line 2830
    goto :goto_2c

    .line 2831
    :cond_4b
    iput-object v2, v10, La/g9g;->m:Ljava/util/List;

    .line 2832
    .line 2833
    :cond_4c
    :goto_2d
    move-object v1, v2

    .line 2834
    goto/16 :goto_2b

    .line 2835
    .line 2836
    :cond_4d
    iget-object v2, v10, La/g9g;->m:Ljava/util/List;

    .line 2837
    .line 2838
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 2839
    .line 2840
    .line 2841
    move-result v4

    .line 2842
    if-eqz v4, :cond_4c

    .line 2843
    .line 2844
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 2845
    .line 2846
    .line 2847
    move-result-object v2

    .line 2848
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2849
    .line 2850
    .line 2851
    move-result-object v4

    .line 2852
    invoke-static {v2, v4}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 2853
    .line 2854
    .line 2855
    move-result-object v2

    .line 2856
    iget-object v4, v1, La/o4g;->b:Ljava/util/List;

    .line 2857
    .line 2858
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 2859
    .line 2860
    .line 2861
    move-result-object v4

    .line 2862
    check-cast v4, La/d5g;

    .line 2863
    .line 2864
    iget v4, v4, La/d5g;->a:I

    .line 2865
    .line 2866
    iget-object v1, v1, La/o4g;->b:Ljava/util/List;

    .line 2867
    .line 2868
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 2869
    .line 2870
    .line 2871
    move-result-object v5

    .line 2872
    check-cast v5, La/d5g;

    .line 2873
    .line 2874
    iget-object v5, v5, La/d5g;->b:Ljava/util/List;

    .line 2875
    .line 2876
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->i0(Ljava/util/List;)Ljava/lang/Comparable;

    .line 2877
    .line 2878
    .line 2879
    move-result-object v5

    .line 2880
    check-cast v5, Ljava/lang/Number;

    .line 2881
    .line 2882
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 2883
    .line 2884
    .line 2885
    move-result v5

    .line 2886
    const/16 v21, 0x1

    .line 2887
    .line 2888
    add-int/lit8 v5, v5, -0x1

    .line 2889
    .line 2890
    invoke-virtual {v2, v8}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 2891
    .line 2892
    .line 2893
    move-result v6

    .line 2894
    invoke-virtual {v2, v4, v5, v6}, Ljava/util/Calendar;->set(III)V

    .line 2895
    .line 2896
    .line 2897
    invoke-virtual {v2, v8}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 2898
    .line 2899
    .line 2900
    move-result v4

    .line 2901
    invoke-virtual {v2, v8, v4}, Ljava/util/Calendar;->set(II)V

    .line 2902
    .line 2903
    .line 2904
    invoke-virtual {v2, v14, v13}, Ljava/util/Calendar;->set(II)V

    .line 2905
    .line 2906
    .line 2907
    invoke-virtual {v2, v12, v11}, Ljava/util/Calendar;->set(II)V

    .line 2908
    .line 2909
    .line 2910
    invoke-virtual {v2, v9, v11}, Ljava/util/Calendar;->set(II)V

    .line 2911
    .line 2912
    .line 2913
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 2914
    .line 2915
    .line 2916
    move-result-object v4

    .line 2917
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2918
    .line 2919
    .line 2920
    move-result-object v5

    .line 2921
    invoke-static {v4, v5}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 2922
    .line 2923
    .line 2924
    move-result-object v4

    .line 2925
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 2926
    .line 2927
    .line 2928
    move-result-object v5

    .line 2929
    check-cast v5, La/d5g;

    .line 2930
    .line 2931
    iget v5, v5, La/d5g;->a:I

    .line 2932
    .line 2933
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 2934
    .line 2935
    .line 2936
    move-result-object v1

    .line 2937
    check-cast v1, La/d5g;

    .line 2938
    .line 2939
    iget-object v1, v1, La/d5g;->b:Ljava/util/List;

    .line 2940
    .line 2941
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->l0(Ljava/util/List;)Ljava/lang/Comparable;

    .line 2942
    .line 2943
    .line 2944
    move-result-object v1

    .line 2945
    check-cast v1, Ljava/lang/Number;

    .line 2946
    .line 2947
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 2948
    .line 2949
    .line 2950
    move-result v1

    .line 2951
    const/16 v21, 0x1

    .line 2952
    .line 2953
    add-int/lit8 v1, v1, -0x1

    .line 2954
    .line 2955
    invoke-virtual {v4, v8}, Ljava/util/Calendar;->getMinimum(I)I

    .line 2956
    .line 2957
    .line 2958
    move-result v6

    .line 2959
    invoke-virtual {v4, v5, v1, v6}, Ljava/util/Calendar;->set(III)V

    .line 2960
    .line 2961
    .line 2962
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 2963
    .line 2964
    .line 2965
    const/4 v1, 0x7

    .line 2966
    invoke-virtual {v4}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    .line 2967
    .line 2968
    .line 2969
    move-result v5

    .line 2970
    invoke-virtual {v4, v1, v5}, Ljava/util/Calendar;->set(II)V

    .line 2971
    .line 2972
    .line 2973
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 2974
    .line 2975
    .line 2976
    move-result-wide v4

    .line 2977
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 2978
    .line 2979
    .line 2980
    move-result-wide v1

    .line 2981
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 2982
    .line 2983
    .line 2984
    move-result-object v6

    .line 2985
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2986
    .line 2987
    .line 2988
    move-result-object v8

    .line 2989
    invoke-static {v6, v8}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 2990
    .line 2991
    .line 2992
    move-result-object v6

    .line 2993
    invoke-virtual {v6, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 2994
    .line 2995
    .line 2996
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 2997
    .line 2998
    .line 2999
    move-result-object v1

    .line 3000
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 3001
    .line 3002
    .line 3003
    move-result-object v2

    .line 3004
    invoke-static {v1, v2}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 3005
    .line 3006
    .line 3007
    move-result-object v1

    .line 3008
    invoke-virtual {v1, v4, v5}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 3009
    .line 3010
    .line 3011
    new-instance v2, Ljava/util/ArrayList;

    .line 3012
    .line 3013
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 3014
    .line 3015
    .line 3016
    :goto_2e
    invoke-virtual {v6, v1}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    .line 3017
    .line 3018
    .line 3019
    move-result v4

    .line 3020
    if-eqz v4, :cond_4e

    .line 3021
    .line 3022
    invoke-static {v1}, La/fre0;->U(Ljava/util/Calendar;)Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 3023
    .line 3024
    .line 3025
    move-result-object v4

    .line 3026
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3027
    .line 3028
    .line 3029
    const/4 v4, 0x1

    .line 3030
    invoke-virtual {v1, v7, v4}, Ljava/util/Calendar;->add(II)V

    .line 3031
    .line 3032
    .line 3033
    goto :goto_2e

    .line 3034
    :cond_4e
    iput-object v2, v10, La/g9g;->m:Ljava/util/List;

    .line 3035
    .line 3036
    goto/16 :goto_2d

    .line 3037
    .line 3038
    :cond_4f
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 3039
    .line 3040
    .line 3041
    move-result-object v2

    .line 3042
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 3043
    .line 3044
    .line 3045
    move-result-object v4

    .line 3046
    invoke-static {v2, v4}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 3047
    .line 3048
    .line 3049
    move-result-object v2

    .line 3050
    iget v4, v0, La/c5g;->a:I

    .line 3051
    .line 3052
    iget v5, v0, La/c5g;->b:I

    .line 3053
    .line 3054
    iget v6, v0, La/c5g;->c:I

    .line 3055
    .line 3056
    invoke-virtual {v2, v4, v5, v6}, Ljava/util/Calendar;->set(III)V

    .line 3057
    .line 3058
    .line 3059
    invoke-virtual {v2, v7, v15}, Ljava/util/Calendar;->add(II)V

    .line 3060
    .line 3061
    .line 3062
    invoke-virtual {v2, v14, v13}, Ljava/util/Calendar;->set(II)V

    .line 3063
    .line 3064
    .line 3065
    invoke-virtual {v2, v12, v11}, Ljava/util/Calendar;->set(II)V

    .line 3066
    .line 3067
    .line 3068
    invoke-virtual {v2, v9, v11}, Ljava/util/Calendar;->set(II)V

    .line 3069
    .line 3070
    .line 3071
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 3072
    .line 3073
    .line 3074
    move-result-object v4

    .line 3075
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 3076
    .line 3077
    .line 3078
    move-result-object v7

    .line 3079
    invoke-static {v4, v7}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 3080
    .line 3081
    .line 3082
    move-result-object v4

    .line 3083
    iget-object v7, v1, La/o4g;->b:Ljava/util/List;

    .line 3084
    .line 3085
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 3086
    .line 3087
    .line 3088
    move-result-object v7

    .line 3089
    check-cast v7, La/d5g;

    .line 3090
    .line 3091
    iget v7, v7, La/d5g;->a:I

    .line 3092
    .line 3093
    iget-object v1, v1, La/o4g;->b:Ljava/util/List;

    .line 3094
    .line 3095
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 3096
    .line 3097
    .line 3098
    move-result-object v18

    .line 3099
    move-object/from16 v15, v18

    .line 3100
    .line 3101
    check-cast v15, La/d5g;

    .line 3102
    .line 3103
    iget-object v15, v15, La/d5g;->b:Ljava/util/List;

    .line 3104
    .line 3105
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->l0(Ljava/util/List;)Ljava/lang/Comparable;

    .line 3106
    .line 3107
    .line 3108
    move-result-object v15

    .line 3109
    check-cast v15, Ljava/lang/Number;

    .line 3110
    .line 3111
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 3112
    .line 3113
    .line 3114
    move-result v15

    .line 3115
    const/16 v21, 0x1

    .line 3116
    .line 3117
    add-int/lit8 v15, v15, -0x1

    .line 3118
    .line 3119
    invoke-virtual {v4, v8}, Ljava/util/Calendar;->getActualMinimum(I)I

    .line 3120
    .line 3121
    .line 3122
    move-result v11

    .line 3123
    invoke-virtual {v4, v7, v15, v11}, Ljava/util/Calendar;->set(III)V

    .line 3124
    .line 3125
    .line 3126
    invoke-virtual {v2, v8}, Ljava/util/Calendar;->getActualMinimum(I)I

    .line 3127
    .line 3128
    .line 3129
    move-result v7

    .line 3130
    invoke-virtual {v4, v8, v7}, Ljava/util/Calendar;->set(II)V

    .line 3131
    .line 3132
    .line 3133
    const/4 v7, 0x0

    .line 3134
    invoke-virtual {v4, v14, v7}, Ljava/util/Calendar;->set(II)V

    .line 3135
    .line 3136
    .line 3137
    invoke-virtual {v4, v12, v7}, Ljava/util/Calendar;->set(II)V

    .line 3138
    .line 3139
    .line 3140
    invoke-virtual {v4, v9, v7}, Ljava/util/Calendar;->set(II)V

    .line 3141
    .line 3142
    .line 3143
    move-object v11, v10

    .line 3144
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 3145
    .line 3146
    .line 3147
    move-result-wide v9

    .line 3148
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 3149
    .line 3150
    .line 3151
    move-result-wide v12

    .line 3152
    invoke-static {v9, v10, v7, v12, v13}, La/fre0;->N(JZJ)Ljava/util/ArrayList;

    .line 3153
    .line 3154
    .line 3155
    move-result-object v2

    .line 3156
    move v7, v6

    .line 3157
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->t0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 3158
    .line 3159
    .line 3160
    move-result-object v2

    .line 3161
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 3162
    .line 3163
    .line 3164
    move-result-object v9

    .line 3165
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 3166
    .line 3167
    .line 3168
    move-result-object v10

    .line 3169
    invoke-static {v9, v10}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 3170
    .line 3171
    .line 3172
    move-result-object v9

    .line 3173
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 3174
    .line 3175
    .line 3176
    move-result-object v10

    .line 3177
    check-cast v10, La/d5g;

    .line 3178
    .line 3179
    iget v10, v10, La/d5g;->a:I

    .line 3180
    .line 3181
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 3182
    .line 3183
    .line 3184
    move-result-object v1

    .line 3185
    check-cast v1, La/d5g;

    .line 3186
    .line 3187
    iget-object v1, v1, La/d5g;->b:Ljava/util/List;

    .line 3188
    .line 3189
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->i0(Ljava/util/List;)Ljava/lang/Comparable;

    .line 3190
    .line 3191
    .line 3192
    move-result-object v1

    .line 3193
    check-cast v1, Ljava/lang/Number;

    .line 3194
    .line 3195
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 3196
    .line 3197
    .line 3198
    move-result v1

    .line 3199
    const/16 v21, 0x1

    .line 3200
    .line 3201
    add-int/lit8 v1, v1, -0x1

    .line 3202
    .line 3203
    invoke-virtual {v9, v8}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 3204
    .line 3205
    .line 3206
    move-result v12

    .line 3207
    invoke-virtual {v9, v10, v1, v12}, Ljava/util/Calendar;->set(III)V

    .line 3208
    .line 3209
    .line 3210
    invoke-virtual {v9, v8}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 3211
    .line 3212
    .line 3213
    move-result v1

    .line 3214
    invoke-virtual {v9, v8, v1}, Ljava/util/Calendar;->set(II)V

    .line 3215
    .line 3216
    .line 3217
    const/16 v1, 0x17

    .line 3218
    .line 3219
    invoke-virtual {v9, v14, v1}, Ljava/util/Calendar;->set(II)V

    .line 3220
    .line 3221
    .line 3222
    const/16 v1, 0x3b

    .line 3223
    .line 3224
    const/16 v4, 0xc

    .line 3225
    .line 3226
    invoke-virtual {v9, v4, v1}, Ljava/util/Calendar;->set(II)V

    .line 3227
    .line 3228
    .line 3229
    const/16 v15, 0xd

    .line 3230
    .line 3231
    invoke-virtual {v9, v15, v1}, Ljava/util/Calendar;->set(II)V

    .line 3232
    .line 3233
    .line 3234
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 3235
    .line 3236
    .line 3237
    move-result-object v1

    .line 3238
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 3239
    .line 3240
    .line 3241
    move-result-object v8

    .line 3242
    invoke-static {v1, v8}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 3243
    .line 3244
    .line 3245
    move-result-object v1

    .line 3246
    iget v8, v0, La/c5g;->a:I

    .line 3247
    .line 3248
    invoke-virtual {v1, v8, v5, v7}, Ljava/util/Calendar;->set(III)V

    .line 3249
    .line 3250
    .line 3251
    const/4 v6, 0x0

    .line 3252
    invoke-virtual {v1, v14, v6}, Ljava/util/Calendar;->set(II)V

    .line 3253
    .line 3254
    .line 3255
    invoke-virtual {v1, v4, v6}, Ljava/util/Calendar;->set(II)V

    .line 3256
    .line 3257
    .line 3258
    invoke-virtual {v1, v15, v6}, Ljava/util/Calendar;->set(II)V

    .line 3259
    .line 3260
    .line 3261
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 3262
    .line 3263
    .line 3264
    move-result-wide v4

    .line 3265
    invoke-virtual {v9}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 3266
    .line 3267
    .line 3268
    move-result-wide v7

    .line 3269
    const/4 v1, 0x1

    .line 3270
    invoke-static {v4, v5, v1, v7, v8}, La/fre0;->N(JZJ)Ljava/util/ArrayList;

    .line 3271
    .line 3272
    .line 3273
    move-result-object v1

    .line 3274
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 3275
    .line 3276
    .line 3277
    move-result-object v1

    .line 3278
    :goto_2f
    sget-object v2, La/yag;->b:La/yag;

    .line 3279
    .line 3280
    if-ne v3, v2, :cond_50

    .line 3281
    .line 3282
    iget v2, v0, La/c5g;->c:I

    .line 3283
    .line 3284
    goto :goto_30

    .line 3285
    :cond_50
    sget-object v4, La/yag;->c:La/yag;

    .line 3286
    .line 3287
    if-ne v3, v4, :cond_51

    .line 3288
    .line 3289
    iget-object v5, v0, La/c5g;->e:La/yag;

    .line 3290
    .line 3291
    if-ne v5, v2, :cond_51

    .line 3292
    .line 3293
    iget v2, v0, La/c5g;->c:I

    .line 3294
    .line 3295
    goto :goto_30

    .line 3296
    :cond_51
    if-ne v3, v4, :cond_52

    .line 3297
    .line 3298
    iget-object v2, v0, La/c5g;->e:La/yag;

    .line 3299
    .line 3300
    sget-object v3, La/yag;->d:La/yag;

    .line 3301
    .line 3302
    if-ne v2, v3, :cond_52

    .line 3303
    .line 3304
    iget v2, v0, La/c5g;->d:I

    .line 3305
    .line 3306
    goto :goto_30

    .line 3307
    :cond_52
    iget v2, v0, La/c5g;->c:I

    .line 3308
    .line 3309
    :goto_30
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 3310
    .line 3311
    .line 3312
    move-result-object v3

    .line 3313
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 3314
    .line 3315
    .line 3316
    move-result-object v4

    .line 3317
    invoke-static {v3, v4}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 3318
    .line 3319
    .line 3320
    move-result-object v3

    .line 3321
    iget v4, v0, La/c5g;->a:I

    .line 3322
    .line 3323
    iget v5, v0, La/c5g;->b:I

    .line 3324
    .line 3325
    invoke-virtual {v3, v4, v5, v2}, Ljava/util/Calendar;->set(III)V

    .line 3326
    .line 3327
    .line 3328
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 3329
    .line 3330
    .line 3331
    move-result-object v2

    .line 3332
    move v8, v6

    .line 3333
    :goto_31
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 3334
    .line 3335
    .line 3336
    move-result v4

    .line 3337
    if-eqz v4, :cond_54

    .line 3338
    .line 3339
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3340
    .line 3341
    .line 3342
    move-result-object v4

    .line 3343
    check-cast v4, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 3344
    .line 3345
    iget-wide v5, v4, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 3346
    .line 3347
    iget-wide v9, v4, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->b:J

    .line 3348
    .line 3349
    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 3350
    .line 3351
    .line 3352
    move-result-wide v22

    .line 3353
    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 3354
    .line 3355
    .line 3356
    move-result-wide v24

    .line 3357
    move-wide/from16 v18, v5

    .line 3358
    .line 3359
    move-wide/from16 v20, v9

    .line 3360
    .line 3361
    invoke-static/range {v18 .. v25}, La/fre0;->Z(JJJJ)Z

    .line 3362
    .line 3363
    .line 3364
    move-result v4

    .line 3365
    if-eqz v4, :cond_53

    .line 3366
    .line 3367
    :goto_32
    const/4 v2, -0x1

    .line 3368
    goto :goto_33

    .line 3369
    :cond_53
    add-int/lit8 v8, v8, 0x1

    .line 3370
    .line 3371
    goto :goto_31

    .line 3372
    :cond_54
    const/4 v8, -0x1

    .line 3373
    goto :goto_32

    .line 3374
    :goto_33
    if-eq v8, v2, :cond_56

    .line 3375
    .line 3376
    iget-object v2, v11, La/g9g;->k:La/p7m0;

    .line 3377
    .line 3378
    new-instance v3, La/w8g;

    .line 3379
    .line 3380
    invoke-direct {v3, v8, v1}, La/w8g;-><init>(ILjava/util/List;)V

    .line 3381
    .line 3382
    .line 3383
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3384
    .line 3385
    .line 3386
    const/4 v1, 0x0

    .line 3387
    invoke-virtual {v2, v1, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3388
    .line 3389
    .line 3390
    goto :goto_34

    .line 3391
    :cond_55
    move-object v11, v10

    .line 3392
    :cond_56
    :goto_34
    iput-object v0, v11, La/g9g;->n:La/c5g;

    .line 3393
    .line 3394
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3395
    .line 3396
    return-object v0

    .line 3397
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
.end method
