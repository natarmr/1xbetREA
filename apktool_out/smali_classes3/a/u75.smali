.class public final synthetic La/u75;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v75;


# direct methods
.method public synthetic constructor <init>(La/v75;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u75;->a:B

    iput-object p1, p0, La/u75;->b:La/v75;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/u75;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/u75;->b:La/v75;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/l7m0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/v75;->a()La/fee;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, La/m65;

    .line 22
    .line 23
    iget-boolean p1, p1, La/m65;->a:Z

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    new-instance p1, La/y75;

    .line 28
    .line 29
    iget-object p0, p0, La/v75;->h:La/n0o0;

    .line 30
    .line 31
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, La/fee;

    .line 36
    .line 37
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, La/mdm;

    .line 42
    .line 43
    invoke-direct {p1, p0}, La/y75;-><init>(La/mdm;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p0}, La/v75;->a()La/fee;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, La/m65;

    .line 56
    .line 57
    iget-boolean p1, p1, La/m65;->d:Z

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    new-instance p1, La/x75;

    .line 62
    .line 63
    iget-object p0, p0, La/v75;->i:La/n0o0;

    .line 64
    .line 65
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, La/fee;

    .line 70
    .line 71
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, La/mdm;

    .line 76
    .line 77
    invoke-direct {p1, p0}, La/x75;-><init>(La/mdm;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    new-instance p1, La/w75;

    .line 82
    .line 83
    iget-object p0, p0, La/v75;->f:La/n0o0;

    .line 84
    .line 85
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, La/fee;

    .line 90
    .line 91
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, La/bml;

    .line 96
    .line 97
    invoke-direct {p1, p0}, La/w75;-><init>(La/bml;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    return-object p1

    .line 101
    :pswitch_0
    check-cast p1, La/m65;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-boolean p1, p1, La/m65;->b:Z

    .line 107
    .line 108
    iget-object v0, p0, La/v75;->c:La/pt0;

    .line 109
    .line 110
    sget-object v1, La/xll;->a:La/xll;

    .line 111
    .line 112
    if-eqz p1, :cond_2

    .line 113
    .line 114
    new-instance p0, La/aml;

    .line 115
    .line 116
    const/4 p1, 0x1

    .line 117
    invoke-direct {p0, v0, v1, p1}, La/aml;-><init>(La/pt0;La/yll;Z)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    invoke-virtual {p0}, La/v75;->a()La/fee;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, La/m65;

    .line 130
    .line 131
    iget-object p1, p1, La/m65;->c:Ljava/util/List;

    .line 132
    .line 133
    new-instance v2, Ljava/util/ArrayList;

    .line 134
    .line 135
    const/16 v3, 0xa

    .line 136
    .line 137
    invoke-static {p1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 142
    .line 143
    .line 144
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_3

    .line 153
    .line 154
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    move-object v4, v3

    .line 159
    check-cast v4, La/mlr;

    .line 160
    .line 161
    iget-object v5, p0, La/v75;->b:La/ctf0;

    .line 162
    .line 163
    iget-boolean v6, p0, La/v75;->a:Z

    .line 164
    .line 165
    iget-boolean v7, p0, La/v75;->d:Z

    .line 166
    .line 167
    invoke-virtual {p0}, La/v75;->a()La/fee;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    check-cast v3, La/m65;

    .line 176
    .line 177
    iget-object v3, v3, La/m65;->e:Ljava/util/Set;

    .line 178
    .line 179
    iget-wide v8, v4, La/mlr;->a:J

    .line 180
    .line 181
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    invoke-interface {v3, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    iget-object v9, p0, La/v75;->c:La/pt0;

    .line 190
    .line 191
    const/4 v10, 0x0

    .line 192
    invoke-static/range {v4 .. v10}, La/ccq0;->Z(La/mlr;La/ctf0;ZZZLa/pt0;Ljava/lang/Integer;)La/st0;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_3
    new-instance p0, La/zll;

    .line 201
    .line 202
    invoke-direct {p0, v0, v1, v2}, La/zll;-><init>(La/pt0;La/yll;Ljava/util/List;)V

    .line 203
    .line 204
    .line 205
    :goto_2
    return-object p0

    .line 206
    nop

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
