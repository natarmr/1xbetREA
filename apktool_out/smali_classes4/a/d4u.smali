.class public final La/d4u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/lbu;

.field public final b:La/f3u;

.field public final c:La/u8u;

.field public final d:La/v7i;

.field public final e:La/rtu;

.field public final f:La/pmi;

.field public final g:La/j3c;

.field public final h:La/yuu;

.field public final i:La/q8u;

.field public final j:La/bnu;

.field public final k:La/cyg0;

.field public final l:La/lyt;

.field public final m:La/xsu;

.field public final n:La/wti;

.field public final o:La/ocl;

.field public final p:La/n0o0;


# direct methods
.method public constructor <init>(La/lbu;La/f3u;La/u8u;La/v7i;La/rtu;La/pmi;La/j3c;La/yuu;La/pru;La/q8u;La/bnu;La/cyg0;La/lyt;La/xsu;La/wti;La/ocl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/d4u;->a:La/lbu;

    .line 5
    .line 6
    iput-object p2, p0, La/d4u;->b:La/f3u;

    .line 7
    .line 8
    iput-object p3, p0, La/d4u;->c:La/u8u;

    .line 9
    .line 10
    iput-object p4, p0, La/d4u;->d:La/v7i;

    .line 11
    .line 12
    iput-object p5, p0, La/d4u;->e:La/rtu;

    .line 13
    .line 14
    iput-object p6, p0, La/d4u;->f:La/pmi;

    .line 15
    .line 16
    iput-object p7, p0, La/d4u;->g:La/j3c;

    .line 17
    .line 18
    iput-object p8, p0, La/d4u;->h:La/yuu;

    .line 19
    .line 20
    iput-object p10, p0, La/d4u;->i:La/q8u;

    .line 21
    .line 22
    iput-object p11, p0, La/d4u;->j:La/bnu;

    .line 23
    .line 24
    iput-object p12, p0, La/d4u;->k:La/cyg0;

    .line 25
    .line 26
    iput-object p13, p0, La/d4u;->l:La/lyt;

    .line 27
    .line 28
    iput-object p14, p0, La/d4u;->m:La/xsu;

    .line 29
    .line 30
    iput-object p15, p0, La/d4u;->n:La/wti;

    .line 31
    .line 32
    move-object/from16 p1, p16

    .line 33
    .line 34
    iput-object p1, p0, La/d4u;->o:La/ocl;

    .line 35
    .line 36
    new-instance p1, La/hc0;

    .line 37
    .line 38
    const/16 p2, 0x1c

    .line 39
    .line 40
    invoke-direct {p1, p9, p2}, La/hc0;-><init>(La/pru;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, La/d4u;->p:La/n0o0;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a(ILa/zje;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/m3u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/m3u;

    .line 7
    .line 8
    iget v1, v0, La/m3u;->l:I

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
    iput v1, v0, La/m3u;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/m3u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/m3u;-><init>(La/d4u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/m3u;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/m3u;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, La/m3u;->i:La/d4u;

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 53
    .line 54
    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    iput-object p0, v0, La/m3u;->i:La/d4u;

    .line 61
    .line 62
    iput v3, v0, La/m3u;->l:I

    .line 63
    .line 64
    iget-object p2, p0, La/d4u;->n:La/wti;

    .line 65
    .line 66
    invoke-virtual {p2, p1, v0}, La/wti;->m(ILa/zje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    if-ne p2, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p2, La/gmq;

    .line 74
    .line 75
    new-instance p1, La/a1t;

    .line 76
    .line 77
    const/4 p3, 0x7

    .line 78
    invoke-direct {p1, p2, p3}, La/a1t;-><init>(La/gmq;B)V

    .line 79
    .line 80
    .line 81
    iget-object p0, p0, La/d4u;->o:La/ocl;

    .line 82
    .line 83
    iget-object p0, p0, La/ocl;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p0, La/m0o0;

    .line 86
    .line 87
    invoke-virtual {p0}, La/m0o0;->b()La/gmq;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    new-instance p2, La/c4u;

    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    const/4 v1, 0x3

    .line 95
    invoke-direct {p2, v1, v4, v0}, La/c4u;-><init>(ILa/yje;B)V

    .line 96
    .line 97
    .line 98
    new-instance v0, La/p6d;

    .line 99
    .line 100
    invoke-direct {v0, p0, p1, p2, v3}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 101
    .line 102
    .line 103
    new-instance p0, La/rl2;

    .line 104
    .line 105
    invoke-direct {p0, v1, v4, p3}, La/rl2;-><init>(ILa/yje;B)V

    .line 106
    .line 107
    .line 108
    new-instance p1, La/dnq;

    .line 109
    .line 110
    invoke-direct {p1, v0, p0, v3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 111
    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_4
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 115
    .line 116
    sget-object p0, La/iun;->a:La/iun;

    .line 117
    .line 118
    new-instance p1, La/j0g0;

    .line 119
    .line 120
    invoke-direct {p1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    new-instance p0, La/eu4;

    .line 124
    .line 125
    const/16 p2, 0xc

    .line 126
    .line 127
    invoke-direct {p0, p1, p2}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 128
    .line 129
    .line 130
    return-object p0
.end method

.method public final b()La/sff0;
    .locals 0

    .line 1
    iget-object p0, p0, La/d4u;->p:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/sff0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final c(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ILa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p4, La/q3u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/q3u;

    .line 7
    .line 8
    iget v1, v0, La/q3u;->k:I

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
    iput v1, v0, La/q3u;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/q3u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/q3u;-><init>(La/d4u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/q3u;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/q3u;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v4

    .line 47
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p4, La/sip;->b:La/sip;

    .line 51
    .line 52
    if-ne p1, p4, :cond_3

    .line 53
    .line 54
    instance-of p4, p2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 55
    .line 56
    if-nez p4, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    sget-object p4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 60
    .line 61
    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    if-nez p4, :cond_5

    .line 66
    .line 67
    iput v3, v0, La/q3u;->k:I

    .line 68
    .line 69
    iget-object p0, p0, La/d4u;->h:La/yuu;

    .line 70
    .line 71
    invoke-virtual {p0, p1, p2, p3, v0}, La/yuu;->s(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ILa/zje;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p4

    .line 75
    if-ne p4, v1, :cond_4

    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_4
    :goto_1
    check-cast p4, La/gmq;

    .line 79
    .line 80
    new-instance p0, La/a1t;

    .line 81
    .line 82
    const/16 p1, 0x8

    .line 83
    .line 84
    invoke-direct {p0, p4, p1}, La/a1t;-><init>(La/gmq;B)V

    .line 85
    .line 86
    .line 87
    new-instance p2, La/rl2;

    .line 88
    .line 89
    const/4 p3, 0x3

    .line 90
    invoke-direct {p2, p3, v4, p1}, La/rl2;-><init>(ILa/yje;B)V

    .line 91
    .line 92
    .line 93
    new-instance p1, La/dnq;

    .line 94
    .line 95
    invoke-direct {p1, p0, p2, v3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 96
    .line 97
    .line 98
    return-object p1

    .line 99
    :cond_5
    :goto_2
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 100
    .line 101
    sget-object p0, La/iun;->a:La/iun;

    .line 102
    .line 103
    new-instance p1, La/j0g0;

    .line 104
    .line 105
    invoke-direct {p1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    new-instance p0, La/eu4;

    .line 109
    .line 110
    const/16 p2, 0xc

    .line 111
    .line 112
    invoke-direct {p0, p1, p2}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 113
    .line 114
    .line 115
    return-object p0
.end method

.method public final d(ILa/zje;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/t3u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/t3u;

    .line 7
    .line 8
    iget v1, v0, La/t3u;->k:I

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
    iput v1, v0, La/t3u;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/t3u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/t3u;-><init>(La/d4u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/t3u;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/t3u;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v4, v0, La/t3u;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/d4u;->b:La/f3u;

    .line 53
    .line 54
    invoke-virtual {p0, p1, v0, p3}, La/f3u;->a(ILa/zje;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    if-ne p2, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_1
    check-cast p2, La/gmq;

    .line 62
    .line 63
    new-instance p0, La/a1t;

    .line 64
    .line 65
    const/16 p1, 0x9

    .line 66
    .line 67
    invoke-direct {p0, p2, p1}, La/a1t;-><init>(La/gmq;B)V

    .line 68
    .line 69
    .line 70
    new-instance p2, La/rl2;

    .line 71
    .line 72
    const/4 p3, 0x3

    .line 73
    invoke-direct {p2, p3, v3, p1}, La/rl2;-><init>(ILa/yje;B)V

    .line 74
    .line 75
    .line 76
    new-instance p1, La/dnq;

    .line 77
    .line 78
    invoke-direct {p1, p0, p2, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 79
    .line 80
    .line 81
    return-object p1
.end method

.method public final e(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/zje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v3, La/u3u;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, La/u3u;

    .line 15
    .line 16
    iget v5, v4, La/u3u;->m:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, La/u3u;->m:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, La/u3u;

    .line 29
    .line 30
    invoke-direct {v4, v0, v3}, La/u3u;-><init>(La/d4u;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, La/u3u;->k:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v6, v4, La/u3u;->m:I

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x1

    .line 41
    if-eqz v6, :cond_2

    .line 42
    .line 43
    if-ne v6, v8, :cond_1

    .line 44
    .line 45
    iget-object v1, v4, La/u3u;->j:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 46
    .line 47
    iget-object v2, v4, La/u3u;->i:La/sip;

    .line 48
    .line 49
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v12, v1

    .line 53
    move-object v11, v2

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v7

    .line 61
    :cond_2
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object v3, La/sip;->b:La/sip;

    .line 65
    .line 66
    if-ne v1, v3, :cond_3

    .line 67
    .line 68
    instance-of v3, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 69
    .line 70
    if-nez v3, :cond_3

    .line 71
    .line 72
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 73
    .line 74
    sget-object v0, La/iun;->a:La/iun;

    .line 75
    .line 76
    new-instance v1, La/j0g0;

    .line 77
    .line 78
    invoke-direct {v1, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, La/eu4;

    .line 82
    .line 83
    const/16 v2, 0xc

    .line 84
    .line 85
    invoke-direct {v0, v1, v2}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_3
    invoke-static {v1}, La/kpb;->u(La/sip;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    iput-object v1, v4, La/u3u;->i:La/sip;

    .line 94
    .line 95
    iput-object v2, v4, La/u3u;->j:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 96
    .line 97
    iput v8, v4, La/u3u;->m:I

    .line 98
    .line 99
    iget-object v6, v0, La/d4u;->e:La/rtu;

    .line 100
    .line 101
    const/4 v9, 0x0

    .line 102
    invoke-virtual {v6, v3, v9, v4}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    if-ne v3, v5, :cond_4

    .line 107
    .line 108
    return-object v5

    .line 109
    :cond_4
    move-object v11, v1

    .line 110
    move-object v12, v2

    .line 111
    :goto_1
    check-cast v3, La/c3c0;

    .line 112
    .line 113
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-object v1, v0, La/d4u;->c:La/u8u;

    .line 123
    .line 124
    iget-object v2, v1, La/u8u;->c:Ljava/lang/Object;

    .line 125
    .line 126
    move-object v10, v2

    .line 127
    check-cast v10, La/n660;

    .line 128
    .line 129
    iget-object v1, v1, La/u8u;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, La/uzc;

    .line 132
    .line 133
    invoke-virtual {v1}, La/uzc;->b()La/jvn;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget-object v2, v10, La/n660;->a:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v2, La/knf0;

    .line 140
    .line 141
    invoke-virtual {v2}, La/knf0;->d()La/lnf0;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    new-instance v4, La/jo20;

    .line 146
    .line 147
    invoke-direct {v4}, La/jo20;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-static {v4, v1}, La/qbt;->a(Ljava/util/Map;La/jvn;)V

    .line 151
    .line 152
    .line 153
    iget v1, v3, La/c3c0;->a:I

    .line 154
    .line 155
    invoke-static {v1, v4}, La/qbt;->c(ILjava/util/Map;)V

    .line 156
    .line 157
    .line 158
    iget v1, v2, La/lnf0;->b:I

    .line 159
    .line 160
    invoke-static {v1, v4}, La/qbt;->g(ILjava/util/Map;)V

    .line 161
    .line 162
    .line 163
    invoke-static {v4}, La/qbt;->h(Ljava/util/Map;)V

    .line 164
    .line 165
    .line 166
    iget-object v1, v2, La/lnf0;->a:Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {v1, v4}, La/qbt;->j(Ljava/lang/String;Ljava/util/Map;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v4}, La/qbt;->l(Ljava/util/Map;)V

    .line 172
    .line 173
    .line 174
    iget-boolean v1, v3, La/c3c0;->b:Z

    .line 175
    .line 176
    iget-wide v2, v3, La/c3c0;->c:J

    .line 177
    .line 178
    invoke-static {v4, v1, v2, v3}, La/qbt;->o(Ljava/util/Map;ZJ)V

    .line 179
    .line 180
    .line 181
    invoke-static {v4}, La/qbt;->p(Ljava/util/Map;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4}, La/jo20;->b()La/jo20;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    iget-object v1, v10, La/n660;->c:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v1, La/fuj0;

    .line 191
    .line 192
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    if-eqz v2, :cond_7

    .line 197
    .line 198
    if-ne v2, v8, :cond_6

    .line 199
    .line 200
    iget-object v1, v1, La/fuj0;->b:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 203
    .line 204
    invoke-virtual {v1, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    if-nez v2, :cond_5

    .line 209
    .line 210
    new-instance v2, La/or30;

    .line 211
    .line 212
    invoke-direct {v2}, La/or30;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-interface {v1, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    :cond_5
    check-cast v2, La/or30;

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 222
    .line 223
    .line 224
    return-object v7

    .line 225
    :cond_7
    iget-object v1, v1, La/fuj0;->a:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 228
    .line 229
    invoke-virtual {v1, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    if-nez v2, :cond_8

    .line 234
    .line 235
    new-instance v2, La/or30;

    .line 236
    .line 237
    invoke-direct {v2}, La/or30;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-interface {v1, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    :cond_8
    check-cast v2, La/or30;

    .line 244
    .line 245
    :goto_2
    invoke-static {v11}, La/kpb;->v(La/sip;)J

    .line 246
    .line 247
    .line 248
    move-result-wide v15

    .line 249
    new-instance v1, La/joq0;

    .line 250
    .line 251
    const/16 v3, 0x10

    .line 252
    .line 253
    invoke-direct {v1, v3}, La/joq0;-><init>(B)V

    .line 254
    .line 255
    .line 256
    new-instance v18, La/i7r0;

    .line 257
    .line 258
    const/4 v14, 0x0

    .line 259
    move-object/from16 v9, v18

    .line 260
    .line 261
    invoke-direct/range {v9 .. v14}, La/i7r0;-><init>(La/n660;La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/yje;)V

    .line 262
    .line 263
    .line 264
    const/16 v19, 0x3c

    .line 265
    .line 266
    move-object/from16 v17, v1

    .line 267
    .line 268
    move-object v14, v2

    .line 269
    invoke-static/range {v14 .. v19}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    new-instance v2, La/i89;

    .line 274
    .line 275
    const/16 v3, 0x17

    .line 276
    .line 277
    invoke-direct {v2, v1, v3}, La/i89;-><init>(La/gmq;B)V

    .line 278
    .line 279
    .line 280
    new-instance v1, La/sot;

    .line 281
    .line 282
    const/4 v3, 0x3

    .line 283
    invoke-direct {v1, v7, v0, v3}, La/sot;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 284
    .line 285
    .line 286
    invoke-static {v2, v1}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    new-instance v1, La/rl2;

    .line 291
    .line 292
    const/16 v2, 0xa

    .line 293
    .line 294
    invoke-direct {v1, v3, v7, v2}, La/rl2;-><init>(ILa/yje;B)V

    .line 295
    .line 296
    .line 297
    new-instance v2, La/dnq;

    .line 298
    .line 299
    invoke-direct {v2, v0, v1, v8}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 300
    .line 301
    .line 302
    return-object v2
.end method

.method public final f(ILa/zje;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/z3u;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/z3u;

    .line 11
    .line 12
    iget v3, v2, La/z3u;->k:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/z3u;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/z3u;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/z3u;-><init>(La/d4u;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/z3u;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/z3u;->k:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v10, 0x0

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    if-ne v4, v5, :cond_1

    .line 40
    .line 41
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0

    .line 52
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 56
    .line 57
    move-object/from16 v8, p3

    .line 58
    .line 59
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_3

    .line 64
    .line 65
    new-instance v0, La/fot;

    .line 66
    .line 67
    const/4 v1, 0x2

    .line 68
    invoke-direct {v0, v1, v10, v5}, La/fot;-><init>(ILa/yje;B)V

    .line 69
    .line 70
    .line 71
    new-instance v1, La/vsg0;

    .line 72
    .line 73
    invoke-direct {v1, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 74
    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    iput v5, v2, La/z3u;->k:I

    .line 78
    .line 79
    iget-object v0, v0, La/d4u;->m:La/xsu;

    .line 80
    .line 81
    iget-object v0, v0, La/xsu;->a:Ljava/lang/Object;

    .line 82
    .line 83
    move-object v7, v0

    .line 84
    check-cast v7, La/nru0;

    .line 85
    .line 86
    iget-object v0, v7, La/nru0;->b:La/jmb;

    .line 87
    .line 88
    iget-object v0, v0, La/jmb;->b:La/or30;

    .line 89
    .line 90
    sget-wide v12, La/nru0;->d:J

    .line 91
    .line 92
    new-instance v15, La/gc4;

    .line 93
    .line 94
    const/4 v11, 0x6

    .line 95
    move/from16 v9, p1

    .line 96
    .line 97
    move-object v6, v15

    .line 98
    invoke-direct/range {v6 .. v11}, La/gc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILa/yje;B)V

    .line 99
    .line 100
    .line 101
    const/16 v16, 0xfc

    .line 102
    .line 103
    const/4 v14, 0x0

    .line 104
    move-object v11, v0

    .line 105
    invoke-static/range {v11 .. v16}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    new-instance v1, La/n7t0;

    .line 110
    .line 111
    const/16 v2, 0x8

    .line 112
    .line 113
    invoke-direct {v1, v7, v10, v2}, La/n7t0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 114
    .line 115
    .line 116
    new-instance v2, La/fnq;

    .line 117
    .line 118
    invoke-direct {v2, v0, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    if-ne v2, v3, :cond_4

    .line 122
    .line 123
    return-object v3

    .line 124
    :cond_4
    move-object v1, v2

    .line 125
    :goto_1
    check-cast v1, La/gmq;

    .line 126
    .line 127
    new-instance v0, La/a1t;

    .line 128
    .line 129
    const/16 v2, 0xa

    .line 130
    .line 131
    invoke-direct {v0, v1, v2}, La/a1t;-><init>(La/gmq;B)V

    .line 132
    .line 133
    .line 134
    new-instance v1, La/rl2;

    .line 135
    .line 136
    const/4 v2, 0x3

    .line 137
    const/16 v3, 0xb

    .line 138
    .line 139
    invoke-direct {v1, v2, v10, v3}, La/rl2;-><init>(ILa/yje;B)V

    .line 140
    .line 141
    .line 142
    new-instance v2, La/dnq;

    .line 143
    .line 144
    invoke-direct {v2, v0, v1, v5}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 145
    .line 146
    .line 147
    return-object v2
.end method
