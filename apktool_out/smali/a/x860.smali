.class public La/x860;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/l3u0;
.implements La/oju0;
.implements La/nae0;
.implements La/s1x0;
.implements La/mgn;


# static fields
.field public static final b:[F

.field public static final c:[F


# instance fields
.field public a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x27

    .line 2
    .line 3
    new-array v1, v0, [F

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, La/x860;->b:[F

    .line 9
    .line 10
    new-array v0, v0, [F

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v0, La/x860;->c:[F

    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x41200000    # 10.0f
        0x42c80000    # 100.0f
        0x447a0000    # 1000.0f
        0x461c4000    # 10000.0f
        0x47c35000    # 100000.0f
        0x49742400    # 1000000.0f
        0x4b189680    # 1.0E7f
        0x4cbebc20    # 1.0E8f
        0x4e6e6b28    # 1.0E9f
        0x501502f9    # 1.0E10f
        0x51ba43b7    # 1.0E11f
        0x5368d4a5    # 1.0E12f
        0x551184e7    # 1.0E13f
        0x56b5e621    # 1.0E14f
        0x58635fa9    # 1.0E15f
        0x5a0e1bca    # 1.0E16f
        0x5bb1a2bc    # 1.0E17f
        0x5d5e0b6b    # 1.0E18f
        0x5f0ac723    # 1.0E19f
        0x60ad78ec    # 1.0E20f
        0x6258d727    # 1.0E21f
        0x64078678    # 1.0E22f
        0x65a96816    # 1.0E23f
        0x6753c21c    # 1.0E24f
        0x69045951    # 1.0E25f
        0x6aa56fa6    # 1.0E26f
        0x6c4ecb8f    # 1.0E27f
        0x6e013f39    # 1.0E28f
        0x6fa18f08    # 1.0E29f
        0x7149f2ca    # 1.0E30f
        0x72fc6f7c    # 1.0E31f
        0x749dc5ae    # 1.0E32f
        0x76453719    # 1.0E33f
        0x77f684df    # 1.0E34f
        0x799a130c    # 1.0E35f
        0x7b4097ce    # 1.0E36f
        0x7cf0bdc2    # 1.0E37f
        0x7e967699    # 1.0E38f
    .end array-data

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3dcccccd    # 0.1f
        0x3c23d70a    # 0.01f
        0x3a83126f    # 0.001f
        0x38d1b717    # 1.0E-4f
        0x3727c5ac    # 1.0E-5f
        0x358637bd    # 1.0E-6f
        0x33d6bf95    # 1.0E-7f
        0x322bcc77    # 1.0E-8f
        0x3089705f    # 1.0E-9f
        0x2edbe6ff    # 1.0E-10f
        0x2d2febff    # 1.0E-11f
        0x2b8cbccc    # 1.0E-12f
        0x29e12e13    # 1.0E-13f
        0x283424dc    # 1.0E-14f
        0x26901d7d    # 1.0E-15f
        0x24e69595    # 1.0E-16f
        0x233877aa    # 1.0E-17f
        0x219392ef    # 1.0E-18f
        0x1fec1e4a    # 1.0E-19f
        0x1e3ce508    # 1.0E-20f
        0x1c971da0    # 1.0E-21f
        0x1af1c901    # 1.0E-22f
        0x19416d9a    # 1.0E-23f
        0x179abe15    # 1.0E-24f
        0x15f79688    # 1.0E-25f
        0x14461206    # 1.0E-26f
        0x129e74d2    # 1.0E-27f
        0x10fd87b6    # 1.0E-28f
        0xf4ad2f8    # 1.0E-29f
        0xda24260    # 1.0E-30f
        0xc01ceb3    # 1.0E-31f
        0xa4fb11f    # 1.0E-32f
        0x8a6274c    # 1.0E-33f
        0x704ec3d    # 1.0E-34f
        0x554ad2e    # 1.0E-35f
        0x3aa2425    # 1.0E-36f
        0x2081cea    # 1.0E-37f
        0x6ce3ee    # 1.0E-38f
    .end array-data
.end method

.method public constructor <init>(ILa/wz9;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/x860;->a:I

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 10
    iput p1, p0, La/x860;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(La/dmk;La/y78;)La/un00;
    .locals 6

    .line 1
    iget-object p1, p1, La/y78;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/io/IOException;

    .line 4
    .line 5
    instance-of v0, p1, La/ptw;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    check-cast p1, La/ptw;

    .line 11
    .line 12
    iget p1, p1, La/ptw;->c:I

    .line 13
    .line 14
    const/16 v0, 0x193

    .line 15
    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    const/16 v0, 0x194

    .line 19
    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    const/16 v0, 0x19a

    .line 23
    .line 24
    if-eq p1, v0, :cond_1

    .line 25
    .line 26
    const/16 v0, 0x1a0

    .line 27
    .line 28
    if-eq p1, v0, :cond_1

    .line 29
    .line 30
    const/16 v0, 0x1f4

    .line 31
    .line 32
    if-eq p1, v0, :cond_1

    .line 33
    .line 34
    const/16 v0, 0x1f7

    .line 35
    .line 36
    if-ne p1, v0, :cond_5

    .line 37
    .line 38
    :cond_1
    iget-boolean p1, p0, La/dmk;->e:Z

    .line 39
    .line 40
    const-wide/32 v0, 0xea60

    .line 41
    .line 42
    .line 43
    const-wide/32 v2, 0x493e0

    .line 44
    .line 45
    .line 46
    const/4 v4, 0x2

    .line 47
    const/4 v5, 0x1

    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0, v5}, La/dmk;->b(I)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    new-instance p0, La/un00;

    .line 57
    .line 58
    invoke-direct {p0, v5, v2, v3}, La/un00;-><init>(IJ)V

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_2
    invoke-virtual {p0, v4}, La/dmk;->b(I)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_5

    .line 67
    .line 68
    new-instance p0, La/un00;

    .line 69
    .line 70
    invoke-direct {p0, v4, v0, v1}, La/un00;-><init>(IJ)V

    .line 71
    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_3
    invoke-virtual {p0, v4}, La/dmk;->b(I)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_4

    .line 79
    .line 80
    new-instance p0, La/un00;

    .line 81
    .line 82
    invoke-direct {p0, v4, v0, v1}, La/un00;-><init>(IJ)V

    .line 83
    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_4
    invoke-virtual {p0, v5}, La/dmk;->b(I)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_5

    .line 91
    .line 92
    new-instance p0, La/un00;

    .line 93
    .line 94
    invoke-direct {p0, v5, v2, v3}, La/un00;-><init>(IJ)V

    .line 95
    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_5
    :goto_0
    const/4 p0, 0x0

    .line 99
    return-object p0
.end method

.method public static i()La/x860;
    .locals 15

    .line 1
    const-string v0, "Failed to get app version for libraryName: firebase-auth"

    .line 2
    .line 3
    const-string v1, "firebase-auth version is "

    .line 4
    .line 5
    new-instance v2, La/x860;

    .line 6
    .line 7
    sget-object v3, La/hkz;->c:La/hkz;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v4, La/hkz;->b:La/fhn;

    .line 13
    .line 14
    const-string v5, "LibraryVersion"

    .line 15
    .line 16
    const-string v6, "Please provide a valid libraryName"

    .line 17
    .line 18
    const-string v7, "firebase-auth"

    .line 19
    .line 20
    invoke-static {v7, v6}, La/s0x;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v3, v3, La/hkz;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    invoke-virtual {v3, v7}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    const/4 v8, 0x3

    .line 30
    const/4 v9, 0x2

    .line 31
    const-string v10, "UNKNOWN"

    .line 32
    .line 33
    if-eqz v6, :cond_0

    .line 34
    .line 35
    invoke-virtual {v3, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    goto/16 :goto_8

    .line 42
    .line 43
    :cond_0
    new-instance v6, Ljava/util/Properties;

    .line 44
    .line 45
    invoke-direct {v6}, Ljava/util/Properties;-><init>()V

    .line 46
    .line 47
    .line 48
    const/16 v11, 0x38

    .line 49
    .line 50
    const/4 v12, 0x0

    .line 51
    :try_start_0
    const-string v13, "/firebase-auth.properties"

    .line 52
    .line 53
    const-class v14, La/hkz;

    .line 54
    .line 55
    invoke-virtual {v14, v13}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 56
    .line 57
    .line 58
    move-result-object v13
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 59
    if-eqz v13, :cond_2

    .line 60
    .line 61
    :try_start_1
    invoke-virtual {v6, v13}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .line 62
    .line 63
    .line 64
    const-string v14, "version"

    .line 65
    .line 66
    invoke-virtual {v6, v14, v12}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v12

    .line 70
    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    const/16 v14, 0x19

    .line 79
    .line 80
    add-int/2addr v14, v6

    .line 81
    new-instance v6, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v6, v14}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {v5, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_6

    .line 104
    .line 105
    iget-object v6, v4, La/fhn;->b:Ljava/lang/String;

    .line 106
    .line 107
    if-nez v6, :cond_1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    :goto_0
    invoke-static {v5, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    goto :goto_5

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    goto :goto_2

    .line 120
    :catch_0
    move-exception v1

    .line 121
    move-object v6, v12

    .line 122
    move-object v12, v13

    .line 123
    goto :goto_3

    .line 124
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    const/4 v6, 0x5

    .line 140
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    if-eqz v6, :cond_6

    .line 145
    .line 146
    iget-object v6, v4, La/fhn;->b:Ljava/lang/String;

    .line 147
    .line 148
    if-nez v6, :cond_3

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    :goto_1
    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 156
    .line 157
    .line 158
    goto :goto_5

    .line 159
    :goto_2
    move-object v12, v13

    .line 160
    goto/16 :goto_b

    .line 161
    .line 162
    :catchall_1
    move-exception v0

    .line 163
    goto/16 :goto_b

    .line 164
    .line 165
    :catch_1
    move-exception v1

    .line 166
    move-object v6, v12

    .line 167
    :goto_3
    :try_start_2
    new-instance v13, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v13, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    const/4 v11, 0x6

    .line 183
    invoke-static {v5, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    if-eqz v11, :cond_5

    .line 188
    .line 189
    iget-object v11, v4, La/fhn;->b:Ljava/lang/String;

    .line 190
    .line 191
    if-nez v11, :cond_4

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_4
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    :goto_4
    invoke-static {v5, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 199
    .line 200
    .line 201
    :cond_5
    move-object v13, v12

    .line 202
    move-object v12, v6

    .line 203
    :cond_6
    :goto_5
    if-eqz v13, :cond_7

    .line 204
    .line 205
    :try_start_3
    invoke-interface {v13}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 206
    .line 207
    .line 208
    :catch_2
    :cond_7
    if-nez v12, :cond_a

    .line 209
    .line 210
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-static {v5, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-eqz v0, :cond_9

    .line 218
    .line 219
    iget-object v0, v4, La/fhn;->b:Ljava/lang/String;

    .line 220
    .line 221
    const-string v1, ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"

    .line 222
    .line 223
    if-nez v0, :cond_8

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_8
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    :goto_6
    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 231
    .line 232
    .line 233
    :cond_9
    move-object v0, v10

    .line 234
    goto :goto_7

    .line 235
    :cond_a
    move-object v0, v12

    .line 236
    :goto_7
    invoke-virtual {v3, v7, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    :goto_8
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-nez v1, :cond_b

    .line 244
    .line 245
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    if-eqz v1, :cond_c

    .line 250
    .line 251
    :cond_b
    const-string v0, "-1"

    .line 252
    .line 253
    :cond_c
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 254
    .line 255
    .line 256
    :try_start_4
    invoke-static {}, La/ikt0;->c()La/ikt0;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {v1, v0}, La/ikt0;->d(Ljava/lang/String;)Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    const/4 v4, 0x1

    .line 269
    if-ne v3, v4, :cond_d

    .line 270
    .line 271
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    goto :goto_a

    .line 276
    :catch_3
    move-exception v1

    .line 277
    goto :goto_9

    .line 278
    :cond_d
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    if-lt v3, v8, :cond_e

    .line 283
    .line 284
    const/4 v3, 0x0

    .line 285
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    check-cast v3, Ljava/lang/String;

    .line 290
    .line 291
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    const v5, 0xf4240

    .line 296
    .line 297
    .line 298
    mul-int/2addr v3, v5

    .line 299
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    check-cast v4, Ljava/lang/String;

    .line 304
    .line 305
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    mul-int/lit16 v4, v4, 0x3e8

    .line 310
    .line 311
    add-int/2addr v4, v3

    .line 312
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    check-cast v1, Ljava/lang/String;

    .line 317
    .line 318
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 319
    .line 320
    .line 321
    move-result v0
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_3

    .line 322
    add-int/2addr v0, v4

    .line 323
    goto :goto_a

    .line 324
    :goto_9
    const-string v3, "LibraryVersionContainer"

    .line 325
    .line 326
    invoke-static {v3, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    if-eqz v4, :cond_e

    .line 331
    .line 332
    const-string v4, "Version code parsing failed for: %s with exception %s."

    .line 333
    .line 334
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 343
    .line 344
    .line 345
    :cond_e
    const/4 v0, -0x1

    .line 346
    :goto_a
    iput v0, v2, La/x860;->a:I

    .line 347
    .line 348
    return-object v2

    .line 349
    :goto_b
    if-eqz v12, :cond_f

    .line 350
    .line 351
    :try_start_5
    invoke-interface {v12}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 352
    .line 353
    .line 354
    :catch_4
    :cond_f
    throw v0
.end method


# virtual methods
.method public a(I[B[B)[B
    .locals 4

    .line 1
    array-length v0, p3

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "ciphertext too short"

    .line 4
    .line 5
    if-lt v0, p1, :cond_2

    .line 6
    .line 7
    array-length v0, p2

    .line 8
    iget p0, p0, La/x860;->a:I

    .line 9
    .line 10
    if-ne v0, p0, :cond_1

    .line 11
    .line 12
    invoke-static {p2}, La/kvw0;->c([B)Ljavax/crypto/spec/SecretKeySpec;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    array-length p2, p3

    .line 17
    add-int/lit8 v0, p1, 0xc

    .line 18
    .line 19
    add-int/lit8 v3, p1, 0x1c

    .line 20
    .line 21
    if-lt p2, v3, :cond_0

    .line 22
    .line 23
    const/16 p2, 0xc

    .line 24
    .line 25
    invoke-static {p3, p1, p2}, La/kvw0;->a([BII)Ljava/security/spec/AlgorithmParameterSpec;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {}, La/kvw0;->b()Ljavax/crypto/Cipher;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const/4 v3, 0x2

    .line 34
    invoke-virtual {v2, v3, p0, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 35
    .line 36
    .line 37
    array-length p0, p3

    .line 38
    sub-int/2addr p0, p1

    .line 39
    sub-int/2addr p0, p2

    .line 40
    invoke-virtual {v2, p3, v0, p0}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_0
    invoke-static {v2}, La/hny;->o(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_1
    const-string p0, "invalid key size"

    .line 50
    .line 51
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_2
    invoke-static {v2}, La/hny;->o(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v1
.end method

.method public b(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/h6a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/h6a;

    .line 7
    .line 8
    iget v1, v0, La/h6a;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/h6a;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/h6a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/h6a;-><init>(La/x860;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/h6a;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/h6a;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget p1, p0, La/x860;->a:I

    .line 51
    .line 52
    if-lez p1, :cond_4

    .line 53
    .line 54
    sub-int/2addr p1, v3

    .line 55
    const/4 v2, 0x4

    .line 56
    if-le p1, v2, :cond_3

    .line 57
    .line 58
    move p1, v2

    .line 59
    :cond_3
    const-wide/16 v4, 0x7d0

    .line 60
    .line 61
    shl-long/2addr v4, p1

    .line 62
    iput v3, v0, La/h6a;->k:I

    .line 63
    .line 64
    invoke-static {v4, v5, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v1, :cond_4

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_4
    :goto_1
    iget p1, p0, La/x860;->a:I

    .line 72
    .line 73
    add-int/2addr p1, v3

    .line 74
    iput p1, p0, La/x860;->a:I

    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;Z)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public e(I)I
    .locals 1

    .line 1
    iget p0, p0, La/x860;->a:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-ne p0, v0, :cond_1

    .line 5
    .line 6
    const/4 p0, 0x7

    .line 7
    if-ne p1, p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x6

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x3

    .line 12
    :cond_1
    return p0
.end method

.method public f(La/y78;)J
    .locals 2

    .line 1
    iget-object p0, p1, La/y78;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/io/IOException;

    .line 4
    .line 5
    :goto_0
    if-eqz p0, :cond_2

    .line 6
    .line 7
    instance-of v0, p0, La/kq80;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    instance-of v0, p0, Ljava/io/FileNotFoundException;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    instance-of v0, p0, La/mtw;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    instance-of v0, p0, La/mq00;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    instance-of v0, p0, La/kbj;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    move-object v0, p0

    .line 28
    check-cast v0, La/kbj;

    .line 29
    .line 30
    iget v0, v0, La/kbj;->a:I

    .line 31
    .line 32
    const/16 v1, 0x7d8

    .line 33
    .line 34
    if-ne v0, v1, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    :goto_1
    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    return-wide p0

    .line 48
    :cond_2
    iget p0, p1, La/y78;->b:I

    .line 49
    .line 50
    add-int/lit8 p0, p0, -0x1

    .line 51
    .line 52
    mul-int/lit16 p0, p0, 0x3e8

    .line 53
    .line 54
    const/16 p1, 0x1388

    .line 55
    .line 56
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    int-to-long p0, p0

    .line 61
    return-wide p0
.end method

.method public g(Landroid/content/Context;Ljava/lang/String;)I
    .locals 0

    .line 1
    iget p0, p0, La/x860;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public h(IILjava/lang/String;)F
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iput v1, v0, La/x860;->a:I

    .line 10
    .line 11
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 12
    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    return v4

    .line 16
    :cond_0
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/16 v5, 0x2d

    .line 21
    .line 22
    const/16 v6, 0x2b

    .line 23
    .line 24
    const/4 v7, 0x1

    .line 25
    if-eq v1, v6, :cond_2

    .line 26
    .line 27
    if-eq v1, v5, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v1, v7

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const/4 v1, 0x0

    .line 34
    :goto_0
    iget v9, v0, La/x860;->a:I

    .line 35
    .line 36
    add-int/2addr v9, v7

    .line 37
    iput v9, v0, La/x860;->a:I

    .line 38
    .line 39
    :goto_1
    iget v9, v0, La/x860;->a:I

    .line 40
    .line 41
    move/from16 v17, v4

    .line 42
    .line 43
    move/from16 p1, v7

    .line 44
    .line 45
    const-wide/16 v7, 0x0

    .line 46
    .line 47
    const/4 v12, 0x0

    .line 48
    const/4 v13, 0x0

    .line 49
    const/4 v14, 0x0

    .line 50
    const/4 v15, 0x0

    .line 51
    const/16 v16, 0x0

    .line 52
    .line 53
    :goto_2
    iget v4, v0, La/x860;->a:I

    .line 54
    .line 55
    const-wide/16 v18, 0x0

    .line 56
    .line 57
    const/16 v10, 0x39

    .line 58
    .line 59
    const/16 v11, 0x30

    .line 60
    .line 61
    const-wide v20, 0xcccccccccccccccL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    if-ge v4, v2, :cond_b

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-ne v4, v11, :cond_4

    .line 73
    .line 74
    if-nez v12, :cond_3

    .line 75
    .line 76
    add-int/lit8 v14, v14, 0x1

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_3
    add-int/lit8 v13, v13, 0x1

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_4
    const/16 v11, 0x31

    .line 83
    .line 84
    if-lt v4, v11, :cond_8

    .line 85
    .line 86
    if-gt v4, v10, :cond_8

    .line 87
    .line 88
    add-int/2addr v12, v13

    .line 89
    :goto_3
    const-wide/16 v10, 0xa

    .line 90
    .line 91
    if-lez v13, :cond_6

    .line 92
    .line 93
    cmp-long v22, v7, v20

    .line 94
    .line 95
    if-lez v22, :cond_5

    .line 96
    .line 97
    return v17

    .line 98
    :cond_5
    mul-long/2addr v7, v10

    .line 99
    add-int/lit8 v13, v13, -0x1

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    cmp-long v20, v7, v20

    .line 103
    .line 104
    if-lez v20, :cond_7

    .line 105
    .line 106
    return v17

    .line 107
    :cond_7
    mul-long/2addr v7, v10

    .line 108
    add-int/lit8 v4, v4, -0x30

    .line 109
    .line 110
    int-to-long v10, v4

    .line 111
    add-long/2addr v7, v10

    .line 112
    add-int/lit8 v12, v12, 0x1

    .line 113
    .line 114
    cmp-long v4, v7, v18

    .line 115
    .line 116
    if-gez v4, :cond_a

    .line 117
    .line 118
    return v17

    .line 119
    :cond_8
    const/16 v11, 0x2e

    .line 120
    .line 121
    if-ne v4, v11, :cond_b

    .line 122
    .line 123
    if-eqz v15, :cond_9

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_9
    iget v4, v0, La/x860;->a:I

    .line 127
    .line 128
    sub-int v16, v4, v9

    .line 129
    .line 130
    move/from16 v15, p1

    .line 131
    .line 132
    :cond_a
    :goto_4
    iget v4, v0, La/x860;->a:I

    .line 133
    .line 134
    add-int/lit8 v4, v4, 0x1

    .line 135
    .line 136
    iput v4, v0, La/x860;->a:I

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_b
    :goto_5
    if-eqz v15, :cond_c

    .line 140
    .line 141
    iget v4, v0, La/x860;->a:I

    .line 142
    .line 143
    add-int/lit8 v9, v16, 0x1

    .line 144
    .line 145
    if-ne v4, v9, :cond_c

    .line 146
    .line 147
    return v17

    .line 148
    :cond_c
    if-nez v12, :cond_e

    .line 149
    .line 150
    if-nez v14, :cond_d

    .line 151
    .line 152
    return v17

    .line 153
    :cond_d
    move/from16 v12, p1

    .line 154
    .line 155
    :cond_e
    if-eqz v15, :cond_f

    .line 156
    .line 157
    sub-int v16, v16, v14

    .line 158
    .line 159
    sub-int v13, v16, v12

    .line 160
    .line 161
    :cond_f
    iget v4, v0, La/x860;->a:I

    .line 162
    .line 163
    if-ge v4, v2, :cond_18

    .line 164
    .line 165
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    const/16 v9, 0x45

    .line 170
    .line 171
    if-eq v4, v9, :cond_10

    .line 172
    .line 173
    const/16 v9, 0x65

    .line 174
    .line 175
    if-ne v4, v9, :cond_18

    .line 176
    .line 177
    :cond_10
    iget v4, v0, La/x860;->a:I

    .line 178
    .line 179
    add-int/lit8 v4, v4, 0x1

    .line 180
    .line 181
    iput v4, v0, La/x860;->a:I

    .line 182
    .line 183
    if-ne v4, v2, :cond_11

    .line 184
    .line 185
    return v17

    .line 186
    :cond_11
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-eq v4, v6, :cond_13

    .line 191
    .line 192
    if-eq v4, v5, :cond_12

    .line 193
    .line 194
    packed-switch v4, :pswitch_data_0

    .line 195
    .line 196
    .line 197
    iget v4, v0, La/x860;->a:I

    .line 198
    .line 199
    add-int/lit8 v4, v4, -0x1

    .line 200
    .line 201
    iput v4, v0, La/x860;->a:I

    .line 202
    .line 203
    move/from16 v5, p1

    .line 204
    .line 205
    const/4 v4, 0x0

    .line 206
    goto :goto_8

    .line 207
    :pswitch_0
    const/4 v4, 0x0

    .line 208
    :goto_6
    const/4 v5, 0x0

    .line 209
    goto :goto_8

    .line 210
    :cond_12
    move/from16 v4, p1

    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_13
    const/4 v4, 0x0

    .line 214
    :goto_7
    iget v5, v0, La/x860;->a:I

    .line 215
    .line 216
    add-int/lit8 v5, v5, 0x1

    .line 217
    .line 218
    iput v5, v0, La/x860;->a:I

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :goto_8
    if-nez v5, :cond_18

    .line 222
    .line 223
    iget v5, v0, La/x860;->a:I

    .line 224
    .line 225
    const/4 v6, 0x0

    .line 226
    :goto_9
    iget v9, v0, La/x860;->a:I

    .line 227
    .line 228
    if-ge v9, v2, :cond_15

    .line 229
    .line 230
    invoke-virtual {v3, v9}, Ljava/lang/String;->charAt(I)C

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    const/16 v11, 0x30

    .line 235
    .line 236
    if-lt v9, v11, :cond_15

    .line 237
    .line 238
    if-gt v9, v10, :cond_15

    .line 239
    .line 240
    int-to-long v14, v6

    .line 241
    cmp-long v14, v14, v20

    .line 242
    .line 243
    if-lez v14, :cond_14

    .line 244
    .line 245
    return v17

    .line 246
    :cond_14
    mul-int/lit8 v6, v6, 0xa

    .line 247
    .line 248
    add-int/lit8 v9, v9, -0x30

    .line 249
    .line 250
    add-int/2addr v6, v9

    .line 251
    iget v9, v0, La/x860;->a:I

    .line 252
    .line 253
    add-int/lit8 v9, v9, 0x1

    .line 254
    .line 255
    iput v9, v0, La/x860;->a:I

    .line 256
    .line 257
    goto :goto_9

    .line 258
    :cond_15
    iget v0, v0, La/x860;->a:I

    .line 259
    .line 260
    if-ne v0, v5, :cond_16

    .line 261
    .line 262
    return v17

    .line 263
    :cond_16
    if-eqz v4, :cond_17

    .line 264
    .line 265
    sub-int/2addr v13, v6

    .line 266
    goto :goto_a

    .line 267
    :cond_17
    add-int/2addr v13, v6

    .line 268
    :cond_18
    :goto_a
    add-int/2addr v12, v13

    .line 269
    const/16 v0, 0x27

    .line 270
    .line 271
    if-gt v12, v0, :cond_1e

    .line 272
    .line 273
    const/16 v0, -0x2c

    .line 274
    .line 275
    if-ge v12, v0, :cond_19

    .line 276
    .line 277
    goto :goto_d

    .line 278
    :cond_19
    long-to-float v0, v7

    .line 279
    cmp-long v2, v7, v18

    .line 280
    .line 281
    if-eqz v2, :cond_1c

    .line 282
    .line 283
    if-lez v13, :cond_1a

    .line 284
    .line 285
    sget-object v2, La/x860;->b:[F

    .line 286
    .line 287
    aget v2, v2, v13

    .line 288
    .line 289
    :goto_b
    mul-float/2addr v0, v2

    .line 290
    goto :goto_c

    .line 291
    :cond_1a
    if-gez v13, :cond_1c

    .line 292
    .line 293
    const/16 v2, -0x26

    .line 294
    .line 295
    if-ge v13, v2, :cond_1b

    .line 296
    .line 297
    float-to-double v2, v0

    .line 298
    const-wide v4, 0x3bc79ca10c924223L    # 1.0E-20

    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    mul-double/2addr v2, v4

    .line 304
    double-to-float v0, v2

    .line 305
    add-int/lit8 v13, v13, 0x14

    .line 306
    .line 307
    :cond_1b
    sget-object v2, La/x860;->c:[F

    .line 308
    .line 309
    neg-int v3, v13

    .line 310
    aget v2, v2, v3

    .line 311
    .line 312
    goto :goto_b

    .line 313
    :cond_1c
    :goto_c
    if-eqz v1, :cond_1d

    .line 314
    .line 315
    neg-float v0, v0

    .line 316
    :cond_1d
    return v0

    .line 317
    :cond_1e
    :goto_d
    return v17

    .line 318
    nop

    .line 319
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget p0, p0, La/x860;->a:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "X"

    .line 8
    .line 9
    invoke-static {v0, p0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, La/ays0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p2, La/ays0;->a:La/fx3;

    .line 10
    .line 11
    iget p0, p0, La/x860;->a:I

    .line 12
    .line 13
    invoke-virtual {p1, p0}, La/fx3;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public z0(La/ndy;F)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p1 .. p1}, La/ndy;->w()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    move v2, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v2, v4

    .line 19
    :goto_0
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual/range {p1 .. p1}, La/ndy;->a()V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_1
    invoke-virtual/range {p1 .. p1}, La/ndy;->l()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_2

    .line 29
    .line 30
    invoke-virtual/range {p1 .. p1}, La/ndy;->q()D

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    double-to-float v5, v5

    .line 35
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const/4 v6, 0x3

    .line 48
    const/4 v7, 0x2

    .line 49
    const/4 v8, 0x4

    .line 50
    if-ne v5, v8, :cond_3

    .line 51
    .line 52
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Ljava/lang/Float;

    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    const/high16 v9, 0x3f800000    # 1.0f

    .line 63
    .line 64
    cmpl-float v5, v5, v9

    .line 65
    .line 66
    if-nez v5, :cond_3

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v1, v4, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    check-cast v5, Ljava/lang/Float;

    .line 88
    .line 89
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    check-cast v5, Ljava/lang/Float;

    .line 97
    .line 98
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, Ljava/lang/Float;

    .line 106
    .line 107
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    iput v7, v0, La/x860;->a:I

    .line 111
    .line 112
    :cond_3
    if-eqz v2, :cond_4

    .line 113
    .line 114
    invoke-virtual/range {p1 .. p1}, La/ndy;->d()V

    .line 115
    .line 116
    .line 117
    :cond_4
    iget v2, v0, La/x860;->a:I

    .line 118
    .line 119
    const/4 v5, -0x1

    .line 120
    if-ne v2, v5, :cond_5

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    div-int/2addr v2, v8

    .line 127
    iput v2, v0, La/x860;->a:I

    .line 128
    .line 129
    :cond_5
    new-array v5, v2, [F

    .line 130
    .line 131
    new-array v9, v2, [I

    .line 132
    .line 133
    move v10, v4

    .line 134
    move v11, v10

    .line 135
    move v12, v11

    .line 136
    :goto_2
    iget v13, v0, La/x860;->a:I

    .line 137
    .line 138
    mul-int/2addr v13, v8

    .line 139
    if-ge v10, v13, :cond_b

    .line 140
    .line 141
    div-int/lit8 v13, v10, 0x4

    .line 142
    .line 143
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v14

    .line 147
    check-cast v14, Ljava/lang/Float;

    .line 148
    .line 149
    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    float-to-double v14, v14

    .line 154
    move/from16 p2, v4

    .line 155
    .line 156
    rem-int/lit8 v4, v10, 0x4

    .line 157
    .line 158
    if-eqz v4, :cond_9

    .line 159
    .line 160
    const-wide v16, 0x406fe00000000000L    # 255.0

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    if-eq v4, v3, :cond_8

    .line 166
    .line 167
    if-eq v4, v7, :cond_7

    .line 168
    .line 169
    if-eq v4, v6, :cond_6

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_6
    mul-double v14, v14, v16

    .line 173
    .line 174
    double-to-int v4, v14

    .line 175
    const/16 v14, 0xff

    .line 176
    .line 177
    invoke-static {v14, v11, v12, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    aput v4, v9, v13

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_7
    mul-double v14, v14, v16

    .line 185
    .line 186
    double-to-int v12, v14

    .line 187
    goto :goto_3

    .line 188
    :cond_8
    mul-double v14, v14, v16

    .line 189
    .line 190
    double-to-int v11, v14

    .line 191
    goto :goto_3

    .line 192
    :cond_9
    if-lez v13, :cond_a

    .line 193
    .line 194
    add-int/lit8 v4, v13, -0x1

    .line 195
    .line 196
    aget v4, v5, v4

    .line 197
    .line 198
    double-to-float v3, v14

    .line 199
    cmpl-float v4, v4, v3

    .line 200
    .line 201
    if-ltz v4, :cond_a

    .line 202
    .line 203
    const v4, 0x3c23d70a    # 0.01f

    .line 204
    .line 205
    .line 206
    add-float/2addr v3, v4

    .line 207
    aput v3, v5, v13

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_a
    double-to-float v3, v14

    .line 211
    aput v3, v5, v13

    .line 212
    .line 213
    :goto_3
    add-int/lit8 v10, v10, 0x1

    .line 214
    .line 215
    move/from16 v4, p2

    .line 216
    .line 217
    const/4 v3, 0x1

    .line 218
    goto :goto_2

    .line 219
    :cond_b
    move/from16 p2, v4

    .line 220
    .line 221
    new-instance v0, La/tbv;

    .line 222
    .line 223
    invoke-direct {v0, v5, v9}, La/tbv;-><init>([F[I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-gt v3, v13, :cond_c

    .line 231
    .line 232
    return-object v0

    .line 233
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    sub-int/2addr v3, v13

    .line 238
    div-int/2addr v3, v7

    .line 239
    new-array v4, v3, [F

    .line 240
    .line 241
    new-array v6, v3, [F

    .line 242
    .line 243
    move/from16 v8, p2

    .line 244
    .line 245
    :goto_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    if-ge v13, v10, :cond_e

    .line 250
    .line 251
    rem-int/lit8 v10, v13, 0x2

    .line 252
    .line 253
    if-nez v10, :cond_d

    .line 254
    .line 255
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v10

    .line 259
    check-cast v10, Ljava/lang/Float;

    .line 260
    .line 261
    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    .line 262
    .line 263
    .line 264
    move-result v10

    .line 265
    aput v10, v4, v8

    .line 266
    .line 267
    goto :goto_5

    .line 268
    :cond_d
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v10

    .line 272
    check-cast v10, Ljava/lang/Float;

    .line 273
    .line 274
    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    .line 275
    .line 276
    .line 277
    move-result v10

    .line 278
    aput v10, v6, v8

    .line 279
    .line 280
    add-int/lit8 v8, v8, 0x1

    .line 281
    .line 282
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_e
    iget-object v0, v0, La/tbv;->a:[F

    .line 286
    .line 287
    array-length v1, v0

    .line 288
    if-nez v1, :cond_f

    .line 289
    .line 290
    move-object v0, v4

    .line 291
    goto :goto_b

    .line 292
    :cond_f
    if-nez v3, :cond_10

    .line 293
    .line 294
    goto :goto_b

    .line 295
    :cond_10
    array-length v1, v0

    .line 296
    add-int/2addr v1, v3

    .line 297
    new-array v8, v1, [F

    .line 298
    .line 299
    move/from16 v10, p2

    .line 300
    .line 301
    move v11, v10

    .line 302
    move v12, v11

    .line 303
    move v13, v12

    .line 304
    :goto_6
    if-ge v10, v1, :cond_17

    .line 305
    .line 306
    array-length v14, v0

    .line 307
    const/high16 v15, 0x7fc00000    # Float.NaN

    .line 308
    .line 309
    if-ge v12, v14, :cond_11

    .line 310
    .line 311
    aget v14, v0, v12

    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_11
    move v14, v15

    .line 315
    :goto_7
    if-ge v13, v3, :cond_12

    .line 316
    .line 317
    aget v15, v4, v13

    .line 318
    .line 319
    :cond_12
    invoke-static {v15}, Ljava/lang/Float;->isNaN(F)Z

    .line 320
    .line 321
    .line 322
    move-result v17

    .line 323
    if-nez v17, :cond_16

    .line 324
    .line 325
    cmpg-float v17, v14, v15

    .line 326
    .line 327
    if-gez v17, :cond_13

    .line 328
    .line 329
    goto :goto_9

    .line 330
    :cond_13
    invoke-static {v14}, Ljava/lang/Float;->isNaN(F)Z

    .line 331
    .line 332
    .line 333
    move-result v17

    .line 334
    if-nez v17, :cond_15

    .line 335
    .line 336
    cmpg-float v17, v15, v14

    .line 337
    .line 338
    if-gez v17, :cond_14

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_14
    aput v14, v8, v10

    .line 342
    .line 343
    add-int/lit8 v12, v12, 0x1

    .line 344
    .line 345
    add-int/lit8 v13, v13, 0x1

    .line 346
    .line 347
    add-int/lit8 v11, v11, 0x1

    .line 348
    .line 349
    goto :goto_a

    .line 350
    :cond_15
    :goto_8
    aput v15, v8, v10

    .line 351
    .line 352
    add-int/lit8 v13, v13, 0x1

    .line 353
    .line 354
    goto :goto_a

    .line 355
    :cond_16
    :goto_9
    aput v14, v8, v10

    .line 356
    .line 357
    add-int/lit8 v12, v12, 0x1

    .line 358
    .line 359
    :goto_a
    add-int/lit8 v10, v10, 0x1

    .line 360
    .line 361
    goto :goto_6

    .line 362
    :cond_17
    if-nez v11, :cond_18

    .line 363
    .line 364
    move-object v0, v8

    .line 365
    goto :goto_b

    .line 366
    :cond_18
    sub-int/2addr v1, v11

    .line 367
    invoke-static {v8, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    :goto_b
    array-length v1, v0

    .line 372
    new-array v8, v1, [I

    .line 373
    .line 374
    move/from16 v10, p2

    .line 375
    .line 376
    :goto_c
    if-ge v10, v1, :cond_26

    .line 377
    .line 378
    aget v11, v0, v10

    .line 379
    .line 380
    invoke-static {v5, v11}, Ljava/util/Arrays;->binarySearch([FF)I

    .line 381
    .line 382
    .line 383
    move-result v12

    .line 384
    invoke-static {v4, v11}, Ljava/util/Arrays;->binarySearch([FF)I

    .line 385
    .line 386
    .line 387
    move-result v13

    .line 388
    const-string v15, "Unreachable code."

    .line 389
    .line 390
    const/high16 v17, 0x437f0000    # 255.0f

    .line 391
    .line 392
    if-ltz v12, :cond_19

    .line 393
    .line 394
    if-lez v13, :cond_1a

    .line 395
    .line 396
    :cond_19
    const/16 p0, 0x0

    .line 397
    .line 398
    goto :goto_12

    .line 399
    :cond_1a
    aget v12, v9, v12

    .line 400
    .line 401
    if-lt v3, v7, :cond_1f

    .line 402
    .line 403
    aget v13, v4, p2

    .line 404
    .line 405
    cmpg-float v13, v11, v13

    .line 406
    .line 407
    if-gtz v13, :cond_1b

    .line 408
    .line 409
    goto :goto_10

    .line 410
    :cond_1b
    const/4 v13, 0x1

    .line 411
    :goto_d
    if-ge v13, v3, :cond_1e

    .line 412
    .line 413
    aget v18, v4, v13

    .line 414
    .line 415
    cmpg-float v19, v18, v11

    .line 416
    .line 417
    if-gez v19, :cond_1c

    .line 418
    .line 419
    const/16 p0, 0x0

    .line 420
    .line 421
    add-int/lit8 v14, v3, -0x1

    .line 422
    .line 423
    if-eq v13, v14, :cond_1c

    .line 424
    .line 425
    add-int/lit8 v13, v13, 0x1

    .line 426
    .line 427
    goto :goto_d

    .line 428
    :cond_1c
    if-gtz v19, :cond_1d

    .line 429
    .line 430
    aget v11, v6, v13

    .line 431
    .line 432
    :goto_e
    mul-float v11, v11, v17

    .line 433
    .line 434
    float-to-int v11, v11

    .line 435
    goto :goto_f

    .line 436
    :cond_1d
    add-int/lit8 v14, v13, -0x1

    .line 437
    .line 438
    aget v15, v4, v14

    .line 439
    .line 440
    sub-float v18, v18, v15

    .line 441
    .line 442
    sub-float/2addr v11, v15

    .line 443
    div-float v11, v11, v18

    .line 444
    .line 445
    aget v14, v6, v14

    .line 446
    .line 447
    aget v13, v6, v13

    .line 448
    .line 449
    invoke-static {v14, v13, v11}, La/ah40;->f(FFF)F

    .line 450
    .line 451
    .line 452
    move-result v11

    .line 453
    goto :goto_e

    .line 454
    :goto_f
    invoke-static {v12}, Landroid/graphics/Color;->red(I)I

    .line 455
    .line 456
    .line 457
    move-result v13

    .line 458
    invoke-static {v12}, Landroid/graphics/Color;->green(I)I

    .line 459
    .line 460
    .line 461
    move-result v14

    .line 462
    invoke-static {v12}, Landroid/graphics/Color;->blue(I)I

    .line 463
    .line 464
    .line 465
    move-result v12

    .line 466
    invoke-static {v11, v13, v14, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 467
    .line 468
    .line 469
    move-result v11

    .line 470
    goto :goto_11

    .line 471
    :cond_1e
    const/16 p0, 0x0

    .line 472
    .line 473
    invoke-static {v15}, La/jf4;->o(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    return-object p0

    .line 477
    :cond_1f
    :goto_10
    aget v11, v6, p2

    .line 478
    .line 479
    mul-float v11, v11, v17

    .line 480
    .line 481
    float-to-int v11, v11

    .line 482
    invoke-static {v12}, Landroid/graphics/Color;->red(I)I

    .line 483
    .line 484
    .line 485
    move-result v13

    .line 486
    invoke-static {v12}, Landroid/graphics/Color;->green(I)I

    .line 487
    .line 488
    .line 489
    move-result v14

    .line 490
    invoke-static {v12}, Landroid/graphics/Color;->blue(I)I

    .line 491
    .line 492
    .line 493
    move-result v12

    .line 494
    invoke-static {v11, v13, v14, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 495
    .line 496
    .line 497
    move-result v11

    .line 498
    :goto_11
    aput v11, v8, v10

    .line 499
    .line 500
    goto/16 :goto_16

    .line 501
    .line 502
    :goto_12
    if-gez v13, :cond_20

    .line 503
    .line 504
    add-int/lit8 v13, v13, 0x1

    .line 505
    .line 506
    neg-int v13, v13

    .line 507
    :cond_20
    aget v12, v6, v13

    .line 508
    .line 509
    if-lt v2, v7, :cond_25

    .line 510
    .line 511
    aget v13, v5, p2

    .line 512
    .line 513
    cmpl-float v13, v11, v13

    .line 514
    .line 515
    if-nez v13, :cond_21

    .line 516
    .line 517
    goto :goto_14

    .line 518
    :cond_21
    const/4 v13, 0x1

    .line 519
    :goto_13
    if-ge v13, v2, :cond_24

    .line 520
    .line 521
    aget v14, v5, v13

    .line 522
    .line 523
    cmpg-float v18, v14, v11

    .line 524
    .line 525
    if-gez v18, :cond_22

    .line 526
    .line 527
    add-int/lit8 v7, v2, -0x1

    .line 528
    .line 529
    if-eq v13, v7, :cond_22

    .line 530
    .line 531
    add-int/lit8 v13, v13, 0x1

    .line 532
    .line 533
    const/4 v7, 0x2

    .line 534
    goto :goto_13

    .line 535
    :cond_22
    add-int/lit8 v7, v2, -0x1

    .line 536
    .line 537
    if-ne v13, v7, :cond_23

    .line 538
    .line 539
    cmpl-float v7, v11, v14

    .line 540
    .line 541
    if-ltz v7, :cond_23

    .line 542
    .line 543
    mul-float v12, v12, v17

    .line 544
    .line 545
    float-to-int v7, v12

    .line 546
    aget v11, v9, v13

    .line 547
    .line 548
    invoke-static {v11}, Landroid/graphics/Color;->red(I)I

    .line 549
    .line 550
    .line 551
    move-result v11

    .line 552
    aget v12, v9, v13

    .line 553
    .line 554
    invoke-static {v12}, Landroid/graphics/Color;->green(I)I

    .line 555
    .line 556
    .line 557
    move-result v12

    .line 558
    aget v13, v9, v13

    .line 559
    .line 560
    invoke-static {v13}, Landroid/graphics/Color;->blue(I)I

    .line 561
    .line 562
    .line 563
    move-result v13

    .line 564
    invoke-static {v7, v11, v12, v13}, Landroid/graphics/Color;->argb(IIII)I

    .line 565
    .line 566
    .line 567
    move-result v7

    .line 568
    goto :goto_15

    .line 569
    :cond_23
    add-int/lit8 v7, v13, -0x1

    .line 570
    .line 571
    aget v15, v5, v7

    .line 572
    .line 573
    sub-float/2addr v14, v15

    .line 574
    sub-float/2addr v11, v15

    .line 575
    div-float/2addr v11, v14

    .line 576
    aget v13, v9, v13

    .line 577
    .line 578
    aget v7, v9, v7

    .line 579
    .line 580
    invoke-static {v7, v11, v13}, La/mbc;->S(IFI)I

    .line 581
    .line 582
    .line 583
    move-result v7

    .line 584
    mul-float v12, v12, v17

    .line 585
    .line 586
    float-to-int v11, v12

    .line 587
    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    .line 588
    .line 589
    .line 590
    move-result v12

    .line 591
    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    .line 592
    .line 593
    .line 594
    move-result v13

    .line 595
    invoke-static {v7}, Landroid/graphics/Color;->blue(I)I

    .line 596
    .line 597
    .line 598
    move-result v7

    .line 599
    invoke-static {v11, v12, v13, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 600
    .line 601
    .line 602
    move-result v7

    .line 603
    goto :goto_15

    .line 604
    :cond_24
    invoke-static {v15}, La/jf4;->o(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    return-object p0

    .line 608
    :cond_25
    :goto_14
    aget v7, v9, p2

    .line 609
    .line 610
    :goto_15
    aput v7, v8, v10

    .line 611
    .line 612
    :goto_16
    add-int/lit8 v10, v10, 0x1

    .line 613
    .line 614
    const/4 v7, 0x2

    .line 615
    goto/16 :goto_c

    .line 616
    .line 617
    :cond_26
    new-instance v1, La/tbv;

    .line 618
    .line 619
    invoke-direct {v1, v0, v8}, La/tbv;-><init>([F[I)V

    .line 620
    .line 621
    .line 622
    return-object v1
.end method

.method public zza()I
    .locals 0

    .line 1
    iget p0, p0, La/x860;->a:I

    .line 2
    .line 3
    return p0
.end method
