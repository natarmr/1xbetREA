.class public final synthetic La/eg90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/xdr;

.field public final synthetic d:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/xdr;La/ugd;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/eg90;->a:B

    iput-object p1, p0, La/eg90;->b:La/pz40;

    iput-object p2, p0, La/eg90;->c:La/xdr;

    iput-object p3, p0, La/eg90;->d:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/eg90;->a:B

    .line 2
    .line 3
    const v1, 0x799532c4

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, La/eg90;->d:La/ugd;

    .line 7
    .line 8
    iget-object v3, p0, La/eg90;->c:La/xdr;

    .line 9
    .line 10
    iget-object p0, p0, La/eg90;->b:La/pz40;

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    check-cast p1, La/hcz;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/util/List;

    .line 26
    .line 27
    new-instance v0, La/ht80;

    .line 28
    .line 29
    const/16 v5, 0x1b

    .line 30
    .line 31
    invoke-direct {v0, v5}, La/ht80;-><init>(B)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    new-instance v7, La/m160;

    .line 39
    .line 40
    invoke-direct {v7, v0, p0, v5}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    new-instance v0, La/a580;

    .line 44
    .line 45
    const/16 v5, 0xd

    .line 46
    .line 47
    invoke-direct {v0, p0, v5}, La/a580;-><init>(Ljava/util/List;B)V

    .line 48
    .line 49
    .line 50
    new-instance v5, La/ng90;

    .line 51
    .line 52
    const/4 v8, 0x4

    .line 53
    invoke-direct {v5, p0, v3, v2, v8}, La/ng90;-><init>(Ljava/util/List;La/xdr;La/ugd;B)V

    .line 54
    .line 55
    .line 56
    new-instance p0, La/ugd;

    .line 57
    .line 58
    invoke-direct {p0, v1, v4, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v6, v7, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Ljava/util/List;

    .line 75
    .line 76
    new-instance v0, La/ht80;

    .line 77
    .line 78
    const/16 v5, 0x1a

    .line 79
    .line 80
    invoke-direct {v0, v5}, La/ht80;-><init>(B)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    new-instance v7, La/m160;

    .line 88
    .line 89
    invoke-direct {v7, v0, p0, v5}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 90
    .line 91
    .line 92
    new-instance v0, La/a580;

    .line 93
    .line 94
    const/16 v5, 0xc

    .line 95
    .line 96
    invoke-direct {v0, p0, v5}, La/a580;-><init>(Ljava/util/List;B)V

    .line 97
    .line 98
    .line 99
    new-instance v5, La/ng90;

    .line 100
    .line 101
    const/4 v8, 0x3

    .line 102
    invoke-direct {v5, p0, v3, v2, v8}, La/ng90;-><init>(Ljava/util/List;La/xdr;La/ugd;B)V

    .line 103
    .line 104
    .line 105
    new-instance p0, La/ugd;

    .line 106
    .line 107
    invoke-direct {p0, v1, v4, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v6, v7, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 111
    .line 112
    .line 113
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    check-cast p0, Ljava/util/List;

    .line 124
    .line 125
    new-instance v0, La/ht80;

    .line 126
    .line 127
    const/16 v5, 0x1c

    .line 128
    .line 129
    invoke-direct {v0, v5}, La/ht80;-><init>(B)V

    .line 130
    .line 131
    .line 132
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    new-instance v6, La/m160;

    .line 137
    .line 138
    const/16 v7, 0x18

    .line 139
    .line 140
    invoke-direct {v6, v0, p0, v7}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 141
    .line 142
    .line 143
    new-instance v0, La/a580;

    .line 144
    .line 145
    const/16 v7, 0xa

    .line 146
    .line 147
    invoke-direct {v0, p0, v7}, La/a580;-><init>(Ljava/util/List;B)V

    .line 148
    .line 149
    .line 150
    new-instance v7, La/ng90;

    .line 151
    .line 152
    invoke-direct {v7, p0, v3, v2, v4}, La/ng90;-><init>(Ljava/util/List;La/xdr;La/ugd;B)V

    .line 153
    .line 154
    .line 155
    new-instance p0, La/ugd;

    .line 156
    .line 157
    invoke-direct {p0, v1, v4, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v5, v6, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 161
    .line 162
    .line 163
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object p0

    .line 166
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    check-cast p0, Ljava/util/List;

    .line 174
    .line 175
    new-instance v0, La/ht80;

    .line 176
    .line 177
    const/16 v5, 0x19

    .line 178
    .line 179
    invoke-direct {v0, v5}, La/ht80;-><init>(B)V

    .line 180
    .line 181
    .line 182
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    new-instance v6, La/m160;

    .line 187
    .line 188
    const/16 v7, 0x17

    .line 189
    .line 190
    invoke-direct {v6, v0, p0, v7}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 191
    .line 192
    .line 193
    new-instance v0, La/a580;

    .line 194
    .line 195
    const/16 v7, 0x9

    .line 196
    .line 197
    invoke-direct {v0, p0, v7}, La/a580;-><init>(Ljava/util/List;B)V

    .line 198
    .line 199
    .line 200
    new-instance v7, La/ng90;

    .line 201
    .line 202
    const/4 v8, 0x0

    .line 203
    invoke-direct {v7, p0, v3, v2, v8}, La/ng90;-><init>(Ljava/util/List;La/xdr;La/ugd;B)V

    .line 204
    .line 205
    .line 206
    new-instance p0, La/ugd;

    .line 207
    .line 208
    invoke-direct {p0, v1, v4, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v5, v6, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 212
    .line 213
    .line 214
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object p0

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
