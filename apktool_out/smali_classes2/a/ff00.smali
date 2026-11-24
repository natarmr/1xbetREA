.class public final La/ff00;
.super La/ir20;
.source "SourceFile"


# instance fields
.field public final f:C


# direct methods
.method public constructor <init>(La/v9d;La/y78;C)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2, p1}, La/ir20;-><init>(La/y78;La/v9d;)V

    .line 5
    .line 6
    .line 7
    iput-char p3, p0, La/ff00;->f:C

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final b(La/k810;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, La/k810;->b()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, -0x1

    .line 13
    return p0
.end method

.method public final c(La/v9d;La/k810;)La/hr20;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p1, p2, La/k810;->b:I

    .line 5
    .line 6
    const-string v0, ""

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne p1, v1, :cond_7

    .line 10
    .line 11
    iget-object v2, p0, La/ir20;->a:La/v9d;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    if-ne p1, v1, :cond_6

    .line 17
    .line 18
    new-instance p1, La/s43;

    .line 19
    .line 20
    const/16 v0, 0xa

    .line 21
    .line 22
    invoke-direct {p1, v2, v0}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    move-object v1, p2

    .line 27
    move v3, v0

    .line 28
    :cond_0
    invoke-virtual {p1, v1}, La/s43;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, La/k810;->d()La/k810;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    const/4 v4, 0x4

    .line 52
    if-le v3, v4, :cond_0

    .line 53
    .line 54
    :cond_2
    :goto_0
    invoke-virtual {p0, p2, v3}, La/ir20;->e(La/k810;I)La/k810;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-nez p0, :cond_3

    .line 59
    .line 60
    sget-object p0, La/hr20;->f:La/hr20;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    const/4 p1, 0x0

    .line 64
    invoke-static {v2, p0, p1}, La/idx;->s(La/v9d;La/k810;Z)La/v9d;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    iget-object p1, v2, La/v9d;->b:[C

    .line 69
    .line 70
    array-length p2, p1

    .line 71
    if-eqz p2, :cond_5

    .line 72
    .line 73
    invoke-virtual {p0, v2}, La/v9d;->f(La/v9d;)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_4

    .line 78
    .line 79
    array-length p1, p1

    .line 80
    sub-int/2addr p1, v0

    .line 81
    invoke-virtual {p0, p1}, La/v9d;->c(I)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-nez p0, :cond_4

    .line 86
    .line 87
    sget-object p0, La/hr20;->d:La/hr20;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_4
    sget-object p0, La/hr20;->f:La/hr20;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_5
    const-string p0, "List constraints should contain at least one item"

    .line 94
    .line 95
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/4 p0, 0x0

    .line 99
    return-object p0

    .line 100
    :cond_6
    new-instance p0, La/byw;

    .line 101
    .line 102
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p0

    .line 106
    :cond_7
    new-instance p0, La/byw;

    .line 107
    .line 108
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p0
.end method

.method public final d()La/ar20;
    .locals 1

    .line 1
    const/16 v0, 0x2d

    .line 2
    .line 3
    iget-char p0, p0, La/ff00;->f:C

    .line 4
    .line 5
    if-eq p0, v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0x2a

    .line 8
    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    const/16 v0, 0x2b

    .line 12
    .line 13
    if-ne p0, v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p0, La/wb;->o:La/ar20;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_0
    sget-object p0, La/wb;->n:La/ar20;

    .line 20
    .line 21
    return-object p0
.end method

.method public final f(La/k810;)Z
    .locals 0

    .line 1
    iget p0, p1, La/k810;->b:I

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    if-ne p0, p1, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method
