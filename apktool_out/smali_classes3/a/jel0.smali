.class public final synthetic La/jel0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/jel0;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/jel0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/jel0;->a:La/jel0;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.betting.core.dictionaries.sport.domain.model.SportImageModel"

    .line 11
    .line 12
    const/16 v3, 0x12

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "imageSmall"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "imagePopular"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "background"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "backgroundTablet"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "backgroundChampionsDefault"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "backgroundChampionsTabletDefault"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "backgroundChampionsHeaderDefault"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "backgroundChampionsHeaderTabletDefault"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "gameBackground"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "champSmall"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "feedImageVertical"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "feedImageHorizontal"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "feedImageSquare"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const-string v0, "disciplineIcon3D"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    const-string v0, "esportsEventFocusDisciplineHeader"

    .line 89
    .line 90
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    const-string v0, "esportsHeaderFocusDisciplineHeader"

    .line 94
    .line 95
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    const-string v0, "defaultOpponentHeader"

    .line 99
    .line 100
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    const-string v0, "defaultOpponentHeaderTablet"

    .line 104
    .line 105
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 106
    .line 107
    .line 108
    sput-object v1, La/jel0;->descriptor:La/ugi0;

    .line 109
    .line 110
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 2

    .line 1
    const/16 p0, 0x12

    .line 2
    .line 3
    new-array p0, p0, [La/jiy;

    .line 4
    .line 5
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    aput-object v0, p0, v1

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aput-object v0, p0, v1

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    aput-object v0, p0, v1

    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    aput-object v0, p0, v1

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    aput-object v0, p0, v1

    .line 21
    .line 22
    const/4 v1, 0x5

    .line 23
    aput-object v0, p0, v1

    .line 24
    .line 25
    const/4 v1, 0x6

    .line 26
    aput-object v0, p0, v1

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    aput-object v0, p0, v1

    .line 30
    .line 31
    const/16 v1, 0x8

    .line 32
    .line 33
    aput-object v0, p0, v1

    .line 34
    .line 35
    const/16 v1, 0x9

    .line 36
    .line 37
    aput-object v0, p0, v1

    .line 38
    .line 39
    const/16 v1, 0xa

    .line 40
    .line 41
    aput-object v0, p0, v1

    .line 42
    .line 43
    const/16 v1, 0xb

    .line 44
    .line 45
    aput-object v0, p0, v1

    .line 46
    .line 47
    const/16 v1, 0xc

    .line 48
    .line 49
    aput-object v0, p0, v1

    .line 50
    .line 51
    const/16 v1, 0xd

    .line 52
    .line 53
    aput-object v0, p0, v1

    .line 54
    .line 55
    const/16 v1, 0xe

    .line 56
    .line 57
    aput-object v0, p0, v1

    .line 58
    .line 59
    const/16 v1, 0xf

    .line 60
    .line 61
    aput-object v0, p0, v1

    .line 62
    .line 63
    const/16 v1, 0x10

    .line 64
    .line 65
    aput-object v0, p0, v1

    .line 66
    .line 67
    const/16 v1, 0x11

    .line 68
    .line 69
    aput-object v0, p0, v1

    .line 70
    .line 71
    return-object p0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 26

    .line 1
    sget-object v0, La/jel0;->descriptor:La/ugi0;

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
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v2

    .line 13
    move v7, v3

    .line 14
    move-object v8, v4

    .line 15
    move-object v9, v8

    .line 16
    move-object v10, v9

    .line 17
    move-object v11, v10

    .line 18
    move-object v12, v11

    .line 19
    move-object v13, v12

    .line 20
    move-object v14, v13

    .line 21
    move-object v15, v14

    .line 22
    move-object/from16 v16, v15

    .line 23
    .line 24
    move-object/from16 v17, v16

    .line 25
    .line 26
    move-object/from16 v18, v17

    .line 27
    .line 28
    move-object/from16 v19, v18

    .line 29
    .line 30
    move-object/from16 v20, v19

    .line 31
    .line 32
    move-object/from16 v21, v20

    .line 33
    .line 34
    move-object/from16 v22, v21

    .line 35
    .line 36
    move-object/from16 v23, v22

    .line 37
    .line 38
    move-object/from16 v24, v23

    .line 39
    .line 40
    move-object/from16 v25, v24

    .line 41
    .line 42
    :goto_0
    if-eqz v5, :cond_0

    .line 43
    .line 44
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    packed-switch v6, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    invoke-static {v6}, La/itt0;->c(I)V

    .line 52
    .line 53
    .line 54
    return-object v4

    .line 55
    :pswitch_0
    const/16 v6, 0x11

    .line 56
    .line 57
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v25

    .line 61
    const/high16 v6, 0x20000

    .line 62
    .line 63
    :goto_1
    or-int/2addr v7, v6

    .line 64
    goto :goto_0

    .line 65
    :pswitch_1
    const/16 v6, 0x10

    .line 66
    .line 67
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v24

    .line 71
    const/high16 v6, 0x10000

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :pswitch_2
    const/16 v6, 0xf

    .line 75
    .line 76
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v23

    .line 80
    const v6, 0x8000

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :pswitch_3
    const/16 v6, 0xe

    .line 85
    .line 86
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v22

    .line 90
    or-int/lit16 v7, v7, 0x4000

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :pswitch_4
    const/16 v6, 0xd

    .line 94
    .line 95
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v21

    .line 99
    or-int/lit16 v7, v7, 0x2000

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :pswitch_5
    const/16 v6, 0xc

    .line 103
    .line 104
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v20

    .line 108
    or-int/lit16 v7, v7, 0x1000

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :pswitch_6
    const/16 v6, 0xb

    .line 112
    .line 113
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v19

    .line 117
    or-int/lit16 v7, v7, 0x800

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :pswitch_7
    const/16 v6, 0xa

    .line 121
    .line 122
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v18

    .line 126
    or-int/lit16 v7, v7, 0x400

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :pswitch_8
    const/16 v6, 0x9

    .line 130
    .line 131
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v17

    .line 135
    or-int/lit16 v7, v7, 0x200

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :pswitch_9
    const/16 v6, 0x8

    .line 139
    .line 140
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v16

    .line 144
    or-int/lit16 v7, v7, 0x100

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :pswitch_a
    const/4 v6, 0x7

    .line 148
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v15

    .line 152
    or-int/lit16 v7, v7, 0x80

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :pswitch_b
    const/4 v6, 0x6

    .line 156
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v14

    .line 160
    or-int/lit8 v7, v7, 0x40

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :pswitch_c
    const/4 v6, 0x5

    .line 164
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v13

    .line 168
    or-int/lit8 v7, v7, 0x20

    .line 169
    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :pswitch_d
    const/4 v6, 0x4

    .line 173
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    or-int/lit8 v7, v7, 0x10

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :pswitch_e
    const/4 v6, 0x3

    .line 182
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    or-int/lit8 v7, v7, 0x8

    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :pswitch_f
    const/4 v6, 0x2

    .line 191
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    or-int/lit8 v7, v7, 0x4

    .line 196
    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :pswitch_10
    invoke-interface {v1, v0, v2}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    or-int/lit8 v7, v7, 0x2

    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :pswitch_11
    invoke-interface {v1, v0, v3}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    or-int/lit8 v7, v7, 0x1

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :pswitch_12
    move v5, v3

    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 219
    .line 220
    .line 221
    new-instance v6, La/lel0;

    .line 222
    .line 223
    invoke-direct/range {v6 .. v25}, La/lel0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    return-object v6

    .line 227
    :pswitch_data_0
    .packed-switch -0x1
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

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/jel0;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, La/lel0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/jel0;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    iget-object v1, p2, La/lel0;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iget-object v1, p2, La/lel0;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    iget-object v1, p2, La/lel0;->c:Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    iget-object v1, p2, La/lel0;->d:Ljava/lang/String;

    .line 32
    .line 33
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x4

    .line 37
    iget-object v1, p2, La/lel0;->e:Ljava/lang/String;

    .line 38
    .line 39
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x5

    .line 43
    iget-object v1, p2, La/lel0;->f:Ljava/lang/String;

    .line 44
    .line 45
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x6

    .line 49
    iget-object v1, p2, La/lel0;->g:Ljava/lang/String;

    .line 50
    .line 51
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x7

    .line 55
    iget-object v1, p2, La/lel0;->h:Ljava/lang/String;

    .line 56
    .line 57
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/16 v0, 0x8

    .line 61
    .line 62
    iget-object v1, p2, La/lel0;->i:Ljava/lang/String;

    .line 63
    .line 64
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/16 v0, 0x9

    .line 68
    .line 69
    iget-object v1, p2, La/lel0;->j:Ljava/lang/String;

    .line 70
    .line 71
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/16 v0, 0xa

    .line 75
    .line 76
    iget-object v1, p2, La/lel0;->k:Ljava/lang/String;

    .line 77
    .line 78
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const/16 v0, 0xb

    .line 82
    .line 83
    iget-object v1, p2, La/lel0;->l:Ljava/lang/String;

    .line 84
    .line 85
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const/16 v0, 0xc

    .line 89
    .line 90
    iget-object v1, p2, La/lel0;->m:Ljava/lang/String;

    .line 91
    .line 92
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const/16 v0, 0xd

    .line 96
    .line 97
    iget-object v1, p2, La/lel0;->n:Ljava/lang/String;

    .line 98
    .line 99
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const/16 v0, 0xe

    .line 103
    .line 104
    iget-object v1, p2, La/lel0;->o:Ljava/lang/String;

    .line 105
    .line 106
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const/16 v0, 0xf

    .line 110
    .line 111
    iget-object v1, p2, La/lel0;->p:Ljava/lang/String;

    .line 112
    .line 113
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const/16 v0, 0x10

    .line 117
    .line 118
    iget-object v1, p2, La/lel0;->q:Ljava/lang/String;

    .line 119
    .line 120
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const/16 v0, 0x11

    .line 124
    .line 125
    iget-object p2, p2, La/lel0;->r:Ljava/lang/String;

    .line 126
    .line 127
    invoke-interface {p1, p0, v0, p2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method
