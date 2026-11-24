.class public final synthetic La/uhl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/l7m0;

.field public final synthetic b:La/nf5;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/hil0;

.field public final synthetic e:La/l7m0;

.field public final synthetic f:La/l7m0;

.field public final synthetic g:La/a1m;

.field public final synthetic h:La/l7m0;

.field public final synthetic i:La/p1m;

.field public final synthetic j:La/l7m0;

.field public final synthetic k:La/j1m;

.field public final synthetic l:La/l7m0;

.field public final synthetic m:La/tsl;

.field public final synthetic n:La/l7m0;

.field public final synthetic o:La/usl;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/nf5;La/l7m0;La/hil0;La/l7m0;La/l7m0;La/a1m;La/l7m0;La/p1m;La/l7m0;La/j1m;La/l7m0;La/tsl;La/l7m0;La/usl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/uhl0;->a:La/l7m0;

    iput-object p2, p0, La/uhl0;->b:La/nf5;

    iput-object p3, p0, La/uhl0;->c:La/l7m0;

    iput-object p4, p0, La/uhl0;->d:La/hil0;

    iput-object p5, p0, La/uhl0;->e:La/l7m0;

    iput-object p6, p0, La/uhl0;->f:La/l7m0;

    iput-object p7, p0, La/uhl0;->g:La/a1m;

    iput-object p8, p0, La/uhl0;->h:La/l7m0;

    iput-object p9, p0, La/uhl0;->i:La/p1m;

    iput-object p10, p0, La/uhl0;->j:La/l7m0;

    iput-object p11, p0, La/uhl0;->k:La/j1m;

    iput-object p12, p0, La/uhl0;->l:La/l7m0;

    iput-object p13, p0, La/uhl0;->m:La/tsl;

    iput-object p14, p0, La/uhl0;->n:La/l7m0;

    iput-object p15, p0, La/uhl0;->o:La/usl;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/ir8;

    .line 6
    .line 7
    move-object/from16 v6, p2

    .line 8
    .line 9
    check-cast v6, La/fet;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v3, v2, 0x6

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v3, 0x2

    .line 35
    :goto_0
    or-int/2addr v2, v3

    .line 36
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 37
    .line 38
    const/16 v4, 0x12

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    if-eq v3, v4, :cond_2

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move v3, v9

    .line 46
    :goto_1
    and-int/lit8 v4, v2, 0x1

    .line 47
    .line 48
    invoke-virtual {v6, v4, v3}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    new-instance v10, La/dfc0;

    .line 55
    .line 56
    const/16 v15, 0x1c

    .line 57
    .line 58
    iget-object v11, v0, La/uhl0;->c:La/l7m0;

    .line 59
    .line 60
    iget-object v12, v0, La/uhl0;->d:La/hil0;

    .line 61
    .line 62
    iget-object v13, v0, La/uhl0;->e:La/l7m0;

    .line 63
    .line 64
    iget-object v14, v0, La/uhl0;->f:La/l7m0;

    .line 65
    .line 66
    invoke-direct/range {v10 .. v15}, La/dfc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    const v3, 0x47f7baa3

    .line 70
    .line 71
    .line 72
    invoke-static {v3, v10, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    and-int/lit8 v10, v2, 0xe

    .line 77
    .line 78
    or-int/lit16 v7, v10, 0x6000

    .line 79
    .line 80
    const/4 v8, 0x7

    .line 81
    const/4 v2, 0x0

    .line 82
    const/4 v3, 0x0

    .line 83
    const/4 v4, 0x0

    .line 84
    invoke-static/range {v1 .. v8}, La/tfx;->d(La/ir8;FFFLa/ugd;La/fet;II)V

    .line 85
    .line 86
    .line 87
    iget-object v2, v0, La/uhl0;->a:La/l7m0;

    .line 88
    .line 89
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_3

    .line 100
    .line 101
    const v2, -0x7bcdd173

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v2}, La/fet;->e0(I)V

    .line 105
    .line 106
    .line 107
    sget-object v2, La/qmk;->a:La/zcl;

    .line 108
    .line 109
    const/high16 v2, -0x40000000    # -2.0f

    .line 110
    .line 111
    const/high16 v3, -0x3f800000    # -4.0f

    .line 112
    .line 113
    sget-object v4, La/jm40;->b:La/jm40;

    .line 114
    .line 115
    invoke-static {v4, v2, v3}, La/ffb0;->Q(La/mm40;FF)La/mm40;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    const-string v3, "DS_TAG_DOT"

    .line 120
    .line 121
    invoke-static {v2, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iget-object v3, v0, La/uhl0;->b:La/nf5;

    .line 126
    .line 127
    invoke-static {v2, v3, v6, v9, v9}, La/thb;->f(La/mm40;La/uf5;La/fet;II)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v9}, La/fet;->r(Z)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_3
    const v2, -0x7bc9fdae

    .line 135
    .line 136
    .line 137
    invoke-virtual {v6, v2}, La/fet;->e0(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6, v9}, La/fet;->r(Z)V

    .line 141
    .line 142
    .line 143
    :goto_2
    new-instance v16, La/i9x;

    .line 144
    .line 145
    const/16 v27, 0x3

    .line 146
    .line 147
    iget-object v2, v0, La/uhl0;->g:La/a1m;

    .line 148
    .line 149
    iget-object v3, v0, La/uhl0;->h:La/l7m0;

    .line 150
    .line 151
    iget-object v4, v0, La/uhl0;->i:La/p1m;

    .line 152
    .line 153
    iget-object v5, v0, La/uhl0;->j:La/l7m0;

    .line 154
    .line 155
    iget-object v7, v0, La/uhl0;->k:La/j1m;

    .line 156
    .line 157
    iget-object v8, v0, La/uhl0;->l:La/l7m0;

    .line 158
    .line 159
    iget-object v9, v0, La/uhl0;->m:La/tsl;

    .line 160
    .line 161
    iget-object v11, v0, La/uhl0;->n:La/l7m0;

    .line 162
    .line 163
    iget-object v0, v0, La/uhl0;->o:La/usl;

    .line 164
    .line 165
    move-object/from16 v26, v0

    .line 166
    .line 167
    move-object/from16 v18, v2

    .line 168
    .line 169
    move-object/from16 v19, v3

    .line 170
    .line 171
    move-object/from16 v20, v4

    .line 172
    .line 173
    move-object/from16 v21, v5

    .line 174
    .line 175
    move-object/from16 v22, v7

    .line 176
    .line 177
    move-object/from16 v23, v8

    .line 178
    .line 179
    move-object/from16 v24, v9

    .line 180
    .line 181
    move-object/from16 v25, v11

    .line 182
    .line 183
    move-object/from16 v17, v13

    .line 184
    .line 185
    invoke-direct/range {v16 .. v27}, La/i9x;-><init>(La/l7m0;La/d1m;La/l7m0;La/s1m;La/l7m0;La/m1m;La/l7m0;La/tsl;La/l7m0;La/usl;B)V

    .line 186
    .line 187
    .line 188
    move-object/from16 v0, v16

    .line 189
    .line 190
    const v2, 0x1a45ae6e

    .line 191
    .line 192
    .line 193
    invoke-static {v2, v0, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    or-int/lit8 v2, v10, 0x30

    .line 198
    .line 199
    invoke-static {v1, v0, v6, v2}, La/m8x;->c(La/ir8;La/ugd;La/fet;I)V

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_4
    invoke-virtual {v6}, La/fet;->X()V

    .line 204
    .line 205
    .line 206
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object v0
.end method
