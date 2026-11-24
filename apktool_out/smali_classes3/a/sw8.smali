.class public final synthetic La/sw8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/jie0;La/qah0;La/jie0;La/iuj;)V
    .locals 0

    .line 2
    const/16 p4, 0x16

    iput-byte p4, p0, La/sw8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/sw8;->b:Ljava/lang/Object;

    iput-object p2, p0, La/sw8;->c:Ljava/lang/Object;

    iput-object p3, p0, La/sw8;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/nee;La/aht0;La/bby;La/rch0;)V
    .locals 0

    .line 1
    const/16 p2, 0xc

    iput-byte p2, p0, La/sw8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/sw8;->b:Ljava/lang/Object;

    iput-object p3, p0, La/sw8;->c:Ljava/lang/Object;

    iput-object p4, p0, La/sw8;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p4, p0, La/sw8;->a:B

    iput-object p1, p0, La/sw8;->b:Ljava/lang/Object;

    iput-object p2, p0, La/sw8;->c:Ljava/lang/Object;

    iput-object p3, p0, La/sw8;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, La/sw8;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/u4q0;

    .line 4
    .line 5
    iget-object v1, p0, La/sw8;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    iget-object p0, p0, La/sw8;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/g5q0;

    .line 12
    .line 13
    check-cast p1, La/pje;

    .line 14
    .line 15
    iget-object v0, v0, La/u4q0;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    move v4, v3

    .line 23
    :goto_0
    if-ge v4, v2, :cond_8

    .line 24
    .line 25
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, La/t4q0;

    .line 30
    .line 31
    instance-of v6, v5, La/b5q0;

    .line 32
    .line 33
    const/16 v7, 0x13

    .line 34
    .line 35
    const/4 v8, 0x6

    .line 36
    const/4 v9, 0x0

    .line 37
    const/4 v10, 0x1

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    new-instance v6, La/yfg;

    .line 41
    .line 42
    check-cast v5, La/b5q0;

    .line 43
    .line 44
    invoke-direct {v6, v5, v7}, La/yfg;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    iget v7, v5, La/b5q0;->c:I

    .line 48
    .line 49
    if-nez v7, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    new-instance v7, La/bkh;

    .line 53
    .line 54
    invoke-direct {v7, v5, v10}, La/bkh;-><init>(Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    new-instance v9, La/ugd;

    .line 58
    .line 59
    const v11, -0x731428a5

    .line 60
    .line 61
    .line 62
    invoke-direct {v9, v11, v10, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    new-instance v7, La/vef;

    .line 66
    .line 67
    const/16 v10, 0x1a

    .line 68
    .line 69
    invoke-direct {v7, v5, p0, v10}, La/vef;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v6, v9, v7, v8}, La/pje;->b(La/pje;Lkotlin/jvm/functions/Function2;La/ugd;Lkotlin/jvm/functions/Function0;I)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
    instance-of v6, v5, La/h5q0;

    .line 77
    .line 78
    if-eqz v6, :cond_6

    .line 79
    .line 80
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 81
    .line 82
    const/16 v11, 0x1c

    .line 83
    .line 84
    if-lt v6, v11, :cond_7

    .line 85
    .line 86
    check-cast v5, La/h5q0;

    .line 87
    .line 88
    if-nez v1, :cond_2

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    iget v6, v5, La/h5q0;->c:I

    .line 92
    .line 93
    iget-object v11, v5, La/h5q0;->b:Landroid/view/textclassifier/TextClassification;

    .line 94
    .line 95
    iget-object v5, v5, La/h5q0;->d:Landroid/graphics/drawable/Drawable;

    .line 96
    .line 97
    if-gez v6, :cond_4

    .line 98
    .line 99
    new-instance v6, La/l7p0;

    .line 100
    .line 101
    const/16 v7, 0x12

    .line 102
    .line 103
    invoke-direct {v6, v11, v7}, La/l7p0;-><init>(Ljava/lang/Object;B)V

    .line 104
    .line 105
    .line 106
    if-eqz v5, :cond_3

    .line 107
    .line 108
    new-instance v7, La/a5q0;

    .line 109
    .line 110
    invoke-direct {v7, v5, v3}, La/a5q0;-><init>(Landroid/graphics/drawable/Drawable;B)V

    .line 111
    .line 112
    .line 113
    new-instance v9, La/ugd;

    .line 114
    .line 115
    const v5, -0x42f30a7b

    .line 116
    .line 117
    .line 118
    invoke-direct {v9, v5, v10, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    new-instance v5, La/yip0;

    .line 122
    .line 123
    invoke-direct {v5, v1, v11, v8}, La/yip0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    invoke-static {p1, v6, v9, v5, v8}, La/pje;->b(La/pje;Lkotlin/jvm/functions/Function2;La/ugd;Lkotlin/jvm/functions/Function0;I)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    invoke-static {v11}, La/o8m0;->j(Landroid/view/textclassifier/TextClassification;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    invoke-interface {v11, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-static {v6}, La/jw90;->c(Ljava/lang/Object;)Landroid/app/RemoteAction;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    new-instance v11, La/l7p0;

    .line 143
    .line 144
    invoke-direct {v11, v6, v7}, La/l7p0;-><init>(Ljava/lang/Object;B)V

    .line 145
    .line 146
    .line 147
    if-eqz v5, :cond_5

    .line 148
    .line 149
    new-instance v7, La/a5q0;

    .line 150
    .line 151
    invoke-direct {v7, v5, v10}, La/a5q0;-><init>(Landroid/graphics/drawable/Drawable;B)V

    .line 152
    .line 153
    .line 154
    new-instance v9, La/ugd;

    .line 155
    .line 156
    const v5, 0x41eeb29c

    .line 157
    .line 158
    .line 159
    invoke-direct {v9, v5, v10, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_5
    new-instance v5, La/h3q0;

    .line 163
    .line 164
    const/4 v7, 0x2

    .line 165
    invoke-direct {v5, v6, v7}, La/h3q0;-><init>(Ljava/lang/Object;B)V

    .line 166
    .line 167
    .line 168
    invoke-static {p1, v11, v9, v5, v8}, La/pje;->b(La/pje;Lkotlin/jvm/functions/Function2;La/ugd;Lkotlin/jvm/functions/Function0;I)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_6
    instance-of v5, v5, La/f5q0;

    .line 173
    .line 174
    if-eqz v5, :cond_7

    .line 175
    .line 176
    iget-object v5, p1, La/pje;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 177
    .line 178
    sget-object v6, La/ro4;->d:La/ugd;

    .line 179
    .line 180
    invoke-virtual {v5, v6}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    :cond_7
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 184
    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object p0
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/sw8;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, La/atk;

    .line 5
    .line 6
    iget-object v0, p0, La/sw8;->c:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v3, v0

    .line 9
    check-cast v3, La/npn;

    .line 10
    .line 11
    iget-object p0, p0, La/sw8;->d:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v4, p0

    .line 14
    check-cast v4, La/xah;

    .line 15
    .line 16
    check-cast p1, La/k0w0;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v1, La/xg0;

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    const/16 v6, 0x8

    .line 25
    .line 26
    invoke-direct/range {v1 .. v6}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 27
    .line 28
    .line 29
    new-instance p0, La/b1w0;

    .line 30
    .line 31
    invoke-direct {p0, v1}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, La/c8d;

    .line 41
    .line 42
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 43
    .line 44
    new-instance v0, La/v7d;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, La/sw8;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/szj0;

    .line 4
    .line 5
    iget-object v1, p0, La/sw8;->c:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/ebl;

    .line 9
    .line 10
    iget-object p0, p0, La/sw8;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 13
    .line 14
    check-cast p1, La/k0w0;

    .line 15
    .line 16
    iget-object v0, v0, La/szj0;->e:La/rzj0;

    .line 17
    .line 18
    sget-object v1, La/pzj0;->a:La/pzj0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v3, v2, La/ebl;->R:La/xpr;

    .line 27
    .line 28
    new-instance v4, La/vpr;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-direct {v4, v0}, La/vpr;-><init>(Z)V

    .line 32
    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x6

    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-static/range {v2 .. v7}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p0}, La/k0w0;->c(La/m7h0;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    sget-object v1, La/qzj0;->a:La/qzj0;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    iget-object v3, v2, La/ebl;->R:La/xpr;

    .line 53
    .line 54
    new-instance v4, La/vpr;

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    invoke-direct {v4, v0}, La/vpr;-><init>(Z)V

    .line 58
    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    const/4 v7, 0x6

    .line 62
    const/4 v5, 0x0

    .line 63
    invoke-static/range {v2 .. v7}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 67
    .line 68
    .line 69
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    return-object p0
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, La/sw8;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/vj30;

    .line 4
    .line 5
    iget-object v1, p0, La/sw8;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/rel;

    .line 8
    .line 9
    iget-object p0, p0, La/sw8;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/pu90;

    .line 12
    .line 13
    check-cast p1, La/ou90;

    .line 14
    .line 15
    invoke-interface {v0}, La/cnx;->M()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v2, v1, La/rel;->o:La/qv2;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2}, La/qv2;->j()La/no20;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v2, v1, La/rel;->o:La/qv2;

    .line 28
    .line 29
    iget-object v2, v2, La/qv2;->k:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, La/zbk;

    .line 32
    .line 33
    invoke-virtual {v2}, La/zbk;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v2}, La/no20;->d(Ljava/lang/Object;)F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v2}, La/qv2;->v()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    :goto_0
    iget-object v1, v1, La/rel;->q:La/ma80;

    .line 47
    .line 48
    sget-object v2, La/ma80;->b:La/ma80;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    if-ne v1, v2, :cond_1

    .line 52
    .line 53
    move v2, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v2, v3

    .line 56
    :goto_1
    sget-object v4, La/ma80;->a:La/ma80;

    .line 57
    .line 58
    if-ne v1, v4, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move v0, v3

    .line 62
    :goto_2
    const/4 v1, 0x1

    .line 63
    iput-boolean v1, p1, La/ou90;->a:Z

    .line 64
    .line 65
    invoke-static {v2}, La/si30;->b(F)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v0}, La/si30;->b(F)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-static {p1, p0, v1, v0}, La/ou90;->h(La/ou90;La/pu90;II)V

    .line 74
    .line 75
    .line 76
    const/4 p0, 0x0

    .line 77
    iput-boolean p0, p1, La/ou90;->a:Z

    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/sw8;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ov2;

    .line 4
    .line 5
    iget-object v1, p0, La/sw8;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/vel;

    .line 8
    .line 9
    iget-object p0, p0, La/sw8;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/ma80;

    .line 12
    .line 13
    check-cast p1, La/odl;

    .line 14
    .line 15
    iget-wide v2, p1, La/odl;->a:J

    .line 16
    .line 17
    iget-boolean p1, v1, La/vel;->o1:Z

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/high16 p1, -0x40800000    # -1.0f

    .line 22
    .line 23
    :goto_0
    invoke-static {p1, v2, v3}, La/ne60;->g(FJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    sget-object p1, La/uel;->a:La/bk9;

    .line 32
    .line 33
    sget-object p1, La/ma80;->a:La/ma80;

    .line 34
    .line 35
    if-ne p0, p1, :cond_1

    .line 36
    .line 37
    const-wide p0, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr p0, v1

    .line 43
    :goto_2
    long-to-int p0, p0

    .line 44
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    goto :goto_3

    .line 49
    :cond_1
    const/16 p0, 0x20

    .line 50
    .line 51
    shr-long p0, v1, p0

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :goto_3
    iget-byte p1, v0, La/ov2;->a:B

    .line 55
    .line 56
    packed-switch p1, :pswitch_data_0

    .line 57
    .line 58
    .line 59
    iget-object p1, v0, La/ov2;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, La/wtj;

    .line 62
    .line 63
    iget-object p1, p1, La/wtj;->a:La/ca6;

    .line 64
    .line 65
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p1, p0}, La/ca6;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    goto :goto_4

    .line 73
    :pswitch_0
    iget-object p1, v0, La/ov2;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, La/qv2;

    .line 76
    .line 77
    iget-object v0, p1, La/qv2;->n:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, La/mv2;

    .line 80
    .line 81
    invoke-virtual {p1, p0}, La/qv2;->u(F)F

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    invoke-static {v0, p0}, La/mv2;->a(La/mv2;F)V

    .line 86
    .line 87
    .line 88
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, La/sw8;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/eql;

    .line 4
    .line 5
    iget-object v1, p0, La/sw8;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    iget-object p0, p0, La/sw8;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 12
    .line 13
    check-cast p1, La/hcz;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, La/eql;->a:La/a4x;

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    new-instance v3, La/bzh;

    .line 25
    .line 26
    const/16 v4, 0x10

    .line 27
    .line 28
    invoke-direct {v3, v0, v4}, La/bzh;-><init>(Ljava/util/List;B)V

    .line 29
    .line 30
    .line 31
    new-instance v4, La/c8;

    .line 32
    .line 33
    const/16 v5, 0x12

    .line 34
    .line 35
    invoke-direct {v4, v0, v1, p0, v5}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    new-instance p0, La/ugd;

    .line 39
    .line 40
    const v0, 0x2fd4df92

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-direct {p0, v0, v1, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {p1, v2, v0, v3, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/sw8;->a:B

    .line 6
    .line 7
    const/16 v6, 0x17

    .line 8
    .line 9
    const/4 v8, 0x3

    .line 10
    const-wide/16 v10, 0x0

    .line 11
    .line 12
    const/4 v12, 0x2

    .line 13
    const v13, 0x799532c4

    .line 14
    .line 15
    .line 16
    const/4 v14, 0x0

    .line 17
    const/4 v15, 0x0

    .line 18
    const/4 v5, 0x1

    .line 19
    const/high16 v17, 0x3f000000    # 0.5f

    .line 20
    .line 21
    iget-object v7, v0, La/sw8;->d:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v3, v0, La/sw8;->c:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v4, v0, La/sw8;->b:Ljava/lang/Object;

    .line 26
    .line 27
    packed-switch v2, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 31
    .line 32
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 33
    .line 34
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 35
    .line 36
    move-object v0, v1

    .line 37
    check-cast v0, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    if-eq v0, v5, :cond_1

    .line 46
    .line 47
    if-eq v0, v12, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object v0

    .line 64
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/sw8;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0

    .line 69
    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/sw8;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0

    .line 74
    :pswitch_2
    invoke-direct/range {p0 .. p1}, La/sw8;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0

    .line 79
    :pswitch_3
    invoke-direct/range {p0 .. p1}, La/sw8;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0

    .line 84
    :pswitch_4
    invoke-direct/range {p0 .. p1}, La/sw8;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :pswitch_5
    invoke-direct/range {p0 .. p1}, La/sw8;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    return-object v0

    .line 94
    :pswitch_6
    check-cast v4, La/jie0;

    .line 95
    .line 96
    check-cast v3, La/qah0;

    .line 97
    .line 98
    check-cast v7, La/jie0;

    .line 99
    .line 100
    move-object v0, v1

    .line 101
    check-cast v0, La/i73;

    .line 102
    .line 103
    iget-object v1, v0, La/i73;->e:La/pz40;

    .line 104
    .line 105
    check-cast v1, La/hgk0;

    .line 106
    .line 107
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Ljava/lang/Number;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    iget v2, v4, La/jie0;->a:F

    .line 118
    .line 119
    sub-float/2addr v1, v2

    .line 120
    invoke-interface {v3, v1}, La/qah0;->a(F)F

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    iget-object v3, v0, La/i73;->e:La/pz40;

    .line 125
    .line 126
    check-cast v3, La/hgk0;

    .line 127
    .line 128
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Ljava/lang/Number;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    iput v3, v4, La/jie0;->a:F

    .line 139
    .line 140
    invoke-virtual {v0}, La/i73;->b()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    check-cast v3, Ljava/lang/Number;

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    iput v3, v7, La/jie0;->a:F

    .line 151
    .line 152
    sub-float/2addr v1, v2

    .line 153
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    cmpl-float v1, v1, v17

    .line 158
    .line 159
    if-lez v1, :cond_3

    .line 160
    .line 161
    invoke-virtual {v0}, La/i73;->a()V

    .line 162
    .line 163
    .line 164
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_7
    check-cast v4, La/ymx;

    .line 168
    .line 169
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 170
    .line 171
    check-cast v7, La/egk0;

    .line 172
    .line 173
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 174
    .line 175
    .line 176
    move-result-wide v5

    .line 177
    invoke-virtual {v7}, La/egk0;->l()J

    .line 178
    .line 179
    .line 180
    move-result-wide v8

    .line 181
    cmp-long v0, v8, v10

    .line 182
    .line 183
    if-eqz v0, :cond_4

    .line 184
    .line 185
    invoke-virtual {v7}, La/egk0;->l()J

    .line 186
    .line 187
    .line 188
    move-result-wide v8

    .line 189
    sub-long v8, v5, v8

    .line 190
    .line 191
    iget-short v0, v4, La/ymx;->a:S

    .line 192
    .line 193
    int-to-long v10, v0

    .line 194
    cmp-long v0, v8, v10

    .line 195
    .line 196
    if-lez v0, :cond_5

    .line 197
    .line 198
    :cond_4
    invoke-virtual {v7, v5, v6}, La/egk0;->m(J)V

    .line 199
    .line 200
    .line 201
    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object v0

    .line 207
    :pswitch_8
    check-cast v4, La/ocl;

    .line 208
    .line 209
    check-cast v3, La/wyu;

    .line 210
    .line 211
    check-cast v7, La/ctf0;

    .line 212
    .line 213
    move-object v0, v1

    .line 214
    check-cast v0, La/dwh;

    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    sget-object v1, La/uaq0;->a:La/s9m0;

    .line 220
    .line 221
    invoke-static {v3, v1}, La/h97;->A(La/wyu;La/s9m0;)Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    xor-int/2addr v1, v5

    .line 226
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    new-instance v16, La/zvh;

    .line 230
    .line 231
    const-wide/16 v2, 0x24

    .line 232
    .line 233
    invoke-static {v1, v2, v3}, La/p7x;->z(ZJ)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v17

    .line 237
    iget-object v1, v0, La/dwh;->f:La/mwh;

    .line 238
    .line 239
    iget-boolean v13, v0, La/dwh;->a:Z

    .line 240
    .line 241
    iget-object v2, v1, La/mwh;->a:La/b9a0;

    .line 242
    .line 243
    iget-object v3, v2, La/b9a0;->f:Ljava/lang/String;

    .line 244
    .line 245
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 246
    .line 247
    invoke-static {v3, v6, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    if-eqz v6, :cond_6

    .line 252
    .line 253
    :goto_1
    move-object/from16 v18, v3

    .line 254
    .line 255
    move-wide/from16 v22, v10

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-nez v6, :cond_7

    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_7
    sget-object v6, La/u0d;->a:Ljava/util/List;

    .line 266
    .line 267
    invoke-static {v3}, La/u0d;->c(Ljava/lang/String;)Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-eqz v6, :cond_8

    .line 272
    .line 273
    :goto_2
    const-string v3, ""

    .line 274
    .line 275
    goto :goto_1

    .line 276
    :cond_8
    const-string v6, "playerlogo/"

    .line 277
    .line 278
    invoke-static {v3, v6, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    if-eqz v6, :cond_9

    .line 283
    .line 284
    const-string v6, "%s/%s"

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_9
    const-string v6, "%s/playerlogo/%s"

    .line 288
    .line 289
    :goto_3
    sget-object v8, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 290
    .line 291
    move-wide/from16 v22, v10

    .line 292
    .line 293
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 294
    .line 295
    filled-new-array {v10, v3}, [Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    invoke-static {v3, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    invoke-static {v8, v6, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    move-object/from16 v18, v3

    .line 308
    .line 309
    :goto_4
    iget-object v1, v1, La/mwh;->b:Ljava/util/List;

    .line 310
    .line 311
    iget-object v3, v2, La/b9a0;->e:La/bre;

    .line 312
    .line 313
    iget-object v3, v3, La/bre;->b:Ljava/lang/String;

    .line 314
    .line 315
    const-string v6, "sfiles"

    .line 316
    .line 317
    const-string v8, "logo_teams"

    .line 318
    .line 319
    invoke-static {v6, v8, v3}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    iget-object v3, v3, La/bzu;->b:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v3, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v19

    .line 331
    iget-object v3, v2, La/b9a0;->b:Ljava/lang/String;

    .line 332
    .line 333
    iget-object v2, v2, La/b9a0;->e:La/bre;

    .line 334
    .line 335
    iget-object v2, v2, La/bre;->a:Ljava/lang/String;

    .line 336
    .line 337
    move-object/from16 v21, v2

    .line 338
    .line 339
    move-object/from16 v20, v3

    .line 340
    .line 341
    invoke-direct/range {v16 .. v21}, La/zvh;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    iget-boolean v2, v0, La/dwh;->c:Z

    .line 345
    .line 346
    if-eqz v2, :cond_a

    .line 347
    .line 348
    new-instance v0, La/fwh;

    .line 349
    .line 350
    sget-object v2, La/pb10;->g:La/pb10;

    .line 351
    .line 352
    const-wide/16 v10, 0x0

    .line 353
    .line 354
    const/16 v12, 0x25e

    .line 355
    .line 356
    const/4 v3, 0x0

    .line 357
    move-object v1, v4

    .line 358
    const/4 v4, 0x0

    .line 359
    const/4 v5, 0x0

    .line 360
    const v6, 0x7f130677

    .line 361
    .line 362
    .line 363
    const v7, 0x7f131690

    .line 364
    .line 365
    .line 366
    const-wide/16 v8, 0x2710

    .line 367
    .line 368
    move-object/from16 v14, v16

    .line 369
    .line 370
    invoke-static/range {v1 .. v12}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-direct {v0, v14, v13, v1}, La/fwh;-><init>(La/zvh;ZLa/mdm;)V

    .line 375
    .line 376
    .line 377
    goto/16 :goto_15

    .line 378
    .line 379
    :cond_a
    iget-boolean v2, v0, La/dwh;->d:Z

    .line 380
    .line 381
    if-eqz v2, :cond_b

    .line 382
    .line 383
    new-instance v0, La/fwh;

    .line 384
    .line 385
    sget-object v2, La/pb10;->g:La/pb10;

    .line 386
    .line 387
    const-wide/16 v10, 0x0

    .line 388
    .line 389
    const/16 v12, 0x3de

    .line 390
    .line 391
    const/4 v3, 0x0

    .line 392
    move-object v1, v4

    .line 393
    const/4 v4, 0x0

    .line 394
    const/4 v5, 0x0

    .line 395
    const v6, 0x7f130674

    .line 396
    .line 397
    .line 398
    const/4 v7, 0x0

    .line 399
    const-wide/16 v8, 0x0

    .line 400
    .line 401
    move-object/from16 v14, v16

    .line 402
    .line 403
    invoke-static/range {v1 .. v12}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    invoke-direct {v0, v14, v13, v1}, La/fwh;-><init>(La/zvh;ZLa/mdm;)V

    .line 408
    .line 409
    .line 410
    goto/16 :goto_15

    .line 411
    .line 412
    :cond_b
    move-object/from16 v2, v16

    .line 413
    .line 414
    iget-boolean v3, v0, La/dwh;->b:Z

    .line 415
    .line 416
    if-eqz v3, :cond_c

    .line 417
    .line 418
    new-instance v0, La/gwh;

    .line 419
    .line 420
    invoke-direct {v0, v2, v13}, La/gwh;-><init>(La/zvh;Z)V

    .line 421
    .line 422
    .line 423
    goto/16 :goto_15

    .line 424
    .line 425
    :cond_c
    iget-wide v3, v0, La/dwh;->e:J

    .line 426
    .line 427
    new-instance v6, Ljava/util/ArrayList;

    .line 428
    .line 429
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 430
    .line 431
    .line 432
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 433
    .line 434
    .line 435
    move-result v8

    .line 436
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 437
    .line 438
    .line 439
    move-result-object v28

    .line 440
    if-le v8, v5, :cond_d

    .line 441
    .line 442
    move v8, v5

    .line 443
    goto :goto_5

    .line 444
    :cond_d
    move v8, v14

    .line 445
    :goto_5
    if-eqz v8, :cond_f

    .line 446
    .line 447
    new-instance v24, La/lxl;

    .line 448
    .line 449
    new-instance v10, La/xxl;

    .line 450
    .line 451
    new-array v11, v14, [Ljava/lang/Object;

    .line 452
    .line 453
    iget-object v13, v7, La/ctf0;->b:La/lsm0;

    .line 454
    .line 455
    invoke-static {v11, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v11

    .line 459
    const v14, 0x7f13138a

    .line 460
    .line 461
    .line 462
    invoke-virtual {v13, v14, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v11

    .line 466
    invoke-direct {v10, v11}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    cmp-long v11, v3, v22

    .line 470
    .line 471
    if-nez v11, :cond_e

    .line 472
    .line 473
    sget-object v11, La/uxl;->b:La/uxl;

    .line 474
    .line 475
    :goto_6
    move-object/from16 v30, v11

    .line 476
    .line 477
    goto :goto_7

    .line 478
    :cond_e
    sget-object v11, La/uxl;->a:La/uxl;

    .line 479
    .line 480
    goto :goto_6

    .line 481
    :goto_7
    const/16 v31, 0x0

    .line 482
    .line 483
    const-wide/16 v25, 0x0

    .line 484
    .line 485
    const/16 v29, 0x0

    .line 486
    .line 487
    move-object/from16 v27, v10

    .line 488
    .line 489
    invoke-direct/range {v24 .. v31}, La/lxl;-><init>(JLa/dyl;Ljava/lang/Integer;ZLa/uxl;La/cwl;)V

    .line 490
    .line 491
    .line 492
    move-object/from16 v10, v24

    .line 493
    .line 494
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    :cond_f
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 498
    .line 499
    .line 500
    move-result-object v10

    .line 501
    const/4 v11, 0x0

    .line 502
    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 503
    .line 504
    .line 505
    move-result v13

    .line 506
    if-eqz v13, :cond_13

    .line 507
    .line 508
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v13

    .line 512
    add-int/lit8 v14, v11, 0x1

    .line 513
    .line 514
    if-ltz v11, :cond_12

    .line 515
    .line 516
    check-cast v13, La/mvh;

    .line 517
    .line 518
    if-eqz v8, :cond_10

    .line 519
    .line 520
    move v11, v14

    .line 521
    :cond_10
    new-instance v24, La/lxl;

    .line 522
    .line 523
    move-object/from16 p0, v10

    .line 524
    .line 525
    int-to-long v9, v11

    .line 526
    new-instance v11, La/xxl;

    .line 527
    .line 528
    iget-object v13, v13, La/mvh;->b:Ljava/lang/String;

    .line 529
    .line 530
    invoke-direct {v11, v13}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    cmp-long v13, v3, v9

    .line 534
    .line 535
    if-nez v13, :cond_11

    .line 536
    .line 537
    sget-object v13, La/uxl;->b:La/uxl;

    .line 538
    .line 539
    :goto_9
    move-object/from16 v30, v13

    .line 540
    .line 541
    goto :goto_a

    .line 542
    :cond_11
    sget-object v13, La/uxl;->a:La/uxl;

    .line 543
    .line 544
    goto :goto_9

    .line 545
    :goto_a
    const/16 v31, 0x0

    .line 546
    .line 547
    const/16 v29, 0x0

    .line 548
    .line 549
    move-wide/from16 v25, v9

    .line 550
    .line 551
    move-object/from16 v27, v11

    .line 552
    .line 553
    invoke-direct/range {v24 .. v31}, La/lxl;-><init>(JLa/dyl;Ljava/lang/Integer;ZLa/uxl;La/cwl;)V

    .line 554
    .line 555
    .line 556
    move-object/from16 v9, v24

    .line 557
    .line 558
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-object/from16 v10, p0

    .line 562
    .line 563
    move v11, v14

    .line 564
    goto :goto_8

    .line 565
    :cond_12
    invoke-static {}, La/q3d;->p()V

    .line 566
    .line 567
    .line 568
    throw v15

    .line 569
    :cond_13
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 570
    .line 571
    .line 572
    move-result-object v19

    .line 573
    iget-boolean v3, v0, La/dwh;->a:Z

    .line 574
    .line 575
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 576
    .line 577
    .line 578
    move-result v4

    .line 579
    if-le v4, v5, :cond_14

    .line 580
    .line 581
    move v4, v5

    .line 582
    goto :goto_b

    .line 583
    :cond_14
    const/4 v4, 0x0

    .line 584
    :goto_b
    new-instance v6, Ljava/util/ArrayList;

    .line 585
    .line 586
    const/16 v8, 0xa

    .line 587
    .line 588
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 589
    .line 590
    .line 591
    move-result v9

    .line 592
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 593
    .line 594
    .line 595
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 600
    .line 601
    .line 602
    move-result v9

    .line 603
    if-eqz v9, :cond_1c

    .line 604
    .line 605
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v9

    .line 609
    check-cast v9, La/mvh;

    .line 610
    .line 611
    iget-object v9, v9, La/mvh;->a:Ljava/util/List;

    .line 612
    .line 613
    new-instance v10, Ljava/util/ArrayList;

    .line 614
    .line 615
    invoke-static {v9, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 616
    .line 617
    .line 618
    move-result v11

    .line 619
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 620
    .line 621
    .line 622
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 623
    .line 624
    .line 625
    move-result-object v8

    .line 626
    :goto_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 627
    .line 628
    .line 629
    move-result v9

    .line 630
    if-eqz v9, :cond_1b

    .line 631
    .line 632
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v9

    .line 636
    check-cast v9, La/s8g0;

    .line 637
    .line 638
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    iget-wide v13, v9, La/s8g0;->a:J

    .line 642
    .line 643
    move-object/from16 p0, v6

    .line 644
    .line 645
    iget-wide v5, v9, La/s8g0;->b:J

    .line 646
    .line 647
    cmp-long v16, v13, v22

    .line 648
    .line 649
    const/16 v11, 0x3c

    .line 650
    .line 651
    if-eqz v16, :cond_15

    .line 652
    .line 653
    cmp-long v17, v5, v22

    .line 654
    .line 655
    if-eqz v17, :cond_15

    .line 656
    .line 657
    sget-object v16, La/rdj;->a:La/rdj;

    .line 658
    .line 659
    new-instance v12, La/znq0;

    .line 660
    .line 661
    invoke-direct {v12, v13, v14}, La/znq0;-><init>(J)V

    .line 662
    .line 663
    .line 664
    sget-object v13, La/sdj;->b:La/sdj;

    .line 665
    .line 666
    invoke-static {v12, v13, v15, v11}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v12

    .line 670
    new-instance v14, La/znq0;

    .line 671
    .line 672
    invoke-direct {v14, v5, v6}, La/znq0;-><init>(J)V

    .line 673
    .line 674
    .line 675
    invoke-static {v14, v13, v15, v11}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v5

    .line 679
    const-string v6, " - "

    .line 680
    .line 681
    invoke-static {v12, v6, v5}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v5

    .line 685
    :goto_e
    move-object/from16 v26, v5

    .line 686
    .line 687
    goto :goto_f

    .line 688
    :cond_15
    if-eqz v16, :cond_16

    .line 689
    .line 690
    sget-object v5, La/rdj;->a:La/rdj;

    .line 691
    .line 692
    new-instance v5, La/znq0;

    .line 693
    .line 694
    invoke-direct {v5, v13, v14}, La/znq0;-><init>(J)V

    .line 695
    .line 696
    .line 697
    sget-object v6, La/sdj;->b:La/sdj;

    .line 698
    .line 699
    invoke-static {v5, v6, v15, v11}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v5

    .line 703
    goto :goto_e

    .line 704
    :cond_16
    cmp-long v12, v5, v22

    .line 705
    .line 706
    if-eqz v12, :cond_17

    .line 707
    .line 708
    sget-object v12, La/rdj;->a:La/rdj;

    .line 709
    .line 710
    new-instance v12, La/znq0;

    .line 711
    .line 712
    invoke-direct {v12, v5, v6}, La/znq0;-><init>(J)V

    .line 713
    .line 714
    .line 715
    sget-object v5, La/sdj;->b:La/sdj;

    .line 716
    .line 717
    invoke-static {v12, v5, v15, v11}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v5

    .line 721
    goto :goto_e

    .line 722
    :cond_17
    const-string v5, "-"

    .line 723
    .line 724
    goto :goto_e

    .line 725
    :goto_f
    iget v5, v9, La/s8g0;->c:I

    .line 726
    .line 727
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v27

    .line 731
    iget-object v5, v9, La/s8g0;->d:La/lho;

    .line 732
    .line 733
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 734
    .line 735
    .line 736
    move-result v5

    .line 737
    const/4 v11, 0x1

    .line 738
    if-eq v5, v11, :cond_19

    .line 739
    .line 740
    const/4 v6, 0x2

    .line 741
    if-eq v5, v6, :cond_18

    .line 742
    .line 743
    const v5, 0x7f130920

    .line 744
    .line 745
    .line 746
    :goto_10
    const/4 v6, 0x0

    .line 747
    goto :goto_11

    .line 748
    :cond_18
    const v5, 0x7f130b37

    .line 749
    .line 750
    .line 751
    goto :goto_10

    .line 752
    :cond_19
    const v5, 0x7f130b2c

    .line 753
    .line 754
    .line 755
    goto :goto_10

    .line 756
    :goto_11
    new-array v12, v6, [Ljava/lang/Object;

    .line 757
    .line 758
    iget-object v13, v7, La/ctf0;->b:La/lsm0;

    .line 759
    .line 760
    invoke-static {v12, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v12

    .line 764
    invoke-virtual {v13, v5, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v28

    .line 768
    iget-object v5, v9, La/s8g0;->e:Ljava/lang/String;

    .line 769
    .line 770
    iget-object v6, v9, La/s8g0;->f:Ljava/lang/String;

    .line 771
    .line 772
    iget-object v9, v9, La/s8g0;->g:Ljava/util/List;

    .line 773
    .line 774
    new-instance v12, Ljava/util/ArrayList;

    .line 775
    .line 776
    const/16 v13, 0xa

    .line 777
    .line 778
    invoke-static {v9, v13}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 779
    .line 780
    .line 781
    move-result v14

    .line 782
    invoke-direct {v12, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 783
    .line 784
    .line 785
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 786
    .line 787
    .line 788
    move-result-object v9

    .line 789
    :goto_12
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 790
    .line 791
    .line 792
    move-result v13

    .line 793
    if-eqz v13, :cond_1a

    .line 794
    .line 795
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v13

    .line 799
    check-cast v13, La/c6u0;

    .line 800
    .line 801
    invoke-static {v13}, La/ckb;->d0(La/c6u0;)La/euh;

    .line 802
    .line 803
    .line 804
    move-result-object v13

    .line 805
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    goto :goto_12

    .line 809
    :cond_1a
    invoke-static {v12}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 810
    .line 811
    .line 812
    move-result-object v31

    .line 813
    new-instance v25, La/fuh;

    .line 814
    .line 815
    move-object/from16 v29, v5

    .line 816
    .line 817
    move-object/from16 v30, v6

    .line 818
    .line 819
    invoke-direct/range {v25 .. v31}, La/fuh;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4x;)V

    .line 820
    .line 821
    .line 822
    move-object/from16 v5, v25

    .line 823
    .line 824
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 825
    .line 826
    .line 827
    const/4 v5, 0x1

    .line 828
    const/4 v12, 0x2

    .line 829
    move-object/from16 v6, p0

    .line 830
    .line 831
    goto/16 :goto_d

    .line 832
    .line 833
    :cond_1b
    move-object/from16 p0, v6

    .line 834
    .line 835
    invoke-static {v10}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 836
    .line 837
    .line 838
    move-result-object v5

    .line 839
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 840
    .line 841
    .line 842
    const/4 v5, 0x1

    .line 843
    const/16 v8, 0xa

    .line 844
    .line 845
    const/4 v12, 0x2

    .line 846
    goto/16 :goto_c

    .line 847
    .line 848
    :cond_1c
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 849
    .line 850
    .line 851
    move-result-object v1

    .line 852
    if-nez v4, :cond_1d

    .line 853
    .line 854
    :goto_13
    move-object/from16 v20, v1

    .line 855
    .line 856
    goto :goto_14

    .line 857
    :cond_1d
    new-instance v4, Ljava/util/ArrayList;

    .line 858
    .line 859
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 860
    .line 861
    .line 862
    invoke-static {v1}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 863
    .line 864
    .line 865
    move-result-object v5

    .line 866
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 867
    .line 868
    .line 869
    move-result-object v5

    .line 870
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 871
    .line 872
    .line 873
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 874
    .line 875
    .line 876
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    goto :goto_13

    .line 881
    :goto_14
    iget-wide v0, v0, La/dwh;->e:J

    .line 882
    .line 883
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 884
    .line 885
    .line 886
    move-result v23

    .line 887
    new-instance v16, La/ewh;

    .line 888
    .line 889
    move-wide/from16 v21, v0

    .line 890
    .line 891
    move-object/from16 v17, v2

    .line 892
    .line 893
    move/from16 v18, v3

    .line 894
    .line 895
    invoke-direct/range {v16 .. v23}, La/ewh;-><init>(La/zvh;ZLa/a4x;La/a4x;JI)V

    .line 896
    .line 897
    .line 898
    move-object/from16 v0, v16

    .line 899
    .line 900
    :goto_15
    return-object v0

    .line 901
    :pswitch_9
    check-cast v4, La/ctf0;

    .line 902
    .line 903
    check-cast v3, La/y78;

    .line 904
    .line 905
    check-cast v7, La/r9u;

    .line 906
    .line 907
    move-object v0, v1

    .line 908
    check-cast v0, La/ubh;

    .line 909
    .line 910
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    new-instance v0, La/l7h;

    .line 914
    .line 915
    sget-object v1, La/ygp;->t:La/ygp;

    .line 916
    .line 917
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 918
    .line 919
    .line 920
    iget-object v2, v7, La/r9u;->a:La/j1q0;

    .line 921
    .line 922
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 926
    .line 927
    invoke-virtual {v2, v1}, La/m1q0;->d(La/ygp;)Z

    .line 928
    .line 929
    .line 930
    move-result v1

    .line 931
    invoke-direct {v0, v4, v3, v1}, La/l7h;-><init>(La/ctf0;La/y78;Z)V

    .line 932
    .line 933
    .line 934
    return-object v0

    .line 935
    :pswitch_a
    check-cast v4, La/a4x;

    .line 936
    .line 937
    check-cast v3, La/djg;

    .line 938
    .line 939
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 940
    .line 941
    move-object v0, v1

    .line 942
    check-cast v0, La/hcz;

    .line 943
    .line 944
    sget-object v1, La/djg;->n2:La/kwd;

    .line 945
    .line 946
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 947
    .line 948
    .line 949
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 950
    .line 951
    .line 952
    move-result v1

    .line 953
    new-instance v2, La/dx8;

    .line 954
    .line 955
    invoke-direct {v2, v4, v6}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 956
    .line 957
    .line 958
    new-instance v5, La/gq4;

    .line 959
    .line 960
    invoke-direct {v5, v4, v3, v7, v4}, La/gq4;-><init>(Ljava/util/List;La/djg;Lkotlin/jvm/functions/Function1;La/a4x;)V

    .line 961
    .line 962
    .line 963
    new-instance v3, La/ugd;

    .line 964
    .line 965
    const/4 v11, 0x1

    .line 966
    invoke-direct {v3, v13, v11, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 967
    .line 968
    .line 969
    invoke-virtual {v0, v1, v15, v2, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 970
    .line 971
    .line 972
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 973
    .line 974
    return-object v0

    .line 975
    :pswitch_b
    check-cast v4, Ljava/lang/String;

    .line 976
    .line 977
    check-cast v3, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;

    .line 978
    .line 979
    check-cast v7, La/zb1;

    .line 980
    .line 981
    move-object v0, v1

    .line 982
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 983
    .line 984
    invoke-static {v4, v3, v7, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;->v(Ljava/lang/String;Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;La/zb1;Landroid/graphics/drawable/Drawable;)Lkotlin/Unit;

    .line 985
    .line 986
    .line 987
    move-result-object v0

    .line 988
    return-object v0

    .line 989
    :pswitch_c
    check-cast v4, La/szj0;

    .line 990
    .line 991
    check-cast v3, La/rnf;

    .line 992
    .line 993
    check-cast v7, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 994
    .line 995
    move-object v0, v1

    .line 996
    check-cast v0, La/k0w0;

    .line 997
    .line 998
    iget-object v1, v4, La/szj0;->e:La/rzj0;

    .line 999
    .line 1000
    sget-object v2, La/pzj0;->a:La/pzj0;

    .line 1001
    .line 1002
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1003
    .line 1004
    .line 1005
    move-result v2

    .line 1006
    if-eqz v2, :cond_1e

    .line 1007
    .line 1008
    iget-object v1, v3, La/rnf;->S:La/xpr;

    .line 1009
    .line 1010
    new-instance v2, La/vpr;

    .line 1011
    .line 1012
    const/4 v6, 0x0

    .line 1013
    invoke-direct {v2, v6}, La/vpr;-><init>(Z)V

    .line 1014
    .line 1015
    .line 1016
    const/16 v25, 0x0

    .line 1017
    .line 1018
    const/16 v26, 0x6

    .line 1019
    .line 1020
    const/16 v24, 0x0

    .line 1021
    .line 1022
    move-object/from16 v22, v1

    .line 1023
    .line 1024
    move-object/from16 v23, v2

    .line 1025
    .line 1026
    move-object/from16 v21, v3

    .line 1027
    .line 1028
    invoke-static/range {v21 .. v26}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v0, v7}, La/k0w0;->c(La/m7h0;)V

    .line 1032
    .line 1033
    .line 1034
    goto :goto_16

    .line 1035
    :cond_1e
    sget-object v2, La/qzj0;->a:La/qzj0;

    .line 1036
    .line 1037
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1038
    .line 1039
    .line 1040
    move-result v1

    .line 1041
    if-eqz v1, :cond_1f

    .line 1042
    .line 1043
    iget-object v1, v3, La/rnf;->S:La/xpr;

    .line 1044
    .line 1045
    new-instance v2, La/vpr;

    .line 1046
    .line 1047
    const/4 v11, 0x1

    .line 1048
    invoke-direct {v2, v11}, La/vpr;-><init>(Z)V

    .line 1049
    .line 1050
    .line 1051
    const/16 v25, 0x0

    .line 1052
    .line 1053
    const/16 v26, 0x6

    .line 1054
    .line 1055
    const/16 v24, 0x0

    .line 1056
    .line 1057
    move-object/from16 v22, v1

    .line 1058
    .line 1059
    move-object/from16 v23, v2

    .line 1060
    .line 1061
    move-object/from16 v21, v3

    .line 1062
    .line 1063
    invoke-static/range {v21 .. v26}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v0, v7}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1067
    .line 1068
    .line 1069
    :goto_16
    sget-object v15, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1070
    .line 1071
    goto :goto_17

    .line 1072
    :cond_1f
    invoke-static {}, La/t9f;->b()V

    .line 1073
    .line 1074
    .line 1075
    :goto_17
    return-object v15

    .line 1076
    :pswitch_d
    check-cast v4, La/jzj;

    .line 1077
    .line 1078
    check-cast v3, La/odd;

    .line 1079
    .line 1080
    check-cast v7, La/t9r0;

    .line 1081
    .line 1082
    move-object v0, v1

    .line 1083
    check-cast v0, Ljava/lang/Throwable;

    .line 1084
    .line 1085
    if-eqz v0, :cond_21

    .line 1086
    .line 1087
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 1088
    .line 1089
    if-eqz v1, :cond_20

    .line 1090
    .line 1091
    check-cast v0, Ljava/util/concurrent/CancellationException;

    .line 1092
    .line 1093
    invoke-virtual {v3, v0}, La/pby;->s(Ljava/lang/Throwable;)V

    .line 1094
    .line 1095
    .line 1096
    goto :goto_18

    .line 1097
    :cond_20
    invoke-virtual {v3, v0}, La/odd;->b0(Ljava/lang/Throwable;)Z

    .line 1098
    .line 1099
    .line 1100
    goto :goto_18

    .line 1101
    :cond_21
    invoke-interface {v4}, La/jzj;->getCompleted()Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    invoke-virtual {v7, v0}, La/t9r0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v0

    .line 1109
    invoke-virtual {v3, v0}, La/pby;->N(Ljava/lang/Object;)Z

    .line 1110
    .line 1111
    .line 1112
    :goto_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1113
    .line 1114
    return-object v0

    .line 1115
    :pswitch_e
    move-wide/from16 v22, v10

    .line 1116
    .line 1117
    sget-object v0, La/pek0;->d:La/pek0;

    .line 1118
    .line 1119
    check-cast v4, La/djz;

    .line 1120
    .line 1121
    check-cast v3, La/a8q0;

    .line 1122
    .line 1123
    check-cast v7, La/qe60;

    .line 1124
    .line 1125
    check-cast v1, La/fhl;

    .line 1126
    .line 1127
    invoke-virtual {v4}, La/djz;->d()La/b9q0;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v2

    .line 1131
    if-eqz v2, :cond_31

    .line 1132
    .line 1133
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v1

    .line 1137
    invoke-virtual {v1}, La/nr;->i()La/x5a;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v1

    .line 1141
    iget-object v5, v4, La/djz;->A:La/pz40;

    .line 1142
    .line 1143
    check-cast v5, La/hgk0;

    .line 1144
    .line 1145
    invoke-virtual {v5}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v5

    .line 1149
    check-cast v5, La/o9q0;

    .line 1150
    .line 1151
    iget-wide v5, v5, La/o9q0;->a:J

    .line 1152
    .line 1153
    iget-object v9, v4, La/djz;->B:La/pz40;

    .line 1154
    .line 1155
    check-cast v9, La/hgk0;

    .line 1156
    .line 1157
    invoke-virtual {v9}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v9

    .line 1161
    check-cast v9, La/o9q0;

    .line 1162
    .line 1163
    iget-wide v9, v9, La/o9q0;->a:J

    .line 1164
    .line 1165
    iget-object v2, v2, La/b9q0;->a:La/a9q0;

    .line 1166
    .line 1167
    iget-object v12, v2, La/a9q0;->b:La/bw40;

    .line 1168
    .line 1169
    iget-object v13, v2, La/a9q0;->a:La/z8q0;

    .line 1170
    .line 1171
    iget-object v14, v4, La/djz;->y:La/ucs0;

    .line 1172
    .line 1173
    move-object/from16 v24, v12

    .line 1174
    .line 1175
    iget-wide v11, v4, La/djz;->z:J

    .line 1176
    .line 1177
    invoke-static {v5, v6}, La/o9q0;->c(J)Z

    .line 1178
    .line 1179
    .line 1180
    move-result v4

    .line 1181
    if-nez v4, :cond_22

    .line 1182
    .line 1183
    invoke-virtual {v14, v11, v12}, La/ucs0;->s(J)V

    .line 1184
    .line 1185
    .line 1186
    invoke-static {v5, v6}, La/o9q0;->f(J)I

    .line 1187
    .line 1188
    .line 1189
    move-result v3

    .line 1190
    invoke-interface {v7, v3}, La/qe60;->s(I)I

    .line 1191
    .line 1192
    .line 1193
    move-result v3

    .line 1194
    invoke-static {v5, v6}, La/o9q0;->e(J)I

    .line 1195
    .line 1196
    .line 1197
    move-result v4

    .line 1198
    invoke-interface {v7, v4}, La/qe60;->s(I)I

    .line 1199
    .line 1200
    .line 1201
    move-result v4

    .line 1202
    if-eq v3, v4, :cond_26

    .line 1203
    .line 1204
    invoke-virtual {v2, v3, v4}, La/a9q0;->k(II)La/w03;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v3

    .line 1208
    invoke-interface {v1, v3, v14}, La/x5a;->p(La/w03;La/ucs0;)V

    .line 1209
    .line 1210
    .line 1211
    goto/16 :goto_1b

    .line 1212
    .line 1213
    :cond_22
    invoke-static {v9, v10}, La/o9q0;->c(J)Z

    .line 1214
    .line 1215
    .line 1216
    move-result v4

    .line 1217
    if-nez v4, :cond_25

    .line 1218
    .line 1219
    iget-object v3, v13, La/z8q0;->b:La/y9q0;

    .line 1220
    .line 1221
    invoke-virtual {v3}, La/y9q0;->b()J

    .line 1222
    .line 1223
    .line 1224
    move-result-wide v3

    .line 1225
    new-instance v5, La/y3d;

    .line 1226
    .line 1227
    invoke-direct {v5, v3, v4}, La/y3d;-><init>(J)V

    .line 1228
    .line 1229
    .line 1230
    const-wide/16 v11, 0x10

    .line 1231
    .line 1232
    cmp-long v3, v3, v11

    .line 1233
    .line 1234
    if-nez v3, :cond_23

    .line 1235
    .line 1236
    goto :goto_19

    .line 1237
    :cond_23
    move-object v15, v5

    .line 1238
    :goto_19
    if-eqz v15, :cond_24

    .line 1239
    .line 1240
    iget-wide v3, v15, La/y3d;->a:J

    .line 1241
    .line 1242
    goto :goto_1a

    .line 1243
    :cond_24
    sget-wide v3, La/y3d;->b:J

    .line 1244
    .line 1245
    :goto_1a
    invoke-static {v3, v4}, La/y3d;->d(J)F

    .line 1246
    .line 1247
    .line 1248
    move-result v5

    .line 1249
    const v6, 0x3e4ccccd    # 0.2f

    .line 1250
    .line 1251
    .line 1252
    mul-float/2addr v5, v6

    .line 1253
    invoke-static {v5, v3, v4}, La/y3d;->c(FJ)J

    .line 1254
    .line 1255
    .line 1256
    move-result-wide v3

    .line 1257
    invoke-virtual {v14, v3, v4}, La/ucs0;->s(J)V

    .line 1258
    .line 1259
    .line 1260
    invoke-static {v9, v10}, La/o9q0;->f(J)I

    .line 1261
    .line 1262
    .line 1263
    move-result v3

    .line 1264
    invoke-interface {v7, v3}, La/qe60;->s(I)I

    .line 1265
    .line 1266
    .line 1267
    move-result v3

    .line 1268
    invoke-static {v9, v10}, La/o9q0;->e(J)I

    .line 1269
    .line 1270
    .line 1271
    move-result v4

    .line 1272
    invoke-interface {v7, v4}, La/qe60;->s(I)I

    .line 1273
    .line 1274
    .line 1275
    move-result v4

    .line 1276
    if-eq v3, v4, :cond_26

    .line 1277
    .line 1278
    invoke-virtual {v2, v3, v4}, La/a9q0;->k(II)La/w03;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v3

    .line 1282
    invoke-interface {v1, v3, v14}, La/x5a;->p(La/w03;La/ucs0;)V

    .line 1283
    .line 1284
    .line 1285
    goto :goto_1b

    .line 1286
    :cond_25
    iget-wide v4, v3, La/a8q0;->b:J

    .line 1287
    .line 1288
    invoke-static {v4, v5}, La/o9q0;->c(J)Z

    .line 1289
    .line 1290
    .line 1291
    move-result v4

    .line 1292
    if-nez v4, :cond_26

    .line 1293
    .line 1294
    invoke-virtual {v14, v11, v12}, La/ucs0;->s(J)V

    .line 1295
    .line 1296
    .line 1297
    iget-wide v3, v3, La/a8q0;->b:J

    .line 1298
    .line 1299
    invoke-static {v3, v4}, La/o9q0;->f(J)I

    .line 1300
    .line 1301
    .line 1302
    move-result v5

    .line 1303
    invoke-interface {v7, v5}, La/qe60;->s(I)I

    .line 1304
    .line 1305
    .line 1306
    move-result v5

    .line 1307
    invoke-static {v3, v4}, La/o9q0;->e(J)I

    .line 1308
    .line 1309
    .line 1310
    move-result v3

    .line 1311
    invoke-interface {v7, v3}, La/qe60;->s(I)I

    .line 1312
    .line 1313
    .line 1314
    move-result v3

    .line 1315
    if-eq v5, v3, :cond_26

    .line 1316
    .line 1317
    invoke-virtual {v2, v5, v3}, La/a9q0;->k(II)La/w03;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v3

    .line 1321
    invoke-interface {v1, v3, v14}, La/x5a;->p(La/w03;La/ucs0;)V

    .line 1322
    .line 1323
    .line 1324
    :cond_26
    :goto_1b
    invoke-virtual {v2}, La/a9q0;->f()Z

    .line 1325
    .line 1326
    .line 1327
    move-result v3

    .line 1328
    if-eqz v3, :cond_28

    .line 1329
    .line 1330
    iget v3, v13, La/z8q0;->f:I

    .line 1331
    .line 1332
    if-ne v3, v8, :cond_27

    .line 1333
    .line 1334
    goto :goto_1c

    .line 1335
    :cond_27
    const/4 v14, 0x1

    .line 1336
    goto :goto_1d

    .line 1337
    :cond_28
    :goto_1c
    const/4 v14, 0x0

    .line 1338
    :goto_1d
    if-eqz v14, :cond_29

    .line 1339
    .line 1340
    iget-wide v2, v2, La/a9q0;->c:J

    .line 1341
    .line 1342
    const/16 v4, 0x20

    .line 1343
    .line 1344
    shr-long v5, v2, v4

    .line 1345
    .line 1346
    long-to-int v5, v5

    .line 1347
    int-to-float v5, v5

    .line 1348
    const-wide v6, 0xffffffffL

    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    and-long/2addr v2, v6

    .line 1354
    long-to-int v2, v2

    .line 1355
    int-to-float v2, v2

    .line 1356
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1357
    .line 1358
    .line 1359
    move-result v3

    .line 1360
    int-to-long v8, v3

    .line 1361
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1362
    .line 1363
    .line 1364
    move-result v2

    .line 1365
    int-to-long v2, v2

    .line 1366
    shl-long v4, v8, v4

    .line 1367
    .line 1368
    and-long/2addr v2, v6

    .line 1369
    or-long/2addr v2, v4

    .line 1370
    move-wide/from16 v4, v22

    .line 1371
    .line 1372
    invoke-static {v4, v5, v2, v3}, La/k9x;->r(JJ)La/jge0;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v2

    .line 1376
    invoke-interface {v1}, La/x5a;->l()V

    .line 1377
    .line 1378
    .line 1379
    invoke-static {v1, v2}, La/x5a;->h(La/x5a;La/jge0;)V

    .line 1380
    .line 1381
    .line 1382
    :cond_29
    iget-object v2, v13, La/z8q0;->b:La/y9q0;

    .line 1383
    .line 1384
    iget-object v2, v2, La/y9q0;->a:La/smk0;

    .line 1385
    .line 1386
    iget-object v3, v2, La/smk0;->m:La/k5q0;

    .line 1387
    .line 1388
    iget-object v4, v2, La/smk0;->a:La/e8q0;

    .line 1389
    .line 1390
    if-nez v3, :cond_2a

    .line 1391
    .line 1392
    sget-object v3, La/k5q0;->b:La/k5q0;

    .line 1393
    .line 1394
    :cond_2a
    move-object/from16 v29, v3

    .line 1395
    .line 1396
    iget-object v3, v2, La/smk0;->n:La/ljj0;

    .line 1397
    .line 1398
    if-nez v3, :cond_2b

    .line 1399
    .line 1400
    sget-object v3, La/ljj0;->d:La/ljj0;

    .line 1401
    .line 1402
    :cond_2b
    move-object/from16 v28, v3

    .line 1403
    .line 1404
    iget-object v2, v2, La/smk0;->o:La/agc;

    .line 1405
    .line 1406
    if-nez v2, :cond_2c

    .line 1407
    .line 1408
    sget-object v2, La/l0q;->a:La/l0q;

    .line 1409
    .line 1410
    :cond_2c
    move-object/from16 v30, v2

    .line 1411
    .line 1412
    :try_start_0
    invoke-interface {v4}, La/e8q0;->l()La/t89;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v26

    .line 1416
    if-eqz v26, :cond_2e

    .line 1417
    .line 1418
    if-eq v4, v0, :cond_2d

    .line 1419
    .line 1420
    invoke-interface {v4}, La/e8q0;->g()F

    .line 1421
    .line 1422
    .line 1423
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1424
    move/from16 v27, v5

    .line 1425
    .line 1426
    :goto_1e
    move-object/from16 v25, v1

    .line 1427
    .line 1428
    goto :goto_1f

    .line 1429
    :catchall_0
    move-exception v0

    .line 1430
    move-object/from16 v25, v1

    .line 1431
    .line 1432
    goto :goto_23

    .line 1433
    :cond_2d
    const/high16 v27, 0x3f800000    # 1.0f

    .line 1434
    .line 1435
    goto :goto_1e

    .line 1436
    :goto_1f
    :try_start_1
    invoke-static/range {v24 .. v30}, La/x8f;->X(La/bw40;La/x5a;La/t89;FLa/ljj0;La/k5q0;La/agc;)V

    .line 1437
    .line 1438
    .line 1439
    goto :goto_22

    .line 1440
    :catchall_1
    move-exception v0

    .line 1441
    goto :goto_23

    .line 1442
    :cond_2e
    move-object/from16 v25, v1

    .line 1443
    .line 1444
    if-eq v4, v0, :cond_2f

    .line 1445
    .line 1446
    invoke-interface {v4}, La/e8q0;->h()J

    .line 1447
    .line 1448
    .line 1449
    move-result-wide v0

    .line 1450
    :goto_20
    move-wide/from16 v26, v0

    .line 1451
    .line 1452
    goto :goto_21

    .line 1453
    :cond_2f
    sget-wide v0, La/y3d;->b:J

    .line 1454
    .line 1455
    goto :goto_20

    .line 1456
    :goto_21
    invoke-virtual/range {v24 .. v30}, La/bw40;->i(La/x5a;JLa/ljj0;La/k5q0;La/agc;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1457
    .line 1458
    .line 1459
    :goto_22
    if-eqz v14, :cond_31

    .line 1460
    .line 1461
    invoke-interface/range {v25 .. v25}, La/x5a;->i()V

    .line 1462
    .line 1463
    .line 1464
    goto :goto_24

    .line 1465
    :goto_23
    if-eqz v14, :cond_30

    .line 1466
    .line 1467
    invoke-interface/range {v25 .. v25}, La/x5a;->i()V

    .line 1468
    .line 1469
    .line 1470
    :cond_30
    throw v0

    .line 1471
    :cond_31
    :goto_24
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1472
    .line 1473
    return-object v0

    .line 1474
    :pswitch_f
    check-cast v4, La/a4x;

    .line 1475
    .line 1476
    check-cast v3, La/l7m0;

    .line 1477
    .line 1478
    check-cast v7, La/cgk0;

    .line 1479
    .line 1480
    move-object v0, v1

    .line 1481
    check-cast v0, La/hcz;

    .line 1482
    .line 1483
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1484
    .line 1485
    .line 1486
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1487
    .line 1488
    .line 1489
    move-result v1

    .line 1490
    new-instance v2, La/dx8;

    .line 1491
    .line 1492
    const/16 v5, 0x14

    .line 1493
    .line 1494
    invoke-direct {v2, v4, v5}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 1495
    .line 1496
    .line 1497
    new-instance v5, La/c8;

    .line 1498
    .line 1499
    const/16 v6, 0xe

    .line 1500
    .line 1501
    invoke-direct {v5, v4, v3, v7, v6}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1502
    .line 1503
    .line 1504
    new-instance v3, La/ugd;

    .line 1505
    .line 1506
    const/4 v11, 0x1

    .line 1507
    invoke-direct {v3, v13, v11, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1508
    .line 1509
    .line 1510
    invoke-virtual {v0, v1, v15, v2, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1511
    .line 1512
    .line 1513
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1514
    .line 1515
    return-object v0

    .line 1516
    :pswitch_10
    check-cast v4, La/nee;

    .line 1517
    .line 1518
    check-cast v3, La/bby;

    .line 1519
    .line 1520
    check-cast v7, La/rch0;

    .line 1521
    .line 1522
    move-object v0, v1

    .line 1523
    check-cast v0, Ljava/lang/Float;

    .line 1524
    .line 1525
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 1526
    .line 1527
    .line 1528
    move-result v0

    .line 1529
    iget-boolean v1, v4, La/nee;->q:Z

    .line 1530
    .line 1531
    if-eqz v1, :cond_32

    .line 1532
    .line 1533
    const/high16 v5, 0x3f800000    # 1.0f

    .line 1534
    .line 1535
    goto :goto_25

    .line 1536
    :cond_32
    const/high16 v5, -0x40800000    # -1.0f

    .line 1537
    .line 1538
    :goto_25
    mul-float v1, v5, v0

    .line 1539
    .line 1540
    iget-object v2, v4, La/nee;->p:La/sch0;

    .line 1541
    .line 1542
    invoke-virtual {v2, v1}, La/sch0;->i(F)J

    .line 1543
    .line 1544
    .line 1545
    move-result-wide v8

    .line 1546
    invoke-virtual {v2, v8, v9}, La/sch0;->f(J)J

    .line 1547
    .line 1548
    .line 1549
    move-result-wide v8

    .line 1550
    iget-object v1, v7, La/rch0;->a:La/sch0;

    .line 1551
    .line 1552
    iget-object v4, v1, La/sch0;->k:La/qah0;

    .line 1553
    .line 1554
    const/4 v11, 0x1

    .line 1555
    invoke-virtual {v1, v4, v8, v9, v11}, La/sch0;->d(La/qah0;JI)J

    .line 1556
    .line 1557
    .line 1558
    move-result-wide v6

    .line 1559
    invoke-virtual {v2, v6, v7}, La/sch0;->f(J)J

    .line 1560
    .line 1561
    .line 1562
    move-result-wide v6

    .line 1563
    invoke-virtual {v2, v6, v7}, La/sch0;->h(J)F

    .line 1564
    .line 1565
    .line 1566
    move-result v1

    .line 1567
    mul-float/2addr v1, v5

    .line 1568
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 1569
    .line 1570
    .line 1571
    move-result v2

    .line 1572
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 1573
    .line 1574
    .line 1575
    move-result v4

    .line 1576
    cmpg-float v2, v2, v4

    .line 1577
    .line 1578
    if-gez v2, :cond_33

    .line 1579
    .line 1580
    const-string v2, " < "

    .line 1581
    .line 1582
    const-string v4, ")"

    .line 1583
    .line 1584
    const-string v5, "Scroll animation cancelled because scroll was not consumed ("

    .line 1585
    .line 1586
    invoke-static {v1, v0, v5, v2, v4}, La/rw2;->i(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v0

    .line 1590
    invoke-static {v3, v0}, La/zvw;->G(La/bby;Ljava/lang/String;)V

    .line 1591
    .line 1592
    .line 1593
    :cond_33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1594
    .line 1595
    return-object v0

    .line 1596
    :pswitch_11
    check-cast v4, La/kyd;

    .line 1597
    .line 1598
    check-cast v3, La/swp0;

    .line 1599
    .line 1600
    check-cast v7, La/we50;

    .line 1601
    .line 1602
    move-object v0, v1

    .line 1603
    check-cast v0, La/k0w0;

    .line 1604
    .line 1605
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1606
    .line 1607
    .line 1608
    iget-object v1, v4, La/kyd;->q:La/zn00;

    .line 1609
    .line 1610
    new-instance v2, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;

    .line 1611
    .line 1612
    iget-object v4, v3, La/swp0;->b:Ljava/lang/String;

    .line 1613
    .line 1614
    iget-object v3, v3, La/swp0;->a:Ljava/lang/String;

    .line 1615
    .line 1616
    sget-object v5, La/tzf0;->a:La/tzf0;

    .line 1617
    .line 1618
    invoke-direct {v2, v4, v3, v5}, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;-><init>(Ljava/lang/String;Ljava/lang/String;La/tzf0;)V

    .line 1619
    .line 1620
    .line 1621
    const-wide/16 v3, -0x1

    .line 1622
    .line 1623
    invoke-virtual {v1, v2, v3, v4, v7}, La/zn00;->J0(Lorg/xplatform/security/api/presentation/models/TokenRestoreData;JLa/we50;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v1

    .line 1627
    invoke-virtual {v0, v1}, La/k0w0;->k(La/m7h0;)V

    .line 1628
    .line 1629
    .line 1630
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1631
    .line 1632
    return-object v0

    .line 1633
    :pswitch_12
    check-cast v4, La/cp;

    .line 1634
    .line 1635
    check-cast v3, La/m1w;

    .line 1636
    .line 1637
    check-cast v7, La/vft;

    .line 1638
    .line 1639
    move-object v0, v1

    .line 1640
    check-cast v0, Ljava/util/List;

    .line 1641
    .line 1642
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1643
    .line 1644
    .line 1645
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v0

    .line 1649
    iget-object v1, v4, La/xhe0;->a:Landroid/view/View;

    .line 1650
    .line 1651
    check-cast v0, La/zad;

    .line 1652
    .line 1653
    iget-object v0, v0, La/zad;->t:La/yad;

    .line 1654
    .line 1655
    iget-object v2, v4, La/cp;->u:La/yfu0;

    .line 1656
    .line 1657
    check-cast v2, La/pzv;

    .line 1658
    .line 1659
    iget-object v5, v2, La/pzv;->H:Landroid/widget/TextView;

    .line 1660
    .line 1661
    iget-object v6, v2, La/pzv;->o:Landroidx/constraintlayout/widget/Group;

    .line 1662
    .line 1663
    iget-object v8, v2, La/pzv;->N:Landroidx/constraintlayout/widget/Group;

    .line 1664
    .line 1665
    iget-object v9, v2, La/pzv;->m:Landroidx/constraintlayout/widget/Group;

    .line 1666
    .line 1667
    iget-object v10, v2, La/pzv;->M:Landroidx/constraintlayout/widget/Group;

    .line 1668
    .line 1669
    iget-object v11, v2, La/pzv;->n:Landroidx/constraintlayout/widget/Group;

    .line 1670
    .line 1671
    iget-object v12, v2, La/pzv;->t:Landroid/widget/TextView;

    .line 1672
    .line 1673
    iget-object v13, v2, La/pzv;->w:Landroid/widget/TextView;

    .line 1674
    .line 1675
    iget-object v14, v2, La/pzv;->x:Landroid/widget/TextView;

    .line 1676
    .line 1677
    iget-object v15, v2, La/pzv;->p:Landroid/widget/TextView;

    .line 1678
    .line 1679
    move-object/from16 v16, v1

    .line 1680
    .line 1681
    iget-object v1, v2, La/pzv;->s:Landroid/widget/TextView;

    .line 1682
    .line 1683
    move-object/from16 v17, v6

    .line 1684
    .line 1685
    iget-object v6, v2, La/pzv;->r:Landroid/widget/TextView;

    .line 1686
    .line 1687
    move-object/from16 v19, v8

    .line 1688
    .line 1689
    iget-object v8, v2, La/pzv;->i:Landroid/widget/FrameLayout;

    .line 1690
    .line 1691
    move-object/from16 v21, v9

    .line 1692
    .line 1693
    iget-object v9, v2, La/pzv;->g:Landroid/widget/FrameLayout;

    .line 1694
    .line 1695
    move-object/from16 v22, v10

    .line 1696
    .line 1697
    iget-object v10, v2, La/pzv;->z:Landroid/widget/TextView;

    .line 1698
    .line 1699
    move-object/from16 v23, v11

    .line 1700
    .line 1701
    iget-boolean v11, v0, La/yad;->b:Z

    .line 1702
    .line 1703
    if-eqz v11, :cond_34

    .line 1704
    .line 1705
    const/4 v11, 0x0

    .line 1706
    goto :goto_26

    .line 1707
    :cond_34
    const/16 v11, 0x8

    .line 1708
    .line 1709
    :goto_26
    invoke-virtual {v5, v11}, Landroid/view/View;->setVisibility(I)V

    .line 1710
    .line 1711
    .line 1712
    iget-object v11, v0, La/yad;->a:Ljava/lang/String;

    .line 1713
    .line 1714
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1715
    .line 1716
    .line 1717
    iget-object v11, v0, La/yad;->c:Landroid/content/res/ColorStateList;

    .line 1718
    .line 1719
    invoke-virtual {v5, v11}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 1720
    .line 1721
    .line 1722
    iget-boolean v5, v0, La/yad;->i:Z

    .line 1723
    .line 1724
    if-eqz v5, :cond_35

    .line 1725
    .line 1726
    const/4 v5, 0x0

    .line 1727
    goto :goto_27

    .line 1728
    :cond_35
    const/16 v5, 0x8

    .line 1729
    .line 1730
    :goto_27
    invoke-virtual {v10, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1731
    .line 1732
    .line 1733
    iget-object v5, v0, La/yad;->j:Ljava/lang/String;

    .line 1734
    .line 1735
    invoke-virtual {v10, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1736
    .line 1737
    .line 1738
    iget-object v5, v2, La/pzv;->A:Landroid/widget/LinearLayout;

    .line 1739
    .line 1740
    iget-boolean v10, v0, La/yad;->d:Z

    .line 1741
    .line 1742
    if-eqz v10, :cond_36

    .line 1743
    .line 1744
    const/4 v10, 0x0

    .line 1745
    goto :goto_28

    .line 1746
    :cond_36
    const/16 v10, 0x8

    .line 1747
    .line 1748
    :goto_28
    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1749
    .line 1750
    .line 1751
    iget-object v5, v2, La/pzv;->y:Landroid/widget/TextView;

    .line 1752
    .line 1753
    sget-object v10, La/rdj;->a:La/rdj;

    .line 1754
    .line 1755
    iget-boolean v10, v0, La/yad;->l:Z

    .line 1756
    .line 1757
    move/from16 v24, v10

    .line 1758
    .line 1759
    iget-wide v10, v0, La/yad;->e:J

    .line 1760
    .line 1761
    move-object/from16 v25, v12

    .line 1762
    .line 1763
    sget-object v12, La/efj;->c:La/efj;

    .line 1764
    .line 1765
    move-object/from16 v26, v13

    .line 1766
    .line 1767
    new-instance v13, La/znq0;

    .line 1768
    .line 1769
    invoke-direct {v13, v10, v11}, La/znq0;-><init>(J)V

    .line 1770
    .line 1771
    .line 1772
    invoke-static/range {v24 .. v24}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v10

    .line 1776
    const/16 v11, 0x38

    .line 1777
    .line 1778
    move-object/from16 v24, v14

    .line 1779
    .line 1780
    const/4 v14, 0x0

    .line 1781
    invoke-static {v13, v12, v10, v14, v11}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v10

    .line 1785
    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1786
    .line 1787
    .line 1788
    iget-boolean v5, v0, La/yad;->f:Z

    .line 1789
    .line 1790
    if-eqz v5, :cond_37

    .line 1791
    .line 1792
    move v5, v14

    .line 1793
    goto :goto_29

    .line 1794
    :cond_37
    const/16 v5, 0x8

    .line 1795
    .line 1796
    :goto_29
    invoke-virtual {v9, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1797
    .line 1798
    .line 1799
    iget-object v5, v2, La/pzv;->f:Landroid/widget/ImageView;

    .line 1800
    .line 1801
    iget v10, v0, La/yad;->g:I

    .line 1802
    .line 1803
    invoke-virtual {v5, v10}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1804
    .line 1805
    .line 1806
    new-instance v5, La/bbd;

    .line 1807
    .line 1808
    invoke-direct {v5, v3, v4, v14}, La/bbd;-><init>(La/m1w;La/cp;B)V

    .line 1809
    .line 1810
    .line 1811
    invoke-static {v9, v5}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 1812
    .line 1813
    .line 1814
    iget-boolean v3, v0, La/yad;->h:Z

    .line 1815
    .line 1816
    if-eqz v3, :cond_38

    .line 1817
    .line 1818
    move v3, v14

    .line 1819
    goto :goto_2a

    .line 1820
    :cond_38
    const/16 v3, 0x8

    .line 1821
    .line 1822
    :goto_2a
    invoke-virtual {v8, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1823
    .line 1824
    .line 1825
    sget-object v3, La/ymx;->e:La/ymx;

    .line 1826
    .line 1827
    new-instance v5, La/cbd;

    .line 1828
    .line 1829
    invoke-direct {v5, v14, v4, v7}, La/cbd;-><init>(BLa/cp;La/vft;)V

    .line 1830
    .line 1831
    .line 1832
    invoke-static {v8, v3, v5}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 1833
    .line 1834
    .line 1835
    iget-object v3, v2, La/pzv;->b:Landroid/widget/ImageView;

    .line 1836
    .line 1837
    iget-boolean v0, v0, La/yad;->k:Z

    .line 1838
    .line 1839
    if-eqz v0, :cond_39

    .line 1840
    .line 1841
    const/4 v0, 0x0

    .line 1842
    goto :goto_2b

    .line 1843
    :cond_39
    const/16 v0, 0x8

    .line 1844
    .line 1845
    :goto_2b
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1846
    .line 1847
    .line 1848
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v0

    .line 1852
    check-cast v0, La/zad;

    .line 1853
    .line 1854
    iget-boolean v0, v0, La/zad;->g:Z

    .line 1855
    .line 1856
    if-eqz v0, :cond_3a

    .line 1857
    .line 1858
    const/4 v14, 0x0

    .line 1859
    invoke-virtual {v6, v14}, Landroid/view/View;->setVisibility(I)V

    .line 1860
    .line 1861
    .line 1862
    invoke-virtual {v1, v14}, Landroid/view/View;->setVisibility(I)V

    .line 1863
    .line 1864
    .line 1865
    invoke-virtual/range {v16 .. v16}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v0

    .line 1869
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v0

    .line 1873
    const v3, 0x7f130490

    .line 1874
    .line 1875
    .line 1876
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v0

    .line 1880
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1881
    .line 1882
    .line 1883
    invoke-virtual/range {v16 .. v16}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v0

    .line 1887
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v0

    .line 1891
    const v3, 0x7f130499

    .line 1892
    .line 1893
    .line 1894
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v0

    .line 1898
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1899
    .line 1900
    .line 1901
    goto :goto_2c

    .line 1902
    :cond_3a
    const/16 v0, 0x8

    .line 1903
    .line 1904
    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1905
    .line 1906
    .line 1907
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1908
    .line 1909
    .line 1910
    :goto_2c
    iget-object v0, v2, La/pzv;->q:Landroid/widget/TextView;

    .line 1911
    .line 1912
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 1913
    .line 1914
    .line 1915
    move-result-object v1

    .line 1916
    check-cast v1, La/zad;

    .line 1917
    .line 1918
    iget-object v1, v1, La/zad;->q:Ljava/lang/String;

    .line 1919
    .line 1920
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1921
    .line 1922
    .line 1923
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v0

    .line 1927
    check-cast v0, La/zad;

    .line 1928
    .line 1929
    iget-boolean v0, v0, La/zad;->r:Z

    .line 1930
    .line 1931
    if-eqz v0, :cond_3b

    .line 1932
    .line 1933
    const/4 v0, 0x0

    .line 1934
    goto :goto_2d

    .line 1935
    :cond_3b
    const/16 v0, 0x8

    .line 1936
    .line 1937
    :goto_2d
    invoke-virtual {v15, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1938
    .line 1939
    .line 1940
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v0

    .line 1944
    check-cast v0, La/zad;

    .line 1945
    .line 1946
    iget-object v0, v0, La/zad;->s:Ljava/lang/String;

    .line 1947
    .line 1948
    invoke-virtual {v15, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1949
    .line 1950
    .line 1951
    iget-object v0, v2, La/pzv;->e:Landroidx/constraintlayout/widget/Group;

    .line 1952
    .line 1953
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v1

    .line 1957
    check-cast v1, La/zad;

    .line 1958
    .line 1959
    iget-boolean v1, v1, La/zad;->n:Z

    .line 1960
    .line 1961
    if-eqz v1, :cond_3c

    .line 1962
    .line 1963
    const/4 v1, 0x0

    .line 1964
    goto :goto_2e

    .line 1965
    :cond_3c
    const/16 v1, 0x8

    .line 1966
    .line 1967
    :goto_2e
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1968
    .line 1969
    .line 1970
    iget-object v0, v2, La/pzv;->v:Landroid/widget/TextView;

    .line 1971
    .line 1972
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v1

    .line 1976
    check-cast v1, La/zad;

    .line 1977
    .line 1978
    iget-object v1, v1, La/zad;->o:Ljava/lang/String;

    .line 1979
    .line 1980
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1981
    .line 1982
    .line 1983
    iget-object v0, v2, La/pzv;->u:Landroid/widget/TextView;

    .line 1984
    .line 1985
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v1

    .line 1989
    check-cast v1, La/zad;

    .line 1990
    .line 1991
    iget-object v1, v1, La/zad;->p:Ljava/lang/String;

    .line 1992
    .line 1993
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1994
    .line 1995
    .line 1996
    iget-object v0, v2, La/pzv;->c:Landroidx/constraintlayout/widget/Group;

    .line 1997
    .line 1998
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v1

    .line 2002
    check-cast v1, La/zad;

    .line 2003
    .line 2004
    iget-boolean v1, v1, La/zad;->b:Z

    .line 2005
    .line 2006
    if-eqz v1, :cond_3d

    .line 2007
    .line 2008
    const/4 v1, 0x0

    .line 2009
    goto :goto_2f

    .line 2010
    :cond_3d
    const/16 v1, 0x8

    .line 2011
    .line 2012
    :goto_2f
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2013
    .line 2014
    .line 2015
    iget-object v0, v2, La/pzv;->d:Landroid/widget/TextView;

    .line 2016
    .line 2017
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v1

    .line 2021
    check-cast v1, La/zad;

    .line 2022
    .line 2023
    iget-object v1, v1, La/zad;->c:Ljava/lang/String;

    .line 2024
    .line 2025
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2026
    .line 2027
    .line 2028
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v0

    .line 2032
    check-cast v0, La/zad;

    .line 2033
    .line 2034
    iget-object v0, v0, La/zad;->l:La/so7;

    .line 2035
    .line 2036
    iget-object v1, v0, La/so7;->a:Ljava/lang/String;

    .line 2037
    .line 2038
    move-object/from16 v3, v24

    .line 2039
    .line 2040
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2041
    .line 2042
    .line 2043
    iget-object v1, v0, La/so7;->b:Ljava/lang/String;

    .line 2044
    .line 2045
    move-object/from16 v5, v26

    .line 2046
    .line 2047
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2048
    .line 2049
    .line 2050
    iget v0, v0, La/so7;->c:I

    .line 2051
    .line 2052
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2053
    .line 2054
    .line 2055
    iget-object v0, v2, La/pzv;->j:Landroidx/constraintlayout/widget/Group;

    .line 2056
    .line 2057
    iget-object v1, v2, La/pzv;->k:Landroid/widget/TextView;

    .line 2058
    .line 2059
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 2060
    .line 2061
    .line 2062
    move-result-object v6

    .line 2063
    check-cast v6, La/zad;

    .line 2064
    .line 2065
    iget-object v6, v6, La/zad;->m:La/mb90;

    .line 2066
    .line 2067
    iget-boolean v6, v6, La/mb90;->d:Z

    .line 2068
    .line 2069
    if-eqz v6, :cond_3e

    .line 2070
    .line 2071
    const/4 v6, 0x0

    .line 2072
    goto :goto_30

    .line 2073
    :cond_3e
    const/16 v6, 0x8

    .line 2074
    .line 2075
    :goto_30
    invoke-virtual {v0, v6}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2076
    .line 2077
    .line 2078
    iget-object v0, v2, La/pzv;->l:Landroid/widget/TextView;

    .line 2079
    .line 2080
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 2081
    .line 2082
    .line 2083
    move-result-object v6

    .line 2084
    check-cast v6, La/zad;

    .line 2085
    .line 2086
    iget-object v6, v6, La/zad;->m:La/mb90;

    .line 2087
    .line 2088
    iget-object v6, v6, La/mb90;->a:Ljava/lang/String;

    .line 2089
    .line 2090
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2091
    .line 2092
    .line 2093
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 2094
    .line 2095
    .line 2096
    move-result-object v0

    .line 2097
    check-cast v0, La/zad;

    .line 2098
    .line 2099
    iget-object v0, v0, La/zad;->m:La/mb90;

    .line 2100
    .line 2101
    iget-object v0, v0, La/mb90;->b:Ljava/lang/String;

    .line 2102
    .line 2103
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2104
    .line 2105
    .line 2106
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 2107
    .line 2108
    .line 2109
    move-result-object v0

    .line 2110
    check-cast v0, La/zad;

    .line 2111
    .line 2112
    iget-object v0, v0, La/zad;->m:La/mb90;

    .line 2113
    .line 2114
    iget v0, v0, La/mb90;->c:I

    .line 2115
    .line 2116
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2117
    .line 2118
    .line 2119
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v0

    .line 2123
    check-cast v0, La/zad;

    .line 2124
    .line 2125
    iget-object v0, v0, La/zad;->h:La/e4f;

    .line 2126
    .line 2127
    invoke-virtual/range {v16 .. v16}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2128
    .line 2129
    .line 2130
    move-result-object v1

    .line 2131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2132
    .line 2133
    .line 2134
    invoke-static {v0, v1}, La/feb;->a0(La/e4f;Landroid/content/Context;)I

    .line 2135
    .line 2136
    .line 2137
    move-result v0

    .line 2138
    if-eqz v0, :cond_3f

    .line 2139
    .line 2140
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 2141
    .line 2142
    .line 2143
    move-result-object v0

    .line 2144
    check-cast v0, La/zad;

    .line 2145
    .line 2146
    iget-object v0, v0, La/zad;->h:La/e4f;

    .line 2147
    .line 2148
    invoke-virtual/range {v16 .. v16}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v1

    .line 2152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2153
    .line 2154
    .line 2155
    invoke-static {v0, v1}, La/feb;->a0(La/e4f;Landroid/content/Context;)I

    .line 2156
    .line 2157
    .line 2158
    move-result v0

    .line 2159
    move-object/from16 v1, v25

    .line 2160
    .line 2161
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2162
    .line 2163
    .line 2164
    goto :goto_31

    .line 2165
    :cond_3f
    move-object/from16 v1, v25

    .line 2166
    .line 2167
    :goto_31
    iget-object v0, v2, La/pzv;->h:Landroid/widget/ImageView;

    .line 2168
    .line 2169
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v6

    .line 2173
    check-cast v6, La/zad;

    .line 2174
    .line 2175
    iget v6, v6, La/zad;->j:I

    .line 2176
    .line 2177
    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2178
    .line 2179
    .line 2180
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 2181
    .line 2182
    .line 2183
    move-result-object v0

    .line 2184
    check-cast v0, La/zad;

    .line 2185
    .line 2186
    iget-object v0, v0, La/zad;->i:Ljava/lang/String;

    .line 2187
    .line 2188
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2189
    .line 2190
    .line 2191
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 2192
    .line 2193
    .line 2194
    move-result-object v0

    .line 2195
    check-cast v0, La/zad;

    .line 2196
    .line 2197
    iget-boolean v0, v0, La/zad;->f:Z

    .line 2198
    .line 2199
    if-eqz v0, :cond_45

    .line 2200
    .line 2201
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 2202
    .line 2203
    .line 2204
    move-result-object v0

    .line 2205
    check-cast v0, La/zad;

    .line 2206
    .line 2207
    iget-object v0, v0, La/zad;->a:La/exo0;

    .line 2208
    .line 2209
    iget-boolean v1, v0, La/exo0;->a:Z

    .line 2210
    .line 2211
    if-eqz v1, :cond_40

    .line 2212
    .line 2213
    const/4 v1, 0x0

    .line 2214
    :goto_32
    move-object/from16 v4, v23

    .line 2215
    .line 2216
    goto :goto_33

    .line 2217
    :cond_40
    const/16 v1, 0x8

    .line 2218
    .line 2219
    goto :goto_32

    .line 2220
    :goto_33
    invoke-virtual {v4, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2221
    .line 2222
    .line 2223
    iget-object v1, v2, La/pzv;->D:Landroid/widget/TextView;

    .line 2224
    .line 2225
    iget-object v4, v0, La/exo0;->b:Ljava/lang/String;

    .line 2226
    .line 2227
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2228
    .line 2229
    .line 2230
    iget-object v1, v2, La/pzv;->E:Landroid/widget/TextView;

    .line 2231
    .line 2232
    iget-object v4, v0, La/exo0;->c:Ljava/lang/String;

    .line 2233
    .line 2234
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2235
    .line 2236
    .line 2237
    iget-boolean v1, v0, La/exo0;->f:Z

    .line 2238
    .line 2239
    if-eqz v1, :cond_41

    .line 2240
    .line 2241
    const/4 v1, 0x0

    .line 2242
    :goto_34
    move-object/from16 v6, v22

    .line 2243
    .line 2244
    goto :goto_35

    .line 2245
    :cond_41
    const/16 v1, 0x8

    .line 2246
    .line 2247
    goto :goto_34

    .line 2248
    :goto_35
    invoke-virtual {v6, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2249
    .line 2250
    .line 2251
    iget-object v1, v2, La/pzv;->I:Landroid/widget/TextView;

    .line 2252
    .line 2253
    iget-object v4, v0, La/exo0;->d:Ljava/lang/String;

    .line 2254
    .line 2255
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2256
    .line 2257
    .line 2258
    iget-object v1, v2, La/pzv;->J:Landroid/widget/TextView;

    .line 2259
    .line 2260
    iget-object v4, v0, La/exo0;->e:Ljava/lang/String;

    .line 2261
    .line 2262
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2263
    .line 2264
    .line 2265
    iget-boolean v1, v0, La/exo0;->g:Z

    .line 2266
    .line 2267
    if-eqz v1, :cond_42

    .line 2268
    .line 2269
    const/4 v1, 0x0

    .line 2270
    :goto_36
    move-object/from16 v7, v21

    .line 2271
    .line 2272
    goto :goto_37

    .line 2273
    :cond_42
    const/16 v1, 0x8

    .line 2274
    .line 2275
    goto :goto_36

    .line 2276
    :goto_37
    invoke-virtual {v7, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2277
    .line 2278
    .line 2279
    iget-object v1, v2, La/pzv;->B:Landroid/widget/TextView;

    .line 2280
    .line 2281
    iget-object v4, v0, La/exo0;->h:Ljava/lang/String;

    .line 2282
    .line 2283
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2284
    .line 2285
    .line 2286
    iget-object v1, v2, La/pzv;->C:Landroid/widget/TextView;

    .line 2287
    .line 2288
    iget-object v4, v0, La/exo0;->i:Ljava/lang/String;

    .line 2289
    .line 2290
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2291
    .line 2292
    .line 2293
    iget-boolean v1, v0, La/exo0;->j:Z

    .line 2294
    .line 2295
    if-eqz v1, :cond_43

    .line 2296
    .line 2297
    const/4 v1, 0x0

    .line 2298
    :goto_38
    move-object/from16 v8, v19

    .line 2299
    .line 2300
    goto :goto_39

    .line 2301
    :cond_43
    const/16 v1, 0x8

    .line 2302
    .line 2303
    goto :goto_38

    .line 2304
    :goto_39
    invoke-virtual {v8, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2305
    .line 2306
    .line 2307
    iget-object v1, v2, La/pzv;->K:Landroid/widget/TextView;

    .line 2308
    .line 2309
    iget-object v4, v0, La/exo0;->k:Ljava/lang/String;

    .line 2310
    .line 2311
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2312
    .line 2313
    .line 2314
    iget-object v1, v2, La/pzv;->L:Landroid/widget/TextView;

    .line 2315
    .line 2316
    iget-object v4, v0, La/exo0;->t:Ljava/lang/String;

    .line 2317
    .line 2318
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2319
    .line 2320
    .line 2321
    iget-boolean v1, v0, La/exo0;->n:Z

    .line 2322
    .line 2323
    if-eqz v1, :cond_44

    .line 2324
    .line 2325
    const/4 v1, 0x0

    .line 2326
    :goto_3a
    move-object/from16 v9, v17

    .line 2327
    .line 2328
    goto :goto_3b

    .line 2329
    :cond_44
    const/16 v1, 0x8

    .line 2330
    .line 2331
    goto :goto_3a

    .line 2332
    :goto_3b
    invoke-virtual {v9, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2333
    .line 2334
    .line 2335
    iget-object v1, v2, La/pzv;->F:Landroid/widget/TextView;

    .line 2336
    .line 2337
    iget-object v4, v0, La/exo0;->m:Ljava/lang/String;

    .line 2338
    .line 2339
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2340
    .line 2341
    .line 2342
    iget-object v1, v2, La/pzv;->G:Landroid/widget/TextView;

    .line 2343
    .line 2344
    iget-object v2, v0, La/exo0;->o:Ljava/lang/String;

    .line 2345
    .line 2346
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2347
    .line 2348
    .line 2349
    iget-boolean v1, v0, La/exo0;->p:Z

    .line 2350
    .line 2351
    if-eqz v1, :cond_46

    .line 2352
    .line 2353
    iget-object v1, v0, La/exo0;->q:Ljava/lang/String;

    .line 2354
    .line 2355
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2356
    .line 2357
    .line 2358
    iget-object v1, v0, La/exo0;->r:Ljava/lang/String;

    .line 2359
    .line 2360
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2361
    .line 2362
    .line 2363
    iget v0, v0, La/exo0;->s:I

    .line 2364
    .line 2365
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2366
    .line 2367
    .line 2368
    goto :goto_3c

    .line 2369
    :cond_45
    move-object/from16 v9, v17

    .line 2370
    .line 2371
    move-object/from16 v8, v19

    .line 2372
    .line 2373
    move-object/from16 v7, v21

    .line 2374
    .line 2375
    move-object/from16 v6, v22

    .line 2376
    .line 2377
    move-object/from16 v4, v23

    .line 2378
    .line 2379
    const/16 v0, 0x8

    .line 2380
    .line 2381
    invoke-virtual {v4, v0}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2382
    .line 2383
    .line 2384
    invoke-virtual {v6, v0}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2385
    .line 2386
    .line 2387
    invoke-virtual {v7, v0}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2388
    .line 2389
    .line 2390
    invoke-virtual {v8, v0}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2391
    .line 2392
    .line 2393
    invoke-virtual {v9, v0}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2394
    .line 2395
    .line 2396
    :cond_46
    :goto_3c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2397
    .line 2398
    return-object v0

    .line 2399
    :pswitch_13
    check-cast v4, La/m1w;

    .line 2400
    .line 2401
    check-cast v3, La/m1w;

    .line 2402
    .line 2403
    check-cast v7, La/vft;

    .line 2404
    .line 2405
    move-object v0, v1

    .line 2406
    check-cast v0, La/cp;

    .line 2407
    .line 2408
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2409
    .line 2410
    .line 2411
    iget-object v1, v0, La/xhe0;->a:Landroid/view/View;

    .line 2412
    .line 2413
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2414
    .line 2415
    .line 2416
    new-instance v2, La/abd;

    .line 2417
    .line 2418
    const/4 v14, 0x0

    .line 2419
    invoke-direct {v2, v4, v0, v14}, La/abd;-><init>(La/m1w;La/cp;B)V

    .line 2420
    .line 2421
    .line 2422
    invoke-static {v1, v2}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 2423
    .line 2424
    .line 2425
    new-instance v1, La/sw8;

    .line 2426
    .line 2427
    const/16 v8, 0xa

    .line 2428
    .line 2429
    invoke-direct {v1, v0, v3, v7, v8}, La/sw8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2430
    .line 2431
    .line 2432
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 2433
    .line 2434
    .line 2435
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2436
    .line 2437
    return-object v0

    .line 2438
    :pswitch_14
    check-cast v4, La/jie0;

    .line 2439
    .line 2440
    check-cast v3, La/x2d;

    .line 2441
    .line 2442
    check-cast v7, La/jie0;

    .line 2443
    .line 2444
    move-object v0, v1

    .line 2445
    check-cast v0, La/i73;

    .line 2446
    .line 2447
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2448
    .line 2449
    .line 2450
    iget-object v1, v0, La/i73;->e:La/pz40;

    .line 2451
    .line 2452
    check-cast v1, La/hgk0;

    .line 2453
    .line 2454
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 2455
    .line 2456
    .line 2457
    move-result-object v2

    .line 2458
    check-cast v2, Ljava/lang/Number;

    .line 2459
    .line 2460
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 2461
    .line 2462
    .line 2463
    move-result v2

    .line 2464
    iget v5, v4, La/jie0;->a:F

    .line 2465
    .line 2466
    sub-float/2addr v2, v5

    .line 2467
    iget-object v5, v3, La/x2d;->f:La/agk0;

    .line 2468
    .line 2469
    invoke-virtual {v5}, La/agk0;->l()F

    .line 2470
    .line 2471
    .line 2472
    move-result v5

    .line 2473
    add-float v6, v5, v2

    .line 2474
    .line 2475
    invoke-virtual {v3, v6}, La/x2d;->b(F)V

    .line 2476
    .line 2477
    .line 2478
    iget-object v3, v3, La/x2d;->f:La/agk0;

    .line 2479
    .line 2480
    invoke-virtual {v3}, La/agk0;->l()F

    .line 2481
    .line 2482
    .line 2483
    move-result v3

    .line 2484
    sub-float/2addr v5, v3

    .line 2485
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 2486
    .line 2487
    .line 2488
    move-result v3

    .line 2489
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 2490
    .line 2491
    .line 2492
    move-result-object v1

    .line 2493
    check-cast v1, Ljava/lang/Number;

    .line 2494
    .line 2495
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 2496
    .line 2497
    .line 2498
    move-result v1

    .line 2499
    iput v1, v4, La/jie0;->a:F

    .line 2500
    .line 2501
    invoke-virtual {v0}, La/i73;->b()Ljava/lang/Object;

    .line 2502
    .line 2503
    .line 2504
    move-result-object v1

    .line 2505
    check-cast v1, Ljava/lang/Number;

    .line 2506
    .line 2507
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 2508
    .line 2509
    .line 2510
    move-result v1

    .line 2511
    iput v1, v7, La/jie0;->a:F

    .line 2512
    .line 2513
    sub-float/2addr v2, v3

    .line 2514
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 2515
    .line 2516
    .line 2517
    move-result v1

    .line 2518
    cmpl-float v1, v1, v17

    .line 2519
    .line 2520
    if-lez v1, :cond_47

    .line 2521
    .line 2522
    invoke-virtual {v0}, La/i73;->a()V

    .line 2523
    .line 2524
    .line 2525
    :cond_47
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2526
    .line 2527
    return-object v0

    .line 2528
    :pswitch_15
    check-cast v4, La/xhc;

    .line 2529
    .line 2530
    move-object v5, v3

    .line 2531
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 2532
    .line 2533
    check-cast v7, La/wpq;

    .line 2534
    .line 2535
    move-object v0, v1

    .line 2536
    check-cast v0, La/hcz;

    .line 2537
    .line 2538
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2539
    .line 2540
    .line 2541
    sget-object v1, La/lv00;->b:La/ugd;

    .line 2542
    .line 2543
    invoke-static {v0, v15, v15, v1, v8}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2544
    .line 2545
    .line 2546
    new-instance v1, La/ab4;

    .line 2547
    .line 2548
    invoke-direct {v1, v4, v5, v6}, La/ab4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2549
    .line 2550
    .line 2551
    new-instance v2, La/ugd;

    .line 2552
    .line 2553
    const v3, -0x3bc49da2

    .line 2554
    .line 2555
    .line 2556
    const/4 v11, 0x1

    .line 2557
    invoke-direct {v2, v3, v11, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2558
    .line 2559
    .line 2560
    invoke-static {v0, v15, v15, v2, v8}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2561
    .line 2562
    .line 2563
    iget-object v1, v4, La/xhc;->a:La/a4x;

    .line 2564
    .line 2565
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 2566
    .line 2567
    .line 2568
    move-result v1

    .line 2569
    if-nez v1, :cond_48

    .line 2570
    .line 2571
    sget-object v1, La/lv00;->c:La/ugd;

    .line 2572
    .line 2573
    invoke-static {v0, v15, v15, v1, v8}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2574
    .line 2575
    .line 2576
    iget-object v2, v4, La/xhc;->a:La/a4x;

    .line 2577
    .line 2578
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 2579
    .line 2580
    .line 2581
    move-result v8

    .line 2582
    new-instance v9, La/dx8;

    .line 2583
    .line 2584
    const/16 v1, 0xd

    .line 2585
    .line 2586
    invoke-direct {v9, v2, v1}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 2587
    .line 2588
    .line 2589
    new-instance v1, La/gq4;

    .line 2590
    .line 2591
    const/4 v6, 0x1

    .line 2592
    move-object v3, v4

    .line 2593
    move-object v4, v7

    .line 2594
    invoke-direct/range {v1 .. v6}, La/gq4;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 2595
    .line 2596
    .line 2597
    new-instance v2, La/ugd;

    .line 2598
    .line 2599
    const/4 v11, 0x1

    .line 2600
    invoke-direct {v2, v13, v11, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2601
    .line 2602
    .line 2603
    invoke-virtual {v0, v8, v15, v9, v2}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2604
    .line 2605
    .line 2606
    :cond_48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2607
    .line 2608
    return-object v0

    .line 2609
    :pswitch_16
    check-cast v4, La/sdc;

    .line 2610
    .line 2611
    check-cast v3, La/wpq;

    .line 2612
    .line 2613
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 2614
    .line 2615
    move-object v0, v1

    .line 2616
    check-cast v0, La/hcz;

    .line 2617
    .line 2618
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2619
    .line 2620
    .line 2621
    iget-object v1, v4, La/sdc;->c:La/a4x;

    .line 2622
    .line 2623
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 2624
    .line 2625
    .line 2626
    move-result v2

    .line 2627
    new-instance v4, La/dx8;

    .line 2628
    .line 2629
    const/16 v8, 0xa

    .line 2630
    .line 2631
    invoke-direct {v4, v1, v8}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 2632
    .line 2633
    .line 2634
    new-instance v5, La/c8;

    .line 2635
    .line 2636
    const/16 v6, 0xc

    .line 2637
    .line 2638
    invoke-direct {v5, v1, v3, v7, v6}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 2639
    .line 2640
    .line 2641
    new-instance v1, La/ugd;

    .line 2642
    .line 2643
    const/4 v11, 0x1

    .line 2644
    invoke-direct {v1, v13, v11, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2645
    .line 2646
    .line 2647
    invoke-virtual {v0, v2, v15, v4, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2648
    .line 2649
    .line 2650
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2651
    .line 2652
    return-object v0

    .line 2653
    :pswitch_17
    check-cast v4, La/v7c;

    .line 2654
    .line 2655
    check-cast v3, La/mwt0;

    .line 2656
    .line 2657
    check-cast v7, La/a6c;

    .line 2658
    .line 2659
    move-object v0, v1

    .line 2660
    check-cast v0, La/k0w0;

    .line 2661
    .line 2662
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2663
    .line 2664
    .line 2665
    iget-object v1, v4, La/v7c;->K:La/lme0;

    .line 2666
    .line 2667
    new-instance v8, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;

    .line 2668
    .line 2669
    iget-wide v4, v3, La/mwt0;->a:J

    .line 2670
    .line 2671
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2672
    .line 2673
    .line 2674
    move-result-object v9

    .line 2675
    iget-object v10, v3, La/mwt0;->b:Ljava/lang/String;

    .line 2676
    .line 2677
    iget-object v11, v7, La/a6c;->g:Ljava/lang/String;

    .line 2678
    .line 2679
    iget-object v12, v7, La/a6c;->h:Ljava/lang/String;

    .line 2680
    .line 2681
    iget-wide v2, v7, La/a6c;->j:J

    .line 2682
    .line 2683
    long-to-int v2, v2

    .line 2684
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2685
    .line 2686
    .line 2687
    move-result-object v13

    .line 2688
    sget-object v2, La/q7f0;->b:La/gne0;

    .line 2689
    .line 2690
    iget v3, v7, La/a6c;->i:I

    .line 2691
    .line 2692
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2693
    .line 2694
    .line 2695
    invoke-static {v3}, La/gne0;->c(I)La/q7f0;

    .line 2696
    .line 2697
    .line 2698
    move-result-object v14

    .line 2699
    iget-object v15, v7, La/a6c;->o:Ljava/lang/String;

    .line 2700
    .line 2701
    iget-object v2, v7, La/a6c;->n:Ljava/lang/String;

    .line 2702
    .line 2703
    iget-object v3, v7, La/a6c;->k:Ljava/lang/String;

    .line 2704
    .line 2705
    iget-object v4, v7, La/a6c;->l:Ljava/lang/String;

    .line 2706
    .line 2707
    iget-object v5, v7, La/a6c;->m:Ljava/lang/String;

    .line 2708
    .line 2709
    iget-object v6, v7, La/a6c;->p:Ljava/lang/String;

    .line 2710
    .line 2711
    const/16 v21, 0x0

    .line 2712
    .line 2713
    move-object/from16 v16, v2

    .line 2714
    .line 2715
    move-object/from16 v17, v3

    .line 2716
    .line 2717
    move-object/from16 v18, v4

    .line 2718
    .line 2719
    move-object/from16 v19, v5

    .line 2720
    .line 2721
    move-object/from16 v20, v6

    .line 2722
    .line 2723
    invoke-direct/range {v8 .. v21}, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;La/q7f0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 2724
    .line 2725
    .line 2726
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2727
    .line 2728
    .line 2729
    invoke-static {v8}, La/lme0;->a(Lorg/xplatform/registration/success/api/RegistrationSuccessParams;)Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;

    .line 2730
    .line 2731
    .line 2732
    move-result-object v1

    .line 2733
    invoke-virtual {v0, v1}, La/k0w0;->l(Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;)V

    .line 2734
    .line 2735
    .line 2736
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2737
    .line 2738
    return-object v0

    .line 2739
    :pswitch_18
    check-cast v4, La/v7c;

    .line 2740
    .line 2741
    check-cast v3, La/t5c;

    .line 2742
    .line 2743
    check-cast v7, La/owt0;

    .line 2744
    .line 2745
    move-object v0, v1

    .line 2746
    check-cast v0, La/k0w0;

    .line 2747
    .line 2748
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2749
    .line 2750
    .line 2751
    iget-object v1, v4, La/v7c;->r:La/mi70;

    .line 2752
    .line 2753
    new-instance v8, La/u5c;

    .line 2754
    .line 2755
    iget-object v9, v3, La/t5c;->j:Ljava/lang/String;

    .line 2756
    .line 2757
    iget-object v10, v7, La/owt0;->a:La/swp0;

    .line 2758
    .line 2759
    iget v11, v3, La/t5c;->c:I

    .line 2760
    .line 2761
    sget-object v2, La/obk0;->c:La/obk0;

    .line 2762
    .line 2763
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 2764
    .line 2765
    .line 2766
    move-result-object v12

    .line 2767
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 2768
    .line 2769
    .line 2770
    move-result-object v13

    .line 2771
    iget v14, v3, La/t5c;->f:I

    .line 2772
    .line 2773
    iget-object v15, v3, La/t5c;->h:Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;

    .line 2774
    .line 2775
    iget-object v2, v4, La/v7c;->d:La/d6c;

    .line 2776
    .line 2777
    invoke-interface {v2}, La/d6c;->u()Z

    .line 2778
    .line 2779
    .line 2780
    move-result v16

    .line 2781
    invoke-direct/range {v8 .. v16}, La/u5c;-><init>(Ljava/lang/String;La/swp0;ILjava/util/List;Ljava/util/List;ILorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;Z)V

    .line 2782
    .line 2783
    .line 2784
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2785
    .line 2786
    .line 2787
    new-instance v1, Lorg/xplatform/security/impl/navigation/PhoneScreenFactoryImpl$getConfirmPhoneNumberBySmsScreen$1;

    .line 2788
    .line 2789
    invoke-direct {v1, v8}, Lorg/xplatform/security/impl/navigation/PhoneScreenFactoryImpl$getConfirmPhoneNumberBySmsScreen$1;-><init>(La/d6c;)V

    .line 2790
    .line 2791
    .line 2792
    invoke-virtual {v0, v1}, La/k0w0;->k(La/m7h0;)V

    .line 2793
    .line 2794
    .line 2795
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2796
    .line 2797
    return-object v0

    .line 2798
    :pswitch_19
    check-cast v4, La/cob;

    .line 2799
    .line 2800
    check-cast v3, La/xnb;

    .line 2801
    .line 2802
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 2803
    .line 2804
    move-object v0, v1

    .line 2805
    check-cast v0, La/hcz;

    .line 2806
    .line 2807
    sget-object v1, La/xnb;->w2:La/kj5;

    .line 2808
    .line 2809
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2810
    .line 2811
    .line 2812
    iget-object v1, v4, La/cob;->b:La/a4x;

    .line 2813
    .line 2814
    new-instance v2, La/pua;

    .line 2815
    .line 2816
    const/16 v5, 0x18

    .line 2817
    .line 2818
    invoke-direct {v2, v5}, La/pua;-><init>(B)V

    .line 2819
    .line 2820
    .line 2821
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 2822
    .line 2823
    .line 2824
    move-result v5

    .line 2825
    new-instance v6, La/at7;

    .line 2826
    .line 2827
    const/16 v8, 0x10

    .line 2828
    .line 2829
    invoke-direct {v6, v2, v1, v8}, La/at7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2830
    .line 2831
    .line 2832
    new-instance v2, La/dx8;

    .line 2833
    .line 2834
    const/4 v8, 0x7

    .line 2835
    invoke-direct {v2, v1, v8}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 2836
    .line 2837
    .line 2838
    new-instance v8, La/wnb;

    .line 2839
    .line 2840
    invoke-direct {v8, v1, v4, v3, v7}, La/wnb;-><init>(Ljava/util/List;La/cob;La/xnb;Lkotlin/jvm/functions/Function1;)V

    .line 2841
    .line 2842
    .line 2843
    new-instance v1, La/ugd;

    .line 2844
    .line 2845
    const/4 v11, 0x1

    .line 2846
    invoke-direct {v1, v13, v11, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2847
    .line 2848
    .line 2849
    invoke-virtual {v0, v5, v6, v2, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2850
    .line 2851
    .line 2852
    iget-object v1, v4, La/cob;->c:La/a4x;

    .line 2853
    .line 2854
    new-instance v2, La/pua;

    .line 2855
    .line 2856
    const/16 v5, 0x19

    .line 2857
    .line 2858
    invoke-direct {v2, v5}, La/pua;-><init>(B)V

    .line 2859
    .line 2860
    .line 2861
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 2862
    .line 2863
    .line 2864
    move-result v5

    .line 2865
    new-instance v6, La/at7;

    .line 2866
    .line 2867
    const/16 v8, 0x11

    .line 2868
    .line 2869
    invoke-direct {v6, v2, v1, v8}, La/at7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2870
    .line 2871
    .line 2872
    new-instance v2, La/dx8;

    .line 2873
    .line 2874
    const/16 v8, 0x8

    .line 2875
    .line 2876
    invoke-direct {v2, v1, v8}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 2877
    .line 2878
    .line 2879
    new-instance v8, La/wnb;

    .line 2880
    .line 2881
    invoke-direct {v8, v1, v3, v4, v7}, La/wnb;-><init>(Ljava/util/List;La/xnb;La/cob;Lkotlin/jvm/functions/Function1;)V

    .line 2882
    .line 2883
    .line 2884
    new-instance v1, La/ugd;

    .line 2885
    .line 2886
    const/4 v11, 0x1

    .line 2887
    invoke-direct {v1, v13, v11, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2888
    .line 2889
    .line 2890
    invoke-virtual {v0, v5, v6, v2, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2891
    .line 2892
    .line 2893
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2894
    .line 2895
    return-object v0

    .line 2896
    :pswitch_1a
    check-cast v4, La/r9u;

    .line 2897
    .line 2898
    check-cast v3, La/ctf0;

    .line 2899
    .line 2900
    check-cast v7, La/g2v;

    .line 2901
    .line 2902
    move-object v0, v1

    .line 2903
    check-cast v0, La/r6b;

    .line 2904
    .line 2905
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2906
    .line 2907
    .line 2908
    sget-object v1, La/ygp;->c:La/ygp;

    .line 2909
    .line 2910
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2911
    .line 2912
    .line 2913
    iget-object v2, v4, La/r9u;->a:La/j1q0;

    .line 2914
    .line 2915
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2916
    .line 2917
    .line 2918
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 2919
    .line 2920
    invoke-virtual {v2, v1}, La/m1q0;->d(La/ygp;)Z

    .line 2921
    .line 2922
    .line 2923
    move-result v1

    .line 2924
    new-instance v2, La/mya;

    .line 2925
    .line 2926
    invoke-direct {v2, v0, v1, v3, v7}, La/mya;-><init>(La/r6b;ZLa/ctf0;La/g2v;)V

    .line 2927
    .line 2928
    .line 2929
    return-object v2

    .line 2930
    :pswitch_1b
    check-cast v4, La/cp;

    .line 2931
    .line 2932
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 2933
    .line 2934
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 2935
    .line 2936
    move-object v0, v1

    .line 2937
    check-cast v0, Ljava/util/List;

    .line 2938
    .line 2939
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2940
    .line 2941
    .line 2942
    iget-object v0, v4, La/cp;->u:La/yfu0;

    .line 2943
    .line 2944
    check-cast v0, La/jsx;

    .line 2945
    .line 2946
    iget-object v0, v0, La/jsx;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 2947
    .line 2948
    sget-object v1, La/pek0;->g:La/pek0;

    .line 2949
    .line 2950
    new-instance v2, La/zb8;

    .line 2951
    .line 2952
    const/16 v6, 0xe

    .line 2953
    .line 2954
    invoke-direct {v2, v4, v3, v7, v6}, La/zb8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2955
    .line 2956
    .line 2957
    new-instance v3, La/ugd;

    .line 2958
    .line 2959
    const v4, -0x3a40da36

    .line 2960
    .line 2961
    .line 2962
    const/4 v11, 0x1

    .line 2963
    invoke-direct {v3, v4, v11, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2964
    .line 2965
    .line 2966
    invoke-static {v0, v1, v15, v3}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 2967
    .line 2968
    .line 2969
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2970
    .line 2971
    return-object v0

    .line 2972
    :pswitch_1c
    check-cast v4, La/vne;

    .line 2973
    .line 2974
    check-cast v3, La/uw8;

    .line 2975
    .line 2976
    check-cast v7, La/d9z;

    .line 2977
    .line 2978
    move-object v0, v1

    .line 2979
    check-cast v0, La/px8;

    .line 2980
    .line 2981
    sget-object v1, La/uw8;->S1:La/cl5;

    .line 2982
    .line 2983
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2984
    .line 2985
    .line 2986
    sget-object v1, La/mx8;->a:La/mx8;

    .line 2987
    .line 2988
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2989
    .line 2990
    .line 2991
    move-result v1

    .line 2992
    if-eqz v1, :cond_49

    .line 2993
    .line 2994
    new-instance v0, La/kn1;

    .line 2995
    .line 2996
    const/4 v6, 0x2

    .line 2997
    invoke-direct {v0, v7, v15, v6}, La/kn1;-><init>(La/d9z;La/yje;B)V

    .line 2998
    .line 2999
    .line 3000
    invoke-static {v4, v15, v15, v0, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 3001
    .line 3002
    .line 3003
    goto/16 :goto_3d

    .line 3004
    .line 3005
    :cond_49
    sget-object v1, La/kx8;->a:La/kx8;

    .line 3006
    .line 3007
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 3008
    .line 3009
    .line 3010
    move-result v1

    .line 3011
    if-eqz v1, :cond_4a

    .line 3012
    .line 3013
    invoke-static {v3}, La/qcc;->c0(Landroidx/fragment/app/Fragment;)Ljava/lang/Boolean;

    .line 3014
    .line 3015
    .line 3016
    goto/16 :goto_3d

    .line 3017
    .line 3018
    :cond_4a
    sget-object v1, La/lx8;->a:La/lx8;

    .line 3019
    .line 3020
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 3021
    .line 3022
    .line 3023
    move-result v1

    .line 3024
    if-eqz v1, :cond_4b

    .line 3025
    .line 3026
    invoke-static {v3}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 3027
    .line 3028
    .line 3029
    goto/16 :goto_3d

    .line 3030
    .line 3031
    :cond_4b
    instance-of v1, v0, La/ox8;

    .line 3032
    .line 3033
    const-string v2, "actionDialogManager"

    .line 3034
    .line 3035
    if-eqz v1, :cond_4d

    .line 3036
    .line 3037
    check-cast v0, La/ox8;

    .line 3038
    .line 3039
    iget-object v1, v0, La/ox8;->a:Ljava/lang/String;

    .line 3040
    .line 3041
    iget-object v4, v0, La/ox8;->b:Ljava/lang/String;

    .line 3042
    .line 3043
    iget-object v0, v0, La/ox8;->c:Ljava/lang/String;

    .line 3044
    .line 3045
    iget-object v5, v3, La/uw8;->N1:La/ii;

    .line 3046
    .line 3047
    if-eqz v5, :cond_4c

    .line 3048
    .line 3049
    new-instance v16, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 3050
    .line 3051
    sget-object v25, La/n12;->b:La/n12;

    .line 3052
    .line 3053
    const/16 v26, 0x0

    .line 3054
    .line 3055
    const/16 v27, 0x5f8

    .line 3056
    .line 3057
    const/16 v20, 0x0

    .line 3058
    .line 3059
    const/16 v21, 0x0

    .line 3060
    .line 3061
    const/16 v22, 0x0

    .line 3062
    .line 3063
    const/16 v23, 0x0

    .line 3064
    .line 3065
    const/16 v24, 0x0

    .line 3066
    .line 3067
    move-object/from16 v19, v0

    .line 3068
    .line 3069
    move-object/from16 v17, v1

    .line 3070
    .line 3071
    move-object/from16 v18, v4

    .line 3072
    .line 3073
    invoke-direct/range {v16 .. v27}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 3074
    .line 3075
    .line 3076
    move-object/from16 v0, v16

    .line 3077
    .line 3078
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 3079
    .line 3080
    .line 3081
    move-result-object v1

    .line 3082
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3083
    .line 3084
    .line 3085
    invoke-virtual {v5, v0, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 3086
    .line 3087
    .line 3088
    goto/16 :goto_3d

    .line 3089
    .line 3090
    :cond_4c
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3091
    .line 3092
    .line 3093
    throw v15

    .line 3094
    :cond_4d
    instance-of v1, v0, La/nx8;

    .line 3095
    .line 3096
    if-eqz v1, :cond_4f

    .line 3097
    .line 3098
    check-cast v0, La/nx8;

    .line 3099
    .line 3100
    iget-object v6, v0, La/nx8;->a:Ljava/lang/String;

    .line 3101
    .line 3102
    iget-object v0, v3, La/uw8;->M1:La/wdk0;

    .line 3103
    .line 3104
    if-eqz v0, :cond_4e

    .line 3105
    .line 3106
    new-instance v17, La/xdk0;

    .line 3107
    .line 3108
    sget-object v5, La/rek0;->b:La/rek0;

    .line 3109
    .line 3110
    const/4 v10, 0x0

    .line 3111
    const/16 v11, 0x7c

    .line 3112
    .line 3113
    const/4 v7, 0x0

    .line 3114
    const/4 v8, 0x0

    .line 3115
    const/4 v9, 0x0

    .line 3116
    move-object/from16 v4, v17

    .line 3117
    .line 3118
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 3119
    .line 3120
    .line 3121
    const/16 v22, 0x0

    .line 3122
    .line 3123
    const/16 v23, 0x3fc

    .line 3124
    .line 3125
    const/16 v19, 0x0

    .line 3126
    .line 3127
    const/16 v20, 0x0

    .line 3128
    .line 3129
    const/16 v21, 0x0

    .line 3130
    .line 3131
    move-object/from16 v16, v0

    .line 3132
    .line 3133
    move-object/from16 v18, v3

    .line 3134
    .line 3135
    invoke-static/range {v16 .. v23}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 3136
    .line 3137
    .line 3138
    goto/16 :goto_3d

    .line 3139
    .line 3140
    :cond_4e
    const-string v0, "snackbarManager"

    .line 3141
    .line 3142
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3143
    .line 3144
    .line 3145
    throw v15

    .line 3146
    :cond_4f
    instance-of v1, v0, La/jx8;

    .line 3147
    .line 3148
    if-eqz v1, :cond_56

    .line 3149
    .line 3150
    check-cast v0, La/jx8;

    .line 3151
    .line 3152
    iget-object v0, v0, La/jx8;->a:La/ob0;

    .line 3153
    .line 3154
    instance-of v1, v0, La/mb0;

    .line 3155
    .line 3156
    if-eqz v1, :cond_51

    .line 3157
    .line 3158
    check-cast v0, La/mb0;

    .line 3159
    .line 3160
    iget-object v6, v0, La/mb0;->a:Ljava/lang/String;

    .line 3161
    .line 3162
    iget-object v4, v3, La/uw8;->L1:La/ynb;

    .line 3163
    .line 3164
    if-eqz v4, :cond_50

    .line 3165
    .line 3166
    sget-object v5, La/bm5;->e:La/bm5;

    .line 3167
    .line 3168
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 3169
    .line 3170
    .line 3171
    move-result-object v7

    .line 3172
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3173
    .line 3174
    .line 3175
    const-string v9, "REQUEST_CHANGE_BALANCE_KEY"

    .line 3176
    .line 3177
    const/16 v10, 0x1e6

    .line 3178
    .line 3179
    const/4 v8, 0x0

    .line 3180
    invoke-static/range {v4 .. v10}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 3181
    .line 3182
    .line 3183
    goto/16 :goto_3d

    .line 3184
    .line 3185
    :cond_50
    const-string v0, "changeBalanceDialogProvider"

    .line 3186
    .line 3187
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3188
    .line 3189
    .line 3190
    throw v15

    .line 3191
    :cond_51
    sget-object v1, La/lb0;->a:La/lb0;

    .line 3192
    .line 3193
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 3194
    .line 3195
    .line 3196
    move-result v1

    .line 3197
    const v4, 0x7f130e5c

    .line 3198
    .line 3199
    .line 3200
    const v5, 0x7f130162

    .line 3201
    .line 3202
    .line 3203
    if-eqz v1, :cond_53

    .line 3204
    .line 3205
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 3206
    .line 3207
    .line 3208
    move-result-object v0

    .line 3209
    if-eqz v0, :cond_56

    .line 3210
    .line 3211
    iget-object v1, v3, La/uw8;->N1:La/ii;

    .line 3212
    .line 3213
    if-eqz v1, :cond_52

    .line 3214
    .line 3215
    new-instance v16, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 3216
    .line 3217
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 3218
    .line 3219
    .line 3220
    move-result-object v17

    .line 3221
    const v2, 0x7f1303dc

    .line 3222
    .line 3223
    .line 3224
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 3225
    .line 3226
    .line 3227
    move-result-object v18

    .line 3228
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 3229
    .line 3230
    .line 3231
    move-result-object v19

    .line 3232
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3233
    .line 3234
    .line 3235
    sget-object v25, La/n12;->b:La/n12;

    .line 3236
    .line 3237
    const/16 v26, 0x0

    .line 3238
    .line 3239
    const/16 v27, 0x5d8

    .line 3240
    .line 3241
    const/16 v20, 0x0

    .line 3242
    .line 3243
    const/16 v21, 0x0

    .line 3244
    .line 3245
    const-string v22, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 3246
    .line 3247
    const/16 v23, 0x0

    .line 3248
    .line 3249
    const/16 v24, 0x0

    .line 3250
    .line 3251
    invoke-direct/range {v16 .. v27}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 3252
    .line 3253
    .line 3254
    move-object/from16 v2, v16

    .line 3255
    .line 3256
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 3257
    .line 3258
    .line 3259
    move-result-object v0

    .line 3260
    invoke-virtual {v1, v2, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 3261
    .line 3262
    .line 3263
    goto :goto_3d

    .line 3264
    :cond_52
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3265
    .line 3266
    .line 3267
    throw v15

    .line 3268
    :cond_53
    sget-object v1, La/nb0;->a:La/nb0;

    .line 3269
    .line 3270
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 3271
    .line 3272
    .line 3273
    move-result v0

    .line 3274
    if-eqz v0, :cond_55

    .line 3275
    .line 3276
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 3277
    .line 3278
    .line 3279
    move-result-object v0

    .line 3280
    if-eqz v0, :cond_56

    .line 3281
    .line 3282
    iget-object v1, v3, La/uw8;->N1:La/ii;

    .line 3283
    .line 3284
    if-eqz v1, :cond_54

    .line 3285
    .line 3286
    new-instance v16, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 3287
    .line 3288
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 3289
    .line 3290
    .line 3291
    move-result-object v17

    .line 3292
    const v2, 0x7f13123b

    .line 3293
    .line 3294
    .line 3295
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 3296
    .line 3297
    .line 3298
    move-result-object v18

    .line 3299
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 3300
    .line 3301
    .line 3302
    move-result-object v19

    .line 3303
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3304
    .line 3305
    .line 3306
    sget-object v25, La/n12;->b:La/n12;

    .line 3307
    .line 3308
    const/16 v26, 0x0

    .line 3309
    .line 3310
    const/16 v27, 0x5d8

    .line 3311
    .line 3312
    const/16 v20, 0x0

    .line 3313
    .line 3314
    const/16 v21, 0x0

    .line 3315
    .line 3316
    const-string v22, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 3317
    .line 3318
    const/16 v23, 0x0

    .line 3319
    .line 3320
    const/16 v24, 0x0

    .line 3321
    .line 3322
    invoke-direct/range {v16 .. v27}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 3323
    .line 3324
    .line 3325
    move-object/from16 v2, v16

    .line 3326
    .line 3327
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 3328
    .line 3329
    .line 3330
    move-result-object v0

    .line 3331
    invoke-virtual {v1, v2, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 3332
    .line 3333
    .line 3334
    goto :goto_3d

    .line 3335
    :cond_54
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3336
    .line 3337
    .line 3338
    throw v15

    .line 3339
    :cond_55
    invoke-static {}, La/t9f;->b()V

    .line 3340
    .line 3341
    .line 3342
    goto :goto_3e

    .line 3343
    :cond_56
    :goto_3d
    invoke-virtual {v3}, La/uw8;->G0()La/k3t0;

    .line 3344
    .line 3345
    .line 3346
    move-result-object v0

    .line 3347
    sget-object v1, La/wt8;->a:La/wt8;

    .line 3348
    .line 3349
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 3350
    .line 3351
    .line 3352
    sget-object v15, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3353
    .line 3354
    :goto_3e
    return-object v15

    .line 3355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
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
