.class public final La/ksc;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic r:I


# instance fields
.field public final o:La/hbu;

.field public final p:La/reu;

.field public final q:La/yk50;


# direct methods
.method public constructor <init>(La/mne;La/ctf0;La/hbu;La/reu;La/yk50;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/mne;->a:La/rwj;

    .line 5
    .line 6
    iget-object p1, p1, La/mne;->c:La/vs10;

    .line 7
    .line 8
    invoke-static {v0, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, La/zxb;

    .line 13
    .line 14
    const/16 v1, 0x13

    .line 15
    .line 16
    invoke-direct {v0, v1}, La/zxb;-><init>(B)V

    .line 17
    .line 18
    .line 19
    new-instance v1, La/ep4;

    .line 20
    .line 21
    const/16 v2, 0x15

    .line 22
    .line 23
    invoke-direct {v1, p2, v2}, La/ep4;-><init>(La/ctf0;B)V

    .line 24
    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-direct {p0, v0, p1, v1, p2}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 28
    .line 29
    .line 30
    iput-object p3, p0, La/ksc;->o:La/hbu;

    .line 31
    .line 32
    iput-object p4, p0, La/ksc;->p:La/reu;

    .line 33
    .line 34
    iput-object p5, p0, La/ksc;->q:La/yk50;

    .line 35
    .line 36
    new-instance p1, La/hr;

    .line 37
    .line 38
    const/16 p3, 0x8

    .line 39
    .line 40
    invoke-direct {p1, p0, p2, p3}, La/hr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 41
    .line 42
    .line 43
    const/4 p3, 0x3

    .line 44
    invoke-static {p0, p2, p2, p1, p3}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 45
    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, La/dsc;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, La/dsc;->a:La/pif0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object v0, p0, La/ksc;->q:La/yk50;

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    if-eq p1, v1, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    if-ne p1, v1, :cond_0

    .line 24
    .line 25
    sget-object p1, La/wdn;->c:La/wdn;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, La/yk50;->f(La/wdn;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, La/wdn;->d:La/wdn;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, La/yk50;->f(La/wdn;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    sget-object p1, La/wdn;->d:La/wdn;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, La/yk50;->f(La/wdn;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    sget-object p1, La/wdn;->c:La/wdn;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, La/yk50;->f(La/wdn;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    sget-object p1, La/gsc;->a:La/gsc;

    .line 52
    .line 53
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method
