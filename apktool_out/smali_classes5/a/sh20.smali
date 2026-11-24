.class public final synthetic La/sh20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:D

.field public final synthetic c:D

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;DDB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/sh20;->a:B

    iput-object p1, p0, La/sh20;->d:Ljava/lang/Object;

    iput-wide p2, p0, La/sh20;->b:D

    iput-wide p4, p0, La/sh20;->c:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sh20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/sh20;->d:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v4, v3

    .line 12
    check-cast v4, La/rvj0;

    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/oyg0;

    .line 17
    .line 18
    move-object/from16 v3, p2

    .line 19
    .line 20
    check-cast v3, La/b820;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v1, v4, La/rvj0;->a:La/dx6;

    .line 29
    .line 30
    iget-object v5, v1, La/dx6;->b:La/vw6;

    .line 31
    .line 32
    const/16 v23, 0x0

    .line 33
    .line 34
    const v24, 0xfffe

    .line 35
    .line 36
    .line 37
    iget-wide v6, v0, La/sh20;->b:D

    .line 38
    .line 39
    const-wide/16 v8, 0x0

    .line 40
    .line 41
    const-wide/16 v10, 0x0

    .line 42
    .line 43
    const-wide/16 v12, 0x0

    .line 44
    .line 45
    const-wide/16 v14, 0x0

    .line 46
    .line 47
    const/16 v16, 0x0

    .line 48
    .line 49
    const/16 v17, 0x0

    .line 50
    .line 51
    const/16 v18, 0x0

    .line 52
    .line 53
    const/16 v19, 0x0

    .line 54
    .line 55
    const/16 v20, 0x0

    .line 56
    .line 57
    const/16 v21, 0x0

    .line 58
    .line 59
    const/16 v22, 0x0

    .line 60
    .line 61
    invoke-static/range {v5 .. v24}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    const/4 v6, 0x1

    .line 66
    invoke-static {v1, v2, v5, v6}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    const/4 v9, 0x0

    .line 71
    const/16 v10, 0x1e

    .line 72
    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v8, 0x0

    .line 76
    invoke-static/range {v4 .. v10}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    iget-object v1, v3, La/b820;->g:La/wtb0;

    .line 81
    .line 82
    iget-wide v11, v0, La/sh20;->c:D

    .line 83
    .line 84
    if-eqz v1, :cond_0

    .line 85
    .line 86
    const/16 v0, 0x3c

    .line 87
    .line 88
    invoke-static {v1, v11, v12, v0}, La/wtb0;->a(La/wtb0;DI)La/wtb0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    move-object v12, v0

    .line 93
    goto :goto_0

    .line 94
    :cond_0
    new-instance v10, La/wtb0;

    .line 95
    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    const/16 v17, 0x0

    .line 99
    .line 100
    const/4 v13, 0x1

    .line 101
    const/4 v14, 0x0

    .line 102
    const/4 v15, 0x0

    .line 103
    invoke-direct/range {v10 .. v17}, La/wtb0;-><init>(DZZZLjava/lang/String;La/ex4;)V

    .line 104
    .line 105
    .line 106
    move-object v12, v10

    .line 107
    :goto_0
    const/16 v17, 0x0

    .line 108
    .line 109
    const/16 v18, 0x1fb7

    .line 110
    .line 111
    const/4 v6, 0x0

    .line 112
    const/4 v7, 0x0

    .line 113
    const/4 v8, 0x0

    .line 114
    const/4 v10, 0x0

    .line 115
    const/4 v11, 0x0

    .line 116
    const/4 v13, 0x0

    .line 117
    const/4 v14, 0x0

    .line 118
    const/4 v15, 0x0

    .line 119
    const/16 v16, 0x0

    .line 120
    .line 121
    move-object v5, v3

    .line 122
    invoke-static/range {v5 .. v18}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    return-object v0

    .line 127
    :pswitch_0
    move-object v1, v3

    .line 128
    check-cast v1, La/pvj0;

    .line 129
    .line 130
    move-object/from16 v3, p1

    .line 131
    .line 132
    check-cast v3, La/oyg0;

    .line 133
    .line 134
    move-object/from16 v9, p2

    .line 135
    .line 136
    check-cast v9, La/a820;

    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v3, v1, La/pvj0;->a:La/bx6;

    .line 145
    .line 146
    iget-object v10, v3, La/bx6;->b:La/tw6;

    .line 147
    .line 148
    const/16 v30, 0x0

    .line 149
    .line 150
    const v31, 0xfffe

    .line 151
    .line 152
    .line 153
    iget-wide v11, v0, La/sh20;->b:D

    .line 154
    .line 155
    const-wide/16 v13, 0x0

    .line 156
    .line 157
    const-wide/16 v15, 0x0

    .line 158
    .line 159
    const-wide/16 v17, 0x0

    .line 160
    .line 161
    const-wide/16 v19, 0x0

    .line 162
    .line 163
    const/16 v21, 0x0

    .line 164
    .line 165
    const/16 v22, 0x0

    .line 166
    .line 167
    const/16 v23, 0x0

    .line 168
    .line 169
    const/16 v24, 0x0

    .line 170
    .line 171
    const/16 v25, 0x0

    .line 172
    .line 173
    const/16 v26, 0x0

    .line 174
    .line 175
    const/16 v27, 0x0

    .line 176
    .line 177
    const/16 v28, 0x0

    .line 178
    .line 179
    const/16 v29, 0x0

    .line 180
    .line 181
    invoke-static/range {v10 .. v31}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    const/4 v5, 0x0

    .line 186
    const/4 v6, 0x5

    .line 187
    invoke-static {v3, v2, v4, v5, v6}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    const/4 v7, 0x0

    .line 192
    const/16 v8, 0x3e

    .line 193
    .line 194
    const/4 v3, 0x0

    .line 195
    const/4 v4, 0x0

    .line 196
    const/4 v5, 0x0

    .line 197
    const/4 v6, 0x0

    .line 198
    invoke-static/range {v1 .. v8}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    iget-object v1, v9, La/a820;->h:La/vtb0;

    .line 203
    .line 204
    iget-wide v11, v0, La/sh20;->c:D

    .line 205
    .line 206
    if-eqz v1, :cond_1

    .line 207
    .line 208
    sget-object v0, La/g920;->b:La/g920;

    .line 209
    .line 210
    const/16 v0, 0xbc

    .line 211
    .line 212
    invoke-static {v1, v11, v12, v0}, La/vtb0;->a(La/vtb0;DI)La/vtb0;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    move-object v11, v0

    .line 217
    goto :goto_1

    .line 218
    :cond_1
    sget-object v18, La/g920;->b:La/g920;

    .line 219
    .line 220
    new-instance v10, La/vtb0;

    .line 221
    .line 222
    const/16 v17, 0x0

    .line 223
    .line 224
    const/16 v19, 0x0

    .line 225
    .line 226
    const/4 v13, 0x1

    .line 227
    const/4 v14, 0x0

    .line 228
    const/4 v15, 0x0

    .line 229
    const/16 v16, 0x0

    .line 230
    .line 231
    invoke-direct/range {v10 .. v19}, La/vtb0;-><init>(DZZZLjava/lang/String;La/ex4;La/g920;Z)V

    .line 232
    .line 233
    .line 234
    move-object v11, v10

    .line 235
    :goto_1
    const/16 v20, 0x0

    .line 236
    .line 237
    const v21, 0x3ff6f

    .line 238
    .line 239
    .line 240
    const/4 v5, 0x0

    .line 241
    const/4 v6, 0x0

    .line 242
    const/4 v7, 0x0

    .line 243
    move-object v4, v9

    .line 244
    const/4 v9, 0x0

    .line 245
    const/4 v10, 0x0

    .line 246
    const/4 v12, 0x0

    .line 247
    const/4 v13, 0x0

    .line 248
    const/4 v14, 0x0

    .line 249
    const/4 v15, 0x0

    .line 250
    const/16 v16, 0x0

    .line 251
    .line 252
    const/16 v17, 0x0

    .line 253
    .line 254
    const/16 v18, 0x0

    .line 255
    .line 256
    const/16 v19, 0x0

    .line 257
    .line 258
    invoke-static/range {v4 .. v21}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    return-object v0

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
