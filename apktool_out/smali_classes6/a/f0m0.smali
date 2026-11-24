.class public final La/f0m0;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/ctf0;

.field public final p:La/kki;

.field public final q:J


# direct methods
.method public constructor <init>(La/xfu;La/mne;La/ctf0;La/kki;JLa/r9u;)V
    .locals 6

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/goi0;

    .line 8
    .line 9
    const/16 v0, 0x17

    .line 10
    .line 11
    invoke-direct {v2, p1, v0}, La/goi0;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/i7g0;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    invoke-direct {v3, p7, p1}, La/i7g0;-><init>(La/r9u;B)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p2, La/mne;->c:La/vs10;

    .line 21
    .line 22
    iget-object p2, p2, La/mne;->a:La/rwj;

    .line 23
    .line 24
    invoke-static {p1, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v1, 0x0

    .line 30
    move-object v0, p0

    .line 31
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 32
    .line 33
    .line 34
    iput-object p3, v0, La/f0m0;->o:La/ctf0;

    .line 35
    .line 36
    iput-object p4, v0, La/f0m0;->p:La/kki;

    .line 37
    .line 38
    iput-wide p5, v0, La/f0m0;->q:J

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/yzl0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, La/yzl0;->a:La/dyl0;

    .line 7
    .line 8
    new-instance v0, La/gv60;

    .line 9
    .line 10
    const/16 v1, 0xe

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, p0, p1, v2, v1}, La/gv60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    invoke-static {p0, v2, v2, v0, p1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 18
    .line 19
    .line 20
    return-void
.end method
