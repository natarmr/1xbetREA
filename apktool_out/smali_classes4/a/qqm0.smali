.class public final La/qqm0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/util/List;

.field public j:Ljava/util/ArrayList;

.field public k:B

.field public final synthetic l:La/rqm0;

.field public final synthetic m:Ljava/util/List;


# direct methods
.method public constructor <init>(La/rqm0;Ljava/util/List;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qqm0;->l:La/rqm0;

    .line 2
    .line 3
    iput-object p2, p0, La/qqm0;->m:Ljava/util/List;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance p1, La/qqm0;

    .line 2
    .line 3
    iget-object v0, p0, La/qqm0;->l:La/rqm0;

    .line 4
    .line 5
    iget-object p0, p0, La/qqm0;->m:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/qqm0;-><init>(La/rqm0;Ljava/util/List;La/yje;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/qqm0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/qqm0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/qqm0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/qqm0;->k:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/qqm0;->l:La/rqm0;

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, La/qqm0;->j:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object p0, p0, La/qqm0;->i:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :cond_1
    iget-object v1, p0, La/qqm0;->i:Ljava/util/List;

    .line 32
    .line 33
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object v10, p0

    .line 37
    move-object p0, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, v4, La/rqm0;->l:La/rpt;

    .line 43
    .line 44
    iget-object p1, p1, La/rpt;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, La/dih;

    .line 47
    .line 48
    iget-object p1, p1, La/dih;->a:La/cih;

    .line 49
    .line 50
    iget-object p1, p1, La/cih;->a:La/q7d0;

    .line 51
    .line 52
    sget-object v1, La/xun;->a:La/xun;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const-string v5, "CYBER_PROMO_IDS"

    .line 65
    .line 66
    invoke-interface {p1, v5, v1}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-nez p1, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move-object v1, p1

    .line 74
    :goto_0
    check-cast v1, Ljava/lang/Iterable;

    .line 75
    .line 76
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object v5, v4, La/rqm0;->o:La/q8u;

    .line 81
    .line 82
    iput-object p1, p0, La/qqm0;->i:Ljava/util/List;

    .line 83
    .line 84
    iput-byte v3, p0, La/qqm0;->k:B

    .line 85
    .line 86
    iget-object v6, p0, La/qqm0;->m:Ljava/util/List;

    .line 87
    .line 88
    const/4 v7, 0x1

    .line 89
    const-wide v8, 0x7fffffffffffffffL

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    move-object v10, p0

    .line 95
    invoke-virtual/range {v5 .. v10}, La/q8u;->a(Ljava/util/List;ZJLa/zje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-ne p0, v0, :cond_4

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    move-object v11, p1

    .line 103
    move-object p1, p0

    .line 104
    move-object p0, v11

    .line 105
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    .line 106
    .line 107
    new-instance v1, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_8

    .line 121
    .line 122
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    move-object v5, v3

    .line 127
    check-cast v5, La/uog;

    .line 128
    .line 129
    iget-object v5, v5, La/uog;->p:Ljava/util/List;

    .line 130
    .line 131
    if-eqz v5, :cond_6

    .line 132
    .line 133
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    if-eqz v6, :cond_6

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_6
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    if-eqz v6, :cond_5

    .line 149
    .line 150
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    check-cast v6, Ljava/lang/Number;

    .line 155
    .line 156
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    iget-object v7, v10, La/qqm0;->m:Ljava/util/List;

    .line 161
    .line 162
    invoke-static {v6, v7}, La/rz4;->C(ILjava/util/List;)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-eqz v6, :cond_7

    .line 167
    .line 168
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_8
    iget-object p1, v4, La/rqm0;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 173
    .line 174
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 175
    .line 176
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_a

    .line 181
    .line 182
    iget-object p1, v4, La/rqm0;->p:La/cyg0;

    .line 183
    .line 184
    iput-object p0, v10, La/qqm0;->i:Ljava/util/List;

    .line 185
    .line 186
    iput-object v1, v10, La/qqm0;->j:Ljava/util/ArrayList;

    .line 187
    .line 188
    iput-byte v2, v10, La/qqm0;->k:B

    .line 189
    .line 190
    iget-object p1, p1, La/cyg0;->a:La/b2g;

    .line 191
    .line 192
    iget-object p1, p1, La/b2g;->a:La/ehf0;

    .line 193
    .line 194
    iget-object p1, p1, La/ehf0;->c:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p1, La/or30;

    .line 197
    .line 198
    invoke-virtual {p1, v1}, La/or30;->d(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    sget-object v2, La/wne;->a:La/wne;

    .line 204
    .line 205
    if-ne p1, v0, :cond_9

    .line 206
    .line 207
    :goto_3
    return-object v0

    .line 208
    :cond_9
    move-object v0, v1

    .line 209
    :goto_4
    move-object v1, v0

    .line 210
    :cond_a
    invoke-static {v1, p0}, La/dqm0;->G(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-virtual {v4, p0}, La/rqm0;->y(Ljava/util/ArrayList;)V

    .line 215
    .line 216
    .line 217
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    return-object p0
.end method
