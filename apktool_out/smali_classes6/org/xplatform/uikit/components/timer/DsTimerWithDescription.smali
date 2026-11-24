.class public final Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# static fields
.field public static final synthetic o:I


# instance fields
.field public i:J

.field public final j:La/sje;

.field public k:La/c4m0;

.field public final l:Z

.field public m:Ljava/lang/CharSequence;

.field public n:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object p1, La/tvk;->a:La/rwj;

    .line 14
    .line 15
    sget-object p1, La/ys10;->a:La/vs10;

    .line 16
    .line 17
    invoke-virtual {p1}, La/vs10;->x()La/vs10;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->j:La/sje;

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->l:Z

    .line 40
    .line 41
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->n:Z

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->m:Ljava/lang/CharSequence;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->k:La/c4m0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    new-instance v0, La/p23;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    const/4 v3, 0x3

    .line 13
    invoke-direct {v0, v2, v1, v3}, La/p23;-><init>(ILa/yje;B)V

    .line 14
    .line 15
    .line 16
    new-instance v2, La/n1;

    .line 17
    .line 18
    const/4 v3, 0x7

    .line 19
    invoke-direct {v2, v0, v1, v3}, La/n1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 20
    .line 21
    .line 22
    new-instance v0, La/vsg0;

    .line 23
    .line 24
    invoke-direct {v0, v2}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 25
    .line 26
    .line 27
    new-instance v2, La/wib;

    .line 28
    .line 29
    const/16 v3, 0x1c

    .line 30
    .line 31
    invoke-direct {v2, p0, v1, v3}, La/wib;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 32
    .line 33
    .line 34
    new-instance v1, La/fnq;

    .line 35
    .line 36
    const/4 v3, 0x4

    .line 37
    invoke-direct {v1, v0, v2, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->j:La/sje;

    .line 41
    .line 42
    invoke-static {v1, v0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->k:La/c4m0;

    .line 47
    .line 48
    return-void
.end method

.method public final k()V
    .locals 10

    .line 1
    iget-wide v0, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->i:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-gez v4, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->k:La/c4m0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    move-wide v0, v2

    .line 18
    :cond_1
    iget-boolean v4, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->l:Z

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    if-eqz v4, :cond_3

    .line 22
    .line 23
    cmp-long v2, v0, v2

    .line 24
    .line 25
    if-lez v2, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/4 v5, 0x0

    .line 29
    :cond_3
    :goto_0
    const-wide/16 v2, 0x3e8

    .line 30
    .line 31
    div-long v2, v0, v2

    .line 32
    .line 33
    const-wide/16 v6, 0x3c

    .line 34
    .line 35
    rem-long/2addr v2, v6

    .line 36
    const-wide/32 v8, 0xea60

    .line 37
    .line 38
    .line 39
    div-long v8, v0, v8

    .line 40
    .line 41
    rem-long/2addr v8, v6

    .line 42
    const-wide/32 v6, 0x36ee80

    .line 43
    .line 44
    .line 45
    div-long/2addr v0, v6

    .line 46
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const/4 v1, 0x2

    .line 51
    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-static {v1, v4}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v1, v2}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const/4 v2, 0x3

    .line 72
    filled-new-array {v0, v4, v1}, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, ", %s:%s:%s"

    .line 81
    .line 82
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v1, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->m:Ljava/lang/CharSequence;

    .line 87
    .line 88
    if-eqz v5, :cond_4

    .line 89
    .line 90
    iget-boolean v2, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->n:Z

    .line 91
    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    const-string v0, ""

    .line 96
    .line 97
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->n:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->j()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatTextView;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->k:La/c4m0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final setGameStartTime(J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/Date;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sub-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->i:J

    .line 12
    .line 13
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->j()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setSubTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->m:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-void
.end method

.method public final setTimerVisible(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->n:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->k()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
