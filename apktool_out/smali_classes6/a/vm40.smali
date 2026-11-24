.class public final synthetic La/vm40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:F

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:La/agk0;

.field public final synthetic e:La/pz40;


# direct methods
.method public synthetic constructor <init>(ZFLkotlin/jvm/functions/Function0;La/agk0;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/vm40;->a:Z

    iput p2, p0, La/vm40;->b:F

    iput-object p3, p0, La/vm40;->c:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, La/vm40;->d:La/agk0;

    iput-object p5, p0, La/vm40;->e:La/pz40;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Landroid/view/MotionEvent;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, La/vm40;->d:La/agk0;

    .line 11
    .line 12
    iget-object v2, p0, La/vm40;->e:La/pz40;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eq v0, v3, :cond_2

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    if-eq v0, v3, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x3

    .line 24
    if-eq v0, p0, :cond_2

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-boolean v0, p0, La/vm40;->a:Z

    .line 28
    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    invoke-virtual {v1}, La/agk0;->l()F

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    cmpg-float v0, v0, v4

    .line 48
    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {v1}, La/agk0;->l()F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    sub-float/2addr p1, v0

    .line 61
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    iget v0, p0, La/vm40;->b:F

    .line 66
    .line 67
    cmpl-float p1, p1, v0

    .line 68
    .line 69
    if-lez p1, :cond_4

    .line 70
    .line 71
    iget-object p0, p0, La/vm40;->c:Lkotlin/jvm/functions/Function0;

    .line 72
    .line 73
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-interface {v2, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-virtual {v1, v4}, La/agk0;->m(F)V

    .line 83
    .line 84
    .line 85
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-interface {v2, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    invoke-virtual {v1, p0}, La/agk0;->m(F)V

    .line 96
    .line 97
    .line 98
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-interface {v2, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0
.end method
