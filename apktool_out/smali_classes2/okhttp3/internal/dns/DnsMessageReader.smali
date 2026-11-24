.class public final Lokhttp3/internal/dns/DnsMessageReader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lokhttp3/internal/dns/DnsMessageReader;",
        "",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:La/f99;

.field public final b:La/u99;


# direct methods
.method public constructor <init>(La/f99;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/internal/dns/DnsMessageReader;->a:La/f99;

    .line 5
    .line 6
    invoke-virtual {p1}, La/f99;->x()La/zae0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lokhttp3/internal/dns/DnsMessageReader;->b:La/u99;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Lokhttp3/internal/dns/DnsMessage;
    .locals 14

    .line 1
    iget-object v0, p0, Lokhttp3/internal/dns/DnsMessageReader;->b:La/u99;

    .line 2
    .line 3
    invoke-interface {v0}, La/u99;->readShort()S

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    invoke-interface {v0}, La/u99;->readShort()S

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-interface {v0}, La/u99;->readShort()S

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sget-object v4, La/q2t0;->b:La/p2t0;

    .line 16
    .line 17
    const v4, 0xffff

    .line 18
    .line 19
    .line 20
    and-int/2addr v1, v4

    .line 21
    invoke-interface {v0}, La/u99;->readShort()S

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    and-int/2addr v5, v4

    .line 26
    invoke-interface {v0}, La/u99;->readShort()S

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    and-int/2addr v6, v4

    .line 31
    invoke-interface {v0}, La/u99;->readShort()S

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    and-int/2addr v4, v7

    .line 36
    move v7, v4

    .line 37
    new-instance v4, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    move v9, v8

    .line 44
    :goto_0
    if-ge v9, v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lokhttp3/internal/dns/DnsMessageReader;->b(La/u99;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    invoke-interface {v0}, La/u99;->readShort()S

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    invoke-interface {v0}, La/u99;->readShort()S

    .line 55
    .line 56
    .line 57
    move-result v12

    .line 58
    new-instance v13, Lokhttp3/internal/dns/Question;

    .line 59
    .line 60
    invoke-direct {v13, v10, v11, v12}, Lokhttp3/internal/dns/Question;-><init>(Ljava/lang/String;II)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    add-int/lit8 v9, v9, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    move v9, v8

    .line 75
    :goto_1
    if-ge v9, v5, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Lokhttp3/internal/dns/DnsMessageReader;->c(La/u99;)Lokhttp3/internal/dns/ResourceRecord;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    if-nez v10, :cond_1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_1
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    :goto_2
    add-int/lit8 v9, v9, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    .line 94
    .line 95
    move v9, v8

    .line 96
    :goto_3
    if-ge v9, v6, :cond_4

    .line 97
    .line 98
    invoke-virtual {p0, v0}, Lokhttp3/internal/dns/DnsMessageReader;->c(La/u99;)Lokhttp3/internal/dns/ResourceRecord;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    if-nez v10, :cond_3

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_3
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    new-instance v6, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 114
    .line 115
    .line 116
    :goto_5
    if-ge v8, v7, :cond_6

    .line 117
    .line 118
    invoke-virtual {p0, v0}, Lokhttp3/internal/dns/DnsMessageReader;->c(La/u99;)Lokhttp3/internal/dns/ResourceRecord;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    if-nez v9, :cond_5

    .line 123
    .line 124
    goto :goto_6

    .line 125
    :cond_5
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_6
    invoke-interface {v0}, La/u99;->v0()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    sget-object v0, Lokhttp3/internal/_UtilJvmKt;->a:Ljava/util/TimeZone;

    .line 138
    .line 139
    :goto_7
    iget-object v0, p0, Lokhttp3/internal/dns/DnsMessageReader;->a:La/f99;

    .line 140
    .line 141
    invoke-virtual {v0}, La/f99;->v0()Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-nez v7, :cond_7

    .line 146
    .line 147
    iget-wide v7, v0, La/f99;->b:J

    .line 148
    .line 149
    invoke-virtual {v0, v7, v8}, La/f99;->skip(J)V

    .line 150
    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_7
    new-instance p0, Lokhttp3/internal/dns/DnsMessage;

    .line 154
    .line 155
    move-object v7, v6

    .line 156
    move-object v6, v5

    .line 157
    move-object v5, v1

    .line 158
    move-object v1, p0

    .line 159
    invoke-direct/range {v1 .. v7}, Lokhttp3/internal/dns/DnsMessage;-><init>(SILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 160
    .line 161
    .line 162
    return-object v1

    .line 163
    :cond_8
    const-string p0, "unexpected trailing data in message"

    .line 164
    .line 165
    invoke-static {p0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    const/4 p0, 0x0

    .line 169
    return-object p0
.end method

.method public final b(La/u99;)Ljava/lang/String;
    .locals 12

    .line 1
    new-instance v0, La/f99;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const v1, 0x7fffffff

    .line 7
    .line 8
    .line 9
    :cond_0
    :goto_0
    invoke-interface {p1}, La/u99;->readByte()B

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sget-object v3, La/p1t0;->b:La/o1t0;

    .line 14
    .line 15
    and-int/lit16 v3, v2, 0xc0

    .line 16
    .line 17
    and-int/lit8 v2, v2, 0x3f

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v3, :cond_4

    .line 21
    .line 22
    const/16 v5, 0x40

    .line 23
    .line 24
    if-eq v3, v5, :cond_3

    .line 25
    .line 26
    const/16 v5, 0x80

    .line 27
    .line 28
    if-eq v3, v5, :cond_3

    .line 29
    .line 30
    const/16 v5, 0xc0

    .line 31
    .line 32
    if-eq v3, v5, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    shl-int/lit8 v2, v2, 0x8

    .line 36
    .line 37
    invoke-interface {p1}, La/u99;->readByte()B

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    and-int/lit16 p1, p1, 0xff

    .line 42
    .line 43
    or-int/2addr p1, v2

    .line 44
    if-ge p1, v1, :cond_2

    .line 45
    .line 46
    iget-object v1, p0, Lokhttp3/internal/dns/DnsMessageReader;->a:La/f99;

    .line 47
    .line 48
    invoke-virtual {v1}, La/f99;->x()La/zae0;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    int-to-long v2, p1

    .line 53
    invoke-virtual {v1, v2, v3}, La/zae0;->skip(J)V

    .line 54
    .line 55
    .line 56
    move-object v11, v1

    .line 57
    move v1, p1

    .line 58
    move-object p1, v11

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    const-string p0, "malformed DNS message"

    .line 61
    .line 62
    invoke-static {p0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v4

    .line 66
    :cond_3
    const-string p0, "unsupported label type"

    .line 67
    .line 68
    invoke-static {p0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v4

    .line 72
    :cond_4
    if-nez v2, :cond_5

    .line 73
    .line 74
    invoke-virtual {v0}, La/f99;->O()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_5
    iget-wide v5, v0, La/f99;->b:J

    .line 80
    .line 81
    const-wide/16 v7, 0x0

    .line 82
    .line 83
    cmp-long v3, v5, v7

    .line 84
    .line 85
    if-lez v3, :cond_6

    .line 86
    .line 87
    const/16 v3, 0x2e

    .line 88
    .line 89
    invoke-virtual {v0, v3}, La/f99;->V(I)V

    .line 90
    .line 91
    .line 92
    :cond_6
    int-to-long v2, v2

    .line 93
    :goto_1
    cmp-long v5, v2, v7

    .line 94
    .line 95
    if-lez v5, :cond_0

    .line 96
    .line 97
    invoke-interface {p1, v0, v2, v3}, La/emk0;->Y(La/f99;J)J

    .line 98
    .line 99
    .line 100
    move-result-wide v5

    .line 101
    const-wide/16 v9, -0x1

    .line 102
    .line 103
    cmp-long v9, v5, v9

    .line 104
    .line 105
    if-eqz v9, :cond_7

    .line 106
    .line 107
    sub-long/2addr v2, v5

    .line 108
    goto :goto_1

    .line 109
    :cond_7
    invoke-static {}, La/c99;->f()V

    .line 110
    .line 111
    .line 112
    return-object v4
.end method

.method public final c(La/u99;)Lokhttp3/internal/dns/ResourceRecord;
    .locals 29

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p0 .. p1}, Lokhttp3/internal/dns/DnsMessageReader;->b(La/u99;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v0}, La/u99;->readShort()S

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-interface {v0}, La/u99;->readShort()S

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-interface {v0}, La/u99;->readInt()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-interface {v0}, La/u99;->readShort()S

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    sget-object v6, La/q2t0;->b:La/p2t0;

    .line 27
    .line 28
    int-to-long v5, v5

    .line 29
    const-wide/32 v7, 0xffff

    .line 30
    .line 31
    .line 32
    and-long/2addr v5, v7

    .line 33
    const/4 v9, 0x0

    .line 34
    const-string v10, "unexpected record length"

    .line 35
    .line 36
    const-wide/16 v11, 0x4

    .line 37
    .line 38
    const/4 v13, 0x1

    .line 39
    if-ne v3, v13, :cond_1

    .line 40
    .line 41
    if-ne v2, v13, :cond_1

    .line 42
    .line 43
    cmp-long v2, v5, v11

    .line 44
    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    invoke-interface {v0, v11, v12}, La/u99;->N(J)[B

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v2, Lokhttp3/internal/dns/ResourceRecord$IpAddress;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-direct {v2, v1, v0, v4}, Lokhttp3/internal/dns/ResourceRecord$IpAddress;-><init>(Ljava/lang/String;Ljava/net/InetAddress;I)V

    .line 61
    .line 62
    .line 63
    return-object v2

    .line 64
    :cond_0
    invoke-static {v10}, La/e9d0;->j(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v9

    .line 68
    :cond_1
    const-wide/16 v14, 0x10

    .line 69
    .line 70
    move-wide/from16 v16, v7

    .line 71
    .line 72
    if-ne v3, v13, :cond_3

    .line 73
    .line 74
    const/16 v7, 0x1c

    .line 75
    .line 76
    if-ne v2, v7, :cond_3

    .line 77
    .line 78
    cmp-long v2, v5, v14

    .line 79
    .line 80
    if-nez v2, :cond_2

    .line 81
    .line 82
    invoke-interface {v0, v14, v15}, La/u99;->N(J)[B

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v2, Lokhttp3/internal/dns/ResourceRecord$IpAddress;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-direct {v2, v1, v0, v4}, Lokhttp3/internal/dns/ResourceRecord$IpAddress;-><init>(Ljava/lang/String;Ljava/net/InetAddress;I)V

    .line 96
    .line 97
    .line 98
    return-object v2

    .line 99
    :cond_2
    invoke-static {v10}, La/e9d0;->j(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v9

    .line 103
    :cond_3
    if-ne v3, v13, :cond_1e

    .line 104
    .line 105
    const/16 v3, 0x41

    .line 106
    .line 107
    if-ne v2, v3, :cond_1e

    .line 108
    .line 109
    new-instance v2, La/jrz;

    .line 110
    .line 111
    const/4 v3, 0x0

    .line 112
    invoke-direct {v2, v0, v5, v6, v3}, La/jrz;-><init>(La/emk0;JZ)V

    .line 113
    .line 114
    .line 115
    new-instance v0, La/zae0;

    .line 116
    .line 117
    invoke-direct {v0, v2}, La/zae0;-><init>(La/emk0;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, La/zae0;->readShort()S

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    move-object/from16 v5, p0

    .line 125
    .line 126
    invoke-virtual {v5, v0}, Lokhttp3/internal/dns/DnsMessageReader;->b(La/u99;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    const/4 v6, -0x1

    .line 131
    const/16 v7, 0x1bb

    .line 132
    .line 133
    move v8, v2

    .line 134
    move v2, v4

    .line 135
    move-object v4, v5

    .line 136
    move-object v5, v9

    .line 137
    move-object v10, v5

    .line 138
    move-object/from16 v18, v10

    .line 139
    .line 140
    :goto_0
    invoke-virtual {v0}, La/zae0;->v0()Z

    .line 141
    .line 142
    .line 143
    move-result v19

    .line 144
    const-string v20, "malformed HTTPS / no-default-alpn"

    .line 145
    .line 146
    const v21, 0xffff

    .line 147
    .line 148
    .line 149
    if-nez v19, :cond_19

    .line 150
    .line 151
    invoke-virtual {v0}, La/zae0;->readShort()S

    .line 152
    .line 153
    .line 154
    move-result v19

    .line 155
    move-object/from16 v22, v9

    .line 156
    .line 157
    and-int v9, v19, v21

    .line 158
    .line 159
    if-le v9, v6, :cond_18

    .line 160
    .line 161
    invoke-virtual {v0}, La/zae0;->readShort()S

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    move-wide/from16 v23, v11

    .line 166
    .line 167
    int-to-long v11, v6

    .line 168
    and-long v11, v11, v16

    .line 169
    .line 170
    move-wide/from16 v25, v14

    .line 171
    .line 172
    const-wide/16 v13, 0x2

    .line 173
    .line 174
    const-wide/16 v27, 0x0

    .line 175
    .line 176
    packed-switch v9, :pswitch_data_0

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v11, v12}, La/zae0;->skip(J)V

    .line 180
    .line 181
    .line 182
    move-object/from16 p1, v0

    .line 183
    .line 184
    move-object v15, v1

    .line 185
    move/from16 p0, v2

    .line 186
    .line 187
    goto/16 :goto_8

    .line 188
    .line 189
    :pswitch_0
    if-nez v10, :cond_4

    .line 190
    .line 191
    new-instance v6, Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 194
    .line 195
    .line 196
    move-object v10, v6

    .line 197
    :cond_4
    rem-long v13, v11, v25

    .line 198
    .line 199
    cmp-long v6, v13, v27

    .line 200
    .line 201
    if-nez v6, :cond_9

    .line 202
    .line 203
    invoke-static {v11, v12}, La/l1e0;->n(J)La/r710;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    move-wide/from16 v11, v25

    .line 208
    .line 209
    invoke-static {v6, v11, v12}, La/l1e0;->l(La/r710;J)La/o710;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    iget-wide v11, v6, La/o710;->a:J

    .line 214
    .line 215
    iget-wide v13, v6, La/o710;->b:J

    .line 216
    .line 217
    move-object v15, v1

    .line 218
    move/from16 p0, v2

    .line 219
    .line 220
    iget-wide v1, v6, La/o710;->c:J

    .line 221
    .line 222
    cmp-long v6, v1, v27

    .line 223
    .line 224
    if-lez v6, :cond_5

    .line 225
    .line 226
    cmp-long v20, v11, v13

    .line 227
    .line 228
    if-lez v20, :cond_6

    .line 229
    .line 230
    :cond_5
    if-gez v6, :cond_7

    .line 231
    .line 232
    cmp-long v6, v13, v11

    .line 233
    .line 234
    if-gtz v6, :cond_7

    .line 235
    .line 236
    :cond_6
    move-wide/from16 v20, v13

    .line 237
    .line 238
    const-wide/16 v13, 0x10

    .line 239
    .line 240
    :goto_1
    invoke-virtual {v0, v13, v14}, La/zae0;->N(J)[B

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    invoke-static {v6}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    invoke-interface {v10, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    cmp-long v6, v11, v20

    .line 252
    .line 253
    if-eqz v6, :cond_8

    .line 254
    .line 255
    add-long/2addr v11, v1

    .line 256
    goto :goto_1

    .line 257
    :cond_7
    const-wide/16 v13, 0x10

    .line 258
    .line 259
    :cond_8
    move/from16 v2, p0

    .line 260
    .line 261
    move v6, v9

    .line 262
    move-object v1, v15

    .line 263
    :goto_2
    move-object/from16 v9, v22

    .line 264
    .line 265
    move-wide/from16 v11, v23

    .line 266
    .line 267
    move-wide v14, v13

    .line 268
    const/4 v13, 0x1

    .line 269
    goto/16 :goto_0

    .line 270
    .line 271
    :cond_9
    const-string v0, "malformed HTTPS / ipv6hint"

    .line 272
    .line 273
    invoke-static {v0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    return-object v22

    .line 277
    :pswitch_1
    move-object v15, v1

    .line 278
    move/from16 p0, v2

    .line 279
    .line 280
    move-wide/from16 v13, v25

    .line 281
    .line 282
    invoke-virtual {v0, v11, v12}, La/zae0;->q0(J)La/qg9;

    .line 283
    .line 284
    .line 285
    move-result-object v18

    .line 286
    move v6, v9

    .line 287
    goto :goto_2

    .line 288
    :pswitch_2
    move-object v15, v1

    .line 289
    move/from16 p0, v2

    .line 290
    .line 291
    move-wide/from16 v13, v25

    .line 292
    .line 293
    new-instance v10, Ljava/util/ArrayList;

    .line 294
    .line 295
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 296
    .line 297
    .line 298
    rem-long v1, v11, v23

    .line 299
    .line 300
    cmp-long v1, v1, v27

    .line 301
    .line 302
    if-nez v1, :cond_e

    .line 303
    .line 304
    invoke-static {v11, v12}, La/l1e0;->n(J)La/r710;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    move-wide/from16 v11, v23

    .line 309
    .line 310
    invoke-static {v1, v11, v12}, La/l1e0;->l(La/r710;J)La/o710;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    iget-wide v11, v1, La/o710;->a:J

    .line 315
    .line 316
    iget-wide v13, v1, La/o710;->b:J

    .line 317
    .line 318
    iget-wide v1, v1, La/o710;->c:J

    .line 319
    .line 320
    cmp-long v6, v1, v27

    .line 321
    .line 322
    if-lez v6, :cond_a

    .line 323
    .line 324
    cmp-long v20, v11, v13

    .line 325
    .line 326
    if-lez v20, :cond_b

    .line 327
    .line 328
    :cond_a
    if-gez v6, :cond_c

    .line 329
    .line 330
    cmp-long v6, v13, v11

    .line 331
    .line 332
    if-gtz v6, :cond_c

    .line 333
    .line 334
    :cond_b
    move-wide/from16 v20, v1

    .line 335
    .line 336
    const-wide/16 v1, 0x4

    .line 337
    .line 338
    :goto_3
    invoke-virtual {v0, v1, v2}, La/zae0;->N(J)[B

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    invoke-static {v6}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    cmp-long v6, v11, v13

    .line 350
    .line 351
    if-eqz v6, :cond_d

    .line 352
    .line 353
    add-long v11, v11, v20

    .line 354
    .line 355
    goto :goto_3

    .line 356
    :cond_c
    const-wide/16 v1, 0x4

    .line 357
    .line 358
    :cond_d
    :goto_4
    move-wide v11, v1

    .line 359
    move v6, v9

    .line 360
    move-object v1, v15

    .line 361
    move-object/from16 v9, v22

    .line 362
    .line 363
    :goto_5
    const/4 v13, 0x1

    .line 364
    const-wide/16 v14, 0x10

    .line 365
    .line 366
    move/from16 v2, p0

    .line 367
    .line 368
    goto/16 :goto_0

    .line 369
    .line 370
    :cond_e
    const-string v0, "malformed HTTPS / ipv4hint"

    .line 371
    .line 372
    invoke-static {v0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    return-object v22

    .line 376
    :pswitch_3
    move-object v15, v1

    .line 377
    move/from16 p0, v2

    .line 378
    .line 379
    move-wide/from16 v1, v23

    .line 380
    .line 381
    cmp-long v6, v11, v13

    .line 382
    .line 383
    if-nez v6, :cond_f

    .line 384
    .line 385
    invoke-virtual {v0}, La/zae0;->readShort()S

    .line 386
    .line 387
    .line 388
    move-result v6

    .line 389
    and-int v7, v6, v21

    .line 390
    .line 391
    goto :goto_4

    .line 392
    :cond_f
    const-string v0, "malformed HTTPS / port"

    .line 393
    .line 394
    invoke-static {v0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    return-object v22

    .line 398
    :pswitch_4
    move-object v15, v1

    .line 399
    move/from16 p0, v2

    .line 400
    .line 401
    move-wide/from16 v1, v23

    .line 402
    .line 403
    cmp-long v3, v11, v27

    .line 404
    .line 405
    if-nez v3, :cond_10

    .line 406
    .line 407
    move-wide v11, v1

    .line 408
    move v6, v9

    .line 409
    move-object v1, v15

    .line 410
    move-object/from16 v9, v22

    .line 411
    .line 412
    const/4 v3, 0x1

    .line 413
    goto :goto_5

    .line 414
    :cond_10
    invoke-static/range {v20 .. v20}, La/e9d0;->j(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    return-object v22

    .line 418
    :pswitch_5
    move-object v15, v1

    .line 419
    move/from16 p0, v2

    .line 420
    .line 421
    move-wide/from16 v1, v23

    .line 422
    .line 423
    new-instance v5, Ljava/util/ArrayList;

    .line 424
    .line 425
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 426
    .line 427
    .line 428
    :goto_6
    cmp-long v6, v27, v11

    .line 429
    .line 430
    if-gez v6, :cond_d

    .line 431
    .line 432
    invoke-virtual {v0}, La/zae0;->readByte()B

    .line 433
    .line 434
    .line 435
    move-result v6

    .line 436
    sget-object v13, La/p1t0;->b:La/o1t0;

    .line 437
    .line 438
    int-to-long v13, v6

    .line 439
    const-wide/16 v20, 0xff

    .line 440
    .line 441
    and-long v13, v13, v20

    .line 442
    .line 443
    const-wide/16 v20, 0x1

    .line 444
    .line 445
    add-long v27, v27, v20

    .line 446
    .line 447
    add-long v27, v27, v13

    .line 448
    .line 449
    cmp-long v6, v27, v11

    .line 450
    .line 451
    if-gtz v6, :cond_11

    .line 452
    .line 453
    invoke-virtual {v0, v13, v14}, La/zae0;->n(J)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    goto :goto_6

    .line 461
    :cond_11
    const-string v0, "malformed HTTPS / alpn"

    .line 462
    .line 463
    invoke-static {v0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    return-object v22

    .line 467
    :pswitch_6
    move-object v15, v1

    .line 468
    move/from16 p0, v2

    .line 469
    .line 470
    move-wide/from16 v1, v23

    .line 471
    .line 472
    rem-long v23, v11, v13

    .line 473
    .line 474
    cmp-long v6, v23, v27

    .line 475
    .line 476
    if-nez v6, :cond_17

    .line 477
    .line 478
    invoke-static {v11, v12}, La/l1e0;->n(J)La/r710;

    .line 479
    .line 480
    .line 481
    move-result-object v6

    .line 482
    invoke-static {v6, v13, v14}, La/l1e0;->l(La/r710;J)La/o710;

    .line 483
    .line 484
    .line 485
    move-result-object v6

    .line 486
    iget-wide v11, v6, La/o710;->a:J

    .line 487
    .line 488
    iget-wide v13, v6, La/o710;->b:J

    .line 489
    .line 490
    iget-wide v1, v6, La/o710;->c:J

    .line 491
    .line 492
    cmp-long v6, v1, v27

    .line 493
    .line 494
    if-lez v6, :cond_12

    .line 495
    .line 496
    cmp-long v20, v11, v13

    .line 497
    .line 498
    if-lez v20, :cond_13

    .line 499
    .line 500
    :cond_12
    if-gez v6, :cond_15

    .line 501
    .line 502
    cmp-long v6, v13, v11

    .line 503
    .line 504
    if-gtz v6, :cond_15

    .line 505
    .line 506
    :cond_13
    :goto_7
    invoke-virtual {v0}, La/zae0;->readShort()S

    .line 507
    .line 508
    .line 509
    move-result v6

    .line 510
    and-int v6, v6, v21

    .line 511
    .line 512
    if-ltz v6, :cond_14

    .line 513
    .line 514
    move-object/from16 p1, v0

    .line 515
    .line 516
    const/4 v0, 0x7

    .line 517
    if-ge v6, v0, :cond_14

    .line 518
    .line 519
    cmp-long v0, v11, v13

    .line 520
    .line 521
    if-eqz v0, :cond_16

    .line 522
    .line 523
    add-long/2addr v11, v1

    .line 524
    move-object/from16 v0, p1

    .line 525
    .line 526
    goto :goto_7

    .line 527
    :cond_14
    new-instance v0, Ljava/net/ProtocolException;

    .line 528
    .line 529
    const-string v1, "unsupported HTTPS mandatory parameter "

    .line 530
    .line 531
    invoke-static {v6, v1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    throw v0

    .line 539
    :cond_15
    move-object/from16 p1, v0

    .line 540
    .line 541
    :cond_16
    :goto_8
    move/from16 v2, p0

    .line 542
    .line 543
    move-object/from16 v0, p1

    .line 544
    .line 545
    move v6, v9

    .line 546
    move-object v1, v15

    .line 547
    move-object/from16 v9, v22

    .line 548
    .line 549
    const-wide/16 v11, 0x4

    .line 550
    .line 551
    const/4 v13, 0x1

    .line 552
    const-wide/16 v14, 0x10

    .line 553
    .line 554
    goto/16 :goto_0

    .line 555
    .line 556
    :cond_17
    const-string v0, "malformed HTTPS / mandatory"

    .line 557
    .line 558
    invoke-static {v0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    return-object v22

    .line 562
    :cond_18
    const-string v0, "malformed HTTPS resource record"

    .line 563
    .line 564
    invoke-static {v0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    return-object v22

    .line 568
    :cond_19
    move-object v15, v1

    .line 569
    move/from16 p0, v2

    .line 570
    .line 571
    move-object/from16 v22, v9

    .line 572
    .line 573
    if-eqz v3, :cond_1b

    .line 574
    .line 575
    if-eqz v5, :cond_1a

    .line 576
    .line 577
    goto :goto_9

    .line 578
    :cond_1a
    invoke-static/range {v20 .. v20}, La/e9d0;->j(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    return-object v22

    .line 582
    :cond_1b
    if-eqz v5, :cond_1c

    .line 583
    .line 584
    sget-object v0, Lokhttp3/Protocol;->b:Lokhttp3/Protocol$Companion;

    .line 585
    .line 586
    const-string v0, "http/1.1"

    .line 587
    .line 588
    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v1

    .line 592
    if-nez v1, :cond_1c

    .line 593
    .line 594
    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    :cond_1c
    :goto_9
    new-instance v0, Lokhttp3/internal/dns/ResourceRecord$Https;

    .line 598
    .line 599
    and-int v3, v8, v21

    .line 600
    .line 601
    if-nez v10, :cond_1d

    .line 602
    .line 603
    sget-object v10, La/iun;->a:La/iun;

    .line 604
    .line 605
    :cond_1d
    move/from16 v2, p0

    .line 606
    .line 607
    move v6, v7

    .line 608
    move-object v7, v10

    .line 609
    move-object v1, v15

    .line 610
    move-object/from16 v8, v18

    .line 611
    .line 612
    invoke-direct/range {v0 .. v8}, Lokhttp3/internal/dns/ResourceRecord$Https;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/util/ArrayList;ILjava/util/List;La/qg9;)V

    .line 613
    .line 614
    .line 615
    return-object v0

    .line 616
    :cond_1e
    move-object/from16 v22, v9

    .line 617
    .line 618
    invoke-interface {v0, v5, v6}, La/u99;->skip(J)V

    .line 619
    .line 620
    .line 621
    return-object v22

    .line 622
    nop

    .line 623
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
