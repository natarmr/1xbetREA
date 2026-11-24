.class public final La/v22;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nla;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/nla;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/v22;->a:B

    iput-object p1, p0, La/v22;->b:La/nla;

    iput-object p2, p0, La/v22;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/v22;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/v22;->b:La/nla;

    .line 4
    .line 5
    iget-object p0, p0, La/v22;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/bem;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, v1, La/lla;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    instance-of v0, p1, La/wdm;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    new-instance p1, La/qeh0;

    .line 24
    .line 25
    new-instance v0, La/hll0;

    .line 26
    .line 27
    check-cast v1, La/lla;

    .line 28
    .line 29
    invoke-interface {v1}, La/lla;->a()J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    invoke-direct {v0, v1, v2}, La/hll0;-><init>(J)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, v0}, La/qeh0;-><init>(La/ill0;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    instance-of v0, p1, La/rdm;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    instance-of p1, p1, La/xdm;

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    :goto_0
    new-instance p1, La/qeh0;

    .line 53
    .line 54
    new-instance v0, La/gll0;

    .line 55
    .line 56
    check-cast v1, La/lla;

    .line 57
    .line 58
    invoke-interface {v1}, La/lla;->a()J

    .line 59
    .line 60
    .line 61
    move-result-wide v1

    .line 62
    invoke-direct {v0, v1, v2}, La/gll0;-><init>(J)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, v0}, La/qeh0;-><init>(La/ill0;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_2
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_0
    check-cast p1, La/bem;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    instance-of v0, v1, La/lla;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    instance-of v0, p1, La/wdm;

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    new-instance p1, La/m5g0;

    .line 88
    .line 89
    new-instance v0, La/hll0;

    .line 90
    .line 91
    check-cast v1, La/lla;

    .line 92
    .line 93
    invoke-interface {v1}, La/lla;->a()J

    .line 94
    .line 95
    .line 96
    move-result-wide v1

    .line 97
    invoke-direct {v0, v1, v2}, La/hll0;-><init>(J)V

    .line 98
    .line 99
    .line 100
    invoke-direct {p1, v0}, La/m5g0;-><init>(La/ill0;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_3
    instance-of v0, p1, La/rdm;

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    instance-of p1, p1, La/xdm;

    .line 113
    .line 114
    if-eqz p1, :cond_5

    .line 115
    .line 116
    :goto_2
    new-instance p1, La/m5g0;

    .line 117
    .line 118
    new-instance v0, La/gll0;

    .line 119
    .line 120
    check-cast v1, La/lla;

    .line 121
    .line 122
    invoke-interface {v1}, La/lla;->a()J

    .line 123
    .line 124
    .line 125
    move-result-wide v1

    .line 126
    invoke-direct {v0, v1, v2}, La/gll0;-><init>(J)V

    .line 127
    .line 128
    .line 129
    invoke-direct {p1, v0}, La/m5g0;-><init>(La/ill0;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_1
    check-cast p1, La/bem;

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    instance-of v0, v1, La/lla;

    .line 144
    .line 145
    if-eqz v0, :cond_8

    .line 146
    .line 147
    instance-of v0, p1, La/wdm;

    .line 148
    .line 149
    if-eqz v0, :cond_6

    .line 150
    .line 151
    new-instance p1, La/m22;

    .line 152
    .line 153
    new-instance v0, La/hll0;

    .line 154
    .line 155
    check-cast v1, La/lla;

    .line 156
    .line 157
    invoke-interface {v1}, La/lla;->a()J

    .line 158
    .line 159
    .line 160
    move-result-wide v1

    .line 161
    invoke-direct {v0, v1, v2}, La/hll0;-><init>(J)V

    .line 162
    .line 163
    .line 164
    invoke-direct {p1, v0}, La/m22;-><init>(La/ill0;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_6
    instance-of v0, p1, La/rdm;

    .line 172
    .line 173
    if-eqz v0, :cond_7

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_7
    instance-of p1, p1, La/xdm;

    .line 177
    .line 178
    if-eqz p1, :cond_8

    .line 179
    .line 180
    :goto_4
    new-instance p1, La/m22;

    .line 181
    .line 182
    new-instance v0, La/gll0;

    .line 183
    .line 184
    check-cast v1, La/lla;

    .line 185
    .line 186
    invoke-interface {v1}, La/lla;->a()J

    .line 187
    .line 188
    .line 189
    move-result-wide v1

    .line 190
    invoke-direct {v0, v1, v2}, La/gll0;-><init>(J)V

    .line 191
    .line 192
    .line 193
    invoke-direct {p1, v0}, La/m22;-><init>(La/ill0;)V

    .line 194
    .line 195
    .line 196
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    :cond_8
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object p0

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
