.class public final La/f3u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/img;

.field public final b:La/sjl0;


# direct methods
.method public constructor <init>(La/img;La/sjl0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/f3u;->a:La/img;

    .line 8
    .line 9
    iput-object p2, p0, La/f3u;->b:La/sjl0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(ILa/zje;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v2, La/e3u;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v2

    .line 14
    check-cast v4, La/e3u;

    .line 15
    .line 16
    iget v5, v4, La/e3u;->m:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, La/e3u;->m:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, La/e3u;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2}, La/e3u;-><init>(La/f3u;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v2, v4, La/e3u;->k:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v6, v4, La/e3u;->m:I

    .line 38
    .line 39
    const/4 v7, 0x2

    .line 40
    const/4 v8, 0x1

    .line 41
    if-eqz v6, :cond_3

    .line 42
    .line 43
    if-eq v6, v8, :cond_2

    .line 44
    .line 45
    if-ne v6, v7, :cond_1

    .line 46
    .line 47
    iget v1, v4, La/e3u;->j:I

    .line 48
    .line 49
    iget-object v3, v4, La/e3u;->i:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 50
    .line 51
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    return-object v0

    .line 62
    :cond_2
    iget v1, v4, La/e3u;->j:I

    .line 63
    .line 64
    iget-object v3, v4, La/e3u;->i:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 65
    .line 66
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 74
    .line 75
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    iget-object v6, v0, La/f3u;->b:La/sjl0;

    .line 80
    .line 81
    if-eqz v2, :cond_5

    .line 82
    .line 83
    iput-object v3, v4, La/e3u;->i:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 84
    .line 85
    iput v1, v4, La/e3u;->j:I

    .line 86
    .line 87
    iput v8, v4, La/e3u;->m:I

    .line 88
    .line 89
    invoke-virtual {v6, v4}, La/sjl0;->b(La/zje;)Ljava/io/Serializable;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    if-ne v2, v5, :cond_4

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    :goto_1
    check-cast v2, Ljava/util/List;

    .line 97
    .line 98
    :goto_2
    move v12, v1

    .line 99
    move-object v11, v3

    .line 100
    goto :goto_5

    .line 101
    :cond_5
    iput-object v3, v4, La/e3u;->i:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 102
    .line 103
    iput v1, v4, La/e3u;->j:I

    .line 104
    .line 105
    iput v7, v4, La/e3u;->m:I

    .line 106
    .line 107
    invoke-virtual {v6, v4}, La/sjl0;->g(La/zje;)Ljava/io/Serializable;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-ne v2, v5, :cond_6

    .line 112
    .line 113
    :goto_3
    return-object v5

    .line 114
    :cond_6
    :goto_4
    check-cast v2, Ljava/util/List;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :goto_5
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v10, v0, La/f3u;->a:La/img;

    .line 121
    .line 122
    iget-object v0, v10, La/img;->b:La/laj;

    .line 123
    .line 124
    iget-object v0, v0, La/laj;->a:Ljava/util/LinkedHashMap;

    .line 125
    .line 126
    invoke-virtual {v0, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-nez v1, :cond_7

    .line 131
    .line 132
    new-instance v1, La/or30;

    .line 133
    .line 134
    invoke-direct {v1}, La/or30;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-interface {v0, v11, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    :cond_7
    check-cast v1, La/or30;

    .line 141
    .line 142
    sget-wide v3, La/img;->d:J

    .line 143
    .line 144
    new-instance v17, La/gc4;

    .line 145
    .line 146
    const/4 v14, 0x3

    .line 147
    const/4 v13, 0x0

    .line 148
    move-object/from16 v9, v17

    .line 149
    .line 150
    invoke-direct/range {v9 .. v14}, La/gc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILa/yje;B)V

    .line 151
    .line 152
    .line 153
    move-object v0, v13

    .line 154
    const/16 v18, 0xfc

    .line 155
    .line 156
    const/16 v16, 0x0

    .line 157
    .line 158
    move-object v13, v1

    .line 159
    move-wide v14, v3

    .line 160
    invoke-static/range {v13 .. v18}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    new-instance v3, La/g8g;

    .line 165
    .line 166
    const/16 v4, 0x9

    .line 167
    .line 168
    invoke-direct {v3, v10, v11, v0, v4}, La/g8g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 169
    .line 170
    .line 171
    new-instance v0, La/fnq;

    .line 172
    .line 173
    invoke-direct {v0, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 174
    .line 175
    .line 176
    new-instance v1, La/ewt;

    .line 177
    .line 178
    invoke-direct {v1, v0, v2, v8}, La/ewt;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 179
    .line 180
    .line 181
    return-object v1
.end method
