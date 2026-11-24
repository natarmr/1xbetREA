.class public final synthetic La/a320;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/a320;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/a320;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/a320;->a:La/a320;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.domino.data.model.request.MakeActionDominoRequest"

    .line 11
    .line 12
    const/16 v3, 0x9

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "DI"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "DN"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "EI"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "LG"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "WH"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "VU"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "AN"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "CE"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "GI"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    sput-object v1, La/a320;->descriptor:La/ugi0;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 4

    .line 1
    sget-object p0, La/c320;->j:[La/a8z;

    .line 2
    .line 3
    const/16 v0, 0x9

    .line 4
    .line 5
    new-array v0, v0, [La/jiy;

    .line 6
    .line 7
    sget-object v1, La/okx;->a:La/okx;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v1, v0, v2

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    sget-object v3, La/ujx;->c:La/ujx;

    .line 14
    .line 15
    aput-object v3, v0, v2

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    aput-object v1, v0, v2

    .line 19
    .line 20
    sget-object v2, La/ysm0;->a:La/ysm0;

    .line 21
    .line 22
    const/4 v3, 0x3

    .line 23
    aput-object v2, v0, v3

    .line 24
    .line 25
    const/4 v3, 0x4

    .line 26
    aput-object v1, v0, v3

    .line 27
    .line 28
    const/4 v3, 0x5

    .line 29
    aget-object p0, p0, v3

    .line 30
    .line 31
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    aput-object p0, v0, v3

    .line 36
    .line 37
    const/4 p0, 0x6

    .line 38
    aput-object v1, v0, p0

    .line 39
    .line 40
    const/4 p0, 0x7

    .line 41
    aput-object v1, v0, p0

    .line 42
    .line 43
    const/16 p0, 0x8

    .line 44
    .line 45
    invoke-static {v2}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    aput-object v1, v0, p0

    .line 50
    .line 51
    return-object v0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 18

    .line 1
    sget-object v0, La/a320;->descriptor:La/ugi0;

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
    sget-object v2, La/c320;->j:[La/a8z;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    move v6, v3

    .line 14
    move-object v7, v5

    .line 15
    move-object v10, v7

    .line 16
    move-object v12, v10

    .line 17
    move-object v14, v12

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v11, 0x0

    .line 21
    const/4 v13, 0x0

    .line 22
    const/4 v15, 0x0

    .line 23
    const/16 v16, 0x0

    .line 24
    .line 25
    :goto_0
    if-eqz v6, :cond_0

    .line 26
    .line 27
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 28
    .line 29
    .line 30
    move-result v17

    .line 31
    packed-switch v17, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    invoke-static/range {v17 .. v17}, La/itt0;->c(I)V

    .line 35
    .line 36
    .line 37
    return-object v5

    .line 38
    :pswitch_0
    sget-object v5, La/ysm0;->a:La/ysm0;

    .line 39
    .line 40
    const/16 v4, 0x8

    .line 41
    .line 42
    invoke-interface {v1, v0, v4, v5, v7}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    move-object v7, v4

    .line 47
    check-cast v7, Ljava/lang/String;

    .line 48
    .line 49
    or-int/lit16 v8, v8, 0x100

    .line 50
    .line 51
    :goto_1
    const/4 v5, 0x0

    .line 52
    goto :goto_0

    .line 53
    :pswitch_1
    const/4 v4, 0x7

    .line 54
    invoke-interface {v1, v0, v4}, La/bld;->j(La/ugi0;I)I

    .line 55
    .line 56
    .line 57
    move-result v16

    .line 58
    or-int/lit16 v8, v8, 0x80

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :pswitch_2
    const/4 v4, 0x6

    .line 62
    invoke-interface {v1, v0, v4}, La/bld;->j(La/ugi0;I)I

    .line 63
    .line 64
    .line 65
    move-result v15

    .line 66
    or-int/lit8 v8, v8, 0x40

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :pswitch_3
    const/4 v4, 0x5

    .line 70
    aget-object v5, v2, v4

    .line 71
    .line 72
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, La/jiy;

    .line 77
    .line 78
    invoke-interface {v1, v0, v4, v5, v14}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    move-object v14, v4

    .line 83
    check-cast v14, Ljava/util/List;

    .line 84
    .line 85
    or-int/lit8 v8, v8, 0x20

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :pswitch_4
    const/4 v4, 0x4

    .line 89
    invoke-interface {v1, v0, v4}, La/bld;->j(La/ugi0;I)I

    .line 90
    .line 91
    .line 92
    move-result v13

    .line 93
    or-int/lit8 v8, v8, 0x10

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :pswitch_5
    const/4 v4, 0x3

    .line 97
    invoke-interface {v1, v0, v4}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v12

    .line 101
    or-int/lit8 v8, v8, 0x8

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :pswitch_6
    const/4 v4, 0x2

    .line 105
    invoke-interface {v1, v0, v4}, La/bld;->j(La/ugi0;I)I

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    or-int/lit8 v8, v8, 0x4

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :pswitch_7
    sget-object v4, La/ujx;->c:La/ujx;

    .line 113
    .line 114
    invoke-interface {v1, v0, v3, v4, v10}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    move-object v10, v4

    .line 119
    check-cast v10, [I

    .line 120
    .line 121
    or-int/lit8 v8, v8, 0x2

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :pswitch_8
    const/4 v4, 0x0

    .line 125
    invoke-interface {v1, v0, v4}, La/bld;->j(La/ugi0;I)I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    or-int/lit8 v8, v8, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :pswitch_9
    const/4 v4, 0x0

    .line 133
    move v6, v4

    .line 134
    goto :goto_0

    .line 135
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 136
    .line 137
    .line 138
    move-object/from16 v17, v7

    .line 139
    .line 140
    new-instance v7, La/c320;

    .line 141
    .line 142
    invoke-direct/range {v7 .. v17}, La/c320;-><init>(II[IILjava/lang/String;ILjava/util/List;IILjava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object v7

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch -0x1
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
    sget-object p0, La/a320;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 12

    .line 1
    check-cast p2, La/c320;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, La/c320;->i:Ljava/lang/String;

    .line 7
    .line 8
    iget v0, p2, La/c320;->h:I

    .line 9
    .line 10
    iget v1, p2, La/c320;->g:I

    .line 11
    .line 12
    iget-object v2, p2, La/c320;->f:Ljava/util/List;

    .line 13
    .line 14
    iget v3, p2, La/c320;->e:I

    .line 15
    .line 16
    iget-object v4, p2, La/c320;->d:Ljava/lang/String;

    .line 17
    .line 18
    iget v5, p2, La/c320;->c:I

    .line 19
    .line 20
    iget-object v6, p2, La/c320;->b:[I

    .line 21
    .line 22
    iget p2, p2, La/c320;->a:I

    .line 23
    .line 24
    sget-object v7, La/a320;->descriptor:La/ugi0;

    .line 25
    .line 26
    invoke-interface {p1, v7}, La/bwn;->a(La/ugi0;)La/cld;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    sget-object v8, La/c320;->j:[La/a8z;

    .line 31
    .line 32
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    const/4 v10, 0x0

    .line 37
    if-eqz v9, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    if-eqz p2, :cond_1

    .line 41
    .line 42
    :goto_0
    invoke-interface {p1, v10, p2, v7}, La/cld;->i(IILa/ugi0;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    const/4 v9, 0x2

    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    new-array p2, v9, [I

    .line 54
    .line 55
    invoke-static {v6, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-nez p2, :cond_3

    .line 60
    .line 61
    :goto_1
    sget-object p2, La/ujx;->c:La/ujx;

    .line 62
    .line 63
    const/4 v11, 0x1

    .line 64
    invoke-interface {p1, v7, v11, p2, v6}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-eqz p2, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    if-eqz v5, :cond_5

    .line 75
    .line 76
    :goto_2
    invoke-interface {p1, v9, v5, v7}, La/cld;->i(IILa/ugi0;)V

    .line 77
    .line 78
    .line 79
    :cond_5
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eqz p2, :cond_6

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_6
    const-string p2, ""

    .line 87
    .line 88
    invoke-static {v4, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-nez p2, :cond_7

    .line 93
    .line 94
    :goto_3
    const/4 p2, 0x3

    .line 95
    invoke-interface {p1, v7, p2, v4}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_7
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-eqz p2, :cond_8

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_8
    if-eqz v3, :cond_9

    .line 106
    .line 107
    :goto_4
    const/4 p2, 0x4

    .line 108
    invoke-interface {p1, p2, v3, v7}, La/cld;->i(IILa/ugi0;)V

    .line 109
    .line 110
    .line 111
    :cond_9
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-eqz p2, :cond_a

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_a
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-static {p2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-static {v2, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-nez p2, :cond_b

    .line 131
    .line 132
    :goto_5
    const/4 p2, 0x5

    .line 133
    aget-object v3, v8, p2

    .line 134
    .line 135
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    check-cast v3, La/jiy;

    .line 140
    .line 141
    invoke-interface {p1, v7, p2, v3, v2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_b
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    if-eqz p2, :cond_c

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_c
    if-eqz v1, :cond_d

    .line 152
    .line 153
    :goto_6
    const/4 p2, 0x6

    .line 154
    invoke-interface {p1, p2, v1, v7}, La/cld;->i(IILa/ugi0;)V

    .line 155
    .line 156
    .line 157
    :cond_d
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    if-eqz p2, :cond_e

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_e
    if-eqz v0, :cond_f

    .line 165
    .line 166
    :goto_7
    const/4 p2, 0x7

    .line 167
    invoke-interface {p1, p2, v0, v7}, La/cld;->i(IILa/ugi0;)V

    .line 168
    .line 169
    .line 170
    :cond_f
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    if-eqz p2, :cond_10

    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_10
    const-string p2, "0"

    .line 178
    .line 179
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    if-nez p2, :cond_11

    .line 184
    .line 185
    :goto_8
    sget-object p2, La/ysm0;->a:La/ysm0;

    .line 186
    .line 187
    const/16 v0, 0x8

    .line 188
    .line 189
    invoke-interface {p1, v7, v0, p2, p0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    :cond_11
    invoke-interface {p1, v7}, La/cld;->c(La/ugi0;)V

    .line 193
    .line 194
    .line 195
    return-void
.end method
