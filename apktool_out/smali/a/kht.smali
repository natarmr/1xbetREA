.class public final synthetic La/kht;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/kht;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/kht;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/kht;->a:La/kht;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.coupon.impl.generate_coupon.data.model.GenerateCouponRequest"

    .line 11
    .line 12
    const/16 v3, 0xc

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "BetSize"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "CfView"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "CouponTypes"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "EventTypes"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "Sports"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "Lng"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "Partner"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "Payout"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "TimeFilter"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "UserId"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "UserIdBonus"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "Country"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    sput-object v1, La/kht;->descriptor:La/ugi0;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 5

    .line 1
    sget-object p0, La/mht;->m:[La/a8z;

    .line 2
    .line 3
    const/16 v0, 0xc

    .line 4
    .line 5
    new-array v0, v0, [La/jiy;

    .line 6
    .line 7
    sget-object v1, La/tbl;->a:La/tbl;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v1, v0, v2

    .line 11
    .line 12
    sget-object v2, La/okx;->a:La/okx;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    aput-object v2, v0, v3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    aget-object v4, p0, v3

    .line 19
    .line 20
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    aput-object v4, v0, v3

    .line 25
    .line 26
    const/4 v3, 0x3

    .line 27
    aget-object v4, p0, v3

    .line 28
    .line 29
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    aput-object v4, v0, v3

    .line 34
    .line 35
    const/4 v3, 0x4

    .line 36
    aget-object p0, p0, v3

    .line 37
    .line 38
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    aput-object p0, v0, v3

    .line 43
    .line 44
    sget-object p0, La/ysm0;->a:La/ysm0;

    .line 45
    .line 46
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const/4 v3, 0x5

    .line 51
    aput-object p0, v0, v3

    .line 52
    .line 53
    const/4 p0, 0x6

    .line 54
    aput-object v2, v0, p0

    .line 55
    .line 56
    const/4 p0, 0x7

    .line 57
    aput-object v1, v0, p0

    .line 58
    .line 59
    const/16 p0, 0x8

    .line 60
    .line 61
    aput-object v2, v0, p0

    .line 62
    .line 63
    sget-object p0, La/s710;->a:La/s710;

    .line 64
    .line 65
    const/16 v1, 0x9

    .line 66
    .line 67
    aput-object p0, v0, v1

    .line 68
    .line 69
    const/16 v1, 0xa

    .line 70
    .line 71
    aput-object p0, v0, v1

    .line 72
    .line 73
    const/16 p0, 0xb

    .line 74
    .line 75
    aput-object v2, v0, p0

    .line 76
    .line 77
    return-object v0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 28

    .line 1
    sget-object v0, La/kht;->descriptor:La/ugi0;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, La/mht;->m:[La/a8z;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const-wide/16 v5, 0x0

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const-wide/16 v8, 0x0

    .line 17
    .line 18
    move v11, v4

    .line 19
    move v14, v11

    .line 20
    move/from16 v19, v14

    .line 21
    .line 22
    move/from16 v22, v19

    .line 23
    .line 24
    move/from16 v27, v22

    .line 25
    .line 26
    move-wide v12, v5

    .line 27
    move-wide/from16 v20, v12

    .line 28
    .line 29
    move-object v6, v7

    .line 30
    move-object v15, v6

    .line 31
    move-wide/from16 v23, v8

    .line 32
    .line 33
    move-wide/from16 v25, v23

    .line 34
    .line 35
    move v5, v3

    .line 36
    move-object v8, v15

    .line 37
    move-object v9, v8

    .line 38
    :goto_0
    if-eqz v5, :cond_0

    .line 39
    .line 40
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    packed-switch v10, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    invoke-static {v10}, La/itt0;->c(I)V

    .line 48
    .line 49
    .line 50
    return-object v7

    .line 51
    :pswitch_0
    const/16 v10, 0xb

    .line 52
    .line 53
    invoke-interface {v1, v0, v10}, La/bld;->j(La/ugi0;I)I

    .line 54
    .line 55
    .line 56
    move-result v27

    .line 57
    or-int/lit16 v11, v11, 0x800

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_1
    const/16 v10, 0xa

    .line 61
    .line 62
    invoke-interface {v1, v0, v10}, La/bld;->r(La/ugi0;I)J

    .line 63
    .line 64
    .line 65
    move-result-wide v25

    .line 66
    or-int/lit16 v11, v11, 0x400

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_2
    const/16 v10, 0x9

    .line 70
    .line 71
    invoke-interface {v1, v0, v10}, La/bld;->r(La/ugi0;I)J

    .line 72
    .line 73
    .line 74
    move-result-wide v23

    .line 75
    or-int/lit16 v11, v11, 0x200

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :pswitch_3
    const/16 v10, 0x8

    .line 79
    .line 80
    invoke-interface {v1, v0, v10}, La/bld;->j(La/ugi0;I)I

    .line 81
    .line 82
    .line 83
    move-result v22

    .line 84
    or-int/lit16 v11, v11, 0x100

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_4
    const/4 v10, 0x7

    .line 88
    invoke-interface {v1, v0, v10}, La/bld;->t(La/ugi0;I)D

    .line 89
    .line 90
    .line 91
    move-result-wide v20

    .line 92
    or-int/lit16 v11, v11, 0x80

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_5
    const/4 v10, 0x6

    .line 96
    invoke-interface {v1, v0, v10}, La/bld;->j(La/ugi0;I)I

    .line 97
    .line 98
    .line 99
    move-result v19

    .line 100
    or-int/lit8 v11, v11, 0x40

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :pswitch_6
    const/4 v10, 0x5

    .line 104
    sget-object v7, La/ysm0;->a:La/ysm0;

    .line 105
    .line 106
    invoke-interface {v1, v0, v10, v7, v9}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    move-object v9, v7

    .line 111
    check-cast v9, Ljava/lang/String;

    .line 112
    .line 113
    or-int/lit8 v11, v11, 0x20

    .line 114
    .line 115
    :goto_1
    const/4 v7, 0x0

    .line 116
    goto :goto_0

    .line 117
    :pswitch_7
    const/4 v7, 0x4

    .line 118
    aget-object v10, v2, v7

    .line 119
    .line 120
    invoke-interface {v10}, La/a8z;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    check-cast v10, La/jiy;

    .line 125
    .line 126
    invoke-interface {v1, v0, v7, v10, v8}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    move-object v8, v7

    .line 131
    check-cast v8, Ljava/util/List;

    .line 132
    .line 133
    or-int/lit8 v11, v11, 0x10

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :pswitch_8
    const/4 v7, 0x3

    .line 137
    aget-object v10, v2, v7

    .line 138
    .line 139
    invoke-interface {v10}, La/a8z;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    check-cast v10, La/jiy;

    .line 144
    .line 145
    invoke-interface {v1, v0, v7, v10, v6}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    check-cast v6, Ljava/util/List;

    .line 150
    .line 151
    or-int/lit8 v11, v11, 0x8

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :pswitch_9
    const/4 v7, 0x2

    .line 155
    aget-object v10, v2, v7

    .line 156
    .line 157
    invoke-interface {v10}, La/a8z;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    check-cast v10, La/jiy;

    .line 162
    .line 163
    invoke-interface {v1, v0, v7, v10, v15}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    move-object v15, v7

    .line 168
    check-cast v15, Ljava/util/List;

    .line 169
    .line 170
    or-int/lit8 v11, v11, 0x4

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :pswitch_a
    invoke-interface {v1, v0, v3}, La/bld;->j(La/ugi0;I)I

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    or-int/lit8 v11, v11, 0x2

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :pswitch_b
    invoke-interface {v1, v0, v4}, La/bld;->t(La/ugi0;I)D

    .line 181
    .line 182
    .line 183
    move-result-wide v12

    .line 184
    or-int/lit8 v11, v11, 0x1

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :pswitch_c
    move v5, v4

    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 191
    .line 192
    .line 193
    new-instance v10, La/mht;

    .line 194
    .line 195
    move-object/from16 v16, v6

    .line 196
    .line 197
    move-object/from16 v17, v8

    .line 198
    .line 199
    move-object/from16 v18, v9

    .line 200
    .line 201
    invoke-direct/range {v10 .. v27}, La/mht;-><init>(IDILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;IDIJJI)V

    .line 202
    .line 203
    .line 204
    return-object v10

    .line 205
    :pswitch_data_0
    .packed-switch -0x1
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

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/kht;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, La/mht;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/kht;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, La/mht;->m:[La/a8z;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iget-wide v2, p2, La/mht;->a:D

    .line 16
    .line 17
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->j(La/ugi0;ID)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iget v2, p2, La/mht;->b:I

    .line 22
    .line 23
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    aget-object v2, v0, v1

    .line 28
    .line 29
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, La/jiy;

    .line 34
    .line 35
    iget-object v3, p2, La/mht;->c:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    aget-object v2, v0, v1

    .line 42
    .line 43
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, La/jiy;

    .line 48
    .line 49
    iget-object v3, p2, La/mht;->d:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x4

    .line 55
    aget-object v0, v0, v1

    .line 56
    .line 57
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, La/jiy;

    .line 62
    .line 63
    iget-object v2, p2, La/mht;->e:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {p1, p0, v1, v0, v2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 69
    .line 70
    iget-object v1, p2, La/mht;->f:Ljava/lang/String;

    .line 71
    .line 72
    const/4 v2, 0x5

    .line 73
    invoke-interface {p1, p0, v2, v0, v1}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    const/4 v0, 0x6

    .line 77
    iget v1, p2, La/mht;->g:I

    .line 78
    .line 79
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 80
    .line 81
    .line 82
    const/4 v0, 0x7

    .line 83
    iget-wide v1, p2, La/mht;->h:D

    .line 84
    .line 85
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->j(La/ugi0;ID)V

    .line 86
    .line 87
    .line 88
    const/16 v0, 0x8

    .line 89
    .line 90
    iget v1, p2, La/mht;->i:I

    .line 91
    .line 92
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 93
    .line 94
    .line 95
    const/16 v0, 0x9

    .line 96
    .line 97
    iget-wide v1, p2, La/mht;->j:J

    .line 98
    .line 99
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 100
    .line 101
    .line 102
    const/16 v0, 0xa

    .line 103
    .line 104
    iget-wide v1, p2, La/mht;->k:J

    .line 105
    .line 106
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 107
    .line 108
    .line 109
    const/16 v0, 0xb

    .line 110
    .line 111
    iget p2, p2, La/mht;->l:I

    .line 112
    .line 113
    invoke-interface {p1, v0, p2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method
