.class public interface abstract La/gfi0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(La/gfi0;Ljava/lang/String;La/rei0;La/g45;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p4, La/ffi0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/ffi0;

    .line 7
    .line 8
    iget v1, v0, La/ffi0;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/ffi0;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ffi0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/ffi0;-><init>(La/gfi0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La/ffi0;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p4, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/ffi0;->n:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    iget-object p3, v0, La/ffi0;->k:La/g45;

    .line 38
    .line 39
    iget-object p2, v0, La/ffi0;->j:La/rei0;

    .line 40
    .line 41
    iget-object p1, v0, La/ffi0;->i:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p3, La/g45;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/vae;

    .line 59
    .line 60
    iget-object p0, p0, La/vae;->r:La/p7m0;

    .line 61
    .line 62
    iput-object p1, v0, La/ffi0;->i:Ljava/lang/String;

    .line 63
    .line 64
    iput-object p2, v0, La/ffi0;->j:La/rei0;

    .line 65
    .line 66
    iput-object p3, v0, La/ffi0;->k:La/g45;

    .line 67
    .line 68
    iput v3, v0, La/ffi0;->n:I

    .line 69
    .line 70
    invoke-static {p0, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, p4, :cond_3

    .line 75
    .line 76
    return-object p4

    .line 77
    :cond_3
    :goto_1
    check-cast p0, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-nez p0, :cond_4

    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_4
    if-eqz p2, :cond_6

    .line 89
    .line 90
    instance-of p0, p2, La/pei0;

    .line 91
    .line 92
    if-eqz p0, :cond_5

    .line 93
    .line 94
    check-cast p2, La/pei0;

    .line 95
    .line 96
    iget-object v1, p2, La/pei0;->a:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v2, p2, La/pei0;->b:Ljava/util/List;

    .line 99
    .line 100
    iget-object v3, p2, La/pei0;->c:Ljava/util/Date;

    .line 101
    .line 102
    iget-object v4, p2, La/pei0;->d:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v0, La/pei0;

    .line 117
    .line 118
    const/4 v5, 0x1

    .line 119
    invoke-direct/range {v0 .. v5}, La/pei0;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/Date;Ljava/lang/String;Z)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    instance-of p0, p2, La/qei0;

    .line 124
    .line 125
    if-eqz p0, :cond_6

    .line 126
    .line 127
    check-cast p2, La/qei0;

    .line 128
    .line 129
    iget-object v1, p2, La/qei0;->a:Ljava/lang/String;

    .line 130
    .line 131
    iget-object v2, p2, La/qei0;->b:La/h8d;

    .line 132
    .line 133
    iget-object v3, p2, La/qei0;->c:Ljava/util/Date;

    .line 134
    .line 135
    iget-object v4, p2, La/qei0;->d:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    new-instance v0, La/qei0;

    .line 150
    .line 151
    const/4 v5, 0x1

    .line 152
    invoke-direct/range {v0 .. v5}, La/qei0;-><init>(Ljava/lang/String;La/h8d;Ljava/util/Date;Ljava/lang/String;Z)V

    .line 153
    .line 154
    .line 155
    :goto_2
    invoke-virtual {p3, p1}, La/g45;->b0(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p3, p1, v0}, La/g45;->d(Ljava/lang/String;La/rei0;)V

    .line 159
    .line 160
    .line 161
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object p0

    .line 164
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 165
    .line 166
    .line 167
    return-object v2
.end method

.method public static b(La/g45;)Lkotlin/Unit;
    .locals 10

    .line 1
    iget-object v0, p0, La/g45;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/i7e;

    .line 4
    .line 5
    iget-object v1, v0, La/i7e;->i:La/p7m0;

    .line 6
    .line 7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, La/gxb;

    .line 12
    .line 13
    iget-object v1, v1, La/gxb;->f:La/v9k0;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v0, v0, La/i7e;->i:La/p7m0;

    .line 18
    .line 19
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, La/gxb;

    .line 25
    .line 26
    iget-object v0, v1, La/gxb;->f:La/v9k0;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    new-instance v4, Ljava/lang/Long;

    .line 35
    .line 36
    invoke-direct {v4, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 37
    .line 38
    .line 39
    iget-wide v2, v0, La/v9k0;->a:J

    .line 40
    .line 41
    new-instance v0, La/v9k0;

    .line 42
    .line 43
    invoke-direct {v0, v4, v2, v3}, La/v9k0;-><init>(Ljava/lang/Long;J)V

    .line 44
    .line 45
    .line 46
    :goto_0
    move-object v5, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    const/4 v0, 0x0

    .line 49
    goto :goto_0

    .line 50
    :goto_1
    const/4 v8, 0x0

    .line 51
    const/16 v9, 0x3df

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    const/4 v6, 0x0

    .line 57
    const/4 v7, 0x0

    .line 58
    invoke-static/range {v1 .. v9}, La/gxb;->a(La/gxb;ZIILa/v9k0;ZLjava/util/List;La/vxy;I)La/gxb;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p0, v0}, La/g45;->j0(La/gxb;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0
.end method
