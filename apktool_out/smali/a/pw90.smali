.class public abstract La/pw90;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/wm90;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, La/wm90;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/zfn;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 11
    .line 12
    .line 13
    sput-object v1, La/pw90;->a:La/zfn;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(La/uiz;La/ic1;La/zje;)V
    .locals 4

    .line 1
    instance-of v0, p2, La/nw90;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/nw90;

    .line 7
    .line 8
    iget v1, v0, La/nw90;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/nw90;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/nw90;

    .line 21
    .line 22
    invoke-direct {v0, p2}, La/zje;-><init>(La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/nw90;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/nw90;->j:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-eq v1, v2, :cond_1

    .line 35
    .line 36
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, La/csj;->b()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, La/lm40;->a:La/lm40;

    .line 53
    .line 54
    iget-boolean p2, p2, La/lm40;->n:Z

    .line 55
    .line 56
    if-eqz p2, :cond_4

    .line 57
    .line 58
    invoke-static {p0}, La/vcc;->a0(La/yzj;)La/cg80;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    iget-object p0, p0, La/e7z;->Y:La/xld;

    .line 67
    .line 68
    check-cast p0, La/bh90;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    sget-object v1, La/pw90;->a:La/zfn;

    .line 74
    .line 75
    invoke-static {p0, v1}, La/qbc;->V(La/bh90;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-nez p0, :cond_3

    .line 80
    .line 81
    iput v2, v0, La/nw90;->j:I

    .line 82
    .line 83
    invoke-static {p2, p1, v0}, La/pw90;->b(La/cg80;Lkotlin/jvm/functions/Function2;La/zje;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    invoke-static {}, La/hny;->b()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_4
    const-string p0, "establishTextInputSession called from an unattached node"

    .line 92
    .line 93
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public static final b(La/cg80;Lkotlin/jvm/functions/Function2;La/zje;)V
    .locals 4

    .line 1
    instance-of v0, p2, La/ow90;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ow90;

    .line 7
    .line 8
    iget v1, v0, La/ow90;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/ow90;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ow90;

    .line 21
    .line 22
    invoke-direct {v0, p2}, La/zje;-><init>(La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ow90;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/ow90;->j:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    if-eq v1, v2, :cond_2

    .line 35
    .line 36
    const/4 p0, 0x2

    .line 37
    if-eq v1, p0, :cond_1

    .line 38
    .line 39
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-static {}, La/csj;->b()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, La/csj;->b()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iput v2, v0, La/ow90;->j:I

    .line 63
    .line 64
    check-cast p0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 65
    .line 66
    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->K(Lkotlin/jvm/functions/Function2;La/zje;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method
