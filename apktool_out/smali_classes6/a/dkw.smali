.class public final La/dkw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:La/l7m0;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:F


# direct methods
.method public constructor <init>(ZLa/l7m0;FFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/dkw;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, La/dkw;->b:La/l7m0;

    .line 7
    .line 8
    iput p3, p0, La/dkw;->c:F

    .line 9
    .line 10
    iput p4, p0, La/dkw;->d:F

    .line 11
    .line 12
    iput p5, p0, La/dkw;->e:F

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-boolean v2, v0, La/dkw;->a:Z

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-object v2, v0, La/dkw;->b:La/l7m0;

    .line 13
    .line 14
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x0

    .line 26
    :goto_0
    iget v3, v0, La/dkw;->c:F

    .line 27
    .line 28
    iget v4, v0, La/dkw;->d:F

    .line 29
    .line 30
    invoke-static {v3, v4, v2}, La/l7x;->O(FFF)F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-interface {v1, v2}, La/w6k;->T(F)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    iget v0, v0, La/dkw;->e:F

    .line 39
    .line 40
    invoke-interface {v1, v0}, La/w6k;->T(F)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int v12, v0, v7

    .line 45
    .line 46
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/4 v3, 0x0

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    move-object v4, v2

    .line 62
    check-cast v4, La/pj30;

    .line 63
    .line 64
    invoke-static {v4}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    sget-object v5, La/jwq0;->a:La/jwq0;

    .line 69
    .line 70
    if-ne v4, v5, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move-object v2, v3

    .line 74
    :goto_1
    check-cast v2, La/pj30;

    .line 75
    .line 76
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_4

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    move-object v5, v4

    .line 91
    check-cast v5, La/pj30;

    .line 92
    .line 93
    invoke-static {v5}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    sget-object v6, La/jwq0;->b:La/jwq0;

    .line 98
    .line 99
    if-ne v5, v6, :cond_3

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    move-object v4, v3

    .line 103
    :goto_2
    check-cast v4, La/pj30;

    .line 104
    .line 105
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_6

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    move-object v6, v5

    .line 120
    check-cast v6, La/pj30;

    .line 121
    .line 122
    invoke-static {v6}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    sget-object v8, La/jwq0;->c:La/jwq0;

    .line 127
    .line 128
    if-ne v6, v8, :cond_5

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    move-object v5, v3

    .line 132
    :goto_3
    check-cast v5, La/pj30;

    .line 133
    .line 134
    if-eqz v2, :cond_7

    .line 135
    .line 136
    const/4 v11, 0x0

    .line 137
    const/4 v14, 0x3

    .line 138
    const/4 v10, 0x0

    .line 139
    move v13, v12

    .line 140
    move-wide/from16 v8, p3

    .line 141
    .line 142
    invoke-static/range {v8 .. v14}, La/p4e;->b(JIIIII)J

    .line 143
    .line 144
    .line 145
    move-result-wide v10

    .line 146
    invoke-interface {v2, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    goto :goto_4

    .line 151
    :cond_7
    move-object v0, v3

    .line 152
    :goto_4
    move-wide/from16 v13, p3

    .line 153
    .line 154
    if-eqz v4, :cond_8

    .line 155
    .line 156
    invoke-interface {v4, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    goto :goto_5

    .line 161
    :cond_8
    move-object v2, v3

    .line 162
    :goto_5
    if-eqz v5, :cond_9

    .line 163
    .line 164
    sget-object v3, La/qmk;->a:La/zcl;

    .line 165
    .line 166
    const/high16 v3, 0x43700000    # 240.0f

    .line 167
    .line 168
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 169
    .line 170
    .line 171
    move-result v18

    .line 172
    const/16 v19, 0x3

    .line 173
    .line 174
    const/4 v15, 0x0

    .line 175
    const/16 v16, 0x0

    .line 176
    .line 177
    const/16 v17, 0x0

    .line 178
    .line 179
    invoke-static/range {v13 .. v19}, La/p4e;->b(JIIIII)J

    .line 180
    .line 181
    .line 182
    move-result-wide v3

    .line 183
    invoke-interface {v5, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    :cond_9
    move-object v6, v3

    .line 188
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    new-instance v3, La/ec3;

    .line 193
    .line 194
    const/16 v8, 0x8

    .line 195
    .line 196
    move-object v4, v0

    .line 197
    move-object v5, v2

    .line 198
    invoke-direct/range {v3 .. v8}, La/ec3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 199
    .line 200
    .line 201
    invoke-static {v1, v9, v12, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    return-object v0
.end method
