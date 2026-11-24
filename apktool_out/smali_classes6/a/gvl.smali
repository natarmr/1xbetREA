.class public final La/gvl;
.super La/fhe0;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method public synthetic constructor <init>(IIIB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/gvl;->a:B

    iput p1, p0, La/gvl;->b:I

    iput p2, p0, La/gvl;->c:I

    iput p3, p0, La/gvl;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 3

    .line 1
    iget-byte p3, p0, La/gvl;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget v1, p0, La/gvl;->d:I

    .line 5
    .line 6
    iget v2, p0, La/gvl;->c:I

    .line 7
    .line 8
    iget p0, p0, La/gvl;->b:I

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    packed-switch p3, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    iput p0, p1, Landroid/graphics/Rect;->top:I

    .line 23
    .line 24
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 25
    .line 26
    iput v2, p1, Landroid/graphics/Rect;->left:I

    .line 27
    .line 28
    iput v1, p1, Landroid/graphics/Rect;->right:I

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_0
    iput p0, p1, Landroid/graphics/Rect;->top:I

    .line 32
    .line 33
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 34
    .line 35
    iput v2, p1, Landroid/graphics/Rect;->left:I

    .line 36
    .line 37
    iput v1, p1, Landroid/graphics/Rect;->right:I

    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    iput p0, p1, Landroid/graphics/Rect;->top:I

    .line 41
    .line 42
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 43
    .line 44
    iput v2, p1, Landroid/graphics/Rect;->left:I

    .line 45
    .line 46
    iput v1, p1, Landroid/graphics/Rect;->right:I

    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_2
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-gez p2, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 57
    .line 58
    iput v2, p1, Landroid/graphics/Rect;->left:I

    .line 59
    .line 60
    iput v1, p1, Landroid/graphics/Rect;->right:I

    .line 61
    .line 62
    :goto_0
    return-void

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
