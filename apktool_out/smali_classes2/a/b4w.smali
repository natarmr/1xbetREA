.class public final La/b4w;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/n3w;

.field public final c:La/sys0;

.field public final d:Z

.field public final e:Z

.field public final f:La/sff0;

.field public final g:La/p7m0;

.field public final h:La/qoj0;


# direct methods
.method public constructor <init>(La/pru;La/n3w;La/sys0;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/b4w;->b:La/n3w;

    .line 5
    .line 6
    iput-object p3, p0, La/b4w;->c:La/sys0;

    .line 7
    .line 8
    iput-boolean p4, p0, La/b4w;->d:Z

    .line 9
    .line 10
    iput-boolean p5, p0, La/b4w;->e:Z

    .line 11
    .line 12
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, La/b4w;->f:La/sff0;

    .line 17
    .line 18
    sget-object p1, La/iun;->a:La/iun;

    .line 19
    .line 20
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, La/b4w;->g:La/p7m0;

    .line 25
    .line 26
    invoke-static {}, La/ckb;->F()La/qoj0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, La/b4w;->h:La/qoj0;

    .line 31
    .line 32
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance p2, La/gkr;

    .line 37
    .line 38
    const/16 p3, 0x17

    .line 39
    .line 40
    const/4 p4, 0x0

    .line 41
    invoke-direct {p2, p0, p4, p3}, La/gkr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x3

    .line 45
    invoke-static {p1, p4, p4, p2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 46
    .line 47
    .line 48
    return-void
.end method
