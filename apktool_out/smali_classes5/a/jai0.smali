.class public final La/jai0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/vzg0;

.field public final c:La/i1w0;

.field public final d:La/ciu;

.field public final e:La/f5a;

.field public final f:La/vd1;

.field public final g:La/duj;

.field public final h:La/p7m0;

.field public final i:La/p7m0;

.field public final j:La/ol60;

.field public k:B


# direct methods
.method public constructor <init>(La/vzg0;La/i1w0;La/ciu;La/f5a;La/vd1;La/duj;)V
    .locals 6

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jai0;->b:La/vzg0;

    .line 5
    .line 6
    iput-object p2, p0, La/jai0;->c:La/i1w0;

    .line 7
    .line 8
    iput-object p3, p0, La/jai0;->d:La/ciu;

    .line 9
    .line 10
    iput-object p4, p0, La/jai0;->e:La/f5a;

    .line 11
    .line 12
    iput-object p5, p0, La/jai0;->f:La/vd1;

    .line 13
    .line 14
    iput-object p6, p0, La/jai0;->g:La/duj;

    .line 15
    .line 16
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iput-object p2, p0, La/jai0;->h:La/p7m0;

    .line 23
    .line 24
    new-instance p2, La/iai0;

    .line 25
    .line 26
    sget-object p3, La/g9i0;->b:La/zie0;

    .line 27
    .line 28
    const-string p4, "CURRENT_SELECTED_LIMIT_BUNDLE_KEY"

    .line 29
    .line 30
    invoke-virtual {p1, p4}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/Integer;

    .line 35
    .line 36
    const/4 p4, 0x1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move p1, p4

    .line 45
    :goto_0
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, La/zie0;->a(I)La/g9i0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p2, p1}, La/iai0;-><init>(La/g9i0;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, La/jai0;->i:La/p7m0;

    .line 60
    .line 61
    new-instance p1, La/ol60;

    .line 62
    .line 63
    sget-object p2, La/i99;->b:La/i99;

    .line 64
    .line 65
    invoke-direct {p1, p4, p2}, La/ol60;-><init>(ILa/i99;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, La/jai0;->j:La/ol60;

    .line 69
    .line 70
    iput-byte p4, p0, La/jai0;->k:B

    .line 71
    .line 72
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    new-instance v1, La/dai0;

    .line 77
    .line 78
    invoke-direct {v1, p0, p4}, La/dai0;-><init>(La/jai0;B)V

    .line 79
    .line 80
    .line 81
    new-instance v2, La/eai0;

    .line 82
    .line 83
    invoke-direct {v2, p0, p4}, La/eai0;-><init>(La/jai0;B)V

    .line 84
    .line 85
    .line 86
    new-instance v4, La/yng0;

    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    const/16 p2, 0xb

    .line 90
    .line 91
    invoke-direct {v4, p0, p1, p2}, La/yng0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 92
    .line 93
    .line 94
    const/16 v5, 0xc

    .line 95
    .line 96
    const/4 v3, 0x0

    .line 97
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 98
    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final w(La/hai0;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/eoh0;

    .line 6
    .line 7
    const/16 v2, 0x15

    .line 8
    .line 9
    invoke-direct {v1, v2}, La/eoh0;-><init>(B)V

    .line 10
    .line 11
    .line 12
    new-instance v4, La/bai0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v4, p0, p1, v2, v3}, La/bai0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    const/16 v5, 0xe

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final x(La/g9i0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-byte v0, p1, La/g9i0;->a:B

    .line 5
    .line 6
    iput-byte v0, p0, La/jai0;->k:B

    .line 7
    .line 8
    const-string v1, "CURRENT_SELECTED_LIMIT_BUNDLE_KEY"

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v2, p0, La/jai0;->b:La/vzg0;

    .line 15
    .line 16
    invoke-virtual {v2, v1, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La/jai0;->i:La/p7m0;

    .line 20
    .line 21
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v2, v1

    .line 26
    check-cast v2, La/iai0;

    .line 27
    .line 28
    new-instance v2, La/iai0;

    .line 29
    .line 30
    invoke-direct {v2, p1}, La/iai0;-><init>(La/g9i0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    return-void
.end method
