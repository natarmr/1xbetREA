.class public final La/pak;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/i1w0;

.field public final c:La/ani0;

.field public final d:La/ljf0;

.field public final e:La/duj;

.field public final f:La/p7m0;

.field public final g:La/ol60;


# direct methods
.method public constructor <init>(La/i1w0;La/ani0;La/ljf0;La/duj;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/pak;->b:La/i1w0;

    .line 8
    .line 9
    iput-object p2, p0, La/pak;->c:La/ani0;

    .line 10
    .line 11
    iput-object p3, p0, La/pak;->d:La/ljf0;

    .line 12
    .line 13
    iput-object p4, p0, La/pak;->e:La/duj;

    .line 14
    .line 15
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, La/pak;->f:La/p7m0;

    .line 22
    .line 23
    new-instance p1, La/ol60;

    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    sget-object p3, La/i99;->b:La/i99;

    .line 27
    .line 28
    invoke-direct {p1, p2, p3}, La/ol60;-><init>(ILa/i99;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/pak;->g:La/ol60;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final w(La/nak;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/x2i;

    .line 6
    .line 7
    const/16 v2, 0x1c

    .line 8
    .line 9
    invoke-direct {v1, v2}, La/x2i;-><init>(B)V

    .line 10
    .line 11
    .line 12
    new-instance v4, La/e9g;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/16 v3, 0x18

    .line 16
    .line 17
    invoke-direct {v4, p0, p1, v2, v3}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

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
