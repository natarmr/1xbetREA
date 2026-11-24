.class public final La/gdx;
.super La/mb00;
.source "SourceFile"


# virtual methods
.method public final b(La/j;Ljava/lang/String;)La/lb00;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/wb;->C:La/ar20;

    .line 5
    .line 6
    invoke-static {p1, p0}, La/dwi0;->L(La/j;La/ar20;)La/j;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    sget-object v1, La/wb;->A:La/ar20;

    .line 15
    .line 16
    invoke-static {p1, v1}, La/dwi0;->L(La/j;La/ar20;)La/j;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-static {v1, p2}, La/dwi0;->N(La/j;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    sget-object v3, La/pb00;->b:Lkotlin/text/Regex;

    .line 30
    .line 31
    invoke-static {v1, v2}, La/efx;->E(Ljava/lang/CharSequence;Z)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const-string v1, ""

    .line 37
    .line 38
    :goto_0
    sget-object v3, La/wb;->B:La/ar20;

    .line 39
    .line 40
    invoke-static {p1, v3}, La/dwi0;->L(La/j;La/ar20;)La/j;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    invoke-static {p1, p2}, La/dwi0;->N(La/j;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    sget-object p2, La/pb00;->b:Lkotlin/text/Regex;

    .line 53
    .line 54
    sget-object p2, La/tzn;->a:Ljava/util/Map;

    .line 55
    .line 56
    const-string p2, "\'\'"

    .line 57
    .line 58
    const-string v0, "()"

    .line 59
    .line 60
    const-string v3, "\"\""

    .line 61
    .line 62
    filled-new-array {v3, p2, v0}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-static {p1, p2}, La/efx;->r(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1, v2, v2}, La/tzn;->a(Ljava/lang/CharSequence;ZZ)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :cond_2
    new-instance p1, La/lb00;

    .line 75
    .line 76
    invoke-direct {p1, p0, v1, v0}, La/lb00;-><init>(La/j;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 77
    .line 78
    .line 79
    return-object p1
.end method
