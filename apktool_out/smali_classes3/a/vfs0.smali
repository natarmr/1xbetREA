.class public final La/vfs0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/abu;

.field public final c:La/duj;

.field public final d:La/i1w0;

.field public final e:La/sa10;

.field public final f:La/mne;

.field public final g:La/ctf0;

.field public final h:J

.field public final i:Ljava/lang/String;

.field public final j:D

.field public final k:La/ax5;

.field public final l:La/p7m0;


# direct methods
.method public constructor <init>(La/abu;La/duj;La/i1w0;La/sa10;La/mne;La/ctf0;JLjava/lang/String;D)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/vfs0;->b:La/abu;

    .line 8
    .line 9
    iput-object p2, p0, La/vfs0;->c:La/duj;

    .line 10
    .line 11
    iput-object p3, p0, La/vfs0;->d:La/i1w0;

    .line 12
    .line 13
    iput-object p4, p0, La/vfs0;->e:La/sa10;

    .line 14
    .line 15
    iput-object p5, p0, La/vfs0;->f:La/mne;

    .line 16
    .line 17
    iput-object p6, p0, La/vfs0;->g:La/ctf0;

    .line 18
    .line 19
    iput-wide p7, p0, La/vfs0;->h:J

    .line 20
    .line 21
    iput-object p9, p0, La/vfs0;->i:Ljava/lang/String;

    .line 22
    .line 23
    iput-wide p10, p0, La/vfs0;->j:D

    .line 24
    .line 25
    new-instance p1, La/ax5;

    .line 26
    .line 27
    invoke-direct {p1, p0}, La/ax5;-><init>(La/vfs0;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/vfs0;->k:La/ax5;

    .line 31
    .line 32
    sget-object p2, La/qfs0;->a:La/qfs0;

    .line 33
    .line 34
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    iput-object p2, p0, La/vfs0;->l:La/p7m0;

    .line 39
    .line 40
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iget-object p3, p5, La/mne;->b:La/dvj;

    .line 45
    .line 46
    invoke-static {p1, p3}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance p3, La/k6s0;

    .line 51
    .line 52
    const/4 p4, 0x0

    .line 53
    const/4 p5, 0x2

    .line 54
    invoke-direct {p3, p0, p4, p5}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p2, p1, p4, p3, p5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 58
    .line 59
    .line 60
    return-void
.end method
