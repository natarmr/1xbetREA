.class public final synthetic La/bwh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/vne;

.field public final synthetic d:La/xk80;


# direct methods
.method public synthetic constructor <init>(La/vne;Lkotlin/jvm/functions/Function1;La/xk80;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/bwh;->a:B

    iput-object p1, p0, La/bwh;->c:La/vne;

    iput-object p2, p0, La/bwh;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/bwh;->d:La/xk80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/vne;La/kwj;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/bwh;->a:B

    iput-object p1, p0, La/bwh;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/bwh;->c:La/vne;

    iput-object p3, p0, La/bwh;->d:La/xk80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/bwh;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    new-instance v0, La/u48;

    .line 13
    .line 14
    const/16 v1, 0xb

    .line 15
    .line 16
    iget-object v2, p0, La/bwh;->d:La/xk80;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v0, v2, p1, v3, v1}, La/u48;-><init>(La/xk80;ILa/yje;B)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    iget-object v2, p0, La/bwh;->c:La/vne;

    .line 24
    .line 25
    invoke-static {v2, v3, v3, v0, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 26
    .line 27
    .line 28
    new-instance v0, La/enp0;

    .line 29
    .line 30
    invoke-direct {v0, p1}, La/enp0;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, La/bwh;->b:Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    new-instance p1, La/nb30;

    .line 48
    .line 49
    invoke-direct {p1, v2, v3}, La/nb30;-><init>(J)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, La/bwh;->b:Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    new-instance v0, La/cwh;

    .line 58
    .line 59
    const/4 v5, 0x2

    .line 60
    iget-object v1, p0, La/bwh;->d:La/xk80;

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    invoke-direct/range {v0 .. v5}, La/cwh;-><init>(La/xk80;JLa/yje;B)V

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x3

    .line 67
    iget-object p0, p0, La/bwh;->c:La/vne;

    .line 68
    .line 69
    invoke-static {p0, v4, v4, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    new-instance v0, La/u48;

    .line 82
    .line 83
    const/4 v1, 0x6

    .line 84
    iget-object v2, p0, La/bwh;->d:La/xk80;

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-direct {v0, v2, p1, v3, v1}, La/u48;-><init>(La/xk80;ILa/yje;B)V

    .line 88
    .line 89
    .line 90
    const/4 v1, 0x3

    .line 91
    iget-object v2, p0, La/bwh;->c:La/vne;

    .line 92
    .line 93
    invoke-static {v2, v3, v3, v0, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 94
    .line 95
    .line 96
    new-instance v0, La/kr10;

    .line 97
    .line 98
    invoke-direct {v0, p1}, La/kr10;-><init>(I)V

    .line 99
    .line 100
    .line 101
    iget-object p0, p0, La/bwh;->b:Lkotlin/jvm/functions/Function1;

    .line 102
    .line 103
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    new-instance v0, La/dkg;

    .line 116
    .line 117
    iget-object v1, p0, La/bwh;->b:Lkotlin/jvm/functions/Function1;

    .line 118
    .line 119
    iget-object v2, p0, La/bwh;->d:La/xk80;

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    invoke-direct {v0, v1, p1, v2, v3}, La/dkg;-><init>(Lkotlin/jvm/functions/Function1;ILa/xk80;La/yje;)V

    .line 123
    .line 124
    .line 125
    const/4 p1, 0x3

    .line 126
    iget-object p0, p0, La/bwh;->c:La/vne;

    .line 127
    .line 128
    invoke-static {p0, v3, v3, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 129
    .line 130
    .line 131
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_3
    check-cast p1, Ljava/lang/Long;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 137
    .line 138
    .line 139
    move-result-wide v2

    .line 140
    new-instance p1, La/thv;

    .line 141
    .line 142
    invoke-direct {p1, v2, v3}, La/thv;-><init>(J)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, La/bwh;->b:Lkotlin/jvm/functions/Function1;

    .line 146
    .line 147
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    new-instance v0, La/cwh;

    .line 151
    .line 152
    const/4 v5, 0x1

    .line 153
    iget-object v1, p0, La/bwh;->d:La/xk80;

    .line 154
    .line 155
    const/4 v4, 0x0

    .line 156
    invoke-direct/range {v0 .. v5}, La/cwh;-><init>(La/xk80;JLa/yje;B)V

    .line 157
    .line 158
    .line 159
    const/4 p1, 0x3

    .line 160
    iget-object p0, p0, La/bwh;->c:La/vne;

    .line 161
    .line 162
    invoke-static {p0, v4, v4, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 163
    .line 164
    .line 165
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_4
    check-cast p1, Ljava/lang/Long;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 171
    .line 172
    .line 173
    move-result-wide v2

    .line 174
    new-instance p1, La/svh;

    .line 175
    .line 176
    invoke-direct {p1, v2, v3}, La/svh;-><init>(J)V

    .line 177
    .line 178
    .line 179
    iget-object v0, p0, La/bwh;->b:Lkotlin/jvm/functions/Function1;

    .line 180
    .line 181
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    new-instance v0, La/cwh;

    .line 185
    .line 186
    const/4 v5, 0x0

    .line 187
    iget-object v1, p0, La/bwh;->d:La/xk80;

    .line 188
    .line 189
    const/4 v4, 0x0

    .line 190
    invoke-direct/range {v0 .. v5}, La/cwh;-><init>(La/xk80;JLa/yje;B)V

    .line 191
    .line 192
    .line 193
    const/4 p1, 0x3

    .line 194
    iget-object p0, p0, La/bwh;->c:La/vne;

    .line 195
    .line 196
    invoke-static {p0, v4, v4, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 197
    .line 198
    .line 199
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object p0

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
