.class public final La/rix;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/us00;

.field public final b:La/ane0;

.field public final c:La/z8w0;

.field public final d:La/sje;

.field public final e:La/n0o0;


# direct methods
.method public constructor <init>(La/us00;La/ane0;La/z8w0;La/mne;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/rix;->a:La/us00;

    .line 8
    .line 9
    iput-object p2, p0, La/rix;->b:La/ane0;

    .line 10
    .line 11
    iput-object p3, p0, La/rix;->c:La/z8w0;

    .line 12
    .line 13
    iget-object p1, p4, La/mne;->b:La/dvj;

    .line 14
    .line 15
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, La/rix;->d:La/sje;

    .line 31
    .line 32
    new-instance p1, La/y2x;

    .line 33
    .line 34
    const/4 p2, 0x7

    .line 35
    invoke-direct {p1, p0, p2}, La/y2x;-><init>(Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, La/rix;->e:La/n0o0;

    .line 43
    .line 44
    return-void
.end method
