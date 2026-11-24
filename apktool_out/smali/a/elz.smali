.class public final synthetic La/elz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/glz;

.field public final synthetic c:La/clz;


# direct methods
.method public synthetic constructor <init>(La/glz;La/clz;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/elz;->a:B

    iput-object p1, p0, La/elz;->b:La/glz;

    iput-object p2, p0, La/elz;->c:La/clz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/elz;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    iget-object v3, p0, La/elz;->c:La/clz;

    .line 6
    .line 7
    iget-object p0, p0, La/elz;->b:La/glz;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    check-cast p1, Ljava/util/Map$Entry;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, La/blz;

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, La/flz;

    .line 29
    .line 30
    :goto_0
    iget-object v5, p1, La/flz;->a:La/lkz;

    .line 31
    .line 32
    iget-object v6, p0, La/glz;->i:La/lkz;

    .line 33
    .line 34
    iget-object v7, p0, La/glz;->h:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-gez v5, :cond_4

    .line 41
    .line 42
    iget-boolean v5, p0, La/glz;->g:Z

    .line 43
    .line 44
    if-nez v5, :cond_4

    .line 45
    .line 46
    iget-object v5, p0, La/glz;->c:La/cu;

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object v5, v5, La/cu;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v5, La/hz40;

    .line 57
    .line 58
    invoke-virtual {v5, v0}, La/hz40;->c(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_4

    .line 63
    .line 64
    iget-object v5, p1, La/flz;->a:La/lkz;

    .line 65
    .line 66
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    sget-object v5, La/kkz;->Companion:La/ikz;

    .line 70
    .line 71
    iget-object v6, p1, La/flz;->a:La/lkz;

    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    const/4 v6, 0x1

    .line 84
    if-eq v5, v6, :cond_2

    .line 85
    .line 86
    if-eq v5, v2, :cond_1

    .line 87
    .line 88
    if-eq v5, v1, :cond_0

    .line 89
    .line 90
    move-object v5, v4

    .line 91
    goto :goto_1

    .line 92
    :cond_0
    sget-object v5, La/kkz;->ON_RESUME:La/kkz;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    sget-object v5, La/kkz;->ON_START:La/kkz;

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    sget-object v5, La/kkz;->ON_CREATE:La/kkz;

    .line 99
    .line 100
    :goto_1
    if-eqz v5, :cond_3

    .line 101
    .line 102
    invoke-virtual {p1, v3, v5}, La/flz;->a(La/clz;La/kkz;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v7}, La/w3d;->A(Ljava/util/List;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    iget-object p0, p1, La/flz;->a:La/lkz;

    .line 110
    .line 111
    const-string p1, "no event up from "

    .line 112
    .line 113
    invoke-static {p0, p1}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    :goto_2
    return-object v4

    .line 120
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, La/blz;

    .line 128
    .line 129
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, La/flz;

    .line 134
    .line 135
    :goto_3
    iget-object v5, p1, La/flz;->a:La/lkz;

    .line 136
    .line 137
    iget-object v6, p0, La/glz;->i:La/lkz;

    .line 138
    .line 139
    iget-object v7, p0, La/glz;->h:Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-lez v5, :cond_9

    .line 146
    .line 147
    iget-boolean v5, p0, La/glz;->g:Z

    .line 148
    .line 149
    if-nez v5, :cond_9

    .line 150
    .line 151
    iget-object v5, p0, La/glz;->c:La/cu;

    .line 152
    .line 153
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v5, v5, La/cu;->b:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v5, La/hz40;

    .line 162
    .line 163
    invoke-virtual {v5, v0}, La/hz40;->c(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-eqz v5, :cond_9

    .line 168
    .line 169
    sget-object v5, La/kkz;->Companion:La/ikz;

    .line 170
    .line 171
    iget-object v6, p1, La/flz;->a:La/lkz;

    .line 172
    .line 173
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-eq v5, v2, :cond_7

    .line 184
    .line 185
    if-eq v5, v1, :cond_6

    .line 186
    .line 187
    const/4 v6, 0x4

    .line 188
    if-eq v5, v6, :cond_5

    .line 189
    .line 190
    move-object v5, v4

    .line 191
    goto :goto_4

    .line 192
    :cond_5
    sget-object v5, La/kkz;->ON_PAUSE:La/kkz;

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_6
    sget-object v5, La/kkz;->ON_STOP:La/kkz;

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_7
    sget-object v5, La/kkz;->ON_DESTROY:La/kkz;

    .line 199
    .line 200
    :goto_4
    if-eqz v5, :cond_8

    .line 201
    .line 202
    invoke-virtual {v5}, La/kkz;->a()La/lkz;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1, v3, v5}, La/flz;->a(La/clz;La/kkz;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v7}, La/w3d;->A(Ljava/util/List;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_8
    iget-object p0, p1, La/flz;->a:La/lkz;

    .line 217
    .line 218
    const-string p1, "no event down from "

    .line 219
    .line 220
    invoke-static {p0, p1}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_9
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    :goto_5
    return-object v4

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
