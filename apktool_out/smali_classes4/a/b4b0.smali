.class public final synthetic La/b4b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/d4b0;


# direct methods
.method public synthetic constructor <init>(La/d4b0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/b4b0;->a:B

    iput-object p1, p0, La/b4b0;->b:La/d4b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/b4b0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v0, v0, La/b4b0;->b:La/d4b0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/d4b0;->S1:La/jh70;

    .line 12
    .line 13
    new-instance v1, La/a4b0;

    .line 14
    .line 15
    iget-object v0, v0, La/d4b0;->N1:La/kiu0;

    .line 16
    .line 17
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, La/r4b0;

    .line 22
    .line 23
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v3, La/pua;

    .line 27
    .line 28
    const/16 v4, 0x12

    .line 29
    .line 30
    invoke-direct {v3, v4}, La/pua;-><init>(B)V

    .line 31
    .line 32
    .line 33
    new-instance v4, La/gcb;

    .line 34
    .line 35
    invoke-direct {v4, v0, v2}, La/gcb;-><init>(La/r4b0;B)V

    .line 36
    .line 37
    .line 38
    new-instance v2, La/lq4;

    .line 39
    .line 40
    const/16 v5, 0x19

    .line 41
    .line 42
    const/4 v6, 0x3

    .line 43
    invoke-direct {v2, v6, v5}, La/lq4;-><init>(IB)V

    .line 44
    .line 45
    .line 46
    sget-object v5, La/qja;->e:La/qja;

    .line 47
    .line 48
    new-instance v7, La/gbn;

    .line 49
    .line 50
    invoke-direct {v7, v3, v2, v4, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 51
    .line 52
    .line 53
    iget-object v2, v1, La/zz3;->d:La/dp;

    .line 54
    .line 55
    invoke-virtual {v2, v7}, La/dp;->b(La/gbn;)V

    .line 56
    .line 57
    .line 58
    new-instance v3, La/pua;

    .line 59
    .line 60
    const/16 v4, 0x10

    .line 61
    .line 62
    invoke-direct {v3, v4}, La/pua;-><init>(B)V

    .line 63
    .line 64
    .line 65
    new-instance v4, La/gcb;

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    invoke-direct {v4, v0, v5}, La/gcb;-><init>(La/r4b0;B)V

    .line 69
    .line 70
    .line 71
    new-instance v0, La/lq4;

    .line 72
    .line 73
    const/16 v5, 0x18

    .line 74
    .line 75
    invoke-direct {v0, v6, v5}, La/lq4;-><init>(IB)V

    .line 76
    .line 77
    .line 78
    sget-object v5, La/qja;->d:La/qja;

    .line 79
    .line 80
    new-instance v6, La/gbn;

    .line 81
    .line 82
    invoke-direct {v6, v3, v0, v4, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6}, La/dp;->b(La/gbn;)V

    .line 86
    .line 87
    .line 88
    return-object v1

    .line 89
    :pswitch_0
    sget-object v1, La/d4b0;->S1:La/jh70;

    .line 90
    .line 91
    new-instance v1, La/q0h0;

    .line 92
    .line 93
    iget-object v0, v0, La/d4b0;->L1:La/a8z;

    .line 94
    .line 95
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/toi;

    .line 100
    .line 101
    iget-object v0, v0, La/toi;->q:La/n5d0;

    .line 102
    .line 103
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, La/soi;

    .line 108
    .line 109
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 110
    .line 111
    .line 112
    return-object v1

    .line 113
    :pswitch_1
    sget-object v1, La/d4b0;->S1:La/jh70;

    .line 114
    .line 115
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    instance-of v3, v1, La/af3;

    .line 127
    .line 128
    const/4 v4, 0x0

    .line 129
    if-eqz v3, :cond_0

    .line 130
    .line 131
    check-cast v1, La/af3;

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_0
    move-object v1, v4

    .line 135
    :goto_0
    const-class v3, La/e4b0;

    .line 136
    .line 137
    if-eqz v1, :cond_3

    .line 138
    .line 139
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, La/o5d0;

    .line 148
    .line 149
    if-eqz v1, :cond_1

    .line 150
    .line 151
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, La/ze3;

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_1
    move-object v1, v4

    .line 159
    :goto_1
    instance-of v5, v1, La/e4b0;

    .line 160
    .line 161
    if-nez v5, :cond_2

    .line 162
    .line 163
    move-object v1, v4

    .line 164
    :cond_2
    check-cast v1, La/e4b0;

    .line 165
    .line 166
    if-eqz v1, :cond_3

    .line 167
    .line 168
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 169
    .line 170
    .line 171
    move-result-object v14

    .line 172
    iget-object v3, v0, La/d4b0;->Q1:La/yzn0;

    .line 173
    .line 174
    sget-object v4, La/d4b0;->U1:[La/iiy;

    .line 175
    .line 176
    aget-object v2, v4, v2

    .line 177
    .line 178
    invoke-virtual {v3, v0, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    move-object v15, v0

    .line 183
    check-cast v15, La/f4b0;

    .line 184
    .line 185
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v13, v1, La/e4b0;->n:La/y3v;

    .line 189
    .line 190
    iget-object v7, v1, La/e4b0;->d:La/jw20;

    .line 191
    .line 192
    iget-object v6, v1, La/e4b0;->f:La/ugf0;

    .line 193
    .line 194
    iget-object v8, v1, La/e4b0;->b:La/bwl;

    .line 195
    .line 196
    iget-object v9, v1, La/e4b0;->c:La/a1d;

    .line 197
    .line 198
    iget-object v11, v1, La/e4b0;->e:La/mne;

    .line 199
    .line 200
    iget-object v0, v1, La/e4b0;->h:La/ctf0;

    .line 201
    .line 202
    iget-object v2, v1, La/e4b0;->k:La/lbu;

    .line 203
    .line 204
    iget-object v3, v1, La/e4b0;->g:La/qv2;

    .line 205
    .line 206
    iget-object v10, v1, La/e4b0;->l:La/iip;

    .line 207
    .line 208
    iget-object v4, v1, La/e4b0;->i:La/g2v;

    .line 209
    .line 210
    iget-object v5, v1, La/e4b0;->j:La/m1e;

    .line 211
    .line 212
    iget-object v12, v1, La/e4b0;->a:La/nr00;

    .line 213
    .line 214
    move-object/from16 v16, v0

    .line 215
    .line 216
    iget-object v0, v1, La/e4b0;->m:La/wdk0;

    .line 217
    .line 218
    iget-object v1, v1, La/e4b0;->o:La/h3c;

    .line 219
    .line 220
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    move-object/from16 v16, v5

    .line 233
    .line 234
    new-instance v5, La/toi;

    .line 235
    .line 236
    move-object/from16 v20, v0

    .line 237
    .line 238
    move-object/from16 v21, v1

    .line 239
    .line 240
    move-object/from16 v19, v2

    .line 241
    .line 242
    move-object/from16 v17, v3

    .line 243
    .line 244
    move-object/from16 v18, v4

    .line 245
    .line 246
    invoke-direct/range {v5 .. v21}, La/toi;-><init>(La/ugf0;La/jw20;La/bwl;La/a1d;La/iip;La/mne;La/nr00;La/y3v;La/i1w0;La/f4b0;La/m1e;La/qv2;La/g2v;La/lbu;La/wdk0;La/h3c;)V

    .line 247
    .line 248
    .line 249
    move-object v4, v5

    .line 250
    goto :goto_2

    .line 251
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 252
    .line 253
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    :goto_2
    return-object v4

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
