.class public final La/hwr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/view/ViewGroup;

.field public final synthetic d:Landroid/view/View;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/View;IIB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/hwr0;->a:B

    iput-object p1, p0, La/hwr0;->b:Landroid/view/View;

    iput-object p2, p0, La/hwr0;->c:Landroid/view/ViewGroup;

    iput-object p3, p0, La/hwr0;->d:Landroid/view/View;

    iput p4, p0, La/hwr0;->e:I

    iput p5, p0, La/hwr0;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 11

    .line 1
    iget-byte v0, p0, La/hwr0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/hwr0;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, La/iwr0;

    .line 15
    .line 16
    iget v6, p0, La/hwr0;->f:I

    .line 17
    .line 18
    const/4 v7, 0x1

    .line 19
    iget-object v3, p0, La/hwr0;->d:Landroid/view/View;

    .line 20
    .line 21
    iget-object v4, p0, La/hwr0;->c:Landroid/view/ViewGroup;

    .line 22
    .line 23
    iget v5, p0, La/hwr0;->e:I

    .line 24
    .line 25
    invoke-direct/range {v2 .. v7}, La/iwr0;-><init>(Landroid/view/View;Landroid/view/ViewGroup;IIB)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 33
    .line 34
    .line 35
    new-instance v5, La/iwr0;

    .line 36
    .line 37
    iget v9, p0, La/hwr0;->f:I

    .line 38
    .line 39
    const/4 v10, 0x0

    .line 40
    iget-object v6, p0, La/hwr0;->d:Landroid/view/View;

    .line 41
    .line 42
    iget-object v7, p0, La/hwr0;->c:Landroid/view/ViewGroup;

    .line 43
    .line 44
    iget v8, p0, La/hwr0;->e:I

    .line 45
    .line 46
    invoke-direct/range {v5 .. v10}, La/iwr0;-><init>(Landroid/view/View;Landroid/view/ViewGroup;IIB)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v7, v5}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/hwr0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
