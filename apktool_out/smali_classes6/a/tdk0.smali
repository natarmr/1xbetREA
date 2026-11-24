.class public final La/tdk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Ljava/lang/ref/WeakReference;

.field public final synthetic b:Z

.field public final synthetic c:La/wdk0;

.field public final synthetic d:La/rrm;

.field public final synthetic e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;ZLa/wdk0;La/rrm;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/tdk0;->a:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    iput-boolean p2, p0, La/tdk0;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, La/tdk0;->c:La/wdk0;

    .line 9
    .line 10
    iput-object p4, p0, La/tdk0;->d:La/rrm;

    .line 11
    .line 12
    iput-object p5, p0, La/tdk0;->e:Ljava/lang/Integer;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget-object p2, p0, La/tdk0;->d:La/rrm;

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
    iget-object p1, p0, La/tdk0;->a:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, La/kxq;

    .line 18
    .line 19
    if-eqz p1, :cond_5

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    if-nez p4, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 28
    .line 29
    .line 30
    move-result p4

    .line 31
    if-nez p4, :cond_0

    .line 32
    .line 33
    invoke-virtual {p3}, Landroid/view/View;->isAttachedToWindow()Z

    .line 34
    .line 35
    .line 36
    move-result p4

    .line 37
    if-nez p4, :cond_1

    .line 38
    .line 39
    :cond_0
    const/4 p1, 0x0

    .line 40
    :cond_1
    if-eqz p1, :cond_5

    .line 41
    .line 42
    invoke-static {p1}, La/zdx;->A(La/kxq;)La/ba50;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p1, p1, La/ba50;->a:La/p7m0;

    .line 47
    .line 48
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, La/db50;

    .line 53
    .line 54
    iget-object p4, p1, La/db50;->b:Ljava/lang/Float;

    .line 55
    .line 56
    iget-boolean p5, p0, La/tdk0;->b:Z

    .line 57
    .line 58
    iget-object p6, p0, La/tdk0;->c:La/wdk0;

    .line 59
    .line 60
    if-eqz p5, :cond_2

    .line 61
    .line 62
    invoke-virtual {p6, p2}, La/wdk0;->p(La/rrm;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    iget-boolean p1, p1, La/db50;->a:Z

    .line 67
    .line 68
    const/4 p5, 0x0

    .line 69
    if-nez p1, :cond_3

    .line 70
    .line 71
    invoke-virtual {p3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object p0, p0, La/tdk0;->e:Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-static {p2, p1, p5, p0}, La/wdk0;->o(La/rrm;Landroid/content/res/Resources;ILjava/lang/Integer;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    if-eqz p4, :cond_4

    .line 88
    .line 89
    invoke-virtual {p4}, Ljava/lang/Float;->floatValue()F

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-virtual {p6, p2, p0}, La/wdk0;->m(La/rrm;F)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_4
    invoke-virtual {p3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {p2, p0, p5}, La/wdk0;->n(La/rrm;Landroid/content/res/Resources;I)V

    .line 108
    .line 109
    .line 110
    :cond_5
    return-void
.end method
