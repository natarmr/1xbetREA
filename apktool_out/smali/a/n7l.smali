.class public final La/n7l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:La/x23;

.field public final synthetic e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;FFLa/x23;Landroid/widget/ImageView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/n7l;->a:Landroid/view/View;

    .line 5
    .line 6
    iput p2, p0, La/n7l;->b:F

    .line 7
    .line 8
    iput p3, p0, La/n7l;->c:F

    .line 9
    .line 10
    iput-object p4, p0, La/n7l;->d:La/x23;

    .line 11
    .line 12
    iput-object p5, p0, La/n7l;->e:Landroid/widget/ImageView;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, La/n7l;->b:F

    .line 2
    .line 3
    const/high16 v1, 0x42c80000    # 100.0f

    .line 4
    .line 5
    div-float/2addr v0, v1

    .line 6
    iget v2, p0, La/n7l;->c:F

    .line 7
    .line 8
    div-float/2addr v2, v1

    .line 9
    iget-object v1, p0, La/n7l;->d:La/x23;

    .line 10
    .line 11
    iget-object v3, v1, La/x23;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    int-to-float v4, v4

    .line 20
    mul-float/2addr v4, v0

    .line 21
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    int-to-float v0, v0

    .line 26
    mul-float/2addr v0, v2

    .line 27
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    int-to-float v2, v2

    .line 32
    add-float/2addr v2, v4

    .line 33
    float-to-int v2, v2

    .line 34
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    int-to-float v5, v5

    .line 39
    add-float/2addr v5, v0

    .line 40
    float-to-int v5, v5

    .line 41
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    int-to-float v6, v6

    .line 46
    add-float/2addr v6, v4

    .line 47
    iget v4, v1, La/x23;->a:I

    .line 48
    .line 49
    int-to-float v4, v4

    .line 50
    add-float/2addr v6, v4

    .line 51
    float-to-int v4, v6

    .line 52
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    int-to-float v3, v3

    .line 57
    add-float/2addr v3, v0

    .line 58
    iget v0, v1, La/x23;->a:I

    .line 59
    .line 60
    int-to-float v0, v0

    .line 61
    add-float/2addr v3, v0

    .line 62
    float-to-int v0, v3

    .line 63
    iget-object p0, p0, La/n7l;->e:Landroid/widget/ImageView;

    .line 64
    .line 65
    invoke-virtual {p0, v2, v5, v4, v0}, Landroid/view/View;->layout(IIII)V

    .line 66
    .line 67
    .line 68
    return-void
.end method
