.class public final synthetic La/srj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# direct methods
.method public synthetic constructor <init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/srj;->a:B

    iput-object p1, p0, La/srj;->b:Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/srj;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/srj;->b:Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/lf50;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, La/lf50;->b:La/re50;

    .line 15
    .line 16
    iget-object v1, p1, La/lf50;->a:Ljava/util/List;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, La/ve50;

    .line 44
    .line 45
    invoke-interface {v2}, La/ve50;->b()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, La/wul0;

    .line 75
    .line 76
    invoke-interface {v1}, La/wul0;->a()La/m7h0;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-interface {v1}, La/m7h0;->b()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-interface {p0}, La/m7h0;->b()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_3

    .line 93
    .line 94
    invoke-static {p1, p0}, La/qxw;->u(La/lf50;La/m7h0;)La/lf50;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    goto :goto_2

    .line 99
    :cond_4
    :goto_1
    invoke-static {p1, p0}, La/qxw;->N(La/lf50;La/m7h0;)La/lf50;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    :goto_2
    return-object p0

    .line 104
    :pswitch_0
    check-cast p1, La/i1w0;

    .line 105
    .line 106
    invoke-static {p1, p1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, La/c8d;

    .line 117
    .line 118
    sget-object v2, La/cfx0;->o:La/bjk;

    .line 119
    .line 120
    new-instance v3, La/v7d;

    .line 121
    .line 122
    const/4 v4, 0x1

    .line 123
    invoke-direct {v3, v4, v2, v2}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 124
    .line 125
    .line 126
    iput-object v3, p0, La/c8d;->a:La/w7d;

    .line 127
    .line 128
    iget-object p0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 129
    .line 130
    invoke-static {p1, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    :goto_3
    move-object v0, p0

    .line 135
    check-cast v0, La/paw;

    .line 136
    .line 137
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_5

    .line 142
    .line 143
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, La/oe50;

    .line 148
    .line 149
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_1
    check-cast p1, La/i1w0;

    .line 157
    .line 158
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    instance-of v2, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 163
    .line 164
    if-eqz v2, :cond_6

    .line 165
    .line 166
    new-instance v2, La/e1w0;

    .line 167
    .line 168
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 169
    .line 170
    invoke-direct {v2, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 171
    .line 172
    .line 173
    new-instance p0, La/c8d;

    .line 174
    .line 175
    sget-object v3, La/y7d;->a:La/v7d;

    .line 176
    .line 177
    invoke-direct {p0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_6
    new-instance v2, La/w0w0;

    .line 185
    .line 186
    invoke-direct {v2, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 187
    .line 188
    .line 189
    new-instance p0, La/c8d;

    .line 190
    .line 191
    sget-object v3, La/y7d;->a:La/v7d;

    .line 192
    .line 193
    invoke-direct {p0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    :goto_4
    invoke-static {p1, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    :goto_5
    move-object v0, p0

    .line 204
    check-cast v0, La/paw;

    .line 205
    .line 206
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_7

    .line 211
    .line 212
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, La/oe50;

    .line 217
    .line 218
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 219
    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    return-object p0

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
