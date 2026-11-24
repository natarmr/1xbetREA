.class public final La/v6j;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/hnu;

.field public final c:La/mne;

.field public final d:La/g2v;

.field public final e:La/p7m0;

.field public final f:La/c4m0;

.field public g:Z


# direct methods
.method public constructor <init>(La/hnu;La/i1w0;La/mne;La/g2v;La/m1e;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/v6j;->b:La/hnu;

    .line 8
    .line 9
    iput-object p3, p0, La/v6j;->c:La/mne;

    .line 10
    .line 11
    iput-object p4, p0, La/v6j;->d:La/g2v;

    .line 12
    .line 13
    new-instance p1, La/r6j;

    .line 14
    .line 15
    invoke-virtual {p0}, La/v6j;->w()La/jkm;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-direct {p1, p2}, La/r6j;-><init>(La/jkm;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, La/v6j;->e:La/p7m0;

    .line 27
    .line 28
    iget-object p1, p0, La/v6j;->f:La/c4m0;

    .line 29
    .line 30
    const/4 p2, 0x1

    .line 31
    const/4 p4, 0x0

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ne p1, p2, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-interface {p5}, La/m1e;->b()La/gmq;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance p5, La/u6j;

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-direct {p5, p0, p4, v0}, La/u6j;-><init>(La/v6j;La/yje;B)V

    .line 49
    .line 50
    .line 51
    new-instance v0, La/fnq;

    .line 52
    .line 53
    const/4 v1, 0x4

    .line 54
    invoke-direct {v0, p1, p5, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {v0, p1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, La/v6j;->f:La/c4m0;

    .line 66
    .line 67
    :goto_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v1, La/x2i;

    .line 72
    .line 73
    const/16 p1, 0x8

    .line 74
    .line 75
    invoke-direct {v1, p1}, La/x2i;-><init>(B)V

    .line 76
    .line 77
    .line 78
    iget-object v3, p3, La/mne;->a:La/rwj;

    .line 79
    .line 80
    new-instance v4, La/u6j;

    .line 81
    .line 82
    invoke-direct {v4, p0, p4, p2}, La/u6j;-><init>(La/v6j;La/yje;B)V

    .line 83
    .line 84
    .line 85
    const/16 v5, 0xa

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 89
    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final w()La/jkm;
    .locals 8

    .line 1
    sget-object v1, La/pb10;->g:La/pb10;

    .line 2
    .line 3
    new-instance v6, La/e8g;

    .line 4
    .line 5
    const/16 v0, 0x1b

    .line 6
    .line 7
    invoke-direct {v6, p0, v0}, La/e8g;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    const/16 v7, 0x5e

    .line 11
    .line 12
    iget-object v0, p0, La/v6j;->d:La/g2v;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const v4, 0x7f130677

    .line 17
    .line 18
    .line 19
    const v5, 0x7f131690

    .line 20
    .line 21
    .line 22
    invoke-static/range {v0 .. v7}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final x(La/t6j;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/v6j;->c:La/mne;

    .line 6
    .line 7
    iget-object v3, v1, La/mne;->c:La/vs10;

    .line 8
    .line 9
    new-instance v1, La/x2i;

    .line 10
    .line 11
    const/4 v2, 0x7

    .line 12
    invoke-direct {v1, v2}, La/x2i;-><init>(B)V

    .line 13
    .line 14
    .line 15
    new-instance v4, La/b1f;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/16 v5, 0xf

    .line 19
    .line 20
    invoke-direct {v4, p0, p1, v2, v5}, La/b1f;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 21
    .line 22
    .line 23
    const/16 v5, 0xa

    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 26
    .line 27
    .line 28
    return-void
.end method
