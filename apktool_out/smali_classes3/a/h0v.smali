.class public final La/h0v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Throwable;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h0v;->i:B

    iput-object p1, p0, La/h0v;->k:Ljava/lang/Object;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/h0v;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/h0v;->k:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, La/h0v;->j:Ljava/lang/Throwable;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    check-cast v3, La/qv2;

    .line 18
    .line 19
    invoke-static {p0}, La/agc;->W(Ljava/lang/Throwable;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    iget-object p0, v3, La/qv2;->k:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, La/wsc;

    .line 28
    .line 29
    iget-object p0, p0, La/wsc;->a:La/gst0;

    .line 30
    .line 31
    invoke-virtual {p0}, La/gst0;->j()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v1, v2

    .line 36
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 42
    .line 43
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    check-cast v3, La/nc0;

    .line 47
    .line 48
    invoke-static {p0}, La/agc;->W(Ljava/lang/Throwable;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    iget-object p0, v3, La/nc0;->k:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/s4v;

    .line 57
    .line 58
    iget-object p0, p0, La/s4v;->a:La/gst0;

    .line 59
    .line 60
    invoke-virtual {p0}, La/gst0;->i()V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move v1, v2

    .line 65
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 71
    .line 72
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    check-cast v3, La/rrd;

    .line 76
    .line 77
    invoke-static {p0}, La/agc;->W(Ljava/lang/Throwable;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_2

    .line 82
    .line 83
    iget-object p0, v3, La/rrd;->f:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p0, La/t4v;

    .line 86
    .line 87
    invoke-virtual {p0}, La/t4v;->a()V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move v1, v2

    .line 92
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 98
    .line 99
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    check-cast v3, La/wdu;

    .line 103
    .line 104
    invoke-static {p0}, La/agc;->W(Ljava/lang/Throwable;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-eqz p0, :cond_3

    .line 109
    .line 110
    iget-object p0, v3, La/wdu;->f:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, La/wsc;

    .line 113
    .line 114
    invoke-virtual {p0}, La/wsc;->a()V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_3
    move v1, v2

    .line 119
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 125
    .line 126
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    check-cast v3, La/qgd;

    .line 130
    .line 131
    invoke-static {p0}, La/agc;->W(Ljava/lang/Throwable;)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-eqz p0, :cond_4

    .line 136
    .line 137
    iget-object p0, v3, La/qgd;->g:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p0, La/t4v;

    .line 140
    .line 141
    invoke-virtual {p0}, La/t4v;->a()V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_4
    move v1, v2

    .line 146
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 152
    .line 153
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    check-cast v3, La/ywq0;

    .line 157
    .line 158
    invoke-static {p0}, La/agc;->W(Ljava/lang/Throwable;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-eqz p0, :cond_5

    .line 163
    .line 164
    iget-object p0, v3, La/ywq0;->f:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p0, La/wsc;

    .line 167
    .line 168
    invoke-virtual {p0}, La/wsc;->a()V

    .line 169
    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_5
    move v1, v2

    .line 173
    :goto_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/h0v;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/h0v;->k:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, La/kmq;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Throwable;

    .line 8
    .line 9
    check-cast p3, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 12
    .line 13
    .line 14
    check-cast p4, La/yje;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    new-instance p1, La/h0v;

    .line 20
    .line 21
    check-cast p0, La/qv2;

    .line 22
    .line 23
    const/4 p3, 0x5

    .line 24
    invoke-direct {p1, p0, p4, p3}, La/h0v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p1, La/h0v;->j:Ljava/lang/Throwable;

    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p1, p0}, La/h0v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_0
    new-instance p1, La/h0v;

    .line 37
    .line 38
    check-cast p0, La/nc0;

    .line 39
    .line 40
    const/4 p3, 0x4

    .line 41
    invoke-direct {p1, p0, p4, p3}, La/h0v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p1, La/h0v;->j:Ljava/lang/Throwable;

    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    invoke-virtual {p1, p0}, La/h0v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_1
    new-instance p1, La/h0v;

    .line 54
    .line 55
    check-cast p0, La/rrd;

    .line 56
    .line 57
    const/4 p3, 0x3

    .line 58
    invoke-direct {p1, p0, p4, p3}, La/h0v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 59
    .line 60
    .line 61
    iput-object p2, p1, La/h0v;->j:Ljava/lang/Throwable;

    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    invoke-virtual {p1, p0}, La/h0v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :pswitch_2
    new-instance p1, La/h0v;

    .line 71
    .line 72
    check-cast p0, La/wdu;

    .line 73
    .line 74
    const/4 p3, 0x2

    .line 75
    invoke-direct {p1, p0, p4, p3}, La/h0v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 76
    .line 77
    .line 78
    iput-object p2, p1, La/h0v;->j:Ljava/lang/Throwable;

    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    invoke-virtual {p1, p0}, La/h0v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :pswitch_3
    new-instance p1, La/h0v;

    .line 88
    .line 89
    check-cast p0, La/qgd;

    .line 90
    .line 91
    const/4 p3, 0x1

    .line 92
    invoke-direct {p1, p0, p4, p3}, La/h0v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 93
    .line 94
    .line 95
    iput-object p2, p1, La/h0v;->j:Ljava/lang/Throwable;

    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    invoke-virtual {p1, p0}, La/h0v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :pswitch_4
    new-instance p1, La/h0v;

    .line 105
    .line 106
    check-cast p0, La/ywq0;

    .line 107
    .line 108
    const/4 p3, 0x0

    .line 109
    invoke-direct {p1, p0, p4, p3}, La/h0v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 110
    .line 111
    .line 112
    iput-object p2, p1, La/h0v;->j:Ljava/lang/Throwable;

    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    invoke-virtual {p1, p0}, La/h0v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
