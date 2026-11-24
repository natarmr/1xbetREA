.class public final La/apa0;
.super La/qsw;
.source "SourceFile"


# virtual methods
.method public final a1(La/bpa0;)V
    .locals 1

    .line 1
    sget-object v0, La/bmd;->w:La/zfn;

    .line 2
    .line 3
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/cpa0;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    check-cast p0, La/lx2;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    sget-object p1, La/bpa0;->a:La/jtv;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object p1, La/i120;->h:La/d13;

    .line 21
    .line 22
    :cond_0
    sget-object v0, La/ay2;->a:La/ay2;

    .line 23
    .line 24
    iget-object p0, p0, La/lx2;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 25
    .line 26
    invoke-virtual {v0, p0, p1}, La/ay2;->a(Landroid/view/View;La/bpa0;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final j()Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p0, "androidx.compose.ui.input.pointer.PointerHoverIcon"

    .line 2
    .line 3
    return-object p0
.end method
