.class public final synthetic La/tvs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dws0;


# direct methods
.method public synthetic constructor <init>(La/dws0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tvs0;->a:B

    iput-object p1, p0, La/tvs0;->b:La/dws0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/tvs0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/tvs0;->b:La/dws0;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p2, p1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    instance-of v0, p1, Ljava/net/UnknownHostException;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    :goto_0
    iget-object p0, p0, La/dws0;->j:La/ol60;

    .line 25
    .line 26
    sget-object p1, La/zvs0;->a:La/zvs0;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    instance-of v0, p1, La/zhi0;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    new-instance v0, La/pvs0;

    .line 37
    .line 38
    check-cast p1, La/zhi0;

    .line 39
    .line 40
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 41
    .line 42
    invoke-interface {p1}, La/kuw;->getErrorCode()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-direct {v0, p1, p2}, La/pvs0;-><init>(ILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, La/dws0;->j:La/ol60;

    .line 50
    .line 51
    new-instance p1, La/xvs0;

    .line 52
    .line 53
    invoke-direct {p1, v0}, La/xvs0;-><init>(La/rvs0;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    instance-of p2, p1, La/fn50;

    .line 61
    .line 62
    if-eqz p2, :cond_3

    .line 63
    .line 64
    new-instance v0, La/ovs0;

    .line 65
    .line 66
    check-cast p1, La/fn50;

    .line 67
    .line 68
    iget-object v1, p1, La/fn50;->a:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v2, p1, La/fn50;->b:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v3, p1, La/fn50;->c:Ljava/lang/String;

    .line 73
    .line 74
    iget-boolean v5, p1, La/fn50;->d:Z

    .line 75
    .line 76
    iget-boolean v6, p1, La/fn50;->e:Z

    .line 77
    .line 78
    iget-object v4, p1, La/fn50;->f:Ljava/lang/String;

    .line 79
    .line 80
    iget-boolean v7, p1, La/fn50;->g:Z

    .line 81
    .line 82
    invoke-direct/range {v0 .. v7}, La/ovs0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 83
    .line 84
    .line 85
    iget-object p0, p0, La/dws0;->j:La/ol60;

    .line 86
    .line 87
    new-instance p1, La/xvs0;

    .line 88
    .line 89
    invoke-direct {p1, v0}, La/xvs0;-><init>(La/rvs0;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    iget-object p2, p0, La/dws0;->c:La/ojj;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    new-instance v1, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v2, "Login error: "

    .line 105
    .line 106
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {p2, v0, p1}, La/ojj;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    new-instance p2, La/nvs0;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-nez p1, :cond_4

    .line 130
    .line 131
    const-string p1, ""

    .line 132
    .line 133
    :cond_4
    invoke-direct {p2, v0, p1}, La/nvs0;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-object p0, p0, La/dws0;->j:La/ol60;

    .line 137
    .line 138
    new-instance p1, La/xvs0;

    .line 139
    .line 140
    invoke-direct {p1, p2}, La/xvs0;-><init>(La/rvs0;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_0
    iget-object p0, p0, La/dws0;->j:La/ol60;

    .line 150
    .line 151
    new-instance p1, La/yvs0;

    .line 152
    .line 153
    invoke-direct {p1, p2}, La/yvs0;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

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
        :pswitch_0
    .end packed-switch
.end method
