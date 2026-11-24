.class public final synthetic La/v9q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/v9q;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte p0, p0, La/v9q;->a:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance p0, La/zw3;

    .line 10
    .line 11
    sget-object v0, La/a9r;->a:La/a9r;

    .line 12
    .line 13
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    new-instance p0, La/inv;

    .line 18
    .line 19
    sget-object v1, La/okx;->a:La/okx;

    .line 20
    .line 21
    new-instance v3, La/zw3;

    .line 22
    .line 23
    sget-object v4, La/tbl;->a:La/tbl;

    .line 24
    .line 25
    invoke-direct {v3, v4, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v1, v3, v0}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    :try_start_0
    sget-object p0, La/w7r;->d:La/a8z;

    .line 33
    .line 34
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/lang/reflect/Method;

    .line 39
    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    const-string v0, "beginTransaction"

    .line 49
    .line 50
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    const-class v3, Landroid/database/sqlite/SQLiteTransactionListener;

    .line 53
    .line 54
    const-class v4, Landroid/os/CancellationSignal;

    .line 55
    .line 56
    filled-new-array {v2, v3, v2, v4}, [Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {p0, v0, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 61
    .line 62
    .line 63
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :catchall_0
    :cond_0
    return-object v1

    .line 65
    :pswitch_2
    :try_start_1
    const-class p0, Landroid/database/sqlite/SQLiteDatabase;

    .line 66
    .line 67
    const-string v2, "getThreadSession"

    .line 68
    .line 69
    invoke-virtual {p0, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    .line 76
    move-object v1, p0

    .line 77
    :catchall_1
    return-object v1

    .line 78
    :pswitch_3
    new-instance p0, La/d5r;

    .line 79
    .line 80
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {p0, v0}, La/d5r;-><init>(La/pz40;)V

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_4
    new-instance p0, La/zw3;

    .line 89
    .line 90
    sget-object v0, La/arp;->a:La/arp;

    .line 91
    .line 92
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 93
    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_5
    new-instance p0, La/zw3;

    .line 97
    .line 98
    sget-object v0, La/qvq;->a:La/qvq;

    .line 99
    .line 100
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 101
    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_6
    sget-object p0, La/w0f0;->Companion:La/v0f0;

    .line 105
    .line 106
    invoke-virtual {p0}, La/v0f0;->serializer()La/jiy;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_7
    new-instance p0, La/zw3;

    .line 112
    .line 113
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 114
    .line 115
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 116
    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_8
    new-instance p0, La/zw3;

    .line 120
    .line 121
    new-instance v0, La/zw3;

    .line 122
    .line 123
    sget-object v1, La/xio0;->a:La/xio0;

    .line 124
    .line 125
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 126
    .line 127
    .line 128
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 129
    .line 130
    .line 131
    return-object p0

    .line 132
    :pswitch_9
    new-instance p0, La/zw3;

    .line 133
    .line 134
    sget-object v0, La/emo0;->a:La/emo0;

    .line 135
    .line 136
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 137
    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_a
    new-instance p0, La/zw3;

    .line 141
    .line 142
    sget-object v0, La/okx;->a:La/okx;

    .line 143
    .line 144
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 145
    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_b
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_c
    const p0, 0x7f120010

    .line 152
    .line 153
    .line 154
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    const p0, 0x7f120011

    .line 159
    .line 160
    .line 161
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    const p0, 0x7f12000d

    .line 166
    .line 167
    .line 168
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    const p0, 0x7f12000e

    .line 173
    .line 174
    .line 175
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    const p0, 0x7f12000b

    .line 180
    .line 181
    .line 182
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    const p0, 0x7f12000c

    .line 187
    .line 188
    .line 189
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    const p0, 0x7f120003

    .line 194
    .line 195
    .line 196
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    return-object p0

    .line 209
    :pswitch_d
    sget p0, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->e:I

    .line 210
    .line 211
    const-string p0, "monochromeWithWhiteIcon"

    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_e
    sget p0, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->Z:I

    .line 215
    .line 216
    new-instance p0, La/dzj;

    .line 217
    .line 218
    invoke-direct {p0, v0}, La/dzj;-><init>(B)V

    .line 219
    .line 220
    .line 221
    return-object p0

    .line 222
    :pswitch_f
    new-instance p0, La/zw3;

    .line 223
    .line 224
    sget-object v0, La/ddq;->a:La/ddq;

    .line 225
    .line 226
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 227
    .line 228
    .line 229
    return-object p0

    .line 230
    :pswitch_10
    new-instance p0, La/zw3;

    .line 231
    .line 232
    sget-object v0, La/ddq;->a:La/ddq;

    .line 233
    .line 234
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 235
    .line 236
    .line 237
    return-object p0

    .line 238
    :pswitch_11
    new-instance p0, La/zw3;

    .line 239
    .line 240
    sget-object v0, La/ddq;->a:La/ddq;

    .line 241
    .line 242
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 243
    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_12
    new-instance p0, La/zw3;

    .line 247
    .line 248
    sget-object v0, La/ddq;->a:La/ddq;

    .line 249
    .line 250
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 251
    .line 252
    .line 253
    return-object p0

    .line 254
    :pswitch_13
    new-instance p0, La/zw3;

    .line 255
    .line 256
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 257
    .line 258
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 259
    .line 260
    .line 261
    return-object p0

    .line 262
    :pswitch_14
    new-instance p0, La/zw3;

    .line 263
    .line 264
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 265
    .line 266
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 267
    .line 268
    .line 269
    return-object p0

    .line 270
    :pswitch_15
    new-instance p0, La/zw3;

    .line 271
    .line 272
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 273
    .line 274
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 275
    .line 276
    .line 277
    return-object p0

    .line 278
    :pswitch_16
    new-instance p0, La/zw3;

    .line 279
    .line 280
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 281
    .line 282
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 283
    .line 284
    .line 285
    return-object p0

    .line 286
    :pswitch_17
    new-instance p0, La/zw3;

    .line 287
    .line 288
    sget-object v0, La/tbq;->a:La/tbq;

    .line 289
    .line 290
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 291
    .line 292
    .line 293
    return-object p0

    .line 294
    :pswitch_18
    new-instance p0, La/zw3;

    .line 295
    .line 296
    sget-object v0, La/zbq;->a:La/zbq;

    .line 297
    .line 298
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 299
    .line 300
    .line 301
    return-object p0

    .line 302
    :pswitch_19
    new-instance p0, La/zw3;

    .line 303
    .line 304
    sget-object v0, La/hcq;->a:La/hcq;

    .line 305
    .line 306
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 307
    .line 308
    .line 309
    return-object p0

    .line 310
    :pswitch_1a
    new-instance p0, La/zw3;

    .line 311
    .line 312
    sget-object v0, La/ibq;->a:La/ibq;

    .line 313
    .line 314
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 315
    .line 316
    .line 317
    return-object p0

    .line 318
    :pswitch_1b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 319
    .line 320
    return-object p0

    .line 321
    :pswitch_1c
    new-instance p0, La/t9q;

    .line 322
    .line 323
    sget-object v0, La/iun;->a:La/iun;

    .line 324
    .line 325
    invoke-direct {p0, v1, v0}, La/t9q;-><init>(Ljava/lang/Integer;Ljava/util/List;)V

    .line 326
    .line 327
    .line 328
    return-object p0

    .line 329
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
