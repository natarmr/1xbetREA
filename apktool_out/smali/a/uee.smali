.class public final synthetic La/uee;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroidx/core/widget/ContentLoadingProgressBar;


# direct methods
.method public synthetic constructor <init>(Landroidx/core/widget/ContentLoadingProgressBar;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uee;->a:B

    iput-object p1, p0, La/uee;->b:Landroidx/core/widget/ContentLoadingProgressBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-byte v0, p0, La/uee;->a:B

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const-wide/16 v2, 0x1f4

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const-wide/16 v5, -0x1

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    iget-object p0, p0, La/uee;->b:Landroidx/core/widget/ContentLoadingProgressBar;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget v0, Landroidx/core/widget/ContentLoadingProgressBar;->g:I

    .line 17
    .line 18
    iput-boolean v4, p0, Landroidx/core/widget/ContentLoadingProgressBar;->d:Z

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->f:La/uee;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    iput-boolean v7, p0, Landroidx/core/widget/ContentLoadingProgressBar;->c:Z

    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v7

    .line 31
    iget-wide v9, p0, Landroidx/core/widget/ContentLoadingProgressBar;->a:J

    .line 32
    .line 33
    sub-long/2addr v7, v9

    .line 34
    cmp-long v0, v7, v2

    .line 35
    .line 36
    if-gez v0, :cond_1

    .line 37
    .line 38
    cmp-long v0, v9, v5

    .line 39
    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-boolean v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->b:Z

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->e:La/uee;

    .line 48
    .line 49
    sub-long/2addr v2, v7

    .line 50
    invoke-virtual {p0, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 51
    .line 52
    .line 53
    iput-boolean v4, p0, Landroidx/core/widget/ContentLoadingProgressBar;->b:Z

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_1
    return-void

    .line 60
    :pswitch_0
    sget v0, Landroidx/core/widget/ContentLoadingProgressBar;->g:I

    .line 61
    .line 62
    iput-wide v5, p0, Landroidx/core/widget/ContentLoadingProgressBar;->a:J

    .line 63
    .line 64
    iput-boolean v7, p0, Landroidx/core/widget/ContentLoadingProgressBar;->d:Z

    .line 65
    .line 66
    iget-object v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->e:La/uee;

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 69
    .line 70
    .line 71
    iput-boolean v7, p0, Landroidx/core/widget/ContentLoadingProgressBar;->b:Z

    .line 72
    .line 73
    iget-boolean v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->c:Z

    .line 74
    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    iget-object v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->f:La/uee;

    .line 78
    .line 79
    invoke-virtual {p0, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 80
    .line 81
    .line 82
    iput-boolean v4, p0, Landroidx/core/widget/ContentLoadingProgressBar;->c:Z

    .line 83
    .line 84
    :cond_3
    return-void

    .line 85
    :pswitch_1
    sget v0, Landroidx/core/widget/ContentLoadingProgressBar;->g:I

    .line 86
    .line 87
    iput-boolean v7, p0, Landroidx/core/widget/ContentLoadingProgressBar;->c:Z

    .line 88
    .line 89
    iget-boolean v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->d:Z

    .line 90
    .line 91
    if-nez v0, :cond_4

    .line 92
    .line 93
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 94
    .line 95
    .line 96
    move-result-wide v0

    .line 97
    iput-wide v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->a:J

    .line 98
    .line 99
    invoke-virtual {p0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 100
    .line 101
    .line 102
    :cond_4
    return-void

    .line 103
    :pswitch_2
    sget v0, Landroidx/core/widget/ContentLoadingProgressBar;->g:I

    .line 104
    .line 105
    iput-boolean v7, p0, Landroidx/core/widget/ContentLoadingProgressBar;->b:Z

    .line 106
    .line 107
    iput-wide v5, p0, Landroidx/core/widget/ContentLoadingProgressBar;->a:J

    .line 108
    .line 109
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
