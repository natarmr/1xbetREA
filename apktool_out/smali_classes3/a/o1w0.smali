.class public final La/o1w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/jqt;

.field public final b:La/jru;

.field public final c:La/pru;

.field public final d:La/wn4;

.field public final e:La/mne;

.field public final f:La/sje;

.field public final g:La/p7m0;

.field public h:La/c4m0;

.field public i:La/bby;


# direct methods
.method public constructor <init>(La/tkz;La/jqt;La/jru;La/pru;La/wn4;La/mne;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/o1w0;->a:La/jqt;

    .line 5
    .line 6
    iput-object p3, p0, La/o1w0;->b:La/jru;

    .line 7
    .line 8
    iput-object p4, p0, La/o1w0;->c:La/pru;

    .line 9
    .line 10
    iput-object p5, p0, La/o1w0;->d:La/wn4;

    .line 11
    .line 12
    iput-object p6, p0, La/o1w0;->e:La/mne;

    .line 13
    .line 14
    iget-object p2, p1, La/tkz;->b:Lkotlin/coroutines/CoroutineContext;

    .line 15
    .line 16
    sget-object p3, La/gqw0;->o1:La/gqw0;

    .line 17
    .line 18
    invoke-interface {p2, p3}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    check-cast p2, La/bby;

    .line 23
    .line 24
    new-instance p3, La/kin0;

    .line 25
    .line 26
    invoke-direct {p3, p2}, La/dby;-><init>(La/bby;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1, p3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, La/o1w0;->f:La/sje;

    .line 34
    .line 35
    new-instance p1, La/j1w0;

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    sget-object p3, La/iun;->a:La/iun;

    .line 39
    .line 40
    invoke-direct {p1, p3, p2}, La/j1w0;-><init>(Ljava/util/List;Z)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, La/o1w0;->g:La/p7m0;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a(La/i1w0;)V
    .locals 10

    .line 1
    new-instance v0, La/gdv0;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, La/gdv0;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p1, La/i1w0;->e:La/gdv0;

    .line 9
    .line 10
    new-instance v0, La/jmv0;

    .line 11
    .line 12
    const/16 v1, 0xf

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, La/jmv0;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p1, La/i1w0;->d:La/jmv0;

    .line 18
    .line 19
    new-instance v2, La/wzu0;

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    const/16 v9, 0x13

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    const-class v5, La/o1w0;

    .line 26
    .line 27
    const-string v6, "doAction"

    .line 28
    .line 29
    const-string v7, "doAction(Lkotlin/jvm/functions/Function1;)V"

    .line 30
    .line 31
    move-object v4, p0

    .line 32
    invoke-direct/range {v2 .. v9}, La/wzu0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 33
    .line 34
    .line 35
    iput-object v2, p1, La/i1w0;->c:La/wzu0;

    .line 36
    .line 37
    return-void
.end method
