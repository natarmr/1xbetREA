.class public final synthetic La/bim;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:La/e0x;

.field public final synthetic c:Z

.field public final synthetic d:La/vne;

.field public final synthetic e:La/rah0;

.field public final synthetic f:I

.field public final synthetic g:Ljava/util/ArrayList;

.field public final synthetic h:La/p4e;

.field public final synthetic i:F

.field public final synthetic j:F


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/e0x;ZLa/vne;La/rah0;ILjava/util/ArrayList;La/p4e;FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bim;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/bim;->b:La/e0x;

    iput-boolean p3, p0, La/bim;->c:Z

    iput-object p4, p0, La/bim;->d:La/vne;

    iput-object p5, p0, La/bim;->e:La/rah0;

    iput p6, p0, La/bim;->f:I

    iput-object p7, p0, La/bim;->g:Ljava/util/ArrayList;

    iput-object p8, p0, La/bim;->h:La/p4e;

    iput p9, p0, La/bim;->i:F

    iput p10, p0, La/bim;->j:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, La/e0x;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La/bim;->a:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, La/bim;->b:La/e0x;

    .line 11
    .line 12
    iget-object v0, v0, La/e0x;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-boolean p1, p0, La/bim;->c:Z

    .line 18
    .line 19
    if-nez p1, :cond_2

    .line 20
    .line 21
    iget-object p1, p0, La/bim;->h:La/p4e;

    .line 22
    .line 23
    iget-wide v0, p1, La/p4e;->a:J

    .line 24
    .line 25
    invoke-static {v0, v1}, La/p4e;->i(J)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget-object v0, p0, La/bim;->g:Ljava/util/ArrayList;

    .line 30
    .line 31
    iget v1, p0, La/bim;->f:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, La/pu90;

    .line 38
    .line 39
    iget v2, v2, La/pu90;->a:I

    .line 40
    .line 41
    sub-int/2addr p1, v2

    .line 42
    int-to-float p1, p1

    .line 43
    const/high16 v2, 0x40000000    # 2.0f

    .line 44
    .line 45
    div-float/2addr p1, v2

    .line 46
    iget v2, p0, La/bim;->j:F

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    :goto_0
    if-ge v3, v1, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, La/pu90;

    .line 56
    .line 57
    iget v4, v4, La/pu90;->a:I

    .line 58
    .line 59
    int-to-float v4, v4

    .line 60
    iget v5, p0, La/bim;->i:F

    .line 61
    .line 62
    add-float/2addr v4, v5

    .line 63
    add-float/2addr v2, v4

    .line 64
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    sub-float/2addr v2, p1

    .line 68
    iget-object p1, p0, La/bim;->e:La/rah0;

    .line 69
    .line 70
    iget-object v0, p1, La/rah0;->f:La/cgk0;

    .line 71
    .line 72
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    int-to-float v0, v0

    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-static {v2, v1, v0}, La/l1e0;->c(FFF)F

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    new-instance v1, La/qu2;

    .line 83
    .line 84
    const/4 v2, 0x0

    .line 85
    const/4 v3, 0x3

    .line 86
    invoke-direct {v1, p1, v0, v2, v3}, La/qu2;-><init>(Ljava/lang/Object;FLa/yje;B)V

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, La/bim;->d:La/vne;

    .line 90
    .line 91
    invoke-static {p0, v2, v2, v1, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 92
    .line 93
    .line 94
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0
.end method
