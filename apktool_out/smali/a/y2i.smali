.class public final synthetic La/y2i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/pu90;ILa/pu90;La/pu90;La/pu90;La/pu90;III)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/y2i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/y2i;->b:I

    iput-object p2, p0, La/y2i;->g:Ljava/lang/Object;

    iput p3, p0, La/y2i;->c:I

    iput-object p4, p0, La/y2i;->h:Ljava/lang/Object;

    iput-object p5, p0, La/y2i;->i:Ljava/lang/Object;

    iput-object p6, p0, La/y2i;->j:Ljava/lang/Object;

    iput-object p7, p0, La/y2i;->k:Ljava/lang/Object;

    iput p8, p0, La/y2i;->d:I

    iput p9, p0, La/y2i;->e:I

    iput p10, p0, La/y2i;->f:I

    return-void
.end method

.method public synthetic constructor <init>([IIII[La/pu90;La/yoq;ILa/k6z;I[I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/y2i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/y2i;->g:Ljava/lang/Object;

    iput p2, p0, La/y2i;->b:I

    iput p3, p0, La/y2i;->c:I

    iput p4, p0, La/y2i;->d:I

    iput-object p5, p0, La/y2i;->h:Ljava/lang/Object;

    iput-object p6, p0, La/y2i;->i:Ljava/lang/Object;

    iput p7, p0, La/y2i;->e:I

    iput-object p8, p0, La/y2i;->j:Ljava/lang/Object;

    iput p9, p0, La/y2i;->f:I

    iput-object p10, p0, La/y2i;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/y2i;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, La/y2i;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, v0, La/y2i;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, La/y2i;->i:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, La/y2i;->h:Ljava/lang/Object;

    .line 14
    .line 15
    iget v8, v0, La/y2i;->d:I

    .line 16
    .line 17
    iget v9, v0, La/y2i;->c:I

    .line 18
    .line 19
    iget v10, v0, La/y2i;->b:I

    .line 20
    .line 21
    iget-object v11, v0, La/y2i;->g:Ljava/lang/Object;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast v11, [I

    .line 27
    .line 28
    check-cast v7, [La/pu90;

    .line 29
    .line 30
    check-cast v6, La/yoq;

    .line 31
    .line 32
    move-object v15, v5

    .line 33
    check-cast v15, La/k6z;

    .line 34
    .line 35
    check-cast v4, [I

    .line 36
    .line 37
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, La/ou90;

    .line 40
    .line 41
    if-eqz v11, :cond_0

    .line 42
    .line 43
    aget v3, v11, v10

    .line 44
    .line 45
    :cond_0
    move v5, v9

    .line 46
    :goto_0
    if-ge v5, v8, :cond_4

    .line 47
    .line 48
    aget-object v16, v7, v5

    .line 49
    .line 50
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual/range {v16 .. v16}, La/pu90;->n()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    instance-of v11, v10, La/mhg0;

    .line 58
    .line 59
    if-eqz v11, :cond_1

    .line 60
    .line 61
    check-cast v10, La/mhg0;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move-object v10, v2

    .line 65
    :goto_1
    if-eqz v10, :cond_3

    .line 66
    .line 67
    iget-object v10, v10, La/mhg0;->c:La/wvb;

    .line 68
    .line 69
    if-nez v10, :cond_2

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_2
    :goto_2
    move-object v12, v10

    .line 73
    goto :goto_4

    .line 74
    :cond_3
    :goto_3
    iget-object v10, v6, La/yoq;->d:La/eef;

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :goto_4
    invoke-virtual/range {v16 .. v16}, La/pu90;->d0()I

    .line 78
    .line 79
    .line 80
    move-result v14

    .line 81
    iget v13, v0, La/y2i;->e:I

    .line 82
    .line 83
    iget v10, v0, La/y2i;->f:I

    .line 84
    .line 85
    move/from16 v17, v10

    .line 86
    .line 87
    invoke-virtual/range {v12 .. v17}, La/wvb;->K(IILa/k6z;La/pu90;I)I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    move-object/from16 v11, v16

    .line 92
    .line 93
    add-int/2addr v10, v3

    .line 94
    sub-int v12, v5, v9

    .line 95
    .line 96
    aget v12, v4, v12

    .line 97
    .line 98
    invoke-static {v1, v11, v12, v10}, La/ou90;->h(La/ou90;La/pu90;II)V

    .line 99
    .line 100
    .line 101
    add-int/lit8 v5, v5, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_0
    check-cast v11, La/pu90;

    .line 108
    .line 109
    check-cast v7, La/pu90;

    .line 110
    .line 111
    check-cast v6, La/pu90;

    .line 112
    .line 113
    check-cast v5, La/pu90;

    .line 114
    .line 115
    check-cast v4, La/pu90;

    .line 116
    .line 117
    move-object/from16 v1, p1

    .line 118
    .line 119
    check-cast v1, La/ou90;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    const/4 v12, 0x0

    .line 125
    invoke-virtual {v1, v11, v10, v9, v12}, La/ou90;->m(La/pu90;IIF)V

    .line 126
    .line 127
    .line 128
    iget v11, v11, La/pu90;->b:I

    .line 129
    .line 130
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v13

    .line 134
    if-eqz v11, :cond_5

    .line 135
    .line 136
    move-object v2, v13

    .line 137
    :cond_5
    iget v11, v0, La/y2i;->f:I

    .line 138
    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    add-int v3, v2, v11

    .line 146
    .line 147
    :cond_6
    add-int/2addr v9, v3

    .line 148
    invoke-virtual {v1, v7, v10, v9, v12}, La/ou90;->m(La/pu90;IIF)V

    .line 149
    .line 150
    .line 151
    filled-new-array {v6, v5, v4}, [La/pu90;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-static {v2}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    new-instance v3, La/ah30;

    .line 160
    .line 161
    invoke-direct {v3, v2}, La/ah30;-><init>(Ljava/util/List;)V

    .line 162
    .line 163
    .line 164
    iget v0, v0, La/y2i;->e:I

    .line 165
    .line 166
    sub-int/2addr v8, v0

    .line 167
    invoke-virtual {v3}, La/ah30;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :goto_5
    move-object v2, v0

    .line 172
    check-cast v2, La/xag0;

    .line 173
    .line 174
    iget-object v2, v2, La/xag0;->b:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v2, Ljava/util/ListIterator;

    .line 177
    .line 178
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-eqz v3, :cond_7

    .line 183
    .line 184
    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, La/pu90;

    .line 189
    .line 190
    iget v3, v2, La/pu90;->a:I

    .line 191
    .line 192
    sub-int/2addr v8, v3

    .line 193
    invoke-virtual {v1, v2, v8, v11, v12}, La/ou90;->m(La/pu90;IIF)V

    .line 194
    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object v0

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
