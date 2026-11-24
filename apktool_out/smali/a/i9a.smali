.class public final La/i9a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/f8a;


# static fields
.field public static final f:Z


# instance fields
.field public final a:La/o5d0;

.field public final b:La/tpt0;

.field public final c:La/dgr0;

.field public final d:La/n0o0;

.field public final e:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Landroidx/camera/camera2/compat/quirk/TorchIsClosedAfterImageCapturingQuirk;

    .line 2
    .line 3
    invoke-static {}, La/mhk;->a()La/kpd0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    sput-boolean v0, La/i9a;->f:Z

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(La/l1a;La/o5d0;La/tpt0;La/dgr0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, La/i9a;->a:La/o5d0;

    .line 17
    .line 18
    iput-object p3, p0, La/i9a;->b:La/tpt0;

    .line 19
    .line 20
    iput-object p4, p0, La/i9a;->c:La/dgr0;

    .line 21
    .line 22
    new-instance p2, La/g8a;

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    invoke-direct {p2, p1, p3}, La/g8a;-><init>(La/l1a;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, La/i9a;->d:La/n0o0;

    .line 33
    .line 34
    new-instance p1, La/h8a;

    .line 35
    .line 36
    invoke-direct {p1, p0, p3}, La/h8a;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, La/i9a;->e:La/n0o0;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final a(II)La/r8a;
    .locals 1

    .line 1
    iget-object p0, p0, La/i9a;->e:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/g9a;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, La/r8a;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1, p2}, La/r8a;-><init>(La/g9a;II)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final b(Ljava/util/List;ILa/drd;IIILa/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    instance-of v1, v0, La/h9a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/h9a;

    .line 9
    .line 10
    iget v2, v1, La/h9a;->l:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/h9a;->l:I

    .line 20
    .line 21
    :goto_0
    move-object v9, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, La/h9a;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, La/h9a;-><init>(La/i9a;La/zje;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v9, La/h9a;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v1, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v9, La/h9a;->l:I

    .line 34
    .line 35
    const/4 v10, 0x3

    .line 36
    const/4 v11, 0x0

    .line 37
    const/4 v3, 0x1

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-boolean p1, v9, La/h9a;->i:Z

    .line 43
    .line 44
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v11

    .line 55
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    move-object v0, p1

    .line 61
    check-cast v0, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_3
    move-object v0, p1

    .line 71
    check-cast v0, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_a

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, La/t7a;

    .line 88
    .line 89
    iget-object v4, p0, La/i9a;->d:La/n0o0;

    .line 90
    .line 91
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget v2, v2, La/t7a;->c:I

    .line 105
    .line 106
    const/4 v5, 0x2

    .line 107
    const/4 v6, -0x1

    .line 108
    if-ne p2, v10, :cond_5

    .line 109
    .line 110
    if-nez v4, :cond_5

    .line 111
    .line 112
    const/4 v4, 0x4

    .line 113
    goto :goto_3

    .line 114
    :cond_5
    if-eq v2, v6, :cond_7

    .line 115
    .line 116
    const/4 v4, 0x5

    .line 117
    if-ne v2, v4, :cond_6

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    move v4, v6

    .line 121
    goto :goto_3

    .line 122
    :cond_7
    :goto_2
    move v4, v5

    .line 123
    :goto_3
    if-eq v4, v6, :cond_8

    .line 124
    .line 125
    move v2, v4

    .line 126
    :cond_8
    if-ne v2, v5, :cond_4

    .line 127
    .line 128
    iget-object v0, p0, La/i9a;->c:La/dgr0;

    .line 129
    .line 130
    iget-object v0, v0, La/dgr0;->e:La/hy40;

    .line 131
    .line 132
    invoke-virtual {v0}, La/wh00;->d()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Ljava/lang/Integer;

    .line 137
    .line 138
    if-nez v0, :cond_9

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-ne v0, v3, :cond_a

    .line 146
    .line 147
    move v0, v3

    .line 148
    goto :goto_5

    .line 149
    :cond_a
    :goto_4
    const/4 v0, 0x0

    .line 150
    :goto_5
    iget-object v2, p0, La/i9a;->e:La/n0o0;

    .line 151
    .line 152
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, La/g9a;

    .line 157
    .line 158
    iput-boolean v0, v9, La/h9a;->i:Z

    .line 159
    .line 160
    iput v3, v9, La/h9a;->l:I

    .line 161
    .line 162
    move-object v3, p1

    .line 163
    move v4, p2

    .line 164
    move-object/from16 v5, p3

    .line 165
    .line 166
    move/from16 v6, p4

    .line 167
    .line 168
    move/from16 v7, p5

    .line 169
    .line 170
    move/from16 v8, p6

    .line 171
    .line 172
    invoke-virtual/range {v2 .. v9}, La/g9a;->b(Ljava/util/List;ILa/drd;IIILa/zje;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    if-ne p1, v1, :cond_b

    .line 177
    .line 178
    return-object v1

    .line 179
    :cond_b
    move v12, v0

    .line 180
    move-object v0, p1

    .line 181
    move p1, v12

    .line 182
    :goto_6
    check-cast v0, Ljava/util/List;

    .line 183
    .line 184
    if-eqz p1, :cond_c

    .line 185
    .line 186
    iget-object p1, p0, La/i9a;->b:La/tpt0;

    .line 187
    .line 188
    iget-object p1, p1, La/tpt0;->f:La/sje;

    .line 189
    .line 190
    new-instance p2, La/fr9;

    .line 191
    .line 192
    invoke-direct {p2, v0, p0, v11, v10}, La/fr9;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 193
    .line 194
    .line 195
    invoke-static {p1, v11, v11, p2, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 196
    .line 197
    .line 198
    :cond_c
    return-object v0
.end method

.method public final c(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/i9a;->e:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/g9a;

    .line 8
    .line 9
    iput p1, p0, La/g9a;->l:I

    .line 10
    .line 11
    return-void
.end method
