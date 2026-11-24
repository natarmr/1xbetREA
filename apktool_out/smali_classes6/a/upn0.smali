.class public final synthetic La/upn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ypn0;


# direct methods
.method public synthetic constructor <init>(La/ypn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/upn0;->a:B

    iput-object p1, p0, La/upn0;->b:La/ypn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/upn0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/upn0;->b:La/ypn0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v1, La/q0h0;

    .line 11
    .line 12
    iget-object v0, v0, La/ypn0;->b2:La/a8z;

    .line 13
    .line 14
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/rvi;

    .line 19
    .line 20
    iget-object v0, v0, La/rvi;->w:La/n5d0;

    .line 21
    .line 22
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, La/qvi;

    .line 27
    .line 28
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :pswitch_0
    sget-object v1, La/ypn0;->h2:La/s9m0;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    instance-of v2, v1, La/af3;

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    check-cast v1, La/af3;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move-object v1, v3

    .line 54
    :goto_0
    const-class v2, La/opn0;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, La/o5d0;

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, La/ze3;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    move-object v1, v3

    .line 78
    :goto_1
    instance-of v4, v1, La/opn0;

    .line 79
    .line 80
    if-nez v4, :cond_2

    .line 81
    .line 82
    move-object v1, v3

    .line 83
    :cond_2
    check-cast v1, La/opn0;

    .line 84
    .line 85
    if-eqz v1, :cond_3

    .line 86
    .line 87
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    sget-object v2, La/ypn0;->j2:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v0, v0, La/ypn0;->a2:La/a8z;

    .line 94
    .line 95
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    move-object v7, v0

    .line 100
    check-cast v7, Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v9, v1, La/opn0;->a:La/mne;

    .line 112
    .line 113
    iget-object v10, v1, La/opn0;->b:La/wyu;

    .line 114
    .line 115
    iget-object v11, v1, La/opn0;->c:La/zx10;

    .line 116
    .line 117
    iget-object v12, v1, La/opn0;->d:La/knf0;

    .line 118
    .line 119
    iget-object v13, v1, La/opn0;->e:La/yvn0;

    .line 120
    .line 121
    iget-object v14, v1, La/opn0;->f:La/gii0;

    .line 122
    .line 123
    iget-object v15, v1, La/opn0;->g:La/j1q0;

    .line 124
    .line 125
    iget-object v0, v1, La/opn0;->h:La/s31;

    .line 126
    .line 127
    iget-object v2, v1, La/opn0;->i:La/e41;

    .line 128
    .line 129
    iget-object v3, v1, La/opn0;->j:La/ctf0;

    .line 130
    .line 131
    iget-object v4, v1, La/opn0;->k:La/yox;

    .line 132
    .line 133
    iget-object v5, v1, La/opn0;->l:La/vby;

    .line 134
    .line 135
    iget-object v6, v1, La/opn0;->m:La/us00;

    .line 136
    .line 137
    move-object/from16 v16, v0

    .line 138
    .line 139
    iget-object v0, v1, La/opn0;->n:La/z7u;

    .line 140
    .line 141
    move-object/from16 v22, v0

    .line 142
    .line 143
    iget-object v0, v1, La/opn0;->o:La/zri;

    .line 144
    .line 145
    move-object/from16 v23, v0

    .line 146
    .line 147
    iget-object v0, v1, La/opn0;->p:La/iip;

    .line 148
    .line 149
    move-object/from16 v20, v5

    .line 150
    .line 151
    iget-object v5, v1, La/opn0;->q:La/wsf0;

    .line 152
    .line 153
    move-object/from16 v21, v6

    .line 154
    .line 155
    iget-object v6, v1, La/opn0;->r:La/roi0;

    .line 156
    .line 157
    move-object/from16 v17, v0

    .line 158
    .line 159
    iget-object v0, v1, La/opn0;->s:La/duj;

    .line 160
    .line 161
    move-object/from16 v24, v0

    .line 162
    .line 163
    iget-object v0, v1, La/opn0;->t:La/pru;

    .line 164
    .line 165
    iget-object v1, v1, La/opn0;->u:La/r9u;

    .line 166
    .line 167
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-object/from16 v19, v4

    .line 195
    .line 196
    new-instance v4, La/rvi;

    .line 197
    .line 198
    move-object/from16 v25, v0

    .line 199
    .line 200
    move-object/from16 v26, v1

    .line 201
    .line 202
    move-object/from16 v17, v2

    .line 203
    .line 204
    move-object/from16 v18, v3

    .line 205
    .line 206
    invoke-direct/range {v4 .. v26}, La/rvi;-><init>(La/wsf0;La/roi0;Ljava/lang/Boolean;La/i1w0;La/mne;La/wyu;La/zx10;La/knf0;La/yvn0;La/gii0;La/j1q0;La/s31;La/e41;La/ctf0;La/yox;La/vby;La/us00;La/z7u;La/zri;La/duj;La/pru;La/r9u;)V

    .line 207
    .line 208
    .line 209
    move-object v3, v4

    .line 210
    goto :goto_2

    .line 211
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 212
    .line 213
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :goto_2
    return-object v3

    .line 221
    :pswitch_1
    sget-object v1, La/ypn0;->h2:La/s9m0;

    .line 222
    .line 223
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 236
    .line 237
    invoke-static {v0}, La/sj3;->d0(I)I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    const/16 v1, 0x2c6

    .line 242
    .line 243
    if-ge v0, v1, :cond_4

    .line 244
    .line 245
    const/4 v0, 0x1

    .line 246
    goto :goto_3

    .line 247
    :cond_4
    const/4 v0, 0x0

    .line 248
    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    return-object v0

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
