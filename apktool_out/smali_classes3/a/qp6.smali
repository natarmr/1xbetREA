.class public final synthetic La/qp6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vp6;

.field public final synthetic c:La/jg7;


# direct methods
.method public synthetic constructor <init>(La/vp6;La/jg7;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qp6;->a:B

    iput-object p1, p0, La/qp6;->b:La/vp6;

    iput-object p2, p0, La/qp6;->c:La/jg7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qp6;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/qp6;->c:La/jg7;

    .line 6
    .line 7
    iget-object v0, v0, La/qp6;->b:La/vp6;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/vp6;->C:La/yk50;

    .line 13
    .line 14
    invoke-virtual {v1}, La/yk50;->g()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-wide v1, v2, La/jg7;->b:J

    .line 22
    .line 23
    invoke-virtual {v0, v3, v1, v2}, La/vp6;->P(ZJ)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v1, La/bp6;

    .line 28
    .line 29
    iget-object v2, v0, La/vp6;->T:La/lk5;

    .line 30
    .line 31
    sget-object v4, La/j820;->e:La/j820;

    .line 32
    .line 33
    invoke-virtual {v2, v4}, La/lk5;->c(La/j820;)La/ua20;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sget-object v4, La/ua20;->b:La/ua20;

    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    if-eq v2, v4, :cond_1

    .line 41
    .line 42
    move v2, v5

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move v2, v3

    .line 45
    :goto_0
    iget-object v4, v0, La/vp6;->G:La/lbu;

    .line 46
    .line 47
    invoke-virtual {v4}, La/lbu;->j()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-nez v4, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, La/jp6;

    .line 58
    .line 59
    iget-boolean v4, v4, La/jp6;->u:Z

    .line 60
    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    move v3, v5

    .line 64
    :cond_2
    invoke-direct {v1, v2, v3}, La/bp6;-><init>(ZZ)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :goto_1
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 71
    .line 72
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 73
    .line 74
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 82
    .line 83
    move-object v4, v2

    .line 84
    check-cast v4, La/jp6;

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const v23, 0x1f7fff

    .line 92
    .line 93
    .line 94
    const/4 v5, 0x0

    .line 95
    const/4 v6, 0x0

    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    const/4 v9, 0x0

    .line 99
    const/4 v10, 0x0

    .line 100
    const/4 v11, 0x0

    .line 101
    const/4 v12, 0x0

    .line 102
    const/4 v13, 0x0

    .line 103
    const/4 v14, 0x0

    .line 104
    const/4 v15, 0x0

    .line 105
    const/16 v16, 0x0

    .line 106
    .line 107
    const/16 v17, 0x0

    .line 108
    .line 109
    const/16 v18, 0x0

    .line 110
    .line 111
    const/16 v19, 0x0

    .line 112
    .line 113
    const/16 v20, 0x0

    .line 114
    .line 115
    const/16 v21, 0x0

    .line 116
    .line 117
    invoke-static/range {v4 .. v23}, La/jp6;->a(La/jp6;ZZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/LinkedHashSet;Ljava/util/List;ZLjava/util/Map;ZZZLa/jg7;ZLjava/lang/Long;ZI)La/jp6;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_3

    .line 126
    .line 127
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_0
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 131
    .line 132
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 133
    .line 134
    :cond_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 142
    .line 143
    move-object v5, v3

    .line 144
    check-cast v5, La/jp6;

    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    const/16 v23, 0x0

    .line 150
    .line 151
    const v24, 0x1f7fff

    .line 152
    .line 153
    .line 154
    const/4 v6, 0x0

    .line 155
    const/4 v7, 0x0

    .line 156
    const/4 v8, 0x0

    .line 157
    const/4 v9, 0x0

    .line 158
    const/4 v10, 0x0

    .line 159
    const/4 v11, 0x0

    .line 160
    const/4 v12, 0x0

    .line 161
    const/4 v13, 0x0

    .line 162
    const/4 v14, 0x0

    .line 163
    const/4 v15, 0x0

    .line 164
    const/16 v16, 0x0

    .line 165
    .line 166
    const/16 v17, 0x0

    .line 167
    .line 168
    const/16 v18, 0x0

    .line 169
    .line 170
    const/16 v19, 0x0

    .line 171
    .line 172
    const/16 v20, 0x0

    .line 173
    .line 174
    const/16 v21, 0x1

    .line 175
    .line 176
    const/16 v22, 0x0

    .line 177
    .line 178
    invoke-static/range {v5 .. v24}, La/jp6;->a(La/jp6;ZZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/LinkedHashSet;Ljava/util/List;ZLjava/util/Map;ZZZLa/jg7;ZLjava/lang/Long;ZI)La/jp6;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v1, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-eqz v3, :cond_4

    .line 187
    .line 188
    iget-object v1, v0, La/vp6;->O:La/i1w0;

    .line 189
    .line 190
    new-instance v3, La/qo5;

    .line 191
    .line 192
    const/16 v4, 0x12

    .line 193
    .line 194
    invoke-direct {v3, v0, v2, v4}, La/qo5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 198
    .line 199
    .line 200
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object v0

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
