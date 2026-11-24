.class public final La/gj8;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic r:I


# instance fields
.field public final o:La/jtj;

.field public final p:La/pru;

.field public final q:La/ctf0;


# direct methods
.method public constructor <init>(La/mne;La/jtj;La/pru;La/ctf0;)V
    .locals 6

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/ej8;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {v2, v0}, La/ej8;-><init>(B)V

    .line 8
    .line 9
    .line 10
    sget-object v3, La/fj8;->a:La/fj8;

    .line 11
    .line 12
    iget-object p1, p1, La/mne;->c:La/vs10;

    .line 13
    .line 14
    invoke-static {p1, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v1, 0x0

    .line 20
    move-object v0, p0

    .line 21
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 22
    .line 23
    .line 24
    iput-object p2, v0, La/gj8;->o:La/jtj;

    .line 25
    .line 26
    iput-object p3, v0, La/gj8;->p:La/pru;

    .line 27
    .line 28
    iput-object p4, v0, La/gj8;->q:La/ctf0;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/ti8;

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
    sget-object v0, La/ti8;->a:La/ti8;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, La/ti8;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    new-instance p1, La/d38;

    .line 18
    .line 19
    const/4 v0, 0x7

    .line 20
    invoke-direct {p1, p0, v0}, La/d38;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    new-instance v0, La/pn;

    .line 24
    .line 25
    const/16 v1, 0xb

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v0, p0, v2, v1}, La/pn;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-static {p0, v2, p1, v0, v1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 37
    .line 38
    .line 39
    return-void
.end method
