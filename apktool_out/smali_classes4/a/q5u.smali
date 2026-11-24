.class public final La/q5u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/f7u;

.field public final b:La/edu;

.field public final c:La/rtu;

.field public final d:La/pmi;

.field public final e:La/v7i;

.field public final f:La/j3c;

.field public final g:La/svu;

.field public final h:La/rpt;

.field public final i:La/cmt;

.field public final j:La/lbu;

.field public final k:La/luu;

.field public final l:La/m1e;

.field public final m:La/cad;

.field public final n:La/zri;

.field public final o:La/ocl;

.field public final p:La/n0o0;


# direct methods
.method public constructor <init>(La/f7u;La/edu;La/rtu;La/pmi;La/v7i;La/j3c;La/svu;La/rpt;La/cmt;La/pru;La/lbu;La/luu;La/m1e;La/cad;La/zri;La/ocl;)V
    .locals 0

    .line 1
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/q5u;->a:La/f7u;

    .line 8
    .line 9
    iput-object p2, p0, La/q5u;->b:La/edu;

    .line 10
    .line 11
    iput-object p3, p0, La/q5u;->c:La/rtu;

    .line 12
    .line 13
    iput-object p4, p0, La/q5u;->d:La/pmi;

    .line 14
    .line 15
    iput-object p5, p0, La/q5u;->e:La/v7i;

    .line 16
    .line 17
    iput-object p6, p0, La/q5u;->f:La/j3c;

    .line 18
    .line 19
    iput-object p7, p0, La/q5u;->g:La/svu;

    .line 20
    .line 21
    iput-object p8, p0, La/q5u;->h:La/rpt;

    .line 22
    .line 23
    iput-object p9, p0, La/q5u;->i:La/cmt;

    .line 24
    .line 25
    iput-object p11, p0, La/q5u;->j:La/lbu;

    .line 26
    .line 27
    iput-object p12, p0, La/q5u;->k:La/luu;

    .line 28
    .line 29
    iput-object p13, p0, La/q5u;->l:La/m1e;

    .line 30
    .line 31
    iput-object p14, p0, La/q5u;->m:La/cad;

    .line 32
    .line 33
    iput-object p15, p0, La/q5u;->n:La/zri;

    .line 34
    .line 35
    move-object/from16 p1, p16

    .line 36
    .line 37
    iput-object p1, p0, La/q5u;->o:La/ocl;

    .line 38
    .line 39
    new-instance p1, La/hc0;

    .line 40
    .line 41
    const/16 p2, 0x1d

    .line 42
    .line 43
    invoke-direct {p1, p10, p2}, La/hc0;-><init>(La/pru;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, La/q5u;->p:La/n0o0;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a(La/sip;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)La/gmq;
    .locals 10

    .line 1
    sget-object v0, La/sip;->b:La/sip;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    instance-of v0, p4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance p0, La/eu4;

    .line 11
    .line 12
    const/16 p1, 0xc

    .line 13
    .line 14
    invoke-direct {p0, v1, p1}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance v0, La/o3s;

    .line 19
    .line 20
    const/4 v2, 0x5

    .line 21
    invoke-direct {v0, p0, p1, v1, v2}, La/o3s;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/vsg0;

    .line 25
    .line 26
    invoke-direct {v2, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 27
    .line 28
    .line 29
    new-instance v3, La/f5u;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    move-object v5, p0

    .line 33
    move-object v6, p1

    .line 34
    move-wide v7, p2

    .line 35
    move-object v9, p4

    .line 36
    invoke-direct/range {v3 .. v9}, La/f5u;-><init>(La/yje;La/q5u;La/sip;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 37
    .line 38
    .line 39
    move-wide p3, v7

    .line 40
    move-object p2, v9

    .line 41
    invoke-static {v2, v3}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p1, La/xpp;

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    invoke-direct {p1, v1, v5, p5, v0}, La/xpp;-><init>(La/yje;Ljava/lang/Object;ZB)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0, p1}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance p0, La/j5u;

    .line 56
    .line 57
    move-object p5, v5

    .line 58
    invoke-direct/range {p0 .. p5}, La/j5u;-><init>(La/utb;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;JLa/q5u;)V

    .line 59
    .line 60
    .line 61
    new-instance p1, La/rl2;

    .line 62
    .line 63
    const/4 p2, 0x3

    .line 64
    const/16 p3, 0xd

    .line 65
    .line 66
    invoke-direct {p1, p2, v1, p3}, La/rl2;-><init>(ILa/yje;B)V

    .line 67
    .line 68
    .line 69
    new-instance p2, La/dnq;

    .line 70
    .line 71
    const/4 p3, 0x1

    .line 72
    invoke-direct {p2, p0, p1, p3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 73
    .line 74
    .line 75
    return-object p2
.end method

.method public final b(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;IJLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p5, La/m5u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/m5u;

    .line 7
    .line 8
    iget v1, v0, La/m5u;->l:I

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
    iput v1, v0, La/m5u;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/m5u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/m5u;-><init>(La/q5u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/m5u;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/m5u;->l:I

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
    iget-object p0, v0, La/m5u;->i:La/q5u;

    .line 38
    .line 39
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 53
    .line 54
    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    iput-object p0, v0, La/m5u;->i:La/q5u;

    .line 61
    .line 62
    iput v3, v0, La/m5u;->l:I

    .line 63
    .line 64
    iget-object p1, p0, La/q5u;->n:La/zri;

    .line 65
    .line 66
    invoke-virtual {p1, p2, p3, p4, v0}, La/zri;->f(IJLa/zje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p5

    .line 70
    if-ne p5, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p5, La/gmq;

    .line 74
    .line 75
    new-instance p1, La/a1t;

    .line 76
    .line 77
    const/16 p2, 0xb

    .line 78
    .line 79
    invoke-direct {p1, p5, p2}, La/a1t;-><init>(La/gmq;B)V

    .line 80
    .line 81
    .line 82
    iget-object p0, p0, La/q5u;->o:La/ocl;

    .line 83
    .line 84
    iget-object p0, p0, La/ocl;->a:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, La/m0o0;

    .line 87
    .line 88
    invoke-virtual {p0}, La/m0o0;->b()La/gmq;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    new-instance p2, La/c4u;

    .line 93
    .line 94
    const/4 p3, 0x3

    .line 95
    invoke-direct {p2, p3, v4, v3}, La/c4u;-><init>(ILa/yje;B)V

    .line 96
    .line 97
    .line 98
    new-instance p4, La/p6d;

    .line 99
    .line 100
    invoke-direct {p4, p0, p1, p2, v3}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 101
    .line 102
    .line 103
    new-instance p0, La/rl2;

    .line 104
    .line 105
    const/16 p1, 0xe

    .line 106
    .line 107
    invoke-direct {p0, p3, v4, p1}, La/rl2;-><init>(ILa/yje;B)V

    .line 108
    .line 109
    .line 110
    new-instance p1, La/dnq;

    .line 111
    .line 112
    invoke-direct {p1, p4, p0, v3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 113
    .line 114
    .line 115
    return-object p1

    .line 116
    :cond_4
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 117
    .line 118
    sget-object p0, La/iun;->a:La/iun;

    .line 119
    .line 120
    new-instance p1, La/j0g0;

    .line 121
    .line 122
    invoke-direct {p1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    new-instance p0, La/eu4;

    .line 126
    .line 127
    const/16 p2, 0xc

    .line 128
    .line 129
    invoke-direct {p0, p1, p2}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 130
    .line 131
    .line 132
    return-object p0
.end method

.method public final c(La/sip;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    instance-of v1, v0, La/p5u;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/p5u;

    .line 9
    .line 10
    iget v2, v1, La/p5u;->k:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/p5u;->k:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/p5u;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, La/p5u;-><init>(La/q5u;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, La/p5u;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v7, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, v1, La/p5u;->k:I

    .line 32
    .line 33
    const/16 v8, 0xc

    .line 34
    .line 35
    const/4 v9, 0x1

    .line 36
    const/4 v10, 0x0

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v9, :cond_1

    .line 40
    .line 41
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v10

    .line 51
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object v0, La/sip;->b:La/sip;

    .line 55
    .line 56
    if-ne p1, v0, :cond_3

    .line 57
    .line 58
    instance-of v0, p4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 59
    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 64
    .line 65
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_5

    .line 70
    .line 71
    iput v9, v1, La/p5u;->k:I

    .line 72
    .line 73
    new-instance v0, La/atj;

    .line 74
    .line 75
    const/16 v1, 0x13

    .line 76
    .line 77
    iget-object v2, p0, La/q5u;->a:La/f7u;

    .line 78
    .line 79
    invoke-direct {v0, v2, v10, v1}, La/atj;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 80
    .line 81
    .line 82
    new-instance p0, La/vsg0;

    .line 83
    .line 84
    invoke-direct {p0, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 85
    .line 86
    .line 87
    new-instance v0, La/izu;

    .line 88
    .line 89
    const/4 v1, 0x0

    .line 90
    move-object v3, p1

    .line 91
    move-wide v4, p2

    .line 92
    move-object v6, p4

    .line 93
    invoke-direct/range {v0 .. v6}, La/izu;-><init>(La/yje;La/f7u;La/sip;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v0}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-ne v0, v7, :cond_4

    .line 101
    .line 102
    return-object v7

    .line 103
    :cond_4
    :goto_1
    check-cast v0, La/gmq;

    .line 104
    .line 105
    new-instance p0, La/a1t;

    .line 106
    .line 107
    invoke-direct {p0, v0, v8}, La/a1t;-><init>(La/gmq;B)V

    .line 108
    .line 109
    .line 110
    new-instance p1, La/rl2;

    .line 111
    .line 112
    const/4 p2, 0x3

    .line 113
    const/16 p3, 0xf

    .line 114
    .line 115
    invoke-direct {p1, p2, v10, p3}, La/rl2;-><init>(ILa/yje;B)V

    .line 116
    .line 117
    .line 118
    new-instance p2, La/dnq;

    .line 119
    .line 120
    invoke-direct {p2, p0, p1, v9}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 121
    .line 122
    .line 123
    return-object p2

    .line 124
    :cond_5
    :goto_2
    new-instance p0, La/eu4;

    .line 125
    .line 126
    invoke-direct {p0, v10, v8}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    return-object p0
.end method
