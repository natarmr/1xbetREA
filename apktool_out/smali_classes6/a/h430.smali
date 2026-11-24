.class public final La/h430;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ucn;


# direct methods
.method public constructor <init>(La/ucn;La/fhx;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/h430;->a:La/ucn;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;La/fet;I)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v9, p4

    .line 6
    .line 7
    move/from16 v0, p5

    .line 8
    .line 9
    const v2, -0x6ff616d7

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v2}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v2, v0, 0x6

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    move-object/from16 v2, p1

    .line 20
    .line 21
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    const/4 v3, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v3, 0x2

    .line 30
    :goto_0
    or-int/2addr v3, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object/from16 v2, p1

    .line 33
    .line 34
    move v3, v0

    .line 35
    :goto_1
    and-int/lit8 v5, v0, 0x30

    .line 36
    .line 37
    move-object/from16 v7, p2

    .line 38
    .line 39
    if-nez v5, :cond_3

    .line 40
    .line 41
    invoke-virtual {v9, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    const/16 v5, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v5, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v3, v5

    .line 53
    :cond_3
    and-int/lit16 v5, v0, 0x180

    .line 54
    .line 55
    if-nez v5, :cond_6

    .line 56
    .line 57
    and-int/lit16 v5, v0, 0x200

    .line 58
    .line 59
    if-nez v5, :cond_4

    .line 60
    .line 61
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    invoke-virtual {v9, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    :goto_3
    if-eqz v5, :cond_5

    .line 71
    .line 72
    const/16 v5, 0x100

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_5
    const/16 v5, 0x80

    .line 76
    .line 77
    :goto_4
    or-int/2addr v3, v5

    .line 78
    :cond_6
    and-int/lit16 v5, v0, 0xc00

    .line 79
    .line 80
    if-nez v5, :cond_9

    .line 81
    .line 82
    and-int/lit16 v5, v0, 0x1000

    .line 83
    .line 84
    if-nez v5, :cond_7

    .line 85
    .line 86
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    goto :goto_5

    .line 91
    :cond_7
    invoke-virtual {v9, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    :goto_5
    if-eqz v5, :cond_8

    .line 96
    .line 97
    const/16 v5, 0x800

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_8
    const/16 v5, 0x400

    .line 101
    .line 102
    :goto_6
    or-int/2addr v3, v5

    .line 103
    :cond_9
    and-int/lit16 v5, v3, 0x493

    .line 104
    .line 105
    const/16 v6, 0x492

    .line 106
    .line 107
    if-eq v5, v6, :cond_a

    .line 108
    .line 109
    const/4 v5, 0x1

    .line 110
    goto :goto_7

    .line 111
    :cond_a
    const/4 v5, 0x0

    .line 112
    :goto_7
    and-int/lit8 v6, v3, 0x1

    .line 113
    .line 114
    invoke-virtual {v9, v6, v5}, La/fet;->U(IZ)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_b

    .line 119
    .line 120
    const v5, -0xea8c53a

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9, v5}, La/fet;->e0(I)V

    .line 124
    .line 125
    .line 126
    new-instance v12, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;

    .line 127
    .line 128
    iget-wide v13, v4, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;->a:J

    .line 129
    .line 130
    iget-wide v5, v4, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;->b:J

    .line 131
    .line 132
    move-object v8, v12

    .line 133
    iget-wide v11, v4, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;->c:J

    .line 134
    .line 135
    iget-boolean v10, v4, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;->d:Z

    .line 136
    .line 137
    iget-object v15, v4, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;->e:Ljava/lang/String;

    .line 138
    .line 139
    iget-object v0, v4, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;->f:La/ms2;

    .line 140
    .line 141
    move-object/from16 v19, v0

    .line 142
    .line 143
    move/from16 v21, v10

    .line 144
    .line 145
    move-wide/from16 v17, v11

    .line 146
    .line 147
    move-object/from16 v20, v15

    .line 148
    .line 149
    move-wide v15, v5

    .line 150
    move-object v12, v8

    .line 151
    invoke-direct/range {v12 .. v21}, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;-><init>(JJJLa/ms2;Ljava/lang/String;Z)V

    .line 152
    .line 153
    .line 154
    and-int/lit8 v10, v3, 0x7e

    .line 155
    .line 156
    iget-object v5, v1, La/h430;->a:La/ucn;

    .line 157
    .line 158
    move-object v6, v2

    .line 159
    invoke-virtual/range {v5 .. v10}, La/ucn;->a(La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;La/fet;I)V

    .line 160
    .line 161
    .line 162
    const/4 v0, 0x0

    .line 163
    invoke-virtual {v9, v0}, La/fet;->r(Z)V

    .line 164
    .line 165
    .line 166
    goto :goto_8

    .line 167
    :cond_b
    invoke-virtual {v9}, La/fet;->X()V

    .line 168
    .line 169
    .line 170
    :goto_8
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    if-eqz v7, :cond_c

    .line 175
    .line 176
    new-instance v0, La/vho;

    .line 177
    .line 178
    const/16 v6, 0xe

    .line 179
    .line 180
    move-object/from16 v2, p1

    .line 181
    .line 182
    move-object/from16 v3, p2

    .line 183
    .line 184
    move/from16 v5, p5

    .line 185
    .line 186
    invoke-direct/range {v0 .. v6}, La/vho;-><init>(Ljava/lang/Object;La/mm40;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 187
    .line 188
    .line 189
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 190
    .line 191
    :cond_c
    return-void
.end method
