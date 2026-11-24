.class public final La/duj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/eyg0;

.field public final b:La/ctf0;


# direct methods
.method public constructor <init>(La/eyg0;La/ctf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/duj;->a:La/eyg0;

    .line 5
    .line 6
    iput-object p2, p0, La/duj;->b:La/ctf0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/zuh;

    .line 5
    .line 6
    const/16 v1, 0x15

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/zuh;-><init>(B)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 5
    .line 6
    .line 7
    instance-of v0, p1, La/yxw;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    instance-of v0, p1, La/u660;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    iget-object v2, p0, La/duj;->a:La/eyg0;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    new-instance p0, La/mu00;

    .line 31
    .line 32
    invoke-direct {p0, v1, v1}, La/mu00;-><init>(ZZ)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, p0}, La/eyg0;->m(La/vu00;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    instance-of v0, p1, La/j7t0;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    instance-of v0, p1, La/i660;

    .line 46
    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    :goto_0
    new-instance p0, La/mu00;

    .line 50
    .line 51
    invoke-direct {p0, v3, v1}, La/mu00;-><init>(ZZ)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, p0}, La/eyg0;->m(La/vu00;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_4
    instance-of v0, p1, La/o14;

    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    new-instance p0, La/mu00;

    .line 63
    .line 64
    invoke-direct {p0, v1, v3}, La/mu00;-><init>(ZZ)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, p0}, La/eyg0;->m(La/vu00;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_5
    instance-of v0, p1, La/fpd0;

    .line 72
    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    sget-object p0, La/ou00;->a:La/ou00;

    .line 76
    .line 77
    invoke-virtual {v2, p0}, La/eyg0;->m(La/vu00;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_6
    instance-of v0, p1, La/mki0;

    .line 82
    .line 83
    if-eqz v0, :cond_7

    .line 84
    .line 85
    new-instance p0, La/tu00;

    .line 86
    .line 87
    check-cast p1, La/mki0;

    .line 88
    .line 89
    iget-object p1, p1, La/mki0;->a:Ljava/lang/String;

    .line 90
    .line 91
    invoke-direct {p0, p1}, La/tu00;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, p0}, La/eyg0;->m(La/vu00;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_7
    instance-of v0, p1, La/qtj;

    .line 99
    .line 100
    if-eqz v0, :cond_8

    .line 101
    .line 102
    sget-object p0, La/pu00;->a:La/pu00;

    .line 103
    .line 104
    invoke-virtual {v2, p0}, La/eyg0;->m(La/vu00;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_8
    instance-of v0, p1, La/kcy;

    .line 109
    .line 110
    if-eqz v0, :cond_9

    .line 111
    .line 112
    new-instance p0, La/ss3;

    .line 113
    .line 114
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 115
    .line 116
    .line 117
    check-cast p1, La/kcy;

    .line 118
    .line 119
    iget-object p1, p1, La/ucy;->a:Ljava/lang/String;

    .line 120
    .line 121
    invoke-interface {p2, p0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_9
    instance-of v0, p1, La/zhi0;

    .line 126
    .line 127
    iget-object v1, p0, La/duj;->b:La/ctf0;

    .line 128
    .line 129
    if-eqz v0, :cond_c

    .line 130
    .line 131
    move-object v0, p1

    .line 132
    check-cast v0, La/zhi0;

    .line 133
    .line 134
    iget-object v3, v0, La/zhi0;->c:La/kuw;

    .line 135
    .line 136
    sget-object v4, La/i2o;->H2:La/i2o;

    .line 137
    .line 138
    if-ne v3, v4, :cond_a

    .line 139
    .line 140
    invoke-virtual {p0}, La/duj;->d()V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_a
    sget-object p0, La/i2o;->H4:La/i2o;

    .line 145
    .line 146
    if-ne v3, p0, :cond_b

    .line 147
    .line 148
    new-instance p0, La/nu00;

    .line 149
    .line 150
    invoke-static {v0, v1}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-direct {p0, p1}, La/nu00;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, p0}, La/eyg0;->m(La/vu00;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_b
    invoke-static {p1, v1}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-interface {p2, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_c
    invoke-static {p1, v1}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-interface {p2, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/nu00;

    .line 5
    .line 6
    invoke-direct {v0, p1}, La/nu00;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/duj;->a:La/eyg0;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, La/eyg0;->m(La/vu00;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object p0, p0, La/duj;->a:La/eyg0;

    .line 2
    .line 3
    sget-object v0, La/su00;->a:La/su00;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, La/eyg0;->m(La/vu00;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
