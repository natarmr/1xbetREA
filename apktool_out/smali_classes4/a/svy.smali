.class public final synthetic La/svy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/slp;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(La/slp;Lkotlin/jvm/functions/Function1;ZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/svy;->a:B

    iput-object p1, p0, La/svy;->b:La/slp;

    iput-object p2, p0, La/svy;->c:Lkotlin/jvm/functions/Function1;

    iput-boolean p3, p0, La/svy;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/svy;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x799532c4

    .line 5
    .line 6
    .line 7
    const/16 v3, 0x11

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    check-cast p1, La/hcz;

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
    iget-object v7, p0, La/svy;->b:La/slp;

    .line 19
    .line 20
    iget-object v6, v7, La/slp;->b:La/a4x;

    .line 21
    .line 22
    new-instance v0, La/pua;

    .line 23
    .line 24
    invoke-direct {v0, v3}, La/pua;-><init>(B)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    new-instance v11, La/dwy;

    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    invoke-direct {v11, v0, v6, v5}, La/dwy;-><init>(La/pua;Ljava/util/List;B)V

    .line 35
    .line 36
    .line 37
    new-instance v0, La/y9k0;

    .line 38
    .line 39
    invoke-direct {v0, v6, v1}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 40
    .line 41
    .line 42
    new-instance v5, La/ewy;

    .line 43
    .line 44
    const/4 v10, 0x3

    .line 45
    iget-object v8, p0, La/svy;->c:Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    iget-boolean v9, p0, La/svy;->d:Z

    .line 48
    .line 49
    invoke-direct/range {v5 .. v10}, La/ewy;-><init>(Ljava/util/List;La/slp;Lkotlin/jvm/functions/Function1;ZB)V

    .line 50
    .line 51
    .line 52
    new-instance p0, La/ugd;

    .line 53
    .line 54
    invoke-direct {p0, v2, v4, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v3, v11, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 58
    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v7, p0, La/svy;->b:La/slp;

    .line 67
    .line 68
    iget-object v6, v7, La/slp;->b:La/a4x;

    .line 69
    .line 70
    new-instance v0, La/pua;

    .line 71
    .line 72
    invoke-direct {v0, v3}, La/pua;-><init>(B)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    new-instance v3, La/dwy;

    .line 80
    .line 81
    const/4 v5, 0x3

    .line 82
    invoke-direct {v3, v0, v6, v5}, La/dwy;-><init>(La/pua;Ljava/util/List;B)V

    .line 83
    .line 84
    .line 85
    new-instance v0, La/ap30;

    .line 86
    .line 87
    const/4 v5, 0x6

    .line 88
    invoke-direct {v0, v6, v5}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 89
    .line 90
    .line 91
    new-instance v5, La/ewy;

    .line 92
    .line 93
    const/4 v10, 0x2

    .line 94
    iget-object v8, p0, La/svy;->c:Lkotlin/jvm/functions/Function1;

    .line 95
    .line 96
    iget-boolean v9, p0, La/svy;->d:Z

    .line 97
    .line 98
    invoke-direct/range {v5 .. v10}, La/ewy;-><init>(Ljava/util/List;La/slp;Lkotlin/jvm/functions/Function1;ZB)V

    .line 99
    .line 100
    .line 101
    new-instance p0, La/ugd;

    .line 102
    .line 103
    invoke-direct {p0, v2, v4, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v1, v3, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object v7, p0, La/svy;->b:La/slp;

    .line 116
    .line 117
    iget-object v6, v7, La/slp;->b:La/a4x;

    .line 118
    .line 119
    new-instance v0, La/pua;

    .line 120
    .line 121
    invoke-direct {v0, v3}, La/pua;-><init>(B)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    new-instance v11, La/dwy;

    .line 129
    .line 130
    invoke-direct {v11, v0, v6, v4}, La/dwy;-><init>(La/pua;Ljava/util/List;B)V

    .line 131
    .line 132
    .line 133
    new-instance v0, La/ap30;

    .line 134
    .line 135
    invoke-direct {v0, v6, v1}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 136
    .line 137
    .line 138
    new-instance v5, La/ewy;

    .line 139
    .line 140
    const/4 v10, 0x1

    .line 141
    iget-object v8, p0, La/svy;->c:Lkotlin/jvm/functions/Function1;

    .line 142
    .line 143
    iget-boolean v9, p0, La/svy;->d:Z

    .line 144
    .line 145
    invoke-direct/range {v5 .. v10}, La/ewy;-><init>(Ljava/util/List;La/slp;Lkotlin/jvm/functions/Function1;ZB)V

    .line 146
    .line 147
    .line 148
    new-instance p0, La/ugd;

    .line 149
    .line 150
    invoke-direct {p0, v2, v4, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v3, v11, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 154
    .line 155
    .line 156
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iget-object v7, p0, La/svy;->b:La/slp;

    .line 163
    .line 164
    iget-object v6, v7, La/slp;->b:La/a4x;

    .line 165
    .line 166
    new-instance v0, La/pua;

    .line 167
    .line 168
    invoke-direct {v0, v3}, La/pua;-><init>(B)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    new-instance v11, La/dwy;

    .line 176
    .line 177
    invoke-direct {v11, v0, v6, v1}, La/dwy;-><init>(La/pua;Ljava/util/List;B)V

    .line 178
    .line 179
    .line 180
    new-instance v0, La/far;

    .line 181
    .line 182
    const/16 v1, 0x1a

    .line 183
    .line 184
    invoke-direct {v0, v6, v1}, La/far;-><init>(Ljava/util/List;B)V

    .line 185
    .line 186
    .line 187
    new-instance v5, La/ewy;

    .line 188
    .line 189
    const/4 v10, 0x0

    .line 190
    iget-object v8, p0, La/svy;->c:Lkotlin/jvm/functions/Function1;

    .line 191
    .line 192
    iget-boolean v9, p0, La/svy;->d:Z

    .line 193
    .line 194
    invoke-direct/range {v5 .. v10}, La/ewy;-><init>(Ljava/util/List;La/slp;Lkotlin/jvm/functions/Function1;ZB)V

    .line 195
    .line 196
    .line 197
    new-instance p0, La/ugd;

    .line 198
    .line 199
    invoke-direct {p0, v2, v4, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v3, v11, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 203
    .line 204
    .line 205
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    return-object p0

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
