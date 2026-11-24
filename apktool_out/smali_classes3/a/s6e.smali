.class public final synthetic La/s6e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/e7e;


# direct methods
.method public synthetic constructor <init>(La/e7e;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/s6e;->a:B

    iput-object p1, p0, La/s6e;->b:La/e7e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/s6e;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/s6e;->b:La/e7e;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/e7e;->d2:La/kwd;

    .line 11
    .line 12
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const v1, 0x7f07072d

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :pswitch_0
    sget-object v0, La/e7e;->d2:La/kwd;

    .line 29
    .line 30
    new-instance v0, La/n14;

    .line 31
    .line 32
    new-instance v3, La/z6e;

    .line 33
    .line 34
    invoke-virtual {v2}, La/e7e;->J0()La/fae;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const/4 v9, 0x0

    .line 39
    const/4 v10, 0x5

    .line 40
    const/4 v4, 0x1

    .line 41
    const-class v6, La/fae;

    .line 42
    .line 43
    const-string v7, "onCancelAttachImage"

    .line 44
    .line 45
    const-string v8, "onCancelAttachImage(Ljava/lang/String;)V"

    .line 46
    .line 47
    invoke-direct/range {v3 .. v10}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance v1, La/o33;

    .line 54
    .line 55
    const/16 v2, 0x9

    .line 56
    .line 57
    invoke-direct {v1, v2}, La/o33;-><init>(B)V

    .line 58
    .line 59
    .line 60
    new-instance v2, La/b33;

    .line 61
    .line 62
    const/16 v4, 0xc

    .line 63
    .line 64
    invoke-direct {v2, v3, v4}, La/b33;-><init>(Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    new-instance v3, La/l9;

    .line 68
    .line 69
    const/4 v4, 0x3

    .line 70
    const/16 v5, 0x17

    .line 71
    .line 72
    invoke-direct {v3, v4, v5}, La/l9;-><init>(IB)V

    .line 73
    .line 74
    .line 75
    sget-object v4, La/zx3;->c:La/zx3;

    .line 76
    .line 77
    new-instance v5, La/gbn;

    .line 78
    .line 79
    invoke-direct {v5, v1, v3, v2, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 80
    .line 81
    .line 82
    iget-object v1, v0, La/zz3;->d:La/dp;

    .line 83
    .line 84
    invoke-virtual {v1, v5}, La/dp;->b(La/gbn;)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_1
    sget-object v1, La/e7e;->d2:La/kwd;

    .line 89
    .line 90
    new-instance v2, La/kx2;

    .line 91
    .line 92
    iget-object v0, v0, La/s6e;->b:La/e7e;

    .line 93
    .line 94
    invoke-virtual {v0}, La/e7e;->J0()La/fae;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    const/4 v8, 0x0

    .line 99
    const/4 v9, 0x3

    .line 100
    const/4 v3, 0x3

    .line 101
    const-class v13, La/fae;

    .line 102
    .line 103
    const-string v6, "onVisibleMessage"

    .line 104
    .line 105
    const-string v7, "onVisibleMessage(IIZ)V"

    .line 106
    .line 107
    move-object v5, v13

    .line 108
    invoke-direct/range {v2 .. v9}, La/kx2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 109
    .line 110
    .line 111
    new-instance v3, La/enc;

    .line 112
    .line 113
    const/4 v9, 0x0

    .line 114
    const/16 v10, 0x1d

    .line 115
    .line 116
    const/4 v4, 0x1

    .line 117
    const-class v6, La/e7e;

    .line 118
    .line 119
    const-string v7, "onFileClickListener"

    .line 120
    .line 121
    const-string v8, "onFileClickListener(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/FileInfoUiModel;)V"

    .line 122
    .line 123
    move-object v5, v0

    .line 124
    invoke-direct/range {v3 .. v10}, La/enc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 125
    .line 126
    .line 127
    move-object v0, v3

    .line 128
    new-instance v3, La/z6e;

    .line 129
    .line 130
    const/4 v10, 0x0

    .line 131
    const-string v7, "onImageClicked"

    .line 132
    .line 133
    const-string v8, "onImageClicked(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/ImageInfoUiModel;)V"

    .line 134
    .line 135
    invoke-direct/range {v3 .. v10}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 136
    .line 137
    .line 138
    move-object v1, v3

    .line 139
    new-instance v7, La/z6e;

    .line 140
    .line 141
    invoke-virtual {v5}, La/e7e;->J0()La/fae;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    const/16 v16, 0x0

    .line 146
    .line 147
    const/16 v17, 0x1

    .line 148
    .line 149
    const/4 v11, 0x1

    .line 150
    const-string v14, "onRowClick"

    .line 151
    .line 152
    const-string v15, "onRowClick(Lorg/xplatform/consultantchat/domain/models/RowModel;)V"

    .line 153
    .line 154
    move-object v10, v7

    .line 155
    invoke-direct/range {v10 .. v17}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 156
    .line 157
    .line 158
    move-object/from16 v18, v10

    .line 159
    .line 160
    new-instance v8, La/z6e;

    .line 161
    .line 162
    invoke-virtual {v5}, La/e7e;->J0()La/fae;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    const/16 v17, 0x2

    .line 167
    .line 168
    const-string v14, "onButtonClick"

    .line 169
    .line 170
    const-string v15, "onButtonClick(Lorg/xplatform/consultantchat/domain/models/ButtonModel;)V"

    .line 171
    .line 172
    move-object v10, v8

    .line 173
    invoke-direct/range {v10 .. v17}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 174
    .line 175
    .line 176
    move-object/from16 v19, v10

    .line 177
    .line 178
    new-instance v3, La/z6e;

    .line 179
    .line 180
    const/4 v10, 0x3

    .line 181
    const-string v7, "onDownloadImage"

    .line 182
    .line 183
    const-string v8, "onDownloadImage(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/ImageInfoUiModel;)V"

    .line 184
    .line 185
    invoke-direct/range {v3 .. v10}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 186
    .line 187
    .line 188
    new-instance v10, La/z6e;

    .line 189
    .line 190
    invoke-virtual {v5}, La/e7e;->J0()La/fae;

    .line 191
    .line 192
    .line 193
    move-result-object v12

    .line 194
    const/16 v17, 0x4

    .line 195
    .line 196
    const-string v14, "onErrorClicked"

    .line 197
    .line 198
    const-string v15, "onErrorClicked(Lorg/xplatform/consultantchat/presentation/consultantchat/model/ErrorMessageClickEvent;)V"

    .line 199
    .line 200
    invoke-direct/range {v10 .. v17}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 201
    .line 202
    .line 203
    move-object v4, v10

    .line 204
    new-instance v10, La/mhc;

    .line 205
    .line 206
    invoke-virtual {v5}, La/e7e;->J0()La/fae;

    .line 207
    .line 208
    .line 209
    move-result-object v12

    .line 210
    const/16 v17, 0x9

    .line 211
    .line 212
    const/4 v11, 0x2

    .line 213
    const-string v14, "onReplyMessageClick"

    .line 214
    .line 215
    const-string v15, "onReplyMessageClick(II)V"

    .line 216
    .line 217
    invoke-direct/range {v10 .. v17}, La/mhc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 218
    .line 219
    .line 220
    move-object v9, v3

    .line 221
    move-object v5, v10

    .line 222
    move-object v3, v2

    .line 223
    new-instance v2, La/d6e;

    .line 224
    .line 225
    move-object v6, v1

    .line 226
    move-object v10, v4

    .line 227
    move-object/from16 v7, v18

    .line 228
    .line 229
    move-object/from16 v8, v19

    .line 230
    .line 231
    move-object v4, v0

    .line 232
    invoke-direct/range {v2 .. v10}, La/d6e;-><init>(La/kx2;La/enc;La/mhc;La/z6e;La/z6e;La/z6e;La/z6e;La/z6e;)V

    .line 233
    .line 234
    .line 235
    return-object v2

    .line 236
    :pswitch_2
    new-instance v0, La/t0h0;

    .line 237
    .line 238
    iget-object v1, v2, La/e7e;->P1:La/ddi;

    .line 239
    .line 240
    if-eqz v1, :cond_0

    .line 241
    .line 242
    invoke-static {v2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-direct {v0, v1, v2}, La/t0h0;-><init>(La/j0h0;La/i1w0;)V

    .line 247
    .line 248
    .line 249
    return-object v0

    .line 250
    :cond_0
    const-string v0, "consultantChatViewModelFactory"

    .line 251
    .line 252
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    const/4 v0, 0x0

    .line 256
    throw v0

    .line 257
    :pswitch_3
    sget-object v0, La/e7e;->d2:La/kwd;

    .line 258
    .line 259
    const/4 v0, 0x2

    .line 260
    invoke-static {v0}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-static {v1, v0}, Landroid/media/RingtoneManager;->getRingtone(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/Ringtone;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    return-object v0

    .line 273
    :pswitch_4
    sget-object v0, La/e7e;->d2:La/kwd;

    .line 274
    .line 275
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    const v1, 0x7f07070c

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    return-object v0

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
