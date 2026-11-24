.class public final La/zfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mne;

.field public final b:La/deo;


# direct methods
.method public constructor <init>(La/mne;La/bek;La/sek;La/deo;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/zfo;->a:La/mne;

    .line 8
    .line 9
    iput-object p4, p0, La/zfo;->b:La/deo;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, La/tfo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/tfo;

    .line 7
    .line 8
    iget v1, v0, La/tfo;->k:I

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
    iput v1, v0, La/tfo;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/tfo;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/tfo;-><init>(La/zfo;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/tfo;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/tfo;->k:I

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v4, v0, La/tfo;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/zfo;->b:La/deo;

    .line 53
    .line 54
    iget-object p0, p0, La/deo;->a:La/n0o0;

    .line 55
    .line 56
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, La/nbo;

    .line 61
    .line 62
    iget-object p0, p0, La/nbo;->a:La/zdg0;

    .line 63
    .line 64
    new-instance p3, La/hu6;

    .line 65
    .line 66
    const/4 v2, 0x5

    .line 67
    invoke-direct {p3, p1, p2, v3, v2}, La/hu6;-><init>(JLa/yje;B)V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    invoke-static {v0, p0, p3, v4, p1}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    if-ne p3, v1, :cond_3

    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_3
    :goto_1
    check-cast p3, La/obo;

    .line 79
    .line 80
    invoke-static {p3}, La/bek;->p(La/obo;)La/ueo;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0
.end method

.method public final b(La/yje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/zfo;->a:La/mne;

    .line 2
    .line 3
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 4
    .line 5
    new-instance v1, La/ufo;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v2, v3}, La/ufo;-><init>(La/zfo;La/yje;B)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final c()La/eu4;
    .locals 6

    .line 1
    iget-object v0, p0, La/zfo;->b:La/deo;

    .line 2
    .line 3
    iget-object v0, v0, La/deo;->a:La/n0o0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/nbo;

    .line 10
    .line 11
    iget-object v0, v0, La/nbo;->a:La/zdg0;

    .line 12
    .line 13
    const-string v1, "events"

    .line 14
    .line 15
    filled-new-array {v1}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, La/f1e;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    const/16 v4, 0x15

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v2, v3, v5, v4}, La/f1e;-><init>(ILa/yje;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1, v2}, La/wwb;->C(La/zdg0;[Ljava/lang/String;Lkotlin/jvm/functions/Function2;)La/zj2;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, La/a1g;

    .line 33
    .line 34
    const/4 v2, 0x6

    .line 35
    invoke-direct {v1, v0, p0, v2}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    new-instance p0, La/eu4;

    .line 39
    .line 40
    const/16 v0, 0x8

    .line 41
    .line 42
    invoke-direct {p0, v1, v0}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    return-object p0
.end method
