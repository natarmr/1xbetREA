.class public final synthetic La/vgx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xdr;

.field public final synthetic c:La/ygx;


# direct methods
.method public synthetic constructor <init>(La/xdr;La/ygx;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vgx;->a:B

    iput-object p1, p0, La/vgx;->b:La/xdr;

    iput-object p2, p0, La/vgx;->c:La/ygx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/vgx;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/vgx;->c:La/ygx;

    .line 4
    .line 5
    iget-object p0, p0, La/vgx;->b:La/xdr;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-wide v2, v1, La/ygx;->b:J

    .line 11
    .line 12
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v2, v1, La/ygx;->d:Ljava/lang/String;

    .line 17
    .line 18
    iget-boolean v1, v1, La/ygx;->e:Z

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
    new-instance v0, La/vgx;

    .line 31
    .line 32
    const/4 v2, 0x7

    .line 33
    invoke-direct {v0, p0, v1, v2}, La/vgx;-><init>(La/xdr;La/ygx;B)V

    .line 34
    .line 35
    .line 36
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 37
    .line 38
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, La/bjj;->a()V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    iget-wide v2, v1, La/ygx;->b:J

    .line 49
    .line 50
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v2, v1, La/ygx;->d:Ljava/lang/String;

    .line 55
    .line 56
    iget-boolean v1, v1, La/ygx;->e:Z

    .line 57
    .line 58
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {p0, v0, v2, v1}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_2
    new-instance v0, La/vgx;

    .line 69
    .line 70
    const/4 v2, 0x5

    .line 71
    invoke-direct {v0, p0, v1, v2}, La/vgx;-><init>(La/xdr;La/ygx;B)V

    .line 72
    .line 73
    .line 74
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 75
    .line 76
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, La/bjj;->a()V

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_3
    iget-wide v2, v1, La/ygx;->b:J

    .line 87
    .line 88
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object v2, v1, La/ygx;->d:Ljava/lang/String;

    .line 93
    .line 94
    iget-boolean v1, v1, La/ygx;->e:Z

    .line 95
    .line 96
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-interface {p0, v0, v2, v1}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_4
    new-instance v0, La/vgx;

    .line 107
    .line 108
    const/4 v2, 0x3

    .line 109
    invoke-direct {v0, p0, v1, v2}, La/vgx;-><init>(La/xdr;La/ygx;B)V

    .line 110
    .line 111
    .line 112
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 113
    .line 114
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p0}, La/bjj;->a()V

    .line 119
    .line 120
    .line 121
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0

    .line 124
    :pswitch_5
    iget-wide v2, v1, La/ygx;->b:J

    .line 125
    .line 126
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iget-object v2, v1, La/ygx;->d:Ljava/lang/String;

    .line 131
    .line 132
    iget-boolean v1, v1, La/ygx;->e:Z

    .line 133
    .line 134
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-interface {p0, v0, v2, v1}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_6
    new-instance v0, La/vgx;

    .line 145
    .line 146
    const/4 v2, 0x1

    .line 147
    invoke-direct {v0, p0, v1, v2}, La/vgx;-><init>(La/xdr;La/ygx;B)V

    .line 148
    .line 149
    .line 150
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 151
    .line 152
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-virtual {p0}, La/bjj;->a()V

    .line 157
    .line 158
    .line 159
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object p0

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
