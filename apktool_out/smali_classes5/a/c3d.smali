.class public final La/c3d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vj50;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c3d;->a:B

    iput-object p1, p0, La/c3d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final C(IJ)J
    .locals 8

    .line 1
    iget-byte p1, p0, La/c3d;->a:B

    .line 2
    .line 3
    const/16 v0, 0x20

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const-wide v2, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/c3d;->b:Ljava/lang/Object;

    .line 12
    .line 13
    const-wide/16 v4, 0x0

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    packed-switch p1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p0, La/clo;

    .line 20
    .line 21
    iget-object p1, p0, La/clo;->a:La/oyq0;

    .line 22
    .line 23
    iget-object p0, p0, La/clo;->d:Lkotlin/jvm/functions/Function0;

    .line 24
    .line 25
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    and-long/2addr v2, p2

    .line 38
    long-to-int p0, v2

    .line 39
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    cmpl-float v0, v0, v6

    .line 44
    .line 45
    if-lez v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object v0, p1, La/oyq0;->c:La/agk0;

    .line 49
    .line 50
    invoke-virtual {v0}, La/agk0;->l()F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v2, p1, La/oyq0;->c:La/agk0;

    .line 55
    .line 56
    invoke-virtual {v2}, La/agk0;->l()F

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-float/2addr p0, v2

    .line 65
    invoke-virtual {p1, p0}, La/oyq0;->c(F)V

    .line 66
    .line 67
    .line 68
    iget-object p0, p1, La/oyq0;->c:La/agk0;

    .line 69
    .line 70
    invoke-virtual {p0}, La/agk0;->l()F

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    cmpg-float p0, v0, p0

    .line 75
    .line 76
    if-nez p0, :cond_1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-static {p2, p3, v6, v6, v1}, La/ne60;->a(JFFI)J

    .line 80
    .line 81
    .line 82
    move-result-wide v4

    .line 83
    :cond_2
    :goto_0
    return-wide v4

    .line 84
    :pswitch_0
    check-cast p0, La/zyn;

    .line 85
    .line 86
    iget-object p1, p0, La/zyn;->a:La/oyq0;

    .line 87
    .line 88
    iget-object p0, p0, La/zyn;->d:Lkotlin/jvm/functions/Function0;

    .line 89
    .line 90
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-nez p0, :cond_3

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    iget-object p0, p1, La/oyq0;->c:La/agk0;

    .line 104
    .line 105
    invoke-virtual {p0}, La/agk0;->l()F

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    iget-object v0, p1, La/oyq0;->c:La/agk0;

    .line 110
    .line 111
    invoke-virtual {v0}, La/agk0;->l()F

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    and-long/2addr v2, p2

    .line 116
    long-to-int v2, v2

    .line 117
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    add-float/2addr v2, v0

    .line 122
    invoke-virtual {p1, v2}, La/oyq0;->c(F)V

    .line 123
    .line 124
    .line 125
    iget-object p1, p1, La/oyq0;->c:La/agk0;

    .line 126
    .line 127
    invoke-virtual {p1}, La/agk0;->l()F

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    cmpg-float p0, p0, p1

    .line 132
    .line 133
    if-nez p0, :cond_4

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    invoke-static {p2, p3, v6, v6, v1}, La/ne60;->a(JFFI)J

    .line 137
    .line 138
    .line 139
    move-result-wide v4

    .line 140
    :goto_1
    return-wide v4

    .line 141
    :pswitch_1
    check-cast p0, La/h5m;

    .line 142
    .line 143
    iget-object p1, p0, La/h5m;->b:La/agk0;

    .line 144
    .line 145
    iget-object v1, p0, La/h5m;->d:La/bby;

    .line 146
    .line 147
    if-eqz v1, :cond_5

    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    invoke-interface {v1, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 151
    .line 152
    .line 153
    :cond_5
    iget-object p0, p0, La/h5m;->a:La/cgk0;

    .line 154
    .line 155
    invoke-virtual {p0}, La/cgk0;->l()I

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    int-to-float p0, p0

    .line 160
    cmpg-float v1, p0, v6

    .line 161
    .line 162
    if-lez v1, :cond_7

    .line 163
    .line 164
    and-long/2addr p2, v2

    .line 165
    long-to-int p2, p2

    .line 166
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 167
    .line 168
    .line 169
    move-result p3

    .line 170
    cmpl-float p3, p3, v6

    .line 171
    .line 172
    if-ltz p3, :cond_6

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_6
    invoke-virtual {p1}, La/agk0;->l()F

    .line 176
    .line 177
    .line 178
    move-result p3

    .line 179
    invoke-static {p3, v6, p0}, La/l1e0;->c(FFF)F

    .line 180
    .line 181
    .line 182
    move-result p3

    .line 183
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    sub-float p2, p3, p2

    .line 188
    .line 189
    invoke-static {p2, v6, p0}, La/l1e0;->c(FFF)F

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    invoke-virtual {p1, p0}, La/agk0;->m(F)V

    .line 194
    .line 195
    .line 196
    sub-float/2addr p3, p0

    .line 197
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 198
    .line 199
    .line 200
    move-result p0

    .line 201
    int-to-long p0, p0

    .line 202
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 203
    .line 204
    .line 205
    move-result p2

    .line 206
    int-to-long p2, p2

    .line 207
    shl-long/2addr p0, v0

    .line 208
    and-long/2addr p2, v2

    .line 209
    or-long v4, p0, p2

    .line 210
    .line 211
    :cond_7
    :goto_2
    return-wide v4

    .line 212
    :pswitch_2
    check-cast p0, La/f3d;

    .line 213
    .line 214
    iget-boolean p1, p0, La/f3d;->f:Z

    .line 215
    .line 216
    if-nez p1, :cond_8

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_8
    shr-long v0, p2, v0

    .line 220
    .line 221
    long-to-int p1, v0

    .line 222
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    cmpg-float p1, p1, v6

    .line 227
    .line 228
    if-nez p1, :cond_9

    .line 229
    .line 230
    and-long v0, p2, v2

    .line 231
    .line 232
    long-to-int p1, v0

    .line 233
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    cmpg-float p1, p1, v6

    .line 238
    .line 239
    if-gez p1, :cond_9

    .line 240
    .line 241
    iget-object p1, p0, La/f3d;->a:La/agk0;

    .line 242
    .line 243
    invoke-virtual {p1}, La/agk0;->l()F

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    iget-object v0, p0, La/f3d;->d:La/agk0;

    .line 248
    .line 249
    invoke-virtual {v0}, La/agk0;->l()F

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    cmpg-float p1, p1, v0

    .line 254
    .line 255
    if-gez p1, :cond_9

    .line 256
    .line 257
    invoke-virtual {p0, p2, p3}, La/f3d;->c(J)J

    .line 258
    .line 259
    .line 260
    move-result-wide v4

    .line 261
    :cond_9
    :goto_3
    return-wide v4

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final S(IJJ)J
    .locals 6

    .line 1
    iget-byte p1, p0, La/c3d;->a:B

    .line 2
    .line 3
    const/16 v0, 0x20

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object p0, p0, La/c3d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    const-wide v2, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const-wide/16 v4, 0x0

    .line 14
    .line 15
    packed-switch p1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p0, La/clo;

    .line 19
    .line 20
    iget-object p1, p0, La/clo;->a:La/oyq0;

    .line 21
    .line 22
    iget-object p0, p0, La/clo;->d:Lkotlin/jvm/functions/Function0;

    .line 23
    .line 24
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_0

    .line 35
    .line 36
    goto/16 :goto_1

    .line 37
    .line 38
    :cond_0
    iget-object p0, p1, La/oyq0;->b:La/agk0;

    .line 39
    .line 40
    invoke-virtual {p0}, La/agk0;->l()F

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    and-long/2addr p2, v2

    .line 45
    long-to-int p2, p2

    .line 46
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    add-float/2addr p3, p0

    .line 51
    invoke-virtual {p1, p3}, La/oyq0;->b(F)V

    .line 52
    .line 53
    .line 54
    and-long p3, p4, v2

    .line 55
    .line 56
    long-to-int p0, p3

    .line 57
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    cmpg-float p3, p3, v1

    .line 62
    .line 63
    if-ltz p3, :cond_2

    .line 64
    .line 65
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    cmpg-float p3, p3, v1

    .line 70
    .line 71
    if-gez p3, :cond_1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    cmpl-float p2, p2, v1

    .line 79
    .line 80
    if-lez p2, :cond_3

    .line 81
    .line 82
    iget-object p2, p1, La/oyq0;->c:La/agk0;

    .line 83
    .line 84
    invoke-virtual {p2}, La/agk0;->l()F

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    iget-object p3, p1, La/oyq0;->c:La/agk0;

    .line 89
    .line 90
    invoke-virtual {p3}, La/agk0;->l()F

    .line 91
    .line 92
    .line 93
    move-result p3

    .line 94
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    add-float/2addr p0, p3

    .line 99
    invoke-virtual {p1, p0}, La/oyq0;->c(F)V

    .line 100
    .line 101
    .line 102
    iget-object p0, p1, La/oyq0;->c:La/agk0;

    .line 103
    .line 104
    invoke-virtual {p0}, La/agk0;->l()F

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    sub-float/2addr p0, p2

    .line 109
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    int-to-long p1, p1

    .line 114
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    int-to-long p3, p0

    .line 119
    shl-long p0, p1, v0

    .line 120
    .line 121
    and-long p2, p3, v2

    .line 122
    .line 123
    or-long v4, p0, p2

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    :goto_0
    iget-object p0, p1, La/oyq0;->c:La/agk0;

    .line 127
    .line 128
    invoke-virtual {p0}, La/agk0;->l()F

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    iget-object p3, p1, La/oyq0;->c:La/agk0;

    .line 133
    .line 134
    invoke-virtual {p3}, La/agk0;->l()F

    .line 135
    .line 136
    .line 137
    move-result p3

    .line 138
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    add-float/2addr p2, p3

    .line 143
    invoke-virtual {p1, p2}, La/oyq0;->c(F)V

    .line 144
    .line 145
    .line 146
    iget-object p1, p1, La/oyq0;->c:La/agk0;

    .line 147
    .line 148
    invoke-virtual {p1}, La/agk0;->l()F

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    sub-float/2addr p1, p0

    .line 153
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    int-to-long p2, p0

    .line 158
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    int-to-long p0, p0

    .line 163
    shl-long/2addr p2, v0

    .line 164
    and-long/2addr p0, v2

    .line 165
    or-long v4, p2, p0

    .line 166
    .line 167
    :cond_3
    :goto_1
    return-wide v4

    .line 168
    :pswitch_0
    check-cast p0, La/zyn;

    .line 169
    .line 170
    iget-object p1, p0, La/zyn;->a:La/oyq0;

    .line 171
    .line 172
    iget-object p0, p0, La/zyn;->d:Lkotlin/jvm/functions/Function0;

    .line 173
    .line 174
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    check-cast p0, Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    if-nez p0, :cond_4

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_4
    iget-object p0, p1, La/oyq0;->b:La/agk0;

    .line 188
    .line 189
    invoke-virtual {p0}, La/agk0;->l()F

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    and-long/2addr p2, v2

    .line 194
    long-to-int p2, p2

    .line 195
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 196
    .line 197
    .line 198
    move-result p3

    .line 199
    add-float/2addr p3, p0

    .line 200
    invoke-virtual {p1, p3}, La/oyq0;->b(F)V

    .line 201
    .line 202
    .line 203
    iget-object p0, p1, La/oyq0;->c:La/agk0;

    .line 204
    .line 205
    invoke-virtual {p0}, La/agk0;->l()F

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 210
    .line 211
    .line 212
    move-result p2

    .line 213
    add-float/2addr p2, p0

    .line 214
    invoke-virtual {p1, p2}, La/oyq0;->c(F)V

    .line 215
    .line 216
    .line 217
    :goto_2
    return-wide v4

    .line 218
    :pswitch_1
    check-cast p0, La/h5m;

    .line 219
    .line 220
    iget-object p1, p0, La/h5m;->b:La/agk0;

    .line 221
    .line 222
    iget-object p2, p0, La/h5m;->d:La/bby;

    .line 223
    .line 224
    if-eqz p2, :cond_5

    .line 225
    .line 226
    const/4 p3, 0x0

    .line 227
    invoke-interface {p2, p3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 228
    .line 229
    .line 230
    :cond_5
    iget-object p0, p0, La/h5m;->a:La/cgk0;

    .line 231
    .line 232
    invoke-virtual {p0}, La/cgk0;->l()I

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    int-to-float p0, p0

    .line 237
    cmpg-float p2, p0, v1

    .line 238
    .line 239
    if-lez p2, :cond_7

    .line 240
    .line 241
    and-long p2, p4, v2

    .line 242
    .line 243
    long-to-int p2, p2

    .line 244
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 245
    .line 246
    .line 247
    move-result p3

    .line 248
    cmpg-float p3, p3, v1

    .line 249
    .line 250
    if-gtz p3, :cond_6

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_6
    invoke-virtual {p1}, La/agk0;->l()F

    .line 254
    .line 255
    .line 256
    move-result p3

    .line 257
    invoke-static {p3, v1, p0}, La/l1e0;->c(FFF)F

    .line 258
    .line 259
    .line 260
    move-result p3

    .line 261
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 262
    .line 263
    .line 264
    move-result p2

    .line 265
    sub-float p2, p3, p2

    .line 266
    .line 267
    invoke-static {p2, v1, p0}, La/l1e0;->c(FFF)F

    .line 268
    .line 269
    .line 270
    move-result p0

    .line 271
    invoke-virtual {p1, p0}, La/agk0;->m(F)V

    .line 272
    .line 273
    .line 274
    sub-float/2addr p3, p0

    .line 275
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 276
    .line 277
    .line 278
    move-result p0

    .line 279
    int-to-long p0, p0

    .line 280
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 281
    .line 282
    .line 283
    move-result p2

    .line 284
    int-to-long p2, p2

    .line 285
    shl-long/2addr p0, v0

    .line 286
    and-long/2addr p2, v2

    .line 287
    or-long v4, p0, p2

    .line 288
    .line 289
    :cond_7
    :goto_3
    return-wide v4

    .line 290
    :pswitch_2
    and-long p1, p4, v2

    .line 291
    .line 292
    long-to-int p1, p1

    .line 293
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    cmpl-float p1, p1, v1

    .line 298
    .line 299
    if-lez p1, :cond_8

    .line 300
    .line 301
    check-cast p0, La/f3d;

    .line 302
    .line 303
    invoke-virtual {p0, p4, p5}, La/f3d;->c(J)J

    .line 304
    .line 305
    .line 306
    move-result-wide v4

    .line 307
    :cond_8
    return-wide v4

    .line 308
    nop

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(JJLa/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v3, p3

    .line 4
    .line 5
    move-object/from16 v1, p5

    .line 6
    .line 7
    iget-byte v2, v0, La/c3d;->a:B

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    iget-object v7, v0, La/c3d;->b:Ljava/lang/Object;

    .line 13
    .line 14
    const/high16 v8, -0x80000000

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x2

    .line 18
    const/4 v11, 0x0

    .line 19
    packed-switch v2, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v7, La/clo;

    .line 23
    .line 24
    iget-object v12, v7, La/clo;->a:La/oyq0;

    .line 25
    .line 26
    instance-of v2, v1, La/blo;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    move-object v2, v1

    .line 31
    check-cast v2, La/blo;

    .line 32
    .line 33
    iget v13, v2, La/blo;->l:I

    .line 34
    .line 35
    and-int v14, v13, v8

    .line 36
    .line 37
    if-eqz v14, :cond_0

    .line 38
    .line 39
    sub-int/2addr v13, v8

    .line 40
    iput v13, v2, La/blo;->l:I

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance v2, La/blo;

    .line 44
    .line 45
    invoke-direct {v2, v0, v1}, La/blo;-><init>(La/c3d;La/zje;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    iget-object v1, v2, La/blo;->j:Ljava/lang/Object;

    .line 49
    .line 50
    sget-object v8, La/wne;->a:La/wne;

    .line 51
    .line 52
    iget v13, v2, La/blo;->l:I

    .line 53
    .line 54
    if-eqz v13, :cond_3

    .line 55
    .line 56
    if-eq v13, v9, :cond_2

    .line 57
    .line 58
    if-ne v13, v10, :cond_1

    .line 59
    .line 60
    iget-wide v2, v2, La/blo;->i:J

    .line 61
    .line 62
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_1
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_2
    iget-wide v3, v2, La/blo;->i:J

    .line 71
    .line 72
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    move-object v5, v2

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v3, v4}, La/g6u0;->c(J)F

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    cmpl-float v1, v1, v5

    .line 85
    .line 86
    if-lez v1, :cond_4

    .line 87
    .line 88
    invoke-virtual {v12, v5}, La/oyq0;->b(F)V

    .line 89
    .line 90
    .line 91
    :cond_4
    iput-wide v3, v2, La/blo;->i:J

    .line 92
    .line 93
    iput v9, v2, La/blo;->l:I

    .line 94
    .line 95
    move-object v5, v2

    .line 96
    move-wide/from16 v1, p1

    .line 97
    .line 98
    invoke-super/range {v0 .. v5}, La/vj50;->g(JJLa/zje;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    if-ne v1, v8, :cond_5

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    :goto_1
    check-cast v1, La/g6u0;

    .line 106
    .line 107
    iget-wide v0, v1, La/g6u0;->a:J

    .line 108
    .line 109
    invoke-static {v3, v4}, La/g6u0;->c(J)F

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    iget-object v3, v7, La/clo;->c:La/sjj;

    .line 114
    .line 115
    iget-object v4, v7, La/clo;->b:La/nul0;

    .line 116
    .line 117
    iput-wide v0, v5, La/blo;->i:J

    .line 118
    .line 119
    iput v10, v5, La/blo;->l:I

    .line 120
    .line 121
    invoke-static {v12, v2, v3, v4, v5}, La/ob3;->e(La/oyq0;FLa/sjj;La/j73;La/zje;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    if-ne v2, v8, :cond_6

    .line 126
    .line 127
    :goto_2
    move-object v11, v8

    .line 128
    goto :goto_4

    .line 129
    :cond_6
    move-wide/from16 v16, v0

    .line 130
    .line 131
    move-object v1, v2

    .line 132
    move-wide/from16 v2, v16

    .line 133
    .line 134
    :goto_3
    check-cast v1, La/g6u0;

    .line 135
    .line 136
    iget-wide v0, v1, La/g6u0;->a:J

    .line 137
    .line 138
    invoke-static {v2, v3, v0, v1}, La/g6u0;->e(JJ)J

    .line 139
    .line 140
    .line 141
    move-result-wide v0

    .line 142
    new-instance v11, La/g6u0;

    .line 143
    .line 144
    invoke-direct {v11, v0, v1}, La/g6u0;-><init>(J)V

    .line 145
    .line 146
    .line 147
    :goto_4
    return-object v11

    .line 148
    :pswitch_0
    check-cast v7, La/zyn;

    .line 149
    .line 150
    iget-object v12, v7, La/zyn;->a:La/oyq0;

    .line 151
    .line 152
    instance-of v2, v1, La/yyn;

    .line 153
    .line 154
    if-eqz v2, :cond_7

    .line 155
    .line 156
    move-object v2, v1

    .line 157
    check-cast v2, La/yyn;

    .line 158
    .line 159
    iget v13, v2, La/yyn;->l:I

    .line 160
    .line 161
    and-int v14, v13, v8

    .line 162
    .line 163
    if-eqz v14, :cond_7

    .line 164
    .line 165
    sub-int/2addr v13, v8

    .line 166
    iput v13, v2, La/yyn;->l:I

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_7
    new-instance v2, La/yyn;

    .line 170
    .line 171
    invoke-direct {v2, v0, v1}, La/yyn;-><init>(La/c3d;La/zje;)V

    .line 172
    .line 173
    .line 174
    :goto_5
    iget-object v1, v2, La/yyn;->j:Ljava/lang/Object;

    .line 175
    .line 176
    sget-object v8, La/wne;->a:La/wne;

    .line 177
    .line 178
    iget v13, v2, La/yyn;->l:I

    .line 179
    .line 180
    if-eqz v13, :cond_a

    .line 181
    .line 182
    if-eq v13, v9, :cond_9

    .line 183
    .line 184
    if-ne v13, v10, :cond_8

    .line 185
    .line 186
    iget-wide v2, v2, La/yyn;->i:J

    .line 187
    .line 188
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    goto :goto_9

    .line 192
    :cond_8
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    goto :goto_a

    .line 196
    :cond_9
    iget-wide v3, v2, La/yyn;->i:J

    .line 197
    .line 198
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    move-object v5, v2

    .line 202
    goto :goto_7

    .line 203
    :cond_a
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v3, v4}, La/g6u0;->c(J)F

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    cmpl-float v1, v1, v5

    .line 211
    .line 212
    if-lez v1, :cond_c

    .line 213
    .line 214
    iget-object v1, v12, La/oyq0;->c:La/agk0;

    .line 215
    .line 216
    invoke-virtual {v1}, La/agk0;->l()F

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    cmpg-float v1, v1, v5

    .line 221
    .line 222
    if-nez v1, :cond_b

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_b
    iget-object v1, v12, La/oyq0;->c:La/agk0;

    .line 226
    .line 227
    invoke-virtual {v1}, La/agk0;->l()F

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    iget v6, v12, La/oyq0;->a:F

    .line 232
    .line 233
    cmpg-float v1, v1, v6

    .line 234
    .line 235
    if-nez v1, :cond_c

    .line 236
    .line 237
    :goto_6
    invoke-virtual {v12, v5}, La/oyq0;->b(F)V

    .line 238
    .line 239
    .line 240
    :cond_c
    iput-wide v3, v2, La/yyn;->i:J

    .line 241
    .line 242
    iput v9, v2, La/yyn;->l:I

    .line 243
    .line 244
    move-object v5, v2

    .line 245
    move-wide/from16 v1, p1

    .line 246
    .line 247
    invoke-super/range {v0 .. v5}, La/vj50;->g(JJLa/zje;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    if-ne v1, v8, :cond_d

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_d
    :goto_7
    check-cast v1, La/g6u0;

    .line 255
    .line 256
    iget-wide v0, v1, La/g6u0;->a:J

    .line 257
    .line 258
    invoke-static {v3, v4}, La/g6u0;->c(J)F

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    iget-object v3, v7, La/zyn;->c:La/sjj;

    .line 263
    .line 264
    iget-object v4, v7, La/zyn;->b:La/nul0;

    .line 265
    .line 266
    iput-wide v0, v5, La/yyn;->i:J

    .line 267
    .line 268
    iput v10, v5, La/yyn;->l:I

    .line 269
    .line 270
    invoke-static {v12, v2, v3, v4, v5}, La/ob3;->e(La/oyq0;FLa/sjj;La/j73;La/zje;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    if-ne v2, v8, :cond_e

    .line 275
    .line 276
    :goto_8
    move-object v11, v8

    .line 277
    goto :goto_a

    .line 278
    :cond_e
    move-wide/from16 v16, v0

    .line 279
    .line 280
    move-object v1, v2

    .line 281
    move-wide/from16 v2, v16

    .line 282
    .line 283
    :goto_9
    check-cast v1, La/g6u0;

    .line 284
    .line 285
    iget-wide v0, v1, La/g6u0;->a:J

    .line 286
    .line 287
    invoke-static {v2, v3, v0, v1}, La/g6u0;->e(JJ)J

    .line 288
    .line 289
    .line 290
    move-result-wide v0

    .line 291
    new-instance v11, La/g6u0;

    .line 292
    .line 293
    invoke-direct {v11, v0, v1}, La/g6u0;-><init>(J)V

    .line 294
    .line 295
    .line 296
    :goto_a
    return-object v11

    .line 297
    :pswitch_1
    move-wide/from16 v12, p1

    .line 298
    .line 299
    instance-of v2, v1, La/g5m;

    .line 300
    .line 301
    if-eqz v2, :cond_f

    .line 302
    .line 303
    move-object v2, v1

    .line 304
    check-cast v2, La/g5m;

    .line 305
    .line 306
    iget v14, v2, La/g5m;->m:I

    .line 307
    .line 308
    and-int v15, v14, v8

    .line 309
    .line 310
    if-eqz v15, :cond_f

    .line 311
    .line 312
    sub-int/2addr v14, v8

    .line 313
    iput v14, v2, La/g5m;->m:I

    .line 314
    .line 315
    goto :goto_b

    .line 316
    :cond_f
    new-instance v2, La/g5m;

    .line 317
    .line 318
    invoke-direct {v2, v0, v1}, La/g5m;-><init>(La/c3d;La/zje;)V

    .line 319
    .line 320
    .line 321
    :goto_b
    iget-object v1, v2, La/g5m;->k:Ljava/lang/Object;

    .line 322
    .line 323
    sget-object v8, La/wne;->a:La/wne;

    .line 324
    .line 325
    iget v14, v2, La/g5m;->m:I

    .line 326
    .line 327
    if-eqz v14, :cond_12

    .line 328
    .line 329
    if-eq v14, v9, :cond_11

    .line 330
    .line 331
    if-ne v14, v10, :cond_10

    .line 332
    .line 333
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    move-object v11, v1

    .line 337
    goto/16 :goto_13

    .line 338
    .line 339
    :cond_10
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    goto/16 :goto_13

    .line 343
    .line 344
    :cond_11
    iget-wide v3, v2, La/g5m;->j:J

    .line 345
    .line 346
    iget-wide v5, v2, La/g5m;->i:J

    .line 347
    .line 348
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    move-wide v12, v5

    .line 352
    goto/16 :goto_11

    .line 353
    .line 354
    :cond_12
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    check-cast v7, La/h5m;

    .line 358
    .line 359
    iget-object v1, v7, La/h5m;->a:La/cgk0;

    .line 360
    .line 361
    iget-object v6, v7, La/h5m;->b:La/agk0;

    .line 362
    .line 363
    iput-wide v12, v2, La/g5m;->i:J

    .line 364
    .line 365
    iput-wide v3, v2, La/g5m;->j:J

    .line 366
    .line 367
    iput v9, v2, La/g5m;->m:I

    .line 368
    .line 369
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 370
    .line 371
    .line 372
    move-result v9

    .line 373
    int-to-float v9, v9

    .line 374
    cmpg-float v14, v9, v5

    .line 375
    .line 376
    if-gtz v14, :cond_13

    .line 377
    .line 378
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    goto :goto_10

    .line 381
    :cond_13
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 382
    .line 383
    .line 384
    move-result v14

    .line 385
    if-lez v14, :cond_14

    .line 386
    .line 387
    invoke-virtual {v6}, La/agk0;->l()F

    .line 388
    .line 389
    .line 390
    move-result v14

    .line 391
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    int-to-float v1, v1

    .line 396
    div-float/2addr v14, v1

    .line 397
    const/high16 v1, 0x3f800000    # 1.0f

    .line 398
    .line 399
    invoke-static {v14, v5, v1}, La/l1e0;->c(FFF)F

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    goto :goto_c

    .line 404
    :cond_14
    move v1, v5

    .line 405
    :goto_c
    const/high16 v14, 0x3f000000    # 0.5f

    .line 406
    .line 407
    cmpg-float v1, v1, v14

    .line 408
    .line 409
    if-gez v1, :cond_15

    .line 410
    .line 411
    goto :goto_d

    .line 412
    :cond_15
    move v5, v9

    .line 413
    :goto_d
    invoke-virtual {v6}, La/agk0;->l()F

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    cmpg-float v1, v1, v5

    .line 418
    .line 419
    if-nez v1, :cond_16

    .line 420
    .line 421
    goto :goto_f

    .line 422
    :cond_16
    iget-object v1, v7, La/h5m;->c:La/vne;

    .line 423
    .line 424
    if-eqz v1, :cond_17

    .line 425
    .line 426
    invoke-interface {v1}, La/vne;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    goto :goto_e

    .line 431
    :cond_17
    move-object v1, v11

    .line 432
    :goto_e
    if-eqz v1, :cond_19

    .line 433
    .line 434
    new-instance v6, La/ep8;

    .line 435
    .line 436
    invoke-direct {v6, v7, v5, v11}, La/ep8;-><init>(La/h5m;FLa/yje;)V

    .line 437
    .line 438
    .line 439
    invoke-static {v1, v6, v2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    if-ne v1, v8, :cond_18

    .line 444
    .line 445
    goto :goto_10

    .line 446
    :cond_18
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 447
    .line 448
    goto :goto_10

    .line 449
    :cond_19
    invoke-virtual {v6, v5}, La/agk0;->m(F)V

    .line 450
    .line 451
    .line 452
    :goto_f
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 453
    .line 454
    :goto_10
    if-ne v1, v8, :cond_1a

    .line 455
    .line 456
    goto :goto_12

    .line 457
    :cond_1a
    :goto_11
    iput-wide v12, v2, La/g5m;->i:J

    .line 458
    .line 459
    iput-wide v3, v2, La/g5m;->j:J

    .line 460
    .line 461
    iput v10, v2, La/g5m;->m:I

    .line 462
    .line 463
    move-object v5, v2

    .line 464
    move-wide v1, v12

    .line 465
    invoke-super/range {v0 .. v5}, La/vj50;->g(JJLa/zje;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v11

    .line 469
    if-ne v11, v8, :cond_1b

    .line 470
    .line 471
    :goto_12
    move-object v11, v8

    .line 472
    :cond_1b
    :goto_13
    return-object v11

    .line 473
    :pswitch_2
    move-wide/from16 v12, p1

    .line 474
    .line 475
    instance-of v2, v1, La/b3d;

    .line 476
    .line 477
    if-eqz v2, :cond_1c

    .line 478
    .line 479
    move-object v2, v1

    .line 480
    check-cast v2, La/b3d;

    .line 481
    .line 482
    iget v5, v2, La/b3d;->m:I

    .line 483
    .line 484
    and-int v14, v5, v8

    .line 485
    .line 486
    if-eqz v14, :cond_1c

    .line 487
    .line 488
    sub-int/2addr v5, v8

    .line 489
    iput v5, v2, La/b3d;->m:I

    .line 490
    .line 491
    :goto_14
    move-object v5, v2

    .line 492
    goto :goto_15

    .line 493
    :cond_1c
    new-instance v2, La/b3d;

    .line 494
    .line 495
    invoke-direct {v2, v0, v1}, La/b3d;-><init>(La/c3d;La/zje;)V

    .line 496
    .line 497
    .line 498
    goto :goto_14

    .line 499
    :goto_15
    iget-object v1, v5, La/b3d;->k:Ljava/lang/Object;

    .line 500
    .line 501
    sget-object v8, La/wne;->a:La/wne;

    .line 502
    .line 503
    iget v2, v5, La/b3d;->m:I

    .line 504
    .line 505
    if-eqz v2, :cond_1f

    .line 506
    .line 507
    if-eq v2, v9, :cond_1e

    .line 508
    .line 509
    if-ne v2, v10, :cond_1d

    .line 510
    .line 511
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    move-object v11, v1

    .line 515
    goto :goto_18

    .line 516
    :cond_1d
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    goto :goto_18

    .line 520
    :cond_1e
    iget-wide v2, v5, La/b3d;->j:J

    .line 521
    .line 522
    iget-wide v6, v5, La/b3d;->i:J

    .line 523
    .line 524
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    move-wide v3, v2

    .line 528
    move-wide v1, v6

    .line 529
    goto :goto_16

    .line 530
    :cond_1f
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    check-cast v7, La/f3d;

    .line 534
    .line 535
    iput-wide v12, v5, La/b3d;->i:J

    .line 536
    .line 537
    iput-wide v3, v5, La/b3d;->j:J

    .line 538
    .line 539
    iput v9, v5, La/b3d;->m:I

    .line 540
    .line 541
    invoke-virtual {v7, v5}, La/f3d;->e(La/zje;)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    if-ne v1, v8, :cond_20

    .line 546
    .line 547
    goto :goto_17

    .line 548
    :cond_20
    move-wide v1, v12

    .line 549
    :goto_16
    iput-wide v1, v5, La/b3d;->i:J

    .line 550
    .line 551
    iput-wide v3, v5, La/b3d;->j:J

    .line 552
    .line 553
    iput v10, v5, La/b3d;->m:I

    .line 554
    .line 555
    invoke-super/range {v0 .. v5}, La/vj50;->g(JJLa/zje;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v11

    .line 559
    if-ne v11, v8, :cond_21

    .line 560
    .line 561
    :goto_17
    move-object v11, v8

    .line 562
    :cond_21
    :goto_18
    return-object v11

    .line 563
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
