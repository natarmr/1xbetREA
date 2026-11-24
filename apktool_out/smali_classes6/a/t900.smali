.class public final La/t900;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:La/a4x;

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:F


# direct methods
.method public constructor <init>(La/a4x;FFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/t900;->a:La/a4x;

    .line 5
    .line 6
    iput p2, p0, La/t900;->b:F

    .line 7
    .line 8
    iput p3, p0, La/t900;->c:F

    .line 9
    .line 10
    iput p4, p0, La/t900;->d:F

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 14

    .line 1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/t900;->a:La/a4x;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, La/a4x;

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, La/a4x;

    .line 43
    .line 44
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-gez v4, :cond_1

    .line 57
    .line 58
    move-object v2, v3

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move-object v1, v2

    .line 61
    :goto_1
    const/4 v2, 0x1

    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move v1, v2

    .line 70
    :goto_2
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    int-to-float v3, v3

    .line 75
    iget v4, p0, La/t900;->b:F

    .line 76
    .line 77
    sub-float/2addr v3, v4

    .line 78
    add-int/lit8 v4, v1, -0x1

    .line 79
    .line 80
    int-to-float v4, v4

    .line 81
    iget v5, p0, La/t900;->c:F

    .line 82
    .line 83
    mul-float/2addr v4, v5

    .line 84
    sub-float/2addr v3, v4

    .line 85
    int-to-float v1, v1

    .line 86
    div-float/2addr v3, v1

    .line 87
    iget v1, p0, La/t900;->d:F

    .line 88
    .line 89
    cmpl-float v4, v3, v1

    .line 90
    .line 91
    if-lez v4, :cond_4

    .line 92
    .line 93
    move v8, v1

    .line 94
    goto :goto_3

    .line 95
    :cond_4
    move v8, v3

    .line 96
    :goto_3
    float-to-int v1, v8

    .line 97
    if-ltz v1, :cond_5

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_5
    const-string v3, "width must be >= 0"

    .line 101
    .line 102
    invoke-static {v3}, La/zcx;->a(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :goto_4
    const v3, 0x7fffffff

    .line 106
    .line 107
    .line 108
    const/4 v4, 0x0

    .line 109
    invoke-static {v1, v1, v4, v3}, La/r4e;->h(IIII)J

    .line 110
    .line 111
    .line 112
    move-result-wide v6

    .line 113
    new-instance v13, Ljava/util/ArrayList;

    .line 114
    .line 115
    const/16 v1, 0xa

    .line 116
    .line 117
    move-object/from16 v3, p2

    .line 118
    .line 119
    invoke-static {v3, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_6

    .line 135
    .line 136
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    check-cast v3, La/pj30;

    .line 141
    .line 142
    invoke-interface {v3, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_6
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    check-cast v1, La/pu90;

    .line 155
    .line 156
    if-eqz v1, :cond_7

    .line 157
    .line 158
    iget v4, v1, La/pu90;->b:I

    .line 159
    .line 160
    :cond_7
    move v12, v4

    .line 161
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    mul-int/2addr v1, v12

    .line 166
    int-to-float v1, v1

    .line 167
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    sub-int/2addr v0, v2

    .line 172
    int-to-float v0, v0

    .line 173
    mul-float/2addr v5, v0

    .line 174
    add-float/2addr v5, v1

    .line 175
    const/4 v0, 0x0

    .line 176
    cmpg-float v1, v5, v0

    .line 177
    .line 178
    if-gez v1, :cond_8

    .line 179
    .line 180
    move v5, v0

    .line 181
    :cond_8
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    float-to-int v1, v5

    .line 186
    new-instance v6, La/s900;

    .line 187
    .line 188
    iget-object v7, p0, La/t900;->a:La/a4x;

    .line 189
    .line 190
    iget v9, p0, La/t900;->c:F

    .line 191
    .line 192
    move-wide/from16 v10, p3

    .line 193
    .line 194
    invoke-direct/range {v6 .. v13}, La/s900;-><init>(La/a4x;FFJILjava/util/ArrayList;)V

    .line 195
    .line 196
    .line 197
    invoke-static {p1, v0, v1, v6}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    return-object p0
.end method
