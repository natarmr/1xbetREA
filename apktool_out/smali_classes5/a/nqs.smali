.class public final La/nqs;
.super La/eiu0;
.source "SourceFile"


# instance fields
.field public final synthetic c:B

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/rbu;La/mne;La/xrs;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/nqs;->c:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/nqs;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/nqs;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/nqs;->f:Ljava/lang/Object;

    .line 12
    .line 13
    new-instance p1, La/jcs;

    .line 14
    .line 15
    const/4 p2, 0x5

    .line 16
    invoke-direct {p1, p0, p2}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, La/nqs;->g:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(La/z4w0;La/cyh;La/ort;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/nqs;->c:B

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, La/nqs;->d:Ljava/lang/Object;

    .line 28
    iput-object p2, p0, La/nqs;->e:Ljava/lang/Object;

    .line 29
    iput-object p3, p0, La/nqs;->f:Ljava/lang/Object;

    .line 30
    new-instance p1, La/ol60;

    const/4 p2, 0x3

    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    iput-object p1, p0, La/nqs;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public u(La/diu0;La/vzg0;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/nqs;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, La/eiu0;->u(La/diu0;La/vzg0;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/eiu0;->a:La/diu0;

    .line 14
    .line 15
    iput-object p2, p0, La/eiu0;->b:La/vzg0;

    .line 16
    .line 17
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p2, p0, La/nqs;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p2, La/mne;

    .line 24
    .line 25
    iget-object p2, p2, La/mne;->c:La/vs10;

    .line 26
    .line 27
    new-instance v0, La/gkr;

    .line 28
    .line 29
    const/4 v1, 0x3

    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v0, p0, v2, v1}, La/gkr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x2

    .line 35
    invoke-static {p1, p2, v2, v0, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public v()La/u3z;
    .locals 9

    .line 1
    invoke-virtual {p0}, La/nqs;->x()La/mqs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, La/mqs;->a:La/vzg0;

    .line 6
    .line 7
    iget-object v1, p0, La/mqs;->e:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Long;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    :goto_0
    move-wide v4, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-wide v1, p0, La/mqs;->b:J

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :goto_1
    iget-object v1, p0, La/mqs;->f:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/String;

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    sget-object v0, La/t3z;->a:La/rqt;

    .line 37
    .line 38
    iget-boolean v1, p0, La/mqs;->c:Z

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-static {v1, v0, v0}, La/rqt;->h(ZZZ)La/t3z;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_1
    new-instance v3, La/u3z;

    .line 53
    .line 54
    invoke-static {v0}, La/t3z;->valueOf(Ljava/lang/String;)La/t3z;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    iget-wide v7, p0, La/mqs;->d:J

    .line 59
    .line 60
    invoke-direct/range {v3 .. v8}, La/u3z;-><init>(JLa/t3z;J)V

    .line 61
    .line 62
    .line 63
    return-object v3
.end method

.method public w(La/yje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/wzb0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/wzb0;

    .line 7
    .line 8
    iget v1, v0, La/wzb0;->k:I

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
    iput v1, v0, La/wzb0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/wzb0;

    .line 21
    .line 22
    check-cast p1, La/zje;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, La/wzb0;-><init>(La/nqs;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v0, La/wzb0;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, v0, La/wzb0;->k:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance p1, La/p6a;

    .line 53
    .line 54
    iget-object v2, p0, La/nqs;->f:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, La/ort;

    .line 57
    .line 58
    invoke-virtual {v2}, La/ort;->b()J

    .line 59
    .line 60
    .line 61
    move-result-wide v5

    .line 62
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const/4 v5, 0x6

    .line 67
    invoke-direct {p1, v2, v5}, La/p6a;-><init>(Ljava/lang/String;B)V

    .line 68
    .line 69
    .line 70
    iget-object v2, p0, La/nqs;->e:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, La/cyh;

    .line 73
    .line 74
    invoke-virtual {v2, p1}, La/cyh;->a(La/v0;)La/p5a;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    new-instance v2, La/s980;

    .line 79
    .line 80
    const/16 v5, 0x1b

    .line 81
    .line 82
    invoke-direct {v2, p0, v4, v5}, La/s980;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 83
    .line 84
    .line 85
    new-instance p0, La/fnq;

    .line 86
    .line 87
    const/4 v5, 0x4

    .line 88
    invoke-direct {p0, p1, v2, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 89
    .line 90
    .line 91
    new-instance p1, La/nv;

    .line 92
    .line 93
    invoke-direct {p1, p0, v4, v5}, La/nv;-><init>(La/fnq;La/yje;B)V

    .line 94
    .line 95
    .line 96
    new-instance p0, La/vsg0;

    .line 97
    .line 98
    invoke-direct {p0, p1}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 99
    .line 100
    .line 101
    iput v3, v0, La/wzb0;->k:I

    .line 102
    .line 103
    invoke-static {p0, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v1, :cond_3

    .line 108
    .line 109
    return-object v1

    .line 110
    :cond_3
    :goto_1
    check-cast p1, La/ynb0;

    .line 111
    .line 112
    return-object p1
.end method

.method public x()La/mqs;
    .locals 0

    .line 1
    iget-object p0, p0, La/nqs;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/n0o0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/mqs;

    .line 10
    .line 11
    return-object p0
.end method
