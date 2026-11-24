.class public final synthetic La/eu20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xdr;

.field public final synthetic c:La/uv20;


# direct methods
.method public synthetic constructor <init>(BLa/xdr;La/uv20;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/eu20;->a:B

    iput-object p2, p0, La/eu20;->b:La/xdr;

    iput-object p3, p0, La/eu20;->c:La/uv20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/eu20;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/eu20;->c:La/uv20;

    .line 4
    .line 5
    iget-object p0, p0, La/eu20;->b:La/xdr;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-wide v2, v1, La/uv20;->a:J

    .line 11
    .line 12
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v2, v1, La/uv20;->b:Ljava/lang/String;

    .line 17
    .line 18
    iget-boolean v1, v1, La/uv20;->d:Z

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {p0, v0, v2, v1}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    new-instance v0, La/eu20;

    .line 31
    .line 32
    const/16 v2, 0x9

    .line 33
    .line 34
    invoke-direct {v0, v2, p0, v1}, La/eu20;-><init>(BLa/xdr;La/uv20;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 38
    .line 39
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, La/bjj;->a()V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_1
    iget-wide v2, v1, La/uv20;->a:J

    .line 50
    .line 51
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v2, v1, La/uv20;->b:Ljava/lang/String;

    .line 56
    .line 57
    iget-boolean v1, v1, La/uv20;->d:Z

    .line 58
    .line 59
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {p0, v0, v2, v1}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_2
    new-instance v0, La/eu20;

    .line 70
    .line 71
    const/4 v2, 0x7

    .line 72
    invoke-direct {v0, v2, p0, v1}, La/eu20;-><init>(BLa/xdr;La/uv20;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 76
    .line 77
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, La/bjj;->a()V

    .line 82
    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_3
    iget-wide v2, v1, La/uv20;->a:J

    .line 88
    .line 89
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v2, v1, La/uv20;->b:Ljava/lang/String;

    .line 94
    .line 95
    iget-boolean v1, v1, La/uv20;->d:Z

    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {p0, v0, v2, v1}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_4
    new-instance v0, La/eu20;

    .line 108
    .line 109
    const/4 v2, 0x5

    .line 110
    invoke-direct {v0, v2, p0, v1}, La/eu20;-><init>(BLa/xdr;La/uv20;)V

    .line 111
    .line 112
    .line 113
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 114
    .line 115
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0}, La/bjj;->a()V

    .line 120
    .line 121
    .line 122
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_5
    iget-wide v2, v1, La/uv20;->a:J

    .line 126
    .line 127
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iget-object v2, v1, La/uv20;->b:Ljava/lang/String;

    .line 132
    .line 133
    iget-boolean v1, v1, La/uv20;->d:Z

    .line 134
    .line 135
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-interface {p0, v0, v2, v1}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_6
    new-instance v0, La/eu20;

    .line 146
    .line 147
    const/4 v2, 0x3

    .line 148
    invoke-direct {v0, v2, p0, v1}, La/eu20;-><init>(BLa/xdr;La/uv20;)V

    .line 149
    .line 150
    .line 151
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 152
    .line 153
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-virtual {p0}, La/bjj;->a()V

    .line 158
    .line 159
    .line 160
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_7
    iget-wide v2, v1, La/uv20;->a:J

    .line 164
    .line 165
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-object v2, v1, La/uv20;->b:Ljava/lang/String;

    .line 170
    .line 171
    iget-boolean v1, v1, La/uv20;->d:Z

    .line 172
    .line 173
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-interface {p0, v0, v2, v1}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_8
    new-instance v0, La/eu20;

    .line 184
    .line 185
    const/4 v2, 0x1

    .line 186
    invoke-direct {v0, v2, p0, v1}, La/eu20;-><init>(BLa/xdr;La/uv20;)V

    .line 187
    .line 188
    .line 189
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 190
    .line 191
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-virtual {p0}, La/bjj;->a()V

    .line 196
    .line 197
    .line 198
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
