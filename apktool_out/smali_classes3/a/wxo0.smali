.class public final La/wxo0;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/sxo0;


# direct methods
.method public constructor <init>(La/sxo0;La/ctf0;La/mne;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/nxo0;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-direct {v2, p1, v0}, La/nxo0;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    new-instance v3, La/h0j0;

    .line 11
    .line 12
    const/16 v0, 0xd

    .line 13
    .line 14
    invoke-direct {v3, p2, v0}, La/h0j0;-><init>(La/ctf0;B)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p3, La/mne;->c:La/vs10;

    .line 18
    .line 19
    iget-object p3, p3, La/mne;->a:La/rwj;

    .line 20
    .line 21
    invoke-static {p2, p3}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v1, 0x0

    .line 27
    move-object v0, p0

    .line 28
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, v0, La/wxo0;->o:La/sxo0;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, La/lxo0;

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
    instance-of v0, p1, La/kxo0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, La/txo0;

    .line 14
    .line 15
    new-instance v1, La/ojp0;

    .line 16
    .line 17
    iget-object v2, p0, La/wxo0;->o:La/sxo0;

    .line 18
    .line 19
    iget v3, v2, La/sxo0;->b:I

    .line 20
    .line 21
    iget v2, v2, La/sxo0;->c:I

    .line 22
    .line 23
    check-cast p1, La/kxo0;

    .line 24
    .line 25
    iget-object p1, p1, La/kxo0;->a:La/bop0;

    .line 26
    .line 27
    iget-byte p1, p1, La/bop0;->a:B

    .line 28
    .line 29
    invoke-direct {v1, v3, v2, p1}, La/ojp0;-><init>(III)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, La/txo0;-><init>(La/ojp0;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    sget-object v0, La/jxo0;->a:La/jxo0;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 52
    .line 53
    .line 54
    return-void
.end method
