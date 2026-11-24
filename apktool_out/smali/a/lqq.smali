.class public final La/lqq;
.super La/f3k;
.source "SourceFile"

# interfaces
.implements La/fe60;
.implements La/vld;


# instance fields
.field public final q:La/nqq;

.field public r:La/pbz;


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, La/f3k;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/nqq;

    .line 5
    .line 6
    new-instance v1, La/brk;

    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    const/16 v8, 0x16

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    const-class v4, La/lqq;

    .line 13
    .line 14
    const-string v5, "onFocusStateChange"

    .line 15
    .line 16
    const-string v6, "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"

    .line 17
    .line 18
    move-object v3, p0

    .line 19
    invoke-direct/range {v1 .. v8}, La/brk;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 20
    .line 21
    .line 22
    const/16 p0, 0x9

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v0, v2, v1, p0}, La/nqq;-><init>(ILkotlin/jvm/functions/Function2;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v0}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 29
    .line 30
    .line 31
    iput-object v0, v3, La/lqq;->q:La/nqq;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final R()V
    .locals 3

    .line 1
    new-instance v0, La/mie0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/gmo;

    .line 7
    .line 8
    const/16 v2, 0xd

    .line 9
    .line 10
    invoke-direct {v1, v0, p0, v2}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1}, La/c9x;->B(La/lm40;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/pbz;

    .line 19
    .line 20
    iget-object v1, p0, La/lqq;->q:La/nqq;

    .line 21
    .line 22
    invoke-virtual {v1}, La/nqq;->e1()La/iqq;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, La/iqq;->b()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-object v1, p0, La/lqq;->r:La/pbz;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1}, La/pbz;->b()V

    .line 37
    .line 38
    .line 39
    :cond_0
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, La/pbz;->a()La/pbz;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    :goto_0
    iput-object v0, p0, La/lqq;->r:La/pbz;

    .line 47
    .line 48
    :cond_2
    return-void
.end method
