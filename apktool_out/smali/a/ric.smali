.class public final synthetic La/ric;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/pz40;

.field public final synthetic b:Z

.field public final synthetic c:La/w03;

.field public final synthetic d:La/w03;

.field public final synthetic e:La/w03;

.field public final synthetic f:La/w03;

.field public final synthetic g:La/w03;

.field public final synthetic h:La/w03;

.field public final synthetic i:La/i9q;

.field public final synthetic j:La/g9q0;

.field public final synthetic k:La/cgk0;


# direct methods
.method public synthetic constructor <init>(La/pz40;ZLa/w03;La/w03;La/w03;La/w03;La/w03;La/w03;La/i9q;La/g9q0;La/cgk0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ric;->a:La/pz40;

    iput-boolean p2, p0, La/ric;->b:Z

    iput-object p3, p0, La/ric;->c:La/w03;

    iput-object p4, p0, La/ric;->d:La/w03;

    iput-object p5, p0, La/ric;->e:La/w03;

    iput-object p6, p0, La/ric;->f:La/w03;

    iput-object p7, p0, La/ric;->g:La/w03;

    iput-object p8, p0, La/ric;->h:La/w03;

    iput-object p9, p0, La/ric;->i:La/i9q;

    iput-object p10, p0, La/ric;->j:La/g9q0;

    iput-object p11, p0, La/ric;->k:La/cgk0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/lr8;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, La/fet;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v4, v3, 0x6

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    const/4 v4, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v4, 0x2

    .line 35
    :goto_0
    or-int/2addr v3, v4

    .line 36
    :cond_1
    and-int/lit8 v4, v3, 0x13

    .line 37
    .line 38
    const/16 v5, 0x12

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x1

    .line 42
    if-eq v4, v5, :cond_2

    .line 43
    .line 44
    move v4, v7

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move v4, v6

    .line 47
    :goto_1
    and-int/2addr v3, v7

    .line 48
    invoke-virtual {v2, v3, v4}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_7

    .line 53
    .line 54
    sget-object v3, La/o7k0;->c:La/n0q;

    .line 55
    .line 56
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    iget-object v5, v0, La/ric;->a:La/pz40;

    .line 59
    .line 60
    invoke-virtual {v2, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    iget-boolean v15, v0, La/ric;->b:Z

    .line 65
    .line 66
    invoke-virtual {v2, v15}, La/fet;->h(Z)Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    or-int/2addr v7, v8

    .line 71
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    sget-object v9, La/ukd;->a:La/cl5;

    .line 76
    .line 77
    if-nez v7, :cond_3

    .line 78
    .line 79
    if-ne v8, v9, :cond_4

    .line 80
    .line 81
    :cond_3
    new-instance v8, La/uic;

    .line 82
    .line 83
    iget-object v7, v0, La/ric;->k:La/cgk0;

    .line 84
    .line 85
    invoke-direct {v8, v15, v7, v5}, La/uic;-><init>(ZLa/cgk0;La/pz40;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 92
    .line 93
    invoke-static {v3, v4, v8}, La/fnn0;->a(La/mm40;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)La/mm40;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v1}, La/lr8;->c()F

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-static {v3, v1}, La/tdc;->F(La/mm40;F)La/mm40;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iget-object v3, v0, La/ric;->c:La/w03;

    .line 106
    .line 107
    invoke-virtual {v2, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    iget-object v10, v0, La/ric;->d:La/w03;

    .line 112
    .line 113
    invoke-virtual {v2, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    or-int/2addr v4, v5

    .line 118
    iget-object v11, v0, La/ric;->e:La/w03;

    .line 119
    .line 120
    invoke-virtual {v2, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    or-int/2addr v4, v5

    .line 125
    iget-object v12, v0, La/ric;->f:La/w03;

    .line 126
    .line 127
    invoke-virtual {v2, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    or-int/2addr v4, v5

    .line 132
    iget-object v13, v0, La/ric;->g:La/w03;

    .line 133
    .line 134
    invoke-virtual {v2, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    or-int/2addr v4, v5

    .line 139
    iget-object v14, v0, La/ric;->h:La/w03;

    .line 140
    .line 141
    invoke-virtual {v2, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    or-int/2addr v4, v5

    .line 146
    invoke-virtual {v2, v15}, La/fet;->h(Z)Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    or-int/2addr v4, v5

    .line 151
    iget-object v5, v0, La/ric;->i:La/i9q;

    .line 152
    .line 153
    invoke-virtual {v2, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    or-int/2addr v4, v7

    .line 158
    iget-object v0, v0, La/ric;->j:La/g9q0;

    .line 159
    .line 160
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    or-int/2addr v4, v7

    .line 165
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    if-nez v4, :cond_5

    .line 170
    .line 171
    if-ne v7, v9, :cond_6

    .line 172
    .line 173
    :cond_5
    new-instance v8, La/sic;

    .line 174
    .line 175
    move-object/from16 v17, v0

    .line 176
    .line 177
    move-object v9, v3

    .line 178
    move-object/from16 v16, v5

    .line 179
    .line 180
    invoke-direct/range {v8 .. v17}, La/sic;-><init>(La/w03;La/w03;La/w03;La/w03;La/w03;La/w03;ZLa/i9q;La/g9q0;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    move-object v7, v8

    .line 187
    :cond_6
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 188
    .line 189
    invoke-static {v1, v7, v2, v6}, La/p8a;->k(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_7
    invoke-virtual {v2}, La/fet;->X()V

    .line 194
    .line 195
    .line 196
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object v0
.end method
