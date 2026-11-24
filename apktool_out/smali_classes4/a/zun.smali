.class public final La/zun;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final synthetic a:B

.field public final b:La/g2v;


# direct methods
.method public constructor <init>(La/g2v;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/zun;->a:B

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, La/zun;->b:La/g2v;

    return-void
.end method

.method public constructor <init>(La/y690;La/g2v;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-byte p1, p0, La/zun;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/zun;->b:La/g2v;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zun;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object/from16 v1, p1

    .line 10
    .line 11
    check-cast v1, La/y690;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v3, v1, La/y690;->a:La/x690;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    if-eq v3, v4, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    iget-object v4, v0, La/zun;->b:La/g2v;

    .line 29
    .line 30
    if-eq v3, v1, :cond_1

    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    if-ne v3, v0, :cond_0

    .line 34
    .line 35
    new-instance v2, La/c790;

    .line 36
    .line 37
    sget-object v5, La/pb10;->g:La/pb10;

    .line 38
    .line 39
    const-wide/16 v15, 0x0

    .line 40
    .line 41
    const/16 v17, 0x3de

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v9, 0x0

    .line 47
    const v10, 0x7f130eea

    .line 48
    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    const/4 v12, 0x0

    .line 52
    const-wide/16 v13, 0x0

    .line 53
    .line 54
    invoke-static/range {v4 .. v17}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {v2, v0}, La/c790;-><init>(La/mdm;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance v2, La/z690;

    .line 67
    .line 68
    sget-object v5, La/pb10;->g:La/pb10;

    .line 69
    .line 70
    const-wide/16 v15, 0x0

    .line 71
    .line 72
    const/16 v17, 0x3de

    .line 73
    .line 74
    const/4 v6, 0x0

    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v8, 0x0

    .line 77
    const/4 v9, 0x0

    .line 78
    const v10, 0x7f130677

    .line 79
    .line 80
    .line 81
    const/4 v11, 0x0

    .line 82
    const/4 v12, 0x0

    .line 83
    const-wide/16 v13, 0x0

    .line 84
    .line 85
    invoke-static/range {v4 .. v17}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-direct {v2, v0}, La/z690;-><init>(La/mdm;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    new-instance v2, La/a790;

    .line 94
    .line 95
    iget-boolean v0, v1, La/y690;->c:Z

    .line 96
    .line 97
    invoke-direct {v2, v0}, La/a790;-><init>(Z)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    sget-object v2, La/b790;->a:La/b790;

    .line 102
    .line 103
    :goto_0
    return-object v2

    .line 104
    :pswitch_0
    move-object/from16 v1, p1

    .line 105
    .line 106
    check-cast v1, La/mbp0;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    new-instance v3, La/sbp0;

    .line 112
    .line 113
    new-instance v4, La/qbp0;

    .line 114
    .line 115
    iget-object v10, v1, La/mbp0;->b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 116
    .line 117
    iget-object v5, v10, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->c:Ljava/lang/String;

    .line 118
    .line 119
    iget-boolean v6, v1, La/mbp0;->e:Z

    .line 120
    .line 121
    if-eqz v6, :cond_4

    .line 122
    .line 123
    const v6, 0x7f08045e

    .line 124
    .line 125
    .line 126
    :goto_1
    move v9, v6

    .line 127
    goto :goto_2

    .line 128
    :cond_4
    const v6, 0x7f080459

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :goto_2
    sget-object v6, La/gcm;->a:La/gcm;

    .line 133
    .line 134
    const-string v7, ""

    .line 135
    .line 136
    const-string v8, ""

    .line 137
    .line 138
    invoke-direct/range {v4 .. v9}, La/qbp0;-><init>(Ljava/lang/String;La/hcm;Ljava/lang/String;Ljava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    invoke-static {v4}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    iget-object v5, v1, La/mbp0;->h:La/fbp0;

    .line 146
    .line 147
    iget-object v6, v1, La/mbp0;->f:La/sff0;

    .line 148
    .line 149
    invoke-static {v6}, La/ucx;->X(La/sff0;)La/dxh0;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    iget-boolean v7, v1, La/mbp0;->a:Z

    .line 154
    .line 155
    iget-object v8, v1, La/mbp0;->l:La/obp0;

    .line 156
    .line 157
    iget-object v1, v1, La/mbp0;->k:La/e9p0;

    .line 158
    .line 159
    invoke-static {v5, v6, v7, v1, v8}, La/qim0;->k(La/fbp0;La/dxh0;ZLa/e9p0;La/obp0;)La/gbp0;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    new-instance v5, La/bbp0;

    .line 168
    .line 169
    new-instance v6, La/t8p0;

    .line 170
    .line 171
    iget-object v0, v0, La/zun;->b:La/g2v;

    .line 172
    .line 173
    iget-wide v7, v10, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 174
    .line 175
    invoke-static {v7, v8, v0}, La/ozb;->P(JLa/g2v;)La/mdm;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-direct {v6, v0}, La/t8p0;-><init>(La/mdm;)V

    .line 180
    .line 181
    .line 182
    const/4 v0, 0x6

    .line 183
    invoke-direct {v5, v6, v2, v0}, La/bbp0;-><init>(La/u8p0;La/a4x;I)V

    .line 184
    .line 185
    .line 186
    invoke-static {v5}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-direct {v3, v4, v1, v0}, La/sbp0;-><init>(La/l7m0;La/l7m0;La/l7m0;)V

    .line 191
    .line 192
    .line 193
    return-object v3

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
