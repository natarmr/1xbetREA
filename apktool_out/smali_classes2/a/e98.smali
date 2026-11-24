.class public final La/e98;
.super La/ir20;
.source "SourceFile"


# instance fields
.field public final synthetic f:B


# direct methods
.method public synthetic constructor <init>(La/v9d;La/y78;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/e98;->f:B

    invoke-direct {p0, p2, p1}, La/ir20;-><init>(La/y78;La/v9d;)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-byte p0, p0, La/e98;->f:B

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x1

    return p0

    :pswitch_0
    const/4 p0, 0x0

    return p0

    :pswitch_1
    const/4 p0, 0x1

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(La/k810;)I
    .locals 1

    .line 1
    iget-byte p0, p0, La/e98;->f:B

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, La/k810;->b()Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    :cond_0
    return v0

    .line 18
    :pswitch_0
    invoke-virtual {p1}, La/k810;->c()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :pswitch_1
    invoke-virtual {p1}, La/k810;->b()Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    :cond_1
    return v0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(La/v9d;La/k810;)La/hr20;
    .locals 4

    .line 1
    iget-byte v0, p0, La/e98;->f:B

    .line 2
    .line 3
    iget-object v1, p0, La/ir20;->a:La/v9d;

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget p1, p2, La/k810;->b:I

    .line 15
    .line 16
    if-ne p1, v3, :cond_6

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    if-ne p1, v3, :cond_5

    .line 22
    .line 23
    new-instance p1, La/s43;

    .line 24
    .line 25
    const/16 v0, 0xa

    .line 26
    .line 27
    invoke-direct {p1, v1, v0}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    move-object v2, p2

    .line 32
    :cond_0
    invoke-virtual {p1, v2}, La/s43;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-virtual {v2}, La/k810;->d()La/k810;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    const/4 v3, 0x4

    .line 56
    if-le v0, v3, :cond_0

    .line 57
    .line 58
    :cond_2
    :goto_0
    invoke-virtual {p0, p2, v0}, La/ir20;->e(La/k810;I)La/k810;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-nez p0, :cond_3

    .line 63
    .line 64
    sget-object p0, La/hr20;->f:La/hr20;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    const/4 p1, 0x0

    .line 68
    invoke-static {v1, p0, p1}, La/idx;->s(La/v9d;La/k810;Z)La/v9d;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0, v1}, La/idx;->w(La/v9d;La/v9d;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_4

    .line 77
    .line 78
    sget-object p0, La/hr20;->f:La/hr20;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    sget-object p0, La/hr20;->e:La/hr20;

    .line 82
    .line 83
    :goto_1
    return-object p0

    .line 84
    :cond_5
    new-instance p0, La/byw;

    .line 85
    .line 86
    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p0

    .line 90
    :cond_6
    new-instance p0, La/byw;

    .line 91
    .line 92
    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    :pswitch_0
    iget p0, p2, La/k810;->b:I

    .line 97
    .line 98
    if-eq p0, v3, :cond_7

    .line 99
    .line 100
    sget-object p0, La/hr20;->e:La/hr20;

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_7
    sget-object p0, La/hr20;->f:La/hr20;

    .line 104
    .line 105
    :goto_2
    return-object p0

    .line 106
    :pswitch_1
    iget p0, p2, La/k810;->b:I

    .line 107
    .line 108
    if-ne p0, v3, :cond_9

    .line 109
    .line 110
    invoke-static {v1, p2}, La/idx;->r(La/v9d;La/k810;)La/v9d;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p0, v1}, La/idx;->w(La/v9d;La/v9d;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-nez p0, :cond_8

    .line 119
    .line 120
    sget-object p0, La/hr20;->f:La/hr20;

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_8
    sget-object p0, La/hr20;->d:La/hr20;

    .line 124
    .line 125
    :goto_3
    return-object p0

    .line 126
    :cond_9
    new-instance p0, La/byw;

    .line 127
    .line 128
    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p0

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()La/ar20;
    .locals 0

    .line 1
    iget-byte p0, p0, La/e98;->f:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, La/wb;->p:La/ar20;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    sget-object p0, La/cy2;->Y:La/ar20;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    sget-object p0, La/wb;->q:La/ar20;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(La/k810;)Z
    .locals 3

    .line 1
    iget-byte p0, p0, La/e98;->f:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, -0x1

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget p0, p1, La/k810;->b:I

    .line 10
    .line 11
    if-ne p0, v2, :cond_0

    .line 12
    .line 13
    move v0, v1

    .line 14
    :cond_0
    return v0

    .line 15
    :pswitch_0
    iget p0, p1, La/k810;->b:I

    .line 16
    .line 17
    if-ne p0, v2, :cond_1

    .line 18
    .line 19
    move v0, v1

    .line 20
    :cond_1
    return v0

    .line 21
    :pswitch_1
    iget p0, p1, La/k810;->b:I

    .line 22
    .line 23
    if-ne p0, v2, :cond_2

    .line 24
    .line 25
    move v0, v1

    .line 26
    :cond_2
    return v0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
