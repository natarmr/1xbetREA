.class public final La/m43;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:La/l0d;

.field public final synthetic b:Lorg/xplatform/ui_core/AnimatedCoefficientView;

.field public final synthetic c:Z

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(La/l0d;Lorg/xplatform/ui_core/AnimatedCoefficientView;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/m43;->a:La/l0d;

    .line 5
    .line 6
    iput-object p2, p0, La/m43;->b:Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 7
    .line 8
    iput-boolean p3, p0, La/m43;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, La/m43;->d:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/m43;->a:La/l0d;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget-object p2, p0, La/m43;->b:Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 14
    .line 15
    if-eqz p1, :cond_4

    .line 16
    .line 17
    const/4 p3, 0x1

    .line 18
    if-eq p1, p3, :cond_3

    .line 19
    .line 20
    const/4 p3, 0x2

    .line 21
    if-eq p1, p3, :cond_3

    .line 22
    .line 23
    const/4 p3, 0x3

    .line 24
    const/4 p4, 0x0

    .line 25
    if-eq p1, p3, :cond_2

    .line 26
    .line 27
    const/4 p3, 0x4

    .line 28
    if-eq p1, p3, :cond_1

    .line 29
    .line 30
    const/4 p0, 0x5

    .line 31
    if-ne p1, p0, :cond_0

    .line 32
    .line 33
    sget p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j1:I

    .line 34
    .line 35
    invoke-virtual {p2}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h()V

    .line 36
    .line 37
    .line 38
    iget-object p0, p2, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a:Landroid/text/TextPaint;

    .line 39
    .line 40
    invoke-virtual {p0, p4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->k()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    sget p1, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j1:I

    .line 55
    .line 56
    iget-boolean p0, p0, La/m43;->c:Z

    .line 57
    .line 58
    invoke-virtual {p2, p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->f(Z)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    sget p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j1:I

    .line 63
    .line 64
    invoke-virtual {p2}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h()V

    .line 71
    .line 72
    .line 73
    iget-object p0, p2, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b:Landroid/text/TextPaint;

    .line 74
    .line 75
    invoke-virtual {p0, p4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    sget p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j1:I

    .line 80
    .line 81
    invoke-virtual {p2}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->l()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_4
    sget p1, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j1:I

    .line 92
    .line 93
    iget-boolean p0, p0, La/m43;->d:Z

    .line 94
    .line 95
    invoke-virtual {p2, p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->g(Z)V

    .line 96
    .line 97
    .line 98
    return-void
.end method
