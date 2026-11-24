.class public final La/u5d;
.super La/w5;
.source "SourceFile"


# instance fields
.field public final u:La/d5e0;


# direct methods
.method public constructor <init>(La/d5e0;)V
    .locals 1

    .line 1
    iget-object v0, p1, La/d5e0;->b:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/u5d;->u:La/d5e0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final v(La/s5d;)V
    .locals 3

    .line 1
    iget-object p0, p0, La/u5d;->u:La/d5e0;

    .line 2
    .line 3
    iget-object p0, p0, La/d5e0;->c:Landroid/widget/TextView;

    .line 4
    .line 5
    instance-of v0, p1, La/q5d;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x11

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v0, p1, La/r5d;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const v0, 0x800003

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-interface {p1}, La/s5d;->getTitle()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const v0, 0x7f070748

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const v1, 0x7f07074a

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const v2, 0x7f070747

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-static {p0, p1, v0, v1, v2}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 71
    .line 72
    .line 73
    return-void
.end method
