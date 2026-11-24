.class public final synthetic La/jb50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:La/y1h0;

.field public final synthetic c:I

.field public final synthetic d:Lkotlin/jvm/functions/Function2;

.field public final synthetic e:Z

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZLa/y1h0;ILkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/jb50;->a:Z

    iput-object p2, p0, La/jb50;->b:La/y1h0;

    iput p3, p0, La/jb50;->c:I

    iput-object p4, p0, La/jb50;->d:Lkotlin/jvm/functions/Function2;

    iput-boolean p5, p0, La/jb50;->e:Z

    iput-object p6, p0, La/jb50;->f:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, La/jb50;->g:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, La/c53;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-boolean v1, p0, La/jb50;->a:Z

    .line 5
    .line 6
    iget-object v2, p0, La/jb50;->b:La/y1h0;

    .line 7
    .line 8
    if-eqz v1, :cond_6

    .line 9
    .line 10
    invoke-interface {v2}, La/y1h0;->getEntries()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, La/ob50;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object v1, v1, La/ob50;->c:Ljava/util/Map;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    :cond_0
    sget-object v1, La/lun;->a:La/lun;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    :cond_1
    sget-object v2, La/lwf;->u:La/lwf;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    move-object v1, v0

    .line 44
    :cond_2
    const/4 v2, 0x2

    .line 45
    invoke-static {v2, v1}, La/zys0;->f(ILjava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    move-object v0, v1

    .line 52
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 53
    .line 54
    :cond_3
    iget v1, p0, La/jb50;->c:I

    .line 55
    .line 56
    if-eqz v0, :cond_5

    .line 57
    .line 58
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-interface {v0, p1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, La/lie;

    .line 67
    .line 68
    if-nez v0, :cond_4

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    return-object v0

    .line 72
    :cond_5
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object p0, p0, La/jb50;->d:Lkotlin/jvm/functions/Function2;

    .line 77
    .line 78
    invoke-interface {p0, p1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/lie;

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_6
    const/4 v1, 0x1

    .line 86
    iget-boolean v3, p0, La/jb50;->e:Z

    .line 87
    .line 88
    if-eqz v3, :cond_d

    .line 89
    .line 90
    sget-object v3, La/m2a;->u:La/m2a;

    .line 91
    .line 92
    invoke-interface {v2}, La/y1h0;->getEntries()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    check-cast v2, La/ob50;

    .line 101
    .line 102
    if-eqz v2, :cond_7

    .line 103
    .line 104
    iget-object v2, v2, La/ob50;->c:Ljava/util/Map;

    .line 105
    .line 106
    if-nez v2, :cond_8

    .line 107
    .line 108
    :cond_7
    sget-object v2, La/lun;->a:La/lun;

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    if-nez v2, :cond_9

    .line 122
    .line 123
    move-object v2, v0

    .line 124
    :cond_9
    invoke-static {v1, v2}, La/zys0;->f(ILjava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_a

    .line 129
    .line 130
    move-object v0, v2

    .line 131
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 132
    .line 133
    :cond_a
    if-eqz v0, :cond_c

    .line 134
    .line 135
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, La/lie;

    .line 140
    .line 141
    if-nez v0, :cond_b

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_b
    return-object v0

    .line 145
    :cond_c
    :goto_1
    iget-object p0, p0, La/jb50;->f:Lkotlin/jvm/functions/Function1;

    .line 146
    .line 147
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    check-cast p0, La/lie;

    .line 152
    .line 153
    return-object p0

    .line 154
    :cond_d
    sget-object v3, La/ujn;->v:La/ujn;

    .line 155
    .line 156
    invoke-interface {v2}, La/y1h0;->getEntries()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, La/ob50;

    .line 165
    .line 166
    if-eqz v2, :cond_e

    .line 167
    .line 168
    iget-object v2, v2, La/ob50;->c:Ljava/util/Map;

    .line 169
    .line 170
    if-nez v2, :cond_f

    .line 171
    .line 172
    :cond_e
    sget-object v2, La/lun;->a:La/lun;

    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    :cond_f
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    if-nez v2, :cond_10

    .line 186
    .line 187
    move-object v2, v0

    .line 188
    :cond_10
    invoke-static {v1, v2}, La/zys0;->f(ILjava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_11

    .line 193
    .line 194
    move-object v0, v2

    .line 195
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 196
    .line 197
    :cond_11
    if-eqz v0, :cond_13

    .line 198
    .line 199
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, La/lie;

    .line 204
    .line 205
    if-nez v0, :cond_12

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_12
    return-object v0

    .line 209
    :cond_13
    :goto_2
    iget-object p0, p0, La/jb50;->g:Lkotlin/jvm/functions/Function1;

    .line 210
    .line 211
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    check-cast p0, La/lie;

    .line 216
    .line 217
    return-object p0
.end method
