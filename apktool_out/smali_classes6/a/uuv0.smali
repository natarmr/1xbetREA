.class public final synthetic La/uuv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ywv0;

.field public final synthetic c:La/duv0;

.field public final synthetic d:La/usv0;

.field public final synthetic e:La/xdr;

.field public final synthetic f:La/xdr;

.field public final synthetic g:La/qwv0;

.field public final synthetic h:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/ywv0;La/duv0;La/usv0;La/xdr;La/xdr;La/qwv0;La/ugd;B)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/uuv0;->a:B

    iput-object p1, p0, La/uuv0;->b:La/ywv0;

    iput-object p2, p0, La/uuv0;->c:La/duv0;

    iput-object p3, p0, La/uuv0;->d:La/usv0;

    iput-object p4, p0, La/uuv0;->e:La/xdr;

    iput-object p5, p0, La/uuv0;->f:La/xdr;

    iput-object p6, p0, La/uuv0;->g:La/qwv0;

    iput-object p7, p0, La/uuv0;->h:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/uuv0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v12, p1

    .line 11
    check-cast v12, La/fet;

    .line 12
    .line 13
    move-object/from16 v0, p2

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    and-int/lit8 v5, v0, 0x3

    .line 22
    .line 23
    if-eq v5, v1, :cond_0

    .line 24
    .line 25
    move v1, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v1, v4

    .line 28
    :goto_0
    and-int/2addr v0, v3

    .line 29
    invoke-virtual {v12, v0, v1}, La/fet;->U(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iget-object v0, p0, La/uuv0;->c:La/duv0;

    .line 36
    .line 37
    invoke-virtual {v0}, La/duv0;->b()La/l7m0;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    iget-object v0, p0, La/uuv0;->d:La/usv0;

    .line 42
    .line 43
    iget v7, v0, La/usv0;->d:I

    .line 44
    .line 45
    iget v8, v0, La/usv0;->e:I

    .line 46
    .line 47
    iget-object v0, p0, La/uuv0;->e:La/xdr;

    .line 48
    .line 49
    iget-object v1, p0, La/uuv0;->g:La/qwv0;

    .line 50
    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    const v0, 0x4797290

    .line 54
    .line 55
    .line 56
    invoke-virtual {v12, v0}, La/fet;->e0(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 60
    .line 61
    .line 62
    move-object v9, v2

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    const v5, 0x4797291

    .line 65
    .line 66
    .line 67
    invoke-virtual {v12, v5}, La/fet;->e0(I)V

    .line 68
    .line 69
    .line 70
    new-instance v5, La/tuv0;

    .line 71
    .line 72
    invoke-direct {v5, v0, v1, v4}, La/tuv0;-><init>(La/xdr;La/qwv0;B)V

    .line 73
    .line 74
    .line 75
    const v0, 0x55015da5

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v5, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 83
    .line 84
    .line 85
    move-object v9, v0

    .line 86
    :goto_1
    iget-object v0, p0, La/uuv0;->f:La/xdr;

    .line 87
    .line 88
    if-nez v0, :cond_2

    .line 89
    .line 90
    const v0, 0x47a8990

    .line 91
    .line 92
    .line 93
    invoke-virtual {v12, v0}, La/fet;->e0(I)V

    .line 94
    .line 95
    .line 96
    :goto_2
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 97
    .line 98
    .line 99
    move-object v10, v2

    .line 100
    goto :goto_3

    .line 101
    :cond_2
    const v2, 0x47a8991

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v2}, La/fet;->e0(I)V

    .line 105
    .line 106
    .line 107
    new-instance v2, La/tuv0;

    .line 108
    .line 109
    invoke-direct {v2, v0, v1, v3}, La/tuv0;-><init>(La/xdr;La/qwv0;B)V

    .line 110
    .line 111
    .line 112
    const v0, 0x45168266

    .line 113
    .line 114
    .line 115
    invoke-static {v0, v2, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    goto :goto_2

    .line 120
    :goto_3
    new-instance v0, La/onu0;

    .line 121
    .line 122
    const/16 v2, 0xa

    .line 123
    .line 124
    iget-object v3, p0, La/uuv0;->h:La/ugd;

    .line 125
    .line 126
    invoke-direct {v0, v3, v1, v2}, La/onu0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    const v1, 0x4560a55d

    .line 130
    .line 131
    .line 132
    invoke-static {v1, v0, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    const/high16 v13, 0x180000

    .line 137
    .line 138
    iget-object v5, p0, La/uuv0;->b:La/ywv0;

    .line 139
    .line 140
    invoke-static/range {v5 .. v13}, La/rsm0;->n(La/ywv0;La/l7m0;IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/ugd;La/fet;I)V

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_3
    invoke-virtual {v12}, La/fet;->X()V

    .line 145
    .line 146
    .line 147
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_0
    move-object v0, p1

    .line 151
    check-cast v0, La/fet;

    .line 152
    .line 153
    move-object/from16 v5, p2

    .line 154
    .line 155
    check-cast v5, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    and-int/lit8 v6, v5, 0x3

    .line 162
    .line 163
    if-eq v6, v1, :cond_4

    .line 164
    .line 165
    move v4, v3

    .line 166
    :cond_4
    and-int/lit8 v1, v5, 0x1

    .line 167
    .line 168
    invoke-virtual {v0, v1, v4}, La/fet;->U(IZ)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_5

    .line 173
    .line 174
    sget-object v1, La/os00;->a:La/zfn;

    .line 175
    .line 176
    iget-object v4, p0, La/uuv0;->b:La/ywv0;

    .line 177
    .line 178
    iget-object v3, v4, La/ywv0;->k:La/bvv0;

    .line 179
    .line 180
    invoke-virtual {v1, v2}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    new-instance v3, La/uuv0;

    .line 185
    .line 186
    const/4 v11, 0x1

    .line 187
    iget-object v5, p0, La/uuv0;->c:La/duv0;

    .line 188
    .line 189
    iget-object v6, p0, La/uuv0;->d:La/usv0;

    .line 190
    .line 191
    iget-object v7, p0, La/uuv0;->e:La/xdr;

    .line 192
    .line 193
    iget-object v8, p0, La/uuv0;->f:La/xdr;

    .line 194
    .line 195
    iget-object v9, p0, La/uuv0;->g:La/qwv0;

    .line 196
    .line 197
    iget-object v10, p0, La/uuv0;->h:La/ugd;

    .line 198
    .line 199
    invoke-direct/range {v3 .. v11}, La/uuv0;-><init>(La/ywv0;La/duv0;La/usv0;La/xdr;La/xdr;La/qwv0;La/ugd;B)V

    .line 200
    .line 201
    .line 202
    const p0, 0x7969d8ac

    .line 203
    .line 204
    .line 205
    invoke-static {p0, v3, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    const/16 v2, 0x38

    .line 210
    .line 211
    invoke-static {v1, p0, v0, v2}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 212
    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_5
    invoke-virtual {v0}, La/fet;->X()V

    .line 216
    .line 217
    .line 218
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
