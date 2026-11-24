.class public abstract La/bdg0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[La/iiy;

.field public static final b:La/zai0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/bdg0;

    .line 4
    .line 5
    const-string v2, "isSelected"

    .line 6
    .line 7
    const-string v3, "isSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-array v1, v4, [La/iiy;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aput-object v0, v1, v2

    .line 17
    .line 18
    sput-object v1, La/bdg0;->a:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/zai0;

    .line 21
    .line 22
    const-string v1, "IsSelected"

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/zai0;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/bdg0;->b:La/zai0;

    .line 28
    .line 29
    return-void
.end method

.method public static final a(La/mm40;La/cdg0;La/vcg0;La/fet;II)V
    .locals 11

    .line 1
    move v7, p4

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    const v0, -0x728230a4

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3, v0}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, p5, 0x1

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    or-int/lit8 v1, v7, 0x6

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v1, 0x2

    .line 27
    :goto_0
    or-int/2addr v1, v7

    .line 28
    :goto_1
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/16 v3, 0x20

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    move v2, v3

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v2, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr v1, v2

    .line 41
    and-int/lit16 v2, v7, 0x180

    .line 42
    .line 43
    if-nez v2, :cond_4

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {p3, v2}, La/fet;->e(I)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    const/16 v2, 0x100

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    const/16 v2, 0x80

    .line 59
    .line 60
    :goto_3
    or-int/2addr v1, v2

    .line 61
    :cond_4
    and-int/lit16 v2, v7, 0xc00

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    if-nez v2, :cond_6

    .line 65
    .line 66
    invoke-virtual {p3, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    const/16 v2, 0x800

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_5
    const/16 v2, 0x400

    .line 76
    .line 77
    :goto_4
    or-int/2addr v1, v2

    .line 78
    :cond_6
    and-int/lit16 v2, v1, 0x493

    .line 79
    .line 80
    const/16 v6, 0x492

    .line 81
    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x1

    .line 84
    if-eq v2, v6, :cond_7

    .line 85
    .line 86
    move v2, v9

    .line 87
    goto :goto_5

    .line 88
    :cond_7
    move v2, v8

    .line 89
    :goto_5
    and-int/lit8 v6, v1, 0x1

    .line 90
    .line 91
    invoke-virtual {p3, v6, v2}, La/fet;->U(IZ)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_e

    .line 96
    .line 97
    if-eqz v0, :cond_8

    .line 98
    .line 99
    sget-object p0, La/jm40;->b:La/jm40;

    .line 100
    .line 101
    :cond_8
    invoke-static {p2}, La/n7x;->K(La/vcg0;)La/edg0;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v2, "ROLLING_CALENDAR_DATE_CELL_TEMPLATE"

    .line 106
    .line 107
    invoke-static {p0, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    and-int/lit8 v1, v1, 0x70

    .line 112
    .line 113
    if-ne v1, v3, :cond_9

    .line 114
    .line 115
    move v1, v9

    .line 116
    goto :goto_6

    .line 117
    :cond_9
    move v1, v8

    .line 118
    :goto_6
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    if-nez v1, :cond_a

    .line 123
    .line 124
    sget-object v1, La/ukd;->a:La/cl5;

    .line 125
    .line 126
    if-ne v3, v1, :cond_b

    .line 127
    .line 128
    :cond_a
    new-instance v3, La/eme0;

    .line 129
    .line 130
    const/16 v1, 0x14

    .line 131
    .line 132
    invoke-direct {v3, p1, v1}, La/eme0;-><init>(Ljava/lang/Object;B)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p3, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 139
    .line 140
    invoke-static {v2, v8, v3}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    new-instance v2, La/adg0;

    .line 145
    .line 146
    invoke-direct {v2, p1, v0, v8}, La/adg0;-><init>(La/cdg0;La/edg0;B)V

    .line 147
    .line 148
    .line 149
    const v3, 0x2cfe678b

    .line 150
    .line 151
    .line 152
    invoke-static {v3, v2, p3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    new-instance v3, La/adg0;

    .line 157
    .line 158
    invoke-direct {v3, p1, v0, v9}, La/adg0;-><init>(La/cdg0;La/edg0;B)V

    .line 159
    .line 160
    .line 161
    const v6, -0x127bb4b4

    .line 162
    .line 163
    .line 164
    invoke-static {v6, v3, p3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    iget-object v6, p1, La/cdg0;->c:Ljava/lang/String;

    .line 169
    .line 170
    if-nez v6, :cond_c

    .line 171
    .line 172
    const v0, -0x7c439a4f

    .line 173
    .line 174
    .line 175
    invoke-virtual {p3, v0}, La/fet;->e0(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p3, v8}, La/fet;->r(Z)V

    .line 179
    .line 180
    .line 181
    move-object v0, v4

    .line 182
    goto :goto_7

    .line 183
    :cond_c
    const v9, -0x7c439a4e

    .line 184
    .line 185
    .line 186
    invoke-virtual {p3, v9}, La/fet;->e0(I)V

    .line 187
    .line 188
    .line 189
    new-instance v9, La/sqc0;

    .line 190
    .line 191
    const/4 v10, 0x6

    .line 192
    invoke-direct {v9, v6, v0, p1, v10}, La/sqc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 193
    .line 194
    .line 195
    const v0, -0x4be8fd5f

    .line 196
    .line 197
    .line 198
    invoke-static {v0, v9, p3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {p3, v8}, La/fet;->r(Z)V

    .line 203
    .line 204
    .line 205
    :goto_7
    iget-boolean v6, p1, La/cdg0;->d:Z

    .line 206
    .line 207
    if-eqz v6, :cond_d

    .line 208
    .line 209
    sget-object v4, La/hmw0;->f:La/ugd;

    .line 210
    .line 211
    :cond_d
    const/16 v6, 0x1b0

    .line 212
    .line 213
    move-object v5, v3

    .line 214
    move-object v3, v0

    .line 215
    move-object v0, v1

    .line 216
    move-object v1, v2

    .line 217
    move-object v2, v5

    .line 218
    move-object v5, p3

    .line 219
    invoke-static/range {v0 .. v6}, La/m7x;->l(La/mm40;La/ugd;La/ugd;La/xdr;La/ydr;La/fet;I)V

    .line 220
    .line 221
    .line 222
    :goto_8
    move-object v1, p0

    .line 223
    goto :goto_9

    .line 224
    :cond_e
    invoke-virtual {p3}, La/fet;->X()V

    .line 225
    .line 226
    .line 227
    goto :goto_8

    .line 228
    :goto_9
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    if-eqz p0, :cond_f

    .line 233
    .line 234
    new-instance v0, La/hmo;

    .line 235
    .line 236
    const/4 v6, 0x2

    .line 237
    move-object v2, p1

    .line 238
    move-object v3, p2

    .line 239
    move/from16 v5, p5

    .line 240
    .line 241
    move v4, v7

    .line 242
    invoke-direct/range {v0 .. v6}, La/hmo;-><init>(La/mm40;Ljava/lang/Object;Ljava/lang/Object;IIB)V

    .line 243
    .line 244
    .line 245
    iput-object v0, p0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 246
    .line 247
    :cond_f
    return-void
.end method
