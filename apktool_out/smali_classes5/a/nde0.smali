.class public final La/nde0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/vzg0;

.field public final c:La/i1w0;

.field public final d:La/f5a;

.field public final e:La/mtt;

.field public final f:La/duj;

.field public final g:La/p7m0;

.field public final h:La/p7m0;

.field public final i:La/p7m0;

.field public final j:La/ol60;

.field public k:I


# direct methods
.method public constructor <init>(La/vzg0;La/i1w0;La/f5a;La/mtt;La/duj;)V
    .locals 6

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/nde0;->b:La/vzg0;

    .line 5
    .line 6
    iput-object p2, p0, La/nde0;->c:La/i1w0;

    .line 7
    .line 8
    iput-object p3, p0, La/nde0;->d:La/f5a;

    .line 9
    .line 10
    iput-object p4, p0, La/nde0;->e:La/mtt;

    .line 11
    .line 12
    iput-object p5, p0, La/nde0;->f:La/duj;

    .line 13
    .line 14
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iput-object p2, p0, La/nde0;->g:La/p7m0;

    .line 21
    .line 22
    sget-object p2, La/iun;->a:La/iun;

    .line 23
    .line 24
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iput-object p2, p0, La/nde0;->h:La/p7m0;

    .line 29
    .line 30
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, La/nde0;->i:La/p7m0;

    .line 35
    .line 36
    new-instance p1, La/ol60;

    .line 37
    .line 38
    sget-object p2, La/i99;->b:La/i99;

    .line 39
    .line 40
    const/4 p3, 0x1

    .line 41
    invoke-direct {p1, p3, p2}, La/ol60;-><init>(ILa/i99;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, La/nde0;->j:La/ol60;

    .line 45
    .line 46
    const/4 p1, -0x1

    .line 47
    iput p1, p0, La/nde0;->k:I

    .line 48
    .line 49
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v1, La/jde0;

    .line 54
    .line 55
    invoke-direct {v1, p0, p3}, La/jde0;-><init>(La/nde0;B)V

    .line 56
    .line 57
    .line 58
    new-instance v4, La/er60;

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    const/16 p2, 0x1c

    .line 62
    .line 63
    invoke-direct {v4, p0, p1, p2}, La/er60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 64
    .line 65
    .line 66
    const/16 v5, 0xe

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    const/4 v3, 0x0

    .line 70
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 71
    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final w(La/mde0;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/bod0;

    .line 6
    .line 7
    const/16 v2, 0x11

    .line 8
    .line 9
    invoke-direct {v1, v2}, La/bod0;-><init>(B)V

    .line 10
    .line 11
    .line 12
    new-instance v4, La/s9c0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/16 v3, 0x19

    .line 16
    .line 17
    invoke-direct {v4, p0, p1, v2, v3}, La/s9c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 18
    .line 19
    .line 20
    const/16 v5, 0xe

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 24
    .line 25
    .line 26
    return-void
.end method
