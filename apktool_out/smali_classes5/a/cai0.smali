.class public final La/cai0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/vzg0;

.field public final c:La/i1w0;

.field public final d:La/f5a;

.field public final e:La/vd1;

.field public final f:La/duj;

.field public final g:La/p7m0;

.field public final h:La/p7m0;

.field public final i:La/ol60;

.field public j:S


# direct methods
.method public constructor <init>(La/vzg0;La/i1w0;La/f5a;La/vd1;La/duj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/cai0;->b:La/vzg0;

    .line 5
    .line 6
    iput-object p2, p0, La/cai0;->c:La/i1w0;

    .line 7
    .line 8
    iput-object p3, p0, La/cai0;->d:La/f5a;

    .line 9
    .line 10
    iput-object p4, p0, La/cai0;->e:La/vd1;

    .line 11
    .line 12
    iput-object p5, p0, La/cai0;->f:La/duj;

    .line 13
    .line 14
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/cai0;->g:La/p7m0;

    .line 21
    .line 22
    sget-object p1, La/z9i0;->a:La/z9i0;

    .line 23
    .line 24
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, La/cai0;->h:La/p7m0;

    .line 29
    .line 30
    new-instance p1, La/ol60;

    .line 31
    .line 32
    sget-object p2, La/i99;->b:La/i99;

    .line 33
    .line 34
    const/4 p3, 0x1

    .line 35
    invoke-direct {p1, p3, p2}, La/ol60;-><init>(ILa/i99;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, La/cai0;->i:La/ol60;

    .line 39
    .line 40
    iput-short p3, p0, La/cai0;->j:S

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final w(La/x9i0;)V
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
    const/16 v2, 0x14

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
    const/4 v3, 0x0

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

.method public final x(La/f9i0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-short v0, p1, La/f9i0;->a:S

    .line 5
    .line 6
    iput-short v0, p0, La/cai0;->j:S

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
    iget-object v2, p0, La/cai0;->b:La/vzg0;

    .line 15
    .line 16
    invoke-virtual {v2, v1, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, La/cai0;->h:La/p7m0;

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
    check-cast v2, La/aai0;

    .line 27
    .line 28
    new-instance v2, La/y9i0;

    .line 29
    .line 30
    invoke-direct {v2, p1}, La/y9i0;-><init>(La/f9i0;)V

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
