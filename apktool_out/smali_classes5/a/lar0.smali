.class public final La/lar0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic p:I


# instance fields
.field public final o:La/svu;


# direct methods
.method public constructor <init>(La/mne;La/svu;)V
    .locals 6

    .line 1
    new-instance v2, La/joq0;

    .line 2
    .line 3
    const/16 v0, 0x16

    .line 4
    .line 5
    invoke-direct {v2, v0}, La/joq0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sget-object v3, La/kar0;->a:La/kar0;

    .line 9
    .line 10
    iget-object p1, p1, La/mne;->c:La/vs10;

    .line 11
    .line 12
    invoke-static {p1, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v1, 0x0

    .line 18
    move-object v0, p0

    .line 19
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, v0, La/lar0;->o:La/svu;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, La/w9r0;

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
    sget-object v0, La/w9r0;->a:La/w9r0;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, La/w9r0;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    new-instance p1, La/hhb0;

    .line 18
    .line 19
    const/16 v0, 0x1b

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {p1, p0, v1, v0}, La/hhb0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    invoke-static {p0, v1, v1, p1, v0}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 31
    .line 32
    .line 33
    return-void
.end method
