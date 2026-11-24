.class public final La/udk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Ljava/lang/ref/WeakReference;

.field public final synthetic b:Z

.field public final synthetic c:La/wdk0;

.field public final synthetic d:Landroid/view/View;

.field public final synthetic e:La/rrm;

.field public final synthetic f:Landroid/view/View;

.field public final synthetic g:Ljava/lang/Integer;

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;ZLa/wdk0;Landroid/view/View;La/rrm;Landroid/view/View;Ljava/lang/Integer;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/udk0;->a:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    iput-boolean p2, p0, La/udk0;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, La/udk0;->c:La/wdk0;

    .line 9
    .line 10
    iput-object p4, p0, La/udk0;->d:Landroid/view/View;

    .line 11
    .line 12
    iput-object p5, p0, La/udk0;->e:La/rrm;

    .line 13
    .line 14
    iput-object p6, p0, La/udk0;->f:Landroid/view/View;

    .line 15
    .line 16
    iput-object p7, p0, La/udk0;->g:Ljava/lang/Integer;

    .line 17
    .line 18
    iput-boolean p8, p0, La/udk0;->h:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget-object p2, p0, La/udk0;->e:La/rrm;

    .line 2
    .line 3
    iget-object p3, p2, La/g46;->i:La/f46;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 9
    .line 10
    .line 11
    iget-object p4, p0, La/udk0;->a:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    check-cast p4, La/kxq;

    .line 18
    .line 19
    if-eqz p4, :cond_8

    .line 20
    .line 21
    invoke-virtual {p4}, Landroid/app/Activity;->isFinishing()Z

    .line 22
    .line 23
    .line 24
    move-result p5

    .line 25
    if-nez p5, :cond_0

    .line 26
    .line 27
    invoke-virtual {p4}, Landroid/app/Activity;->isDestroyed()Z

    .line 28
    .line 29
    .line 30
    move-result p5

    .line 31
    if-nez p5, :cond_0

    .line 32
    .line 33
    invoke-virtual {p3}, Landroid/view/View;->isAttachedToWindow()Z

    .line 34
    .line 35
    .line 36
    move-result p5

    .line 37
    if-nez p5, :cond_1

    .line 38
    .line 39
    :cond_0
    const/4 p4, 0x0

    .line 40
    :cond_1
    if-eqz p4, :cond_8

    .line 41
    .line 42
    iget-boolean p5, p0, La/udk0;->b:Z

    .line 43
    .line 44
    iget-object p6, p0, La/udk0;->c:La/wdk0;

    .line 45
    .line 46
    if-eqz p5, :cond_2

    .line 47
    .line 48
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, La/wdk0;->e(Landroid/view/View;)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/4 p1, 0x0

    .line 57
    :goto_0
    invoke-static {p4}, La/zdx;->A(La/kxq;)La/ba50;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    iget-object p4, p4, La/ba50;->a:La/p7m0;

    .line 62
    .line 63
    invoke-virtual {p4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    check-cast p4, La/db50;

    .line 68
    .line 69
    iget-object p5, p4, La/db50;->b:Ljava/lang/Float;

    .line 70
    .line 71
    iget-object p7, p0, La/udk0;->d:Landroid/view/View;

    .line 72
    .line 73
    if-eqz p7, :cond_3

    .line 74
    .line 75
    invoke-virtual {p6, p2}, La/wdk0;->p(La/rrm;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    iget-boolean p4, p4, La/db50;->a:Z

    .line 80
    .line 81
    iget-object p7, p0, La/udk0;->g:Ljava/lang/Integer;

    .line 82
    .line 83
    iget-object p8, p0, La/udk0;->f:Landroid/view/View;

    .line 84
    .line 85
    if-nez p4, :cond_4

    .line 86
    .line 87
    if-nez p8, :cond_4

    .line 88
    .line 89
    invoke-virtual {p3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {p2, p0, p1, p7}, La/wdk0;->o(La/rrm;Landroid/content/res/Resources;ILjava/lang/Integer;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_4
    if-eqz p5, :cond_5

    .line 104
    .line 105
    if-nez p8, :cond_5

    .line 106
    .line 107
    invoke-virtual {p5}, Ljava/lang/Float;->floatValue()F

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    invoke-virtual {p6, p2, p0}, La/wdk0;->m(La/rrm;F)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_5
    iget-boolean p0, p0, La/udk0;->h:Z

    .line 116
    .line 117
    if-nez p0, :cond_7

    .line 118
    .line 119
    if-eqz p4, :cond_6

    .line 120
    .line 121
    if-nez p8, :cond_6

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_6
    invoke-virtual {p3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static {p2, p0, p1, p7}, La/wdk0;->o(La/rrm;Landroid/content/res/Resources;ILjava/lang/Integer;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_7
    :goto_1
    invoke-virtual {p3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-static {p2, p0, p1}, La/wdk0;->n(La/rrm;Landroid/content/res/Resources;I)V

    .line 149
    .line 150
    .line 151
    :cond_8
    return-void
.end method
