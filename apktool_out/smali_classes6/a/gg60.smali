.class public final synthetic La/gg60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gg60;->a:B

    iput-object p1, p0, La/gg60;->b:Ljava/lang/Object;

    iput-object p2, p0, La/gg60;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 9

    .line 1
    iget-byte v0, p0, La/gg60;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/gg60;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/gg60;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v0, p0

    .line 11
    check-cast v0, La/jvv0;

    .line 12
    .line 13
    move-object v2, v1

    .line 14
    check-cast v2, La/kvv0;

    .line 15
    .line 16
    iget-object v3, v0, La/jvv0;->a:La/p7m0;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    move-object v1, p0

    .line 23
    check-cast v1, La/gvv0;

    .line 24
    .line 25
    iget-object v4, v1, La/gvv0;->a:Ljava/util/Map;

    .line 26
    .line 27
    iget-object v5, v1, La/gvv0;->c:La/kvv0;

    .line 28
    .line 29
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Ljava/util/Map$Entry;

    .line 53
    .line 54
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    check-cast v8, La/kvv0;

    .line 59
    .line 60
    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_1

    .line 65
    .line 66
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-virtual {v6, v8, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Ljava/lang/Iterable;

    .line 83
    .line 84
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    iget-object v6, v1, La/gvv0;->a:Ljava/util/Map;

    .line 89
    .line 90
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, Ljava/lang/Iterable;

    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 103
    .line 104
    invoke-direct {v8, v6}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    check-cast v6, Ljava/util/Collection;

    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {v7}, La/w3d;->w(Ljava/lang/Iterable;)Ljava/util/Collection;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-interface {v6, v7}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 121
    .line 122
    .line 123
    invoke-static {v8}, La/xp20;->i(Ljava/util/LinkedHashMap;)Ljava/util/Map;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    iget-object v1, v1, La/gvv0;->b:Ljava/util/Map;

    .line 128
    .line 129
    invoke-static {v1, v2}, La/xp20;->g(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_3

    .line 138
    .line 139
    const/4 v5, 0x0

    .line 140
    :cond_3
    new-instance v7, La/gvv0;

    .line 141
    .line 142
    invoke-direct {v7, v6, v1, v5}, La/gvv0;-><init>(Ljava/util/Map;Ljava/util/Map;La/kvv0;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, p0, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-eqz p0, :cond_0

    .line 150
    .line 151
    iget-object p0, v0, La/jvv0;->b:La/gsv0;

    .line 152
    .line 153
    if-eqz p0, :cond_6

    .line 154
    .line 155
    iget-object p0, p0, La/gsv0;->a:La/hsv0;

    .line 156
    .line 157
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_6

    .line 166
    .line 167
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, La/lwv0;

    .line 172
    .line 173
    iget-object v2, p0, La/hsv0;->d:Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-virtual {p0, v2, v1}, La/hsv0;->c(Ljava/util/List;La/lwv0;)V

    .line 176
    .line 177
    .line 178
    iget-object v2, p0, La/hsv0;->c:La/u950;

    .line 179
    .line 180
    if-eqz v2, :cond_5

    .line 181
    .line 182
    invoke-virtual {p0, v2, v1}, La/hsv0;->c(Ljava/util/List;La/lwv0;)V

    .line 183
    .line 184
    .line 185
    :cond_5
    iget-object v2, p0, La/hsv0;->c:La/u950;

    .line 186
    .line 187
    if-nez v2, :cond_4

    .line 188
    .line 189
    invoke-virtual {p0, v1}, La/hsv0;->b(La/rb50;)V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_6
    return-void

    .line 194
    :pswitch_0
    check-cast p0, La/glz;

    .line 195
    .line 196
    check-cast v1, La/lz2;

    .line 197
    .line 198
    invoke-virtual {p0, v1}, La/glz;->f(La/blz;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
