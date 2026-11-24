.class public final La/fu6;
.super La/ulb;
.source "SourceFile"


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 8
    iput-byte p1, p0, La/fu6;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/ou6;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-byte p1, p0, La/fu6;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final C(La/xpg0;Ljava/lang/Object;)V
    .locals 11

    .line 1
    iget-byte p0, p0, La/fu6;->a:B

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    const/4 v1, 0x6

    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x1

    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p2, La/skt;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget p0, p2, La/skt;->a:I

    .line 22
    .line 23
    int-to-long v7, p0

    .line 24
    invoke-interface {p1, v6, v7, v8}, La/xpg0;->o(IJ)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p2, La/skt;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {p1, v5, p0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget p0, p2, La/skt;->c:I

    .line 33
    .line 34
    int-to-long v5, p0

    .line 35
    invoke-interface {p1, v4, v5, v6}, La/xpg0;->o(IJ)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p2, La/skt;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-interface {p1, v3, p0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-wide v3, p2, La/skt;->e:J

    .line 44
    .line 45
    invoke-interface {p1, v2, v3, v4}, La/xpg0;->o(IJ)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p2, La/skt;->f:Ljava/lang/String;

    .line 49
    .line 50
    invoke-interface {p1, v1, p0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v0, v7, v8}, La/xpg0;->o(IJ)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_0
    check-cast p2, La/dm90;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget p0, p2, La/dm90;->a:I

    .line 66
    .line 67
    int-to-long v0, p0

    .line 68
    invoke-interface {p1, v6, v0, v1}, La/xpg0;->o(IJ)V

    .line 69
    .line 70
    .line 71
    iget p0, p2, La/dm90;->b:I

    .line 72
    .line 73
    int-to-long v6, p0

    .line 74
    invoke-interface {p1, v5, v6, v7}, La/xpg0;->o(IJ)V

    .line 75
    .line 76
    .line 77
    iget p0, p2, La/dm90;->c:I

    .line 78
    .line 79
    int-to-long v5, p0

    .line 80
    invoke-interface {p1, v4, v5, v6}, La/xpg0;->o(IJ)V

    .line 81
    .line 82
    .line 83
    iget-object p0, p2, La/dm90;->d:Ljava/lang/String;

    .line 84
    .line 85
    invoke-interface {p1, v3, p0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p1, v2, v0, v1}, La/xpg0;->o(IJ)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_1
    check-cast p2, La/pu6;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-wide v7, p2, La/pu6;->a:J

    .line 101
    .line 102
    invoke-interface {p1, v6, v7, v8}, La/xpg0;->o(IJ)V

    .line 103
    .line 104
    .line 105
    iget-wide v9, p2, La/pu6;->b:J

    .line 106
    .line 107
    invoke-interface {p1, v5, v9, v10}, La/xpg0;->o(IJ)V

    .line 108
    .line 109
    .line 110
    iget-wide v5, p2, La/pu6;->c:J

    .line 111
    .line 112
    invoke-interface {p1, v4, v5, v6}, La/xpg0;->o(IJ)V

    .line 113
    .line 114
    .line 115
    iget-wide v4, p2, La/pu6;->d:J

    .line 116
    .line 117
    invoke-interface {p1, v3, v4, v5}, La/xpg0;->o(IJ)V

    .line 118
    .line 119
    .line 120
    iget-wide v3, p2, La/pu6;->e:J

    .line 121
    .line 122
    invoke-interface {p1, v2, v3, v4}, La/xpg0;->o(IJ)V

    .line 123
    .line 124
    .line 125
    iget-object p0, p2, La/pu6;->f:Ljava/lang/String;

    .line 126
    .line 127
    invoke-interface {p1, v1, p0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 128
    .line 129
    .line 130
    iget-object p0, p2, La/pu6;->g:Ljava/lang/String;

    .line 131
    .line 132
    invoke-interface {p1, v0, p0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const/16 p0, 0x8

    .line 136
    .line 137
    iget-object v0, p2, La/pu6;->h:Ljava/lang/String;

    .line 138
    .line 139
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const/16 p0, 0x9

    .line 143
    .line 144
    iget-object v0, p2, La/pu6;->i:Ljava/lang/String;

    .line 145
    .line 146
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 147
    .line 148
    .line 149
    const/16 p0, 0xa

    .line 150
    .line 151
    iget-object v0, p2, La/pu6;->j:Ljava/lang/String;

    .line 152
    .line 153
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const/16 p0, 0xb

    .line 157
    .line 158
    iget-object v0, p2, La/pu6;->k:Ljava/lang/String;

    .line 159
    .line 160
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const/16 p0, 0xc

    .line 164
    .line 165
    iget-object v0, p2, La/pu6;->l:Ljava/lang/String;

    .line 166
    .line 167
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const/16 p0, 0xd

    .line 171
    .line 172
    iget-object v0, p2, La/pu6;->m:Ljava/lang/String;

    .line 173
    .line 174
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 175
    .line 176
    .line 177
    const/16 p0, 0xe

    .line 178
    .line 179
    iget-wide v0, p2, La/pu6;->n:J

    .line 180
    .line 181
    invoke-interface {p1, p0, v0, v1}, La/xpg0;->o(IJ)V

    .line 182
    .line 183
    .line 184
    const/16 p0, 0xf

    .line 185
    .line 186
    iget-object v0, p2, La/pu6;->o:Ljava/lang/String;

    .line 187
    .line 188
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 189
    .line 190
    .line 191
    const/16 p0, 0x10

    .line 192
    .line 193
    iget-wide v0, p2, La/pu6;->p:D

    .line 194
    .line 195
    invoke-interface {p1, v0, v1, p0}, La/xpg0;->p(DI)V

    .line 196
    .line 197
    .line 198
    const/16 p0, 0x11

    .line 199
    .line 200
    iget-wide v0, p2, La/pu6;->q:J

    .line 201
    .line 202
    invoke-interface {p1, p0, v0, v1}, La/xpg0;->o(IJ)V

    .line 203
    .line 204
    .line 205
    const/16 p0, 0x12

    .line 206
    .line 207
    iget-object v0, p2, La/pu6;->r:Ljava/lang/String;

    .line 208
    .line 209
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const/16 p0, 0x13

    .line 213
    .line 214
    iget-object v0, p2, La/pu6;->s:Ljava/lang/String;

    .line 215
    .line 216
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 217
    .line 218
    .line 219
    const/16 p0, 0x14

    .line 220
    .line 221
    iget-object v0, p2, La/pu6;->t:Ljava/lang/String;

    .line 222
    .line 223
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 224
    .line 225
    .line 226
    iget-object p0, p2, La/pu6;->u:La/toy;

    .line 227
    .line 228
    iget-byte p0, p0, La/toy;->a:B

    .line 229
    .line 230
    const/16 v0, 0x15

    .line 231
    .line 232
    int-to-long v1, p0

    .line 233
    invoke-interface {p1, v0, v1, v2}, La/xpg0;->o(IJ)V

    .line 234
    .line 235
    .line 236
    const/16 p0, 0x16

    .line 237
    .line 238
    iget-wide v0, p2, La/pu6;->v:J

    .line 239
    .line 240
    invoke-interface {p1, p0, v0, v1}, La/xpg0;->o(IJ)V

    .line 241
    .line 242
    .line 243
    const/16 p0, 0x17

    .line 244
    .line 245
    iget-object v0, p2, La/pu6;->w:Ljava/lang/String;

    .line 246
    .line 247
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 248
    .line 249
    .line 250
    iget p0, p2, La/pu6;->x:I

    .line 251
    .line 252
    int-to-long v0, p0

    .line 253
    const/16 p0, 0x18

    .line 254
    .line 255
    invoke-interface {p1, p0, v0, v1}, La/xpg0;->o(IJ)V

    .line 256
    .line 257
    .line 258
    const/16 p0, 0x19

    .line 259
    .line 260
    iget-object v0, p2, La/pu6;->y:Ljava/lang/String;

    .line 261
    .line 262
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 263
    .line 264
    .line 265
    const/16 p0, 0x1a

    .line 266
    .line 267
    iget-object v0, p2, La/pu6;->z:Ljava/lang/String;

    .line 268
    .line 269
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 270
    .line 271
    .line 272
    const/16 p0, 0x1b

    .line 273
    .line 274
    iget-object v0, p2, La/pu6;->A:Ljava/lang/String;

    .line 275
    .line 276
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 277
    .line 278
    .line 279
    const/16 p0, 0x1c

    .line 280
    .line 281
    iget-object v0, p2, La/pu6;->B:Ljava/lang/String;

    .line 282
    .line 283
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 284
    .line 285
    .line 286
    iget p0, p2, La/pu6;->C:I

    .line 287
    .line 288
    int-to-long v0, p0

    .line 289
    const/16 p0, 0x1d

    .line 290
    .line 291
    invoke-interface {p1, p0, v0, v1}, La/xpg0;->o(IJ)V

    .line 292
    .line 293
    .line 294
    const/16 p0, 0x1e

    .line 295
    .line 296
    iget-object v0, p2, La/pu6;->D:Ljava/lang/String;

    .line 297
    .line 298
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 299
    .line 300
    .line 301
    const/16 p0, 0x1f

    .line 302
    .line 303
    iget-object v0, p2, La/pu6;->E:Ljava/lang/String;

    .line 304
    .line 305
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 306
    .line 307
    .line 308
    const/16 p0, 0x20

    .line 309
    .line 310
    iget-wide v0, p2, La/pu6;->F:J

    .line 311
    .line 312
    invoke-interface {p1, p0, v0, v1}, La/xpg0;->o(IJ)V

    .line 313
    .line 314
    .line 315
    const/16 p0, 0x21

    .line 316
    .line 317
    iget-wide v0, p2, La/pu6;->G:D

    .line 318
    .line 319
    invoke-interface {p1, v0, v1, p0}, La/xpg0;->p(DI)V

    .line 320
    .line 321
    .line 322
    const/16 p0, 0x22

    .line 323
    .line 324
    iget-object v0, p2, La/pu6;->H:Ljava/lang/String;

    .line 325
    .line 326
    invoke-interface {p1, p0, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 327
    .line 328
    .line 329
    iget p0, p2, La/pu6;->I:I

    .line 330
    .line 331
    int-to-long v0, p0

    .line 332
    const/16 p0, 0x23

    .line 333
    .line 334
    invoke-interface {p1, p0, v0, v1}, La/xpg0;->o(IJ)V

    .line 335
    .line 336
    .line 337
    iget p0, p2, La/pu6;->J:I

    .line 338
    .line 339
    int-to-long v0, p0

    .line 340
    const/16 p0, 0x24

    .line 341
    .line 342
    invoke-interface {p1, p0, v0, v1}, La/xpg0;->o(IJ)V

    .line 343
    .line 344
    .line 345
    iget p0, p2, La/pu6;->K:I

    .line 346
    .line 347
    int-to-long v0, p0

    .line 348
    const/16 p0, 0x25

    .line 349
    .line 350
    invoke-interface {p1, p0, v0, v1}, La/xpg0;->o(IJ)V

    .line 351
    .line 352
    .line 353
    iget p0, p2, La/pu6;->L:I

    .line 354
    .line 355
    int-to-long v0, p0

    .line 356
    const/16 p0, 0x26

    .line 357
    .line 358
    invoke-interface {p1, p0, v0, v1}, La/xpg0;->o(IJ)V

    .line 359
    .line 360
    .line 361
    iget p0, p2, La/pu6;->M:I

    .line 362
    .line 363
    int-to-long v0, p0

    .line 364
    const/16 p0, 0x27

    .line 365
    .line 366
    invoke-interface {p1, p0, v0, v1}, La/xpg0;->o(IJ)V

    .line 367
    .line 368
    .line 369
    const/16 p0, 0x28

    .line 370
    .line 371
    invoke-interface {p1, p0, v7, v8}, La/xpg0;->o(IJ)V

    .line 372
    .line 373
    .line 374
    return-void

    .line 375
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final I()Ljava/lang/String;
    .locals 0

    .line 1
    iget-byte p0, p0, La/fu6;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "UPDATE `country` SET `id` = ?,`country_name` = ?,`country_phone_code` = ?,`country_code` = ?,`country_currency_id` = ?,`country_image` = ? WHERE `id` = ?"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "UPDATE OR ABORT `country` SET `id` = ?,`phone_mask_max_length` = ?,`phone_mask_min_length` = ?,`phone_mask` = ? WHERE `id` = ?"

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    const-string p0, "UPDATE OR ABORT `bet_events` SET `id` = ?,`game_id` = ?,`main_game_id` = ?,`player_id` = ?,`sport_id` = ?,`player_name` = ?,`game_match_name` = ?,`first_opponent_first_img` = ?,`first_opponent_second_img` = ?,`second_opponent_first_img` = ?,`second_opponent_second_img` = ?,`group_name` = ?,`champ_name` = ?,`express_number` = ?,`coefficient` = ?,`param` = ?,`time_start` = ?,`vid` = ?,`full_name` = ?,`name` = ?,`kind` = ?,`type` = ?,`players_duel_game` = ?,`coupon_entry_feature_id` = ?,`first_opponent_name` = ?,`second_opponent_name` = ?,`opponents_full_name` = ?,`tournament_stage` = ?,`teams_number` = ?,`game_type` = ?,`game_vid` = ?,`group_id` = ?,`option_lower_cf` = ?,`option_lower_cf_view` = ?,`coupon_type_vid` = ?,`builder_game_type` = ?,`builder_game_vid` = ?,`builder_period` = ?,`builder_coef_available` = ? WHERE `id` = ?"

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
