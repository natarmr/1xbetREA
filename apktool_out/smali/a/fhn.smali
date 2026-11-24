.class public La/fhn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/btn;


# static fields
.field public static final c:La/fhn;

.field public static final d:[Ljava/lang/String;

.field public static final e:La/fhn;

.field public static final f:La/fhn;

.field public static final g:La/fhn;

.field public static final h:La/fhn;

.field public static final i:La/fhn;

.field public static final j:La/fhn;

.field public static final k:La/fhn;

.field public static final l:La/fhn;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/fhn;

    .line 2
    .line 3
    invoke-direct {v0}, La/fhn;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/fhn;->c:La/fhn;

    .line 7
    .line 8
    const-string v0, "decelerate"

    .line 9
    .line 10
    const-string v1, "linear"

    .line 11
    .line 12
    const-string v2, "standard"

    .line 13
    .line 14
    const-string v3, "accelerate"

    .line 15
    .line 16
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, La/fhn;->d:[Ljava/lang/String;

    .line 21
    .line 22
    new-instance v0, La/fhn;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    const/4 v2, 0x0

    .line 26
    const-string v3, "SHA1"

    .line 27
    .line 28
    invoke-direct {v0, v1, v3, v2}, La/fhn;-><init>(BLjava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    sput-object v0, La/fhn;->e:La/fhn;

    .line 32
    .line 33
    new-instance v0, La/fhn;

    .line 34
    .line 35
    const-string v3, "SHA224"

    .line 36
    .line 37
    invoke-direct {v0, v1, v3, v2}, La/fhn;-><init>(BLjava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    sput-object v0, La/fhn;->f:La/fhn;

    .line 41
    .line 42
    new-instance v0, La/fhn;

    .line 43
    .line 44
    const-string v3, "SHA256"

    .line 45
    .line 46
    invoke-direct {v0, v1, v3, v2}, La/fhn;-><init>(BLjava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/fhn;->g:La/fhn;

    .line 50
    .line 51
    new-instance v0, La/fhn;

    .line 52
    .line 53
    const-string v3, "SHA384"

    .line 54
    .line 55
    invoke-direct {v0, v1, v3, v2}, La/fhn;-><init>(BLjava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    sput-object v0, La/fhn;->h:La/fhn;

    .line 59
    .line 60
    new-instance v0, La/fhn;

    .line 61
    .line 62
    const-string v3, "SHA512"

    .line 63
    .line 64
    invoke-direct {v0, v1, v3, v2}, La/fhn;-><init>(BLjava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    sput-object v0, La/fhn;->i:La/fhn;

    .line 68
    .line 69
    new-instance v0, La/fhn;

    .line 70
    .line 71
    const/4 v1, 0x2

    .line 72
    const-string v3, "TINK"

    .line 73
    .line 74
    invoke-direct {v0, v1, v3, v2}, La/fhn;-><init>(BLjava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    sput-object v0, La/fhn;->j:La/fhn;

    .line 78
    .line 79
    new-instance v0, La/fhn;

    .line 80
    .line 81
    const-string v3, "CRUNCHY"

    .line 82
    .line 83
    invoke-direct {v0, v1, v3, v2}, La/fhn;-><init>(BLjava/lang/String;Z)V

    .line 84
    .line 85
    .line 86
    sput-object v0, La/fhn;->k:La/fhn;

    .line 87
    .line 88
    new-instance v0, La/fhn;

    .line 89
    .line 90
    const-string v3, "NO_PREFIX"

    .line 91
    .line 92
    invoke-direct {v0, v1, v3, v2}, La/fhn;-><init>(BLjava/lang/String;Z)V

    .line 93
    .line 94
    .line 95
    sput-object v0, La/fhn;->l:La/fhn;

    .line 96
    .line 97
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/fhn;->a:B

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-string v0, "identity"

    iput-object v0, p0, La/fhn;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(BLjava/lang/String;Z)V
    .locals 0

    .line 35
    iput-byte p1, p0, La/fhn;->a:B

    iput-object p2, p0, La/fhn;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;B)V
    .locals 1

    .line 1
    iput-byte p2, p0, La/fhn;->a:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/fhn;->b:Ljava/lang/String;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-gtz v0, :cond_1

    .line 26
    .line 27
    :cond_0
    move-object p1, p2

    .line 28
    :cond_1
    iput-object p1, p0, La/fhn;->b:Ljava/lang/String;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/lang/String;La/art;)V
    .locals 0

    const/4 p2, 0x4

    iput-byte p2, p0, La/fhn;->a:B

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, La/fhn;->b:Ljava/lang/String;

    return-void
.end method

.method public static c(La/yuu;La/z6j0;)V
    .locals 2

    .line 1
    iget-object v0, p1, La/z6j0;->a:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "X-CRASHLYTICS-GOOGLE-APP-ID"

    .line 6
    .line 7
    invoke-virtual {p0, v1, v0}, La/yuu;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const-string v0, "X-CRASHLYTICS-API-CLIENT-TYPE"

    .line 11
    .line 12
    const-string v1, "android"

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, La/yuu;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "X-CRASHLYTICS-API-CLIENT-VERSION"

    .line 18
    .line 19
    const-string v1, "20.1.1"

    .line 20
    .line 21
    invoke-virtual {p0, v0, v1}, La/yuu;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v0, "Accept"

    .line 25
    .line 26
    const-string v1, "application/json"

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, La/yuu;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "X-CRASHLYTICS-DEVICE-MODEL"

    .line 32
    .line 33
    iget-object v1, p1, La/z6j0;->b:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, La/yuu;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p1, La/z6j0;->c:Ljava/lang/String;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    const-string v1, "X-CRASHLYTICS-OS-BUILD-VERSION"

    .line 43
    .line 44
    invoke-virtual {p0, v1, v0}, La/yuu;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-object v0, p1, La/z6j0;->d:Ljava/lang/String;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    const-string v1, "X-CRASHLYTICS-OS-DISPLAY-VERSION"

    .line 52
    .line 53
    invoke-virtual {p0, v1, v0}, La/yuu;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    iget-object p1, p1, La/z6j0;->e:La/hxw;

    .line 57
    .line 58
    invoke-virtual {p1}, La/hxw;->c()La/b45;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object p1, p1, La/b45;->a:Ljava/lang/String;

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    const-string v0, "X-CRASHLYTICS-INSTALLATION-ID"

    .line 67
    .line 68
    invoke-virtual {p0, v0, p1}, La/yuu;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
.end method

.method public static f(Ljava/lang/String;)La/fhn;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    const-string v1, "cubic"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    new-instance v1, La/ehn;

    .line 16
    .line 17
    invoke-direct {v1, v0}, La/ehn;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_1
    const-string v1, "spline"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x3

    .line 28
    const/4 v3, -0x1

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x2

    .line 31
    const/16 v6, 0x2c

    .line 32
    .line 33
    const/4 v7, 0x1

    .line 34
    const/16 v8, 0x28

    .line 35
    .line 36
    if-eqz v1, :cond_5

    .line 37
    .line 38
    new-instance v1, La/wom0;

    .line 39
    .line 40
    invoke-direct {v1}, La/fhn;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, v1, La/fhn;->b:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    div-int/2addr v9, v5

    .line 50
    new-array v9, v9, [D

    .line 51
    .line 52
    invoke-virtual {v0, v8}, Ljava/lang/String;->indexOf(I)I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    add-int/2addr v8, v7

    .line 57
    invoke-virtual {v0, v6, v8}, Ljava/lang/String;->indexOf(II)I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    move v11, v4

    .line 62
    :goto_0
    if-eq v10, v3, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0, v8, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    add-int/lit8 v12, v11, 0x1

    .line 73
    .line 74
    invoke-static {v8}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 75
    .line 76
    .line 77
    move-result-wide v13

    .line 78
    aput-wide v13, v9, v11

    .line 79
    .line 80
    add-int/lit8 v8, v10, 0x1

    .line 81
    .line 82
    invoke-virtual {v0, v6, v8}, Ljava/lang/String;->indexOf(II)I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    move v11, v12

    .line 87
    goto :goto_0

    .line 88
    :cond_2
    const/16 v3, 0x29

    .line 89
    .line 90
    invoke-virtual {v0, v3, v8}, Ljava/lang/String;->indexOf(II)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-virtual {v0, v8, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    add-int/lit8 v3, v11, 0x1

    .line 103
    .line 104
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 105
    .line 106
    .line 107
    move-result-wide v12

    .line 108
    aput-wide v12, v9, v11

    .line 109
    .line 110
    invoke-static {v9, v3}, Ljava/util/Arrays;->copyOf([DI)[D

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    array-length v3, v0

    .line 115
    mul-int/2addr v3, v2

    .line 116
    sub-int/2addr v3, v5

    .line 117
    array-length v2, v0

    .line 118
    sub-int/2addr v2, v7

    .line 119
    int-to-double v8, v2

    .line 120
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 121
    .line 122
    div-double v8, v10, v8

    .line 123
    .line 124
    new-array v5, v5, [I

    .line 125
    .line 126
    aput v7, v5, v7

    .line 127
    .line 128
    aput v3, v5, v4

    .line 129
    .line 130
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 131
    .line 132
    invoke-static {v6, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    check-cast v5, [[D

    .line 137
    .line 138
    new-array v3, v3, [D

    .line 139
    .line 140
    move v6, v4

    .line 141
    :goto_1
    array-length v7, v0

    .line 142
    if-ge v6, v7, :cond_4

    .line 143
    .line 144
    aget-wide v12, v0, v6

    .line 145
    .line 146
    add-int v7, v6, v2

    .line 147
    .line 148
    aget-object v14, v5, v7

    .line 149
    .line 150
    aput-wide v12, v14, v4

    .line 151
    .line 152
    int-to-double v14, v6

    .line 153
    mul-double/2addr v14, v8

    .line 154
    aput-wide v14, v3, v7

    .line 155
    .line 156
    if-lez v6, :cond_3

    .line 157
    .line 158
    mul-int/lit8 v7, v2, 0x2

    .line 159
    .line 160
    add-int/2addr v7, v6

    .line 161
    aget-object v16, v5, v7

    .line 162
    .line 163
    add-double v17, v12, v10

    .line 164
    .line 165
    aput-wide v17, v16, v4

    .line 166
    .line 167
    add-double v16, v14, v10

    .line 168
    .line 169
    aput-wide v16, v3, v7

    .line 170
    .line 171
    add-int/lit8 v7, v6, -0x1

    .line 172
    .line 173
    aget-object v16, v5, v7

    .line 174
    .line 175
    sub-double/2addr v12, v10

    .line 176
    sub-double/2addr v12, v8

    .line 177
    aput-wide v12, v16, v4

    .line 178
    .line 179
    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    .line 180
    .line 181
    add-double/2addr v14, v12

    .line 182
    sub-double/2addr v14, v8

    .line 183
    aput-wide v14, v3, v7

    .line 184
    .line 185
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_4
    new-instance v0, La/pq40;

    .line 189
    .line 190
    invoke-direct {v0, v3, v5}, La/pq40;-><init>([D[[D)V

    .line 191
    .line 192
    .line 193
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 194
    .line 195
    new-instance v3, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    const-string v4, " 0 "

    .line 198
    .line 199
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    const-wide/16 v4, 0x0

    .line 203
    .line 204
    invoke-virtual {v0, v4, v5}, La/pq40;->O(D)D

    .line 205
    .line 206
    .line 207
    move-result-wide v4

    .line 208
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 219
    .line 220
    new-instance v3, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-string v4, " 1 "

    .line 223
    .line 224
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v10, v11}, La/pq40;->O(D)D

    .line 228
    .line 229
    .line 230
    move-result-wide v4

    .line 231
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    iput-object v0, v1, La/wom0;->m:La/pq40;

    .line 242
    .line 243
    return-object v1

    .line 244
    :cond_5
    const-string v1, "Schlick"

    .line 245
    .line 246
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_6

    .line 251
    .line 252
    new-instance v1, La/z2h0;

    .line 253
    .line 254
    invoke-direct {v1}, La/fhn;-><init>()V

    .line 255
    .line 256
    .line 257
    iput-object v0, v1, La/fhn;->b:Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual {v0, v8}, Ljava/lang/String;->indexOf(I)I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    invoke-virtual {v0, v6, v2}, Ljava/lang/String;->indexOf(II)I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    add-int/2addr v2, v7

    .line 268
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 277
    .line 278
    .line 279
    move-result-wide v4

    .line 280
    iput-wide v4, v1, La/z2h0;->m:D

    .line 281
    .line 282
    add-int/2addr v3, v7

    .line 283
    invoke-virtual {v0, v6, v3}, Ljava/lang/String;->indexOf(II)I

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 296
    .line 297
    .line 298
    move-result-wide v2

    .line 299
    iput-wide v2, v1, La/z2h0;->n:D

    .line 300
    .line 301
    return-object v1

    .line 302
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    sparse-switch v1, :sswitch_data_0

    .line 307
    .line 308
    .line 309
    :goto_2
    move v2, v3

    .line 310
    goto :goto_3

    .line 311
    :sswitch_0
    const-string v1, "standard"

    .line 312
    .line 313
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-nez v0, :cond_7

    .line 318
    .line 319
    goto :goto_2

    .line 320
    :cond_7
    const/4 v2, 0x5

    .line 321
    goto :goto_3

    .line 322
    :sswitch_1
    const-string v1, "overshoot"

    .line 323
    .line 324
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    if-nez v0, :cond_8

    .line 329
    .line 330
    goto :goto_2

    .line 331
    :cond_8
    const/4 v2, 0x4

    .line 332
    goto :goto_3

    .line 333
    :sswitch_2
    const-string v1, "linear"

    .line 334
    .line 335
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-nez v0, :cond_c

    .line 340
    .line 341
    goto :goto_2

    .line 342
    :sswitch_3
    const-string v1, "anticipate"

    .line 343
    .line 344
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    if-nez v0, :cond_9

    .line 349
    .line 350
    goto :goto_2

    .line 351
    :cond_9
    move v2, v5

    .line 352
    goto :goto_3

    .line 353
    :sswitch_4
    const-string v1, "decelerate"

    .line 354
    .line 355
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    if-nez v0, :cond_a

    .line 360
    .line 361
    goto :goto_2

    .line 362
    :cond_a
    move v2, v7

    .line 363
    goto :goto_3

    .line 364
    :sswitch_5
    const-string v1, "accelerate"

    .line 365
    .line 366
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    if-nez v0, :cond_b

    .line 371
    .line 372
    goto :goto_2

    .line 373
    :cond_b
    move v2, v4

    .line 374
    :cond_c
    :goto_3
    packed-switch v2, :pswitch_data_0

    .line 375
    .line 376
    .line 377
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 378
    .line 379
    new-instance v1, Ljava/lang/StringBuilder;

    .line 380
    .line 381
    const-string v2, "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or "

    .line 382
    .line 383
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    sget-object v2, La/fhn;->d:[Ljava/lang/String;

    .line 387
    .line 388
    invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    sget-object v0, La/fhn;->c:La/fhn;

    .line 403
    .line 404
    return-object v0

    .line 405
    :pswitch_0
    new-instance v0, La/ehn;

    .line 406
    .line 407
    const-string v1, "cubic(0.4, 0.0, 0.2, 1)"

    .line 408
    .line 409
    invoke-direct {v0, v1}, La/ehn;-><init>(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    return-object v0

    .line 413
    :pswitch_1
    new-instance v0, La/ehn;

    .line 414
    .line 415
    const-string v1, "cubic(0.34, 1.56, 0.64, 1)"

    .line 416
    .line 417
    invoke-direct {v0, v1}, La/ehn;-><init>(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    return-object v0

    .line 421
    :pswitch_2
    new-instance v0, La/ehn;

    .line 422
    .line 423
    const-string v1, "cubic(1, 1, 0, 0)"

    .line 424
    .line 425
    invoke-direct {v0, v1}, La/ehn;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    return-object v0

    .line 429
    :pswitch_3
    new-instance v0, La/ehn;

    .line 430
    .line 431
    const-string v1, "cubic(0.36, 0, 0.66, -0.56)"

    .line 432
    .line 433
    invoke-direct {v0, v1}, La/ehn;-><init>(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    return-object v0

    .line 437
    :pswitch_4
    new-instance v0, La/ehn;

    .line 438
    .line 439
    const-string v1, "cubic(0.0, 0.0, 0.2, 0.95)"

    .line 440
    .line 441
    invoke-direct {v0, v1}, La/ehn;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    return-object v0

    .line 445
    :pswitch_5
    new-instance v0, La/ehn;

    .line 446
    .line 447
    const-string v1, "cubic(0.4, 0.05, 0.8, 0.7)"

    .line 448
    .line 449
    invoke-direct {v0, v1}, La/ehn;-><init>(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    return-object v0

    .line 453
    :sswitch_data_0
    .sparse-switch
        -0x50bb8523 -> :sswitch_5
        -0x4b5653c4 -> :sswitch_4
        -0x47620096 -> :sswitch_3
        -0x41b970db -> :sswitch_2
        -0x2ca5d435 -> :sswitch_1
        0x4e3d1ebd -> :sswitch_0
    .end sparse-switch

    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g(La/z6j0;)Ljava/util/HashMap;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "build_version"

    .line 7
    .line 8
    iget-object v2, p0, La/z6j0;->h:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const-string v1, "display_version"

    .line 14
    .line 15
    iget-object v2, p0, La/z6j0;->g:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-byte v1, p0, La/z6j0;->i:B

    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "source"

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, La/z6j0;->f:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    const-string v1, "instance"

    .line 40
    .line 41
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;IILa/u0t0;)Z
    .locals 0

    .line 1
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, La/fhn;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    iget p0, p4, La/u0t0;->c:I

    .line 14
    .line 15
    and-int/lit8 p0, p0, 0x3

    .line 16
    .line 17
    or-int/lit8 p0, p0, 0x4

    .line 18
    .line 19
    iput p0, p4, La/u0t0;->c:I

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x1

    .line 24
    return p0
.end method

.method public b()Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
.end method

.method public d(D)D
    .locals 0

    .line 1
    return-wide p1
.end method

.method public e(D)D
    .locals 0

    .line 1
    const-wide/high16 p0, 0x3ff0000000000000L    # 1.0

    .line 2
    .line 3
    return-wide p0
.end method

.method public h(La/kge;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    iget-object p0, p0, La/fhn;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget v0, p1, La/kge;->a:I

    .line 4
    .line 5
    sget-object v1, La/rv00;->s:La/rv00;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "Settings response code was: "

    .line 10
    .line 11
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, La/rv00;->D(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/16 v2, 0xc8

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-eq v0, v2, :cond_2

    .line 28
    .line 29
    const/16 v2, 0xc9

    .line 30
    .line 31
    if-eq v0, v2, :cond_2

    .line 32
    .line 33
    const/16 v2, 0xca

    .line 34
    .line 35
    if-eq v0, v2, :cond_2

    .line 36
    .line 37
    const/16 v2, 0xcb

    .line 38
    .line 39
    if-ne v0, v2, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v2, "Settings request failed; (status: "

    .line 45
    .line 46
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ") from "

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const/4 p1, 0x6

    .line 65
    invoke-virtual {v1, p1}, La/rv00;->p(I)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    const-string p1, "FirebaseCrashlytics"

    .line 72
    .line 73
    invoke-static {p1, p0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 74
    .line 75
    .line 76
    :cond_1
    return-object v3

    .line 77
    :cond_2
    :goto_0
    iget-object p1, p1, La/kge;->b:Ljava/lang/String;

    .line 78
    .line 79
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 80
    .line 81
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :catch_0
    move-exception v0

    .line 86
    const-string v2, "Failed to parse settings JSON from "

    .line 87
    .line 88
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {v1, p0, v0}, La/rv00;->E(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 93
    .line 94
    .line 95
    new-instance p0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v0, "Settings response "

    .line 98
    .line 99
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {v1, p0, v3}, La/rv00;->E(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 110
    .line 111
    .line 112
    return-object v3
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fhn;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, La/fhn;->b:Ljava/lang/String;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_1
    iget-object p0, p0, La/fhn;->b:Ljava/lang/String;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_2
    iget-object p0, p0, La/fhn;->b:Ljava/lang/String;

    .line 18
    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
