.class public final synthetic La/h2d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:F

.field public final synthetic d:La/xdr;

.field public final synthetic e:La/xdr;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/wdr;


# direct methods
.method public synthetic constructor <init>(La/cp50;ZFLa/xdr;La/xdr;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/h2d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/h2d;->f:Ljava/lang/Object;

    iput-boolean p2, p0, La/h2d;->b:Z

    iput p3, p0, La/h2d;->c:F

    iput-object p4, p0, La/h2d;->d:La/xdr;

    iput-object p5, p0, La/h2d;->e:La/xdr;

    iput-object p6, p0, La/h2d;->g:Ljava/lang/Object;

    iput-object p7, p0, La/h2d;->h:Ljava/lang/Object;

    iput-object p8, p0, La/h2d;->i:Ljava/lang/Object;

    iput-object p9, p0, La/h2d;->j:La/wdr;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;ZLa/f3d;La/j73;La/qkq;FLa/ugd;La/xdr;La/xdr;I)V
    .locals 0

    .line 1
    const/4 p10, 0x0

    iput-byte p10, p0, La/h2d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/h2d;->f:Ljava/lang/Object;

    iput-boolean p2, p0, La/h2d;->b:Z

    iput-object p3, p0, La/h2d;->g:Ljava/lang/Object;

    iput-object p4, p0, La/h2d;->h:Ljava/lang/Object;

    iput-object p5, p0, La/h2d;->i:Ljava/lang/Object;

    iput p6, p0, La/h2d;->c:F

    iput-object p7, p0, La/h2d;->j:La/wdr;

    iput-object p8, p0, La/h2d;->d:La/xdr;

    iput-object p9, p0, La/h2d;->e:La/xdr;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/h2d;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/h2d;->j:La/wdr;

    .line 6
    .line 7
    iget-object v3, v0, La/h2d;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/h2d;->h:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/h2d;->g:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/h2d;->f:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v6, La/cp50;

    .line 19
    .line 20
    move-object v12, v5

    .line 21
    check-cast v12, Lkotlin/jvm/functions/Function2;

    .line 22
    .line 23
    move-object v13, v4

    .line 24
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 25
    .line 26
    move-object v14, v3

    .line 27
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    move-object v15, v2

    .line 30
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 31
    .line 32
    move-object/from16 v1, p1

    .line 33
    .line 34
    check-cast v1, La/fet;

    .line 35
    .line 36
    move-object/from16 v2, p2

    .line 37
    .line 38
    check-cast v2, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    and-int/lit8 v3, v2, 0x3

    .line 45
    .line 46
    const/4 v4, 0x2

    .line 47
    const/4 v5, 0x1

    .line 48
    const/4 v7, 0x0

    .line 49
    if-eq v3, v4, :cond_0

    .line 50
    .line 51
    move v3, v5

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move v3, v7

    .line 54
    :goto_0
    and-int/2addr v2, v5

    .line 55
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    if-nez v6, :cond_1

    .line 62
    .line 63
    move-object v0, v1

    .line 64
    move v2, v7

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    instance-of v2, v6, La/zo50;

    .line 67
    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    const v2, 0x67361f39

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 74
    .line 75
    .line 76
    iget-boolean v2, v0, La/h2d;->b:Z

    .line 77
    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    const v2, 0x673724e8

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 84
    .line 85
    .line 86
    move-object v9, v6

    .line 87
    check-cast v9, La/zo50;

    .line 88
    .line 89
    const/high16 v2, 0x3f800000    # 1.0f

    .line 90
    .line 91
    iget v3, v0, La/h2d;->c:F

    .line 92
    .line 93
    sub-float v8, v2, v3

    .line 94
    .line 95
    move v2, v7

    .line 96
    const/4 v7, 0x0

    .line 97
    const/16 v17, 0x0

    .line 98
    .line 99
    iget-object v10, v0, La/h2d;->d:La/xdr;

    .line 100
    .line 101
    iget-object v11, v0, La/h2d;->e:La/xdr;

    .line 102
    .line 103
    move-object/from16 v16, v1

    .line 104
    .line 105
    invoke-static/range {v7 .. v17}, La/lv00;->M(La/mm40;FLa/zo50;La/xdr;La/xdr;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 106
    .line 107
    .line 108
    move-object/from16 v0, v16

    .line 109
    .line 110
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    move-object v0, v1

    .line 115
    move v2, v7

    .line 116
    const v1, 0x673fc31d

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 123
    .line 124
    .line 125
    :goto_1
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_3
    move-object v0, v1

    .line 130
    move v2, v7

    .line 131
    instance-of v1, v6, La/bp50;

    .line 132
    .line 133
    if-eqz v1, :cond_4

    .line 134
    .line 135
    const v1, 0x6740f51e

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 139
    .line 140
    .line 141
    const/4 v1, 0x0

    .line 142
    invoke-static {v2, v0, v1}, La/lv00;->N(ILa/fet;La/mm40;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_4
    :goto_2
    const v1, 0x674242bb

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    move-object v0, v1

    .line 160
    invoke-virtual {v0}, La/fet;->X()V

    .line 161
    .line 162
    .line 163
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object v0

    .line 166
    :pswitch_0
    move-object v1, v6

    .line 167
    check-cast v1, La/mm40;

    .line 168
    .line 169
    check-cast v5, La/f3d;

    .line 170
    .line 171
    check-cast v4, La/j73;

    .line 172
    .line 173
    check-cast v3, La/qkq;

    .line 174
    .line 175
    move-object v7, v2

    .line 176
    check-cast v7, La/ugd;

    .line 177
    .line 178
    move-object/from16 v10, p1

    .line 179
    .line 180
    check-cast v10, La/fet;

    .line 181
    .line 182
    move-object/from16 v2, p2

    .line 183
    .line 184
    check-cast v2, Ljava/lang/Integer;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    const v2, 0x6d80031

    .line 190
    .line 191
    .line 192
    invoke-static {v2}, La/x8x;->L(I)I

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    iget-boolean v2, v0, La/h2d;->b:Z

    .line 197
    .line 198
    iget v6, v0, La/h2d;->c:F

    .line 199
    .line 200
    iget-object v8, v0, La/h2d;->d:La/xdr;

    .line 201
    .line 202
    iget-object v9, v0, La/h2d;->e:La/xdr;

    .line 203
    .line 204
    move-object/from16 v18, v5

    .line 205
    .line 206
    move-object v5, v3

    .line 207
    move-object/from16 v3, v18

    .line 208
    .line 209
    invoke-static/range {v1 .. v11}, La/fxb;->c(La/mm40;ZLa/f3d;La/j73;La/qkq;FLa/ugd;La/xdr;La/xdr;La/fet;I)V

    .line 210
    .line 211
    .line 212
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
