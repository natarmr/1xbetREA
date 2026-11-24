.class public final La/sjl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:F

.field public final synthetic c:B


# direct methods
.method public constructor <init>(FFI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/sjl;->a:F

    .line 5
    .line 6
    iput p2, p0, La/sjl;->b:F

    .line 7
    .line 8
    iput-byte p3, p0, La/sjl;->c:B

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 17

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
    iget v2, v0, La/sjl;->a:F

    .line 9
    .line 10
    invoke-interface {v1, v2}, La/w6k;->T(F)I

    .line 11
    .line 12
    .line 13
    move-result v7

    .line 14
    iget v2, v0, La/sjl;->b:F

    .line 15
    .line 16
    invoke-interface {v1, v2}, La/w6k;->T(F)I

    .line 17
    .line 18
    .line 19
    move-result v9

    .line 20
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget-byte v3, v0, La/sjl;->c:B

    .line 25
    .line 26
    add-int/lit8 v4, v3, -0x1

    .line 27
    .line 28
    mul-int/2addr v4, v7

    .line 29
    sub-int/2addr v2, v4

    .line 30
    div-int v12, v2, v3

    .line 31
    .line 32
    new-instance v4, Ljava/util/ArrayList;

    .line 33
    .line 34
    const/16 v2, 0xa

    .line 35
    .line 36
    move-object/from16 v5, p2

    .line 37
    .line 38
    invoke-static {v5, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, La/pj30;

    .line 60
    .line 61
    const/4 v15, 0x0

    .line 62
    const/16 v16, 0xc

    .line 63
    .line 64
    const/4 v14, 0x0

    .line 65
    move v13, v12

    .line 66
    move-wide/from16 v10, p3

    .line 67
    .line 68
    invoke-static/range {v10 .. v16}, La/p4e;->b(JIIIII)J

    .line 69
    .line 70
    .line 71
    move-result-wide v13

    .line 72
    invoke-interface {v5, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    add-int/2addr v2, v3

    .line 85
    const/4 v5, 0x1

    .line 86
    sub-int/2addr v2, v5

    .line 87
    div-int/2addr v2, v3

    .line 88
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-nez v6, :cond_1

    .line 97
    .line 98
    const/4 v3, 0x0

    .line 99
    goto :goto_2

    .line 100
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    check-cast v6, La/pu90;

    .line 105
    .line 106
    iget v6, v6, La/pu90;->b:I

    .line 107
    .line 108
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    if-eqz v8, :cond_3

    .line 117
    .line 118
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    check-cast v8, La/pu90;

    .line 123
    .line 124
    iget v8, v8, La/pu90;->b:I

    .line 125
    .line 126
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-virtual {v6, v8}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    if-gez v10, :cond_2

    .line 135
    .line 136
    move-object v6, v8

    .line 137
    goto :goto_1

    .line 138
    :cond_3
    move-object v3, v6

    .line 139
    :goto_2
    if-eqz v3, :cond_4

    .line 140
    .line 141
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    :goto_3
    move v8, v3

    .line 146
    goto :goto_4

    .line 147
    :cond_4
    const/4 v3, 0x0

    .line 148
    goto :goto_3

    .line 149
    :goto_4
    mul-int v3, v2, v8

    .line 150
    .line 151
    invoke-static {v2, v5, v9, v3}, La/twn;->b(IIII)I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    new-instance v3, La/rjl;

    .line 160
    .line 161
    iget-byte v5, v0, La/sjl;->c:B

    .line 162
    .line 163
    move v6, v12

    .line 164
    invoke-direct/range {v3 .. v9}, La/rjl;-><init>(Ljava/util/ArrayList;IIIII)V

    .line 165
    .line 166
    .line 167
    invoke-static {v1, v10, v2, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    return-object v0
.end method
