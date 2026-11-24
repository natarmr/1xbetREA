.class public final La/a930;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/a930;

.field public static final b:La/uw3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/a930;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/a930;->a:La/a930;

    .line 7
    .line 8
    sget-object v0, La/mcy;->Companion:La/lcy;

    .line 9
    .line 10
    invoke-virtual {v0}, La/lcy;->serializer()La/jiy;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, La/mrv;->K(La/jiy;)La/zw3;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, La/zw3;->c:La/ud00;

    .line 19
    .line 20
    check-cast v0, La/uw3;

    .line 21
    .line 22
    sput-object v0, La/a930;->b:La/uw3;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of p0, p1, La/icy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    check-cast p1, La/icy;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v0

    .line 10
    :goto_0
    if-eqz p1, :cond_f

    .line 11
    .line 12
    invoke-interface {p1}, La/icy;->g()La/mcy;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    instance-of v1, p0, La/yby;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    check-cast p0, La/yby;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object p0, v0

    .line 24
    :goto_1
    if-nez p0, :cond_2

    .line 25
    .line 26
    sget-object p0, La/iun;->a:La/iun;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, La/yby;->a:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_e

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, La/mcy;

    .line 51
    .line 52
    instance-of v3, v2, La/edy;

    .line 53
    .line 54
    if-eqz v3, :cond_4

    .line 55
    .line 56
    check-cast v2, La/edy;

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_4
    move-object v2, v0

    .line 60
    :goto_3
    if-nez v2, :cond_6

    .line 61
    .line 62
    :cond_5
    :goto_4
    move-object v2, v0

    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    :cond_6
    const-string v3, "$type"

    .line 66
    .line 67
    invoke-virtual {v2, v3}, La/edy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, La/mcy;

    .line 72
    .line 73
    if-eqz v3, :cond_7

    .line 74
    .line 75
    invoke-static {v3}, La/ncy;->j(La/mcy;)La/jdy;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, La/jdy;->b()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    goto :goto_5

    .line 84
    :cond_7
    move-object v3, v0

    .line 85
    :goto_5
    if-eqz v3, :cond_5

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    const v5, 0x1e6438c0

    .line 92
    .line 93
    .line 94
    if-eq v4, v5, :cond_c

    .line 95
    .line 96
    const v5, 0x742fc96e

    .line 97
    .line 98
    .line 99
    if-eq v4, v5, :cond_a

    .line 100
    .line 101
    const v5, 0x7ef51eab

    .line 102
    .line 103
    .line 104
    if-eq v4, v5, :cond_8

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_8
    const-string v4, "orderedList"

    .line 108
    .line 109
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-nez v3, :cond_9

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_9
    invoke-interface {p1}, La/icy;->d()La/vby;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    sget-object v4, La/v830;->Companion:La/u830;

    .line 124
    .line 125
    invoke-virtual {v4}, La/u830;->serializer()La/jiy;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, La/jiy;

    .line 130
    .line 131
    invoke-virtual {v3, v4, v2}, La/vby;->a(La/jiy;La/mcy;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, La/z830;

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_a
    const-string v4, "paragraph"

    .line 139
    .line 140
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-nez v3, :cond_b

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_b
    invoke-interface {p1}, La/icy;->d()La/vby;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    sget-object v4, La/y830;->Companion:La/x830;

    .line 155
    .line 156
    invoke-virtual {v4}, La/x830;->serializer()La/jiy;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, La/jiy;

    .line 161
    .line 162
    invoke-virtual {v3, v4, v2}, La/vby;->a(La/jiy;La/mcy;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    check-cast v2, La/z830;

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_c
    const-string v4, "bulletList"

    .line 170
    .line 171
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-nez v3, :cond_d

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_d
    invoke-interface {p1}, La/icy;->d()La/vby;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    sget-object v4, La/s830;->Companion:La/r830;

    .line 186
    .line 187
    invoke-virtual {v4}, La/r830;->serializer()La/jiy;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    check-cast v4, La/jiy;

    .line 192
    .line 193
    invoke-virtual {v3, v4, v2}, La/vby;->a(La/jiy;La/mcy;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    check-cast v2, La/z830;

    .line 198
    .line 199
    :goto_6
    if-eqz v2, :cond_3

    .line 200
    .line 201
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto/16 :goto_2

    .line 205
    .line 206
    :cond_e
    return-object v1

    .line 207
    :cond_f
    const-string p0, "Expected JSON"

    .line 208
    .line 209
    invoke-static {p0}, La/v4i0;->n(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    return-object v0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/a930;->b:La/uw3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method
