.class public final synthetic La/on;
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
.method public synthetic constructor <init>(La/iqt;La/pru;La/ctf0;)V
    .locals 1

    .line 1
    const/16 v0, 0x15

    iput-byte v0, p0, La/on;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/on;->c:Ljava/lang/Object;

    iput-object p2, p0, La/on;->d:Ljava/lang/Object;

    iput-object p3, p0, La/on;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/jdk0;Landroidx/fragment/app/Fragment;La/u8i;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 3
    const/16 p3, 0x11

    iput-byte p3, p0, La/on;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/on;->b:Ljava/lang/Object;

    iput-object p2, p0, La/on;->c:Ljava/lang/Object;

    iput-object p4, p0, La/on;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/vq;Landroidx/fragment/app/Fragment;La/ms2;La/xdr;)V
    .locals 0

    .line 2
    const/4 p2, 0x1

    iput-byte p2, p0, La/on;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/on;->b:Ljava/lang/Object;

    iput-object p3, p0, La/on;->c:Ljava/lang/Object;

    iput-object p4, p0, La/on;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 4
    iput-byte p4, p0, La/on;->a:B

    iput-object p1, p0, La/on;->b:Ljava/lang/Object;

    iput-object p2, p0, La/on;->c:Ljava/lang/Object;

    iput-object p3, p0, La/on;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, La/on;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/m2k0;

    .line 4
    .line 5
    iget-object v1, p0, La/on;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iget-object p0, p0, La/on;->d:Ljava/lang/Object;

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
    iget-object v2, v0, La/m2k0;->a:La/a4x;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    new-instance v4, La/ap30;

    .line 28
    .line 29
    const/4 v5, 0x7

    .line 30
    invoke-direct {v4, v2, v5}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 31
    .line 32
    .line 33
    new-instance v5, La/gic;

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    invoke-direct {v5, v2, v2, v1, v6}, La/gic;-><init>(Ljava/util/List;La/a4x;Lkotlin/jvm/functions/Function1;B)V

    .line 37
    .line 38
    .line 39
    new-instance v1, La/ugd;

    .line 40
    .line 41
    const v2, 0x799532c4

    .line 42
    .line 43
    .line 44
    invoke-direct {v1, v2, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-virtual {p1, v3, v5, v4, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v0, La/m2k0;->b:La/a4x;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance v1, La/efr0;

    .line 60
    .line 61
    const/16 v3, 0x14

    .line 62
    .line 63
    invoke-direct {v1, v3}, La/efr0;-><init>(B)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    new-instance v4, La/xlr0;

    .line 71
    .line 72
    const/4 v5, 0x5

    .line 73
    invoke-direct {v4, v1, v0, v5}, La/xlr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    new-instance v1, La/vdr0;

    .line 77
    .line 78
    const/16 v5, 0x9

    .line 79
    .line 80
    invoke-direct {v1, v0, v5}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 81
    .line 82
    .line 83
    new-instance v5, La/zip0;

    .line 84
    .line 85
    const/4 v7, 0x6

    .line 86
    invoke-direct {v5, v0, p0, v0, v7}, La/zip0;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 87
    .line 88
    .line 89
    new-instance p0, La/ugd;

    .line 90
    .line 91
    invoke-direct {p0, v2, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v3, v4, v1, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, La/on;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/l7m0;

    .line 4
    .line 5
    iget-object v1, p0, La/on;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/l7m0;

    .line 8
    .line 9
    iget-object p0, p0, La/on;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/l7m0;

    .line 12
    .line 13
    check-cast p1, La/uag0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, La/ycl;

    .line 23
    .line 24
    iget v0, v0, La/ycl;->a:F

    .line 25
    .line 26
    iget-object v2, p1, La/uag0;->t:La/w6k;

    .line 27
    .line 28
    invoke-interface {v2}, La/w6k;->getDensity()F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    mul-float/2addr v2, v0

    .line 33
    invoke-virtual {p1, v2}, La/uag0;->I(F)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, La/ycl;

    .line 41
    .line 42
    iget v0, v0, La/ycl;->a:F

    .line 43
    .line 44
    iget-object v1, p1, La/uag0;->t:La/w6k;

    .line 45
    .line 46
    invoke-interface {v1}, La/w6k;->getDensity()F

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    mul-float/2addr v1, v0

    .line 51
    invoke-virtual {p1, v1}, La/uag0;->H(F)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La/on;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lokhttp3/tls/internal/der/BasicDerAdapter;

    .line 4
    .line 5
    iget-object v1, p0, La/on;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lokhttp3/tls/internal/der/DerWriter;

    .line 8
    .line 9
    check-cast p1, La/t99;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p1, v0, Lokhttp3/tls/internal/der/BasicDerAdapter;->d:Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;

    .line 15
    .line 16
    iget-object p0, p0, La/on;->d:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {p1, v1, p0}, Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;->b(Lokhttp3/tls/internal/der/DerWriter;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/on;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, La/on;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/vne;

    .line 8
    .line 9
    iget-object p0, p0, La/on;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/bxq0;

    .line 12
    .line 13
    check-cast p1, La/abi0;

    .line 14
    .line 15
    new-instance v2, La/gj4;

    .line 16
    .line 17
    const/16 v3, 0xe

    .line 18
    .line 19
    invoke-direct {v2, v1, p0, v3}, La/gj4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    sget-object p0, La/yai0;->a:[La/iiy;

    .line 23
    .line 24
    sget-object p0, La/mai0;->c:La/zai0;

    .line 25
    .line 26
    new-instance v1, La/m6;

    .line 27
    .line 28
    invoke-direct {v1, v0, v2}, La/m6;-><init>(Ljava/lang/String;La/wdr;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, p0, v1}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 83

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/on;->b:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v3, v1

    .line 6
    check-cast v3, La/ctf0;

    .line 7
    .line 8
    iget-object v1, v0, La/on;->c:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v4, v1

    .line 11
    check-cast v4, La/ocl;

    .line 12
    .line 13
    iget-object v0, v0, La/on;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;

    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/jk7;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v12, v1, La/jk7;->f:La/ql5;

    .line 28
    .line 29
    iget-object v2, v1, La/jk7;->j:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v12, v3}, La/jiq0;->x0(La/ql5;La/ctf0;)La/on5;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    iget-boolean v5, v1, La/jk7;->a:Z

    .line 36
    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    iget-boolean v8, v1, La/jk7;->e:Z

    .line 40
    .line 41
    iget-object v6, v1, La/jk7;->i:Ljava/lang/String;

    .line 42
    .line 43
    iget-boolean v9, v1, La/jk7;->q:Z

    .line 44
    .line 45
    iget-boolean v10, v1, La/jk7;->t:Z

    .line 46
    .line 47
    new-instance v5, La/ol7;

    .line 48
    .line 49
    invoke-direct/range {v5 .. v10}, La/ol7;-><init>(Ljava/lang/String;La/on5;ZZZ)V

    .line 50
    .line 51
    .line 52
    return-object v5

    .line 53
    :cond_0
    move-object/from16 v16, v7

    .line 54
    .line 55
    iget-boolean v5, v1, La/jk7;->b:Z

    .line 56
    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    iget-boolean v0, v1, La/jk7;->e:Z

    .line 60
    .line 61
    iget-object v2, v1, La/jk7;->i:Ljava/lang/String;

    .line 62
    .line 63
    sget-object v5, La/pb10;->g:La/pb10;

    .line 64
    .line 65
    const-wide/16 v13, 0x0

    .line 66
    .line 67
    const/16 v15, 0x25e

    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v7, 0x0

    .line 71
    const/4 v8, 0x0

    .line 72
    const v9, 0x7f130677

    .line 73
    .line 74
    .line 75
    const v10, 0x7f131690

    .line 76
    .line 77
    .line 78
    const-wide/16 v11, 0x2710

    .line 79
    .line 80
    invoke-static/range {v4 .. v15}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    iget-boolean v10, v1, La/jk7;->q:Z

    .line 85
    .line 86
    iget-boolean v11, v1, La/jk7;->t:Z

    .line 87
    .line 88
    new-instance v5, La/nl7;

    .line 89
    .line 90
    move v8, v0

    .line 91
    move-object v6, v2

    .line 92
    move-object/from16 v7, v16

    .line 93
    .line 94
    invoke-direct/range {v5 .. v11}, La/nl7;-><init>(Ljava/lang/String;La/on5;ZLa/mdm;ZZ)V

    .line 95
    .line 96
    .line 97
    return-object v5

    .line 98
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_2

    .line 103
    .line 104
    iget-boolean v0, v1, La/jk7;->e:Z

    .line 105
    .line 106
    iget-object v2, v1, La/jk7;->i:Ljava/lang/String;

    .line 107
    .line 108
    sget-object v5, La/pb10;->f:La/pb10;

    .line 109
    .line 110
    const-wide/16 v13, 0x0

    .line 111
    .line 112
    const/16 v15, 0x35e

    .line 113
    .line 114
    const/4 v6, 0x0

    .line 115
    const/4 v7, 0x0

    .line 116
    const/4 v8, 0x0

    .line 117
    const v9, 0x7f130253

    .line 118
    .line 119
    .line 120
    const v10, 0x7f130c8d

    .line 121
    .line 122
    .line 123
    const-wide/16 v11, 0x0

    .line 124
    .line 125
    invoke-static/range {v4 .. v15}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    iget-boolean v10, v1, La/jk7;->q:Z

    .line 130
    .line 131
    iget-boolean v11, v1, La/jk7;->t:Z

    .line 132
    .line 133
    new-instance v5, La/ml7;

    .line 134
    .line 135
    move v8, v0

    .line 136
    move-object v6, v2

    .line 137
    move-object/from16 v7, v16

    .line 138
    .line 139
    invoke-direct/range {v5 .. v11}, La/ml7;-><init>(Ljava/lang/String;La/on5;ZLa/mdm;ZZ)V

    .line 140
    .line 141
    .line 142
    return-object v5

    .line 143
    :cond_2
    iget-object v13, v1, La/jk7;->k:Ljava/util/List;

    .line 144
    .line 145
    iget-object v9, v1, La/jk7;->r:Ljava/util/List;

    .line 146
    .line 147
    iget-object v14, v1, La/jk7;->s:Ljava/util/List;

    .line 148
    .line 149
    iget-object v15, v1, La/jk7;->w:Ljava/util/HashMap;

    .line 150
    .line 151
    iget-object v10, v1, La/jk7;->u:Ljava/util/Map;

    .line 152
    .line 153
    iget-boolean v4, v1, La/jk7;->l:Z

    .line 154
    .line 155
    iget-object v11, v1, La/jk7;->m:Ljava/util/List;

    .line 156
    .line 157
    iget-boolean v5, v1, La/jk7;->n:Z

    .line 158
    .line 159
    iget-boolean v6, v1, La/jk7;->x:Z

    .line 160
    .line 161
    iget-boolean v7, v1, La/jk7;->y:Z

    .line 162
    .line 163
    invoke-interface {v0}, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;->p0()La/k77;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    move-object/from16 p0, v1

    .line 172
    .line 173
    const/16 v24, 0x5

    .line 174
    .line 175
    const/16 p1, 0x6

    .line 176
    .line 177
    const/16 v25, 0x4

    .line 178
    .line 179
    const/4 v1, 0x2

    .line 180
    move/from16 v19, v5

    .line 181
    .line 182
    const-wide/16 v30, 0x0

    .line 183
    .line 184
    const/16 v32, 0x0

    .line 185
    .line 186
    const-string v33, ""

    .line 187
    .line 188
    if-eq v8, v1, :cond_37

    .line 189
    .line 190
    move/from16 v35, v1

    .line 191
    .line 192
    const-wide/16 v36, 0x0

    .line 193
    .line 194
    const-string v1, "\u200e"

    .line 195
    .line 196
    const/4 v5, 0x3

    .line 197
    if-eq v8, v5, :cond_2a

    .line 198
    .line 199
    new-instance v5, Ljava/util/ArrayList;

    .line 200
    .line 201
    const/16 v8, 0xa

    .line 202
    .line 203
    invoke-static {v2, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 204
    .line 205
    .line 206
    move-result v15

    .line 207
    invoke-direct {v5, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    if-eqz v8, :cond_29

    .line 219
    .line 220
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    check-cast v8, La/kzv;

    .line 225
    .line 226
    iget-object v15, v8, La/kzv;->a:Ljava/lang/String;

    .line 227
    .line 228
    move-object/from16 v64, v2

    .line 229
    .line 230
    iget-object v2, v8, La/kzv;->B:Ljava/lang/String;

    .line 231
    .line 232
    move-object/from16 v44, v2

    .line 233
    .line 234
    iget-object v2, v8, La/kzv;->a:Ljava/lang/String;

    .line 235
    .line 236
    move/from16 v18, v4

    .line 237
    .line 238
    iget-object v4, v8, La/kzv;->i:Ljava/lang/String;

    .line 239
    .line 240
    invoke-static {v15}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 241
    .line 242
    .line 243
    move-result-object v15

    .line 244
    if-eqz v15, :cond_3

    .line 245
    .line 246
    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    .line 247
    .line 248
    .line 249
    move-result-wide v20

    .line 250
    goto :goto_1

    .line 251
    :cond_3
    move-wide/from16 v20, v30

    .line 252
    .line 253
    :goto_1
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 254
    .line 255
    .line 256
    move-result-object v15

    .line 257
    invoke-interface {v14, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v50

    .line 261
    if-eqz v12, :cond_4

    .line 262
    .line 263
    iget-object v15, v12, La/ql5;->f:Ljava/lang/String;

    .line 264
    .line 265
    goto :goto_2

    .line 266
    :cond_4
    move-object/from16 v15, v32

    .line 267
    .line 268
    :goto_2
    if-nez v15, :cond_5

    .line 269
    .line 270
    move-object/from16 v15, v33

    .line 271
    .line 272
    :cond_5
    invoke-static {v13, v11, v9}, La/b1j;->B(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 273
    .line 274
    .line 275
    move/from16 v22, v6

    .line 276
    .line 277
    iget-object v6, v8, La/kzv;->b:La/q4f;

    .line 278
    .line 279
    move-object/from16 v17, v6

    .line 280
    .line 281
    iget-boolean v6, v8, La/kzv;->x:Z

    .line 282
    .line 283
    move/from16 v20, v6

    .line 284
    .line 285
    move/from16 v23, v7

    .line 286
    .line 287
    iget-wide v6, v8, La/kzv;->V:D

    .line 288
    .line 289
    move-wide/from16 v40, v6

    .line 290
    .line 291
    iget-boolean v6, v8, La/kzv;->G:Z

    .line 292
    .line 293
    iget-boolean v7, v8, La/kzv;->q:Z

    .line 294
    .line 295
    move/from16 v21, v6

    .line 296
    .line 297
    move/from16 v42, v7

    .line 298
    .line 299
    iget-wide v6, v8, La/kzv;->d:J

    .line 300
    .line 301
    move-object/from16 v65, v9

    .line 302
    .line 303
    iget-object v9, v8, La/kzv;->Y:Ljava/util/List;

    .line 304
    .line 305
    move-object/from16 v66, v11

    .line 306
    .line 307
    iget-object v11, v8, La/kzv;->g:La/i0w;

    .line 308
    .line 309
    move-object/from16 v67, v12

    .line 310
    .line 311
    iget v12, v8, La/kzv;->t:I

    .line 312
    .line 313
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    .line 314
    .line 315
    .line 316
    move-result v17

    .line 317
    const/16 v43, 0x7

    .line 318
    .line 319
    move-object/from16 v68, v14

    .line 320
    .line 321
    sget-object v14, La/wro0;->a:La/wro0;

    .line 322
    .line 323
    move-object/from16 v69, v5

    .line 324
    .line 325
    const-string v5, "TagAutoSale"

    .line 326
    .line 327
    move-object/from16 v46, v9

    .line 328
    .line 329
    sget-object v9, La/cpo0;->a:La/cpo0;

    .line 330
    .line 331
    move-object/from16 v70, v0

    .line 332
    .line 333
    const-string v0, "TagAdvance"

    .line 334
    .line 335
    move-object/from16 v71, v1

    .line 336
    .line 337
    sget-object v1, La/bro0;->a:La/bro0;

    .line 338
    .line 339
    move-object/from16 v47, v4

    .line 340
    .line 341
    const-string v4, "TopChampTag"

    .line 342
    .line 343
    move-object/from16 v72, v10

    .line 344
    .line 345
    sget-object v10, La/tqo0;->a:La/tqo0;

    .line 346
    .line 347
    move-object/from16 v48, v11

    .line 348
    .line 349
    const-string v11, "TagPromo"

    .line 350
    .line 351
    move-object/from16 v49, v15

    .line 352
    .line 353
    sget-object v15, La/kro0;->a:La/kro0;

    .line 354
    .line 355
    move-object/from16 v51, v5

    .line 356
    .line 357
    const-string v5, "TagLive"

    .line 358
    .line 359
    move-object/from16 v52, v14

    .line 360
    .line 361
    const-string v14, "TagLines.Title"

    .line 362
    .line 363
    const v53, 0x7f08066b

    .line 364
    .line 365
    .line 366
    const v54, 0x7f08066c

    .line 367
    .line 368
    .line 369
    move-object/from16 v55, v0

    .line 370
    .line 371
    const-string v0, "Counter"

    .line 372
    .line 373
    packed-switch v17, :pswitch_data_0

    .line 374
    .line 375
    .line 376
    move-object/from16 v17, v9

    .line 377
    .line 378
    invoke-static {v8, v3, v13}, La/jwb;->J(La/kzv;La/ctf0;Ljava/util/List;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v9

    .line 382
    invoke-interface/range {v65 .. v65}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 383
    .line 384
    .line 385
    move-result-object v61

    .line 386
    :goto_3
    invoke-interface/range {v61 .. v61}, Ljava/util/Iterator;->hasNext()Z

    .line 387
    .line 388
    .line 389
    move-result v62

    .line 390
    if-eqz v62, :cond_7

    .line 391
    .line 392
    invoke-interface/range {v61 .. v61}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v62

    .line 396
    move-object/from16 v73, v13

    .line 397
    .line 398
    move-object/from16 v13, v62

    .line 399
    .line 400
    check-cast v13, La/xco;

    .line 401
    .line 402
    move-object/from16 v74, v9

    .line 403
    .line 404
    move-object/from16 v63, v10

    .line 405
    .line 406
    iget-wide v9, v13, La/xco;->a:J

    .line 407
    .line 408
    move-wide/from16 v75, v9

    .line 409
    .line 410
    iget-wide v9, v8, La/kzv;->T:J

    .line 411
    .line 412
    cmp-long v9, v75, v9

    .line 413
    .line 414
    if-nez v9, :cond_6

    .line 415
    .line 416
    goto :goto_4

    .line 417
    :cond_6
    move-object/from16 v10, v63

    .line 418
    .line 419
    move-object/from16 v13, v73

    .line 420
    .line 421
    move-object/from16 v9, v74

    .line 422
    .line 423
    goto :goto_3

    .line 424
    :cond_7
    move-object/from16 v74, v9

    .line 425
    .line 426
    move-object/from16 v63, v10

    .line 427
    .line 428
    move-object/from16 v73, v13

    .line 429
    .line 430
    move-object/from16 v62, v32

    .line 431
    .line 432
    :goto_4
    move-object/from16 v9, v62

    .line 433
    .line 434
    check-cast v9, La/xco;

    .line 435
    .line 436
    invoke-interface/range {v66 .. v66}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 437
    .line 438
    .line 439
    move-result-object v10

    .line 440
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 441
    .line 442
    .line 443
    move-result v13

    .line 444
    if-eqz v13, :cond_a

    .line 445
    .line 446
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v13

    .line 450
    move-object/from16 v61, v10

    .line 451
    .line 452
    move-object v10, v13

    .line 453
    check-cast v10, La/ueo;

    .line 454
    .line 455
    invoke-static/range {v46 .. v46}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v62

    .line 459
    move-object/from16 v75, v13

    .line 460
    .line 461
    move-object/from16 v13, v62

    .line 462
    .line 463
    check-cast v13, La/z0w;

    .line 464
    .line 465
    if-eqz v13, :cond_8

    .line 466
    .line 467
    iget v13, v13, La/z0w;->v:I

    .line 468
    .line 469
    move-object/from16 v62, v8

    .line 470
    .line 471
    move-object/from16 v76, v9

    .line 472
    .line 473
    iget-wide v8, v10, La/ueo;->a:J

    .line 474
    .line 475
    move-wide/from16 v77, v8

    .line 476
    .line 477
    int-to-long v8, v13

    .line 478
    cmp-long v8, v77, v8

    .line 479
    .line 480
    if-nez v8, :cond_9

    .line 481
    .line 482
    move-object/from16 v13, v75

    .line 483
    .line 484
    goto :goto_6

    .line 485
    :cond_8
    move-object/from16 v62, v8

    .line 486
    .line 487
    move-object/from16 v76, v9

    .line 488
    .line 489
    :cond_9
    move-object/from16 v10, v61

    .line 490
    .line 491
    move-object/from16 v8, v62

    .line 492
    .line 493
    move-object/from16 v9, v76

    .line 494
    .line 495
    goto :goto_5

    .line 496
    :cond_a
    move-object/from16 v62, v8

    .line 497
    .line 498
    move-object/from16 v76, v9

    .line 499
    .line 500
    move-object/from16 v13, v32

    .line 501
    .line 502
    :goto_6
    check-cast v13, La/ueo;

    .line 503
    .line 504
    sget-object v8, La/rdj;->a:La/rdj;

    .line 505
    .line 506
    iget-object v8, v3, La/ctf0;->b:La/lsm0;

    .line 507
    .line 508
    invoke-virtual {v3}, La/ctf0;->h()Z

    .line 509
    .line 510
    .line 511
    move-result v9

    .line 512
    sget-object v10, La/efj;->c:La/efj;

    .line 513
    .line 514
    move/from16 v46, v9

    .line 515
    .line 516
    new-instance v9, La/znq0;

    .line 517
    .line 518
    invoke-direct {v9, v6, v7}, La/znq0;-><init>(J)V

    .line 519
    .line 520
    .line 521
    invoke-static/range {v46 .. v46}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 522
    .line 523
    .line 524
    move-result-object v6

    .line 525
    move-object/from16 v46, v13

    .line 526
    .line 527
    const/16 v7, 0x38

    .line 528
    .line 529
    const/4 v13, 0x0

    .line 530
    invoke-static {v9, v10, v6, v13, v7}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v6

    .line 534
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v7

    .line 538
    const/4 v9, 0x1

    .line 539
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v7

    .line 543
    const v10, 0x7f1309d9

    .line 544
    .line 545
    .line 546
    invoke-virtual {v8, v10, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v7

    .line 550
    new-instance v13, La/too0;

    .line 551
    .line 552
    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v14

    .line 556
    move-object/from16 v61, v2

    .line 557
    .line 558
    filled-new-array/range {v61 .. v61}, [Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    invoke-virtual {v8, v10, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    invoke-direct {v13, v14, v2}, La/too0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    new-instance v2, La/joo0;

    .line 574
    .line 575
    invoke-static {v12, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-direct {v2, v0, v12}, La/joo0;-><init>(Ljava/lang/String;I)V

    .line 580
    .line 581
    .line 582
    if-eq v12, v9, :cond_b

    .line 583
    .line 584
    goto :goto_7

    .line 585
    :cond_b
    move-object/from16 v2, v32

    .line 586
    .line 587
    :goto_7
    new-instance v0, La/ooo0;

    .line 588
    .line 589
    const/4 v9, 0x0

    .line 590
    new-array v10, v9, [Ljava/lang/Object;

    .line 591
    .line 592
    invoke-static {v10, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v10

    .line 596
    const v12, 0x7f130b40

    .line 597
    .line 598
    .line 599
    invoke-virtual {v8, v12, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v10

    .line 603
    invoke-direct {v0, v10, v5, v15}, La/ooo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 604
    .line 605
    .line 606
    if-eqz v42, :cond_c

    .line 607
    .line 608
    goto :goto_8

    .line 609
    :cond_c
    move-object/from16 v0, v32

    .line 610
    .line 611
    :goto_8
    new-instance v5, La/qoo0;

    .line 612
    .line 613
    new-array v10, v9, [Ljava/lang/Object;

    .line 614
    .line 615
    invoke-static {v10, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v10

    .line 619
    const v9, 0x7f131011

    .line 620
    .line 621
    .line 622
    invoke-virtual {v8, v9, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v9

    .line 626
    move-object/from16 v10, v63

    .line 627
    .line 628
    invoke-direct {v5, v9, v11, v10}, La/qoo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 629
    .line 630
    .line 631
    if-eqz v21, :cond_d

    .line 632
    .line 633
    :goto_9
    move-object/from16 v9, v74

    .line 634
    .line 635
    goto :goto_a

    .line 636
    :cond_d
    move-object/from16 v5, v32

    .line 637
    .line 638
    goto :goto_9

    .line 639
    :goto_a
    invoke-virtual {v4, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v4

    .line 643
    new-instance v10, La/roo0;

    .line 644
    .line 645
    invoke-direct {v10, v9, v4, v1}, La/roo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 649
    .line 650
    .line 651
    move-result v1

    .line 652
    if-lez v1, :cond_e

    .line 653
    .line 654
    goto :goto_b

    .line 655
    :cond_e
    move-object/from16 v10, v32

    .line 656
    .line 657
    :goto_b
    new-instance v1, La/koo0;

    .line 658
    .line 659
    const/4 v9, 0x0

    .line 660
    new-array v4, v9, [Ljava/lang/Object;

    .line 661
    .line 662
    invoke-static {v4, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v4

    .line 666
    const v11, 0x7f130077

    .line 667
    .line 668
    .line 669
    invoke-virtual {v8, v11, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v4

    .line 673
    move-object/from16 v11, v17

    .line 674
    .line 675
    move-object/from16 v12, v55

    .line 676
    .line 677
    invoke-direct {v1, v4, v12, v11}, La/koo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 678
    .line 679
    .line 680
    cmpg-double v4, v40, v36

    .line 681
    .line 682
    if-nez v4, :cond_f

    .line 683
    .line 684
    move-object/from16 v1, v32

    .line 685
    .line 686
    :cond_f
    new-instance v4, La/loo0;

    .line 687
    .line 688
    new-array v11, v9, [Ljava/lang/Object;

    .line 689
    .line 690
    invoke-static {v11, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v11

    .line 694
    const v12, 0x7f1309c7

    .line 695
    .line 696
    .line 697
    invoke-virtual {v8, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v11

    .line 701
    move-object/from16 v14, v51

    .line 702
    .line 703
    move-object/from16 v12, v52

    .line 704
    .line 705
    invoke-direct {v4, v11, v14, v12}, La/loo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 706
    .line 707
    .line 708
    if-eqz v20, :cond_10

    .line 709
    .line 710
    goto :goto_c

    .line 711
    :cond_10
    move-object/from16 v4, v32

    .line 712
    .line 713
    :goto_c
    new-instance v11, La/ioo0;

    .line 714
    .line 715
    new-array v12, v9, [Ljava/lang/Object;

    .line 716
    .line 717
    invoke-static {v12, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v12

    .line 721
    const v14, 0x7f1301ad

    .line 722
    .line 723
    .line 724
    invoke-virtual {v8, v14, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v12

    .line 728
    invoke-direct {v11, v12}, La/ioo0;-><init>(Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    move-object/from16 v12, v76

    .line 732
    .line 733
    if-eqz v76, :cond_11

    .line 734
    .line 735
    iget-boolean v14, v12, La/xco;->e:Z

    .line 736
    .line 737
    move/from16 v27, v14

    .line 738
    .line 739
    goto :goto_d

    .line 740
    :cond_11
    move/from16 v27, v9

    .line 741
    .line 742
    :goto_d
    if-eqz v27, :cond_12

    .line 743
    .line 744
    :goto_e
    const/16 v14, 0x8

    .line 745
    .line 746
    goto :goto_f

    .line 747
    :cond_12
    move-object/from16 v11, v32

    .line 748
    .line 749
    goto :goto_e

    .line 750
    :goto_f
    new-array v14, v14, [La/uoo0;

    .line 751
    .line 752
    aput-object v13, v14, v9

    .line 753
    .line 754
    const/16 v28, 0x1

    .line 755
    .line 756
    aput-object v2, v14, v28

    .line 757
    .line 758
    aput-object v0, v14, v35

    .line 759
    .line 760
    const/16 v26, 0x3

    .line 761
    .line 762
    aput-object v5, v14, v26

    .line 763
    .line 764
    aput-object v10, v14, v25

    .line 765
    .line 766
    aput-object v1, v14, v24

    .line 767
    .line 768
    aput-object v4, v14, p1

    .line 769
    .line 770
    aput-object v11, v14, v43

    .line 771
    .line 772
    invoke-static {v14}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    move-object/from16 v2, v49

    .line 781
    .line 782
    move-object/from16 v1, v62

    .line 783
    .line 784
    invoke-static {v1, v3, v2}, La/k7x;->F(La/kzv;La/ctf0;Ljava/lang/String;)La/f3w;

    .line 785
    .line 786
    .line 787
    move-result-object v4

    .line 788
    invoke-static {v1, v3, v2}, La/k7x;->E(La/kzv;La/ctf0;Ljava/lang/String;)La/f3w;

    .line 789
    .line 790
    .line 791
    move-result-object v5

    .line 792
    invoke-static {v1, v3, v2}, La/k7x;->K(La/kzv;La/ctf0;Ljava/lang/String;)La/f3w;

    .line 793
    .line 794
    .line 795
    move-result-object v9

    .line 796
    invoke-static {v3}, La/k7x;->M(La/ctf0;)La/m3w;

    .line 797
    .line 798
    .line 799
    move-result-object v10

    .line 800
    move/from16 v11, v25

    .line 801
    .line 802
    new-array v13, v11, [La/h3w;

    .line 803
    .line 804
    const/16 v27, 0x0

    .line 805
    .line 806
    aput-object v4, v13, v27

    .line 807
    .line 808
    const/16 v28, 0x1

    .line 809
    .line 810
    aput-object v5, v13, v28

    .line 811
    .line 812
    aput-object v9, v13, v35

    .line 813
    .line 814
    const/16 v26, 0x3

    .line 815
    .line 816
    aput-object v10, v13, v26

    .line 817
    .line 818
    invoke-static {v13}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 819
    .line 820
    .line 821
    move-result-object v4

    .line 822
    invoke-static {v4}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 823
    .line 824
    .line 825
    move-result-object v4

    .line 826
    sget-object v5, La/i0w;->b:La/i0w;

    .line 827
    .line 828
    move-object/from16 v9, v48

    .line 829
    .line 830
    if-ne v9, v5, :cond_13

    .line 831
    .line 832
    const/16 v48, 0x1

    .line 833
    .line 834
    goto :goto_10

    .line 835
    :cond_13
    const/16 v48, 0x0

    .line 836
    .line 837
    :goto_10
    if-eqz v50, :cond_14

    .line 838
    .line 839
    move/from16 v49, v54

    .line 840
    .line 841
    goto :goto_11

    .line 842
    :cond_14
    move/from16 v49, v53

    .line 843
    .line 844
    :goto_11
    invoke-static {v1}, La/lmc;->a0(La/kzv;)La/tvw;

    .line 845
    .line 846
    .line 847
    move-result-object v51

    .line 848
    invoke-static {v1, v3, v2}, La/k7x;->L(La/kzv;La/ctf0;Ljava/lang/String;)Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v53

    .line 852
    invoke-static {v9}, La/vic;->K(La/i0w;)I

    .line 853
    .line 854
    .line 855
    move-result v57

    .line 856
    move-object/from16 v13, v72

    .line 857
    .line 858
    invoke-static {v1, v3, v13}, La/thb;->D(La/kzv;La/ctf0;Ljava/util/Map;)Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v59

    .line 862
    move-object/from16 v2, v47

    .line 863
    .line 864
    move-object/from16 v5, v71

    .line 865
    .line 866
    invoke-static {v5, v2}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v60

    .line 870
    if-eqz v12, :cond_15

    .line 871
    .line 872
    iget-object v2, v12, La/xco;->b:Ljava/lang/String;

    .line 873
    .line 874
    goto :goto_12

    .line 875
    :cond_15
    move-object/from16 v2, v32

    .line 876
    .line 877
    :goto_12
    if-nez v2, :cond_16

    .line 878
    .line 879
    move-object/from16 v21, v33

    .line 880
    .line 881
    :goto_13
    move-object/from16 v17, v1

    .line 882
    .line 883
    move-object/from16 v20, v46

    .line 884
    .line 885
    goto :goto_14

    .line 886
    :cond_16
    move-object/from16 v21, v2

    .line 887
    .line 888
    goto :goto_13

    .line 889
    :goto_14
    invoke-static/range {v17 .. v23}, La/f7k;->R(La/kzv;ZZLa/ueo;Ljava/lang/String;ZZ)Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v1

    .line 893
    move-object/from16 v2, v17

    .line 894
    .line 895
    sget-object v10, La/i0w;->i:La/i0w;

    .line 896
    .line 897
    if-eq v9, v10, :cond_17

    .line 898
    .line 899
    goto :goto_15

    .line 900
    :cond_17
    move-object/from16 v1, v32

    .line 901
    .line 902
    :goto_15
    if-nez v1, :cond_18

    .line 903
    .line 904
    const/4 v11, 0x0

    .line 905
    new-array v1, v11, [Ljava/lang/Object;

    .line 906
    .line 907
    invoke-static {v1, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v1

    .line 911
    const v11, 0x7f13125c

    .line 912
    .line 913
    .line 914
    invoke-virtual {v8, v11, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v1

    .line 918
    :goto_16
    move-object/from16 v8, v70

    .line 919
    .line 920
    goto :goto_17

    .line 921
    :cond_18
    const v11, 0x7f13125c

    .line 922
    .line 923
    .line 924
    goto :goto_16

    .line 925
    :goto_17
    invoke-static {v2, v8}, La/wvb;->T(La/kzv;Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;)Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v2

    .line 929
    if-eq v9, v10, :cond_19

    .line 930
    .line 931
    goto :goto_18

    .line 932
    :cond_19
    move-object/from16 v2, v32

    .line 933
    .line 934
    :goto_18
    if-nez v2, :cond_1a

    .line 935
    .line 936
    move-object/from16 v62, v33

    .line 937
    .line 938
    goto :goto_19

    .line 939
    :cond_1a
    move-object/from16 v62, v2

    .line 940
    .line 941
    :goto_19
    new-instance v40, La/p3w;

    .line 942
    .line 943
    const-string v58, ""

    .line 944
    .line 945
    const/16 v63, 0x0

    .line 946
    .line 947
    const/16 v52, 0x1

    .line 948
    .line 949
    const/16 v54, 0x0

    .line 950
    .line 951
    const/16 v55, 0x1

    .line 952
    .line 953
    const/16 v56, 0x1

    .line 954
    .line 955
    move-object/from16 v42, v61

    .line 956
    .line 957
    move-object/from16 v46, v0

    .line 958
    .line 959
    move-object/from16 v47, v4

    .line 960
    .line 961
    move-object/from16 v43, v6

    .line 962
    .line 963
    move-object/from16 v45, v7

    .line 964
    .line 965
    move-object/from16 v41, v61

    .line 966
    .line 967
    move-object/from16 v61, v1

    .line 968
    .line 969
    invoke-direct/range {v40 .. v63}, La/p3w;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/i4;La/i4;ZIZLa/tvw;ZLjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 970
    .line 971
    .line 972
    move-object/from16 v70, v8

    .line 973
    .line 974
    move/from16 v29, v11

    .line 975
    .line 976
    move-object/from16 v72, v13

    .line 977
    .line 978
    const v4, 0x7f13049b

    .line 979
    .line 980
    .line 981
    move-object v13, v5

    .line 982
    :goto_1a
    move-object/from16 v0, v40

    .line 983
    .line 984
    move-object/from16 v1, v69

    .line 985
    .line 986
    goto/16 :goto_28

    .line 987
    .line 988
    :pswitch_0
    move-object/from16 v61, v2

    .line 989
    .line 990
    move-object/from16 v17, v9

    .line 991
    .line 992
    move-object/from16 v9, v55

    .line 993
    .line 994
    move-object/from16 v79, v71

    .line 995
    .line 996
    const v29, 0x7f13125c

    .line 997
    .line 998
    .line 999
    invoke-static {v8, v3, v13}, La/jwb;->J(La/kzv;La/ctf0;Ljava/util/List;)Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v2

    .line 1003
    move-object/from16 v73, v13

    .line 1004
    .line 1005
    new-instance v13, Ljava/util/ArrayList;

    .line 1006
    .line 1007
    move-object/from16 v62, v8

    .line 1008
    .line 1009
    move-object/from16 v8, v46

    .line 1010
    .line 1011
    const/16 v9, 0xa

    .line 1012
    .line 1013
    move-object/from16 v46, v1

    .line 1014
    .line 1015
    invoke-static {v8, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1016
    .line 1017
    .line 1018
    move-result v1

    .line 1019
    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1020
    .line 1021
    .line 1022
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v1

    .line 1026
    :goto_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v8

    .line 1030
    if-eqz v8, :cond_1b

    .line 1031
    .line 1032
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v8

    .line 1036
    check-cast v8, La/z0w;

    .line 1037
    .line 1038
    iget-wide v8, v8, La/z0w;->F:J

    .line 1039
    .line 1040
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v8

    .line 1044
    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1045
    .line 1046
    .line 1047
    goto :goto_1b

    .line 1048
    :cond_1b
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->J0(Ljava/lang/Iterable;)Ljava/util/HashSet;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v1

    .line 1052
    sget-object v8, La/rdj;->a:La/rdj;

    .line 1053
    .line 1054
    iget-object v8, v3, La/ctf0;->b:La/lsm0;

    .line 1055
    .line 1056
    invoke-virtual {v3}, La/ctf0;->h()Z

    .line 1057
    .line 1058
    .line 1059
    move-result v9

    .line 1060
    sget-object v13, La/efj;->c:La/efj;

    .line 1061
    .line 1062
    move/from16 v63, v9

    .line 1063
    .line 1064
    new-instance v9, La/znq0;

    .line 1065
    .line 1066
    invoke-direct {v9, v6, v7}, La/znq0;-><init>(J)V

    .line 1067
    .line 1068
    .line 1069
    invoke-static/range {v63 .. v63}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v6

    .line 1073
    move-object/from16 v71, v3

    .line 1074
    .line 1075
    const/4 v3, 0x0

    .line 1076
    const/16 v7, 0x38

    .line 1077
    .line 1078
    invoke-static {v9, v13, v6, v3, v7}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v6

    .line 1082
    filled-new-array/range {v61 .. v61}, [Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v3

    .line 1086
    const/4 v9, 0x1

    .line 1087
    invoke-static {v3, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v3

    .line 1091
    const v7, 0x7f1309d9

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v8, v7, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v3

    .line 1098
    new-instance v13, La/too0;

    .line 1099
    .line 1100
    move-object/from16 v7, v61

    .line 1101
    .line 1102
    invoke-virtual {v14, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v14

    .line 1106
    move-object/from16 v61, v3

    .line 1107
    .line 1108
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v3

    .line 1112
    invoke-static {v3, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v3

    .line 1116
    const v9, 0x7f1309d9

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v8, v9, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v3

    .line 1123
    invoke-direct {v13, v14, v3}, La/too0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1124
    .line 1125
    .line 1126
    new-instance v3, La/joo0;

    .line 1127
    .line 1128
    invoke-static {v12, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    invoke-direct {v3, v0, v12}, La/joo0;-><init>(Ljava/lang/String;I)V

    .line 1133
    .line 1134
    .line 1135
    const/4 v9, 0x1

    .line 1136
    if-eq v12, v9, :cond_1c

    .line 1137
    .line 1138
    goto :goto_1c

    .line 1139
    :cond_1c
    move-object/from16 v3, v32

    .line 1140
    .line 1141
    :goto_1c
    new-instance v0, La/ooo0;

    .line 1142
    .line 1143
    const/4 v9, 0x0

    .line 1144
    new-array v14, v9, [Ljava/lang/Object;

    .line 1145
    .line 1146
    invoke-static {v14, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v14

    .line 1150
    const v9, 0x7f130b40

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v8, v9, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v9

    .line 1157
    invoke-direct {v0, v9, v5, v15}, La/ooo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 1158
    .line 1159
    .line 1160
    if-eqz v42, :cond_1d

    .line 1161
    .line 1162
    goto :goto_1d

    .line 1163
    :cond_1d
    move-object/from16 v0, v32

    .line 1164
    .line 1165
    :goto_1d
    new-instance v5, La/qoo0;

    .line 1166
    .line 1167
    const/4 v9, 0x0

    .line 1168
    new-array v14, v9, [Ljava/lang/Object;

    .line 1169
    .line 1170
    invoke-static {v14, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v14

    .line 1174
    const v9, 0x7f131011

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v8, v9, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v9

    .line 1181
    invoke-direct {v5, v9, v11, v10}, La/qoo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 1182
    .line 1183
    .line 1184
    if-eqz v21, :cond_1e

    .line 1185
    .line 1186
    goto :goto_1e

    .line 1187
    :cond_1e
    move-object/from16 v5, v32

    .line 1188
    .line 1189
    :goto_1e
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v4

    .line 1193
    new-instance v9, La/roo0;

    .line 1194
    .line 1195
    move-object/from16 v10, v46

    .line 1196
    .line 1197
    invoke-direct {v9, v2, v4, v10}, La/roo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1201
    .line 1202
    .line 1203
    move-result v2

    .line 1204
    if-lez v2, :cond_1f

    .line 1205
    .line 1206
    goto :goto_1f

    .line 1207
    :cond_1f
    move-object/from16 v9, v32

    .line 1208
    .line 1209
    :goto_1f
    new-instance v2, La/koo0;

    .line 1210
    .line 1211
    const/4 v11, 0x0

    .line 1212
    new-array v4, v11, [Ljava/lang/Object;

    .line 1213
    .line 1214
    invoke-static {v4, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v4

    .line 1218
    const v10, 0x7f130077

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v8, v10, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v4

    .line 1225
    move-object/from16 v10, v17

    .line 1226
    .line 1227
    move-object/from16 v14, v55

    .line 1228
    .line 1229
    invoke-direct {v2, v4, v14, v10}, La/koo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 1230
    .line 1231
    .line 1232
    cmpg-double v4, v40, v36

    .line 1233
    .line 1234
    if-nez v4, :cond_20

    .line 1235
    .line 1236
    move-object/from16 v2, v32

    .line 1237
    .line 1238
    :cond_20
    new-instance v4, La/loo0;

    .line 1239
    .line 1240
    new-array v10, v11, [Ljava/lang/Object;

    .line 1241
    .line 1242
    invoke-static {v10, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v10

    .line 1246
    const v14, 0x7f1309c7

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v8, v14, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v10

    .line 1253
    move-object/from16 v15, v51

    .line 1254
    .line 1255
    move-object/from16 v14, v52

    .line 1256
    .line 1257
    invoke-direct {v4, v10, v15, v14}, La/loo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 1258
    .line 1259
    .line 1260
    if-eqz v20, :cond_21

    .line 1261
    .line 1262
    goto :goto_20

    .line 1263
    :cond_21
    move-object/from16 v4, v32

    .line 1264
    .line 1265
    :goto_20
    new-instance v10, La/ioo0;

    .line 1266
    .line 1267
    new-array v14, v11, [Ljava/lang/Object;

    .line 1268
    .line 1269
    invoke-static {v14, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v14

    .line 1273
    const v11, 0x7f1301ad

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v8, v11, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v11

    .line 1280
    invoke-direct {v10, v11}, La/ioo0;-><init>(Ljava/lang/String;)V

    .line 1281
    .line 1282
    .line 1283
    new-instance v11, Ljava/util/ArrayList;

    .line 1284
    .line 1285
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1286
    .line 1287
    .line 1288
    invoke-interface/range {v65 .. v65}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v14

    .line 1292
    :goto_21
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1293
    .line 1294
    .line 1295
    move-result v15

    .line 1296
    if-eqz v15, :cond_23

    .line 1297
    .line 1298
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v15

    .line 1302
    move-object/from16 v17, v0

    .line 1303
    .line 1304
    move-object v0, v15

    .line 1305
    check-cast v0, La/xco;

    .line 1306
    .line 1307
    iget-boolean v0, v0, La/xco;->e:Z

    .line 1308
    .line 1309
    if-eqz v0, :cond_22

    .line 1310
    .line 1311
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1312
    .line 1313
    .line 1314
    :cond_22
    move-object/from16 v0, v17

    .line 1315
    .line 1316
    goto :goto_21

    .line 1317
    :cond_23
    move-object/from16 v17, v0

    .line 1318
    .line 1319
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1320
    .line 1321
    .line 1322
    move-result v0

    .line 1323
    if-eqz v0, :cond_24

    .line 1324
    .line 1325
    goto :goto_23

    .line 1326
    :cond_24
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v0

    .line 1330
    :cond_25
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1331
    .line 1332
    .line 1333
    move-result v11

    .line 1334
    if-eqz v11, :cond_26

    .line 1335
    .line 1336
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v11

    .line 1340
    check-cast v11, La/xco;

    .line 1341
    .line 1342
    iget-wide v14, v11, La/xco;->a:J

    .line 1343
    .line 1344
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v11

    .line 1348
    invoke-virtual {v1, v11}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1349
    .line 1350
    .line 1351
    move-result v11

    .line 1352
    if-eqz v11, :cond_25

    .line 1353
    .line 1354
    :goto_22
    const/16 v14, 0x8

    .line 1355
    .line 1356
    goto :goto_24

    .line 1357
    :cond_26
    :goto_23
    move-object/from16 v10, v32

    .line 1358
    .line 1359
    goto :goto_22

    .line 1360
    :goto_24
    new-array v0, v14, [La/uoo0;

    .line 1361
    .line 1362
    const/4 v11, 0x0

    .line 1363
    aput-object v13, v0, v11

    .line 1364
    .line 1365
    const/16 v28, 0x1

    .line 1366
    .line 1367
    aput-object v3, v0, v28

    .line 1368
    .line 1369
    aput-object v17, v0, v35

    .line 1370
    .line 1371
    const/16 v26, 0x3

    .line 1372
    .line 1373
    aput-object v5, v0, v26

    .line 1374
    .line 1375
    const/16 v25, 0x4

    .line 1376
    .line 1377
    aput-object v9, v0, v25

    .line 1378
    .line 1379
    aput-object v2, v0, v24

    .line 1380
    .line 1381
    aput-object v4, v0, p1

    .line 1382
    .line 1383
    aput-object v10, v0, v43

    .line 1384
    .line 1385
    invoke-static {v0}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v0

    .line 1389
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v46

    .line 1393
    new-instance v0, La/i3w;

    .line 1394
    .line 1395
    new-array v1, v11, [Ljava/lang/Object;

    .line 1396
    .line 1397
    invoke-static {v1, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v1

    .line 1401
    const v2, 0x7f130880

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual {v8, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v1

    .line 1408
    move-object/from16 v2, v62

    .line 1409
    .line 1410
    iget v3, v2, La/kzv;->u:I

    .line 1411
    .line 1412
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v3

    .line 1416
    iget v4, v2, La/kzv;->v:I

    .line 1417
    .line 1418
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v4

    .line 1422
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v5

    .line 1426
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v4

    .line 1430
    move/from16 v5, v35

    .line 1431
    .line 1432
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v4

    .line 1436
    const v5, 0x7f1308d5

    .line 1437
    .line 1438
    .line 1439
    invoke-virtual {v8, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v4

    .line 1443
    invoke-direct {v0, v1, v3, v4}, La/i3w;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1444
    .line 1445
    .line 1446
    new-instance v1, La/j3w;

    .line 1447
    .line 1448
    const/4 v9, 0x0

    .line 1449
    new-array v3, v9, [Ljava/lang/Object;

    .line 1450
    .line 1451
    invoke-static {v3, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v3

    .line 1455
    const v4, 0x7f13049b

    .line 1456
    .line 1457
    .line 1458
    invoke-virtual {v8, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v3

    .line 1462
    move-object/from16 v5, v47

    .line 1463
    .line 1464
    move-object/from16 v13, v79

    .line 1465
    .line 1466
    invoke-static {v13, v5}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v8

    .line 1470
    invoke-direct {v1, v3, v8}, La/j3w;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1471
    .line 1472
    .line 1473
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1474
    .line 1475
    .line 1476
    move-result v3

    .line 1477
    if-lez v3, :cond_27

    .line 1478
    .line 1479
    :goto_25
    move-object/from16 v15, v49

    .line 1480
    .line 1481
    move-object/from16 v3, v71

    .line 1482
    .line 1483
    goto :goto_26

    .line 1484
    :cond_27
    move-object/from16 v1, v32

    .line 1485
    .line 1486
    goto :goto_25

    .line 1487
    :goto_26
    invoke-static {v2, v3, v15}, La/k7x;->F(La/kzv;La/ctf0;Ljava/lang/String;)La/f3w;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v5

    .line 1491
    invoke-static {v2, v3, v15}, La/k7x;->E(La/kzv;La/ctf0;Ljava/lang/String;)La/f3w;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v8

    .line 1495
    invoke-static {v2, v3, v15}, La/k7x;->K(La/kzv;La/ctf0;Ljava/lang/String;)La/f3w;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v9

    .line 1499
    invoke-static {v3}, La/k7x;->M(La/ctf0;)La/m3w;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v10

    .line 1503
    move/from16 v11, p1

    .line 1504
    .line 1505
    new-array v14, v11, [La/h3w;

    .line 1506
    .line 1507
    const/16 v27, 0x0

    .line 1508
    .line 1509
    aput-object v0, v14, v27

    .line 1510
    .line 1511
    const/16 v28, 0x1

    .line 1512
    .line 1513
    aput-object v1, v14, v28

    .line 1514
    .line 1515
    const/16 v35, 0x2

    .line 1516
    .line 1517
    aput-object v5, v14, v35

    .line 1518
    .line 1519
    const/16 v26, 0x3

    .line 1520
    .line 1521
    aput-object v8, v14, v26

    .line 1522
    .line 1523
    const/16 v25, 0x4

    .line 1524
    .line 1525
    aput-object v9, v14, v25

    .line 1526
    .line 1527
    aput-object v10, v14, v24

    .line 1528
    .line 1529
    invoke-static {v14}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v0

    .line 1533
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v47

    .line 1537
    if-eqz v50, :cond_28

    .line 1538
    .line 1539
    move/from16 v49, v54

    .line 1540
    .line 1541
    goto :goto_27

    .line 1542
    :cond_28
    move/from16 v49, v53

    .line 1543
    .line 1544
    :goto_27
    invoke-static {v2}, La/lmc;->a0(La/kzv;)La/tvw;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v51

    .line 1548
    invoke-static {v2, v3, v15}, La/k7x;->L(La/kzv;La/ctf0;Ljava/lang/String;)Ljava/lang/String;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v53

    .line 1552
    invoke-static/range {v48 .. v48}, La/vic;->K(La/i0w;)I

    .line 1553
    .line 1554
    .line 1555
    move-result v57

    .line 1556
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v58

    .line 1560
    new-instance v40, La/p3w;

    .line 1561
    .line 1562
    const-string v62, ""

    .line 1563
    .line 1564
    const/16 v63, 0x0

    .line 1565
    .line 1566
    const/16 v48, 0x1

    .line 1567
    .line 1568
    const/16 v52, 0x1

    .line 1569
    .line 1570
    const/16 v54, 0x0

    .line 1571
    .line 1572
    const/16 v55, 0x1

    .line 1573
    .line 1574
    const/16 v56, 0x0

    .line 1575
    .line 1576
    const-string v59, ""

    .line 1577
    .line 1578
    const-string v60, ""

    .line 1579
    .line 1580
    move-object/from16 v45, v61

    .line 1581
    .line 1582
    const-string v61, ""

    .line 1583
    .line 1584
    move-object/from16 v42, v7

    .line 1585
    .line 1586
    move-object/from16 v43, v6

    .line 1587
    .line 1588
    move-object/from16 v41, v7

    .line 1589
    .line 1590
    invoke-direct/range {v40 .. v63}, La/p3w;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/i4;La/i4;ZIZLa/tvw;ZLjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1591
    .line 1592
    .line 1593
    goto/16 :goto_1a

    .line 1594
    .line 1595
    :goto_28
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1596
    .line 1597
    .line 1598
    move-object v5, v1

    .line 1599
    move-object v1, v13

    .line 1600
    move/from16 v4, v18

    .line 1601
    .line 1602
    move/from16 v6, v22

    .line 1603
    .line 1604
    move/from16 v7, v23

    .line 1605
    .line 1606
    move-object/from16 v2, v64

    .line 1607
    .line 1608
    move-object/from16 v9, v65

    .line 1609
    .line 1610
    move-object/from16 v11, v66

    .line 1611
    .line 1612
    move-object/from16 v12, v67

    .line 1613
    .line 1614
    move-object/from16 v14, v68

    .line 1615
    .line 1616
    move-object/from16 v0, v70

    .line 1617
    .line 1618
    move-object/from16 v10, v72

    .line 1619
    .line 1620
    move-object/from16 v13, v73

    .line 1621
    .line 1622
    const/16 p1, 0x6

    .line 1623
    .line 1624
    const/16 v25, 0x4

    .line 1625
    .line 1626
    const/16 v35, 0x2

    .line 1627
    .line 1628
    goto/16 :goto_0

    .line 1629
    .line 1630
    :cond_29
    move-object v1, v5

    .line 1631
    move-object/from16 v0, p0

    .line 1632
    .line 1633
    move-object v9, v1

    .line 1634
    goto/16 :goto_4b

    .line 1635
    .line 1636
    :cond_2a
    move-object/from16 v70, v0

    .line 1637
    .line 1638
    move-object/from16 v67, v12

    .line 1639
    .line 1640
    move-object/from16 v73, v13

    .line 1641
    .line 1642
    move-object/from16 v68, v14

    .line 1643
    .line 1644
    move-object v13, v1

    .line 1645
    new-instance v0, Ljava/util/ArrayList;

    .line 1646
    .line 1647
    const/16 v8, 0xa

    .line 1648
    .line 1649
    invoke-static {v2, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1650
    .line 1651
    .line 1652
    move-result v1

    .line 1653
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1654
    .line 1655
    .line 1656
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v1

    .line 1660
    :goto_29
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1661
    .line 1662
    .line 1663
    move-result v2

    .line 1664
    if-eqz v2, :cond_36

    .line 1665
    .line 1666
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v2

    .line 1670
    move-object v12, v2

    .line 1671
    check-cast v12, La/kzv;

    .line 1672
    .line 1673
    iget-object v2, v12, La/kzv;->a:Ljava/lang/String;

    .line 1674
    .line 1675
    invoke-static {v2}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v4

    .line 1679
    if-eqz v4, :cond_2b

    .line 1680
    .line 1681
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 1682
    .line 1683
    .line 1684
    move-result-wide v4

    .line 1685
    goto :goto_2a

    .line 1686
    :cond_2b
    move-wide/from16 v4, v30

    .line 1687
    .line 1688
    :goto_2a
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v4

    .line 1692
    move-object/from16 v14, v68

    .line 1693
    .line 1694
    invoke-interface {v14, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1695
    .line 1696
    .line 1697
    move-result v4

    .line 1698
    move-object/from16 v5, v67

    .line 1699
    .line 1700
    if-eqz v67, :cond_2c

    .line 1701
    .line 1702
    iget-object v6, v5, La/ql5;->f:Ljava/lang/String;

    .line 1703
    .line 1704
    goto :goto_2b

    .line 1705
    :cond_2c
    move-object/from16 v6, v32

    .line 1706
    .line 1707
    :goto_2b
    if-nez v6, :cond_2d

    .line 1708
    .line 1709
    move-object/from16 v6, v33

    .line 1710
    .line 1711
    :cond_2d
    invoke-interface/range {v70 .. v70}, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;->F()Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v7

    .line 1715
    invoke-virtual {v15, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v8

    .line 1719
    check-cast v8, Ljava/util/List;

    .line 1720
    .line 1721
    if-nez v8, :cond_2e

    .line 1722
    .line 1723
    sget-object v8, La/iun;->a:La/iun;

    .line 1724
    .line 1725
    :cond_2e
    sget-object v9, La/s6t0;->a:La/pz40;

    .line 1726
    .line 1727
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1728
    .line 1729
    .line 1730
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1731
    .line 1732
    .line 1733
    invoke-virtual/range {v73 .. v73}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1734
    .line 1735
    .line 1736
    sget-object v9, La/rdj;->a:La/rdj;

    .line 1737
    .line 1738
    iget-object v9, v3, La/ctf0;->b:La/lsm0;

    .line 1739
    .line 1740
    invoke-virtual {v3}, La/ctf0;->h()Z

    .line 1741
    .line 1742
    .line 1743
    move-result v10

    .line 1744
    move-object/from16 p1, v1

    .line 1745
    .line 1746
    move-object v11, v2

    .line 1747
    iget-wide v1, v12, La/kzv;->d:J

    .line 1748
    .line 1749
    move-object/from16 v67, v5

    .line 1750
    .line 1751
    sget-object v5, La/efj;->c:La/efj;

    .line 1752
    .line 1753
    move/from16 v17, v10

    .line 1754
    .line 1755
    new-instance v10, La/znq0;

    .line 1756
    .line 1757
    invoke-direct {v10, v1, v2}, La/znq0;-><init>(J)V

    .line 1758
    .line 1759
    .line 1760
    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v1

    .line 1764
    move-object/from16 v17, v11

    .line 1765
    .line 1766
    const/16 v2, 0x38

    .line 1767
    .line 1768
    const/4 v11, 0x0

    .line 1769
    invoke-static {v10, v5, v1, v11, v2}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v1

    .line 1773
    filled-new-array/range {v17 .. v17}, [Ljava/lang/Object;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v5

    .line 1777
    const/4 v10, 0x1

    .line 1778
    invoke-static {v5, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v5

    .line 1782
    const v11, 0x7f1309d9

    .line 1783
    .line 1784
    .line 1785
    invoke-virtual {v9, v11, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v5

    .line 1789
    sget-object v17, La/pn40;->a:La/pn40;

    .line 1790
    .line 1791
    iget-wide v10, v12, La/kzv;->m:D

    .line 1792
    .line 1793
    sget-object v2, La/p3u0;->c:La/p3u0;

    .line 1794
    .line 1795
    invoke-static {v10, v11, v6, v2}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v2

    .line 1799
    invoke-virtual {v13, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v2

    .line 1803
    move-wide/from16 v17, v10

    .line 1804
    .line 1805
    iget-object v10, v12, La/kzv;->g:La/i0w;

    .line 1806
    .line 1807
    invoke-static {v7, v10, v8}, La/hew0;->G(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/i0w;Ljava/util/List;)Ljava/util/ArrayList;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v7

    .line 1811
    new-instance v8, Ljava/util/ArrayList;

    .line 1812
    .line 1813
    move-object/from16 v19, v2

    .line 1814
    .line 1815
    const/16 v11, 0xa

    .line 1816
    .line 1817
    invoke-static {v7, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1818
    .line 1819
    .line 1820
    move-result v2

    .line 1821
    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1822
    .line 1823
    .line 1824
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v2

    .line 1828
    :goto_2c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1829
    .line 1830
    .line 1831
    move-result v7

    .line 1832
    if-eqz v7, :cond_2f

    .line 1833
    .line 1834
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v7

    .line 1838
    check-cast v7, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 1839
    .line 1840
    invoke-static {v7, v4}, La/d5c;->Z(Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;Z)La/yto;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v7

    .line 1844
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1845
    .line 1846
    .line 1847
    goto :goto_2c

    .line 1848
    :cond_2f
    new-instance v39, La/cuo;

    .line 1849
    .line 1850
    iget-object v2, v12, La/kzv;->a:Ljava/lang/String;

    .line 1851
    .line 1852
    const-string v4, " \u00b7 \u200e"

    .line 1853
    .line 1854
    invoke-static {v1, v4, v5}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v42

    .line 1858
    new-instance v1, La/wm7;

    .line 1859
    .line 1860
    const/4 v4, 0x0

    .line 1861
    new-array v5, v4, [Ljava/lang/Object;

    .line 1862
    .line 1863
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1864
    .line 1865
    .line 1866
    move-result-object v5

    .line 1867
    const v7, 0x7f13002b

    .line 1868
    .line 1869
    .line 1870
    invoke-virtual {v9, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v5

    .line 1874
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1875
    .line 1876
    invoke-virtual {v5, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v5

    .line 1880
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1881
    .line 1882
    .line 1883
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 1884
    .line 1885
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v7

    .line 1889
    iget-object v7, v7, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1890
    .line 1891
    move-object/from16 v20, v6

    .line 1892
    .line 1893
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 1894
    .line 1895
    .line 1896
    move-result-wide v6

    .line 1897
    invoke-direct {v1, v5, v6, v7}, La/wm7;-><init>(Ljava/lang/String;J)V

    .line 1898
    .line 1899
    .line 1900
    move-object/from16 v40, v2

    .line 1901
    .line 1902
    iget-boolean v2, v12, La/kzv;->q:Z

    .line 1903
    .line 1904
    iget-boolean v5, v12, La/kzv;->G:Z

    .line 1905
    .line 1906
    move/from16 v27, v4

    .line 1907
    .line 1908
    iget-boolean v4, v12, La/kzv;->x:Z

    .line 1909
    .line 1910
    move-object/from16 v6, v73

    .line 1911
    .line 1912
    invoke-static {v12, v3, v6}, La/jwb;->J(La/kzv;La/ctf0;Ljava/util/List;)Ljava/lang/String;

    .line 1913
    .line 1914
    .line 1915
    move-result-object v7

    .line 1916
    move-object/from16 v22, v8

    .line 1917
    .line 1918
    move-object/from16 v21, v9

    .line 1919
    .line 1920
    iget-wide v8, v12, La/kzv;->V:D

    .line 1921
    .line 1922
    move-object/from16 v23, v10

    .line 1923
    .line 1924
    const/4 v10, 0x0

    .line 1925
    move/from16 v24, v11

    .line 1926
    .line 1927
    const/4 v11, 0x0

    .line 1928
    move-object/from16 v71, v3

    .line 1929
    .line 1930
    move v3, v5

    .line 1931
    const/4 v5, 0x0

    .line 1932
    move-object/from16 v38, v19

    .line 1933
    .line 1934
    move-object/from16 v19, v0

    .line 1935
    .line 1936
    move-object/from16 v0, v38

    .line 1937
    .line 1938
    move-object/from16 v43, v1

    .line 1939
    .line 1940
    move-object/from16 v81, v6

    .line 1941
    .line 1942
    move-object/from16 v68, v14

    .line 1943
    .line 1944
    move-object/from16 v14, v21

    .line 1945
    .line 1946
    move/from16 v1, v27

    .line 1947
    .line 1948
    move-object/from16 v80, v70

    .line 1949
    .line 1950
    move-object/from16 v6, v71

    .line 1951
    .line 1952
    const/16 v38, 0x38

    .line 1953
    .line 1954
    move-object/from16 v21, v12

    .line 1955
    .line 1956
    move-object/from16 v27, v15

    .line 1957
    .line 1958
    move-object/from16 v15, v22

    .line 1959
    .line 1960
    const/4 v12, 0x1

    .line 1961
    invoke-static/range {v2 .. v11}, La/hhm0;->s(ZZZZLa/ctf0;Ljava/lang/String;DZZ)La/i4;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v44

    .line 1965
    move-object v3, v6

    .line 1966
    invoke-static {v1, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v2

    .line 1970
    move-object/from16 v45, v2

    .line 1971
    .line 1972
    check-cast v45, La/yto;

    .line 1973
    .line 1974
    invoke-static {v12, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1975
    .line 1976
    .line 1977
    move-result-object v2

    .line 1978
    move-object/from16 v46, v2

    .line 1979
    .line 1980
    check-cast v46, La/yto;

    .line 1981
    .line 1982
    invoke-static {}, La/cy7;->c()Z

    .line 1983
    .line 1984
    .line 1985
    move-result v2

    .line 1986
    const v4, 0x7f1309ef

    .line 1987
    .line 1988
    .line 1989
    if-eqz v2, :cond_30

    .line 1990
    .line 1991
    filled-new-array/range {v33 .. v33}, [Ljava/lang/Object;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v2

    .line 1995
    invoke-static {v2, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v2

    .line 1999
    invoke-virtual {v14, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v2

    .line 2003
    invoke-static {v2}, Lkotlin/text/StringsKt;->v0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v2

    .line 2007
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2008
    .line 2009
    .line 2010
    move-result-object v2

    .line 2011
    const-string v4, " "

    .line 2012
    .line 2013
    invoke-static {v13, v0, v4, v2}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v0

    .line 2017
    goto :goto_2d

    .line 2018
    :cond_30
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2019
    .line 2020
    .line 2021
    move-result-object v0

    .line 2022
    invoke-static {v0, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v0

    .line 2026
    invoke-virtual {v14, v4, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v0

    .line 2030
    :goto_2d
    new-instance v47, La/wul;

    .line 2031
    .line 2032
    sget-object v5, La/lul;->e:La/lul;

    .line 2033
    .line 2034
    sget-object v6, La/oe9;->c:La/oe9;

    .line 2035
    .line 2036
    new-instance v7, La/ue9;

    .line 2037
    .line 2038
    invoke-direct {v7, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 2039
    .line 2040
    .line 2041
    const/4 v9, 0x0

    .line 2042
    const/4 v10, 0x0

    .line 2043
    const/4 v8, 0x1

    .line 2044
    move-object/from16 v4, v47

    .line 2045
    .line 2046
    invoke-direct/range {v4 .. v10}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 2047
    .line 2048
    .line 2049
    invoke-static/range {v21 .. v21}, La/lmc;->a0(La/kzv;)La/tvw;

    .line 2050
    .line 2051
    .line 2052
    move-result-object v48

    .line 2053
    move-object/from16 v2, v21

    .line 2054
    .line 2055
    iget-object v0, v2, La/kzv;->B:Ljava/lang/String;

    .line 2056
    .line 2057
    iget v4, v2, La/kzv;->t:I

    .line 2058
    .line 2059
    if-le v4, v12, :cond_31

    .line 2060
    .line 2061
    move/from16 v50, v12

    .line 2062
    .line 2063
    goto :goto_2e

    .line 2064
    :cond_31
    move/from16 v50, v1

    .line 2065
    .line 2066
    :goto_2e
    iget v5, v2, La/kzv;->v:I

    .line 2067
    .line 2068
    const-string v6, "/"

    .line 2069
    .line 2070
    invoke-static {v5, v4, v6}, La/w6x;->n(IILjava/lang/String;)Ljava/lang/String;

    .line 2071
    .line 2072
    .line 2073
    move-result-object v51

    .line 2074
    iget-object v4, v2, La/kzv;->i:Ljava/lang/String;

    .line 2075
    .line 2076
    invoke-static {v13, v4}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v52

    .line 2080
    iget-wide v4, v2, La/kzv;->L:D

    .line 2081
    .line 2082
    iget-wide v6, v2, La/kzv;->E:D

    .line 2083
    .line 2084
    iget-wide v8, v2, La/kzv;->f:D

    .line 2085
    .line 2086
    cmpg-double v4, v4, v8

    .line 2087
    .line 2088
    if-gez v4, :cond_32

    .line 2089
    .line 2090
    sget-object v4, La/i0w;->i:La/i0w;

    .line 2091
    .line 2092
    move-object/from16 v5, v23

    .line 2093
    .line 2094
    if-eq v5, v4, :cond_32

    .line 2095
    .line 2096
    new-array v4, v1, [Ljava/lang/Object;

    .line 2097
    .line 2098
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2099
    .line 2100
    .line 2101
    move-result-object v4

    .line 2102
    const v5, 0x7f1309cd

    .line 2103
    .line 2104
    .line 2105
    invoke-virtual {v14, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2106
    .line 2107
    .line 2108
    move-result-object v4

    .line 2109
    goto :goto_2f

    .line 2110
    :cond_32
    new-array v4, v1, [Ljava/lang/Object;

    .line 2111
    .line 2112
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2113
    .line 2114
    .line 2115
    move-result-object v4

    .line 2116
    const v5, 0x7f1309cc

    .line 2117
    .line 2118
    .line 2119
    invoke-virtual {v14, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v4

    .line 2123
    :goto_2f
    sget-object v5, La/pn40;->a:La/pn40;

    .line 2124
    .line 2125
    iget-wide v10, v2, La/kzv;->C:D

    .line 2126
    .line 2127
    cmpl-double v2, v10, v36

    .line 2128
    .line 2129
    if-lez v2, :cond_33

    .line 2130
    .line 2131
    goto :goto_30

    .line 2132
    :cond_33
    sub-double v10, v8, v6

    .line 2133
    .line 2134
    :goto_30
    sget-object v2, La/p3u0;->c:La/p3u0;

    .line 2135
    .line 2136
    invoke-static {v10, v11, v2}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v2

    .line 2140
    new-instance v5, Ljava/math/BigDecimal;

    .line 2141
    .line 2142
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 2143
    .line 2144
    .line 2145
    move-result-object v8

    .line 2146
    invoke-direct {v5, v8}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 2147
    .line 2148
    .line 2149
    new-instance v8, Ljava/math/BigDecimal;

    .line 2150
    .line 2151
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v6

    .line 2155
    invoke-direct {v8, v6}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 2156
    .line 2157
    .line 2158
    invoke-virtual {v5, v8}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 2159
    .line 2160
    .line 2161
    move-result-object v5

    .line 2162
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2163
    .line 2164
    .line 2165
    new-instance v6, Ljava/math/BigDecimal;

    .line 2166
    .line 2167
    invoke-static/range {v17 .. v18}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 2168
    .line 2169
    .line 2170
    move-result-object v7

    .line 2171
    invoke-direct {v6, v7}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 2172
    .line 2173
    .line 2174
    invoke-virtual {v6, v5}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 2175
    .line 2176
    .line 2177
    move-result-object v5

    .line 2178
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2179
    .line 2180
    .line 2181
    invoke-virtual {v5}, Ljava/math/BigDecimal;->doubleValue()D

    .line 2182
    .line 2183
    .line 2184
    move-result-wide v5

    .line 2185
    move-object/from16 v7, v20

    .line 2186
    .line 2187
    invoke-static {v7, v5, v6}, La/ntb;->O(Ljava/lang/String;D)Ljava/lang/String;

    .line 2188
    .line 2189
    .line 2190
    move-result-object v8

    .line 2191
    cmpl-double v9, v5, v36

    .line 2192
    .line 2193
    if-lez v9, :cond_34

    .line 2194
    .line 2195
    sget-object v5, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 2196
    .line 2197
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getGreen-0d7_KjU()J

    .line 2198
    .line 2199
    .line 2200
    move-result-wide v5

    .line 2201
    goto :goto_31

    .line 2202
    :cond_34
    cmpg-double v5, v5, v36

    .line 2203
    .line 2204
    if-gez v5, :cond_35

    .line 2205
    .line 2206
    sget-object v5, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 2207
    .line 2208
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getRed-0d7_KjU()J

    .line 2209
    .line 2210
    .line 2211
    move-result-wide v5

    .line 2212
    goto :goto_31

    .line 2213
    :cond_35
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 2214
    .line 2215
    .line 2216
    move-result-object v5

    .line 2217
    iget-object v5, v5, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2218
    .line 2219
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 2220
    .line 2221
    .line 2222
    move-result-wide v5

    .line 2223
    :goto_31
    new-instance v9, La/x680;

    .line 2224
    .line 2225
    new-instance v10, La/wty;

    .line 2226
    .line 2227
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 2228
    .line 2229
    .line 2230
    move-result-object v11

    .line 2231
    iget-object v11, v11, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2232
    .line 2233
    move-object/from16 v71, v13

    .line 2234
    .line 2235
    invoke-virtual {v11}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 2236
    .line 2237
    .line 2238
    move-result-wide v12

    .line 2239
    invoke-direct {v10, v2, v7, v12, v13}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 2240
    .line 2241
    .line 2242
    const-string v2, "BET_SUM_ID"

    .line 2243
    .line 2244
    invoke-direct {v9, v2, v4, v10}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    .line 2245
    .line 2246
    .line 2247
    new-instance v2, La/x680;

    .line 2248
    .line 2249
    new-array v4, v1, [Ljava/lang/Object;

    .line 2250
    .line 2251
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2252
    .line 2253
    .line 2254
    move-result-object v4

    .line 2255
    const v10, 0x7f1309f3

    .line 2256
    .line 2257
    .line 2258
    invoke-virtual {v14, v10, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2259
    .line 2260
    .line 2261
    move-result-object v4

    .line 2262
    new-instance v10, La/wty;

    .line 2263
    .line 2264
    invoke-direct {v10, v8, v7, v5, v6}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 2265
    .line 2266
    .line 2267
    const-string v5, "PROFIT_ID"

    .line 2268
    .line 2269
    invoke-direct {v2, v5, v4, v10}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    .line 2270
    .line 2271
    .line 2272
    filled-new-array {v9, v2}, [La/x680;

    .line 2273
    .line 2274
    .line 2275
    move-result-object v2

    .line 2276
    invoke-static {v2}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 2277
    .line 2278
    .line 2279
    move-result-object v53

    .line 2280
    const/16 v54, 0x0

    .line 2281
    .line 2282
    move-object/from16 v41, v40

    .line 2283
    .line 2284
    move-object/from16 v49, v0

    .line 2285
    .line 2286
    invoke-direct/range {v39 .. v54}, La/cuo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/wm7;La/a4x;La/yto;La/yto;La/wul;La/tvw;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;La/a4x;La/l3w;)V

    .line 2287
    .line 2288
    .line 2289
    move-object/from16 v0, v19

    .line 2290
    .line 2291
    move-object/from16 v2, v39

    .line 2292
    .line 2293
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2294
    .line 2295
    .line 2296
    move-object/from16 v1, p1

    .line 2297
    .line 2298
    move-object/from16 v15, v27

    .line 2299
    .line 2300
    move-object/from16 v13, v71

    .line 2301
    .line 2302
    move-object/from16 v70, v80

    .line 2303
    .line 2304
    move-object/from16 v73, v81

    .line 2305
    .line 2306
    goto/16 :goto_29

    .line 2307
    .line 2308
    :cond_36
    move-object v9, v0

    .line 2309
    move-object/from16 v0, p0

    .line 2310
    .line 2311
    goto/16 :goto_4b

    .line 2312
    .line 2313
    :cond_37
    move-object/from16 v80, v0

    .line 2314
    .line 2315
    move/from16 v18, v4

    .line 2316
    .line 2317
    move/from16 v22, v6

    .line 2318
    .line 2319
    move/from16 v23, v7

    .line 2320
    .line 2321
    move-object/from16 v65, v9

    .line 2322
    .line 2323
    move-object/from16 v72, v10

    .line 2324
    .line 2325
    move-object/from16 v66, v11

    .line 2326
    .line 2327
    move-object/from16 v67, v12

    .line 2328
    .line 2329
    move-object/from16 v81, v13

    .line 2330
    .line 2331
    move-object/from16 v68, v14

    .line 2332
    .line 2333
    move-object/from16 v27, v15

    .line 2334
    .line 2335
    const/4 v1, 0x0

    .line 2336
    const v4, 0x7f13049b

    .line 2337
    .line 2338
    .line 2339
    const v29, 0x7f13125c

    .line 2340
    .line 2341
    .line 2342
    new-instance v0, Ljava/util/ArrayList;

    .line 2343
    .line 2344
    const/16 v9, 0xa

    .line 2345
    .line 2346
    invoke-static {v2, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2347
    .line 2348
    .line 2349
    move-result v5

    .line 2350
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 2351
    .line 2352
    .line 2353
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2354
    .line 2355
    .line 2356
    move-result-object v10

    .line 2357
    :goto_32
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 2358
    .line 2359
    .line 2360
    move-result v2

    .line 2361
    if-eqz v2, :cond_36

    .line 2362
    .line 2363
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2364
    .line 2365
    .line 2366
    move-result-object v2

    .line 2367
    check-cast v2, La/kzv;

    .line 2368
    .line 2369
    move-object/from16 v11, v67

    .line 2370
    .line 2371
    if-eqz v67, :cond_38

    .line 2372
    .line 2373
    iget-object v5, v11, La/ql5;->f:Ljava/lang/String;

    .line 2374
    .line 2375
    goto :goto_33

    .line 2376
    :cond_38
    move-object/from16 v5, v32

    .line 2377
    .line 2378
    :goto_33
    if-nez v5, :cond_39

    .line 2379
    .line 2380
    move-object/from16 v12, v33

    .line 2381
    .line 2382
    goto :goto_34

    .line 2383
    :cond_39
    move-object v12, v5

    .line 2384
    :goto_34
    iget-object v5, v2, La/kzv;->a:Ljava/lang/String;

    .line 2385
    .line 2386
    iget-object v13, v2, La/kzv;->a:Ljava/lang/String;

    .line 2387
    .line 2388
    move-object/from16 v14, v27

    .line 2389
    .line 2390
    invoke-virtual {v14, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2391
    .line 2392
    .line 2393
    move-result-object v5

    .line 2394
    check-cast v5, Ljava/util/List;

    .line 2395
    .line 2396
    if-nez v5, :cond_3a

    .line 2397
    .line 2398
    sget-object v5, La/iun;->a:La/iun;

    .line 2399
    .line 2400
    :cond_3a
    invoke-static {v13}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 2401
    .line 2402
    .line 2403
    move-result-object v6

    .line 2404
    if-eqz v6, :cond_3b

    .line 2405
    .line 2406
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 2407
    .line 2408
    .line 2409
    move-result-wide v6

    .line 2410
    goto :goto_35

    .line 2411
    :cond_3b
    move-wide/from16 v6, v30

    .line 2412
    .line 2413
    :goto_35
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v6

    .line 2417
    move-object/from16 v15, v68

    .line 2418
    .line 2419
    invoke-interface {v15, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 2420
    .line 2421
    .line 2422
    move-result v6

    .line 2423
    sget-object v7, La/i7u;->b:La/i7u;

    .line 2424
    .line 2425
    sget-object v8, La/i7u;->c:La/i7u;

    .line 2426
    .line 2427
    move/from16 v27, v1

    .line 2428
    .line 2429
    move-object/from16 v9, v65

    .line 2430
    .line 2431
    move-object/from16 v1, v66

    .line 2432
    .line 2433
    move-object/from16 v4, v81

    .line 2434
    .line 2435
    invoke-static {v4, v1, v5, v9}, La/hne;->C(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 2436
    .line 2437
    .line 2438
    move-object/from16 v73, v4

    .line 2439
    .line 2440
    iget-object v4, v2, La/kzv;->b:La/q4f;

    .line 2441
    .line 2442
    move-object/from16 v17, v4

    .line 2443
    .line 2444
    iget-object v4, v2, La/kzv;->Y:Ljava/util/List;

    .line 2445
    .line 2446
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    .line 2447
    .line 2448
    .line 2449
    move-result v17

    .line 2450
    packed-switch v17, :pswitch_data_1

    .line 2451
    .line 2452
    .line 2453
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2454
    .line 2455
    .line 2456
    move-result-object v17

    .line 2457
    :goto_36
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 2458
    .line 2459
    .line 2460
    move-result v20

    .line 2461
    if-eqz v20, :cond_3d

    .line 2462
    .line 2463
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2464
    .line 2465
    .line 2466
    move-result-object v20

    .line 2467
    move/from16 v21, v6

    .line 2468
    .line 2469
    move-object/from16 v6, v20

    .line 2470
    .line 2471
    check-cast v6, La/xco;

    .line 2472
    .line 2473
    move-object/from16 v65, v9

    .line 2474
    .line 2475
    move-object/from16 v34, v10

    .line 2476
    .line 2477
    iget-wide v9, v6, La/xco;->a:J

    .line 2478
    .line 2479
    move-wide/from16 v36, v9

    .line 2480
    .line 2481
    iget-wide v9, v2, La/kzv;->T:J

    .line 2482
    .line 2483
    cmp-long v6, v36, v9

    .line 2484
    .line 2485
    if-nez v6, :cond_3c

    .line 2486
    .line 2487
    goto :goto_37

    .line 2488
    :cond_3c
    move/from16 v6, v21

    .line 2489
    .line 2490
    move-object/from16 v10, v34

    .line 2491
    .line 2492
    move-object/from16 v9, v65

    .line 2493
    .line 2494
    goto :goto_36

    .line 2495
    :cond_3d
    move/from16 v21, v6

    .line 2496
    .line 2497
    move-object/from16 v65, v9

    .line 2498
    .line 2499
    move-object/from16 v34, v10

    .line 2500
    .line 2501
    move-object/from16 v20, v32

    .line 2502
    .line 2503
    :goto_37
    move-object/from16 v9, v20

    .line 2504
    .line 2505
    check-cast v9, La/xco;

    .line 2506
    .line 2507
    sget-object v6, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->f:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 2508
    .line 2509
    invoke-static {v2, v6, v5}, La/xkb;->R(La/kzv;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;Ljava/util/List;)Ljava/util/List;

    .line 2510
    .line 2511
    .line 2512
    move-result-object v10

    .line 2513
    iget-object v5, v2, La/kzv;->g:La/i0w;

    .line 2514
    .line 2515
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2516
    .line 2517
    .line 2518
    move-result-object v6

    .line 2519
    :goto_38
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2520
    .line 2521
    .line 2522
    move-result v17

    .line 2523
    if-eqz v17, :cond_40

    .line 2524
    .line 2525
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2526
    .line 2527
    .line 2528
    move-result-object v17

    .line 2529
    move-object/from16 v20, v5

    .line 2530
    .line 2531
    move-object/from16 v5, v17

    .line 2532
    .line 2533
    check-cast v5, La/ueo;

    .line 2534
    .line 2535
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2536
    .line 2537
    .line 2538
    move-result-object v36

    .line 2539
    move-object/from16 v37, v6

    .line 2540
    .line 2541
    move-object/from16 v6, v36

    .line 2542
    .line 2543
    check-cast v6, La/z0w;

    .line 2544
    .line 2545
    if-eqz v6, :cond_3e

    .line 2546
    .line 2547
    iget v6, v6, La/z0w;->v:I

    .line 2548
    .line 2549
    move-object/from16 v36, v13

    .line 2550
    .line 2551
    move-object/from16 v54, v14

    .line 2552
    .line 2553
    iget-wide v13, v5, La/ueo;->a:J

    .line 2554
    .line 2555
    int-to-long v5, v6

    .line 2556
    cmp-long v5, v13, v5

    .line 2557
    .line 2558
    if-nez v5, :cond_3f

    .line 2559
    .line 2560
    goto :goto_39

    .line 2561
    :cond_3e
    move-object/from16 v36, v13

    .line 2562
    .line 2563
    move-object/from16 v54, v14

    .line 2564
    .line 2565
    :cond_3f
    move-object/from16 v5, v20

    .line 2566
    .line 2567
    move-object/from16 v13, v36

    .line 2568
    .line 2569
    move-object/from16 v6, v37

    .line 2570
    .line 2571
    move-object/from16 v14, v54

    .line 2572
    .line 2573
    goto :goto_38

    .line 2574
    :cond_40
    move-object/from16 v20, v5

    .line 2575
    .line 2576
    move-object/from16 v36, v13

    .line 2577
    .line 2578
    move-object/from16 v54, v14

    .line 2579
    .line 2580
    move-object/from16 v17, v32

    .line 2581
    .line 2582
    :goto_39
    check-cast v17, La/ueo;

    .line 2583
    .line 2584
    invoke-virtual {v8, v4, v1}, La/i7u;->a(Ljava/util/List;Ljava/util/List;)Z

    .line 2585
    .line 2586
    .line 2587
    move-result v6

    .line 2588
    invoke-virtual {v7, v4, v1}, La/i7u;->a(Ljava/util/List;Ljava/util/List;)Z

    .line 2589
    .line 2590
    .line 2591
    move-result v7

    .line 2592
    iget-object v13, v2, La/kzv;->B:Ljava/lang/String;

    .line 2593
    .line 2594
    filled-new-array/range {v36 .. v36}, [Ljava/lang/Object;

    .line 2595
    .line 2596
    .line 2597
    move-result-object v4

    .line 2598
    iget-object v5, v3, La/ctf0;->b:La/lsm0;

    .line 2599
    .line 2600
    const/4 v8, 0x1

    .line 2601
    invoke-static {v4, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2602
    .line 2603
    .line 2604
    move-result-object v4

    .line 2605
    const v14, 0x7f1309d9

    .line 2606
    .line 2607
    .line 2608
    invoke-virtual {v5, v14, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2609
    .line 2610
    .line 2611
    move-result-object v40

    .line 2612
    if-eqz v9, :cond_41

    .line 2613
    .line 2614
    iget-boolean v5, v9, La/xco;->e:Z

    .line 2615
    .line 2616
    goto :goto_3a

    .line 2617
    :cond_41
    move/from16 v5, v27

    .line 2618
    .line 2619
    :goto_3a
    const-string v8, ""

    .line 2620
    .line 2621
    move-object/from16 v67, v11

    .line 2622
    .line 2623
    move-object/from16 v41, v13

    .line 2624
    .line 2625
    move-object/from16 v11, v20

    .line 2626
    .line 2627
    move/from16 v14, v21

    .line 2628
    .line 2629
    move/from16 v13, v29

    .line 2630
    .line 2631
    move-object/from16 v4, v73

    .line 2632
    .line 2633
    invoke-static/range {v2 .. v8}, La/jwb;->N(La/kzv;La/ctf0;Ljava/util/List;ZZZLjava/lang/String;)La/i4;

    .line 2634
    .line 2635
    .line 2636
    move-result-object v38

    .line 2637
    invoke-static {v2, v3, v12}, La/p7x;->t(La/kzv;La/ctf0;Ljava/lang/String;)La/f3w;

    .line 2638
    .line 2639
    .line 2640
    move-result-object v4

    .line 2641
    invoke-static {v2, v3, v12}, La/p7x;->s(La/kzv;La/ctf0;Ljava/lang/String;)La/f3w;

    .line 2642
    .line 2643
    .line 2644
    move-result-object v5

    .line 2645
    invoke-static {v2, v3, v12}, La/p7x;->x(La/kzv;La/ctf0;Ljava/lang/String;)La/f3w;

    .line 2646
    .line 2647
    .line 2648
    move-result-object v6

    .line 2649
    invoke-static {v2, v3}, La/p7x;->A(La/kzv;La/ctf0;)La/bfj;

    .line 2650
    .line 2651
    .line 2652
    move-result-object v7

    .line 2653
    const/4 v8, 0x4

    .line 2654
    new-array v13, v8, [La/h3w;

    .line 2655
    .line 2656
    aput-object v4, v13, v27

    .line 2657
    .line 2658
    const/16 v28, 0x1

    .line 2659
    .line 2660
    aput-object v5, v13, v28

    .line 2661
    .line 2662
    const/16 v35, 0x2

    .line 2663
    .line 2664
    aput-object v6, v13, v35

    .line 2665
    .line 2666
    const/16 v26, 0x3

    .line 2667
    .line 2668
    aput-object v7, v13, v26

    .line 2669
    .line 2670
    invoke-static {v13}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 2671
    .line 2672
    .line 2673
    move-result-object v4

    .line 2674
    invoke-static {v4}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2675
    .line 2676
    .line 2677
    move-result-object v46

    .line 2678
    invoke-static {v2}, La/lmc;->a0(La/kzv;)La/tvw;

    .line 2679
    .line 2680
    .line 2681
    move-result-object v43

    .line 2682
    invoke-static {v2, v3, v12}, La/p7x;->y(La/kzv;La/ctf0;Ljava/lang/String;)Ljava/lang/String;

    .line 2683
    .line 2684
    .line 2685
    move-result-object v52

    .line 2686
    move-object/from16 v13, v72

    .line 2687
    .line 2688
    invoke-static {v2, v3, v13}, La/thb;->D(La/kzv;La/ctf0;Ljava/util/Map;)Ljava/lang/String;

    .line 2689
    .line 2690
    .line 2691
    move-result-object v48

    .line 2692
    iget-object v4, v2, La/kzv;->i:Ljava/lang/String;

    .line 2693
    .line 2694
    if-eqz v9, :cond_42

    .line 2695
    .line 2696
    iget-object v5, v9, La/xco;->b:Ljava/lang/String;

    .line 2697
    .line 2698
    goto :goto_3b

    .line 2699
    :cond_42
    move-object/from16 v5, v32

    .line 2700
    .line 2701
    :goto_3b
    if-nez v5, :cond_43

    .line 2702
    .line 2703
    move-object/from16 v21, v33

    .line 2704
    .line 2705
    :goto_3c
    move-object/from16 v20, v17

    .line 2706
    .line 2707
    move-object/from16 v17, v2

    .line 2708
    .line 2709
    goto :goto_3d

    .line 2710
    :cond_43
    move-object/from16 v21, v5

    .line 2711
    .line 2712
    goto :goto_3c

    .line 2713
    :goto_3d
    invoke-static/range {v17 .. v23}, La/f7k;->R(La/kzv;ZZLa/ueo;Ljava/lang/String;ZZ)Ljava/lang/String;

    .line 2714
    .line 2715
    .line 2716
    move-result-object v2

    .line 2717
    move-object v5, v2

    .line 2718
    move-object/from16 v2, v17

    .line 2719
    .line 2720
    sget-object v6, La/i0w;->i:La/i0w;

    .line 2721
    .line 2722
    if-eq v11, v6, :cond_44

    .line 2723
    .line 2724
    goto :goto_3e

    .line 2725
    :cond_44
    move-object/from16 v5, v32

    .line 2726
    .line 2727
    :goto_3e
    if-nez v5, :cond_45

    .line 2728
    .line 2729
    move/from16 v9, v27

    .line 2730
    .line 2731
    new-array v5, v9, [Ljava/lang/Object;

    .line 2732
    .line 2733
    iget-object v7, v3, La/ctf0;->b:La/lsm0;

    .line 2734
    .line 2735
    invoke-static {v5, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2736
    .line 2737
    .line 2738
    move-result-object v5

    .line 2739
    const v9, 0x7f13125c

    .line 2740
    .line 2741
    .line 2742
    invoke-virtual {v7, v9, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2743
    .line 2744
    .line 2745
    move-result-object v5

    .line 2746
    :goto_3f
    move-object/from16 v49, v5

    .line 2747
    .line 2748
    move-object/from16 v5, v80

    .line 2749
    .line 2750
    goto :goto_40

    .line 2751
    :cond_45
    const v9, 0x7f13125c

    .line 2752
    .line 2753
    .line 2754
    goto :goto_3f

    .line 2755
    :goto_40
    invoke-static {v2, v5}, La/wvb;->T(La/kzv;Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;)Ljava/lang/String;

    .line 2756
    .line 2757
    .line 2758
    move-result-object v7

    .line 2759
    if-eq v11, v6, :cond_46

    .line 2760
    .line 2761
    goto :goto_41

    .line 2762
    :cond_46
    move-object/from16 v7, v32

    .line 2763
    .line 2764
    :goto_41
    if-nez v7, :cond_47

    .line 2765
    .line 2766
    move-object/from16 v50, v33

    .line 2767
    .line 2768
    goto :goto_42

    .line 2769
    :cond_47
    move-object/from16 v50, v7

    .line 2770
    .line 2771
    :goto_42
    invoke-static {v10, v14}, La/vtb;->W(Ljava/util/List;Z)La/xww;

    .line 2772
    .line 2773
    .line 2774
    move-result-object v44

    .line 2775
    invoke-static {v10, v14}, La/vtb;->Y(Ljava/util/List;Z)La/xww;

    .line 2776
    .line 2777
    .line 2778
    move-result-object v45

    .line 2779
    invoke-static {v2}, La/kpb;->t0(La/kzv;)La/u180;

    .line 2780
    .line 2781
    .line 2782
    move-result-object v47

    .line 2783
    move-object/from16 v37, v36

    .line 2784
    .line 2785
    new-instance v36, La/fak0;

    .line 2786
    .line 2787
    const/16 v42, 0x1

    .line 2788
    .line 2789
    const/16 v53, 0x1

    .line 2790
    .line 2791
    move-object/from16 v39, v37

    .line 2792
    .line 2793
    move-object/from16 v51, v4

    .line 2794
    .line 2795
    invoke-direct/range {v36 .. v53}, La/fak0;-><init>(Ljava/lang/String;La/a4x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/tvw;La/xww;La/xww;La/a4x;La/u180;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2796
    .line 2797
    .line 2798
    move-object/from16 v66, v1

    .line 2799
    .line 2800
    move-object/from16 v70, v5

    .line 2801
    .line 2802
    const/4 v6, 0x6

    .line 2803
    const/16 v25, 0x4

    .line 2804
    .line 2805
    const/16 v26, 0x3

    .line 2806
    .line 2807
    const/16 v27, 0x0

    .line 2808
    .line 2809
    const/16 v28, 0x1

    .line 2810
    .line 2811
    const/16 v35, 0x2

    .line 2812
    .line 2813
    const v82, 0x7f1309d9

    .line 2814
    .line 2815
    .line 2816
    :goto_43
    move-object/from16 v1, v36

    .line 2817
    .line 2818
    goto/16 :goto_4a

    .line 2819
    .line 2820
    :pswitch_1
    move-object/from16 v65, v9

    .line 2821
    .line 2822
    move-object/from16 v34, v10

    .line 2823
    .line 2824
    move-object/from16 v67, v11

    .line 2825
    .line 2826
    move-object/from16 v37, v13

    .line 2827
    .line 2828
    move-object/from16 v54, v14

    .line 2829
    .line 2830
    move/from16 v9, v29

    .line 2831
    .line 2832
    move-object/from16 v13, v72

    .line 2833
    .line 2834
    move-object/from16 v70, v80

    .line 2835
    .line 2836
    move v14, v6

    .line 2837
    sget-object v6, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->f:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 2838
    .line 2839
    invoke-static {v2, v6, v5}, La/xkb;->R(La/kzv;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;Ljava/util/List;)Ljava/util/List;

    .line 2840
    .line 2841
    .line 2842
    move-result-object v10

    .line 2843
    iget-object v11, v2, La/kzv;->i:Ljava/lang/String;

    .line 2844
    .line 2845
    iget v5, v2, La/kzv;->v:I

    .line 2846
    .line 2847
    new-instance v6, Ljava/util/ArrayList;

    .line 2848
    .line 2849
    move/from16 v17, v5

    .line 2850
    .line 2851
    const/16 v9, 0xa

    .line 2852
    .line 2853
    invoke-static {v4, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2854
    .line 2855
    .line 2856
    move-result v5

    .line 2857
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 2858
    .line 2859
    .line 2860
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2861
    .line 2862
    .line 2863
    move-result-object v5

    .line 2864
    :goto_44
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2865
    .line 2866
    .line 2867
    move-result v20

    .line 2868
    if-eqz v20, :cond_48

    .line 2869
    .line 2870
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2871
    .line 2872
    .line 2873
    move-result-object v20

    .line 2874
    move-object/from16 v9, v20

    .line 2875
    .line 2876
    check-cast v9, La/z0w;

    .line 2877
    .line 2878
    move-object/from16 v20, v10

    .line 2879
    .line 2880
    iget-wide v9, v9, La/z0w;->F:J

    .line 2881
    .line 2882
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2883
    .line 2884
    .line 2885
    move-result-object v9

    .line 2886
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2887
    .line 2888
    .line 2889
    move-object/from16 v10, v20

    .line 2890
    .line 2891
    const/16 v9, 0xa

    .line 2892
    .line 2893
    goto :goto_44

    .line 2894
    :cond_48
    move-object/from16 v20, v10

    .line 2895
    .line 2896
    invoke-virtual {v8, v4, v1}, La/i7u;->a(Ljava/util/List;Ljava/util/List;)Z

    .line 2897
    .line 2898
    .line 2899
    move-result v5

    .line 2900
    invoke-virtual {v7, v4, v1}, La/i7u;->a(Ljava/util/List;Ljava/util/List;)Z

    .line 2901
    .line 2902
    .line 2903
    move-result v7

    .line 2904
    iget-object v9, v2, La/kzv;->B:Ljava/lang/String;

    .line 2905
    .line 2906
    filled-new-array/range {v37 .. v37}, [Ljava/lang/Object;

    .line 2907
    .line 2908
    .line 2909
    move-result-object v4

    .line 2910
    iget-object v10, v3, La/ctf0;->b:La/lsm0;

    .line 2911
    .line 2912
    const/4 v8, 0x1

    .line 2913
    invoke-static {v4, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2914
    .line 2915
    .line 2916
    move-result-object v4

    .line 2917
    const v8, 0x7f1309d9

    .line 2918
    .line 2919
    .line 2920
    invoke-virtual {v10, v8, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2921
    .line 2922
    .line 2923
    move-result-object v40

    .line 2924
    new-instance v4, Ljava/util/ArrayList;

    .line 2925
    .line 2926
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2927
    .line 2928
    .line 2929
    invoke-interface/range {v65 .. v65}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2930
    .line 2931
    .line 2932
    move-result-object v21

    .line 2933
    :goto_45
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    .line 2934
    .line 2935
    .line 2936
    move-result v36

    .line 2937
    if-eqz v36, :cond_4a

    .line 2938
    .line 2939
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2940
    .line 2941
    .line 2942
    move-result-object v8

    .line 2943
    move-object/from16 v66, v1

    .line 2944
    .line 2945
    move-object v1, v8

    .line 2946
    check-cast v1, La/xco;

    .line 2947
    .line 2948
    iget-boolean v1, v1, La/xco;->e:Z

    .line 2949
    .line 2950
    if-eqz v1, :cond_49

    .line 2951
    .line 2952
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2953
    .line 2954
    .line 2955
    :cond_49
    move-object/from16 v1, v66

    .line 2956
    .line 2957
    const v8, 0x7f1309d9

    .line 2958
    .line 2959
    .line 2960
    goto :goto_45

    .line 2961
    :cond_4a
    move-object/from16 v66, v1

    .line 2962
    .line 2963
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2964
    .line 2965
    .line 2966
    move-result v1

    .line 2967
    if-eqz v1, :cond_4c

    .line 2968
    .line 2969
    :cond_4b
    move v6, v5

    .line 2970
    const/4 v5, 0x0

    .line 2971
    goto :goto_47

    .line 2972
    :cond_4c
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2973
    .line 2974
    .line 2975
    move-result-object v1

    .line 2976
    :goto_46
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2977
    .line 2978
    .line 2979
    move-result v4

    .line 2980
    if-eqz v4, :cond_4b

    .line 2981
    .line 2982
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2983
    .line 2984
    .line 2985
    move-result-object v4

    .line 2986
    check-cast v4, La/xco;

    .line 2987
    .line 2988
    move-object/from16 v21, v1

    .line 2989
    .line 2990
    move-object v8, v2

    .line 2991
    iget-wide v1, v4, La/xco;->a:J

    .line 2992
    .line 2993
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2994
    .line 2995
    .line 2996
    move-result-object v1

    .line 2997
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2998
    .line 2999
    .line 3000
    move-result v1

    .line 3001
    if-eqz v1, :cond_4d

    .line 3002
    .line 3003
    move v6, v5

    .line 3004
    move-object v2, v8

    .line 3005
    const/4 v5, 0x1

    .line 3006
    goto :goto_47

    .line 3007
    :cond_4d
    move-object v2, v8

    .line 3008
    move-object/from16 v1, v21

    .line 3009
    .line 3010
    goto :goto_46

    .line 3011
    :goto_47
    const-string v8, ""

    .line 3012
    .line 3013
    move/from16 v1, v17

    .line 3014
    .line 3015
    move-object/from16 v4, v73

    .line 3016
    .line 3017
    const v82, 0x7f1309d9

    .line 3018
    .line 3019
    .line 3020
    invoke-static/range {v2 .. v8}, La/jwb;->N(La/kzv;La/ctf0;Ljava/util/List;ZZZLjava/lang/String;)La/i4;

    .line 3021
    .line 3022
    .line 3023
    move-result-object v38

    .line 3024
    new-instance v4, La/szv;

    .line 3025
    .line 3026
    const/4 v5, 0x0

    .line 3027
    new-array v6, v5, [Ljava/lang/Object;

    .line 3028
    .line 3029
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3030
    .line 3031
    .line 3032
    move-result-object v6

    .line 3033
    const v5, 0x7f1307ea

    .line 3034
    .line 3035
    .line 3036
    invoke-virtual {v10, v5, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3037
    .line 3038
    .line 3039
    move-result-object v5

    .line 3040
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3041
    .line 3042
    .line 3043
    move-result-object v6

    .line 3044
    iget v7, v2, La/kzv;->t:I

    .line 3045
    .line 3046
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3047
    .line 3048
    .line 3049
    move-result-object v8

    .line 3050
    filled-new-array {v6, v8}, [Ljava/lang/Object;

    .line 3051
    .line 3052
    .line 3053
    move-result-object v6

    .line 3054
    const/4 v8, 0x2

    .line 3055
    invoke-static {v6, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3056
    .line 3057
    .line 3058
    move-result-object v6

    .line 3059
    const v8, 0x7f1311ca

    .line 3060
    .line 3061
    .line 3062
    invoke-virtual {v10, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3063
    .line 3064
    .line 3065
    move-result-object v6

    .line 3066
    if-lez v1, :cond_4e

    .line 3067
    .line 3068
    int-to-float v1, v1

    .line 3069
    int-to-float v7, v7

    .line 3070
    div-float/2addr v1, v7

    .line 3071
    goto :goto_48

    .line 3072
    :cond_4e
    const/4 v1, 0x0

    .line 3073
    :goto_48
    invoke-direct {v4, v1, v5, v6}, La/szv;-><init>(FLjava/lang/String;Ljava/lang/String;)V

    .line 3074
    .line 3075
    .line 3076
    invoke-static {v2, v3, v12}, La/p7x;->t(La/kzv;La/ctf0;Ljava/lang/String;)La/f3w;

    .line 3077
    .line 3078
    .line 3079
    move-result-object v1

    .line 3080
    new-instance v5, La/g3w;

    .line 3081
    .line 3082
    const/4 v6, 0x0

    .line 3083
    new-array v7, v6, [Ljava/lang/Object;

    .line 3084
    .line 3085
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3086
    .line 3087
    .line 3088
    move-result-object v7

    .line 3089
    const v8, 0x7f13049b

    .line 3090
    .line 3091
    .line 3092
    invoke-virtual {v10, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3093
    .line 3094
    .line 3095
    move-result-object v7

    .line 3096
    invoke-direct {v5, v7, v11}, La/g3w;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3097
    .line 3098
    .line 3099
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 3100
    .line 3101
    .line 3102
    move-result v7

    .line 3103
    if-lez v7, :cond_4f

    .line 3104
    .line 3105
    goto :goto_49

    .line 3106
    :cond_4f
    move-object/from16 v5, v32

    .line 3107
    .line 3108
    :goto_49
    invoke-static {v2, v3, v12}, La/p7x;->s(La/kzv;La/ctf0;Ljava/lang/String;)La/f3w;

    .line 3109
    .line 3110
    .line 3111
    move-result-object v7

    .line 3112
    invoke-static {v2, v3, v12}, La/p7x;->x(La/kzv;La/ctf0;Ljava/lang/String;)La/f3w;

    .line 3113
    .line 3114
    .line 3115
    move-result-object v10

    .line 3116
    invoke-static {v2, v3}, La/p7x;->A(La/kzv;La/ctf0;)La/bfj;

    .line 3117
    .line 3118
    .line 3119
    move-result-object v11

    .line 3120
    move/from16 v27, v6

    .line 3121
    .line 3122
    const/4 v6, 0x6

    .line 3123
    new-array v8, v6, [La/h3w;

    .line 3124
    .line 3125
    aput-object v4, v8, v27

    .line 3126
    .line 3127
    const/16 v28, 0x1

    .line 3128
    .line 3129
    aput-object v1, v8, v28

    .line 3130
    .line 3131
    const/16 v35, 0x2

    .line 3132
    .line 3133
    aput-object v5, v8, v35

    .line 3134
    .line 3135
    const/16 v26, 0x3

    .line 3136
    .line 3137
    aput-object v7, v8, v26

    .line 3138
    .line 3139
    const/16 v25, 0x4

    .line 3140
    .line 3141
    aput-object v10, v8, v25

    .line 3142
    .line 3143
    aput-object v11, v8, v24

    .line 3144
    .line 3145
    invoke-static {v8}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 3146
    .line 3147
    .line 3148
    move-result-object v1

    .line 3149
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3150
    .line 3151
    .line 3152
    move-result-object v46

    .line 3153
    invoke-static {v2}, La/lmc;->a0(La/kzv;)La/tvw;

    .line 3154
    .line 3155
    .line 3156
    move-result-object v43

    .line 3157
    invoke-static {v2, v3, v12}, La/p7x;->y(La/kzv;La/ctf0;Ljava/lang/String;)Ljava/lang/String;

    .line 3158
    .line 3159
    .line 3160
    move-result-object v52

    .line 3161
    move-object/from16 v1, v20

    .line 3162
    .line 3163
    invoke-static {v1, v14}, La/vtb;->W(Ljava/util/List;Z)La/xww;

    .line 3164
    .line 3165
    .line 3166
    move-result-object v44

    .line 3167
    invoke-static {v1, v14}, La/vtb;->Y(Ljava/util/List;Z)La/xww;

    .line 3168
    .line 3169
    .line 3170
    move-result-object v45

    .line 3171
    new-instance v36, La/fak0;

    .line 3172
    .line 3173
    const-string v51, ""

    .line 3174
    .line 3175
    const/16 v53, 0x0

    .line 3176
    .line 3177
    const/16 v42, 0x1

    .line 3178
    .line 3179
    sget-object v47, La/p180;->a:La/p180;

    .line 3180
    .line 3181
    const-string v48, ""

    .line 3182
    .line 3183
    const-string v49, ""

    .line 3184
    .line 3185
    const-string v50, ""

    .line 3186
    .line 3187
    move-object/from16 v39, v37

    .line 3188
    .line 3189
    move-object/from16 v41, v9

    .line 3190
    .line 3191
    invoke-direct/range {v36 .. v53}, La/fak0;-><init>(Ljava/lang/String;La/a4x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/tvw;La/xww;La/xww;La/a4x;La/u180;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3192
    .line 3193
    .line 3194
    goto/16 :goto_43

    .line 3195
    .line 3196
    :goto_4a
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3197
    .line 3198
    .line 3199
    move-object/from16 v72, v13

    .line 3200
    .line 3201
    move-object/from16 v68, v15

    .line 3202
    .line 3203
    move/from16 v1, v27

    .line 3204
    .line 3205
    move-object/from16 v10, v34

    .line 3206
    .line 3207
    move-object/from16 v27, v54

    .line 3208
    .line 3209
    move-object/from16 v80, v70

    .line 3210
    .line 3211
    move-object/from16 v81, v73

    .line 3212
    .line 3213
    const v4, 0x7f13049b

    .line 3214
    .line 3215
    .line 3216
    const/16 v9, 0xa

    .line 3217
    .line 3218
    const v29, 0x7f13125c

    .line 3219
    .line 3220
    .line 3221
    goto/16 :goto_32

    .line 3222
    .line 3223
    :goto_4b
    iget-boolean v8, v0, La/jk7;->e:Z

    .line 3224
    .line 3225
    iget-object v6, v0, La/jk7;->i:Ljava/lang/String;

    .line 3226
    .line 3227
    iget-boolean v10, v0, La/jk7;->q:Z

    .line 3228
    .line 3229
    iget-boolean v11, v0, La/jk7;->t:Z

    .line 3230
    .line 3231
    new-instance v5, La/ll7;

    .line 3232
    .line 3233
    move-object/from16 v7, v16

    .line 3234
    .line 3235
    invoke-direct/range {v5 .. v11}, La/ll7;-><init>(Ljava/lang/String;La/on5;ZLjava/util/ArrayList;ZZ)V

    .line 3236
    .line 3237
    .line 3238
    return-object v5

    .line 3239
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La/on;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/t33;

    .line 4
    .line 5
    iget-object v1, p0, La/on;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/w6k;

    .line 8
    .line 9
    iget-object p0, p0, La/on;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/t33;

    .line 12
    .line 13
    check-cast p1, La/uag0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/Number;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p1, v0}, La/uag0;->v(F)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-interface {v1, p0}, La/w6k;->w0(F)F

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-virtual {p1, p0}, La/uag0;->H(F)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/on;->a:B

    .line 4
    .line 5
    const-string v3, ""

    .line 6
    .line 7
    const/16 v7, 0x8

    .line 8
    .line 9
    const/16 v8, 0x18

    .line 10
    .line 11
    const-string v9, "snackbarManager"

    .line 12
    .line 13
    const-string v10, "actionDialogManager"

    .line 14
    .line 15
    const/16 v11, 0xa

    .line 16
    .line 17
    const v12, 0x2fd4df92

    .line 18
    .line 19
    .line 20
    const/4 v13, 0x3

    .line 21
    const/4 v14, 0x0

    .line 22
    const/4 v15, 0x0

    .line 23
    const/4 v2, 0x1

    .line 24
    iget-object v4, v0, La/on;->d:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v5, v0, La/on;->c:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v6, v0, La/on;->b:Ljava/lang/Object;

    .line 29
    .line 30
    packed-switch v1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    check-cast v6, Ljava/util/ArrayList;

    .line 34
    .line 35
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 36
    .line 37
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    move-object/from16 v0, p1

    .line 40
    .line 41
    check-cast v0, La/hcz;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object v1, La/fg8;->b:La/fg8;

    .line 47
    .line 48
    new-instance v1, La/nk7;

    .line 49
    .line 50
    const/16 v3, 0x10

    .line 51
    .line 52
    invoke-direct {v1, v3}, La/nk7;-><init>(B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    new-instance v7, La/j13;

    .line 60
    .line 61
    invoke-direct {v7, v6, v13}, La/j13;-><init>(Ljava/util/ArrayList;B)V

    .line 62
    .line 63
    .line 64
    new-instance v8, La/at7;

    .line 65
    .line 66
    invoke-direct {v8, v1, v6, v13}, La/at7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    new-instance v1, La/c8;

    .line 70
    .line 71
    invoke-direct {v1, v6, v5, v4, v11}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    new-instance v4, La/ugd;

    .line 75
    .line 76
    invoke-direct {v4, v12, v2, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v3, v7, v8, v4}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 80
    .line 81
    .line 82
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object v0

    .line 85
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/on;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    return-object v0

    .line 90
    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/on;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0

    .line 95
    :pswitch_2
    invoke-direct/range {p0 .. p1}, La/on;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    return-object v0

    .line 100
    :pswitch_3
    invoke-direct/range {p0 .. p1}, La/on;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0

    .line 105
    :pswitch_4
    invoke-direct/range {p0 .. p1}, La/on;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    return-object v0

    .line 110
    :pswitch_5
    check-cast v6, Landroid/view/View;

    .line 111
    .line 112
    check-cast v5, Landroidx/compose/ui/platform/ComposeView;

    .line 113
    .line 114
    check-cast v4, La/qz40;

    .line 115
    .line 116
    move-object/from16 v0, p1

    .line 117
    .line 118
    check-cast v0, La/lwk;

    .line 119
    .line 120
    sget-object v1, La/iw5;->j2:[La/iiy;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    new-instance v0, La/vv5;

    .line 126
    .line 127
    invoke-direct {v0, v5, v4, v15}, La/vv5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 131
    .line 132
    .line 133
    new-instance v1, La/pr0;

    .line 134
    .line 135
    invoke-direct {v1, v6, v0, v13}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 136
    .line 137
    .line 138
    return-object v1

    .line 139
    :pswitch_6
    invoke-direct/range {p0 .. p1}, La/on;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    return-object v0

    .line 144
    :pswitch_7
    check-cast v5, La/iqt;

    .line 145
    .line 146
    check-cast v4, La/pru;

    .line 147
    .line 148
    check-cast v6, La/ctf0;

    .line 149
    .line 150
    move-object/from16 v0, p1

    .line 151
    .line 152
    check-cast v0, La/s75;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object v1, v5, La/iqt;->a:La/gst0;

    .line 158
    .line 159
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-virtual {v4}, La/pru;->a()La/sff0;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    new-instance v3, La/v75;

    .line 168
    .line 169
    invoke-direct {v3, v0, v2, v1, v6}, La/v75;-><init>(La/s75;La/sff0;ZLa/ctf0;)V

    .line 170
    .line 171
    .line 172
    return-object v3

    .line 173
    :pswitch_8
    check-cast v6, La/vne;

    .line 174
    .line 175
    check-cast v5, La/n75;

    .line 176
    .line 177
    check-cast v4, La/d9z;

    .line 178
    .line 179
    move-object/from16 v0, p1

    .line 180
    .line 181
    check-cast v0, La/r75;

    .line 182
    .line 183
    sget-object v1, La/n75;->S1:La/pek0;

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    sget-object v1, La/o75;->a:La/o75;

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_0

    .line 195
    .line 196
    new-instance v0, La/kn1;

    .line 197
    .line 198
    invoke-direct {v0, v4, v14, v2}, La/kn1;-><init>(La/d9z;La/yje;B)V

    .line 199
    .line 200
    .line 201
    invoke-static {v6, v14, v14, v0, v13}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 202
    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_0
    instance-of v1, v0, La/p75;

    .line 206
    .line 207
    if-eqz v1, :cond_2

    .line 208
    .line 209
    check-cast v0, La/p75;

    .line 210
    .line 211
    iget-object v1, v0, La/p75;->a:Ljava/lang/String;

    .line 212
    .line 213
    iget-object v2, v0, La/p75;->b:Ljava/lang/String;

    .line 214
    .line 215
    iget-object v0, v0, La/p75;->c:Ljava/lang/String;

    .line 216
    .line 217
    iget-object v3, v5, La/n75;->M1:La/ii;

    .line 218
    .line 219
    if-eqz v3, :cond_1

    .line 220
    .line 221
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 222
    .line 223
    sget-object v24, La/n12;->b:La/n12;

    .line 224
    .line 225
    const/16 v25, 0x0

    .line 226
    .line 227
    const/16 v26, 0x5f8

    .line 228
    .line 229
    const/16 v19, 0x0

    .line 230
    .line 231
    const/16 v20, 0x0

    .line 232
    .line 233
    const/16 v21, 0x0

    .line 234
    .line 235
    const/16 v22, 0x0

    .line 236
    .line 237
    const/16 v23, 0x0

    .line 238
    .line 239
    move-object/from16 v18, v0

    .line 240
    .line 241
    move-object/from16 v16, v1

    .line 242
    .line 243
    move-object/from16 v17, v2

    .line 244
    .line 245
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v3, v15, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 256
    .line 257
    .line 258
    goto :goto_0

    .line 259
    :cond_1
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v14

    .line 263
    :cond_2
    instance-of v1, v0, La/q75;

    .line 264
    .line 265
    if-eqz v1, :cond_4

    .line 266
    .line 267
    check-cast v0, La/q75;

    .line 268
    .line 269
    iget-object v0, v0, La/q75;->a:Ljava/lang/String;

    .line 270
    .line 271
    iget-object v1, v5, La/n75;->L1:La/wdk0;

    .line 272
    .line 273
    if-eqz v1, :cond_3

    .line 274
    .line 275
    new-instance v15, La/xdk0;

    .line 276
    .line 277
    sget-object v16, La/rek0;->b:La/rek0;

    .line 278
    .line 279
    const/16 v21, 0x0

    .line 280
    .line 281
    const/16 v22, 0x7c

    .line 282
    .line 283
    const/16 v18, 0x0

    .line 284
    .line 285
    const/16 v19, 0x0

    .line 286
    .line 287
    const/16 v20, 0x0

    .line 288
    .line 289
    move-object/from16 v17, v0

    .line 290
    .line 291
    invoke-direct/range {v15 .. v22}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 292
    .line 293
    .line 294
    const/16 v22, 0x3fc

    .line 295
    .line 296
    const/16 v20, 0x0

    .line 297
    .line 298
    move-object/from16 v17, v5

    .line 299
    .line 300
    move-object/from16 v16, v15

    .line 301
    .line 302
    move-object v15, v1

    .line 303
    invoke-static/range {v15 .. v22}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 304
    .line 305
    .line 306
    goto :goto_0

    .line 307
    :cond_3
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw v14

    .line 311
    :cond_4
    :goto_0
    iget-object v0, v5, La/n75;->O1:La/kiu0;

    .line 312
    .line 313
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    check-cast v0, La/g85;

    .line 318
    .line 319
    sget-object v1, La/h75;->a:La/h75;

    .line 320
    .line 321
    invoke-virtual {v0, v1}, La/g85;->N(La/k75;)V

    .line 322
    .line 323
    .line 324
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 325
    .line 326
    return-object v0

    .line 327
    :pswitch_9
    check-cast v6, La/wpq;

    .line 328
    .line 329
    check-cast v5, La/pkk0;

    .line 330
    .line 331
    check-cast v4, La/cj4;

    .line 332
    .line 333
    move-object/from16 v0, p1

    .line 334
    .line 335
    check-cast v0, La/ni4;

    .line 336
    .line 337
    sget-object v1, La/cj4;->U1:La/gfk0;

    .line 338
    .line 339
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-static {v6}, La/wpq;->a(La/wpq;)V

    .line 343
    .line 344
    .line 345
    if-eqz v5, :cond_5

    .line 346
    .line 347
    check-cast v5, La/r3k;

    .line 348
    .line 349
    invoke-virtual {v5}, La/r3k;->a()V

    .line 350
    .line 351
    .line 352
    :cond_5
    invoke-virtual {v4}, La/cj4;->G0()La/k3t0;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-virtual {v1, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 360
    .line 361
    return-object v0

    .line 362
    :pswitch_a
    check-cast v6, La/wpq;

    .line 363
    .line 364
    check-cast v5, La/pkk0;

    .line 365
    .line 366
    check-cast v4, La/ze4;

    .line 367
    .line 368
    move-object/from16 v0, p1

    .line 369
    .line 370
    check-cast v0, La/me4;

    .line 371
    .line 372
    sget-object v1, La/ze4;->g2:La/qek0;

    .line 373
    .line 374
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    invoke-static {v6}, La/wpq;->a(La/wpq;)V

    .line 378
    .line 379
    .line 380
    if-eqz v5, :cond_6

    .line 381
    .line 382
    check-cast v5, La/r3k;

    .line 383
    .line 384
    invoke-virtual {v5}, La/r3k;->a()V

    .line 385
    .line 386
    .line 387
    :cond_6
    invoke-virtual {v4}, La/ze4;->K0()La/k3t0;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    sget-object v1, La/ce4;->a:La/ce4;

    .line 392
    .line 393
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 397
    .line 398
    return-object v0

    .line 399
    :pswitch_b
    check-cast v6, La/jdk0;

    .line 400
    .line 401
    check-cast v5, Landroidx/fragment/app/Fragment;

    .line 402
    .line 403
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 404
    .line 405
    move-object/from16 v0, p1

    .line 406
    .line 407
    check-cast v0, La/lwk;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    new-instance v1, La/sa4;

    .line 421
    .line 422
    invoke-direct {v1, v4, v15}, La/sa4;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 423
    .line 424
    .line 425
    const-string v3, "OTP_CONFIRMATION_RESULT_KEY"

    .line 426
    .line 427
    invoke-virtual {v0, v3, v5, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 428
    .line 429
    .line 430
    new-instance v1, La/sa4;

    .line 431
    .line 432
    invoke-direct {v1, v4, v2}, La/sa4;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 433
    .line 434
    .line 435
    const-string v2, "KEY_LOGIN_QR_SCANNER_REQUEST"

    .line 436
    .line 437
    invoke-virtual {v0, v2, v5, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 438
    .line 439
    .line 440
    new-instance v0, La/wc2;

    .line 441
    .line 442
    const/4 v1, 0x7

    .line 443
    invoke-direct {v0, v4, v1}, La/wc2;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 444
    .line 445
    .line 446
    const-string v1, "KEY_REQUEST_CONFIRMATION_NEW_PLACE"

    .line 447
    .line 448
    invoke-static {v5, v1, v0}, La/vdb;->j0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 449
    .line 450
    .line 451
    new-instance v0, La/zk2;

    .line 452
    .line 453
    const/16 v1, 0x16

    .line 454
    .line 455
    invoke-direct {v0, v4, v1}, La/zk2;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 456
    .line 457
    .line 458
    const-string v1, "AUTH_LOGIN_DEFAULT_KEY_REQUEST_SUPPORT"

    .line 459
    .line 460
    invoke-static {v5, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 461
    .line 462
    .line 463
    new-instance v0, La/zk2;

    .line 464
    .line 465
    const/16 v2, 0x17

    .line 466
    .line 467
    invoke-direct {v0, v4, v2}, La/zk2;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 468
    .line 469
    .line 470
    invoke-static {v5, v1, v0}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 471
    .line 472
    .line 473
    new-instance v0, La/zk2;

    .line 474
    .line 475
    invoke-direct {v0, v4, v8}, La/zk2;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 476
    .line 477
    .line 478
    new-instance v1, La/wc2;

    .line 479
    .line 480
    invoke-direct {v1, v4, v7}, La/wc2;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    new-instance v3, La/hi;

    .line 488
    .line 489
    const-string v7, "AUTH_LOGIN_DEFAULT_KEY_REQUEST_CAPTCHA_CODE_DIALOG"

    .line 490
    .line 491
    invoke-direct {v3, v7, v0, v1}, La/hi;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2, v7, v5, v3}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 495
    .line 496
    .line 497
    new-instance v0, La/ag0;

    .line 498
    .line 499
    const/16 v1, 0xd

    .line 500
    .line 501
    invoke-direct {v0, v4, v1}, La/ag0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 502
    .line 503
    .line 504
    const-string v1, "KEY_AUTH_ENTRY_POINT_REQUEST"

    .line 505
    .line 506
    invoke-static {v5, v1, v0}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 507
    .line 508
    .line 509
    new-instance v0, La/ag0;

    .line 510
    .line 511
    const/16 v1, 0xe

    .line 512
    .line 513
    invoke-direct {v0, v4, v1}, La/ag0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 514
    .line 515
    .line 516
    const-string v1, "KEY_PICKER_MODEL_REQUEST"

    .line 517
    .line 518
    invoke-static {v5, v1, v0}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 519
    .line 520
    .line 521
    new-instance v0, La/ag0;

    .line 522
    .line 523
    const/16 v1, 0xb

    .line 524
    .line 525
    invoke-direct {v0, v4, v1}, La/ag0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 526
    .line 527
    .line 528
    const-string v1, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 529
    .line 530
    invoke-static {v5, v1, v0}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 531
    .line 532
    .line 533
    new-instance v0, La/ag0;

    .line 534
    .line 535
    const/16 v1, 0xc

    .line 536
    .line 537
    invoke-direct {v0, v4, v1}, La/ag0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 538
    .line 539
    .line 540
    const-string v1, "PICKER_DIALOG_TAG"

    .line 541
    .line 542
    invoke-static {v5, v1, v0}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    invoke-static {v0, v15}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 554
    .line 555
    .line 556
    new-instance v0, La/va4;

    .line 557
    .line 558
    invoke-direct {v0, v6, v5}, La/va4;-><init>(La/jdk0;Landroidx/fragment/app/Fragment;)V

    .line 559
    .line 560
    .line 561
    return-object v0

    .line 562
    :pswitch_c
    check-cast v6, Lorg/xplatform/core/navigation/authorization/model/AuthType;

    .line 563
    .line 564
    check-cast v5, La/pru;

    .line 565
    .line 566
    check-cast v4, La/bzt;

    .line 567
    .line 568
    move-object/from16 v0, p1

    .line 569
    .line 570
    check-cast v0, La/vzg0;

    .line 571
    .line 572
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    new-instance v15, La/m54;

    .line 576
    .line 577
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 578
    .line 579
    .line 580
    move-result v1

    .line 581
    if-eqz v1, :cond_8

    .line 582
    .line 583
    if-ne v1, v2, :cond_7

    .line 584
    .line 585
    sget-object v1, La/xn4;->b:La/xn4;

    .line 586
    .line 587
    goto :goto_1

    .line 588
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 589
    .line 590
    .line 591
    goto :goto_2

    .line 592
    :cond_8
    sget-object v1, La/xn4;->a:La/xn4;

    .line 593
    .line 594
    :goto_1
    const-string v2, "KEY_AUTH_TYPE"

    .line 595
    .line 596
    invoke-static {v0, v2, v1}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    move-object/from16 v16, v1

    .line 601
    .line 602
    check-cast v16, La/xn4;

    .line 603
    .line 604
    const-string v1, "KEY_ANIMATE_CHANGES"

    .line 605
    .line 606
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 607
    .line 608
    invoke-static {v0, v1, v2}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    check-cast v0, Ljava/lang/Boolean;

    .line 613
    .line 614
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 615
    .line 616
    .line 617
    move-result v17

    .line 618
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    iget-object v0, v0, La/sff0;->N:La/co4;

    .line 623
    .line 624
    iget-boolean v0, v0, La/co4;->m:Z

    .line 625
    .line 626
    iget-object v1, v4, La/bzt;->a:La/fsd;

    .line 627
    .line 628
    invoke-virtual {v1}, La/fsd;->a()La/v8d;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    iget-boolean v1, v1, La/v8d;->A:Z

    .line 633
    .line 634
    const/16 v20, 0x0

    .line 635
    .line 636
    const-wide/16 v21, -0x1

    .line 637
    .line 638
    move/from16 v18, v0

    .line 639
    .line 640
    move/from16 v19, v1

    .line 641
    .line 642
    invoke-direct/range {v15 .. v22}, La/m54;-><init>(La/xn4;ZZZZJ)V

    .line 643
    .line 644
    .line 645
    move-object v14, v15

    .line 646
    :goto_2
    return-object v14

    .line 647
    :pswitch_d
    check-cast v6, La/gl3;

    .line 648
    .line 649
    iget-object v0, v6, La/gl3;->g:La/ani0;

    .line 650
    .line 651
    iget-object v1, v6, La/gl3;->m:La/p7m0;

    .line 652
    .line 653
    check-cast v5, Ljava/lang/String;

    .line 654
    .line 655
    check-cast v4, Ljava/lang/String;

    .line 656
    .line 657
    move-object/from16 v3, p1

    .line 658
    .line 659
    check-cast v3, Ljava/lang/Throwable;

    .line 660
    .line 661
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 662
    .line 663
    .line 664
    instance-of v7, v3, La/rtw;

    .line 665
    .line 666
    if-eqz v7, :cond_9

    .line 667
    .line 668
    move-object v7, v3

    .line 669
    check-cast v7, La/rtw;

    .line 670
    .line 671
    goto :goto_3

    .line 672
    :cond_9
    move-object v7, v14

    .line 673
    :goto_3
    if-eqz v7, :cond_a

    .line 674
    .line 675
    iget v7, v7, La/rtw;->a:I

    .line 676
    .line 677
    const/16 v8, 0x1a0

    .line 678
    .line 679
    if-ne v7, v8, :cond_a

    .line 680
    .line 681
    sget-object v2, La/mm3;->a:La/mm3;

    .line 682
    .line 683
    invoke-virtual {v0, v2}, La/ani0;->b(La/pm3;)V

    .line 684
    .line 685
    .line 686
    iget-object v0, v6, La/gl3;->j:La/a7u;

    .line 687
    .line 688
    invoke-virtual {v0, v5}, La/a7u;->a(Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    sget-object v0, La/uk3;->a:La/uk3;

    .line 695
    .line 696
    invoke-virtual {v1, v14, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    goto :goto_4

    .line 700
    :cond_a
    instance-of v7, v3, La/xto;

    .line 701
    .line 702
    sget-object v8, La/vk3;->a:La/vk3;

    .line 703
    .line 704
    if-eqz v7, :cond_b

    .line 705
    .line 706
    new-instance v3, La/om3;

    .line 707
    .line 708
    invoke-direct {v3, v2}, La/om3;-><init>(Z)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v0, v3}, La/ani0;->b(La/pm3;)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v1, v14, v8}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 718
    .line 719
    .line 720
    goto :goto_4

    .line 721
    :cond_b
    instance-of v2, v3, La/qoe;

    .line 722
    .line 723
    if-eqz v2, :cond_c

    .line 724
    .line 725
    iget-object v0, v6, La/gl3;->k:La/zx10;

    .line 726
    .line 727
    invoke-virtual {v0, v5}, La/zx10;->o(Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    new-instance v0, La/rk3;

    .line 731
    .line 732
    invoke-direct {v0, v5, v4}, La/rk3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v1, v14, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    goto :goto_4

    .line 742
    :cond_c
    new-instance v2, La/om3;

    .line 743
    .line 744
    invoke-direct {v2, v15}, La/om3;-><init>(Z)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v0, v2}, La/ani0;->b(La/pm3;)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v1, v14, v8}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 757
    .line 758
    return-object v0

    .line 759
    :pswitch_e
    check-cast v6, La/bhu0;

    .line 760
    .line 761
    check-cast v5, La/e7z;

    .line 762
    .line 763
    check-cast v4, La/bhu0;

    .line 764
    .line 765
    move-object/from16 v0, p1

    .line 766
    .line 767
    check-cast v0, La/fhl;

    .line 768
    .line 769
    invoke-interface {v0}, La/fhl;->A0()La/nr;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    invoke-virtual {v0}, La/nr;->i()La/x5a;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    iget-object v1, v6, La/k33;->b:Landroid/view/View;

    .line 778
    .line 779
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 780
    .line 781
    .line 782
    move-result v1

    .line 783
    if-eq v1, v7, :cond_f

    .line 784
    .line 785
    iput-boolean v2, v6, La/k33;->y:Z

    .line 786
    .line 787
    iget-object v1, v5, La/e7z;->o:La/cg80;

    .line 788
    .line 789
    instance-of v2, v1, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 790
    .line 791
    if-eqz v2, :cond_d

    .line 792
    .line 793
    move-object v14, v1

    .line 794
    check-cast v14, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 795
    .line 796
    :cond_d
    if-eqz v14, :cond_e

    .line 797
    .line 798
    invoke-static {v0}, La/vw2;->b(La/x5a;)Landroid/graphics/Canvas;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    invoke-virtual {v14}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()La/p33;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v4, v0}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 810
    .line 811
    .line 812
    :cond_e
    iput-boolean v15, v6, La/k33;->y:Z

    .line 813
    .line 814
    :cond_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 815
    .line 816
    return-object v0

    .line 817
    :pswitch_f
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 818
    .line 819
    check-cast v5, Landroidx/fragment/app/Fragment;

    .line 820
    .line 821
    check-cast v4, Landroid/content/Context;

    .line 822
    .line 823
    move-object/from16 v0, p1

    .line 824
    .line 825
    check-cast v0, Landroid/view/View;

    .line 826
    .line 827
    const v1, 0x7f0a0164

    .line 828
    .line 829
    .line 830
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v1

    .line 834
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 835
    .line 836
    .line 837
    check-cast v1, La/yfu0;

    .line 838
    .line 839
    invoke-interface {v6, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 843
    .line 844
    if-eqz v1, :cond_10

    .line 845
    .line 846
    check-cast v0, Landroid/view/ViewGroup;

    .line 847
    .line 848
    goto :goto_5

    .line 849
    :cond_10
    move-object v0, v14

    .line 850
    :goto_5
    if-eqz v0, :cond_15

    .line 851
    .line 852
    if-eqz v5, :cond_12

    .line 853
    .line 854
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 855
    .line 856
    .line 857
    move-result-object v1

    .line 858
    if-nez v1, :cond_11

    .line 859
    .line 860
    goto :goto_6

    .line 861
    :cond_11
    move-object v14, v1

    .line 862
    goto :goto_8

    .line 863
    :cond_12
    :goto_6
    instance-of v1, v4, La/kxq;

    .line 864
    .line 865
    if-eqz v1, :cond_13

    .line 866
    .line 867
    check-cast v4, La/kxq;

    .line 868
    .line 869
    goto :goto_7

    .line 870
    :cond_13
    move-object v4, v14

    .line 871
    :goto_7
    if-eqz v4, :cond_14

    .line 872
    .line 873
    invoke-virtual {v4}, La/kxq;->r()La/v1r;

    .line 874
    .line 875
    .line 876
    move-result-object v14

    .line 877
    :cond_14
    :goto_8
    new-instance v1, La/b33;

    .line 878
    .line 879
    invoke-direct {v1, v14, v15}, La/b33;-><init>(Ljava/lang/Object;B)V

    .line 880
    .line 881
    .line 882
    invoke-static {v0, v1}, La/y860;->c0(Landroid/view/ViewGroup;La/b33;)V

    .line 883
    .line 884
    .line 885
    :cond_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 886
    .line 887
    return-object v0

    .line 888
    :pswitch_10
    check-cast v6, Landroidx/fragment/app/e;

    .line 889
    .line 890
    check-cast v5, La/nzq;

    .line 891
    .line 892
    check-cast v4, La/lkz;

    .line 893
    .line 894
    move-object/from16 v0, p1

    .line 895
    .line 896
    check-cast v0, La/lwk;

    .line 897
    .line 898
    invoke-virtual {v5}, La/nzq;->a()Landroidx/fragment/app/FragmentContainerView;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 903
    .line 904
    .line 905
    move-result v0

    .line 906
    invoke-virtual {v6, v0}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    if-eqz v0, :cond_16

    .line 911
    .line 912
    invoke-virtual {v6}, Landroidx/fragment/app/e;->a0()Z

    .line 913
    .line 914
    .line 915
    move-result v1

    .line 916
    if-nez v1, :cond_16

    .line 917
    .line 918
    sget-object v1, La/lkz;->c:La/lkz;

    .line 919
    .line 920
    invoke-virtual {v4, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 921
    .line 922
    .line 923
    move-result v1

    .line 924
    if-ltz v1, :cond_16

    .line 925
    .line 926
    new-instance v1, La/zb5;

    .line 927
    .line 928
    invoke-direct {v1, v6}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 929
    .line 930
    .line 931
    iput-boolean v2, v1, La/zb5;->p:Z

    .line 932
    .line 933
    invoke-virtual {v1, v0, v4}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 934
    .line 935
    .line 936
    invoke-virtual {v1}, La/zb5;->h()V

    .line 937
    .line 938
    .line 939
    :cond_16
    new-instance v0, La/mz2;

    .line 940
    .line 941
    invoke-direct {v0, v15}, La/mz2;-><init>(B)V

    .line 942
    .line 943
    .line 944
    return-object v0

    .line 945
    :pswitch_11
    check-cast v6, La/ctf0;

    .line 946
    .line 947
    check-cast v5, La/y78;

    .line 948
    .line 949
    check-cast v4, La/pru;

    .line 950
    .line 951
    move-object/from16 v0, p1

    .line 952
    .line 953
    check-cast v0, La/xm2;

    .line 954
    .line 955
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 956
    .line 957
    .line 958
    invoke-virtual {v4}, La/pru;->a()La/sff0;

    .line 959
    .line 960
    .line 961
    move-result-object v1

    .line 962
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    iget-boolean v4, v0, La/xm2;->a:Z

    .line 966
    .line 967
    iget-object v7, v0, La/xm2;->h:La/mdm;

    .line 968
    .line 969
    iget-object v8, v0, La/xm2;->e:Ljava/util/List;

    .line 970
    .line 971
    iget-boolean v9, v0, La/xm2;->p:Z

    .line 972
    .line 973
    iget-object v10, v0, La/xm2;->j:La/ym2;

    .line 974
    .line 975
    iget-object v12, v0, La/xm2;->d:Ljava/util/List;

    .line 976
    .line 977
    iget-boolean v13, v0, La/xm2;->m:Z

    .line 978
    .line 979
    if-eqz v4, :cond_18

    .line 980
    .line 981
    new-instance v1, La/whe;

    .line 982
    .line 983
    if-eqz v13, :cond_17

    .line 984
    .line 985
    const/16 v11, 0x1c

    .line 986
    .line 987
    :cond_17
    invoke-direct {v1, v11, v13}, La/whe;-><init>(IZ)V

    .line 988
    .line 989
    .line 990
    :goto_9
    move-object v13, v1

    .line 991
    move-object/from16 p0, v12

    .line 992
    .line 993
    goto/16 :goto_2d

    .line 994
    .line 995
    :cond_18
    iget-boolean v4, v0, La/xm2;->b:Z

    .line 996
    .line 997
    if-eqz v4, :cond_19

    .line 998
    .line 999
    new-instance v1, La/sge;

    .line 1000
    .line 1001
    iget-object v3, v0, La/xm2;->g:La/mdm;

    .line 1002
    .line 1003
    invoke-direct {v1, v3}, La/sge;-><init>(La/mdm;)V

    .line 1004
    .line 1005
    .line 1006
    goto :goto_9

    .line 1007
    :cond_19
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 1008
    .line 1009
    .line 1010
    move-result v4

    .line 1011
    if-nez v4, :cond_2d

    .line 1012
    .line 1013
    new-instance v4, La/nhe;

    .line 1014
    .line 1015
    iget-object v7, v1, La/sff0;->b:La/hl1;

    .line 1016
    .line 1017
    iget-object v7, v7, La/hl1;->a:La/f61;

    .line 1018
    .line 1019
    iget-boolean v7, v7, La/f61;->a:Z

    .line 1020
    .line 1021
    iget-object v1, v1, La/sff0;->d:La/q1w0;

    .line 1022
    .line 1023
    iget-object v1, v1, La/q1w0;->a:La/dyv0;

    .line 1024
    .line 1025
    iget-object v1, v1, La/dyv0;->b:Ljava/lang/String;

    .line 1026
    .line 1027
    if-eqz v10, :cond_1a

    .line 1028
    .line 1029
    iget-boolean v8, v10, La/ym2;->h:Z

    .line 1030
    .line 1031
    :goto_a
    move/from16 v33, v2

    .line 1032
    .line 1033
    goto :goto_b

    .line 1034
    :cond_1a
    move v8, v15

    .line 1035
    goto :goto_a

    .line 1036
    :goto_b
    new-instance v2, Ljava/util/ArrayList;

    .line 1037
    .line 1038
    invoke-static {v12, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1039
    .line 1040
    .line 1041
    move-result v11

    .line 1042
    invoke-direct {v2, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 1043
    .line 1044
    .line 1045
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v11

    .line 1049
    :goto_c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1050
    .line 1051
    .line 1052
    move-result v18

    .line 1053
    if-eqz v18, :cond_2b

    .line 1054
    .line 1055
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v18

    .line 1059
    move-object/from16 v14, v18

    .line 1060
    .line 1061
    check-cast v14, La/oxy;

    .line 1062
    .line 1063
    if-eqz v14, :cond_2a

    .line 1064
    .line 1065
    instance-of v15, v14, La/kxy;

    .line 1066
    .line 1067
    if-eqz v15, :cond_1f

    .line 1068
    .line 1069
    new-instance v15, La/nn2;

    .line 1070
    .line 1071
    new-instance v18, La/sdp;

    .line 1072
    .line 1073
    check-cast v14, La/kxy;

    .line 1074
    .line 1075
    iget-object v14, v14, La/kxy;->b:La/js0;

    .line 1076
    .line 1077
    move-object/from16 p1, v11

    .line 1078
    .line 1079
    move-object/from16 p0, v12

    .line 1080
    .line 1081
    iget-wide v11, v14, La/js0;->a:J

    .line 1082
    .line 1083
    move-object/from16 v30, v1

    .line 1084
    .line 1085
    iget-object v1, v14, La/js0;->b:Ljava/lang/String;

    .line 1086
    .line 1087
    if-eqz v7, :cond_1b

    .line 1088
    .line 1089
    const v19, 0x7f1317c7

    .line 1090
    .line 1091
    .line 1092
    :goto_d
    move-object/from16 v21, v1

    .line 1093
    .line 1094
    move-object/from16 v35, v3

    .line 1095
    .line 1096
    move/from16 v31, v7

    .line 1097
    .line 1098
    move/from16 v1, v19

    .line 1099
    .line 1100
    const/4 v3, 0x0

    .line 1101
    goto :goto_e

    .line 1102
    :cond_1b
    const v19, 0x7f1303ce

    .line 1103
    .line 1104
    .line 1105
    goto :goto_d

    .line 1106
    :goto_e
    new-array v7, v3, [Ljava/lang/Object;

    .line 1107
    .line 1108
    move-wide/from16 v19, v11

    .line 1109
    .line 1110
    iget-object v11, v6, La/ctf0;->b:La/lsm0;

    .line 1111
    .line 1112
    invoke-static {v7, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v7

    .line 1116
    invoke-virtual {v11, v1, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v23

    .line 1120
    if-eqz v31, :cond_1c

    .line 1121
    .line 1122
    const v1, 0x7f080aeb

    .line 1123
    .line 1124
    .line 1125
    :goto_f
    move/from16 v24, v1

    .line 1126
    .line 1127
    goto :goto_10

    .line 1128
    :cond_1c
    const v1, 0x7f080b0a

    .line 1129
    .line 1130
    .line 1131
    goto :goto_f

    .line 1132
    :goto_10
    iget-object v1, v14, La/js0;->c:Ljava/lang/String;

    .line 1133
    .line 1134
    iget-object v3, v14, La/js0;->d:Ljava/lang/String;

    .line 1135
    .line 1136
    const v7, 0x7f08061a

    .line 1137
    .line 1138
    .line 1139
    const v11, 0x7f0807c1

    .line 1140
    .line 1141
    .line 1142
    if-eqz v31, :cond_1d

    .line 1143
    .line 1144
    move/from16 v27, v11

    .line 1145
    .line 1146
    goto :goto_11

    .line 1147
    :cond_1d
    move/from16 v27, v7

    .line 1148
    .line 1149
    :goto_11
    if-eqz v31, :cond_1e

    .line 1150
    .line 1151
    move/from16 v28, v11

    .line 1152
    .line 1153
    goto :goto_12

    .line 1154
    :cond_1e
    move/from16 v28, v7

    .line 1155
    .line 1156
    :goto_12
    const/16 v29, 0x0

    .line 1157
    .line 1158
    move-object/from16 v22, v21

    .line 1159
    .line 1160
    move-object/from16 v25, v1

    .line 1161
    .line 1162
    move-object/from16 v26, v3

    .line 1163
    .line 1164
    invoke-direct/range {v18 .. v29}, La/sdp;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIZ)V

    .line 1165
    .line 1166
    .line 1167
    move-object/from16 v1, v18

    .line 1168
    .line 1169
    new-instance v3, La/im2;

    .line 1170
    .line 1171
    invoke-direct {v3, v14}, La/im2;-><init>(La/js0;)V

    .line 1172
    .line 1173
    .line 1174
    invoke-direct {v15, v1, v3}, La/nn2;-><init>(La/tdp;La/vm2;)V

    .line 1175
    .line 1176
    .line 1177
    :goto_13
    move/from16 v27, v8

    .line 1178
    .line 1179
    goto/16 :goto_1c

    .line 1180
    .line 1181
    :cond_1f
    move-object/from16 v30, v1

    .line 1182
    .line 1183
    move-object/from16 v35, v3

    .line 1184
    .line 1185
    move/from16 v31, v7

    .line 1186
    .line 1187
    move-object/from16 p1, v11

    .line 1188
    .line 1189
    move-object/from16 p0, v12

    .line 1190
    .line 1191
    instance-of v1, v14, La/lxy;

    .line 1192
    .line 1193
    if-eqz v1, :cond_20

    .line 1194
    .line 1195
    new-instance v15, La/nn2;

    .line 1196
    .line 1197
    new-instance v18, La/sdp;

    .line 1198
    .line 1199
    check-cast v14, La/lxy;

    .line 1200
    .line 1201
    iget-object v1, v14, La/lxy;->b:La/nxy;

    .line 1202
    .line 1203
    iget-wide v11, v1, La/nxy;->a:J

    .line 1204
    .line 1205
    iget-object v3, v1, La/nxy;->d:La/hds;

    .line 1206
    .line 1207
    iget-object v3, v3, La/hds;->b:Ljava/lang/String;

    .line 1208
    .line 1209
    invoke-static {v3}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v22

    .line 1213
    iget-object v7, v1, La/nxy;->b:Ljava/lang/String;

    .line 1214
    .line 1215
    const v28, 0x7f0807c2

    .line 1216
    .line 1217
    .line 1218
    iget-boolean v14, v1, La/nxy;->e:Z

    .line 1219
    .line 1220
    const v24, 0x7f080b0b

    .line 1221
    .line 1222
    .line 1223
    const-string v26, ""

    .line 1224
    .line 1225
    const v27, 0x7f0807c2

    .line 1226
    .line 1227
    .line 1228
    move-object/from16 v21, v3

    .line 1229
    .line 1230
    move-object/from16 v25, v7

    .line 1231
    .line 1232
    move-wide/from16 v19, v11

    .line 1233
    .line 1234
    move/from16 v29, v14

    .line 1235
    .line 1236
    move-object/from16 v23, v30

    .line 1237
    .line 1238
    invoke-direct/range {v18 .. v29}, La/sdp;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIZ)V

    .line 1239
    .line 1240
    .line 1241
    move-object/from16 v3, v18

    .line 1242
    .line 1243
    new-instance v7, La/um2;

    .line 1244
    .line 1245
    const/4 v11, 0x0

    .line 1246
    invoke-direct {v7, v1, v11}, La/um2;-><init>(La/nxy;Ljava/lang/String;)V

    .line 1247
    .line 1248
    .line 1249
    invoke-direct {v15, v3, v7}, La/nn2;-><init>(La/tdp;La/vm2;)V

    .line 1250
    .line 1251
    .line 1252
    goto :goto_13

    .line 1253
    :cond_20
    instance-of v1, v14, La/mxy;

    .line 1254
    .line 1255
    if-eqz v1, :cond_2a

    .line 1256
    .line 1257
    check-cast v14, La/mxy;

    .line 1258
    .line 1259
    iget-object v1, v14, La/mxy;->b:La/d0t;

    .line 1260
    .line 1261
    iget-wide v11, v1, La/d0t;->a:J

    .line 1262
    .line 1263
    iget-object v3, v1, La/d0t;->b:Ljava/lang/String;

    .line 1264
    .line 1265
    iget-wide v14, v1, La/d0t;->v:J

    .line 1266
    .line 1267
    const-wide/16 v18, 0x0

    .line 1268
    .line 1269
    cmp-long v7, v14, v18

    .line 1270
    .line 1271
    if-eqz v7, :cond_21

    .line 1272
    .line 1273
    const-string v7, "svg"

    .line 1274
    .line 1275
    move-wide/from16 v20, v11

    .line 1276
    .line 1277
    const-string v11, "sports_v2"

    .line 1278
    .line 1279
    const-string v12, "static"

    .line 1280
    .line 1281
    invoke-static {v12, v7, v11}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v7

    .line 1285
    const-string v11, ".svg"

    .line 1286
    .line 1287
    invoke-static {v14, v15, v11, v7}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 1288
    .line 1289
    .line 1290
    iget-object v7, v7, La/bzu;->b:Ljava/lang/Object;

    .line 1291
    .line 1292
    check-cast v7, Ljava/lang/StringBuilder;

    .line 1293
    .line 1294
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v7

    .line 1298
    goto :goto_14

    .line 1299
    :cond_21
    move-wide/from16 v20, v11

    .line 1300
    .line 1301
    move-object/from16 v7, v35

    .line 1302
    .line 1303
    :goto_14
    iget-object v11, v1, La/d0t;->o:Ljava/lang/String;

    .line 1304
    .line 1305
    invoke-static {v3}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 1306
    .line 1307
    .line 1308
    move-result v12

    .line 1309
    if-nez v12, :cond_23

    .line 1310
    .line 1311
    const-wide/16 v22, 0x92

    .line 1312
    .line 1313
    cmp-long v12, v14, v22

    .line 1314
    .line 1315
    if-nez v12, :cond_23

    .line 1316
    .line 1317
    const-string v12, "."

    .line 1318
    .line 1319
    invoke-static {v11, v12, v3}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v11

    .line 1323
    move-object/from16 v24, v7

    .line 1324
    .line 1325
    :cond_22
    :goto_15
    move-object/from16 v22, v11

    .line 1326
    .line 1327
    goto :goto_17

    .line 1328
    :cond_23
    const-wide/16 v22, 0x4

    .line 1329
    .line 1330
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v12

    .line 1334
    const-wide/16 v22, 0xa

    .line 1335
    .line 1336
    move-object/from16 v24, v7

    .line 1337
    .line 1338
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v7

    .line 1342
    filled-new-array {v12, v7}, [Ljava/lang/Long;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v7

    .line 1346
    invoke-static {v7}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v7

    .line 1350
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v12

    .line 1354
    invoke-interface {v7, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1355
    .line 1356
    .line 1357
    move-result v7

    .line 1358
    if-eqz v7, :cond_22

    .line 1359
    .line 1360
    iget-object v7, v1, La/d0t;->y:La/pfs;

    .line 1361
    .line 1362
    iget-object v7, v7, La/pfs;->a:Ljava/lang/String;

    .line 1363
    .line 1364
    filled-new-array {v11, v3, v7}, [Ljava/lang/String;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v3

    .line 1368
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v3

    .line 1372
    new-instance v7, Ljava/util/ArrayList;

    .line 1373
    .line 1374
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1375
    .line 1376
    .line 1377
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v3

    .line 1381
    :cond_24
    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1382
    .line 1383
    .line 1384
    move-result v11

    .line 1385
    if-eqz v11, :cond_25

    .line 1386
    .line 1387
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v11

    .line 1391
    move-object v12, v11

    .line 1392
    check-cast v12, Ljava/lang/String;

    .line 1393
    .line 1394
    invoke-static {v12}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 1395
    .line 1396
    .line 1397
    move-result v12

    .line 1398
    if-nez v12, :cond_24

    .line 1399
    .line 1400
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1401
    .line 1402
    .line 1403
    goto :goto_16

    .line 1404
    :cond_25
    const/16 v40, 0x0

    .line 1405
    .line 1406
    const/16 v41, 0x3e

    .line 1407
    .line 1408
    const-string v37, "."

    .line 1409
    .line 1410
    const/16 v38, 0x0

    .line 1411
    .line 1412
    const/16 v39, 0x0

    .line 1413
    .line 1414
    move-object/from16 v36, v7

    .line 1415
    .line 1416
    invoke-static/range {v36 .. v41}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v11

    .line 1420
    goto :goto_15

    .line 1421
    :goto_17
    iget-object v3, v1, La/d0t;->A:La/boh;

    .line 1422
    .line 1423
    sget-object v7, La/boh;->c:La/boh;

    .line 1424
    .line 1425
    if-eq v3, v7, :cond_26

    .line 1426
    .line 1427
    iget-boolean v3, v1, La/d0t;->z:Z

    .line 1428
    .line 1429
    if-eqz v3, :cond_26

    .line 1430
    .line 1431
    invoke-static {v1}, La/qzb;->E0(La/d0t;)Z

    .line 1432
    .line 1433
    .line 1434
    move-result v3

    .line 1435
    if-eqz v3, :cond_26

    .line 1436
    .line 1437
    move/from16 v3, v33

    .line 1438
    .line 1439
    goto :goto_18

    .line 1440
    :cond_26
    const/4 v3, 0x0

    .line 1441
    :goto_18
    xor-int/lit8 v3, v3, 0x1

    .line 1442
    .line 1443
    iget-wide v11, v1, La/d0t;->m:J

    .line 1444
    .line 1445
    cmp-long v7, v11, v18

    .line 1446
    .line 1447
    if-nez v7, :cond_27

    .line 1448
    .line 1449
    :goto_19
    move/from16 v7, v33

    .line 1450
    .line 1451
    goto :goto_1a

    .line 1452
    :cond_27
    move-wide/from16 v18, v11

    .line 1453
    .line 1454
    iget-wide v11, v1, La/d0t;->a:J

    .line 1455
    .line 1456
    cmp-long v7, v11, v18

    .line 1457
    .line 1458
    if-nez v7, :cond_28

    .line 1459
    .line 1460
    goto :goto_19

    .line 1461
    :goto_1a
    invoke-virtual {v5, v1, v3, v7, v8}, La/y78;->o(La/d0t;ZZZ)Ljava/lang/CharSequence;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v3

    .line 1465
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v3

    .line 1469
    move-object v7, v3

    .line 1470
    const/4 v3, 0x0

    .line 1471
    goto :goto_1b

    .line 1472
    :cond_28
    const-wide/16 v11, 0x42

    .line 1473
    .line 1474
    cmp-long v3, v14, v11

    .line 1475
    .line 1476
    const-string v7, " "

    .line 1477
    .line 1478
    const v11, 0x7f130c8b

    .line 1479
    .line 1480
    .line 1481
    if-nez v3, :cond_29

    .line 1482
    .line 1483
    const/4 v3, 0x0

    .line 1484
    new-array v12, v3, [Ljava/lang/Object;

    .line 1485
    .line 1486
    iget-object v14, v6, La/ctf0;->b:La/lsm0;

    .line 1487
    .line 1488
    invoke-static {v12, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v12

    .line 1492
    invoke-virtual {v14, v11, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v11

    .line 1496
    invoke-static {v1, v11}, La/qzb;->d0(La/d0t;Ljava/lang/String;)Ljava/lang/String;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v11

    .line 1500
    const/4 v12, 0x2

    .line 1501
    invoke-static {v5, v1, v8, v12}, La/y78;->p(La/y78;La/d0t;ZI)Ljava/lang/CharSequence;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v14

    .line 1505
    new-instance v12, Ljava/lang/StringBuilder;

    .line 1506
    .line 1507
    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1508
    .line 1509
    .line 1510
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1511
    .line 1512
    .line 1513
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1514
    .line 1515
    .line 1516
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v7

    .line 1520
    goto :goto_1b

    .line 1521
    :cond_29
    const/4 v3, 0x0

    .line 1522
    new-array v12, v3, [Ljava/lang/Object;

    .line 1523
    .line 1524
    iget-object v14, v6, La/ctf0;->b:La/lsm0;

    .line 1525
    .line 1526
    invoke-static {v12, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v12

    .line 1530
    invoke-virtual {v14, v11, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v11

    .line 1534
    invoke-static {v1, v11}, La/qzb;->d0(La/d0t;Ljava/lang/String;)Ljava/lang/String;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v11

    .line 1538
    const/4 v12, 0x6

    .line 1539
    invoke-static {v5, v1, v8, v12}, La/y78;->p(La/y78;La/d0t;ZI)Ljava/lang/CharSequence;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v14

    .line 1543
    new-instance v12, Ljava/lang/StringBuilder;

    .line 1544
    .line 1545
    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1546
    .line 1547
    .line 1548
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1549
    .line 1550
    .line 1551
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1552
    .line 1553
    .line 1554
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v7

    .line 1558
    :goto_1b
    iget-boolean v11, v1, La/d0t;->C:Z

    .line 1559
    .line 1560
    new-array v12, v3, [Ljava/lang/Object;

    .line 1561
    .line 1562
    iget-object v14, v6, La/ctf0;->b:La/lsm0;

    .line 1563
    .line 1564
    invoke-static {v12, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v12

    .line 1568
    const v3, 0x7f130b40

    .line 1569
    .line 1570
    .line 1571
    invoke-virtual {v14, v3, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v26

    .line 1575
    invoke-static {v1}, La/dwi0;->M(La/d0t;)Ljava/lang/String;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v23

    .line 1579
    new-instance v18, La/qdp;

    .line 1580
    .line 1581
    move/from16 v27, v8

    .line 1582
    .line 1583
    move/from16 v25, v11

    .line 1584
    .line 1585
    move-wide/from16 v19, v20

    .line 1586
    .line 1587
    move-object/from16 v21, v24

    .line 1588
    .line 1589
    move-object/from16 v24, v7

    .line 1590
    .line 1591
    invoke-direct/range {v18 .. v27}, La/qdp;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V

    .line 1592
    .line 1593
    .line 1594
    move-object/from16 v3, v18

    .line 1595
    .line 1596
    new-instance v7, La/tm2;

    .line 1597
    .line 1598
    invoke-direct {v7, v1}, La/tm2;-><init>(La/d0t;)V

    .line 1599
    .line 1600
    .line 1601
    new-instance v15, La/nn2;

    .line 1602
    .line 1603
    invoke-direct {v15, v3, v7}, La/nn2;-><init>(La/tdp;La/vm2;)V

    .line 1604
    .line 1605
    .line 1606
    :goto_1c
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1607
    .line 1608
    .line 1609
    const/4 v14, 0x0

    .line 1610
    move-object/from16 v12, p0

    .line 1611
    .line 1612
    move-object/from16 v11, p1

    .line 1613
    .line 1614
    move/from16 v8, v27

    .line 1615
    .line 1616
    move-object/from16 v1, v30

    .line 1617
    .line 1618
    move/from16 v7, v31

    .line 1619
    .line 1620
    move-object/from16 v3, v35

    .line 1621
    .line 1622
    const/4 v15, 0x0

    .line 1623
    const/16 v33, 0x1

    .line 1624
    .line 1625
    goto/16 :goto_c

    .line 1626
    .line 1627
    :cond_2a
    invoke-static {}, La/t9f;->b()V

    .line 1628
    .line 1629
    .line 1630
    const/4 v14, 0x0

    .line 1631
    goto/16 :goto_30

    .line 1632
    .line 1633
    :cond_2b
    move-object/from16 p0, v12

    .line 1634
    .line 1635
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v1

    .line 1639
    if-eqz v10, :cond_2c

    .line 1640
    .line 1641
    iget-boolean v2, v10, La/ym2;->h:Z

    .line 1642
    .line 1643
    goto :goto_1d

    .line 1644
    :cond_2c
    const/4 v2, 0x0

    .line 1645
    :goto_1d
    invoke-direct {v4, v1, v13, v9, v2}, La/nhe;-><init>(La/a4x;ZZZ)V

    .line 1646
    .line 1647
    .line 1648
    move-object v13, v4

    .line 1649
    goto/16 :goto_2d

    .line 1650
    .line 1651
    :cond_2d
    move-object/from16 v35, v3

    .line 1652
    .line 1653
    move-object/from16 p0, v12

    .line 1654
    .line 1655
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 1656
    .line 1657
    .line 1658
    move-result v1

    .line 1659
    if-nez v1, :cond_3e

    .line 1660
    .line 1661
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v1

    .line 1665
    new-instance v2, La/kn2;

    .line 1666
    .line 1667
    iget-boolean v3, v0, La/xm2;->c:Z

    .line 1668
    .line 1669
    if-eqz v3, :cond_2e

    .line 1670
    .line 1671
    iget-object v7, v0, La/xm2;->i:La/mdm;

    .line 1672
    .line 1673
    :cond_2e
    if-eqz v13, :cond_2f

    .line 1674
    .line 1675
    const/4 v3, 0x2

    .line 1676
    goto :goto_1e

    .line 1677
    :cond_2f
    const/4 v3, 0x1

    .line 1678
    :goto_1e
    invoke-direct {v2, v7, v3}, La/kn2;-><init>(La/mdm;I)V

    .line 1679
    .line 1680
    .line 1681
    invoke-virtual {v1, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1682
    .line 1683
    .line 1684
    if-eqz v10, :cond_3a

    .line 1685
    .line 1686
    iget-object v2, v10, La/ym2;->f:La/wcb;

    .line 1687
    .line 1688
    iget-boolean v3, v10, La/ym2;->d:Z

    .line 1689
    .line 1690
    iget-boolean v4, v10, La/ym2;->b:Z

    .line 1691
    .line 1692
    iget-object v5, v10, La/ym2;->a:La/v5l0;

    .line 1693
    .line 1694
    iget-object v7, v10, La/ym2;->e:La/y78;

    .line 1695
    .line 1696
    iget-object v12, v10, La/ym2;->g:Ljava/util/List;

    .line 1697
    .line 1698
    iget-boolean v14, v10, La/ym2;->h:Z

    .line 1699
    .line 1700
    new-instance v15, Ljava/util/ArrayList;

    .line 1701
    .line 1702
    move/from16 v21, v3

    .line 1703
    .line 1704
    invoke-static {v8, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1705
    .line 1706
    .line 1707
    move-result v3

    .line 1708
    invoke-direct {v15, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1709
    .line 1710
    .line 1711
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v3

    .line 1715
    :goto_1f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1716
    .line 1717
    .line 1718
    move-result v8

    .line 1719
    if-eqz v8, :cond_38

    .line 1720
    .line 1721
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v8

    .line 1725
    check-cast v8, La/d0t;

    .line 1726
    .line 1727
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v16

    .line 1731
    :goto_20
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 1732
    .line 1733
    .line 1734
    move-result v18

    .line 1735
    if-eqz v18, :cond_31

    .line 1736
    .line 1737
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v18

    .line 1741
    move-object/from16 v11, v18

    .line 1742
    .line 1743
    check-cast v11, La/lok0;

    .line 1744
    .line 1745
    iget v11, v11, La/lok0;->a:I

    .line 1746
    .line 1747
    move-object/from16 p1, v3

    .line 1748
    .line 1749
    iget v3, v8, La/d0t;->O:I

    .line 1750
    .line 1751
    if-ne v11, v3, :cond_30

    .line 1752
    .line 1753
    goto :goto_21

    .line 1754
    :cond_30
    move-object/from16 v3, p1

    .line 1755
    .line 1756
    const/16 v11, 0xa

    .line 1757
    .line 1758
    goto :goto_20

    .line 1759
    :cond_31
    move-object/from16 p1, v3

    .line 1760
    .line 1761
    const/16 v18, 0x0

    .line 1762
    .line 1763
    :goto_21
    move-object/from16 v3, v18

    .line 1764
    .line 1765
    check-cast v3, La/lok0;

    .line 1766
    .line 1767
    move/from16 v22, v4

    .line 1768
    .line 1769
    move-object/from16 v29, v5

    .line 1770
    .line 1771
    iget-wide v4, v8, La/d0t;->v:J

    .line 1772
    .line 1773
    move-object/from16 v19, v6

    .line 1774
    .line 1775
    move-object/from16 v20, v7

    .line 1776
    .line 1777
    iget-wide v6, v8, La/d0t;->u:J

    .line 1778
    .line 1779
    invoke-virtual {v2, v4, v5, v6, v7}, La/wcb;->a(JJ)Ljava/lang/String;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v23

    .line 1783
    new-instance v4, Ljava/util/ArrayList;

    .line 1784
    .line 1785
    const/16 v5, 0xa

    .line 1786
    .line 1787
    invoke-static {v12, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1788
    .line 1789
    .line 1790
    move-result v6

    .line 1791
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1792
    .line 1793
    .line 1794
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v5

    .line 1798
    :goto_22
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1799
    .line 1800
    .line 1801
    move-result v6

    .line 1802
    if-eqz v6, :cond_32

    .line 1803
    .line 1804
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v6

    .line 1808
    check-cast v6, La/lok0;

    .line 1809
    .line 1810
    iget v6, v6, La/lok0;->a:I

    .line 1811
    .line 1812
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v6

    .line 1816
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1817
    .line 1818
    .line 1819
    goto :goto_22

    .line 1820
    :cond_32
    if-eqz v3, :cond_33

    .line 1821
    .line 1822
    iget-boolean v5, v3, La/lok0;->n:Z

    .line 1823
    .line 1824
    move/from16 v26, v5

    .line 1825
    .line 1826
    goto :goto_23

    .line 1827
    :cond_33
    const/16 v26, 0x0

    .line 1828
    .line 1829
    :goto_23
    if-eqz v3, :cond_34

    .line 1830
    .line 1831
    iget-boolean v5, v3, La/lok0;->p:Z

    .line 1832
    .line 1833
    move/from16 v27, v5

    .line 1834
    .line 1835
    goto :goto_24

    .line 1836
    :cond_34
    const/16 v27, 0x0

    .line 1837
    .line 1838
    :goto_24
    iget-object v5, v8, La/d0t;->K:Ljava/util/List;

    .line 1839
    .line 1840
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 1841
    .line 1842
    .line 1843
    move-result v5

    .line 1844
    if-eqz v5, :cond_35

    .line 1845
    .line 1846
    sget-object v5, La/i5l0;->a:La/i5l0;

    .line 1847
    .line 1848
    :goto_25
    move-object/from16 v30, v5

    .line 1849
    .line 1850
    goto :goto_26

    .line 1851
    :cond_35
    sget-object v5, La/l5l0;->a:La/l5l0;

    .line 1852
    .line 1853
    goto :goto_25

    .line 1854
    :goto_26
    if-eqz v3, :cond_36

    .line 1855
    .line 1856
    iget-object v3, v3, La/lok0;->u:Ljava/lang/String;

    .line 1857
    .line 1858
    goto :goto_27

    .line 1859
    :cond_36
    const/4 v3, 0x0

    .line 1860
    :goto_27
    if-nez v3, :cond_37

    .line 1861
    .line 1862
    move-object/from16 v31, v35

    .line 1863
    .line 1864
    goto :goto_28

    .line 1865
    :cond_37
    move-object/from16 v31, v3

    .line 1866
    .line 1867
    :goto_28
    const/16 v24, 0x0

    .line 1868
    .line 1869
    const/16 v28, 0x0

    .line 1870
    .line 1871
    move-object/from16 v25, v4

    .line 1872
    .line 1873
    move-object/from16 v18, v8

    .line 1874
    .line 1875
    move/from16 v32, v14

    .line 1876
    .line 1877
    invoke-static/range {v18 .. v32}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v3

    .line 1881
    move-object/from16 v6, v19

    .line 1882
    .line 1883
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1884
    .line 1885
    .line 1886
    move-object/from16 v3, p1

    .line 1887
    .line 1888
    move-object/from16 v7, v20

    .line 1889
    .line 1890
    move/from16 v4, v22

    .line 1891
    .line 1892
    move-object/from16 v5, v29

    .line 1893
    .line 1894
    const/16 v11, 0xa

    .line 1895
    .line 1896
    goto/16 :goto_1f

    .line 1897
    .line 1898
    :cond_38
    new-instance v2, Ljava/util/ArrayList;

    .line 1899
    .line 1900
    const/16 v5, 0xa

    .line 1901
    .line 1902
    invoke-static {v15, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1903
    .line 1904
    .line 1905
    move-result v3

    .line 1906
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1907
    .line 1908
    .line 1909
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v3

    .line 1913
    :goto_29
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1914
    .line 1915
    .line 1916
    move-result v4

    .line 1917
    if-eqz v4, :cond_39

    .line 1918
    .line 1919
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v4

    .line 1923
    check-cast v4, La/a2n;

    .line 1924
    .line 1925
    new-instance v5, La/mn2;

    .line 1926
    .line 1927
    invoke-direct {v5, v4}, La/mn2;-><init>(La/a2n;)V

    .line 1928
    .line 1929
    .line 1930
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1931
    .line 1932
    .line 1933
    goto :goto_29

    .line 1934
    :cond_39
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v2

    .line 1938
    if-eqz v2, :cond_3a

    .line 1939
    .line 1940
    goto :goto_2a

    .line 1941
    :cond_3a
    sget-object v2, La/lak0;->c:La/lak0;

    .line 1942
    .line 1943
    :goto_2a
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 1944
    .line 1945
    .line 1946
    move-result v3

    .line 1947
    if-nez v3, :cond_3c

    .line 1948
    .line 1949
    new-instance v3, La/ln2;

    .line 1950
    .line 1951
    new-instance v18, La/hjm;

    .line 1952
    .line 1953
    const/4 v4, 0x0

    .line 1954
    new-array v5, v4, [Ljava/lang/Object;

    .line 1955
    .line 1956
    iget-object v7, v6, La/ctf0;->b:La/lsm0;

    .line 1957
    .line 1958
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v5

    .line 1962
    const v4, 0x7f1310d4

    .line 1963
    .line 1964
    .line 1965
    invoke-virtual {v7, v4, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v19

    .line 1969
    sget-object v4, La/s6t0;->a:La/pz40;

    .line 1970
    .line 1971
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v4

    .line 1975
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1976
    .line 1977
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 1978
    .line 1979
    .line 1980
    move-result-wide v4

    .line 1981
    new-instance v7, La/y3d;

    .line 1982
    .line 1983
    invoke-direct {v7, v4, v5}, La/y3d;-><init>(J)V

    .line 1984
    .line 1985
    .line 1986
    const/16 v30, 0x0

    .line 1987
    .line 1988
    const/16 v31, 0x1ffa

    .line 1989
    .line 1990
    const/16 v20, 0x0

    .line 1991
    .line 1992
    const/16 v22, 0x0

    .line 1993
    .line 1994
    const/16 v23, 0x0

    .line 1995
    .line 1996
    const/16 v24, 0x0

    .line 1997
    .line 1998
    const/16 v25, 0x0

    .line 1999
    .line 2000
    const/16 v26, 0x0

    .line 2001
    .line 2002
    const/16 v27, 0x0

    .line 2003
    .line 2004
    const/16 v28, 0x0

    .line 2005
    .line 2006
    const/16 v29, 0x0

    .line 2007
    .line 2008
    move-object/from16 v21, v7

    .line 2009
    .line 2010
    invoke-direct/range {v18 .. v31}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 2011
    .line 2012
    .line 2013
    move-object/from16 v4, v18

    .line 2014
    .line 2015
    if-eqz v13, :cond_3b

    .line 2016
    .line 2017
    const/4 v5, 0x2

    .line 2018
    goto :goto_2b

    .line 2019
    :cond_3b
    const/4 v5, 0x1

    .line 2020
    :goto_2b
    invoke-direct {v3, v4, v5}, La/ln2;-><init>(La/hjm;I)V

    .line 2021
    .line 2022
    .line 2023
    invoke-virtual {v1, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2024
    .line 2025
    .line 2026
    invoke-virtual {v1, v2}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 2027
    .line 2028
    .line 2029
    :cond_3c
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 2030
    .line 2031
    .line 2032
    move-result-object v1

    .line 2033
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v1

    .line 2037
    if-eqz v10, :cond_3d

    .line 2038
    .line 2039
    iget-boolean v2, v10, La/ym2;->h:Z

    .line 2040
    .line 2041
    goto :goto_2c

    .line 2042
    :cond_3d
    const/4 v2, 0x0

    .line 2043
    :goto_2c
    new-instance v3, La/nhe;

    .line 2044
    .line 2045
    invoke-direct {v3, v1, v13, v9, v2}, La/nhe;-><init>(La/a4x;ZZZ)V

    .line 2046
    .line 2047
    .line 2048
    move-object v13, v3

    .line 2049
    goto :goto_2d

    .line 2050
    :cond_3e
    new-instance v1, La/xge;

    .line 2051
    .line 2052
    invoke-direct {v1, v7, v9}, La/xge;-><init>(La/mdm;Z)V

    .line 2053
    .line 2054
    .line 2055
    move-object v13, v1

    .line 2056
    :goto_2d
    new-instance v14, La/imm;

    .line 2057
    .line 2058
    new-instance v15, La/ilm;

    .line 2059
    .line 2060
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 2061
    .line 2062
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v1

    .line 2066
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2067
    .line 2068
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 2069
    .line 2070
    .line 2071
    move-result-wide v1

    .line 2072
    invoke-direct {v15, v1, v2}, La/ilm;-><init>(J)V

    .line 2073
    .line 2074
    .line 2075
    new-instance v1, La/plm;

    .line 2076
    .line 2077
    const/4 v3, 0x0

    .line 2078
    new-array v2, v3, [Ljava/lang/Object;

    .line 2079
    .line 2080
    iget-object v4, v6, La/ctf0;->b:La/lsm0;

    .line 2081
    .line 2082
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v2

    .line 2086
    const v3, 0x7f13179f

    .line 2087
    .line 2088
    .line 2089
    invoke-virtual {v4, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2090
    .line 2091
    .line 2092
    move-result-object v2

    .line 2093
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 2094
    .line 2095
    .line 2096
    move-result-object v3

    .line 2097
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2098
    .line 2099
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 2100
    .line 2101
    .line 2102
    move-result-wide v3

    .line 2103
    sget-object v5, La/fa50;->a:La/fa50;

    .line 2104
    .line 2105
    invoke-direct {v1, v2, v3, v4, v5}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 2106
    .line 2107
    .line 2108
    new-instance v2, La/dmm;

    .line 2109
    .line 2110
    new-instance v3, La/ta50;

    .line 2111
    .line 2112
    invoke-interface/range {p0 .. p0}, Ljava/util/Collection;->isEmpty()Z

    .line 2113
    .line 2114
    .line 2115
    move-result v4

    .line 2116
    const/16 v33, 0x1

    .line 2117
    .line 2118
    xor-int/lit8 v8, v4, 0x1

    .line 2119
    .line 2120
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v4

    .line 2124
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2125
    .line 2126
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 2127
    .line 2128
    .line 2129
    move-result-wide v10

    .line 2130
    new-instance v5, La/wkm;

    .line 2131
    .line 2132
    const/4 v6, 0x0

    .line 2133
    const v7, 0x7f080a30

    .line 2134
    .line 2135
    .line 2136
    sget-object v9, La/ra50;->a:La/ra50;

    .line 2137
    .line 2138
    invoke-direct/range {v5 .. v11}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 2139
    .line 2140
    .line 2141
    invoke-direct {v3, v5}, La/ta50;-><init>(La/wkm;)V

    .line 2142
    .line 2143
    .line 2144
    invoke-direct {v2, v3}, La/dmm;-><init>(La/wa50;)V

    .line 2145
    .line 2146
    .line 2147
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 2148
    .line 2149
    .line 2150
    move-result-object v3

    .line 2151
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2152
    .line 2153
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 2154
    .line 2155
    .line 2156
    move-result-wide v18

    .line 2157
    const/16 v20, 0x1

    .line 2158
    .line 2159
    const/16 v21, 0x0

    .line 2160
    .line 2161
    move-object/from16 v16, v1

    .line 2162
    .line 2163
    move-object/from16 v17, v2

    .line 2164
    .line 2165
    invoke-direct/range {v14 .. v21}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 2166
    .line 2167
    .line 2168
    iget-boolean v12, v0, La/xm2;->n:Z

    .line 2169
    .line 2170
    iget-boolean v15, v0, La/xm2;->o:Z

    .line 2171
    .line 2172
    move-object v11, v14

    .line 2173
    new-instance v14, La/zpv;

    .line 2174
    .line 2175
    iget-boolean v0, v0, La/xm2;->q:Z

    .line 2176
    .line 2177
    if-eqz v0, :cond_3f

    .line 2178
    .line 2179
    invoke-interface/range {p0 .. p0}, Ljava/util/Collection;->isEmpty()Z

    .line 2180
    .line 2181
    .line 2182
    move-result v0

    .line 2183
    if-nez v0, :cond_3f

    .line 2184
    .line 2185
    const/4 v2, 0x1

    .line 2186
    :goto_2e
    const/4 v3, 0x0

    .line 2187
    goto :goto_2f

    .line 2188
    :cond_3f
    const/4 v2, 0x0

    .line 2189
    goto :goto_2e

    .line 2190
    :goto_2f
    invoke-direct {v14, v3, v2}, La/zpv;-><init>(ZZ)V

    .line 2191
    .line 2192
    .line 2193
    new-instance v10, La/pn2;

    .line 2194
    .line 2195
    invoke-direct/range {v10 .. v15}, La/pn2;-><init>(La/imm;ZLa/fie;La/zpv;Z)V

    .line 2196
    .line 2197
    .line 2198
    move-object v14, v10

    .line 2199
    :goto_30
    return-object v14

    .line 2200
    :pswitch_12
    check-cast v6, La/pz40;

    .line 2201
    .line 2202
    check-cast v5, La/wul;

    .line 2203
    .line 2204
    check-cast v4, La/t42;

    .line 2205
    .line 2206
    move-object/from16 v0, p1

    .line 2207
    .line 2208
    check-cast v0, La/hcz;

    .line 2209
    .line 2210
    sget-object v1, La/t42;->p2:La/jdk0;

    .line 2211
    .line 2212
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2213
    .line 2214
    .line 2215
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2216
    .line 2217
    .line 2218
    move-result-object v1

    .line 2219
    check-cast v1, La/d52;

    .line 2220
    .line 2221
    iget-object v1, v1, La/d52;->b:La/a4x;

    .line 2222
    .line 2223
    new-instance v2, La/dj1;

    .line 2224
    .line 2225
    const/16 v3, 0x19

    .line 2226
    .line 2227
    invoke-direct {v2, v3}, La/dj1;-><init>(B)V

    .line 2228
    .line 2229
    .line 2230
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 2231
    .line 2232
    .line 2233
    move-result v3

    .line 2234
    new-instance v6, La/g5;

    .line 2235
    .line 2236
    invoke-direct {v6, v2, v1, v8}, La/g5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2237
    .line 2238
    .line 2239
    new-instance v2, La/wl0;

    .line 2240
    .line 2241
    const/4 v7, 0x5

    .line 2242
    invoke-direct {v2, v1, v7}, La/wl0;-><init>(La/a4x;B)V

    .line 2243
    .line 2244
    .line 2245
    new-instance v8, La/c8;

    .line 2246
    .line 2247
    invoke-direct {v8, v1, v5, v4, v7}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2248
    .line 2249
    .line 2250
    new-instance v1, La/ugd;

    .line 2251
    .line 2252
    const/4 v7, 0x1

    .line 2253
    invoke-direct {v1, v12, v7, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2254
    .line 2255
    .line 2256
    invoke-virtual {v0, v3, v6, v2, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2257
    .line 2258
    .line 2259
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2260
    .line 2261
    return-object v0

    .line 2262
    :pswitch_13
    check-cast v6, La/ax0;

    .line 2263
    .line 2264
    check-cast v5, La/pz40;

    .line 2265
    .line 2266
    check-cast v4, La/pz40;

    .line 2267
    .line 2268
    move-object/from16 v0, p1

    .line 2269
    .line 2270
    check-cast v0, Landroid/widget/FrameLayout;

    .line 2271
    .line 2272
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2273
    .line 2274
    .line 2275
    iget-object v1, v6, La/ax0;->a:Landroid/webkit/WebView;

    .line 2276
    .line 2277
    iget-object v2, v6, La/ax0;->b:Landroid/view/View;

    .line 2278
    .line 2279
    if-nez v1, :cond_40

    .line 2280
    .line 2281
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2282
    .line 2283
    .line 2284
    const/4 v11, 0x0

    .line 2285
    invoke-interface {v5, v11}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 2286
    .line 2287
    .line 2288
    invoke-interface {v4, v11}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 2289
    .line 2290
    .line 2291
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2292
    .line 2293
    goto/16 :goto_37

    .line 2294
    .line 2295
    :cond_40
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v3

    .line 2299
    if-eqz v3, :cond_43

    .line 2300
    .line 2301
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2302
    .line 2303
    .line 2304
    move-result-object v3

    .line 2305
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2306
    .line 2307
    .line 2308
    move-result v3

    .line 2309
    if-nez v3, :cond_43

    .line 2310
    .line 2311
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2312
    .line 2313
    .line 2314
    move-result-object v3

    .line 2315
    check-cast v3, Landroid/webkit/WebView;

    .line 2316
    .line 2317
    if-eqz v3, :cond_41

    .line 2318
    .line 2319
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2320
    .line 2321
    .line 2322
    move-result-object v3

    .line 2323
    goto :goto_31

    .line 2324
    :cond_41
    const/4 v3, 0x0

    .line 2325
    :goto_31
    instance-of v6, v3, Landroid/view/ViewGroup;

    .line 2326
    .line 2327
    if-eqz v6, :cond_42

    .line 2328
    .line 2329
    check-cast v3, Landroid/view/ViewGroup;

    .line 2330
    .line 2331
    goto :goto_32

    .line 2332
    :cond_42
    const/4 v3, 0x0

    .line 2333
    :goto_32
    if-eqz v3, :cond_43

    .line 2334
    .line 2335
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2336
    .line 2337
    .line 2338
    move-result-object v6

    .line 2339
    check-cast v6, Landroid/view/View;

    .line 2340
    .line 2341
    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2342
    .line 2343
    .line 2344
    :cond_43
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2345
    .line 2346
    .line 2347
    move-result-object v3

    .line 2348
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2349
    .line 2350
    .line 2351
    move-result v3

    .line 2352
    if-nez v3, :cond_46

    .line 2353
    .line 2354
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2355
    .line 2356
    .line 2357
    move-result-object v3

    .line 2358
    instance-of v6, v3, Landroid/view/ViewGroup;

    .line 2359
    .line 2360
    if-eqz v6, :cond_44

    .line 2361
    .line 2362
    check-cast v3, Landroid/view/ViewGroup;

    .line 2363
    .line 2364
    goto :goto_33

    .line 2365
    :cond_44
    const/4 v3, 0x0

    .line 2366
    :goto_33
    if-eqz v3, :cond_45

    .line 2367
    .line 2368
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2369
    .line 2370
    .line 2371
    :cond_45
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2372
    .line 2373
    .line 2374
    :cond_46
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2375
    .line 2376
    .line 2377
    move-result-object v3

    .line 2378
    if-eqz v3, :cond_49

    .line 2379
    .line 2380
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2381
    .line 2382
    .line 2383
    move-result-object v3

    .line 2384
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2385
    .line 2386
    .line 2387
    move-result v3

    .line 2388
    if-nez v3, :cond_49

    .line 2389
    .line 2390
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2391
    .line 2392
    .line 2393
    move-result-object v3

    .line 2394
    check-cast v3, Landroid/view/View;

    .line 2395
    .line 2396
    if-eqz v3, :cond_47

    .line 2397
    .line 2398
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2399
    .line 2400
    .line 2401
    move-result-object v3

    .line 2402
    goto :goto_34

    .line 2403
    :cond_47
    const/4 v3, 0x0

    .line 2404
    :goto_34
    instance-of v6, v3, Landroid/view/ViewGroup;

    .line 2405
    .line 2406
    if-eqz v6, :cond_48

    .line 2407
    .line 2408
    check-cast v3, Landroid/view/ViewGroup;

    .line 2409
    .line 2410
    goto :goto_35

    .line 2411
    :cond_48
    const/4 v3, 0x0

    .line 2412
    :goto_35
    if-eqz v3, :cond_49

    .line 2413
    .line 2414
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2415
    .line 2416
    .line 2417
    move-result-object v6

    .line 2418
    check-cast v6, Landroid/view/View;

    .line 2419
    .line 2420
    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2421
    .line 2422
    .line 2423
    :cond_49
    if-eqz v2, :cond_4c

    .line 2424
    .line 2425
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2426
    .line 2427
    .line 2428
    move-result-object v3

    .line 2429
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2430
    .line 2431
    .line 2432
    move-result v3

    .line 2433
    if-nez v3, :cond_4c

    .line 2434
    .line 2435
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2436
    .line 2437
    .line 2438
    move-result-object v3

    .line 2439
    instance-of v6, v3, Landroid/view/ViewGroup;

    .line 2440
    .line 2441
    if-eqz v6, :cond_4a

    .line 2442
    .line 2443
    move-object v14, v3

    .line 2444
    check-cast v14, Landroid/view/ViewGroup;

    .line 2445
    .line 2446
    goto :goto_36

    .line 2447
    :cond_4a
    const/4 v14, 0x0

    .line 2448
    :goto_36
    if-eqz v14, :cond_4b

    .line 2449
    .line 2450
    invoke-virtual {v14, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2451
    .line 2452
    .line 2453
    :cond_4b
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2454
    .line 2455
    .line 2456
    :cond_4c
    invoke-interface {v5, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 2457
    .line 2458
    .line 2459
    invoke-interface {v4, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 2460
    .line 2461
    .line 2462
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2463
    .line 2464
    :goto_37
    return-object v0

    .line 2465
    :pswitch_14
    check-cast v6, La/vne;

    .line 2466
    .line 2467
    check-cast v5, La/on1;

    .line 2468
    .line 2469
    check-cast v4, La/d9z;

    .line 2470
    .line 2471
    move-object/from16 v0, p1

    .line 2472
    .line 2473
    check-cast v0, La/ao1;

    .line 2474
    .line 2475
    sget-object v1, La/on1;->S1:La/hfk0;

    .line 2476
    .line 2477
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2478
    .line 2479
    .line 2480
    sget-object v1, La/xn1;->a:La/xn1;

    .line 2481
    .line 2482
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2483
    .line 2484
    .line 2485
    move-result v1

    .line 2486
    if-eqz v1, :cond_4e

    .line 2487
    .line 2488
    new-instance v0, La/kn1;

    .line 2489
    .line 2490
    const/4 v3, 0x0

    .line 2491
    const/4 v11, 0x0

    .line 2492
    invoke-direct {v0, v4, v11, v3}, La/kn1;-><init>(La/d9z;La/yje;B)V

    .line 2493
    .line 2494
    .line 2495
    invoke-static {v6, v11, v11, v0, v13}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 2496
    .line 2497
    .line 2498
    :cond_4d
    :goto_38
    move-object/from16 v16, v5

    .line 2499
    .line 2500
    goto/16 :goto_39

    .line 2501
    .line 2502
    :cond_4e
    instance-of v1, v0, La/un1;

    .line 2503
    .line 2504
    if-eqz v1, :cond_55

    .line 2505
    .line 2506
    check-cast v0, La/un1;

    .line 2507
    .line 2508
    iget-object v0, v0, La/un1;->a:La/ob0;

    .line 2509
    .line 2510
    instance-of v1, v0, La/mb0;

    .line 2511
    .line 2512
    if-eqz v1, :cond_50

    .line 2513
    .line 2514
    check-cast v0, La/mb0;

    .line 2515
    .line 2516
    iget-object v8, v0, La/mb0;->a:Ljava/lang/String;

    .line 2517
    .line 2518
    iget-object v6, v5, La/on1;->M1:La/ynb;

    .line 2519
    .line 2520
    if-eqz v6, :cond_4f

    .line 2521
    .line 2522
    sget-object v7, La/bm5;->e:La/bm5;

    .line 2523
    .line 2524
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2525
    .line 2526
    .line 2527
    move-result-object v9

    .line 2528
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2529
    .line 2530
    .line 2531
    const-string v11, "REQUEST_CHANGE_BALANCE_KEY"

    .line 2532
    .line 2533
    const/16 v12, 0x1e6

    .line 2534
    .line 2535
    const/4 v10, 0x0

    .line 2536
    invoke-static/range {v6 .. v12}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 2537
    .line 2538
    .line 2539
    goto :goto_38

    .line 2540
    :cond_4f
    const-string v0, "changeBalanceDialogProvider"

    .line 2541
    .line 2542
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2543
    .line 2544
    .line 2545
    const/16 v34, 0x0

    .line 2546
    .line 2547
    throw v34

    .line 2548
    :cond_50
    sget-object v1, La/lb0;->a:La/lb0;

    .line 2549
    .line 2550
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2551
    .line 2552
    .line 2553
    move-result v1

    .line 2554
    const v2, 0x7f130e5c

    .line 2555
    .line 2556
    .line 2557
    const v3, 0x7f130162

    .line 2558
    .line 2559
    .line 2560
    if-eqz v1, :cond_52

    .line 2561
    .line 2562
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2563
    .line 2564
    .line 2565
    move-result-object v0

    .line 2566
    if-eqz v0, :cond_4d

    .line 2567
    .line 2568
    iget-object v1, v5, La/on1;->N1:La/ii;

    .line 2569
    .line 2570
    if-eqz v1, :cond_51

    .line 2571
    .line 2572
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2573
    .line 2574
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2575
    .line 2576
    .line 2577
    move-result-object v12

    .line 2578
    const v3, 0x7f1303dc

    .line 2579
    .line 2580
    .line 2581
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2582
    .line 2583
    .line 2584
    move-result-object v13

    .line 2585
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2586
    .line 2587
    .line 2588
    move-result-object v14

    .line 2589
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2590
    .line 2591
    .line 2592
    sget-object v20, La/n12;->b:La/n12;

    .line 2593
    .line 2594
    const/16 v21, 0x0

    .line 2595
    .line 2596
    const/16 v22, 0x5d8

    .line 2597
    .line 2598
    const/4 v15, 0x0

    .line 2599
    const/16 v16, 0x0

    .line 2600
    .line 2601
    const-string v17, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 2602
    .line 2603
    const/16 v18, 0x0

    .line 2604
    .line 2605
    const/16 v19, 0x0

    .line 2606
    .line 2607
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2608
    .line 2609
    .line 2610
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 2611
    .line 2612
    .line 2613
    move-result-object v0

    .line 2614
    invoke-virtual {v1, v11, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2615
    .line 2616
    .line 2617
    goto :goto_38

    .line 2618
    :cond_51
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2619
    .line 2620
    .line 2621
    const/16 v34, 0x0

    .line 2622
    .line 2623
    throw v34

    .line 2624
    :cond_52
    sget-object v1, La/nb0;->a:La/nb0;

    .line 2625
    .line 2626
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2627
    .line 2628
    .line 2629
    move-result v0

    .line 2630
    if-eqz v0, :cond_54

    .line 2631
    .line 2632
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2633
    .line 2634
    .line 2635
    move-result-object v0

    .line 2636
    if-eqz v0, :cond_4d

    .line 2637
    .line 2638
    iget-object v1, v5, La/on1;->N1:La/ii;

    .line 2639
    .line 2640
    if-eqz v1, :cond_53

    .line 2641
    .line 2642
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2643
    .line 2644
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2645
    .line 2646
    .line 2647
    move-result-object v12

    .line 2648
    const v3, 0x7f13123b

    .line 2649
    .line 2650
    .line 2651
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2652
    .line 2653
    .line 2654
    move-result-object v13

    .line 2655
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2656
    .line 2657
    .line 2658
    move-result-object v14

    .line 2659
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2660
    .line 2661
    .line 2662
    sget-object v20, La/n12;->b:La/n12;

    .line 2663
    .line 2664
    const/16 v21, 0x0

    .line 2665
    .line 2666
    const/16 v22, 0x5d8

    .line 2667
    .line 2668
    const/4 v15, 0x0

    .line 2669
    const/16 v16, 0x0

    .line 2670
    .line 2671
    const-string v17, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 2672
    .line 2673
    const/16 v18, 0x0

    .line 2674
    .line 2675
    const/16 v19, 0x0

    .line 2676
    .line 2677
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2678
    .line 2679
    .line 2680
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 2681
    .line 2682
    .line 2683
    move-result-object v0

    .line 2684
    invoke-virtual {v1, v11, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2685
    .line 2686
    .line 2687
    goto/16 :goto_38

    .line 2688
    .line 2689
    :cond_53
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2690
    .line 2691
    .line 2692
    const/16 v34, 0x0

    .line 2693
    .line 2694
    throw v34

    .line 2695
    :cond_54
    invoke-static {}, La/t9f;->b()V

    .line 2696
    .line 2697
    .line 2698
    const/4 v14, 0x0

    .line 2699
    goto/16 :goto_3a

    .line 2700
    .line 2701
    :cond_55
    instance-of v1, v0, La/vn1;

    .line 2702
    .line 2703
    if-eqz v1, :cond_56

    .line 2704
    .line 2705
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 2706
    .line 2707
    .line 2708
    move-result-object v0

    .line 2709
    invoke-static {v0}, La/j120;->X(Landroid/view/View;)V

    .line 2710
    .line 2711
    .line 2712
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 2713
    .line 2714
    .line 2715
    goto/16 :goto_38

    .line 2716
    .line 2717
    :cond_56
    instance-of v1, v0, La/zn1;

    .line 2718
    .line 2719
    if-eqz v1, :cond_58

    .line 2720
    .line 2721
    check-cast v0, La/zn1;

    .line 2722
    .line 2723
    iget-object v12, v0, La/zn1;->a:Ljava/lang/String;

    .line 2724
    .line 2725
    iget-object v13, v0, La/zn1;->b:Ljava/lang/String;

    .line 2726
    .line 2727
    iget-object v14, v0, La/zn1;->c:Ljava/lang/String;

    .line 2728
    .line 2729
    iget-object v0, v5, La/on1;->N1:La/ii;

    .line 2730
    .line 2731
    if-eqz v0, :cond_57

    .line 2732
    .line 2733
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2734
    .line 2735
    sget-object v20, La/n12;->b:La/n12;

    .line 2736
    .line 2737
    const/16 v21, 0x0

    .line 2738
    .line 2739
    const/16 v22, 0x5f8

    .line 2740
    .line 2741
    const/4 v15, 0x0

    .line 2742
    const/16 v16, 0x0

    .line 2743
    .line 2744
    const/16 v17, 0x0

    .line 2745
    .line 2746
    const/16 v18, 0x0

    .line 2747
    .line 2748
    const/16 v19, 0x0

    .line 2749
    .line 2750
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2751
    .line 2752
    .line 2753
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2754
    .line 2755
    .line 2756
    move-result-object v1

    .line 2757
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2758
    .line 2759
    .line 2760
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2761
    .line 2762
    .line 2763
    goto/16 :goto_38

    .line 2764
    .line 2765
    :cond_57
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2766
    .line 2767
    .line 2768
    const/16 v34, 0x0

    .line 2769
    .line 2770
    throw v34

    .line 2771
    :cond_58
    instance-of v1, v0, La/yn1;

    .line 2772
    .line 2773
    if-eqz v1, :cond_5a

    .line 2774
    .line 2775
    check-cast v0, La/yn1;

    .line 2776
    .line 2777
    iget-object v12, v0, La/yn1;->a:Ljava/lang/String;

    .line 2778
    .line 2779
    iget-object v0, v5, La/on1;->L1:La/wdk0;

    .line 2780
    .line 2781
    if-eqz v0, :cond_59

    .line 2782
    .line 2783
    new-instance v15, La/xdk0;

    .line 2784
    .line 2785
    sget-object v11, La/rek0;->b:La/rek0;

    .line 2786
    .line 2787
    const/16 v16, 0x0

    .line 2788
    .line 2789
    const/16 v17, 0x7c

    .line 2790
    .line 2791
    const/4 v13, 0x0

    .line 2792
    const/4 v14, 0x0

    .line 2793
    move-object v10, v15

    .line 2794
    const/4 v15, 0x0

    .line 2795
    invoke-direct/range {v10 .. v17}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2796
    .line 2797
    .line 2798
    const/16 v20, 0x0

    .line 2799
    .line 2800
    const/16 v21, 0x3fc

    .line 2801
    .line 2802
    const/16 v17, 0x0

    .line 2803
    .line 2804
    const/16 v18, 0x0

    .line 2805
    .line 2806
    const/16 v19, 0x0

    .line 2807
    .line 2808
    move-object v14, v0

    .line 2809
    move-object/from16 v16, v5

    .line 2810
    .line 2811
    move-object v15, v10

    .line 2812
    invoke-static/range {v14 .. v21}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2813
    .line 2814
    .line 2815
    goto :goto_39

    .line 2816
    :cond_59
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2817
    .line 2818
    .line 2819
    const/16 v34, 0x0

    .line 2820
    .line 2821
    throw v34

    .line 2822
    :cond_5a
    move-object/from16 v16, v5

    .line 2823
    .line 2824
    instance-of v0, v0, La/wn1;

    .line 2825
    .line 2826
    if-eqz v0, :cond_5b

    .line 2827
    .line 2828
    invoke-static/range {v16 .. v16}, La/qcc;->c0(Landroidx/fragment/app/Fragment;)Ljava/lang/Boolean;

    .line 2829
    .line 2830
    .line 2831
    :cond_5b
    :goto_39
    invoke-virtual/range {v16 .. v16}, La/on1;->G0()La/k3t0;

    .line 2832
    .line 2833
    .line 2834
    move-result-object v0

    .line 2835
    sget-object v1, La/um1;->a:La/um1;

    .line 2836
    .line 2837
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2838
    .line 2839
    .line 2840
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2841
    .line 2842
    :goto_3a
    return-object v14

    .line 2843
    :pswitch_15
    check-cast v6, La/l7m0;

    .line 2844
    .line 2845
    check-cast v5, La/y5d;

    .line 2846
    .line 2847
    check-cast v4, La/cl1;

    .line 2848
    .line 2849
    move-object/from16 v0, p1

    .line 2850
    .line 2851
    check-cast v0, La/hcz;

    .line 2852
    .line 2853
    sget-object v1, La/cl1;->o2:La/gfk0;

    .line 2854
    .line 2855
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2856
    .line 2857
    .line 2858
    new-instance v1, La/ri1;

    .line 2859
    .line 2860
    const/16 v2, 0x1a

    .line 2861
    .line 2862
    invoke-direct {v1, v5, v4, v2}, La/ri1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2863
    .line 2864
    .line 2865
    new-instance v2, La/ugd;

    .line 2866
    .line 2867
    const v3, 0x49a74078    # 1370127.0f

    .line 2868
    .line 2869
    .line 2870
    const/4 v7, 0x1

    .line 2871
    invoke-direct {v2, v3, v7, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2872
    .line 2873
    .line 2874
    const/4 v11, 0x0

    .line 2875
    invoke-static {v0, v11, v11, v2, v13}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2876
    .line 2877
    .line 2878
    new-instance v1, La/bl1;

    .line 2879
    .line 2880
    invoke-direct {v1, v4, v6, v7}, La/bl1;-><init>(La/cl1;La/l7m0;B)V

    .line 2881
    .line 2882
    .line 2883
    new-instance v2, La/ugd;

    .line 2884
    .line 2885
    const v3, -0x5467691

    .line 2886
    .line 2887
    .line 2888
    invoke-direct {v2, v3, v7, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2889
    .line 2890
    .line 2891
    invoke-static {v0, v11, v11, v2, v13}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2892
    .line 2893
    .line 2894
    new-instance v1, La/zk1;

    .line 2895
    .line 2896
    const/4 v12, 0x2

    .line 2897
    invoke-direct {v1, v4, v12}, La/zk1;-><init>(La/cl1;B)V

    .line 2898
    .line 2899
    .line 2900
    new-instance v2, La/ugd;

    .line 2901
    .line 2902
    const v3, -0x1d0a5650

    .line 2903
    .line 2904
    .line 2905
    invoke-direct {v2, v3, v7, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2906
    .line 2907
    .line 2908
    invoke-static {v0, v11, v11, v2, v13}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2909
    .line 2910
    .line 2911
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2912
    .line 2913
    .line 2914
    move-result-object v1

    .line 2915
    check-cast v1, La/el1;

    .line 2916
    .line 2917
    iget-object v1, v1, La/el1;->b:Ljava/lang/String;

    .line 2918
    .line 2919
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2920
    .line 2921
    .line 2922
    move-result v1

    .line 2923
    if-lez v1, :cond_5c

    .line 2924
    .line 2925
    new-instance v1, La/zk1;

    .line 2926
    .line 2927
    const/4 v3, 0x0

    .line 2928
    invoke-direct {v1, v4, v3}, La/zk1;-><init>(La/cl1;B)V

    .line 2929
    .line 2930
    .line 2931
    new-instance v2, La/ugd;

    .line 2932
    .line 2933
    const v3, 0x4df1bc93    # 5.0695843E8f

    .line 2934
    .line 2935
    .line 2936
    invoke-direct {v2, v3, v7, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2937
    .line 2938
    .line 2939
    invoke-static {v0, v11, v11, v2, v13}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2940
    .line 2941
    .line 2942
    new-instance v1, La/v7i0;

    .line 2943
    .line 2944
    const/4 v12, 0x6

    .line 2945
    invoke-direct {v1, v6, v12}, La/v7i0;-><init>(La/l7m0;B)V

    .line 2946
    .line 2947
    .line 2948
    new-instance v2, La/ugd;

    .line 2949
    .line 2950
    const v3, 0x4b727cca    # 1.5891658E7f

    .line 2951
    .line 2952
    .line 2953
    invoke-direct {v2, v3, v7, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2954
    .line 2955
    .line 2956
    invoke-static {v0, v11, v11, v2, v13}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2957
    .line 2958
    .line 2959
    :cond_5c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2960
    .line 2961
    return-object v0

    .line 2962
    :pswitch_16
    check-cast v6, La/pz40;

    .line 2963
    .line 2964
    check-cast v5, La/cgk0;

    .line 2965
    .line 2966
    check-cast v4, La/pz40;

    .line 2967
    .line 2968
    move-object/from16 v0, p1

    .line 2969
    .line 2970
    check-cast v0, La/abi0;

    .line 2971
    .line 2972
    sget-object v1, La/z31;->n2:La/jdk0;

    .line 2973
    .line 2974
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2975
    .line 2976
    .line 2977
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2978
    .line 2979
    .line 2980
    move-result-object v1

    .line 2981
    check-cast v1, Ljava/lang/Boolean;

    .line 2982
    .line 2983
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2984
    .line 2985
    .line 2986
    sget-object v2, La/etl;->c:La/zai0;

    .line 2987
    .line 2988
    sget-object v3, La/etl;->a:[La/iiy;

    .line 2989
    .line 2990
    const/16 v33, 0x1

    .line 2991
    .line 2992
    aget-object v3, v3, v33

    .line 2993
    .line 2994
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2995
    .line 2996
    .line 2997
    invoke-interface {v0, v2, v1}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 2998
    .line 2999
    .line 3000
    invoke-virtual {v5}, La/cgk0;->l()I

    .line 3001
    .line 3002
    .line 3003
    move-result v1

    .line 3004
    invoke-static {v0, v1}, La/etl;->g(La/abi0;I)V

    .line 3005
    .line 3006
    .line 3007
    sget-object v1, La/cbi0;->m:La/zai0;

    .line 3008
    .line 3009
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 3010
    .line 3011
    .line 3012
    move-result-object v2

    .line 3013
    check-cast v2, Ljava/lang/Boolean;

    .line 3014
    .line 3015
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3016
    .line 3017
    .line 3018
    invoke-interface {v0, v1, v2}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 3019
    .line 3020
    .line 3021
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3022
    .line 3023
    return-object v0

    .line 3024
    :pswitch_17
    check-cast v6, La/pp0;

    .line 3025
    .line 3026
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 3027
    .line 3028
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 3029
    .line 3030
    move-object/from16 v0, p1

    .line 3031
    .line 3032
    check-cast v0, La/hcz;

    .line 3033
    .line 3034
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3035
    .line 3036
    .line 3037
    sget-object v1, La/qmk;->a:La/zcl;

    .line 3038
    .line 3039
    const/high16 v1, 0x42900000    # 72.0f

    .line 3040
    .line 3041
    sget-object v2, La/jm40;->b:La/jm40;

    .line 3042
    .line 3043
    invoke-static {v2, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 3044
    .line 3045
    .line 3046
    move-result-object v1

    .line 3047
    const/high16 v2, 0x42600000    # 56.0f

    .line 3048
    .line 3049
    invoke-static {v1, v2}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 3050
    .line 3051
    .line 3052
    move-result-object v1

    .line 3053
    move-object v2, v6

    .line 3054
    check-cast v2, La/np0;

    .line 3055
    .line 3056
    iget-boolean v3, v2, La/np0;->b:Z

    .line 3057
    .line 3058
    if-eqz v3, :cond_5d

    .line 3059
    .line 3060
    new-instance v3, La/gp0;

    .line 3061
    .line 3062
    invoke-direct {v3, v6, v1, v5}, La/gp0;-><init>(La/pp0;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 3063
    .line 3064
    .line 3065
    new-instance v5, La/ugd;

    .line 3066
    .line 3067
    const v6, 0x5c442572

    .line 3068
    .line 3069
    .line 3070
    const/4 v7, 0x1

    .line 3071
    invoke-direct {v5, v6, v7, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 3072
    .line 3073
    .line 3074
    const/4 v11, 0x0

    .line 3075
    invoke-static {v0, v11, v11, v5, v13}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 3076
    .line 3077
    .line 3078
    goto :goto_3b

    .line 3079
    :cond_5d
    const/4 v7, 0x1

    .line 3080
    :goto_3b
    iget-object v2, v2, La/np0;->a:La/fyl;

    .line 3081
    .line 3082
    iget-object v2, v2, La/fyl;->a:La/a4x;

    .line 3083
    .line 3084
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 3085
    .line 3086
    .line 3087
    move-result v3

    .line 3088
    new-instance v5, La/b8;

    .line 3089
    .line 3090
    const/16 v6, 0xc

    .line 3091
    .line 3092
    invoke-direct {v5, v2, v6}, La/b8;-><init>(Ljava/util/List;B)V

    .line 3093
    .line 3094
    .line 3095
    new-instance v6, La/kp0;

    .line 3096
    .line 3097
    invoke-direct {v6, v2, v1, v4, v7}, La/kp0;-><init>(Ljava/util/List;La/mm40;Lkotlin/jvm/functions/Function1;B)V

    .line 3098
    .line 3099
    .line 3100
    new-instance v1, La/ugd;

    .line 3101
    .line 3102
    invoke-direct {v1, v12, v7, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 3103
    .line 3104
    .line 3105
    const/4 v11, 0x0

    .line 3106
    invoke-virtual {v0, v3, v11, v5, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 3107
    .line 3108
    .line 3109
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3110
    .line 3111
    return-object v0

    .line 3112
    :pswitch_18
    check-cast v6, La/on0;

    .line 3113
    .line 3114
    check-cast v5, La/d9z;

    .line 3115
    .line 3116
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 3117
    .line 3118
    move-object/from16 v0, p1

    .line 3119
    .line 3120
    check-cast v0, La/hcz;

    .line 3121
    .line 3122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3123
    .line 3124
    .line 3125
    check-cast v6, La/mn0;

    .line 3126
    .line 3127
    iget-object v1, v6, La/mn0;->a:La/a4x;

    .line 3128
    .line 3129
    new-instance v2, La/g20;

    .line 3130
    .line 3131
    const/16 v3, 0x11

    .line 3132
    .line 3133
    invoke-direct {v2, v3}, La/g20;-><init>(B)V

    .line 3134
    .line 3135
    .line 3136
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 3137
    .line 3138
    .line 3139
    move-result v3

    .line 3140
    new-instance v6, La/g5;

    .line 3141
    .line 3142
    const/16 v7, 0xe

    .line 3143
    .line 3144
    invoke-direct {v6, v2, v1, v7}, La/g5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 3145
    .line 3146
    .line 3147
    new-instance v2, La/wl0;

    .line 3148
    .line 3149
    const/4 v7, 0x0

    .line 3150
    invoke-direct {v2, v1, v7}, La/wl0;-><init>(La/a4x;B)V

    .line 3151
    .line 3152
    .line 3153
    new-instance v7, La/c8;

    .line 3154
    .line 3155
    const/4 v8, 0x4

    .line 3156
    invoke-direct {v7, v1, v5, v4, v8}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 3157
    .line 3158
    .line 3159
    new-instance v1, La/ugd;

    .line 3160
    .line 3161
    const v4, 0x799532c4

    .line 3162
    .line 3163
    .line 3164
    const/4 v5, 0x1

    .line 3165
    invoke-direct {v1, v4, v5, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 3166
    .line 3167
    .line 3168
    invoke-virtual {v0, v3, v6, v2, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 3169
    .line 3170
    .line 3171
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3172
    .line 3173
    return-object v0

    .line 3174
    :pswitch_19
    check-cast v6, La/kb0;

    .line 3175
    .line 3176
    check-cast v5, La/myr0;

    .line 3177
    .line 3178
    check-cast v4, Ljava/lang/String;

    .line 3179
    .line 3180
    move-object/from16 v0, p1

    .line 3181
    .line 3182
    check-cast v0, La/k0w0;

    .line 3183
    .line 3184
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3185
    .line 3186
    .line 3187
    new-instance v1, La/kk0;

    .line 3188
    .line 3189
    const/4 v3, 0x0

    .line 3190
    invoke-direct {v1, v6, v5, v4, v3}, La/kk0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 3191
    .line 3192
    .line 3193
    new-instance v2, La/a1w0;

    .line 3194
    .line 3195
    invoke-direct {v2, v1}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 3196
    .line 3197
    .line 3198
    invoke-virtual {v0, v2}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 3199
    .line 3200
    .line 3201
    move-result-object v0

    .line 3202
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 3203
    .line 3204
    check-cast v0, La/c8d;

    .line 3205
    .line 3206
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 3207
    .line 3208
    new-instance v2, La/v7d;

    .line 3209
    .line 3210
    const/4 v7, 0x1

    .line 3211
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 3212
    .line 3213
    .line 3214
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 3215
    .line 3216
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3217
    .line 3218
    return-object v0

    .line 3219
    :pswitch_1a
    move-object/from16 v35, v3

    .line 3220
    .line 3221
    move v3, v15

    .line 3222
    check-cast v6, La/oe0;

    .line 3223
    .line 3224
    check-cast v5, La/s5d0;

    .line 3225
    .line 3226
    check-cast v4, La/sff0;

    .line 3227
    .line 3228
    iget-object v0, v4, La/sff0;->b:La/hl1;

    .line 3229
    .line 3230
    move-object/from16 v1, p1

    .line 3231
    .line 3232
    check-cast v1, La/k0w0;

    .line 3233
    .line 3234
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3235
    .line 3236
    .line 3237
    iget-object v7, v6, La/oe0;->r:La/peg0;

    .line 3238
    .line 3239
    iget-object v2, v5, La/s5d0;->a:Ljava/lang/String;

    .line 3240
    .line 3241
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 3242
    .line 3243
    .line 3244
    move-result-wide v8

    .line 3245
    iget-object v10, v5, La/s5d0;->d:Ljava/lang/String;

    .line 3246
    .line 3247
    iget-object v11, v5, La/s5d0;->f:Ljava/util/List;

    .line 3248
    .line 3249
    iget-object v12, v5, La/s5d0;->g:Ljava/lang/String;

    .line 3250
    .line 3251
    iget-object v2, v5, La/s5d0;->e:La/gz8;

    .line 3252
    .line 3253
    sget-object v4, La/gz8;->b:La/gz8;

    .line 3254
    .line 3255
    if-eq v2, v4, :cond_5f

    .line 3256
    .line 3257
    iget-object v2, v0, La/hl1;->a:La/f61;

    .line 3258
    .line 3259
    iget-boolean v2, v2, La/f61;->k:Z

    .line 3260
    .line 3261
    if-eqz v2, :cond_5e

    .line 3262
    .line 3263
    goto :goto_3c

    .line 3264
    :cond_5e
    move v13, v3

    .line 3265
    goto :goto_3d

    .line 3266
    :cond_5f
    :goto_3c
    const/4 v13, 0x1

    .line 3267
    :goto_3d
    iget-object v15, v0, La/hl1;->x:La/vc0;

    .line 3268
    .line 3269
    iget-object v0, v5, La/s5d0;->i:Ljava/lang/String;

    .line 3270
    .line 3271
    if-nez v0, :cond_60

    .line 3272
    .line 3273
    move-object/from16 v16, v35

    .line 3274
    .line 3275
    goto :goto_3e

    .line 3276
    :cond_60
    move-object/from16 v16, v0

    .line 3277
    .line 3278
    :goto_3e
    const/4 v14, 0x1

    .line 3279
    invoke-virtual/range {v7 .. v16}, La/peg0;->j(JLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZZLa/vc0;Ljava/lang/String;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandGamesFragmentScreen;

    .line 3280
    .line 3281
    .line 3282
    move-result-object v0

    .line 3283
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 3284
    .line 3285
    .line 3286
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3287
    .line 3288
    return-object v0

    .line 3289
    :pswitch_1b
    move-object v11, v14

    .line 3290
    check-cast v6, La/vq;

    .line 3291
    .line 3292
    check-cast v5, La/ms2;

    .line 3293
    .line 3294
    check-cast v4, La/xdr;

    .line 3295
    .line 3296
    move-object/from16 v0, p1

    .line 3297
    .line 3298
    check-cast v0, La/nre;

    .line 3299
    .line 3300
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3301
    .line 3302
    .line 3303
    iget-object v1, v0, La/nre;->a:La/hwe;

    .line 3304
    .line 3305
    iget-object v2, v0, La/nre;->b:La/zxj0;

    .line 3306
    .line 3307
    iget-object v0, v0, La/nre;->c:La/m0k0;

    .line 3308
    .line 3309
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 3310
    .line 3311
    .line 3312
    move-result v3

    .line 3313
    if-eqz v3, :cond_62

    .line 3314
    .line 3315
    const/4 v7, 0x1

    .line 3316
    if-ne v3, v7, :cond_61

    .line 3317
    .line 3318
    sget-object v3, La/aao;->b:La/aao;

    .line 3319
    .line 3320
    goto :goto_3f

    .line 3321
    :cond_61
    invoke-static {}, La/t9f;->b()V

    .line 3322
    .line 3323
    .line 3324
    move-object v14, v11

    .line 3325
    goto :goto_40

    .line 3326
    :cond_62
    sget-object v3, La/aao;->a:La/aao;

    .line 3327
    .line 3328
    :goto_3f
    invoke-virtual {v6, v5, v3}, La/vq;->g(La/ms2;La/aao;)V

    .line 3329
    .line 3330
    .line 3331
    invoke-interface {v4, v1, v2, v0}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3332
    .line 3333
    .line 3334
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3335
    .line 3336
    :goto_40
    return-object v14

    .line 3337
    :pswitch_1c
    move-object v2, v6

    .line 3338
    check-cast v2, La/ctf0;

    .line 3339
    .line 3340
    move-object v3, v5

    .line 3341
    check-cast v3, La/g2v;

    .line 3342
    .line 3343
    check-cast v4, Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;

    .line 3344
    .line 3345
    move-object/from16 v1, p1

    .line 3346
    .line 3347
    check-cast v1, La/ln;

    .line 3348
    .line 3349
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3350
    .line 3351
    .line 3352
    new-instance v0, La/kn;

    .line 3353
    .line 3354
    iget-wide v4, v4, Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;->a:J

    .line 3355
    .line 3356
    invoke-direct/range {v0 .. v5}, La/kn;-><init>(La/ln;La/ctf0;La/g2v;J)V

    .line 3357
    .line 3358
    .line 3359
    return-object v0

    .line 3360
    nop

    .line 3361
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
