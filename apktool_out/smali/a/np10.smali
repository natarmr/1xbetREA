.class public final La/np10;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/t7v;
.implements La/ehl;
.implements La/qai0;
.implements La/fe60;


# instance fields
.field public final A:La/pz40;

.field public B:La/zbk;

.field public Y:J

.field public Z:La/qkx;

.field public f1:La/q99;

.field public o:La/vpj0;

.field public p:La/a1i;

.field public q:F

.field public r:Z

.field public s:J

.field public t:F

.field public u:F

.field public v:Z

.field public w:La/yv90;

.field public x:Landroid/view/View;

.field public y:La/w6k;

.field public z:La/xv90;


# direct methods
.method public constructor <init>(La/vpj0;La/a1i;La/yv90;)V
    .locals 2

    .line 1
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/np10;->o:La/vpj0;

    .line 5
    .line 6
    iput-object p2, p0, La/np10;->p:La/a1i;

    .line 7
    .line 8
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 9
    .line 10
    iput p1, p0, La/np10;->q:F

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    iput-boolean p2, p0, La/np10;->r:Z

    .line 14
    .line 15
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    iput-wide v0, p0, La/np10;->s:J

    .line 21
    .line 22
    iput p1, p0, La/np10;->t:F

    .line 23
    .line 24
    iput p1, p0, La/np10;->u:F

    .line 25
    .line 26
    iput-boolean p2, p0, La/np10;->v:Z

    .line 27
    .line 28
    iput-object p3, p0, La/np10;->w:La/yv90;

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    sget-object p2, La/m2a;->v:La/m2a;

    .line 32
    .line 33
    invoke-static {p1, p2}, Landroidx/compose/runtime/e;->d(Ljava/lang/Object;La/igk0;)La/pz40;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, La/np10;->A:La/pz40;

    .line 38
    .line 39
    iput-wide v0, p0, La/np10;->Y:J

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final P(La/s460;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/np10;->A:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final R()V
    .locals 2

    .line 1
    new-instance v0, La/mp10;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, La/mp10;-><init>(La/np10;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0}, La/c9x;->B(La/lm40;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final R0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/np10;->R()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x7

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v1, v2, v2, v0}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, La/np10;->f1:La/q99;

    .line 12
    .line 13
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/yne;->d:La/yne;

    .line 18
    .line 19
    new-instance v3, La/e3p;

    .line 20
    .line 21
    const/16 v4, 0xf

    .line 22
    .line 23
    invoke-direct {v3, p0, v2, v4}, La/e3p;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    invoke-static {v0, v2, v1, v3, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final S0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/np10;->z:La/xv90;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, La/zv90;

    .line 6
    .line 7
    invoke-virtual {v0}, La/zv90;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, La/np10;->z:La/xv90;

    .line 12
    .line 13
    return-void
.end method

.method public final Z0()J
    .locals 2

    .line 1
    iget-object v0, p0, La/np10;->B:La/zbk;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/mp10;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, p0, v1}, La/mp10;-><init>(La/np10;B)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, La/np10;->B:La/zbk;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/ne60;

    .line 22
    .line 23
    iget-wide v0, p0, La/ne60;->a:J

    .line 24
    .line 25
    return-wide v0
.end method

.method public final a1()V
    .locals 11

    .line 1
    iget-object v0, p0, La/np10;->z:La/xv90;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, La/zv90;

    .line 6
    .line 7
    invoke-virtual {v0}, La/zv90;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, La/np10;->x:Landroid/view/View;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, La/tdc;->Z(La/yzj;)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    move-object v2, v0

    .line 19
    iput-object v2, p0, La/np10;->x:Landroid/view/View;

    .line 20
    .line 21
    iget-object v0, p0, La/np10;->y:La/w6k;

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v0, v0, La/e7z;->z:La/w6k;

    .line 30
    .line 31
    :cond_2
    move-object v9, v0

    .line 32
    iput-object v9, p0, La/np10;->y:La/w6k;

    .line 33
    .line 34
    iget-object v1, p0, La/np10;->w:La/yv90;

    .line 35
    .line 36
    iget-boolean v3, p0, La/np10;->r:Z

    .line 37
    .line 38
    iget-wide v4, p0, La/np10;->s:J

    .line 39
    .line 40
    iget v6, p0, La/np10;->t:F

    .line 41
    .line 42
    iget v7, p0, La/np10;->u:F

    .line 43
    .line 44
    iget-boolean v8, p0, La/np10;->v:Z

    .line 45
    .line 46
    iget v10, p0, La/np10;->q:F

    .line 47
    .line 48
    invoke-interface/range {v1 .. v10}, La/yv90;->a(Landroid/view/View;ZJFFZLa/w6k;F)La/xv90;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, La/np10;->z:La/xv90;

    .line 53
    .line 54
    invoke-virtual {p0}, La/np10;->c1()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final b1()V
    .locals 12

    .line 1
    iget-object v0, p0, La/np10;->y:La/w6k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, La/e7z;->z:La/w6k;

    .line 10
    .line 11
    iput-object v0, p0, La/np10;->y:La/w6k;

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, La/np10;->o:La/vpj0;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, La/vpj0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/ne60;

    .line 20
    .line 21
    iget-wide v0, v0, La/ne60;->a:J

    .line 22
    .line 23
    const-wide v2, 0x7fffffff7fffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long v4, v0, v2

    .line 29
    .line 30
    const-wide v10, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    cmp-long v4, v4, v10

    .line 36
    .line 37
    if-eqz v4, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, La/np10;->Z0()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    and-long/2addr v2, v4

    .line 44
    cmp-long v2, v2, v10

    .line 45
    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0}, La/np10;->Z0()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    invoke-static {v2, v3, v0, v1}, La/ne60;->f(JJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    iput-wide v0, p0, La/np10;->Y:J

    .line 57
    .line 58
    iget-object v0, p0, La/np10;->z:La/xv90;

    .line 59
    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0}, La/np10;->a1()V

    .line 63
    .line 64
    .line 65
    :cond_1
    iget-object v6, p0, La/np10;->z:La/xv90;

    .line 66
    .line 67
    if-eqz v6, :cond_2

    .line 68
    .line 69
    iget-wide v8, p0, La/np10;->Y:J

    .line 70
    .line 71
    iget v7, p0, La/np10;->q:F

    .line 72
    .line 73
    invoke-interface/range {v6 .. v11}, La/xv90;->a(FJJ)V

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-virtual {p0}, La/np10;->c1()V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    iput-wide v10, p0, La/np10;->Y:J

    .line 81
    .line 82
    iget-object p0, p0, La/np10;->z:La/xv90;

    .line 83
    .line 84
    if-eqz p0, :cond_4

    .line 85
    .line 86
    check-cast p0, La/zv90;

    .line 87
    .line 88
    invoke-virtual {p0}, La/zv90;->b()V

    .line 89
    .line 90
    .line 91
    :cond_4
    return-void
.end method

.method public final c1()V
    .locals 6

    .line 1
    iget-object v0, p0, La/np10;->z:La/xv90;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, La/np10;->y:La/w6k;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    :goto_0
    return-void

    .line 11
    :cond_1
    check-cast v0, La/zv90;

    .line 12
    .line 13
    invoke-virtual {v0}, La/zv90;->c()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    iget-object v4, p0, La/np10;->Z:La/qkx;

    .line 18
    .line 19
    if-nez v4, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-wide v4, v4, La/qkx;->a:J

    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    if-eqz v2, :cond_4

    .line 27
    .line 28
    :goto_1
    iget-object v2, p0, La/np10;->p:La/a1i;

    .line 29
    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0}, La/zv90;->c()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    invoke-static {v3, v4}, La/n2x;->Q(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    invoke-interface {v1, v3, v4}, La/w6k;->p(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    new-instance v1, La/bdl;

    .line 45
    .line 46
    invoke-direct {v1, v3, v4}, La/bdl;-><init>(J)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v1}, La/a1i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_3
    invoke-virtual {v0}, La/zv90;->c()J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    new-instance v2, La/qkx;

    .line 57
    .line 58
    invoke-direct {v2, v0, v1}, La/qkx;-><init>(J)V

    .line 59
    .line 60
    .line 61
    iput-object v2, p0, La/np10;->Z:La/qkx;

    .line 62
    .line 63
    :cond_4
    return-void
.end method

.method public final u0(La/g7z;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, La/g7z;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/np10;->f1:La/q99;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 9
    .line 10
    invoke-interface {p0, p1}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final x0(La/abi0;)V
    .locals 3

    .line 1
    sget-object v0, La/op10;->a:La/zai0;

    .line 2
    .line 3
    new-instance v1, La/mp10;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p0, v2}, La/mp10;-><init>(La/np10;B)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0, v1}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
