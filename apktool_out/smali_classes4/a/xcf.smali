.class public final La/xcf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static c(La/t33;La/t33;La/t33;La/t33;La/t33;Lkotlin/jvm/functions/Function0;La/fea;)Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v0, La/s6d;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    move-object v2, p0

    .line 5
    move-object v3, p1

    .line 6
    move-object v4, p2

    .line 7
    move-object v5, p3

    .line 8
    move-object v6, p4

    .line 9
    move-object v1, p5

    .line 10
    invoke-direct/range {v0 .. v7}, La/s6d;-><init>(Lkotlin/jvm/functions/Function0;La/t33;La/t33;La/t33;La/t33;La/t33;La/yje;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p6, v0}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/wne;->a:La/wne;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0
.end method


# virtual methods
.method public final a(La/t33;FLa/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, La/pcf;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/pcf;

    .line 7
    .line 8
    iget v1, v0, La/pcf;->k:I

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
    iput v1, v0, La/pcf;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/pcf;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, La/pcf;-><init>(La/xcf;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p0, v6, La/pcf;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object p3, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v0, v6, La/pcf;->k:I

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    if-ne v0, v1, :cond_1

    .line 37
    .line 38
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, Ljava/lang/Float;

    .line 53
    .line 54
    invoke-direct {v2, p2}, Ljava/lang/Float;-><init>(F)V

    .line 55
    .line 56
    .line 57
    sget-object p0, La/ihn;->d:La/z73;

    .line 58
    .line 59
    const/4 p2, 0x2

    .line 60
    const/16 v0, 0x320

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-static {v0, v3, p0, p2}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iput v1, v6, La/pcf;->k:I

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    const/16 v7, 0xc

    .line 72
    .line 73
    move-object v1, p1

    .line 74
    invoke-static/range {v1 .. v7}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, p3, :cond_3

    .line 79
    .line 80
    return-object p3

    .line 81
    :cond_3
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0
.end method

.method public final b(La/t33;FLa/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, La/scf;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/scf;

    .line 7
    .line 8
    iget v1, v0, La/scf;->k:I

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
    iput v1, v0, La/scf;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/scf;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, La/scf;-><init>(La/xcf;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p0, v6, La/scf;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object p3, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v0, v6, La/scf;->k:I

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    if-ne v0, v1, :cond_1

    .line 37
    .line 38
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, Ljava/lang/Float;

    .line 53
    .line 54
    invoke-direct {v2, p2}, Ljava/lang/Float;-><init>(F)V

    .line 55
    .line 56
    .line 57
    sget-object p0, La/ihn;->d:La/z73;

    .line 58
    .line 59
    const/4 p2, 0x2

    .line 60
    const/16 v0, 0xc8

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-static {v0, v3, p0, p2}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iput v1, v6, La/scf;->k:I

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    const/16 v7, 0xc

    .line 72
    .line 73
    move-object v1, p1

    .line 74
    invoke-static/range {v1 .. v7}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, p3, :cond_3

    .line 79
    .line 80
    return-object p3

    .line 81
    :cond_3
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0
.end method

.method public final d(La/t33;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/ucf;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ucf;

    .line 7
    .line 8
    iget v1, v0, La/ucf;->k:I

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
    iput v1, v0, La/ucf;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/ucf;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/ucf;-><init>(La/xcf;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p0, v6, La/ucf;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object p2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v0, v6, La/ucf;->k:I

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    if-ne v0, v1, :cond_1

    .line 37
    .line 38
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, Ljava/lang/Float;

    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    invoke-direct {v2, p0}, Ljava/lang/Float;-><init>(F)V

    .line 56
    .line 57
    .line 58
    sget-object p0, La/ihn;->d:La/z73;

    .line 59
    .line 60
    const/4 v0, 0x2

    .line 61
    const/16 v3, 0x320

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-static {v3, v4, p0, v0}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iput v1, v6, La/ucf;->k:I

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    const/4 v5, 0x0

    .line 72
    const/16 v7, 0xc

    .line 73
    .line 74
    move-object v1, p1

    .line 75
    invoke-static/range {v1 .. v7}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-ne p0, p2, :cond_3

    .line 80
    .line 81
    return-object p2

    .line 82
    :cond_3
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0
.end method

.method public final e(La/t33;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/vcf;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/vcf;

    .line 7
    .line 8
    iget v1, v0, La/vcf;->k:I

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
    iput v1, v0, La/vcf;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/vcf;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/vcf;-><init>(La/xcf;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p0, v6, La/vcf;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object p2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v0, v6, La/vcf;->k:I

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    if-ne v0, v1, :cond_1

    .line 37
    .line 38
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, Ljava/lang/Float;

    .line 53
    .line 54
    const/high16 p0, 0x41700000    # 15.0f

    .line 55
    .line 56
    invoke-direct {v2, p0}, Ljava/lang/Float;-><init>(F)V

    .line 57
    .line 58
    .line 59
    sget-object p0, La/ihn;->d:La/z73;

    .line 60
    .line 61
    const/4 v0, 0x2

    .line 62
    const/16 v3, 0x320

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-static {v3, v4, p0, v0}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sget-object v0, La/kkf0;->b:La/kkf0;

    .line 70
    .line 71
    const-wide/16 v3, 0x0

    .line 72
    .line 73
    const/4 v5, 0x4

    .line 74
    invoke-static {p0, v0, v3, v4, v5}, La/ro4;->b0(La/xen;La/kkf0;JI)La/w7x;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iput v1, v6, La/vcf;->k:I

    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    const/16 v7, 0xc

    .line 83
    .line 84
    move-object v1, p1

    .line 85
    invoke-static/range {v1 .. v7}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-ne p0, p2, :cond_3

    .line 90
    .line 91
    return-object p2

    .line 92
    :cond_3
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0
.end method

.method public final f(La/t33;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/wcf;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/wcf;

    .line 7
    .line 8
    iget v1, v0, La/wcf;->k:I

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
    iput v1, v0, La/wcf;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/wcf;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/wcf;-><init>(La/xcf;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p0, v6, La/wcf;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object p2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v0, v6, La/wcf;->k:I

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    if-ne v0, v1, :cond_1

    .line 37
    .line 38
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, Ljava/lang/Float;

    .line 53
    .line 54
    const/high16 p0, -0x3f600000    # -5.0f

    .line 55
    .line 56
    invoke-direct {v2, p0}, Ljava/lang/Float;-><init>(F)V

    .line 57
    .line 58
    .line 59
    sget-object p0, La/ihn;->d:La/z73;

    .line 60
    .line 61
    const/4 v0, 0x2

    .line 62
    const/16 v3, 0x320

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-static {v3, v4, p0, v0}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sget-object v0, La/kkf0;->b:La/kkf0;

    .line 70
    .line 71
    const-wide/16 v3, 0x0

    .line 72
    .line 73
    const/4 v5, 0x4

    .line 74
    invoke-static {p0, v0, v3, v4, v5}, La/ro4;->b0(La/xen;La/kkf0;JI)La/w7x;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iput v1, v6, La/wcf;->k:I

    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    const/16 v7, 0xc

    .line 83
    .line 84
    move-object v1, p1

    .line 85
    invoke-static/range {v1 .. v7}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-ne p0, p2, :cond_3

    .line 90
    .line 91
    return-object p2

    .line 92
    :cond_3
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0
.end method
