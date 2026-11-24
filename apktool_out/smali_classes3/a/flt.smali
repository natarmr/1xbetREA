.class public final La/flt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/okt0;

.field public final b:La/viu;

.field public final c:La/sje;

.field public d:La/bby;

.field public e:J


# direct methods
.method public constructor <init>(La/okt0;La/viu;La/mne;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/flt;->a:La/okt0;

    .line 5
    .line 6
    iput-object p2, p0, La/flt;->b:La/viu;

    .line 7
    .line 8
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p2, p3, La/mne;->b:La/dvj;

    .line 13
    .line 14
    invoke-static {p1, p2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, La/flt;->c:La/sje;

    .line 23
    .line 24
    return-void
.end method
