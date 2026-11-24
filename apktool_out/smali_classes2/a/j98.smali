.class public final La/j98;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/j98;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La/w5z;La/ljf0;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte p0, p0, La/j98;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p0, La/i98;

    .line 8
    .line 9
    iget-object p1, p1, La/w5z;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, La/b930;

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-direct {p0, p1, p2}, La/i98;-><init>(La/b930;B)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    new-instance p0, La/ltn;

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    invoke-direct {p0, p1}, La/ltn;-><init>(B)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_1
    new-instance p0, Landroid/text/style/StrikethroughSpan;

    .line 26
    .line 27
    invoke-direct {p0}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_2
    iget-object p0, p1, La/w5z;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, La/b930;

    .line 34
    .line 35
    sget-object p1, La/uc9;->n:La/zzc0;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, La/zzc0;->a(La/ljf0;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-object v0, La/jme;->a:La/jme;

    .line 42
    .line 43
    if-ne v0, p1, :cond_0

    .line 44
    .line 45
    new-instance p1, La/pd9;

    .line 46
    .line 47
    sget-object v0, La/uc9;->o:La/zzc0;

    .line 48
    .line 49
    invoke-virtual {v0, p2}, La/zzc0;->a(La/ljf0;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-direct {p1, p0, p2}, La/pd9;-><init>(La/b930;I)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sget-object p1, La/uc9;->p:La/zzc0;

    .line 64
    .line 65
    invoke-virtual {p1, p2}, La/zzc0;->a(La/ljf0;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-string p2, ".\u00a0"

    .line 74
    .line 75
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance p2, La/ga80;

    .line 80
    .line 81
    invoke-direct {p2, p0, p1}, La/ga80;-><init>(La/b930;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    move-object p1, p2

    .line 85
    :goto_0
    return-object p1

    .line 86
    :pswitch_3
    new-instance p0, Lio/noties/markwon/core/spans/LinkSpan;

    .line 87
    .line 88
    iget-object v0, p1, La/w5z;->a:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, La/b930;

    .line 91
    .line 92
    sget-object v1, La/uc9;->r:La/zzc0;

    .line 93
    .line 94
    invoke-virtual {v1, p2}, La/zzc0;->a(La/ljf0;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    check-cast p2, Ljava/lang/String;

    .line 99
    .line 100
    iget-object p1, p1, La/w5z;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, La/ub00;

    .line 103
    .line 104
    invoke-direct {p0, v0, p2, p1}, Lio/noties/markwon/core/spans/LinkSpan;-><init>(La/b930;Ljava/lang/String;La/ub00;)V

    .line 105
    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_4
    new-instance p0, La/gtv;

    .line 109
    .line 110
    iget-object p1, p1, La/w5z;->a:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p1, La/b930;

    .line 113
    .line 114
    sget-object v0, La/uc9;->q:La/zzc0;

    .line 115
    .line 116
    invoke-virtual {v0, p2}, La/zzc0;->a(La/ljf0;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    check-cast p2, Ljava/lang/Integer;

    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    invoke-direct {p0, p1, p2}, La/gtv;-><init>(La/b930;I)V

    .line 127
    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_5
    new-instance p0, La/ltn;

    .line 131
    .line 132
    invoke-direct {p0, v0}, La/ltn;-><init>(B)V

    .line 133
    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_6
    new-instance p0, La/fyc;

    .line 137
    .line 138
    iget-object p1, p1, La/w5z;->a:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p1, La/b930;

    .line 141
    .line 142
    invoke-direct {p0, p1, v0}, La/fyc;-><init>(Ljava/lang/Object;B)V

    .line 143
    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_7
    new-instance p0, La/xxc;

    .line 147
    .line 148
    iget-object p1, p1, La/w5z;->a:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p1, La/b930;

    .line 151
    .line 152
    invoke-direct {p0, p1}, La/xxc;-><init>(La/b930;)V

    .line 153
    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_8
    new-instance p0, La/i98;

    .line 157
    .line 158
    iget-object p1, p1, La/w5z;->a:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p1, La/b930;

    .line 161
    .line 162
    invoke-direct {p0, p1, v0}, La/i98;-><init>(La/b930;B)V

    .line 163
    .line 164
    .line 165
    return-object p0

    .line 166
    nop

    .line 167
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
