.class public final La/buv0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final m:La/zsf;

.field public static final n:F


# instance fields
.field public final a:La/mkt0;

.field public final b:La/glt0;

.field public final c:La/duv0;

.field public d:La/vne;

.field public e:La/c4m0;

.field public f:La/c4m0;

.field public g:Z

.field public h:La/lxv0;

.field public final i:La/pz40;

.field public final j:La/t33;

.field public k:La/cuv0;

.field public final l:La/zbk;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/ihn;->a:La/zsf;

    .line 2
    .line 3
    sput-object v0, La/buv0;->m:La/zsf;

    .line 4
    .line 5
    sget-object v0, La/qmk;->a:La/zcl;

    .line 6
    .line 7
    const/high16 v0, 0x42400000    # 48.0f

    .line 8
    .line 9
    sput v0, La/buv0;->n:F

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(La/mkt0;La/glt0;La/duv0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/buv0;->a:La/mkt0;

    .line 5
    .line 6
    iput-object p2, p0, La/buv0;->b:La/glt0;

    .line 7
    .line 8
    iput-object p3, p0, La/buv0;->c:La/duv0;

    .line 9
    .line 10
    sget-object p1, La/jxv0;->a:La/jxv0;

    .line 11
    .line 12
    iput-object p1, p0, La/buv0;->h:La/lxv0;

    .line 13
    .line 14
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/buv0;->i:La/pz40;

    .line 21
    .line 22
    const/high16 p1, 0x3f800000    # 1.0f

    .line 23
    .line 24
    invoke-static {p1}, La/xf0;->c(F)La/t33;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, La/buv0;->j:La/t33;

    .line 29
    .line 30
    new-instance p1, La/cuv0;

    .line 31
    .line 32
    sget-object p2, La/iun;->a:La/iun;

    .line 33
    .line 34
    const/4 p3, 0x0

    .line 35
    invoke-direct {p1, p3, p2}, La/cuv0;-><init>(Ljava/lang/Integer;Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, La/buv0;->k:La/cuv0;

    .line 39
    .line 40
    new-instance p1, La/utv0;

    .line 41
    .line 42
    const/4 p2, 0x0

    .line 43
    invoke-direct {p1, p0, p2}, La/utv0;-><init>(La/buv0;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, La/buv0;->l:La/zbk;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a(La/cuv0;FZ)V
    .locals 10

    .line 1
    iget-object v0, p0, La/buv0;->d:La/vne;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, La/buv0;->f:La/c4m0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v1, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_1
    iput-object p1, p0, La/buv0;->k:La/cuv0;

    .line 15
    .line 16
    iput-boolean p3, p0, La/buv0;->g:Z

    .line 17
    .line 18
    iget-object v1, p0, La/buv0;->b:La/glt0;

    .line 19
    .line 20
    invoke-virtual {v1}, La/glt0;->d()La/lxv0;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iput-object v3, p0, La/buv0;->h:La/lxv0;

    .line 25
    .line 26
    iget-object v1, v1, La/glt0;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, La/t33;

    .line 29
    .line 30
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    iget-object p1, p1, La/cuv0;->a:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    const/16 v1, 0xdc

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    if-gt p1, v3, :cond_2

    .line 50
    .line 51
    :goto_0
    move v7, v1

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    const/16 v4, 0x3c

    .line 54
    .line 55
    invoke-static {p1, v3, v4, v1}, La/twn;->b(IIII)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    goto :goto_0

    .line 60
    :goto_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 61
    .line 62
    iget-object v1, p0, La/buv0;->i:La/pz40;

    .line 63
    .line 64
    check-cast v1, La/hgk0;

    .line 65
    .line 66
    invoke-virtual {v1, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    new-instance v3, La/xtv0;

    .line 70
    .line 71
    const/4 v9, 0x0

    .line 72
    move-object v5, p0

    .line 73
    move v6, p2

    .line 74
    move v4, p3

    .line 75
    invoke-direct/range {v3 .. v9}, La/xtv0;-><init>(ZLa/buv0;FIFLa/yje;)V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x3

    .line 79
    invoke-static {v0, v2, v2, v3, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    iput-object p0, v5, La/buv0;->f:La/c4m0;

    .line 84
    .line 85
    return-void
.end method

.method public final b(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/auv0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/auv0;

    .line 7
    .line 8
    iget v1, v0, La/auv0;->k:I

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
    iput v1, v0, La/auv0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/auv0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/auv0;-><init>(La/buv0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/auv0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/auv0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/buv0;->f:La/c4m0;

    .line 51
    .line 52
    if-nez p0, :cond_3

    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_3
    new-instance p1, La/k6s0;

    .line 58
    .line 59
    const/16 v2, 0x1d

    .line 60
    .line 61
    invoke-direct {p1, p0, v3, v2}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 62
    .line 63
    .line 64
    iput v4, v0, La/auv0;->k:I

    .line 65
    .line 66
    const-wide/16 v2, 0x3e8

    .line 67
    .line 68
    invoke-static {v2, v3, p1, v0}, La/msm0;->u(JLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-ne p0, v1, :cond_4

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_4
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, La/buv0;->i:La/pz40;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, La/hgk0;

    .line 5
    .line 6
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v1, p0, La/buv0;->f:La/c4m0;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iput-object v2, p0, La/buv0;->f:La/c4m0;

    .line 28
    .line 29
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 30
    .line 31
    check-cast v0, La/hgk0;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, La/buv0;->d:La/vne;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    new-instance v1, La/vmq0;

    .line 41
    .line 42
    const/4 v3, 0x7

    .line 43
    invoke-direct {v1, p0, v2, v3}, La/vmq0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x3

    .line 47
    invoke-static {v0, v2, v2, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    return-void
.end method
