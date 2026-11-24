.class public final La/rrm;
.super La/g46;
.source "SourceFile"


# static fields
.field public static final B:La/sje;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/tvk;->a:La/rwj;

    .line 6
    .line 7
    sget-object v1, La/ys10;->a:La/vs10;

    .line 8
    .line 9
    invoke-virtual {v1}, La/vs10;->x()La/vs10;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, La/rrm;->B:La/sje;

    .line 22
    .line 23
    return-void
.end method
